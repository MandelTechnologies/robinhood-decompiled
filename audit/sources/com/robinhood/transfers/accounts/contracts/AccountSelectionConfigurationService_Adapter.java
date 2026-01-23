package com.robinhood.transfers.accounts.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountSelectionLoadConfiguration;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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

/* compiled from: AccountSelectionConfigurationService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0014\u0015B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService_Adapter;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration;", "config", "", "setOnLoadConfiguration", "(Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshAccounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_setOnLoadConfiguration", "Endpoint_refreshAccounts", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class AccountSelectionConfigurationService_Adapter implements AccountSelectionConfigurationService {
    private final ClientBridge __bridge;
    private final Json json;

    public AccountSelectionConfigurationService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionConfigurationService
    public Object setOnLoadConfiguration(TransferAccountSelectionLoadConfiguration transferAccountSelectionLoadConfiguration, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_setOnLoadConfiguration.Arguments arguments = new Endpoint_setOnLoadConfiguration.Arguments(transferAccountSelectionLoadConfiguration);
        json.getSerializersModule();
        KSerializer<Endpoint_setOnLoadConfiguration.Arguments> kSerializerSerializer = Endpoint_setOnLoadConfiguration.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "setOnLoadConfiguration", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionConfigurationService
    public Object refreshAccounts(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Unit unit = Unit.INSTANCE;
        json.getSerializersModule();
        UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, unitSerializer, "refreshAccounts", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    /* compiled from: AccountSelectionConfigurationService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService_Adapter$Endpoint_setOnLoadConfiguration;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_setOnLoadConfiguration implements ServiceCallable {
        private final Json json;
        private final AccountSelectionConfigurationService service;

        public Endpoint_setOnLoadConfiguration(AccountSelectionConfigurationService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AccountSelectionConfigurationService_Adapter4 accountSelectionConfigurationService_Adapter4 = new AccountSelectionConfigurationService_Adapter4(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, accountSelectionConfigurationService_Adapter4);
        }

        /* compiled from: AccountSelectionConfigurationService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService_Adapter$Endpoint_setOnLoadConfiguration$Arguments;", "", "config", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getConfig", "()Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final TransferAccountSelectionLoadConfiguration config;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, TransferAccountSelectionLoadConfiguration transferAccountSelectionLoadConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferAccountSelectionLoadConfiguration = arguments.config;
                }
                return arguments.copy(transferAccountSelectionLoadConfiguration);
            }

            /* renamed from: component1, reason: from getter */
            public final TransferAccountSelectionLoadConfiguration getConfig() {
                return this.config;
            }

            public final Arguments copy(TransferAccountSelectionLoadConfiguration config) {
                Intrinsics.checkNotNullParameter(config, "config");
                return new Arguments(config);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.config, ((Arguments) other).config);
            }

            public int hashCode() {
                return this.config.hashCode();
            }

            public String toString() {
                return "Arguments(config=" + this.config + ")";
            }

            /* compiled from: AccountSelectionConfigurationService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService_Adapter$Endpoint_setOnLoadConfiguration$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService_Adapter$Endpoint_setOnLoadConfiguration$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return AccountSelectionConfigurationService_Adapter2.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, TransferAccountSelectionLoadConfiguration transferAccountSelectionLoadConfiguration, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AccountSelectionConfigurationService_Adapter2.INSTANCE.getDescriptor());
                }
                this.config = transferAccountSelectionLoadConfiguration;
            }

            public Arguments(TransferAccountSelectionLoadConfiguration config) {
                Intrinsics.checkNotNullParameter(config, "config");
                this.config = config;
            }

            public final TransferAccountSelectionLoadConfiguration getConfig() {
                return this.config;
            }
        }
    }

    /* compiled from: AccountSelectionConfigurationService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService_Adapter$Endpoint_refreshAccounts;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_refreshAccounts implements ServiceCallable {
        private final Json json;
        private final AccountSelectionConfigurationService service;

        public Endpoint_refreshAccounts(AccountSelectionConfigurationService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AccountSelectionConfigurationService_Adapter3 accountSelectionConfigurationService_Adapter3 = new AccountSelectionConfigurationService_Adapter3(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, unitSerializer, body, accountSelectionConfigurationService_Adapter3);
        }
    }
}
