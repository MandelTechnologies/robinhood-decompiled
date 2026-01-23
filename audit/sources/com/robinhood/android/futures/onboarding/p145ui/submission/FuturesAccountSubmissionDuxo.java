package com.robinhood.android.futures.onboarding.p145ui.submission;

import com.robinhood.android.futures.onboarding.p145ui.submission.FuturesAccountSubmissionDuxo;
import com.robinhood.android.models.futures.p192ui.CreateFuturesAccountResult;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.mib.MiBFuturesState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesAccountSubmissionDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionDataState;", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionViewState;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "retrySubmission", "createAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesAccountSubmissionDuxo extends BaseDuxo<FuturesAccountSubmissionDataState, FuturesAccountSubmissionDuxo4> {
    public static final int $stable = 8;
    private final FuturesAccountStore futuresAccountStore;

    /* compiled from: FuturesAccountSubmissionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo", m3645f = "FuturesAccountSubmissionDuxo.kt", m3646l = {42, 46}, m3647m = "createAccount")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo$createAccount$1 */
    static final class C174041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C174041(Continuation<? super C174041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesAccountSubmissionDuxo.this.createAccount(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAccountSubmissionDuxo(FuturesAccountStore futuresAccountStore, DuxoBundle duxoBundle) {
        super(new FuturesAccountSubmissionDataState(null, 1, null), FuturesAccountSubmissionDuxo3.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.futuresAccountStore = futuresAccountStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C174071(null));
    }

    /* compiled from: FuturesAccountSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo$onCreate$1", m3645f = "FuturesAccountSubmissionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo$onCreate$1 */
    static final class C174071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C174071(Continuation<? super C174071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesAccountSubmissionDuxo.this.new C174071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C174071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final FuturesAccountSubmissionDuxo futuresAccountSubmissionDuxo = FuturesAccountSubmissionDuxo.this;
            futuresAccountSubmissionDuxo.withDataState(new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return FuturesAccountSubmissionDuxo.C174071.invokeSuspend$lambda$0(futuresAccountSubmissionDuxo, (FuturesAccountSubmissionDataState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FuturesAccountSubmissionDuxo futuresAccountSubmissionDuxo, FuturesAccountSubmissionDataState futuresAccountSubmissionDataState) {
            Result<CreateFuturesAccountResult> resultM14714getResultxLWZpok = futuresAccountSubmissionDataState.m14714getResultxLWZpok();
            if (resultM14714getResultxLWZpok == null || !Result.m28556isSuccessimpl(resultM14714getResultxLWZpok.getValue())) {
                futuresAccountSubmissionDuxo.retrySubmission();
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: FuturesAccountSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo$retrySubmission$1", m3645f = "FuturesAccountSubmissionDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo$retrySubmission$1 */
    static final class C174081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C174081(Continuation<? super C174081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesAccountSubmissionDuxo.this.new C174081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C174081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesAccountSubmissionDuxo futuresAccountSubmissionDuxo = FuturesAccountSubmissionDuxo.this;
                this.label = 1;
                if (futuresAccountSubmissionDuxo.createAccount(this) == coroutine_suspended) {
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

    public final void retrySubmission() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C174081(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createAccount(Continuation<? super Unit> continuation) {
        C174041 c174041;
        Object objM28550constructorimpl;
        if (continuation instanceof C174041) {
            c174041 = (C174041) continuation;
            int i = c174041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c174041.label = i - Integer.MIN_VALUE;
            } else {
                c174041 = new C174041(continuation);
            }
        }
        Object objForceGetMibFuturesState = c174041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c174041.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceGetMibFuturesState);
            FuturesAccountStore futuresAccountStore = this.futuresAccountStore;
            c174041.label = 1;
            objForceGetMibFuturesState = futuresAccountStore.forceGetMibFuturesState(c174041);
            if (objForceGetMibFuturesState != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceGetMibFuturesState);
            objM28550constructorimpl = Result.m28550constructorimpl((CreateFuturesAccountResult) objForceGetMibFuturesState);
            if (((CreateFuturesAccountResult) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl)) instanceof CreateFuturesAccountResult.SuccessfulAccountCreation) {
                applyMutation(new C174052(objM28550constructorimpl, null));
            } else {
                applyMutation(new C174063(objM28550constructorimpl, null));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objForceGetMibFuturesState);
        Account futuresAllowedRhsAccount = ((MiBFuturesState) objForceGetMibFuturesState).getFuturesAllowedRhsAccount();
        if (futuresAllowedRhsAccount == null) {
            return Unit.INSTANCE;
        }
        Result.Companion companion2 = Result.INSTANCE;
        FuturesAccountStore futuresAccountStore2 = this.futuresAccountStore;
        String accountNumber = futuresAllowedRhsAccount.getAccountNumber();
        c174041.label = 2;
        objForceGetMibFuturesState = futuresAccountStore2.createAccount(accountNumber, c174041);
    }

    /* compiled from: FuturesAccountSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo$createAccount$2", m3645f = "FuturesAccountSubmissionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo$createAccount$2 */
    static final class C174052 extends ContinuationImpl7 implements Function2<FuturesAccountSubmissionDataState, Continuation<? super FuturesAccountSubmissionDataState>, Object> {
        final /* synthetic */ Object $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C174052(Object obj, Continuation<? super C174052> continuation) {
            super(2, continuation);
            this.$result = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174052 c174052 = new C174052(this.$result, continuation);
            c174052.L$0 = obj;
            return c174052;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesAccountSubmissionDataState futuresAccountSubmissionDataState, Continuation<? super FuturesAccountSubmissionDataState> continuation) {
            return ((C174052) create(futuresAccountSubmissionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((FuturesAccountSubmissionDataState) this.L$0).copy(Result.m28549boximpl(this.$result));
        }
    }

    /* compiled from: FuturesAccountSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/submission/FuturesAccountSubmissionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo$createAccount$3", m3645f = "FuturesAccountSubmissionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.submission.FuturesAccountSubmissionDuxo$createAccount$3 */
    static final class C174063 extends ContinuationImpl7 implements Function2<FuturesAccountSubmissionDataState, Continuation<? super FuturesAccountSubmissionDataState>, Object> {
        final /* synthetic */ Object $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C174063(Object obj, Continuation<? super C174063> continuation) {
            super(2, continuation);
            this.$result = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174063 c174063 = new C174063(this.$result, continuation);
            c174063.L$0 = obj;
            return c174063;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesAccountSubmissionDataState futuresAccountSubmissionDataState, Continuation<? super FuturesAccountSubmissionDataState> continuation) {
            return ((C174063) create(futuresAccountSubmissionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((FuturesAccountSubmissionDataState) this.L$0).copy(Result.m28549boximpl(this.$result));
        }
    }
}
