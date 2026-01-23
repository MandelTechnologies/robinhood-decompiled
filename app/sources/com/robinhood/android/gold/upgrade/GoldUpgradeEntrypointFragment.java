package com.robinhood.android.gold.upgrade;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.GoldDesignThemeOverlay;
import com.robinhood.android.gold.contracts.GoldAgreementsActivityIntentKey;
import com.robinhood.android.gold.contracts.GoldAgreementsContract;
import com.robinhood.android.gold.contracts.GoldSettingsIntentKey;
import com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract;
import com.robinhood.android.gold.contracts.GoldUpgradeConfirmationFragmentContract;
import com.robinhood.android.gold.contracts.GoldUpgradeContract;
import com.robinhood.android.gold.contracts.GoldUpgradeFragmentKey;
import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.contracts.GoldUpgradeSubmissionFragmentContract;
import com.robinhood.android.gold.contracts.GoldUpgradeTabContract;
import com.robinhood.android.gold.level2.GoldLevel2PromoFragment;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeDynamicContext;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSubmissionFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSuggestedActionFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropSduiFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeValuePropsFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeFragment;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostFragment;
import com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GoldUpgradeValuePropsAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.subscription.api.MarginUpgradePlans2;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ContextActionEvent;
import com.robinhood.rosetta.eventlogging.GoldUpgradeContext;
import com.robinhood.rosetta.eventlogging.GoldUpgradeType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: GoldUpgradeEntrypointFragment.kt */
@Metadata(m3635d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0092\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0002\u0092\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0016J\u0012\u0010W\u001a\u00020T2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u001a\u0010Z\u001a\u00020\u00182\u0006\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010YH\u0016J\u0010\u0010^\u001a\u00020T2\u0006\u0010_\u001a\u00020\u000fH\u0016J\b\u0010`\u001a\u00020TH\u0016J\b\u0010a\u001a\u00020TH\u0016J\b\u0010b\u001a\u00020TH\u0016J\b\u0010c\u001a\u00020TH\u0016J\"\u0010d\u001a\u00020T2\u0006\u0010e\u001a\u00020\\2\u0006\u0010f\u001a\u00020\\2\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\b\u0010i\u001a\u00020TH\u0002J\b\u0010j\u001a\u00020TH\u0002J\u0010\u0010k\u001a\u00020T2\u0006\u0010l\u001a\u00020mH\u0016J\u001a\u0010n\u001a\u00020T2\u0006\u0010o\u001a\u00020\u00182\b\u0010p\u001a\u0004\u0018\u00010qH\u0016J\"\u0010n\u001a\u00020T2\u0006\u0010o\u001a\u00020\u00182\u0006\u0010r\u001a\u00020\u00182\b\u0010p\u001a\u0004\u0018\u00010qH\u0016J\u0012\u0010s\u001a\u00020T2\b\u0010p\u001a\u0004\u0018\u00010qH\u0016J\b\u0010t\u001a\u00020TH\u0016J \u0010u\u001a\u00020T2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020\u00182\u0006\u0010y\u001a\u00020qH\u0016J\u0018\u0010z\u001a\u00020T2\u0006\u0010{\u001a\u00020\u00182\u0006\u0010|\u001a\u00020\u0018H\u0016J\b\u0010}\u001a\u00020TH\u0016J\u0013\u0010~\u001a\u00020T2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J\u0014\u0010\u0081\u0001\u001a\u00020T2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J\t\u0010\u0082\u0001\u001a\u00020TH\u0002J\t\u0010\u0083\u0001\u001a\u00020\u0018H\u0016J\u001e\u0010\u0084\u0001\u001a\u00020T2\u0007\u0010\u0085\u0001\u001a\u00020\u00182\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0016J\t\u0010\u0088\u0001\u001a\u00020TH\u0016J\u0012\u0010\u0089\u0001\u001a\u00020T2\u0007\u0010\u0085\u0001\u001a\u00020\u0018H\u0002J\t\u0010\u008a\u0001\u001a\u00020TH\u0002J\t\u0010\u008b\u0001\u001a\u00020TH\u0002J\n\u0010\u008c\u0001\u001a\u00020\u0018H\u0096\u0001R/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001d\u00109\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010E\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010N\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020Q R*\n\u0012\u0004\u0012\u00020Q\u0018\u00010P0P0OX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/GoldUpgradeEntrypointFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment$Callbacks;", "Lcom/robinhood/android/common/gold/LegacyGoldUpgradeAgreementFragment$Callbacks;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeSubmissionFragmentContract$Callbacks;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeWelcomeFragment$Callbacks;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeAgreementsFragmentContract$Callbacks;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeContract$ValuePropCallbacks;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeConfirmationFragmentContract$Callbacks;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSuggestedActionFragment$Callbacks;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeExtraAgreementsFragment$Callbacks;", "<init>", "()V", "<set-?>", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeDynamicContext;", "upgradeDynamicContext", "getUpgradeDynamicContext", "()Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeDynamicContext;", "setUpgradeDynamicContext", "(Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeDynamicContext;)V", "upgradeDynamicContext$delegate", "Lkotlin/properties/ReadWriteProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "goldUpgradeStore", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "getGoldUpgradeStore", "()Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "setGoldUpgradeStore", "(Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;)V", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "getPerformanceLogger", "()Lcom/robinhood/android/performancelogger/PerformanceLogger;", "setPerformanceLogger", "(Lcom/robinhood/android/performancelogger/PerformanceLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "tabHostCallback", "Lcom/robinhood/android/gold/contracts/GoldUpgradeTabContract$Callback;", "getTabHostCallback", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeTabContract$Callback;", "tabHostCallback$delegate", "Lkotlin/Lazy;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "perfEvents", "", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "finishHandler", "Landroid/os/Handler;", "goldAgreementLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/gold/contracts/GoldAgreementsActivityIntentKey;", "kotlin.jvm.PlatformType", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onLoadPlanSuccess", "dynamicContext", "onLoadPlanFailed", "onAccountDeficit", "onAlreadyGold", "onGoldValuePropsContinue", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "openAgreementsModal", "navigateToAgreements", "onClickFullAgreement", "agreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "onClickAgreementsCta", "isSweepChecked", "selectedPlanId", "Ljava/util/UUID;", "isSlipChecked", "onDisclosureAccepted", "onDisclosureFailedToLoad", "onUpgraded", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "newToSweep", "planId", "onClickConfirmationCta", "isSweepEnabled", "isActionHandled", "onClickConfirmationFailedCta", "onClickSuggestedActionPrimaryCta", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onClickSuggestedActionSecondaryCta", "goToGoldHub", "onBackPressed", "onConfirmationButtonClicked", "isSuccess", "deepLinkAction", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "onConfirmationFailedCtaClicked", "finishWithComplete", "finishWithCancel", "navigateToUpdateApp", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldUpgradeEntrypointFragment extends BaseFragment implements RegionGated, LegacyGoldUpgradeLoadPlanFragment.Callbacks, LegacyGoldUpgradeAgreementFragment.Callbacks, GoldUpgradeSubmissionFragmentContract.Callbacks, LegacyGoldUpgradeWelcomeFragment.Callbacks, GoldUpgradeAgreementsFragmentContract.Callbacks, GoldUpgradeContract.ValuePropCallbacks, GoldUpgradeConfirmationFragmentContract.Callbacks, LegacyGoldUpgradeSuggestedActionFragment.Callbacks, LegacyGoldUpgradeExtraAgreementsFragment.Callbacks {
    private static final int MARGIN_REQUEST_CODE = 1;
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AnalyticsLogger analytics;
    public ExperimentsStore experimentsStore;
    private final Handler finishHandler;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldAgreementsActivityIntentKey>> goldAgreementLauncher;
    public GoldUpgradeStore goldUpgradeStore;
    private final List<ContextActionEvent> perfEvents;
    public PerformanceLogger performanceLogger;

    /* renamed from: tabHostCallback$delegate, reason: from kotlin metadata */
    private final Lazy tabHostCallback;
    private final boolean toolbarVisible;

    /* renamed from: upgradeDynamicContext$delegate, reason: from kotlin metadata */
    private final Interfaces3 upgradeDynamicContext;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(GoldUpgradeEntrypointFragment.class, "upgradeDynamicContext", "getUpgradeDynamicContext()Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeDynamicContext;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GoldUpgradeEntrypointFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NightModeManager2.values().length];
            try {
                iArr[NightModeManager2.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NightModeManager2.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public GoldUpgradeEntrypointFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(GoldRegionGate.INSTANCE);
        this.upgradeDynamicContext = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[0]);
        this.tabHostCallback = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.gold.upgrade.GoldUpgradeEntrypointFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoldUpgradeEntrypointFragment.tabHostCallback_delegate$lambda$0(this.f$0);
            }
        });
        this.perfEvents = CollectionsKt.listOf((Object[]) new ContextActionEvent[]{new ContextActionEvent.Component(new Component(Component.ComponentType.ACCOUNT_CENTER_UPSELL_BANNER, "gold_upsell_fomo", null, 4, null)), new ContextActionEvent.Action(UserInteractionEventData.Action.GOLD_UPSELL_UPGRADE)});
        this.finishHandler = new Handler(Looper.getMainLooper());
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldAgreementsActivityIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new GoldAgreementsContract(new Function0() { // from class: com.robinhood.android.gold.upgrade.GoldUpgradeEntrypointFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.gold.upgrade.GoldUpgradeEntrypointFragment$goldAgreementLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(GoldAgreementsContract.Result result) {
                if (!((GoldUpgradeFragmentKey) GoldUpgradeEntrypointFragment.INSTANCE.getArgs((Fragment) this.this$0)).getShownInTab() || result == null) {
                    return;
                }
                if (result instanceof GoldAgreementsContract.Result.Completed) {
                    GoldUpgradeTabContract.Callback tabHostCallback = this.this$0.getTabHostCallback();
                    if (tabHostCallback != null) {
                        tabHostCallback.onUpgradeSuccess();
                        return;
                    }
                    return;
                }
                if (result instanceof GoldAgreementsContract.Result.Canceled) {
                    GoldUpgradeTabContract.Callback tabHostCallback2 = this.this$0.getTabHostCallback();
                    if (tabHostCallback2 != null) {
                        tabHostCallback2.onUpgradeCanceled();
                        return;
                    }
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.goldAgreementLauncher = activityResultLauncherRegisterForActivityResult;
    }

    private final LegacyGoldUpgradeDynamicContext getUpgradeDynamicContext() {
        return (LegacyGoldUpgradeDynamicContext) this.upgradeDynamicContext.getValue(this, $$delegatedProperties[0]);
    }

    private final void setUpgradeDynamicContext(LegacyGoldUpgradeDynamicContext legacyGoldUpgradeDynamicContext) {
        this.upgradeDynamicContext.setValue(this, $$delegatedProperties[0], legacyGoldUpgradeDynamicContext);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
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

    public final GoldUpgradeStore getGoldUpgradeStore() {
        GoldUpgradeStore goldUpgradeStore = this.goldUpgradeStore;
        if (goldUpgradeStore != null) {
            return goldUpgradeStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldUpgradeStore");
        return null;
    }

    public final void setGoldUpgradeStore(GoldUpgradeStore goldUpgradeStore) {
        Intrinsics.checkNotNullParameter(goldUpgradeStore, "<set-?>");
        this.goldUpgradeStore = goldUpgradeStore;
    }

    public final PerformanceLogger getPerformanceLogger() {
        PerformanceLogger performanceLogger = this.performanceLogger;
        if (performanceLogger != null) {
            return performanceLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceLogger");
        return null;
    }

    public final void setPerformanceLogger(PerformanceLogger performanceLogger) {
        Intrinsics.checkNotNullParameter(performanceLogger, "<set-?>");
        this.performanceLogger = performanceLogger;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoldUpgradeTabContract.Callback getTabHostCallback() {
        return (GoldUpgradeTabContract.Callback) this.tabHostCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldUpgradeTabContract.Callback tabHostCallback_delegate$lambda$0(GoldUpgradeEntrypointFragment goldUpgradeEntrypointFragment) {
        ActivityResultCaller parentFragment = goldUpgradeEntrypointFragment.getParentFragment();
        if (parentFragment instanceof GoldUpgradeTabContract.Callback) {
            return (GoldUpgradeTabContract.Callback) parentFragment;
        }
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "MarginUpgrade24kgActivity";
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return ((GoldUpgradeFragmentKey) INSTANCE.getArgs((Fragment) this)).getSourceScreenIdentifier();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Context getLoggingContext() {
        return new Context(0, 0, 0, null, null, null, null, Context.ProductTag.GOLD, 0, null, ((GoldUpgradeFragmentKey) INSTANCE.getArgs((Fragment) this)).getSourceScreenIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new GoldUpgradeContext(Boolean.FALSE, null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, GoldUpgradeType.GOLD_UPGRADE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -1, -1, -524289, -33554433, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (((GoldUpgradeFragmentKey) INSTANCE.getArgs((Fragment) this)).getShownInTab()) {
            ScarletManager.putOverlay$default(getScarletManager(), GoldDesignThemeOverlay.INSTANCE, null, 2, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        DayNightOverlay dayNightOverlay;
        Fragment fragmentCreateInitialFragment;
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        NightModeManager2 overrideDayNightMode = ((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getOverrideDayNightMode();
        int i = overrideDayNightMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[overrideDayNightMode.ordinal()];
        if (i == -1) {
            dayNightOverlay = null;
        } else if (i == 1) {
            dayNightOverlay = DayNightOverlay.DAY;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dayNightOverlay = DayNightOverlay.NIGHT;
        }
        if (dayNightOverlay != null) {
            ScarletManager.putOverlay$default(getScarletManager(), dayNightOverlay, null, 2, null);
        }
        if (savedInstanceState == null) {
            LegacyGoldUpgradeDynamicContext upgradeDynamicContext = getUpgradeDynamicContext();
            if (upgradeDynamicContext == null) {
                if (!((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getShownInTab()) {
                    fragmentCreateInitialFragment = (GenericComposeFragment) GoldUnifiedHostFragment.INSTANCE.newInstance((Parcelable) new GoldUnifiedHostFragment.Args(((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getFeature(), getLoggingContext(), ((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getExitDeeplink(), ((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getSageId()));
                } else {
                    fragmentCreateInitialFragment = (GenericComposeFragment) LegacyGoldUpgradeLoadPlanFragment.INSTANCE.newInstance((Parcelable) new LegacyGoldUpgradeLoadPlanFragment.Args(((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getFeature(), ((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getExitDeeplink()));
                }
            } else {
                fragmentCreateInitialFragment = companion.createInitialFragment(upgradeDynamicContext.getGoldUpgradeFlow(), getLoggingContext(), ((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getShownInTab());
            }
            if (fragmentCreateInitialFragment == null) {
                navigateToUpdateApp();
            } else {
                setFragment(C11048R.id.fragment_container, fragmentCreateInitialFragment);
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C18003R.id.dialog_id_gold_account_deficit) {
            finishWithCancel();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment.Callbacks
    public void onLoadPlanSuccess(LegacyGoldUpgradeDynamicContext dynamicContext) {
        Intrinsics.checkNotNullParameter(dynamicContext, "dynamicContext");
        setUpgradeDynamicContext(dynamicContext);
        UUID defaultPlanId = dynamicContext.getGoldUpgradeFlow().getDefaultPlanId();
        if (defaultPlanId != null) {
            getGoldUpgradeStore().setSelectedPlanId(defaultPlanId);
        }
        Companion companion = INSTANCE;
        BaseFragment baseFragmentCreateInitialFragment = companion.createInitialFragment(dynamicContext.getGoldUpgradeFlow(), getLoggingContext(), ((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getShownInTab());
        if (baseFragmentCreateInitialFragment != null) {
            replaceFragmentWithoutAnimation(baseFragmentCreateInitialFragment);
        } else {
            navigateToUpdateApp();
        }
    }

    @Override // com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment.Callbacks
    public void onLoadPlanFailed() {
        finishWithCancel();
        List<ContextActionEvent> list = this.perfEvents;
        PerformanceLogger performanceLogger = getPerformanceLogger();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            performanceLogger.failMetric((ContextActionEvent) it.next());
        }
    }

    @Override // com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment.Callbacks
    public void onAccountDeficit() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder useDesignSystemOverlay = companion.create(contextRequireContext).setTitle(C18003R.string.gold_upgrade_account_deficit_title, new Object[0]).setMessage(C18003R.string.gold_upgrade_account_deficit_message, new Object[0]).setId(C18003R.id.dialog_id_gold_account_deficit).setUseDesignSystemOverlay(true);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(useDesignSystemOverlay, childFragmentManager, "errorAccountDeficit", false, 4, null);
        List<ContextActionEvent> list = this.perfEvents;
        PerformanceLogger performanceLogger = getPerformanceLogger();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            performanceLogger.abortMetric((ContextActionEvent) it.next());
        }
    }

    @Override // com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment.Callbacks
    public void onAlreadyGold() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GoldSettingsIntentKey(false, false, null, 7, null), null, false, null, null, 60, null);
        finishWithComplete(true);
        List<ContextActionEvent> list = this.perfEvents;
        PerformanceLogger performanceLogger = getPerformanceLogger();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            performanceLogger.abortMetric((ContextActionEvent) it.next());
        }
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeContract.ValuePropCallbacks
    public void onGoldValuePropsContinue() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_GOLD_VALUE_PROPS, "continue", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        if (((GoldUpgradeFragmentKey) INSTANCE.getArgs((Fragment) this)).getShownInTab()) {
            openAgreementsModal();
        } else {
            navigateToAgreements();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            finishWithComplete(true);
        }
    }

    private final void openAgreementsModal() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldAgreementsActivityIntentKey>> activityResultLauncher = this.goldAgreementLauncher;
        Companion companion = INSTANCE;
        NavigationActivityResultContract3.launch$default(activityResultLauncher, new GoldAgreementsActivityIntentKey(((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getFeature(), ((GoldUpgradeFragmentKey) companion.getArgs((Fragment) this)).getSourceScreenIdentifier(), false, false, 12, null), null, false, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void navigateToAgreements() {
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements;
        ApiGoldSweepAgreement goldAgreement;
        Fragment fragmentNewInstance;
        ApiGoldUpgradeFlow.ApiGoldDaysPlanSelectionSection planSelectionSection;
        List<ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption> options;
        LegacyGoldUpgradeDynamicContext upgradeDynamicContext = getUpgradeDynamicContext();
        if (upgradeDynamicContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ApiGoldUpgradeFlow goldUpgradeFlow = upgradeDynamicContext.getGoldUpgradeFlow();
        ApiGoldUpgradeFlow.ApiGoldDaysValueProps goldDaysValueProps = goldUpgradeFlow.getGoldDaysValueProps();
        ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption apiGoldPlanSelectionOption = null;
        if (goldDaysValueProps != null && (planSelectionSection = goldDaysValueProps.getPlanSelectionSection()) != null && (options = planSelectionSection.getOptions()) != null) {
            Iterator<T> it = options.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption) next).getPlanId(), getGoldUpgradeStore().streamSelectedPlanId().blockingFirst().getOrNull())) {
                    apiGoldPlanSelectionOption = next;
                    break;
                }
            }
            apiGoldPlanSelectionOption = apiGoldPlanSelectionOption;
        }
        ApiGoldUpgradeFlow.ApiGoldExtraAgreements goldExtraAgreements = goldUpgradeFlow.getGoldExtraAgreements();
        if (apiGoldPlanSelectionOption == null || (goldSweepAgreements = apiGoldPlanSelectionOption.getGoldSweepAgreements()) == null) {
            goldSweepAgreements = goldUpgradeFlow.getGoldSweepAgreements();
        }
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements = goldSweepAgreements;
        if (apiGoldPlanSelectionOption == null || (goldAgreement = apiGoldPlanSelectionOption.getGoldAgreement()) == null) {
            goldAgreement = goldUpgradeFlow.getGoldAgreement();
        }
        if (goldExtraAgreements == null || (fragmentNewInstance = (LegacyGoldUpgradeExtraAgreementsFragment) LegacyGoldUpgradeExtraAgreementsFragment.INSTANCE.newInstance((Parcelable) new LegacyGoldUpgradeExtraAgreementsFragment.Args(goldExtraAgreements))) == null) {
            if (apiGoldSweepAgreements != null) {
                fragmentNewInstance = (LegacyGoldUpgradeAgreementsFragment) LegacyGoldUpgradeAgreementsFragment.INSTANCE.newInstance((Parcelable) new GoldUpgradeAgreementsFragmentContract.Key(apiGoldSweepAgreements, getLoggingContext(), null, false, !(apiGoldSweepAgreements.getDisableSparkleButtonStyling() != null ? r1.booleanValue() : false), 12, null));
            } else {
                fragmentNewInstance = LegacyGoldUpgradeAgreementFragment.INSTANCE.newInstance((Parcelable) new LegacyGoldUpgradeAgreementFragment.Args(goldAgreement));
            }
        }
        replaceFragment(fragmentNewInstance);
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract.Callbacks
    public void onClickFullAgreement(ApiGoldSweepAgreement agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        replaceFragment(GoldSweepAgreementDisplayFragment.INSTANCE.newInstance((Parcelable) new GoldSweepAgreementDisplayFragment.Args(agreement.getAgreementType(), agreement.getTitle(), null, null, 8, null)));
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract.Callbacks
    public void onClickAgreementsCta(boolean isSweepChecked, UUID selectedPlanId) {
        onClickAgreementsCta(isSweepChecked, false, selectedPlanId);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    @Override // com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsFragment.Callbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onClickAgreementsCta(boolean isSweepChecked, boolean isSlipChecked, UUID selectedPlanId) {
        UUID uuid;
        List listListOfNotNull;
        ApiGoldSweepAgreement sweepFullAgreement;
        ApiGoldSweepAgreement goldFullAgreement;
        String agreementType;
        MarginUpgradePlans2 plan;
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_GOLD_TERMS_AND_CONDITIONS, "accept", null, null, null, null, null, getProfileId(), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        if (selectedPlanId == null) {
            LegacyGoldUpgradeDynamicContext upgradeDynamicContext = getUpgradeDynamicContext();
            UUID id = (upgradeDynamicContext == null || (plan = upgradeDynamicContext.getPlan()) == null) ? null : plan.getId();
            if (id == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uuid = id;
        } else {
            uuid = selectedPlanId;
        }
        LegacyGoldUpgradeDynamicContext upgradeDynamicContext2 = getUpgradeDynamicContext();
        ApiGoldUpgradeFlow goldUpgradeFlow = upgradeDynamicContext2 != null ? upgradeDynamicContext2.getGoldUpgradeFlow() : null;
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements = goldUpgradeFlow != null ? goldUpgradeFlow.getGoldSweepAgreements() : null;
        ApiGoldUpgradeFlow.ApiGoldExtraAgreements goldExtraAgreements = goldUpgradeFlow != null ? goldUpgradeFlow.getGoldExtraAgreements() : null;
        if (goldExtraAgreements != null) {
            ApiGoldSweepAgreement goldFullAgreement2 = goldExtraAgreements.getGoldFullAgreement();
            ApiGoldUpgradeFlow.ApiGoldExtraAgreements.ApiGoldSweepConfig goldSweepConfig = goldExtraAgreements.getGoldSweepConfig();
            ApiGoldSweepAgreement sweepFullAgreement2 = goldSweepConfig != null ? goldSweepConfig.getSweepFullAgreement() : null;
            ApiGoldUpgradeFlow.ApiGoldExtraAgreements.ApiGoldSlipConfig goldSlipConfig = goldExtraAgreements.getGoldSlipConfig();
            List<ApiGoldSweepAgreement> slipFullAgreements = goldSlipConfig != null ? goldSlipConfig.getSlipFullAgreements() : null;
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            spreadBuilder.add(goldFullAgreement2.getAgreementType());
            if (sweepFullAgreement2 == null || (agreementType = sweepFullAgreement2.getAgreementType()) == null || !isSweepChecked) {
                agreementType = null;
            }
            spreadBuilder.add(agreementType);
            if (slipFullAgreements != null) {
                List<ApiGoldSweepAgreement> list = slipFullAgreements;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ApiGoldSweepAgreement) it.next()).getAgreementType());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                if (strArr != null) {
                    if (!isSlipChecked) {
                        strArr = null;
                    }
                    if (strArr == null) {
                    }
                    spreadBuilder.addSpread(strArr);
                    listListOfNotNull = CollectionsKt.listOfNotNull(spreadBuilder.toArray(new String[spreadBuilder.size()]));
                } else {
                    strArr = new String[0];
                    spreadBuilder.addSpread(strArr);
                    listListOfNotNull = CollectionsKt.listOfNotNull(spreadBuilder.toArray(new String[spreadBuilder.size()]));
                }
            }
        } else {
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{(goldSweepAgreements == null || (goldFullAgreement = goldSweepAgreements.getGoldFullAgreement()) == null) ? null : goldFullAgreement.getAgreementType(), (!isSweepChecked || goldSweepAgreements == null || (sweepFullAgreement = goldSweepAgreements.getSweepFullAgreement()) == null) ? null : sweepFullAgreement.getAgreementType()});
        }
        replaceFragment(LegacyGoldUpgradeSubmissionFragment.INSTANCE.newInstance((Parcelable) new GoldUpgradeSubmissionFragmentContract.Key(uuid, getLoggingContext(), new Screen(Screen.Name.GOLD_AGREEMENTS_LIST, null, null, null, 14, null), Boolean.valueOf(isSweepChecked), Boolean.valueOf(isSlipChecked), goldUpgradeFlow != null ? goldUpgradeFlow.getPromotion() : null, listListOfNotNull, false, goldSweepAgreements != null ? goldSweepAgreements.getBackupPaymentInstrument() : null, 128, null)));
    }

    @Override // com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment.Callbacks
    public void onDisclosureAccepted(UUID selectedPlanId) {
        UUID uuid;
        MarginUpgradePlans2 plan;
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_GOLD_TERMS_AND_CONDITIONS, "accept", null, null, null, null, null, getProfileId(), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        if (selectedPlanId == null) {
            LegacyGoldUpgradeDynamicContext upgradeDynamicContext = getUpgradeDynamicContext();
            UUID id = (upgradeDynamicContext == null || (plan = upgradeDynamicContext.getPlan()) == null) ? null : plan.getId();
            if (id == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uuid = id;
        } else {
            uuid = selectedPlanId;
        }
        LegacyGoldUpgradeDynamicContext upgradeDynamicContext2 = getUpgradeDynamicContext();
        ApiGoldUpgradeFlow goldUpgradeFlow = upgradeDynamicContext2 != null ? upgradeDynamicContext2.getGoldUpgradeFlow() : null;
        ApiGoldSweepAgreement goldAgreement = goldUpgradeFlow != null ? goldUpgradeFlow.getGoldAgreement() : null;
        replaceFragment(LegacyGoldUpgradeSubmissionFragment.INSTANCE.newInstance((Parcelable) new GoldUpgradeSubmissionFragmentContract.Key(uuid, getLoggingContext(), new Screen(Screen.Name.MARGIN_UPGRADE_GOLD_AGREEMENT, null, null, null, 14, null), null, null, goldUpgradeFlow != null ? goldUpgradeFlow.getPromotion() : null, CollectionsKt.listOfNotNull(goldAgreement != null ? goldAgreement.getAgreementType() : null), false, goldAgreement != null ? goldAgreement.getBackupPaymentInstrument() : null, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, null)));
    }

    @Override // com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment.Callbacks
    public void onDisclosureFailedToLoad() {
        popLastFragment();
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeSubmissionFragmentContract.Callbacks
    public void onUpgraded(GoldUpgradeOutcome outcome, boolean newToSweep, UUID planId) {
        ApiGoldUpgradeFlow.ApiGoldWelcome goldWelcome;
        ApiGoldUpgradeFlow goldUpgradeFlow;
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Intrinsics.checkNotNullParameter(planId, "planId");
        LegacyGoldUpgradeDynamicContext upgradeDynamicContext = getUpgradeDynamicContext();
        if (upgradeDynamicContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ApiGoldUpgradeFlow goldUpgradeFlow2 = upgradeDynamicContext.getGoldUpgradeFlow();
        if (goldUpgradeFlow2.getGoldConfirmation() != null) {
            LegacyGoldUpgradeDynamicContext upgradeDynamicContext2 = getUpgradeDynamicContext();
            boolean z = ((upgradeDynamicContext2 == null || (goldUpgradeFlow = upgradeDynamicContext2.getGoldUpgradeFlow()) == null) ? null : goldUpgradeFlow.getGoldSweepAgreements()) == null;
            LegacyGoldUpgradeConfirmationFragment.Companion companion = LegacyGoldUpgradeConfirmationFragment.INSTANCE;
            Context loggingContext = getLoggingContext();
            boolean z2 = newToSweep || z;
            ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation = goldUpgradeFlow2.getGoldConfirmation();
            if (goldConfirmation != null) {
                replaceFragmentWithoutAnimation(companion.newInstance((Parcelable) new GoldUpgradeConfirmationFragmentContract.Key(outcome, loggingContext, goldConfirmation, z2)));
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (newToSweep) {
            goldWelcome = goldUpgradeFlow2.getGoldWelcomeSweep();
            if (goldWelcome == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            goldWelcome = goldUpgradeFlow2.getGoldWelcome();
        }
        replaceFragmentWithoutAnimation(LegacyGoldUpgradeWelcomeFragment.INSTANCE.newInstance((Parcelable) new LegacyGoldUpgradeWelcomeFragment.Args(outcome, getLoggingContext(), goldWelcome)));
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeConfirmationFragmentContract.Callbacks
    public void onClickConfirmationCta(boolean isSweepEnabled, boolean isActionHandled) {
        if (isActionHandled) {
            finishWithComplete(true);
            return;
        }
        LegacyGoldUpgradeDynamicContext upgradeDynamicContext = getUpgradeDynamicContext();
        ApiGoldUpgradeFlow.ApiGoldSuggestedAction goldSuggestedActionNoSweep = null;
        ApiGoldUpgradeFlow goldUpgradeFlow = upgradeDynamicContext != null ? upgradeDynamicContext.getGoldUpgradeFlow() : null;
        if (CollectionsKt.listOf((Object[]) new String[]{"post_deposit_hook", "post_deposit_upsell_page"}).contains(getProfileId())) {
            goToGoldHub();
            return;
        }
        if (isSweepEnabled) {
            if (goldUpgradeFlow != null) {
                goldSuggestedActionNoSweep = goldUpgradeFlow.getGoldSuggestedAction();
            }
        } else if (goldUpgradeFlow != null) {
            goldSuggestedActionNoSweep = goldUpgradeFlow.getGoldSuggestedActionNoSweep();
        }
        if (goldSuggestedActionNoSweep != null) {
            replaceFragment(LegacyGoldUpgradeSuggestedActionFragment.INSTANCE.newInstance((Parcelable) new LegacyGoldUpgradeSuggestedActionFragment.Args(getLoggingContext(), goldSuggestedActionNoSweep)));
        } else {
            goToGoldHub();
        }
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeConfirmationFragmentContract.Callbacks
    public void onClickConfirmationFailedCta() {
        onConfirmationFailedCtaClicked();
    }

    @Override // com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSuggestedActionFragment.Callbacks
    public void onClickSuggestedActionPrimaryCta(GenericAction action) {
        if (action instanceof GenericAction.Deeplink) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
            finishWithComplete(true);
            return;
        }
        if (!(action instanceof GenericAction.Dismiss) && !(action instanceof GenericAction.InfoAlert) && action != null) {
            throw new NoWhenBranchMatchedException();
        }
        goToGoldHub();
    }

    @Override // com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSuggestedActionFragment.Callbacks
    public void onClickSuggestedActionSecondaryCta(GenericAction action) {
        if (action instanceof GenericAction.Deeplink) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
            finishWithComplete(true);
            return;
        }
        goToGoldHub();
    }

    private final void goToGoldHub() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GoldSettingsIntentKey(false, false, null, 7, null), null, false, null, null, 60, null);
        finishWithComplete(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof GoldLevel2PromoFragment) || (currentFragment instanceof LegacyGoldUpgradeWelcomeFragment) || (currentFragment instanceof LegacyGoldUpgradeValuePropSduiFragment) || (currentFragment instanceof LegacyGoldUpgradeValuePropsFragment) || (currentFragment instanceof LegacyGoldUpgradeGoldDaysValuePropsFragment) || (currentFragment instanceof LegacyGoldUpgradeConfirmationFragment) || (currentFragment instanceof LegacyGoldUpgradeSuggestedActionFragment)) {
            getUserLeapManager().setPendingSurvey(Survey.GOLD_UPGRADE_DROP_OFF);
            finishWithCancel();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeFragment.Callbacks
    public void onConfirmationButtonClicked(boolean isSuccess, DeeplinkAction deepLinkAction) {
        String uri;
        AnalyticsLogger analytics = getAnalytics();
        if (deepLinkAction == null || (uri = deepLinkAction.getUri()) == null) {
            uri = "done";
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, AnalyticsStrings.BUTTON_GROUP_GOLD_CONGRATULATIONS, uri, null, null, null, null, null, getProfileId(), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        if (deepLinkAction != null) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(deepLinkAction.getUri()), null, null, false, null, 60, null);
        }
        finishWithComplete(isSuccess);
    }

    @Override // com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeFragment.Callbacks
    public void onConfirmationFailedCtaClicked() {
        this.finishHandler.post(new Runnable() { // from class: com.robinhood.android.gold.upgrade.GoldUpgradeEntrypointFragment.onConfirmationFailedCtaClicked.1
            @Override // java.lang.Runnable
            public final void run() {
                GoldUpgradeEntrypointFragment.this.finishWithCancel();
            }
        });
    }

    private final void finishWithComplete(final boolean isSuccess) {
        this.finishHandler.post(new Runnable() { // from class: com.robinhood.android.gold.upgrade.GoldUpgradeEntrypointFragment.finishWithComplete.1
            @Override // java.lang.Runnable
            public final void run() {
                FragmentActivity activity = GoldUpgradeEntrypointFragment.this.getActivity();
                if (activity != null) {
                    NavigationActivityResultContract3.finishWithResult(activity, new GoldUpgradeContract.Result.Completed(isSuccess));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithCancel() {
        this.finishHandler.post(new Runnable() { // from class: com.robinhood.android.gold.upgrade.GoldUpgradeEntrypointFragment.finishWithCancel.1
            @Override // java.lang.Runnable
            public final void run() {
                FragmentActivity activity = GoldUpgradeEntrypointFragment.this.getActivity();
                if (activity != null) {
                    NavigationActivityResultContract3.finishWithResult(activity, GoldUpgradeContract.Result.Canceled.INSTANCE);
                }
            }
        });
    }

    private final void navigateToUpdateApp() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, null, null, 60, null);
    }

    /* compiled from: GoldUpgradeEntrypointFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/GoldUpgradeEntrypointFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/gold/upgrade/GoldUpgradeEntrypointFragment;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeFragmentKey;", "<init>", "()V", "MARGIN_REQUEST_CODE", "", "createInitialFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "goldUpgradeFlow", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "shownInTab", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<GoldUpgradeEntrypointFragment, GoldUpgradeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GoldUpgradeFragmentKey goldUpgradeFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, goldUpgradeFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public GoldUpgradeFragmentKey getArgs(GoldUpgradeEntrypointFragment goldUpgradeEntrypointFragment) {
            return (GoldUpgradeFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, goldUpgradeEntrypointFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldUpgradeEntrypointFragment newInstance(GoldUpgradeFragmentKey goldUpgradeFragmentKey) {
            return (GoldUpgradeEntrypointFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, goldUpgradeFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldUpgradeEntrypointFragment goldUpgradeEntrypointFragment, GoldUpgradeFragmentKey goldUpgradeFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, goldUpgradeEntrypointFragment, goldUpgradeFragmentKey);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BaseFragment createInitialFragment(ApiGoldUpgradeFlow goldUpgradeFlow, Context loggingContext, boolean shownInTab) {
            ApiGoldUpgradeFlow.ApiGoldDaysValueProps goldDaysValueProps = goldUpgradeFlow.getGoldDaysValueProps();
            StandardPageTemplate<GoldUpgradeValuePropsAction> goldValuePropsSdui = goldUpgradeFlow.getGoldValuePropsSdui();
            ApiGoldUpgradeFlow.ApiGoldValueProps goldValueProps = goldUpgradeFlow.getGoldValueProps();
            if (goldDaysValueProps != null) {
                return (BaseFragment) LegacyGoldUpgradeGoldDaysValuePropsFragment.INSTANCE.newInstance((Parcelable) new LegacyGoldUpgradeGoldDaysValuePropsFragment.Args(goldDaysValueProps, loggingContext));
            }
            if (goldValuePropsSdui != null) {
                return (BaseFragment) LegacyGoldUpgradeValuePropSduiFragment.INSTANCE.newInstance((Parcelable) new LegacyGoldUpgradeValuePropSduiFragment.Args(goldValuePropsSdui, loggingContext, shownInTab));
            }
            if (goldValueProps != null) {
                return (BaseFragment) LegacyGoldUpgradeValuePropsFragment.INSTANCE.newInstance((Parcelable) new LegacyGoldUpgradeValuePropsFragment.Args(goldValueProps, loggingContext));
            }
            return null;
        }
    }
}
