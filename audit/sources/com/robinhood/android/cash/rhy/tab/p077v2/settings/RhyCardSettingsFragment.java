package com.robinhood.android.cash.rhy.tab.p077v2.settings;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.cash.cushion.dialog.CashCushionSettingDialogFragment;
import com.robinhood.android.cash.cushion.error.CashCushionUpdateErrorHandler;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.databinding.FragmentRhyCardSettingsBinding;
import com.robinhood.android.cash.rhy.tab.p077v2.card.RhyDebitCardView;
import com.robinhood.android.cash.rhy.tab.p077v2.settings.RhySettingsViewState;
import com.robinhood.android.common.mcduckling.p084ui.CardLockDialogFragment;
import com.robinhood.android.common.mcduckling.p084ui.LocationProtectionDialogFragment;
import com.robinhood.android.common.mcduckling.p084ui.detail.card.SecondaryAuthenticationFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.googlepay.GooglePayPushTokenizeManager;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.p320db.mcduckling.CardImageConfiguration;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RhyCardSettingsFragment.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001VB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u00102\u001a\u00020)2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020)2\u0006\u00106\u001a\u000207H\u0016J\u0012\u00108\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u001a\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020=2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010>\u001a\u00020)H\u0016J\b\u0010?\u001a\u00020)H\u0016J\u0010\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020)H\u0016J\b\u0010D\u001a\u00020)H\u0016J\b\u0010E\u001a\u00020)H\u0016J\b\u0010F\u001a\u00020)H\u0016J\u0010\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020!H\u0016J\u0010\u0010I\u001a\u00020)2\u0006\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u00020)H\u0002J\u0010\u0010M\u001a\u00020)2\u0006\u0010N\u001a\u00020OH\u0016J\t\u0010P\u001a\u00020!H\u0096\u0001R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R \u0010&\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020)0'X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010*\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020)0'X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010,\u001a\u00020!2\u0006\u0010+\u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b-\u0010#\"\u0004\b.\u0010/R\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RX\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyCardSettingsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", "Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment$Callbacks;", "Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Callbacks;", "Lcom/robinhood/android/cash/rhy/tab/v2/card/RhyDebitCardView$Callbacks;", "Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment$Callbacks;", "<init>", "()V", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "binding", "Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyCardSettingsBinding;", "getBinding", "()Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyCardSettingsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "googlePayPushTokenizeManager", "Lcom/robinhood/android/googlepay/GooglePayPushTokenizeManager;", "changePinState", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState$Visible;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "launchCardNumberSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "launchWalletProvisioningSuv", "<set-?>", "handledAction", "getHandledAction", "setHandledAction", "(Z)V", "handledAction$delegate", "Lkotlin/properties/ReadWriteProperty;", "onAttach", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onStop", "onSecondaryAuthenticationSuccess", "requestCode", "", "onLockConfirmed", "onUnlockConfirmed", "onLocationProtectionConfirmed", "onLocationProtectionDismissed", "onSetCashCushionStatus", "enable", "bind", "state", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState;", "changePin", "onCardImageConfigurationChanged", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/mcduckling/CardImageConfiguration;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyCardSettingsFragment extends BaseFragment implements RegionGated, SecondaryAuthenticationFragment.Callbacks, CardLockDialogFragment.Callbacks, LocationProtectionDialogFragment.Callbacks, RhyDebitCardView.Callbacks, CashCushionSettingDialogFragment.Callbacks {
    private static final int REQUEST_PUSH_TOKENIZE = 3;
    private static final int REQUEST_SECONDARY_AUTH_CARD_NUMBER = 1;
    private static final int REQUEST_SECONDARY_AUTH_CHANGE_PIN = 2;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private RhySettingsViewState.ChangePinState.Visible changePinState;
    private final boolean childFragmentsShouldNotConfigureToolbar;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GooglePayPushTokenizeManager googlePayPushTokenizeManager;

    /* renamed from: handledAction$delegate, reason: from kotlin metadata */
    private final Interfaces3 handledAction;
    private final Function2<UUID, Boolean, Unit> launchCardNumberSuv;
    private final Function2<UUID, Boolean, Unit> launchWalletProvisioningSuv;
    public ScreenProtectManager screenProtectManager;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyCardSettingsFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyCardSettingsBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RhyCardSettingsFragment.class, "handledAction", "getHandledAction()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhyCardSettingsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyFragmentKey.RhyCardSettings.Action.values().length];
            try {
                iArr[LegacyFragmentKey.RhyCardSettings.Action.UNLOCK_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyFragmentKey.RhyCardSettings.Action.SHOW_CARD_NUMBER.ordinal()] = 2;
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

    @Override // com.robinhood.android.common.mcduckling.ui.LocationProtectionDialogFragment.Callbacks
    public void onLocationProtectionDismissed() {
    }

    public RhyCardSettingsFragment() {
        super(C10285R.layout.fragment_rhy_card_settings);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, RhyCardSettingsFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RhySettingsDuxo.class);
        this.googlePayPushTokenizeManager = new GooglePayPushTokenizeManager();
        this.useDesignSystemToolbar = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
        this.launchCardNumberSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyCardSettingsFragment.launchCardNumberSuv$lambda$1(this.f$0);
            }
        }, (Function0) null, 4, (Object) null);
        this.launchWalletProvisioningSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyCardSettingsFragment.launchWalletProvisioningSuv$lambda$3(this.f$0);
            }
        }, (Function0) null, 4, (Object) null);
        this.handledAction = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);
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

    private final FragmentRhyCardSettingsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyCardSettingsBinding) value;
    }

    private final RhySettingsDuxo getDuxo() {
        return (RhySettingsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchCardNumberSuv$lambda$1(RhyCardSettingsFragment rhyCardSettingsFragment) {
        rhyCardSettingsFragment.getDuxo().setShowCardNumber(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchWalletProvisioningSuv$lambda$3(RhyCardSettingsFragment rhyCardSettingsFragment) {
        rhyCardSettingsFragment.getDuxo().getPushTokenizeEvent();
        return Unit.INSTANCE;
    }

    private final boolean getHandledAction() {
        return ((Boolean) this.handledAction.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setHandledAction(boolean z) {
        this.handledAction.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C10285R.string.rhy_card_settings_title));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().streamCardSettings();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getViewLifecycleOwner().getLifecycle().addObserver(this.googlePayPushTokenizeManager);
        final RdsToggleView showCardNumberToggle = getBinding().rhyCardSettingsLayout.getShowCardNumberToggle();
        showCardNumberToggle.onCheckedChanged(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyCardSettingsFragment.onViewCreated$lambda$6$lambda$5(showCardNumberToggle, this, ((Boolean) obj).booleanValue());
            }
        });
        final RdsToggleView spendAlertToggle = getBinding().rhyCardSettingsLayout.getSpendAlertToggle();
        spendAlertToggle.onCheckedChanged(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyCardSettingsFragment.onViewCreated$lambda$8$lambda$7(spendAlertToggle, this, ((Boolean) obj).booleanValue());
            }
        });
        final RdsToggleView cashCushionToggle = getBinding().rhyCardSettingsLayout.getCashCushionToggle();
        cashCushionToggle.onPrimaryTextClick(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyCardSettingsFragment.onViewCreated$lambda$11$lambda$9(this.f$0);
            }
        });
        cashCushionToggle.onCheckedChanged(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyCardSettingsFragment.onViewCreated$lambda$11$lambda$10(cashCushionToggle, this, ((Boolean) obj).booleanValue());
            }
        });
        final RdsToggleView settingsLockCardToggle = getBinding().rhyCardSettingsLayout.getSettingsLockCardToggle();
        settingsLockCardToggle.onCheckedChanged(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyCardSettingsFragment.onViewCreated$lambda$13$lambda$12(settingsLockCardToggle, this, ((Boolean) obj).booleanValue());
            }
        });
        final RdsToggleView locationProtectionToggle = getBinding().rhyCardSettingsLayout.getLocationProtectionToggle();
        locationProtectionToggle.onCheckedChanged(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyCardSettingsFragment.onViewCreated$lambda$15$lambda$14(locationProtectionToggle, this, ((Boolean) obj).booleanValue());
            }
        });
        OnClickListeners.onClick(getBinding().rhyCardSettingsLayout.getGooglePayRow(), new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyCardSettingsFragment.onViewCreated$lambda$16(this.f$0);
            }
        });
        getBinding().rhyCardSettingsDebitCardView.setCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5(RdsToggleView rdsToggleView, RhyCardSettingsFragment rhyCardSettingsFragment, boolean z) throws Resources.NotFoundException {
        if (z) {
            rdsToggleView.setCheckedProgrammatically(false);
            SecondaryAuthenticationFragment secondaryAuthenticationFragmentNewInstance = SecondaryAuthenticationFragment.INSTANCE.newInstance(rhyCardSettingsFragment, ViewsKt.getString(rdsToggleView, C10285R.string.rhy_card_settings_show_card_number_auth_title), 1);
            FragmentManager parentFragmentManager = rhyCardSettingsFragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            secondaryAuthenticationFragmentNewInstance.show(parentFragmentManager, "showCardNumbersAuthenticationDialog");
        } else {
            rhyCardSettingsFragment.getDuxo().setShowCardNumber(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8$lambda$7(RdsToggleView rdsToggleView, RhyCardSettingsFragment rhyCardSettingsFragment, boolean z) throws Resources.NotFoundException {
        rdsToggleView.setCheckedProgrammatically(!z);
        rhyCardSettingsFragment.getDuxo().toggleSpendAlerts(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11$lambda$9(RhyCardSettingsFragment rhyCardSettingsFragment) {
        Navigator navigator = rhyCardSettingsFragment.getNavigator();
        Context contextRequireContext = rhyCardSettingsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.CashCushionDetails("card_controls", false), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11$lambda$10(RdsToggleView rdsToggleView, RhyCardSettingsFragment rhyCardSettingsFragment, boolean z) throws Resources.NotFoundException {
        rdsToggleView.setCheckedProgrammatically(!z);
        RhySettingsDuxo duxo = rhyCardSettingsFragment.getDuxo();
        Screen.Name name = Screen.Name.RHY_SPENDING_CARD_CONTROLS;
        duxo.logCashCushionToggleTap(z, "card_controls", new Screen(name, null, null, null, 14, null));
        if (z) {
            Navigator navigator = rhyCardSettingsFragment.getNavigator();
            Context contextRequireContext = rhyCardSettingsFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.CashCushionDetails("card_controls", false), null, false, null, null, 60, null);
        } else {
            CashCushionSettingDialogFragment cashCushionSettingDialogFragment = (CashCushionSettingDialogFragment) CashCushionSettingDialogFragment.INSTANCE.newInstance((Parcelable) new CashCushionSettingDialogFragment.Args(!z, "card_controls", new Screen(name, null, null, null, 14, null)));
            FragmentManager childFragmentManager = rhyCardSettingsFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            cashCushionSettingDialogFragment.show(childFragmentManager, "cashCushionSettingDialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13$lambda$12(RdsToggleView rdsToggleView, RhyCardSettingsFragment rhyCardSettingsFragment, boolean z) throws Resources.NotFoundException {
        rdsToggleView.setCheckedProgrammatically(!z);
        if (z) {
            CardLockDialogFragment.INSTANCE.showLockConfirmation(rhyCardSettingsFragment);
        } else {
            CardLockDialogFragment.INSTANCE.showUnlockConfirmation(rhyCardSettingsFragment);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$15$lambda$14(RdsToggleView rdsToggleView, RhyCardSettingsFragment rhyCardSettingsFragment, boolean z) throws Resources.NotFoundException {
        rdsToggleView.setCheckedProgrammatically(!z);
        if (z) {
            LocationProtectionDialogFragment.INSTANCE.showLocationProtectionConfirmation(rhyCardSettingsFragment);
        } else {
            rhyCardSettingsFragment.getDuxo().toggleLocationProtection(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$16(RhyCardSettingsFragment rhyCardSettingsFragment) {
        rhyCardSettingsFragment.getDuxo().getPushTokenizeEvent();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        getBinding().rhyCardSettingsDebitCardView.showBack();
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        screenProtectManager.blockScreenSharing(contextRequireContext, ScreenProtectFlow.VIEW_CARD_NUMBER);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        screenProtectManager.setFlagSecure(fragmentActivityRequireActivity);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C103232(this));
        GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        LifecycleHost.DefaultImpls.bind$default(this, googlePayPushTokenizeManager.onDataChanged(fragmentActivityRequireActivity2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyCardSettingsFragment.onStart$lambda$18(this.f$0);
            }
        });
        if (getHandledAction()) {
            return;
        }
        LegacyFragmentKey.RhyCardSettings.Action action = ((LegacyFragmentKey.RhyCardSettings) INSTANCE.getArgs((Fragment) this)).getAction();
        int i = action == null ? -1 : WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i != -1) {
            if (i == 1) {
                setHandledAction(true);
                CardLockDialogFragment.INSTANCE.showUnlockConfirmation(this);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setHandledAction(true);
                getBinding().rhyCardSettingsLayout.getShowCardNumberToggle().setChecked(true);
            }
        }
    }

    /* compiled from: RhyCardSettingsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$onStart$2 */
    /* synthetic */ class C103232 extends FunctionReferenceImpl implements Function1<RhySettingsViewState, Unit> {
        C103232(Object obj) {
            super(1, obj, RhyCardSettingsFragment.class, "bind", "bind(Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhySettingsViewState rhySettingsViewState) throws Resources.NotFoundException {
            invoke2(rhySettingsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhySettingsViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyCardSettingsFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$18(RhyCardSettingsFragment rhyCardSettingsFragment) {
        rhyCardSettingsFragment.getDuxo().updateGooglePayData();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        screenProtectManager.clearFlagSecure(fragmentActivityRequireActivity);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.detail.card.SecondaryAuthenticationFragment.Callbacks
    public void onSecondaryAuthenticationSuccess(int requestCode) {
        if (requestCode == 1) {
            getDuxo().setShowCardNumber(true);
        } else {
            if (requestCode != 2) {
                return;
            }
            changePin();
        }
    }

    @Override // com.robinhood.android.common.mcduckling.ui.CardLockDialogFragment.Callbacks
    public void onLockConfirmed() {
        getDuxo().toggleCardLock(true);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.CardLockDialogFragment.Callbacks
    public void onUnlockConfirmed() {
        getDuxo().toggleCardLock(false);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.LocationProtectionDialogFragment.Callbacks
    public void onLocationProtectionConfirmed() {
        getDuxo().toggleLocationProtection(true);
    }

    @Override // com.robinhood.android.cash.cushion.dialog.CashCushionSettingDialogFragment.Callbacks
    public void onSetCashCushionStatus(boolean enable) {
        getDuxo().toggleCashCushionStatus(enable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(RhySettingsViewState state) throws Resources.NotFoundException {
        CharSequence text;
        VerificationRequiredException verificationRequiredExceptionConsume;
        PushTokenizeRequest pushTokenizeRequestConsume;
        RdsToggleView settingsLockCardToggle = getBinding().rhyCardSettingsLayout.getSettingsLockCardToggle();
        settingsLockCardToggle.setEnabled(state.isCardLockToggleEnabled());
        settingsLockCardToggle.setCheckedProgrammatically(state.isCardLocked());
        getBinding().rhyCardSettingsLayout.getShowCardNumberToggle().setCheckedProgrammatically(state.getShowCardNumbers());
        RdsToggleView locationProtectionToggle = getBinding().rhyCardSettingsLayout.getLocationProtectionToggle();
        locationProtectionToggle.setEnabled(state.isLocationProtectionToggleEnabled());
        locationProtectionToggle.setCheckedProgrammatically(state.isLocationProtectionEnabled());
        RdsToggleView spendAlertToggle = getBinding().rhyCardSettingsLayout.getSpendAlertToggle();
        spendAlertToggle.setEnabled(state.isSpendAlertsSwitchEnabled());
        spendAlertToggle.setLocked(state.isSpendAlertsSwitchLocked());
        spendAlertToggle.setCheckedProgrammatically(state.isSpendAlertsSwitchChecked());
        final RdsRowView changePinRow = getBinding().rhyCardSettingsLayout.getChangePinRow();
        final RhySettingsViewState.ChangePinState changePinState = state.getChangePinState();
        changePinRow.setVisibility(changePinState.getIsChangePinVisible() ? 0 : 8);
        if (changePinState instanceof RhySettingsViewState.ChangePinState.Visible) {
            RhySettingsViewState.ChangePinState.Visible visible = (RhySettingsViewState.ChangePinState.Visible) changePinState;
            this.changePinState = visible;
            changePinRow.setPrimaryText(ViewsKt.getString(changePinRow, visible.getActionPrimaryTextRes()));
            OnClickListeners.onClick(changePinRow, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyCardSettingsFragment.bind$lambda$24$lambda$23(this.f$0, changePinRow, changePinState);
                }
            });
        }
        getBinding().rhyCardSettingsLayout.getGooglePayRow().setVisibility(state.isGooglePayActionVisible() ? 0 : 8);
        UiEvent<PushTokenizeRequest> pushTokenizeEvent = state.getPushTokenizeEvent();
        if (pushTokenizeEvent != null && (pushTokenizeRequestConsume = pushTokenizeEvent.consume()) != null) {
            GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            googlePayPushTokenizeManager.pushTokenize(fragmentActivityRequireActivity, pushTokenizeRequestConsume, 3);
        }
        final RdsRowView reportProblemRow = getBinding().rhyCardSettingsLayout.getReportProblemRow();
        final RhySettingsViewState.CardHelpState cardHelpState = state.getCardHelpState();
        reportProblemRow.setVisibility(cardHelpState.getIsCardHelpVisible() ? 0 : 8);
        if (cardHelpState instanceof RhySettingsViewState.CardHelpState.Visible) {
            OnClickListeners.onClick(reportProblemRow, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyCardSettingsFragment.bind$lambda$27$lambda$26(this.f$0, reportProblemRow, cardHelpState);
                }
            });
        }
        getBinding().rhyCardSettingsDebitCardView.bindBack(state.getFirstName(), state.getLastName(), state.getCardLastFourDigits(), state.getCardImage(), state.getShowMockedCardNumbers() && state.getShowCardNumbers());
        RdsRowView mailCardRow = getBinding().rhyCardSettingsLayout.getMailCardRow();
        final RhySettingsViewState.MailCardState mailCardState = state.getMailCardState();
        mailCardRow.setVisibility(mailCardState.getIsMailCardVisible() ? 0 : 8);
        if (mailCardState instanceof RhySettingsViewState.MailCardState.Visible) {
            OnClickListeners.onClick(mailCardRow, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyCardSettingsFragment.bind$lambda$29$lambda$28(this.f$0, mailCardState);
                }
            });
        }
        UiEvent<VerificationRequiredException> verificationRequired = state.getVerificationRequired();
        if (verificationRequired != null && (verificationRequiredExceptionConsume = verificationRequired.consume()) != null) {
            if (verificationRequiredExceptionConsume.isShowCardNumber()) {
                getDuxo().setShowCardNumber(false);
            }
            if (verificationRequiredExceptionConsume.isShowCardNumber()) {
                this.launchCardNumberSuv.invoke(verificationRequiredExceptionConsume.getWorkflowInstanceUuid(), Boolean.valueOf(verificationRequiredExceptionConsume.isMigrated()));
            } else if (verificationRequiredExceptionConsume.isMobileWalletProvisioning()) {
                this.launchWalletProvisioningSuv.invoke(verificationRequiredExceptionConsume.getWorkflowInstanceUuid(), Boolean.valueOf(verificationRequiredExceptionConsume.isMigrated()));
            }
        }
        RdsToggleView cashCushionToggle = getBinding().rhyCardSettingsLayout.getCashCushionToggle();
        cashCushionToggle.setCheckedProgrammatically(state.isCashCushionSwitchChecked());
        cashCushionToggle.setEnabled(state.isCashCushionSwitchEnabled());
        UiEvent<Unit> shouldHideCardNumber = state.getShouldHideCardNumber();
        if (shouldHideCardNumber != null) {
            shouldHideCardNumber.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyCardSettingsFragment.bind$lambda$32(this.f$0, (Unit) obj);
                }
            });
        }
        UiEvent<Throwable> error = state.getError();
        if (error != null) {
            error.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyCardSettingsFragment$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyCardSettingsFragment.bind$lambda$33(this.f$0, (Throwable) obj);
                }
            });
        }
        RhTextView rhyCardSettingsVirtualCardTitle = getBinding().rhyCardSettingsVirtualCardTitle;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsVirtualCardTitle, "rhyCardSettingsVirtualCardTitle");
        rhyCardSettingsVirtualCardTitle.setVisibility(state.getCashManagementCardValidDaysRemaining() != null ? 0 : 8);
        RdsInfoBannerView rhyCardSettingsVirtualCardBanner = getBinding().rhyCardSettingsVirtualCardBanner;
        Intrinsics.checkNotNullExpressionValue(rhyCardSettingsVirtualCardBanner, "rhyCardSettingsVirtualCardBanner");
        rhyCardSettingsVirtualCardBanner.setVisibility(state.getCashManagementCardValidDaysRemaining() != null ? 0 : 8);
        RdsInfoBannerView rdsInfoBannerView = getBinding().rhyCardSettingsVirtualCardBanner;
        StringResource cashManagementCardValidDaysRemaining = state.getCashManagementCardValidDaysRemaining();
        if (cashManagementCardValidDaysRemaining != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = cashManagementCardValidDaysRemaining.getText(resources);
        } else {
            text = null;
        }
        rdsInfoBannerView.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$24$lambda$23(RhyCardSettingsFragment rhyCardSettingsFragment, RdsRowView rdsRowView, RhySettingsViewState.ChangePinState changePinState) {
        SecondaryAuthenticationFragment secondaryAuthenticationFragmentNewInstance = SecondaryAuthenticationFragment.INSTANCE.newInstance(rhyCardSettingsFragment, ViewsKt.getString(rdsRowView, ((RhySettingsViewState.ChangePinState.Visible) changePinState).getActionPrimaryTextRes()), 2);
        FragmentManager parentFragmentManager = rhyCardSettingsFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        secondaryAuthenticationFragmentNewInstance.show(parentFragmentManager, "changePinAuthenticationDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$27$lambda$26(RhyCardSettingsFragment rhyCardSettingsFragment, RdsRowView rdsRowView, RhySettingsViewState.CardHelpState cardHelpState) {
        Navigator navigator = rhyCardSettingsFragment.getNavigator();
        Context context = rdsRowView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new LegacyIntentKey.CardHelp(((RhySettingsViewState.CardHelpState.Visible) cardHelpState).getCardId(), null, "150"), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$29$lambda$28(RhyCardSettingsFragment rhyCardSettingsFragment, RhySettingsViewState.MailCardState mailCardState) {
        Navigator navigator = rhyCardSettingsFragment.getNavigator();
        Context contextRequireContext = rhyCardSettingsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.RhyRequestPhysicalCard(((RhySettingsViewState.MailCardState.Visible) mailCardState).getCardId()), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$32(RhyCardSettingsFragment rhyCardSettingsFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyCardSettingsFragment.getDuxo().setShowCardNumber(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$33(RhyCardSettingsFragment rhyCardSettingsFragment, Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        CashCushionUpdateErrorHandler.Companion companion = CashCushionUpdateErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = rhyCardSettingsFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (!companion.handle(fragmentActivityRequireActivity, error) && !AbsErrorHandler.handleError$default(rhyCardSettingsFragment.getActivityErrorHandler(), error, false, 2, null)) {
            throw error;
        }
        return Unit.INSTANCE;
    }

    private final void changePin() {
        LegacyIntentKey.ChangeCardPin.Action action;
        RhySettingsViewState.ChangePinState.Visible visible = this.changePinState;
        if (visible != null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            UUID cardId = visible.getCardId();
            boolean zIsCardVirtual = visible.isCardVirtual();
            if (visible.isPinSet()) {
                action = LegacyIntentKey.ChangeCardPin.Action.CHANGE_PIN;
            } else {
                action = LegacyIntentKey.ChangeCardPin.Action.SET_PIN;
            }
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.ChangeCardPin(cardId, zIsCardVirtual, action), null, false, null, null, 60, null);
        }
    }

    /* compiled from: RhyCardSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyCardSettingsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyCardSettings;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyCardSettingsFragment;", "<init>", "()V", "REQUEST_SECONDARY_AUTH_CARD_NUMBER", "", "REQUEST_SECONDARY_AUTH_CHANGE_PIN", "REQUEST_PUSH_TOKENIZE", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.RhyCardSettings>, FragmentWithArgsCompanion<RhyCardSettingsFragment, LegacyFragmentKey.RhyCardSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.RhyCardSettings getArgs(RhyCardSettingsFragment rhyCardSettingsFragment) {
            return (LegacyFragmentKey.RhyCardSettings) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyCardSettingsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyCardSettingsFragment newInstance(LegacyFragmentKey.RhyCardSettings rhyCardSettings) {
            return (RhyCardSettingsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, rhyCardSettings);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyCardSettingsFragment rhyCardSettingsFragment, LegacyFragmentKey.RhyCardSettings rhyCardSettings) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyCardSettingsFragment, rhyCardSettings);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyCardSettings key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return RhyCardSettingsFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }

    @Override // com.robinhood.android.cash.rhy.tab.v2.card.RhyDebitCardView.Callbacks
    public void onCardImageConfigurationChanged(CardImageConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        getDuxo().setCardImageConfiguration(configuration);
    }
}
