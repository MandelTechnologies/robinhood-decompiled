package com.robinhood.arsenal.proto.p281v1.idl;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InstrumentService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020 H¦@¢\u0006\u0002\u0010!J\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020 0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020$H¦@¢\u0006\u0002\u0010%J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020$0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010&\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020(H¦@¢\u0006\u0002\u0010)J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020(0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010*\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020,H¦@¢\u0006\u0002\u0010-J\"\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020,0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010.\u001a\u00020/2\u0006\u0010\u0004\u001a\u000200H¦@¢\u0006\u0002\u00101J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002000\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u00102\u001a\u0002032\u0006\u0010\u0004\u001a\u000204H¦@¢\u0006\u0002\u00105J\"\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002040\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u00106\u001a\u0002072\u0006\u0010\u0004\u001a\u000208H¦@¢\u0006\u0002\u00109J\"\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002080\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010:\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020<H¦@¢\u0006\u0002\u0010=J\"\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020<0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010>\u001a\u00020?2\u0006\u0010\u0004\u001a\u00020@H¦@¢\u0006\u0002\u0010AJ\"\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020@0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020DH¦@¢\u0006\u0002\u0010EJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020D0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010F\u001a\u00020G2\u0006\u0010\u0004\u001a\u00020HH¦@¢\u0006\u0002\u0010IJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020H0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010J\u001a\u00020K2\u0006\u0010\u0004\u001a\u00020LH¦@¢\u0006\u0002\u0010MJ\"\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020L0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010N\u001a\u00020O2\u0006\u0010\u0004\u001a\u00020PH¦@¢\u0006\u0002\u0010QJ\"\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020P0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010R\u001a\u00020S2\u0006\u0010\u0004\u001a\u00020TH¦@¢\u0006\u0002\u0010UJ\"\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020T0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010V\u001a\u00020W2\u0006\u0010\u0004\u001a\u00020XH¦@¢\u0006\u0002\u0010YJ\"\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020X0\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "", "GetFuturesContract", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "request", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesContractBySymbol", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractBySymbolRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListFuturesContracts", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesContractWithTradability", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesProduct", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesProductRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesProductRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesCombinedCommodity", "Lcom/robinhood/arsenal/proto/v1/idl/CombinedCommodityDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesCombinedCommodityRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesCombinedCommodityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetTradingHoursInfo", "Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfoDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetTradingHoursInfoRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetTradingHoursInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetTradingSessions", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetTradingSessionsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetTradingSessionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetMarginRequirement", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListFuturesProducts", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesProductsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListActiveFuturesContractSchedules", "Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CountEventContracts", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CountEvents", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventContract", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventContractRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEventContracts", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEventContractsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEvents", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEventsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEvent", "Lcom/robinhood/arsenal/proto/v1/idl/EventDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventBracket", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventBracketRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventBracketRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventTopic", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetEventTopicRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/GetEventTopicRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListEventTopics", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListRelevantEventTopics", "Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsRequestDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface InstrumentService {

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {67}, m3647m = "CountEventContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$CountEventContracts$1 */
    static final class C317151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317151(Continuation<? super C317151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CountEventContracts(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "CountEvents")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$CountEvents$1 */
    static final class C317161 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317161(Continuation<? super C317161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CountEvents(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {93}, m3647m = "GetEvent")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetEvent$1 */
    static final class C317171 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317171(Continuation<? super C317171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetEvent(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {97}, m3647m = "GetEventBracket")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetEventBracket$1 */
    static final class C317181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317181(Continuation<? super C317181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetEventBracket(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {81}, m3647m = "GetEventContract")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetEventContract$1 */
    static final class C317191 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317191(Continuation<? super C317191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetEventContract(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {101}, m3647m = "GetEventTopic")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetEventTopic$1 */
    static final class C317201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317201(Continuation<? super C317201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetEventTopic(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {37}, m3647m = "GetFuturesCombinedCommodity")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetFuturesCombinedCommodity$1 */
    static final class C317211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317211(Continuation<? super C317211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetFuturesCombinedCommodity(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {17}, m3647m = "GetFuturesContract")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetFuturesContract$1 */
    static final class C317221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317221(Continuation<? super C317221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetFuturesContract(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {21}, m3647m = "GetFuturesContractBySymbol")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetFuturesContractBySymbol$1 */
    static final class C317231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317231(Continuation<? super C317231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetFuturesContractBySymbol(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {29}, m3647m = "GetFuturesContractWithTradability")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetFuturesContractWithTradability$1 */
    static final class C317241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317241(Continuation<? super C317241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetFuturesContractWithTradability(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {33}, m3647m = "GetFuturesProduct")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetFuturesProduct$1 */
    static final class C317251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317251(Continuation<? super C317251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetFuturesProduct(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {55}, m3647m = "GetMarginRequirement")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetMarginRequirement$1 */
    static final class C317261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317261(Continuation<? super C317261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetMarginRequirement(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {41}, m3647m = "GetTradingHoursInfo")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetTradingHoursInfo$1 */
    static final class C317271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317271(Continuation<? super C317271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetTradingHoursInfo(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {51}, m3647m = "GetTradingSessions")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$GetTradingSessions$1 */
    static final class C317281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317281(Continuation<? super C317281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetTradingSessions(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {63}, m3647m = "ListActiveFuturesContractSchedules")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$ListActiveFuturesContractSchedules$1 */
    static final class C317291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317291(Continuation<? super C317291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListActiveFuturesContractSchedules(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {85}, m3647m = "ListEventContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$ListEventContracts$1 */
    static final class C317301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317301(Continuation<? super C317301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListEventContracts(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {105}, m3647m = "ListEventTopics")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$ListEventTopics$1 */
    static final class C317311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317311(Continuation<? super C317311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListEventTopics(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {89}, m3647m = "ListEvents")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$ListEvents$1 */
    static final class C317321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317321(Continuation<? super C317321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListEvents(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {25}, m3647m = "ListFuturesContracts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$ListFuturesContracts$1 */
    static final class C317331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317331(Continuation<? super C317331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListFuturesContracts(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {59}, m3647m = "ListFuturesProducts")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$ListFuturesProducts$1 */
    static final class C317341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317341(Continuation<? super C317341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListFuturesProducts(null, null, this);
        }
    }

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.arsenal.proto.v1.idl.InstrumentService$DefaultImpls", m3645f = "InstrumentService.kt", m3646l = {109}, m3647m = "ListRelevantEventTopics")
    /* renamed from: com.robinhood.arsenal.proto.v1.idl.InstrumentService$ListRelevantEventTopics$1 */
    static final class C317351 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C317351(Continuation<? super C317351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListRelevantEventTopics(null, null, this);
        }
    }

    Object CountEventContracts(CountEventContractsRequestDto countEventContractsRequestDto, Continuation<? super CountEventContractsResponseDto> continuation);

    Object CountEventContracts(Request<CountEventContractsRequestDto> request, Continuation<? super Response<CountEventContractsResponseDto>> continuation);

    Object CountEvents(CountEventsRequestDto countEventsRequestDto, Continuation<? super CountEventsResponseDto> continuation);

    Object CountEvents(Request<CountEventsRequestDto> request, Continuation<? super Response<CountEventsResponseDto>> continuation);

    Object GetEvent(GetEventRequestDto getEventRequestDto, Continuation<? super EventDto> continuation);

    Object GetEvent(Request<GetEventRequestDto> request, Continuation<? super Response<EventDto>> continuation);

    Object GetEventBracket(GetEventBracketRequestDto getEventBracketRequestDto, Continuation<? super EventBracketDto> continuation);

    Object GetEventBracket(Request<GetEventBracketRequestDto> request, Continuation<? super Response<EventBracketDto>> continuation);

    Object GetEventContract(GetEventContractRequestDto getEventContractRequestDto, Continuation<? super EventContractDto> continuation);

    Object GetEventContract(Request<GetEventContractRequestDto> request, Continuation<? super Response<EventContractDto>> continuation);

    Object GetEventTopic(GetEventTopicRequestDto getEventTopicRequestDto, Continuation<? super EventTopicDto> continuation);

    Object GetEventTopic(Request<GetEventTopicRequestDto> request, Continuation<? super Response<EventTopicDto>> continuation);

    Object GetFuturesCombinedCommodity(GetFuturesCombinedCommodityRequestDto getFuturesCombinedCommodityRequestDto, Continuation<? super CombinedCommodityDto> continuation);

    Object GetFuturesCombinedCommodity(Request<GetFuturesCombinedCommodityRequestDto> request, Continuation<? super Response<CombinedCommodityDto>> continuation);

    Object GetFuturesContract(GetFuturesContractRequestDto getFuturesContractRequestDto, Continuation<? super FuturesContractDto> continuation);

    Object GetFuturesContract(Request<GetFuturesContractRequestDto> request, Continuation<? super Response<FuturesContractDto>> continuation);

    Object GetFuturesContractBySymbol(GetFuturesContractBySymbolRequestDto getFuturesContractBySymbolRequestDto, Continuation<? super GetFuturesContractBySymbolResponseDto> continuation);

    Object GetFuturesContractBySymbol(Request<GetFuturesContractBySymbolRequestDto> request, Continuation<? super Response<GetFuturesContractBySymbolResponseDto>> continuation);

    Object GetFuturesContractWithTradability(GetFuturesContractWithTradabilityRequestDto getFuturesContractWithTradabilityRequestDto, Continuation<? super GetFuturesContractWithTradabilityResponseDto> continuation);

    Object GetFuturesContractWithTradability(Request<GetFuturesContractWithTradabilityRequestDto> request, Continuation<? super Response<GetFuturesContractWithTradabilityResponseDto>> continuation);

    Object GetFuturesProduct(GetFuturesProductRequestDto getFuturesProductRequestDto, Continuation<? super ProductDto> continuation);

    Object GetFuturesProduct(Request<GetFuturesProductRequestDto> request, Continuation<? super Response<ProductDto>> continuation);

    Object GetMarginRequirement(GetMarginRequirementRequestDto getMarginRequirementRequestDto, Continuation<? super MarginRequirementDto> continuation);

    Object GetMarginRequirement(Request<GetMarginRequirementRequestDto> request, Continuation<? super Response<MarginRequirementDto>> continuation);

    Object GetTradingHoursInfo(GetTradingHoursInfoRequestDto getTradingHoursInfoRequestDto, Continuation<? super TradingHoursInfoDto> continuation);

    Object GetTradingHoursInfo(Request<GetTradingHoursInfoRequestDto> request, Continuation<? super Response<TradingHoursInfoDto>> continuation);

    Object GetTradingSessions(GetTradingSessionsRequestDto getTradingSessionsRequestDto, Continuation<? super TradingSessionsDto> continuation);

    Object GetTradingSessions(Request<GetTradingSessionsRequestDto> request, Continuation<? super Response<TradingSessionsDto>> continuation);

    Object ListActiveFuturesContractSchedules(ListActiveFuturesContractSchedulesRequestDto listActiveFuturesContractSchedulesRequestDto, Continuation<? super ListActiveFuturesContractSchedulesResponseDto> continuation);

    Object ListActiveFuturesContractSchedules(Request<ListActiveFuturesContractSchedulesRequestDto> request, Continuation<? super Response<ListActiveFuturesContractSchedulesResponseDto>> continuation);

    Object ListEventContracts(ListEventContractsRequestDto listEventContractsRequestDto, Continuation<? super ListEventContractsResponseDto> continuation);

    Object ListEventContracts(Request<ListEventContractsRequestDto> request, Continuation<? super Response<ListEventContractsResponseDto>> continuation);

    Object ListEventTopics(ListEventTopicsRequestDto listEventTopicsRequestDto, Continuation<? super ListEventTopicsResponseDto> continuation);

    Object ListEventTopics(Request<ListEventTopicsRequestDto> request, Continuation<? super Response<ListEventTopicsResponseDto>> continuation);

    Object ListEvents(ListEventsRequestDto listEventsRequestDto, Continuation<? super ListEventsResponseDto> continuation);

    Object ListEvents(Request<ListEventsRequestDto> request, Continuation<? super Response<ListEventsResponseDto>> continuation);

    Object ListFuturesContracts(ListFuturesContractsRequestDto listFuturesContractsRequestDto, Continuation<? super ListFuturesContractsResponseDto> continuation);

    Object ListFuturesContracts(Request<ListFuturesContractsRequestDto> request, Continuation<? super Response<ListFuturesContractsResponseDto>> continuation);

    Object ListFuturesProducts(ListFuturesProductsRequestDto listFuturesProductsRequestDto, Continuation<? super ListFuturesProductsResponseDto> continuation);

    Object ListFuturesProducts(Request<ListFuturesProductsRequestDto> request, Continuation<? super Response<ListFuturesProductsResponseDto>> continuation);

    Object ListRelevantEventTopics(ListRelevantEventTopicsRequestDto listRelevantEventTopicsRequestDto, Continuation<? super ListRelevantEventTopicsResponseDto> continuation);

    Object ListRelevantEventTopics(Request<ListRelevantEventTopicsRequestDto> request, Continuation<? super Response<ListRelevantEventTopicsResponseDto>> continuation);

    /* compiled from: InstrumentService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetFuturesContract(InstrumentService instrumentService, Request<GetFuturesContractRequestDto> request, Continuation<? super Response<FuturesContractDto>> continuation) {
            C317221 c317221;
            if (continuation instanceof C317221) {
                c317221 = (C317221) continuation;
                int i = c317221.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317221.label = i - Integer.MIN_VALUE;
                } else {
                    c317221 = new C317221(continuation);
                }
            }
            Object objGetFuturesContract = c317221.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317221.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetFuturesContract);
                GetFuturesContractRequestDto data = request.getData();
                c317221.label = 1;
                objGetFuturesContract = instrumentService.GetFuturesContract(data, c317221);
                if (objGetFuturesContract == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetFuturesContract);
            }
            return new Response(objGetFuturesContract, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetFuturesContractBySymbol(InstrumentService instrumentService, Request<GetFuturesContractBySymbolRequestDto> request, Continuation<? super Response<GetFuturesContractBySymbolResponseDto>> continuation) {
            C317231 c317231;
            if (continuation instanceof C317231) {
                c317231 = (C317231) continuation;
                int i = c317231.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317231.label = i - Integer.MIN_VALUE;
                } else {
                    c317231 = new C317231(continuation);
                }
            }
            Object objGetFuturesContractBySymbol = c317231.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317231.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetFuturesContractBySymbol);
                GetFuturesContractBySymbolRequestDto data = request.getData();
                c317231.label = 1;
                objGetFuturesContractBySymbol = instrumentService.GetFuturesContractBySymbol(data, c317231);
                if (objGetFuturesContractBySymbol == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetFuturesContractBySymbol);
            }
            return new Response(objGetFuturesContractBySymbol, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListFuturesContracts(InstrumentService instrumentService, Request<ListFuturesContractsRequestDto> request, Continuation<? super Response<ListFuturesContractsResponseDto>> continuation) {
            C317331 c317331;
            if (continuation instanceof C317331) {
                c317331 = (C317331) continuation;
                int i = c317331.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317331.label = i - Integer.MIN_VALUE;
                } else {
                    c317331 = new C317331(continuation);
                }
            }
            Object objListFuturesContracts = c317331.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317331.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListFuturesContracts);
                ListFuturesContractsRequestDto data = request.getData();
                c317331.label = 1;
                objListFuturesContracts = instrumentService.ListFuturesContracts(data, c317331);
                if (objListFuturesContracts == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListFuturesContracts);
            }
            return new Response(objListFuturesContracts, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetFuturesContractWithTradability(InstrumentService instrumentService, Request<GetFuturesContractWithTradabilityRequestDto> request, Continuation<? super Response<GetFuturesContractWithTradabilityResponseDto>> continuation) {
            C317241 c317241;
            if (continuation instanceof C317241) {
                c317241 = (C317241) continuation;
                int i = c317241.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317241.label = i - Integer.MIN_VALUE;
                } else {
                    c317241 = new C317241(continuation);
                }
            }
            Object objGetFuturesContractWithTradability = c317241.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317241.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetFuturesContractWithTradability);
                GetFuturesContractWithTradabilityRequestDto data = request.getData();
                c317241.label = 1;
                objGetFuturesContractWithTradability = instrumentService.GetFuturesContractWithTradability(data, c317241);
                if (objGetFuturesContractWithTradability == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetFuturesContractWithTradability);
            }
            return new Response(objGetFuturesContractWithTradability, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetFuturesProduct(InstrumentService instrumentService, Request<GetFuturesProductRequestDto> request, Continuation<? super Response<ProductDto>> continuation) {
            C317251 c317251;
            if (continuation instanceof C317251) {
                c317251 = (C317251) continuation;
                int i = c317251.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317251.label = i - Integer.MIN_VALUE;
                } else {
                    c317251 = new C317251(continuation);
                }
            }
            Object objGetFuturesProduct = c317251.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317251.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetFuturesProduct);
                GetFuturesProductRequestDto data = request.getData();
                c317251.label = 1;
                objGetFuturesProduct = instrumentService.GetFuturesProduct(data, c317251);
                if (objGetFuturesProduct == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetFuturesProduct);
            }
            return new Response(objGetFuturesProduct, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetFuturesCombinedCommodity(InstrumentService instrumentService, Request<GetFuturesCombinedCommodityRequestDto> request, Continuation<? super Response<CombinedCommodityDto>> continuation) {
            C317211 c317211;
            if (continuation instanceof C317211) {
                c317211 = (C317211) continuation;
                int i = c317211.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317211.label = i - Integer.MIN_VALUE;
                } else {
                    c317211 = new C317211(continuation);
                }
            }
            Object objGetFuturesCombinedCommodity = c317211.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317211.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetFuturesCombinedCommodity);
                GetFuturesCombinedCommodityRequestDto data = request.getData();
                c317211.label = 1;
                objGetFuturesCombinedCommodity = instrumentService.GetFuturesCombinedCommodity(data, c317211);
                if (objGetFuturesCombinedCommodity == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetFuturesCombinedCommodity);
            }
            return new Response(objGetFuturesCombinedCommodity, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetTradingHoursInfo(InstrumentService instrumentService, Request<GetTradingHoursInfoRequestDto> request, Continuation<? super Response<TradingHoursInfoDto>> continuation) {
            C317271 c317271;
            if (continuation instanceof C317271) {
                c317271 = (C317271) continuation;
                int i = c317271.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317271.label = i - Integer.MIN_VALUE;
                } else {
                    c317271 = new C317271(continuation);
                }
            }
            Object objGetTradingHoursInfo = c317271.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317271.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetTradingHoursInfo);
                GetTradingHoursInfoRequestDto data = request.getData();
                c317271.label = 1;
                objGetTradingHoursInfo = instrumentService.GetTradingHoursInfo(data, c317271);
                if (objGetTradingHoursInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetTradingHoursInfo);
            }
            return new Response(objGetTradingHoursInfo, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetTradingSessions(InstrumentService instrumentService, Request<GetTradingSessionsRequestDto> request, Continuation<? super Response<TradingSessionsDto>> continuation) {
            C317281 c317281;
            if (continuation instanceof C317281) {
                c317281 = (C317281) continuation;
                int i = c317281.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317281.label = i - Integer.MIN_VALUE;
                } else {
                    c317281 = new C317281(continuation);
                }
            }
            Object objGetTradingSessions = c317281.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317281.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetTradingSessions);
                GetTradingSessionsRequestDto data = request.getData();
                c317281.label = 1;
                objGetTradingSessions = instrumentService.GetTradingSessions(data, c317281);
                if (objGetTradingSessions == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetTradingSessions);
            }
            return new Response(objGetTradingSessions, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetMarginRequirement(InstrumentService instrumentService, Request<GetMarginRequirementRequestDto> request, Continuation<? super Response<MarginRequirementDto>> continuation) {
            C317261 c317261;
            if (continuation instanceof C317261) {
                c317261 = (C317261) continuation;
                int i = c317261.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317261.label = i - Integer.MIN_VALUE;
                } else {
                    c317261 = new C317261(continuation);
                }
            }
            Object objGetMarginRequirement = c317261.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317261.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetMarginRequirement);
                GetMarginRequirementRequestDto data = request.getData();
                c317261.label = 1;
                objGetMarginRequirement = instrumentService.GetMarginRequirement(data, c317261);
                if (objGetMarginRequirement == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetMarginRequirement);
            }
            return new Response(objGetMarginRequirement, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListFuturesProducts(InstrumentService instrumentService, Request<ListFuturesProductsRequestDto> request, Continuation<? super Response<ListFuturesProductsResponseDto>> continuation) {
            C317341 c317341;
            if (continuation instanceof C317341) {
                c317341 = (C317341) continuation;
                int i = c317341.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317341.label = i - Integer.MIN_VALUE;
                } else {
                    c317341 = new C317341(continuation);
                }
            }
            Object objListFuturesProducts = c317341.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317341.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListFuturesProducts);
                ListFuturesProductsRequestDto data = request.getData();
                c317341.label = 1;
                objListFuturesProducts = instrumentService.ListFuturesProducts(data, c317341);
                if (objListFuturesProducts == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListFuturesProducts);
            }
            return new Response(objListFuturesProducts, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListActiveFuturesContractSchedules(InstrumentService instrumentService, Request<ListActiveFuturesContractSchedulesRequestDto> request, Continuation<? super Response<ListActiveFuturesContractSchedulesResponseDto>> continuation) {
            C317291 c317291;
            if (continuation instanceof C317291) {
                c317291 = (C317291) continuation;
                int i = c317291.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317291.label = i - Integer.MIN_VALUE;
                } else {
                    c317291 = new C317291(continuation);
                }
            }
            Object objListActiveFuturesContractSchedules = c317291.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317291.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListActiveFuturesContractSchedules);
                ListActiveFuturesContractSchedulesRequestDto data = request.getData();
                c317291.label = 1;
                objListActiveFuturesContractSchedules = instrumentService.ListActiveFuturesContractSchedules(data, c317291);
                if (objListActiveFuturesContractSchedules == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListActiveFuturesContractSchedules);
            }
            return new Response(objListActiveFuturesContractSchedules, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CountEventContracts(InstrumentService instrumentService, Request<CountEventContractsRequestDto> request, Continuation<? super Response<CountEventContractsResponseDto>> continuation) {
            C317151 c317151;
            if (continuation instanceof C317151) {
                c317151 = (C317151) continuation;
                int i = c317151.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317151.label = i - Integer.MIN_VALUE;
                } else {
                    c317151 = new C317151(continuation);
                }
            }
            Object objCountEventContracts = c317151.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317151.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCountEventContracts);
                CountEventContractsRequestDto data = request.getData();
                c317151.label = 1;
                objCountEventContracts = instrumentService.CountEventContracts(data, c317151);
                if (objCountEventContracts == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCountEventContracts);
            }
            return new Response(objCountEventContracts, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CountEvents(InstrumentService instrumentService, Request<CountEventsRequestDto> request, Continuation<? super Response<CountEventsResponseDto>> continuation) {
            C317161 c317161;
            if (continuation instanceof C317161) {
                c317161 = (C317161) continuation;
                int i = c317161.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317161.label = i - Integer.MIN_VALUE;
                } else {
                    c317161 = new C317161(continuation);
                }
            }
            Object objCountEvents = c317161.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317161.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCountEvents);
                CountEventsRequestDto data = request.getData();
                c317161.label = 1;
                objCountEvents = instrumentService.CountEvents(data, c317161);
                if (objCountEvents == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCountEvents);
            }
            return new Response(objCountEvents, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetEventContract(InstrumentService instrumentService, Request<GetEventContractRequestDto> request, Continuation<? super Response<EventContractDto>> continuation) {
            C317191 c317191;
            if (continuation instanceof C317191) {
                c317191 = (C317191) continuation;
                int i = c317191.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317191.label = i - Integer.MIN_VALUE;
                } else {
                    c317191 = new C317191(continuation);
                }
            }
            Object objGetEventContract = c317191.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317191.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetEventContract);
                GetEventContractRequestDto data = request.getData();
                c317191.label = 1;
                objGetEventContract = instrumentService.GetEventContract(data, c317191);
                if (objGetEventContract == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetEventContract);
            }
            return new Response(objGetEventContract, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListEventContracts(InstrumentService instrumentService, Request<ListEventContractsRequestDto> request, Continuation<? super Response<ListEventContractsResponseDto>> continuation) {
            C317301 c317301;
            if (continuation instanceof C317301) {
                c317301 = (C317301) continuation;
                int i = c317301.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317301.label = i - Integer.MIN_VALUE;
                } else {
                    c317301 = new C317301(continuation);
                }
            }
            Object objListEventContracts = c317301.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317301.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListEventContracts);
                ListEventContractsRequestDto data = request.getData();
                c317301.label = 1;
                objListEventContracts = instrumentService.ListEventContracts(data, c317301);
                if (objListEventContracts == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListEventContracts);
            }
            return new Response(objListEventContracts, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListEvents(InstrumentService instrumentService, Request<ListEventsRequestDto> request, Continuation<? super Response<ListEventsResponseDto>> continuation) {
            C317321 c317321;
            if (continuation instanceof C317321) {
                c317321 = (C317321) continuation;
                int i = c317321.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317321.label = i - Integer.MIN_VALUE;
                } else {
                    c317321 = new C317321(continuation);
                }
            }
            Object objListEvents = c317321.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317321.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListEvents);
                ListEventsRequestDto data = request.getData();
                c317321.label = 1;
                objListEvents = instrumentService.ListEvents(data, c317321);
                if (objListEvents == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListEvents);
            }
            return new Response(objListEvents, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetEvent(InstrumentService instrumentService, Request<GetEventRequestDto> request, Continuation<? super Response<EventDto>> continuation) {
            C317171 c317171;
            if (continuation instanceof C317171) {
                c317171 = (C317171) continuation;
                int i = c317171.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317171.label = i - Integer.MIN_VALUE;
                } else {
                    c317171 = new C317171(continuation);
                }
            }
            Object objGetEvent = c317171.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317171.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetEvent);
                GetEventRequestDto data = request.getData();
                c317171.label = 1;
                objGetEvent = instrumentService.GetEvent(data, c317171);
                if (objGetEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetEvent);
            }
            return new Response(objGetEvent, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetEventBracket(InstrumentService instrumentService, Request<GetEventBracketRequestDto> request, Continuation<? super Response<EventBracketDto>> continuation) {
            C317181 c317181;
            if (continuation instanceof C317181) {
                c317181 = (C317181) continuation;
                int i = c317181.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317181.label = i - Integer.MIN_VALUE;
                } else {
                    c317181 = new C317181(continuation);
                }
            }
            Object objGetEventBracket = c317181.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317181.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetEventBracket);
                GetEventBracketRequestDto data = request.getData();
                c317181.label = 1;
                objGetEventBracket = instrumentService.GetEventBracket(data, c317181);
                if (objGetEventBracket == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetEventBracket);
            }
            return new Response(objGetEventBracket, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetEventTopic(InstrumentService instrumentService, Request<GetEventTopicRequestDto> request, Continuation<? super Response<EventTopicDto>> continuation) {
            C317201 c317201;
            if (continuation instanceof C317201) {
                c317201 = (C317201) continuation;
                int i = c317201.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317201.label = i - Integer.MIN_VALUE;
                } else {
                    c317201 = new C317201(continuation);
                }
            }
            Object objGetEventTopic = c317201.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317201.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetEventTopic);
                GetEventTopicRequestDto data = request.getData();
                c317201.label = 1;
                objGetEventTopic = instrumentService.GetEventTopic(data, c317201);
                if (objGetEventTopic == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetEventTopic);
            }
            return new Response(objGetEventTopic, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListEventTopics(InstrumentService instrumentService, Request<ListEventTopicsRequestDto> request, Continuation<? super Response<ListEventTopicsResponseDto>> continuation) {
            C317311 c317311;
            if (continuation instanceof C317311) {
                c317311 = (C317311) continuation;
                int i = c317311.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317311.label = i - Integer.MIN_VALUE;
                } else {
                    c317311 = new C317311(continuation);
                }
            }
            Object objListEventTopics = c317311.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317311.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListEventTopics);
                ListEventTopicsRequestDto data = request.getData();
                c317311.label = 1;
                objListEventTopics = instrumentService.ListEventTopics(data, c317311);
                if (objListEventTopics == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListEventTopics);
            }
            return new Response(objListEventTopics, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListRelevantEventTopics(InstrumentService instrumentService, Request<ListRelevantEventTopicsRequestDto> request, Continuation<? super Response<ListRelevantEventTopicsResponseDto>> continuation) {
            C317351 c317351;
            if (continuation instanceof C317351) {
                c317351 = (C317351) continuation;
                int i = c317351.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c317351.label = i - Integer.MIN_VALUE;
                } else {
                    c317351 = new C317351(continuation);
                }
            }
            Object objListRelevantEventTopics = c317351.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c317351.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListRelevantEventTopics);
                ListRelevantEventTopicsRequestDto data = request.getData();
                c317351.label = 1;
                objListRelevantEventTopics = instrumentService.ListRelevantEventTopics(data, c317351);
                if (objListRelevantEventTopics == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListRelevantEventTopics);
            }
            return new Response(objListRelevantEventTopics, null, 2, null);
        }
    }
}
