package com.robinhood.android.transfers.p271ui.max.wires;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.formentry.FormEntryDuxo;
import com.robinhood.android.formentry.data.FormEntryType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.teller.TellerErrorHandler;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.p271ui.max.wires.WireRoutingDetailsInputEvent;
import com.robinhood.android.transfers.p271ui.max.wires.WireRoutingDetailsInputFragment;
import com.robinhood.android.transfers.p271ui.max.wires.composables.WireRoutingConfirmPage;
import com.robinhood.android.transfers.p271ui.max.wires.models.ConfirmModeDisplayInfo;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.wiretransfers.contracts.ScreenStartType;
import java.util.NoSuchElementException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: WireRoutingDetailsInputFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0003:;<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020,H\u0016J\r\u00102\u001a\u00020,H\u0017¢\u0006\u0002\u00103J\b\u00104\u001a\u000205H\u0016J\u0016\u00106\u001a\u00020,2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b\"\u0010#R!\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b(\u0010)¨\u0006=²\u0006\n\u0010>\u001a\u00020?X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "formEntryDuxo", "Lcom/robinhood/android/formentry/FormEntryDuxo;", "getFormEntryDuxo", "()Lcom/robinhood/android/formentry/FormEntryDuxo;", "formEntryDuxo$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventContext$delegate", "tellerErrorHandler", "Lcom/robinhood/android/teller/TellerErrorHandler;", "", "getTellerErrorHandler", "()Lcom/robinhood/android/teller/TellerErrorHandler;", "tellerErrorHandler$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "Callbacks", "Args", "Companion", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WireRoutingDetailsInputFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WireRoutingDetailsInputFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof WireRoutingDetailsInputFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, WireRoutingDetailsInputDuxo.class);

    /* renamed from: formEntryDuxo$delegate, reason: from kotlin metadata */
    private final Lazy formEntryDuxo = DuxosKt.duxo(this, FormEntryDuxo.class);
    private final Screen eventScreen = new Screen(Screen.Name.OUTGOING_WIRE_DETAIL_INPUT, null, null, null, 14, null);

    /* renamed from: screenEventContext$delegate, reason: from kotlin metadata */
    private final Lazy screenEventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WireRoutingDetailsInputFragment.screenEventContext_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: tellerErrorHandler$delegate, reason: from kotlin metadata */
    private final Lazy tellerErrorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WireRoutingDetailsInputFragment.tellerErrorHandler_delegate$lambda$1(this.f$0);
        }
    });

    /* compiled from: WireRoutingDetailsInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment$Callbacks;", "", "exitFlow", "", "onWireRoutingDetailsEntered", "routingNumber", "", "accountNumber", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void exitFlow();

        void onWireRoutingDetailsEntered(String routingNumber, String accountNumber);
    }

    /* compiled from: WireRoutingDetailsInputFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WireRoutingDetailsInputDataState3.values().length];
            try {
                iArr[WireRoutingDetailsInputDataState3.ENTER_INFORMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WireRoutingDetailsInputDataState3.CONFIRM_INFORMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WireRoutingDetailsInputDataState3.SCAM_PREVENTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$12(WireRoutingDetailsInputFragment wireRoutingDetailsInputFragment, int i, Composer composer, int i2) {
        wireRoutingDetailsInputFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<WireRoutingDetailsInputEvent> event) {
        EventConsumer<WireRoutingDetailsInputEvent> eventConsumerInvoke;
        EventConsumer<WireRoutingDetailsInputEvent> eventConsumerInvoke2;
        EventConsumer<WireRoutingDetailsInputEvent> eventConsumerInvoke3;
        EventConsumer<WireRoutingDetailsInputEvent> eventConsumerInvoke4;
        EventConsumer<WireRoutingDetailsInputEvent> eventConsumerInvoke5;
        EventConsumer<WireRoutingDetailsInputEvent> eventConsumerInvoke6;
        EventConsumer<WireRoutingDetailsInputEvent> eventConsumerInvoke7;
        EventConsumer<WireRoutingDetailsInputEvent> eventConsumerInvoke8;
        EventConsumer<WireRoutingDetailsInputEvent> eventConsumerInvoke9;
        if ((event.getData() instanceof WireRoutingDetailsInputEvent.LaunchFormDuxo) && (eventConsumerInvoke9 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke9.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19928invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19928invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getFormEntryDuxo().launch(FormEntryType.FIRST_PARTY);
                }
            });
        }
        if ((event.getData() instanceof WireRoutingDetailsInputEvent.LogEvent) && (eventConsumerInvoke8 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke8.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19929invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19929invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    WireRoutingDetailsInputEvent.LogEvent logEvent = (WireRoutingDetailsInputEvent.LogEvent) event.getData();
                    if (logEvent instanceof WireRoutingDetailsInputEvent.LogEvent.ScreenAppearScamPrevention) {
                        EventLogger eventLogger = this.getEventLogger();
                        Screen screen = new Screen(Screen.Name.OUTGOING_WIRE_FRAUD_ALERT, null, null, null, 14, null);
                        com.robinhood.rosetta.eventlogging.Context screenEventContext = this.getScreenEventContext();
                        Unit unit = Unit.INSTANCE;
                        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, screenEventContext, 13, null);
                        return;
                    }
                    if (logEvent instanceof WireRoutingDetailsInputEvent.LogEvent.ScreenAppearV2) {
                        EventLogger eventLogger2 = this.getEventLogger();
                        Screen screen2 = new Screen(Screen.Name.OUTGOING_WIRE_DETAIL_V2_INPUT, null, null, null, 14, null);
                        com.robinhood.rosetta.eventlogging.Context screenEventContext2 = this.getScreenEventContext();
                        Unit unit2 = Unit.INSTANCE;
                        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger2, null, screen2, null, null, screenEventContext2, 13, null);
                        return;
                    }
                    if (logEvent instanceof WireRoutingDetailsInputEvent.LogEvent.ContinueTap) {
                        EventLogger.DefaultImpls.logTap$default(this.getEventLogger(), UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.OUTGOING_WIRE_DETAIL_V2_INPUT, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, this.getScreenEventContext(), false, 40, null);
                        return;
                    }
                    if (logEvent instanceof WireRoutingDetailsInputEvent.LogEvent.ScreenAppearConfirm) {
                        EventLogger eventLogger3 = this.getEventLogger();
                        Screen screen3 = new Screen(Screen.Name.OUTGOING_WIRE_DETAIL_V2_INPUT, null, null, null, 14, null);
                        com.robinhood.rosetta.eventlogging.Context screenEventContext3 = this.getScreenEventContext();
                        Unit unit3 = Unit.INSTANCE;
                        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger3, null, screen3, null, null, screenEventContext3, 13, null);
                        return;
                    }
                    if (logEvent instanceof WireRoutingDetailsInputEvent.LogEvent.ConfirmContinue) {
                        EventLogger.DefaultImpls.logTap$default(this.getEventLogger(), UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.OUTGOING_WIRE_DETAIL_CONFIRMATION, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, this.getScreenEventContext(), false, 40, null);
                        return;
                    }
                    if (logEvent instanceof WireRoutingDetailsInputEvent.LogEvent.ConfirmCheckbox) {
                        EventLogger.DefaultImpls.logTap$default(this.getEventLogger(), UserInteractionEventData.Action.CONFIRM, new Screen(Screen.Name.OUTGOING_WIRE_DETAIL_CONFIRMATION, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, this.getScreenEventContext(), false, 40, null);
                    } else if (logEvent instanceof WireRoutingDetailsInputEvent.LogEvent.AcknowledgeScamPrevention) {
                        EventLogger.DefaultImpls.logTap$default(this.getEventLogger(), UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.OUTGOING_WIRE_FRAUD_ALERT, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, this.getScreenEventContext(), false, 40, null);
                    } else {
                        if (!(logEvent instanceof WireRoutingDetailsInputEvent.LogEvent.ReportAScam)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EventLogger.DefaultImpls.logTap$default(this.getEventLogger(), UserInteractionEventData.Action.REPORT, new Screen(Screen.Name.OUTGOING_WIRE_FRAUD_ALERT, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, this.getScreenEventContext(), false, 40, null);
                    }
                }
            });
        }
        if ((event.getData() instanceof WireRoutingDetailsInputEvent.ValidationSuccess) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19930invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19930invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    WireRoutingDetailsInputEvent.ValidationSuccess validationSuccess = (WireRoutingDetailsInputEvent.ValidationSuccess) event.getData();
                    this.getCallbacks().onWireRoutingDetailsEntered(validationSuccess.getRoutingNumber(), validationSuccess.getAccountNumber());
                }
            });
        }
        if ((event.getData() instanceof WireRoutingDetailsInputEvent.ValidationFailure) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19931invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19931invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    GenericAlert alert = ((WireRoutingDetailsInputEvent.ValidationFailure) event.getData()).getAlert();
                    Navigator.DefaultImpls.createDialogFragment$default(this.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(alert, false, true, 0, 10, (DefaultConstructorMarker) null), null, 2, null).show(this.getChildFragmentManager(), alert.getTitle());
                }
            });
        }
        if ((event.getData() instanceof WireRoutingDetailsInputEvent.TellerError) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$handleEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19932invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19932invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    AbsErrorHandler.handleError$default(this.getTellerErrorHandler(), ((WireRoutingDetailsInputEvent.TellerError) event.getData()).getThrowable(), false, 2, null);
                }
            });
        }
        if ((event.getData() instanceof WireRoutingDetailsInputEvent.NavigateToScamPrevention) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$handleEvent$$inlined$consumeIfType$6
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19933invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19933invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    WireRoutingDetailsInputEvent.NavigateToScamPrevention navigateToScamPrevention = (WireRoutingDetailsInputEvent.NavigateToScamPrevention) event.getData();
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new MicrogramRouterFragmentKey(navigateToScamPrevention.getScamPreventionPageSource(), "robinhood://wire_transfer?screenStartType=" + ScreenStartType.SCAM_PREVENTION_DETAILS, null, null, null, 28, null), false, false, false, false, null, false, null, null, 1020, null);
                }
            });
        }
        if ((event.getData() instanceof WireRoutingDetailsInputEvent.ReturnSelectedAccountResult) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$handleEvent$$inlined$consumeIfType$7
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19934invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19934invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.requireActivity().setResult(-1, new Intent().putExtra("id", ((WireRoutingDetailsInputEvent.ReturnSelectedAccountResult) event.getData()).getId()));
                    this.getCallbacks().exitFlow();
                }
            });
        }
        if ((event.getData() instanceof WireRoutingDetailsInputEvent.ReportScam) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$handleEvent$$inlined$consumeIfType$8
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19935invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19935invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    WireRoutingDetailsInputEvent.ReportScam reportScam = (WireRoutingDetailsInputEvent.ReportScam) event.getData();
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, reportScam.getUri(), null, null, false, null, 60, null);
                }
            });
        }
        if (!(event.getData() instanceof WireRoutingDetailsInputEvent.NavigateToTransferScreen) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$handleEvent$$inlined$consumeIfType$9
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m19936invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19936invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                WireRoutingDetailsInputEvent.NavigateToTransferScreen navigateToTransferScreen = (WireRoutingDetailsInputEvent.NavigateToTransferScreen) event.getData();
                TransferConfiguration.OutgoingWire outgoingWire = new TransferConfiguration.OutgoingWire(new TransferConfiguration.TransferAccountSelection(null, false, navigateToTransferScreen.getFrom(), 3, null), new TransferConfiguration.TransferAccountSelection(navigateToTransferScreen.getId(), false, navigateToTransferScreen.getTo(), 2, null), true, new WiresContext(WiresContext.WiresDirection.OUTGOING, WiresContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, null, null, 12, null), navigateToTransferScreen.getAccountNumber(), navigateToTransferScreen.getRoutingNumber(), null, null, 192, null);
                Navigator navigator = this.getNavigator();
                Context contextRequireContext = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(outgoingWire), null, false, null, null, 60, null);
                this.getCallbacks().exitFlow();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WireRoutingDetailsInputDuxo getDuxo() {
        return (WireRoutingDetailsInputDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormEntryDuxo getFormEntryDuxo() {
        return (FormEntryDuxo) this.formEntryDuxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return (com.robinhood.rosetta.eventlogging.Context) this.screenEventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.robinhood.rosetta.eventlogging.Context screenEventContext_delegate$lambda$0(WireRoutingDetailsInputFragment wireRoutingDetailsInputFragment) {
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Args) INSTANCE.getArgs((Fragment) wireRoutingDetailsInputFragment)).getWiresContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -65, -1, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TellerErrorHandler<Object> getTellerErrorHandler() {
        return (TellerErrorHandler) this.tellerErrorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TellerErrorHandler tellerErrorHandler_delegate$lambda$1(WireRoutingDetailsInputFragment wireRoutingDetailsInputFragment) {
        FragmentActivity fragmentActivityRequireActivity = wireRoutingDetailsInputFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new TellerErrorHandler(fragmentActivityRequireActivity, true, 0, null, 12, null);
    }

    /* compiled from: WireRoutingDetailsInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$onViewCreated$1", m3645f = "WireRoutingDetailsInputFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$onViewCreated$1 */
    static final class C310191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C310191(Continuation<? super C310191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WireRoutingDetailsInputFragment.this.new C310191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WireRoutingDetailsInputFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ WireRoutingDetailsInputFragment $tmp0;

            AnonymousClass1(WireRoutingDetailsInputFragment wireRoutingDetailsInputFragment) {
                this.$tmp0 = wireRoutingDetailsInputFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, WireRoutingDetailsInputFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<WireRoutingDetailsInputEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C310191.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<WireRoutingDetailsInputEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(WireRoutingDetailsInputFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WireRoutingDetailsInputFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(WireRoutingDetailsInputFragment wireRoutingDetailsInputFragment, Event event, Continuation continuation) {
            wireRoutingDetailsInputFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C310191(null), 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        WireRoutingDetailsInputViewState value = getDuxo().getStateFlow().getValue();
        if (value.getMode() == WireRoutingDetailsInputDataState3.SCAM_PREVENTION && value.isLoading()) {
            requireActivity().finish();
        }
    }

    private static final WireRoutingDetailsInputViewState ComposeContent$lambda$3(SnapshotState4<WireRoutingDetailsInputViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1059245925);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1059245925, i2, -1, "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment.ComposeContent (WireRoutingDetailsInputFragment.kt:84)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            if (!ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).isLoading()) {
                int i3 = WhenMappings.$EnumSwitchMapping$0[ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getMode().ordinal()];
                if (i3 == 1) {
                    composerStartRestartGroup.startReplaceGroup(871012086);
                    WireRoutingDetailsInputViewState wireRoutingDetailsInputViewStateComposeContent$lambda$3 = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle);
                    FormEntryDuxo formEntryDuxo = getFormEntryDuxo();
                    WireRoutingDetailsInputDuxo duxo = getDuxo();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new WireRoutingDetailsInputFragment2(duxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                    WireRoutingDetailsInputDuxo duxo2 = getDuxo();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo2);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new WireRoutingDetailsInputFragment3(duxo2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WireRoutingDetailsInputFragment.ComposeContent$lambda$8$lambda$7(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    WireRoutingDetailsInputComposable.WireRoutingDetailsInput(wireRoutingDetailsInputViewStateComposeContent$lambda$3, formEntryDuxo, function1, function0, (Function0) objRememberedValue3, null, composerStartRestartGroup, FormEntryDuxo.$stable << 3, 32);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i3 == 2) {
                    composerStartRestartGroup.startReplaceGroup(871869577);
                    ConfirmModeDisplayInfo confirmModeDisplayInfo = ComposeContent$lambda$3(snapshotState4CollectAsStateWithLifecycle).getConfirmModeDisplayInfo();
                    if (confirmModeDisplayInfo != null) {
                        Resources resources = getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        WireRoutingDetailsInputDuxo duxo3 = getDuxo();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo3);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new WireRoutingDetailsInputFragment4(duxo3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Function0 function02 = (Function0) ((KFunction) objRememberedValue4);
                        WireRoutingDetailsInputDuxo duxo4 = getDuxo();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(duxo4);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new WireRoutingDetailsInputFragment5(duxo4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        WireRoutingConfirmPage.WireRoutingConfirmPage(resources, confirmModeDisplayInfo, function02, null, (Function1) ((KFunction) objRememberedValue5), composerStartRestartGroup, 0, 8);
                        composerStartRestartGroup = composerStartRestartGroup;
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i3 != 3) {
                        composerStartRestartGroup.startReplaceGroup(28094991);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(872353115);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WireRoutingDetailsInputFragment.ComposeContent$lambda$12(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8$lambda$7(final WireRoutingDetailsInputFragment wireRoutingDetailsInputFragment) {
        wireRoutingDetailsInputFragment.getFormEntryDuxo().getAccountAndRoutingForRequest(new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WireRoutingDetailsInputFragment.ComposeContent$lambda$8$lambda$7$lambda$6(this.f$0, (Tuples2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8$lambda$7$lambda$6(WireRoutingDetailsInputFragment wireRoutingDetailsInputFragment, Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        wireRoutingDetailsInputFragment.getDuxo().onAccountNumberChange((String) it.getFirst());
        wireRoutingDetailsInputFragment.getDuxo().onRoutingNumberChange((String) it.getSecond());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        int i = WhenMappings.$EnumSwitchMapping$0[getDuxo().getStateFlow().getValue().getMode().ordinal()];
        if (i == 1) {
            getCallbacks().exitFlow();
        } else if (i == 2) {
            getDuxo().moveToEnterInformationMode();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (getDuxo().getStateFlow().getValue().isLoading()) {
                getCallbacks().exitFlow();
            }
        }
        return true;
    }

    /* compiled from: WireRoutingDetailsInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment$Args;", "Landroid/os/Parcelable;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "wiresContext", "Lcom/robinhood/rosetta/eventlogging/WiresContext;", "needNewAccountResult", "", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/rosetta/eventlogging/WiresContext;Z)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getWiresContext", "()Lcom/robinhood/rosetta/eventlogging/WiresContext;", "getNeedNewAccountResult", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean needNewAccountResult;
        private final TransferAccount transferAccount;
        private final WiresContext wiresContext;

        /* compiled from: WireRoutingDetailsInputFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((TransferAccount) parcel.readParcelable(Args.class.getClassLoader()), (WiresContext) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, TransferAccount transferAccount, WiresContext wiresContext, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = args.transferAccount;
            }
            if ((i & 2) != 0) {
                wiresContext = args.wiresContext;
            }
            if ((i & 4) != 0) {
                z = args.needNewAccountResult;
            }
            return args.copy(transferAccount, wiresContext, z);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final WiresContext getWiresContext() {
            return this.wiresContext;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getNeedNewAccountResult() {
            return this.needNewAccountResult;
        }

        public final Args copy(TransferAccount transferAccount, WiresContext wiresContext, boolean needNewAccountResult) {
            return new Args(transferAccount, wiresContext, needNewAccountResult);
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
            return Intrinsics.areEqual(this.transferAccount, args.transferAccount) && Intrinsics.areEqual(this.wiresContext, args.wiresContext) && this.needNewAccountResult == args.needNewAccountResult;
        }

        public int hashCode() {
            TransferAccount transferAccount = this.transferAccount;
            int iHashCode = (transferAccount == null ? 0 : transferAccount.hashCode()) * 31;
            WiresContext wiresContext = this.wiresContext;
            return ((iHashCode + (wiresContext != null ? wiresContext.hashCode() : 0)) * 31) + Boolean.hashCode(this.needNewAccountResult);
        }

        public String toString() {
            return "Args(transferAccount=" + this.transferAccount + ", wiresContext=" + this.wiresContext + ", needNewAccountResult=" + this.needNewAccountResult + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.transferAccount, flags);
            dest.writeSerializable(this.wiresContext);
            dest.writeInt(this.needNewAccountResult ? 1 : 0);
        }

        public Args(TransferAccount transferAccount, WiresContext wiresContext, boolean z) {
            this.transferAccount = transferAccount;
            this.wiresContext = wiresContext;
            this.needNewAccountResult = z;
        }

        public /* synthetic */ Args(TransferAccount transferAccount, WiresContext wiresContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(transferAccount, wiresContext, (i & 4) != 0 ? false : z);
        }

        public final TransferAccount getTransferAccount() {
            return this.transferAccount;
        }

        public final WiresContext getWiresContext() {
            return this.wiresContext;
        }

        public final boolean getNeedNewAccountResult() {
            return this.needNewAccountResult;
        }
    }

    /* compiled from: WireRoutingDetailsInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WireRoutingDetailsInputFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(WireRoutingDetailsInputFragment wireRoutingDetailsInputFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, wireRoutingDetailsInputFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WireRoutingDetailsInputFragment newInstance(Args args) {
            return (WireRoutingDetailsInputFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WireRoutingDetailsInputFragment wireRoutingDetailsInputFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, wireRoutingDetailsInputFragment, args);
        }
    }
}
