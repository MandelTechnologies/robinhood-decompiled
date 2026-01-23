package com.robinhood.android.event.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.event.detail.EventDetailScreenEvent;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventAttestationFragmentKey;
import com.robinhood.android.eventcontracts.contracts.EventContractConstants;
import com.robinhood.android.eventcontracts.contracts.EventContractSelectorFragmentKey;
import com.robinhood.android.eventcontracts.contracts.EventDetailFragmentKeyInternalOnly;
import com.robinhood.android.eventcontracts.contracts.EventTradeActivityKey;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.FuturesContractContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00018B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010#\u001a\u00020$H\u0017¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020$H\u0016J\u0018\u0010'\u001a\u00020$2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0016J&\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0/2\u0006\u00100\u001a\u000201H\u0016J\t\u00102\u001a\u00020\u0014H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/event/detail/EventDetailCallbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "getPipSupportStore", "()Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "setPipSupportStore", "(Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "screenIdentifier", "", "getScreenIdentifier", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onExitScreen", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent;", "onStartPipMode", "eventId", "Ljava/util/UUID;", "contractIds", "", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventDetailFragment extends GenericComposeFragment implements EventDetailFragment2, AutoLoggableFragment, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(EventContractsRegionGate.INSTANCE);
    public CrossSellLaunchManager crossSellLaunchManager;
    public PictureInPictureStore pipSupportStore;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EventDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EcUuidType.values().length];
            try {
                iArr[EcUuidType.EVENT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EcUuidType.CONTRACT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(EventDetailFragment eventDetailFragment, int i, Composer composer, int i2) {
        eventDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public final CrossSellLaunchManager getCrossSellLaunchManager() {
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager;
        if (crossSellLaunchManager != null) {
            return crossSellLaunchManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crossSellLaunchManager");
        return null;
    }

    public final void setCrossSellLaunchManager(CrossSellLaunchManager crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "<set-?>");
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    public final PictureInPictureStore getPipSupportStore() {
        PictureInPictureStore pictureInPictureStore = this.pipSupportStore;
        if (pictureInPictureStore != null) {
            return pictureInPictureStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pipSupportStore");
        return null;
    }

    public final void setPipSupportStore(PictureInPictureStore pictureInPictureStore) {
        Intrinsics.checkNotNullParameter(pictureInPictureStore, "<set-?>");
        this.pipSupportStore = pictureInPictureStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final String getScreenIdentifier() {
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((EventDetailFragmentKeyInternalOnly) companion.getArgs((Fragment) this)).getType().ordinal()];
        if (i == 1) {
            return "EventId: " + ((EventDetailFragmentKeyInternalOnly) companion.getArgs((Fragment) this)).getId();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "ContractId: " + ((EventDetailFragmentKeyInternalOnly) companion.getArgs((Fragment) this)).getId();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.EVENT_CONTRACT_DETAIL_PAGE, null, getScreenIdentifier(), null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, ((EventDetailFragmentKeyInternalOnly) INSTANCE.getArgs((Fragment) this)).getEntryPoint(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new FuturesContractContext(getScreenIdentifier(), null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -17, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1271932202);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271932202, i2, -1, "com.robinhood.android.event.detail.EventDetailFragment.ComposeContent (EventDetailFragment.kt:64)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1527897567, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.EventDetailFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1527897567, i3, -1, "com.robinhood.android.event.detail.EventDetailFragment.ComposeContent.<anonymous> (EventDetailFragment.kt:66)");
                    }
                    EventDetailScreen.EventDetailScreen(EventDetailFragment.this, null, composer2, 0, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.EventDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventDetailFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.event.detail.EventDetailFragment2
    public void onExitScreen() {
        if (popNearestParentBackStack()) {
            return;
        }
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // com.robinhood.android.event.detail.EventDetailFragment2
    public void handleEvent(final Event<EventDetailScreenEvent> event) {
        EventConsumer<EventDetailScreenEvent> eventConsumerInvoke;
        EventConsumer<EventDetailScreenEvent> eventConsumerInvoke2;
        EventConsumer<EventDetailScreenEvent> eventConsumerInvoke3;
        EventConsumer<EventDetailScreenEvent> eventConsumerInvoke4;
        EventConsumer<EventDetailScreenEvent> eventConsumerInvoke5;
        EventConsumer<EventDetailScreenEvent> eventConsumerInvoke6;
        final android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (event != null && (event.getData() instanceof EventDetailScreenEvent.StartTrade) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.event.detail.EventDetailFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14111invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14111invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator.DefaultImpls.startActivity$default(this.getNavigator(), context, new EventTradeActivityKey(((EventDetailScreenEvent.StartTrade) event.getData()).getEventTradeOrderContext(), this.getEventScreen(), "event_detail"), null, false, null, null, 60, null);
                }
            });
        }
        if (event != null && (event.getData() instanceof EventDetailScreenEvent.StartOnboarding) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.event.detail.EventDetailFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14112invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14112invoke(Object it) {
                    FuturesOnboardingActivityKey.PostOnboardingNavigation routeToEdpByEventId;
                    UUID eventContractId;
                    Intrinsics.checkNotNullParameter(it, "it");
                    EventDetailScreenEvent.StartOnboarding startOnboarding = (EventDetailScreenEvent.StartOnboarding) event.getData();
                    Navigator navigator = this.getNavigator();
                    android.content.Context context2 = context;
                    EventTradeOrderContext redirectOrderContext = startOnboarding.getRedirectOrderContext();
                    if (redirectOrderContext != null && (eventContractId = redirectOrderContext.getEventContractId()) != null) {
                        routeToEdpByEventId = new FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcOrderForm(eventContractId);
                    } else {
                        routeToEdpByEventId = new FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByEventId(startOnboarding.getEventId());
                    }
                    Navigator.DefaultImpls.startActivity$default(navigator, context2, new FuturesOnboardingActivityKey("event_detail", true, routeToEdpByEventId), null, false, null, null, 60, null);
                }
            });
        }
        if (event != null && (event.getData() instanceof EventDetailScreenEvent.ShowAttestation) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.event.detail.EventDetailFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14113invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14113invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    EventDetailScreenEvent.ShowAttestation showAttestation = (EventDetailScreenEvent.ShowAttestation) event.getData();
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(this.getNavigator(), context, new EventAttestationFragmentKey(showAttestation.getAttestationType(), showAttestation.getRedirectOrderContext()), false, false, false, false, null, false, null, null, 1020, null);
                }
            });
        }
        if (event != null && (event.getData() instanceof EventDetailScreenEvent.ShowEventFaq) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.event.detail.EventDetailFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14114invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14114invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(this.getNavigator(), context, new OtherMarkdownFragmentKey(EventContractConstants.EDP_FAQ_CONTENTFUL_ID, null, null, 6, null), false, true, false, false, null, false, null, null, 1012, null);
                }
            });
        }
        if (event != null && (event.getData() instanceof EventDetailScreenEvent.ShowViewAll) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.event.detail.EventDetailFragment$handleEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m14115invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m14115invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator.DefaultImpls.showFragment$default(this.getNavigator(), context, new EventContractSelectorFragmentKey(((EventDetailScreenEvent.ShowViewAll) event.getData()).getEventId()), false, false, false, null, false, null, false, false, null, null, 4084, null);
                }
            });
        }
        if (event == null || !(event.getData() instanceof EventDetailScreenEvent.PollBottomSheet) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.event.detail.EventDetailFragment$handleEvent$$inlined$consumeIfType$6
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m14116invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m14116invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CrossSellLaunchManager.initIacBottomSheetPolling$default(this.getCrossSellLaunchManager(), this, IacAlertSheetLocation.EVENT_CONTRACT_EVENT_DETAIL_PAGE, null, null, null, null, null, ((EventDetailScreenEvent.PollBottomSheet) event.getData()).getEventId(), ((EventDetailFragmentKeyInternalOnly) EventDetailFragment.INSTANCE.getArgs((Fragment) this)).getEntryPoint(), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            }
        });
    }

    @Override // com.robinhood.android.event.detail.EventDetailFragment2
    public void onStartPipMode(UUID eventId, List<UUID> contractIds, DisplaySpan span) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        Intrinsics.checkNotNullParameter(span, "span");
        getPipSupportStore().launchPipMode(requireBaseActivity(), new PictureInPictureKey.Event(eventId, contractIds, span));
    }

    /* compiled from: EventDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/event/detail/EventDetailFragment;", "Lcom/robinhood/android/eventcontracts/contracts/EventDetailFragmentKeyInternalOnly;", "<init>", "()V", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EventDetailFragment, EventDetailFragmentKeyInternalOnly> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EventDetailFragmentKeyInternalOnly eventDetailFragmentKeyInternalOnly) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, eventDetailFragmentKeyInternalOnly);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EventDetailFragmentKeyInternalOnly getArgs(EventDetailFragment eventDetailFragment) {
            return (EventDetailFragmentKeyInternalOnly) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, eventDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EventDetailFragment newInstance(EventDetailFragmentKeyInternalOnly eventDetailFragmentKeyInternalOnly) {
            return (EventDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, eventDetailFragmentKeyInternalOnly);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EventDetailFragment eventDetailFragment, EventDetailFragmentKeyInternalOnly eventDetailFragmentKeyInternalOnly) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, eventDetailFragment, eventDetailFragmentKeyInternalOnly);
        }
    }
}
