package com.example.gopal.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


//@(activity_category) is simplified xml file to integrate numberfragment inside it
//@(container) is the id of lineralayout that we have created

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();
    }
}
/*
 Commenting Numbers Activity that was earlier before using fragment
 */


//public class NumbersActivity extends AppCompatActivity {
//
//    MediaPlayer mMediaPlayer;
//    private AudioManager mAudioManager;
//    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
//        @Override
//        public void onAudioFocusChange(int focusChange) {
//            if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
//                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK ){
//                mMediaPlayer.pause();
//            }
//            else if(focusChange == AudioManager.AUDIOFOCUS_GAIN){
//                //Resume the audio
//                mMediaPlayer.start();
//            }
//            else if(focusChange ==AudioManager.AUDIOFOCUS_LOSS){
//                releaseMediaPlayer();
//            }
//
//        }
//    };

//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_numbers);
////
////        mAudioManager =  (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//
//
//        final ArrayList<Word> words = new ArrayList<Word>();
//        words.add(new Word("One","Lutti",R.drawable.number_one,R.raw.number_one));
//        words.add(new Word("Two","otiiko",R.drawable.number_two,R.raw.number_two));
//        words.add(new Word("Three","tolookosu",R.drawable.number_three,R.raw.number_three));
//        words.add(new Word("Four","oyyisa",R.drawable.number_four,R.raw.number_four));
//        words.add(new Word("Five","massokka",R.drawable.number_five,R.raw.number_five));
//        words.add(new Word("Six","temmoka",R.drawable.number_six, R.raw.number_six));
//        words.add(new Word("Seven","kenekaka",R.drawable.number_seven, R.raw.number_seven));
//        words.add(new Word("Eight","kawinta",R.drawable.number_eight, R.raw.number_eight));
//        words.add(new Word("Nine","wo'e",R.drawable.number_nine, R.raw.number_nine));
//        words.add(new Word("Ten","na'aacha",R.drawable.number_ten, R.raw.number_ten));
//
//        WordAdapter adapter = new WordAdapter(this,words,R.color.number_catagory_color);
//        ListView list = findViewById(R.id.list);
//        list.setAdapter(adapter);
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Word currentWord = words.get(i);
//
//                //If music is playing release it before playing new song
//                releaseMediaPlayer();
//
//                 //Request audio focus for playback
//                int result  = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//
//                if(result ==  AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//                    //If we have audio focus now
//                    mMediaPlayer = MediaPlayer.create(NumbersActivity.this, currentWord.getmSongResourceId());
//                    mMediaPlayer.start();
//                    mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                        @Override
//                        public void onCompletion(MediaPlayer mediaPlayer) {
//                            releaseMediaPlayer();
//                        }
//                    });
//                }
//            }
//        });




//        LinearLayout rootView = findViewById(R.id.rootView);
//        for(int i=0;i<words.size();i++) {
//            TextView child = new TextView(this);
//            child.setText(words.get(i));
//            rootView.addView(child);
//        }


//    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        releaseMediaPlayer();
//    }
//    /**
//     * Clean up the media player by releasing its resources.
//     */
//    private void releaseMediaPlayer() {
//        // If the media player is not null, then it may be currently playing a sound.
//        if (mMediaPlayer != null) {
//            // Regardless of the current state of the media player, release its resources
//            // because we no longer need it.
//            mMediaPlayer.release();
//
//            // Set the media player back to null. For our code, we've decided that
//            // setting the media player to null is an easy way to tell that the media player
//            // is not configured to play an audio file at the moment.
//            mMediaPlayer = null;
//
//            //Releasing audio focus
//            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
//        }
//    }
//}
