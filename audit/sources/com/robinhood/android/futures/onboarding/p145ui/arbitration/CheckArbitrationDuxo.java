package com.robinhood.android.futures.onboarding.p145ui.arbitration;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.ApiPreviousAgreement;
import com.robinhood.android.futures.onboarding.p145ui.arbitration.CheckArbitrationDuxo3;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CheckArbitrationDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationDataState;", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationViewState;", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationEvent;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "retryLoadPreviousAgreement", "loadPreviousAgreement", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class CheckArbitrationDuxo extends BaseDuxo3<CheckArbitrationDataState, CheckArbitrationViewState, CheckArbitrationDuxo3> {
    public static final int $stable = 8;
    private final AgreementsStore agreementsStore;

    /* compiled from: CheckArbitrationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationDuxo", m3645f = "CheckArbitrationDuxo.kt", m3646l = {41}, m3647m = "loadPreviousAgreement")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationDuxo$loadPreviousAgreement$1 */
    static final class C173361 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C173361(Continuation<? super C173361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CheckArbitrationDuxo.this.loadPreviousAgreement(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckArbitrationDuxo(AgreementsStore agreementsStore, DuxoBundle duxoBundle) {
        super(new CheckArbitrationDataState(null, 1, null), CheckArbitrationDuxo4.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.agreementsStore = agreementsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C173391(null));
    }

    /* compiled from: CheckArbitrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationDuxo$onCreate$1", m3645f = "CheckArbitrationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationDuxo$onCreate$1 */
    static final class C173391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C173391(Continuation<? super C173391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CheckArbitrationDuxo.this.new C173391(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C173391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CheckArbitrationDuxo.this.retryLoadPreviousAgreement();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CheckArbitrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationDuxo$retryLoadPreviousAgreement$1", m3645f = "CheckArbitrationDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationDuxo$retryLoadPreviousAgreement$1 */
    static final class C173401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C173401(Continuation<? super C173401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CheckArbitrationDuxo.this.new C173401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C173401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CheckArbitrationDuxo checkArbitrationDuxo = CheckArbitrationDuxo.this;
                this.label = 1;
                if (checkArbitrationDuxo.loadPreviousAgreement(this) == coroutine_suspended) {
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

    public final void retryLoadPreviousAgreement() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C173401(null), 3, null);
    }

    /* compiled from: CheckArbitrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationDuxo$loadPreviousAgreement$2", m3645f = "CheckArbitrationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationDuxo$loadPreviousAgreement$2 */
    static final class C173372 extends ContinuationImpl7 implements Function2<CheckArbitrationDataState, Continuation<? super CheckArbitrationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C173372(Continuation<? super C173372> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173372 c173372 = new C173372(continuation);
            c173372.L$0 = obj;
            return c173372;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CheckArbitrationDataState checkArbitrationDataState, Continuation<? super CheckArbitrationDataState> continuation) {
            return ((C173372) create(checkArbitrationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((CheckArbitrationDataState) this.L$0).copy(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadPreviousAgreement(Continuation<? super Unit> continuation) throws Throwable {
        C173361 c173361;
        Object objM28550constructorimpl;
        CheckArbitrationDuxo checkArbitrationDuxo;
        if (continuation instanceof C173361) {
            c173361 = (C173361) continuation;
            int i = c173361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c173361.label = i - Integer.MIN_VALUE;
            } else {
                c173361 = new C173361(continuation);
            }
        }
        Object objCheckAgreement = c173361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c173361.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCheckAgreement);
                applyMutation(new C173372(null));
                Result.Companion companion = Result.INSTANCE;
                AgreementsStore agreementsStore = this.agreementsStore;
                c173361.L$0 = this;
                c173361.label = 1;
                objCheckAgreement = agreementsStore.checkAgreement(FuturesOnboardingArbitrationAgreementDuxo.ARBITRATION_AGREEMENT, c173361);
                if (objCheckAgreement == coroutine_suspended) {
                    return coroutine_suspended;
                }
                checkArbitrationDuxo = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                checkArbitrationDuxo = (CheckArbitrationDuxo) c173361.L$0;
                ResultKt.throwOnFailure(objCheckAgreement);
            }
            ApiPreviousAgreement apiPreviousAgreement = (ApiPreviousAgreement) objCheckAgreement;
            checkArbitrationDuxo.submit(new CheckArbitrationDuxo3.PreviousAgreementLoaded(apiPreviousAgreement));
            objM28550constructorimpl = Result.m28550constructorimpl(apiPreviousAgreement);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            Throwables.rethrowIfNotNetworkRelated(thM28553exceptionOrNullimpl);
        }
        applyMutation(new C173383(objM28550constructorimpl, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CheckArbitrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/CheckArbitrationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationDuxo$loadPreviousAgreement$3", m3645f = "CheckArbitrationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.CheckArbitrationDuxo$loadPreviousAgreement$3 */
    static final class C173383 extends ContinuationImpl7 implements Function2<CheckArbitrationDataState, Continuation<? super CheckArbitrationDataState>, Object> {
        final /* synthetic */ Object $agreement;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173383(Object obj, Continuation<? super C173383> continuation) {
            super(2, continuation);
            this.$agreement = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173383 c173383 = new C173383(this.$agreement, continuation);
            c173383.L$0 = obj;
            return c173383;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CheckArbitrationDataState checkArbitrationDataState, Continuation<? super CheckArbitrationDataState> continuation) {
            return ((C173383) create(checkArbitrationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((CheckArbitrationDataState) this.L$0).copy(Result.m28549boximpl(this.$agreement));
        }
    }
}
