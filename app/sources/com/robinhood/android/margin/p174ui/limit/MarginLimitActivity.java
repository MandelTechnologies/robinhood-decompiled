package com.robinhood.android.margin.p174ui.limit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.databinding.ActivityFragmentContainerWithRdsLoadingViewBinding;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.lib.margin.SetMarginLimitActivityResult;
import com.robinhood.android.margin.C20999R;
import com.robinhood.android.margin.contracts.BuyingPowerHubIntentKey;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.margin.contracts.MarginLimitActivityKey;
import com.robinhood.android.margin.p174ui.limit.MarginLimitActivityEvent;
import com.robinhood.android.margin.p174ui.limit.MarginLimitFragment;
import com.robinhood.android.margin.p174ui.limit.MarginLimitSubmissionFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.time.annotation.ElapsedRealtime;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: MarginLimitActivity.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001DB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\u0005J\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0005J\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0014J\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0005J\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u0005R\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010B¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitSubmissionFragment$Callbacks;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitFragment$Callbacks;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent;", "event", "handleEvent", "(Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent;)V", "Lcom/robinhood/models/util/Money;", "marginLimit", "onMarginLimitConfirmed", "(Lcom/robinhood/models/util/Money;)V", "onMarginLimitSuccess", "", "throwable", "onMarginLimitFailed", "(Ljava/lang/Throwable;)V", "showZeroMarginDialog", "currentGoldUsed", "showBelowCurrentMarginUse", "showAboveGoldBuyingPower", "viewAccountDeficitAction", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "Lcom/robinhood/rosetta/eventlogging/Screen;", "analyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "j$/time/Instant", "screenAppearTime", "Lj$/time/Instant;", "Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBindings", "()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "bindings", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityDuxo;", "duxo", "Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "loadingView$delegate", "getLoadingView", "()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "loadingView", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginLimitActivity extends BaseActivity implements MarginLimitSubmissionFragment.Callbacks, MarginLimitFragment.Callbacks {
    private static final String DIALOG_ABOVE_BUYING_POWER = "above-buying-power";
    private static final String DIALOG_BELOW_MARGIN_USE = "below-margin-use";
    private static final String DIALOG_ZERO_MARGIN = "zero-margin";
    private final Screen analyticsScreen;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    @ElapsedRealtime
    public Clock clock;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Lazy loadingView;
    private Instant screenAppearTime;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginLimitActivity.class, "bindings", "getBindings()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MarginLimitActivity() {
        super(C11839R.layout.activity_fragment_container_with_rds_loading_view);
        this.analyticsScreen = new Screen(Screen.Name.MARGIN_LIMIT_EDIT, null, null, null, 14, null);
        this.bindings = ViewBinding5.viewBinding(this, MarginLimitActivity2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, MarginLimitActivityDuxo.class);
        this.loadingView = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginLimitActivity.loadingView_delegate$lambda$0(this.f$0);
            }
        });
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

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
    }

    private final ActivityFragmentContainerWithRdsLoadingViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerWithRdsLoadingViewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginLimitActivityDuxo getDuxo() {
        return (MarginLimitActivityDuxo) this.duxo.getValue();
    }

    private final ShimmerLoadingView getLoadingView() {
        return (ShimmerLoadingView) this.loadingView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShimmerLoadingView loadingView_delegate$lambda$0(MarginLimitActivity marginLimitActivity) {
        return marginLimitActivity.getBindings().rdsLoadingView;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(AchromaticOverlay.INSTANCE, Boolean.FALSE);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(getLoadingView(), InsetSides.INSTANCE.m26683getTopXedK2Rk());
        BaseActivity.collectDuxoState$default(this, null, new C210801(null), 1, null);
    }

    /* compiled from: MarginLimitActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitActivity$onCreate$1", m3645f = "MarginLimitActivity.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitActivity$onCreate$1 */
    static final class C210801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C210801(Continuation<? super C210801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginLimitActivity.this.new C210801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C210801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginLimitActivity.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitActivity$onCreate$1$1", m3645f = "MarginLimitActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<MarginLimitActivityEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MarginLimitActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MarginLimitActivity marginLimitActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = marginLimitActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<MarginLimitActivityEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                final MarginLimitActivity marginLimitActivity = this.this$0;
                if ((event.getData() instanceof MarginLimitActivityEvent) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitActivity$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m16200invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m16200invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            marginLimitActivity.handleEvent((MarginLimitActivityEvent) event.getData());
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(MarginLimitActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarginLimitActivity.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.screenAppearTime = Instant.now(getClock());
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, this.analyticsScreen, null, null, null, 29, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        long millis;
        Instant instant = this.screenAppearTime;
        if (instant != null) {
            Instant instantNow = Instant.now(getClock());
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Duration durationBetween = Duration.between(instant, instantNow);
            Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
            millis = durationBetween.toMillis();
        } else {
            millis = 0;
        }
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, this.analyticsScreen, null, null, new Context(0, 0, 0, null, null, null, null, null, (int) millis, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), 13, null);
        super.onStop();
    }

    public final void handleEvent(MarginLimitActivityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof MarginLimitActivityEvent.Loading) {
            getLoadingView().show();
            return;
        }
        if (event instanceof MarginLimitActivityEvent.Loaded) {
            getLoadingView().hide();
            MarginLimitActivityEvent.Loaded loaded = (MarginLimitActivityEvent.Loaded) event;
            setFragment(C11048R.id.fragment_container, MarginLimitFragment.INSTANCE.newInstance((Parcelable) new MarginLimitFragment.Args(loaded.getMarginInvestingInfo(), ((MarginLimitActivityKey) INSTANCE.getExtras((Activity) this)).getForceShowRemoveLimitButton(), loaded.getUserLocale())));
        } else if (event instanceof MarginLimitActivityEvent.RedirectToOnboarding) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new EnableMarginInvestingKey(((MarginLimitActivityEvent.RedirectToOnboarding) event).getAccountNumber(), ((MarginLimitActivityKey) INSTANCE.getExtras((Activity) this)).getSourceScreenIdentifier(), null, false, false, 28, null), null, false, null, null, 60, null);
            finish();
        } else {
            if (!(event instanceof MarginLimitActivityEvent.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((MarginLimitActivityEvent.Error) event).getThrowable(), false, 2, null);
        }
    }

    @Override // com.robinhood.android.margin.ui.limit.MarginLimitFragment.Callbacks
    public void onMarginLimitConfirmed(Money marginLimit) {
        if (((MarginLimitActivityKey) INSTANCE.getExtras((Activity) this)).getSubmitOnConfirmation()) {
            String accountNumber = getDuxo().getStateFlow().getValue().getAccountNumber();
            MarginLimitSubmissionFragment.Companion companion = MarginLimitSubmissionFragment.INSTANCE;
            if (accountNumber != null) {
                replaceFragment(companion.newFragment(accountNumber, marginLimit));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        onMarginLimitSuccess(marginLimit);
    }

    @Override // com.robinhood.android.margin.ui.limit.MarginLimitSubmissionFragment.Callbacks
    public void onMarginLimitSuccess(Money marginLimit) {
        Intent intent = new Intent();
        intent.putExtra(ReturnedData.EXTRA_RETURNED_DATA, new ReturnedData.SetMarginLimit(marginLimit));
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        NavigationActivityResultContract3.setResult(this, SetMarginLimitActivityResult.Complete.INSTANCE);
        finish();
    }

    @Override // com.robinhood.android.margin.ui.limit.MarginLimitSubmissionFragment.Callbacks
    public void onMarginLimitFailed(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!AbsErrorHandler.handleError$default(getActivityErrorHandler(), throwable, false, 2, null)) {
            throw throwable;
        }
        NavigationActivityResultContract3.setResult(this, SetMarginLimitActivityResult.Canceled.INSTANCE);
        popLastFragment();
    }

    public final void showZeroMarginDialog() {
        RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(this).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C20999R.string.margin_limit_zero_error, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, supportFragmentManager, DIALOG_ZERO_MARGIN, false, 4, null);
    }

    public final void showBelowCurrentMarginUse(Money currentGoldUsed) {
        Intrinsics.checkNotNullParameter(currentGoldUsed, "currentGoldUsed");
        RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(this).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C20999R.string.margin_lower_limit_error, Money.format$default(currentGoldUsed, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, supportFragmentManager, DIALOG_BELOW_MARGIN_USE, false, 4, null);
    }

    public final void showAboveGoldBuyingPower() {
        RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(this).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C20999R.string.margin_upper_limit_error, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, supportFragmentManager, DIALOG_ABOVE_BUYING_POWER, false, 4, null);
    }

    public final void viewAccountDeficitAction() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new BuyingPowerHubIntentKey(null, "set-margin-limit", null, 5, null), null, false, null, null, 60, null);
    }

    /* compiled from: MarginLimitActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivity;", "Lcom/robinhood/android/margin/contracts/MarginLimitActivityKey;", "<init>", "()V", "DIALOG_ZERO_MARGIN", "", "DIALOG_BELOW_MARGIN_USE", "DIALOG_ABOVE_BUYING_POWER", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<MarginLimitActivity, MarginLimitActivityKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public MarginLimitActivityKey getExtras(MarginLimitActivity marginLimitActivity) {
            return (MarginLimitActivityKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, marginLimitActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, MarginLimitActivityKey marginLimitActivityKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, marginLimitActivityKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, MarginLimitActivityKey marginLimitActivityKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, marginLimitActivityKey);
        }
    }
}
