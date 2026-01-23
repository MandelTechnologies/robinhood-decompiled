package com.robinhood.android.rhy.referral.contact;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.referral.lib.invite.Activities3;
import com.robinhood.android.referral.lib.invite.InviteUserData;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.contracts.RhyReferralContactListKey;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.android.rhy.referral.contact.RhyReferralContactListEvent;
import com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment;
import com.robinhood.android.rhy.referral.util.ShareLink2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.ClipboardUtil;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RhyReferralContactListFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\r\u0010#\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\t\u0010)\u001a\u00020*H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061²\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010'X\u008a\u0084\u0002²\u0006\f\u00105\u001a\u0004\u0018\u000106X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListDuxo;", "getDuxo", "()Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-referral_externalDebug", "viewState", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListViewState;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListEvent$ShowInviteMoreDialog;", "showInviteMoreDialog", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyReferralContactListFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment {
    public EventLogger eventLogger;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(Screen.Name.RHY_REFERRALS_CONTACT_LIST, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RhyReferralContactListDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(RhyReferralContactListFragment rhyReferralContactListFragment, int i, Composer composer, int i2) {
        rhyReferralContactListFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final void handleEvent(final Event<RhyReferralContactListEvent> event) {
        EventConsumer<RhyReferralContactListEvent> eventConsumerInvoke;
        EventConsumer<RhyReferralContactListEvent> eventConsumerInvoke2;
        if ((event.getData() instanceof RhyReferralContactListEvent.InviteContact) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                    m18267invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18267invoke(Object it) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(it, "it");
                    RhyReferralContactListEvent.InviteContact inviteContact = (RhyReferralContactListEvent.InviteContact) event.getData();
                    EventLogger.DefaultImpls.logTap$default(this.getEventLogger(), UserInteractionEventData.Action.INVITE, this.getEventScreen(), null, null, RhyGlobalLoggingContext.eventContext$default(this.getRhyGlobalLoggingContext(), RHYContext.ProductArea.REFERRALS, null, null, 6, null), false, 44, null);
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    String str = inviteContact.getContact().getReferralContact().phoneNumber;
                    if (str == null) {
                        str = "";
                    }
                    Activities3.inviteViaText(fragmentActivityRequireActivity, new InviteUserData(str, inviteContact.getText()));
                }
            });
        }
        if (!(event.getData() instanceof RhyReferralContactListEvent.ShareLink) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$handleEvent$$inlined$consumeIfType$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18268invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18268invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RhyReferralContactListEvent.ShareLink shareLink = (RhyReferralContactListEvent.ShareLink) event.getData();
                EventLogger.DefaultImpls.logTap$default(this.getEventLogger(), UserInteractionEventData.Action.SHARE_LINK, this.getEventScreen(), null, null, RhyGlobalLoggingContext.eventContext$default(this.getRhyGlobalLoggingContext(), RHYContext.ProductArea.REFERRALS, null, null, 6, null), false, 44, null);
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                ShareLink2.shareLink(fragmentActivityRequireActivity, shareLink.getText());
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
    public Context getScreenEventContext() {
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
    public final RhyReferralContactListDuxo getDuxo() {
        return (RhyReferralContactListDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C274321(null), 1, null);
    }

    /* compiled from: RhyReferralContactListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$onViewCreated$1", m3645f = "RhyReferralContactListFragment.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$onViewCreated$1 */
    static final class C274321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C274321(Continuation<? super C274321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyReferralContactListFragment.this.new C274321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C274321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RhyReferralContactListFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ RhyReferralContactListFragment $tmp0;

            AnonymousClass1(RhyReferralContactListFragment rhyReferralContactListFragment) {
                this.$tmp0 = rhyReferralContactListFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, RhyReferralContactListFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<RhyReferralContactListEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C274321.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<RhyReferralContactListEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(RhyReferralContactListFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RhyReferralContactListFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(RhyReferralContactListFragment rhyReferralContactListFragment, Event event, Continuation continuation) {
            rhyReferralContactListFragment.handleEvent(event);
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
        EventConsumer<RhyReferralContactListEvent.ShowInviteMoreDialog> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-690737663);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-690737663, i2, -1, "com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment.ComposeContent (RhyReferralContactListFragment.kt:61)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final StateFlow<Event<RhyReferralContactListEvent>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "RhyReferralContactListFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof RhyReferralContactListEvent.ShowInviteMoreDialog) {
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
            Event<RhyReferralContactListEvent> value = eventFlow.getValue();
            Event<RhyReferralContactListEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof RhyReferralContactListEvent.ShowInviteMoreDialog)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Event<RhyReferralContactListEvent.ShowInviteMoreDialog> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof RhyReferralContactListEvent.ShowInviteMoreDialog) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m18266invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m18266invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        RhyReferralContactListFragment.ComposeContent$lambda$4(snapshotState, ((RhyReferralContactListEvent.ShowInviteMoreDialog) eventComposeContent$lambda$1.getData()).getText());
                    }
                });
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(382656524, true, new C274312(snapshotState4CollectAsStateWithLifecycle, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralContactListFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RhyReferralContactListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$ComposeContent$2 */
    static final class C274312 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $showInviteMoreDialog$delegate;
        final /* synthetic */ SnapshotState4<RhyReferralContactListViewState> $viewState$delegate;

        C274312(SnapshotState4<RhyReferralContactListViewState> snapshotState4, SnapshotState<String> snapshotState) {
            this.$viewState$delegate = snapshotState4;
            this.$showInviteMoreDialog$delegate = snapshotState;
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
                ComposerKt.traceEventStart(382656524, i, -1, "com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment.ComposeContent.<anonymous> (RhyReferralContactListFragment.kt:70)");
            }
            RhyReferralContactListViewState rhyReferralContactListViewStateComposeContent$lambda$0 = RhyReferralContactListFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            boolean z = RhyReferralContactListFragment.ComposeContent$lambda$3(this.$showInviteMoreDialog$delegate) != null;
            RhyReferralContactListDuxo duxo = RhyReferralContactListFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(duxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RhyReferralContactListFragment2(duxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
            RhyReferralContactListDuxo duxo2 = RhyReferralContactListFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(duxo2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new RhyReferralContactListFragment3(duxo2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            RhyReferralContactListDuxo duxo3 = RhyReferralContactListFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(duxo3);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new RhyReferralContactListFragment4(duxo3);
                composer.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue3;
            composer.endReplaceGroup();
            RhyReferralContactListDuxo duxo4 = RhyReferralContactListFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(duxo4);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new RhyReferralContactListFragment5(duxo4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            KFunction kFunction4 = (KFunction) objRememberedValue4;
            composer.endReplaceGroup();
            RhyReferralContactListDuxo duxo5 = RhyReferralContactListFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(duxo5);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new RhyReferralContactListFragment6(duxo5);
                composer.updateRememberedValue(objRememberedValue5);
            }
            KFunction kFunction5 = (KFunction) objRememberedValue5;
            composer.endReplaceGroup();
            RhyReferralContactListDuxo duxo6 = RhyReferralContactListFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer.changedInstance(duxo6);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new RhyReferralContactListFragment7(duxo6);
                composer.updateRememberedValue(objRememberedValue6);
            }
            KFunction kFunction6 = (KFunction) objRememberedValue6;
            composer.endReplaceGroup();
            Function1 function1 = (Function1) kFunction;
            Function0 function0 = (Function0) kFunction2;
            Function0 function02 = (Function0) kFunction3;
            Function1 function12 = (Function1) kFunction4;
            Function0 function03 = (Function0) kFunction5;
            composer.startReplaceGroup(5004770);
            final SnapshotState<String> snapshotState = this.$showInviteMoreDialog$delegate;
            Object objRememberedValue7 = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyReferralContactListFragment.C274312.invoke$lambda$7$lambda$6(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            Function0 function04 = (Function0) objRememberedValue7;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance7 = composer.changedInstance(RhyReferralContactListFragment.this);
            final RhyReferralContactListFragment rhyReferralContactListFragment = RhyReferralContactListFragment.this;
            final SnapshotState<String> snapshotState2 = this.$showInviteMoreDialog$delegate;
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.rhy.referral.contact.RhyReferralContactListFragment$ComposeContent$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyReferralContactListFragment.C274312.invoke$lambda$9$lambda$8(rhyReferralContactListFragment, snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceGroup();
            RhyReferralContactListComposable3.RhyReferralContactListComposable(rhyReferralContactListViewStateComposeContent$lambda$0, z, function1, function0, function02, function12, function03, function04, (Function0) objRememberedValue8, (Function0) kFunction6, null, composer, 12582912, 0, 1024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(SnapshotState snapshotState) {
            RhyReferralContactListFragment.ComposeContent$lambda$4(snapshotState, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(RhyReferralContactListFragment rhyReferralContactListFragment, SnapshotState snapshotState) throws Resources.NotFoundException {
            ClipboardUtil clipboardUtil = ClipboardUtil.INSTANCE;
            String strComposeContent$lambda$3 = RhyReferralContactListFragment.ComposeContent$lambda$3(snapshotState);
            if (strComposeContent$lambda$3 == null) {
                strComposeContent$lambda$3 = "";
            }
            String string2 = rhyReferralContactListFragment.getString(C27406R.string.rhy_referral_contact_list_invite_more_copy_snackbar);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            View viewRequireView = rhyReferralContactListFragment.requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
            clipboardUtil.copyToClipboardWithHapticFeedback(strComposeContent$lambda$3, string2, viewRequireView, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyReferralContactListViewState ComposeContent$lambda$0(SnapshotState4<RhyReferralContactListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<RhyReferralContactListEvent.ShowInviteMoreDialog> ComposeContent$lambda$1(SnapshotState4<Event<RhyReferralContactListEvent.ShowInviteMoreDialog>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ComposeContent$lambda$3(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$4(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* compiled from: RhyReferralContactListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListFragment;", "Lcom/robinhood/android/rhy/contracts/RhyReferralContactListKey;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RhyReferralContactListFragment, RhyReferralContactListKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RhyReferralContactListKey rhyReferralContactListKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, rhyReferralContactListKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RhyReferralContactListKey getArgs(RhyReferralContactListFragment rhyReferralContactListFragment) {
            return (RhyReferralContactListKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, rhyReferralContactListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyReferralContactListFragment newInstance(RhyReferralContactListKey rhyReferralContactListKey) {
            return (RhyReferralContactListFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, rhyReferralContactListKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyReferralContactListFragment rhyReferralContactListFragment, RhyReferralContactListKey rhyReferralContactListKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, rhyReferralContactListFragment, rhyReferralContactListKey);
        }
    }
}
