package com.robinhood.android.mcw.mcwquickconversion;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.util.Money;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.resource.StringResource;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u001c\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00010\u0001*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"FX_RATE_BOTTOM_SHEET_ID", "", "tryShowFxRateBottomSheet", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "buildSuccessMessage", "updatedBalance", "Lcom/robinhood/models/util/Money;", "resources", "Landroid/content/res/Resources;", "buildSuccessMessageRes", "Lcom/robinhood/utils/resource/StringResource;", "toFancyName", "kotlin.jvm.PlatformType", "Ljava/util/Currency;", "feature-lib-mcw-quick-conversion_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UtilsKt {
    private static final String FX_RATE_BOTTOM_SHEET_ID = "exchange_rate_details_bid";

    public static final void tryShowFxRateBottomSheet(Navigator navigator, Context context) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        FragmentManager supportFragmentManager = BaseContexts.requireActivityBaseContext(context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (supportFragmentManager.findFragmentByTag(FX_RATE_BOTTOM_SHEET_ID) != null) {
            return;
        }
        Navigator.DefaultImpls.createDialogFragment$default(navigator, new SduiInfoSheetKey(FX_RATE_BOTTOM_SHEET_ID, FX_RATE_BOTTOM_SHEET_ID, null, null, 12, null), null, 2, null).show(supportFragmentManager, FX_RATE_BOTTOM_SHEET_ID);
    }

    public static final String buildSuccessMessage(Money updatedBalance, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(updatedBalance, "updatedBalance");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(C21790R.string.confirmation_message, toFancyName(updatedBalance.getCurrency(), resources), Money.format$default(updatedBalance, null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final StringResource buildSuccessMessageRes(Money updatedBalance, Resources resources) {
        Intrinsics.checkNotNullParameter(updatedBalance, "updatedBalance");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return StringResource.INSTANCE.invoke(C21790R.string.confirmation_message, toFancyName(updatedBalance.getCurrency(), resources), Money.format$default(updatedBalance, null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null));
    }

    private static final String toFancyName(Currency currency, Resources resources) {
        return Intrinsics.areEqual(currency, Currencies.USD) ? resources.getString(C21790R.string.usd_display_name) : Intrinsics.areEqual(currency, Currencies.SGD) ? resources.getString(C21790R.string.sgd_display_name) : Intrinsics.areEqual(currency, Currencies.GBP) ? resources.getString(C21790R.string.gbp_display_name) : currency.getCurrencyCode();
    }
}
