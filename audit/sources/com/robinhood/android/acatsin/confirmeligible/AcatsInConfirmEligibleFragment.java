package com.robinhood.android.acatsin.confirmeligible;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleContract;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInConfirmEligibleBinding;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.transfers.contracts.experiments.RetTransferPromoExperiment;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.Either;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Single;
import java.util.NoSuchElementException;
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

/* compiled from: AcatsInConfirmEligibleFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020 H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "viewBinding", "Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInConfirmEligibleBinding;", "getViewBinding", "()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInConfirmEligibleBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleContract$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupFeeWarningRow", "getConfirmEligibleText", "", "inHoodMonth2025Promo", "", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInConfirmEligibleFragment extends AcatsFlowStepFragment3 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public ExperimentsStore experimentsStore;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInConfirmEligibleFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInConfirmEligibleBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInConfirmEligibleFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AcatsInConfirmEligibleFragment() {
        super(C7725R.layout.fragment_acats_in_confirm_eligible, null, AcatsFlowStep.CONFIRM_ELIGIBLE, 2, null);
        this.viewBinding = ViewBinding5.viewBinding(this, AcatsInConfirmEligibleFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInConfirmEligibleContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInConfirmEligibleContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
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

    /* compiled from: AcatsInConfirmEligibleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleFragment;", "Lcom/robinhood/android/acatsin/confirmeligible/AcatsInConfirmEligibleContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInConfirmEligibleFragment, AcatsInConfirmEligibleContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInConfirmEligibleContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInConfirmEligibleContract.Key getArgs(AcatsInConfirmEligibleFragment acatsInConfirmEligibleFragment) {
            return (AcatsInConfirmEligibleContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInConfirmEligibleFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInConfirmEligibleFragment newInstance(AcatsInConfirmEligibleContract.Key key) {
            return (AcatsInConfirmEligibleFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInConfirmEligibleFragment acatsInConfirmEligibleFragment, AcatsInConfirmEligibleContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInConfirmEligibleFragment, key);
        }
    }

    private final FragmentAcatsInConfirmEligibleBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInConfirmEligibleBinding) value;
    }

    private final AcatsInConfirmEligibleContract.Callbacks getCallbacks() {
        return (AcatsInConfirmEligibleContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_ACCOUNT_ELIGIBLE;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInConfirmEligibleContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LottieUrl.ACATS_ELIGIBLE_YES.prefetch(context);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        Single singleFirst = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{RetTransferPromoExperiment.INSTANCE}, false, null, 6, null).first(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirst, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInConfirmEligibleFragment.onViewCreated$lambda$0(this.f$0, (Boolean) obj);
            }
        });
        FragmentAcatsInConfirmEligibleBinding viewBinding = getViewBinding();
        LottieAnimationView lottieview = viewBinding.lottieview;
        Intrinsics.checkNotNullExpressionValue(lottieview, "lottieview");
        LottieAnimationViewsKt.setRemoteUrl(lottieview, LottieUrl.ACATS_ELIGIBLE_YES);
        RdsButton continueButton = viewBinding.continueButton;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        OnClickListeners.onClick(continueButton, new Function0() { // from class: com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInConfirmEligibleFragment.onViewCreated$lambda$6$lambda$1(this.f$0);
            }
        });
        RdsButton rdsButton = viewBinding.choosePartialsButton;
        Companion companion = INSTANCE;
        if (((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) this)).isReconfirmation()) {
            string2 = getResources().getString(C7725R.string.position_checklist_edit_partial_transfer);
        } else {
            string2 = getResources().getString(C7725R.string.position_checklist_choose_partial_instead);
        }
        rdsButton.setText(string2);
        RdsButton choosePartialsButton = viewBinding.choosePartialsButton;
        Intrinsics.checkNotNullExpressionValue(choosePartialsButton, "choosePartialsButton");
        OnClickListeners.onClick(choosePartialsButton, new Function0() { // from class: com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInConfirmEligibleFragment.onViewCreated$lambda$6$lambda$2(this.f$0);
            }
        });
        RhTextView rhTextView = viewBinding.confirmEligibleTitle;
        if (((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) this)).isReconfirmation()) {
            string3 = getResources().getString(C7725R.string.reconfirm_eligible_title);
        } else {
            string3 = getResources().getString(C7725R.string.confirm_eligible_title);
        }
        rhTextView.setText(string3);
        RdsTextButton rdsTextButton = viewBinding.confirmEligibleLink;
        rdsTextButton.setVisibility(((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) this)).getShowSupportLink() ? 0 : 8);
        Intrinsics.checkNotNull(rdsTextButton);
        ViewsKt.eventData$default(rdsTextButton, false, new Function0() { // from class: com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInConfirmEligibleFragment.onViewCreated$lambda$6$lambda$5$lambda$3();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInConfirmEligibleFragment.onViewCreated$lambda$6$lambda$5$lambda$4(this.f$0);
            }
        });
        setupFeeWarningRow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(AcatsInConfirmEligibleFragment acatsInConfirmEligibleFragment, Boolean bool) {
        RhTextView rhTextView = acatsInConfirmEligibleFragment.getViewBinding().confirmEligibleText;
        Intrinsics.checkNotNull(bool);
        rhTextView.setText(acatsInConfirmEligibleFragment.getConfirmEligibleText(bool.booleanValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$1(AcatsInConfirmEligibleFragment acatsInConfirmEligibleFragment) {
        if (((AcatsInConfirmEligibleContract.Key) INSTANCE.getArgs((Fragment) acatsInConfirmEligibleFragment)).isReconfirmation()) {
            acatsInConfirmEligibleFragment.getCallbacks().onFullTransferReselected();
        } else {
            acatsInConfirmEligibleFragment.getCallbacks().onFullTransferSelected();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$2(AcatsInConfirmEligibleFragment acatsInConfirmEligibleFragment) {
        Companion companion = INSTANCE;
        if (((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) acatsInConfirmEligibleFragment)).isReconfirmation()) {
            acatsInConfirmEligibleFragment.requireActivity().onBackPressed();
        } else if (((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) acatsInConfirmEligibleFragment)).getHasPlaidAssets()) {
            acatsInConfirmEligibleFragment.getCallbacks().onPlaidPartialTransferSelected();
        } else {
            acatsInConfirmEligibleFragment.getCallbacks().onPartialTransferSelected();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$6$lambda$5$lambda$3() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5$lambda$4(AcatsInConfirmEligibleFragment acatsInConfirmEligibleFragment) {
        WebUtils.viewUrl$default(acatsInConfirmEligibleFragment.requireContext(), C7725R.string.whats_transferable_url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    private final void setupFeeWarningRow() {
        boolean hasShortEquityPositions = ((AcatsInConfirmEligibleContract.Key) INSTANCE.getArgs((Fragment) this)).getHasShortEquityPositions();
        RhTextView feeWarningText = getViewBinding().feeWarningText;
        Intrinsics.checkNotNullExpressionValue(feeWarningText, "feeWarningText");
        feeWarningText.setVisibility(hasShortEquityPositions ? 0 : 8);
        if (hasShortEquityPositions) {
            RhTextView feeWarningText2 = getViewBinding().feeWarningText;
            Intrinsics.checkNotNullExpressionValue(feeWarningText2, "feeWarningText");
            OnClickListeners.onClick(feeWarningText2, new Function0() { // from class: com.robinhood.android.acatsin.confirmeligible.AcatsInConfirmEligibleFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AcatsInConfirmEligibleFragment.setupFeeWarningRow$lambda$7(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupFeeWarningRow$lambda$7(AcatsInConfirmEligibleFragment acatsInConfirmEligibleFragment) {
        acatsInConfirmEligibleFragment.getCallbacks().onShowBorrowingFeeDetails();
        return Unit.INSTANCE;
    }

    private final String getConfirmEligibleText(boolean inHoodMonth2025Promo) throws Resources.NotFoundException {
        String string2;
        Companion companion = INSTANCE;
        if (((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) this)).isReconfirmation()) {
            string2 = getResources().getString(C7725R.string.reconfirm_eligible_body, Eithers.getName(((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()));
        } else if (((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) this)).getHasPlaidAssets()) {
            string2 = getResources().getString(C7725R.string.confirm_eligible_body_plaid, Eithers.getName(((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()));
        } else {
            Either<ApiBrokerage, String> brokerageOrDtcNumber = ((AcatsInConfirmEligibleContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber();
            if (brokerageOrDtcNumber instanceof Either.Left) {
                string2 = getResources().getString(C7725R.string.confirm_eligible_body, ((ApiBrokerage) ((Either.Left) brokerageOrDtcNumber).getValue()).getName());
            } else {
                if (!(brokerageOrDtcNumber instanceof Either.Right)) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = getResources().getString(C7725R.string.confirm_eligible_body_generic);
            }
        }
        Intrinsics.checkNotNull(string2);
        if (!inHoodMonth2025Promo) {
            return string2;
        }
        String string3 = getResources().getString(C7725R.string.confirm_eligible_body_hood_month_2025_promo, string2);
        Intrinsics.checkNotNull(string3);
        return string3;
    }
}
