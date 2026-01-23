package com.mux.stats.sdk.core.events.playback;

import com.mux.stats.sdk.core.model.PlayerData;

/* loaded from: classes27.dex */
public class ErrorEvent extends PlaybackEvent {

    /* renamed from: a */
    private boolean f1046a;

    /* renamed from: b */
    private boolean f1047b;

    public enum ErrorSeverity {
        ErrorSeverityFatal,
        ErrorSeverityWarning
    }

    public ErrorEvent(PlayerData playerData) {
        super(playerData);
        this.f1046a = false;
        this.f1047b = false;
    }

    public String getErrorContext() {
        return this.playerData.getPlayerErrorContext();
    }

    public boolean getIsBusinessException() {
        return this.playerData.getPlayerErrorBusinessException().equalsIgnoreCase("true");
    }

    public boolean getIsErrorExplicitlyClassified() {
        return this.f1046a;
    }

    public boolean getIsErrorSeverityExplicitlyAssigned() {
        return this.f1047b;
    }

    public ErrorSeverity getSeverity() {
        if (this.playerData.getPlayerErrorSeverity() == null) {
            return null;
        }
        return this.playerData.getPlayerErrorSeverity().equalsIgnoreCase("warning") ? ErrorSeverity.ErrorSeverityWarning : this.playerData.getPlayerErrorSeverity().equalsIgnoreCase("fatal") ? ErrorSeverity.ErrorSeverityFatal : ErrorSeverity.valueOf(this.playerData.getPlayerErrorSeverity());
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public String getType() {
        return "error";
    }
}
