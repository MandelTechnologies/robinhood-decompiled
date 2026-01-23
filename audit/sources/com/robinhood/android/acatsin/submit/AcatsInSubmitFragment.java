package com.robinhood.android.acatsin.submit;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInSubmitBinding;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3;
import com.robinhood.android.acatsin.submit.AcatsInSubmitContract;
import com.robinhood.android.acatsin.submit.AcatsInSubmitViewState;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.acatsin.util.ImageViews;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsInSubmitFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/submit/AcatsInSubmitDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInSubmitBinding;", "getViewBinding", "()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInSubmitBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/submit/AcatsInSubmitContract$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setViewState", "viewState", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState;", "bindRequestState", "acatsTransferRequestState", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState$AcatsTransferRequestState;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInSubmitFragment extends AcatsFlowStepFragment3 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInSubmitFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInSubmitBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInSubmitFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/submit/AcatsInSubmitContract$Callbacks;", 0))};

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

    public AcatsInSubmitFragment() {
        super(C7725R.layout.fragment_acats_in_submit, null, AcatsFlowStep.REVIEW_AND_SUBMIT, 2, null);
        this.duxo = DuxosKt.duxo(this, AcatsInSubmitDuxo.class);
        this.viewBinding = ViewBinding5.viewBinding(this, AcatsInSubmitFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInSubmitContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInSubmitContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInSubmitDuxo getDuxo() {
        return (AcatsInSubmitDuxo) this.duxo.getValue();
    }

    private final FragmentAcatsInSubmitBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInSubmitBinding) value;
    }

    private final AcatsInSubmitContract.Callbacks getCallbacks() {
        return (AcatsInSubmitContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_SUBMIT;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInSubmitContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInSubmitContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInSubmitContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C80571(null), 1, null);
    }

    /* compiled from: AcatsInSubmitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.submit.AcatsInSubmitFragment$onViewCreated$1", m3645f = "AcatsInSubmitFragment.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.submit.AcatsInSubmitFragment$onViewCreated$1 */
    static final class C80571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C80571(Continuation<? super C80571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInSubmitFragment.this.new C80571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C80571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInSubmitFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.submit.AcatsInSubmitFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInSubmitFragment $tmp0;

            AnonymousClass1(AcatsInSubmitFragment acatsInSubmitFragment) {
                this.$tmp0 = acatsInSubmitFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInSubmitFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/acatsin/submit/AcatsInSubmitViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInSubmitViewState acatsInSubmitViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$setViewState = C80571.invokeSuspend$setViewState(this.$tmp0, acatsInSubmitViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInSubmitViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(AcatsInSubmitFragment acatsInSubmitFragment, AcatsInSubmitViewState acatsInSubmitViewState, Continuation continuation) throws Resources.NotFoundException {
            acatsInSubmitFragment.setViewState(acatsInSubmitViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInSubmitViewState> stateFlow = AcatsInSubmitFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInSubmitFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final AcatsInSubmitViewState viewState) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence text2;
        FragmentAcatsInSubmitBinding viewBinding = getViewBinding();
        RhTextView rhTextView = viewBinding.title;
        StringResource title = viewState.getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(title.getText(resources));
        if (viewState.getContraBrokerLogo() != null) {
            viewBinding.brokerageRow.brokerLogoView.setImageBitmap(viewState.getContraBrokerLogo());
        } else {
            ImageView brokerLogoView = viewBinding.brokerageRow.brokerLogoView;
            Intrinsics.checkNotNullExpressionValue(brokerLogoView, "brokerLogoView");
            ImageViews.showDefaultBrokerageLogo(brokerLogoView);
        }
        viewBinding.brokerageRow.brokerNameTxt.setText(viewState.getBrokerageDisplayLabel());
        RdsDataRowView rdsDataRowView = viewBinding.accountNameRow;
        StringResource accountName = viewState.getAccountName();
        if (accountName != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text = accountName.getText(resources2);
        } else {
            text = null;
        }
        rdsDataRowView.setValueText(text);
        viewBinding.accountNumberRow.setValueText(viewState.getContraAccountNumber());
        RhTextView rhTextView2 = viewBinding.nameOnAccountLabel;
        StringResource namesOnAccountLabel = viewState.getNamesOnAccountLabel();
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rhTextView2.setText(namesOnAccountLabel.getText(resources3));
        viewBinding.nameOnAccountValue.setText(viewState.getNamesOnAccountValue());
        RhTextView rhTextView3 = viewBinding.disclaimer;
        StringResource disclaimer = viewState.getDisclaimer();
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        rhTextView3.setText(disclaimer.getText(resources4));
        FrameLayout assetListRowParent = viewBinding.assetListRowParent;
        Intrinsics.checkNotNullExpressionValue(assetListRowParent, "assetListRowParent");
        assetListRowParent.setVisibility(viewState.getShowAssetsRow() ? 0 : 8);
        FrameLayout assetListRowParent2 = viewBinding.assetListRowParent;
        Intrinsics.checkNotNullExpressionValue(assetListRowParent2, "assetListRowParent");
        OnClickListeners.onClick(assetListRowParent2, new Function0() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInSubmitFragment.setViewState$lambda$7$lambda$0(this.f$0, viewState);
            }
        });
        RdsDataRowView rdsDataRowView2 = viewBinding.assetListRow;
        StringResource assetsDisplayLabel = viewState.getAssetsDisplayLabel();
        if (assetsDisplayLabel != null) {
            Resources resources5 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
            text2 = assetsDisplayLabel.getText(resources5);
        } else {
            text2 = null;
        }
        rdsDataRowView2.setValueText(text2);
        View assetDivider = viewBinding.assetDivider;
        Intrinsics.checkNotNullExpressionValue(assetDivider, "assetDivider");
        assetDivider.setVisibility(viewState.getShowAssetsRow() ? 0 : 8);
        RdsDataRowView rdsDataRowView3 = viewBinding.matchRow;
        BigDecimal retirementMatchRate = viewState.getRetirementMatchRate();
        if (retirementMatchRate != null) {
            String str = Formats.getInterestRateFormatShortWithPercentage().format(retirementMatchRate);
            rdsDataRowView3.setLabelText(getString(C7725R.string.acats_in_review_match_percentage_template));
            rdsDataRowView3.setValueText(getString(C7725R.string.acats_in_review_match_availability, str));
        }
        String displayTaxableAccountBonusRate = viewState.getDisplayTaxableAccountBonusRate();
        if (displayTaxableAccountBonusRate != null) {
            rdsDataRowView3.setLabelText(getString(C7725R.string.acats_in_review_bonus_percentage_template));
            rdsDataRowView3.setValueText(getString(C7725R.string.acats_in_review_match_availability, displayTaxableAccountBonusRate));
        }
        Intrinsics.checkNotNull(rdsDataRowView3);
        rdsDataRowView3.setVisibility(viewState.getMatchRowVisible() ? 0 : 8);
        RdsButton rdsButton = viewBinding.submitButton;
        StringResource submitButtonText = viewState.getSubmitButtonText();
        Resources resources6 = rdsButton.getResources();
        Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
        rdsButton.setText(submitButtonText.getText(resources6));
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInSubmitFragment.setViewState$lambda$7$lambda$6$lambda$4();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.acatsin.submit.AcatsInSubmitFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInSubmitFragment.setViewState$lambda$7$lambda$6$lambda$5(this.f$0, viewState);
            }
        });
        AcatsInSubmitViewState.AcatsTransferRequestState acatsTransferRequestState = viewState.getAcatsTransferRequestState();
        if (acatsTransferRequestState != null) {
            bindRequestState(acatsTransferRequestState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$7$lambda$0(AcatsInSubmitFragment acatsInSubmitFragment, AcatsInSubmitViewState acatsInSubmitViewState) {
        acatsInSubmitFragment.getCallbacks().onAssetsClicked(acatsInSubmitViewState.getAssets());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor setViewState$lambda$7$lambda$6$lambda$4() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SUBMIT, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$7$lambda$6$lambda$5(AcatsInSubmitFragment acatsInSubmitFragment, AcatsInSubmitViewState acatsInSubmitViewState) {
        acatsInSubmitFragment.getDuxo().submit(acatsInSubmitViewState.getRequest());
        return Unit.INSTANCE;
    }

    private final void bindRequestState(AcatsInSubmitViewState.AcatsTransferRequestState acatsTransferRequestState) {
        if (Intrinsics.areEqual(acatsTransferRequestState, AcatsInSubmitViewState.AcatsTransferRequestState.Loading.INSTANCE)) {
            getViewBinding().submitButton.setLoading(true);
            return;
        }
        if (acatsTransferRequestState instanceof AcatsInSubmitViewState.AcatsTransferRequestState.Success) {
            getViewBinding().submitButton.setLoading(false);
            getCallbacks().onAcatsSubmitted(((AcatsInSubmitViewState.AcatsTransferRequestState.Success) acatsTransferRequestState).getAcatsTransferId());
        } else {
            if (!(acatsTransferRequestState instanceof AcatsInSubmitViewState.AcatsTransferRequestState.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            getViewBinding().submitButton.setLoading(false);
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((AcatsInSubmitViewState.AcatsTransferRequestState.Error) acatsTransferRequestState).getThrowable(), false, 2, null);
        }
    }

    /* compiled from: AcatsInSubmitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/submit/AcatsInSubmitFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitFragment;", "Lcom/robinhood/android/acatsin/submit/AcatsInSubmitContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInSubmitFragment, AcatsInSubmitContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInSubmitContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInSubmitContract.Key getArgs(AcatsInSubmitFragment acatsInSubmitFragment) {
            return (AcatsInSubmitContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInSubmitFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInSubmitFragment newInstance(AcatsInSubmitContract.Key key) {
            return (AcatsInSubmitFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInSubmitFragment acatsInSubmitFragment, AcatsInSubmitContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInSubmitFragment, key);
        }
    }
}
