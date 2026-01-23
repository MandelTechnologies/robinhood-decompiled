package com.robinhood.android.event.detail.contractselector.multicontractselector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorEvent;
import com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment;
import com.robinhood.android.eventcontracts.contracts.EventAttestationFragmentKey;
import com.robinhood.android.eventcontracts.contracts.EventContractSelectorFragmentKey;
import com.robinhood.android.eventcontracts.contracts.EventTradeActivityKey;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.Uuids;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: EventMultiContractSelectorFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0012\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "hasBottomBar", "getHasBottomBar", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorEvent;", "Companion", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventMultiContractSelectorFragment extends GenericComposeFragment implements AutoLoggableFragment, EventMultiContractSelectorFragment2 {
    private final boolean hasBottomBar;
    private final boolean toolbarVisible;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(EventMultiContractSelectorFragment eventMultiContractSelectorFragment, int i, Composer composer, int i2) {
        eventMultiContractSelectorFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.EVENT_CONTRACT_SELECTOR_SCREEN, null, Uuids.safeToString(((EventContractSelectorFragmentKey) INSTANCE.getArgs((Fragment) this)).getEventId()), null, 10, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1484297287);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1484297287, i2, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment.ComposeContent (EventMultiContractSelectorFragment.kt:36)");
            }
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            final OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(753456897, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(753456897, i3, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment.ComposeContent.<anonymous> (EventMultiContractSelectorFragment.kt:39)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.EVENT_CONTRACT_SELECTOR_SCREEN, null, Uuids.safeToString(((EventContractSelectorFragmentKey) EventMultiContractSelectorFragment.INSTANCE.getArgs((Fragment) EventMultiContractSelectorFragment.this)).getEventId()), null, 10, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1657838026, true, new AnonymousClass1(EventMultiContractSelectorFragment.this, onBackPressedDispatcher), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: EventMultiContractSelectorFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;
                    final /* synthetic */ EventMultiContractSelectorFragment this$0;

                    AnonymousClass1(EventMultiContractSelectorFragment eventMultiContractSelectorFragment, OnBackPressedDispatcher onBackPressedDispatcher) {
                        this.this$0 = eventMultiContractSelectorFragment;
                        this.$backPressedDispatcher = onBackPressedDispatcher;
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
                            ComposerKt.traceEventStart(-1657838026, i, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment.ComposeContent.<anonymous>.<anonymous> (EventMultiContractSelectorFragment.kt:47)");
                        }
                        composer.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
                        composer.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EventMultiContractSelectorDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
                        composer.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment$ComposeContent$1$1$invoke$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment$ComposeContent$1$1$invoke$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
                        composer.endReplaceGroup();
                        EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo = (EventMultiContractSelectorDuxo) baseDuxo;
                        EventMultiContractSelectorFragment eventMultiContractSelectorFragment = this.this$0;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.$backPressedDispatcher);
                        final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventMultiContractSelectorFragment.C161651.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        EventMultiContractSelectorFullScreen.EventMultiContractSelectorFullScreen(eventMultiContractSelectorDuxo, eventMultiContractSelectorFragment, null, (Function0) objRememberedValue2, composer, GenericComposeFragment.$stable << 3, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.onBackPressed();
                        }
                        return Unit.INSTANCE;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventMultiContractSelectorFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment2
    public void handleEvent(final Event<EventMultiContractSelectorEvent> event) {
        EventConsumer<EventMultiContractSelectorEvent> eventConsumerInvoke;
        EventConsumer<EventMultiContractSelectorEvent> eventConsumerInvoke2;
        EventConsumer<EventMultiContractSelectorEvent> eventConsumerInvoke3;
        final android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (event != null && (event.getData() instanceof EventMultiContractSelectorEvent.StartTrade) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14141invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14141invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator.DefaultImpls.startActivity$default(this.getNavigator(), context, new EventTradeActivityKey(((EventMultiContractSelectorEvent.StartTrade) event.getData()).getEventTradeOrderContext(), null, "event_multi_contract_selector"), null, false, null, null, 60, null);
                }
            });
        }
        if (event != null && (event.getData() instanceof EventMultiContractSelectorEvent.ShowAttestation) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14142invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14142invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    EventMultiContractSelectorEvent.ShowAttestation showAttestation = (EventMultiContractSelectorEvent.ShowAttestation) event.getData();
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(this.getNavigator(), context, new EventAttestationFragmentKey(showAttestation.getAttestationType(), showAttestation.getRedirectOrderContext()), false, false, false, false, null, false, null, null, 1020, null);
                }
            });
        }
        if (event == null || !(event.getData() instanceof EventMultiContractSelectorEvent.StartOnboarding) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFragment$handleEvent$$inlined$consumeIfType$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m14143invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m14143invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Navigator.DefaultImpls.startActivity$default(this.getNavigator(), context, new FuturesOnboardingActivityKey("event_multi_contract_selector", true, new FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByEventId(((EventMultiContractSelectorEvent.StartOnboarding) event.getData()).getEventId())), null, false, null, null, 60, null);
            }
        });
    }

    /* compiled from: EventMultiContractSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorFragment;", "Lcom/robinhood/android/eventcontracts/contracts/EventContractSelectorFragmentKey;", "<init>", "()V", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EventMultiContractSelectorFragment, EventContractSelectorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EventContractSelectorFragmentKey eventContractSelectorFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, eventContractSelectorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EventContractSelectorFragmentKey getArgs(EventMultiContractSelectorFragment eventMultiContractSelectorFragment) {
            return (EventContractSelectorFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, eventMultiContractSelectorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EventMultiContractSelectorFragment newInstance(EventContractSelectorFragmentKey eventContractSelectorFragmentKey) {
            return (EventMultiContractSelectorFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, eventContractSelectorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EventMultiContractSelectorFragment eventMultiContractSelectorFragment, EventContractSelectorFragmentKey eventContractSelectorFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, eventMultiContractSelectorFragment, eventContractSelectorFragmentKey);
        }
    }
}
