package com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: ResurrectionUpsellLoggingService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0019\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "upsellIdentifier", "", "shownCount", "", "lastShownTimeMs", "", "wasShown", "", "logTakeoverUpsellAction", "(Ljava/lang/String;ILjava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logPostDepositUpsellAction", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_logTakeoverUpsellAction", "Endpoint_logPostDepositUpsellAction", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
final class ResurrectionUpsellLoggingService_Adapter implements ResurrectionUpsellLoggingService {
    private final ClientBridge __bridge;
    private final Json json;

    public ResurrectionUpsellLoggingService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellLoggingService
    public Object logTakeoverUpsellAction(String str, int i, Long l, boolean z, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_logTakeoverUpsellAction.Arguments arguments = new Endpoint_logTakeoverUpsellAction.Arguments(str, i, l, z);
        json.getSerializersModule();
        KSerializer<Endpoint_logTakeoverUpsellAction.Arguments> kSerializerSerializer = Endpoint_logTakeoverUpsellAction.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "logTakeoverUpsellAction", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellLoggingService
    public Object logPostDepositUpsellAction(String str, int i, Long l, boolean z, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_logPostDepositUpsellAction.Arguments arguments = new Endpoint_logPostDepositUpsellAction.Arguments(str, i, l, z);
        json.getSerializersModule();
        KSerializer<Endpoint_logPostDepositUpsellAction.Arguments> kSerializerSerializer = Endpoint_logPostDepositUpsellAction.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "logPostDepositUpsellAction", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* compiled from: ResurrectionUpsellLoggingService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logTakeoverUpsellAction;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_logTakeoverUpsellAction implements ServiceCallable {
        private final Json json;
        private final ResurrectionUpsellLoggingService service;

        public Endpoint_logTakeoverUpsellAction(ResurrectionUpsellLoggingService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            ResurrectionUpsellLoggingService_Adapter5 resurrectionUpsellLoggingService_Adapter5 = new ResurrectionUpsellLoggingService_Adapter5(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, resurrectionUpsellLoggingService_Adapter5);
        }

        /* compiled from: ResurrectionUpsellLoggingService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logTakeoverUpsellAction$Arguments;", "", "upsellIdentifier", "", "shownCount", "", "lastShownTimeMs", "", "wasShown", "", "<init>", "(Ljava/lang/String;ILjava/lang/Long;Z)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/Long;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUpsellIdentifier", "()Ljava/lang/String;", "getShownCount", "()I", "getLastShownTimeMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWasShown", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/Long;Z)Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logTakeoverUpsellAction$Arguments;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Long lastShownTimeMs;
            private final int shownCount;
            private final String upsellIdentifier;
            private final boolean wasShown;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Long l, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = arguments.upsellIdentifier;
                }
                if ((i2 & 2) != 0) {
                    i = arguments.shownCount;
                }
                if ((i2 & 4) != 0) {
                    l = arguments.lastShownTimeMs;
                }
                if ((i2 & 8) != 0) {
                    z = arguments.wasShown;
                }
                return arguments.copy(str, i, l, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUpsellIdentifier() {
                return this.upsellIdentifier;
            }

            /* renamed from: component2, reason: from getter */
            public final int getShownCount() {
                return this.shownCount;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getLastShownTimeMs() {
                return this.lastShownTimeMs;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getWasShown() {
                return this.wasShown;
            }

            public final Arguments copy(String upsellIdentifier, int shownCount, Long lastShownTimeMs, boolean wasShown) {
                Intrinsics.checkNotNullParameter(upsellIdentifier, "upsellIdentifier");
                return new Arguments(upsellIdentifier, shownCount, lastShownTimeMs, wasShown);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.upsellIdentifier, arguments.upsellIdentifier) && this.shownCount == arguments.shownCount && Intrinsics.areEqual(this.lastShownTimeMs, arguments.lastShownTimeMs) && this.wasShown == arguments.wasShown;
            }

            public int hashCode() {
                int iHashCode = ((this.upsellIdentifier.hashCode() * 31) + Integer.hashCode(this.shownCount)) * 31;
                Long l = this.lastShownTimeMs;
                return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Boolean.hashCode(this.wasShown);
            }

            public String toString() {
                return "Arguments(upsellIdentifier=" + this.upsellIdentifier + ", shownCount=" + this.shownCount + ", lastShownTimeMs=" + this.lastShownTimeMs + ", wasShown=" + this.wasShown + ")";
            }

            /* compiled from: ResurrectionUpsellLoggingService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logTakeoverUpsellAction$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logTakeoverUpsellAction$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return ResurrectionUpsellLoggingService_Adapter3.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, int i2, Long l, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if (15 != (i & 15)) {
                    PluginExceptions.throwMissingFieldException(i, 15, ResurrectionUpsellLoggingService_Adapter3.INSTANCE.getDescriptor());
                }
                this.upsellIdentifier = str;
                this.shownCount = i2;
                this.lastShownTimeMs = l;
                this.wasShown = z;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.upsellIdentifier);
                output.encodeIntElement(serialDesc, 1, self.shownCount);
                output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.lastShownTimeMs);
                output.encodeBooleanElement(serialDesc, 3, self.wasShown);
            }

            public Arguments(String upsellIdentifier, int i, Long l, boolean z) {
                Intrinsics.checkNotNullParameter(upsellIdentifier, "upsellIdentifier");
                this.upsellIdentifier = upsellIdentifier;
                this.shownCount = i;
                this.lastShownTimeMs = l;
                this.wasShown = z;
            }

            public final String getUpsellIdentifier() {
                return this.upsellIdentifier;
            }

            public final int getShownCount() {
                return this.shownCount;
            }

            public final Long getLastShownTimeMs() {
                return this.lastShownTimeMs;
            }

            public final boolean getWasShown() {
                return this.wasShown;
            }
        }
    }

    /* compiled from: ResurrectionUpsellLoggingService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logPostDepositUpsellAction;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_logPostDepositUpsellAction implements ServiceCallable {
        private final Json json;
        private final ResurrectionUpsellLoggingService service;

        public Endpoint_logPostDepositUpsellAction(ResurrectionUpsellLoggingService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            ResurrectionUpsellLoggingService_Adapter4 resurrectionUpsellLoggingService_Adapter4 = new ResurrectionUpsellLoggingService_Adapter4(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, resurrectionUpsellLoggingService_Adapter4);
        }

        /* compiled from: ResurrectionUpsellLoggingService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logPostDepositUpsellAction$Arguments;", "", "upsellIdentifier", "", "shownCount", "", "lastShownTimeMs", "", "wasShown", "", "<init>", "(Ljava/lang/String;ILjava/lang/Long;Z)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/Long;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUpsellIdentifier", "()Ljava/lang/String;", "getShownCount", "()I", "getLastShownTimeMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWasShown", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/Long;Z)Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logPostDepositUpsellAction$Arguments;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Long lastShownTimeMs;
            private final int shownCount;
            private final String upsellIdentifier;
            private final boolean wasShown;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Long l, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = arguments.upsellIdentifier;
                }
                if ((i2 & 2) != 0) {
                    i = arguments.shownCount;
                }
                if ((i2 & 4) != 0) {
                    l = arguments.lastShownTimeMs;
                }
                if ((i2 & 8) != 0) {
                    z = arguments.wasShown;
                }
                return arguments.copy(str, i, l, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUpsellIdentifier() {
                return this.upsellIdentifier;
            }

            /* renamed from: component2, reason: from getter */
            public final int getShownCount() {
                return this.shownCount;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getLastShownTimeMs() {
                return this.lastShownTimeMs;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getWasShown() {
                return this.wasShown;
            }

            public final Arguments copy(String upsellIdentifier, int shownCount, Long lastShownTimeMs, boolean wasShown) {
                Intrinsics.checkNotNullParameter(upsellIdentifier, "upsellIdentifier");
                return new Arguments(upsellIdentifier, shownCount, lastShownTimeMs, wasShown);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.upsellIdentifier, arguments.upsellIdentifier) && this.shownCount == arguments.shownCount && Intrinsics.areEqual(this.lastShownTimeMs, arguments.lastShownTimeMs) && this.wasShown == arguments.wasShown;
            }

            public int hashCode() {
                int iHashCode = ((this.upsellIdentifier.hashCode() * 31) + Integer.hashCode(this.shownCount)) * 31;
                Long l = this.lastShownTimeMs;
                return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Boolean.hashCode(this.wasShown);
            }

            public String toString() {
                return "Arguments(upsellIdentifier=" + this.upsellIdentifier + ", shownCount=" + this.shownCount + ", lastShownTimeMs=" + this.lastShownTimeMs + ", wasShown=" + this.wasShown + ")";
            }

            /* compiled from: ResurrectionUpsellLoggingService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logPostDepositUpsellAction$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService_Adapter$Endpoint_logPostDepositUpsellAction$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return ResurrectionUpsellLoggingService_Adapter2.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, int i2, Long l, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if (15 != (i & 15)) {
                    PluginExceptions.throwMissingFieldException(i, 15, ResurrectionUpsellLoggingService_Adapter2.INSTANCE.getDescriptor());
                }
                this.upsellIdentifier = str;
                this.shownCount = i2;
                this.lastShownTimeMs = l;
                this.wasShown = z;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.upsellIdentifier);
                output.encodeIntElement(serialDesc, 1, self.shownCount);
                output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.lastShownTimeMs);
                output.encodeBooleanElement(serialDesc, 3, self.wasShown);
            }

            public Arguments(String upsellIdentifier, int i, Long l, boolean z) {
                Intrinsics.checkNotNullParameter(upsellIdentifier, "upsellIdentifier");
                this.upsellIdentifier = upsellIdentifier;
                this.shownCount = i;
                this.lastShownTimeMs = l;
                this.wasShown = z;
            }

            public final String getUpsellIdentifier() {
                return this.upsellIdentifier;
            }

            public final int getShownCount() {
                return this.shownCount;
            }

            public final Long getLastShownTimeMs() {
                return this.lastShownTimeMs;
            }

            public final boolean getWasShown() {
                return this.wasShown;
            }
        }
    }
}
