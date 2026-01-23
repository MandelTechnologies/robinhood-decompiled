package com.robinhood.android.widget.p277ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchlistViewsActivity.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WatchlistViewsActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_INTENT = "extraIntent";

    @JvmStatic
    public static final void bindStartIntent(Intent intent, Intent intent2) {
        INSTANCE.bindStartIntent(intent, intent2);
    }

    @JvmStatic
    public static final Intent getIntent(Context context) {
        return INSTANCE.getIntent(context);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Intent intentCreateIntent$default;
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (intentCreateIntent$default = (Intent) extras.getParcelable(EXTRA_INTENT)) == null) {
            intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new WatchListIntentKey(WatchListIntentKey2.WATCHLIST), null, false, 12, null);
        }
        intentCreateIntent$default.addFlags(131072);
        startActivity(intentCreateIntent$default);
        finish();
    }

    /* compiled from: WatchlistViewsActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/WatchlistViewsActivity$Companion;", "", "<init>", "()V", "EXTRA_INTENT", "", "getIntent", "Landroid/content/Intent;", "caller", "Landroid/content/Context;", "bindStartIntent", "", "intent", "startIntent", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent getIntent(Context caller) {
            Intrinsics.checkNotNullParameter(caller, "caller");
            return new Intent(caller, (Class<?>) WatchlistViewsActivity.class);
        }

        @JvmStatic
        public final void bindStartIntent(Intent intent, Intent startIntent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(startIntent, "startIntent");
            intent.putExtra(WatchlistViewsActivity.EXTRA_INTENT, startIntent);
        }
    }
}
