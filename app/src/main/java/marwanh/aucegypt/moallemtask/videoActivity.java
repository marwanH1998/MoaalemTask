package marwanh.aucegypt.moallemtask;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoActivity extends AppCompatActivity {

    private VideoView mainVid;
    private MediaController med;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        med = new MediaController(this) ;
        med.setAnchorView(mainVid);
        mainVid= findViewById(R.id.videoView);
        Uri vidUri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/moaalem-d0e78.appspot.com/o/All%20over%20in%2010%20seconds.mp4?alt=media&token=53ea655e-436f-498a-85fd-34911d8cd422");
        mainVid.setVideoURI(vidUri);
        mainVid.setMediaController(med);
        mainVid.requestFocus();
        mainVid.start();
    }
}
