package com.robinhood.android.directdeposit.p101ui.prefilled.partial.input;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.p355ui.DirectDepositAmount;
import com.robinhood.utils.math.BigDecimals7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreFilledFormAmountInputState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toFormattedCharArray", "", "Lcom/robinhood/models/ui/DirectDepositAmount$PartialPaycheck;", "feature-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.prefilled.partial.input.PreFilledFormAmountInputStateKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class PreFilledFormAmountInputState2 {
    public static final char[] toFormattedCharArray(DirectDepositAmount.PartialPaycheck partialPaycheck) {
        String str;
        NumberFormatter amountFormat;
        Intrinsics.checkNotNullParameter(partialPaycheck, "<this>");
        if (partialPaycheck instanceof DirectDepositAmount.PartialPaycheck.Dollars) {
            DirectDepositAmount.PartialPaycheck.Dollars dollars = (DirectDepositAmount.PartialPaycheck.Dollars) partialPaycheck;
            if (BigDecimals7.isInteger(dollars.getAmount())) {
                amountFormat = Formats.getWholeNumberAmountFormat();
            } else {
                amountFormat = Formats.getAmountFormat();
            }
            str = amountFormat.format(dollars.getAmount());
        } else {
            if (!(partialPaycheck instanceof DirectDepositAmount.PartialPaycheck.Percent)) {
                throw new NoWhenBranchMatchedException();
            }
            str = Formats.getWholeNumberPercentFormat().format(Float.valueOf(((DirectDepositAmount.PartialPaycheck.Percent) partialPaycheck).getPercent() / 100.0f));
        }
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return charArray;
    }
}
