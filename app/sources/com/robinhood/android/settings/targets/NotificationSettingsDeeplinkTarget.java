package com.robinhood.android.settings.targets;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettingsDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/targets/NotificationSettingsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NotificationSettingsDeeplinkTarget extends DeeplinkTarget4 {
    public static final NotificationSettingsDeeplinkTarget INSTANCE = new NotificationSettingsDeeplinkTarget();
    public static final int $stable = 8;

    private NotificationSettingsDeeplinkTarget() {
        super("notification_settings", false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("sub_page");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("item_id");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("is_standalone");
        boolean z = queryParameter3 != null ? Boolean.parseBoolean(queryParameter3) : false;
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        SettingsFragmentKey3 settingsFragmentKey3 = SettingsFragmentKey3.LAUNCH_NOTIFICATION_SETTINGS;
        if (queryParameter == null) {
            queryParameter = "";
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new SettingsFragmentKey(settingsFragmentKey3, false, false, false, queryParameter, queryParameter2, null, null, false, 462, null), false, !z, false, null, false, z, false, false, false, null, false, 8052, null)};
    }
}
