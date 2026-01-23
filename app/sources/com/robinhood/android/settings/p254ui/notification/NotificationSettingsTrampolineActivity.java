package com.robinhood.android.settings.p254ui.notification;

import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* compiled from: NotificationSettingsTrampolineActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/NotificationSettingsTrampolineActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NotificationSettingsTrampolineActivity extends BaseActivity {
    public static final int $stable = BaseActivity.$stable;

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Set<String> categories = getIntent().getCategories();
        if (categories == null) {
            categories = SetsKt.emptySet();
        }
        if (categories.contains("android.intent.category.NOTIFICATION_PREFERENCES")) {
            boolean z = true;
            FragmentTab fragmentTab = null;
            Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new HostIntentKey.ShowFragmentInTab(new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_NOTIFICATION_SETTINGS, false, false, false, null, null, null, null, false, 510, null), z, false, fragmentTab, 12, null), null, false, 12, null);
            intentCreateIntent$default.addFlags(335544320);
            startActivity(intentCreateIntent$default);
        }
        finish();
    }
}
