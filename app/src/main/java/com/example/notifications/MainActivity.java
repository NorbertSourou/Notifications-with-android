package com.example.notifications;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final static String default_notification_channel_id = "default";
    private static final int NOTIF_ID = 123;

    Button btnCreateNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCreateNotification = findViewById(R.id.a);
        btnCreateNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                final PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
//                NotificationCompat.Builder mBuilder =
//                        new NotificationCompat.Builder(MainActivity.this,
//                                default_notification_channel_id)
//                                .setSmallIcon(R.drawable.ic_launcher_foreground)
//                                .setContentTitle("Test")
//                                .addAction(R.drawable.ic_launcher_foreground, "Add", resultPendingIntent)
//                                .setContentIntent(resultPendingIntent)
//                                .setStyle(new NotificationCompat.BigTextStyle().bigText("Big View Styles"))
//                                .setContentText("Hello! This is my first push notification");
//                NotificationManager mNotificationManager = (NotificationManager)
//                        getSystemService(Context.NOTIFICATION_SERVICE);
//                mNotificationManager.notify((int) System.currentTimeMillis(), mBuilder.build());
//                Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
//
//                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//                Notification mNotification = new Notification.Builder(getApplicationContext())
//                        .setContentTitle("Alert")
//                        .setContentText("Body temperature is more than normal")
//                        .setSound(soundUri)
//                        .setSmallIcon(R.drawable.ic_launcher_background)
//                        .setContentIntent(pIntent)
//                        .build();
//
//
//                mNotification.flags |= Notification.FLAG_AUTO_CANCEL;
//
//                notificationManager.notify(0, mNotification);

                NotificationHelper notificationHelper = new NotificationHelper(MainActivity.this);
                notificationHelper.notify(1, true, "Alerte !!!", "Le patient au lit n°1 est dans un état critique");
                Log.i("MainActivity", "Notification launched");
            }
        });
    }
}
