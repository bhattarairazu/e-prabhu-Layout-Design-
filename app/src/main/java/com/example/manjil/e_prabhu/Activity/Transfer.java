package com.example.manjil.e_prabhu.Activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.manjil.e_prabhu.R;

/**
 * Created by Paru on 3/13/2018.
 */

public class Transfer extends Activity {

    final Context context = this;
    private Button alert;
    private Button btnback;

    private EditText enter_number;
    private final int PICK_CONTACT = 1;

    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.transfer);
        alert = (Button) findViewById(R.id.helpicon);
        enter_number = (EditText) findViewById(R.id.callContacts);
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertdialogue(context);
                // Toast.makeText(context, "er", Toast.LENGTH_SHORT).show();
//                    AlertDialog.Builder builder = new AlertDialog.Builder(Transfer.this);
//
//                    builder.setTitle("Information!");
//
//                    builder.setMessage("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n" +
//                            "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n" +
//                            "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n" +
//                            "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n" +
//                            "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n" +
//                            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
//
//                    builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            Toast.makeText(Transfer.this, "Get Started!", Toast.LENGTH_LONG).show();
//                            dialog.dismiss();
//                        }
//                    });
//
//                    AlertDialog diag = builder.create();
//
//                    //Display the message!
//                    diag.show();
//

            }
        });

        btnback = (Button) findViewById(R.id.btn_left1);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(Transfer.this, MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });


    }


    public void callContacts(View view) {

        Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        startActivityForResult(intent, PICK_CONTACT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_CONTACT) ;
        if (resultCode == Activity.RESULT_OK) {
            Uri contactData = data.getData();
            Cursor c = managedQuery(contactData, null, null, null, null);
            if (c.moveToFirst()) {
                String name = c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                enter_number.setText(name);
                // TODO Fetch other Contact details as you want to use


            }
        }


    }

    public void alertdialogue(Context mcontext) {
        final AlertDialog.Builder dialoges = new AlertDialog.Builder(mcontext);
        View viees = LayoutInflater.from(mcontext).inflate(R.layout.alertdialogue, null);
        //LayoutInflater minflae = new LayoutInflater(mcontext,R.layout.cardview_mahatono);
        final TextView name = (TextView) viees.findViewById(R.id.mtextview);
        final Button mbtn = (Button) viees.findViewById(R.id.button_alert);
        dialoges.setView(viees);
        final AlertDialog dialoge = dialoges.create();
        dialoge.show();
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialoge.dismiss();
            }
        });

       /* phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dial = "tel:"+ mlist.get(position).getPhone();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse(dial));
                if (ActivityCompat.checkSelfPermission(mcontext, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                view.getContext().startActivity(callIntent);
            }
        });*/


    }

}

