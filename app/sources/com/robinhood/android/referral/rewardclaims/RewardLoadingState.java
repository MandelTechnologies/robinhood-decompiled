package com.robinhood.android.referral.rewardclaims;

import com.robinhood.android.growth.model.ErrorData;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0003J'\u0010\f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardclaims/RewardLoadingState;", "", "response", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/growth/model/ErrorData;", "<init>", "(Lcom/robinhood/utils/Either;)V", "getResponse", "()Lcom/robinhood/utils/Either;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RewardLoadingState {
    public static final int $stable = 8;
    private final Either<UiRewardCertificateInfo, UiEvent<ErrorData>> response;

    /* JADX WARN: Multi-variable type inference failed */
    public RewardLoadingState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardLoadingState copy$default(RewardLoadingState rewardLoadingState, Either either, int i, Object obj) {
        if ((i & 1) != 0) {
            either = rewardLoadingState.response;
        }
        return rewardLoadingState.copy(either);
    }

    public final Either<UiRewardCertificateInfo, UiEvent<ErrorData>> component1() {
        return this.response;
    }

    public final RewardLoadingState copy(Either<UiRewardCertificateInfo, UiEvent<ErrorData>> response) {
        return new RewardLoadingState(response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RewardLoadingState) && Intrinsics.areEqual(this.response, ((RewardLoadingState) other).response);
    }

    public int hashCode() {
        Either<UiRewardCertificateInfo, UiEvent<ErrorData>> either = this.response;
        if (either == null) {
            return 0;
        }
        return either.hashCode();
    }

    public String toString() {
        return "RewardLoadingState(response=" + this.response + ")";
    }

    public RewardLoadingState(Either<UiRewardCertificateInfo, UiEvent<ErrorData>> either) {
        this.response = either;
    }

    public /* synthetic */ RewardLoadingState(Either either, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : either);
    }

    public final Either<UiRewardCertificateInfo, UiEvent<ErrorData>> getResponse() {
        return this.response;
    }
}
