package com.robinhood.android.history.p153ui.transfer;

import android.content.res.Resources;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.shared.history.formatters.legacy.transfers.PaymentTransfers6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentTransfers.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"getInstantDisplayTitle", "", "Landroid/content/res/Resources;", "paymentInstrument", "", "paymentTransfer", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.transfer.PaymentTransfersKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PaymentTransfers3 {
    public static final CharSequence getInstantDisplayTitle(Resources resources, Object obj, PaymentTransfer paymentTransfer) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        Intrinsics.checkNotNullParameter(paymentTransfer, "paymentTransfer");
        if (!paymentTransfer.getIsOwner()) {
            return PaymentTransfers6.getNonOwnerExternalAccountDisplayTitle(paymentTransfer).getText(resources);
        }
        if (obj != null) {
            return PaymentInstruments.getDisplayTitle(obj, resources);
        }
        return null;
    }
}
