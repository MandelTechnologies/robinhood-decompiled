package com.robinhood.transfers.suggestions.pills.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
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

/* compiled from: DynamicPillValueManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001f !B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJF\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u001a\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter;", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "response", "", "accept", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;", "source", "sink", "entryPoint", "amount", "currency", "initialPrefilledAmount", "", "updatePillValues", "(Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/robinhood/transfers/suggestions/pills/contracts/SuggestedAmount;", "resolveAmounts", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_accept", "Endpoint_resolveAmounts", "Endpoint_updatePillValues", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class DynamicPillValueManagedService_Adapter implements DynamicPillValueManagedService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: DynamicPillValueManagedService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService_Adapter", m3645f = "DynamicPillValueManagedService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "accept")
    /* renamed from: com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService_Adapter$accept$1 */
    static final class C418131 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C418131(Continuation<? super C418131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DynamicPillValueManagedService_Adapter.this.accept(null, this);
        }
    }

    /* compiled from: DynamicPillValueManagedService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService_Adapter", m3645f = "DynamicPillValueManagedService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "resolveAmounts")
    /* renamed from: com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService_Adapter$resolveAmounts$1 */
    static final class C418141 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C418141(Continuation<? super C418141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DynamicPillValueManagedService_Adapter.this.resolveAmounts(null, null, null, null, null, null, this);
        }
    }

    public DynamicPillValueManagedService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object accept(String str, Continuation<? super Boolean> continuation) throws IOException {
        C418131 c418131;
        if (continuation instanceof C418131) {
            c418131 = (C418131) continuation;
            int i = c418131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c418131.label = i - Integer.MIN_VALUE;
            } else {
                c418131 = new C418131(continuation);
            }
        }
        C418131 c4181312 = c418131;
        Object objCallSuspendFunction = c4181312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4181312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_accept.Arguments arguments = new Endpoint_accept.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_accept.Arguments> kSerializerSerializer = Endpoint_accept.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_accept.Emission> kSerializerSerializer2 = Endpoint_accept.Emission.INSTANCE.serializer();
            c4181312.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "accept", arguments, c4181312);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return boxing.boxBoolean(((Endpoint_accept.Emission) objCallSuspendFunction).m26579unboximpl());
    }

    @Override // com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService
    public Object updatePillValues(MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String str, String str2, String str3, String str4, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_updatePillValues.Arguments arguments = new Endpoint_updatePillValues.Arguments(microgramTransferAccount, microgramTransferAccount2, str, str2, str3, str4);
        json.getSerializersModule();
        KSerializer<Endpoint_updatePillValues.Arguments> kSerializerSerializer = Endpoint_updatePillValues.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "updatePillValues", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolveAmounts(MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String str, String str2, String str3, String str4, Continuation<? super List<SuggestedAmount>> continuation) throws IOException {
        C418141 c418141;
        if (continuation instanceof C418141) {
            c418141 = (C418141) continuation;
            int i = c418141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c418141.label = i - Integer.MIN_VALUE;
            } else {
                c418141 = new C418141(continuation);
            }
        }
        Object objCallSuspendFunction = c418141.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c418141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_resolveAmounts.Arguments arguments = new Endpoint_resolveAmounts.Arguments(microgramTransferAccount, microgramTransferAccount2, str, str2, str3, str4);
            json.getSerializersModule();
            KSerializer<Endpoint_resolveAmounts.Arguments> kSerializerSerializer = Endpoint_resolveAmounts.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_resolveAmounts.Emission> kSerializerSerializer2 = Endpoint_resolveAmounts.Emission.INSTANCE.serializer();
            c418141.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "resolveAmounts", arguments, c418141);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_resolveAmounts.Emission) objCallSuspendFunction).getValue();
    }

    /* compiled from: DynamicPillValueManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_accept;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_accept implements ServiceCallable {
        private final Json json;
        private final DynamicPillValueManagedService service;

        public Endpoint_accept(DynamicPillValueManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            DynamicPillValueManagedService_Adapter$Endpoint_accept$call$1 dynamicPillValueManagedService_Adapter$Endpoint_accept$call$1 = new DynamicPillValueManagedService_Adapter$Endpoint_accept$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, dynamicPillValueManagedService_Adapter$Endpoint_accept$call$1);
        }

        /* compiled from: DynamicPillValueManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_accept$Arguments;", "", "seen1", "", "response", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getResponse", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String response;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.response;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getResponse() {
                return this.response;
            }

            public final Arguments copy(String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return new Arguments(response);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.response, ((Arguments) other).response);
            }

            public int hashCode() {
                return this.response.hashCode();
            }

            public String toString() {
                return "Arguments(response=" + this.response + ")";
            }

            /* compiled from: DynamicPillValueManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_accept$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_accept$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C41806x7d5ed4d1.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C41806x7d5ed4d1.INSTANCE.getDescriptor());
                }
                this.response = str;
            }

            public Arguments(String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                this.response = response;
            }

            public final String getResponse() {
                return this.response;
            }
        }

        /* compiled from: DynamicPillValueManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_accept$Emission;", "", "value", "", "constructor-impl", "(Z)Z", "getValue", "()Z", "equals", "other", "equals-impl", "(ZLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Z)I", "toString", "", "toString-impl", "(Z)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m26573boximpl(boolean z) {
                return new Emission(z);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static boolean m26574constructorimpl(boolean z) {
                return z;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m26575equalsimpl(boolean z, Object obj) {
                return (obj instanceof Emission) && z == ((Emission) obj).m26579unboximpl();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m26576equalsimpl0(boolean z, boolean z2) {
                return z == z2;
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m26577hashCodeimpl(boolean z) {
                return Boolean.hashCode(z);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m26578toStringimpl(boolean z) {
                return "Emission(value=" + z + ")";
            }

            public boolean equals(Object obj) {
                return m26575equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m26577hashCodeimpl(this.value);
            }

            public String toString() {
                return m26578toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ boolean m26579unboximpl() {
                return this.value;
            }

            /* compiled from: DynamicPillValueManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_accept$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_accept$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C41807xef61b990.INSTANCE;
                }
            }

            private /* synthetic */ Emission(boolean z) {
                this.value = z;
            }

            public final boolean getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: DynamicPillValueManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_updatePillValues;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_updatePillValues implements ServiceCallable {
        private final Json json;
        private final DynamicPillValueManagedService service;

        public Endpoint_updatePillValues(DynamicPillValueManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41812x26404a66 c41812x26404a66 = new C41812x26404a66(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c41812x26404a66);
        }

        /* compiled from: DynamicPillValueManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BU\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB;\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006."}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_updatePillValues$Arguments;", "", "seen1", "", "source", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;", "sink", "entryPoint", "", "amount", "currency", "initialPrefilledAmount", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getEntryPoint", "getInitialPrefilledAmount", "getSink", "()Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String amount;
            private final String currency;
            private final String entryPoint;
            private final String initialPrefilledAmount;
            private final MicrogramTransferAccount sink;
            private final MicrogramTransferAccount source;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    microgramTransferAccount = arguments.source;
                }
                if ((i & 2) != 0) {
                    microgramTransferAccount2 = arguments.sink;
                }
                if ((i & 4) != 0) {
                    str = arguments.entryPoint;
                }
                if ((i & 8) != 0) {
                    str2 = arguments.amount;
                }
                if ((i & 16) != 0) {
                    str3 = arguments.currency;
                }
                if ((i & 32) != 0) {
                    str4 = arguments.initialPrefilledAmount;
                }
                String str5 = str3;
                String str6 = str4;
                return arguments.copy(microgramTransferAccount, microgramTransferAccount2, str, str2, str5, str6);
            }

            /* renamed from: component1, reason: from getter */
            public final MicrogramTransferAccount getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final MicrogramTransferAccount getSink() {
                return this.sink;
            }

            /* renamed from: component3, reason: from getter */
            public final String getEntryPoint() {
                return this.entryPoint;
            }

            /* renamed from: component4, reason: from getter */
            public final String getAmount() {
                return this.amount;
            }

            /* renamed from: component5, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            /* renamed from: component6, reason: from getter */
            public final String getInitialPrefilledAmount() {
                return this.initialPrefilledAmount;
            }

            public final Arguments copy(MicrogramTransferAccount source, MicrogramTransferAccount sink, String entryPoint, String amount, String currency, String initialPrefilledAmount) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new Arguments(source, sink, entryPoint, amount, currency, initialPrefilledAmount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.source, arguments.source) && Intrinsics.areEqual(this.sink, arguments.sink) && Intrinsics.areEqual(this.entryPoint, arguments.entryPoint) && Intrinsics.areEqual(this.amount, arguments.amount) && Intrinsics.areEqual(this.currency, arguments.currency) && Intrinsics.areEqual(this.initialPrefilledAmount, arguments.initialPrefilledAmount);
            }

            public int hashCode() {
                MicrogramTransferAccount microgramTransferAccount = this.source;
                int iHashCode = (microgramTransferAccount == null ? 0 : microgramTransferAccount.hashCode()) * 31;
                MicrogramTransferAccount microgramTransferAccount2 = this.sink;
                int iHashCode2 = (((((((iHashCode + (microgramTransferAccount2 == null ? 0 : microgramTransferAccount2.hashCode())) * 31) + this.entryPoint.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.currency.hashCode()) * 31;
                String str = this.initialPrefilledAmount;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "Arguments(source=" + this.source + ", sink=" + this.sink + ", entryPoint=" + this.entryPoint + ", amount=" + this.amount + ", currency=" + this.currency + ", initialPrefilledAmount=" + this.initialPrefilledAmount + ")";
            }

            /* compiled from: DynamicPillValueManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_updatePillValues$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_updatePillValues$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C41810x370b1ed.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
                if (63 != (i & 63)) {
                    PluginExceptions.throwMissingFieldException(i, 63, C41810x370b1ed.INSTANCE.getDescriptor());
                }
                this.source = microgramTransferAccount;
                this.sink = microgramTransferAccount2;
                this.entryPoint = str;
                this.amount = str2;
                this.currency = str3;
                this.initialPrefilledAmount = str4;
            }

            public Arguments(MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String entryPoint, String amount, String currency, String str) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.source = microgramTransferAccount;
                this.sink = microgramTransferAccount2;
                this.entryPoint = entryPoint;
                this.amount = amount;
                this.currency = currency;
                this.initialPrefilledAmount = str;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                MicrogramTransferAccount2 microgramTransferAccount2 = MicrogramTransferAccount2.INSTANCE;
                output.encodeNullableSerializableElement(serialDesc, 0, microgramTransferAccount2, self.source);
                output.encodeNullableSerializableElement(serialDesc, 1, microgramTransferAccount2, self.sink);
                output.encodeStringElement(serialDesc, 2, self.entryPoint);
                output.encodeStringElement(serialDesc, 3, self.amount);
                output.encodeStringElement(serialDesc, 4, self.currency);
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.initialPrefilledAmount);
            }

            public final MicrogramTransferAccount getSource() {
                return this.source;
            }

            public final MicrogramTransferAccount getSink() {
                return this.sink;
            }

            public final String getEntryPoint() {
                return this.entryPoint;
            }

            public final String getAmount() {
                return this.amount;
            }

            public final String getCurrency() {
                return this.currency;
            }

            public final String getInitialPrefilledAmount() {
                return this.initialPrefilledAmount;
            }
        }
    }

    /* compiled from: DynamicPillValueManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_resolveAmounts implements ServiceCallable {
        private final Json json;
        private final DynamicPillValueManagedService service;

        public Endpoint_resolveAmounts(DynamicPillValueManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41811x30ca09b c41811x30ca09b = new C41811x30ca09b(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c41811x30ca09b);
        }

        /* compiled from: DynamicPillValueManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BU\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB;\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001J&\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÁ\u0001¢\u0006\u0002\b+R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006."}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts$Arguments;", "", "seen1", "", "source", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;", "sink", "entryPoint", "", "amount", "currency", "initialPrefilledAmount", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getEntryPoint", "getInitialPrefilledAmount", "getSink", "()Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String amount;
            private final String currency;
            private final String entryPoint;
            private final String initialPrefilledAmount;
            private final MicrogramTransferAccount sink;
            private final MicrogramTransferAccount source;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    microgramTransferAccount = arguments.source;
                }
                if ((i & 2) != 0) {
                    microgramTransferAccount2 = arguments.sink;
                }
                if ((i & 4) != 0) {
                    str = arguments.entryPoint;
                }
                if ((i & 8) != 0) {
                    str2 = arguments.amount;
                }
                if ((i & 16) != 0) {
                    str3 = arguments.currency;
                }
                if ((i & 32) != 0) {
                    str4 = arguments.initialPrefilledAmount;
                }
                String str5 = str3;
                String str6 = str4;
                return arguments.copy(microgramTransferAccount, microgramTransferAccount2, str, str2, str5, str6);
            }

            /* renamed from: component1, reason: from getter */
            public final MicrogramTransferAccount getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final MicrogramTransferAccount getSink() {
                return this.sink;
            }

            /* renamed from: component3, reason: from getter */
            public final String getEntryPoint() {
                return this.entryPoint;
            }

            /* renamed from: component4, reason: from getter */
            public final String getAmount() {
                return this.amount;
            }

            /* renamed from: component5, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            /* renamed from: component6, reason: from getter */
            public final String getInitialPrefilledAmount() {
                return this.initialPrefilledAmount;
            }

            public final Arguments copy(MicrogramTransferAccount source, MicrogramTransferAccount sink, String entryPoint, String amount, String currency, String initialPrefilledAmount) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new Arguments(source, sink, entryPoint, amount, currency, initialPrefilledAmount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.source, arguments.source) && Intrinsics.areEqual(this.sink, arguments.sink) && Intrinsics.areEqual(this.entryPoint, arguments.entryPoint) && Intrinsics.areEqual(this.amount, arguments.amount) && Intrinsics.areEqual(this.currency, arguments.currency) && Intrinsics.areEqual(this.initialPrefilledAmount, arguments.initialPrefilledAmount);
            }

            public int hashCode() {
                MicrogramTransferAccount microgramTransferAccount = this.source;
                int iHashCode = (microgramTransferAccount == null ? 0 : microgramTransferAccount.hashCode()) * 31;
                MicrogramTransferAccount microgramTransferAccount2 = this.sink;
                int iHashCode2 = (((((((iHashCode + (microgramTransferAccount2 == null ? 0 : microgramTransferAccount2.hashCode())) * 31) + this.entryPoint.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.currency.hashCode()) * 31;
                String str = this.initialPrefilledAmount;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "Arguments(source=" + this.source + ", sink=" + this.sink + ", entryPoint=" + this.entryPoint + ", amount=" + this.amount + ", currency=" + this.currency + ", initialPrefilledAmount=" + this.initialPrefilledAmount + ")";
            }

            /* compiled from: DynamicPillValueManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C41808x28e08b18.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
                if (63 != (i & 63)) {
                    PluginExceptions.throwMissingFieldException(i, 63, C41808x28e08b18.INSTANCE.getDescriptor());
                }
                this.source = microgramTransferAccount;
                this.sink = microgramTransferAccount2;
                this.entryPoint = str;
                this.amount = str2;
                this.currency = str3;
                this.initialPrefilledAmount = str4;
            }

            public Arguments(MicrogramTransferAccount microgramTransferAccount, MicrogramTransferAccount microgramTransferAccount2, String entryPoint, String amount, String currency, String str) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.source = microgramTransferAccount;
                this.sink = microgramTransferAccount2;
                this.entryPoint = entryPoint;
                this.amount = amount;
                this.currency = currency;
                this.initialPrefilledAmount = str;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                MicrogramTransferAccount2 microgramTransferAccount2 = MicrogramTransferAccount2.INSTANCE;
                output.encodeNullableSerializableElement(serialDesc, 0, microgramTransferAccount2, self.source);
                output.encodeNullableSerializableElement(serialDesc, 1, microgramTransferAccount2, self.sink);
                output.encodeStringElement(serialDesc, 2, self.entryPoint);
                output.encodeStringElement(serialDesc, 3, self.amount);
                output.encodeStringElement(serialDesc, 4, self.currency);
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.initialPrefilledAmount);
            }

            public final MicrogramTransferAccount getSource() {
                return this.source;
            }

            public final MicrogramTransferAccount getSink() {
                return this.sink;
            }

            public final String getEntryPoint() {
                return this.entryPoint;
            }

            public final String getAmount() {
                return this.amount;
            }

            public final String getCurrency() {
                return this.currency;
            }

            public final String getInitialPrefilledAmount() {
                return this.initialPrefilledAmount;
            }
        }

        /* compiled from: DynamicPillValueManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts$Emission;", "", "value", "", "Lcom/robinhood/transfers/suggestions/pills/contracts/SuggestedAmount;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getValue", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {
            private final List<SuggestedAmount> value;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SuggestedAmount3.INSTANCE)};

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m26580boximpl(List list) {
                return new Emission(list);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends SuggestedAmount> m26581constructorimpl(List<SuggestedAmount> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m26582equalsimpl(List<? extends SuggestedAmount> list, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(list, ((Emission) obj).getValue());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m26583equalsimpl0(List<? extends SuggestedAmount> list, List<? extends SuggestedAmount> list2) {
                return Intrinsics.areEqual(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m26584hashCodeimpl(List<? extends SuggestedAmount> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m26585toStringimpl(List<? extends SuggestedAmount> list) {
                return "Emission(value=" + list + ")";
            }

            public boolean equals(Object obj) {
                return m26582equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m26584hashCodeimpl(this.value);
            }

            public String toString() {
                return m26585toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getValue() {
                return this.value;
            }

            /* compiled from: DynamicPillValueManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService_Adapter$Endpoint_resolveAmounts$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C41809x3f3c9e69.INSTANCE;
                }
            }

            private /* synthetic */ Emission(List list) {
                this.value = list;
            }

            public final List<SuggestedAmount> getValue() {
                return this.value;
            }
        }
    }
}
