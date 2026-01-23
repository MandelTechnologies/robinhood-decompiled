package com.robinhood.android.options.optionsstring.orderform;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.models.api.ApiOptionsDisplayedBuyingPower;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDisplayedBuyingPowerStrings.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toDisplayedBuyingPowerString", "", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPower;", "resources", "Landroid/content/res/Resources;", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.orderform.OptionsDisplayedBuyingPowerStringsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDisplayedBuyingPowerStrings {
    public static final String toDisplayedBuyingPowerString(ApiOptionsDisplayedBuyingPower apiOptionsDisplayedBuyingPower, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(apiOptionsDisplayedBuyingPower, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (apiOptionsDisplayedBuyingPower instanceof ApiOptionsDisplayedBuyingPower.BuyingPower) {
            String string2 = resources.getString(C23386R.string.option_order_available_cash, Formats.getPriceFormat().format(((ApiOptionsDisplayedBuyingPower.BuyingPower) apiOptionsDisplayedBuyingPower).getBuying_power().getDecimalValue()));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (apiOptionsDisplayedBuyingPower instanceof ApiOptionsDisplayedBuyingPower.NumOfShares) {
            ApiOptionsDisplayedBuyingPower.NumOfShares numOfShares = (ApiOptionsDisplayedBuyingPower.NumOfShares) apiOptionsDisplayedBuyingPower;
            return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(resources, C23386R.plurals.option_order_available_number_of_shares, numOfShares.getNum_of_shares(), Formats.getShareQuantityFormat().format(numOfShares.getNum_of_shares()));
        }
        if (!(apiOptionsDisplayedBuyingPower instanceof ApiOptionsDisplayedBuyingPower.NumOfContracts)) {
            throw new NoWhenBranchMatchedException();
        }
        ApiOptionsDisplayedBuyingPower.NumOfContracts numOfContracts = (ApiOptionsDisplayedBuyingPower.NumOfContracts) apiOptionsDisplayedBuyingPower;
        return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(resources, C23386R.plurals.option_order_available_number_of_contracts, numOfContracts.getNum_of_contracts(), Formats.getShareQuantityFormat().format(numOfContracts.getNum_of_contracts()));
    }
}
