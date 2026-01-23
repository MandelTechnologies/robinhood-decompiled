package com.robinhood.transfers.hub.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
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

/* compiled from: TransferHubManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0019\u001a\u001b\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter;", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;", "displayLogicContainer", "", "setDataForDisplayLogic", "(Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataForDisplayLogic", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;", "identifier", "transferHubItemSelected", "(Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appLoaded", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_setDataForDisplayLogic", "Endpoint_getDataForDisplayLogic", "Endpoint_transferHubItemSelected", "Endpoint_appLoaded", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class TransferHubManagedService_Adapter implements TransferHubManagedService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: TransferHubManagedService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.transfers.hub.contracts.TransferHubManagedService_Adapter", m3645f = "TransferHubManagedService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "getDataForDisplayLogic")
    /* renamed from: com.robinhood.transfers.hub.contracts.TransferHubManagedService_Adapter$getDataForDisplayLogic$1 */
    static final class C418001 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C418001(Continuation<? super C418001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferHubManagedService_Adapter.this.getDataForDisplayLogic(this);
        }
    }

    public TransferHubManagedService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // com.robinhood.transfers.hub.contracts.TransferHubManagedService
    public Object setDataForDisplayLogic(TransferHubDisplayLogicContainer transferHubDisplayLogicContainer, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_setDataForDisplayLogic.Arguments arguments = new Endpoint_setDataForDisplayLogic.Arguments(transferHubDisplayLogicContainer);
        json.getSerializersModule();
        KSerializer<Endpoint_setDataForDisplayLogic.Arguments> kSerializerSerializer = Endpoint_setDataForDisplayLogic.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "setDataForDisplayLogic", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.transfers.hub.contracts.TransferHubManagedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDataForDisplayLogic(Continuation<? super TransferHubDisplayLogicContainer> continuation) throws IOException {
        C418001 c418001;
        if (continuation instanceof C418001) {
            c418001 = (C418001) continuation;
            int i = c418001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c418001.label = i - Integer.MIN_VALUE;
            } else {
                c418001 = new C418001(continuation);
            }
        }
        C418001 c4180012 = c418001;
        Object objCallSuspendFunction = c4180012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4180012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Unit unit = Unit.INSTANCE;
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            KSerializer<Endpoint_getDataForDisplayLogic.Emission> kSerializerSerializer = Endpoint_getDataForDisplayLogic.Emission.INSTANCE.serializer();
            c4180012.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, kSerializerSerializer, "getDataForDisplayLogic", unit, c4180012);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getDataForDisplayLogic.Emission) objCallSuspendFunction).m26568unboximpl();
    }

    @Override // com.robinhood.transfers.hub.contracts.TransferHubManagedService
    public Object transferHubItemSelected(TransferHubItemClickIdentifier transferHubItemClickIdentifier, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_transferHubItemSelected.Arguments arguments = new Endpoint_transferHubItemSelected.Arguments(transferHubItemClickIdentifier);
        json.getSerializersModule();
        KSerializer<Endpoint_transferHubItemSelected.Arguments> kSerializerSerializer = Endpoint_transferHubItemSelected.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "transferHubItemSelected", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.hub.contracts.TransferHubManagedService
    public Object appLoaded(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Unit unit = Unit.INSTANCE;
        json.getSerializersModule();
        UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, unitSerializer, "appLoaded", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    /* compiled from: TransferHubManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_setDataForDisplayLogic;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_setDataForDisplayLogic implements ServiceCallable {
        private final Json json;
        private final TransferHubManagedService service;

        public Endpoint_setDataForDisplayLogic(TransferHubManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41798x4cda96a0 c41798x4cda96a0 = new C41798x4cda96a0(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c41798x4cda96a0);
        }

        /* compiled from: TransferHubManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_setDataForDisplayLogic$Arguments;", "", "displayLogicContainer", "Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;", "<init>", "(Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDisplayLogicContainer", "()Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final TransferHubDisplayLogicContainer displayLogicContainer;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, TransferHubDisplayLogicContainer transferHubDisplayLogicContainer, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferHubDisplayLogicContainer = arguments.displayLogicContainer;
                }
                return arguments.copy(transferHubDisplayLogicContainer);
            }

            /* renamed from: component1, reason: from getter */
            public final TransferHubDisplayLogicContainer getDisplayLogicContainer() {
                return this.displayLogicContainer;
            }

            public final Arguments copy(TransferHubDisplayLogicContainer displayLogicContainer) {
                Intrinsics.checkNotNullParameter(displayLogicContainer, "displayLogicContainer");
                return new Arguments(displayLogicContainer);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.displayLogicContainer, ((Arguments) other).displayLogicContainer);
            }

            public int hashCode() {
                return this.displayLogicContainer.hashCode();
            }

            public String toString() {
                return "Arguments(displayLogicContainer=" + this.displayLogicContainer + ")";
            }

            /* compiled from: TransferHubManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_setDataForDisplayLogic$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_setDataForDisplayLogic$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C41795xfe812a73.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, TransferHubDisplayLogicContainer transferHubDisplayLogicContainer, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C41795xfe812a73.INSTANCE.getDescriptor());
                }
                this.displayLogicContainer = transferHubDisplayLogicContainer;
            }

            public Arguments(TransferHubDisplayLogicContainer displayLogicContainer) {
                Intrinsics.checkNotNullParameter(displayLogicContainer, "displayLogicContainer");
                this.displayLogicContainer = displayLogicContainer;
            }

            public final TransferHubDisplayLogicContainer getDisplayLogicContainer() {
                return this.displayLogicContainer;
            }
        }
    }

    /* compiled from: TransferHubManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_getDataForDisplayLogic;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getDataForDisplayLogic implements ServiceCallable {
        private final Json json;
        private final TransferHubManagedService service;

        public Endpoint_getDataForDisplayLogic(TransferHubManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41797x5d1be094 c41797x5d1be094 = new C41797x5d1be094(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, Emission.INSTANCE.serializer(), body, c41797x5d1be094);
        }

        /* compiled from: TransferHubManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_getDataForDisplayLogic$Emission;", "", "value", "Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;", "constructor-impl", "(Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;)Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;", "getValue", "()Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;)I", "toString", "", "toString-impl", "(Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final TransferHubDisplayLogicContainer value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m26562boximpl(TransferHubDisplayLogicContainer transferHubDisplayLogicContainer) {
                return new Emission(transferHubDisplayLogicContainer);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static TransferHubDisplayLogicContainer m26563constructorimpl(TransferHubDisplayLogicContainer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m26564equalsimpl(TransferHubDisplayLogicContainer transferHubDisplayLogicContainer, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(transferHubDisplayLogicContainer, ((Emission) obj).m26568unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m26565equalsimpl0(TransferHubDisplayLogicContainer transferHubDisplayLogicContainer, TransferHubDisplayLogicContainer transferHubDisplayLogicContainer2) {
                return Intrinsics.areEqual(transferHubDisplayLogicContainer, transferHubDisplayLogicContainer2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m26566hashCodeimpl(TransferHubDisplayLogicContainer transferHubDisplayLogicContainer) {
                return transferHubDisplayLogicContainer.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m26567toStringimpl(TransferHubDisplayLogicContainer transferHubDisplayLogicContainer) {
                return "Emission(value=" + transferHubDisplayLogicContainer + ")";
            }

            public boolean equals(Object obj) {
                return m26564equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m26566hashCodeimpl(this.value);
            }

            public String toString() {
                return m26567toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ TransferHubDisplayLogicContainer m26568unboximpl() {
                return this.value;
            }

            /* compiled from: TransferHubManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_getDataForDisplayLogic$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_getDataForDisplayLogic$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C41794xb89bf6a2.INSTANCE;
                }
            }

            private /* synthetic */ Emission(TransferHubDisplayLogicContainer transferHubDisplayLogicContainer) {
                this.value = transferHubDisplayLogicContainer;
            }

            public final TransferHubDisplayLogicContainer getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: TransferHubManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_transferHubItemSelected;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_transferHubItemSelected implements ServiceCallable {
        private final Json json;
        private final TransferHubManagedService service;

        public Endpoint_transferHubItemSelected(TransferHubManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41799xbc7934d c41799xbc7934d = new C41799xbc7934d(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c41799xbc7934d);
        }

        /* compiled from: TransferHubManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_transferHubItemSelected$Arguments;", "", "identifier", "Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;", "<init>", "(Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIdentifier", "()Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final TransferHubItemClickIdentifier identifier;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {TransferHubItemClickIdentifier.INSTANCE.serializer()};

            public static /* synthetic */ Arguments copy$default(Arguments arguments, TransferHubItemClickIdentifier transferHubItemClickIdentifier, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferHubItemClickIdentifier = arguments.identifier;
                }
                return arguments.copy(transferHubItemClickIdentifier);
            }

            /* renamed from: component1, reason: from getter */
            public final TransferHubItemClickIdentifier getIdentifier() {
                return this.identifier;
            }

            public final Arguments copy(TransferHubItemClickIdentifier identifier) {
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                return new Arguments(identifier);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && this.identifier == ((Arguments) other).identifier;
            }

            public int hashCode() {
                return this.identifier.hashCode();
            }

            public String toString() {
                return "Arguments(identifier=" + this.identifier + ")";
            }

            /* compiled from: TransferHubManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_transferHubItemSelected$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_transferHubItemSelected$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C41796x100f9e26.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, TransferHubItemClickIdentifier transferHubItemClickIdentifier, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C41796x100f9e26.INSTANCE.getDescriptor());
                }
                this.identifier = transferHubItemClickIdentifier;
            }

            public Arguments(TransferHubItemClickIdentifier identifier) {
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                this.identifier = identifier;
            }

            public final TransferHubItemClickIdentifier getIdentifier() {
                return this.identifier;
            }
        }
    }

    /* compiled from: TransferHubManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService_Adapter$Endpoint_appLoaded;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_appLoaded implements ServiceCallable {
        private final Json json;
        private final TransferHubManagedService service;

        public Endpoint_appLoaded(TransferHubManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            TransferHubManagedService_Adapter$Endpoint_appLoaded$call$1 transferHubManagedService_Adapter$Endpoint_appLoaded$call$1 = new TransferHubManagedService_Adapter$Endpoint_appLoaded$call$1(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, unitSerializer, body, transferHubManagedService_Adapter$Endpoint_appLoaded$call$1);
        }
    }
}
