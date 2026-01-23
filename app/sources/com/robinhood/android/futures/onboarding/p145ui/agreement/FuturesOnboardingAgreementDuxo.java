package com.robinhood.android.futures.onboarding.p145ui.agreement;

import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetAgreementTypeRequestDto;
import com.robinhood.ceres.p284v1.GetAgreementTypeResponseDto;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.utils.extensions.Throwables;
import java.util.Locale;
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

/* compiled from: FuturesOnboardingAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementDataState;", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementViewState;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "retryLoadAgreement", "loadAgreement", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAgreeClicked", "", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "(Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumeSubmissionError", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesOnboardingAgreementDuxo extends BaseDuxo<FuturesOnboardingAgreementDataState, FuturesOnboardingAgreementDuxo5> {
    public static final int $stable = 8;
    private final AgreementsStore agreementsStore;
    private final Ceres ceres;

    /* compiled from: FuturesOnboardingAgreementDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo", m3645f = "FuturesOnboardingAgreementDuxo.kt", m3646l = {49, 50}, m3647m = "loadAgreement")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$loadAgreement$1 */
    static final class C173181 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C173181(Continuation<? super C173181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOnboardingAgreementDuxo.this.loadAgreement(this);
        }
    }

    /* compiled from: FuturesOnboardingAgreementDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo", m3645f = "FuturesOnboardingAgreementDuxo.kt", m3646l = {64}, m3647m = "onAgreeClicked")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$onAgreeClicked$1 */
    static final class C173211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C173211(Continuation<? super C173211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOnboardingAgreementDuxo.this.onAgreeClicked(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOnboardingAgreementDuxo(AgreementsStore agreementsStore, Ceres ceres, DuxoBundle duxoBundle) {
        super(new FuturesOnboardingAgreementDataState(null, false, null, 7, null), FuturesOnboardingAgreementDuxo4.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.agreementsStore = agreementsStore;
        this.ceres = ceres;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C173251(null));
    }

    /* compiled from: FuturesOnboardingAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$onCreate$1", m3645f = "FuturesOnboardingAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$onCreate$1 */
    static final class C173251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C173251(Continuation<? super C173251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesOnboardingAgreementDuxo.this.new C173251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C173251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOnboardingAgreementDuxo.this.retryLoadAgreement();
            return Unit.INSTANCE;
        }
    }

    public final void retryLoadAgreement() {
        withDataState(new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOnboardingAgreementDuxo.retryLoadAgreement$lambda$0(this.f$0, (FuturesOnboardingAgreementDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryLoadAgreement$lambda$0(FuturesOnboardingAgreementDuxo futuresOnboardingAgreementDuxo, FuturesOnboardingAgreementDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        Result<UiAgreementWithContent> resultM14674getAgreementResultxLWZpok = ds.m14674getAgreementResultxLWZpok();
        if (resultM14674getAgreementResultxLWZpok == null || !Result.m28556isSuccessimpl(resultM14674getAgreementResultxLWZpok.getValue())) {
            BuildersKt__Builders_commonKt.launch$default(futuresOnboardingAgreementDuxo.getLifecycleScope(), null, null, new FuturesOnboardingAgreementDuxo3(futuresOnboardingAgreementDuxo, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOnboardingAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$loadAgreement$2", m3645f = "FuturesOnboardingAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$loadAgreement$2 */
    static final class C173192 extends ContinuationImpl7 implements Function2<FuturesOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C173192(Continuation<? super C173192> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173192 c173192 = new C173192(continuation);
            c173192.L$0 = obj;
            return c173192;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingAgreementDataState futuresOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState> continuation) {
            return ((C173192) create(futuresOnboardingAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingAgreementDataState.copy$default((FuturesOnboardingAgreementDataState) this.L$0, null, false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAgreement(Continuation<? super Unit> continuation) throws Throwable {
        C173181 c173181;
        Object objM28550constructorimpl;
        FuturesOnboardingAgreementDuxo futuresOnboardingAgreementDuxo;
        if (continuation instanceof C173181) {
            c173181 = (C173181) continuation;
            int i = c173181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c173181.label = i - Integer.MIN_VALUE;
            } else {
                c173181 = new C173181(continuation);
            }
        }
        Object objGetAgreementType = c173181.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c173181.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAgreementType);
            applyMutation(new C173192(null));
            Result.Companion companion2 = Result.INSTANCE;
            Ceres ceres = this.ceres;
            GetAgreementTypeRequestDto getAgreementTypeRequestDto = new GetAgreementTypeRequestDto();
            c173181.L$0 = this;
            c173181.label = 1;
            objGetAgreementType = ceres.GetAgreementType(getAgreementTypeRequestDto, c173181);
            if (objGetAgreementType == coroutine_suspended) {
                return coroutine_suspended;
            }
            futuresOnboardingAgreementDuxo = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetAgreementType);
                objM28550constructorimpl = Result.m28550constructorimpl((UiAgreementWithContent) objGetAgreementType);
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    Throwables.rethrowIfNotNetworkRelated(thM28553exceptionOrNullimpl);
                }
                applyMutation(new C173203(objM28550constructorimpl, null));
                return Unit.INSTANCE;
            }
            futuresOnboardingAgreementDuxo = (FuturesOnboardingAgreementDuxo) c173181.L$0;
            ResultKt.throwOnFailure(objGetAgreementType);
        }
        AgreementsStore agreementsStore = futuresOnboardingAgreementDuxo.agreementsStore;
        String strName = ((GetAgreementTypeResponseDto) objGetAgreementType).getAgreement_type().name();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strName.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        c173181.L$0 = null;
        c173181.label = 2;
        objGetAgreementType = agreementsStore.getAgreementWithContent(lowerCase, c173181);
    }

    /* compiled from: FuturesOnboardingAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$loadAgreement$3", m3645f = "FuturesOnboardingAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$loadAgreement$3 */
    static final class C173203 extends ContinuationImpl7 implements Function2<FuturesOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState>, Object> {
        final /* synthetic */ Object $agreement;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173203(Object obj, Continuation<? super C173203> continuation) {
            super(2, continuation);
            this.$agreement = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173203 c173203 = new C173203(this.$agreement, continuation);
            c173203.L$0 = obj;
            return c173203;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingAgreementDataState futuresOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState> continuation) {
            return ((C173203) create(futuresOnboardingAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingAgreementDataState.copy$default((FuturesOnboardingAgreementDataState) this.L$0, Result.m28549boximpl(this.$agreement), false, null, 6, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onAgreeClicked(UiAgreementWithContent uiAgreementWithContent, Continuation<? super Boolean> continuation) throws Throwable {
        C173211 c173211;
        if (continuation instanceof C173211) {
            c173211 = (C173211) continuation;
            int i = c173211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c173211.label = i - Integer.MIN_VALUE;
            } else {
                c173211 = new C173211(continuation);
            }
        }
        C173211 c1732112 = c173211;
        Object obj = c1732112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1732112.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                applyMutation(new C173222(null));
                AgreementsStore agreementsStore = this.agreementsStore;
                c1732112.label = 1;
                if (AgreementsStore.signAgreement$default(agreementsStore, uiAgreementWithContent, null, null, c1732112, 6, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            applyMutation(new C173233(null));
        } catch (Exception e) {
            Throwables.rethrowIfNotNetworkRelated(e);
            applyMutation(new C173244(e, null));
            z = false;
        }
        return boxing.boxBoolean(z);
    }

    /* compiled from: FuturesOnboardingAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$onAgreeClicked$2", m3645f = "FuturesOnboardingAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$onAgreeClicked$2 */
    static final class C173222 extends ContinuationImpl7 implements Function2<FuturesOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C173222(Continuation<? super C173222> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173222 c173222 = new C173222(continuation);
            c173222.L$0 = obj;
            return c173222;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingAgreementDataState futuresOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState> continuation) {
            return ((C173222) create(futuresOnboardingAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingAgreementDataState.copy$default((FuturesOnboardingAgreementDataState) this.L$0, null, true, null, 5, null);
        }
    }

    /* compiled from: FuturesOnboardingAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$onAgreeClicked$3", m3645f = "FuturesOnboardingAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$onAgreeClicked$3 */
    static final class C173233 extends ContinuationImpl7 implements Function2<FuturesOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C173233(Continuation<? super C173233> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173233 c173233 = new C173233(continuation);
            c173233.L$0 = obj;
            return c173233;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingAgreementDataState futuresOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState> continuation) {
            return ((C173233) create(futuresOnboardingAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingAgreementDataState.copy$default((FuturesOnboardingAgreementDataState) this.L$0, null, false, null, 5, null);
        }
    }

    /* compiled from: FuturesOnboardingAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$onAgreeClicked$4", m3645f = "FuturesOnboardingAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$onAgreeClicked$4 */
    static final class C173244 extends ContinuationImpl7 implements Function2<FuturesOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f4159$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C173244(Exception exc, Continuation<? super C173244> continuation) {
            super(2, continuation);
            this.f4159$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173244 c173244 = new C173244(this.f4159$e, continuation);
            c173244.L$0 = obj;
            return c173244;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingAgreementDataState futuresOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState> continuation) {
            return ((C173244) create(futuresOnboardingAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingAgreementDataState.copy$default((FuturesOnboardingAgreementDataState) this.L$0, null, false, this.f4159$e, 1, null);
        }
    }

    /* compiled from: FuturesOnboardingAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$consumeSubmissionError$1", m3645f = "FuturesOnboardingAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementDuxo$consumeSubmissionError$1 */
    static final class C173171 extends ContinuationImpl7 implements Function2<FuturesOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C173171(Continuation<? super C173171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C173171 c173171 = new C173171(continuation);
            c173171.L$0 = obj;
            return c173171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesOnboardingAgreementDataState futuresOnboardingAgreementDataState, Continuation<? super FuturesOnboardingAgreementDataState> continuation) {
            return ((C173171) create(futuresOnboardingAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOnboardingAgreementDataState.copy$default((FuturesOnboardingAgreementDataState) this.L$0, null, false, null, 3, null);
        }
    }

    public final void consumeSubmissionError() {
        applyMutation(new C173171(null));
    }
}
