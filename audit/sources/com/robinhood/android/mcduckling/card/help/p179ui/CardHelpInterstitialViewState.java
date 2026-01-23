package com.robinhood.android.mcduckling.card.help.p179ui;

import android.content.Context;
import com.robinhood.android.mcduckling.card.help.C21627R;
import com.robinhood.models.api.mcduckling.CardColor;
import com.robinhood.models.api.minerva.ApiCardColorOption;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.udf.UiEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardHelpInterstitialViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001GB?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0010\u0010)\u001a\u00020*2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u00105\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000e\u0010=\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÂ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JC\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010C\u001a\u00020\u00192\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0013HÖ\u0001J\t\u0010F\u001a\u00020*HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u001f\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0011\u0010!\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0015R\u0011\u0010'\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0011\u0010+\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b,\u0010\u0015R\u0013\u0010-\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u0010\u0015R\u0011\u00106\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b7\u0010\u0015R\u0011\u00108\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b9\u0010\u0015R\u0011\u0010:\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b;\u0010\u0015R\u0011\u0010<\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b<\u0010\u001a¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialViewState;", "", "card", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "replacementType", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "cardColorOptions", "", "Lcom/robinhood/models/api/minerva/ApiCardColorOption;", "error", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;Ljava/util/List;Lcom/robinhood/udf/UiEvent;)V", "getReplacementType", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "getError", "()Lcom/robinhood/udf/UiEvent;", "headerIconResId", "", "getHeaderIconResId", "()I", "headerTextResId", "getHeaderTextResId", "isLoaded", "", "()Z", "showCancellationText", "getShowCancellationText", "cancellationTitleResId", "getCancellationTitleResId", "cancellationSubtitleResId", "getCancellationSubtitleResId", "cancellationPogNumber", "getCancellationPogNumber", "getCancellationRowInfo", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialViewState$CardHelpInterstitialRowInfo;", "context", "Landroid/content/Context;", "mailingTitleResId", "getMailingTitleResId", "getMailingSubtitle", "", "mailingSubtitleResId", "getMailingSubtitleResId", "cardArrivalTime", "getCardArrivalTime", "()Ljava/lang/String;", "cardColorOption", "getCardColorOption", "()Lcom/robinhood/models/api/minerva/ApiCardColorOption;", "mailingPogNumber", "getMailingPogNumber", "getMailingRowInfo", "newCardTitleResId", "getNewCardTitleResId", "newCardSubtitleResId", "getNewCardSubtitleResId", "newCardPogNumber", "getNewCardPogNumber", "isStolenVirtualReplacementType", "getNewCardRowInfo", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "CardHelpInterstitialRowInfo", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class CardHelpInterstitialViewState {
    public static final int $stable = 8;
    private final PaymentCard card;
    private final List<ApiCardColorOption> cardColorOptions;
    private final UiEvent<Throwable> error;
    private final CardReplacementType replacementType;

    /* compiled from: CardHelpInterstitialViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardReplacementType.values().length];
            try {
                iArr[CardReplacementType.LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardReplacementType.STOLEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardReplacementType.STOLEN_VIRTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardReplacementType.UNAUTHORIZED_TRANSACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardReplacementType.DAMAGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardReplacementType.VIRTUAL_TO_PHYSICAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final PaymentCard getCard() {
        return this.card;
    }

    private final List<ApiCardColorOption> component3() {
        return this.cardColorOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardHelpInterstitialViewState copy$default(CardHelpInterstitialViewState cardHelpInterstitialViewState, PaymentCard paymentCard, CardReplacementType cardReplacementType, List list, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentCard = cardHelpInterstitialViewState.card;
        }
        if ((i & 2) != 0) {
            cardReplacementType = cardHelpInterstitialViewState.replacementType;
        }
        if ((i & 4) != 0) {
            list = cardHelpInterstitialViewState.cardColorOptions;
        }
        if ((i & 8) != 0) {
            uiEvent = cardHelpInterstitialViewState.error;
        }
        return cardHelpInterstitialViewState.copy(paymentCard, cardReplacementType, list, uiEvent);
    }

    /* renamed from: component2, reason: from getter */
    public final CardReplacementType getReplacementType() {
        return this.replacementType;
    }

    public final UiEvent<Throwable> component4() {
        return this.error;
    }

    public final CardHelpInterstitialViewState copy(PaymentCard card, CardReplacementType replacementType, List<ApiCardColorOption> cardColorOptions, UiEvent<Throwable> error) {
        Intrinsics.checkNotNullParameter(replacementType, "replacementType");
        return new CardHelpInterstitialViewState(card, replacementType, cardColorOptions, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardHelpInterstitialViewState)) {
            return false;
        }
        CardHelpInterstitialViewState cardHelpInterstitialViewState = (CardHelpInterstitialViewState) other;
        return Intrinsics.areEqual(this.card, cardHelpInterstitialViewState.card) && this.replacementType == cardHelpInterstitialViewState.replacementType && Intrinsics.areEqual(this.cardColorOptions, cardHelpInterstitialViewState.cardColorOptions) && Intrinsics.areEqual(this.error, cardHelpInterstitialViewState.error);
    }

    public final int getCancellationPogNumber() {
        return 1;
    }

    public int hashCode() {
        PaymentCard paymentCard = this.card;
        int iHashCode = (((paymentCard == null ? 0 : paymentCard.hashCode()) * 31) + this.replacementType.hashCode()) * 31;
        List<ApiCardColorOption> list = this.cardColorOptions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "CardHelpInterstitialViewState(card=" + this.card + ", replacementType=" + this.replacementType + ", cardColorOptions=" + this.cardColorOptions + ", error=" + this.error + ")";
    }

    public CardHelpInterstitialViewState(PaymentCard paymentCard, CardReplacementType replacementType, List<ApiCardColorOption> list, UiEvent<Throwable> uiEvent) {
        Intrinsics.checkNotNullParameter(replacementType, "replacementType");
        this.card = paymentCard;
        this.replacementType = replacementType;
        this.cardColorOptions = list;
        this.error = uiEvent;
    }

    public /* synthetic */ CardHelpInterstitialViewState(PaymentCard paymentCard, CardReplacementType cardReplacementType, List list, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentCard, cardReplacementType, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : uiEvent);
    }

    public final CardReplacementType getReplacementType() {
        return this.replacementType;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final int getHeaderIconResId() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.replacementType.ordinal()]) {
            case 1:
                return C21627R.drawable.svg_debit_card_help_interstitial_lost;
            case 2:
                return C21627R.drawable.svg_debit_card_help_interstitial_stolen;
            case 3:
                return C21627R.drawable.svg_debit_card_help_interstitial_stolen;
            case 4:
                return C21627R.drawable.svg_debit_card_help_interstitial_stolen;
            case 5:
                return C21627R.drawable.svg_debit_card_help_interstitial_damaged;
            case 6:
                throw new IllegalStateException("Virtual to physical isn't part of card help flow");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getHeaderTextResId() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.replacementType.ordinal()]) {
            case 1:
                return C21627R.string.card_help_interstitial_title_keep_account_safe;
            case 2:
                return C21627R.string.card_help_interstitial_title_keep_account_safe;
            case 3:
                return C21627R.string.card_help_interstitial_title_keep_account_safe;
            case 4:
                return C21627R.string.card_help_interstitial_title_keep_account_safe;
            case 5:
                return C21627R.string.card_help_interstitial_title_get_new_card;
            case 6:
                throw new IllegalStateException("Virtual to physical isn't part of card help flow");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLoaded() {
        if (this.card == null) {
            return false;
        }
        List<ApiCardColorOption> list = this.cardColorOptions;
        return ((list == null || list.isEmpty()) && this.error == null) ? false : true;
    }

    public final boolean getShowCancellationText() {
        return this.replacementType != CardReplacementType.DAMAGED;
    }

    public final int getCancellationTitleResId() {
        if (this.replacementType == CardReplacementType.UNAUTHORIZED_TRANSACTION) {
            return C21627R.string.card_help_interstitial_already_canceled_card_title;
        }
        return C21627R.string.card_help_interstitial_cancel_card_title;
    }

    public final int getCancellationSubtitleResId() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.replacementType.ordinal()]) {
            case 1:
                return C21627R.string.card_help_interstitial_cancel_lost_card_subtitle;
            case 2:
                return C21627R.string.card_help_interstitial_cancel_stolen_card_subtitle;
            case 3:
                return C21627R.string.card_help_interstitial_cancel_stolen_card_subtitle;
            case 4:
                return C21627R.string.card_help_interstitial_cancel_unauthorized_card_subtitle;
            case 5:
                return C21627R.string.card_help_interstitial_cancel_lost_card_subtitle;
            case 6:
                throw new IllegalStateException("Virtual to physical isn't part of card help flow");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final CardHelpInterstitialRowInfo getCancellationRowInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean showCancellationText = getShowCancellationText();
        int cancellationPogNumber = getCancellationPogNumber();
        String string2 = context.getString(getCancellationTitleResId());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = context.getString(getCancellationSubtitleResId());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new CardHelpInterstitialRowInfo(showCancellationText, cancellationPogNumber, string2, string3);
    }

    public final int getMailingTitleResId() {
        if (this.replacementType == CardReplacementType.UNAUTHORIZED_TRANSACTION) {
            return C21627R.string.card_help_interstitial_mail_free_card_title;
        }
        return C21627R.string.card_help_interstitial_mail_card_title;
    }

    private final String getMailingSubtitle(Context context) {
        if (getCardArrivalTime() == null) {
            String string2 = context.getString(getMailingSubtitleResId());
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = context.getString(getMailingSubtitleResId(), getCardArrivalTime());
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    public final int getMailingSubtitleResId() {
        if (getCardArrivalTime() == null) {
            return C21627R.string.card_help_interstitial_mail_card_subtitle_default;
        }
        ApiCardColorOption cardColorOption = getCardColorOption();
        return (cardColorOption == null || !cardColorOption.getIs_backordered()) ? C21627R.string.card_help_interstitial_mail_card_subtitle : C21627R.string.card_help_interstitial_mail_card_backorder_subtitle;
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

    public final int getMailingPogNumber() {
        return getShowCancellationText() ? 2 : 1;
    }

    public final CardHelpInterstitialRowInfo getMailingRowInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int mailingPogNumber = getMailingPogNumber();
        String string2 = context.getString(getMailingTitleResId());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new CardHelpInterstitialRowInfo(true, mailingPogNumber, string2, getMailingSubtitle(context));
    }

    public final int getNewCardTitleResId() {
        if (this.replacementType == CardReplacementType.DAMAGED) {
            return C21627R.string.card_help_interstitial_continue_virtual_card_title;
        }
        return C21627R.string.card_help_interstitial_new_virtual_card_title;
    }

    public final int getNewCardSubtitleResId() {
        if (this.replacementType == CardReplacementType.DAMAGED) {
            return C21627R.string.card_help_interstitial_continue_virtual_card_subtitle;
        }
        return C21627R.string.card_help_interstitial_new_virtual_card_subtitle;
    }

    public final int getNewCardPogNumber() {
        return getShowCancellationText() ? 3 : 2;
    }

    public final boolean isStolenVirtualReplacementType() {
        return this.replacementType == CardReplacementType.STOLEN_VIRTUAL;
    }

    public final CardHelpInterstitialRowInfo getNewCardRowInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int newCardPogNumber = getNewCardPogNumber();
        String string2 = context.getString(getNewCardTitleResId());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = context.getString(getNewCardSubtitleResId());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new CardHelpInterstitialRowInfo(true, newCardPogNumber, string2, string3);
    }

    /* compiled from: CardHelpInterstitialViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialViewState$CardHelpInterstitialRowInfo;", "", "isVisible", "", "pogNumber", "", "titleText", "", "subtitleText", "<init>", "(ZILjava/lang/String;Ljava/lang/String;)V", "()Z", "getPogNumber", "()I", "getTitleText", "()Ljava/lang/String;", "getSubtitleText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CardHelpInterstitialRowInfo {
        public static final int $stable = 0;
        private final boolean isVisible;
        private final int pogNumber;
        private final String subtitleText;
        private final String titleText;

        public static /* synthetic */ CardHelpInterstitialRowInfo copy$default(CardHelpInterstitialRowInfo cardHelpInterstitialRowInfo, boolean z, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = cardHelpInterstitialRowInfo.isVisible;
            }
            if ((i2 & 2) != 0) {
                i = cardHelpInterstitialRowInfo.pogNumber;
            }
            if ((i2 & 4) != 0) {
                str = cardHelpInterstitialRowInfo.titleText;
            }
            if ((i2 & 8) != 0) {
                str2 = cardHelpInterstitialRowInfo.subtitleText;
            }
            return cardHelpInterstitialRowInfo.copy(z, i, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPogNumber() {
            return this.pogNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitleText() {
            return this.titleText;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitleText() {
            return this.subtitleText;
        }

        public final CardHelpInterstitialRowInfo copy(boolean isVisible, int pogNumber, String titleText, String subtitleText) {
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
            return new CardHelpInterstitialRowInfo(isVisible, pogNumber, titleText, subtitleText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardHelpInterstitialRowInfo)) {
                return false;
            }
            CardHelpInterstitialRowInfo cardHelpInterstitialRowInfo = (CardHelpInterstitialRowInfo) other;
            return this.isVisible == cardHelpInterstitialRowInfo.isVisible && this.pogNumber == cardHelpInterstitialRowInfo.pogNumber && Intrinsics.areEqual(this.titleText, cardHelpInterstitialRowInfo.titleText) && Intrinsics.areEqual(this.subtitleText, cardHelpInterstitialRowInfo.subtitleText);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isVisible) * 31) + Integer.hashCode(this.pogNumber)) * 31) + this.titleText.hashCode()) * 31) + this.subtitleText.hashCode();
        }

        public String toString() {
            return "CardHelpInterstitialRowInfo(isVisible=" + this.isVisible + ", pogNumber=" + this.pogNumber + ", titleText=" + this.titleText + ", subtitleText=" + this.subtitleText + ")";
        }

        public CardHelpInterstitialRowInfo(boolean z, int i, String titleText, String subtitleText) {
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
            this.isVisible = z;
            this.pogNumber = i;
            this.titleText = titleText;
            this.subtitleText = subtitleText;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }

        public final int getPogNumber() {
            return this.pogNumber;
        }

        public final String getTitleText() {
            return this.titleText;
        }

        public final String getSubtitleText() {
            return this.subtitleText;
        }
    }
}
