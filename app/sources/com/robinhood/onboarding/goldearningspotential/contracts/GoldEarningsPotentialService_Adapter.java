package com.robinhood.onboarding.goldearningspotential.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
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

/* compiled from: GoldEarningsPotentialService_Adapter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0015\u0016B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "balance", "Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;", "initPotentialGoldEarningsCalculator", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;", "getPotentialGoldEarningsCalculator", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_getPotentialGoldEarningsCalculator", "Endpoint_initPotentialGoldEarningsCalculator", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
final class GoldEarningsPotentialService_Adapter implements GoldEarningsPotentialService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: GoldEarningsPotentialService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService_Adapter", m3645f = "GoldEarningsPotentialService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "getPotentialGoldEarningsCalculator")
    /* renamed from: com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService_Adapter$getPotentialGoldEarningsCalculator$1 */
    static final class C359191 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359191(Continuation<? super C359191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoldEarningsPotentialService_Adapter.this.getPotentialGoldEarningsCalculator(0.0d, this);
        }
    }

    /* compiled from: GoldEarningsPotentialService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService_Adapter", m3645f = "GoldEarningsPotentialService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "initPotentialGoldEarningsCalculator")
    /* renamed from: com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService_Adapter$initPotentialGoldEarningsCalculator$1 */
    static final class C359201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359201(Continuation<? super C359201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoldEarningsPotentialService_Adapter.this.initPotentialGoldEarningsCalculator(0.0d, this);
        }
    }

    public GoldEarningsPotentialService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object initPotentialGoldEarningsCalculator(double d, Continuation<? super InitializeGoldEarningsCalculatorResponse> continuation) throws IOException {
        C359201 c359201;
        if (continuation instanceof C359201) {
            c359201 = (C359201) continuation;
            int i = c359201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359201.label = i - Integer.MIN_VALUE;
            } else {
                c359201 = new C359201(continuation);
            }
        }
        C359201 c3592012 = c359201;
        Object objCallSuspendFunction = c3592012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3592012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_initPotentialGoldEarningsCalculator.Arguments arguments = new Endpoint_initPotentialGoldEarningsCalculator.Arguments(d);
            json.getSerializersModule();
            KSerializer<Endpoint_initPotentialGoldEarningsCalculator.Arguments> kSerializerSerializer = Endpoint_initPotentialGoldEarningsCalculator.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_initPotentialGoldEarningsCalculator.Emission> kSerializerSerializer2 = Endpoint_initPotentialGoldEarningsCalculator.Emission.INSTANCE.serializer();
            c3592012.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "initPotentialGoldEarningsCalculator", arguments, c3592012);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_initPotentialGoldEarningsCalculator.Emission) objCallSuspendFunction).m23708unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPotentialGoldEarningsCalculator(double d, Continuation<? super GoldEarningsCalculatorModel> continuation) throws IOException {
        C359191 c359191;
        if (continuation instanceof C359191) {
            c359191 = (C359191) continuation;
            int i = c359191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359191.label = i - Integer.MIN_VALUE;
            } else {
                c359191 = new C359191(continuation);
            }
        }
        C359191 c3591912 = c359191;
        Object objCallSuspendFunction = c3591912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3591912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getPotentialGoldEarningsCalculator.Arguments arguments = new Endpoint_getPotentialGoldEarningsCalculator.Arguments(d);
            json.getSerializersModule();
            KSerializer<Endpoint_getPotentialGoldEarningsCalculator.Arguments> kSerializerSerializer = Endpoint_getPotentialGoldEarningsCalculator.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getPotentialGoldEarningsCalculator.Emission> kSerializerSerializer2 = Endpoint_getPotentialGoldEarningsCalculator.Emission.INSTANCE.serializer();
            c3591912.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getPotentialGoldEarningsCalculator", arguments, c3591912);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getPotentialGoldEarningsCalculator.Emission) objCallSuspendFunction).m23701unboximpl();
    }

    /* compiled from: GoldEarningsPotentialService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_initPotentialGoldEarningsCalculator;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_initPotentialGoldEarningsCalculator implements ServiceCallable {
        private final Json json;
        private final GoldEarningsPotentialService service;

        public Endpoint_initPotentialGoldEarningsCalculator(GoldEarningsPotentialService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            GoldEarningsPotentialService_Adapter7 goldEarningsPotentialService_Adapter7 = new GoldEarningsPotentialService_Adapter7(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, goldEarningsPotentialService_Adapter7);
        }

        /* compiled from: GoldEarningsPotentialService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB!\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_initPotentialGoldEarningsCalculator$Arguments;", "", "seen1", "", "balance", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(D)V", "getBalance", "()D", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final double balance;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = arguments.balance;
                }
                return arguments.copy(d);
            }

            /* renamed from: component1, reason: from getter */
            public final double getBalance() {
                return this.balance;
            }

            public final Arguments copy(double balance) {
                return new Arguments(balance);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Double.compare(this.balance, ((Arguments) other).balance) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.balance);
            }

            public String toString() {
                return "Arguments(balance=" + this.balance + ")";
            }

            /* compiled from: GoldEarningsPotentialService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_initPotentialGoldEarningsCalculator$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_initPotentialGoldEarningsCalculator$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return GoldEarningsPotentialService_Adapter4.INSTANCE;
                }
            }

            public Arguments(double d) {
                this.balance = d;
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, double d, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, GoldEarningsPotentialService_Adapter4.INSTANCE.getDescriptor());
                }
                this.balance = d;
            }

            public final double getBalance() {
                return this.balance;
            }
        }

        /* compiled from: GoldEarningsPotentialService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_initPotentialGoldEarningsCalculator$Emission;", "", "value", "Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;", "constructor-impl", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;)Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;", "getValue", "()Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;)I", "toString", "", "toString-impl", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/InitializeGoldEarningsCalculatorResponse;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final InitializeGoldEarningsCalculatorResponse value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23702boximpl(InitializeGoldEarningsCalculatorResponse initializeGoldEarningsCalculatorResponse) {
                return new Emission(initializeGoldEarningsCalculatorResponse);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static InitializeGoldEarningsCalculatorResponse m23703constructorimpl(InitializeGoldEarningsCalculatorResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23704equalsimpl(InitializeGoldEarningsCalculatorResponse initializeGoldEarningsCalculatorResponse, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(initializeGoldEarningsCalculatorResponse, ((Emission) obj).m23708unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23705equalsimpl0(InitializeGoldEarningsCalculatorResponse initializeGoldEarningsCalculatorResponse, InitializeGoldEarningsCalculatorResponse initializeGoldEarningsCalculatorResponse2) {
                return Intrinsics.areEqual(initializeGoldEarningsCalculatorResponse, initializeGoldEarningsCalculatorResponse2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23706hashCodeimpl(InitializeGoldEarningsCalculatorResponse initializeGoldEarningsCalculatorResponse) {
                return initializeGoldEarningsCalculatorResponse.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23707toStringimpl(InitializeGoldEarningsCalculatorResponse initializeGoldEarningsCalculatorResponse) {
                return "Emission(value=" + initializeGoldEarningsCalculatorResponse + ")";
            }

            public boolean equals(Object obj) {
                return m23704equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23706hashCodeimpl(this.value);
            }

            public String toString() {
                return m23707toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ InitializeGoldEarningsCalculatorResponse m23708unboximpl() {
                return this.value;
            }

            /* compiled from: GoldEarningsPotentialService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_initPotentialGoldEarningsCalculator$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_initPotentialGoldEarningsCalculator$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return GoldEarningsPotentialService_Adapter5.INSTANCE;
                }
            }

            private /* synthetic */ Emission(InitializeGoldEarningsCalculatorResponse initializeGoldEarningsCalculatorResponse) {
                this.value = initializeGoldEarningsCalculatorResponse;
            }

            public final InitializeGoldEarningsCalculatorResponse getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: GoldEarningsPotentialService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getPotentialGoldEarningsCalculator implements ServiceCallable {
        private final Json json;
        private final GoldEarningsPotentialService service;

        public Endpoint_getPotentialGoldEarningsCalculator(GoldEarningsPotentialService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            GoldEarningsPotentialService_Adapter6 goldEarningsPotentialService_Adapter6 = new GoldEarningsPotentialService_Adapter6(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, goldEarningsPotentialService_Adapter6);
        }

        /* compiled from: GoldEarningsPotentialService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB!\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator$Arguments;", "", "seen1", "", CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(D)V", "getDeposit", "()D", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final double deposit;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = arguments.deposit;
                }
                return arguments.copy(d);
            }

            /* renamed from: component1, reason: from getter */
            public final double getDeposit() {
                return this.deposit;
            }

            public final Arguments copy(double deposit) {
                return new Arguments(deposit);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Double.compare(this.deposit, ((Arguments) other).deposit) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.deposit);
            }

            public String toString() {
                return "Arguments(deposit=" + this.deposit + ")";
            }

            /* compiled from: GoldEarningsPotentialService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return GoldEarningsPotentialService_Adapter2.INSTANCE;
                }
            }

            public Arguments(double d) {
                this.deposit = d;
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, double d, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, GoldEarningsPotentialService_Adapter2.INSTANCE.getDescriptor());
                }
                this.deposit = d;
            }

            public final double getDeposit() {
                return this.deposit;
            }
        }

        /* compiled from: GoldEarningsPotentialService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator$Emission;", "", "value", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;", "constructor-impl", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;)Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;", "getValue", "()Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;)I", "toString", "", "toString-impl", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final GoldEarningsCalculatorModel value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23695boximpl(GoldEarningsCalculatorModel goldEarningsCalculatorModel) {
                return new Emission(goldEarningsCalculatorModel);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static GoldEarningsCalculatorModel m23696constructorimpl(GoldEarningsCalculatorModel goldEarningsCalculatorModel) {
                return goldEarningsCalculatorModel;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23697equalsimpl(GoldEarningsCalculatorModel goldEarningsCalculatorModel, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(goldEarningsCalculatorModel, ((Emission) obj).m23701unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23698equalsimpl0(GoldEarningsCalculatorModel goldEarningsCalculatorModel, GoldEarningsCalculatorModel goldEarningsCalculatorModel2) {
                return Intrinsics.areEqual(goldEarningsCalculatorModel, goldEarningsCalculatorModel2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23699hashCodeimpl(GoldEarningsCalculatorModel goldEarningsCalculatorModel) {
                if (goldEarningsCalculatorModel == null) {
                    return 0;
                }
                return goldEarningsCalculatorModel.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23700toStringimpl(GoldEarningsCalculatorModel goldEarningsCalculatorModel) {
                return "Emission(value=" + goldEarningsCalculatorModel + ")";
            }

            public boolean equals(Object obj) {
                return m23697equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23699hashCodeimpl(this.value);
            }

            public String toString() {
                return m23700toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ GoldEarningsCalculatorModel m23701unboximpl() {
                return this.value;
            }

            /* compiled from: GoldEarningsPotentialService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsPotentialService_Adapter$Endpoint_getPotentialGoldEarningsCalculator$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return GoldEarningsPotentialService_Adapter3.INSTANCE;
                }
            }

            private /* synthetic */ Emission(GoldEarningsCalculatorModel goldEarningsCalculatorModel) {
                this.value = goldEarningsCalculatorModel;
            }

            public final GoldEarningsCalculatorModel getValue() {
                return this.value;
            }
        }
    }
}
