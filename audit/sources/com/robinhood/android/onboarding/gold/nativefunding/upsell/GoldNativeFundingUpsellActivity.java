package com.robinhood.android.onboarding.gold.nativefunding.upsell;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.api.gold.nativefunding.upsell.ApiGoldNativeFundingUpsell;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.gold.contracts.GoldAgreementsActivityIntentKey;
import com.robinhood.android.gold.contracts.GoldAgreementsContract;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldUpgradeContract;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.onboarding.contracts.GoldNativeFundingUpsellIntentKey;
import com.robinhood.android.onboarding.contracts.OnboardingGoldAnnualPlanExperiment;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellGoldRateSelectionFragmentContract;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellStandardPageFragmentContract;
import com.robinhood.android.onboarding.gold.nativefunding.preference.GoldNativeFundingUpsellSourcePref;
import com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellLoadingFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.onboardingupsell.ApiChooseApyScreenContent;
import com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.prefs.StringPreference;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldNativeFundingUpsellActivity.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020\u001fH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellLoadingFragment$Callbacks;", "Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellStandardPageFragmentContract$Callbacks;", "Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellGoldRateSelectionFragmentContract$Callbacks;", "<init>", "()V", "shouldPromptForLockscreen", "", "goldNativeFundingUpsellFlow", "Lcom/robinhood/android/api/gold/nativefunding/upsell/ApiGoldNativeFundingUpsell;", "goldNativeFundingUpsellSourcePref", "Lcom/robinhood/prefs/StringPreference;", "getGoldNativeFundingUpsellSourcePref$annotations", "getGoldNativeFundingUpsellSourcePref", "()Lcom/robinhood/prefs/StringPreference;", "setGoldNativeFundingUpsellSourcePref", "(Lcom/robinhood/prefs/StringPreference;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "goldAgreementsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/gold/contracts/GoldAgreementsActivityIntentKey;", "goldUpgradeFlowLauncher", "Lcom/robinhood/android/gold/contracts/GoldUpgradeIntentKey;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNativeFundingUpsellFlowLoaded", "showNextFragment", "onNativeFundingUpsellFlowFailed", "error", "", "onOnboardingUpsellAction", "action", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingFundingUpsellAction;", "handleOnboardingUpsellDeeplink", "uri", "Landroid/net/Uri;", "finishWithCancel", "finishWithComplete", "Companion", "feature-gold-native-funding-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldNativeFundingUpsellActivity extends BaseActivity implements GoldNativeFundingUpsellLoadingFragment.Callbacks, OnboardingUpsellStandardPageFragmentContract.Callbacks, OnboardingUpsellGoldRateSelectionFragmentContract.Callbacks {
    private static final String GOLD_AGREEMENTS_DEEPLINK_PATH = "gold_agreements";
    public ExperimentsStore experimentsStore;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldAgreementsActivityIntentKey>> goldAgreementsLauncher;
    private ApiGoldNativeFundingUpsell goldNativeFundingUpsellFlow;
    public StringPreference goldNativeFundingUpsellSourcePref;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldUpgradeIntentKey>> goldUpgradeFlowLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @GoldNativeFundingUpsellSourcePref
    public static /* synthetic */ void getGoldNativeFundingUpsellSourcePref$annotations() {
    }

    public GoldNativeFundingUpsellActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.goldAgreementsLauncher = registerForActivityResult(new GoldAgreementsContract(new Function0() { // from class: com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellActivity$goldAgreementsLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(GoldAgreementsContract.Result result) {
                if (result instanceof GoldAgreementsContract.Result.Completed) {
                    this.this$0.finishWithComplete();
                } else if (!(result instanceof GoldAgreementsContract.Result.Canceled)) {
                    this.this$0.finishWithCancel();
                } else {
                    if (((GoldAgreementsContract.Result.Canceled) result).getBackButtonPressed()) {
                        return;
                    }
                    this.this$0.finishWithCancel();
                }
            }
        });
        this.goldUpgradeFlowLauncher = registerForActivityResult(new GoldUpgradeContract(new Function0() { // from class: com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellActivity$goldUpgradeFlowLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(GoldUpgradeContract.Result result) {
                if (result instanceof GoldUpgradeContract.Result.Completed) {
                    this.this$0.finishWithComplete();
                } else if (result instanceof GoldUpgradeContract.Result.Canceled) {
                    this.this$0.finishWithCancel();
                } else {
                    this.this$0.finishWithCancel();
                }
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return !((GoldNativeFundingUpsellIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding();
    }

    public final StringPreference getGoldNativeFundingUpsellSourcePref() {
        StringPreference stringPreference = this.goldNativeFundingUpsellSourcePref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldNativeFundingUpsellSourcePref");
        return null;
    }

    public final void setGoldNativeFundingUpsellSourcePref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldNativeFundingUpsellSourcePref = stringPreference;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxActivity(toolbar, OnboardingProgress.FUND_ACCOUNT_DEPOSIT, ((GoldNativeFundingUpsellIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        if (((GoldNativeFundingUpsellIntentKey) companion.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        if (this.goldNativeFundingUpsellFlow == null) {
            setFragment(C11048R.id.fragment_container, GoldNativeFundingUpsellLoadingFragment.INSTANCE.newInstance((Parcelable) new GoldNativeFundingUpsellLoadingFragment.Args(((GoldNativeFundingUpsellIntentKey) companion.getExtras((Activity) this)).getSource())));
        }
    }

    @Override // com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellLoadingFragment.Callbacks
    public void onNativeFundingUpsellFlowLoaded(final ApiGoldNativeFundingUpsell goldNativeFundingUpsellFlow) {
        Intrinsics.checkNotNullParameter(goldNativeFundingUpsellFlow, "goldNativeFundingUpsellFlow");
        this.goldNativeFundingUpsellFlow = goldNativeFundingUpsellFlow;
        if (goldNativeFundingUpsellFlow.getEarnExtraDepositScreen() != null || goldNativeFundingUpsellFlow.getStartEarningDepositScreen() != null) {
            Observable observableOnErrorReturnItem = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{OnboardingGoldAnnualPlanExperiment.INSTANCE}, false, null, 6, null).take(1L).onErrorReturnItem(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorReturnItem, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldNativeFundingUpsellActivity.onNativeFundingUpsellFlowLoaded$lambda$2(this.f$0, goldNativeFundingUpsellFlow, (Boolean) obj);
                }
            });
            return;
        }
        finishWithCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNativeFundingUpsellFlowLoaded$lambda$2(GoldNativeFundingUpsellActivity goldNativeFundingUpsellActivity, ApiGoldNativeFundingUpsell apiGoldNativeFundingUpsell, Boolean bool) {
        String str;
        if (bool.booleanValue()) {
            ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldUpgradeIntentKey>> activityResultLauncher = goldNativeFundingUpsellActivity.goldUpgradeFlowLauncher;
            Companion companion = INSTANCE;
            String source = ((GoldNativeFundingUpsellIntentKey) companion.getExtras((Activity) goldNativeFundingUpsellActivity)).getSource();
            if (((GoldNativeFundingUpsellIntentKey) companion.getExtras((Activity) goldNativeFundingUpsellActivity)).isFromRhfOnboarding()) {
                str = GoldFeature.ONBOARDING_NATIVE_WITH_PROGRESS_BAR;
            } else {
                str = GoldFeature.ONBOARDING_NATIVE;
            }
            NavigationActivityResultContract3.launch$default(activityResultLauncher, new GoldUpgradeIntentKey(source, str, null, ((GoldNativeFundingUpsellIntentKey) companion.getExtras((Activity) goldNativeFundingUpsellActivity)).getTheme() == ColorTheme.DARK ? NightModeManager2.NIGHT : null, null, ((GoldNativeFundingUpsellIntentKey) companion.getExtras((Activity) goldNativeFundingUpsellActivity)).isFromRhfOnboarding(), 20, null), null, false, 6, null);
        } else {
            goldNativeFundingUpsellActivity.showNextFragment(apiGoldNativeFundingUpsell);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void showNextFragment(ApiGoldNativeFundingUpsell goldNativeFundingUpsellFlow) {
        StandardPageTemplate<OnboardingFundingUpsellAction> earnExtraDepositScreen = goldNativeFundingUpsellFlow.getEarnExtraDepositScreen();
        Fragment fragmentCreateFragment$default = null;
        if (earnExtraDepositScreen != null) {
            Fragment fragmentCreateFragment$default2 = Navigator.DefaultImpls.createFragment$default(getNavigator(), new OnboardingUpsellStandardPageFragmentContract.Key(earnExtraDepositScreen, ((GoldNativeFundingUpsellIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding(), !((GoldNativeFundingUpsellIntentKey) r5.getExtras((Activity) this)).isFromRhfOnboarding()), null, 2, null);
            if (fragmentCreateFragment$default2 == null) {
                ApiChooseApyScreenContent startEarningDepositScreen = goldNativeFundingUpsellFlow.getStartEarningDepositScreen();
                if (startEarningDepositScreen != null) {
                    fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), new OnboardingUpsellGoldRateSelectionFragmentContract.Key(startEarningDepositScreen, ((GoldNativeFundingUpsellIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding()), null, 2, null);
                }
            } else {
                fragmentCreateFragment$default = fragmentCreateFragment$default2;
            }
        }
        if (fragmentCreateFragment$default == null) {
            finishWithCancel();
        } else {
            getGoldNativeFundingUpsellSourcePref().set(goldNativeFundingUpsellFlow.getFundingUpsellSource());
            replaceFragmentWithoutBackStack(fragmentCreateFragment$default);
        }
    }

    @Override // com.robinhood.android.onboarding.gold.nativefunding.upsell.GoldNativeFundingUpsellLoadingFragment.Callbacks
    public void onNativeFundingUpsellFlowFailed(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        finishWithCancel();
    }

    @Override // com.robinhood.android.onboarding.contracts.OnboardingUpsellStandardPageFragmentContract.Callbacks, com.robinhood.android.onboarding.contracts.OnboardingUpsellGoldRateSelectionFragmentContract.Callbacks
    public boolean onOnboardingUpsellAction(OnboardingFundingUpsellAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof OnboardingFundingUpsellAction.Deeplink) {
            handleOnboardingUpsellDeeplink(Uri.parse(((OnboardingFundingUpsellAction.Deeplink) action).getValue2().getUri()));
            return true;
        }
        finishWithCancel();
        return true;
    }

    private final void handleOnboardingUpsellDeeplink(Uri uri) {
        String host = uri.getHost();
        if (host != null && host.hashCode() == 50120936 && host.equals(GOLD_AGREEMENTS_DEEPLINK_PATH)) {
            ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldAgreementsActivityIntentKey>> activityResultLauncher = this.goldAgreementsLauncher;
            String queryParameter = uri.getQueryParameter("feature");
            String queryParameter2 = uri.getQueryParameter("source");
            if (queryParameter2 == null) {
                queryParameter2 = "unknown";
            }
            NavigationActivityResultContract3.launch$default(activityResultLauncher, new GoldAgreementsActivityIntentKey(queryParameter, queryParameter2, ((GoldNativeFundingUpsellIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding(), false), null, false, 6, null);
            return;
        }
        Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, uri, null, null, false, null, 60, null);
        finishWithComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithCancel() {
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithComplete() {
        setResult(-1);
        finish();
    }

    /* compiled from: GoldNativeFundingUpsellActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/onboarding/gold/nativefunding/upsell/GoldNativeFundingUpsellActivity;", "Lcom/robinhood/android/onboarding/contracts/GoldNativeFundingUpsellIntentKey;", "<init>", "()V", "GOLD_AGREEMENTS_DEEPLINK_PATH", "", "feature-gold-native-funding-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GoldNativeFundingUpsellActivity, GoldNativeFundingUpsellIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public GoldNativeFundingUpsellIntentKey getExtras(GoldNativeFundingUpsellActivity goldNativeFundingUpsellActivity) {
            return (GoldNativeFundingUpsellIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, goldNativeFundingUpsellActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, GoldNativeFundingUpsellIntentKey goldNativeFundingUpsellIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, goldNativeFundingUpsellIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, GoldNativeFundingUpsellIntentKey goldNativeFundingUpsellIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, goldNativeFundingUpsellIntentKey);
        }
    }
}
