package com.robinhood.shared.history.formatters.legacy.rhy;

import android.content.res.Resources;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.shared.history.formatters.legacy.transfers.PaymentTransfers6;
import com.robinhood.shared.models.history.InstantBankTransferTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantBankTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"getDisplayTitle", "", "Lcom/robinhood/shared/models/history/InstantBankTransferTransaction;", "resources", "Landroid/content/res/Resources;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.formatters.legacy.rhy.InstantBankTransferFormatterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InstantBankTransferFormatter2 {
    public static final String getDisplayTitle(InstantBankTransferTransaction instantBankTransferTransaction, Resources resources) {
        String displayTitle;
        Intrinsics.checkNotNullParameter(instantBankTransferTransaction, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (instantBankTransferTransaction.getEvent().getIsOwner()) {
            AchRelationship achRelationship = instantBankTransferTransaction.getAchRelationship();
            return (achRelationship == null || (displayTitle = AchRelationships.getDisplayTitle(achRelationship, resources)) == null) ? "" : displayTitle;
        }
        return PaymentTransfers6.getNonOwnerExternalAccountDisplayTitle(instantBankTransferTransaction.getEvent()).getText(resources).toString();
    }
}
