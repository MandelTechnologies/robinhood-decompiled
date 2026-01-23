package com.robinhood.android.acatsin.plaidintro;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment4;
import com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroContract;
import com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroEvent;
import com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsInPlaidIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\r\u0010\u001f\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepGenericActionHandlingFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroEvent;", "Companion", "feature-acats-in_externalDebug", "viewState", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPlaidIntroFragment extends AcatsFlowStepFragment4 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInPlaidIntroFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AcatsInPlaidIntroFragment acatsInPlaidIntroFragment, int i, Composer composer, int i2) {
        acatsInPlaidIntroFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

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

    public AcatsInPlaidIntroFragment() {
        super(null, AcatsFlowStep.PLAID_INTRO, 1, null);
        this.duxo = DuxosKt.duxo(this, AcatsInPlaidIntroDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInPlaidIntroContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInPlaidIntroContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInPlaidIntroDuxo getDuxo() {
        return (AcatsInPlaidIntroDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInPlaidIntroContract.Callbacks getCallbacks() {
        return (AcatsInPlaidIntroContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ACATS_IN_PLAID_INTRO, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInPlaidIntroContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    /* compiled from: AcatsInPlaidIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment$onViewCreated$1", m3645f = "AcatsInPlaidIntroFragment.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment$onViewCreated$1 */
    static final class C80211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C80211(Continuation<? super C80211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPlaidIntroFragment.this.new C80211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C80211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInPlaidIntroFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment$onViewCreated$1$1", m3645f = "AcatsInPlaidIntroFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<AcatsInPlaidIntroEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsInPlaidIntroFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsInPlaidIntroFragment acatsInPlaidIntroFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsInPlaidIntroFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<AcatsInPlaidIntroEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final AcatsInPlaidIntroFragment acatsInPlaidIntroFragment = this.this$0;
                    if ((event.getData() instanceof AcatsInPlaidIntroEvent) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m10770invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m10770invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                acatsInPlaidIntroFragment.handleEvent((AcatsInPlaidIntroEvent) event.getData());
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsInPlaidIntroEvent>> eventFlow = AcatsInPlaidIntroFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInPlaidIntroFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C80211(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1689485760);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1689485760, i2, -1, "com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment.ComposeContent (AcatsInPlaidIntroFragment.kt:45)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-282059477, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-282059477, i3, -1, "com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment.ComposeContent.<anonymous> (AcatsInPlaidIntroFragment.kt:53)");
                    }
                    final AcatsInPlaidIntroFragment acatsInPlaidIntroFragment = AcatsInPlaidIntroFragment.this;
                    final SnapshotState4<AcatsInPlaidIntroViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1356830528, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment.ComposeContent.1.1

                        /* compiled from: AcatsInPlaidIntroFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment$ComposeContent$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C495091 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState4<AcatsInPlaidIntroViewState> $viewState$delegate;
                            final /* synthetic */ AcatsInPlaidIntroFragment this$0;

                            C495091(AcatsInPlaidIntroFragment acatsInPlaidIntroFragment, SnapshotState4<AcatsInPlaidIntroViewState> snapshotState4) {
                                this.this$0 = acatsInPlaidIntroFragment;
                                this.$viewState$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(27265252, i, -1, "com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (AcatsInPlaidIntroFragment.kt:55)");
                                }
                                PlaidIntroScreenData screenState = AcatsInPlaidIntroFragment.ComposeContent$lambda$0(this.$viewState$delegate).getScreenState();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final AcatsInPlaidIntroFragment acatsInPlaidIntroFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AcatsInPlaidIntroFragment.C80201.AnonymousClass1.C495091.invoke$lambda$1$lambda$0(acatsInPlaidIntroFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                                final AcatsInPlaidIntroFragment acatsInPlaidIntroFragment2 = this.this$0;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AcatsInPlaidIntroFragment.C80201.AnonymousClass1.C495091.invoke$lambda$3$lambda$2(acatsInPlaidIntroFragment2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                AcatsInPlaidIntroScreen.PlaidIntroScreen(screenState, function0, (Function0) objRememberedValue2, null, composer, 0, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(AcatsInPlaidIntroFragment acatsInPlaidIntroFragment) {
                                acatsInPlaidIntroFragment.getCallbacks().onAccountInfoMethodSelected(true);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(AcatsInPlaidIntroFragment acatsInPlaidIntroFragment) {
                                acatsInPlaidIntroFragment.getCallbacks().onAccountInfoMethodSelected(false);
                                return Unit.INSTANCE;
                            }
                        }

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
                                ComposerKt.traceEventStart(1356830528, i4, -1, "com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment.ComposeContent.<anonymous>.<anonymous> (AcatsInPlaidIntroFragment.kt:54)");
                            }
                            AcatsInPlaidIntroFragment acatsInPlaidIntroFragment2 = acatsInPlaidIntroFragment;
                            ActionHandlingFragment2.ContentWithDialog(acatsInPlaidIntroFragment2, ComposableLambda3.rememberComposableLambda(27265252, true, new C495091(acatsInPlaidIntroFragment2, snapshotState4), composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.plaidintro.AcatsInPlaidIntroFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInPlaidIntroFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AcatsInPlaidIntroEvent event) {
        if (!(event instanceof AcatsInPlaidIntroEvent.LoadingError)) {
            throw new NoWhenBranchMatchedException();
        }
        getCallbacks().onAccountInfoMethodSelected(true);
    }

    /* compiled from: AcatsInPlaidIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroFragment;", "Lcom/robinhood/android/acatsin/plaidintro/AcatsInPlaidIntroContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInPlaidIntroFragment, AcatsInPlaidIntroContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInPlaidIntroContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInPlaidIntroContract.Key getArgs(AcatsInPlaidIntroFragment acatsInPlaidIntroFragment) {
            return (AcatsInPlaidIntroContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInPlaidIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInPlaidIntroFragment newInstance(AcatsInPlaidIntroContract.Key key) {
            return (AcatsInPlaidIntroFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInPlaidIntroFragment acatsInPlaidIntroFragment, AcatsInPlaidIntroContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInPlaidIntroFragment, key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AcatsInPlaidIntroViewState ComposeContent$lambda$0(SnapshotState4<AcatsInPlaidIntroViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
