package com.robinhood.android.mcduckling.card.help.p179ui;

import com.robinhood.android.mcduckling.card.help.C21627R;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardHelpIntroViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0011HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\bR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroViewState;", "", "card", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;)V", "isVirtual", "", "()Z", "cardId", "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "isReportDamagedVisible", "isReportLostVisible", "isReportStolenVisible", "subHeaderTextResId", "", "getSubHeaderTextResId", "()I", "stolenType", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "getStolenType", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "component1", "copy", "equals", "other", "hashCode", "toString", "", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CardHelpIntroViewState {
    public static final int $stable = 8;
    private final PaymentCard card;

    /* JADX WARN: Multi-variable type inference failed */
    public CardHelpIntroViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final PaymentCard getCard() {
        return this.card;
    }

    public static /* synthetic */ CardHelpIntroViewState copy$default(CardHelpIntroViewState cardHelpIntroViewState, PaymentCard paymentCard, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentCard = cardHelpIntroViewState.card;
        }
        return cardHelpIntroViewState.copy(paymentCard);
    }

    public final CardHelpIntroViewState copy(PaymentCard card) {
        return new CardHelpIntroViewState(card);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CardHelpIntroViewState) && Intrinsics.areEqual(this.card, ((CardHelpIntroViewState) other).card);
    }

    public int hashCode() {
        PaymentCard paymentCard = this.card;
        if (paymentCard == null) {
            return 0;
        }
        return paymentCard.hashCode();
    }

    public String toString() {
        return "CardHelpIntroViewState(card=" + this.card + ")";
    }

    public CardHelpIntroViewState(PaymentCard paymentCard) {
        this.card = paymentCard;
    }

    public /* synthetic */ CardHelpIntroViewState(PaymentCard paymentCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentCard);
    }

    private final boolean isVirtual() {
        PaymentCard paymentCard = this.card;
        return paymentCard != null && paymentCard.isVirtual();
    }

    public final UUID getCardId() {
        PaymentCard paymentCard = this.card;
        Intrinsics.checkNotNull(paymentCard);
        return paymentCard.getId();
    }

    public final boolean isReportDamagedVisible() {
        PaymentCard paymentCard = this.card;
        return paymentCard != null && paymentCard.getCanReportDamaged();
    }

    public final boolean isReportLostVisible() {
        PaymentCard paymentCard = this.card;
        return paymentCard != null && paymentCard.getCanReportLost();
    }

    public final boolean isReportStolenVisible() {
        PaymentCard paymentCard = this.card;
        return paymentCard != null && paymentCard.getCanReportStolen();
    }

    public final int getSubHeaderTextResId() {
        return isVirtual() ? C21627R.string.card_help_subheader_virtual : C21627R.string.card_help_subheader;
    }

    public final CardReplacementType getStolenType() {
        return isVirtual() ? CardReplacementType.STOLEN_VIRTUAL : CardReplacementType.STOLEN;
    }
}
