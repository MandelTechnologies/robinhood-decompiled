package com.robinhood.android.event.trade;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
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
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.event.trade.EventOrderFormEvent;
import com.robinhood.android.event.trade.EventOrderFormFragment;
import com.robinhood.android.event.trade.EventOrderFormViewState;
import com.robinhood.android.event.trade.orderform.EventOrderFormScreen3;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect;
import com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect2;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.EventOrderSide2;
import com.robinhood.android.models.event.p186db.order.OrderFormOrderType;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: EventOrderFormFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003)*+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u001f\u001a\u00020 H\u0017¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0013H\u0016J\t\u0010#\u001a\u00020\u0013H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002²\u0006\u0012\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100X\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0004\u0018\u000103X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/event/trade/EventOrderFormFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/event/trade/EventOrderFormFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/event/trade/EventOrderFormDuxo;", "getDuxo", "()Lcom/robinhood/android/event/trade/EventOrderFormDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "interceptBackPressed", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "toolbarVisible", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-event-trade_externalDebug", "state", "Lcom/robinhood/android/event/trade/EventOrderFormViewState;", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/event/trade/EventOrderFormEvent;", "notionalErrorShakeAnimationId", "Ljava/util/UUID;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EventOrderFormFragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(EventContractsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.event.trade.EventOrderFormFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof EventOrderFormFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EventOrderFormDuxo.class);
    private boolean interceptBackPressed;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EventOrderFormFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/event/trade/EventOrderFormFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EventOrderFormFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0017\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormFragment$Callbacks;", "", "exitOrderForm", "", "restartOrderFormInIoc", "defaultQuantity", "", "(Ljava/lang/Integer;)V", "restartOrderFormInNotional", "defaultNotional", "Ljava/math/BigDecimal;", "showOrderTypePage", "exitOrderFormAfterOrderSubmission", "routeToAttestation", "attestationType", "", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void exitOrderForm();

        void exitOrderFormAfterOrderSubmission();

        void restartOrderFormInIoc(Integer defaultQuantity);

        void restartOrderFormInNotional(BigDecimal defaultNotional);

        void routeToAttestation(String attestationType);

        void showOrderTypePage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10(EventOrderFormFragment eventOrderFormFragment, int i, Composer composer, int i2) {
        eventOrderFormFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventOrderFormDuxo getDuxo() {
        return (EventOrderFormDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.EVENT_CONTRACT_ORDER_FORM, null, Uuids.safeToString(((Args) INSTANCE.getArgs((Fragment) this)).getEventContractId()), null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        Companion companion = INSTANCE;
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((Args) companion.getArgs((Fragment) this)).getEntryPoint(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Args) companion.getArgs((Fragment) this)).getEventTradeOrderContext().toProtoLoggingModel(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1048577, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<EventOrderFormEvent> eventConsumerInvoke;
        EventConsumer<EventOrderFormEvent> eventConsumerInvoke2;
        EventConsumer<EventOrderFormEvent> eventConsumerInvoke3;
        EventConsumer<EventOrderFormEvent> eventConsumerInvoke4;
        EventConsumer<EventOrderFormEvent> eventConsumerInvoke5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1791401809);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1791401809, i2, -1, "com.robinhood.android.event.trade.EventOrderFormFragment.ComposeContent (EventOrderFormFragment.kt:68)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            this.interceptBackPressed = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInterceptOnBackPressed();
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Event<EventOrderFormEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof EventOrderFormEvent.ExitOrderFormEvent) && (eventConsumerInvoke5 = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke5.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14275invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14275invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().exitOrderForm();
                    }
                });
            }
            final Event<EventOrderFormEvent> eventComposeContent$lambda$12 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$12 != null && (eventComposeContent$lambda$12.getData() instanceof EventOrderFormEvent.OrderSubmittedEvent) && (eventConsumerInvoke4 = eventComposeContent$lambda$12.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke4.consume(eventComposeContent$lambda$12, new Function1() { // from class: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14276invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14276invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().exitOrderFormAfterOrderSubmission();
                    }
                });
            }
            final Event<EventOrderFormEvent> eventComposeContent$lambda$13 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$13 != null && (eventComposeContent$lambda$13.getData() instanceof EventOrderFormEvent.OrderError) && (eventConsumerInvoke3 = eventComposeContent$lambda$13.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke3.consume(eventComposeContent$lambda$13, new Function1() { // from class: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$$inlined$consumeIfType$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                        m14277invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14277invoke(Object it) throws Throwable {
                        Intrinsics.checkNotNullParameter(it, "it");
                        EventOrderFormEvent.OrderError orderError = (EventOrderFormEvent.OrderError) eventComposeContent$lambda$13.getData();
                        this.getDuxo().regenerateRefId(orderError.getError());
                        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                        FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, orderError.getError(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 24, null);
                    }
                });
            }
            final Event<EventOrderFormEvent> eventComposeContent$lambda$14 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$14 != null && (eventComposeContent$lambda$14.getData() instanceof EventOrderFormEvent.RouteToAttestation) && (eventConsumerInvoke2 = eventComposeContent$lambda$14.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke2.consume(eventComposeContent$lambda$14, new Function1() { // from class: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$$inlined$consumeIfType$4
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14278invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14278invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().routeToAttestation(((EventOrderFormEvent.RouteToAttestation) eventComposeContent$lambda$14.getData()).getAttestationType());
                    }
                });
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Event<EventOrderFormEvent> eventComposeContent$lambda$15 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$15 != null && (eventComposeContent$lambda$15.getData() instanceof EventOrderFormEvent.NotionalPriceErrorShake) && (eventConsumerInvoke = eventComposeContent$lambda$15.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$15, new Function1() { // from class: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$$inlined$consumeIfType$5
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14279invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14279invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        snapshotState.setValue(UUID.randomUUID());
                    }
                });
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(323678276, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.EventOrderFormFragment.ComposeContent.6

                /* compiled from: EventOrderFormFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$6$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[OrderForm6.values().length];
                        try {
                            iArr[OrderForm6.EDITING.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[OrderForm6.REVIEWING.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[OrderForm6.SUBMITTING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[OrderForm6.SUBMITTED.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[OrderForm6.CONFIRMATION.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    Screen.Name name;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(323678276, i3, -1, "com.robinhood.android.event.trade.EventOrderFormFragment.ComposeContent.<anonymous> (EventOrderFormFragment.kt:98)");
                    }
                    Companion companion = EventOrderFormFragment.INSTANCE;
                    com.robinhood.rosetta.eventlogging.Context context = new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((Args) companion.getArgs((Fragment) EventOrderFormFragment.this)).getEntryPoint(), null, ((Args) companion.getArgs((Fragment) EventOrderFormFragment.this)).getSourceScreen(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, EventOrderFormFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5121, -1, -1, -1, -1, -1048577, 16383, null);
                    int i4 = WhenMappings.$EnumSwitchMapping$0[EventOrderFormFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getOrderFormState().ordinal()];
                    if (i4 == 1) {
                        name = Screen.Name.EVENT_CONTRACT_ORDER_FORM;
                    } else if (i4 == 2 || i4 == 3) {
                        name = Screen.Name.EVENT_CONTRACT_ORDER_FORM_REVIEW;
                    } else {
                        if (i4 != 4 && i4 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        name = Screen.Name.EVENT_CONTRACT_ORDER_FORM_RECEIPT;
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, context, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-269778951, true, new AnonymousClass1(EventOrderFormFragment.this, snapshotState4CollectAsStateWithLifecycle, snapshotState), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: EventOrderFormFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$6$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<UUID> $notionalErrorShakeAnimationId$delegate;
                    final /* synthetic */ SnapshotState4<EventOrderFormViewState> $state$delegate;
                    final /* synthetic */ EventOrderFormFragment this$0;

                    AnonymousClass1(EventOrderFormFragment eventOrderFormFragment, SnapshotState4<EventOrderFormViewState> snapshotState4, SnapshotState<UUID> snapshotState) {
                        this.this$0 = eventOrderFormFragment;
                        this.$state$delegate = snapshotState4;
                        this.$notionalErrorShakeAnimationId$delegate = snapshotState;
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
                            ComposerKt.traceEventStart(-269778951, i, -1, "com.robinhood.android.event.trade.EventOrderFormFragment.ComposeContent.<anonymous>.<anonymous> (EventOrderFormFragment.kt:119)");
                        }
                        EventOrderFormViewState eventOrderFormViewStateComposeContent$lambda$0 = EventOrderFormFragment.ComposeContent$lambda$0(this.$state$delegate);
                        UUID uuidComposeContent$lambda$7 = EventOrderFormFragment.ComposeContent$lambda$7(this.$notionalErrorShakeAnimationId$delegate);
                        EventOrderFormDuxo duxo = this.this$0.getDuxo();
                        EventOrderFormFragment eventOrderFormFragment = this.this$0;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(eventOrderFormFragment);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new EventOrderFormFragment2(eventOrderFormFragment);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        EventOrderFormDuxo duxo2 = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(duxo2);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new EventOrderFormFragment3(duxo2);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
                        EventOrderFormDuxo duxo3 = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(duxo3);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new EventOrderFormFragment4(duxo3);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        Function1 function12 = (Function1) ((KFunction) objRememberedValue3);
                        EventOrderFormDuxo duxo4 = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer.changedInstance(duxo4);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new EventOrderFormFragment5(duxo4);
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        Function0 function02 = (Function0) ((KFunction) objRememberedValue4);
                        EventOrderFormDuxo duxo5 = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composer.changedInstance(duxo5);
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new EventOrderFormFragment6(duxo5);
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        composer.endReplaceGroup();
                        Function0 function03 = (Function0) ((KFunction) objRememberedValue5);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance6 = composer.changedInstance(this.this$0);
                        final EventOrderFormFragment eventOrderFormFragment2 = this.this$0;
                        Object objRememberedValue6 = composer.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$6$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EventOrderFormFragment.C164636.AnonymousClass1.invoke$lambda$6$lambda$5(eventOrderFormFragment2, (EventOrderFormViewState.ReceiptData.QuickResubmit) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        Function1 function13 = (Function1) objRememberedValue6;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance7 = composer.changedInstance(this.this$0);
                        final EventOrderFormFragment eventOrderFormFragment3 = this.this$0;
                        Object objRememberedValue7 = composer.rememberedValue();
                        if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: com.robinhood.android.event.trade.EventOrderFormFragment$ComposeContent$6$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EventOrderFormFragment.C164636.AnonymousClass1.invoke$lambda$8$lambda$7(eventOrderFormFragment3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue7);
                        }
                        Function0 function04 = (Function0) objRememberedValue7;
                        composer.endReplaceGroup();
                        EventOrderFormDuxo duxo6 = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance8 = composer.changedInstance(duxo6);
                        Object objRememberedValue8 = composer.rememberedValue();
                        if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new EventOrderFormFragment7(duxo6);
                            composer.updateRememberedValue(objRememberedValue8);
                        }
                        composer.endReplaceGroup();
                        EventOrderFormScreen3.EventOrderFormScreen(eventOrderFormViewStateComposeContent$lambda$0, uuidComposeContent$lambda$7, duxo, function0, function1, function12, function02, function03, function13, function04, (Function1) ((KFunction) objRememberedValue8), ModifiersKt.logScreenTransitions(Modifier.INSTANCE, (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())), composer, 0, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5(EventOrderFormFragment eventOrderFormFragment, EventOrderFormViewState.ReceiptData.QuickResubmit quickSubmit) {
                        Intrinsics.checkNotNullParameter(quickSubmit, "quickSubmit");
                        if (quickSubmit instanceof EventOrderFormViewState.ReceiptData.QuickResubmit.Notional) {
                            eventOrderFormFragment.getCallbacks().restartOrderFormInNotional(((EventOrderFormViewState.ReceiptData.QuickResubmit.Notional) quickSubmit).getNotionalAmount());
                        } else if (quickSubmit instanceof EventOrderFormViewState.ReceiptData.QuickResubmit.Quantity) {
                            eventOrderFormFragment.getCallbacks().restartOrderFormInIoc(Integer.valueOf(((EventOrderFormViewState.ReceiptData.QuickResubmit.Quantity) quickSubmit).getQuantity()));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$8$lambda$7(EventOrderFormFragment eventOrderFormFragment) {
                        eventOrderFormFragment.getCallbacks().showOrderTypePage();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.EventOrderFormFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderFormFragment.ComposeContent$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventOrderFormViewState ComposeContent$lambda$0(SnapshotState4<EventOrderFormViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<EventOrderFormEvent> ComposeContent$lambda$1(SnapshotState4<Event<EventOrderFormEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID ComposeContent$lambda$7(SnapshotState<UUID> snapshotState) {
        return snapshotState.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.interceptBackPressed) {
            getDuxo().onBackPressed();
            return true;
        }
        if (super.onBackPressed()) {
            return true;
        }
        getCallbacks().exitOrderForm();
        return true;
    }

    /* compiled from: EventOrderFormFragment.kt */
    @Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001?B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u00102\u001a\u000203J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000203HÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000203R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u001b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020 ¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020%¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args;", "Landroid/os/Parcelable;", "eventTradeOrderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "entryPoint", "", "initialState", "Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;Ljava/lang/String;Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getEventTradeOrderContext", "()Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "getEntryPoint", "()Ljava/lang/String;", "getInitialState", "()Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "defaultOrderType", "Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "getDefaultOrderType$annotations", "()V", "getDefaultOrderType", "()Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "eventContractId", "Ljava/util/UUID;", "getEventContractId$annotations", "getEventContractId", "()Ljava/util/UUID;", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getSide$annotations", "getSide", "()Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "positionEffect", "Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "getPositionEffect$annotations", "getPositionEffect", "()Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "contractSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "getContractSide", "()Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "InitialState", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OrderFormOrderType defaultOrderType;
        private final String entryPoint;
        private final UUID eventContractId;
        private final EventTradeOrderContext eventTradeOrderContext;
        private final InitialState initialState;
        private final EventOrderPositionEffect positionEffect;
        private final EventOrderSide side;
        private final Screen sourceScreen;

        /* compiled from: EventOrderFormFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((EventTradeOrderContext) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), (InitialState) parcel.readParcelable(Args.class.getClassLoader()), (Screen) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* compiled from: EventOrderFormFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[EventOrderSide.values().length];
                try {
                    iArr[EventOrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EventOrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[EventOrderPositionEffect.values().length];
                try {
                    iArr2[EventOrderPositionEffect.OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[EventOrderPositionEffect.CLOSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public static /* synthetic */ Args copy$default(Args args, EventTradeOrderContext eventTradeOrderContext, String str, InitialState initialState, Screen screen, int i, Object obj) {
            if ((i & 1) != 0) {
                eventTradeOrderContext = args.eventTradeOrderContext;
            }
            if ((i & 2) != 0) {
                str = args.entryPoint;
            }
            if ((i & 4) != 0) {
                initialState = args.initialState;
            }
            if ((i & 8) != 0) {
                screen = args.sourceScreen;
            }
            return args.copy(eventTradeOrderContext, str, initialState, screen);
        }

        public static /* synthetic */ void getDefaultOrderType$annotations() {
        }

        public static /* synthetic */ void getEventContractId$annotations() {
        }

        public static /* synthetic */ void getPositionEffect$annotations() {
        }

        public static /* synthetic */ void getSide$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final EventTradeOrderContext getEventTradeOrderContext() {
            return this.eventTradeOrderContext;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component3, reason: from getter */
        public final InitialState getInitialState() {
            return this.initialState;
        }

        /* renamed from: component4, reason: from getter */
        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }

        public final Args copy(EventTradeOrderContext eventTradeOrderContext, String entryPoint, InitialState initialState, Screen sourceScreen) {
            Intrinsics.checkNotNullParameter(eventTradeOrderContext, "eventTradeOrderContext");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new Args(eventTradeOrderContext, entryPoint, initialState, sourceScreen);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.eventTradeOrderContext, args.eventTradeOrderContext) && Intrinsics.areEqual(this.entryPoint, args.entryPoint) && Intrinsics.areEqual(this.initialState, args.initialState) && Intrinsics.areEqual(this.sourceScreen, args.sourceScreen);
        }

        public int hashCode() {
            int iHashCode = ((this.eventTradeOrderContext.hashCode() * 31) + this.entryPoint.hashCode()) * 31;
            InitialState initialState = this.initialState;
            int iHashCode2 = (iHashCode + (initialState == null ? 0 : initialState.hashCode())) * 31;
            Screen screen = this.sourceScreen;
            return iHashCode2 + (screen != null ? screen.hashCode() : 0);
        }

        public String toString() {
            return "Args(eventTradeOrderContext=" + this.eventTradeOrderContext + ", entryPoint=" + this.entryPoint + ", initialState=" + this.initialState + ", sourceScreen=" + this.sourceScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.eventTradeOrderContext, flags);
            dest.writeString(this.entryPoint);
            dest.writeParcelable(this.initialState, flags);
            dest.writeSerializable(this.sourceScreen);
        }

        public Args(EventTradeOrderContext eventTradeOrderContext, String entryPoint, InitialState initialState, Screen screen) {
            OrderFormOrderType orderFormOrderType;
            Intrinsics.checkNotNullParameter(eventTradeOrderContext, "eventTradeOrderContext");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.eventTradeOrderContext = eventTradeOrderContext;
            this.entryPoint = entryPoint;
            this.initialState = initialState;
            this.sourceScreen = screen;
            if (initialState instanceof InitialState.NotionalOrder) {
                orderFormOrderType = OrderFormOrderType.NOTIONAL_BASED_ORDER;
            } else if (initialState instanceof InitialState.QuantityOrder) {
                orderFormOrderType = OrderFormOrderType.QUANTITY_BASED_ORDER;
            } else {
                if (initialState != null) {
                    throw new NoWhenBranchMatchedException();
                }
                orderFormOrderType = null;
            }
            this.defaultOrderType = orderFormOrderType;
            this.eventContractId = eventTradeOrderContext.getEventContractId();
            this.side = EventOrderSide2.toEventOrderSide(eventTradeOrderContext.getSide());
            this.positionEffect = EventOrderPositionEffect2.toEventPositionEffect(eventTradeOrderContext.getPositionEffect());
        }

        public /* synthetic */ Args(EventTradeOrderContext eventTradeOrderContext, String str, InitialState initialState, Screen screen, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(eventTradeOrderContext, str, (i & 4) != 0 ? null : initialState, (i & 8) != 0 ? null : screen);
        }

        public final EventTradeOrderContext getEventTradeOrderContext() {
            return this.eventTradeOrderContext;
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final InitialState getInitialState() {
            return this.initialState;
        }

        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }

        /* compiled from: EventOrderFormFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState;", "Landroid/os/Parcelable;", "QuantityOrder", "NotionalOrder", "Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState$NotionalOrder;", "Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState$QuantityOrder;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface InitialState extends Parcelable {

            /* compiled from: EventOrderFormFragment.kt */
            @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0003J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState$QuantityOrder;", "Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState;", "defaultQuantity", "", "<init>", "(Ljava/lang/Integer;)V", "getDefaultQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState$QuantityOrder;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class QuantityOrder implements InitialState {
                public static final int $stable = 0;
                public static final Parcelable.Creator<QuantityOrder> CREATOR = new Creator();
                private final Integer defaultQuantity;

                /* compiled from: EventOrderFormFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<QuantityOrder> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final QuantityOrder createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new QuantityOrder(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final QuantityOrder[] newArray(int i) {
                        return new QuantityOrder[i];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public QuantityOrder() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ QuantityOrder copy$default(QuantityOrder quantityOrder, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        num = quantityOrder.defaultQuantity;
                    }
                    return quantityOrder.copy(num);
                }

                /* renamed from: component1, reason: from getter */
                public final Integer getDefaultQuantity() {
                    return this.defaultQuantity;
                }

                public final QuantityOrder copy(Integer defaultQuantity) {
                    return new QuantityOrder(defaultQuantity);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof QuantityOrder) && Intrinsics.areEqual(this.defaultQuantity, ((QuantityOrder) other).defaultQuantity);
                }

                public int hashCode() {
                    Integer num = this.defaultQuantity;
                    if (num == null) {
                        return 0;
                    }
                    return num.hashCode();
                }

                public String toString() {
                    return "QuantityOrder(defaultQuantity=" + this.defaultQuantity + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    Integer num = this.defaultQuantity;
                    if (num == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeInt(num.intValue());
                    }
                }

                public QuantityOrder(Integer num) {
                    this.defaultQuantity = num;
                }

                public /* synthetic */ QuantityOrder(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : num);
                }

                public final Integer getDefaultQuantity() {
                    return this.defaultQuantity;
                }
            }

            /* compiled from: EventOrderFormFragment.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState$NotionalOrder;", "Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args$InitialState;", "defaultNotionalAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getDefaultNotionalAmount", "()Ljava/math/BigDecimal;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class NotionalOrder implements InitialState {
                public static final int $stable = 8;
                public static final Parcelable.Creator<NotionalOrder> CREATOR = new Creator();
                private final BigDecimal defaultNotionalAmount;

                /* compiled from: EventOrderFormFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<NotionalOrder> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final NotionalOrder createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new NotionalOrder((BigDecimal) parcel.readSerializable());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final NotionalOrder[] newArray(int i) {
                        return new NotionalOrder[i];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public NotionalOrder() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ NotionalOrder copy$default(NotionalOrder notionalOrder, BigDecimal bigDecimal, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bigDecimal = notionalOrder.defaultNotionalAmount;
                    }
                    return notionalOrder.copy(bigDecimal);
                }

                /* renamed from: component1, reason: from getter */
                public final BigDecimal getDefaultNotionalAmount() {
                    return this.defaultNotionalAmount;
                }

                public final NotionalOrder copy(BigDecimal defaultNotionalAmount) {
                    return new NotionalOrder(defaultNotionalAmount);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof NotionalOrder) && Intrinsics.areEqual(this.defaultNotionalAmount, ((NotionalOrder) other).defaultNotionalAmount);
                }

                public int hashCode() {
                    BigDecimal bigDecimal = this.defaultNotionalAmount;
                    if (bigDecimal == null) {
                        return 0;
                    }
                    return bigDecimal.hashCode();
                }

                public String toString() {
                    return "NotionalOrder(defaultNotionalAmount=" + this.defaultNotionalAmount + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.defaultNotionalAmount);
                }

                public NotionalOrder(BigDecimal bigDecimal) {
                    this.defaultNotionalAmount = bigDecimal;
                }

                public /* synthetic */ NotionalOrder(BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bigDecimal);
                }

                public final BigDecimal getDefaultNotionalAmount() {
                    return this.defaultNotionalAmount;
                }
            }
        }

        public final OrderFormOrderType getDefaultOrderType() {
            return this.defaultOrderType;
        }

        public final UUID getEventContractId() {
            return this.eventContractId;
        }

        public final EventOrderSide getSide() {
            return this.side;
        }

        public final EventOrderPositionEffect getPositionEffect() {
            return this.positionEffect;
        }

        public final ContractSide getContractSide() {
            int i = WhenMappings.$EnumSwitchMapping$1[this.positionEffect.ordinal()];
            if (i == 1) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
                if (i2 == 1) {
                    return ContractSide.CONTRACT_SIDE_YES;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return ContractSide.CONTRACT_SIDE_NO;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
            if (i3 == 1) {
                return ContractSide.CONTRACT_SIDE_NO;
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return ContractSide.CONTRACT_SIDE_YES;
        }
    }

    /* compiled from: EventOrderFormFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/event/trade/EventOrderFormFragment;", "Lcom/robinhood/android/event/trade/EventOrderFormFragment$Args;", "<init>", "()V", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<EventOrderFormFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(EventOrderFormFragment eventOrderFormFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, eventOrderFormFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EventOrderFormFragment newInstance(Args args) {
            return (EventOrderFormFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EventOrderFormFragment eventOrderFormFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, eventOrderFormFragment, args);
        }
    }
}
