package com.robinhood.android.cash.transaction.p079ui.forcepost;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.models.api.minerva.ApiCardTransactions;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.udf.UiEvent;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: ForcePostViewState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÂ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003Jm\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010/\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020 HÖ\u0001J\t\u00102\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0012\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010!¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostViewState;", "", "cardTransaction", "Lcom/robinhood/models/db/mcduckling/CardTransaction;", "cmCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "rhyCard", "googlePayTokenList", "", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "pushTokenizeEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "verificationRequired", "Lcom/robinhood/models/api/minerva/VerificationRequiredException;", "isRequestLoading", "", "<init>", "(Lcom/robinhood/models/db/mcduckling/CardTransaction;Lcom/robinhood/models/db/mcduckling/PaymentCard;Lcom/robinhood/models/db/mcduckling/PaymentCard;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Z)V", "getCardTransaction", "()Lcom/robinhood/models/db/mcduckling/CardTransaction;", "getCmCard", "()Lcom/robinhood/models/db/mcduckling/PaymentCard;", "getRhyCard", "getPushTokenizeEvent", "()Lcom/robinhood/udf/UiEvent;", "getVerificationRequired", "()Z", "isTransactionInStore", "isMobileWalletTransaction", "isGooglePayActive", "daysRemaining", "", "Ljava/lang/Integer;", "getForcePostDescription", "", "context", "Landroid/content/Context;", "getDaysRemainingStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class ForcePostViewState {
    public static final int $stable = 8;
    private final CardTransaction cardTransaction;
    private final PaymentCard cmCard;
    private final Integer daysRemaining;
    private final List<GooglePayTokenInfoWrapper> googlePayTokenList;
    private final boolean isMobileWalletTransaction;
    private final boolean isRequestLoading;
    private final boolean isTransactionInStore;
    private final UiEvent<PushTokenizeRequest> pushTokenizeEvent;
    private final PaymentCard rhyCard;
    private final UiEvent<VerificationRequiredException> verificationRequired;

    public ForcePostViewState() {
        this(null, null, null, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    private final List<GooglePayTokenInfoWrapper> component4() {
        return this.googlePayTokenList;
    }

    public static /* synthetic */ ForcePostViewState copy$default(ForcePostViewState forcePostViewState, CardTransaction cardTransaction, PaymentCard paymentCard, PaymentCard paymentCard2, List list, UiEvent uiEvent, UiEvent uiEvent2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cardTransaction = forcePostViewState.cardTransaction;
        }
        if ((i & 2) != 0) {
            paymentCard = forcePostViewState.cmCard;
        }
        if ((i & 4) != 0) {
            paymentCard2 = forcePostViewState.rhyCard;
        }
        if ((i & 8) != 0) {
            list = forcePostViewState.googlePayTokenList;
        }
        if ((i & 16) != 0) {
            uiEvent = forcePostViewState.pushTokenizeEvent;
        }
        if ((i & 32) != 0) {
            uiEvent2 = forcePostViewState.verificationRequired;
        }
        if ((i & 64) != 0) {
            z = forcePostViewState.isRequestLoading;
        }
        UiEvent uiEvent3 = uiEvent2;
        boolean z2 = z;
        UiEvent uiEvent4 = uiEvent;
        PaymentCard paymentCard3 = paymentCard2;
        return forcePostViewState.copy(cardTransaction, paymentCard, paymentCard3, list, uiEvent4, uiEvent3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final CardTransaction getCardTransaction() {
        return this.cardTransaction;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentCard getCmCard() {
        return this.cmCard;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentCard getRhyCard() {
        return this.rhyCard;
    }

    public final UiEvent<PushTokenizeRequest> component5() {
        return this.pushTokenizeEvent;
    }

    public final UiEvent<VerificationRequiredException> component6() {
        return this.verificationRequired;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsRequestLoading() {
        return this.isRequestLoading;
    }

    public final ForcePostViewState copy(CardTransaction cardTransaction, PaymentCard cmCard, PaymentCard rhyCard, List<GooglePayTokenInfoWrapper> googlePayTokenList, UiEvent<PushTokenizeRequest> pushTokenizeEvent, UiEvent<VerificationRequiredException> verificationRequired, boolean isRequestLoading) {
        return new ForcePostViewState(cardTransaction, cmCard, rhyCard, googlePayTokenList, pushTokenizeEvent, verificationRequired, isRequestLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForcePostViewState)) {
            return false;
        }
        ForcePostViewState forcePostViewState = (ForcePostViewState) other;
        return Intrinsics.areEqual(this.cardTransaction, forcePostViewState.cardTransaction) && Intrinsics.areEqual(this.cmCard, forcePostViewState.cmCard) && Intrinsics.areEqual(this.rhyCard, forcePostViewState.rhyCard) && Intrinsics.areEqual(this.googlePayTokenList, forcePostViewState.googlePayTokenList) && Intrinsics.areEqual(this.pushTokenizeEvent, forcePostViewState.pushTokenizeEvent) && Intrinsics.areEqual(this.verificationRequired, forcePostViewState.verificationRequired) && this.isRequestLoading == forcePostViewState.isRequestLoading;
    }

    public int hashCode() {
        CardTransaction cardTransaction = this.cardTransaction;
        int iHashCode = (cardTransaction == null ? 0 : cardTransaction.hashCode()) * 31;
        PaymentCard paymentCard = this.cmCard;
        int iHashCode2 = (iHashCode + (paymentCard == null ? 0 : paymentCard.hashCode())) * 31;
        PaymentCard paymentCard2 = this.rhyCard;
        int iHashCode3 = (iHashCode2 + (paymentCard2 == null ? 0 : paymentCard2.hashCode())) * 31;
        List<GooglePayTokenInfoWrapper> list = this.googlePayTokenList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        UiEvent<PushTokenizeRequest> uiEvent = this.pushTokenizeEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<VerificationRequiredException> uiEvent2 = this.verificationRequired;
        return ((iHashCode5 + (uiEvent2 != null ? uiEvent2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRequestLoading);
    }

    public String toString() {
        return "ForcePostViewState(cardTransaction=" + this.cardTransaction + ", cmCard=" + this.cmCard + ", rhyCard=" + this.rhyCard + ", googlePayTokenList=" + this.googlePayTokenList + ", pushTokenizeEvent=" + this.pushTokenizeEvent + ", verificationRequired=" + this.verificationRequired + ", isRequestLoading=" + this.isRequestLoading + ")";
    }

    public ForcePostViewState(CardTransaction cardTransaction, PaymentCard paymentCard, PaymentCard paymentCard2, List<GooglePayTokenInfoWrapper> list, UiEvent<PushTokenizeRequest> uiEvent, UiEvent<VerificationRequiredException> uiEvent2, boolean z) {
        Instant validUntil;
        this.cardTransaction = cardTransaction;
        this.cmCard = paymentCard;
        this.rhyCard = paymentCard2;
        this.googlePayTokenList = list;
        this.pushTokenizeEvent = uiEvent;
        this.verificationRequired = uiEvent2;
        this.isRequestLoading = z;
        Integer numValueOf = null;
        this.isTransactionInStore = (cardTransaction != null ? cardTransaction.getType() : null) == ApiCardTransactions.Type.IN_PERSON;
        this.isMobileWalletTransaction = (cardTransaction != null ? cardTransaction.getMobilePayService() : null) != null;
        if (paymentCard != null && (validUntil = paymentCard.getValidUntil()) != null) {
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Duration durationBetween = Duration.between(instantNow, validUntil);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            numValueOf = Integer.valueOf((int) durationBetween.toDays());
        }
        this.daysRemaining = numValueOf;
    }

    public /* synthetic */ ForcePostViewState(CardTransaction cardTransaction, PaymentCard paymentCard, PaymentCard paymentCard2, List list, UiEvent uiEvent, UiEvent uiEvent2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cardTransaction, (i & 2) != 0 ? null : paymentCard, (i & 4) != 0 ? null : paymentCard2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : uiEvent, (i & 32) != 0 ? null : uiEvent2, (i & 64) != 0 ? false : z);
    }

    public final CardTransaction getCardTransaction() {
        return this.cardTransaction;
    }

    public final PaymentCard getCmCard() {
        return this.cmCard;
    }

    public final PaymentCard getRhyCard() {
        return this.rhyCard;
    }

    public final UiEvent<PushTokenizeRequest> getPushTokenizeEvent() {
        return this.pushTokenizeEvent;
    }

    public final UiEvent<VerificationRequiredException> getVerificationRequired() {
        return this.verificationRequired;
    }

    public final boolean isRequestLoading() {
        return this.isRequestLoading;
    }

    /* renamed from: isTransactionInStore, reason: from getter */
    public final boolean getIsTransactionInStore() {
        return this.isTransactionInStore;
    }

    /* renamed from: isMobileWalletTransaction, reason: from getter */
    public final boolean getIsMobileWalletTransaction() {
        return this.isMobileWalletTransaction;
    }

    public final boolean isGooglePayActive() {
        List<GooglePayTokenInfoWrapper> list = this.googlePayTokenList;
        if (list == null) {
            return false;
        }
        List<GooglePayTokenInfoWrapper> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (GooglePayTokenInfoWrapper googlePayTokenInfoWrapper : list2) {
            if (googlePayTokenInfoWrapper.getTokenState() == 5 || googlePayTokenInfoWrapper.getTokenState() == 2) {
                return false;
            }
        }
        return true;
    }

    public final String getForcePostDescription(Context context) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        String daysRemainingStr = getDaysRemainingStr(context);
        Integer num = this.daysRemaining;
        if (num != null && num.intValue() < 0) {
            int i = C10421R.string.force_post_card_after_deactivation_notice;
            PaymentCard paymentCard = this.cmCard;
            String string2 = context.getString(i, paymentCard != null ? paymentCard.getLastFourDigits() : null);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (this.isTransactionInStore) {
            int i2 = C10421R.string.force_post_card_before_deactivation_notice_physical;
            PaymentCard paymentCard2 = this.cmCard;
            String string3 = context.getString(i2, paymentCard2 != null ? paymentCard2.getLastFourDigits() : null, daysRemainingStr);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        int i3 = C10421R.string.force_post_card_before_deactivation_notice_virtual;
        PaymentCard paymentCard3 = this.cmCard;
        String string4 = context.getString(i3, paymentCard3 != null ? paymentCard3.getLastFourDigits() : null, daysRemainingStr);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    private final String getDaysRemainingStr(Context context) throws Resources.NotFoundException {
        if (this.daysRemaining != null) {
            String quantityString = context.getResources().getQuantityString(C10421R.plurals.days_remaining, this.daysRemaining.intValue(), this.daysRemaining);
            Intrinsics.checkNotNull(quantityString);
            return quantityString;
        }
        String string2 = context.getString(C10421R.string.days_remaining_default);
        Intrinsics.checkNotNull(string2);
        return string2;
    }
}
