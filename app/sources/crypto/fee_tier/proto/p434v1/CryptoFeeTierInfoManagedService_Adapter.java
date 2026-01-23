package crypto.fee_tier.proto.p434v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import crypto.fee_tier.proto.p434v1.CryptoFeeTierInfoManagedService_Adapter;
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

/* compiled from: CryptoFeeTierInfoManagedService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0019"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService_Adapter;", "Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto;", "StreamCryptoFeeTierInfo", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoRequestDto;", "Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoResponseDto;", "GetCryptoFeeTierInfo", "(Lcrypto/fee_tier/proto/v1/GetCryptoFeeTierInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "StreamCryptoFeeTierInfoEndpoint", "GetCryptoFeeTierInfoEndpoint", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class CryptoFeeTierInfoManagedService_Adapter implements CryptoFeeTierInfoManagedService {
    private final ClientBridge __bridge;
    private final Json json;

    public CryptoFeeTierInfoManagedService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // crypto.fee_tier.proto.p434v1.CryptoFeeTierInfoManagedService
    public Flow<StreamCryptoFeeTierInfoResponseDto> StreamCryptoFeeTierInfo(StreamCryptoFeeTierInfoRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamCryptoFeeTierInfoRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamCryptoFeeTierInfoResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamCryptoFeeTierInfo", request, null, 32, null);
    }

    @Override // crypto.fee_tier.proto.p434v1.CryptoFeeTierInfoManagedService
    public Object GetCryptoFeeTierInfo(GetCryptoFeeTierInfoRequestDto getCryptoFeeTierInfoRequestDto, Continuation<? super GetCryptoFeeTierInfoResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetCryptoFeeTierInfoRequestDto.INSTANCE.getBinaryBase64Serializer(), GetCryptoFeeTierInfoResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetCryptoFeeTierInfo", getCryptoFeeTierInfoRequestDto, continuation);
    }

    /* compiled from: CryptoFeeTierInfoManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService_Adapter$StreamCryptoFeeTierInfoEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamCryptoFeeTierInfoEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoFeeTierInfoManagedService service;

        public StreamCryptoFeeTierInfoEndpoint(CryptoFeeTierInfoManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamCryptoFeeTierInfoRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamCryptoFeeTierInfoResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: crypto.fee_tier.proto.v1.CryptoFeeTierInfoManagedService_Adapter$StreamCryptoFeeTierInfoEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoFeeTierInfoManagedService_Adapter.StreamCryptoFeeTierInfoEndpoint.call$lambda$0(this.f$0, (StreamCryptoFeeTierInfoRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamCryptoFeeTierInfoEndpoint streamCryptoFeeTierInfoEndpoint, StreamCryptoFeeTierInfoRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamCryptoFeeTierInfoEndpoint.service.StreamCryptoFeeTierInfo(request);
        }
    }

    /* compiled from: CryptoFeeTierInfoManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService_Adapter$GetCryptoFeeTierInfoEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetCryptoFeeTierInfoEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoFeeTierInfoManagedService service;

        public GetCryptoFeeTierInfoEndpoint(CryptoFeeTierInfoManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetCryptoFeeTierInfoRequestDto.INSTANCE.getBinaryBase64Serializer(), GetCryptoFeeTierInfoResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoFeeTierInfoManagedService_Adapter2(this, null));
        }
    }
}
