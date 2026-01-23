package contracts.crypto.account_preferences.proto.p428v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import contracts.crypto.account_preferences.proto.p428v1.CryptoAccountPreferencesManagedService_Adapter;
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

/* compiled from: CryptoAccountPreferencesManagedService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService_Adapter;", "Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelRequestDto;", "request", "Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelResponseDto;", "UpdateCryptoMonetizationModel", "(Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponseDto;", "StreamCryptoMonetizationModel", "(Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "UpdateCryptoMonetizationModelEndpoint", "StreamCryptoMonetizationModelEndpoint", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class CryptoAccountPreferencesManagedService_Adapter implements CryptoAccountPreferencesManagedService {
    private final ClientBridge __bridge;
    private final Json json;

    public CryptoAccountPreferencesManagedService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // contracts.crypto.account_preferences.proto.p428v1.CryptoAccountPreferencesManagedService
    public Object UpdateCryptoMonetizationModel(UpdateCryptoMonetizationModelRequestDto updateCryptoMonetizationModelRequestDto, Continuation<? super UpdateCryptoMonetizationModelResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, UpdateCryptoMonetizationModelRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateCryptoMonetizationModelResponseDto.INSTANCE.getBinaryBase64Serializer(), "UpdateCryptoMonetizationModel", updateCryptoMonetizationModelRequestDto, continuation);
    }

    @Override // contracts.crypto.account_preferences.proto.p428v1.CryptoAccountPreferencesManagedService
    public Flow<StreamCryptoMonetizationModelResponseDto> StreamCryptoMonetizationModel(StreamCryptoMonetizationModelRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamCryptoMonetizationModelRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamCryptoMonetizationModelResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamCryptoMonetizationModel", request, null, 32, null);
    }

    /* compiled from: CryptoAccountPreferencesManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService_Adapter$UpdateCryptoMonetizationModelEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateCryptoMonetizationModelEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoAccountPreferencesManagedService service;

        public UpdateCryptoMonetizationModelEndpoint(CryptoAccountPreferencesManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, UpdateCryptoMonetizationModelRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateCryptoMonetizationModelResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoAccountPreferencesManagedService_Adapter2(this, null));
        }
    }

    /* compiled from: CryptoAccountPreferencesManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService_Adapter$StreamCryptoMonetizationModelEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcontracts/crypto/account_preferences/proto/v1/CryptoAccountPreferencesManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamCryptoMonetizationModelEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoAccountPreferencesManagedService service;

        public StreamCryptoMonetizationModelEndpoint(CryptoAccountPreferencesManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamCryptoMonetizationModelRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamCryptoMonetizationModelResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: contracts.crypto.account_preferences.proto.v1.CryptoAccountPreferencesManagedService_Adapter$StreamCryptoMonetizationModelEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoAccountPreferencesManagedService_Adapter.StreamCryptoMonetizationModelEndpoint.call$lambda$0(this.f$0, (StreamCryptoMonetizationModelRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamCryptoMonetizationModelEndpoint streamCryptoMonetizationModelEndpoint, StreamCryptoMonetizationModelRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamCryptoMonetizationModelEndpoint.service.StreamCryptoMonetizationModel(request);
        }
    }
}
