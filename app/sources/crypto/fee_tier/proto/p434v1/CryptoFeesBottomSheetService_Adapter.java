package crypto.fee_tier.proto.p434v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import crypto.fee_tier.proto.p434v1.CryptoFeesBottomSheetService_Adapter;
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

/* compiled from: CryptoFeesBottomSheetService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0019"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService_Adapter;", "Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcrypto/fee_tier/proto/v1/LaunchFeeTierUpsellBottomSheetRequestDto;", "request", "Lcrypto/fee_tier/proto/v1/LaunchFeeTierUpsellBottomSheetResponseDto;", "LaunchFeeTierUpsellBottomSheet", "(Lcrypto/fee_tier/proto/v1/LaunchFeeTierUpsellBottomSheetRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcrypto/fee_tier/proto/v1/StreamFeeTierUpsellBottomSheetEventRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lcrypto/fee_tier/proto/v1/StreamFeeTierUpsellBottomSheetEventResponseDto;", "StreamFeeTierUpsellBottomSheetEvent", "(Lcrypto/fee_tier/proto/v1/StreamFeeTierUpsellBottomSheetEventRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "LaunchFeeTierUpsellBottomSheetEndpoint", "StreamFeeTierUpsellBottomSheetEventEndpoint", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class CryptoFeesBottomSheetService_Adapter implements CryptoFeesBottomSheetService {
    private final ClientBridge __bridge;
    private final Json json;

    public CryptoFeesBottomSheetService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // crypto.fee_tier.proto.p434v1.CryptoFeesBottomSheetService
    public Object LaunchFeeTierUpsellBottomSheet(LaunchFeeTierUpsellBottomSheetRequestDto launchFeeTierUpsellBottomSheetRequestDto, Continuation<? super LaunchFeeTierUpsellBottomSheetResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, LaunchFeeTierUpsellBottomSheetRequestDto.INSTANCE.getBinaryBase64Serializer(), LaunchFeeTierUpsellBottomSheetResponseDto.INSTANCE.getBinaryBase64Serializer(), "LaunchFeeTierUpsellBottomSheet", launchFeeTierUpsellBottomSheetRequestDto, continuation);
    }

    @Override // crypto.fee_tier.proto.p434v1.CryptoFeesBottomSheetService
    public Flow<StreamFeeTierUpsellBottomSheetEventResponseDto> StreamFeeTierUpsellBottomSheetEvent(StreamFeeTierUpsellBottomSheetEventRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamFeeTierUpsellBottomSheetEventRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamFeeTierUpsellBottomSheetEventResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamFeeTierUpsellBottomSheetEvent", request, null, 32, null);
    }

    /* compiled from: CryptoFeesBottomSheetService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService_Adapter$LaunchFeeTierUpsellBottomSheetEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LaunchFeeTierUpsellBottomSheetEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoFeesBottomSheetService service;

        public LaunchFeeTierUpsellBottomSheetEndpoint(CryptoFeesBottomSheetService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, LaunchFeeTierUpsellBottomSheetRequestDto.INSTANCE.getBinaryBase64Serializer(), LaunchFeeTierUpsellBottomSheetResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoFeesBottomSheetService_Adapter2(this, null));
        }
    }

    /* compiled from: CryptoFeesBottomSheetService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService_Adapter$StreamFeeTierUpsellBottomSheetEventEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcrypto/fee_tier/proto/v1/CryptoFeesBottomSheetService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamFeeTierUpsellBottomSheetEventEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoFeesBottomSheetService service;

        public StreamFeeTierUpsellBottomSheetEventEndpoint(CryptoFeesBottomSheetService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamFeeTierUpsellBottomSheetEventRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamFeeTierUpsellBottomSheetEventResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: crypto.fee_tier.proto.v1.CryptoFeesBottomSheetService_Adapter$StreamFeeTierUpsellBottomSheetEventEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoFeesBottomSheetService_Adapter.StreamFeeTierUpsellBottomSheetEventEndpoint.call$lambda$0(this.f$0, (StreamFeeTierUpsellBottomSheetEventRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamFeeTierUpsellBottomSheetEventEndpoint streamFeeTierUpsellBottomSheetEventEndpoint, StreamFeeTierUpsellBottomSheetEventRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamFeeTierUpsellBottomSheetEventEndpoint.service.StreamFeeTierUpsellBottomSheetEvent(request);
        }
    }
}
