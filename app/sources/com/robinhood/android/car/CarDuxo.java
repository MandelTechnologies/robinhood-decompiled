package com.robinhood.android.car;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.car.api.ApiCarEligibility;
import com.robinhood.android.car.api.CarEligibilityApi;
import com.robinhood.android.common.contracts.CarIntentKey;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.utils.Optional;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: CarDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u001b\u001cB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0011\u001a\u00020\u00022\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013H\u0082@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/car/CarDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/car/CarDuxo$Event;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "carEligibilityApi", "Lcom/robinhood/android/car/api/CarEligibilityApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/car/api/CarEligibilityApi;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "withAccountNumber", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestQuestionnaire", "context", "evaluateAnswers", "Event", "Companion", "feature-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CarDuxo extends BaseDuxo5<Unit, Event> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final CarEligibilityApi carEligibilityApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CarDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.car.CarDuxo", m3645f = "CarDuxo.kt", m3646l = {70, 41}, m3647m = "withAccountNumber")
    /* renamed from: com.robinhood.android.car.CarDuxo$withAccountNumber$1 */
    static final class C99381 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C99381(Continuation<? super C99381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CarDuxo.this.withAccountNumber(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarDuxo(AccountProvider accountProvider, CarEligibilityApi carEligibilityApi, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(carEligibilityApi, "carEligibilityApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.carEligibilityApi = carEligibilityApi;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: CarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/car/CarDuxo$Event;", "", "QuestionnaireRequested", "AnswersEvaluated", "Error", "Lcom/robinhood/android/car/CarDuxo$Event$AnswersEvaluated;", "Lcom/robinhood/android/car/CarDuxo$Event$Error;", "Lcom/robinhood/android/car/CarDuxo$Event$QuestionnaireRequested;", "feature-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Event {

        /* compiled from: CarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/car/CarDuxo$Event$QuestionnaireRequested;", "Lcom/robinhood/android/car/CarDuxo$Event;", "accountNumber", "", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getContext", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuestionnaireRequested implements Event {
            public static final int $stable = 0;
            private final String accountNumber;
            private final String context;

            public static /* synthetic */ QuestionnaireRequested copy$default(QuestionnaireRequested questionnaireRequested, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = questionnaireRequested.accountNumber;
                }
                if ((i & 2) != 0) {
                    str2 = questionnaireRequested.context;
                }
                return questionnaireRequested.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            public final QuestionnaireRequested copy(String accountNumber, String context) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(context, "context");
                return new QuestionnaireRequested(accountNumber, context);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuestionnaireRequested)) {
                    return false;
                }
                QuestionnaireRequested questionnaireRequested = (QuestionnaireRequested) other;
                return Intrinsics.areEqual(this.accountNumber, questionnaireRequested.accountNumber) && Intrinsics.areEqual(this.context, questionnaireRequested.context);
            }

            public int hashCode() {
                return (this.accountNumber.hashCode() * 31) + this.context.hashCode();
            }

            public String toString() {
                return "QuestionnaireRequested(accountNumber=" + this.accountNumber + ", context=" + this.context + ")";
            }

            public QuestionnaireRequested(String accountNumber, String context) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(context, "context");
                this.accountNumber = accountNumber;
                this.context = context;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final String getContext() {
                return this.context;
            }
        }

        /* compiled from: CarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/car/CarDuxo$Event$AnswersEvaluated;", "Lcom/robinhood/android/car/CarDuxo$Event;", "passed", "", "<init>", "(Z)V", "getPassed", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AnswersEvaluated implements Event {
            public static final int $stable = 0;
            private final boolean passed;

            public static /* synthetic */ AnswersEvaluated copy$default(AnswersEvaluated answersEvaluated, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = answersEvaluated.passed;
                }
                return answersEvaluated.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getPassed() {
                return this.passed;
            }

            public final AnswersEvaluated copy(boolean passed) {
                return new AnswersEvaluated(passed);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AnswersEvaluated) && this.passed == ((AnswersEvaluated) other).passed;
            }

            public int hashCode() {
                return Boolean.hashCode(this.passed);
            }

            public String toString() {
                return "AnswersEvaluated(passed=" + this.passed + ")";
            }

            public AnswersEvaluated(boolean z) {
                this.passed = z;
            }

            public final boolean getPassed() {
                return this.passed;
            }
        }

        /* compiled from: CarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/car/CarDuxo$Event$Error;", "Lcom/robinhood/android/car/CarDuxo$Event;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements Event {
            public static final int $stable = 8;
            private final Throwable error;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.error;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            public final Error copy(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Error(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ")";
            }

            public Error(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (r11.invoke(r12, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object withAccountNumber(Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        C99381 c99381;
        String accountNumber;
        if (continuation instanceof C99381) {
            c99381 = (C99381) continuation;
            int i = c99381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c99381.label = i - Integer.MIN_VALUE;
            } else {
                c99381 = new C99381(continuation);
            }
        }
        Object objAwait = c99381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c99381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            accountNumber = ((CarIntentKey) INSTANCE.getExtras((HasSavedState) this)).getAccountNumber();
            if (accountNumber == null) {
                Single<Optional<String>> individualAccountNumber = this.accountProvider.getIndividualAccountNumber();
                c99381.L$0 = function2;
                c99381.label = 1;
                objAwait = RxAwait3.await(individualAccountNumber, c99381);
            } else {
                if (accountNumber != null) {
                    IllegalStateException illegalStateException = new IllegalStateException("CAR flow started with no account number");
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, illegalStateException, false, null, 6, null);
                    submit(new Event.Error(illegalStateException));
                    return Unit.INSTANCE;
                }
                c99381.L$0 = null;
                c99381.label = 2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
            return Unit.INSTANCE;
        }
        function2 = (Function2) c99381.L$0;
        ResultKt.throwOnFailure(objAwait);
        accountNumber = (String) ((Optional) objAwait).getOrNull();
        if (accountNumber != null) {
        }
    }

    /* compiled from: CarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.car.CarDuxo$requestQuestionnaire$1", m3645f = "CarDuxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.car.CarDuxo$requestQuestionnaire$1 */
    static final class C99371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C99371(String str, Continuation<? super C99371> continuation) {
            super(2, continuation);
            this.$context = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CarDuxo.this.new C99371(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C99371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.car.CarDuxo$requestQuestionnaire$1$1", m3645f = "CarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.car.CarDuxo$requestQuestionnaire$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $context;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CarDuxo carDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = carDuxo;
                this.$context = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$context, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.submit(new Event.QuestionnaireRequested((String) this.L$0, this.$context));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CarDuxo carDuxo = CarDuxo.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(carDuxo, this.$context, null);
                this.label = 1;
                if (carDuxo.withAccountNumber(anonymousClass1, this) == coroutine_suspended) {
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

    public final void requestQuestionnaire(String context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C99371(context, null), 3, null);
    }

    /* compiled from: CarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.car.CarDuxo$evaluateAnswers$1", m3645f = "CarDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.car.CarDuxo$evaluateAnswers$1 */
    static final class C99361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C99361(Continuation<? super C99361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CarDuxo.this.new C99361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C99361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.car.CarDuxo$evaluateAnswers$1$1", m3645f = "CarDuxo.kt", m3646l = {57, 58}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.car.CarDuxo$evaluateAnswers$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CarDuxo carDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = carDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                ApiCarEligibility apiCarEligibility;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                } catch (Throwable th) {
                    this.this$0.submit(new Event.Error(th));
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    CarEligibilityApi carEligibilityApi = this.this$0.carEligibilityApi;
                    this.label = 1;
                    obj = carEligibilityApi.verifyCarEligibility(str, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apiCarEligibility = (ApiCarEligibility) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.this$0.submit(new Event.AnswersEvaluated(apiCarEligibility.getEligible()));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                ApiCarEligibility apiCarEligibility2 = (ApiCarEligibility) obj;
                Job jobRefresh$default = AccountProvider.DefaultImpls.refresh$default(this.this$0.accountProvider, false, 1, null);
                this.L$0 = apiCarEligibility2;
                this.label = 2;
                if (jobRefresh$default.join(this) != coroutine_suspended) {
                    apiCarEligibility = apiCarEligibility2;
                    this.this$0.submit(new Event.AnswersEvaluated(apiCarEligibility.getEligible()));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CarDuxo carDuxo = CarDuxo.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(carDuxo, null);
                this.label = 1;
                if (carDuxo.withAccountNumber(anonymousClass1, this) == coroutine_suspended) {
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

    public final void evaluateAnswers() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C99361(null), 3, null);
    }

    /* compiled from: CarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/car/CarDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/car/CarDuxo;", "Lcom/robinhood/android/common/contracts/CarIntentKey;", "<init>", "()V", "feature-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<CarDuxo, CarIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CarIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (CarIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CarIntentKey getExtras(CarDuxo carDuxo) {
            return (CarIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, carDuxo);
        }
    }
}
