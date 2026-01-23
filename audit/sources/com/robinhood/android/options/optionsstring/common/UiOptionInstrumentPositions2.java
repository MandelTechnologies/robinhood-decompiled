package com.robinhood.android.options.optionsstring.common;

import android.content.res.Resources;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiOptionInstrumentPositions.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0007"}, m3636d2 = {"getSubtitleString", "", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "resources", "Landroid/content/res/Resources;", "getExpirationDateString", "", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.common.UiOptionInstrumentPositionsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiOptionInstrumentPositions2 {
    public static final CharSequence getSubtitleString(UiOptionInstrumentPosition uiOptionInstrumentPosition, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionInstrumentPosition, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C23386R.string.option_position_instrument_detail_row_subtitle, OptionInstrumentDetails2.getExpirationStringShort(resources, uiOptionInstrumentPosition.getExpirationDateRange(), uiOptionInstrumentPosition.getOptionChain().getSettleOnOpen()), OptionInstrumentDetails2.getQuantityAndSideString$default(resources, uiOptionInstrumentPosition.getOptionInstrumentPosition().getDisplayQuantity(), uiOptionInstrumentPosition.getStrategy(), null, null, 24, null));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getExpirationDateString(UiOptionInstrumentPosition uiOptionInstrumentPosition, Resources resources) {
        Intrinsics.checkNotNullParameter(uiOptionInstrumentPosition, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return OptionInstrumentDetails2.getExpirationStringWithoutExp(resources, uiOptionInstrumentPosition.getExpirationDateRange(), uiOptionInstrumentPosition.getOptionChain().getSettleOnOpen());
    }
}
