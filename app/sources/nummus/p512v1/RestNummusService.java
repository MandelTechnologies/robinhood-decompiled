package nummus.p512v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: RestNummusService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0096@¢\u0006\u0004\b\u001c\u0010\rJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096@¢\u0006\u0004\b \u0010\rJ\u0018\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J$\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\"0\u000bH\u0096@¢\u0006\u0004\b$\u0010\rJ\u0018\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J$\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020&0\u000bH\u0096@¢\u0006\u0004\b(\u0010\rJ\u0018\u0010,\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020*H\u0096@¢\u0006\u0004\b,\u0010-J$\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020*0\u000bH\u0096@¢\u0006\u0004\b,\u0010\rJ\u0018\u00100\u001a\u00020/2\u0006\u0010\u0007\u001a\u00020.H\u0096@¢\u0006\u0004\b0\u00101J$\u00100\u001a\b\u0012\u0004\u0012\u00020/0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020.0\u000bH\u0096@¢\u0006\u0004\b0\u0010\rJ\u0018\u00104\u001a\u0002032\u0006\u0010\u0007\u001a\u000202H\u0096@¢\u0006\u0004\b4\u00105J$\u00104\u001a\b\u0012\u0004\u0012\u0002030\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002020\u000bH\u0096@¢\u0006\u0004\b4\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106¨\u00067"}, m3636d2 = {"Lnummus/v1/RestNummusService;", "Lnummus/v1/NummusService;", "Lnummus/v1/NummusServiceRetrofit;", "retrofit", "<init>", "(Lnummus/v1/NummusServiceRetrofit;)V", "Lnummus/v1/FeeEstimationRequestDto;", "request", "Lnummus/v1/FeeEstimationResponseDto;", "FeeEstimation", "(Lnummus/v1/FeeEstimationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/AccountPreferenceRetrieveRequestDto;", "Lnummus/v1/AccountPreferenceRetrieveResponseDto;", "AccountPreferenceRetrieve", "(Lnummus/v1/AccountPreferenceRetrieveRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/AccountPreferencePutRequestDto;", "Lnummus/v1/AccountPreferencePutResponseDto;", "AccountPreferencePut", "(Lnummus/v1/AccountPreferencePutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/TaxLotsForOrderRequestDto;", "Lnummus/v1/TaxLotsForOrderResponseDto;", "TaxLotsForOrder", "(Lnummus/v1/TaxLotsForOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/UserFeeTierRequestDto;", "Lnummus/v1/UserFeeTierResponseDto;", "UserFeeTier", "(Lnummus/v1/UserFeeTierRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/TaxlotabilityRequestDto;", "Lnummus/v1/TaxlotabilityResponseDto;", "Taxlotability", "(Lnummus/v1/TaxlotabilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/CorpActionSplitPaymentListRequestDto;", "Lnummus/v1/CorpActionSplitPaymentListResponseDto;", "CorpActionSplitPaymentList", "(Lnummus/v1/CorpActionSplitPaymentListRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/CorpActionDividendsPaymentListRequestDto;", "Lnummus/v1/CorpActionDividendsPaymentListResponseDto;", "CorpActionDividendsPaymentList", "(Lnummus/v1/CorpActionDividendsPaymentListRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/CreateCostBasisLotRequestDto;", "Lnummus/v1/CreateCostBasisLotResponseDto;", "CreateCostBasisLot", "(Lnummus/v1/CreateCostBasisLotRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/GetCostBasisSummaryRequestDto;", "Lnummus/v1/GetCostBasisSummaryResponseDto;", "GetCostBasisSummary", "(Lnummus/v1/GetCostBasisSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/GetCostBasisDetailsRequestDto;", "Lnummus/v1/GetCostBasisDetailsResponseDto;", "GetCostBasisDetails", "(Lnummus/v1/GetCostBasisDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnummus/v1/NummusServiceRetrofit;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class RestNummusService implements NummusService {
    private final NummusServiceRetrofit retrofit;

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {104}, m3647m = "AccountPreferencePut")
    /* renamed from: nummus.v1.RestNummusService$AccountPreferencePut$1 */
    static final class C472601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472601(Continuation<? super C472601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.AccountPreferencePut((AccountPreferencePutRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {107}, m3647m = "AccountPreferencePut")
    /* renamed from: nummus.v1.RestNummusService$AccountPreferencePut$2 */
    static final class C472612 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472612(Continuation<? super C472612> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.AccountPreferencePut((Request<AccountPreferencePutRequestDto>) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {94}, m3647m = "AccountPreferenceRetrieve")
    /* renamed from: nummus.v1.RestNummusService$AccountPreferenceRetrieve$1 */
    static final class C472621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472621(Continuation<? super C472621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.AccountPreferenceRetrieve((AccountPreferenceRetrieveRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {97}, m3647m = "AccountPreferenceRetrieve")
    /* renamed from: nummus.v1.RestNummusService$AccountPreferenceRetrieve$2 */
    static final class C472632 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472632(Continuation<? super C472632> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.AccountPreferenceRetrieve((Request<AccountPreferenceRetrieveRequestDto>) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {358}, m3647m = "CorpActionDividendsPaymentList")
    /* renamed from: nummus.v1.RestNummusService$CorpActionDividendsPaymentList$1 */
    static final class C472641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472641(Continuation<? super C472641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.CorpActionDividendsPaymentList((CorpActionDividendsPaymentListRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {364}, m3647m = "CorpActionDividendsPaymentList")
    /* renamed from: nummus.v1.RestNummusService$CorpActionDividendsPaymentList$2 */
    static final class C472652 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472652(Continuation<? super C472652> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.CorpActionDividendsPaymentList((Request<CorpActionDividendsPaymentListRequestDto>) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {339}, m3647m = "CorpActionSplitPaymentList")
    /* renamed from: nummus.v1.RestNummusService$CorpActionSplitPaymentList$1 */
    static final class C472661 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472661(Continuation<? super C472661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.CorpActionSplitPaymentList((CorpActionSplitPaymentListRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {346}, m3647m = "CorpActionSplitPaymentList")
    /* renamed from: nummus.v1.RestNummusService$CorpActionSplitPaymentList$2 */
    static final class C472672 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472672(Continuation<? super C472672> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.CorpActionSplitPaymentList((Request<CorpActionSplitPaymentListRequestDto>) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {377}, m3647m = "CreateCostBasisLot")
    /* renamed from: nummus.v1.RestNummusService$CreateCostBasisLot$1 */
    static final class C472681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472681(Continuation<? super C472681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.CreateCostBasisLot((CreateCostBasisLotRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {384}, m3647m = "CreateCostBasisLot")
    /* renamed from: nummus.v1.RestNummusService$CreateCostBasisLot$2 */
    static final class C472692 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472692(Continuation<? super C472692> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.CreateCostBasisLot((Request<CreateCostBasisLotRequestDto>) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {55}, m3647m = "FeeEstimation")
    /* renamed from: nummus.v1.RestNummusService$FeeEstimation$1 */
    static final class C472701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472701(Continuation<? super C472701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.FeeEstimation((FeeEstimationRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {62}, m3647m = "FeeEstimation")
    /* renamed from: nummus.v1.RestNummusService$FeeEstimation$2 */
    static final class C472712 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472712(Continuation<? super C472712> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.FeeEstimation((Request<FeeEstimationRequestDto>) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {418}, m3647m = "GetCostBasisDetails")
    /* renamed from: nummus.v1.RestNummusService$GetCostBasisDetails$1 */
    static final class C472721 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472721(Continuation<? super C472721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.GetCostBasisDetails((GetCostBasisDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {424}, m3647m = "GetCostBasisDetails")
    /* renamed from: nummus.v1.RestNummusService$GetCostBasisDetails$2 */
    static final class C472732 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472732(Continuation<? super C472732> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.GetCostBasisDetails((Request<GetCostBasisDetailsRequestDto>) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {394}, m3647m = "GetCostBasisSummary")
    /* renamed from: nummus.v1.RestNummusService$GetCostBasisSummary$1 */
    static final class C472741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472741(Continuation<? super C472741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.GetCostBasisSummary((GetCostBasisSummaryRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {400}, m3647m = "GetCostBasisSummary")
    /* renamed from: nummus.v1.RestNummusService$GetCostBasisSummary$2 */
    static final class C472752 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472752(Continuation<? super C472752> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.GetCostBasisSummary((Request<GetCostBasisSummaryRequestDto>) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "TaxLotsForOrder")
    /* renamed from: nummus.v1.RestNummusService$TaxLotsForOrder$1 */
    static final class C472761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472761(Continuation<? super C472761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.TaxLotsForOrder((TaxLotsForOrderRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "TaxLotsForOrder")
    /* renamed from: nummus.v1.RestNummusService$TaxLotsForOrder$2 */
    static final class C472772 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472772(Continuation<? super C472772> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.TaxLotsForOrder((Request<TaxLotsForOrderRequestDto>) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE}, m3647m = "Taxlotability")
    /* renamed from: nummus.v1.RestNummusService$Taxlotability$1 */
    static final class C472781 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472781(Continuation<? super C472781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.Taxlotability((TaxlotabilityRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "Taxlotability")
    /* renamed from: nummus.v1.RestNummusService$Taxlotability$2 */
    static final class C472792 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472792(Continuation<? super C472792> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.Taxlotability((Request<TaxlotabilityRequestDto>) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m3647m = "UserFeeTier")
    /* renamed from: nummus.v1.RestNummusService$UserFeeTier$1 */
    static final class C472801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472801(Continuation<? super C472801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.UserFeeTier((UserFeeTierRequestDto) null, this);
        }
    }

    /* compiled from: RestNummusService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "nummus.v1.RestNummusService", m3645f = "RestNummusService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m3647m = "UserFeeTier")
    /* renamed from: nummus.v1.RestNummusService$UserFeeTier$2 */
    static final class C472812 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C472812(Continuation<? super C472812> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestNummusService.this.UserFeeTier((Request<UserFeeTierRequestDto>) null, this);
        }
    }

    public RestNummusService(NummusServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FeeEstimation(FeeEstimationRequestDto feeEstimationRequestDto, Continuation<? super FeeEstimationResponseDto> continuation) {
        C472701 c472701;
        if (continuation instanceof C472701) {
            c472701 = (C472701) continuation;
            int i = c472701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472701.label = i - Integer.MIN_VALUE;
            } else {
                c472701 = new C472701(continuation);
            }
        }
        Object objFeeEstimation = c472701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFeeEstimation);
            Request<FeeEstimationRequestDto> request = new Request<>(feeEstimationRequestDto, null, 2, null);
            c472701.label = 1;
            objFeeEstimation = FeeEstimation(request, c472701);
            if (objFeeEstimation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFeeEstimation);
        }
        return ((Response) objFeeEstimation).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FeeEstimation(Request<FeeEstimationRequestDto> request, Continuation<? super Response<FeeEstimationResponseDto>> continuation) {
        C472712 c472712;
        if (continuation instanceof C472712) {
            c472712 = (C472712) continuation;
            int i = c472712.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472712.label = i - Integer.MIN_VALUE;
            } else {
                c472712 = new C472712(continuation);
            }
        }
        Object objFeeEstimation = c472712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFeeEstimation);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            FeeEstimationRequestDto data = request.getData();
            c472712.label = 1;
            objFeeEstimation = nummusServiceRetrofit.FeeEstimation(metadata, data, c472712);
            if (objFeeEstimation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFeeEstimation);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objFeeEstimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AccountPreferenceRetrieve(AccountPreferenceRetrieveRequestDto accountPreferenceRetrieveRequestDto, Continuation<? super AccountPreferenceRetrieveResponseDto> continuation) {
        C472621 c472621;
        if (continuation instanceof C472621) {
            c472621 = (C472621) continuation;
            int i = c472621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472621.label = i - Integer.MIN_VALUE;
            } else {
                c472621 = new C472621(continuation);
            }
        }
        Object objAccountPreferenceRetrieve = c472621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472621.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccountPreferenceRetrieve);
            Request<AccountPreferenceRetrieveRequestDto> request = new Request<>(accountPreferenceRetrieveRequestDto, null, 2, null);
            c472621.label = 1;
            objAccountPreferenceRetrieve = AccountPreferenceRetrieve(request, c472621);
            if (objAccountPreferenceRetrieve == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccountPreferenceRetrieve);
        }
        return ((Response) objAccountPreferenceRetrieve).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AccountPreferenceRetrieve(Request<AccountPreferenceRetrieveRequestDto> request, Continuation<? super Response<AccountPreferenceRetrieveResponseDto>> continuation) {
        C472632 c472632;
        if (continuation instanceof C472632) {
            c472632 = (C472632) continuation;
            int i = c472632.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472632.label = i - Integer.MIN_VALUE;
            } else {
                c472632 = new C472632(continuation);
            }
        }
        Object objAccountPreferenceRetrieve = c472632.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472632.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccountPreferenceRetrieve);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = !Intrinsics.areEqual(request.getData().getAccount_id(), "") ? request.getData().getAccount_id() : null;
            c472632.label = 1;
            objAccountPreferenceRetrieve = nummusServiceRetrofit.AccountPreferenceRetrieve(metadata, account_id, c472632);
            if (objAccountPreferenceRetrieve == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccountPreferenceRetrieve);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objAccountPreferenceRetrieve);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AccountPreferencePut(AccountPreferencePutRequestDto accountPreferencePutRequestDto, Continuation<? super AccountPreferencePutResponseDto> continuation) {
        C472601 c472601;
        if (continuation instanceof C472601) {
            c472601 = (C472601) continuation;
            int i = c472601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472601.label = i - Integer.MIN_VALUE;
            } else {
                c472601 = new C472601(continuation);
            }
        }
        Object objAccountPreferencePut = c472601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccountPreferencePut);
            Request<AccountPreferencePutRequestDto> request = new Request<>(accountPreferencePutRequestDto, null, 2, null);
            c472601.label = 1;
            objAccountPreferencePut = AccountPreferencePut(request, c472601);
            if (objAccountPreferencePut == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccountPreferencePut);
        }
        return ((Response) objAccountPreferencePut).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AccountPreferencePut(Request<AccountPreferencePutRequestDto> request, Continuation<? super Response<AccountPreferencePutResponseDto>> continuation) {
        C472612 c472612;
        if (continuation instanceof C472612) {
            c472612 = (C472612) continuation;
            int i = c472612.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472612.label = i - Integer.MIN_VALUE;
            } else {
                c472612 = new C472612(continuation);
            }
        }
        Object objAccountPreferencePut = c472612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAccountPreferencePut);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            AccountPreferencePutRequestDto data = request.getData();
            c472612.label = 1;
            objAccountPreferencePut = nummusServiceRetrofit.AccountPreferencePut(metadata, data, c472612);
            if (objAccountPreferencePut == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAccountPreferencePut);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objAccountPreferencePut);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nummus.p512v1.NummusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object TaxLotsForOrder(TaxLotsForOrderRequestDto taxLotsForOrderRequestDto, Continuation<? super TaxLotsForOrderResponseDto> continuation) {
        C472761 c472761;
        if (continuation instanceof C472761) {
            c472761 = (C472761) continuation;
            int i = c472761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472761.label = i - Integer.MIN_VALUE;
            } else {
                c472761 = new C472761(continuation);
            }
        }
        Object objTaxLotsForOrder = c472761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTaxLotsForOrder);
            Request<TaxLotsForOrderRequestDto> request = new Request<>(taxLotsForOrderRequestDto, null, 2, null);
            c472761.label = 1;
            objTaxLotsForOrder = TaxLotsForOrder(request, c472761);
            if (objTaxLotsForOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTaxLotsForOrder);
        }
        return ((Response) objTaxLotsForOrder).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object TaxLotsForOrder(Request<TaxLotsForOrderRequestDto> request, Continuation<? super Response<TaxLotsForOrderResponseDto>> continuation) {
        C472772 c472772;
        if (continuation instanceof C472772) {
            c472772 = (C472772) continuation;
            int i = c472772.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472772.label = i - Integer.MIN_VALUE;
            } else {
                c472772 = new C472772(continuation);
            }
        }
        C472772 c4727722 = c472772;
        Object objTaxLotsForOrder = c4727722.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4727722.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTaxLotsForOrder);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String order_id = request.getData().getOrder_id();
            String cursor = request.getData().getCursor();
            String account_id = request.getData().getAccount_id();
            c4727722.label = 1;
            objTaxLotsForOrder = nummusServiceRetrofit.TaxLotsForOrder(metadata, order_id, cursor, account_id, c4727722);
            if (objTaxLotsForOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTaxLotsForOrder);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objTaxLotsForOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UserFeeTier(UserFeeTierRequestDto userFeeTierRequestDto, Continuation<? super UserFeeTierResponseDto> continuation) {
        C472801 c472801;
        if (continuation instanceof C472801) {
            c472801 = (C472801) continuation;
            int i = c472801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472801.label = i - Integer.MIN_VALUE;
            } else {
                c472801 = new C472801(continuation);
            }
        }
        Object objUserFeeTier = c472801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472801.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUserFeeTier);
            Request<UserFeeTierRequestDto> request = new Request<>(userFeeTierRequestDto, null, 2, null);
            c472801.label = 1;
            objUserFeeTier = UserFeeTier(request, c472801);
            if (objUserFeeTier == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUserFeeTier);
        }
        return ((Response) objUserFeeTier).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UserFeeTier(Request<UserFeeTierRequestDto> request, Continuation<? super Response<UserFeeTierResponseDto>> continuation) {
        C472812 c472812;
        if (continuation instanceof C472812) {
            c472812 = (C472812) continuation;
            int i = c472812.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472812.label = i - Integer.MIN_VALUE;
            } else {
                c472812 = new C472812(continuation);
            }
        }
        Object objUserFeeTier = c472812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUserFeeTier);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = !Intrinsics.areEqual(request.getData().getAccount_id(), "") ? request.getData().getAccount_id() : null;
            c472812.label = 1;
            objUserFeeTier = nummusServiceRetrofit.UserFeeTier(metadata, account_id, c472812);
            if (objUserFeeTier == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUserFeeTier);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objUserFeeTier);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nummus.p512v1.NummusService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Taxlotability(TaxlotabilityRequestDto taxlotabilityRequestDto, Continuation<? super TaxlotabilityResponseDto> continuation) {
        C472781 c472781;
        if (continuation instanceof C472781) {
            c472781 = (C472781) continuation;
            int i = c472781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472781.label = i - Integer.MIN_VALUE;
            } else {
                c472781 = new C472781(continuation);
            }
        }
        Object objTaxlotability = c472781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472781.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTaxlotability);
            Request<TaxlotabilityRequestDto> request = new Request<>(taxlotabilityRequestDto, null, 2, null);
            c472781.label = 1;
            objTaxlotability = Taxlotability(request, c472781);
            if (objTaxlotability == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTaxlotability);
        }
        return ((Response) objTaxlotability).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Taxlotability(Request<TaxlotabilityRequestDto> request, Continuation<? super Response<TaxlotabilityResponseDto>> continuation) {
        C472792 c472792;
        if (continuation instanceof C472792) {
            c472792 = (C472792) continuation;
            int i = c472792.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472792.label = i - Integer.MIN_VALUE;
            } else {
                c472792 = new C472792(continuation);
            }
        }
        Object objTaxlotability = c472792.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472792.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTaxlotability);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String currency_pair_id = request.getData().getCurrency_pair_id();
            String account_id = request.getData().getAccount_id();
            c472792.label = 1;
            objTaxlotability = nummusServiceRetrofit.Taxlotability(metadata, currency_pair_id, account_id, c472792);
            if (objTaxlotability == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTaxlotability);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objTaxlotability);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CorpActionSplitPaymentList(CorpActionSplitPaymentListRequestDto corpActionSplitPaymentListRequestDto, Continuation<? super CorpActionSplitPaymentListResponseDto> continuation) {
        C472661 c472661;
        if (continuation instanceof C472661) {
            c472661 = (C472661) continuation;
            int i = c472661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472661.label = i - Integer.MIN_VALUE;
            } else {
                c472661 = new C472661(continuation);
            }
        }
        Object objCorpActionSplitPaymentList = c472661.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472661.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCorpActionSplitPaymentList);
            Request<CorpActionSplitPaymentListRequestDto> request = new Request<>(corpActionSplitPaymentListRequestDto, null, 2, null);
            c472661.label = 1;
            objCorpActionSplitPaymentList = CorpActionSplitPaymentList(request, c472661);
            if (objCorpActionSplitPaymentList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCorpActionSplitPaymentList);
        }
        return ((Response) objCorpActionSplitPaymentList).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CorpActionSplitPaymentList(Request<CorpActionSplitPaymentListRequestDto> request, Continuation<? super Response<CorpActionSplitPaymentListResponseDto>> continuation) {
        C472672 c472672;
        if (continuation instanceof C472672) {
            c472672 = (C472672) continuation;
            int i = c472672.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472672.label = i - Integer.MIN_VALUE;
            } else {
                c472672 = new C472672(continuation);
            }
        }
        C472672 c4726722 = c472672;
        Object objCorpActionSplitPaymentList = c4726722.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4726722.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCorpActionSplitPaymentList);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            Instant updated_at_gte = request.getData().getUpdated_at_gte();
            Instant instantOfEpochSecond = Instant.ofEpochSecond(0L, 0L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
            Instant updated_at_gte2 = !Intrinsics.areEqual(updated_at_gte, instantOfEpochSecond) ? request.getData().getUpdated_at_gte() : null;
            String cursor = !Intrinsics.areEqual(request.getData().getCursor(), "") ? request.getData().getCursor() : null;
            String currency_pair_id = Intrinsics.areEqual(request.getData().getCurrency_pair_id(), "") ? null : request.getData().getCurrency_pair_id();
            c4726722.label = 1;
            objCorpActionSplitPaymentList = nummusServiceRetrofit.CorpActionSplitPaymentList(metadata, updated_at_gte2, cursor, currency_pair_id, c4726722);
            if (objCorpActionSplitPaymentList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCorpActionSplitPaymentList);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCorpActionSplitPaymentList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CorpActionDividendsPaymentList(CorpActionDividendsPaymentListRequestDto corpActionDividendsPaymentListRequestDto, Continuation<? super CorpActionDividendsPaymentListResponseDto> continuation) {
        C472641 c472641;
        if (continuation instanceof C472641) {
            c472641 = (C472641) continuation;
            int i = c472641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472641.label = i - Integer.MIN_VALUE;
            } else {
                c472641 = new C472641(continuation);
            }
        }
        Object objCorpActionDividendsPaymentList = c472641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCorpActionDividendsPaymentList);
            Request<CorpActionDividendsPaymentListRequestDto> request = new Request<>(corpActionDividendsPaymentListRequestDto, null, 2, null);
            c472641.label = 1;
            objCorpActionDividendsPaymentList = CorpActionDividendsPaymentList(request, c472641);
            if (objCorpActionDividendsPaymentList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCorpActionDividendsPaymentList);
        }
        return ((Response) objCorpActionDividendsPaymentList).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CorpActionDividendsPaymentList(Request<CorpActionDividendsPaymentListRequestDto> request, Continuation<? super Response<CorpActionDividendsPaymentListResponseDto>> continuation) {
        C472652 c472652;
        if (continuation instanceof C472652) {
            c472652 = (C472652) continuation;
            int i = c472652.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472652.label = i - Integer.MIN_VALUE;
            } else {
                c472652 = new C472652(continuation);
            }
        }
        C472652 c4726522 = c472652;
        Object objCorpActionDividendsPaymentList = c4726522.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4726522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCorpActionDividendsPaymentList);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            Instant updated_at_gte = request.getData().getUpdated_at_gte();
            Instant instantOfEpochSecond = Instant.ofEpochSecond(0L, 0L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
            Instant updated_at_gte2 = !Intrinsics.areEqual(updated_at_gte, instantOfEpochSecond) ? request.getData().getUpdated_at_gte() : null;
            String cursor = !Intrinsics.areEqual(request.getData().getCursor(), "") ? request.getData().getCursor() : null;
            String currency_pair_id = Intrinsics.areEqual(request.getData().getCurrency_pair_id(), "") ? null : request.getData().getCurrency_pair_id();
            c4726522.label = 1;
            objCorpActionDividendsPaymentList = nummusServiceRetrofit.CorpActionDividendsPaymentList(metadata, updated_at_gte2, cursor, currency_pair_id, c4726522);
            if (objCorpActionDividendsPaymentList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCorpActionDividendsPaymentList);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCorpActionDividendsPaymentList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateCostBasisLot(CreateCostBasisLotRequestDto createCostBasisLotRequestDto, Continuation<? super CreateCostBasisLotResponseDto> continuation) {
        C472681 c472681;
        if (continuation instanceof C472681) {
            c472681 = (C472681) continuation;
            int i = c472681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472681.label = i - Integer.MIN_VALUE;
            } else {
                c472681 = new C472681(continuation);
            }
        }
        Object objCreateCostBasisLot = c472681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateCostBasisLot);
            Request<CreateCostBasisLotRequestDto> request = new Request<>(createCostBasisLotRequestDto, null, 2, null);
            c472681.label = 1;
            objCreateCostBasisLot = CreateCostBasisLot(request, c472681);
            if (objCreateCostBasisLot == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateCostBasisLot);
        }
        return ((Response) objCreateCostBasisLot).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateCostBasisLot(Request<CreateCostBasisLotRequestDto> request, Continuation<? super Response<CreateCostBasisLotResponseDto>> continuation) {
        C472692 c472692;
        if (continuation instanceof C472692) {
            c472692 = (C472692) continuation;
            int i = c472692.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472692.label = i - Integer.MIN_VALUE;
            } else {
                c472692 = new C472692(continuation);
            }
        }
        Object objCreateCostBasisLot = c472692.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472692.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateCostBasisLot);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateCostBasisLotRequestDto data = request.getData();
            c472692.label = 1;
            objCreateCostBasisLot = nummusServiceRetrofit.CreateCostBasisLot(metadata, data, c472692);
            if (objCreateCostBasisLot == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateCostBasisLot);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateCostBasisLot);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCostBasisSummary(GetCostBasisSummaryRequestDto getCostBasisSummaryRequestDto, Continuation<? super GetCostBasisSummaryResponseDto> continuation) {
        C472741 c472741;
        if (continuation instanceof C472741) {
            c472741 = (C472741) continuation;
            int i = c472741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472741.label = i - Integer.MIN_VALUE;
            } else {
                c472741 = new C472741(continuation);
            }
        }
        Object objGetCostBasisSummary = c472741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472741.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCostBasisSummary);
            Request<GetCostBasisSummaryRequestDto> request = new Request<>(getCostBasisSummaryRequestDto, null, 2, null);
            c472741.label = 1;
            objGetCostBasisSummary = GetCostBasisSummary(request, c472741);
            if (objGetCostBasisSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCostBasisSummary);
        }
        return ((Response) objGetCostBasisSummary).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCostBasisSummary(Request<GetCostBasisSummaryRequestDto> request, Continuation<? super Response<GetCostBasisSummaryResponseDto>> continuation) {
        C472752 c472752;
        if (continuation instanceof C472752) {
            c472752 = (C472752) continuation;
            int i = c472752.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472752.label = i - Integer.MIN_VALUE;
            } else {
                c472752 = new C472752(continuation);
            }
        }
        C472752 c4727522 = c472752;
        Object objGetCostBasisSummary = c4727522.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4727522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCostBasisSummary);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = !Intrinsics.areEqual(request.getData().getAccount_id(), "") ? request.getData().getAccount_id() : null;
            String source_id = !Intrinsics.areEqual(request.getData().getSource_id(), "") ? request.getData().getSource_id() : null;
            String source_type = !Intrinsics.areEqual(request.getData().getSource_type(), "") ? request.getData().getSource_type() : null;
            String currency_pair_id = !Intrinsics.areEqual(request.getData().getCurrency_pair_id(), "") ? request.getData().getCurrency_pair_id() : null;
            CostBasisStatusDto status = request.getData().getStatus() != CostBasisStatusDto.INSTANCE.getZeroValue() ? request.getData().getStatus() : null;
            Integer numBoxInt = request.getData().getYear() != 0 ? boxing.boxInt(request.getData().getYear()) : null;
            Integer numBoxInt2 = request.getData().getLimit() != 0 ? boxing.boxInt(request.getData().getLimit()) : null;
            String cursor = !Intrinsics.areEqual(request.getData().getCursor(), "") ? request.getData().getCursor() : null;
            Boolean boolBoxBoolean = request.getData().getAllow_correction() ? boxing.boxBoolean(request.getData().getAllow_correction()) : null;
            c4727522.label = 1;
            Integer num = numBoxInt2;
            Boolean bool = boolBoxBoolean;
            objGetCostBasisSummary = nummusServiceRetrofit.GetCostBasisSummary(metadata, account_id, source_id, source_type, currency_pair_id, status, numBoxInt, num, cursor, bool, c4727522);
            if (objGetCostBasisSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCostBasisSummary);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCostBasisSummary);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCostBasisDetails(GetCostBasisDetailsRequestDto getCostBasisDetailsRequestDto, Continuation<? super GetCostBasisDetailsResponseDto> continuation) {
        C472721 c472721;
        if (continuation instanceof C472721) {
            c472721 = (C472721) continuation;
            int i = c472721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472721.label = i - Integer.MIN_VALUE;
            } else {
                c472721 = new C472721(continuation);
            }
        }
        Object objGetCostBasisDetails = c472721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c472721.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCostBasisDetails);
            Request<GetCostBasisDetailsRequestDto> request = new Request<>(getCostBasisDetailsRequestDto, null, 2, null);
            c472721.label = 1;
            objGetCostBasisDetails = GetCostBasisDetails(request, c472721);
            if (objGetCostBasisDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCostBasisDetails);
        }
        return ((Response) objGetCostBasisDetails).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCostBasisDetails(Request<GetCostBasisDetailsRequestDto> request, Continuation<? super Response<GetCostBasisDetailsResponseDto>> continuation) {
        C472732 c472732;
        if (continuation instanceof C472732) {
            c472732 = (C472732) continuation;
            int i = c472732.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c472732.label = i - Integer.MIN_VALUE;
            } else {
                c472732 = new C472732(continuation);
            }
        }
        C472732 c4727322 = c472732;
        Object objGetCostBasisDetails = c4727322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4727322.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCostBasisDetails);
            NummusServiceRetrofit nummusServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = !Intrinsics.areEqual(request.getData().getAccount_id(), "") ? request.getData().getAccount_id() : null;
            String source_id = !Intrinsics.areEqual(request.getData().getSource_id(), "") ? request.getData().getSource_id() : null;
            String source_type = Intrinsics.areEqual(request.getData().getSource_type(), "") ? null : request.getData().getSource_type();
            c4727322.label = 1;
            objGetCostBasisDetails = nummusServiceRetrofit.GetCostBasisDetails(metadata, account_id, source_id, source_type, c4727322);
            if (objGetCostBasisDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCostBasisDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCostBasisDetails);
    }
}
