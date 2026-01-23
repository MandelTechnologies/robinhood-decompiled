package com.robinhood.android.options.optionsstring.common;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.common.strings.UiOptionOrders3;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionLegBundles.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"getShoppingCartSubtitle", "", "Lcom/robinhood/models/ui/OptionLegBundle;", "resources", "Landroid/content/res/Resources;", "settleOnOpen", "", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.common.OptionLegBundlesKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionLegBundles {
    public static final String getShoppingCartSubtitle(OptionLegBundle optionLegBundle, Resources resources, boolean z) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(optionLegBundle, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String sideString = UiOptionOrders3.getSideString(resources, optionLegBundle.getOptionConfigurationBundle().getOptionSide());
        String recent = LocalDates4.formatRecent(optionLegBundle.getOptionInstrument().getExpirationDate(), resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER(), (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false);
        if (z) {
            i = C23386R.string.option_chain_shopping_cart_row_subtitle_am;
        } else {
            i = C23386R.string.option_chain_shopping_cart_row_subtitle;
        }
        String string2 = resources.getString(i, recent, sideString);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
