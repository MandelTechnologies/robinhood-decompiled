package com.robinhood.transfers.accounts.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import com.robinhood.transfers.accounts.contracts.model.IraTransferType;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: AccountSelectionResolver_Adapter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\b%&'()*+,B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u000bH\u0096@¢\u0006\u0004\b \u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$¨\u0006-"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "direction", "", "onBottomSheetAppear", "(Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "transferAccountId", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;", "transferAccountType", "onAccountRowAppear", "(Ljava/lang/String;Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountSelected", "(Ljava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;", "iraTransferType", "iraId", "selectingAccountId", "launchIraQuestionnaire", "(Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchIraMatchInfo", "sendWireTransfer", "launchDebitCardLinking", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_onBottomSheetAppear", "Endpoint_onAccountRowAppear", "Endpoint_accountSelected", "Endpoint_addNewAccount", "Endpoint_launchIraQuestionnaire", "Endpoint_launchIraMatchInfo", "Endpoint_sendWireTransfer", "Endpoint_launchDebitCardLinking", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class AccountSelectionResolver_Adapter implements AccountSelectionResolver {
    private final ClientBridge __bridge;
    private final Json json;

    public AccountSelectionResolver_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object onBottomSheetAppear(TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_onBottomSheetAppear.Arguments arguments = new Endpoint_onBottomSheetAppear.Arguments(transferAccountDirection);
        json.getSerializersModule();
        KSerializer<Endpoint_onBottomSheetAppear.Arguments> kSerializerSerializer = Endpoint_onBottomSheetAppear.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "onBottomSheetAppear", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object onAccountRowAppear(String str, TransferAccountType transferAccountType, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_onAccountRowAppear.Arguments arguments = new Endpoint_onAccountRowAppear.Arguments(str, transferAccountType, transferAccountDirection);
        json.getSerializersModule();
        KSerializer<Endpoint_onAccountRowAppear.Arguments> kSerializerSerializer = Endpoint_onAccountRowAppear.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "onAccountRowAppear", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object accountSelected(String str, TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_accountSelected.Arguments arguments = new Endpoint_accountSelected.Arguments(str, transferAccountDirection);
        json.getSerializersModule();
        KSerializer<Endpoint_accountSelected.Arguments> kSerializerSerializer = Endpoint_accountSelected.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "accountSelected", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object addNewAccount(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Unit unit = Unit.INSTANCE;
        json.getSerializersModule();
        UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, unitSerializer, "addNewAccount", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchIraQuestionnaire(IraTransferType iraTransferType, String str, String str2, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_launchIraQuestionnaire.Arguments arguments = new Endpoint_launchIraQuestionnaire.Arguments(iraTransferType, str, str2);
        json.getSerializersModule();
        KSerializer<Endpoint_launchIraQuestionnaire.Arguments> kSerializerSerializer = Endpoint_launchIraQuestionnaire.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "launchIraQuestionnaire", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchIraMatchInfo(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Unit unit = Unit.INSTANCE;
        json.getSerializersModule();
        UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, unitSerializer, "launchIraMatchInfo", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object sendWireTransfer(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Unit unit = Unit.INSTANCE;
        json.getSerializersModule();
        UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, unitSerializer, "sendWireTransfer", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchDebitCardLinking(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Unit unit = Unit.INSTANCE;
        json.getSerializersModule();
        UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, unitSerializer, "launchDebitCardLinking", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    /* compiled from: AccountSelectionResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_onBottomSheetAppear;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_onBottomSheetAppear implements ServiceCallable {
        private final Json json;
        private final AccountSelectionResolver service;

        public Endpoint_onBottomSheetAppear(AccountSelectionResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41775x26c25080 c41775x26c25080 = new C41775x26c25080(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c41775x26c25080);
        }

        /* compiled from: AccountSelectionResolver_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_onBottomSheetAppear$Arguments;", "", "direction", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDirection", "()Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final TransferAccountDirection direction;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {TransferAccountDirection.INSTANCE.serializer()};

            public static /* synthetic */ Arguments copy$default(Arguments arguments, TransferAccountDirection transferAccountDirection, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferAccountDirection = arguments.direction;
                }
                return arguments.copy(transferAccountDirection);
            }

            /* renamed from: component1, reason: from getter */
            public final TransferAccountDirection getDirection() {
                return this.direction;
            }

            public final Arguments copy(TransferAccountDirection direction) {
                Intrinsics.checkNotNullParameter(direction, "direction");
                return new Arguments(direction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && this.direction == ((Arguments) other).direction;
            }

            public int hashCode() {
                return this.direction.hashCode();
            }

            public String toString() {
                return "Arguments(direction=" + this.direction + ")";
            }

            /* compiled from: AccountSelectionResolver_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_onBottomSheetAppear$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_onBottomSheetAppear$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C41770x2b27493.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, TransferAccountDirection transferAccountDirection, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C41770x2b27493.INSTANCE.getDescriptor());
                }
                this.direction = transferAccountDirection;
            }

            public Arguments(TransferAccountDirection direction) {
                Intrinsics.checkNotNullParameter(direction, "direction");
                this.direction = direction;
            }

            public final TransferAccountDirection getDirection() {
                return this.direction;
            }
        }
    }

    /* compiled from: AccountSelectionResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_onAccountRowAppear;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_onAccountRowAppear implements ServiceCallable {
        private final Json json;
        private final AccountSelectionResolver service;

        public Endpoint_onAccountRowAppear(AccountSelectionResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41774xbe6b9df3 c41774xbe6b9df3 = new C41774xbe6b9df3(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c41774xbe6b9df3);
        }

        /* compiled from: AccountSelectionResolver_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_onAccountRowAppear$Arguments;", "", "transferAccountId", "", "transferAccountType", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;", "direction", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "<init>", "(Ljava/lang/String;Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTransferAccountId", "()Ljava/lang/String;", "getTransferAccountType", "()Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;", "getDirection", "()Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final TransferAccountDirection direction;
            private final String transferAccountId;
            private final TransferAccountType transferAccountType;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {null, TransferAccountType.INSTANCE.serializer(), TransferAccountDirection.INSTANCE.serializer()};

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, TransferAccountType transferAccountType, TransferAccountDirection transferAccountDirection, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.transferAccountId;
                }
                if ((i & 2) != 0) {
                    transferAccountType = arguments.transferAccountType;
                }
                if ((i & 4) != 0) {
                    transferAccountDirection = arguments.direction;
                }
                return arguments.copy(str, transferAccountType, transferAccountDirection);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTransferAccountId() {
                return this.transferAccountId;
            }

            /* renamed from: component2, reason: from getter */
            public final TransferAccountType getTransferAccountType() {
                return this.transferAccountType;
            }

            /* renamed from: component3, reason: from getter */
            public final TransferAccountDirection getDirection() {
                return this.direction;
            }

            public final Arguments copy(String transferAccountId, TransferAccountType transferAccountType, TransferAccountDirection direction) {
                Intrinsics.checkNotNullParameter(transferAccountId, "transferAccountId");
                Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
                Intrinsics.checkNotNullParameter(direction, "direction");
                return new Arguments(transferAccountId, transferAccountType, direction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.transferAccountId, arguments.transferAccountId) && this.transferAccountType == arguments.transferAccountType && this.direction == arguments.direction;
            }

            public int hashCode() {
                return (((this.transferAccountId.hashCode() * 31) + this.transferAccountType.hashCode()) * 31) + this.direction.hashCode();
            }

            public String toString() {
                return "Arguments(transferAccountId=" + this.transferAccountId + ", transferAccountType=" + this.transferAccountType + ", direction=" + this.direction + ")";
            }

            /* compiled from: AccountSelectionResolver_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_onAccountRowAppear$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_onAccountRowAppear$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C41769x382c32c0.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, TransferAccountType transferAccountType, TransferAccountDirection transferAccountDirection, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptions.throwMissingFieldException(i, 7, C41769x382c32c0.INSTANCE.getDescriptor());
                }
                this.transferAccountId = str;
                this.transferAccountType = transferAccountType;
                this.direction = transferAccountDirection;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.transferAccountId);
                output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.transferAccountType);
                output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.direction);
            }

            public Arguments(String transferAccountId, TransferAccountType transferAccountType, TransferAccountDirection direction) {
                Intrinsics.checkNotNullParameter(transferAccountId, "transferAccountId");
                Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
                Intrinsics.checkNotNullParameter(direction, "direction");
                this.transferAccountId = transferAccountId;
                this.transferAccountType = transferAccountType;
                this.direction = direction;
            }

            public final String getTransferAccountId() {
                return this.transferAccountId;
            }

            public final TransferAccountType getTransferAccountType() {
                return this.transferAccountType;
            }

            public final TransferAccountDirection getDirection() {
                return this.direction;
            }
        }
    }

    /* compiled from: AccountSelectionResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_accountSelected;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_accountSelected implements ServiceCallable {
        private final Json json;
        private final AccountSelectionResolver service;

        public Endpoint_accountSelected(AccountSelectionResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AccountSelectionResolver_Adapter$Endpoint_accountSelected$call$1 accountSelectionResolver_Adapter$Endpoint_accountSelected$call$1 = new AccountSelectionResolver_Adapter$Endpoint_accountSelected$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, accountSelectionResolver_Adapter$Endpoint_accountSelected$call$1);
        }

        /* compiled from: AccountSelectionResolver_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_accountSelected$Arguments;", "", "transferAccountId", "", "direction", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "<init>", "(Ljava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTransferAccountId", "()Ljava/lang/String;", "getDirection", "()Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final TransferAccountDirection direction;
            private final String transferAccountId;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {null, TransferAccountDirection.INSTANCE.serializer()};

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, TransferAccountDirection transferAccountDirection, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.transferAccountId;
                }
                if ((i & 2) != 0) {
                    transferAccountDirection = arguments.direction;
                }
                return arguments.copy(str, transferAccountDirection);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTransferAccountId() {
                return this.transferAccountId;
            }

            /* renamed from: component2, reason: from getter */
            public final TransferAccountDirection getDirection() {
                return this.direction;
            }

            public final Arguments copy(String transferAccountId, TransferAccountDirection direction) {
                Intrinsics.checkNotNullParameter(transferAccountId, "transferAccountId");
                Intrinsics.checkNotNullParameter(direction, "direction");
                return new Arguments(transferAccountId, direction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.transferAccountId, arguments.transferAccountId) && this.direction == arguments.direction;
            }

            public int hashCode() {
                return (this.transferAccountId.hashCode() * 31) + this.direction.hashCode();
            }

            public String toString() {
                return "Arguments(transferAccountId=" + this.transferAccountId + ", direction=" + this.direction + ")";
            }

            /* compiled from: AccountSelectionResolver_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_accountSelected$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_accountSelected$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C41767xb43463f1.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, TransferAccountDirection transferAccountDirection, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C41767xb43463f1.INSTANCE.getDescriptor());
                }
                this.transferAccountId = str;
                this.direction = transferAccountDirection;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.transferAccountId);
                output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.direction);
            }

            public Arguments(String transferAccountId, TransferAccountDirection direction) {
                Intrinsics.checkNotNullParameter(transferAccountId, "transferAccountId");
                Intrinsics.checkNotNullParameter(direction, "direction");
                this.transferAccountId = transferAccountId;
                this.direction = direction;
            }

            public final String getTransferAccountId() {
                return this.transferAccountId;
            }

            public final TransferAccountDirection getDirection() {
                return this.direction;
            }
        }
    }

    /* compiled from: AccountSelectionResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_addNewAccount;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_addNewAccount implements ServiceCallable {
        private final Json json;
        private final AccountSelectionResolver service;

        public Endpoint_addNewAccount(AccountSelectionResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AccountSelectionResolver_Adapter$Endpoint_addNewAccount$call$1 accountSelectionResolver_Adapter$Endpoint_addNewAccount$call$1 = new AccountSelectionResolver_Adapter$Endpoint_addNewAccount$call$1(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, unitSerializer, body, accountSelectionResolver_Adapter$Endpoint_addNewAccount$call$1);
        }
    }

    /* compiled from: AccountSelectionResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_launchIraQuestionnaire;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_launchIraQuestionnaire implements ServiceCallable {
        private final Json json;
        private final AccountSelectionResolver service;

        public Endpoint_launchIraQuestionnaire(AccountSelectionResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41773x496e0736 c41773x496e0736 = new C41773x496e0736(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c41773x496e0736);
        }

        /* compiled from: AccountSelectionResolver_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006&"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_launchIraQuestionnaire$Arguments;", "", "iraTransferType", "Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;", "iraId", "", "selectingAccountId", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/accounts/contracts/model/IraTransferType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIraTransferType", "()Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;", "getIraId", "()Ljava/lang/String;", "getSelectingAccountId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final String iraId;
            private final IraTransferType iraTransferType;
            private final String selectingAccountId;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {IraTransferType.INSTANCE.serializer(), null, null};

            public static /* synthetic */ Arguments copy$default(Arguments arguments, IraTransferType iraTransferType, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    iraTransferType = arguments.iraTransferType;
                }
                if ((i & 2) != 0) {
                    str = arguments.iraId;
                }
                if ((i & 4) != 0) {
                    str2 = arguments.selectingAccountId;
                }
                return arguments.copy(iraTransferType, str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final IraTransferType getIraTransferType() {
                return this.iraTransferType;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIraId() {
                return this.iraId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSelectingAccountId() {
                return this.selectingAccountId;
            }

            public final Arguments copy(IraTransferType iraTransferType, String iraId, String selectingAccountId) {
                Intrinsics.checkNotNullParameter(iraTransferType, "iraTransferType");
                Intrinsics.checkNotNullParameter(iraId, "iraId");
                Intrinsics.checkNotNullParameter(selectingAccountId, "selectingAccountId");
                return new Arguments(iraTransferType, iraId, selectingAccountId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return this.iraTransferType == arguments.iraTransferType && Intrinsics.areEqual(this.iraId, arguments.iraId) && Intrinsics.areEqual(this.selectingAccountId, arguments.selectingAccountId);
            }

            public int hashCode() {
                return (((this.iraTransferType.hashCode() * 31) + this.iraId.hashCode()) * 31) + this.selectingAccountId.hashCode();
            }

            public String toString() {
                return "Arguments(iraTransferType=" + this.iraTransferType + ", iraId=" + this.iraId + ", selectingAccountId=" + this.selectingAccountId + ")";
            }

            /* compiled from: AccountSelectionResolver_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_launchIraQuestionnaire$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_launchIraQuestionnaire$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C41768xe617bb1d.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, IraTransferType iraTransferType, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptions.throwMissingFieldException(i, 7, C41768xe617bb1d.INSTANCE.getDescriptor());
                }
                this.iraTransferType = iraTransferType;
                this.iraId = str;
                this.selectingAccountId = str2;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.iraTransferType);
                output.encodeStringElement(serialDesc, 1, self.iraId);
                output.encodeStringElement(serialDesc, 2, self.selectingAccountId);
            }

            public Arguments(IraTransferType iraTransferType, String iraId, String selectingAccountId) {
                Intrinsics.checkNotNullParameter(iraTransferType, "iraTransferType");
                Intrinsics.checkNotNullParameter(iraId, "iraId");
                Intrinsics.checkNotNullParameter(selectingAccountId, "selectingAccountId");
                this.iraTransferType = iraTransferType;
                this.iraId = iraId;
                this.selectingAccountId = selectingAccountId;
            }

            public final IraTransferType getIraTransferType() {
                return this.iraTransferType;
            }

            public final String getIraId() {
                return this.iraId;
            }

            public final String getSelectingAccountId() {
                return this.selectingAccountId;
            }
        }
    }

    /* compiled from: AccountSelectionResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_launchIraMatchInfo;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_launchIraMatchInfo implements ServiceCallable {
        private final Json json;
        private final AccountSelectionResolver service;

        public Endpoint_launchIraMatchInfo(AccountSelectionResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41772xb46693c6 c41772xb46693c6 = new C41772xb46693c6(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, unitSerializer, body, c41772xb46693c6);
        }
    }

    /* compiled from: AccountSelectionResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_sendWireTransfer;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_sendWireTransfer implements ServiceCallable {
        private final Json json;
        private final AccountSelectionResolver service;

        public Endpoint_sendWireTransfer(AccountSelectionResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41776xac59087c c41776xac59087c = new C41776xac59087c(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, unitSerializer, body, c41776xac59087c);
        }
    }

    /* compiled from: AccountSelectionResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_launchDebitCardLinking;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_launchDebitCardLinking implements ServiceCallable {
        private final Json json;
        private final AccountSelectionResolver service;

        public Endpoint_launchDebitCardLinking(AccountSelectionResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C41771x71c5b055 c41771x71c5b055 = new C41771x71c5b055(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, unitSerializer, body, c41771x71c5b055);
        }
    }
}
