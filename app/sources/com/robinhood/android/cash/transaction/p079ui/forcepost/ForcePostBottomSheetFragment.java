package com.robinhood.android.cash.transaction.p079ui.forcepost;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.cash.transaction.databinding.FragmentForcePostBottomSheetBinding;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.googlepay.GooglePayPushTokenizeManager;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ForcePostBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\t\u0010#\u001a\u00020$H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/cash/transaction/databinding/FragmentForcePostBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/cash/transaction/databinding/FragmentForcePostBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "googlePayPushTokenizeManager", "Lcom/robinhood/android/googlepay/GooglePayPushTokenizeManager;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostViewState;", "setShowCardNumberButton", "button", "Lcom/robinhood/android/designsystem/button/RdsButton;", "setGooglePayButton", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ForcePostBottomSheetFragment extends BaseBottomSheetDialogFragment implements RegionGated {
    private static final int REQUEST_PUSH_TOKENIZE = 3;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GooglePayPushTokenizeManager googlePayPushTokenizeManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ForcePostBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/transaction/databinding/FragmentForcePostBottomSheetBinding;", 0))};

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

    public ForcePostBottomSheetFragment() {
        super(C10421R.layout.fragment_force_post_bottom_sheet);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, ForcePostDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, ForcePostBottomSheetFragment2.INSTANCE);
        this.googlePayPushTokenizeManager = new GooglePayPushTokenizeManager();
    }

    private final ForcePostDuxo getDuxo() {
        return (ForcePostDuxo) this.duxo.getValue();
    }

    private final FragmentForcePostBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentForcePostBottomSheetBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        LifecycleHost.DefaultImpls.bind$default(this, googlePayPushTokenizeManager.onDataChanged(fragmentActivityRequireActivity), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ForcePostBottomSheetFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C104582(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ForcePostBottomSheetFragment forcePostBottomSheetFragment) {
        forcePostBottomSheetFragment.getDuxo().updateGooglePayData();
        return Unit.INSTANCE;
    }

    /* compiled from: ForcePostBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostBottomSheetFragment$onViewCreated$2 */
    /* synthetic */ class C104582 extends FunctionReferenceImpl implements Function1<ForcePostViewState, Unit> {
        C104582(Object obj) {
            super(1, obj, ForcePostBottomSheetFragment.class, "bind", "bind(Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ForcePostViewState forcePostViewState) {
            invoke2(forcePostViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ForcePostViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ForcePostBottomSheetFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(ForcePostViewState state) {
        RhTextView rhTextView = getBinding().forcePostDescription;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rhTextView.setText(state.getForcePostDescription(contextRequireContext));
        if (state.getIsTransactionInStore() && state.getIsMobileWalletTransaction()) {
            RdsButton forcePostPrimaryBtn = getBinding().forcePostPrimaryBtn;
            Intrinsics.checkNotNullExpressionValue(forcePostPrimaryBtn, "forcePostPrimaryBtn");
            setGooglePayButton(forcePostPrimaryBtn, state);
        } else {
            RdsButton forcePostPrimaryBtn2 = getBinding().forcePostPrimaryBtn;
            Intrinsics.checkNotNullExpressionValue(forcePostPrimaryBtn2, "forcePostPrimaryBtn");
            setShowCardNumberButton(forcePostPrimaryBtn2);
            RdsButton forcePostSecondaryBtn = getBinding().forcePostSecondaryBtn;
            Intrinsics.checkNotNullExpressionValue(forcePostSecondaryBtn, "forcePostSecondaryBtn");
            setGooglePayButton(forcePostSecondaryBtn, state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setShowCardNumberButton$lambda$3$lambda$2(ForcePostBottomSheetFragment forcePostBottomSheetFragment) {
        forcePostBottomSheetFragment.dismiss();
        Navigator navigator = forcePostBottomSheetFragment.getNavigator();
        Context contextRequireContext = forcePostBottomSheetFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.RhyCardSettings(LegacyFragmentKey.RhyCardSettings.Action.SHOW_CARD_NUMBER), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    private final void setGooglePayButton(RdsButton button, ForcePostViewState state) {
        PushTokenizeRequest pushTokenizeRequestConsume;
        button.setLoading(state.isRequestLoading());
        button.setVisibility(0);
        if (state.isGooglePayActive()) {
            button.setText(getText(C10421R.string.force_post_card_use_google_pay));
            OnClickListeners.onClick(button, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ForcePostBottomSheetFragment.setGooglePayButton$lambda$7$lambda$4(this.f$0);
                }
            });
            return;
        }
        button.setText(getText(C10421R.string.force_post_card_add_to_google_pay));
        OnClickListeners.onClick(button, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ForcePostBottomSheetFragment.setGooglePayButton$lambda$7$lambda$5(this.f$0);
            }
        });
        UiEvent<PushTokenizeRequest> pushTokenizeEvent = state.getPushTokenizeEvent();
        if (pushTokenizeEvent == null || (pushTokenizeRequestConsume = pushTokenizeEvent.consume()) == null) {
            return;
        }
        GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        googlePayPushTokenizeManager.pushTokenize(fragmentActivityRequireActivity, pushTokenizeRequestConsume, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGooglePayButton$lambda$7$lambda$4(ForcePostBottomSheetFragment forcePostBottomSheetFragment) {
        forcePostBottomSheetFragment.getDuxo().viewToken();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGooglePayButton$lambda$7$lambda$5(ForcePostBottomSheetFragment forcePostBottomSheetFragment) {
        forcePostBottomSheetFragment.getDuxo().getPushTokenizeEvent();
        return Unit.INSTANCE;
    }

    /* compiled from: ForcePostBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$ForcePostBottomSheet;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/transaction/ui/forcepost/ForcePostBottomSheetFragment;", "<init>", "()V", "REQUEST_PUSH_TOKENIZE", "", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolver<LegacyDialogFragmentKey.ForcePostBottomSheet>, FragmentWithArgsCompanion<ForcePostBottomSheetFragment, LegacyDialogFragmentKey.ForcePostBottomSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.ForcePostBottomSheet getArgs(ForcePostBottomSheetFragment forcePostBottomSheetFragment) {
            return (LegacyDialogFragmentKey.ForcePostBottomSheet) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, forcePostBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ForcePostBottomSheetFragment newInstance(LegacyDialogFragmentKey.ForcePostBottomSheet forcePostBottomSheet) {
            return (ForcePostBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, forcePostBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ForcePostBottomSheetFragment forcePostBottomSheetFragment, LegacyDialogFragmentKey.ForcePostBottomSheet forcePostBottomSheet) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, forcePostBottomSheetFragment, forcePostBottomSheet);
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DialogFragment createDialogFragment(LegacyDialogFragmentKey.ForcePostBottomSheet key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (DialogFragment) ForcePostBottomSheetFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }

    private final void setShowCardNumberButton(RdsButton button) {
        button.setVisibility(0);
        button.setText(getText(C10421R.string.force_post_card_show_card_number));
        OnClickListeners.onClick(button, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ForcePostBottomSheetFragment.setShowCardNumberButton$lambda$3$lambda$2(this.f$0);
            }
        });
    }
}
