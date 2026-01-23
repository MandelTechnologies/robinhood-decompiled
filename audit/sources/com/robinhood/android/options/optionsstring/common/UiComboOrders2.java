package com.robinhood.android.options.optionsstring.common;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.common.strings.OrderStates;
import com.robinhood.utils.datetime.format.InstantFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UiComboOrders.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0007"}, m3636d2 = {"getHistoryTitle", "", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "resources", "Landroid/content/res/Resources;", "getHistorySubtitle", "getHistoryDetail", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.optionsstring.common.UiComboOrdersKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiComboOrders2 {
    public static final String getHistoryTitle(UiComboOrder uiComboOrder, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiComboOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C23386R.string.combo_order_history_row_primary_text, uiComboOrder.getInstrument().getSymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getHistorySubtitle(UiComboOrder uiComboOrder) {
        Intrinsics.checkNotNullParameter(uiComboOrder, "<this>");
        return InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) uiComboOrder.getComboOrder().getCreatedAt());
    }

    public static final String getHistoryDetail(UiComboOrder uiComboOrder, Resources resources) {
        Intrinsics.checkNotNullParameter(uiComboOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return !uiComboOrder.getComboOrder().getDerivedState().hasExecutions() ? OrderStates.getOrderStateString(uiComboOrder.getComboOrder().getDerivedState(), resources) : Formats.getCurrencyFormat().format(uiComboOrder.getComboOrder().getProcessedPremium());
    }
}
