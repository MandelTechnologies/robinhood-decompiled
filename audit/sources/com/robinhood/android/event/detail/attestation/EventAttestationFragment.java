package com.robinhood.android.event.detail.attestation;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.event.detail.attestation.EventAttestationDuxo3;
import com.robinhood.android.event.detail.attestation.EventAttestationFragment;
import com.robinhood.android.eventcontracts.contracts.EventAttestationFragmentKey;
import com.robinhood.android.eventcontracts.contracts.EventTradeActivityKey;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: EventAttestationFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\u0012\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/event/detail/attestation/EventAttestationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-event-detail_externalDebug", "viewState", "Lcom/robinhood/android/event/detail/attestation/EventAttestationViewState;", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/event/detail/attestation/EventAttestationEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventAttestationFragment extends GenericComposeFragment implements AutoLoggableFragment {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(EventAttestationFragment eventAttestationFragment, int i, Composer composer, int i2) {
        eventAttestationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.EVENT_CONTRACT_ATTESTATION, ((EventAttestationFragmentKey) INSTANCE.getArgs((Fragment) this)).getAttestationType(), null, null, 12, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        EventTradeOrderContext redirectEventOrderContext = ((EventAttestationFragmentKey) INSTANCE.getArgs((Fragment) this)).getRedirectEventOrderContext();
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, redirectEventOrderContext != null ? redirectEventOrderContext.toProtoLoggingModel() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1048577, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<EventAttestationDuxo3> eventConsumerInvoke;
        EventConsumer<EventAttestationDuxo3> eventConsumerInvoke2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1528385524);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1528385524, i2, -1, "com.robinhood.android.event.detail.attestation.EventAttestationFragment.ComposeContent (EventAttestationFragment.kt:35)");
            }
            composerStartRestartGroup.startReplaceGroup(-747520797);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EventAttestationDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationFragment$ComposeContent$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationFragment$ComposeContent$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            EventAttestationDuxo eventAttestationDuxo = (EventAttestationDuxo) baseDuxo;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2023736065, true, new C161061(eventAttestationDuxo, this), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(eventAttestationDuxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Event<EventAttestationDuxo3> eventComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$0 != null && (eventComposeContent$lambda$0.getData() instanceof EventAttestationDuxo3.Error) && (eventConsumerInvoke2 = eventComposeContent$lambda$0.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke2.consume(eventComposeContent$lambda$0, new Function1() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14127invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14127invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        AbsErrorHandler.handleError$default(this.getActivityErrorHandler(), ((EventAttestationDuxo3.Error) eventComposeContent$lambda$0.getData()).getError(), false, 2, null);
                    }
                });
            }
            final Event<EventAttestationDuxo3> eventComposeContent$lambda$02 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (eventComposeContent$lambda$02 != null && (eventComposeContent$lambda$02.getData() instanceof EventAttestationDuxo3.Complete) && (eventConsumerInvoke = eventComposeContent$lambda$02.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$02, new Function1() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationFragment$ComposeContent$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14128invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14128invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        FragmentActivity activity = this.getActivity();
                        if (activity == null) {
                            return;
                        }
                        EventAttestationFragment.Companion companion = EventAttestationFragment.INSTANCE;
                        EventTradeOrderContext redirectEventOrderContext = ((EventAttestationFragmentKey) companion.getArgs((Fragment) this)).getRedirectEventOrderContext();
                        if (redirectEventOrderContext != null) {
                            Navigator.DefaultImpls.startActivity$default(this.getNavigator(), activity, new EventTradeActivityKey(redirectEventOrderContext, this.getEventScreen(), "attestation_redirect_" + ((EventAttestationFragmentKey) companion.getArgs((Fragment) this)).getAttestationType()), null, false, null, null, 60, null);
                        }
                        activity.finish();
                    }
                });
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventAttestationFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: EventAttestationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.detail.attestation.EventAttestationFragment$ComposeContent$1 */
    static final class C161061 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ EventAttestationDuxo $duxo;
        final /* synthetic */ EventAttestationFragment this$0;

        C161061(EventAttestationDuxo eventAttestationDuxo, EventAttestationFragment eventAttestationFragment) {
            this.$duxo = eventAttestationDuxo;
            this.this$0 = eventAttestationFragment;
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
                ComposerKt.traceEventStart(-2023736065, i, -1, "com.robinhood.android.event.detail.attestation.EventAttestationFragment.ComposeContent.<anonymous> (EventAttestationFragment.kt:39)");
            }
            EventAttestationDuxo5 eventAttestationDuxo5Invoke$lambda$0 = invoke$lambda$0(FlowExtKt.collectAsStateWithLifecycle(this.$duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7));
            EventAttestationDuxo eventAttestationDuxo = this.$duxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(eventAttestationDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new EventAttestationFragment2(eventAttestationDuxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            EventAttestationDuxo eventAttestationDuxo2 = this.$duxo;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(eventAttestationDuxo2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new EventAttestationFragment3(eventAttestationDuxo2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(this.this$0);
            final EventAttestationFragment eventAttestationFragment = this.this$0;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.event.detail.attestation.EventAttestationFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EventAttestationFragment.C161061.invoke$lambda$4$lambda$3(eventAttestationFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EventAttestationScreen.EventAttestationScreen(eventAttestationDuxo5Invoke$lambda$0, function0, function1, (Function0) objRememberedValue3, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(EventAttestationFragment eventAttestationFragment) {
            eventAttestationFragment.requireBaseActivity().getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }

        private static final EventAttestationDuxo5 invoke$lambda$0(SnapshotState4<? extends EventAttestationDuxo5> snapshotState4) {
            return snapshotState4.getValue();
        }
    }

    /* compiled from: EventAttestationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/detail/attestation/EventAttestationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/event/detail/attestation/EventAttestationFragment;", "Lcom/robinhood/android/eventcontracts/contracts/EventAttestationFragmentKey;", "<init>", "()V", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EventAttestationFragment, EventAttestationFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EventAttestationFragmentKey eventAttestationFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, eventAttestationFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EventAttestationFragmentKey getArgs(EventAttestationFragment eventAttestationFragment) {
            return (EventAttestationFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, eventAttestationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EventAttestationFragment newInstance(EventAttestationFragmentKey eventAttestationFragmentKey) {
            return (EventAttestationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, eventAttestationFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EventAttestationFragment eventAttestationFragment, EventAttestationFragmentKey eventAttestationFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, eventAttestationFragment, eventAttestationFragmentKey);
        }
    }

    private static final Event<EventAttestationDuxo3> ComposeContent$lambda$0(SnapshotState4<Event<EventAttestationDuxo3>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
