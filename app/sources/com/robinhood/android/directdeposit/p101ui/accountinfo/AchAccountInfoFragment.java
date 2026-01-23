package com.robinhood.android.directdeposit.p101ui.accountinfo;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.p084ui.ObscuredTextView;
import com.robinhood.android.common.mcduckling.p084ui.WithdrawalLockDialogFragment;
import com.robinhood.android.common.mcduckling.p084ui.detail.card.SecondaryAuthenticationFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.databinding.FragmentRoutingAccountActionsBinding;
import com.robinhood.android.directdeposit.p101ui.ShowAccountNumberPref;
import com.robinhood.android.directdeposit.p101ui.accountinfo.AchAccountInfoViewState;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: AchAccountInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001<B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001aH\u0016J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020'H\u0002J\u0012\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\u0010\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u001eH\u0002J\b\u00101\u001a\u00020\u001aH\u0016J\b\u00102\u001a\u00020\u001aH\u0016J\u0010\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u000205H\u0016J\t\u00106\u001a\u00020'H\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u00107\u001a\b\u0012\u0004\u0012\u00020908X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", "Lcom/robinhood/android/common/mcduckling/ui/WithdrawalLockDialogFragment$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/directdeposit/databinding/FragmentRoutingAccountActionsBinding;", "getBinding", "()Lcom/robinhood/android/directdeposit/databinding/FragmentRoutingAccountActionsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "showAccountNumberPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShowAccountNumberPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowAccountNumberPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "onAttach", "", "context", "Landroid/content/Context;", "accountNumber", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "toggleWithdrawal", "locked", "", "toggleWithdrawalsLockedPending", "toggleAccountNumberReveal", "showAccountNumber", "bindAccountInfo", "contentState", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState;", "requestAccountNumberAuth", "showInfoDialog", "bankName", "onWithdrawalLockingConfirmed", "onWithdrawalLockingDismissed", "onSecondaryAuthenticationSuccess", "requestCode", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class AchAccountInfoFragment extends BaseFragment implements RegionGated, SecondaryAuthenticationFragment.Callbacks, WithdrawalLockDialogFragment.Callbacks {
    private static final int REQUEST_SECONDARY_AUTH_ACCOUNT_NUMBER = 1;
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private String accountNumber;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    @ShowAccountNumberPref
    public BooleanPreference showAccountNumberPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchAccountInfoFragment.class, "binding", "getBinding()Lcom/robinhood/android/directdeposit/databinding/FragmentRoutingAccountActionsBinding;", 0))};

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

    public AchAccountInfoFragment() {
        super(C14044R.layout.fragment_routing_account_actions);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, AchAccountInfoFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, AchAccountInfoDuxo.class);
        this.accountNumber = "";
    }

    private final FragmentRoutingAccountActionsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRoutingAccountActionsBinding) value;
    }

    private final AchAccountInfoDuxo getDuxo() {
        return (AchAccountInfoDuxo) this.duxo.getValue();
    }

    public final BooleanPreference getShowAccountNumberPref() {
        BooleanPreference booleanPreference = this.showAccountNumberPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showAccountNumberPref");
        return null;
    }

    public final void setShowAccountNumberPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showAccountNumberPref = booleanPreference;
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
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().routingAccountActionsCardAccountNumberSwitch.onCheckedChanged(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoFragment.onViewCreated$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        RdsToggleView rdsToggleView = getBinding().routingAccountActionsCardLockWithdrawalsSwitch;
        Intrinsics.checkNotNull(rdsToggleView);
        Companion companion = INSTANCE;
        rdsToggleView.setVisibility(((LegacyFragmentKey.AchAccountInfo) companion.getArgs((Fragment) this)).getShowLockWithdrawalsToggle() ? 0 : 8);
        rdsToggleView.onCheckedChanged(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoFragment.onViewCreated$lambda$3$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        RhTextView routingAccountActionsCardRoutingNumberValueTxt = getBinding().routingAccountActionsCardRoutingNumberValueTxt;
        Intrinsics.checkNotNullExpressionValue(routingAccountActionsCardRoutingNumberValueTxt, "routingAccountActionsCardRoutingNumberValueTxt");
        String string2 = getString(C14044R.string.account_info_routing_number);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        TextViewsKt.copyTextOnClick(routingAccountActionsCardRoutingNumberValueTxt, string2);
        RhTextView routingAccountActionsTitle = getBinding().routingAccountActionsTitle;
        Intrinsics.checkNotNullExpressionValue(routingAccountActionsTitle, "routingAccountActionsTitle");
        routingAccountActionsTitle.setVisibility(((LegacyFragmentKey.AchAccountInfo) companion.getArgs((Fragment) this)).getShowTitle() ? 0 : 8);
        if (((LegacyFragmentKey.AchAccountInfo) companion.getArgs((Fragment) this)).getCompatibleSpacingForOlderView()) {
            RhTextView routingAccountActionsCardRoutingNumberLabelTxt = getBinding().routingAccountActionsCardRoutingNumberLabelTxt;
            Intrinsics.checkNotNullExpressionValue(routingAccountActionsCardRoutingNumberLabelTxt, "routingAccountActionsCardRoutingNumberLabelTxt");
            RhTextView routingAccountActionsCardRoutingNumberLabelTxt2 = getBinding().routingAccountActionsCardRoutingNumberLabelTxt;
            Intrinsics.checkNotNullExpressionValue(routingAccountActionsCardRoutingNumberLabelTxt2, "routingAccountActionsCardRoutingNumberLabelTxt");
            ViewsKt.setMarginStart(routingAccountActionsCardRoutingNumberLabelTxt, ViewsKt.getDimensionPixelSize(routingAccountActionsCardRoutingNumberLabelTxt2, C13997R.dimen.rds_spacing_default));
            RhTextView routingAccountActionsCardRoutingNumberLabelTxt3 = getBinding().routingAccountActionsCardRoutingNumberLabelTxt;
            Intrinsics.checkNotNullExpressionValue(routingAccountActionsCardRoutingNumberLabelTxt3, "routingAccountActionsCardRoutingNumberLabelTxt");
            RhTextView routingAccountActionsCardRoutingNumberLabelTxt4 = getBinding().routingAccountActionsCardRoutingNumberLabelTxt;
            Intrinsics.checkNotNullExpressionValue(routingAccountActionsCardRoutingNumberLabelTxt4, "routingAccountActionsCardRoutingNumberLabelTxt");
            ViewsKt.setMarginTop(routingAccountActionsCardRoutingNumberLabelTxt3, ViewsKt.getDimensionPixelSize(routingAccountActionsCardRoutingNumberLabelTxt4, C13997R.dimen.rds_spacing_default));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(AchAccountInfoFragment achAccountInfoFragment, boolean z) throws Resources.NotFoundException {
        if (z) {
            achAccountInfoFragment.getBinding().routingAccountActionsCardAccountNumberSwitch.setCheckedProgrammatically(!z);
            achAccountInfoFragment.requestAccountNumberAuth();
        } else {
            achAccountInfoFragment.getDuxo().setShowAccountNumber(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(AchAccountInfoFragment achAccountInfoFragment, boolean z) throws Resources.NotFoundException {
        if (z) {
            achAccountInfoFragment.getBinding().routingAccountActionsCardLockWithdrawalsSwitch.setCheckedProgrammatically(false);
            WithdrawalLockDialogFragment.INSTANCE.showWithdrawalLockConfirmation(achAccountInfoFragment);
        } else {
            achAccountInfoFragment.getDuxo().setWithdrawalsLocked(false);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountInfoFragment.onStart$lambda$4(this.f$0, (AchAccountInfoViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(AchAccountInfoFragment achAccountInfoFragment, AchAccountInfoViewState state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        achAccountInfoFragment.toggleWithdrawal(state.getWithdrawalsLocked(), state.getToggleWithdrawalsLockedPending());
        achAccountInfoFragment.toggleAccountNumberReveal(state.getShowAccountNumber());
        achAccountInfoFragment.bindAccountInfo(state.getContentState());
        return Unit.INSTANCE;
    }

    private final void toggleWithdrawal(boolean locked, boolean toggleWithdrawalsLockedPending) throws Resources.NotFoundException {
        getBinding().routingAccountActionsCardLockWithdrawalsSwitch.setCheckedProgrammatically(locked);
        getBinding().routingAccountActionsCardLockWithdrawalsSwitch.setEnabled(!toggleWithdrawalsLockedPending);
    }

    private final void toggleAccountNumberReveal(boolean showAccountNumber) throws Resources.NotFoundException {
        getBinding().routingAccountActionsCardAccountNumberSwitch.setCheckedProgrammatically(showAccountNumber);
        if (showAccountNumber) {
            getBinding().routingAccountActionsCardAccountNumberValueTxt.setText(this.accountNumber, false);
            getBinding().routingAccountActionsCardAccountNumberValueTxt.setClickable(true);
            ObscuredTextView routingAccountActionsCardAccountNumberValueTxt = getBinding().routingAccountActionsCardAccountNumberValueTxt;
            Intrinsics.checkNotNullExpressionValue(routingAccountActionsCardAccountNumberValueTxt, "routingAccountActionsCardAccountNumberValueTxt");
            String string2 = getString(C14044R.string.account_info_account_number);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            TextViewsKt.copyTextOnClick(routingAccountActionsCardAccountNumberValueTxt, string2);
            return;
        }
        getBinding().routingAccountActionsCardAccountNumberValueTxt.setText(this.accountNumber, true);
        getBinding().routingAccountActionsCardAccountNumberValueTxt.setOnClickListener(null);
        getBinding().routingAccountActionsCardAccountNumberValueTxt.setClickable(false);
    }

    private final void bindAccountInfo(final AchAccountInfoViewState.ContentState contentState) {
        if (contentState != null) {
            if (contentState instanceof AchAccountInfoViewState.ContentState.Success) {
                ConstraintLayout container = getBinding().container;
                Intrinsics.checkNotNullExpressionValue(container, "container");
                container.setVisibility(0);
                AchAccountInfoViewState.ContentState.Success success = (AchAccountInfoViewState.ContentState.Success) contentState;
                getBinding().routingAccountActionsCardRoutingNumberValueTxt.setText(success.getRoutingNumber());
                ImageView routingAccountActionsInfoIcon = getBinding().routingAccountActionsInfoIcon;
                Intrinsics.checkNotNullExpressionValue(routingAccountActionsInfoIcon, "routingAccountActionsInfoIcon");
                routingAccountActionsInfoIcon.setVisibility(((LegacyFragmentKey.AchAccountInfo) INSTANCE.getArgs((Fragment) this)).getShowTitle() ? 0 : 8);
                this.accountNumber = success.getAccountNumber();
                ImageView routingAccountActionsInfoIcon2 = getBinding().routingAccountActionsInfoIcon;
                Intrinsics.checkNotNullExpressionValue(routingAccountActionsInfoIcon2, "routingAccountActionsInfoIcon");
                OnClickListeners.onClick(routingAccountActionsInfoIcon2, new Function0() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AchAccountInfoFragment.bindAccountInfo$lambda$5(this.f$0, contentState);
                    }
                });
                getBinding().routingAccountActionsCardAccountNumberValueTxt.setText(success.getAccountNumber(), !getShowAccountNumberPref().get());
                return;
            }
            if (!(contentState instanceof AchAccountInfoViewState.ContentState.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            ConstraintLayout container2 = getBinding().container;
            Intrinsics.checkNotNullExpressionValue(container2, "container");
            container2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAccountInfo$lambda$5(AchAccountInfoFragment achAccountInfoFragment, AchAccountInfoViewState.ContentState contentState) {
        achAccountInfoFragment.showInfoDialog(((AchAccountInfoViewState.ContentState.Success) contentState).getFullBankName());
        return Unit.INSTANCE;
    }

    private final void requestAccountNumberAuth() {
        SecondaryAuthenticationFragment.Companion companion = SecondaryAuthenticationFragment.INSTANCE;
        String string2 = getString(C14044R.string.routing_account_actions_show_account_number);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SecondaryAuthenticationFragment secondaryAuthenticationFragmentNewInstance = companion.newInstance(this, string2, 1);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        secondaryAuthenticationFragmentNewInstance.show(parentFragmentManager, "showAccountNumberAuthenticationDialog");
    }

    private final void showInfoDialog(String bankName) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setId(C14044R.id.dialog_ach_account_info_explanation);
        String string2 = getString(C14044R.string.move_money_account_info_explanation_dialog_message, bankName);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RhDialogFragment.Builder useDesignSystemOverlay = id.setMessage(StringsKt.replace$default(string2, "..", ".", false, 4, (Object) null)).setPositiveButton(C11048R.string.general_label_done, new Object[0]).setUseDesignSystemOverlay(true);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(useDesignSystemOverlay, parentFragmentManager, "ach-account-info-explanation", false, 4, null);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.WithdrawalLockDialogFragment.Callbacks
    public void onWithdrawalLockingConfirmed() {
        getDuxo().setWithdrawalsLocked(true);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.WithdrawalLockDialogFragment.Callbacks
    public void onWithdrawalLockingDismissed() {
        getDuxo().setWithdrawalsLocked(false);
    }

    @Override // com.robinhood.android.common.mcduckling.ui.detail.card.SecondaryAuthenticationFragment.Callbacks
    public void onSecondaryAuthenticationSuccess(int requestCode) {
        if (requestCode == 1) {
            getDuxo().setShowAccountNumber(true);
        }
    }

    /* compiled from: AchAccountInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AchAccountInfo;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "REQUEST_SECONDARY_AUTH_ACCOUNT_NUMBER", "", "createFragment", "key", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AchAccountInfoFragment, LegacyFragmentKey.AchAccountInfo>, FragmentResolver<LegacyFragmentKey.AchAccountInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.AchAccountInfo getArgs(AchAccountInfoFragment achAccountInfoFragment) {
            return (LegacyFragmentKey.AchAccountInfo) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, achAccountInfoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AchAccountInfoFragment newInstance(LegacyFragmentKey.AchAccountInfo achAccountInfo) {
            return (AchAccountInfoFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, achAccountInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AchAccountInfoFragment achAccountInfoFragment, LegacyFragmentKey.AchAccountInfo achAccountInfo) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, achAccountInfoFragment, achAccountInfo);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public AchAccountInfoFragment createFragment(LegacyFragmentKey.AchAccountInfo key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (AchAccountInfoFragment) newInstance((Parcelable) key);
        }
    }
}
