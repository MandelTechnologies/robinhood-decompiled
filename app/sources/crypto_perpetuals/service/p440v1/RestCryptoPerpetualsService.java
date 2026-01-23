package crypto_perpetuals.service.p440v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import crypto_perpetuals.order.p438v1.OrderStatusDto;
import crypto_perpetuals.order.p438v1.OrderTypeDto;
import java.util.List;
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

/* compiled from: RestCryptoPerpetualsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0096@¢\u0006\u0004\b\u001c\u0010\rJ$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096@¢\u0006\u0004\b \u0010\rJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J$\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0096@¢\u0006\u0004\b#\u0010\rJ\u0018\u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020%H\u0096@¢\u0006\u0004\b'\u0010(J$\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020%0\u000bH\u0096@¢\u0006\u0004\b'\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)¨\u0006*"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/RestCryptoPerpetualsService;", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsServiceRetrofit;", "retrofit", "<init>", "(Lcrypto_perpetuals/service/v1/CryptoPerpetualsServiceRetrofit;)V", "Lcrypto_perpetuals/service/v1/GetAccountRequestDto;", "request", "Lcrypto_perpetuals/service/v1/GetAccountResponseDto;", "GetAccount", "(Lcrypto_perpetuals/service/v1/GetAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/GetContractRequestDto;", "Lcrypto_perpetuals/service/v1/GetContractResponseDto;", "GetContract", "(Lcrypto_perpetuals/service/v1/GetContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/ListContractRequestDto;", "Lcrypto_perpetuals/service/v1/ListContractResponseDto;", "ListContract", "(Lcrypto_perpetuals/service/v1/ListContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/GetMarginEditRequestDto;", "Lcrypto_perpetuals/service/v1/GetMarginEditResponseDto;", "GetMarginEdit", "(Lcrypto_perpetuals/service/v1/GetMarginEditRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/ListMarginEditsRequestDto;", "Lcrypto_perpetuals/service/v1/ListMarginEditsResponseDto;", "ListMarginEdits", "(Lcrypto_perpetuals/service/v1/ListMarginEditsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/GetOrderRequestDto;", "Lcrypto_perpetuals/service/v1/GetOrderResponseDto;", "GetOrder", "Lcrypto_perpetuals/service/v1/ListOrderRequestDto;", "Lcrypto_perpetuals/service/v1/ListOrderResponseDto;", "ListOrder", "(Lcrypto_perpetuals/service/v1/ListOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/ValidateOrderPriceRequestDto;", "Lcrypto_perpetuals/service/v1/ValidateOrderPriceResponseDto;", "ValidateOrderPrice", "(Lcrypto_perpetuals/service/v1/ValidateOrderPriceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsServiceRetrofit;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class RestCryptoPerpetualsService implements CryptoPerpetualsService {
    private final CryptoPerpetualsServiceRetrofit retrofit;

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {28}, m3647m = "GetAccount")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$GetAccount$1 */
    static final class C443261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443261(Continuation<? super C443261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.GetAccount((GetAccountRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {35}, m3647m = "GetAccount")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$GetAccount$2 */
    static final class C443272 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443272(Continuation<? super C443272> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.GetAccount((Request<GetAccountRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {93}, m3647m = "GetContract")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$GetContract$1 */
    static final class C443281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443281(Continuation<? super C443281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.GetContract((GetContractRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {100}, m3647m = "GetContract")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$GetContract$2 */
    static final class C443292 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443292(Continuation<? super C443292> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.GetContract((Request<GetContractRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "GetMarginEdit")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$GetMarginEdit$1 */
    static final class C443301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443301(Continuation<? super C443301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.GetMarginEdit((GetMarginEditRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "GetMarginEdit")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$GetMarginEdit$2 */
    static final class C443312 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443312(Continuation<? super C443312> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.GetMarginEdit((Request<GetMarginEditRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, m3647m = "GetOrder")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$GetOrder$2 */
    static final class C443322 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443322(Continuation<? super C443322> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.GetOrder(null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {110}, m3647m = "ListContract")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$ListContract$1 */
    static final class C443331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443331(Continuation<? super C443331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.ListContract((ListContractRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {116}, m3647m = "ListContract")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$ListContract$2 */
    static final class C443342 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443342(Continuation<? super C443342> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.ListContract((Request<ListContractRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "ListMarginEdits")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$ListMarginEdits$1 */
    static final class C443351 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443351(Continuation<? super C443351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.ListMarginEdits((ListMarginEditsRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {182}, m3647m = "ListMarginEdits")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$ListMarginEdits$2 */
    static final class C443362 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443362(Continuation<? super C443362> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.ListMarginEdits((Request<ListMarginEditsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {EnumC7081g.f2777x89a9e432}, m3647m = "ListOrder")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$ListOrder$1 */
    static final class C443371 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443371(Continuation<? super C443371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.ListOrder((ListOrderRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m3647m = "ListOrder")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$ListOrder$2 */
    static final class C443382 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443382(Continuation<? super C443382> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.ListOrder((Request<ListOrderRequestDto>) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {395}, m3647m = "ValidateOrderPrice")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$ValidateOrderPrice$1 */
    static final class C443391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443391(Continuation<? super C443391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.ValidateOrderPrice((ValidateOrderPriceRequestDto) null, this);
        }
    }

    /* compiled from: RestCryptoPerpetualsService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "crypto_perpetuals.service.v1.RestCryptoPerpetualsService", m3645f = "RestCryptoPerpetualsService.kt", m3646l = {401}, m3647m = "ValidateOrderPrice")
    /* renamed from: crypto_perpetuals.service.v1.RestCryptoPerpetualsService$ValidateOrderPrice$2 */
    static final class C443402 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C443402(Continuation<? super C443402> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCryptoPerpetualsService.this.ValidateOrderPrice((Request<ValidateOrderPriceRequestDto>) null, this);
        }
    }

    public RestCryptoPerpetualsService(CryptoPerpetualsServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto_perpetuals.service.p440v1.CryptoPerpetualsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccount(GetAccountRequestDto getAccountRequestDto, Continuation<? super GetAccountResponseDto> continuation) {
        C443261 c443261;
        if (continuation instanceof C443261) {
            c443261 = (C443261) continuation;
            int i = c443261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443261.label = i - Integer.MIN_VALUE;
            } else {
                c443261 = new C443261(continuation);
            }
        }
        Object objGetAccount = c443261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccount);
            Request<GetAccountRequestDto> request = new Request<>(getAccountRequestDto, null, 2, null);
            c443261.label = 1;
            objGetAccount = GetAccount(request, c443261);
            if (objGetAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccount);
        }
        return ((Response) objGetAccount).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccount(Request<GetAccountRequestDto> request, Continuation<? super Response<GetAccountResponseDto>> continuation) {
        C443272 c443272;
        if (continuation instanceof C443272) {
            c443272 = (C443272) continuation;
            int i = c443272.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443272.label = i - Integer.MIN_VALUE;
            } else {
                c443272 = new C443272(continuation);
            }
        }
        Object objGetAccount = c443272.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443272.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccount);
            CryptoPerpetualsServiceRetrofit cryptoPerpetualsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            Boolean boolBoxBoolean = request.getData().getSuppress_account_not_found() ? boxing.boxBoolean(request.getData().getSuppress_account_not_found()) : null;
            c443272.label = 1;
            objGetAccount = cryptoPerpetualsServiceRetrofit.GetAccount(metadata, boolBoxBoolean, c443272);
            if (objGetAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccount);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAccount);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto_perpetuals.service.p440v1.CryptoPerpetualsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetContract(GetContractRequestDto getContractRequestDto, Continuation<? super GetContractResponseDto> continuation) {
        C443281 c443281;
        if (continuation instanceof C443281) {
            c443281 = (C443281) continuation;
            int i = c443281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443281.label = i - Integer.MIN_VALUE;
            } else {
                c443281 = new C443281(continuation);
            }
        }
        Object objGetContract = c443281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetContract);
            Request<GetContractRequestDto> request = new Request<>(getContractRequestDto, null, 2, null);
            c443281.label = 1;
            objGetContract = GetContract(request, c443281);
            if (objGetContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetContract);
        }
        return ((Response) objGetContract).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetContract(Request<GetContractRequestDto> request, Continuation<? super Response<GetContractResponseDto>> continuation) {
        C443292 c443292;
        if (continuation instanceof C443292) {
            c443292 = (C443292) continuation;
            int i = c443292.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443292.label = i - Integer.MIN_VALUE;
            } else {
                c443292 = new C443292(continuation);
            }
        }
        Object objGetContract = c443292.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443292.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetContract);
            CryptoPerpetualsServiceRetrofit cryptoPerpetualsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String contract_id = request.getData().getContract_id();
            c443292.label = 1;
            objGetContract = cryptoPerpetualsServiceRetrofit.GetContract(metadata, contract_id, c443292);
            if (objGetContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetContract);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetContract);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto_perpetuals.service.p440v1.CryptoPerpetualsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListContract(ListContractRequestDto listContractRequestDto, Continuation<? super ListContractResponseDto> continuation) {
        C443331 c443331;
        if (continuation instanceof C443331) {
            c443331 = (C443331) continuation;
            int i = c443331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443331.label = i - Integer.MIN_VALUE;
            } else {
                c443331 = new C443331(continuation);
            }
        }
        Object objListContract = c443331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443331.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListContract);
            Request<ListContractRequestDto> request = new Request<>(listContractRequestDto, null, 2, null);
            c443331.label = 1;
            objListContract = ListContract(request, c443331);
            if (objListContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListContract);
        }
        return ((Response) objListContract).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListContract(Request<ListContractRequestDto> request, Continuation<? super Response<ListContractResponseDto>> continuation) {
        C443342 c443342;
        if (continuation instanceof C443342) {
            c443342 = (C443342) continuation;
            int i = c443342.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443342.label = i - Integer.MIN_VALUE;
            } else {
                c443342 = new C443342(continuation);
            }
        }
        Object objListContract = c443342.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443342.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListContract);
            CryptoPerpetualsServiceRetrofit cryptoPerpetualsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String query = request.getData().getQuery();
            c443342.label = 1;
            objListContract = cryptoPerpetualsServiceRetrofit.ListContract(metadata, query, c443342);
            if (objListContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListContract);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListContract);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto_perpetuals.service.p440v1.CryptoPerpetualsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMarginEdit(GetMarginEditRequestDto getMarginEditRequestDto, Continuation<? super GetMarginEditResponseDto> continuation) {
        C443301 c443301;
        if (continuation instanceof C443301) {
            c443301 = (C443301) continuation;
            int i = c443301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443301.label = i - Integer.MIN_VALUE;
            } else {
                c443301 = new C443301(continuation);
            }
        }
        Object objGetMarginEdit = c443301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMarginEdit);
            Request<GetMarginEditRequestDto> request = new Request<>(getMarginEditRequestDto, null, 2, null);
            c443301.label = 1;
            objGetMarginEdit = GetMarginEdit(request, c443301);
            if (objGetMarginEdit == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMarginEdit);
        }
        return ((Response) objGetMarginEdit).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMarginEdit(Request<GetMarginEditRequestDto> request, Continuation<? super Response<GetMarginEditResponseDto>> continuation) {
        C443312 c443312;
        if (continuation instanceof C443312) {
            c443312 = (C443312) continuation;
            int i = c443312.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443312.label = i - Integer.MIN_VALUE;
            } else {
                c443312 = new C443312(continuation);
            }
        }
        Object objGetMarginEdit = c443312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMarginEdit);
            CryptoPerpetualsServiceRetrofit cryptoPerpetualsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String margin_edit_id = request.getData().getMargin_edit_id();
            c443312.label = 1;
            objGetMarginEdit = cryptoPerpetualsServiceRetrofit.GetMarginEdit(metadata, margin_edit_id, c443312);
            if (objGetMarginEdit == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMarginEdit);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetMarginEdit);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto_perpetuals.service.p440v1.CryptoPerpetualsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListMarginEdits(ListMarginEditsRequestDto listMarginEditsRequestDto, Continuation<? super ListMarginEditsResponseDto> continuation) {
        C443351 c443351;
        if (continuation instanceof C443351) {
            c443351 = (C443351) continuation;
            int i = c443351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443351.label = i - Integer.MIN_VALUE;
            } else {
                c443351 = new C443351(continuation);
            }
        }
        Object objListMarginEdits = c443351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListMarginEdits);
            Request<ListMarginEditsRequestDto> request = new Request<>(listMarginEditsRequestDto, null, 2, null);
            c443351.label = 1;
            objListMarginEdits = ListMarginEdits(request, c443351);
            if (objListMarginEdits == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListMarginEdits);
        }
        return ((Response) objListMarginEdits).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListMarginEdits(Request<ListMarginEditsRequestDto> request, Continuation<? super Response<ListMarginEditsResponseDto>> continuation) {
        C443362 c443362;
        if (continuation instanceof C443362) {
            c443362 = (C443362) continuation;
            int i = c443362.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443362.label = i - Integer.MIN_VALUE;
            } else {
                c443362 = new C443362(continuation);
            }
        }
        C443362 c4433622 = c443362;
        Object objListMarginEdits = c4433622.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4433622.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListMarginEdits);
            CryptoPerpetualsServiceRetrofit cryptoPerpetualsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String contract_id = request.getData().getContract_id();
            Instant updated_at_gte = request.getData().getUpdated_at_gte();
            Integer page_size = request.getData().getPage_size();
            String token = request.getData().getToken();
            c4433622.label = 1;
            objListMarginEdits = cryptoPerpetualsServiceRetrofit.ListMarginEdits(metadata, contract_id, updated_at_gte, page_size, token, c4433622);
            if (objListMarginEdits == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListMarginEdits);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListMarginEdits);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto_perpetuals.service.p440v1.CryptoPerpetualsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrder(Request<GetOrderRequestDto> request, Continuation<? super Response<GetOrderResponseDto>> continuation) {
        C443322 c443322;
        if (continuation instanceof C443322) {
            c443322 = (C443322) continuation;
            int i = c443322.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443322.label = i - Integer.MIN_VALUE;
            } else {
                c443322 = new C443322(continuation);
            }
        }
        Object objGetOrder = c443322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443322.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrder);
            CryptoPerpetualsServiceRetrofit cryptoPerpetualsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String order_id = request.getData().getOrder_id();
            c443322.label = 1;
            objGetOrder = cryptoPerpetualsServiceRetrofit.GetOrder(metadata, order_id, c443322);
            if (objGetOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOrder);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto_perpetuals.service.p440v1.CryptoPerpetualsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListOrder(ListOrderRequestDto listOrderRequestDto, Continuation<? super ListOrderResponseDto> continuation) {
        C443371 c443371;
        if (continuation instanceof C443371) {
            c443371 = (C443371) continuation;
            int i = c443371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443371.label = i - Integer.MIN_VALUE;
            } else {
                c443371 = new C443371(continuation);
            }
        }
        Object objListOrder = c443371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443371.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListOrder);
            Request<ListOrderRequestDto> request = new Request<>(listOrderRequestDto, null, 2, null);
            c443371.label = 1;
            objListOrder = ListOrder(request, c443371);
            if (objListOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListOrder);
        }
        return ((Response) objListOrder).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListOrder(Request<ListOrderRequestDto> request, Continuation<? super Response<ListOrderResponseDto>> continuation) {
        C443382 c443382;
        if (continuation instanceof C443382) {
            c443382 = (C443382) continuation;
            int i = c443382.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443382.label = i - Integer.MIN_VALUE;
            } else {
                c443382 = new C443382(continuation);
            }
        }
        C443382 c4433822 = c443382;
        Object objListOrder = c4433822.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4433822.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListOrder);
            CryptoPerpetualsServiceRetrofit cryptoPerpetualsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            List<OrderStatusDto> status_filter = request.getData().getStatus_filter();
            List<OrderTypeDto> type_filter = request.getData().getType_filter();
            List<String> contract_id_filter = request.getData().getContract_id_filter();
            Instant updated_at_gte = request.getData().getUpdated_at_gte();
            Instant instantOfEpochSecond = Instant.ofEpochSecond(0L, 0L);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
            Instant updated_at_gte2 = !Intrinsics.areEqual(updated_at_gte, instantOfEpochSecond) ? request.getData().getUpdated_at_gte() : null;
            Integer page_size = request.getData().getPage_size();
            String token = request.getData().getToken();
            c4433822.label = 1;
            objListOrder = cryptoPerpetualsServiceRetrofit.ListOrder(metadata, status_filter, type_filter, contract_id_filter, updated_at_gte2, page_size, token, c4433822);
            if (objListOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListOrder);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // crypto_perpetuals.service.p440v1.CryptoPerpetualsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ValidateOrderPrice(ValidateOrderPriceRequestDto validateOrderPriceRequestDto, Continuation<? super ValidateOrderPriceResponseDto> continuation) {
        C443391 c443391;
        if (continuation instanceof C443391) {
            c443391 = (C443391) continuation;
            int i = c443391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443391.label = i - Integer.MIN_VALUE;
            } else {
                c443391 = new C443391(continuation);
            }
        }
        Object objValidateOrderPrice = c443391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateOrderPrice);
            Request<ValidateOrderPriceRequestDto> request = new Request<>(validateOrderPriceRequestDto, null, 2, null);
            c443391.label = 1;
            objValidateOrderPrice = ValidateOrderPrice(request, c443391);
            if (objValidateOrderPrice == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objValidateOrderPrice);
        }
        return ((Response) objValidateOrderPrice).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ValidateOrderPrice(Request<ValidateOrderPriceRequestDto> request, Continuation<? super Response<ValidateOrderPriceResponseDto>> continuation) {
        C443402 c443402;
        if (continuation instanceof C443402) {
            c443402 = (C443402) continuation;
            int i = c443402.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c443402.label = i - Integer.MIN_VALUE;
            } else {
                c443402 = new C443402(continuation);
            }
        }
        Object objValidateOrderPrice = c443402.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c443402.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateOrderPrice);
            CryptoPerpetualsServiceRetrofit cryptoPerpetualsServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            ValidateOrderPriceRequestDto data = request.getData();
            c443402.label = 1;
            objValidateOrderPrice = cryptoPerpetualsServiceRetrofit.ValidateOrderPrice(metadata, data, c443402);
            if (objValidateOrderPrice == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objValidateOrderPrice);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objValidateOrderPrice);
    }
}
