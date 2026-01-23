package com.robinhood.android.matcha.p177ui.deeplink;

import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransferDeeplinkDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/deeplink/MatchaTransferDeeplinkState;", "", "profileResult", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Result;", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getProfileResult", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaTransferDeeplinkState {
    public static final int $stable = 8;
    private final UiEvent<Result<ApiSocialProfileInfo>> profileResult;

    /* JADX WARN: Multi-variable type inference failed */
    public MatchaTransferDeeplinkState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchaTransferDeeplinkState copy$default(MatchaTransferDeeplinkState matchaTransferDeeplinkState, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = matchaTransferDeeplinkState.profileResult;
        }
        return matchaTransferDeeplinkState.copy(uiEvent);
    }

    public final UiEvent<Result<ApiSocialProfileInfo>> component1() {
        return this.profileResult;
    }

    public final MatchaTransferDeeplinkState copy(UiEvent<Result<ApiSocialProfileInfo>> profileResult) {
        return new MatchaTransferDeeplinkState(profileResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MatchaTransferDeeplinkState) && Intrinsics.areEqual(this.profileResult, ((MatchaTransferDeeplinkState) other).profileResult);
    }

    public int hashCode() {
        UiEvent<Result<ApiSocialProfileInfo>> uiEvent = this.profileResult;
        if (uiEvent == null) {
            return 0;
        }
        return uiEvent.hashCode();
    }

    public String toString() {
        return "MatchaTransferDeeplinkState(profileResult=" + this.profileResult + ")";
    }

    public MatchaTransferDeeplinkState(UiEvent<Result<ApiSocialProfileInfo>> uiEvent) {
        this.profileResult = uiEvent;
    }

    public /* synthetic */ MatchaTransferDeeplinkState(UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent);
    }

    public final UiEvent<Result<ApiSocialProfileInfo>> getProfileResult() {
        return this.profileResult;
    }
}
