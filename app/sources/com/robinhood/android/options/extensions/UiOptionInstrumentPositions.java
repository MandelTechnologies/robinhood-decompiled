package com.robinhood.android.options.extensions;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiOptionInstrumentPositions.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m3636d2 = {"getTodaysReturnString", "", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "resources", "Landroid/content/res/Resources;", "optionQuote", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "getTotalReturnString", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.extensions.UiOptionInstrumentPositionsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiOptionInstrumentPositions {
    public static final String getTodaysReturnString(UiOptionInstrumentPosition uiOptionInstrumentPosition, Resources resources, OptionInstrumentQuote optionQuote) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionInstrumentPosition, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(optionQuote, "optionQuote");
        String string2 = resources.getString(C11048R.string.general_number_and_percent_change_format, Formats.getCurrencyDeltaFormat().format(uiOptionInstrumentPosition.getTodaysReturnAmount(optionQuote)), Formats.getPercentDeltaFormat().format(uiOptionInstrumentPosition.getTodaysReturnPercentage(optionQuote)));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getTotalReturnString(UiOptionInstrumentPosition uiOptionInstrumentPosition, Resources resources, OptionInstrumentQuote optionQuote) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionInstrumentPosition, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(optionQuote, "optionQuote");
        String string2 = resources.getString(C11048R.string.general_number_and_percent_change_format, Formats.getCurrencyDeltaFormat().format(uiOptionInstrumentPosition.getTotalReturnAmount(optionQuote)), Formats.getPercentDeltaFormat().format(uiOptionInstrumentPosition.getTotalReturnPercentage(optionQuote)));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
