package com.robinhood.microgram.iac.crosssell.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.microgram.iac.crosssell.contracts.CrossSellRouterService_Adapter;
import java.io.IOException;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: CrossSellRouterService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService_Adapter;", "Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "launchDemoHalfSheet", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "location", "", "optionalParams", "Lkotlinx/coroutines/flow/Flow;", "pollBottomSheets", "(Ljava/lang/String;Ljava/util/Map;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_launchDemoHalfSheet", "Endpoint_pollBottomSheets", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class CrossSellRouterService_Adapter implements CrossSellRouterService {
    private final ClientBridge __bridge;
    private final Json json;

    public CrossSellRouterService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // com.robinhood.microgram.iac.crosssell.contracts.CrossSellRouterService
    public Object launchDemoHalfSheet(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Unit unit = Unit.INSTANCE;
        json.getSerializersModule();
        UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, unitSerializer, "launchDemoHalfSheet", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    @Override // com.robinhood.microgram.iac.crosssell.contracts.CrossSellRouterService
    public Flow<Unit> pollBottomSheets(String location, Map<String, String> optionalParams) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(optionalParams, "optionalParams");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_pollBottomSheets.Arguments arguments = new Endpoint_pollBottomSheets.Arguments(location, optionalParams);
        json.getSerializersModule();
        KSerializer<Endpoint_pollBottomSheets.Arguments> kSerializerSerializer = Endpoint_pollBottomSheets.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        return ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "pollBottomSheets", arguments, null);
    }

    /* compiled from: CrossSellRouterService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService_Adapter$Endpoint_launchDemoHalfSheet;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_launchDemoHalfSheet implements ServiceCallable {
        private final Json json;
        private final CrossSellRouterService service;

        public Endpoint_launchDemoHalfSheet(CrossSellRouterService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            CrossSellRouterService_Adapter3 crossSellRouterService_Adapter3 = new CrossSellRouterService_Adapter3(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, unitSerializer, body, crossSellRouterService_Adapter3);
        }
    }

    /* compiled from: CrossSellRouterService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService_Adapter$Endpoint_pollBottomSheets;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_pollBottomSheets implements ServiceCallable {
        private final Json json;
        private final CrossSellRouterService service;

        public Endpoint_pollBottomSheets(CrossSellRouterService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1<Arguments, Flow<? extends Unit>> function1 = new Function1<Arguments, Flow<? extends Unit>>() { // from class: com.robinhood.microgram.iac.crosssell.contracts.CrossSellRouterService_Adapter$Endpoint_pollBottomSheets$call$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Flow<Unit> invoke(CrossSellRouterService_Adapter.Endpoint_pollBottomSheets.Arguments it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.this$0.service.pollBottomSheets(it.getLocation(), it.getOptionalParams());
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, function1);
        }

        /* compiled from: CrossSellRouterService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B9\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService_Adapter$Endpoint_pollBottomSheets$Arguments;", "", "seen1", "", "location", "", "optionalParams", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/Map;)V", "getLocation", "()Ljava/lang/String;", "getOptionalParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            @JvmField
            private static final KSerializer<Object>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String location;
            private final Map<String, String> optionalParams;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.location;
                }
                if ((i & 2) != 0) {
                    map = arguments.optionalParams;
                }
                return arguments.copy(str, map);
            }

            /* renamed from: component1, reason: from getter */
            public final String getLocation() {
                return this.location;
            }

            public final Map<String, String> component2() {
                return this.optionalParams;
            }

            public final Arguments copy(String location, Map<String, String> optionalParams) {
                Intrinsics.checkNotNullParameter(location, "location");
                Intrinsics.checkNotNullParameter(optionalParams, "optionalParams");
                return new Arguments(location, optionalParams);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.location, arguments.location) && Intrinsics.areEqual(this.optionalParams, arguments.optionalParams);
            }

            public int hashCode() {
                return (this.location.hashCode() * 31) + this.optionalParams.hashCode();
            }

            public String toString() {
                return "Arguments(location=" + this.location + ", optionalParams=" + this.optionalParams + ")";
            }

            /* compiled from: CrossSellRouterService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService_Adapter$Endpoint_pollBottomSheets$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/iac/crosssell/contracts/CrossSellRouterService_Adapter$Endpoint_pollBottomSheets$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return CrossSellRouterService_Adapter2.INSTANCE;
                }
            }

            static {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, Map map, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, CrossSellRouterService_Adapter2.INSTANCE.getDescriptor());
                }
                this.location = str;
                this.optionalParams = map;
            }

            public Arguments(String location, Map<String, String> optionalParams) {
                Intrinsics.checkNotNullParameter(location, "location");
                Intrinsics.checkNotNullParameter(optionalParams, "optionalParams");
                this.location = location;
                this.optionalParams = optionalParams;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.location);
                output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.optionalParams);
            }

            public final String getLocation() {
                return this.location;
            }

            public final Map<String, String> getOptionalParams() {
                return this.optionalParams;
            }
        }
    }
}
