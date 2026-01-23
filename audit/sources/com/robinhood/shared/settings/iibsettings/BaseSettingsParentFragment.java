package com.robinhood.shared.settings.iibsettings;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.RhShortcut;
import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.serverdriven.api.ApiGenericAction;
import com.robinhood.shared.questionnaire.contracts.InvestmentProfileSettings;
import com.robinhood.shared.settings.contracts.AppearancePreferencesFragmentKey;
import com.robinhood.shared.settings.contracts.Constants6;
import com.robinhood.shared.settings.contracts.NotificationSettings4ComposeFragmentKey;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey3;
import com.robinhood.shared.settings.contracts.NotificationSettingsMutedFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.shared.settings.contracts.SettingsPage;
import com.robinhood.shared.settings.contracts.ThemePreferenceBottomSheetDialogFragmentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BaseSettingsParentFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u0017H\u0016J\u000e\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020*J\b\u00105\u001a\u00020*H\u0016J\u0010\u00106\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\u0017H&J\u0012\u00107\u001a\u00020*2\b\u0010#\u001a\u0004\u0018\u00010\u001eH&J\b\u00108\u001a\u00020*H&J\b\u00109\u001a\u00020*H&J\b\u0010:\u001a\u00020*H\u0002J\b\u0010;\u001a\u00020*H\u0002J\b\u0010<\u001a\u00020*H\u0002J\b\u0010=\u001a\u00020*H\u0002J\u0010\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020@H\u0004J\"\u0010A\u001a\u00020*2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0017H\u0002J\u001a\u0010B\u001a\u00020*2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u0004\u0018\u00010\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010#\u001a\u0004\u0018\u00010\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0012\u0010%\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0019R\u0014\u0010'\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006C"}, m3636d2 = {"Lcom/robinhood/shared/settings/iibsettings/BaseSettingsParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/settings/iibsettings/AppearancePreferencesCallbacks;", "Lcom/robinhood/shared/settings/iibsettings/NotificationSettingsCallbacks;", "<init>", "()V", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "getShortcutManager", "()Lcom/robinhood/android/common/util/RhShortcutManager;", "setShortcutManager", "(Lcom/robinhood/android/common/util/RhShortcutManager;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "launchType", "Lcom/robinhood/shared/settings/contracts/SettingsLaunchType;", "getLaunchType", "()Lcom/robinhood/shared/settings/contracts/SettingsLaunchType;", "fromGoldUpgrade", "", "getFromGoldUpgrade", "()Z", "preventUpNavigation", "getPreventUpNavigation", "isFromDeeplink", "subPage", "", "getSubPage", "()Ljava/lang/String;", "itemId", "getItemId", "accountNumber", "getAccountNumber", "showAccountSwitcher", "getShowAccountSwitcher", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onNotificationSettings4SubPageClicked", "subPageReference", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "onNotificationSettings4ActionTriggered", "action", "Lcom/robinhood/models/serverdriven/api/ApiGenericAction;", "onNotificationSettings4MutedClicked", "onThemePreferenceClicked", "launchOptionsSettings", "launchDayTradeSettings", "launchMarginSettings", "launchCashManagementSettings", "onNotificationSettingsClicked", "launchUpdateAccount", "launchAppearancePreferences", "launchAutoPlayPreferences", "setOrReplaceFragment", "fragment", "Landroidx/fragment/app/Fragment;", "onInvestmentProfileClick", "handleLaunchType", "lib-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseSettingsParentFragment extends BaseFragment implements AppearancePreferencesCallbacks, NotificationSettingsCallbacks {
    public static final int $stable = 8;
    public ExperimentsStore experimentsStore;
    public RhShortcutManager shortcutManager;
    private final boolean useDesignSystemToolbar;

    /* compiled from: BaseSettingsParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingsFragmentKey3.values().length];
            try {
                iArr[SettingsFragmentKey3.LAUNCH_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingsFragmentKey3.LAUNCH_UPDATE_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SettingsFragmentKey3.LAUNCH_INVESTMENT_PROFILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SettingsFragmentKey3.LAUNCH_NOTIFICATION_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SettingsFragmentKey3.LAUNCH_OPTIONS_SETTINGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SettingsFragmentKey3.LAUNCH_CASH_MANAGEMENT_SETTINGS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SettingsFragmentKey3.LAUNCH_APP_APPEARANCE_SETTINGS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SettingsFragmentKey3.LAUNCH_APP_AUTO_PLAY_SETTINGS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SettingsFragmentKey3.LAUNCH_DAY_TRADE_SETTINGS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SettingsFragmentKey3.LAUNCH_MARGIN_SETTINGS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abstract String getAccountNumber();

    public abstract boolean getFromGoldUpgrade();

    public abstract String getItemId();

    public abstract SettingsFragmentKey3 getLaunchType();

    public abstract boolean getPreventUpNavigation();

    public abstract boolean getShowAccountSwitcher();

    public abstract String getSubPage();

    public abstract boolean isFromDeeplink();

    public abstract void launchCashManagementSettings();

    public abstract void launchDayTradeSettings(String accountNumber);

    public abstract void launchMarginSettings();

    public abstract void launchOptionsSettings(boolean isFromDeeplink);

    public BaseSettingsParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
    }

    public final RhShortcutManager getShortcutManager() {
        RhShortcutManager rhShortcutManager = this.shortcutManager;
        if (rhShortcutManager != null) {
            return rhShortcutManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shortcutManager");
        return null;
    }

    public final void setShortcutManager(RhShortcutManager rhShortcutManager) {
        Intrinsics.checkNotNullParameter(rhShortcutManager, "<set-?>");
        this.shortcutManager = rhShortcutManager;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getShortcutManager().reportUse(RhShortcut.SETTINGS);
        if (savedInstanceState == null) {
            handleLaunchType(getAccountNumber(), getLaunchType());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getPreventUpNavigation()) {
            return false;
        }
        return super.onBackPressed();
    }

    /* compiled from: BaseSettingsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment$onNotificationSettings4SubPageClicked$1", m3645f = "BaseSettingsParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment$onNotificationSettings4SubPageClicked$1 */
    static final class C397851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NotificationSettings4FragmentKey3 $subPageReference;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C397851(NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, Continuation<? super C397851> continuation) {
            super(2, continuation);
            this.$subPageReference = notificationSettings4FragmentKey3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSettingsParentFragment.this.new C397851(this.$subPageReference, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C397851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            FragmentKey notificationSettings4FragmentKey;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(BaseSettingsParentFragment.this.getExperimentsStore(), new Experiment[]{NotificationSettingsComposeRewrite.INSTANCE}, false, null, 6, null);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamStateFlow$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zAreEqual = Intrinsics.areEqual(obj, boxing.boxBoolean(true));
            BaseSettingsParentFragment baseSettingsParentFragment = BaseSettingsParentFragment.this;
            Navigator navigator = baseSettingsParentFragment.getNavigator();
            if (zAreEqual) {
                notificationSettings4FragmentKey = new NotificationSettings4ComposeFragmentKey(this.$subPageReference);
            } else {
                notificationSettings4FragmentKey = new NotificationSettings4FragmentKey(this.$subPageReference);
            }
            baseSettingsParentFragment.replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, notificationSettings4FragmentKey, null, 2, null));
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.shared.settings.iibsettings.NotificationSettingsCallbacks
    public final void onNotificationSettings4SubPageClicked(NotificationSettings4FragmentKey3 subPageReference) {
        Intrinsics.checkNotNullParameter(subPageReference, "subPageReference");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C397851(subPageReference, null), 3, null);
    }

    @Override // com.robinhood.shared.settings.iibsettings.NotificationSettingsCallbacks
    public final void onNotificationSettings4ActionTriggered(ApiGenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof ApiGenericAction.ApiDeeplinkAction) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((ApiGenericAction.ApiDeeplinkAction) action).getAction_data().getUri(), Boolean.FALSE, null, false, null, 56, null);
            return;
        }
        throw new IllegalStateException(("Unsupported button action: " + Reflection.getOrCreateKotlinClass(action.getClass())).toString());
    }

    @Override // com.robinhood.shared.settings.iibsettings.NotificationSettingsCallbacks
    public final void onNotificationSettings4MutedClicked() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), NotificationSettingsMutedFragmentKey.INSTANCE, null, 2, null));
    }

    @Override // com.robinhood.shared.settings.iibsettings.AppearancePreferencesCallbacks
    public void onThemePreferenceClicked() {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), ThemePreferenceBottomSheetDialogFragmentKey.INSTANCE, null, 2, null).show(getParentFragmentManager(), "themePreferences");
    }

    /* compiled from: BaseSettingsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment$onNotificationSettingsClicked$1", m3645f = "BaseSettingsParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.settings.iibsettings.BaseSettingsParentFragment$onNotificationSettingsClicked$1 */
    static final class C397861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C397861(Continuation<? super C397861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSettingsParentFragment.this.new C397861(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C397861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FragmentKey notificationSettings4FragmentKey;
            FragmentKey notificationSettings4FragmentKey2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(BaseSettingsParentFragment.this.getExperimentsStore(), new Experiment[]{NotificationSettingsComposeRewrite.INSTANCE}, false, null, 6, null);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamStateFlow$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zAreEqual = Intrinsics.areEqual(obj, boxing.boxBoolean(true));
            String subPage = BaseSettingsParentFragment.this.getSubPage();
            switch (subPage.hashCode()) {
                case -462094004:
                    if (subPage.equals(NotificationSettings4FragmentKey.SETTINGS_MESSAGES)) {
                        BaseSettingsParentFragment baseSettingsParentFragment = BaseSettingsParentFragment.this;
                        Navigator navigator = baseSettingsParentFragment.getNavigator();
                        if (zAreEqual) {
                            notificationSettings4FragmentKey2 = new NotificationSettings4ComposeFragmentKey(new NotificationSettings4FragmentKey3.FromId(BaseSettingsParentFragment.this.getSubPage(), BaseSettingsParentFragment.this.getItemId()));
                        } else {
                            notificationSettings4FragmentKey2 = new NotificationSettings4FragmentKey(new NotificationSettings4FragmentKey3.FromId(BaseSettingsParentFragment.this.getSubPage(), BaseSettingsParentFragment.this.getItemId()));
                        }
                        baseSettingsParentFragment.setOrReplaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, notificationSettings4FragmentKey2, null, 2, null));
                        break;
                    } else {
                        BaseSettingsParentFragment baseSettingsParentFragment2 = BaseSettingsParentFragment.this;
                        Navigator navigator2 = baseSettingsParentFragment2.getNavigator();
                        if (zAreEqual) {
                            notificationSettings4FragmentKey = new NotificationSettings4ComposeFragmentKey(null);
                        } else {
                            notificationSettings4FragmentKey = new NotificationSettings4FragmentKey(null);
                        }
                        baseSettingsParentFragment2.setOrReplaceFragment(Navigator.DefaultImpls.createFragment$default(navigator2, notificationSettings4FragmentKey, null, 2, null));
                        break;
                    }
                case 3452698:
                    if (subPage.equals("push")) {
                    }
                    break;
                case 96619420:
                    if (!subPage.equals("email")) {
                    }
                    break;
                case 104264043:
                    if (subPage.equals(NotificationSettings4FragmentKey.SETTINGS_MUTED)) {
                        BaseSettingsParentFragment baseSettingsParentFragment3 = BaseSettingsParentFragment.this;
                        boxing.boxInt(baseSettingsParentFragment3.replaceFragment(Navigator.DefaultImpls.createFragment$default(baseSettingsParentFragment3.getNavigator(), NotificationSettingsMutedFragmentKey.INSTANCE, null, 2, null)));
                        break;
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    private final void onNotificationSettingsClicked() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C397861(null), 3, null);
    }

    private final void launchUpdateAccount() {
        setOrReplaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new SettingsPage(Constants6.ACCOUNT_INFO_PAGE_ID, null, null, 6, null), null, 2, null));
    }

    private final void launchAppearancePreferences() {
        setOrReplaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), AppearancePreferencesFragmentKey.INSTANCE, null, 2, null));
    }

    private final void launchAutoPlayPreferences() {
        setOrReplaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), LegacyFragmentKey.AutoplaySettings.INSTANCE, null, 2, null));
    }

    protected final void setOrReplaceFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        setFragment(C11048R.id.fragment_container, fragment);
    }

    private final void onInvestmentProfileClick(String accountNumber, boolean fromGoldUpgrade, boolean showAccountSwitcher) {
        setOrReplaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new InvestmentProfileSettings(null, accountNumber, null, fromGoldUpgrade, false, false, null, false, showAccountSwitcher, false, false, null, null, 7924, null), null, 2, null));
    }

    private final void handleLaunchType(String accountNumber, SettingsFragmentKey3 launchType) {
        switch (WhenMappings.$EnumSwitchMapping$0[launchType.ordinal()]) {
            case 1:
                return;
            case 2:
                launchUpdateAccount();
                return;
            case 3:
                onInvestmentProfileClick(accountNumber, getFromGoldUpgrade(), getShowAccountSwitcher());
                return;
            case 4:
                onNotificationSettingsClicked();
                return;
            case 5:
                launchOptionsSettings(isFromDeeplink());
                return;
            case 6:
                launchCashManagementSettings();
                return;
            case 7:
                launchAppearancePreferences();
                return;
            case 8:
                launchAutoPlayPreferences();
                return;
            case 9:
                launchDayTradeSettings(accountNumber);
                return;
            case 10:
                launchMarginSettings();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
