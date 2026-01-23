package com.robinhood.android.history.p153ui.transfer;

import android.content.res.Resources;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.debitcard.strings.ApiDebitCardInstruments;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.p320db.AchRelationship;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentInstruments.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getDisplayTitle", "", "", "resources", "Landroid/content/res/Resources;", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.transfer.PaymentInstrumentsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PaymentInstruments {
    public static final CharSequence getDisplayTitle(Object obj, Resources resources) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (obj instanceof AchRelationship) {
            return AchRelationships.getAchRelationshipDisplayNameResource((AchRelationship) obj).getText(resources);
        }
        if (obj instanceof ApiPaymentInstrument) {
            return ApiDebitCardInstruments.getDisplayTitle((ApiPaymentInstrument) obj, resources);
        }
        throw new IllegalStateException("Unsupported payment instrument!");
    }
}
