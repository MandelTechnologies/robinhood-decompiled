package com.robinhood.android.rhy.cardactivation.p243ui;

import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.models.api.minerva.ApiPaymentCard;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.udf.UiEvent;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardActivationSuccessViewState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010 \u001a\u00020\u0005HÂ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÂ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003J_\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u001aHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0018\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessViewState;", "", "card", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "googlePayTokenList", "", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "isGooglePayPushTokenizeLoading", "", "pushTokenizeEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "error", "", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;Lcom/robinhood/android/designsystem/style/DayNightOverlay;Ljava/util/List;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getPushTokenizeEvent", "()Lcom/robinhood/udf/UiEvent;", "getError", "isGooglePayActionVisible", "isGooglePayImageViewVisible", "isLaterButtonVisible", "actionButtonDrawable", "", "getActionButtonDrawable", "()I", "actionButtonText", "getActionButtonText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class CardActivationSuccessViewState {
    public static final int $stable = 8;
    private final PaymentCard card;
    private final DayNightOverlay dayNightOverlay;
    private final UiEvent<Throwable> error;
    private final List<GooglePayTokenInfoWrapper> googlePayTokenList;
    private final boolean isGooglePayPushTokenizeLoading;
    private final UiEvent<PushTokenizeRequest> pushTokenizeEvent;

    /* compiled from: CardActivationSuccessViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CardActivationSuccessViewState() {
        this(null, null, null, false, null, null, 63, null);
    }

    /* renamed from: component1, reason: from getter */
    private final PaymentCard getCard() {
        return this.card;
    }

    /* renamed from: component2, reason: from getter */
    private final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    private final List<GooglePayTokenInfoWrapper> component3() {
        return this.googlePayTokenList;
    }

    public static /* synthetic */ CardActivationSuccessViewState copy$default(CardActivationSuccessViewState cardActivationSuccessViewState, PaymentCard paymentCard, DayNightOverlay dayNightOverlay, List list, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentCard = cardActivationSuccessViewState.card;
        }
        if ((i & 2) != 0) {
            dayNightOverlay = cardActivationSuccessViewState.dayNightOverlay;
        }
        if ((i & 4) != 0) {
            list = cardActivationSuccessViewState.googlePayTokenList;
        }
        if ((i & 8) != 0) {
            z = cardActivationSuccessViewState.isGooglePayPushTokenizeLoading;
        }
        if ((i & 16) != 0) {
            uiEvent = cardActivationSuccessViewState.pushTokenizeEvent;
        }
        if ((i & 32) != 0) {
            uiEvent2 = cardActivationSuccessViewState.error;
        }
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        return cardActivationSuccessViewState.copy(paymentCard, dayNightOverlay, list, z, uiEvent3, uiEvent4);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsGooglePayPushTokenizeLoading() {
        return this.isGooglePayPushTokenizeLoading;
    }

    public final UiEvent<PushTokenizeRequest> component5() {
        return this.pushTokenizeEvent;
    }

    public final UiEvent<Throwable> component6() {
        return this.error;
    }

    public final CardActivationSuccessViewState copy(PaymentCard card, DayNightOverlay dayNightOverlay, List<GooglePayTokenInfoWrapper> googlePayTokenList, boolean isGooglePayPushTokenizeLoading, UiEvent<PushTokenizeRequest> pushTokenizeEvent, UiEvent<Throwable> error) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        return new CardActivationSuccessViewState(card, dayNightOverlay, googlePayTokenList, isGooglePayPushTokenizeLoading, pushTokenizeEvent, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardActivationSuccessViewState)) {
            return false;
        }
        CardActivationSuccessViewState cardActivationSuccessViewState = (CardActivationSuccessViewState) other;
        return Intrinsics.areEqual(this.card, cardActivationSuccessViewState.card) && this.dayNightOverlay == cardActivationSuccessViewState.dayNightOverlay && Intrinsics.areEqual(this.googlePayTokenList, cardActivationSuccessViewState.googlePayTokenList) && this.isGooglePayPushTokenizeLoading == cardActivationSuccessViewState.isGooglePayPushTokenizeLoading && Intrinsics.areEqual(this.pushTokenizeEvent, cardActivationSuccessViewState.pushTokenizeEvent) && Intrinsics.areEqual(this.error, cardActivationSuccessViewState.error);
    }

    public int hashCode() {
        PaymentCard paymentCard = this.card;
        int iHashCode = (((paymentCard == null ? 0 : paymentCard.hashCode()) * 31) + this.dayNightOverlay.hashCode()) * 31;
        List<GooglePayTokenInfoWrapper> list = this.googlePayTokenList;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isGooglePayPushTokenizeLoading)) * 31;
        UiEvent<PushTokenizeRequest> uiEvent = this.pushTokenizeEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.error;
        return iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "CardActivationSuccessViewState(card=" + this.card + ", dayNightOverlay=" + this.dayNightOverlay + ", googlePayTokenList=" + this.googlePayTokenList + ", isGooglePayPushTokenizeLoading=" + this.isGooglePayPushTokenizeLoading + ", pushTokenizeEvent=" + this.pushTokenizeEvent + ", error=" + this.error + ")";
    }

    public CardActivationSuccessViewState(PaymentCard paymentCard, DayNightOverlay dayNightOverlay, List<GooglePayTokenInfoWrapper> list, boolean z, UiEvent<PushTokenizeRequest> uiEvent, UiEvent<Throwable> uiEvent2) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        this.card = paymentCard;
        this.dayNightOverlay = dayNightOverlay;
        this.googlePayTokenList = list;
        this.isGooglePayPushTokenizeLoading = z;
        this.pushTokenizeEvent = uiEvent;
        this.error = uiEvent2;
    }

    public /* synthetic */ CardActivationSuccessViewState(PaymentCard paymentCard, DayNightOverlay dayNightOverlay, List list, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentCard, (i & 2) != 0 ? DayNightOverlay.DAY : dayNightOverlay, (i & 4) != 0 ? null : list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : uiEvent, (i & 32) != 0 ? null : uiEvent2);
    }

    public final boolean isGooglePayPushTokenizeLoading() {
        return this.isGooglePayPushTokenizeLoading;
    }

    public final UiEvent<PushTokenizeRequest> getPushTokenizeEvent() {
        return this.pushTokenizeEvent;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final boolean isGooglePayActionVisible() {
        List<GooglePayTokenInfoWrapper> list;
        PaymentCard paymentCard = this.card;
        if ((paymentCard != null ? paymentCard.getState() : null) != ApiPaymentCard.State.ACTIVE || (list = this.googlePayTokenList) == null) {
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

    public final boolean isGooglePayImageViewVisible() {
        return isGooglePayActionVisible() && !this.isGooglePayPushTokenizeLoading;
    }

    public final boolean isLaterButtonVisible() {
        return isGooglePayActionVisible();
    }

    public final int getActionButtonDrawable() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.dayNightOverlay.ordinal()];
        if (i == 1) {
            return C11257R.drawable.google_pay_add_to_gpay_content_dark;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C11257R.drawable.google_pay_add_to_gpay_content_light;
    }

    public final int getActionButtonText() {
        if (isGooglePayActionVisible()) {
            return C11048R.string.space_placeholder;
        }
        return C11048R.string.general_label_done;
    }
}
