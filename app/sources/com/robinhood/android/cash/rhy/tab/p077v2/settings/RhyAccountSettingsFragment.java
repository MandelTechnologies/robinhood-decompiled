package com.robinhood.android.cash.rhy.tab.p077v2.settings;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.cash.cushion.dialog.CashCushionSettingDialogFragment;
import com.robinhood.android.cash.cushion.error.CashCushionUpdateErrorHandler;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.databinding.FragmentRhySettingsBinding;
import com.robinhood.android.cash.rhy.tab.p077v2.settings.RhyRoutingDetailsBottomSheet;
import com.robinhood.android.cash.rhy.tab.p077v2.settings.RhySettingsViewState;
import com.robinhood.android.common.mcduckling.p084ui.CardLockDialogFragment;
import com.robinhood.android.common.mcduckling.p084ui.LocationProtectionDialogFragment;
import com.robinhood.android.common.mcduckling.p084ui.detail.card.SecondaryAuthenticationFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
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
import com.robinhood.android.social.contracts.MatchaLimitsFragmentKey;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.p320db.bonfire.RhyAccountRoutingDetails;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyAccountSettingsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001DB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0016J\u001a\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u00100\u001a\u00020\"H\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\"H\u0016J\b\u00105\u001a\u00020\"H\u0016J\b\u00106\u001a\u00020\"H\u0016J\b\u00107\u001a\u00020\"H\u0016J\u0010\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020\nH\u0016J\u0010\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020\"H\u0002J\t\u0010>\u001a\u00020\nH\u0096\u0001R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\"0 X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010#\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\"0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyAccountSettingsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", "Lcom/robinhood/android/common/mcduckling/ui/CardLockDialogFragment$Callbacks;", "Lcom/robinhood/android/common/mcduckling/ui/LocationProtectionDialogFragment$Callbacks;", "Lcom/robinhood/android/cash/cushion/dialog/CashCushionSettingDialogFragment$Callbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "binding", "Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhySettingsBinding;", "getBinding", "()Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhySettingsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "googlePayPushTokenizeManager", "Lcom/robinhood/android/googlepay/GooglePayPushTokenizeManager;", "changePinState", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState$ChangePinState$Visible;", "launchCardNumberSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "launchWalletProvisioningSuv", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onSecondaryAuthenticationSuccess", "requestCode", "", "onLockConfirmed", "onUnlockConfirmed", "onLocationProtectionConfirmed", "onLocationProtectionDismissed", "onSetCashCushionStatus", "enable", "bind", "state", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState;", "changePin", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyAccountSettingsFragment extends BaseFragment implements RegionGated, SecondaryAuthenticationFragment.Callbacks, CardLockDialogFragment.Callbacks, LocationProtectionDialogFragment.Callbacks, CashCushionSettingDialogFragment.Callbacks {
    private static final int REQUEST_PUSH_TOKENIZE = 3;
    private static final int REQUEST_SECONDARY_AUTH_CHANGE_PIN = 2;
    private static final int REQUEST_SECONDARY_AUTH_ROUTING_DETAILS = 1;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private RhySettingsViewState.ChangePinState.Visible changePinState;
    private final boolean childFragmentsShouldNotConfigureToolbar;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GooglePayPushTokenizeManager googlePayPushTokenizeManager;
    private final Function2<UUID, Boolean, Unit> launchCardNumberSuv;
    private final Function2<UUID, Boolean, Unit> launchWalletProvisioningSuv;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyAccountSettingsFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhySettingsBinding;", 0))};

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

    @Override // com.robinhood.android.common.mcduckling.ui.LocationProtectionDialogFragment.Callbacks
    public void onLocationProtectionDismissed() {
    }

    public RhyAccountSettingsFragment() {
        super(C10285R.layout.fragment_rhy_settings);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, RhyAccountSettingsFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RhySettingsDuxo.class);
        this.googlePayPushTokenizeManager = new GooglePayPushTokenizeManager();
        this.launchCardNumberSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.launchCardNumberSuv$lambda$1(this.f$0);
            }
        }, (Function0) null, 4, (Object) null);
        this.launchWalletProvisioningSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.launchWalletProvisioningSuv$lambda$3(this.f$0);
            }
        }, (Function0) null, 4, (Object) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    private final FragmentRhySettingsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhySettingsBinding) value;
    }

    private final RhySettingsDuxo getDuxo() {
        return (RhySettingsDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchCardNumberSuv$lambda$1(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        rhyAccountSettingsFragment.getDuxo().setShowCardNumber(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchWalletProvisioningSuv$lambda$3(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        rhyAccountSettingsFragment.getDuxo().getPushTokenizeEvent();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().streamAccountAndBenefitSettings();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().showBackArrowIcon();
        toolbar.setTitle(getString(C10285R.string.rhy_account_settings_fragment_title));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getViewLifecycleOwner().getLifecycle().addObserver(this.googlePayPushTokenizeManager);
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction().add(C10285R.id.rhy_settings_fragment_early_dd_toggle, Navigator.DefaultImpls.createFragment$default(getNavigator(), LegacyFragmentKey.EarlyPayToggle.INSTANCE, null, 2, null), "earlyPayToggleFragment").commit();
        }
        RdsRowView rhySettingsFragmentShowAccountNumberRow = getBinding().rhySettingsFragmentShowAccountNumberRow;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentShowAccountNumberRow, "rhySettingsFragmentShowAccountNumberRow");
        OnClickListeners.onClick(rhySettingsFragmentShowAccountNumberRow, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.onViewCreated$lambda$5(this.f$0);
            }
        });
        final RdsToggleView rdsToggleView = getBinding().rhySettingsFragmentSpendAlertsToggle;
        rdsToggleView.onCheckedChanged(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAccountSettingsFragment.onViewCreated$lambda$7$lambda$6(rdsToggleView, this, ((Boolean) obj).booleanValue());
            }
        });
        final RdsToggleView rdsToggleView2 = getBinding().rhySettingsFragmentCashCushionToggle;
        rdsToggleView2.onPrimaryTextClick(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.onViewCreated$lambda$10$lambda$8(this.f$0);
            }
        });
        rdsToggleView2.onCheckedChanged(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAccountSettingsFragment.onViewCreated$lambda$10$lambda$9(rdsToggleView2, this, ((Boolean) obj).booleanValue());
            }
        });
        final RdsToggleView rdsToggleView3 = getBinding().rhySettingsFragmentLockCardToggle;
        rdsToggleView3.onCheckedChanged(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAccountSettingsFragment.onViewCreated$lambda$12$lambda$11(rdsToggleView3, this, ((Boolean) obj).booleanValue());
            }
        });
        final RdsToggleView rdsToggleView4 = getBinding().rhySettingsFragmentLocationProtectionToggle;
        rdsToggleView4.onCheckedChanged(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAccountSettingsFragment.onViewCreated$lambda$14$lambda$13(rdsToggleView4, this, ((Boolean) obj).booleanValue());
            }
        });
        RdsRowView rhySettingsFragmentGooglePayRow = getBinding().rhySettingsFragmentGooglePayRow;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentGooglePayRow, "rhySettingsFragmentGooglePayRow");
        OnClickListeners.onClick(rhySettingsFragmentGooglePayRow, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.onViewCreated$lambda$15(this.f$0);
            }
        });
        RdsRowView rhySettingsFragmentMatchaProfileEdit = getBinding().rhySettingsFragmentMatchaProfileEdit;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentMatchaProfileEdit, "rhySettingsFragmentMatchaProfileEdit");
        OnClickListeners.onClick(rhySettingsFragmentMatchaProfileEdit, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.onViewCreated$lambda$16(this.f$0);
            }
        });
        RdsRowView rhySettingsFragmentMatchaProfileVisibility = getBinding().rhySettingsFragmentMatchaProfileVisibility;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentMatchaProfileVisibility, "rhySettingsFragmentMatchaProfileVisibility");
        OnClickListeners.onClick(rhySettingsFragmentMatchaProfileVisibility, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.onViewCreated$lambda$17(this.f$0);
            }
        });
        RdsRowView rhySettingsFragmentMatchaBlockedList = getBinding().rhySettingsFragmentMatchaBlockedList;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentMatchaBlockedList, "rhySettingsFragmentMatchaBlockedList");
        OnClickListeners.onClick(rhySettingsFragmentMatchaBlockedList, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.onViewCreated$lambda$18(this.f$0);
            }
        });
        RdsRowView rhySettingsFragmentMatchaLimits = getBinding().rhySettingsFragmentMatchaLimits;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentMatchaLimits, "rhySettingsFragmentMatchaLimits");
        OnClickListeners.onClick(rhySettingsFragmentMatchaLimits, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.onViewCreated$lambda$19(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        SecondaryAuthenticationFragment.Companion companion = SecondaryAuthenticationFragment.INSTANCE;
        String string2 = rhyAccountSettingsFragment.getString(C10285R.string.rhy_routing_details_bottom_sheet_auth_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SecondaryAuthenticationFragment secondaryAuthenticationFragmentNewInstance = companion.newInstance(rhyAccountSettingsFragment, string2, 1);
        FragmentManager parentFragmentManager = rhyAccountSettingsFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        secondaryAuthenticationFragmentNewInstance.show(parentFragmentManager, "showCardNumbersAuthenticationDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6(RdsToggleView rdsToggleView, RhyAccountSettingsFragment rhyAccountSettingsFragment, boolean z) throws Resources.NotFoundException {
        rdsToggleView.setCheckedProgrammatically(!z);
        rhyAccountSettingsFragment.getDuxo().toggleSpendAlerts(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10$lambda$8(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        Navigator navigator = rhyAccountSettingsFragment.getNavigator();
        Context contextRequireContext = rhyAccountSettingsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.CashCushionDetails("spending_settings", false), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10$lambda$9(RdsToggleView rdsToggleView, RhyAccountSettingsFragment rhyAccountSettingsFragment, boolean z) throws Resources.NotFoundException {
        rdsToggleView.setCheckedProgrammatically(!z);
        RhySettingsDuxo duxo = rhyAccountSettingsFragment.getDuxo();
        Screen.Name name = Screen.Name.RHY_SPENDING_SETTINGS;
        duxo.logCashCushionToggleTap(z, "spending_settings", new Screen(name, null, null, null, 14, null));
        if (z) {
            Navigator navigator = rhyAccountSettingsFragment.getNavigator();
            Context contextRequireContext = rhyAccountSettingsFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.CashCushionDetails("spending_settings", false), null, false, null, null, 60, null);
        } else {
            CashCushionSettingDialogFragment cashCushionSettingDialogFragment = (CashCushionSettingDialogFragment) CashCushionSettingDialogFragment.INSTANCE.newInstance((Parcelable) new CashCushionSettingDialogFragment.Args(!z, "spending_settings", new Screen(name, null, null, null, 14, null)));
            FragmentManager childFragmentManager = rhyAccountSettingsFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            cashCushionSettingDialogFragment.show(childFragmentManager, "cashCushionSettingDialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12$lambda$11(RdsToggleView rdsToggleView, RhyAccountSettingsFragment rhyAccountSettingsFragment, boolean z) throws Resources.NotFoundException {
        rdsToggleView.setCheckedProgrammatically(!z);
        if (z) {
            CardLockDialogFragment.INSTANCE.showLockConfirmation(rhyAccountSettingsFragment);
        } else {
            CardLockDialogFragment.INSTANCE.showUnlockConfirmation(rhyAccountSettingsFragment);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14$lambda$13(RdsToggleView rdsToggleView, RhyAccountSettingsFragment rhyAccountSettingsFragment, boolean z) throws Resources.NotFoundException {
        rdsToggleView.setCheckedProgrammatically(!z);
        if (z) {
            LocationProtectionDialogFragment.INSTANCE.showLocationProtectionConfirmation(rhyAccountSettingsFragment);
        } else {
            rhyAccountSettingsFragment.getDuxo().toggleLocationProtection(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$15(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        rhyAccountSettingsFragment.getDuxo().getPushTokenizeEvent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$16(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        Navigator navigator = rhyAccountSettingsFragment.getNavigator();
        Context contextRequireContext = rhyAccountSettingsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.ProfileEdit(null, 1, null), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$17(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        Navigator navigator = rhyAccountSettingsFragment.getNavigator();
        Context contextRequireContext = rhyAccountSettingsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.ProfileVisibility(false, 1, null), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$18(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        Navigator navigator = rhyAccountSettingsFragment.getNavigator();
        Context contextRequireContext = rhyAccountSettingsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, LegacyFragmentKey.BlockedProfiles.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$19(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        Navigator navigator = rhyAccountSettingsFragment.getNavigator();
        Context contextRequireContext = rhyAccountSettingsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, MatchaLimitsFragmentKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C103221(this));
        GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        LifecycleHost.DefaultImpls.bind$default(this, googlePayPushTokenizeManager.onDataChanged(fragmentActivityRequireActivity), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.onStart$lambda$20(this.f$0);
            }
        });
    }

    /* compiled from: RhyAccountSettingsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$onStart$1 */
    /* synthetic */ class C103221 extends FunctionReferenceImpl implements Function1<RhySettingsViewState, Unit> {
        C103221(Object obj) {
            super(1, obj, RhyAccountSettingsFragment.class, "bind", "bind(Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhySettingsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhySettingsViewState rhySettingsViewState) throws Resources.NotFoundException {
            invoke2(rhySettingsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhySettingsViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyAccountSettingsFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$20(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        rhyAccountSettingsFragment.getDuxo().updateGooglePayData();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.mcduckling.ui.detail.card.SecondaryAuthenticationFragment.Callbacks
    public void onSecondaryAuthenticationSuccess(int requestCode) {
        if (requestCode == 1) {
            getDuxo().showRoutingDetailsBottomSheet();
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
        RhyAccountRoutingDetails rhyAccountRoutingDetailsConsume;
        UiEvent<RhyAccountRoutingDetails> showRoutingDetailsBottomSheetEvent = state.getShowRoutingDetailsBottomSheetEvent();
        if (showRoutingDetailsBottomSheetEvent != null && (rhyAccountRoutingDetailsConsume = showRoutingDetailsBottomSheetEvent.consume()) != null) {
            RhyRoutingDetailsBottomSheet rhyRoutingDetailsBottomSheet = (RhyRoutingDetailsBottomSheet) RhyRoutingDetailsBottomSheet.INSTANCE.newInstance((Parcelable) new RhyRoutingDetailsBottomSheet.Args(rhyAccountRoutingDetailsConsume.getAccountNumber(), rhyAccountRoutingDetailsConsume.getRoutingNumber(), rhyAccountRoutingDetailsConsume.getFullBankName()));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            rhyRoutingDetailsBottomSheet.show(childFragmentManager, "routingDetailsBottomSheet");
        }
        RdsToggleView rdsToggleView = getBinding().rhySettingsFragmentLockCardToggle;
        rdsToggleView.setEnabled(state.isCardLockToggleEnabled());
        rdsToggleView.setCheckedProgrammatically(state.isCardLocked());
        RdsToggleView rdsToggleView2 = getBinding().rhySettingsFragmentLocationProtectionToggle;
        rdsToggleView2.setEnabled(state.isLocationProtectionToggleEnabled());
        rdsToggleView2.setCheckedProgrammatically(state.isLocationProtectionEnabled());
        RdsToggleView rdsToggleView3 = getBinding().rhySettingsFragmentSpendAlertsToggle;
        rdsToggleView3.setEnabled(state.isSpendAlertsSwitchEnabled());
        rdsToggleView3.setLocked(state.isSpendAlertsSwitchLocked());
        rdsToggleView3.setCheckedProgrammatically(state.isSpendAlertsSwitchChecked());
        final RdsRowView rdsRowView = getBinding().rhySettingsFragmentChangePinRow;
        final RhySettingsViewState.ChangePinState changePinState = state.getChangePinState();
        Intrinsics.checkNotNull(rdsRowView);
        rdsRowView.setVisibility(changePinState.getIsChangePinVisible() ? 0 : 8);
        if (changePinState instanceof RhySettingsViewState.ChangePinState.Visible) {
            RhySettingsViewState.ChangePinState.Visible visible = (RhySettingsViewState.ChangePinState.Visible) changePinState;
            this.changePinState = visible;
            rdsRowView.setPrimaryText(ViewsKt.getString(rdsRowView, visible.getActionPrimaryTextRes()));
            OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyAccountSettingsFragment.bind$lambda$26$lambda$25(this.f$0, rdsRowView, changePinState);
                }
            });
        }
        RdsRowView rhySettingsFragmentGooglePayRow = getBinding().rhySettingsFragmentGooglePayRow;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentGooglePayRow, "rhySettingsFragmentGooglePayRow");
        rhySettingsFragmentGooglePayRow.setVisibility(state.isGooglePayActionVisible() ? 0 : 8);
        UiEvent<PushTokenizeRequest> pushTokenizeEvent = state.getPushTokenizeEvent();
        if (pushTokenizeEvent != null && (pushTokenizeRequestConsume = pushTokenizeEvent.consume()) != null) {
            GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            googlePayPushTokenizeManager.pushTokenize(fragmentActivityRequireActivity, pushTokenizeRequestConsume, 3);
        }
        RdsRowView rdsRowView2 = getBinding().rhySettingsFragmentSetupDepositRow;
        Intrinsics.checkNotNull(rdsRowView2);
        rdsRowView2.setVisibility(state.isSetUpDirectDepositRowVisible() ? 0 : 8);
        OnClickListeners.onClick(rdsRowView2, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.bind$lambda$29$lambda$28(this.f$0);
            }
        });
        RdsRowView rdsRowView3 = getBinding().rhySettingsFragmentManageDirectDepositRow;
        Intrinsics.checkNotNull(rdsRowView3);
        rdsRowView3.setVisibility(state.isManageDirectDepositRowVisible() ? 0 : 8);
        StringResource manageDirectDepositRowSecondaryText = state.getManageDirectDepositRowSecondaryText();
        if (manageDirectDepositRowSecondaryText != null) {
            Resources resources = rdsRowView3.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = manageDirectDepositRowSecondaryText.getText(resources);
        } else {
            text = null;
        }
        rdsRowView3.setSecondaryText(text);
        OnClickListeners.onClick(rdsRowView3, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyAccountSettingsFragment.bind$lambda$31$lambda$30(this.f$0);
            }
        });
        FragmentContainerView rhySettingsFragmentEarlyDdToggle = getBinding().rhySettingsFragmentEarlyDdToggle;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentEarlyDdToggle, "rhySettingsFragmentEarlyDdToggle");
        rhySettingsFragmentEarlyDdToggle.setVisibility(state.getIsDirectDepositActive() ? 0 : 8);
        final RdsRowView rdsRowView4 = getBinding().rhySettingsFragmentReportProblemRow;
        final RhySettingsViewState.CardHelpState cardHelpState = state.getCardHelpState();
        Intrinsics.checkNotNull(rdsRowView4);
        rdsRowView4.setVisibility(cardHelpState.getIsCardHelpVisible() ? 0 : 8);
        RdsHeaderRowView rhySettingsFragmentSupportTitle = getBinding().rhySettingsFragmentSupportTitle;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentSupportTitle, "rhySettingsFragmentSupportTitle");
        rhySettingsFragmentSupportTitle.setVisibility(cardHelpState.getIsCardHelpVisible() ? 0 : 8);
        if (cardHelpState instanceof RhySettingsViewState.CardHelpState.Visible) {
            OnClickListeners.onClick(rdsRowView4, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyAccountSettingsFragment.bind$lambda$33$lambda$32(this.f$0, rdsRowView4, cardHelpState);
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
        RdsToggleView rdsToggleView4 = getBinding().rhySettingsFragmentCashCushionToggle;
        rdsToggleView4.setCheckedProgrammatically(state.isCashCushionSwitchChecked());
        rdsToggleView4.setEnabled(state.isCashCushionSwitchEnabled());
        LinearLayout rhySettingsFragmentMatchaContainer = getBinding().rhySettingsFragmentMatchaContainer;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentMatchaContainer, "rhySettingsFragmentMatchaContainer");
        rhySettingsFragmentMatchaContainer.setVisibility(state.getShowMatchaSettings() ? 0 : 8);
        UiEvent<Throwable> error = state.getError();
        if (error != null) {
            error.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyAccountSettingsFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyAccountSettingsFragment.bind$lambda$36(this.f$0, (Throwable) obj);
                }
            });
        }
        LinearLayout rhySettingsFragmentDebitCardContainer = getBinding().rhySettingsFragmentDebitCardContainer;
        Intrinsics.checkNotNullExpressionValue(rhySettingsFragmentDebitCardContainer, "rhySettingsFragmentDebitCardContainer");
        rhySettingsFragmentDebitCardContainer.setVisibility(state.getShowDebitCardSettings() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$26$lambda$25(RhyAccountSettingsFragment rhyAccountSettingsFragment, RdsRowView rdsRowView, RhySettingsViewState.ChangePinState changePinState) {
        SecondaryAuthenticationFragment.Companion companion = SecondaryAuthenticationFragment.INSTANCE;
        Intrinsics.checkNotNull(rdsRowView);
        SecondaryAuthenticationFragment secondaryAuthenticationFragmentNewInstance = companion.newInstance(rhyAccountSettingsFragment, ViewsKt.getString(rdsRowView, ((RhySettingsViewState.ChangePinState.Visible) changePinState).getActionPrimaryTextRes()), 2);
        FragmentManager parentFragmentManager = rhyAccountSettingsFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        secondaryAuthenticationFragmentNewInstance.show(parentFragmentManager, "changePinAuthenticationDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$29$lambda$28(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        Navigator navigator = rhyAccountSettingsFragment.getNavigator();
        Context contextRequireContext = rhyAccountSettingsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DirectDepositShimKey(false, false, false, false, false, false, false, false, 255, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$31$lambda$30(RhyAccountSettingsFragment rhyAccountSettingsFragment) {
        Navigator navigator = rhyAccountSettingsFragment.getNavigator();
        Context contextRequireContext = rhyAccountSettingsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyFragmentKey.ManageDirectDeposit.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$33$lambda$32(RhyAccountSettingsFragment rhyAccountSettingsFragment, RdsRowView rdsRowView, RhySettingsViewState.CardHelpState cardHelpState) {
        Navigator navigator = rhyAccountSettingsFragment.getNavigator();
        Context context = rdsRowView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new LegacyIntentKey.CardHelp(((RhySettingsViewState.CardHelpState.Visible) cardHelpState).getCardId(), null, "150"), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$36(RhyAccountSettingsFragment rhyAccountSettingsFragment, Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        CashCushionUpdateErrorHandler.Companion companion = CashCushionUpdateErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = rhyAccountSettingsFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (!companion.handle(fragmentActivityRequireActivity, error) && !AbsErrorHandler.handleError$default(rhyAccountSettingsFragment.getActivityErrorHandler(), error, false, 2, null)) {
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

    /* compiled from: RhyAccountSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyAccountSettingsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyAccountSettings;", "<init>", "()V", "REQUEST_SECONDARY_AUTH_ROUTING_DETAILS", "", "REQUEST_SECONDARY_AUTH_CHANGE_PIN", "REQUEST_PUSH_TOKENIZE", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.RhyAccountSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyAccountSettings key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new RhyAccountSettingsFragment();
        }
    }
}
