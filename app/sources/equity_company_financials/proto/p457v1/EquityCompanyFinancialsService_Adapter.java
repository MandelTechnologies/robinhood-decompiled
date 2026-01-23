package equity_company_financials.proto.p457v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import equity_company_financials.proto.p457v1.EquityCompanyFinancialsService_Adapter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: EquityCompanyFinancialsService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u001f !\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\n\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006#"}, m3636d2 = {"Lequity_company_financials/proto/v1/EquityCompanyFinancialsService_Adapter;", "Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponseDto;", "StreamCompanyFinancialsSection", "(Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lequity_company_financials/proto/v1/SetSelectedTimePeriodRequestDto;", "Lequity_company_financials/proto/v1/SetSelectedTimePeriodResponseDto;", "SetSelectedTimePeriod", "(Lequity_company_financials/proto/v1/SetSelectedTimePeriodRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_company_financials/proto/v1/SetScrubIndexRequestDto;", "Lequity_company_financials/proto/v1/SetScrubIndexResponseDto;", "SetScrubIndex", "(Lequity_company_financials/proto/v1/SetScrubIndexRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_company_financials/proto/v1/StreamSupportedInstrumentsRequestDto;", "Lequity_company_financials/proto/v1/StreamSupportedInstrumentsResponseDto;", "StreamSupportedInstruments", "(Lequity_company_financials/proto/v1/StreamSupportedInstrumentsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "StreamCompanyFinancialsSectionEndpoint", "SetSelectedTimePeriodEndpoint", "SetScrubIndexEndpoint", "StreamSupportedInstrumentsEndpoint", "equity_company_financials.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class EquityCompanyFinancialsService_Adapter implements EquityCompanyFinancialsService {
    private final ClientBridge __bridge;
    private final Json json;

    public EquityCompanyFinancialsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // equity_company_financials.proto.p457v1.EquityCompanyFinancialsService
    public Flow<StreamCompanyFinancialsSectionResponseDto> StreamCompanyFinancialsSection(StreamCompanyFinancialsSectionRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamCompanyFinancialsSectionRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamCompanyFinancialsSectionResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamCompanyFinancialsSection", request, null, 32, null);
    }

    @Override // equity_company_financials.proto.p457v1.EquityCompanyFinancialsService
    public Object SetSelectedTimePeriod(SetSelectedTimePeriodRequestDto setSelectedTimePeriodRequestDto, Continuation<? super SetSelectedTimePeriodResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, SetSelectedTimePeriodRequestDto.INSTANCE.getBinaryBase64Serializer(), SetSelectedTimePeriodResponseDto.INSTANCE.getBinaryBase64Serializer(), "SetSelectedTimePeriod", setSelectedTimePeriodRequestDto, continuation);
    }

    @Override // equity_company_financials.proto.p457v1.EquityCompanyFinancialsService
    public Object SetScrubIndex(SetScrubIndexRequestDto setScrubIndexRequestDto, Continuation<? super SetScrubIndexResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, SetScrubIndexRequestDto.INSTANCE.getBinaryBase64Serializer(), SetScrubIndexResponseDto.INSTANCE.getBinaryBase64Serializer(), "SetScrubIndex", setScrubIndexRequestDto, continuation);
    }

    @Override // equity_company_financials.proto.p457v1.EquityCompanyFinancialsService
    public Flow<StreamSupportedInstrumentsResponseDto> StreamSupportedInstruments(StreamSupportedInstrumentsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamSupportedInstrumentsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSupportedInstrumentsResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamSupportedInstruments", request, null, 32, null);
    }

    /* compiled from: EquityCompanyFinancialsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_company_financials/proto/v1/EquityCompanyFinancialsService_Adapter$StreamCompanyFinancialsSectionEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_company_financials.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamCompanyFinancialsSectionEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityCompanyFinancialsService service;

        public StreamCompanyFinancialsSectionEndpoint(EquityCompanyFinancialsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamCompanyFinancialsSectionRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamCompanyFinancialsSectionResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: equity_company_financials.proto.v1.EquityCompanyFinancialsService_Adapter$StreamCompanyFinancialsSectionEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityCompanyFinancialsService_Adapter.StreamCompanyFinancialsSectionEndpoint.call$lambda$0(this.f$0, (StreamCompanyFinancialsSectionRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamCompanyFinancialsSectionEndpoint streamCompanyFinancialsSectionEndpoint, StreamCompanyFinancialsSectionRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamCompanyFinancialsSectionEndpoint.service.StreamCompanyFinancialsSection(request);
        }
    }

    /* compiled from: EquityCompanyFinancialsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_company_financials/proto/v1/EquityCompanyFinancialsService_Adapter$SetSelectedTimePeriodEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_company_financials.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SetSelectedTimePeriodEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityCompanyFinancialsService service;

        public SetSelectedTimePeriodEndpoint(EquityCompanyFinancialsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, SetSelectedTimePeriodRequestDto.INSTANCE.getBinaryBase64Serializer(), SetSelectedTimePeriodResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EquityCompanyFinancialsService_Adapter3(this, null));
        }
    }

    /* compiled from: EquityCompanyFinancialsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_company_financials/proto/v1/EquityCompanyFinancialsService_Adapter$SetScrubIndexEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_company_financials.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SetScrubIndexEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityCompanyFinancialsService service;

        public SetScrubIndexEndpoint(EquityCompanyFinancialsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, SetScrubIndexRequestDto.INSTANCE.getBinaryBase64Serializer(), SetScrubIndexResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EquityCompanyFinancialsService_Adapter2(this, null));
        }
    }

    /* compiled from: EquityCompanyFinancialsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_company_financials/proto/v1/EquityCompanyFinancialsService_Adapter$StreamSupportedInstrumentsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_company_financials/proto/v1/EquityCompanyFinancialsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_company_financials.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamSupportedInstrumentsEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityCompanyFinancialsService service;

        public StreamSupportedInstrumentsEndpoint(EquityCompanyFinancialsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamSupportedInstrumentsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSupportedInstrumentsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: equity_company_financials.proto.v1.EquityCompanyFinancialsService_Adapter$StreamSupportedInstrumentsEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityCompanyFinancialsService_Adapter.StreamSupportedInstrumentsEndpoint.call$lambda$0(this.f$0, (StreamSupportedInstrumentsRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamSupportedInstrumentsEndpoint streamSupportedInstrumentsEndpoint, StreamSupportedInstrumentsRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamSupportedInstrumentsEndpoint.service.StreamSupportedInstruments(request);
        }
    }
}
