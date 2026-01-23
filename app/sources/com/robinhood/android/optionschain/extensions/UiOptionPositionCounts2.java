package com.robinhood.android.optionschain.extensions;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiOptionPositionCounts.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getPositionCountDeltaString", "", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "resources", "Landroid/content/res/Resources;", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.extensions.UiOptionPositionCountsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiOptionPositionCounts2 {
    public static final String getPositionCountDeltaString(UiOptionPositionCounts uiOptionPositionCounts, Resources resources) {
        Intrinsics.checkNotNullParameter(uiOptionPositionCounts, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int longQuantity = uiOptionPositionCounts.getLongQuantity();
        int shortQuantity = uiOptionPositionCounts.getShortQuantity();
        if (longQuantity > 0 && shortQuantity == 0) {
            return Formats.getIntegerDeltaFormat().format(Integer.valueOf(longQuantity));
        }
        if (longQuantity == 0 && shortQuantity > 0) {
            return Formats.getIntegerDeltaFormat().format(Integer.valueOf(-shortQuantity));
        }
        String string2 = resources.getString(C24135R.string.option_order_contract_position_count_double_txt, Formats.getIntegerDeltaFormat().format(Integer.valueOf(longQuantity)), Formats.getIntegerDeltaFormat().format(Integer.valueOf(shortQuantity)));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
