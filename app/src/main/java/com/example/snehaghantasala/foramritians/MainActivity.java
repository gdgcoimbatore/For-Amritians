package com.example.snehaghantasala.foramritians;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int n1=3;
    int n2=3;
    int n3=3;
    int n4=3;
    int n5=3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button2 = (ImageButton) findViewById(R.id.button2);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = 2;
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.pool, options2);
        button2.setImageBitmap(bitmap1);

        ImageButton button1 = (ImageButton)findViewById(R.id.button1);

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.books, options2);
        button1.setImageBitmap(bitmap2);

        ImageButton button3 = (ImageButton)findViewById(R.id.button3);
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.food, options2);
        button3.setImageBitmap(bitmap3);

        ImageButton button4 = (ImageButton)findViewById(R.id.button4);
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.gate, options2);
        button4.setImageBitmap(bitmap4);

        ImageButton button5 = (ImageButton)findViewById(R.id.button5);
        Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(), R.drawable.bus, options2);
        button5.setImageBitmap(bitmap5);




    }

    public void bookstext(View view) {

        String b1 = "The university has a beautiful library. Use it. Books are definitely better than eBooks as they do not strain the eyes. Don't buy books unless it's your core subject. You would hardly need to study one or two chapters out of the whole book. You could get a photocopy of these chapters or get the books from the seniors. There are plenty of seniors who would be ready to give them to you. And after you are done using the books, you could lend them to your juniors or donate them to the library :)";
        String b2="";
        TextView booksTextView = (TextView) findViewById(
                R.id.books_text_view);
        if(n1%2==0) {
            booksTextView.setText(b2);

            n1=3;
        }
        else
        {
            booksTextView.setText(b1);
           n1=4;
        }

    }

    public void swimtext(View view) {
        String s1 = "The university has a really huge, olympic level swimming pool. Being a student of the university a dip in that pool is a must! You would love it. If you don't know how to swim, relax. You could enroll for the classes. The fees is reasonable and the pool is super clean.";
        TextView swimTextView = (TextView) findViewById(
                R.id.pool_text_view);
        String s2="";
        if(n2%2==0) {
            swimTextView.setText(s2);
            n2=3;
        }
        else
        {
            swimTextView.setText(s1);
            n2=4;
        }
    }



    public void foodtext(View view) {
        String f1 = "All of us get really delicious food at our houses. If you are staying in the hostel, don't forget to get pickles and snacks from your homes after every vacation. The transition from home food to hostel food is really tough. This would probably be the only time you miss and love the food your mom makes.";
        TextView foodTextView = (TextView) findViewById(
                R.id.food_text_view);
        String f2="";
        if(n3%2==0) {
            foodTextView.setText(f2);
            n3=3;
        }
        else
        {
            foodTextView.setText(f1);
            n3=4;
        }


    }



    public void gatetext(View view) {
        String g1 = "This is for the people staying in the hostel. The university has a Gatepass Management System. To get out of the campus, you have to apply for a pass. Apply the gate pass two days prior. The wardens will not issue the pass if you apply it right when you want to go.";
        TextView gateTextView = (TextView) findViewById(
                R.id.gate_text_view);
        String g2="";
        if(n4%2==0) {
            gateTextView.setText(g2);
            n4 = 3;
        }
        else
        {
           gateTextView.setText(g1);
            n4 = 4;
        }}

    public void bustext(View view)

    {
        String b2 = "Although the college bus picks and drops in time, it is quite expensive. Day scholars could always choose to come by train or city buses to the college.\nThe university is far away from the city, but transport is always available. It would be really helpful to have a copy of the train schedule and bus timings. ";
        TextView busTextView = (TextView) findViewById(
                R.id.bus_text_view);
        String b1="";
        if(n5%2==0) {
            busTextView.setText(b1);
            n5=3;
        }
        else
        {
            busTextView.setText(b2);
            n5 = 4;
        }
    }


    public void composeEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        //intent.putExtra(Intent.EXTRA_TEXT,message);
        intent.putExtra(Intent.EXTRA_SUBJECT, "query from Amritian :)");
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"sneha5gsm@gmail.com"});
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
