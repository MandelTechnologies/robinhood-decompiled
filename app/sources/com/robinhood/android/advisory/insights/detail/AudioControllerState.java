package com.robinhood.android.advisory.insights.detail;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InsightAudioComponents.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AudioControllerState;", "", "status", "Lcom/robinhood/android/advisory/insights/detail/InsightAudioPlayStatus;", "desiredStatus", "isReady", "", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, "Lkotlin/Function1;", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "", "<init>", "(Lcom/robinhood/android/advisory/insights/detail/InsightAudioPlayStatus;Lcom/robinhood/android/advisory/insights/detail/InsightAudioPlayStatus;ZLkotlin/jvm/functions/Function1;)V", "getStatus", "()Lcom/robinhood/android/advisory/insights/detail/InsightAudioPlayStatus;", "getDesiredStatus", "()Z", "getToggle", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AudioControllerState {
    public static final int $stable = 0;
    private final InsightAudioComponents6 desiredStatus;
    private final boolean isReady;
    private final InsightAudioComponents6 status;
    private final Function1<UserInteractionEventDescriptor, Unit> toggle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioControllerState copy$default(AudioControllerState audioControllerState, InsightAudioComponents6 insightAudioComponents6, InsightAudioComponents6 insightAudioComponents62, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            insightAudioComponents6 = audioControllerState.status;
        }
        if ((i & 2) != 0) {
            insightAudioComponents62 = audioControllerState.desiredStatus;
        }
        if ((i & 4) != 0) {
            z = audioControllerState.isReady;
        }
        if ((i & 8) != 0) {
            function1 = audioControllerState.toggle;
        }
        return audioControllerState.copy(insightAudioComponents6, insightAudioComponents62, z, function1);
    }

    /* renamed from: component1, reason: from getter */
    public final InsightAudioComponents6 getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final InsightAudioComponents6 getDesiredStatus() {
        return this.desiredStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsReady() {
        return this.isReady;
    }

    public final Function1<UserInteractionEventDescriptor, Unit> component4() {
        return this.toggle;
    }

    public final AudioControllerState copy(InsightAudioComponents6 status, InsightAudioComponents6 desiredStatus, boolean isReady, Function1<? super UserInteractionEventDescriptor, Unit> toggle) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(desiredStatus, "desiredStatus");
        Intrinsics.checkNotNullParameter(toggle, "toggle");
        return new AudioControllerState(status, desiredStatus, isReady, toggle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioControllerState)) {
            return false;
        }
        AudioControllerState audioControllerState = (AudioControllerState) other;
        return this.status == audioControllerState.status && this.desiredStatus == audioControllerState.desiredStatus && this.isReady == audioControllerState.isReady && Intrinsics.areEqual(this.toggle, audioControllerState.toggle);
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.desiredStatus.hashCode()) * 31) + Boolean.hashCode(this.isReady)) * 31) + this.toggle.hashCode();
    }

    public String toString() {
        return "AudioControllerState(status=" + this.status + ", desiredStatus=" + this.desiredStatus + ", isReady=" + this.isReady + ", toggle=" + this.toggle + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioControllerState(InsightAudioComponents6 status, InsightAudioComponents6 desiredStatus, boolean z, Function1<? super UserInteractionEventDescriptor, Unit> toggle) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(desiredStatus, "desiredStatus");
        Intrinsics.checkNotNullParameter(toggle, "toggle");
        this.status = status;
        this.desiredStatus = desiredStatus;
        this.isReady = z;
        this.toggle = toggle;
    }

    public final InsightAudioComponents6 getStatus() {
        return this.status;
    }

    public final InsightAudioComponents6 getDesiredStatus() {
        return this.desiredStatus;
    }

    public final boolean isReady() {
        return this.isReady;
    }

    public final Function1<UserInteractionEventDescriptor, Unit> getToggle() {
        return this.toggle;
    }
}
