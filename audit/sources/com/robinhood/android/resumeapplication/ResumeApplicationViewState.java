package com.robinhood.android.resumeapplication;

import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.bonfire.ResumeApplicationResponse;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResumeApplicationViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationViewState;", "", "response", "Lcom/robinhood/models/api/bonfire/ResumeApplicationResponse;", "forwardToDeeplink", "", "pendingIntent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/models/api/bonfire/ResumeApplicationResponse;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;)V", "getResponse", "()Lcom/robinhood/models/api/bonfire/ResumeApplicationResponse;", "getForwardToDeeplink", "()Ljava/lang/String;", "getPendingIntent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ResumeApplicationViewState {
    public static final int $stable = 8;
    private final String forwardToDeeplink;
    private final UiEvent<IntentKey> pendingIntent;
    private final ResumeApplicationResponse response;

    public ResumeApplicationViewState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResumeApplicationViewState copy$default(ResumeApplicationViewState resumeApplicationViewState, ResumeApplicationResponse resumeApplicationResponse, String str, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            resumeApplicationResponse = resumeApplicationViewState.response;
        }
        if ((i & 2) != 0) {
            str = resumeApplicationViewState.forwardToDeeplink;
        }
        if ((i & 4) != 0) {
            uiEvent = resumeApplicationViewState.pendingIntent;
        }
        return resumeApplicationViewState.copy(resumeApplicationResponse, str, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final ResumeApplicationResponse getResponse() {
        return this.response;
    }

    /* renamed from: component2, reason: from getter */
    public final String getForwardToDeeplink() {
        return this.forwardToDeeplink;
    }

    public final UiEvent<IntentKey> component3() {
        return this.pendingIntent;
    }

    public final ResumeApplicationViewState copy(ResumeApplicationResponse response, String forwardToDeeplink, UiEvent<IntentKey> pendingIntent) {
        return new ResumeApplicationViewState(response, forwardToDeeplink, pendingIntent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResumeApplicationViewState)) {
            return false;
        }
        ResumeApplicationViewState resumeApplicationViewState = (ResumeApplicationViewState) other;
        return Intrinsics.areEqual(this.response, resumeApplicationViewState.response) && Intrinsics.areEqual(this.forwardToDeeplink, resumeApplicationViewState.forwardToDeeplink) && Intrinsics.areEqual(this.pendingIntent, resumeApplicationViewState.pendingIntent);
    }

    public int hashCode() {
        ResumeApplicationResponse resumeApplicationResponse = this.response;
        int iHashCode = (resumeApplicationResponse == null ? 0 : resumeApplicationResponse.hashCode()) * 31;
        String str = this.forwardToDeeplink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UiEvent<IntentKey> uiEvent = this.pendingIntent;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "ResumeApplicationViewState(response=" + this.response + ", forwardToDeeplink=" + this.forwardToDeeplink + ", pendingIntent=" + this.pendingIntent + ")";
    }

    public ResumeApplicationViewState(ResumeApplicationResponse resumeApplicationResponse, String str, UiEvent<IntentKey> uiEvent) {
        this.response = resumeApplicationResponse;
        this.forwardToDeeplink = str;
        this.pendingIntent = uiEvent;
    }

    public /* synthetic */ ResumeApplicationViewState(ResumeApplicationResponse resumeApplicationResponse, String str, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : resumeApplicationResponse, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : uiEvent);
    }

    public final ResumeApplicationResponse getResponse() {
        return this.response;
    }

    public final String getForwardToDeeplink() {
        return this.forwardToDeeplink;
    }

    public final UiEvent<IntentKey> getPendingIntent() {
        return this.pendingIntent;
    }
}
