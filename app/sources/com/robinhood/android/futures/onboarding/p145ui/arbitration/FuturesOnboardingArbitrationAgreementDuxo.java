package com.robinhood.android.futures.onboarding.p145ui.arbitration;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.udf.BaseDuxo;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationDataState;", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationViewState;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "retryLoadAgreement", "loadAgreement", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAgreeClicked", "", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "(Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumeSubmissionError", "Companion", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesOnboardingArbitrationAgreementDuxo extends BaseDuxo<FuturesOnboardingArbitrationDataState, FuturesOnboardingArbitrationAgreementDuxo5> {
    public static final String ARBITRATION_AGREEMENT = "rhd_onboarding_arbitration";
    private final AgreementsStore agreementsStore;
    public static final int $stable = 8;

    /* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo", m3645f = "FuturesOnboardingArbitrationAgreementDuxo.kt", m3646l = {45}, m3647m = "loadAgreement")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$loadAgreement$1 */
    static final class C173521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C173521(Continuation<? super C173521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOnboardingArbitrationAgreementDuxo.this.loadAgreement(this);
        }
    }

    /* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo", m3645f = "FuturesOnboardingArbitrationAgreementDuxo.kt", m3646l = {57}, m3647m = "onAgreeClicked")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$onAgreeClicked$1 */
    static final class C173551 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C173551(Continuation<? super C173551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOnboardingArbitrationAgreementDuxo.this.onAgreeClicked(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOnboardingArbitrationAgreementDuxo(AgreementsStore agreementsStore, DuxoBundle duxoBundle) {
        super(new FuturesOnboardingArbitrationDataState(null, false, null, 7, null), FuturesOnboardingArbitrationAgreementDuxo4.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.agreementsStore = agreementsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C173591(null));
    }

    /* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$onCreate$1", m3645f = "FuturesOnboardingArbitrationAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$onCreate$1 */
    static final class C173591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C173591(Continuation<? super C173591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesOnboardingArbitrationAgreementDuxo.this.new C173591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C173591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOnboardingArbitrationAgreementDuxo.this.retryLoadAgreement();
            return Unit.INSTANCE;
        }
    }

    public final void retryLoadAgreement() {
        withDataState(new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOnboardingArbitrationAgreementDuxo.retryLoadAgreement$lambda$0(this.f$0, (FuturesOnboardingArbitrationDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryLoadAgreement$lambda$0(FuturesOnboardingArbitrationAgreementDuxo futuresOnboardingArbitrationAgreementDuxo, FuturesOnboardingArbitrationDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        Result<UiAgreementWithContent> resultM14697getAgreementResultxLWZpok = ds.m14697getAgreementResultxLWZpok();
        if (resultM14697getAgreementResultxLWZpok == null || !Result.m28556isSuccessimpl(resultM14697getAgreementResultxLWZpok.getValue())) {
            BuildersKt__Builders_commonKt.launch$default(futuresOnboardingArbitrationAgreementDuxo.getLifecycleScope(), null, null, new FuturesOnboardingArbitrationAgreementDuxo2(futuresOnboardingArbitrationAgreementDuxo, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$loadAgreement$2", m3645f = "FuturesOnboardingArbitrationAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$loadAgreement$2 */
    static final class C173532 extends ContinuationImpl7 implements Function2<FuturesOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C173532(Continuation<? super C173532> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173532 c173532 = new C173532(continuation);
            c173532.L$0 = obj;
            return c173532;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingArbitrationDataState futuresOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState> continuation) {
            return ((C173532) create(futuresOnboardingArbitrationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingArbitrationDataState.copy$default((FuturesOnboardingArbitrationDataState) this.L$0, null, false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAgreement(Continuation<? super Unit> continuation) throws Throwable {
        C173521 c173521;
        Object objM28550constructorimpl;
        if (continuation instanceof C173521) {
            c173521 = (C173521) continuation;
            int i = c173521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c173521.label = i - Integer.MIN_VALUE;
            } else {
                c173521 = new C173521(continuation);
            }
        }
        Object agreementWithContent = c173521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c173521.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(agreementWithContent);
                applyMutation(new C173532(null));
                Result.Companion companion = Result.INSTANCE;
                AgreementsStore agreementsStore = this.agreementsStore;
                c173521.label = 1;
                agreementWithContent = agreementsStore.getAgreementWithContent(ARBITRATION_AGREEMENT, c173521);
                if (agreementWithContent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(agreementWithContent);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((UiAgreementWithContent) agreementWithContent);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            Throwables.rethrowIfNotNetworkRelated(thM28553exceptionOrNullimpl);
        }
        applyMutation(new C173543(objM28550constructorimpl, null));
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$loadAgreement$3", m3645f = "FuturesOnboardingArbitrationAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$loadAgreement$3 */
    static final class C173543 extends ContinuationImpl7 implements Function2<FuturesOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState>, Object> {
        final /* synthetic */ Object $agreement;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173543(Object obj, Continuation<? super C173543> continuation) {
            super(2, continuation);
            this.$agreement = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173543 c173543 = new C173543(this.$agreement, continuation);
            c173543.L$0 = obj;
            return c173543;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingArbitrationDataState futuresOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState> continuation) {
            return ((C173543) create(futuresOnboardingArbitrationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingArbitrationDataState.copy$default((FuturesOnboardingArbitrationDataState) this.L$0, Result.m28549boximpl(this.$agreement), false, null, 6, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onAgreeClicked(UiAgreementWithContent uiAgreementWithContent, Continuation<? super Boolean> continuation) throws Throwable {
        C173551 c173551;
        if (continuation instanceof C173551) {
            c173551 = (C173551) continuation;
            int i = c173551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c173551.label = i - Integer.MIN_VALUE;
            } else {
                c173551 = new C173551(continuation);
            }
        }
        C173551 c1735512 = c173551;
        Object obj = c1735512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1735512.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                applyMutation(new C173562(null));
                AgreementsStore agreementsStore = this.agreementsStore;
                c1735512.label = 1;
                if (AgreementsStore.signAgreement$default(agreementsStore, uiAgreementWithContent, null, null, c1735512, 6, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            applyMutation(new C173573(null));
        } catch (Exception e) {
            Throwables.rethrowIfNotNetworkRelated(e);
            applyMutation(new C173584(e, null));
            z = false;
        }
        return boxing.boxBoolean(z);
    }

    /* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$onAgreeClicked$2", m3645f = "FuturesOnboardingArbitrationAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$onAgreeClicked$2 */
    static final class C173562 extends ContinuationImpl7 implements Function2<FuturesOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C173562(Continuation<? super C173562> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173562 c173562 = new C173562(continuation);
            c173562.L$0 = obj;
            return c173562;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingArbitrationDataState futuresOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState> continuation) {
            return ((C173562) create(futuresOnboardingArbitrationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingArbitrationDataState.copy$default((FuturesOnboardingArbitrationDataState) this.L$0, null, true, null, 5, null);
        }
    }

    /* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$onAgreeClicked$3", m3645f = "FuturesOnboardingArbitrationAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$onAgreeClicked$3 */
    static final class C173573 extends ContinuationImpl7 implements Function2<FuturesOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C173573(Continuation<? super C173573> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173573 c173573 = new C173573(continuation);
            c173573.L$0 = obj;
            return c173573;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingArbitrationDataState futuresOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState> continuation) {
            return ((C173573) create(futuresOnboardingArbitrationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingArbitrationDataState.copy$default((FuturesOnboardingArbitrationDataState) this.L$0, null, false, null, 5, null);
        }
    }

    /* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$onAgreeClicked$4", m3645f = "FuturesOnboardingArbitrationAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$onAgreeClicked$4 */
    static final class C173584 extends ContinuationImpl7 implements Function2<FuturesOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f4160$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173584(Exception exc, Continuation<? super C173584> continuation) {
            super(2, continuation);
            this.f4160$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173584 c173584 = new C173584(this.f4160$e, continuation);
            c173584.L$0 = obj;
            return c173584;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingArbitrationDataState futuresOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState> continuation) {
            return ((C173584) create(futuresOnboardingArbitrationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingArbitrationDataState.copy$default((FuturesOnboardingArbitrationDataState) this.L$0, null, false, this.f4160$e, 1, null);
        }
    }

    /* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$consumeSubmissionError$1", m3645f = "FuturesOnboardingArbitrationAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo$consumeSubmissionError$1 */
    static final class C173511 extends ContinuationImpl7 implements Function2<FuturesOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C173511(Continuation<? super C173511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173511 c173511 = new C173511(continuation);
            c173511.L$0 = obj;
            return c173511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingArbitrationDataState futuresOnboardingArbitrationDataState, Continuation<? super FuturesOnboardingArbitrationDataState> continuation) {
            return ((C173511) create(futuresOnboardingArbitrationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingArbitrationDataState.copy$default((FuturesOnboardingArbitrationDataState) this.L$0, null, false, null, 3, null);
        }
    }

    public final void consumeSubmissionError() {
        applyMutation(new C173511(null));
    }
}
