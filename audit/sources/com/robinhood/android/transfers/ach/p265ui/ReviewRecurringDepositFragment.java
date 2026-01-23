package com.robinhood.android.transfers.ach.p265ui;

import android.content.Context;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.p090rx.ActivityNoSnackbarErrorHandler;
import com.robinhood.android.maxonboarding.FromOnboardingCallbacks;
import com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.ReviewRecurringDepositEvent;
import com.robinhood.android.transfers.ach.p265ui.ReviewRecurringDepositFragment;
import com.robinhood.android.transfers.ach.util.ExtensionsKt;
import com.robinhood.android.transfers.ach.util.ReviewRecurringDepositLoggingUtils;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
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
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ReviewRecurringDepositFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0003>?@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020&H\u0016J\b\u0010*\u001a\u00020&H\u0016J\u001a\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0016\u00100\u001a\u00020&2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0002J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020&2\u0006\u00105\u001a\u000206H\u0002J\r\u00108\u001a\u00020&H\u0017¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020&H\u0002J\u000e\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020=R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006A²\u0006\n\u0010B\u001a\u00020CX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "getCardManager", "()Lcom/robinhood/android/common/util/CardManager;", "setCardManager", "(Lcom/robinhood/android/common/util/CardManager;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositEvent;", "onError", "error", "", "handleError", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onCreateButtonClicked", "onSuccess", "result", "Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;", "Callbacks", "Args", "Companion", "feature-legacy-ach-transfers_externalDebug", "viewState", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ReviewRecurringDepositFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public CardManager cardManager;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReviewRecurringDepositFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ReviewRecurringDepositDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof ReviewRecurringDepositFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: ReviewRecurringDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment$Callbacks;", "Lcom/robinhood/android/maxonboarding/FromOnboardingCallbacks;", "editAchRelationship", "", "onTransferInitiated", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", TransitionReason.ACH_TRANSFER_AUTOMATIC_DEPOSIT, "Lcom/robinhood/models/db/AutomaticDeposit;", "amountMoney", "Lcom/robinhood/models/util/Money;", "onTransferFailed", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends FromOnboardingCallbacks {
        void editAchRelationship();

        void onTransferFailed(AchTransfer achTransfer);

        void onTransferInitiated(AchTransfer achTransfer, AutomaticDeposit automaticDeposit, Money amountMoney);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(ReviewRecurringDepositFragment reviewRecurringDepositFragment, int i, Composer composer, int i2) {
        reviewRecurringDepositFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<ReviewRecurringDepositEvent> event) {
        EventConsumer<ReviewRecurringDepositEvent> eventConsumerInvoke;
        EventConsumer<ReviewRecurringDepositEvent> eventConsumerInvoke2;
        if ((event.getData() instanceof ReviewRecurringDepositEvent.TransferSuccess) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m19577invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m19577invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.onSuccess(((ReviewRecurringDepositEvent.TransferSuccess) event.getData()).getResult());
                }
            });
        }
        if (!(event.getData() instanceof ReviewRecurringDepositEvent.TransferFailed) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$handleEvent$$inlined$consumeIfType$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m19578invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m19578invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.onError(((ReviewRecurringDepositEvent.TransferFailed) event.getData()).getThrowable());
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

    public final CardManager getCardManager() {
        CardManager cardManager = this.cardManager;
        if (cardManager != null) {
            return cardManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardManager");
        return null;
    }

    public final void setCardManager(CardManager cardManager) {
        Intrinsics.checkNotNullParameter(cardManager, "<set-?>");
        this.cardManager = cardManager;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return super.getScreenDescription() + ", frequency: " + ((Args) INSTANCE.getArgs((Fragment) this)).getFrequency();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(null, null, getScreenDescription(), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewRecurringDepositDuxo getDuxo() {
        return (ReviewRecurringDepositDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewRecurringDepositViewState ComposeContent$lambda$2(SnapshotState4<ReviewRecurringDepositViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            ViewsKt.setMarginTop(rhToolbar, 0);
        }
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), true);
    }

    /* compiled from: ReviewRecurringDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$onViewCreated$1", m3645f = "ReviewRecurringDepositFragment.kt", m3646l = {95}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$onViewCreated$1 */
    static final class C301461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C301461(Continuation<? super C301461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewRecurringDepositFragment.this.new C301461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C301461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ReviewRecurringDepositFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ ReviewRecurringDepositFragment $tmp0;

            AnonymousClass1(ReviewRecurringDepositFragment reviewRecurringDepositFragment) {
                this.$tmp0 = reviewRecurringDepositFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, ReviewRecurringDepositFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<ReviewRecurringDepositEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C301461.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<ReviewRecurringDepositEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(ReviewRecurringDepositFragment reviewRecurringDepositFragment, Event event, Continuation continuation) {
            reviewRecurringDepositFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(ReviewRecurringDepositFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ReviewRecurringDepositFragment.this);
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
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C301461(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable error) {
        setTransitionReason("error");
        handleError(error);
        getParentFragmentManager().popBackStack();
    }

    private final void handleError(Throwable error) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        AbsErrorHandler.handleError$default(new ActivityNoSnackbarErrorHandler(fragmentActivityRequireActivity), error, false, 2, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1390422265);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1390422265, i2, -1, "com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment.ComposeContent (ReviewRecurringDepositFragment.kt:119)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-125593468, true, new C301451(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReviewRecurringDepositFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ReviewRecurringDepositFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$ComposeContent$1 */
    static final class C301451 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<ReviewRecurringDepositViewState> $viewState$delegate;

        C301451(SnapshotState4<ReviewRecurringDepositViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-125593468, i, -1, "com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment.ComposeContent.<anonymous> (ReviewRecurringDepositFragment.kt:122)");
            }
            BigDecimal amount = ((Args) ReviewRecurringDepositFragment.INSTANCE.getArgs((Fragment) ReviewRecurringDepositFragment.this)).getAmount();
            ReviewRecurringDepositViewState reviewRecurringDepositViewStateComposeContent$lambda$2 = ReviewRecurringDepositFragment.ComposeContent$lambda$2(this.$viewState$delegate);
            Resources resources = ReviewRecurringDepositFragment.this.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String achRelationshipDisplayText = reviewRecurringDepositViewStateComposeContent$lambda$2.getAchRelationshipDisplayText(resources);
            String upperCase = ReviewRecurringDepositFragment.ComposeContent$lambda$2(this.$viewState$delegate).getFrequency().name().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            ReviewRecurringDepositViewState reviewRecurringDepositViewStateComposeContent$lambda$22 = ReviewRecurringDepositFragment.ComposeContent$lambda$2(this.$viewState$delegate);
            Resources resources2 = ReviewRecurringDepositFragment.this.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            String recurringDepositReviewFrequencyDisclosure = reviewRecurringDepositViewStateComposeContent$lambda$22.getRecurringDepositReviewFrequencyDisclosure(resources2);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(ReviewRecurringDepositFragment.this);
            final ReviewRecurringDepositFragment reviewRecurringDepositFragment = ReviewRecurringDepositFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReviewRecurringDepositFragment.C301451.invoke$lambda$1$lambda$0(reviewRecurringDepositFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(ReviewRecurringDepositFragment.this);
            final ReviewRecurringDepositFragment reviewRecurringDepositFragment2 = ReviewRecurringDepositFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReviewRecurringDepositFragment.C301451.invoke$lambda$3$lambda$2(reviewRecurringDepositFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(ReviewRecurringDepositFragment.this);
            final ReviewRecurringDepositFragment reviewRecurringDepositFragment3 = ReviewRecurringDepositFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReviewRecurringDepositFragment.C301451.invoke$lambda$5$lambda$4(reviewRecurringDepositFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            ReviewRecurringDepositComposable4.ReviewRecurringDepositComposable(amount, achRelationshipDisplayText, upperCase, recurringDepositReviewFrequencyDisclosure, function0, function02, (Function0) objRememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ReviewRecurringDepositFragment reviewRecurringDepositFragment) {
            reviewRecurringDepositFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(ReviewRecurringDepositFragment reviewRecurringDepositFragment) {
            reviewRecurringDepositFragment.onCreateButtonClicked();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(ReviewRecurringDepositFragment reviewRecurringDepositFragment) {
            reviewRecurringDepositFragment.getCallbacks().editAchRelationship();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCreateButtonClicked() {
        ReviewRecurringDepositLoggingUtils.logOnReview(this, ((Args) INSTANCE.getArgs((Fragment) this)).getAmount());
        ReviewRecurringDepositDuxo duxo = getDuxo();
        String string2 = ExtensionsKt.getSessionId(this).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        duxo.submitTransfer(string2);
    }

    public final void onSuccess(BaseReviewAchTransferFragment.AchTransferResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        getCardManager().invalidateCardsBestEffort();
        setTransitionReason("success");
        Money money = Money3.toMoney(((Args) INSTANCE.getArgs((Fragment) this)).getAmount(), Currencies.USD);
        if (result.getAchTransfer() != null) {
            if (Intrinsics.areEqual(result.getAchTransfer().getState().getIsSuccessful(), Boolean.FALSE)) {
                getCallbacks().onTransferFailed(result.getAchTransfer());
                return;
            } else {
                getCallbacks().onTransferInitiated(result.getAchTransfer(), result.getAutomaticDeposit(), money);
                return;
            }
        }
        if (result.getAutomaticDeposit() != null) {
            getCallbacks().onTransferInitiated(null, result.getAutomaticDeposit(), money);
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("achTransfer and automaticDeposit are both null"), true, null, 4, null);
            getCallbacks().onTransferFailed(null);
        }
    }

    /* compiled from: ReviewRecurringDepositFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment$Args;", "Landroid/os/Parcelable;", "transferContext", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "amount", "Ljava/math/BigDecimal;", "achRelationshipId", "Ljava/util/UUID;", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "maxEarlyAccessAmount", "unclearedDeposits", "<init>", "(Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;Ljava/math/BigDecimal;Ljava/util/UUID;Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getTransferContext", "()Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "getAmount", "()Ljava/math/BigDecimal;", "getAchRelationshipId", "()Ljava/util/UUID;", "getFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "getMaxEarlyAccessAmount", "getUnclearedDeposits", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID achRelationshipId;
        private final BigDecimal amount;
        private final ApiAutomaticDeposit.Frequency frequency;
        private final BigDecimal maxEarlyAccessAmount;
        private final TransferContext transferContext;
        private final BigDecimal unclearedDeposits;

        /* compiled from: ReviewRecurringDepositFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((TransferContext) parcel.readParcelable(Args.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable(), ApiAutomaticDeposit.Frequency.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
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
            dest.writeParcelable(this.transferContext, flags);
            dest.writeSerializable(this.amount);
            dest.writeSerializable(this.achRelationshipId);
            dest.writeString(this.frequency.name());
            dest.writeSerializable(this.maxEarlyAccessAmount);
            dest.writeSerializable(this.unclearedDeposits);
        }

        public Args(TransferContext transferContext, BigDecimal amount, UUID achRelationshipId, ApiAutomaticDeposit.Frequency frequency, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Intrinsics.checkNotNullParameter(transferContext, "transferContext");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(frequency, "frequency");
            this.transferContext = transferContext;
            this.amount = amount;
            this.achRelationshipId = achRelationshipId;
            this.frequency = frequency;
            this.maxEarlyAccessAmount = bigDecimal;
            this.unclearedDeposits = bigDecimal2;
        }

        public final TransferContext getTransferContext() {
            return this.transferContext;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final UUID getAchRelationshipId() {
            return this.achRelationshipId;
        }

        public final ApiAutomaticDeposit.Frequency getFrequency() {
            return this.frequency;
        }

        public final BigDecimal getMaxEarlyAccessAmount() {
            return this.maxEarlyAccessAmount;
        }

        public final BigDecimal getUnclearedDeposits() {
            return this.unclearedDeposits;
        }
    }

    /* compiled from: ReviewRecurringDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ReviewRecurringDepositFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ReviewRecurringDepositFragment reviewRecurringDepositFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, reviewRecurringDepositFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReviewRecurringDepositFragment newInstance(Args args) {
            return (ReviewRecurringDepositFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReviewRecurringDepositFragment reviewRecurringDepositFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, reviewRecurringDepositFragment, args);
        }
    }
}
