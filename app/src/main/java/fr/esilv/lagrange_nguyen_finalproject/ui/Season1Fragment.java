package fr.esilv.lagrange_nguyen_finalproject.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import fr.esilv.lagrange_nguyen_finalproject.Config;
import fr.esilv.lagrange_nguyen_finalproject.R;

public class Season1Fragment extends Fragment {
    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;

    /*public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_season1, container, false);
        youTubeView = (YouTubePlayerView) root.findViewById(R.id.youtube_view);
        youTubeView.initialize(Config.YOUTUBE_API_KEY, (YouTubePlayer.OnInitializedListener) getActivity());
        return root;
    }


    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo("fhWaJi1Hsfo"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
        }
    }

    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(getActivity(), RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(getActivity(), error, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize(Config.YOUTUBE_API_KEY, (YouTubePlayer.OnInitializedListener) getActivity());
        }
    }

    public YouTubePlayer.Provider getYouTubePlayerProvider() {
        return youTubeView;
    }
*/
}
