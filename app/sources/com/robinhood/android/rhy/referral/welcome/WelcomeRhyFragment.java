package com.robinhood.android.rhy.referral.welcome;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.referral.welcome.WelcomeRhyEvent;
import com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment;
import com.robinhood.android.rhy.referral.welcome.WelcomeRhyViewState;
import com.robinhood.android.rhyonboarding.contracts.WelcomeRhyKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: WelcomeRhyFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u000289B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\r\u0010+\u001a\u00020#H\u0017¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020#2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\t\u00101\u001a\u000202H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:²\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002²\u0006\u0012\u0010.\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010/X\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u0004\u0018\u00010?X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDuxo;", "getDuxo", "()Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyEvent;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-rhy-referral_externalDebug", "viewState", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyEvent$ShowDialog;", "dialog", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class WelcomeRhyFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment {
    public EventLogger eventLogger;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WelcomeRhyFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(Screen.Name.RHY_REFERRALS_WELCOME, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, WelcomeRhyDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof WelcomeRhyFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: WelcomeRhyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyFragment$Callbacks;", "", "onSignInClicked", "", "onSignUpClicked", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSignInClicked();

        void onSignUpClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$18(WelcomeRhyFragment welcomeRhyFragment, int i, Composer composer, int i2) {
        welcomeRhyFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<WelcomeRhyEvent> event) {
        EventConsumer<WelcomeRhyEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof WelcomeRhyEvent.Navigate) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18325invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18325invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                WelcomeRhyEvent.Navigate navigate = (WelcomeRhyEvent.Navigate) event.getData();
                Navigator navigator = this.getNavigator();
                Context contextRequireContext = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, navigate.getIntentKey(), null, false, null, null, 60, null);
                this.requireActivity().finish();
            }
        });
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public final RhyGlobalLoggingContext getRhyGlobalLoggingContext() {
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext;
        if (rhyGlobalLoggingContext != null) {
            return rhyGlobalLoggingContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyGlobalLoggingContext");
        return null;
    }

    public final void setRhyGlobalLoggingContext(RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "<set-?>");
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WelcomeRhyDuxo getDuxo() {
        return (WelcomeRhyDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C275591(null), 1, null);
    }

    /* compiled from: WelcomeRhyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$onViewCreated$1", m3645f = "WelcomeRhyFragment.kt", m3646l = {63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$onViewCreated$1 */
    static final class C275591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C275591(Continuation<? super C275591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeRhyFragment.this.new C275591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C275591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WelcomeRhyFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ WelcomeRhyFragment $tmp0;

            AnonymousClass1(WelcomeRhyFragment welcomeRhyFragment) {
                this.$tmp0 = welcomeRhyFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, WelcomeRhyFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<WelcomeRhyEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C275591.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<WelcomeRhyEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(WelcomeRhyFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WelcomeRhyFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(WelcomeRhyFragment welcomeRhyFragment, Event event, Continuation continuation) {
            welcomeRhyFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<WelcomeRhyEvent.ShowDialog> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(363894239);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(363894239, i2, -1, "com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment.ComposeContent (WelcomeRhyFragment.kt:67)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final StateFlow<Event<WelcomeRhyEvent>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "WelcomeRhyFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof WelcomeRhyEvent.ShowDialog) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<WelcomeRhyEvent> value = eventFlow.getValue();
            Event<WelcomeRhyEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof WelcomeRhyEvent.ShowDialog)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Event<WelcomeRhyEvent.ShowDialog> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof WelcomeRhyEvent.ShowDialog) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m18324invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m18324invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        snapshotState.setValue(((WelcomeRhyEvent.ShowDialog) eventComposeContent$lambda$1.getData()).getDialog());
                    }
                });
            }
            boolean loading = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCtaConfig().getLoading();
            boolean enabled = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCtaConfig().getEnabled();
            boolean showContinue = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getShowContinue();
            DisclosureContent disclosureContent = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDisclosureContent();
            RhyReferralOnboardingStore4.Dialog.DialogContent dialogContentComposeContent$lambda$3 = ComposeContent$lambda$3(snapshotState);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WelcomeRhyFragment.ComposeContent$lambda$7$lambda$6(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WelcomeRhyFragment.ComposeContent$lambda$9$lambda$8(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WelcomeRhyFragment.ComposeContent$lambda$11$lambda$10(this.f$0, snapshotState4CollectAsStateWithLifecycle);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function03 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WelcomeRhyFragment.ComposeContent$lambda$13$lambda$12(this.f$0, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function1 function1 = (Function1) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WelcomeRhyFragment.ComposeContent$lambda$15$lambda$14(this.f$0, snapshotState, snapshotState4CollectAsStateWithLifecycle);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Function0 function04 = (Function0) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WelcomeRhyFragment.ComposeContent$lambda$17$lambda$16(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            WelcomeRhyComposable.WelcomeRhyComposable(loading, enabled, showContinue, disclosureContent, dialogContentComposeContent$lambda$3, function0, function02, function03, function1, function04, (Function0) objRememberedValue7, null, composerStartRestartGroup, 0, 6, 2048);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WelcomeRhyFragment.ComposeContent$lambda$18(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(WelcomeRhyFragment welcomeRhyFragment) {
        EventLogger.DefaultImpls.logTap$default(welcomeRhyFragment.getEventLogger(), UserInteractionEventData.Action.LOGIN, welcomeRhyFragment.getEventScreen(), null, null, RhyGlobalLoggingContext.eventContext$default(welcomeRhyFragment.getRhyGlobalLoggingContext(), RHYContext.ProductArea.REFERRALS, null, null, 6, null), false, 44, null);
        welcomeRhyFragment.getCallbacks().onSignInClicked();
        return Unit.INSTANCE;
    }

    private static final WelcomeRhyViewState ComposeContent$lambda$0(SnapshotState4<WelcomeRhyViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<WelcomeRhyEvent.ShowDialog> ComposeContent$lambda$1(SnapshotState4<Event<WelcomeRhyEvent.ShowDialog>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final RhyReferralOnboardingStore4.Dialog.DialogContent ComposeContent$lambda$3(SnapshotState<RhyReferralOnboardingStore4.Dialog.DialogContent> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9$lambda$8(WelcomeRhyFragment welcomeRhyFragment) {
        EventLogger.DefaultImpls.logTap$default(welcomeRhyFragment.getEventLogger(), UserInteractionEventData.Action.SIGN_UP, welcomeRhyFragment.getEventScreen(), null, null, RhyGlobalLoggingContext.eventContext$default(welcomeRhyFragment.getRhyGlobalLoggingContext(), RHYContext.ProductArea.REFERRALS, null, null, 6, null), false, 44, null);
        welcomeRhyFragment.getCallbacks().onSignUpClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$11$lambda$10(WelcomeRhyFragment welcomeRhyFragment, SnapshotState4 snapshotState4) {
        EventLogger.DefaultImpls.logTap$default(welcomeRhyFragment.getEventLogger(), UserInteractionEventData.Action.CONTINUE, welcomeRhyFragment.getEventScreen(), null, null, RhyGlobalLoggingContext.eventContext$default(welcomeRhyFragment.getRhyGlobalLoggingContext(), RHYContext.ProductArea.REFERRALS, null, null, 6, null), false, 44, null);
        WelcomeRhyDuxo duxo = welcomeRhyFragment.getDuxo();
        WelcomeRhyViewState.CtaConfig ctaConfig = ComposeContent$lambda$0(snapshotState4).getCtaConfig();
        Intrinsics.checkNotNull(ctaConfig, "null cannot be cast to non-null type com.robinhood.android.rhy.referral.welcome.WelcomeRhyViewState.CtaConfig.Continue");
        duxo.onContinueClicked((WelcomeRhyViewState.CtaConfig.Continue) ctaConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$13$lambda$12(WelcomeRhyFragment welcomeRhyFragment, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebUtils.viewUrl$default(welcomeRhyFragment.requireContext(), url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$15$lambda$14(WelcomeRhyFragment welcomeRhyFragment, SnapshotState snapshotState, SnapshotState4 snapshotState4) {
        snapshotState.setValue(null);
        welcomeRhyFragment.getDuxo().onDialogPrimaryCta(ComposeContent$lambda$0(snapshotState4).getCtaConfig());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$17$lambda$16(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* compiled from: WelcomeRhyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyFragment;", "Lcom/robinhood/android/rhyonboarding/contracts/WelcomeRhyKey;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WelcomeRhyFragment, WelcomeRhyKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public WelcomeRhyKey getArgs(WelcomeRhyFragment welcomeRhyFragment) {
            return (WelcomeRhyKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, welcomeRhyFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WelcomeRhyFragment newInstance(WelcomeRhyKey welcomeRhyKey) {
            return (WelcomeRhyFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, welcomeRhyKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WelcomeRhyFragment welcomeRhyFragment, WelcomeRhyKey welcomeRhyKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, welcomeRhyFragment, welcomeRhyKey);
        }
    }
}
