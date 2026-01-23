package microgram.contracts.money_movement.form_entry.proto.p500v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: FormService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\"#$%&B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService_Adapter;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormForTypeRequestDto;", "request", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormForTypeResponseDto;", "GetFormForType", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormForTypeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireAccountAndRoutingNumberRequestDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireAccountAndRoutingNumberResponseDto;", "GetWireAccountAndRoutingNumber", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireAccountAndRoutingNumberRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormErrorsRequestDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormErrorsResponseDto;", "GetFormErrors", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormErrorsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireReviewScreenDisplayFieldsRequestDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireReviewScreenDisplayFieldsResponseDto;", "GetWireReviewScreenDisplayFields", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireReviewScreenDisplayFieldsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireInformationForServerRequestDto;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireInformationForServerResponseDto;", "GetWireInformationForServer", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetWireInformationForServerRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetFormForTypeEndpoint", "GetWireAccountAndRoutingNumberEndpoint", "GetFormErrorsEndpoint", "GetWireReviewScreenDisplayFieldsEndpoint", "GetWireInformationForServerEndpoint", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class FormService_Adapter implements FormService {
    private final ClientBridge __bridge;
    private final Json json;

    public FormService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // microgram.contracts.money_movement.form_entry.proto.p500v1.FormService
    public Object GetFormForType(GetFormForTypeRequestDto getFormForTypeRequestDto, Continuation<? super GetFormForTypeResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetFormForTypeRequestDto.INSTANCE.getBinaryBase64Serializer(), GetFormForTypeResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetFormForType", getFormForTypeRequestDto, continuation);
    }

    @Override // microgram.contracts.money_movement.form_entry.proto.p500v1.FormService
    public Object GetWireAccountAndRoutingNumber(GetWireAccountAndRoutingNumberRequestDto getWireAccountAndRoutingNumberRequestDto, Continuation<? super GetWireAccountAndRoutingNumberResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetWireAccountAndRoutingNumberRequestDto.INSTANCE.getBinaryBase64Serializer(), GetWireAccountAndRoutingNumberResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetWireAccountAndRoutingNumber", getWireAccountAndRoutingNumberRequestDto, continuation);
    }

    @Override // microgram.contracts.money_movement.form_entry.proto.p500v1.FormService
    public Object GetFormErrors(GetFormErrorsRequestDto getFormErrorsRequestDto, Continuation<? super GetFormErrorsResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetFormErrorsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetFormErrorsResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetFormErrors", getFormErrorsRequestDto, continuation);
    }

    @Override // microgram.contracts.money_movement.form_entry.proto.p500v1.FormService
    public Object GetWireReviewScreenDisplayFields(GetWireReviewScreenDisplayFieldsRequestDto getWireReviewScreenDisplayFieldsRequestDto, Continuation<? super GetWireReviewScreenDisplayFieldsResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetWireReviewScreenDisplayFieldsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetWireReviewScreenDisplayFieldsResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetWireReviewScreenDisplayFields", getWireReviewScreenDisplayFieldsRequestDto, continuation);
    }

    @Override // microgram.contracts.money_movement.form_entry.proto.p500v1.FormService
    public Object GetWireInformationForServer(GetWireInformationForServerRequestDto getWireInformationForServerRequestDto, Continuation<? super GetWireInformationForServerResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetWireInformationForServerRequestDto.INSTANCE.getBinaryBase64Serializer(), GetWireInformationForServerResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetWireInformationForServer", getWireInformationForServerRequestDto, continuation);
    }

    /* compiled from: FormService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService_Adapter$GetFormForTypeEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetFormForTypeEndpoint implements ServiceCallable {
        private final Json json;
        private final FormService service;

        public GetFormForTypeEndpoint(FormService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetFormForTypeRequestDto.INSTANCE.getBinaryBase64Serializer(), GetFormForTypeResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new FormService_Adapter3(this, null));
        }
    }

    /* compiled from: FormService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService_Adapter$GetWireAccountAndRoutingNumberEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetWireAccountAndRoutingNumberEndpoint implements ServiceCallable {
        private final Json json;
        private final FormService service;

        public GetWireAccountAndRoutingNumberEndpoint(FormService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetWireAccountAndRoutingNumberRequestDto.INSTANCE.getBinaryBase64Serializer(), GetWireAccountAndRoutingNumberResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new FormService_Adapter4(this, null));
        }
    }

    /* compiled from: FormService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService_Adapter$GetFormErrorsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetFormErrorsEndpoint implements ServiceCallable {
        private final Json json;
        private final FormService service;

        public GetFormErrorsEndpoint(FormService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetFormErrorsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetFormErrorsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new FormService_Adapter2(this, null));
        }
    }

    /* compiled from: FormService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService_Adapter$GetWireReviewScreenDisplayFieldsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetWireReviewScreenDisplayFieldsEndpoint implements ServiceCallable {
        private final Json json;
        private final FormService service;

        public GetWireReviewScreenDisplayFieldsEndpoint(FormService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetWireReviewScreenDisplayFieldsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetWireReviewScreenDisplayFieldsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new FormService_Adapter6(this, null));
        }
    }

    /* compiled from: FormService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService_Adapter$GetWireInformationForServerEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetWireInformationForServerEndpoint implements ServiceCallable {
        private final Json json;
        private final FormService service;

        public GetWireInformationForServerEndpoint(FormService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetWireInformationForServerRequestDto.INSTANCE.getBinaryBase64Serializer(), GetWireInformationForServerResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new FormService_Adapter5(this, null));
        }
    }
}
