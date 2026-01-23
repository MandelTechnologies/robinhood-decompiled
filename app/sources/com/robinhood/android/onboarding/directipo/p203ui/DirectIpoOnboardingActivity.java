package com.robinhood.android.onboarding.directipo.p203ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.widget.Toolbar;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.data.prefs.HasShownDirectIpoOnboarding;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.onboarding.directipo.model.UiDirectIpoOnboarding;
import com.robinhood.android.onboarding.directipo.p203ui.DirectIpoOnboardingLoadingFragment;
import com.robinhood.android.onboarding.directipo.p203ui.DirectIpoOnboardingParentFragment;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001)B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u000fH\u0016J\t\u0010#\u001a\u00020\u0013H\u0096\u0001R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingLoadingFragment$Callbacks;", "Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingParentFragment$Callbacks;", "<init>", "()V", "hasShownDirectIpoOnboarding", "Lcom/robinhood/prefs/BooleanPreference;", "getHasShownDirectIpoOnboarding", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasShownDirectIpoOnboarding", "(Lcom/robinhood/prefs/BooleanPreference;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onDialogDismissed", "id", "", "onLoadDirectIpoOnboardingSuccess", "onboarding", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;", "onLoadDirectIpoOnboardingFailed", "throwable", "", "onViewAvailableIpos", "viewAvailableIposUrl", "Landroid/net/Uri;", "onOnboardingAborted", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DirectIpoOnboardingActivity extends BaseActivity implements RegionGated, RhDialogFragment.OnDismissListener, DirectIpoOnboardingLoadingFragment.Callbacks, DirectIpoOnboardingParentFragment.Callbacks {
    private static final String CONTENTFUL_ID = "x6EkIT5WOXI8377MKMey2";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    @HasShownDirectIpoOnboarding
    public BooleanPreference hasShownDirectIpoOnboarding;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoOnboardingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
    }

    public final BooleanPreference getHasShownDirectIpoOnboarding() {
        BooleanPreference booleanPreference = this.hasShownDirectIpoOnboarding;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasShownDirectIpoOnboarding");
        return null;
    }

    public final void setHasShownDirectIpoOnboarding(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasShownDirectIpoOnboarding = booleanPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Toolbar toolbar;
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
        getHasShownDirectIpoOnboarding().set(true);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setUseDesignSystemTheme(true);
        }
        RhToolbar rhToolbar2 = getRhToolbar();
        if (rhToolbar2 != null) {
            rhToolbar2.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingActivity.onCreate.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    ViewsKt.setMarginTop(v, insets.getSystemWindowInsetTop());
                    return insets.consumeSystemWindowInsets();
                }
            });
        }
        RhToolbar rhToolbar3 = getRhToolbar();
        if (rhToolbar3 != null && (toolbar = rhToolbar3.getToolbar()) != null) {
            toolbar.setNavigationIcon(C20690R.drawable.ic_rds_close_24dp);
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, DirectIpoOnboardingLoadingFragment.INSTANCE.newInstance((Parcelable) new DirectIpoOnboardingLoadingFragment.Args(CONTENTFUL_ID)));
        }
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

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment.Callbacks
    public void onLoadDirectIpoOnboardingSuccess(UiDirectIpoOnboarding onboarding) {
        Intrinsics.checkNotNullParameter(onboarding, "onboarding");
        replaceFragmentWithoutAnimation(DirectIpoOnboardingParentFragment.INSTANCE.newInstance((Parcelable) onboarding));
    }

    @Override // com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingLoadingFragment.Callbacks
    public void onLoadDirectIpoOnboardingFailed(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, throwable, true, false, 0, null, 56, null);
    }

    @Override // com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingParentFragment.Callbacks
    public void onViewAvailableIpos(Uri viewAvailableIposUrl) {
        Intrinsics.checkNotNullParameter(viewAvailableIposUrl, "viewAvailableIposUrl");
        Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, viewAvailableIposUrl, null, null, false, null, 60, null);
        setResult(-1);
        finish();
    }

    @Override // com.robinhood.android.onboarding.directipo.ui.DirectIpoOnboardingParentFragment.Callbacks
    public void onOnboardingAborted() {
        finish();
    }

    /* compiled from: DirectIpoOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/ui/DirectIpoOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoOnboarding;", "<init>", "()V", "CONTENTFUL_ID", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.DirectIpoOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DirectIpoOnboarding key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Intent(context, (Class<?>) DirectIpoOnboardingActivity.class);
        }
    }
}
