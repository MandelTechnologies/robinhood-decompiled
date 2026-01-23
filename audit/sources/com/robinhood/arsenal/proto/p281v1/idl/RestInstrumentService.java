package com.robinhood.arsenal.proto.p281v1.idl;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.rosetta.i18n.AffiliateDto;
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

/* compiled from: RestInstrumentService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020 0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010\b\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020$0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020(H\u0096@¢\u0006\u0002\u0010)J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020(0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010*\u001a\u00020+2\u0006\u0010\b\u001a\u00020,H\u0096@¢\u0006\u0002\u0010-J\"\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020,0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010.\u001a\u00020/2\u0006\u0010\b\u001a\u000200H\u0096@¢\u0006\u0002\u00101J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002000\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u00102\u001a\u0002032\u0006\u0010\b\u001a\u000204H\u0096@¢\u0006\u0002\u00105J\"\u00102\u001a\b\u0012\u0004\u0012\u0002030\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002040\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u00106\u001a\u0002072\u0006\u0010\b\u001a\u000208H\u0096@¢\u0006\u0002\u00109J\"\u00106\u001a\b\u0012\u0004\u0012\u0002070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002080\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010:\u001a\u00020;2\u0006\u0010\b\u001a\u00020<H\u0096@¢\u0006\u0002\u0010=J\"\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020<0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010>\u001a\u00020?2\u0006\u0010\b\u001a\u00020@H\u0096@¢\u0006\u0002\u0010AJ\"\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020@0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010B\u001a\u00020C2\u0006\u0010\b\u001a\u00020DH\u0096@¢\u0006\u0002\u0010EJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020D0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010F\u001a\u00020G2\u0006\u0010\b\u001a\u00020HH\u0096@¢\u0006\u0002\u0010IJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020H0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010J\u001a\u00020K2\u0006\u0010\b\u001a\u00020LH\u0096@¢\u0006\u0002\u0010MJ\"\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020L0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010N\u001a\u00020O2\u0006\u0010\b\u001a\u00020PH\u0096@¢\u0006\u0002\u0010QJ\"\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020P0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010R\u001a\u00020S2\u0006\u0010\b\u001a\u00020TH\u0096@¢\u0006\u0002\u0010UJ\"\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020T0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010V\u001a\u00020W2\u0006\u0010\b\u001a\u00020XH\u0096@¢\u0006\u0002\u0010YJ\"\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020X0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010Z\u001a\u00020[2\u0006\u0010\b\u001a\u00020\\H\u0096@¢\u0006\u0002\u0010]J\"\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\\0\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/RestInstrumentService;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "retrofit", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceRetrofit;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceRetrofit;)V", "GetFuturesContract", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "request", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesContractBySymbol", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListFuturesContracts", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesContractWithTradability", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesProduct", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesProductRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesProductRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesCombinedCommodity", "Lcom/robinhood/arsenal/proto/v1/idl/CombinedCommodityDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesCombinedCommodityRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesCombinedCommodityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetTradingHoursInfo", "Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetTradingHoursInfoRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetTradingHoursInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetTradingSessions", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetTradingSessionsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetTradingSessionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetMarginRequirement", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListFuturesProducts", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListActiveFuturesContractSchedules", "Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CountEventContracts", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CountEvents", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventContract", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventContractRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEventContracts", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEvents", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEvent", "Lcom/robinhood/arsenal/proto/v1/idl/EventDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventBracket", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventBracketRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventBracketRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventTopic", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventTopicRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventTopicRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEventTopics", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListRelevantEventTopics", "Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RestInstrumentService implements InstrumentService {
    private final InstrumentServiceRetrofit retrofit;

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "CountEventContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$CountEventContracts$1 */
    static final class C317921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317921(Continuation<? super C317921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.CountEventContracts((CountEventContractsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "CountEventContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$CountEventContracts$2 */
    static final class C317932 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317932(Continuation<? super C317932> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.CountEventContracts((Request<CountEventContractsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "CountEvents")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$CountEvents$1 */
    static final class C317941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317941(Continuation<? super C317941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.CountEvents((CountEventsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "CountEvents")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$CountEvents$2 */
    static final class C317952 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317952(Continuation<? super C317952> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.CountEvents((Request<CountEventsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "GetEvent")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetEvent$1 */
    static final class C317961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317961(Continuation<? super C317961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEvent((GetEventRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "GetEvent")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetEvent$2 */
    static final class C317972 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317972(Continuation<? super C317972> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEvent((Request<GetEventRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE}, m3647m = "GetEventBracket")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetEventBracket$1 */
    static final class C317981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317981(Continuation<? super C317981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEventBracket((GetEventBracketRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "GetEventBracket")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetEventBracket$2 */
    static final class C317992 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317992(Continuation<? super C317992> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEventBracket((Request<GetEventBracketRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "GetEventContract")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetEventContract$1 */
    static final class C318001 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318001(Continuation<? super C318001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEventContract((GetEventContractRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "GetEventContract")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetEventContract$2 */
    static final class C318012 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318012(Continuation<? super C318012> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEventContract((Request<GetEventContractRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "GetEventTopic")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetEventTopic$1 */
    static final class C318021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318021(Continuation<? super C318021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEventTopic((GetEventTopicRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m3647m = "GetEventTopic")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetEventTopic$2 */
    static final class C318032 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318032(Continuation<? super C318032> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetEventTopic((Request<GetEventTopicRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {70}, m3647m = "GetFuturesCombinedCommodity")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetFuturesCombinedCommodity$1 */
    static final class C318041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318041(Continuation<? super C318041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetFuturesCombinedCommodity((GetFuturesCombinedCommodityRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {73}, m3647m = "GetFuturesCombinedCommodity")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetFuturesCombinedCommodity$2 */
    static final class C318052 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318052(Continuation<? super C318052> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetFuturesCombinedCommodity((Request<GetFuturesCombinedCommodityRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {18}, m3647m = "GetFuturesContract")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetFuturesContract$1 */
    static final class C318061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318061(Continuation<? super C318061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetFuturesContract((GetFuturesContractRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {21}, m3647m = "GetFuturesContract")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetFuturesContract$2 */
    static final class C318072 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318072(Continuation<? super C318072> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetFuturesContract((Request<GetFuturesContractRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {28}, m3647m = "GetFuturesContractBySymbol")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetFuturesContractBySymbol$1 */
    static final class C318081 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318081(Continuation<? super C318081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetFuturesContractBySymbol((GetFuturesContractBySymbolRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {31}, m3647m = "GetFuturesContractBySymbol")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetFuturesContractBySymbol$2 */
    static final class C318092 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318092(Continuation<? super C318092> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetFuturesContractBySymbol((Request<GetFuturesContractBySymbolRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {49}, m3647m = "GetFuturesContractWithTradability")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetFuturesContractWithTradability$1 */
    static final class C318101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318101(Continuation<? super C318101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetFuturesContractWithTradability((GetFuturesContractWithTradabilityRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {52}, m3647m = "GetFuturesContractWithTradability")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetFuturesContractWithTradability$2 */
    static final class C318112 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318112(Continuation<? super C318112> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetFuturesContractWithTradability((Request<GetFuturesContractWithTradabilityRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {60}, m3647m = "GetFuturesProduct")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetFuturesProduct$1 */
    static final class C318121 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318121(Continuation<? super C318121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetFuturesProduct((GetFuturesProductRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {63}, m3647m = "GetFuturesProduct")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetFuturesProduct$2 */
    static final class C318132 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318132(Continuation<? super C318132> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetFuturesProduct((Request<GetFuturesProductRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {108}, m3647m = "GetMarginRequirement")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetMarginRequirement$1 */
    static final class C318141 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318141(Continuation<? super C318141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetMarginRequirement((GetMarginRequirementRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {111}, m3647m = "GetMarginRequirement")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetMarginRequirement$2 */
    static final class C318152 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318152(Continuation<? super C318152> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetMarginRequirement((Request<GetMarginRequirementRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {80}, m3647m = "GetTradingHoursInfo")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetTradingHoursInfo$1 */
    static final class C318161 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318161(Continuation<? super C318161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetTradingHoursInfo((GetTradingHoursInfoRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {83}, m3647m = "GetTradingHoursInfo")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetTradingHoursInfo$2 */
    static final class C318172 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318172(Continuation<? super C318172> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetTradingHoursInfo((Request<GetTradingHoursInfoRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {94}, m3647m = "GetTradingSessions")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetTradingSessions$1 */
    static final class C318181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318181(Continuation<? super C318181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetTradingSessions((GetTradingSessionsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {100}, m3647m = "GetTradingSessions")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$GetTradingSessions$2 */
    static final class C318192 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318192(Continuation<? super C318192> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.GetTradingSessions((Request<GetTradingSessionsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "ListActiveFuturesContractSchedules")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListActiveFuturesContractSchedules$1 */
    static final class C318201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318201(Continuation<? super C318201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListActiveFuturesContractSchedules((ListActiveFuturesContractSchedulesRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "ListActiveFuturesContractSchedules")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListActiveFuturesContractSchedules$2 */
    static final class C318212 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318212(Continuation<? super C318212> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListActiveFuturesContractSchedules((Request<ListActiveFuturesContractSchedulesRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {182}, m3647m = "ListEventContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListEventContracts$1 */
    static final class C318221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318221(Continuation<? super C318221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListEventContracts((ListEventContractsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "ListEventContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListEventContracts$2 */
    static final class C318232 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318232(Continuation<? super C318232> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListEventContracts((Request<ListEventContractsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "ListEventTopics")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListEventTopics$1 */
    static final class C318241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318241(Continuation<? super C318241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListEventTopics((ListEventTopicsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m3647m = "ListEventTopics")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListEventTopics$2 */
    static final class C318252 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318252(Continuation<? super C318252> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListEventTopics((Request<ListEventTopicsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {192}, m3647m = "ListEvents")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListEvents$1 */
    static final class C318261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318261(Continuation<? super C318261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListEvents((ListEventsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m3647m = "ListEvents")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListEvents$2 */
    static final class C318272 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318272(Continuation<? super C318272> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListEvents((Request<ListEventsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {38}, m3647m = "ListFuturesContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListFuturesContracts$1 */
    static final class C318281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318281(Continuation<? super C318281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListFuturesContracts((ListFuturesContractsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {41}, m3647m = "ListFuturesContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListFuturesContracts$2 */
    static final class C318292 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318292(Continuation<? super C318292> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListFuturesContracts((Request<ListFuturesContractsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {120}, m3647m = "ListFuturesProducts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListFuturesProducts$1 */
    static final class C318301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318301(Continuation<? super C318301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListFuturesProducts((ListFuturesProductsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {123}, m3647m = "ListFuturesProducts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListFuturesProducts$2 */
    static final class C318312 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318312(Continuation<? super C318312> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListFuturesProducts((Request<ListFuturesProductsRequestDto>) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "ListRelevantEventTopics")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListRelevantEventTopics$1 */
    static final class C318321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318321(Continuation<? super C318321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListRelevantEventTopics((ListRelevantEventTopicsRequestDto) null, this);
        }
    }

    /* compiled from: RestInstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.RestInstrumentService", m3645f = "RestInstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m3647m = "ListRelevantEventTopics")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.RestInstrumentService$ListRelevantEventTopics$2 */
    static final class C318332 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C318332(Continuation<? super C318332> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestInstrumentService.this.ListRelevantEventTopics((Request<ListRelevantEventTopicsRequestDto>) null, this);
        }
    }

    public RestInstrumentService(InstrumentServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesContract(GetFuturesContractRequestDto getFuturesContractRequestDto, Continuation<? super FuturesContractDto> continuation) {
        C318061 c318061;
        if (continuation instanceof C318061) {
            c318061 = (C318061) continuation;
            int i = c318061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318061.label = i - Integer.MIN_VALUE;
            } else {
                c318061 = new C318061(continuation);
            }
        }
        Object objGetFuturesContract = c318061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesContract);
            Request<GetFuturesContractRequestDto> request = new Request<>(getFuturesContractRequestDto, null, 2, null);
            c318061.label = 1;
            objGetFuturesContract = GetFuturesContract(request, c318061);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesContract(Request<GetFuturesContractRequestDto> request, Continuation<? super Response<FuturesContractDto>> continuation) {
        C318072 c318072;
        if (continuation instanceof C318072) {
            c318072 = (C318072) continuation;
            int i = c318072.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318072.label = i - Integer.MIN_VALUE;
            } else {
                c318072 = new C318072(continuation);
            }
        }
        Object objGetFuturesContract = c318072.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318072.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesContract);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String contract_id = request.getData().getContract_id();
            c318072.label = 1;
            objGetFuturesContract = instrumentServiceRetrofit.GetFuturesContract(metadata, contract_id, c318072);
            if (objGetFuturesContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesContract);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFuturesContract);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesContractBySymbol(GetFuturesContractBySymbolRequestDto getFuturesContractBySymbolRequestDto, Continuation<? super GetFuturesContractBySymbolResponseDto> continuation) {
        C318081 c318081;
        if (continuation instanceof C318081) {
            c318081 = (C318081) continuation;
            int i = c318081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318081.label = i - Integer.MIN_VALUE;
            } else {
                c318081 = new C318081(continuation);
            }
        }
        Object objGetFuturesContractBySymbol = c318081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesContractBySymbol);
            Request<GetFuturesContractBySymbolRequestDto> request = new Request<>(getFuturesContractBySymbolRequestDto, null, 2, null);
            c318081.label = 1;
            objGetFuturesContractBySymbol = GetFuturesContractBySymbol(request, c318081);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesContractBySymbol(Request<GetFuturesContractBySymbolRequestDto> request, Continuation<? super Response<GetFuturesContractBySymbolResponseDto>> continuation) {
        C318092 c318092;
        if (continuation instanceof C318092) {
            c318092 = (C318092) continuation;
            int i = c318092.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318092.label = i - Integer.MIN_VALUE;
            } else {
                c318092 = new C318092(continuation);
            }
        }
        Object objGetFuturesContractBySymbol = c318092.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318092.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesContractBySymbol);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String symbol = request.getData().getSymbol();
            c318092.label = 1;
            objGetFuturesContractBySymbol = instrumentServiceRetrofit.GetFuturesContractBySymbol(metadata, symbol, c318092);
            if (objGetFuturesContractBySymbol == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesContractBySymbol);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFuturesContractBySymbol);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListFuturesContracts(ListFuturesContractsRequestDto listFuturesContractsRequestDto, Continuation<? super ListFuturesContractsResponseDto> continuation) {
        C318281 c318281;
        if (continuation instanceof C318281) {
            c318281 = (C318281) continuation;
            int i = c318281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318281.label = i - Integer.MIN_VALUE;
            } else {
                c318281 = new C318281(continuation);
            }
        }
        Object objListFuturesContracts = c318281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListFuturesContracts);
            Request<ListFuturesContractsRequestDto> request = new Request<>(listFuturesContractsRequestDto, null, 2, null);
            c318281.label = 1;
            objListFuturesContracts = ListFuturesContracts(request, c318281);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListFuturesContracts(Request<ListFuturesContractsRequestDto> request, Continuation<? super Response<ListFuturesContractsResponseDto>> continuation) {
        C318292 c318292;
        if (continuation instanceof C318292) {
            c318292 = (C318292) continuation;
            int i = c318292.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318292.label = i - Integer.MIN_VALUE;
            } else {
                c318292 = new C318292(continuation);
            }
        }
        Object objListFuturesContracts = c318292.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318292.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListFuturesContracts);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String product_ids = !Intrinsics.areEqual(request.getData().getProduct_ids(), "") ? request.getData().getProduct_ids() : null;
            String contract_ids = Intrinsics.areEqual(request.getData().getContract_ids(), "") ? null : request.getData().getContract_ids();
            c318292.label = 1;
            objListFuturesContracts = instrumentServiceRetrofit.ListFuturesContracts(metadata, product_ids, contract_ids, c318292);
            if (objListFuturesContracts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListFuturesContracts);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListFuturesContracts);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesContractWithTradability(GetFuturesContractWithTradabilityRequestDto getFuturesContractWithTradabilityRequestDto, Continuation<? super GetFuturesContractWithTradabilityResponseDto> continuation) {
        C318101 c318101;
        if (continuation instanceof C318101) {
            c318101 = (C318101) continuation;
            int i = c318101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318101.label = i - Integer.MIN_VALUE;
            } else {
                c318101 = new C318101(continuation);
            }
        }
        Object objGetFuturesContractWithTradability = c318101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesContractWithTradability);
            Request<GetFuturesContractWithTradabilityRequestDto> request = new Request<>(getFuturesContractWithTradabilityRequestDto, null, 2, null);
            c318101.label = 1;
            objGetFuturesContractWithTradability = GetFuturesContractWithTradability(request, c318101);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesContractWithTradability(Request<GetFuturesContractWithTradabilityRequestDto> request, Continuation<? super Response<GetFuturesContractWithTradabilityResponseDto>> continuation) {
        C318112 c318112;
        if (continuation instanceof C318112) {
            c318112 = (C318112) continuation;
            int i = c318112.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318112.label = i - Integer.MIN_VALUE;
            } else {
                c318112 = new C318112(continuation);
            }
        }
        Object objGetFuturesContractWithTradability = c318112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesContractWithTradability);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String contract_id = request.getData().getContract_id();
            AffiliateDto affiliate = request.getData().getAffiliate() != AffiliateDto.INSTANCE.getZeroValue() ? request.getData().getAffiliate() : null;
            c318112.label = 1;
            objGetFuturesContractWithTradability = instrumentServiceRetrofit.GetFuturesContractWithTradability(metadata, contract_id, affiliate, c318112);
            if (objGetFuturesContractWithTradability == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesContractWithTradability);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFuturesContractWithTradability);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesProduct(GetFuturesProductRequestDto getFuturesProductRequestDto, Continuation<? super ProductDto> continuation) {
        C318121 c318121;
        if (continuation instanceof C318121) {
            c318121 = (C318121) continuation;
            int i = c318121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318121.label = i - Integer.MIN_VALUE;
            } else {
                c318121 = new C318121(continuation);
            }
        }
        Object objGetFuturesProduct = c318121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318121.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesProduct);
            Request<GetFuturesProductRequestDto> request = new Request<>(getFuturesProductRequestDto, null, 2, null);
            c318121.label = 1;
            objGetFuturesProduct = GetFuturesProduct(request, c318121);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesProduct(Request<GetFuturesProductRequestDto> request, Continuation<? super Response<ProductDto>> continuation) {
        C318132 c318132;
        if (continuation instanceof C318132) {
            c318132 = (C318132) continuation;
            int i = c318132.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318132.label = i - Integer.MIN_VALUE;
            } else {
                c318132 = new C318132(continuation);
            }
        }
        Object objGetFuturesProduct = c318132.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318132.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesProduct);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String product_id = request.getData().getProduct_id();
            c318132.label = 1;
            objGetFuturesProduct = instrumentServiceRetrofit.GetFuturesProduct(metadata, product_id, c318132);
            if (objGetFuturesProduct == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesProduct);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFuturesProduct);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesCombinedCommodity(GetFuturesCombinedCommodityRequestDto getFuturesCombinedCommodityRequestDto, Continuation<? super CombinedCommodityDto> continuation) {
        C318041 c318041;
        if (continuation instanceof C318041) {
            c318041 = (C318041) continuation;
            int i = c318041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318041.label = i - Integer.MIN_VALUE;
            } else {
                c318041 = new C318041(continuation);
            }
        }
        Object objGetFuturesCombinedCommodity = c318041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesCombinedCommodity);
            Request<GetFuturesCombinedCommodityRequestDto> request = new Request<>(getFuturesCombinedCommodityRequestDto, null, 2, null);
            c318041.label = 1;
            objGetFuturesCombinedCommodity = GetFuturesCombinedCommodity(request, c318041);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesCombinedCommodity(Request<GetFuturesCombinedCommodityRequestDto> request, Continuation<? super Response<CombinedCommodityDto>> continuation) {
        C318052 c318052;
        if (continuation instanceof C318052) {
            c318052 = (C318052) continuation;
            int i = c318052.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318052.label = i - Integer.MIN_VALUE;
            } else {
                c318052 = new C318052(continuation);
            }
        }
        Object objGetFuturesCombinedCommodity = c318052.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318052.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesCombinedCommodity);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String combined_commodity_id = request.getData().getCombined_commodity_id();
            c318052.label = 1;
            objGetFuturesCombinedCommodity = instrumentServiceRetrofit.GetFuturesCombinedCommodity(metadata, combined_commodity_id, c318052);
            if (objGetFuturesCombinedCommodity == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesCombinedCommodity);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFuturesCombinedCommodity);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTradingHoursInfo(GetTradingHoursInfoRequestDto getTradingHoursInfoRequestDto, Continuation<? super TradingHoursInfoDto> continuation) {
        C318161 c318161;
        if (continuation instanceof C318161) {
            c318161 = (C318161) continuation;
            int i = c318161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318161.label = i - Integer.MIN_VALUE;
            } else {
                c318161 = new C318161(continuation);
            }
        }
        Object objGetTradingHoursInfo = c318161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318161.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTradingHoursInfo);
            Request<GetTradingHoursInfoRequestDto> request = new Request<>(getTradingHoursInfoRequestDto, null, 2, null);
            c318161.label = 1;
            objGetTradingHoursInfo = GetTradingHoursInfo(request, c318161);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTradingHoursInfo(Request<GetTradingHoursInfoRequestDto> request, Continuation<? super Response<TradingHoursInfoDto>> continuation) {
        C318172 c318172;
        if (continuation instanceof C318172) {
            c318172 = (C318172) continuation;
            int i = c318172.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318172.label = i - Integer.MIN_VALUE;
            } else {
                c318172 = new C318172(continuation);
            }
        }
        Object objGetTradingHoursInfo = c318172.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318172.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTradingHoursInfo);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String contract_id = request.getData().getContract_id();
            String timezone = !Intrinsics.areEqual(request.getData().getTimezone(), "") ? request.getData().getTimezone() : null;
            c318172.label = 1;
            objGetTradingHoursInfo = instrumentServiceRetrofit.GetTradingHoursInfo(metadata, contract_id, timezone, c318172);
            if (objGetTradingHoursInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTradingHoursInfo);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetTradingHoursInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTradingSessions(GetTradingSessionsRequestDto getTradingSessionsRequestDto, Continuation<? super TradingSessionsDto> continuation) {
        C318181 c318181;
        if (continuation instanceof C318181) {
            c318181 = (C318181) continuation;
            int i = c318181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318181.label = i - Integer.MIN_VALUE;
            } else {
                c318181 = new C318181(continuation);
            }
        }
        Object objGetTradingSessions = c318181.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTradingSessions);
            Request<GetTradingSessionsRequestDto> request = new Request<>(getTradingSessionsRequestDto, null, 2, null);
            c318181.label = 1;
            objGetTradingSessions = GetTradingSessions(request, c318181);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTradingSessions(Request<GetTradingSessionsRequestDto> request, Continuation<? super Response<TradingSessionsDto>> continuation) {
        C318192 c318192;
        if (continuation instanceof C318192) {
            c318192 = (C318192) continuation;
            int i = c318192.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318192.label = i - Integer.MIN_VALUE;
            } else {
                c318192 = new C318192(continuation);
            }
        }
        Object objGetTradingSessions = c318192.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318192.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTradingSessions);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String contract_id = request.getData().getContract_id();
            String date = request.getData().getDate();
            c318192.label = 1;
            objGetTradingSessions = instrumentServiceRetrofit.GetTradingSessions(metadata, contract_id, date, c318192);
            if (objGetTradingSessions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTradingSessions);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetTradingSessions);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMarginRequirement(GetMarginRequirementRequestDto getMarginRequirementRequestDto, Continuation<? super MarginRequirementDto> continuation) {
        C318141 c318141;
        if (continuation instanceof C318141) {
            c318141 = (C318141) continuation;
            int i = c318141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318141.label = i - Integer.MIN_VALUE;
            } else {
                c318141 = new C318141(continuation);
            }
        }
        Object objGetMarginRequirement = c318141.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMarginRequirement);
            Request<GetMarginRequirementRequestDto> request = new Request<>(getMarginRequirementRequestDto, null, 2, null);
            c318141.label = 1;
            objGetMarginRequirement = GetMarginRequirement(request, c318141);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetMarginRequirement(Request<GetMarginRequirementRequestDto> request, Continuation<? super Response<MarginRequirementDto>> continuation) {
        C318152 c318152;
        if (continuation instanceof C318152) {
            c318152 = (C318152) continuation;
            int i = c318152.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318152.label = i - Integer.MIN_VALUE;
            } else {
                c318152 = new C318152(continuation);
            }
        }
        C318152 c3181522 = c318152;
        Object objGetMarginRequirement = c3181522.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3181522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetMarginRequirement);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String contract_id = !Intrinsics.areEqual(request.getData().getContract_id(), "") ? request.getData().getContract_id() : null;
            MarginTypeDto margin_type = request.getData().getMargin_type() != MarginTypeDto.INSTANCE.getZeroValue() ? request.getData().getMargin_type() : null;
            AccountTypeDto account_type = request.getData().getAccount_type() != AccountTypeDto.INSTANCE.getZeroValue() ? request.getData().getAccount_type() : null;
            c3181522.label = 1;
            objGetMarginRequirement = instrumentServiceRetrofit.GetMarginRequirement(metadata, contract_id, margin_type, account_type, c3181522);
            if (objGetMarginRequirement == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetMarginRequirement);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetMarginRequirement);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListFuturesProducts(ListFuturesProductsRequestDto listFuturesProductsRequestDto, Continuation<? super ListFuturesProductsResponseDto> continuation) {
        C318301 c318301;
        if (continuation instanceof C318301) {
            c318301 = (C318301) continuation;
            int i = c318301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318301.label = i - Integer.MIN_VALUE;
            } else {
                c318301 = new C318301(continuation);
            }
        }
        Object objListFuturesProducts = c318301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListFuturesProducts);
            Request<ListFuturesProductsRequestDto> request = new Request<>(listFuturesProductsRequestDto, null, 2, null);
            c318301.label = 1;
            objListFuturesProducts = ListFuturesProducts(request, c318301);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListFuturesProducts(Request<ListFuturesProductsRequestDto> request, Continuation<? super Response<ListFuturesProductsResponseDto>> continuation) {
        C318312 c318312;
        if (continuation instanceof C318312) {
            c318312 = (C318312) continuation;
            int i = c318312.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318312.label = i - Integer.MIN_VALUE;
            } else {
                c318312 = new C318312(continuation);
            }
        }
        Object objListFuturesProducts = c318312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListFuturesProducts);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String product_ids = !Intrinsics.areEqual(request.getData().getProduct_ids(), "") ? request.getData().getProduct_ids() : null;
            c318312.label = 1;
            objListFuturesProducts = instrumentServiceRetrofit.ListFuturesProducts(metadata, product_ids, c318312);
            if (objListFuturesProducts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListFuturesProducts);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListFuturesProducts);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListActiveFuturesContractSchedules(ListActiveFuturesContractSchedulesRequestDto listActiveFuturesContractSchedulesRequestDto, Continuation<? super ListActiveFuturesContractSchedulesResponseDto> continuation) {
        C318201 c318201;
        if (continuation instanceof C318201) {
            c318201 = (C318201) continuation;
            int i = c318201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318201.label = i - Integer.MIN_VALUE;
            } else {
                c318201 = new C318201(continuation);
            }
        }
        Object objListActiveFuturesContractSchedules = c318201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListActiveFuturesContractSchedules);
            Request<ListActiveFuturesContractSchedulesRequestDto> request = new Request<>(listActiveFuturesContractSchedulesRequestDto, null, 2, null);
            c318201.label = 1;
            objListActiveFuturesContractSchedules = ListActiveFuturesContractSchedules(request, c318201);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListActiveFuturesContractSchedules(Request<ListActiveFuturesContractSchedulesRequestDto> request, Continuation<? super Response<ListActiveFuturesContractSchedulesResponseDto>> continuation) {
        C318212 c318212;
        if (continuation instanceof C318212) {
            c318212 = (C318212) continuation;
            int i = c318212.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318212.label = i - Integer.MIN_VALUE;
            } else {
                c318212 = new C318212(continuation);
            }
        }
        C318212 c3182122 = c318212;
        Object objListActiveFuturesContractSchedules = c3182122.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3182122.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListActiveFuturesContractSchedules);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            List<String> product_ids = request.getData().getProduct_ids();
            String start_date = !Intrinsics.areEqual(request.getData().getStart_date(), "") ? request.getData().getStart_date() : null;
            String end_date = Intrinsics.areEqual(request.getData().getEnd_date(), "") ? null : request.getData().getEnd_date();
            c3182122.label = 1;
            objListActiveFuturesContractSchedules = instrumentServiceRetrofit.ListActiveFuturesContractSchedules(metadata, product_ids, start_date, end_date, c3182122);
            if (objListActiveFuturesContractSchedules == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListActiveFuturesContractSchedules);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListActiveFuturesContractSchedules);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CountEventContracts(CountEventContractsRequestDto countEventContractsRequestDto, Continuation<? super CountEventContractsResponseDto> continuation) {
        C317921 c317921;
        if (continuation instanceof C317921) {
            c317921 = (C317921) continuation;
            int i = c317921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317921.label = i - Integer.MIN_VALUE;
            } else {
                c317921 = new C317921(continuation);
            }
        }
        Object objCountEventContracts = c317921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCountEventContracts);
            Request<CountEventContractsRequestDto> request = new Request<>(countEventContractsRequestDto, null, 2, null);
            c317921.label = 1;
            objCountEventContracts = CountEventContracts(request, c317921);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CountEventContracts(Request<CountEventContractsRequestDto> request, Continuation<? super Response<CountEventContractsResponseDto>> continuation) {
        C317932 c317932;
        if (continuation instanceof C317932) {
            c317932 = (C317932) continuation;
            int i = c317932.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317932.label = i - Integer.MIN_VALUE;
            } else {
                c317932 = new C317932(continuation);
            }
        }
        C317932 c3179322 = c317932;
        Object objCountEventContracts = c3179322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3179322.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCountEventContracts);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            EventContractTradabilityDto tradability = request.getData().getTradability();
            EventContractStateDto state = request.getData().getState();
            Boolean discoverable = request.getData().getDiscoverable();
            c3179322.label = 1;
            objCountEventContracts = instrumentServiceRetrofit.CountEventContracts(metadata, tradability, state, discoverable, c3179322);
            if (objCountEventContracts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCountEventContracts);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCountEventContracts);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CountEvents(CountEventsRequestDto countEventsRequestDto, Continuation<? super CountEventsResponseDto> continuation) {
        C317941 c317941;
        if (continuation instanceof C317941) {
            c317941 = (C317941) continuation;
            int i = c317941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317941.label = i - Integer.MIN_VALUE;
            } else {
                c317941 = new C317941(continuation);
            }
        }
        Object objCountEvents = c317941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCountEvents);
            Request<CountEventsRequestDto> request = new Request<>(countEventsRequestDto, null, 2, null);
            c317941.label = 1;
            objCountEvents = CountEvents(request, c317941);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CountEvents(Request<CountEventsRequestDto> request, Continuation<? super Response<CountEventsResponseDto>> continuation) {
        C317952 c317952;
        if (continuation instanceof C317952) {
            c317952 = (C317952) continuation;
            int i = c317952.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317952.label = i - Integer.MIN_VALUE;
            } else {
                c317952 = new C317952(continuation);
            }
        }
        C317952 c3179522 = c317952;
        Object objCountEvents = c3179522.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3179522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCountEvents);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            Boolean discoverable = request.getData().getDiscoverable();
            EventStateDto state = request.getData().getState();
            Boolean boolBoxBoolean = request.getData().getExclude_sports() ? boxing.boxBoolean(request.getData().getExclude_sports()) : null;
            c3179522.label = 1;
            objCountEvents = instrumentServiceRetrofit.CountEvents(metadata, discoverable, state, boolBoxBoolean, c3179522);
            if (objCountEvents == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCountEvents);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCountEvents);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventContract(GetEventContractRequestDto getEventContractRequestDto, Continuation<? super EventContractDto> continuation) {
        C318001 c318001;
        if (continuation instanceof C318001) {
            c318001 = (C318001) continuation;
            int i = c318001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318001.label = i - Integer.MIN_VALUE;
            } else {
                c318001 = new C318001(continuation);
            }
        }
        Object objGetEventContract = c318001.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318001.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventContract);
            Request<GetEventContractRequestDto> request = new Request<>(getEventContractRequestDto, null, 2, null);
            c318001.label = 1;
            objGetEventContract = GetEventContract(request, c318001);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventContract(Request<GetEventContractRequestDto> request, Continuation<? super Response<EventContractDto>> continuation) {
        C318012 c318012;
        if (continuation instanceof C318012) {
            c318012 = (C318012) continuation;
            int i = c318012.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318012.label = i - Integer.MIN_VALUE;
            } else {
                c318012 = new C318012(continuation);
            }
        }
        Object objGetEventContract = c318012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventContract);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            c318012.label = 1;
            objGetEventContract = instrumentServiceRetrofit.GetEventContract(metadata, id, c318012);
            if (objGetEventContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventContract);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetEventContract);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEventContracts(ListEventContractsRequestDto listEventContractsRequestDto, Continuation<? super ListEventContractsResponseDto> continuation) {
        C318221 c318221;
        if (continuation instanceof C318221) {
            c318221 = (C318221) continuation;
            int i = c318221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318221.label = i - Integer.MIN_VALUE;
            } else {
                c318221 = new C318221(continuation);
            }
        }
        Object objListEventContracts = c318221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEventContracts);
            Request<ListEventContractsRequestDto> request = new Request<>(listEventContractsRequestDto, null, 2, null);
            c318221.label = 1;
            objListEventContracts = ListEventContracts(request, c318221);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEventContracts(Request<ListEventContractsRequestDto> request, Continuation<? super Response<ListEventContractsResponseDto>> continuation) {
        C318232 c318232;
        if (continuation instanceof C318232) {
            c318232 = (C318232) continuation;
            int i = c318232.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318232.label = i - Integer.MIN_VALUE;
            } else {
                c318232 = new C318232(continuation);
            }
        }
        Object objListEventContracts = c318232.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318232.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEventContracts);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String ids = !Intrinsics.areEqual(request.getData().getIds(), "") ? request.getData().getIds() : null;
            c318232.label = 1;
            objListEventContracts = instrumentServiceRetrofit.ListEventContracts(metadata, ids, c318232);
            if (objListEventContracts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEventContracts);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListEventContracts);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEvents(ListEventsRequestDto listEventsRequestDto, Continuation<? super ListEventsResponseDto> continuation) {
        C318261 c318261;
        if (continuation instanceof C318261) {
            c318261 = (C318261) continuation;
            int i = c318261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318261.label = i - Integer.MIN_VALUE;
            } else {
                c318261 = new C318261(continuation);
            }
        }
        Object objListEvents = c318261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEvents);
            Request<ListEventsRequestDto> request = new Request<>(listEventsRequestDto, null, 2, null);
            c318261.label = 1;
            objListEvents = ListEvents(request, c318261);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEvents(Request<ListEventsRequestDto> request, Continuation<? super Response<ListEventsResponseDto>> continuation) {
        C318272 c318272;
        if (continuation instanceof C318272) {
            c318272 = (C318272) continuation;
            int i = c318272.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318272.label = i - Integer.MIN_VALUE;
            } else {
                c318272 = new C318272(continuation);
            }
        }
        Object objListEvents = c318272.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318272.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEvents);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String ids = !Intrinsics.areEqual(request.getData().getIds(), "") ? request.getData().getIds() : null;
            String contract_ids = Intrinsics.areEqual(request.getData().getContract_ids(), "") ? null : request.getData().getContract_ids();
            c318272.label = 1;
            objListEvents = instrumentServiceRetrofit.ListEvents(metadata, ids, contract_ids, c318272);
            if (objListEvents == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEvents);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListEvents);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEvent(GetEventRequestDto getEventRequestDto, Continuation<? super EventDto> continuation) {
        C317961 c317961;
        if (continuation instanceof C317961) {
            c317961 = (C317961) continuation;
            int i = c317961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317961.label = i - Integer.MIN_VALUE;
            } else {
                c317961 = new C317961(continuation);
            }
        }
        Object objGetEvent = c317961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317961.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEvent);
            Request<GetEventRequestDto> request = new Request<>(getEventRequestDto, null, 2, null);
            c317961.label = 1;
            objGetEvent = GetEvent(request, c317961);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEvent(Request<GetEventRequestDto> request, Continuation<? super Response<EventDto>> continuation) {
        C317972 c317972;
        if (continuation instanceof C317972) {
            c317972 = (C317972) continuation;
            int i = c317972.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317972.label = i - Integer.MIN_VALUE;
            } else {
                c317972 = new C317972(continuation);
            }
        }
        Object objGetEvent = c317972.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317972.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEvent);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            c317972.label = 1;
            objGetEvent = instrumentServiceRetrofit.GetEvent(metadata, id, c317972);
            if (objGetEvent == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEvent);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventBracket(GetEventBracketRequestDto getEventBracketRequestDto, Continuation<? super EventBracketDto> continuation) {
        C317981 c317981;
        if (continuation instanceof C317981) {
            c317981 = (C317981) continuation;
            int i = c317981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317981.label = i - Integer.MIN_VALUE;
            } else {
                c317981 = new C317981(continuation);
            }
        }
        Object objGetEventBracket = c317981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventBracket);
            Request<GetEventBracketRequestDto> request = new Request<>(getEventBracketRequestDto, null, 2, null);
            c317981.label = 1;
            objGetEventBracket = GetEventBracket(request, c317981);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventBracket(Request<GetEventBracketRequestDto> request, Continuation<? super Response<EventBracketDto>> continuation) {
        C317992 c317992;
        if (continuation instanceof C317992) {
            c317992 = (C317992) continuation;
            int i = c317992.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c317992.label = i - Integer.MIN_VALUE;
            } else {
                c317992 = new C317992(continuation);
            }
        }
        Object objGetEventBracket = c317992.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c317992.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventBracket);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            c317992.label = 1;
            objGetEventBracket = instrumentServiceRetrofit.GetEventBracket(metadata, id, c317992);
            if (objGetEventBracket == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventBracket);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetEventBracket);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventTopic(GetEventTopicRequestDto getEventTopicRequestDto, Continuation<? super EventTopicDto> continuation) {
        C318021 c318021;
        if (continuation instanceof C318021) {
            c318021 = (C318021) continuation;
            int i = c318021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318021.label = i - Integer.MIN_VALUE;
            } else {
                c318021 = new C318021(continuation);
            }
        }
        Object objGetEventTopic = c318021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventTopic);
            Request<GetEventTopicRequestDto> request = new Request<>(getEventTopicRequestDto, null, 2, null);
            c318021.label = 1;
            objGetEventTopic = GetEventTopic(request, c318021);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventTopic(Request<GetEventTopicRequestDto> request, Continuation<? super Response<EventTopicDto>> continuation) {
        C318032 c318032;
        if (continuation instanceof C318032) {
            c318032 = (C318032) continuation;
            int i = c318032.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318032.label = i - Integer.MIN_VALUE;
            } else {
                c318032 = new C318032(continuation);
            }
        }
        Object objGetEventTopic = c318032.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318032.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventTopic);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            Boolean boolBoxBoolean = request.getData().getBracket_enabled() ? boxing.boxBoolean(request.getData().getBracket_enabled()) : null;
            c318032.label = 1;
            objGetEventTopic = instrumentServiceRetrofit.GetEventTopic(metadata, id, boolBoxBoolean, c318032);
            if (objGetEventTopic == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventTopic);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetEventTopic);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEventTopics(ListEventTopicsRequestDto listEventTopicsRequestDto, Continuation<? super ListEventTopicsResponseDto> continuation) {
        C318241 c318241;
        if (continuation instanceof C318241) {
            c318241 = (C318241) continuation;
            int i = c318241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318241.label = i - Integer.MIN_VALUE;
            } else {
                c318241 = new C318241(continuation);
            }
        }
        Object objListEventTopics = c318241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEventTopics);
            Request<ListEventTopicsRequestDto> request = new Request<>(listEventTopicsRequestDto, null, 2, null);
            c318241.label = 1;
            objListEventTopics = ListEventTopics(request, c318241);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListEventTopics(Request<ListEventTopicsRequestDto> request, Continuation<? super Response<ListEventTopicsResponseDto>> continuation) {
        C318252 c318252;
        if (continuation instanceof C318252) {
            c318252 = (C318252) continuation;
            int i = c318252.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318252.label = i - Integer.MIN_VALUE;
            } else {
                c318252 = new C318252(continuation);
            }
        }
        C318252 c3182522 = c318252;
        Object objListEventTopics = c3182522.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3182522.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListEventTopics);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String ids = !Intrinsics.areEqual(request.getData().getIds(), "") ? request.getData().getIds() : null;
            EventTopicLocationDto location = request.getData().getLocation() != EventTopicLocationDto.INSTANCE.getZeroValue() ? request.getData().getLocation() : null;
            Boolean boolBoxBoolean = request.getData().getBracket_enabled() ? boxing.boxBoolean(request.getData().getBracket_enabled()) : null;
            Boolean boolBoxBoolean2 = request.getData().getHub_redesign_enabled() ? boxing.boxBoolean(request.getData().getHub_redesign_enabled()) : null;
            Boolean boolBoxBoolean3 = request.getData().getForecastex_enabled() ? boxing.boxBoolean(request.getData().getForecastex_enabled()) : null;
            Boolean boolBoxBoolean4 = request.getData().getExclude_sports() ? boxing.boxBoolean(request.getData().getExclude_sports()) : null;
            c3182522.label = 1;
            objListEventTopics = instrumentServiceRetrofit.ListEventTopics(metadata, ids, location, boolBoxBoolean, boolBoxBoolean2, boolBoxBoolean3, boolBoxBoolean4, c3182522);
            if (objListEventTopics == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListEventTopics);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListEventTopics);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListRelevantEventTopics(ListRelevantEventTopicsRequestDto listRelevantEventTopicsRequestDto, Continuation<? super ListRelevantEventTopicsResponseDto> continuation) {
        C318321 c318321;
        if (continuation instanceof C318321) {
            c318321 = (C318321) continuation;
            int i = c318321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318321.label = i - Integer.MIN_VALUE;
            } else {
                c318321 = new C318321(continuation);
            }
        }
        Object objListRelevantEventTopics = c318321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListRelevantEventTopics);
            Request<ListRelevantEventTopicsRequestDto> request = new Request<>(listRelevantEventTopicsRequestDto, null, 2, null);
            c318321.label = 1;
            objListRelevantEventTopics = ListRelevantEventTopics(request, c318321);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.arsenal.proto.p281v1.idl.InstrumentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListRelevantEventTopics(Request<ListRelevantEventTopicsRequestDto> request, Continuation<? super Response<ListRelevantEventTopicsResponseDto>> continuation) {
        C318332 c318332;
        if (continuation instanceof C318332) {
            c318332 = (C318332) continuation;
            int i = c318332.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c318332.label = i - Integer.MIN_VALUE;
            } else {
                c318332 = new C318332(continuation);
            }
        }
        Object objListRelevantEventTopics = c318332.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c318332.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListRelevantEventTopics);
            InstrumentServiceRetrofit instrumentServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = request.getData().getId();
            Boolean boolBoxBoolean = request.getData().getBracket_enabled() ? boxing.boxBoolean(request.getData().getBracket_enabled()) : null;
            c318332.label = 1;
            objListRelevantEventTopics = instrumentServiceRetrofit.ListRelevantEventTopics(metadata, id, boolBoxBoolean, c318332);
            if (objListRelevantEventTopics == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListRelevantEventTopics);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListRelevantEventTopics);
    }
}
