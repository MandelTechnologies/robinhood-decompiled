package search_coprocessor.p542v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
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
import search_coprocessor.p542v1.SearchHighlightsService_Adapter;

/* compiled from: SearchHighlightsService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u001f !\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\n\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006#"}, m3636d2 = {"Lsearch_coprocessor/v1/SearchHighlightsService_Adapter;", "Lsearch_coprocessor/v1/SearchHighlightsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lsearch_coprocessor/v1/GetSearchHighlightsRequestDto;", "request", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "GetSearchHighlights", "(Lsearch_coprocessor/v1/GetSearchHighlightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsearch_coprocessor/v1/GetSearchSubpageContentRequestDto;", "Lsearch_coprocessor/v1/GetSearchSubpageContentResponseDto;", "GetSearchSubpageContent", "(Lsearch_coprocessor/v1/GetSearchSubpageContentRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsearch_coprocessor/v1/StreamSportEventHeroDetailsRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lsearch_coprocessor/v1/StreamSportEventHeroDetailsResponseDto;", "StreamSportEventHeroDetails", "(Lsearch_coprocessor/v1/StreamSportEventHeroDetailsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lsearch_coprocessor/v1/StreamMultiContractsHeroDetailsRequestDto;", "Lsearch_coprocessor/v1/StreamMultiContractsHeroDetailsResponseDto;", "StreamMultiContractsHeroDetails", "(Lsearch_coprocessor/v1/StreamMultiContractsHeroDetailsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetSearchHighlightsEndpoint", "GetSearchSubpageContentEndpoint", "StreamSportEventHeroDetailsEndpoint", "StreamMultiContractsHeroDetailsEndpoint", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
final class SearchHighlightsService_Adapter implements SearchHighlightsService {
    private final ClientBridge __bridge;
    private final Json json;

    public SearchHighlightsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // search_coprocessor.p542v1.SearchHighlightsService
    public Object GetSearchHighlights(GetSearchHighlightsRequestDto getSearchHighlightsRequestDto, Continuation<? super GetSearchHighlightsResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetSearchHighlightsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetSearchHighlightsResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetSearchHighlights", getSearchHighlightsRequestDto, continuation);
    }

    @Override // search_coprocessor.p542v1.SearchHighlightsService
    public Object GetSearchSubpageContent(GetSearchSubpageContentRequestDto getSearchSubpageContentRequestDto, Continuation<? super GetSearchSubpageContentResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetSearchSubpageContentRequestDto.INSTANCE.getBinaryBase64Serializer(), GetSearchSubpageContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetSearchSubpageContent", getSearchSubpageContentRequestDto, continuation);
    }

    @Override // search_coprocessor.p542v1.SearchHighlightsService
    public Flow<StreamSportEventHeroDetailsResponseDto> StreamSportEventHeroDetails(StreamSportEventHeroDetailsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamSportEventHeroDetailsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSportEventHeroDetailsResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamSportEventHeroDetails", request, null, 32, null);
    }

    @Override // search_coprocessor.p542v1.SearchHighlightsService
    public Flow<StreamMultiContractsHeroDetailsResponseDto> StreamMultiContractsHeroDetails(StreamMultiContractsHeroDetailsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamMultiContractsHeroDetailsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamMultiContractsHeroDetailsResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamMultiContractsHeroDetails", request, null, 32, null);
    }

    /* compiled from: SearchHighlightsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lsearch_coprocessor/v1/SearchHighlightsService_Adapter$GetSearchHighlightsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lsearch_coprocessor/v1/SearchHighlightsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lsearch_coprocessor/v1/SearchHighlightsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetSearchHighlightsEndpoint implements ServiceCallable {
        private final Json json;
        private final SearchHighlightsService service;

        public GetSearchHighlightsEndpoint(SearchHighlightsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetSearchHighlightsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetSearchHighlightsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new SearchHighlightsService_Adapter2(this, null));
        }
    }

    /* compiled from: SearchHighlightsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lsearch_coprocessor/v1/SearchHighlightsService_Adapter$GetSearchSubpageContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lsearch_coprocessor/v1/SearchHighlightsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lsearch_coprocessor/v1/SearchHighlightsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetSearchSubpageContentEndpoint implements ServiceCallable {
        private final Json json;
        private final SearchHighlightsService service;

        public GetSearchSubpageContentEndpoint(SearchHighlightsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetSearchSubpageContentRequestDto.INSTANCE.getBinaryBase64Serializer(), GetSearchSubpageContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new SearchHighlightsService_Adapter3(this, null));
        }
    }

    /* compiled from: SearchHighlightsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lsearch_coprocessor/v1/SearchHighlightsService_Adapter$StreamSportEventHeroDetailsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lsearch_coprocessor/v1/SearchHighlightsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lsearch_coprocessor/v1/SearchHighlightsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamSportEventHeroDetailsEndpoint implements ServiceCallable {
        private final Json json;
        private final SearchHighlightsService service;

        public StreamSportEventHeroDetailsEndpoint(SearchHighlightsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamSportEventHeroDetailsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSportEventHeroDetailsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: search_coprocessor.v1.SearchHighlightsService_Adapter$StreamSportEventHeroDetailsEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchHighlightsService_Adapter.StreamSportEventHeroDetailsEndpoint.call$lambda$0(this.f$0, (StreamSportEventHeroDetailsRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamSportEventHeroDetailsEndpoint streamSportEventHeroDetailsEndpoint, StreamSportEventHeroDetailsRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamSportEventHeroDetailsEndpoint.service.StreamSportEventHeroDetails(request);
        }
    }

    /* compiled from: SearchHighlightsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lsearch_coprocessor/v1/SearchHighlightsService_Adapter$StreamMultiContractsHeroDetailsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lsearch_coprocessor/v1/SearchHighlightsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lsearch_coprocessor/v1/SearchHighlightsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamMultiContractsHeroDetailsEndpoint implements ServiceCallable {
        private final Json json;
        private final SearchHighlightsService service;

        public StreamMultiContractsHeroDetailsEndpoint(SearchHighlightsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamMultiContractsHeroDetailsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamMultiContractsHeroDetailsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: search_coprocessor.v1.SearchHighlightsService_Adapter$StreamMultiContractsHeroDetailsEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchHighlightsService_Adapter.StreamMultiContractsHeroDetailsEndpoint.call$lambda$0(this.f$0, (StreamMultiContractsHeroDetailsRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamMultiContractsHeroDetailsEndpoint streamMultiContractsHeroDetailsEndpoint, StreamMultiContractsHeroDetailsRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamMultiContractsHeroDetailsEndpoint.service.StreamMultiContractsHeroDetails(request);
        }
    }
}
