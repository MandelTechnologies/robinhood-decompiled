package com.robinhood.android.acatsin.positionchecklist.alternate.ineligible;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInPositionChecklistIneligibleAlternateBinding;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3;
import com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateContract;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: AcatsInPositionChecklistIneligibleAlternateFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00060\u001bj\u0002`\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "viewBinding", "Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInPositionChecklistIneligibleAlternateBinding;", "getViewBinding", "()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInPositionChecklistIneligibleAlternateBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateContract$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setState", "state", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateViewState;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPositionChecklistIneligibleAlternateFragment extends AcatsFlowStepFragment3 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInPositionChecklistIneligibleAlternateFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInPositionChecklistIneligibleAlternateBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInPositionChecklistIneligibleAlternateFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateContract$Callbacks;", 0))};

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

    public AcatsInPositionChecklistIneligibleAlternateFragment() {
        super(C7725R.layout.fragment_acats_in_position_checklist_ineligible_alternate, null, AcatsFlowStep.POSITION_CHECKLIST_INELIGIBLE_ALTERNATE, 2, null);
        this.viewBinding = ViewBinding5.viewBinding(this, AcatsInPositionChecklistIneligibleAlternateFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AcatsInPositionChecklistIneligibleAlternateDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInPositionChecklistIneligibleAlternateContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInPositionChecklistIneligibleAlternateContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* compiled from: AcatsInPositionChecklistIneligibleAlternateFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateFragment;", "Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInPositionChecklistIneligibleAlternateFragment, AcatsInPositionChecklistIneligibleAlternateContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInPositionChecklistIneligibleAlternateContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInPositionChecklistIneligibleAlternateContract.Key getArgs(AcatsInPositionChecklistIneligibleAlternateFragment acatsInPositionChecklistIneligibleAlternateFragment) {
            return (AcatsInPositionChecklistIneligibleAlternateContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInPositionChecklistIneligibleAlternateFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInPositionChecklistIneligibleAlternateFragment newInstance(AcatsInPositionChecklistIneligibleAlternateContract.Key key) {
            return (AcatsInPositionChecklistIneligibleAlternateFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInPositionChecklistIneligibleAlternateFragment acatsInPositionChecklistIneligibleAlternateFragment, AcatsInPositionChecklistIneligibleAlternateContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInPositionChecklistIneligibleAlternateFragment, key);
        }
    }

    private final FragmentAcatsInPositionChecklistIneligibleAlternateBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInPositionChecklistIneligibleAlternateBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInPositionChecklistIneligibleAlternateDuxo getDuxo() {
        return (AcatsInPositionChecklistIneligibleAlternateDuxo) this.duxo.getValue();
    }

    private final AcatsInPositionChecklistIneligibleAlternateContract.Callbacks getCallbacks() {
        return (AcatsInPositionChecklistIneligibleAlternateContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_ACCOUNT_NOT_ELIGIBLE;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInPositionChecklistIneligibleAlternateContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInPositionChecklistIneligibleAlternateContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInPositionChecklistIneligibleAlternateContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LottieUrl.ACATS_ELIGIBLE_NO.prefetch(context);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C80421(null), 1, null);
        FragmentAcatsInPositionChecklistIneligibleAlternateBinding viewBinding = getViewBinding();
        LottieAnimationView lottieview = viewBinding.lottieview;
        Intrinsics.checkNotNullExpressionValue(lottieview, "lottieview");
        LottieAnimationViewsKt.setRemoteUrl(lottieview, LottieUrl.ACATS_ELIGIBLE_NO);
        RdsTextButton reviewWhatsTransferableBtn = viewBinding.reviewWhatsTransferableBtn;
        Intrinsics.checkNotNullExpressionValue(reviewWhatsTransferableBtn, "reviewWhatsTransferableBtn");
        ViewsKt.eventData$default(reviewWhatsTransferableBtn, false, new Function0() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPositionChecklistIneligibleAlternateFragment.onViewCreated$lambda$5$lambda$0();
            }
        }, 1, null);
        RdsTextButton reviewWhatsTransferableBtn2 = viewBinding.reviewWhatsTransferableBtn;
        Intrinsics.checkNotNullExpressionValue(reviewWhatsTransferableBtn2, "reviewWhatsTransferableBtn");
        OnClickListeners.onClick(reviewWhatsTransferableBtn2, new Function0() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPositionChecklistIneligibleAlternateFragment.onViewCreated$lambda$5$lambda$1(this.f$0);
            }
        });
        RdsButton exitButton = viewBinding.exitButton;
        Intrinsics.checkNotNullExpressionValue(exitButton, "exitButton");
        ViewsKt.eventData$default(exitButton, false, new Function0() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPositionChecklistIneligibleAlternateFragment.onViewCreated$lambda$5$lambda$2();
            }
        }, 1, null);
        RdsButton exitButton2 = viewBinding.exitButton;
        Intrinsics.checkNotNullExpressionValue(exitButton2, "exitButton");
        OnClickListeners.onClick(exitButton2, new Function0() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPositionChecklistIneligibleAlternateFragment.onViewCreated$lambda$5$lambda$3(this.f$0);
            }
        });
        RdsButton exitButton3 = viewBinding.exitButton;
        Intrinsics.checkNotNullExpressionValue(exitButton3, "exitButton");
        exitButton3.setVisibility(8);
        viewBinding.positionChecklistAlternateIneligibleTitle.setText(C7725R.string.position_checklist_alternate_ineligible_title_partials);
        RdsButton choosePartialsButton = viewBinding.choosePartialsButton;
        Intrinsics.checkNotNullExpressionValue(choosePartialsButton, "choosePartialsButton");
        choosePartialsButton.setVisibility(0);
        RdsButton choosePartialsButton2 = viewBinding.choosePartialsButton;
        Intrinsics.checkNotNullExpressionValue(choosePartialsButton2, "choosePartialsButton");
        OnClickListeners.onClick(choosePartialsButton2, new Function0() { // from class: com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsInPositionChecklistIneligibleAlternateFragment.onViewCreated$lambda$5$lambda$4(this.f$0);
            }
        });
    }

    /* compiled from: AcatsInPositionChecklistIneligibleAlternateFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateFragment$onViewCreated$1", m3645f = "AcatsInPositionChecklistIneligibleAlternateFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateFragment$onViewCreated$1 */
    static final class C80421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C80421(Continuation<? super C80421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPositionChecklistIneligibleAlternateFragment.this.new C80421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C80421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInPositionChecklistIneligibleAlternateFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.positionchecklist.alternate.ineligible.AcatsInPositionChecklistIneligibleAlternateFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInPositionChecklistIneligibleAlternateFragment $tmp0;

            AnonymousClass1(AcatsInPositionChecklistIneligibleAlternateFragment acatsInPositionChecklistIneligibleAlternateFragment) {
                this.$tmp0 = acatsInPositionChecklistIneligibleAlternateFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInPositionChecklistIneligibleAlternateFragment.class, "setState", "setState(Lcom/robinhood/android/acatsin/positionchecklist/alternate/ineligible/AcatsInPositionChecklistIneligibleAlternateViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInPositionChecklistIneligibleAlternateViewState acatsInPositionChecklistIneligibleAlternateViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setState = C80421.invokeSuspend$setState(this.$tmp0, acatsInPositionChecklistIneligibleAlternateViewState, continuation);
                return objInvokeSuspend$setState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInPositionChecklistIneligibleAlternateViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInPositionChecklistIneligibleAlternateViewState> stateFlow = AcatsInPositionChecklistIneligibleAlternateFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInPositionChecklistIneligibleAlternateFragment.this);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setState(AcatsInPositionChecklistIneligibleAlternateFragment acatsInPositionChecklistIneligibleAlternateFragment, AcatsInPositionChecklistIneligibleAlternateViewState acatsInPositionChecklistIneligibleAlternateViewState, Continuation continuation) {
            acatsInPositionChecklistIneligibleAlternateFragment.setState(acatsInPositionChecklistIneligibleAlternateViewState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$1(AcatsInPositionChecklistIneligibleAlternateFragment acatsInPositionChecklistIneligibleAlternateFragment) {
        WebUtils.viewUrl$default(acatsInPositionChecklistIneligibleAlternateFragment.requireContext(), C7725R.string.whats_transferable_url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5$lambda$2() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.EXIT_ACATS_IN_FLOW, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$3(AcatsInPositionChecklistIneligibleAlternateFragment acatsInPositionChecklistIneligibleAlternateFragment) {
        acatsInPositionChecklistIneligibleAlternateFragment.getCallbacks().onIneligibleAlternateExit();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(AcatsInPositionChecklistIneligibleAlternateFragment acatsInPositionChecklistIneligibleAlternateFragment) {
        acatsInPositionChecklistIneligibleAlternateFragment.getCallbacks().onPartialTransferSelected();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(AcatsInPositionChecklistIneligibleAlternateViewState state) {
        RhTextView rhTextView = getViewBinding().positionChecklistAlternateIneligibleBody;
        StringResource bodyText = state.getBodyText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(bodyText.getText(resources));
    }
}
