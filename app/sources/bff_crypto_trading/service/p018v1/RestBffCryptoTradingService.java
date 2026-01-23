package bff_crypto_trading.service.p018v1;

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
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestBffCryptoTradingService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0096@¢\u0006\u0004\b\u001c\u0010\rJ$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096@¢\u0006\u0004\b \u0010\rJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J$\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0096@¢\u0006\u0004\b#\u0010\rJ\u0018\u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020%H\u0096@¢\u0006\u0004\b'\u0010(J$\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020%0\u000bH\u0096@¢\u0006\u0004\b'\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)¨\u0006*"}, m3636d2 = {"Lbff_crypto_trading/service/v1/RestBffCryptoTradingService;", "Lbff_crypto_trading/service/v1/BffCryptoTradingService;", "Lbff_crypto_trading/service/v1/BffCryptoTradingServiceRetrofit;", "retrofit", "<init>", "(Lbff_crypto_trading/service/v1/BffCryptoTradingServiceRetrofit;)V", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsRequestDto;", "request", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto;", "GetCryptoI18NRegions", "(Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateRequestDto;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateResponseDto;", "GetCryptoExploreState", "(Lbff_crypto_trading/service/v1/GetCryptoExploreStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateRequestDto;", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateResponseDto;", "GetCryptoDetailPageState", "(Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateLoggedOutRequestDto;", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateLoggedOutResponseDto;", "GetCryptoDetailPageStateLoggedOut", "(Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateLoggedOutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutResponseDto;", "GetCryptoExploreStateLoggedOut", "(Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigRequestDto;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto;", "GetCryptoTokenizedStocksOrderEntryConfig", "Lbff_crypto_trading/service/v1/PostRHWTokenRequestDto;", "Lbff_crypto_trading/service/v1/PostRHWTokenResponseDto;", "PostRHWToken", "(Lbff_crypto_trading/service/v1/PostRHWTokenRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/GetWatchlistExplainerRequestDto;", "Lbff_crypto_trading/service/v1/GetWatchlistExplainerResponseDto;", "GetWatchlistExplainer", "(Lbff_crypto_trading/service/v1/GetWatchlistExplainerRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/BffCryptoTradingServiceRetrofit;", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RestBffCryptoTradingService implements BffCryptoTradingService {
    private final BffCryptoTradingServiceRetrofit retrofit;

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {54}, m3647m = "GetCryptoDetailPageState")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoDetailPageState$1 */
    static final class C32041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32041(Continuation<? super C32041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoDetailPageState((GetCryptoDetailPageStateRequestDto) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {57}, m3647m = "GetCryptoDetailPageState")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoDetailPageState$2 */
    static final class C32052 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32052(Continuation<? super C32052> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoDetailPageState((Request<GetCryptoDetailPageStateRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {64}, m3647m = "GetCryptoDetailPageStateLoggedOut")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoDetailPageStateLoggedOut$1 */
    static final class C32061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32061(Continuation<? super C32061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoDetailPageStateLoggedOut((GetCryptoDetailPageStateLoggedOutRequestDto) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {67}, m3647m = "GetCryptoDetailPageStateLoggedOut")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoDetailPageStateLoggedOut$2 */
    static final class C32072 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32072(Continuation<? super C32072> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoDetailPageStateLoggedOut((Request<GetCryptoDetailPageStateLoggedOutRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {44}, m3647m = "GetCryptoExploreState")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoExploreState$1 */
    static final class C32081 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32081(Continuation<? super C32081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoExploreState((GetCryptoExploreStateRequestDto) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {47}, m3647m = "GetCryptoExploreState")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoExploreState$2 */
    static final class C32092 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32092(Continuation<? super C32092> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoExploreState((Request<GetCryptoExploreStateRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {75}, m3647m = "GetCryptoExploreStateLoggedOut")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoExploreStateLoggedOut$1 */
    static final class C32101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32101(Continuation<? super C32101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoExploreStateLoggedOut((GetCryptoExploreStateLoggedOutRequestDto) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {78}, m3647m = "GetCryptoExploreStateLoggedOut")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoExploreStateLoggedOut$2 */
    static final class C32112 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32112(Continuation<? super C32112> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoExploreStateLoggedOut((Request<GetCryptoExploreStateLoggedOutRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {26}, m3647m = "GetCryptoI18NRegions")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoI18NRegions$1 */
    static final class C32121 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32121(Continuation<? super C32121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoI18NRegions((GetCryptoI18NRegionsRequestDto) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {29}, m3647m = "GetCryptoI18NRegions")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoI18NRegions$2 */
    static final class C32132 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32132(Continuation<? super C32132> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoI18NRegions((Request<GetCryptoI18NRegionsRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {89}, m3647m = "GetCryptoTokenizedStocksOrderEntryConfig")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetCryptoTokenizedStocksOrderEntryConfig$2 */
    static final class C32142 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32142(Continuation<? super C32142> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetCryptoTokenizedStocksOrderEntryConfig(null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "GetWatchlistExplainer")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetWatchlistExplainer$1 */
    static final class C32151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32151(Continuation<? super C32151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetWatchlistExplainer((GetWatchlistExplainerRequestDto) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "GetWatchlistExplainer")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$GetWatchlistExplainer$2 */
    static final class C32162 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32162(Continuation<? super C32162> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.GetWatchlistExplainer((Request<GetWatchlistExplainerRequestDto>) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {115}, m3647m = "PostRHWToken")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$PostRHWToken$1 */
    static final class C32171 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32171(Continuation<? super C32171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.PostRHWToken((PostRHWTokenRequestDto) null, this);
        }
    }

    /* compiled from: RestBffCryptoTradingService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "bff_crypto_trading.service.v1.RestBffCryptoTradingService", m3645f = "RestBffCryptoTradingService.kt", m3646l = {118}, m3647m = "PostRHWToken")
    /* renamed from: bff_crypto_trading.service.v1.RestBffCryptoTradingService$PostRHWToken$2 */
    static final class C32182 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C32182(Continuation<? super C32182> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestBffCryptoTradingService.this.PostRHWToken((Request<PostRHWTokenRequestDto>) null, this);
        }
    }

    public RestBffCryptoTradingService(BffCryptoTradingServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_crypto_trading.service.p018v1.BffCryptoTradingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoI18NRegions(GetCryptoI18NRegionsRequestDto getCryptoI18NRegionsRequestDto, Continuation<? super GetCryptoI18NRegionsResponseDto> continuation) {
        C32121 c32121;
        if (continuation instanceof C32121) {
            c32121 = (C32121) continuation;
            int i = c32121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32121.label = i - Integer.MIN_VALUE;
            } else {
                c32121 = new C32121(continuation);
            }
        }
        Object objGetCryptoI18NRegions = c32121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32121.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoI18NRegions);
            Request<GetCryptoI18NRegionsRequestDto> request = new Request<>(getCryptoI18NRegionsRequestDto, null, 2, null);
            c32121.label = 1;
            objGetCryptoI18NRegions = GetCryptoI18NRegions(request, c32121);
            if (objGetCryptoI18NRegions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoI18NRegions);
        }
        return ((Response) objGetCryptoI18NRegions).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoI18NRegions(Request<GetCryptoI18NRegionsRequestDto> request, Continuation<? super Response<GetCryptoI18NRegionsResponseDto>> continuation) {
        C32132 c32132;
        if (continuation instanceof C32132) {
            c32132 = (C32132) continuation;
            int i = c32132.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32132.label = i - Integer.MIN_VALUE;
            } else {
                c32132 = new C32132(continuation);
            }
        }
        Object objGetCryptoI18NRegions = c32132.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32132.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoI18NRegions);
            BffCryptoTradingServiceRetrofit bffCryptoTradingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c32132.label = 1;
            objGetCryptoI18NRegions = bffCryptoTradingServiceRetrofit.GetCryptoI18NRegions(metadata, c32132);
            if (objGetCryptoI18NRegions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoI18NRegions);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoI18NRegions);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_crypto_trading.service.p018v1.BffCryptoTradingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoExploreState(GetCryptoExploreStateRequestDto getCryptoExploreStateRequestDto, Continuation<? super GetCryptoExploreStateResponseDto> continuation) {
        C32081 c32081;
        if (continuation instanceof C32081) {
            c32081 = (C32081) continuation;
            int i = c32081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32081.label = i - Integer.MIN_VALUE;
            } else {
                c32081 = new C32081(continuation);
            }
        }
        Object objGetCryptoExploreState = c32081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoExploreState);
            Request<GetCryptoExploreStateRequestDto> request = new Request<>(getCryptoExploreStateRequestDto, null, 2, null);
            c32081.label = 1;
            objGetCryptoExploreState = GetCryptoExploreState(request, c32081);
            if (objGetCryptoExploreState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoExploreState);
        }
        return ((Response) objGetCryptoExploreState).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoExploreState(Request<GetCryptoExploreStateRequestDto> request, Continuation<? super Response<GetCryptoExploreStateResponseDto>> continuation) {
        C32092 c32092;
        if (continuation instanceof C32092) {
            c32092 = (C32092) continuation;
            int i = c32092.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32092.label = i - Integer.MIN_VALUE;
            } else {
                c32092 = new C32092(continuation);
            }
        }
        Object objGetCryptoExploreState = c32092.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32092.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoExploreState);
            BffCryptoTradingServiceRetrofit bffCryptoTradingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CryptoAssetTypeDto asset_type = request.getData().getAsset_type();
            c32092.label = 1;
            objGetCryptoExploreState = bffCryptoTradingServiceRetrofit.GetCryptoExploreState(metadata, asset_type, c32092);
            if (objGetCryptoExploreState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoExploreState);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoExploreState);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_crypto_trading.service.p018v1.BffCryptoTradingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoDetailPageState(GetCryptoDetailPageStateRequestDto getCryptoDetailPageStateRequestDto, Continuation<? super GetCryptoDetailPageStateResponseDto> continuation) {
        C32041 c32041;
        if (continuation instanceof C32041) {
            c32041 = (C32041) continuation;
            int i = c32041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32041.label = i - Integer.MIN_VALUE;
            } else {
                c32041 = new C32041(continuation);
            }
        }
        Object objGetCryptoDetailPageState = c32041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoDetailPageState);
            Request<GetCryptoDetailPageStateRequestDto> request = new Request<>(getCryptoDetailPageStateRequestDto, null, 2, null);
            c32041.label = 1;
            objGetCryptoDetailPageState = GetCryptoDetailPageState(request, c32041);
            if (objGetCryptoDetailPageState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoDetailPageState);
        }
        return ((Response) objGetCryptoDetailPageState).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoDetailPageState(Request<GetCryptoDetailPageStateRequestDto> request, Continuation<? super Response<GetCryptoDetailPageStateResponseDto>> continuation) {
        C32052 c32052;
        if (continuation instanceof C32052) {
            c32052 = (C32052) continuation;
            int i = c32052.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32052.label = i - Integer.MIN_VALUE;
            } else {
                c32052 = new C32052(continuation);
            }
        }
        Object objGetCryptoDetailPageState = c32052.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32052.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoDetailPageState);
            BffCryptoTradingServiceRetrofit bffCryptoTradingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String currency_pair_id = !Intrinsics.areEqual(request.getData().getCurrency_pair_id(), "") ? request.getData().getCurrency_pair_id() : null;
            c32052.label = 1;
            objGetCryptoDetailPageState = bffCryptoTradingServiceRetrofit.GetCryptoDetailPageState(metadata, currency_pair_id, c32052);
            if (objGetCryptoDetailPageState == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoDetailPageState);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoDetailPageState);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_crypto_trading.service.p018v1.BffCryptoTradingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoDetailPageStateLoggedOut(GetCryptoDetailPageStateLoggedOutRequestDto getCryptoDetailPageStateLoggedOutRequestDto, Continuation<? super GetCryptoDetailPageStateLoggedOutResponseDto> continuation) {
        C32061 c32061;
        if (continuation instanceof C32061) {
            c32061 = (C32061) continuation;
            int i = c32061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32061.label = i - Integer.MIN_VALUE;
            } else {
                c32061 = new C32061(continuation);
            }
        }
        Object objGetCryptoDetailPageStateLoggedOut = c32061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoDetailPageStateLoggedOut);
            Request<GetCryptoDetailPageStateLoggedOutRequestDto> request = new Request<>(getCryptoDetailPageStateLoggedOutRequestDto, null, 2, null);
            c32061.label = 1;
            objGetCryptoDetailPageStateLoggedOut = GetCryptoDetailPageStateLoggedOut(request, c32061);
            if (objGetCryptoDetailPageStateLoggedOut == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoDetailPageStateLoggedOut);
        }
        return ((Response) objGetCryptoDetailPageStateLoggedOut).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoDetailPageStateLoggedOut(Request<GetCryptoDetailPageStateLoggedOutRequestDto> request, Continuation<? super Response<GetCryptoDetailPageStateLoggedOutResponseDto>> continuation) {
        C32072 c32072;
        if (continuation instanceof C32072) {
            c32072 = (C32072) continuation;
            int i = c32072.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32072.label = i - Integer.MIN_VALUE;
            } else {
                c32072 = new C32072(continuation);
            }
        }
        Object objGetCryptoDetailPageStateLoggedOut = c32072.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32072.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoDetailPageStateLoggedOut);
            BffCryptoTradingServiceRetrofit bffCryptoTradingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String region = request.getData().getRegion();
            String currency_pair_id = !Intrinsics.areEqual(request.getData().getCurrency_pair_id(), "") ? request.getData().getCurrency_pair_id() : null;
            c32072.label = 1;
            objGetCryptoDetailPageStateLoggedOut = bffCryptoTradingServiceRetrofit.GetCryptoDetailPageStateLoggedOut(metadata, region, currency_pair_id, c32072);
            if (objGetCryptoDetailPageStateLoggedOut == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoDetailPageStateLoggedOut);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoDetailPageStateLoggedOut);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_crypto_trading.service.p018v1.BffCryptoTradingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoExploreStateLoggedOut(GetCryptoExploreStateLoggedOutRequestDto getCryptoExploreStateLoggedOutRequestDto, Continuation<? super GetCryptoExploreStateLoggedOutResponseDto> continuation) {
        C32101 c32101;
        if (continuation instanceof C32101) {
            c32101 = (C32101) continuation;
            int i = c32101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32101.label = i - Integer.MIN_VALUE;
            } else {
                c32101 = new C32101(continuation);
            }
        }
        Object objGetCryptoExploreStateLoggedOut = c32101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoExploreStateLoggedOut);
            Request<GetCryptoExploreStateLoggedOutRequestDto> request = new Request<>(getCryptoExploreStateLoggedOutRequestDto, null, 2, null);
            c32101.label = 1;
            objGetCryptoExploreStateLoggedOut = GetCryptoExploreStateLoggedOut(request, c32101);
            if (objGetCryptoExploreStateLoggedOut == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoExploreStateLoggedOut);
        }
        return ((Response) objGetCryptoExploreStateLoggedOut).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoExploreStateLoggedOut(Request<GetCryptoExploreStateLoggedOutRequestDto> request, Continuation<? super Response<GetCryptoExploreStateLoggedOutResponseDto>> continuation) {
        C32112 c32112;
        if (continuation instanceof C32112) {
            c32112 = (C32112) continuation;
            int i = c32112.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32112.label = i - Integer.MIN_VALUE;
            } else {
                c32112 = new C32112(continuation);
            }
        }
        Object objGetCryptoExploreStateLoggedOut = c32112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoExploreStateLoggedOut);
            BffCryptoTradingServiceRetrofit bffCryptoTradingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String region = request.getData().getRegion();
            CryptoAssetTypeDto asset_type = request.getData().getAsset_type();
            c32112.label = 1;
            objGetCryptoExploreStateLoggedOut = bffCryptoTradingServiceRetrofit.GetCryptoExploreStateLoggedOut(metadata, region, asset_type, c32112);
            if (objGetCryptoExploreStateLoggedOut == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoExploreStateLoggedOut);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoExploreStateLoggedOut);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_crypto_trading.service.p018v1.BffCryptoTradingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCryptoTokenizedStocksOrderEntryConfig(Request<GetCryptoTokenizedStocksOrderEntryConfigRequestDto> request, Continuation<? super Response<GetCryptoTokenizedStocksOrderEntryConfigResponseDto>> continuation) {
        C32142 c32142;
        if (continuation instanceof C32142) {
            c32142 = (C32142) continuation;
            int i = c32142.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32142.label = i - Integer.MIN_VALUE;
            } else {
                c32142 = new C32142(continuation);
            }
        }
        Object objGetCryptoTokenizedStocksOrderEntryConfig = c32142.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32142.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCryptoTokenizedStocksOrderEntryConfig);
            BffCryptoTradingServiceRetrofit bffCryptoTradingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String currency_pair_id = !Intrinsics.areEqual(request.getData().getCurrency_pair_id(), "") ? request.getData().getCurrency_pair_id() : null;
            c32142.label = 1;
            objGetCryptoTokenizedStocksOrderEntryConfig = bffCryptoTradingServiceRetrofit.GetCryptoTokenizedStocksOrderEntryConfig(metadata, currency_pair_id, c32142);
            if (objGetCryptoTokenizedStocksOrderEntryConfig == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCryptoTokenizedStocksOrderEntryConfig);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCryptoTokenizedStocksOrderEntryConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_crypto_trading.service.p018v1.BffCryptoTradingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PostRHWToken(PostRHWTokenRequestDto postRHWTokenRequestDto, Continuation<? super PostRHWTokenResponseDto> continuation) {
        C32171 c32171;
        if (continuation instanceof C32171) {
            c32171 = (C32171) continuation;
            int i = c32171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32171.label = i - Integer.MIN_VALUE;
            } else {
                c32171 = new C32171(continuation);
            }
        }
        Object objPostRHWToken = c32171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPostRHWToken);
            Request<PostRHWTokenRequestDto> request = new Request<>(postRHWTokenRequestDto, null, 2, null);
            c32171.label = 1;
            objPostRHWToken = PostRHWToken(request, c32171);
            if (objPostRHWToken == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPostRHWToken);
        }
        return ((Response) objPostRHWToken).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PostRHWToken(Request<PostRHWTokenRequestDto> request, Continuation<? super Response<PostRHWTokenResponseDto>> continuation) {
        C32182 c32182;
        if (continuation instanceof C32182) {
            c32182 = (C32182) continuation;
            int i = c32182.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32182.label = i - Integer.MIN_VALUE;
            } else {
                c32182 = new C32182(continuation);
            }
        }
        Object objPostRHWToken = c32182.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32182.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPostRHWToken);
            BffCryptoTradingServiceRetrofit bffCryptoTradingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            PostRHWTokenRequestDto data = request.getData();
            c32182.label = 1;
            objPostRHWToken = bffCryptoTradingServiceRetrofit.PostRHWToken(metadata, data, c32182);
            if (objPostRHWToken == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPostRHWToken);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objPostRHWToken);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bff_crypto_trading.service.p018v1.BffCryptoTradingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetWatchlistExplainer(GetWatchlistExplainerRequestDto getWatchlistExplainerRequestDto, Continuation<? super GetWatchlistExplainerResponseDto> continuation) {
        C32151 c32151;
        if (continuation instanceof C32151) {
            c32151 = (C32151) continuation;
            int i = c32151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32151.label = i - Integer.MIN_VALUE;
            } else {
                c32151 = new C32151(continuation);
            }
        }
        Object objGetWatchlistExplainer = c32151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetWatchlistExplainer);
            Request<GetWatchlistExplainerRequestDto> request = new Request<>(getWatchlistExplainerRequestDto, null, 2, null);
            c32151.label = 1;
            objGetWatchlistExplainer = GetWatchlistExplainer(request, c32151);
            if (objGetWatchlistExplainer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetWatchlistExplainer);
        }
        return ((Response) objGetWatchlistExplainer).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetWatchlistExplainer(Request<GetWatchlistExplainerRequestDto> request, Continuation<? super Response<GetWatchlistExplainerResponseDto>> continuation) {
        C32162 c32162;
        if (continuation instanceof C32162) {
            c32162 = (C32162) continuation;
            int i = c32162.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32162.label = i - Integer.MIN_VALUE;
            } else {
                c32162 = new C32162(continuation);
            }
        }
        Object objGetWatchlistExplainer = c32162.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32162.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetWatchlistExplainer);
            BffCryptoTradingServiceRetrofit bffCryptoTradingServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c32162.label = 1;
            objGetWatchlistExplainer = bffCryptoTradingServiceRetrofit.GetWatchlistExplainer(metadata, c32162);
            if (objGetWatchlistExplainer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetWatchlistExplainer);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetWatchlistExplainer);
    }
}
