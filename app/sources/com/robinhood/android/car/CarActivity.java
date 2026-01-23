package com.robinhood.android.car;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.car.CarDuxo;
import com.robinhood.android.car.CarSplashFragment;
import com.robinhood.android.car.result.CarResultFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.contracts.CarContract;
import com.robinhood.android.common.contracts.CarIntentKey;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.regiongate.CarRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.shared.questionnaire.contracts.Questionnaire;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireContract;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireContract2;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireProgressBarData;
import java.util.Set;
import kotlin.Lazy;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CarActivity.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001(B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0002J\t\u0010!\u001a\u00020\"H\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/car/CarActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/car/CarSplashFragment$CallbackListener;", "Lcom/robinhood/android/car/result/CarResultFragment$CallbackListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/car/CarDuxo;", "getDuxo", "()Lcom/robinhood/android/car/CarDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "questionnaireLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/questionnaire/contracts/Questionnaire;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "startQuestionnaire", "accountNumber", "", "context", "onContinue", "pass", "fail", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "cancel", "error", "err", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CarActivity extends BaseActivity implements RegionGated, CarSplashFragment.CallbackListener, CarResultFragment.CallbackListener {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Questionnaire>> questionnaireLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CarActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(CarRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, CarDuxo.class);
        this.questionnaireLauncher = registerForActivityResult(new QuestionnaireContract(new Function0() { // from class: com.robinhood.android.car.CarActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.car.CarActivity$questionnaireLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(QuestionnaireContract2 questionnaireContract2) {
                if (questionnaireContract2 instanceof QuestionnaireContract2.Completed) {
                    this.this$0.replaceFragmentWithoutAnimationAndBackStack(CarLoadingFragment.Companion.newInstance());
                    this.this$0.getDuxo().evaluateAnswers();
                } else if (questionnaireContract2 instanceof QuestionnaireContract2.Canceled) {
                    this.this$0.cancel();
                } else if (questionnaireContract2 instanceof QuestionnaireContract2.Error) {
                    this.this$0.error(((QuestionnaireContract2.Error) questionnaireContract2).getError());
                } else if (questionnaireContract2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CarDuxo getDuxo() {
        return (CarDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        initEdgeToEdge(false);
        super.onCreate(savedInstanceState);
        BaseActivity.collectDuxoState$default(this, null, new C99351(null), 1, null);
        if (savedInstanceState == null) {
            replaceFragmentWithoutBackStack(CarSplashFragment.INSTANCE.newInstance());
        }
    }

    /* compiled from: CarActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.car.CarActivity$onCreate$1", m3645f = "CarActivity.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.car.CarActivity$onCreate$1 */
    static final class C99351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C99351(Continuation<? super C99351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CarActivity.this.new C99351(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C99351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CarActivity.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/car/CarDuxo$Event;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.car.CarActivity$onCreate$1$1", m3645f = "CarActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.car.CarActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<CarDuxo.Event>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CarActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CarActivity carActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = carActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<CarDuxo.Event> event, Continuation<? super Unit> continuation) {
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
                if (event != null) {
                    final CarActivity carActivity = this.this$0;
                    if ((event.getData() instanceof CarDuxo.Event) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.car.CarActivity$onCreate$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11466invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11466invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CarDuxo.Event event2 = (CarDuxo.Event) event.getData();
                                if (event2 instanceof CarDuxo.Event.QuestionnaireRequested) {
                                    CarDuxo.Event.QuestionnaireRequested questionnaireRequested = (CarDuxo.Event.QuestionnaireRequested) event2;
                                    carActivity.startQuestionnaire(questionnaireRequested.getAccountNumber(), questionnaireRequested.getContext());
                                } else if (event2 instanceof CarDuxo.Event.AnswersEvaluated) {
                                    carActivity.replaceFragmentWithoutAnimationAndBackStack(CarResultFragment.INSTANCE.newInstance((Parcelable) new CarResultFragment.Args(((CarDuxo.Event.AnswersEvaluated) event2).getPassed())));
                                } else {
                                    if (!(event2 instanceof CarDuxo.Event.Error)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    AbsErrorHandler.handleError$default(carActivity.getActivityErrorHandler(), ((CarDuxo.Event.Error) event2).getError(), false, 2, null);
                                }
                            }
                        });
                    }
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
                StateFlow<Event<CarDuxo.Event>> eventFlow = CarActivity.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CarActivity.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void startQuestionnaire(String accountNumber, String context) {
        this.questionnaireLauncher.launch(new NavigationActivityResultContract.NavigationParams<>(new Questionnaire(false, context, accountNumber, null, null, null, false, true, true, false, false, null, null, true, true, false, false, false, new QuestionnaireProgressBarData(C9942R.string.questionnaire_toolbar_title, 0, 1), null, 761464, null), null, false, 6, null));
    }

    @Override // com.robinhood.android.car.CarSplashFragment.CallbackListener
    public void onContinue() {
        getDuxo().requestQuestionnaire(QuestionnaireContexts.CAR_SUITABILITY);
    }

    @Override // com.robinhood.android.car.result.CarResultFragment.CallbackListener
    public void pass() {
        NavigationActivityResultContract3.setResult(this, new CarContract.Result.Completed(true));
        finish();
    }

    @Override // com.robinhood.android.car.result.CarResultFragment.CallbackListener
    public void fail() {
        NavigationActivityResultContract3.setResult(this, new CarContract.Result.Completed(false));
        finish();
    }

    @Override // com.robinhood.android.car.result.CarResultFragment.CallbackListener
    public void retry() {
        getDuxo().requestQuestionnaire(QuestionnaireContexts.CAR_SUITABILITY_RETRY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancel() {
        NavigationActivityResultContract3.setResult(this, CarContract.Result.Cancelled.INSTANCE);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void error(Throwable err) {
        NavigationActivityResultContract3.setResult(this, new CarContract.Result.Error(err));
        finish();
    }

    /* compiled from: CarActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/car/CarActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/car/CarActivity;", "Lcom/robinhood/android/common/contracts/CarIntentKey;", "<init>", "()V", "feature-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CarActivity, CarIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CarIntentKey getExtras(CarActivity carActivity) {
            return (CarIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, carActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CarIntentKey carIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, carIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CarIntentKey carIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, carIntentKey);
        }
    }
}
