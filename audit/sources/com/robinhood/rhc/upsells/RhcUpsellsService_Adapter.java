package com.robinhood.rhc.upsells;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: RhcUpsellsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsService_Adapter;", "Lcom/robinhood/rhc/upsells/RhcUpsellsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcom/robinhood/rhc/upsells/TouchPointData;", WebsocketGatewayConstants.DATA_KEY, "", "shouldShowUpsell", "(Lcom/robinhood/rhc/upsells/TouchPointData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_shouldShowUpsell", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
final class RhcUpsellsService_Adapter implements RhcUpsellsService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: RhcUpsellsService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsService_Adapter", m3645f = "RhcUpsellsService_Adapter.kt", m3646l = {120}, m3647m = "shouldShowUpsell")
    /* renamed from: com.robinhood.rhc.upsells.RhcUpsellsService_Adapter$shouldShowUpsell$1 */
    static final class C362021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C362021(Continuation<? super C362021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhcUpsellsService_Adapter.this.shouldShowUpsell(null, this);
        }
    }

    public RhcUpsellsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.rhc.upsells.RhcUpsellsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object shouldShowUpsell(TouchPointData touchPointData, Continuation<? super String> continuation) throws IOException {
        C362021 c362021;
        if (continuation instanceof C362021) {
            c362021 = (C362021) continuation;
            int i = c362021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c362021.label = i - Integer.MIN_VALUE;
            } else {
                c362021 = new C362021(continuation);
            }
        }
        C362021 c3620212 = c362021;
        Object objCallSuspendFunction = c3620212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3620212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_shouldShowUpsell.Arguments arguments = new Endpoint_shouldShowUpsell.Arguments(touchPointData);
            json.getSerializersModule();
            KSerializer<Endpoint_shouldShowUpsell.Arguments> kSerializerSerializer = Endpoint_shouldShowUpsell.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_shouldShowUpsell.Emission> kSerializerSerializer2 = Endpoint_shouldShowUpsell.Emission.INSTANCE.serializer();
            c3620212.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "shouldShowUpsell", arguments, c3620212);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_shouldShowUpsell.Emission) objCallSuspendFunction).m23941unboximpl();
    }

    /* compiled from: RhcUpsellsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/rhc/upsells/RhcUpsellsService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/rhc/upsells/RhcUpsellsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_shouldShowUpsell implements ServiceCallable {
        private final Json json;
        private final RhcUpsellsService service;

        public Endpoint_shouldShowUpsell(RhcUpsellsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            RhcUpsellsService_Adapter4 rhcUpsellsService_Adapter4 = new RhcUpsellsService_Adapter4(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, rhcUpsellsService_Adapter4);
        }

        /* compiled from: RhcUpsellsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell$Arguments;", "", "seen1", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/rhc/upsells/TouchPointData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rhc/upsells/TouchPointData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/rhc/upsells/TouchPointData;)V", "getData", "()Lcom/robinhood/rhc/upsells/TouchPointData;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final TouchPointData data;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, TouchPointData touchPointData, int i, Object obj) {
                if ((i & 1) != 0) {
                    touchPointData = arguments.data;
                }
                return arguments.copy(touchPointData);
            }

            /* renamed from: component1, reason: from getter */
            public final TouchPointData getData() {
                return this.data;
            }

            public final Arguments copy(TouchPointData data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new Arguments(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.data, ((Arguments) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Arguments(data=" + this.data + ")";
            }

            /* compiled from: RhcUpsellsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return RhcUpsellsService_Adapter2.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, TouchPointData touchPointData, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, RhcUpsellsService_Adapter2.INSTANCE.getDescriptor());
                }
                this.data = touchPointData;
            }

            public Arguments(TouchPointData data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
            }

            public final TouchPointData getData() {
                return this.data;
            }
        }

        /* compiled from: RhcUpsellsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell$Emission;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23935boximpl(String str) {
                return new Emission(str);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static String m23936constructorimpl(String str) {
                return str;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23937equalsimpl(String str, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(str, ((Emission) obj).m23941unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23938equalsimpl0(String str, String str2) {
                return Intrinsics.areEqual(str, str2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23939hashCodeimpl(String str) {
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23940toStringimpl(String str) {
                return "Emission(value=" + str + ")";
            }

            public boolean equals(Object obj) {
                return m23937equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23939hashCodeimpl(this.value);
            }

            public String toString() {
                return m23940toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m23941unboximpl() {
                return this.value;
            }

            /* compiled from: RhcUpsellsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsService_Adapter$Endpoint_shouldShowUpsell$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return RhcUpsellsService_Adapter3.INSTANCE;
                }
            }

            private /* synthetic */ Emission(String str) {
                this.value = str;
            }

            public final String getValue() {
                return this.value;
            }
        }
    }
}
