package com.example.conectamovil.View;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.conectamovil.Model.User;
import com.example.conectamovil.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.conectamovil.db.DbContactos;

public class NuevoActivity extends AppCompatActivity {

    EditText txtNombre, txtTelefono, txtCorreoElectronico;
    Button btnGuarda, btnRegresar, btnGuardarVista;

    // Obtén la referencia a la instancia de la base de datos de Firebase
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);

        txtNombre = findViewById(R.id.txtNombre);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtCorreoElectronico = findViewById(R.id.txtCorreoElectronico);
        btnGuarda = findViewById(R.id.btnGuarda);
        btnGuardarVista = findViewById(R.id.btnGuardarVista);
        btnRegresar = findViewById(R.id.btnRegresar);

        // Inicializa la referencia a la base de datos de Firebase
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Contactos");

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí inicia la actividad de perfil
                Intent intent = new Intent(getApplicationContext(), activityPrincipal.class);
                startActivity(intent);
            }
        });

        btnGuarda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardarDatos();
            }
        });

        btnGuardarVista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!txtNombre.getText().toString().equals("") && !txtTelefono.getText().toString().equals("")) {

                    DbContactos dbContactos = new DbContactos(NuevoActivity.this);
                    long id = dbContactos.insertarContacto(txtNombre.getText().toString(), txtTelefono.getText().toString(), txtCorreoElectronico.getText().toString());

                    if (id > 0) {
                        Toast.makeText(NuevoActivity.this, "REGISTRO GUARDADO", Toast.LENGTH_LONG).show();
                        limpiar();
                    } else {
                        Toast.makeText(NuevoActivity.this, "ERROR AL GUARDAR REGISTRO", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(NuevoActivity.this, "DEBE LLENAR LOS CAMPOS OBLIGATORIOS", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    private void guardarDatos() {
        String nombreContacto = txtNombre.getText().toString().trim();
        String telefonoContacto = txtTelefono.getText().toString().trim();
        String CorreoElectronico = txtCorreoElectronico.getText().toString().trim();

        if (!nombreContacto.isEmpty() && !telefonoContacto.isEmpty() && !CorreoElectronico.isEmpty()) {
            // Crea un nuevo nodo en la base de datos con el ID como clave
            DatabaseReference contactoRef = databaseReference.child(nombreContacto);

            contactoRef.child("nombreContacto").setValue(nombreContacto);
            contactoRef.child("telefonoContacto").setValue(telefonoContacto);
            contactoRef.child("CorreoElectronico").setValue(CorreoElectronico);


            Toast.makeText(this, "Datos guardados en Firebase", Toast.LENGTH_SHORT).show();
            limpiarCampos();
        } else {
            Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCorreoElectronico.setText("");
    }
    private void limpiar() {
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCorreoElectronico.setText("");
    }
}

