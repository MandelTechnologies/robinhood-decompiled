package com.robinhood.android.optionchain.extensions;

import android.content.res.Resources;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.p355ui.UnderlyingQuote;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnderlyingQuoteModelUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getUnderlyingQuoteIndicatorText", "", "Lcom/robinhood/models/ui/UnderlyingQuote;", "resources", "Landroid/content/res/Resources;", "feature-lib-option-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionchain.extensions.UnderlyingQuoteModelUtilKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class UnderlyingQuoteModelUtil {
    public static final String getUnderlyingQuoteIndicatorText(UnderlyingQuote underlyingQuote, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(underlyingQuote, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (underlyingQuote instanceof UnderlyingQuote.EquityQuote) {
            String string2 = resources.getString(C11303R.string.option_order_contract_equity_price, Formats.getPriceFormat().format(underlyingQuote.getCurrentValue()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (!(underlyingQuote instanceof UnderlyingQuote.IndexQuote)) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = resources.getString(C11303R.string.option_order_contract_index_value, Formats.getValueFormat().format(underlyingQuote.getCurrentValue()));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }
}
