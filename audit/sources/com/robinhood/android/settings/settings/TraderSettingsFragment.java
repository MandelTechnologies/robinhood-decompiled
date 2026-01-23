package com.robinhood.android.settings.settings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.common.mcduckling.p084ui.LocationProtectionDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.gold.contracts.GoldDowngradeIntentKey;
import com.robinhood.android.lib.cashdowngrade.CashDowngradeResultContract;
import com.robinhood.android.lib.cashdowngrade.CashDowngradeResultContract2;
import com.robinhood.android.models.cashdowngrade.CashDowngradeResult;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.settings.models.api.ApiSettingsPage;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.feature.lib.daytrade.util.SeenDayTradeInfoPref;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.settings.contracts.SettingsPage;
import com.robinhood.shared.settings.iibsettings.BaseSettingsFragment;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitives;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TraderSettingsFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020!H\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020(H\u0016J\u0010\u0010/\u001a\u00020!2\u0006\u0010)\u001a\u000200H\u0016J\b\u00101\u001a\u00020!H\u0016J\b\u00102\u001a\u00020!H\u0016J \u00103\u001a\u00020!2\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u000206\u0012\b\u0012\u0006\u0012\u0002\b\u00030705H\u0002J\u0010\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020(H\u0002J\u0010\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020(H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/settings/settings/TraderSettingsFragment;", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment;", "Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "seenDayTradeInfoPref", "Lcom/robinhood/prefs/BooleanPreference;", "getSeenDayTradeInfoPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setSeenDayTradeInfoPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "arguments", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment$Args;", "getArguments", "()Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment$Args;", "duxo", "Lcom/robinhood/android/settings/settings/TraderSettingsDuxo;", "getDuxo", "()Lcom/robinhood/android/settings/settings/TraderSettingsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "switchToCashAccountLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "goldDowngradeLauncher", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "handleDeeplinkAction", "", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;", "handleToggleClick", "toggleItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ToggleItem;", "newToggleState", "handleGoldDowngradeAction", "Lcom/robinhood/models/serverdriven/db/GenericAction$GoldDowngradeAction;", "onLocationProtectionConfirmed", "onLocationProtectionDismissed", "launchSwitchToCashAccountSassyFlow", "inputParams", "", "", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "handleLocationProtectionToggle", "enableProtection", "setLocationProtection", "enabled", "Companion", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class TraderSettingsFragment extends BaseSettingsFragment implements LocationProtectionDialogFragment.Callbacks {
    public static final String CASH_MANAGEMENT_LOCATION_PROTECTION_ITEM_ID = "cash_management_location_protection_row";
    private static final String DAY_TRADE_SETTINGS_TOGGLE_ITEM_ID = "day_trade_settings_toggle";
    private static final String FLOW_ID_QUERY_NAME = "flow_id";
    private static final String SELF_SERVE_HOST_NAME = "self_serve";
    private static final String SWITCH_TO_CASH_ACCOUNT_FLOW_ID = "brokerage.switch-to-cash-account";

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, TraderSettingsDuxo.class);
    private final ActivityResultLauncher<Intent> goldDowngradeLauncher;

    @SeenDayTradeInfoPref
    public BooleanPreference seenDayTradeInfoPref;
    private final ActivityResultLauncher<Intent> switchToCashAccountLauncher;
    public SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.mcduckling.ui.LocationProtectionDialogFragment.Callbacks
    public void onLocationProtectionDismissed() {
    }

    public TraderSettingsFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new CashDowngradeResultContract(), new ActivityResultCallback() { // from class: com.robinhood.android.settings.settings.TraderSettingsFragment$switchToCashAccountLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(CashDowngradeResult cashDowngradeResult) {
                if (cashDowngradeResult == null || !cashDowngradeResult.getSwitched()) {
                    return;
                }
                this.this$0.getDuxo().refreshAccountsAndIacBanners();
                this.this$0.popNearestParentBackStack();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.switchToCashAccountLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.settings.settings.TraderSettingsFragment$goldDowngradeLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.getUserLeapManager().setPendingSurvey(Survey.GOLD_DOWNGRADE);
                    this.this$0.requireActivity().onBackPressed();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.goldDowngradeLauncher = activityResultLauncherRegisterForActivityResult2;
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

    public final BooleanPreference getSeenDayTradeInfoPref() {
        BooleanPreference booleanPreference = this.seenDayTradeInfoPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seenDayTradeInfoPref");
        return null;
    }

    public final void setSeenDayTradeInfoPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.seenDayTradeInfoPref = booleanPreference;
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsFragment
    public BaseSettingsFragment.Args getArguments() {
        return (BaseSettingsFragment.Args) INSTANCE.getArgs((Fragment) this);
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsFragment
    public TraderSettingsDuxo getDuxo() {
        return (TraderSettingsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (isInTabFragment()) {
            return;
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.settings.TraderSettingsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TraderSettingsFragment.onResume$lambda$1(this.f$0, (TraderSettingsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(TraderSettingsFragment traderSettingsFragment, TraderSettingsViewState state) throws Throwable {
        Throwable thConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        ApiSettingsPage.Theme theme = state.getTheme();
        ApiSettingsPage settingsPage = state.getSettingsPage();
        Resources resources = traderSettingsFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        traderSettingsFragment.bind(theme, settingsPage, state.getSettingsItems(resources), state.getShowSettingsPlaceholder());
        UiEvent<Throwable> uiError = state.getUiError();
        if (uiError != null && (thConsume = uiError.consume()) != null) {
            traderSettingsFragment.handleError(thConsume);
        }
        UiEvent<Unit> managedAccountError = state.getManagedAccountError();
        if ((managedAccountError != null ? managedAccountError.consume() : null) != null) {
            traderSettingsFragment.bindComposeView(ComposableLambda3.composableLambdaInstance(-916547274, true, new TraderSettingsFragment3(traderSettingsFragment)));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsFragment
    public boolean handleDeeplinkAction(GenericAction.DeeplinkAction action) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(action, "action");
        String host = action.getUri().getHost();
        String queryParameter2 = action.getUri().getQueryParameter(FLOW_ID_QUERY_NAME);
        if (Intrinsics.areEqual(host, SELF_SERVE_HOST_NAME) && Intrinsics.areEqual(queryParameter2, SWITCH_TO_CASH_ACCOUNT_FLOW_ID)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : action.getUri().getQueryParameterNames()) {
                if (!Intrinsics.areEqual(str, FLOW_ID_QUERY_NAME) && (queryParameter = action.getUri().getQueryParameter(str)) != null) {
                    linkedHashMap.put(str, JsonPrimitives.toJsonPrimitive(queryParameter));
                }
            }
            getDuxo().logTapSwitchToCashAccount();
            launchSwitchToCashAccountSassyFlow(linkedHashMap);
            return true;
        }
        return super.handleDeeplinkAction(action);
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsFragment
    public boolean handleToggleClick(TypedSettingsItem.ToggleItem toggleItem, boolean newToggleState) {
        Intrinsics.checkNotNullParameter(toggleItem, "toggleItem");
        if (Intrinsics.areEqual(toggleItem.getId(), CASH_MANAGEMENT_LOCATION_PROTECTION_ITEM_ID)) {
            handleLocationProtectionToggle(newToggleState);
            return true;
        }
        if (Intrinsics.areEqual(toggleItem.getId(), DAY_TRADE_SETTINGS_TOGGLE_ITEM_ID) && !getSeenDayTradeInfoPref().get()) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            startActivity(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new LegacyIntentKey.DayTradeInfo(true, getArguments().getAccountNumber()), null, false, 12, null));
            return true;
        }
        return super.handleToggleClick(toggleItem, newToggleState);
    }

    @Override // com.robinhood.shared.settings.iibsettings.BaseSettingsFragment
    public void handleGoldDowngradeAction(GenericAction.GoldDowngradeAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ActivityResultLauncher<Intent> activityResultLauncher = this.goldDowngradeLauncher;
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new GoldDowngradeIntentKey(false, 1, null), null, false, 12, null));
    }

    @Override // com.robinhood.android.common.mcduckling.ui.LocationProtectionDialogFragment.Callbacks
    public void onLocationProtectionConfirmed() {
        setLocationProtection(true);
    }

    private final void launchSwitchToCashAccountSassyFlow(Map<String, ? extends JsonPrimitive<?>> inputParams) {
        ActivityResultLauncher<Intent> activityResultLauncher = this.switchToCashAccountLauncher;
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(CashDowngradeResultContract2.createIntentForCashDowngrade(navigator, contextRequireContext, inputParams));
    }

    private final void handleLocationProtectionToggle(boolean enableProtection) {
        if (enableProtection) {
            LocationProtectionDialogFragment.INSTANCE.showLocationProtectionConfirmation(this);
        } else {
            setLocationProtection(false);
        }
    }

    private final void setLocationProtection(boolean enabled) {
        RdsToggleView toggleView = getToggleView();
        if (toggleView != null) {
            toggleView.setLoading(true);
        }
        getDuxo().updateLocationProtection(enabled);
    }

    /* compiled from: TraderSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/TraderSettingsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/settings/contracts/SettingsPage;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment;", "Lcom/robinhood/shared/settings/iibsettings/BaseSettingsFragment$Args;", "<init>", "()V", "FLOW_ID_QUERY_NAME", "", "SELF_SERVE_HOST_NAME", "SWITCH_TO_CASH_ACCOUNT_FLOW_ID", "CASH_MANAGEMENT_LOCATION_PROTECTION_ITEM_ID", "DAY_TRADE_SETTINGS_TOGGLE_ITEM_ID", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<SettingsPage>, FragmentWithArgsCompanion<BaseSettingsFragment, BaseSettingsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BaseSettingsFragment.Args getArgs(BaseSettingsFragment baseSettingsFragment) {
            return (BaseSettingsFragment.Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, baseSettingsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BaseSettingsFragment newInstance(BaseSettingsFragment.Args args) {
            return (BaseSettingsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BaseSettingsFragment baseSettingsFragment, BaseSettingsFragment.Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, baseSettingsFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SettingsPage key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return TraderSettingsFragment.INSTANCE.newInstance((Parcelable) new BaseSettingsFragment.Args(key.getPageId(), key.getAccountNumber(), key.getEntryPointIdentifier()));
        }
    }
}
