package com.robinhood.android.rhy.referral.fund.confirmation;

import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundConfirmationDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDataState;", "", "googlePayTokenList", "", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "showDebugAddCardToGooglePayDialog", "", "<init>", "(Ljava/util/List;Z)V", "getGooglePayTokenList", "()Ljava/util/List;", "getShowDebugAddCardToGooglePayDialog", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyReferralFundConfirmationDataState {
    public static final int $stable = 8;
    private final List<GooglePayTokenInfoWrapper> googlePayTokenList;
    private final boolean showDebugAddCardToGooglePayDialog;

    /* JADX WARN: Multi-variable type inference failed */
    public RhyReferralFundConfirmationDataState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RhyReferralFundConfirmationDataState copy$default(RhyReferralFundConfirmationDataState rhyReferralFundConfirmationDataState, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rhyReferralFundConfirmationDataState.googlePayTokenList;
        }
        if ((i & 2) != 0) {
            z = rhyReferralFundConfirmationDataState.showDebugAddCardToGooglePayDialog;
        }
        return rhyReferralFundConfirmationDataState.copy(list, z);
    }

    public final List<GooglePayTokenInfoWrapper> component1() {
        return this.googlePayTokenList;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowDebugAddCardToGooglePayDialog() {
        return this.showDebugAddCardToGooglePayDialog;
    }

    public final RhyReferralFundConfirmationDataState copy(List<GooglePayTokenInfoWrapper> googlePayTokenList, boolean showDebugAddCardToGooglePayDialog) {
        return new RhyReferralFundConfirmationDataState(googlePayTokenList, showDebugAddCardToGooglePayDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralFundConfirmationDataState)) {
            return false;
        }
        RhyReferralFundConfirmationDataState rhyReferralFundConfirmationDataState = (RhyReferralFundConfirmationDataState) other;
        return Intrinsics.areEqual(this.googlePayTokenList, rhyReferralFundConfirmationDataState.googlePayTokenList) && this.showDebugAddCardToGooglePayDialog == rhyReferralFundConfirmationDataState.showDebugAddCardToGooglePayDialog;
    }

    public int hashCode() {
        List<GooglePayTokenInfoWrapper> list = this.googlePayTokenList;
        return ((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.showDebugAddCardToGooglePayDialog);
    }

    public String toString() {
        return "RhyReferralFundConfirmationDataState(googlePayTokenList=" + this.googlePayTokenList + ", showDebugAddCardToGooglePayDialog=" + this.showDebugAddCardToGooglePayDialog + ")";
    }

    public RhyReferralFundConfirmationDataState(List<GooglePayTokenInfoWrapper> list, boolean z) {
        this.googlePayTokenList = list;
        this.showDebugAddCardToGooglePayDialog = z;
    }

    public /* synthetic */ RhyReferralFundConfirmationDataState(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z);
    }

    public final List<GooglePayTokenInfoWrapper> getGooglePayTokenList() {
        return this.googlePayTokenList;
    }

    public final boolean getShowDebugAddCardToGooglePayDialog() {
        return this.showDebugAddCardToGooglePayDialog;
    }
}
