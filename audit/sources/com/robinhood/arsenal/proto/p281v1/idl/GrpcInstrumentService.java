package com.robinhood.arsenal.proto.p281v1.idl;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcInstrumentService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020 0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010\b\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020$0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020(0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010*\u001a\u00020+2\u0006\u0010\b\u001a\u00020,H\u0096@¢\u0006\u0002\u0010-J\"\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020,0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010.\u001a\u00020/2\u0006\u0010\b\u001a\u000200H\u0096@¢\u0006\u0002\u00101J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002000\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u00102\u001a\u0002032\u0006\u0010\b\u001a\u000204H\u0096@¢\u0006\u0002\u00105J\"\u00102\u001a\b\u0012\u0004\u0012\u0002030\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002040\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u00106\u001a\u0002072\u0006\u0010\b\u001a\u000208H\u0096@¢\u0006\u0002\u00109J\"\u00106\u001a\b\u0012\u0004\u0012\u0002070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002080\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010:\u001a\u00020;2\u0006\u0010\b\u001a\u00020<H\u0096@¢\u0006\u0002\u0010=J\"\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020<0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010>\u001a\u00020?2\u0006\u0010\b\u001a\u00020@H\u0096@¢\u0006\u0002\u0010AJ\"\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020@0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010B\u001a\u00020C2\u0006\u0010\b\u001a\u00020DH\u0096@¢\u0006\u0002\u0010EJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020D0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010F\u001a\u00020G2\u0006\u0010\b\u001a\u00020HH\u0096@¢\u0006\u0002\u0010IJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020H0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010J\u001a\u00020K2\u0006\u0010\b\u001a\u00020LH\u0096@¢\u0006\u0002\u0010MJ\"\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020L0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010N\u001a\u00020O2\u0006\u0010\b\u001a\u00020PH\u0096@¢\u0006\u0002\u0010QJ\"\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020P0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010R\u001a\u00020S2\u0006\u0010\b\u001a\u00020TH\u0096@¢\u0006\u0002\u0010UJ\"\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020T0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010V\u001a\u00020W2\u0006\u0010\b\u001a\u00020XH\u0096@¢\u0006\u0002\u0010YJ\"\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020X0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010Z\u001a\u00020[2\u0006\u0010\b\u001a\u00020\\H\u0096@¢\u0006\u0002\u0010]J\"\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\\0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GrpcInstrumentService;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "grpcClient", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceClient;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceClient;)V", "GetFuturesContract", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "request", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesContractBySymbol", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListFuturesContracts", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesContractWithTradability", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesProduct", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesProductRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesProductRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesCombinedCommodity", "Lcom/robinhood/arsenal/proto/v1/idl/CombinedCommodityDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesCombinedCommodityRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesCombinedCommodityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetTradingHoursInfo", "Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetTradingHoursInfoRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetTradingHoursInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetTradingSessions", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetTradingSessionsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetTradingSessionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetMarginRequirement", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListFuturesProducts", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListActiveFuturesContractSchedules", "Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CountEventContracts", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CountEvents", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventContract", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventContractRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEventContracts", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEvents", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEvent", "Lcom/robinhood/arsenal/proto/v1/idl/EventDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventBracket", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventBracketRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventBracketRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventTopic", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventTopicRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventTopicRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEventTopics", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListRelevantEventTopics", "Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class GrpcInstrumentService implements InstrumentService {
    private final InstrumentServiceClient grpcClient;

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {67}, m3647m = "CountEventContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$CountEventContracts$1 */
    static final class C316911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316911(Continuation<? super C316911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.CountEventContracts((CountEventContractsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "CountEvents")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$CountEvents$1 */
    static final class C316921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316921(Continuation<? super C316921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.CountEvents((CountEventsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {93}, m3647m = "GetEvent")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetEvent$1 */
    static final class C316931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316931(Continuation<? super C316931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetEvent((GetEventRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {97}, m3647m = "GetEventBracket")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetEventBracket$1 */
    static final class C316941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316941(Continuation<? super C316941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetEventBracket((GetEventBracketRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {78}, m3647m = "GetEventContract")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetEventContract$1 */
    static final class C316951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316951(Continuation<? super C316951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetEventContract((GetEventContractRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {101}, m3647m = "GetEventTopic")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetEventTopic$1 */
    static final class C316961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316961(Continuation<? super C316961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetEventTopic((GetEventTopicRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {37}, m3647m = "GetFuturesCombinedCommodity")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetFuturesCombinedCommodity$1 */
    static final class C316971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316971(Continuation<? super C316971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetFuturesCombinedCommodity((GetFuturesCombinedCommodityRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {17}, m3647m = "GetFuturesContract")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetFuturesContract$1 */
    static final class C316981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316981(Continuation<? super C316981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetFuturesContract((GetFuturesContractRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {21}, m3647m = "GetFuturesContractBySymbol")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetFuturesContractBySymbol$1 */
    static final class C316991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C316991(Continuation<? super C316991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetFuturesContractBySymbol((GetFuturesContractBySymbolRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {29}, m3647m = "GetFuturesContractWithTradability")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetFuturesContractWithTradability$1 */
    static final class C317001 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317001(Continuation<? super C317001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetFuturesContractWithTradability((GetFuturesContractWithTradabilityRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {33}, m3647m = "GetFuturesProduct")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetFuturesProduct$1 */
    static final class C317011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317011(Continuation<? super C317011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetFuturesProduct((GetFuturesProductRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {55}, m3647m = "GetMarginRequirement")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetMarginRequirement$1 */
    static final class C317021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317021(Continuation<? super C317021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetMarginRequirement((GetMarginRequirementRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {41}, m3647m = "GetTradingHoursInfo")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetTradingHoursInfo$1 */
    static final class C317031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317031(Continuation<? super C317031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetTradingHoursInfo((GetTradingHoursInfoRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {48}, m3647m = "GetTradingSessions")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$GetTradingSessions$1 */
    static final class C317041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317041(Continuation<? super C317041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.GetTradingSessions((GetTradingSessionsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {63}, m3647m = "ListActiveFuturesContractSchedules")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$ListActiveFuturesContractSchedules$1 */
    static final class C317051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317051(Continuation<? super C317051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.ListActiveFuturesContractSchedules((ListActiveFuturesContractSchedulesRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {85}, m3647m = "ListEventContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$ListEventContracts$1 */
    static final class C317061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317061(Continuation<? super C317061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.ListEventContracts((ListEventContractsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {105}, m3647m = "ListEventTopics")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$ListEventTopics$1 */
    static final class C317071 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317071(Continuation<? super C317071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.ListEventTopics((ListEventTopicsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {89}, m3647m = "ListEvents")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$ListEvents$1 */
    static final class C317081 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317081(Continuation<? super C317081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.ListEvents((ListEventsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {25}, m3647m = "ListFuturesContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$ListFuturesContracts$1 */
    static final class C317091 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317091(Continuation<? super C317091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.ListFuturesContracts((ListFuturesContractsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {59}, m3647m = "ListFuturesProducts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$ListFuturesProducts$1 */
    static final class C317101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317101(Continuation<? super C317101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.ListFuturesProducts((ListFuturesProductsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService", m3645f = "GrpcInstrumentService.kt", m3646l = {109}, m3647m = "ListRelevantEventTopics")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.GrpcInstrumentService$ListRelevantEventTopics$1 */
    static final class C317111 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317111(Continuation<? super C317111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcInstrumentService.this.ListRelevantEventTopics((ListRelevantEventTopicsRequestDto) null, this);
        }
    }

    public GrpcInstrumentService(InstrumentServiceClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesContract(GetFuturesContractRequestDto getFuturesContractRequestDto, Continuation<? super FuturesContractDto> continuation) {
        C316981 c316981;
        if (continuation instanceof C316981) {
            c316981 = (C316981) continuation;
            int i = c316981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c316981.label = i - Integer.MIN_VALUE;
            } else {
                c316981 = new C316981(continuation);
            }
        }
        Object objGetFuturesContract = c316981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c316981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesContract);
            Request<GetFuturesContractRequestDto> request = new Request<>(getFuturesContractRequestDto, null, 2, null);
            c316981.label = 1;
            objGetFuturesContract = GetFuturesContract(request, c316981);
            if (objGetFuturesContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesContract);
        }
        return ((Response) objGetFuturesContract).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetFuturesContract(Request<GetFuturesContractRequestDto> request, Continuation<? super Response<FuturesContractDto>> continuation) {
        return Response2.handleGrpcCall(request, FuturesContractDto.INSTANCE, this.grpcClient.GetFuturesContract(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesContractBySymbol(GetFuturesContractBySymbolRequestDto getFuturesContractBySymbolRequestDto, Continuation<? super GetFuturesContractBySymbolResponseDto> continuation) {
        C316991 c316991;
        if (continuation instanceof C316991) {
            c316991 = (C316991) continuation;
            int i = c316991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c316991.label = i - Integer.MIN_VALUE;
            } else {
                c316991 = new C316991(continuation);
            }
        }
        Object objGetFuturesContractBySymbol = c316991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c316991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesContractBySymbol);
            Request<GetFuturesContractBySymbolRequestDto> request = new Request<>(getFuturesContractBySymbolRequestDto, null, 2, null);
            c316991.label = 1;
            objGetFuturesContractBySymbol = GetFuturesContractBySymbol(request, c316991);
            if (objGetFuturesContractBySymbol == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesContractBySymbol);
        }
        return ((Response) objGetFuturesContractBySymbol).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetFuturesContractBySymbol(Request<GetFuturesContractBySymbolRequestDto> request, Continuation<? super Response<GetFuturesContractBySymbolResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetFuturesContractBySymbolResponseDto.INSTANCE, this.grpcClient.GetFuturesContractBySymbol(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListFuturesContracts(ListFuturesContractsRequestDto listFuturesContractsRequestDto, Continuation<? super ListFuturesContractsResponseDto> continuation) {
        C317091 c317091;
        if (continuation instanceof C317091) {
            c317091 = (C317091) continuation;
            int i = c317091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317091.label = i - Integer.MIN_VALUE;
            } else {
                c317091 = new C317091(continuation);
            }
        }
        Object objListFuturesContracts = c317091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317091.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListFuturesContracts);
            Request<ListFuturesContractsRequestDto> request = new Request<>(listFuturesContractsRequestDto, null, 2, null);
            c317091.label = 1;
            objListFuturesContracts = ListFuturesContracts(request, c317091);
            if (objListFuturesContracts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListFuturesContracts);
        }
        return ((Response) objListFuturesContracts).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object ListFuturesContracts(Request<ListFuturesContractsRequestDto> request, Continuation<? super Response<ListFuturesContractsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListFuturesContractsResponseDto.INSTANCE, this.grpcClient.ListFuturesContracts(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesContractWithTradability(GetFuturesContractWithTradabilityRequestDto getFuturesContractWithTradabilityRequestDto, Continuation<? super GetFuturesContractWithTradabilityResponseDto> continuation) {
        C317001 c317001;
        if (continuation instanceof C317001) {
            c317001 = (C317001) continuation;
            int i = c317001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317001.label = i - Integer.MIN_VALUE;
            } else {
                c317001 = new C317001(continuation);
            }
        }
        Object objGetFuturesContractWithTradability = c317001.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317001.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesContractWithTradability);
            Request<GetFuturesContractWithTradabilityRequestDto> request = new Request<>(getFuturesContractWithTradabilityRequestDto, null, 2, null);
            c317001.label = 1;
            objGetFuturesContractWithTradability = GetFuturesContractWithTradability(request, c317001);
            if (objGetFuturesContractWithTradability == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesContractWithTradability);
        }
        return ((Response) objGetFuturesContractWithTradability).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetFuturesContractWithTradability(Request<GetFuturesContractWithTradabilityRequestDto> request, Continuation<? super Response<GetFuturesContractWithTradabilityResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetFuturesContractWithTradabilityResponseDto.INSTANCE, this.grpcClient.GetFuturesContractWithTradability(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesProduct(GetFuturesProductRequestDto getFuturesProductRequestDto, Continuation<? super ProductDto> continuation) {
        C317011 c317011;
        if (continuation instanceof C317011) {
            c317011 = (C317011) continuation;
            int i = c317011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317011.label = i - Integer.MIN_VALUE;
            } else {
                c317011 = new C317011(continuation);
            }
        }
        Object objGetFuturesProduct = c317011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesProduct);
            Request<GetFuturesProductRequestDto> request = new Request<>(getFuturesProductRequestDto, null, 2, null);
            c317011.label = 1;
            objGetFuturesProduct = GetFuturesProduct(request, c317011);
            if (objGetFuturesProduct == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesProduct);
        }
        return ((Response) objGetFuturesProduct).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetFuturesProduct(Request<GetFuturesProductRequestDto> request, Continuation<? super Response<ProductDto>> continuation) {
        return Response2.handleGrpcCall(request, ProductDto.INSTANCE, this.grpcClient.GetFuturesProduct(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesCombinedCommodity(GetFuturesCombinedCommodityRequestDto getFuturesCombinedCommodityRequestDto, Continuation<? super CombinedCommodityDto> continuation) {
        C316971 c316971;
        if (continuation instanceof C316971) {
            c316971 = (C316971) continuation;
            int i = c316971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c316971.label = i - Integer.MIN_VALUE;
            } else {
                c316971 = new C316971(continuation);
            }
        }
        Object objGetFuturesCombinedCommodity = c316971.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c316971.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesCombinedCommodity);
            Request<GetFuturesCombinedCommodityRequestDto> request = new Request<>(getFuturesCombinedCommodityRequestDto, null, 2, null);
            c316971.label = 1;
            objGetFuturesCombinedCommodity = GetFuturesCombinedCommodity(request, c316971);
            if (objGetFuturesCombinedCommodity == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesCombinedCommodity);
        }
        return ((Response) objGetFuturesCombinedCommodity).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetFuturesCombinedCommodity(Request<GetFuturesCombinedCommodityRequestDto> request, Continuation<? super Response<CombinedCommodityDto>> continuation) {
        return Response2.handleGrpcCall(request, CombinedCommodityDto.INSTANCE, this.grpcClient.GetFuturesCombinedCommodity(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTradingHoursInfo(GetTradingHoursInfoRequestDto getTradingHoursInfoRequestDto, Continuation<? super TradingHoursInfoDto> continuation) {
        C317031 c317031;
        if (continuation instanceof C317031) {
            c317031 = (C317031) continuation;
            int i = c317031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317031.label = i - Integer.MIN_VALUE;
            } else {
                c317031 = new C317031(continuation);
            }
        }
        Object objGetTradingHoursInfo = c317031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTradingHoursInfo);
            Request<GetTradingHoursInfoRequestDto> request = new Request<>(getTradingHoursInfoRequestDto, null, 2, null);
            c317031.label = 1;
            objGetTradingHoursInfo = GetTradingHoursInfo(request, c317031);
            if (objGetTradingHoursInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTradingHoursInfo);
        }
        return ((Response) objGetTradingHoursInfo).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetTradingHoursInfo(Request<GetTradingHoursInfoRequestDto> request, Continuation<? super Response<TradingHoursInfoDto>> continuation) {
        return Response2.handleGrpcCall(request, TradingHoursInfoDto.INSTANCE, this.grpcClient.GetTradingHoursInfo(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTradingSessions(GetTradingSessionsRequestDto getTradingSessionsRequestDto, Continuation<? super TradingSessionsDto> continuation) {
        C317041 c317041;
        if (continuation instanceof C317041) {
            c317041 = (C317041) continuation;
            int i = c317041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317041.label = i - Integer.MIN_VALUE;
            } else {
                c317041 = new C317041(continuation);
            }
        }
        Object objGetTradingSessions = c317041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTradingSessions);
            Request<GetTradingSessionsRequestDto> request = new Request<>(getTradingSessionsRequestDto, null, 2, null);
            c317041.label = 1;
            objGetTradingSessions = GetTradingSessions(request, c317041);
            if (objGetTradingSessions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTradingSessions);
        }
        return ((Response) objGetTradingSessions).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetTradingSessions(Request<GetTradingSessionsRequestDto> request, Continuation<? super Response<TradingSessionsDto>> continuation) {
        return Response2.handleGrpcCall(request, TradingSessionsDto.INSTANCE, this.grpcClient.GetTradingSessions(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMarginRequirement(GetMarginRequirementRequestDto getMarginRequirementRequestDto, Continuation<? super MarginRequirementDto> continuation) {
        C317021 c317021;
        if (continuation instanceof C317021) {
            c317021 = (C317021) continuation;
            int i = c317021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317021.label = i - Integer.MIN_VALUE;
            } else {
                c317021 = new C317021(continuation);
            }
        }
        Object objGetMarginRequirement = c317021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMarginRequirement);
            Request<GetMarginRequirementRequestDto> request = new Request<>(getMarginRequirementRequestDto, null, 2, null);
            c317021.label = 1;
            objGetMarginRequirement = GetMarginRequirement(request, c317021);
            if (objGetMarginRequirement == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMarginRequirement);
        }
        return ((Response) objGetMarginRequirement).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetMarginRequirement(Request<GetMarginRequirementRequestDto> request, Continuation<? super Response<MarginRequirementDto>> continuation) {
        return Response2.handleGrpcCall(request, MarginRequirementDto.INSTANCE, this.grpcClient.GetMarginRequirement(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListFuturesProducts(ListFuturesProductsRequestDto listFuturesProductsRequestDto, Continuation<? super ListFuturesProductsResponseDto> continuation) {
        C317101 c317101;
        if (continuation instanceof C317101) {
            c317101 = (C317101) continuation;
            int i = c317101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317101.label = i - Integer.MIN_VALUE;
            } else {
                c317101 = new C317101(continuation);
            }
        }
        Object objListFuturesProducts = c317101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListFuturesProducts);
            Request<ListFuturesProductsRequestDto> request = new Request<>(listFuturesProductsRequestDto, null, 2, null);
            c317101.label = 1;
            objListFuturesProducts = ListFuturesProducts(request, c317101);
            if (objListFuturesProducts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListFuturesProducts);
        }
        return ((Response) objListFuturesProducts).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object ListFuturesProducts(Request<ListFuturesProductsRequestDto> request, Continuation<? super Response<ListFuturesProductsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListFuturesProductsResponseDto.INSTANCE, this.grpcClient.ListFuturesProducts(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListActiveFuturesContractSchedules(ListActiveFuturesContractSchedulesRequestDto listActiveFuturesContractSchedulesRequestDto, Continuation<? super ListActiveFuturesContractSchedulesResponseDto> continuation) {
        C317051 c317051;
        if (continuation instanceof C317051) {
            c317051 = (C317051) continuation;
            int i = c317051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317051.label = i - Integer.MIN_VALUE;
            } else {
                c317051 = new C317051(continuation);
            }
        }
        Object objListActiveFuturesContractSchedules = c317051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListActiveFuturesContractSchedules);
            Request<ListActiveFuturesContractSchedulesRequestDto> request = new Request<>(listActiveFuturesContractSchedulesRequestDto, null, 2, null);
            c317051.label = 1;
            objListActiveFuturesContractSchedules = ListActiveFuturesContractSchedules(request, c317051);
            if (objListActiveFuturesContractSchedules == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListActiveFuturesContractSchedules);
        }
        return ((Response) objListActiveFuturesContractSchedules).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object ListActiveFuturesContractSchedules(Request<ListActiveFuturesContractSchedulesRequestDto> request, Continuation<? super Response<ListActiveFuturesContractSchedulesResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListActiveFuturesContractSchedulesResponseDto.INSTANCE, this.grpcClient.ListActiveFuturesContractSchedules(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CountEventContracts(CountEventContractsRequestDto countEventContractsRequestDto, Continuation<? super CountEventContractsResponseDto> continuation) {
        C316911 c316911;
        if (continuation instanceof C316911) {
            c316911 = (C316911) continuation;
            int i = c316911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c316911.label = i - Integer.MIN_VALUE;
            } else {
                c316911 = new C316911(continuation);
            }
        }
        Object objCountEventContracts = c316911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c316911.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCountEventContracts);
            Request<CountEventContractsRequestDto> request = new Request<>(countEventContractsRequestDto, null, 2, null);
            c316911.label = 1;
            objCountEventContracts = CountEventContracts(request, c316911);
            if (objCountEventContracts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCountEventContracts);
        }
        return ((Response) objCountEventContracts).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object CountEventContracts(Request<CountEventContractsRequestDto> request, Continuation<? super Response<CountEventContractsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, CountEventContractsResponseDto.INSTANCE, this.grpcClient.CountEventContracts(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CountEvents(CountEventsRequestDto countEventsRequestDto, Continuation<? super CountEventsResponseDto> continuation) {
        C316921 c316921;
        if (continuation instanceof C316921) {
            c316921 = (C316921) continuation;
            int i = c316921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c316921.label = i - Integer.MIN_VALUE;
            } else {
                c316921 = new C316921(continuation);
            }
        }
        Object objCountEvents = c316921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c316921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCountEvents);
            Request<CountEventsRequestDto> request = new Request<>(countEventsRequestDto, null, 2, null);
            c316921.label = 1;
            objCountEvents = CountEvents(request, c316921);
            if (objCountEvents == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCountEvents);
        }
        return ((Response) objCountEvents).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object CountEvents(Request<CountEventsRequestDto> request, Continuation<? super Response<CountEventsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, CountEventsResponseDto.INSTANCE, this.grpcClient.CountEvents(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventContract(GetEventContractRequestDto getEventContractRequestDto, Continuation<? super EventContractDto> continuation) {
        C316951 c316951;
        if (continuation instanceof C316951) {
            c316951 = (C316951) continuation;
            int i = c316951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c316951.label = i - Integer.MIN_VALUE;
            } else {
                c316951 = new C316951(continuation);
            }
        }
        Object objGetEventContract = c316951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c316951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventContract);
            Request<GetEventContractRequestDto> request = new Request<>(getEventContractRequestDto, null, 2, null);
            c316951.label = 1;
            objGetEventContract = GetEventContract(request, c316951);
            if (objGetEventContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventContract);
        }
        return ((Response) objGetEventContract).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetEventContract(Request<GetEventContractRequestDto> request, Continuation<? super Response<EventContractDto>> continuation) {
        return Response2.handleGrpcCall(request, EventContractDto.INSTANCE, this.grpcClient.GetEventContract(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEventContracts(ListEventContractsRequestDto listEventContractsRequestDto, Continuation<? super ListEventContractsResponseDto> continuation) {
        C317061 c317061;
        if (continuation instanceof C317061) {
            c317061 = (C317061) continuation;
            int i = c317061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317061.label = i - Integer.MIN_VALUE;
            } else {
                c317061 = new C317061(continuation);
            }
        }
        Object objListEventContracts = c317061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEventContracts);
            Request<ListEventContractsRequestDto> request = new Request<>(listEventContractsRequestDto, null, 2, null);
            c317061.label = 1;
            objListEventContracts = ListEventContracts(request, c317061);
            if (objListEventContracts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEventContracts);
        }
        return ((Response) objListEventContracts).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object ListEventContracts(Request<ListEventContractsRequestDto> request, Continuation<? super Response<ListEventContractsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListEventContractsResponseDto.INSTANCE, this.grpcClient.ListEventContracts(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEvents(ListEventsRequestDto listEventsRequestDto, Continuation<? super ListEventsResponseDto> continuation) {
        C317081 c317081;
        if (continuation instanceof C317081) {
            c317081 = (C317081) continuation;
            int i = c317081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317081.label = i - Integer.MIN_VALUE;
            } else {
                c317081 = new C317081(continuation);
            }
        }
        Object objListEvents = c317081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEvents);
            Request<ListEventsRequestDto> request = new Request<>(listEventsRequestDto, null, 2, null);
            c317081.label = 1;
            objListEvents = ListEvents(request, c317081);
            if (objListEvents == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEvents);
        }
        return ((Response) objListEvents).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object ListEvents(Request<ListEventsRequestDto> request, Continuation<? super Response<ListEventsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListEventsResponseDto.INSTANCE, this.grpcClient.ListEvents(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEvent(GetEventRequestDto getEventRequestDto, Continuation<? super EventDto> continuation) {
        C316931 c316931;
        if (continuation instanceof C316931) {
            c316931 = (C316931) continuation;
            int i = c316931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c316931.label = i - Integer.MIN_VALUE;
            } else {
                c316931 = new C316931(continuation);
            }
        }
        Object objGetEvent = c316931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c316931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEvent);
            Request<GetEventRequestDto> request = new Request<>(getEventRequestDto, null, 2, null);
            c316931.label = 1;
            objGetEvent = GetEvent(request, c316931);
            if (objGetEvent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEvent);
        }
        return ((Response) objGetEvent).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetEvent(Request<GetEventRequestDto> request, Continuation<? super Response<EventDto>> continuation) {
        return Response2.handleGrpcCall(request, EventDto.INSTANCE, this.grpcClient.GetEvent(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventBracket(GetEventBracketRequestDto getEventBracketRequestDto, Continuation<? super EventBracketDto> continuation) {
        C316941 c316941;
        if (continuation instanceof C316941) {
            c316941 = (C316941) continuation;
            int i = c316941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c316941.label = i - Integer.MIN_VALUE;
            } else {
                c316941 = new C316941(continuation);
            }
        }
        Object objGetEventBracket = c316941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c316941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventBracket);
            Request<GetEventBracketRequestDto> request = new Request<>(getEventBracketRequestDto, null, 2, null);
            c316941.label = 1;
            objGetEventBracket = GetEventBracket(request, c316941);
            if (objGetEventBracket == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventBracket);
        }
        return ((Response) objGetEventBracket).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetEventBracket(Request<GetEventBracketRequestDto> request, Continuation<? super Response<EventBracketDto>> continuation) {
        return Response2.handleGrpcCall(request, EventBracketDto.INSTANCE, this.grpcClient.GetEventBracket(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventTopic(GetEventTopicRequestDto getEventTopicRequestDto, Continuation<? super EventTopicDto> continuation) {
        C316961 c316961;
        if (continuation instanceof C316961) {
            c316961 = (C316961) continuation;
            int i = c316961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c316961.label = i - Integer.MIN_VALUE;
            } else {
                c316961 = new C316961(continuation);
            }
        }
        Object objGetEventTopic = c316961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c316961.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventTopic);
            Request<GetEventTopicRequestDto> request = new Request<>(getEventTopicRequestDto, null, 2, null);
            c316961.label = 1;
            objGetEventTopic = GetEventTopic(request, c316961);
            if (objGetEventTopic == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventTopic);
        }
        return ((Response) objGetEventTopic).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object GetEventTopic(Request<GetEventTopicRequestDto> request, Continuation<? super Response<EventTopicDto>> continuation) {
        return Response2.handleGrpcCall(request, EventTopicDto.INSTANCE, this.grpcClient.GetEventTopic(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEventTopics(ListEventTopicsRequestDto listEventTopicsRequestDto, Continuation<? super ListEventTopicsResponseDto> continuation) {
        C317071 c317071;
        if (continuation instanceof C317071) {
            c317071 = (C317071) continuation;
            int i = c317071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317071.label = i - Integer.MIN_VALUE;
            } else {
                c317071 = new C317071(continuation);
            }
        }
        Object objListEventTopics = c317071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317071.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEventTopics);
            Request<ListEventTopicsRequestDto> request = new Request<>(listEventTopicsRequestDto, null, 2, null);
            c317071.label = 1;
            objListEventTopics = ListEventTopics(request, c317071);
            if (objListEventTopics == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEventTopics);
        }
        return ((Response) objListEventTopics).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object ListEventTopics(Request<ListEventTopicsRequestDto> request, Continuation<? super Response<ListEventTopicsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListEventTopicsResponseDto.INSTANCE, this.grpcClient.ListEventTopics(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListRelevantEventTopics(ListRelevantEventTopicsRequestDto listRelevantEventTopicsRequestDto, Continuation<? super ListRelevantEventTopicsResponseDto> continuation) {
        C317111 c317111;
        if (continuation instanceof C317111) {
            c317111 = (C317111) continuation;
            int i = c317111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317111.label = i - Integer.MIN_VALUE;
            } else {
                c317111 = new C317111(continuation);
            }
        }
        Object objListRelevantEventTopics = c317111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317111.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListRelevantEventTopics);
            Request<ListRelevantEventTopicsRequestDto> request = new Request<>(listRelevantEventTopicsRequestDto, null, 2, null);
            c317111.label = 1;
            objListRelevantEventTopics = ListRelevantEventTopics(request, c317111);
            if (objListRelevantEventTopics == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListRelevantEventTopics);
        }
        return ((Response) objListRelevantEventTopics).getData();
    }

    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    public Object ListRelevantEventTopics(Request<ListRelevantEventTopicsRequestDto> request, Continuation<? super Response<ListRelevantEventTopicsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListRelevantEventTopicsResponseDto.INSTANCE, this.grpcClient.ListRelevantEventTopics(), continuation);
    }
}
