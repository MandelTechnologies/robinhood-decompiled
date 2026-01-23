package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.playback.ErrorEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.model.PlayerData;
import com.robinhood.iso.countrycode.CountryCode;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class ErrorTracker extends BaseTracker {
    public ErrorTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        PlayerData playerData;
        String str;
        if (playbackEvent.getType() == "error") {
            ErrorEvent errorEvent = (ErrorEvent) playbackEvent;
            String errorContext = errorEvent.getErrorContext();
            if (errorContext != null) {
                playbackEvent.getPlayerData().setPlayerErrorContext(errorContext);
            }
            if (errorEvent.getIsErrorSeverityExplicitlyAssigned()) {
                if (errorEvent.getSeverity() == ErrorEvent.ErrorSeverity.ErrorSeverityFatal) {
                    errorEvent.getPlayerData().setPlayerErrorSeverity("fatal");
                }
                if (errorEvent.getSeverity() == ErrorEvent.ErrorSeverity.ErrorSeverityWarning) {
                    errorEvent.getPlayerData().setPlayerErrorSeverity("warning");
                }
            }
            if (errorEvent.getIsErrorExplicitlyClassified()) {
                if (errorEvent.getIsBusinessException()) {
                    playerData = errorEvent.getPlayerData();
                    str = "YES";
                } else {
                    playerData = errorEvent.getPlayerData();
                    str = CountryCode.COUNTRY_CODE_NO;
                }
                playerData.setPlayerErrorBusinessException(str);
            }
        }
    }
}
