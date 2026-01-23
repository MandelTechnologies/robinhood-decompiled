package com.robinhood.shared.support.help;

import android.content.Context;
import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.support.contracts.HelpCenterWebViewFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/support/help/HelpCenterDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-help-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class HelpCenterDeeplinkTarget extends DeeplinkTarget4 {
    public static final HelpCenterDeeplinkTarget INSTANCE = new HelpCenterDeeplinkTarget();
    public static final int $stable = 8;

    private HelpCenterDeeplinkTarget() {
        super(AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_HELP_CENTER, false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        String string2;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("article");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        if (queryParameter == null) {
            string2 = deeplinkContext.getContext().getString(C11048R.string.url_help_center);
        } else {
            string2 = deeplinkContext.getContext().getString(C11048R.string.url_help_center_article, queryParameter);
        }
        Intrinsics.checkNotNull(string2);
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new HelpCenterWebViewFragmentKey(string2), false, false, false, null, false, true, false, true, false, null, false, 6260, null)};
    }
}
