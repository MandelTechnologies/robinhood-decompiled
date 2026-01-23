package com.robinhood.transfers.hub.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: TransferHubConfigurationManagedService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService_Adapter;", "Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "isWithdrawal", "hasRhsAccount", "hasRhyAccount", "Lcom/robinhood/transfers/hub/contracts/TransferConfigResponse;", "getTransferScreenPrefillData", "(ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_getTransferScreenPrefillData", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class TransferHubConfigurationManagedService_Adapter implements TransferHubConfigurationManagedService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: TransferHubConfigurationManagedService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.transfers.hub.contracts.TransferHubConfigurationManagedService_Adapter", m3645f = "TransferHubConfigurationManagedService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "getTransferScreenPrefillData")
    /* renamed from: com.robinhood.transfers.hub.contracts.TransferHubConfigurationManagedService_Adapter$getTransferScreenPrefillData$1 */
    static final class C417921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C417921(Continuation<? super C417921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferHubConfigurationManagedService_Adapter.this.getTransferScreenPrefillData(false, false, false, this);
        }
    }

    public TransferHubConfigurationManagedService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.transfers.hub.contracts.TransferHubConfigurationManagedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getTransferScreenPrefillData(boolean z, boolean z2, boolean z3, Continuation<? super TransferConfigResponse> continuation) throws IOException {
        C417921 c417921;
        if (continuation instanceof C417921) {
            c417921 = (C417921) continuation;
            int i = c417921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c417921.label = i - Integer.MIN_VALUE;
            } else {
                c417921 = new C417921(continuation);
            }
        }
        C417921 c4179212 = c417921;
        Object objCallSuspendFunction = c4179212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4179212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getTransferScreenPrefillData.Arguments arguments = new Endpoint_getTransferScreenPrefillData.Arguments(z, z2, z3);
            json.getSerializersModule();
            KSerializer<Endpoint_getTransferScreenPrefillData.Arguments> kSerializerSerializer = Endpoint_getTransferScreenPrefillData.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getTransferScreenPrefillData.Emission> kSerializerSerializer2 = Endpoint_getTransferScreenPrefillData.Emission.INSTANCE.serializer();
            c4179212.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getTransferScreenPrefillData", arguments, c4179212);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getTransferScreenPrefillData.Emission) objCallSuspendFunction).m26558unboximpl();
    }

    /* compiled from: TransferHubConfigurationManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService_Adapter$Endpoint_getTransferScreenPrefillData;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getTransferScreenPrefillData implements ServiceCallable {
        private final Json json;
        private final TransferHubConfigurationManagedService service;

        public Endpoint_getTransferScreenPrefillData(TransferHubConfigurationManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            TransferHubConfigurationManagedService_Adapter4 transferHubConfigurationManagedService_Adapter4 = new TransferHubConfigurationManagedService_Adapter4(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, transferHubConfigurationManagedService_Adapter4);
        }

        /* compiled from: TransferHubConfigurationManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService_Adapter$Endpoint_getTransferScreenPrefillData$Arguments;", "", "isWithdrawal", "", "hasRhsAccount", "hasRhyAccount", "<init>", "(ZZZ)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()Z", "getHasRhsAccount", "getHasRhyAccount", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean hasRhsAccount;
            private final boolean hasRhyAccount;
            private final boolean isWithdrawal;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = arguments.isWithdrawal;
                }
                if ((i & 2) != 0) {
                    z2 = arguments.hasRhsAccount;
                }
                if ((i & 4) != 0) {
                    z3 = arguments.hasRhyAccount;
                }
                return arguments.copy(z, z2, z3);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsWithdrawal() {
                return this.isWithdrawal;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getHasRhsAccount() {
                return this.hasRhsAccount;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getHasRhyAccount() {
                return this.hasRhyAccount;
            }

            public final Arguments copy(boolean isWithdrawal, boolean hasRhsAccount, boolean hasRhyAccount) {
                return new Arguments(isWithdrawal, hasRhsAccount, hasRhyAccount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return this.isWithdrawal == arguments.isWithdrawal && this.hasRhsAccount == arguments.hasRhsAccount && this.hasRhyAccount == arguments.hasRhyAccount;
            }

            public int hashCode() {
                return (((Boolean.hashCode(this.isWithdrawal) * 31) + Boolean.hashCode(this.hasRhsAccount)) * 31) + Boolean.hashCode(this.hasRhyAccount);
            }

            public String toString() {
                return "Arguments(isWithdrawal=" + this.isWithdrawal + ", hasRhsAccount=" + this.hasRhsAccount + ", hasRhyAccount=" + this.hasRhyAccount + ")";
            }

            /* compiled from: TransferHubConfigurationManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService_Adapter$Endpoint_getTransferScreenPrefillData$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService_Adapter$Endpoint_getTransferScreenPrefillData$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return TransferHubConfigurationManagedService_Adapter2.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptions.throwMissingFieldException(i, 7, TransferHubConfigurationManagedService_Adapter2.INSTANCE.getDescriptor());
                }
                this.isWithdrawal = z;
                this.hasRhsAccount = z2;
                this.hasRhyAccount = z3;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeBooleanElement(serialDesc, 0, self.isWithdrawal);
                output.encodeBooleanElement(serialDesc, 1, self.hasRhsAccount);
                output.encodeBooleanElement(serialDesc, 2, self.hasRhyAccount);
            }

            public Arguments(boolean z, boolean z2, boolean z3) {
                this.isWithdrawal = z;
                this.hasRhsAccount = z2;
                this.hasRhyAccount = z3;
            }

            public final boolean isWithdrawal() {
                return this.isWithdrawal;
            }

            public final boolean getHasRhsAccount() {
                return this.hasRhsAccount;
            }

            public final boolean getHasRhyAccount() {
                return this.hasRhyAccount;
            }
        }

        /* compiled from: TransferHubConfigurationManagedService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService_Adapter$Endpoint_getTransferScreenPrefillData$Emission;", "", "value", "Lcom/robinhood/transfers/hub/contracts/TransferConfigResponse;", "constructor-impl", "(Lcom/robinhood/transfers/hub/contracts/TransferConfigResponse;)Lcom/robinhood/transfers/hub/contracts/TransferConfigResponse;", "getValue", "()Lcom/robinhood/transfers/hub/contracts/TransferConfigResponse;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/transfers/hub/contracts/TransferConfigResponse;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/transfers/hub/contracts/TransferConfigResponse;)I", "toString", "", "toString-impl", "(Lcom/robinhood/transfers/hub/contracts/TransferConfigResponse;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final TransferConfigResponse value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m26552boximpl(TransferConfigResponse transferConfigResponse) {
                return new Emission(transferConfigResponse);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static TransferConfigResponse m26553constructorimpl(TransferConfigResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m26554equalsimpl(TransferConfigResponse transferConfigResponse, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(transferConfigResponse, ((Emission) obj).m26558unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m26555equalsimpl0(TransferConfigResponse transferConfigResponse, TransferConfigResponse transferConfigResponse2) {
                return Intrinsics.areEqual(transferConfigResponse, transferConfigResponse2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m26556hashCodeimpl(TransferConfigResponse transferConfigResponse) {
                return transferConfigResponse.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m26557toStringimpl(TransferConfigResponse transferConfigResponse) {
                return "Emission(value=" + transferConfigResponse + ")";
            }

            public boolean equals(Object obj) {
                return m26554equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m26556hashCodeimpl(this.value);
            }

            public String toString() {
                return m26557toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ TransferConfigResponse m26558unboximpl() {
                return this.value;
            }

            /* compiled from: TransferHubConfigurationManagedService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService_Adapter$Endpoint_getTransferScreenPrefillData$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService_Adapter$Endpoint_getTransferScreenPrefillData$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return TransferHubConfigurationManagedService_Adapter3.INSTANCE;
                }
            }

            private /* synthetic */ Emission(TransferConfigResponse transferConfigResponse) {
                this.value = transferConfigResponse;
            }

            public final TransferConfigResponse getValue() {
                return this.value;
            }
        }
    }
}
