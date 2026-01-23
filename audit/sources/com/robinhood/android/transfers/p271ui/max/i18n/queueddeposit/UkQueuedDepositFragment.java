package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import android.content.Context;
import android.os.Build;
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
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.banking.util.ShowFxExchangeRateBottomSheet;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.teller.C29296R;
import com.robinhood.android.teller.TellerErrorAction;
import com.robinhood.android.teller.TellerErrorHandler;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositEvent;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositFragment;
import com.robinhood.android.truelayer.TrueLayerSession;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.QueuedDepositContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Either2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
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

/* compiled from: UkQueuedDepositFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003HIJB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u00020,2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u00104\u001a\u00020,2\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000208H\u0016J\r\u00109\u001a\u00020,H\u0017¢\u0006\u0002\u0010:J\u0016\u0010;\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002J\u001a\u0010?\u001a\u0002082\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u000103H\u0016J\u001a\u0010C\u001a\u0002082\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u000103H\u0016J\u001a\u0010D\u001a\u00020,2\b\u0010E\u001a\u0004\u0018\u0001032\u0006\u0010F\u001a\u00020GH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\"\u0010#R!\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b(\u0010)¨\u0006K²\u0006\n\u0010L\u001a\u00020MX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "setTargetBackend", "(Lcom/robinhood/targetbackend/TargetBackend;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "callbacks", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "trueLayerSession", "Lcom/robinhood/android/truelayer/TrueLayerSession;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "tellerErrorHandler", "Lcom/robinhood/android/teller/TellerErrorHandler;", "", "getTellerErrorHandler", "()Lcom/robinhood/android/teller/TellerErrorHandler;", "tellerErrorHandler$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "handleTellerErrorAction", "args", "key", "", "Callbacks", "Args", "Companion", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class UkQueuedDepositFragment extends GenericComposeFragment implements AutoLoggableFragment, RhDialogFragment.OnClickListener {
    public TargetBackend targetBackend;
    private TrueLayerSession trueLayerSession;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UkQueuedDepositFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof UkQueuedDepositFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, UkQueuedDepositDuxo.class);

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UkQueuedDepositFragment.eventScreen_delegate$lambda$0();
        }
    });

    /* renamed from: tellerErrorHandler$delegate, reason: from kotlin metadata */
    private final Lazy tellerErrorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UkQueuedDepositFragment.tellerErrorHandler_delegate$lambda$1(this.f$0);
        }
    });

    /* compiled from: UkQueuedDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment$Callbacks;", "", "onMandateAuthorized", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "postTransferPage", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "onStandardDepositCreated", "response", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "onFlowCompleted", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFlowCompleted();

        void onMandateAuthorized(com.robinhood.rosetta.eventlogging.Context eventContext, UiPostTransferPage.UkQueuedDeposit postTransferPage);

        void onStandardDepositCreated(ApiCreateTransferResponse response);
    }

    /* compiled from: UkQueuedDepositFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TellerErrorAction.values().length];
            try {
                iArr[TellerErrorAction.DISMISS_ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TellerErrorAction.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TellerErrorAction.EXIT_FLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10(UkQueuedDepositFragment ukQueuedDepositFragment, int i, Composer composer, int i2) {
        ukQueuedDepositFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<UkQueuedDepositEvent> event) {
        EventConsumer<UkQueuedDepositEvent> eventConsumerInvoke;
        EventConsumer<UkQueuedDepositEvent> eventConsumerInvoke2;
        EventConsumer<UkQueuedDepositEvent> eventConsumerInvoke3;
        EventConsumer<UkQueuedDepositEvent> eventConsumerInvoke4;
        EventConsumer<UkQueuedDepositEvent> eventConsumerInvoke5;
        EventConsumer<UkQueuedDepositEvent> eventConsumerInvoke6;
        if ((event.getData() instanceof UkQueuedDepositEvent.ProcessTrueLayerMandate) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19881invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19881invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    UkQueuedDepositEvent.ProcessTrueLayerMandate processTrueLayerMandate = (UkQueuedDepositEvent.ProcessTrueLayerMandate) event.getData();
                    String mandateId = processTrueLayerMandate.getMandateId();
                    String resourceToken = processTrueLayerMandate.getResourceToken();
                    TrueLayerSession trueLayerSession = this.trueLayerSession;
                    if (trueLayerSession == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("trueLayerSession");
                        trueLayerSession = null;
                    }
                    trueLayerSession.startAndListenToNewTrueLayerSession(mandateId, resourceToken, "https://applink.robinhood.com/truelayer_redirect", true);
                }
            });
        }
        if ((event.getData() instanceof UkQueuedDepositEvent.TrueLayerMandateAuthorized) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19882invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19882invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    UkQueuedDepositEvent.TrueLayerMandateAuthorized trueLayerMandateAuthorized = (UkQueuedDepositEvent.TrueLayerMandateAuthorized) event.getData();
                    this.getCallbacks().onMandateAuthorized(trueLayerMandateAuthorized.getEventContext(), trueLayerMandateAuthorized.getPostTransferPage());
                }
            });
        }
        if ((event.getData() instanceof UkQueuedDepositEvent.TrueLayerMandateNotAuthorized) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19883invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19883invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    UkQueuedDepositDuxo.logDialogEvent$default(this.getDuxo(), null, UserInteractionEventData.EventType.APPEAR, "mandate_not_authorized", 1, null);
                    RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C30065R.id.dialog_id_uk_queued_deposit_not_authorized).setTitle(C30065R.string.uk_queued_deposit_not_authorized_title, new Object[0]).setMessage(C30065R.string.uk_queued_deposit_not_authorized_message, new Object[0]).setPositiveButton(C30065R.string.uk_queued_deposit_not_authorized_primary_cta, new Object[0]).setNegativeButton(C30065R.string.uk_queued_deposit_skip_for_now, new Object[0]);
                    FragmentManager childFragmentManager = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "uk_queued_deposit_not_authorized", false, 4, null);
                }
            });
        }
        if ((event.getData() instanceof UkQueuedDepositEvent.TrueLayerMandateFailed) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19884invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19884invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    UkQueuedDepositDuxo.logDialogEvent$default(this.getDuxo(), null, UserInteractionEventData.EventType.APPEAR, "mandate_failed", 1, null);
                    RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    RhDialogFragment.Builder cancelable = companion.create(contextRequireContext).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C30065R.id.dialog_id_uk_queued_deposit_failed).setTitle(C30065R.string.uk_queued_deposit_failed_title, new Object[0]).setMessage(C30065R.string.uk_queued_deposit_failed_message, new Object[0]).setPositiveButton(C30065R.string.uk_queued_deposit_skip_for_now, new Object[0]).setCancelable(false);
                    FragmentManager childFragmentManager = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(cancelable, childFragmentManager, "uk_queued_deposit_not_authorized", false, 4, null);
                }
            });
        }
        if ((event.getData() instanceof UkQueuedDepositEvent.NavigateAfterStandardDepositCreation) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$handleEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19885invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19885invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().onStandardDepositCreated(((UkQueuedDepositEvent.NavigateAfterStandardDepositCreation) event.getData()).getResponse());
                }
            });
        }
        if (!(event.getData() instanceof UkQueuedDepositEvent.Error) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$handleEvent$$inlined$consumeIfType$6
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m19886invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19886invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbsErrorHandler.handleError$default(this.getTellerErrorHandler(), ((UkQueuedDepositEvent.Error) event.getData()).getThrowable(), false, 2, null);
            }
        });
    }

    private final void handleTellerErrorAction(Bundle args, String key) {
        Object serializable;
        int i;
        if (args != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                serializable = args.getSerializable(key, TellerErrorAction.class);
            } else {
                Object serializable2 = args.getSerializable(key);
                if (!(serializable2 instanceof TellerErrorAction)) {
                    serializable2 = null;
                }
                serializable = (TellerErrorAction) serializable2;
            }
            TellerErrorAction tellerErrorAction = (TellerErrorAction) serializable;
            if (tellerErrorAction == null || (i = WhenMappings.$EnumSwitchMapping$0[tellerErrorAction.ordinal()]) == 1 || i == 2) {
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            getUserLeapManager().setPendingSurvey(Survey.UK_ABANDON_QUEUED_DEPOSIT_FLOW);
            getCallbacks().onFlowCompleted();
        }
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

    public final TargetBackend getTargetBackend() {
        TargetBackend targetBackend = this.targetBackend;
        if (targetBackend != null) {
            return targetBackend;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetBackend");
        return null;
    }

    public final void setTargetBackend(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "<set-?>");
        this.targetBackend = targetBackend;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UkQueuedDepositDuxo getDuxo() {
        return (UkQueuedDepositDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.CREATE_QUEUED_DEPOSIT, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TellerErrorHandler<Object> getTellerErrorHandler() {
        return (TellerErrorHandler) this.tellerErrorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TellerErrorHandler tellerErrorHandler_delegate$lambda$1(UkQueuedDepositFragment ukQueuedDepositFragment) {
        FragmentActivity fragmentActivityRequireActivity = ukQueuedDepositFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new TellerErrorHandler(fragmentActivityRequireActivity, true, 0, null, 12, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.trueLayerSession = new TrueLayerSession(Either2.asLeft(this), getTargetBackend());
    }

    private static final UkQueuedDepositViewState ComposeContent$lambda$2(SnapshotState4<UkQueuedDepositViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C308461(null), 1, null);
    }

    /* compiled from: UkQueuedDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$onViewCreated$1", m3645f = "UkQueuedDepositFragment.kt", m3646l = {95}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$onViewCreated$1 */
    static final class C308461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308461(Continuation<? super C308461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkQueuedDepositFragment.this.new C308461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UkQueuedDepositFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ UkQueuedDepositFragment $tmp0;

            AnonymousClass1(UkQueuedDepositFragment ukQueuedDepositFragment) {
                this.$tmp0 = ukQueuedDepositFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, UkQueuedDepositFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<UkQueuedDepositEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C308461.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<UkQueuedDepositEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(UkQueuedDepositFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UkQueuedDepositFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(UkQueuedDepositFragment ukQueuedDepositFragment, Event event, Continuation continuation) {
            ukQueuedDepositFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        UkQueuedDepositActivity2.configureToolbarForOnboarding(this, toolbar);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getUserLeapManager().setPendingSurvey(Survey.UK_ABANDON_QUEUED_DEPOSIT_FLOW);
        return super.onBackPressed();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1092300164);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1092300164, i2, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment.ComposeContent (UkQueuedDepositFragment.kt:109)");
            }
            UkQueuedDepositViewState ukQueuedDepositViewStateComposeContent$lambda$2 = ComposeContent$lambda$2(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            Screen eventScreen = getEventScreen();
            UkQueuedDepositDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new UkQueuedDepositFragment2(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            UkQueuedDepositDuxo duxo2 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new UkQueuedDepositFragment3(duxo2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            UkQueuedDepositDuxo duxo3 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new UkQueuedDepositFragment4(duxo3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            UkQueuedDepositDuxo duxo4 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo4);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new UkQueuedDepositFragment5(duxo4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            KFunction kFunction4 = (KFunction) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            UkQueuedDepositDuxo duxo5 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(duxo5);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new UkQueuedDepositFragment6(duxo5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            KFunction kFunction5 = (KFunction) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) kFunction;
            Function0 function02 = (Function0) kFunction3;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UkQueuedDepositFragment.ComposeContent$lambda$9$lambda$8(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            UkQueuedDepositComposable.UkQueuedDepositScreen(eventScreen, ukQueuedDepositViewStateComposeContent$lambda$2, function0, function02, (Function0) objRememberedValue6, (Function0) kFunction5, (Function0) kFunction4, null, (Function1) kFunction2, composerStartRestartGroup, 0, 128);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkQueuedDepositFragment.ComposeContent$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9$lambda$8(UkQueuedDepositFragment ukQueuedDepositFragment) {
        ShowFxExchangeRateBottomSheet.showFxExchangeRateBottomSheet(ukQueuedDepositFragment, ukQueuedDepositFragment.getEventScreen());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30065R.id.dialog_id_uk_queued_deposit_not_authorized) {
            getDuxo().logDialogEvent(UserInteractionEventData.Action.CONTINUE, UserInteractionEventData.EventType.TAP, "mandate_not_authorized");
            getDuxo().handleSubmitClick();
            return true;
        }
        if (id == C30065R.id.dialog_id_uk_queued_deposit_failed) {
            getDuxo().logDialogEvent(UserInteractionEventData.Action.SKIP, UserInteractionEventData.EventType.TAP, "mandate_failed");
            getUserLeapManager().setPendingSurvey(Survey.UK_ABANDON_QUEUED_DEPOSIT_FLOW);
            getCallbacks().onFlowCompleted();
            return true;
        }
        if (id == C29296R.id.dialog_id_teller_error) {
            handleTellerErrorAction(passthroughArgs, TellerErrorHandler.PRIMARY_BUTTON_ACTION_KEY);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C30065R.id.dialog_id_uk_queued_deposit_not_authorized) {
            getDuxo().logDialogEvent(UserInteractionEventData.Action.SKIP, UserInteractionEventData.EventType.TAP, "mandate_not_authorized");
            getUserLeapManager().setPendingSurvey(Survey.UK_ABANDON_QUEUED_DEPOSIT_FLOW);
            getCallbacks().onFlowCompleted();
            return true;
        }
        if (id == C29296R.id.dialog_id_teller_error) {
            handleTellerErrorAction(passthroughArgs, TellerErrorHandler.SECONDARY_BUTTON_ACTION_KEY);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* compiled from: UkQueuedDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment$Args;", "Landroid/os/Parcelable;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;)V", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/QueuedDepositContext$EntryPoint;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final QueuedDepositContext.EntryPoint entryPoint;

        /* compiled from: UkQueuedDepositFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(QueuedDepositContext.EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.entryPoint.name());
        }

        public Args(QueuedDepositContext.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.entryPoint = entryPoint;
        }

        public final QueuedDepositContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: UkQueuedDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UkQueuedDepositFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(UkQueuedDepositFragment ukQueuedDepositFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, ukQueuedDepositFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UkQueuedDepositFragment newInstance(Args args) {
            return (UkQueuedDepositFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UkQueuedDepositFragment ukQueuedDepositFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, ukQueuedDepositFragment, args);
        }
    }
}
