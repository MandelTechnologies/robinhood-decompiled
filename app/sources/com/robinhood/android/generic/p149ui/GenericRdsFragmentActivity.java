package com.robinhood.android.generic.p149ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericRdsFragmentActivity.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0014R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/generic/ui/GenericRdsFragmentActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "requiresAuthentication", "", "shouldPromptForLockscreen", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "()Z", "allowMainBanner", "getAllowMainBanner", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "Companion", "feature-fragment-and-activity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GenericRdsFragmentActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean excludeFromAnalyticsLogging;

    public GenericRdsFragmentActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.excludeFromAnalyticsLogging = true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return ((HostIntentKey.ShowFragmentInStandaloneRdsActivity) INSTANCE.getExtras((Activity) this)).getRequiresAuthentication();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        Companion companion = INSTANCE;
        return ((HostIntentKey.ShowFragmentInStandaloneRdsActivity) companion.getExtras((Activity) this)).getRequiresAuthentication() && ((HostIntentKey.ShowFragmentInStandaloneRdsActivity) companion.getExtras((Activity) this)).getShouldPromptForLockscreen();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean getAllowMainBanner() {
        return ((HostIntentKey.ShowFragmentInStandaloneRdsActivity) INSTANCE.getExtras((Activity) this)).getAllowMainBanner();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        if (((HostIntentKey.ShowFragmentInStandaloneRdsActivity) companion.getExtras((Activity) this)).getForceDarkMode()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), ((HostIntentKey.ShowFragmentInStandaloneRdsActivity) companion.getExtras((Activity) this)).getFragmentKey(), null, 2, null));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        if (((HostIntentKey.ShowFragmentInStandaloneRdsActivity) INSTANCE.getExtras((Activity) this)).getUseCloseIcon()) {
            toolbar.getToolbar().setNavigationIcon(C20690R.drawable.ic_rds_close_24dp);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C11048R.id.fragment_container);
        BaseFragment baseFragment = fragmentFindFragmentById instanceof BaseFragment ? (BaseFragment) fragmentFindFragmentById : null;
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        boolean z = false;
        if (baseFragment != null && baseFragment.getUseDesignSystemToolbar()) {
            z = true;
        }
        rhToolbar.setUseDesignSystemTheme(z);
    }

    /* compiled from: GenericRdsFragmentActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/generic/ui/GenericRdsFragmentActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/generic/ui/GenericRdsFragmentActivity;", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInStandaloneRdsActivity;", "<init>", "()V", "feature-fragment-and-activity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GenericRdsFragmentActivity, HostIntentKey.ShowFragmentInStandaloneRdsActivity> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public HostIntentKey.ShowFragmentInStandaloneRdsActivity getExtras(GenericRdsFragmentActivity genericRdsFragmentActivity) {
            return (HostIntentKey.ShowFragmentInStandaloneRdsActivity) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, genericRdsFragmentActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, HostIntentKey.ShowFragmentInStandaloneRdsActivity showFragmentInStandaloneRdsActivity) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, showFragmentInStandaloneRdsActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, HostIntentKey.ShowFragmentInStandaloneRdsActivity showFragmentInStandaloneRdsActivity) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, showFragmentInStandaloneRdsActivity);
        }
    }
}
