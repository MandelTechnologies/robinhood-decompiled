package com.robinhood.android.rhy.backorder.p242ui;

import android.content.Context;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.rhy.backorder.C27347R;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CardBackorderIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroViewState;", "", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "isFromRhy", "", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;Z)V", "getPaymentCard", "()Lcom/robinhood/models/db/mcduckling/PaymentCard;", "illustration", "", "getIllustration", "()I", "title", "getTitle", "getDescription", "", "context", "Landroid/content/Context;", "primaryAction", "getPrimaryAction", "()Ljava/lang/Integer;", "secondaryAction", "getSecondaryAction", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class CardBackorderIntroViewState {
    private final boolean isFromRhy;
    private final PaymentCard paymentCard;

    public CardBackorderIntroViewState(PaymentCard paymentCard, boolean z) {
        this.paymentCard = paymentCard;
        this.isFromRhy = z;
    }

    public final PaymentCard getPaymentCard() {
        return this.paymentCard;
    }

    public final int getIllustration() {
        return this.isFromRhy ? C11257R.drawable.svg_debit_card_rhy : C11257R.drawable.svg_debit_card;
    }

    public final int getTitle() {
        return C27347R.string.card_backorder_intro_title;
    }

    public final String getDescription(Context context) {
        String string2;
        String estimatedShippingTime;
        String estimatedShippingTime2;
        Intrinsics.checkNotNullParameter(context, "context");
        PaymentCard paymentCard = this.paymentCard;
        if (paymentCard != null && (estimatedShippingTime2 = paymentCard.getEstimatedShippingTime()) != null && (!StringsKt.isBlank(estimatedShippingTime2)) && this.paymentCard.getCanActivate()) {
            string2 = context.getString(C27347R.string.card_backorder_intro_description_activate, this.paymentCard.getEstimatedShippingTime());
        } else {
            PaymentCard paymentCard2 = this.paymentCard;
            if (paymentCard2 != null && (estimatedShippingTime = paymentCard2.getEstimatedShippingTime()) != null && (!StringsKt.isBlank(estimatedShippingTime)) && !this.paymentCard.getCanActivate()) {
                string2 = context.getString(C27347R.string.card_backorder_intro_description_activated_already, this.paymentCard.getEstimatedShippingTime());
            } else {
                string2 = context.getString(C27347R.string.card_backorder_intro_description_default);
            }
        }
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public final Integer getPrimaryAction() {
        PaymentCard paymentCard = this.paymentCard;
        if (paymentCard == null || !paymentCard.getCanActivate()) {
            return null;
        }
        return Integer.valueOf(C27347R.string.card_backorder_intro_primary);
    }

    public final int getSecondaryAction() {
        return C27347R.string.card_backorder_intro_secondary;
    }
}
