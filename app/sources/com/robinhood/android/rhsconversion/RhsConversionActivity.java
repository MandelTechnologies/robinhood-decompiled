package com.robinhood.android.rhsconversion;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.rhsconversion.RhsConversionSplashFragment;
import com.robinhood.utils.extensions.Activity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhsConversionActivity.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/rhsconversion/RhsConversionSplashFragment$Callbacks;", "<init>", "()V", RhsConversionActivity.EXTRA_SKIP_SPLASH_SCREEN, "", "getSkipSplashScreen", "()Z", "skipSplashScreen$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onContinueClicked", "Companion", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhsConversionActivity extends BaseActivity implements RhsConversionSplashFragment.Callbacks {
    private static final String EXTRA_SKIP_SPLASH_SCREEN = "skipSplashScreen";

    /* renamed from: skipSplashScreen$delegate, reason: from kotlin metadata */
    private final Lazy skipSplashScreen;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final void start(Context context, boolean z) {
        INSTANCE.start(context, z);
    }

    public RhsConversionActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.skipSplashScreen = Activity.intentExtra(this, EXTRA_SKIP_SPLASH_SCREEN);
    }

    private final boolean getSkipSplashScreen() {
        return ((Boolean) this.skipSplashScreen.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Fragment fragmentNewInstance;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            if (getSkipSplashScreen()) {
                fragmentNewInstance = RhsConversionDisclosuresFragment.INSTANCE.newInstance();
            } else {
                fragmentNewInstance = RhsConversionSplashFragment.INSTANCE.newInstance();
            }
            setFragment(C11048R.id.fragment_container, fragmentNewInstance);
        }
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setUseDesignSystemTheme(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.rhsconversion.RhsConversionSplashFragment.Callbacks
    public void onContinueClicked() {
        replaceFragment(RhsConversionDisclosuresFragment.INSTANCE.newInstance());
    }

    /* compiled from: RhsConversionActivity.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhsConversion;", "<init>", "()V", "EXTRA_SKIP_SPLASH_SCREEN", "", "start", "", "caller", "Landroid/content/Context;", RhsConversionActivity.EXTRA_SKIP_SPLASH_SCREEN, "", "getIntent", "Landroid/content/Intent;", "context", "key", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.RhsConversion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            companion.start(context, z);
        }

        @JvmStatic
        public final void start(Context caller, boolean skipSplashScreen) {
            Intrinsics.checkNotNullParameter(caller, "caller");
            caller.startActivity(getIntent(caller, skipSplashScreen));
        }

        public static /* synthetic */ Intent getIntent$default(Companion companion, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.getIntent(context, z);
        }

        public final Intent getIntent(Context caller, boolean skipSplashScreen) {
            Intrinsics.checkNotNullParameter(caller, "caller");
            Intent intent = new Intent(caller, (Class<?>) RhsConversionActivity.class);
            intent.putExtra(RhsConversionActivity.EXTRA_SKIP_SPLASH_SCREEN, skipSplashScreen);
            return intent;
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.RhsConversion key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return getIntent(context, key.getSkipSplashScreen());
        }
    }
}
