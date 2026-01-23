package com.robinhood.android.mcduckling.card.help.p179ui;

import android.content.Context;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.mcduckling.card.help.C21627R;
import com.robinhood.models.api.mcduckling.CardColor;
import com.robinhood.models.api.minerva.ApiCardColorOption;
import com.robinhood.models.api.minerva.ApiPaymentCard;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.udf.UiEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardReplacementConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010*\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÂ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÂ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JU\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010:\u001a\u00020\u00192\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0015HÖ\u0001J\t\u0010=\u001a\u00020\u001cHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010 \u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b'\u0010\u001aR\u0011\u0010(\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u0011\u0010+\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0011\u0010-\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b.\u0010\u0017R\u0011\u00100\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R\u0011\u00102\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b3\u0010\u0017¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationViewState;", "", "card", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "replacementType", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "cardColorOptions", "", "Lcom/robinhood/models/api/minerva/ApiCardColorOption;", "googlePayTokenList", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "error", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;Ljava/util/List;Ljava/util/List;Lcom/robinhood/udf/UiEvent;)V", "getReplacementType", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "getError", "()Lcom/robinhood/udf/UiEvent;", "subtitleResId", "", "getSubtitleResId", "()I", "isCardEligibleForGooglePay", "", "()Z", "getSubtitle", "", "context", "Landroid/content/Context;", "isLoaded", "cardArrivalTime", "getCardArrivalTime", "()Ljava/lang/String;", "cardColorOption", "getCardColorOption", "()Lcom/robinhood/models/api/minerva/ApiCardColorOption;", "showBackOrderDisclosure", "getShowBackOrderDisclosure", "backOrderDisclosureTextResId", "getBackOrderDisclosureTextResId", "getBackOrderDisclosureText", "disclosureDialogTitleResId", "getDisclosureDialogTitleResId", "disclosureDialogBodyResId", "getDisclosureDialogBodyResId", "getDisclosureDialogBodyText", "disclosureDialogButtonTextResId", "getDisclosureDialogButtonTextResId", "doneButtonTextResId", "getDoneButtonTextResId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class CardReplacementConfirmationViewState {
    public static final int $stable = 8;
    private final PaymentCard card;
    private final List<ApiCardColorOption> cardColorOptions;
    private final UiEvent<Throwable> error;
    private final List<GooglePayTokenInfoWrapper> googlePayTokenList;
    private final CardReplacementType replacementType;

    /* renamed from: component1, reason: from getter */
    private final PaymentCard getCard() {
        return this.card;
    }

    private final List<ApiCardColorOption> component3() {
        return this.cardColorOptions;
    }

    private final List<GooglePayTokenInfoWrapper> component4() {
        return this.googlePayTokenList;
    }

    public static /* synthetic */ CardReplacementConfirmationViewState copy$default(CardReplacementConfirmationViewState cardReplacementConfirmationViewState, PaymentCard paymentCard, CardReplacementType cardReplacementType, List list, List list2, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentCard = cardReplacementConfirmationViewState.card;
        }
        if ((i & 2) != 0) {
            cardReplacementType = cardReplacementConfirmationViewState.replacementType;
        }
        if ((i & 4) != 0) {
            list = cardReplacementConfirmationViewState.cardColorOptions;
        }
        if ((i & 8) != 0) {
            list2 = cardReplacementConfirmationViewState.googlePayTokenList;
        }
        if ((i & 16) != 0) {
            uiEvent = cardReplacementConfirmationViewState.error;
        }
        UiEvent uiEvent2 = uiEvent;
        List list3 = list;
        return cardReplacementConfirmationViewState.copy(paymentCard, cardReplacementType, list3, list2, uiEvent2);
    }

    /* renamed from: component2, reason: from getter */
    public final CardReplacementType getReplacementType() {
        return this.replacementType;
    }

    public final UiEvent<Throwable> component5() {
        return this.error;
    }

    public final CardReplacementConfirmationViewState copy(PaymentCard card, CardReplacementType replacementType, List<ApiCardColorOption> cardColorOptions, List<GooglePayTokenInfoWrapper> googlePayTokenList, UiEvent<Throwable> error) {
        Intrinsics.checkNotNullParameter(replacementType, "replacementType");
        return new CardReplacementConfirmationViewState(card, replacementType, cardColorOptions, googlePayTokenList, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardReplacementConfirmationViewState)) {
            return false;
        }
        CardReplacementConfirmationViewState cardReplacementConfirmationViewState = (CardReplacementConfirmationViewState) other;
        return Intrinsics.areEqual(this.card, cardReplacementConfirmationViewState.card) && this.replacementType == cardReplacementConfirmationViewState.replacementType && Intrinsics.areEqual(this.cardColorOptions, cardReplacementConfirmationViewState.cardColorOptions) && Intrinsics.areEqual(this.googlePayTokenList, cardReplacementConfirmationViewState.googlePayTokenList) && Intrinsics.areEqual(this.error, cardReplacementConfirmationViewState.error);
    }

    public int hashCode() {
        PaymentCard paymentCard = this.card;
        int iHashCode = (((paymentCard == null ? 0 : paymentCard.hashCode()) * 31) + this.replacementType.hashCode()) * 31;
        List<ApiCardColorOption> list = this.cardColorOptions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GooglePayTokenInfoWrapper> list2 = this.googlePayTokenList;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return iHashCode3 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "CardReplacementConfirmationViewState(card=" + this.card + ", replacementType=" + this.replacementType + ", cardColorOptions=" + this.cardColorOptions + ", googlePayTokenList=" + this.googlePayTokenList + ", error=" + this.error + ")";
    }

    public CardReplacementConfirmationViewState(PaymentCard paymentCard, CardReplacementType replacementType, List<ApiCardColorOption> list, List<GooglePayTokenInfoWrapper> list2, UiEvent<Throwable> uiEvent) {
        Intrinsics.checkNotNullParameter(replacementType, "replacementType");
        this.card = paymentCard;
        this.replacementType = replacementType;
        this.cardColorOptions = list;
        this.googlePayTokenList = list2;
        this.error = uiEvent;
    }

    public /* synthetic */ CardReplacementConfirmationViewState(PaymentCard paymentCard, CardReplacementType cardReplacementType, List list, List list2, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentCard, cardReplacementType, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : uiEvent);
    }

    public final CardReplacementType getReplacementType() {
        return this.replacementType;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final int getSubtitleResId() {
        if (getCardArrivalTime() != null && this.replacementType == CardReplacementType.DAMAGED) {
            return C21627R.string.card_replacement_confirmation_damaged_subtitle;
        }
        if (getCardArrivalTime() != null && this.replacementType != CardReplacementType.DAMAGED) {
            return C21627R.string.card_replacement_confirmation_lost_or_stolen_subtitle;
        }
        if (getCardArrivalTime() == null && this.replacementType == CardReplacementType.DAMAGED) {
            return C21627R.string.card_replacement_confirmation_damaged_subtitle_default;
        }
        if (getCardArrivalTime() == null && this.replacementType != CardReplacementType.DAMAGED) {
            return C21627R.string.card_replacement_confirmation_lost_or_stolen_subtitle_default;
        }
        return C21627R.string.card_replacement_confirmation_lost_or_stolen_subtitle_default;
    }

    public final boolean isCardEligibleForGooglePay() {
        List<GooglePayTokenInfoWrapper> list;
        PaymentCard paymentCard = this.card;
        if ((paymentCard != null ? paymentCard.getState() : null) != ApiPaymentCard.State.ACTIVE || !this.card.isVirtual() || (list = this.googlePayTokenList) == null) {
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

    public final String getSubtitle(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (getCardArrivalTime() == null) {
            String string2 = context.getString(getSubtitleResId());
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = context.getString(getSubtitleResId(), getCardArrivalTime());
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public final boolean isLoaded() {
        if (this.card == null) {
            return false;
        }
        List<ApiCardColorOption> list = this.cardColorOptions;
        return ((list == null || list.isEmpty()) && this.error == null) ? false : true;
    }

    public final String getCardArrivalTime() {
        ApiCardColorOption cardColorOption = getCardColorOption();
        if (cardColorOption != null) {
            return cardColorOption.getEstimated_shipping_time();
        }
        return null;
    }

    public final ApiCardColorOption getCardColorOption() {
        List<ApiCardColorOption> list = this.cardColorOptions;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            CardColor color = ((ApiCardColorOption) next).getColor();
            PaymentCard paymentCard = this.card;
            if (color == (paymentCard != null ? paymentCard.getColor() : null) && !this.card.isVirtual()) {
                obj = next;
                break;
            }
        }
        return (ApiCardColorOption) obj;
    }

    public final boolean getShowBackOrderDisclosure() {
        ApiCardColorOption cardColorOption = getCardColorOption();
        return cardColorOption != null && cardColorOption.getIs_backordered();
    }

    public final int getBackOrderDisclosureTextResId() {
        return C21627R.string.card_replacement_confirmation_backorder_delivery_disclosure;
    }

    public final String getBackOrderDisclosureText(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string2 = context.getString(getBackOrderDisclosureTextResId(), getCardArrivalTime());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final int getDisclosureDialogTitleResId() {
        return C21627R.string.card_replacement_confirmation_delivery_dialog_title;
    }

    public final int getDisclosureDialogBodyResId() {
        return C21627R.string.card_replacement_confirmation_delivery_dialog_body;
    }

    public final String getDisclosureDialogBodyText(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string2 = context.getString(getDisclosureDialogBodyResId(), getCardArrivalTime());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public final int getDisclosureDialogButtonTextResId() {
        return C11048R.string.general_label_dismiss;
    }

    public final int getDoneButtonTextResId() {
        if (isCardEligibleForGooglePay()) {
            return C11048R.string.general_label_continue;
        }
        return C11048R.string.general_label_done;
    }
}
