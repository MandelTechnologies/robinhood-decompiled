package com.robinhood.android.cash.rhy.tab.p077v2.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.common.mcduckling.prefs.ShouldResetCashTabPref;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.odyssey.lib.BaseSdActivity;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhyonboarding.contracts.RhyUpgradeKey;
import com.robinhood.librobinhood.data.store.identi.ServerDrivenStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowRhyFundingBottomSheetPref;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OdysseyRhyUpgradeActivity.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0014J\t\u0010#\u001a\u00020\u001dH\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/OdysseyRhyUpgradeActivity;", "Lcom/robinhood/android/odyssey/lib/BaseSdActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "shouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShouldResetCashTabPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShouldResetCashTabPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "showRhyFundingBottomSheetPref", "getShowRhyFundingBottomSheetPref", "setShowRhyFundingBottomSheetPref", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "odysseyFlowConfiguration", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "getOdysseyFlowConfiguration", "()Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "exitDeeplinkOverride", "Landroid/net/Uri;", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "useAchromaticTheme", "", "getUseAchromaticTheme", "()Z", "onExitFlow", "", "onStart", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class OdysseyRhyUpgradeActivity extends BaseSdActivity implements RegionGated {
    private static final String EXIT_OVERRIDE_KEY = "exit_deep_link_override";
    private static final String ODYSSEY_FLOW_RHY_UPGRADE = "rhy_upgrade";
    public ScreenProtectManager screenProtectManager;

    @ShouldResetCashTabPref
    public BooleanPreference shouldResetCashTabPref;

    @ShowRhyFundingBottomSheetPref
    public BooleanPreference showRhyFundingBottomSheetPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final boolean useAchromaticTheme = true;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final BooleanPreference getShouldResetCashTabPref() {
        BooleanPreference booleanPreference = this.shouldResetCashTabPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldResetCashTabPref");
        return null;
    }

    public final void setShouldResetCashTabPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.shouldResetCashTabPref = booleanPreference;
    }

    public final BooleanPreference getShowRhyFundingBottomSheetPref() {
        BooleanPreference booleanPreference = this.showRhyFundingBottomSheetPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showRhyFundingBottomSheetPref");
        return null;
    }

    public final void setShowRhyFundingBottomSheetPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showRhyFundingBottomSheetPref = booleanPreference;
    }

    public final ScreenProtectManager getScreenProtectManager() {
        ScreenProtectManager screenProtectManager = this.screenProtectManager;
        if (screenProtectManager != null) {
            return screenProtectManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenProtectManager");
        return null;
    }

    public final void setScreenProtectManager(ScreenProtectManager screenProtectManager) {
        Intrinsics.checkNotNullParameter(screenProtectManager, "<set-?>");
        this.screenProtectManager = screenProtectManager;
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public ServerDrivenStore.FlowConfiguration getOdysseyFlowConfiguration() {
        return new ServerDrivenStore.FlowConfiguration(ODYSSEY_FLOW_RHY_UPGRADE, false, ((RhyUpgradeKey) INSTANCE.getExtras((Activity) this)).getQueryParameters(), null, null, null, 58, null);
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public Uri getExitDeeplinkOverride() {
        String uri;
        Uri exitDeeplinkOverride = ((RhyUpgradeKey) INSTANCE.getExtras((Activity) this)).getExitDeeplinkOverride();
        if (exitDeeplinkOverride == null || (uri = exitDeeplinkOverride.toString()) == null) {
            uri = DeepLinkPath.RHY_UNLOCK_CASHBACK_INTRO.getUri();
        }
        return DeepLinkPath.RHY_POST_SIGN_UP.buildUri(MapsKt.mapOf(Tuples4.m3642to(EXIT_OVERRIDE_KEY, uri)));
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public boolean getUseAchromaticTheme() {
        return this.useAchromaticTheme;
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public void onExitFlow() {
        super.onExitFlow();
        getShouldResetCashTabPref().set(true);
        getShowRhyFundingBottomSheetPref().set(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        screenProtectManager.blockScreenSharing(this, ScreenProtectFlow.RHY_ENROLLMENT);
        screenProtectManager.setFlagSecure(this);
    }

    /* compiled from: OdysseyRhyUpgradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/OdysseyRhyUpgradeActivity$Companion;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/OdysseyRhyUpgradeActivity;", "Lcom/robinhood/android/rhyonboarding/contracts/RhyUpgradeKey;", "<init>", "()V", "ODYSSEY_FLOW_RHY_UPGRADE", "", "EXIT_OVERRIDE_KEY", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements ActivityCompanion3<OdysseyRhyUpgradeActivity, RhyUpgradeKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RhyUpgradeKey getExtras(OdysseyRhyUpgradeActivity odysseyRhyUpgradeActivity) {
            return (RhyUpgradeKey) ActivityCompanion3.DefaultImpls.getExtras(this, odysseyRhyUpgradeActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, RhyUpgradeKey rhyUpgradeKey) {
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(this, context, rhyUpgradeKey);
        }
    }
}
