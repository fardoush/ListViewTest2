package sample.android.com.listviewtest;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private String dist = "Not Found";

    private TextView tvTitle, tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            dist = bundle.getString("dist");
        }

        initView();
    }

    private void initView() {

        tvTitle = findViewById(R.id.tvDistId);
        tvDetails = findViewById(R.id.tvDetailsInfoId);
        tvTitle.setText(dist);

        Typeface  typeface = Typeface.createFromAsset(getAssets(), "BrotherTattoo_Demo.ttf");

        tvTitle.setTypeface(typeface);

        if (dist.equalsIgnoreCase("dhaka")) {

           // String s = getResources().getString(R.string.dhaka);
            tvDetails.setText(getText(R.string.dhaka));

        }
       else if (dist.equalsIgnoreCase("khulna")) {

            String s = getResources().getString(R.string.khulna);
            tvDetails.setText(s);

        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
