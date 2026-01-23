package com.robinhood.android.taxcertification;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p081cx.CxTopic;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.android.taxcertification.TaxInfoConfirmBottomSheetFragment;
import com.robinhood.android.taxcertification.TaxInfoConfirmViewState3;
import com.robinhood.android.taxcertification.VerifyTaxInfoDestination;
import com.robinhood.android.taxcertification.databinding.FragmentTaxInfoConfirmBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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

/* compiled from: TaxInfoConfirmFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020&H\u0016J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020&2\u0006\u0010-\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020&2\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020&H\u0016J\b\u00105\u001a\u00020&H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxInfoConfirmFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/taxcertification/TaxInfoConfirmBottomSheetFragment$Callbacks;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "binding", "Lcom/robinhood/android/taxcertification/databinding/FragmentTaxInfoConfirmBinding;", "getBinding", "()Lcom/robinhood/android/taxcertification/databinding/FragmentTaxInfoConfirmBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/taxcertification/TaxInfoConfirmDuxo;", "getDuxo", "()Lcom/robinhood/android/taxcertification/TaxInfoConfirmDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "receiver", "Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", "getReceiver", "()Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", "receiver$delegate", "<set-?>", "Lcom/robinhood/android/taxcertification/SsnAttemptState;", "attemptState", "getAttemptState", "()Lcom/robinhood/android/taxcertification/SsnAttemptState;", "setAttemptState", "(Lcom/robinhood/android/taxcertification/SsnAttemptState;)V", "attemptState$delegate", "Lkotlin/properties/ReadWriteProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindViewState", "state", "Lcom/robinhood/android/taxcertification/TaxInfoConfirmViewState;", "bindSsnDisplayState", "Lcom/robinhood/android/taxcertification/SsnDisplayState;", "bindAddressRow", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "onCheckSsnClicked", "onContactSupportClicked", "Companion", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TaxInfoConfirmFragment extends BaseFragment implements TaxInfoConfirmBottomSheetFragment.Callbacks {
    private static final String BOTTOM_SHEET_TAG = "taxInfoConfirmBottomSheet";
    public AnalyticsLogger analytics;

    /* renamed from: attemptState$delegate, reason: from kotlin metadata */
    private final Interfaces3 attemptState;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: receiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 receiver;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TaxInfoConfirmFragment.class, "binding", "getBinding()Lcom/robinhood/android/taxcertification/databinding/FragmentTaxInfoConfirmBinding;", 0)), Reflection.property1(new PropertyReference1Impl(TaxInfoConfirmFragment.class, "receiver", "getReceiver()Lcom/robinhood/android/taxcertification/VerifyTaxInfoDestination$Receiver;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TaxInfoConfirmFragment.class, "attemptState", "getAttemptState()Lcom/robinhood/android/taxcertification/SsnAttemptState;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: TaxInfoConfirmFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxInfoConfirmViewState2.values().length];
            try {
                iArr[TaxInfoConfirmViewState2.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxInfoConfirmViewState2.CAN_ATTEMPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaxInfoConfirmViewState2.LOCKED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TaxInfoConfirmFragment() {
        super(C29286R.layout.fragment_tax_info_confirm);
        this.binding = ViewBinding5.viewBinding(this, TaxInfoConfirmFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, TaxInfoConfirmDuxo.class);
        this.receiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(VerifyTaxInfoDestination.Receiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.attemptState = (Interfaces3) BindSavedState2.savedSerializable(this, TaxInfoConfirmViewState2.LOADING).provideDelegate(this, $$delegatedProperties[2]);
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

    private final FragmentTaxInfoConfirmBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTaxInfoConfirmBinding) value;
    }

    private final TaxInfoConfirmDuxo getDuxo() {
        return (TaxInfoConfirmDuxo) this.duxo.getValue();
    }

    private final VerifyTaxInfoDestination.Receiver getReceiver() {
        return (VerifyTaxInfoDestination.Receiver) this.receiver.getValue(this, $$delegatedProperties[1]);
    }

    private final TaxInfoConfirmViewState2 getAttemptState() {
        return (TaxInfoConfirmViewState2) this.attemptState.getValue(this, $$delegatedProperties[2]);
    }

    private final void setAttemptState(TaxInfoConfirmViewState2 taxInfoConfirmViewState2) {
        this.attemptState.setValue(this, $$delegatedProperties[2], taxInfoConfirmViewState2);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsButton taxInfoUpdateCta = getBinding().taxInfoUpdateCta;
        Intrinsics.checkNotNullExpressionValue(taxInfoUpdateCta, "taxInfoUpdateCta");
        OnClickListeners.onClick(taxInfoUpdateCta, new Function0() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxInfoConfirmFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton taxInfoConfirmCta = getBinding().taxInfoConfirmCta;
        Intrinsics.checkNotNullExpressionValue(taxInfoConfirmCta, "taxInfoConfirmCta");
        OnClickListeners.onClick(taxInfoConfirmCta, new Function0() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxInfoConfirmFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(TaxInfoConfirmFragment taxInfoConfirmFragment) {
        TaxInfoConfirmBottomSheetFragment taxInfoConfirmBottomSheetFragment = (TaxInfoConfirmBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(TaxInfoConfirmBottomSheetFragment.INSTANCE, INSTANCE.getArgs((Fragment) taxInfoConfirmFragment), taxInfoConfirmFragment, 0, 4, null);
        FragmentManager parentFragmentManager = taxInfoConfirmFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        taxInfoConfirmBottomSheetFragment.show(parentFragmentManager, BOTTOM_SHEET_TAG);
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(taxInfoConfirmFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_VERIFY_TAX_INFO, AnalyticsStrings.BUTTON_TITLE_VERIFY_TAX_INFO_UPDATE_INFO, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(TaxInfoConfirmFragment taxInfoConfirmFragment) {
        taxInfoConfirmFragment.getReceiver().navigateToDestination(VerifyTaxInfoDestination.Exit.INSTANCE);
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(taxInfoConfirmFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_VERIFY_TAX_INFO, AnalyticsStrings.BUTTON_TITLE_VERIFY_TAX_INFO_CONFIRM, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C292951(this));
    }

    /* compiled from: TaxInfoConfirmFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.taxcertification.TaxInfoConfirmFragment$onStart$1 */
    /* synthetic */ class C292951 extends FunctionReferenceImpl implements Function1<TaxInfoConfirmViewState, Unit> {
        C292951(Object obj) {
            super(1, obj, TaxInfoConfirmFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/taxcertification/TaxInfoConfirmViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TaxInfoConfirmViewState taxInfoConfirmViewState) {
            invoke2(taxInfoConfirmViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TaxInfoConfirmViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TaxInfoConfirmFragment) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(TaxInfoConfirmViewState state) {
        FragmentTaxInfoConfirmBinding binding = getBinding();
        requireToolbar().setLoadingViewVisible(state.getLoading());
        binding.taxInfoConfirmCta.setLoading(state.getLoading());
        binding.taxInfoNameRow.setSecondaryText(state.getFullName());
        UiAddress address = state.getAddress();
        if (address != null) {
            bindAddressRow(address);
        }
        bindSsnDisplayState(state.getSsnDisplayState());
        setAttemptState(state.getSsnAttemptState());
    }

    private final void bindSsnDisplayState(TaxInfoConfirmViewState3 state) {
        RdsRowView rdsRowView = getBinding().taxInfoSsnRow;
        Intrinsics.checkNotNull(rdsRowView);
        TaxInfoConfirmViewState3.Hide hide = TaxInfoConfirmViewState3.Hide.INSTANCE;
        rdsRowView.setVisibility(!Intrinsics.areEqual(state, hide) ? 0 : 8);
        if (Intrinsics.areEqual(state, hide)) {
            return;
        }
        if (Intrinsics.areEqual(state, TaxInfoConfirmViewState3.Failure.INSTANCE) || Intrinsics.areEqual(state, TaxInfoConfirmViewState3.Loading.INSTANCE)) {
            rdsRowView.setSecondaryText(rdsRowView.getResources().getString(C29286R.string.tax_info_confirm_fully_masked_ssn));
        } else {
            if (!(state instanceof TaxInfoConfirmViewState3.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            rdsRowView.setSecondaryText(rdsRowView.getResources().getString(C29286R.string.tax_info_confirm_partial_masked_ssn, ((TaxInfoConfirmViewState3.Success) state).getLastFourDigits()));
        }
    }

    private final void bindAddressRow(final UiAddress address) {
        RdsRowView rdsRowView = getBinding().taxInfoAddressRow;
        rdsRowView.setSecondaryText(address.getDisplayMultiline());
        rdsRowView.setMetadataPrimaryText(rdsRowView.getResources().getString(C29286R.string.tax_info_confirm_address_edit_cta));
        rdsRowView.onPrimaryMetadataClick(new Function0() { // from class: com.robinhood.android.taxcertification.TaxInfoConfirmFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxInfoConfirmFragment.bindAddressRow$lambda$5$lambda$4(this.f$0, address);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAddressRow$lambda$5$lambda$4(TaxInfoConfirmFragment taxInfoConfirmFragment, UiAddress uiAddress) {
        Navigator navigator = taxInfoConfirmFragment.getNavigator();
        Context contextRequireContext = taxInfoConfirmFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.ChooseAddress(ChooseAddressSource.SETTINGS_MODIFY_RESIDENTIAL, uiAddress.getCountry(), null, null, false, 28, null), null, false, null, null, 60, null);
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(taxInfoConfirmFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_VERIFY_TAX_INFO, AnalyticsStrings.BUTTON_TITLE_VERIFY_TAX_INFO_EDIT_ADDRESS, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.taxcertification.TaxInfoConfirmBottomSheetFragment.Callbacks
    public void onCheckSsnClicked() {
        VerifyTaxInfoDestination verifyTaxInfoDestination;
        int i = WhenMappings.$EnumSwitchMapping$0[getAttemptState().ordinal()];
        if (i == 1 || i == 2) {
            verifyTaxInfoDestination = VerifyTaxInfoDestination.CheckSsn.INSTANCE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            verifyTaxInfoDestination = VerifyTaxInfoDestination.SsnLockout.INSTANCE;
        }
        getReceiver().navigateToDestination(verifyTaxInfoDestination);
    }

    @Override // com.robinhood.android.taxcertification.TaxInfoConfirmBottomSheetFragment.Callbacks
    public void onContactSupportClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, String.valueOf(CxTopic.ISSUE_TAX_VERIFICATION.getTopicId()), false, 4, null);
    }

    /* compiled from: TaxInfoConfirmFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxInfoConfirmFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/taxcertification/TaxInfoConfirmFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$VerifyTaxInfo;", "<init>", "()V", "BOTTOM_SHEET_TAG", "", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TaxInfoConfirmFragment, LegacyFragmentKey.VerifyTaxInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.VerifyTaxInfo getArgs(TaxInfoConfirmFragment taxInfoConfirmFragment) {
            return (LegacyFragmentKey.VerifyTaxInfo) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, taxInfoConfirmFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TaxInfoConfirmFragment newInstance(LegacyFragmentKey.VerifyTaxInfo verifyTaxInfo) {
            return (TaxInfoConfirmFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, verifyTaxInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TaxInfoConfirmFragment taxInfoConfirmFragment, LegacyFragmentKey.VerifyTaxInfo verifyTaxInfo) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, taxInfoConfirmFragment, verifyTaxInfo);
        }
    }
}
