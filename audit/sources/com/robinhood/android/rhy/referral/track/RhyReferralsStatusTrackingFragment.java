package com.robinhood.android.rhy.referral.track;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.contracts.RhyReferralStatusTrackingKey;
import com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingEvent;
import com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment;
import com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Set;
import kotlin.Function;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RhyReferralsStatusTrackingFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\r\u0010#\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010$J\r\u0010%\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010$J\r\u0010&\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010$J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0016J\u0016\u0010*\u001a\u00020\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200H\u0002J\t\u00101\u001a\u000202H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069²\u0006\n\u0010:\u001a\u00020;X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingDuxo;", "getDuxo", "()Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "LoadingContent", "PreviewLoadingContent", "onDialogDismissed", "id", "", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingEvent;", "showSheet", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusInfoSheetData;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-referral_externalDebug", "viewState", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyReferralsStatusTrackingFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment {
    public EventLogger eventLogger;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(Screen.Name.RHY_REFERRALS_TRACKING, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RhyReferralsStatusTrackingDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment, int i, Composer composer, int i2) {
        rhyReferralsStatusTrackingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$2(RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment, int i, Composer composer, int i2) {
        rhyReferralsStatusTrackingFragment.LoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLoadingContent$lambda$5(RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment, int i, Composer composer, int i2) {
        rhyReferralsStatusTrackingFragment.PreviewLoadingContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final void handleEvent(final Event<RhyReferralsStatusTrackingEvent> event) {
        EventConsumer<RhyReferralsStatusTrackingEvent> eventConsumerInvoke;
        EventConsumer<RhyReferralsStatusTrackingEvent> eventConsumerInvoke2;
        EventConsumer<RhyReferralsStatusTrackingEvent> eventConsumerInvoke3;
        if ((event.getData() instanceof RhyReferralsStatusTrackingEvent.Error) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                    m18313invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18313invoke(Object it) throws Throwable {
                    Intrinsics.checkNotNullParameter(it, "it");
                    RhyReferralsStatusTrackingEvent.Error error = (RhyReferralsStatusTrackingEvent.Error) event.getData();
                    ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, error.getError(), true, false, 0, null, 56, null);
                }
            });
        }
        if ((event.getData() instanceof RhyReferralsStatusTrackingEvent.ShowFragment) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18314invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18314invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    RhyReferralsStatusTrackingEvent.ShowFragment showFragment = (RhyReferralsStatusTrackingEvent.ShowFragment) event.getData();
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, showFragment.getFragmentKey(), false, false, false, false, null, false, null, null, 1020, null);
                }
            });
        }
        if (!(event.getData() instanceof RhyReferralsStatusTrackingEvent.ShowSnackbar) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$handleEvent$$inlined$consumeIfType$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18315invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18315invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RhyReferralsStatusTrackingEvent.ShowSnackbar showSnackbar = (RhyReferralsStatusTrackingEvent.ShowSnackbar) event.getData();
                RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                Snackbars snackbars = Snackbars.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                View viewFindRoot = snackbars.findRoot(fragmentActivityRequireActivity);
                String string2 = this.getString(showSnackbar.getMessage());
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                companion.make(viewFindRoot, string2, -1).show();
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhyReferralsStatusTrackingDuxo getDuxo() {
        return (RhyReferralsStatusTrackingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C275401(null), 1, null);
    }

    /* compiled from: RhyReferralsStatusTrackingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$onViewCreated$1", m3645f = "RhyReferralsStatusTrackingFragment.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$onViewCreated$1 */
    static final class C275401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C275401(Continuation<? super C275401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyReferralsStatusTrackingFragment.this.new C275401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C275401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RhyReferralsStatusTrackingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ RhyReferralsStatusTrackingFragment $tmp0;

            AnonymousClass1(RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment) {
                this.$tmp0 = rhyReferralsStatusTrackingFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, RhyReferralsStatusTrackingFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<RhyReferralsStatusTrackingEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C275401.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<RhyReferralsStatusTrackingEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(RhyReferralsStatusTrackingFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RhyReferralsStatusTrackingFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment, Event event, Continuation continuation) {
            rhyReferralsStatusTrackingFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getRhyGlobalLoggingContext().refresh();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1002498742);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1002498742, i2, -1, "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment.ComposeContent (RhyReferralsStatusTrackingFragment.kt:63)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1934796929, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment.ComposeContent.1

                /* compiled from: RhyReferralsStatusTrackingFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<RhyReferralsStatusTrackingViewState, Composer, Integer, Unit> {
                    final /* synthetic */ RhyReferralsStatusTrackingFragment this$0;

                    AnonymousClass1(RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment) {
                        this.this$0 = rhyReferralsStatusTrackingFragment;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhyReferralsStatusTrackingViewState rhyReferralsStatusTrackingViewState, Composer composer, Integer num) {
                        invoke(rhyReferralsStatusTrackingViewState, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhyReferralsStatusTrackingViewState state, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(state) : composer.changedInstance(state) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1250173192, i, -1, "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment.ComposeContent.<anonymous>.<anonymous> (RhyReferralsStatusTrackingFragment.kt:67)");
                        }
                        if (Intrinsics.areEqual(state, RhyReferralsStatusTrackingViewState.Loading.INSTANCE)) {
                            composer.startReplaceGroup(-1174401864);
                            this.this$0.LoadingContent(composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            if (!(state instanceof RhyReferralsStatusTrackingViewState.Loaded)) {
                                composer.startReplaceGroup(-1174402683);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-2046560849);
                            RhyReferralsStatusTrackingViewState.Loaded loaded = (RhyReferralsStatusTrackingViewState.Loaded) state;
                            ImmutableList3 persistentList = extensions2.toPersistentList(loaded.getPendingInvites());
                            ImmutableList3 persistentList2 = extensions2.toPersistentList(loaded.getCompletedInvites());
                            boolean showRemindRequestDialog = loaded.getShowRemindRequestDialog();
                            RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment = this.this$0;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(rhyReferralsStatusTrackingFragment);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RhyReferralsStatusTrackingFragment4(rhyReferralsStatusTrackingFragment);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            KFunction kFunction = (KFunction) objRememberedValue;
                            composer.endReplaceGroup();
                            RhyReferralsStatusTrackingDuxo duxo = this.this$0.getDuxo();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(duxo);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new RhyReferralsStatusTrackingFragment5(duxo);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            KFunction kFunction2 = (KFunction) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                            final RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment2 = this.this$0;
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return RhyReferralsStatusTrackingFragment.C275381.AnonymousClass1.invoke$lambda$3$lambda$2(rhyReferralsStatusTrackingFragment2, (RhyReferralAttribution) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function1 function1 = (Function1) objRememberedValue3;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                            final RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment3 = this.this$0;
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return RhyReferralsStatusTrackingFragment.C275381.AnonymousClass1.invoke$lambda$5$lambda$4(rhyReferralsStatusTrackingFragment3, (RhyReferralAttribution) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            RhyReferralsStatusTrackingComposable.RhyReferralsStatusTrackingComposable(persistentList, persistentList2, showRemindRequestDialog, function1, (Function1) objRememberedValue4, (Function1) kFunction, (Function0) kFunction2, null, composer, 0, 128);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment, RhyReferralAttribution it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        EventLogger.DefaultImpls.logTap$default(rhyReferralsStatusTrackingFragment.getEventLogger(), UserInteractionEventData.Action.REMIND, rhyReferralsStatusTrackingFragment.getEventScreen(), null, null, RhyGlobalLoggingContext.eventContext$default(rhyReferralsStatusTrackingFragment.getRhyGlobalLoggingContext(), RHYContext.ProductArea.REFERRALS, null, null, 6, null), false, 44, null);
                        rhyReferralsStatusTrackingFragment.getDuxo().onRemind(it);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(RhyReferralsStatusTrackingFragment rhyReferralsStatusTrackingFragment, RhyReferralAttribution it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        EventLogger.DefaultImpls.logTap$default(rhyReferralsStatusTrackingFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_REFERRAL_OFFER, rhyReferralsStatusTrackingFragment.getEventScreen(), null, null, RhyGlobalLoggingContext.eventContext$default(rhyReferralsStatusTrackingFragment.getRhyGlobalLoggingContext(), RHYContext.ProductArea.REFERRALS, null, null, 6, null), false, 44, null);
                        rhyReferralsStatusTrackingFragment.getDuxo().onViewDetails(it);
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(1934796929, i3, -1, "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment.ComposeContent.<anonymous> (RhyReferralsStatusTrackingFragment.kt:66)");
                    }
                    Crossfade.Crossfade(RhyReferralsStatusTrackingFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle), (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambda3.rememberComposableLambda(1250173192, true, new AnonymousClass1(this), composer2, 54), composer2, 24576, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralsStatusTrackingFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyReferralsStatusTrackingViewState ComposeContent$lambda$0(SnapshotState4<? extends RhyReferralsStatusTrackingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void LoadingContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1571031264);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1571031264, i, -1, "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment.LoadingContent (RhyReferralsStatusTrackingFragment.kt:103)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, RhyReferralsStatusTrackingFragment2.INSTANCE.getLambda$1988421232$feature_rhy_referral_externalDebug(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralsStatusTrackingFragment.LoadingContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void PreviewLoadingContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(218359188);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(218359188, i2, -1, "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment.PreviewLoadingContent (RhyReferralsStatusTrackingFragment.kt:120)");
            }
            TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyReferralsStatusTrackingFragment.PreviewLoadingContent$lambda$4$lambda$3(((Integer) obj).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            TemporalFormatter.Companion.init$default(companion, null, (Function1) objRememberedValue, 1, null);
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1248797988, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment.PreviewLoadingContent.2
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
                        ComposerKt.traceEventStart(-1248797988, i3, -1, "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment.PreviewLoadingContent.<anonymous> (RhyReferralsStatusTrackingFragment.kt:125)");
                    }
                    RhyReferralsStatusTrackingFragment.this.LoadingContent(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralsStatusTrackingFragment.PreviewLoadingContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PreviewLoadingContent$lambda$4$lambda$3(int i) {
        return "----- -------- ------- ----";
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSheet(RhyReferralsStatusInfoSheetData data) {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, getResources().getString(data.getTitle()), null, getResources().getString(data.getBody()), null, getResources().getString(C11048R.string.general_label_got_it), null, null, null, false, false, null, null, null, false, true, false, false, null, Boolean.TRUE, null, 1540053, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "rhy_referrals_status_info_sheet");
    }

    /* compiled from: RhyReferralsStatusTrackingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/rhy/contracts/RhyReferralStatusTrackingKey;", "<init>", "()V", "createFragment", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingFragment;", "key", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<RhyReferralStatusTrackingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public RhyReferralsStatusTrackingFragment createFragment(RhyReferralStatusTrackingKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new RhyReferralsStatusTrackingFragment();
        }
    }
}
