package com.robinhood.android.directdeposit.p101ui.prefilled.partial;

import android.content.res.Resources;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.models.p355ui.DirectDepositAmount;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getText", "", "Lcom/robinhood/models/ui/DirectDepositAmount;", "resources", "Landroid/content/res/Resources;", "feature-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class ExtensionsKt {
    public static final String getText(DirectDepositAmount directDepositAmount, Resources resources) {
        Intrinsics.checkNotNullParameter(directDepositAmount, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (directDepositAmount instanceof DirectDepositAmount.PartialPaycheck.Dollars) {
            return resources.getString(C14044R.string.direct_deposit_amount_partial_dollars, ((DirectDepositAmount.PartialPaycheck.Dollars) directDepositAmount).getAmount());
        }
        if (directDepositAmount instanceof DirectDepositAmount.PartialPaycheck.Percent) {
            return resources.getString(C14044R.string.direct_deposit_amount_partial_percent, Integer.valueOf(((DirectDepositAmount.PartialPaycheck.Percent) directDepositAmount).getPercent()));
        }
        if (Intrinsics.areEqual(directDepositAmount, DirectDepositAmount.EntirePaycheck.INSTANCE)) {
            return resources.getString(C14044R.string.direct_deposit_amount_entire_paycheck);
        }
        if (Intrinsics.areEqual(directDepositAmount, DirectDepositAmount.Unsupported.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
