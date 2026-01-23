package com.robinhood.android.debitcard.linking.p098ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.debitcard.linking.databinding.FragmentDebitCardLinkingIntroFragmentBinding;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardLinkingIntroDuxo;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardLinkingIntroFragment;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DebitCardLinkingIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroFragment;", "Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardLinkingIntroFragmentBinding;", "getBinding", "()Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardLinkingIntroFragmentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroFragment$Callbacks;", "callbacks$delegate", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DebitCardLinkingIntroFragment extends AutoLoggableDebitCardLinkingFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen.Name protoScreenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DebitCardLinkingIntroFragment.class, "binding", "getBinding()Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardLinkingIntroFragmentBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DebitCardLinkingIntroFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DebitCardLinkingIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroFragment$Callbacks;", "", "onContinuePastIntro", "", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinuePastIntro();
    }

    public DebitCardLinkingIntroFragment() {
        super(C13894R.layout.fragment_debit_card_linking_intro_fragment);
        this.duxo = DuxosKt.duxo(this, DebitCardLinkingIntroDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DebitCardLinkingIntroFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DebitCardLinkingIntroFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.protoScreenName = Screen.Name.DEBIT_CARD_LINKING_SPLASH_SCREEN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DebitCardLinkingIntroDuxo getDuxo() {
        return (DebitCardLinkingIntroDuxo) this.duxo.getValue();
    }

    private final FragmentDebitCardLinkingIntroFragmentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDebitCardLinkingIntroFragmentBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public Screen.Name getProtoScreenName() {
        return this.protoScreenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C139011(view, null), 1, null);
        RdsButton rdsButton = getBinding().linkCardButton;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardLinkingIntroFragment.onViewCreated$lambda$2$lambda$0(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardLinkingIntroFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* compiled from: DebitCardLinkingIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment$onViewCreated$1", m3645f = "DebitCardLinkingIntroFragment.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment$onViewCreated$1 */
    static final class C139011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ View $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139011(View view, Continuation<? super C139011> continuation) {
            super(2, continuation);
            this.$view = view;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DebitCardLinkingIntroFragment.this.new C139011(this.$view, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C139011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<DebitCardLinkingIntroDuxo.ViewState> stateFlow = DebitCardLinkingIntroFragment.this.getDuxo().getStateFlow();
                final DebitCardLinkingIntroFragment debitCardLinkingIntroFragment = DebitCardLinkingIntroFragment.this;
                final View view = this.$view;
                FlowCollector<? super DebitCardLinkingIntroDuxo.ViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DebitCardLinkingIntroDuxo.ViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(DebitCardLinkingIntroDuxo.ViewState viewState, Continuation<? super Unit> continuation) {
                        Context contextRequireContext = debitCardLinkingIntroFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(new ScarletContextWrapper(contextRequireContext, null, null, 6, null)));
                        final UIComponent<GenericAction> component = viewState.getComponent();
                        if (component != null) {
                            ((ComposeView) view.findViewById(C13894R.id.linking_options_disclosure_compose_view)).setContent(ComposableLambda3.composableLambdaInstance(72387057, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment$onViewCreated$1$1$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i2) {
                                    if ((i2 & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(72387057, i2, -1, "com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebitCardLinkingIntroFragment.kt:59)");
                                    }
                                    Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                                    final UIComponent<GenericAction> uIComponent = component;
                                    BentoTheme2.BentoTheme(observable, null, ComposableLambda3.rememberComposableLambda(820975487, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment$onViewCreated$1$1$1$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i3) {
                                            if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(820975487, i3, -1, "com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebitCardLinkingIntroFragment.kt:60)");
                                            }
                                            final UIComponent<GenericAction> uIComponent2 = uIComponent;
                                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-574050476, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment.onViewCreated.1.1.1.1.1.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i4) {
                                                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-574050476, i4, -1, "com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebitCardLinkingIntroFragment.kt:61)");
                                                    }
                                                    ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(uIComponent2);
                                                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), null, false, 3, null);
                                                    composer3.startReplaceGroup(-1772220517);
                                                    SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, modifierWrapContentHeight$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 100663680, 0);
                                                    composer3.endReplaceGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer2, 54), composer2, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer, 54), composer, 384, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    public static final UserInteractionEventDescriptor onViewCreated$lambda$2$lambda$0(DebitCardLinkingIntroFragment debitCardLinkingIntroFragment) {
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DEBIT_CARD_LINKING;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        return new UserInteractionEventDescriptor(null, debitCardLinkingIntroFragment.getEventScreen(), action, debitCardLinkingIntroFragment.getLoggingContext(), component, null, 33, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(DebitCardLinkingIntroFragment debitCardLinkingIntroFragment) {
        debitCardLinkingIntroFragment.getCallbacks().onContinuePastIntro();
        return Unit.INSTANCE;
    }

    /* compiled from: DebitCardLinkingIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroFragment;", "<init>", "()V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<DebitCardLinkingIntroFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((DebitCardLinkingIntroFragment) fragment);
        }

        public Void getArgs(DebitCardLinkingIntroFragment debitCardLinkingIntroFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, debitCardLinkingIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public DebitCardLinkingIntroFragment newInstance() {
            return (DebitCardLinkingIntroFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public DebitCardLinkingIntroFragment newInstance(Void r1) {
            return (DebitCardLinkingIntroFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
