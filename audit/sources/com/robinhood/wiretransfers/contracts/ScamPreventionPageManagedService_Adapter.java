package com.robinhood.wiretransfers.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: ScamPreventionPageManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService_Adapter;", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;", "selectionType", "", "buttonSelected", "(Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_buttonSelected", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class ScamPreventionPageManagedService_Adapter implements ScamPreventionPageManagedService {
    private final ClientBridge __bridge;
    private final Json json;

    public ScamPreventionPageManagedService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // com.robinhood.wiretransfers.contracts.ScamPreventionPageManagedService
    public Object buttonSelected(ScamPreventionButtonType scamPreventionButtonType, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_buttonSelected.Arguments arguments = new Endpoint_buttonSelected.Arguments(scamPreventionButtonType);
        json.getSerializersModule();
        KSerializer<Endpoint_buttonSelected.Arguments> kSerializerSerializer = Endpoint_buttonSelected.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "buttonSelected", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* compiled from: ScamPreventionPageManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService_Adapter$Endpoint_buttonSelected;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_buttonSelected implements ServiceCallable {
        private final Json json;
        private final ScamPreventionPageManagedService service;

        public Endpoint_buttonSelected(ScamPreventionPageManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            ScamPreventionPageManagedService_Adapter3 scamPreventionPageManagedService_Adapter3 = new ScamPreventionPageManagedService_Adapter3(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, scamPreventionPageManagedService_Adapter3);
        }

        /* compiled from: ScamPreventionPageManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService_Adapter$Endpoint_buttonSelected$Arguments;", "", "seen1", "", "selectionType", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;)V", "getSelectionType", "()Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final ScamPreventionButtonType selectionType;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {ScamPreventionButtonType.INSTANCE.serializer()};

            public static /* synthetic */ Arguments copy$default(Arguments arguments, ScamPreventionButtonType scamPreventionButtonType, int i, Object obj) {
                if ((i & 1) != 0) {
                    scamPreventionButtonType = arguments.selectionType;
                }
                return arguments.copy(scamPreventionButtonType);
            }

            /* renamed from: component1, reason: from getter */
            public final ScamPreventionButtonType getSelectionType() {
                return this.selectionType;
            }

            public final Arguments copy(ScamPreventionButtonType selectionType) {
                Intrinsics.checkNotNullParameter(selectionType, "selectionType");
                return new Arguments(selectionType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && this.selectionType == ((Arguments) other).selectionType;
            }

            public int hashCode() {
                return this.selectionType.hashCode();
            }

            public String toString() {
                return "Arguments(selectionType=" + this.selectionType + ")";
            }

            /* compiled from: ScamPreventionPageManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService_Adapter$Endpoint_buttonSelected$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService_Adapter$Endpoint_buttonSelected$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return ScamPreventionPageManagedService_Adapter2.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, ScamPreventionButtonType scamPreventionButtonType, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, ScamPreventionPageManagedService_Adapter2.INSTANCE.getDescriptor());
                }
                this.selectionType = scamPreventionButtonType;
            }

            public Arguments(ScamPreventionButtonType selectionType) {
                Intrinsics.checkNotNullParameter(selectionType, "selectionType");
                this.selectionType = selectionType;
            }

            public final ScamPreventionButtonType getSelectionType() {
                return this.selectionType;
            }
        }
    }
}
