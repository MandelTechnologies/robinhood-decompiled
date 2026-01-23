package com.robinhood.android.rhy.referral.referee;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.rhy.referral.p345db.RefereeLanding;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsRefereeLandingDataState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003Jd\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u000b\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;", "", "refereeLanding", "Lcom/robinhood/models/rhy/referral/db/RefereeLanding;", "error", "", "googlePayTokenList", "", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "showDebugAddCardToGooglePayDialog", "", "isActiveAccount", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "alwaysShowAddToGPay", "<init>", "(Lcom/robinhood/models/rhy/referral/db/RefereeLanding;Ljava/lang/Throwable;Ljava/util/List;ZLjava/lang/Boolean;Lcom/robinhood/models/db/mcduckling/PaymentCard;Z)V", "getRefereeLanding", "()Lcom/robinhood/models/rhy/referral/db/RefereeLanding;", "getError", "()Ljava/lang/Throwable;", "getGooglePayTokenList", "()Ljava/util/List;", "getShowDebugAddCardToGooglePayDialog", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPaymentCard", "()Lcom/robinhood/models/db/mcduckling/PaymentCard;", "getAlwaysShowAddToGPay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/models/rhy/referral/db/RefereeLanding;Ljava/lang/Throwable;Ljava/util/List;ZLjava/lang/Boolean;Lcom/robinhood/models/db/mcduckling/PaymentCard;Z)Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyReferralsRefereeLandingDataState {
    public static final int $stable = 8;
    private final boolean alwaysShowAddToGPay;
    private final Throwable error;
    private final List<GooglePayTokenInfoWrapper> googlePayTokenList;
    private final Boolean isActiveAccount;
    private final PaymentCard paymentCard;
    private final RefereeLanding refereeLanding;
    private final boolean showDebugAddCardToGooglePayDialog;

    public RhyReferralsRefereeLandingDataState() {
        this(null, null, null, false, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ RhyReferralsRefereeLandingDataState copy$default(RhyReferralsRefereeLandingDataState rhyReferralsRefereeLandingDataState, RefereeLanding refereeLanding, Throwable th, List list, boolean z, Boolean bool, PaymentCard paymentCard, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            refereeLanding = rhyReferralsRefereeLandingDataState.refereeLanding;
        }
        if ((i & 2) != 0) {
            th = rhyReferralsRefereeLandingDataState.error;
        }
        if ((i & 4) != 0) {
            list = rhyReferralsRefereeLandingDataState.googlePayTokenList;
        }
        if ((i & 8) != 0) {
            z = rhyReferralsRefereeLandingDataState.showDebugAddCardToGooglePayDialog;
        }
        if ((i & 16) != 0) {
            bool = rhyReferralsRefereeLandingDataState.isActiveAccount;
        }
        if ((i & 32) != 0) {
            paymentCard = rhyReferralsRefereeLandingDataState.paymentCard;
        }
        if ((i & 64) != 0) {
            z2 = rhyReferralsRefereeLandingDataState.alwaysShowAddToGPay;
        }
        PaymentCard paymentCard2 = paymentCard;
        boolean z3 = z2;
        Boolean bool2 = bool;
        List list2 = list;
        return rhyReferralsRefereeLandingDataState.copy(refereeLanding, th, list2, z, bool2, paymentCard2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final RefereeLanding getRefereeLanding() {
        return this.refereeLanding;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final List<GooglePayTokenInfoWrapper> component3() {
        return this.googlePayTokenList;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowDebugAddCardToGooglePayDialog() {
        return this.showDebugAddCardToGooglePayDialog;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsActiveAccount() {
        return this.isActiveAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final PaymentCard getPaymentCard() {
        return this.paymentCard;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAlwaysShowAddToGPay() {
        return this.alwaysShowAddToGPay;
    }

    public final RhyReferralsRefereeLandingDataState copy(RefereeLanding refereeLanding, Throwable error, List<GooglePayTokenInfoWrapper> googlePayTokenList, boolean showDebugAddCardToGooglePayDialog, Boolean isActiveAccount, PaymentCard paymentCard, boolean alwaysShowAddToGPay) {
        return new RhyReferralsRefereeLandingDataState(refereeLanding, error, googlePayTokenList, showDebugAddCardToGooglePayDialog, isActiveAccount, paymentCard, alwaysShowAddToGPay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralsRefereeLandingDataState)) {
            return false;
        }
        RhyReferralsRefereeLandingDataState rhyReferralsRefereeLandingDataState = (RhyReferralsRefereeLandingDataState) other;
        return Intrinsics.areEqual(this.refereeLanding, rhyReferralsRefereeLandingDataState.refereeLanding) && Intrinsics.areEqual(this.error, rhyReferralsRefereeLandingDataState.error) && Intrinsics.areEqual(this.googlePayTokenList, rhyReferralsRefereeLandingDataState.googlePayTokenList) && this.showDebugAddCardToGooglePayDialog == rhyReferralsRefereeLandingDataState.showDebugAddCardToGooglePayDialog && Intrinsics.areEqual(this.isActiveAccount, rhyReferralsRefereeLandingDataState.isActiveAccount) && Intrinsics.areEqual(this.paymentCard, rhyReferralsRefereeLandingDataState.paymentCard) && this.alwaysShowAddToGPay == rhyReferralsRefereeLandingDataState.alwaysShowAddToGPay;
    }

    public int hashCode() {
        RefereeLanding refereeLanding = this.refereeLanding;
        int iHashCode = (refereeLanding == null ? 0 : refereeLanding.hashCode()) * 31;
        Throwable th = this.error;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        List<GooglePayTokenInfoWrapper> list = this.googlePayTokenList;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.showDebugAddCardToGooglePayDialog)) * 31;
        Boolean bool = this.isActiveAccount;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        PaymentCard paymentCard = this.paymentCard;
        return ((iHashCode4 + (paymentCard != null ? paymentCard.hashCode() : 0)) * 31) + Boolean.hashCode(this.alwaysShowAddToGPay);
    }

    public String toString() {
        return "RhyReferralsRefereeLandingDataState(refereeLanding=" + this.refereeLanding + ", error=" + this.error + ", googlePayTokenList=" + this.googlePayTokenList + ", showDebugAddCardToGooglePayDialog=" + this.showDebugAddCardToGooglePayDialog + ", isActiveAccount=" + this.isActiveAccount + ", paymentCard=" + this.paymentCard + ", alwaysShowAddToGPay=" + this.alwaysShowAddToGPay + ")";
    }

    public RhyReferralsRefereeLandingDataState(RefereeLanding refereeLanding, Throwable th, List<GooglePayTokenInfoWrapper> list, boolean z, Boolean bool, PaymentCard paymentCard, boolean z2) {
        this.refereeLanding = refereeLanding;
        this.error = th;
        this.googlePayTokenList = list;
        this.showDebugAddCardToGooglePayDialog = z;
        this.isActiveAccount = bool;
        this.paymentCard = paymentCard;
        this.alwaysShowAddToGPay = z2;
    }

    public /* synthetic */ RhyReferralsRefereeLandingDataState(RefereeLanding refereeLanding, Throwable th, List list, boolean z, Boolean bool, PaymentCard paymentCard, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : refereeLanding, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : paymentCard, (i & 64) != 0 ? false : z2);
    }

    public final RefereeLanding getRefereeLanding() {
        return this.refereeLanding;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final List<GooglePayTokenInfoWrapper> getGooglePayTokenList() {
        return this.googlePayTokenList;
    }

    public final boolean getShowDebugAddCardToGooglePayDialog() {
        return this.showDebugAddCardToGooglePayDialog;
    }

    public final Boolean isActiveAccount() {
        return this.isActiveAccount;
    }

    public final PaymentCard getPaymentCard() {
        return this.paymentCard;
    }

    public final boolean getAlwaysShowAddToGPay() {
        return this.alwaysShowAddToGPay;
    }
}
