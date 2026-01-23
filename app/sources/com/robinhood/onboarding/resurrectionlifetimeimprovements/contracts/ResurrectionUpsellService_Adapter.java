package com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: ResurrectionUpsellService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001b\u001c\u001dB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "upsellIdentifier", "source", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;", "resurrectionTakeoverUpsellModel", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "shouldShowPostDepositUpsell", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel;", "loggingModel", "", "resurrectionUpsellWasShown", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_resurrectionTakeoverUpsellModel", "Endpoint_shouldShowPostDepositUpsell", "Endpoint_resurrectionUpsellWasShown", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
final class ResurrectionUpsellService_Adapter implements ResurrectionUpsellService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: ResurrectionUpsellService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService_Adapter", m3645f = "ResurrectionUpsellService_Adapter.kt", m3646l = {155}, m3647m = "resurrectionTakeoverUpsellModel")
    /* renamed from: com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService_Adapter$resurrectionTakeoverUpsellModel$1 */
    static final class C359481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359481(Continuation<? super C359481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResurrectionUpsellService_Adapter.this.resurrectionTakeoverUpsellModel(null, null, this);
        }
    }

    /* compiled from: ResurrectionUpsellService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService_Adapter", m3645f = "ResurrectionUpsellService_Adapter.kt", m3646l = {155}, m3647m = "shouldShowPostDepositUpsell")
    /* renamed from: com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService_Adapter$shouldShowPostDepositUpsell$1 */
    static final class C359491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359491(Continuation<? super C359491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResurrectionUpsellService_Adapter.this.shouldShowPostDepositUpsell(null, this);
        }
    }

    public ResurrectionUpsellService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resurrectionTakeoverUpsellModel(String str, String str2, Continuation<? super ResurrectionUpsellModel> continuation) throws IOException {
        C359481 c359481;
        if (continuation instanceof C359481) {
            c359481 = (C359481) continuation;
            int i = c359481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359481.label = i - Integer.MIN_VALUE;
            } else {
                c359481 = new C359481(continuation);
            }
        }
        C359481 c3594812 = c359481;
        Object objCallSuspendFunction = c3594812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3594812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_resurrectionTakeoverUpsellModel.Arguments arguments = new Endpoint_resurrectionTakeoverUpsellModel.Arguments(str, str2);
            json.getSerializersModule();
            KSerializer<Endpoint_resurrectionTakeoverUpsellModel.Arguments> kSerializerSerializer = Endpoint_resurrectionTakeoverUpsellModel.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_resurrectionTakeoverUpsellModel.Emission> kSerializerSerializer2 = Endpoint_resurrectionTakeoverUpsellModel.Emission.INSTANCE.serializer();
            c3594812.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "resurrectionTakeoverUpsellModel", arguments, c3594812);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_resurrectionTakeoverUpsellModel.Emission) objCallSuspendFunction).m23737unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object shouldShowPostDepositUpsell(String str, Continuation<? super Boolean> continuation) throws IOException {
        C359491 c359491;
        if (continuation instanceof C359491) {
            c359491 = (C359491) continuation;
            int i = c359491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359491.label = i - Integer.MIN_VALUE;
            } else {
                c359491 = new C359491(continuation);
            }
        }
        C359491 c3594912 = c359491;
        Object objCallSuspendFunction = c3594912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3594912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_shouldShowPostDepositUpsell.Arguments arguments = new Endpoint_shouldShowPostDepositUpsell.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_shouldShowPostDepositUpsell.Arguments> kSerializerSerializer = Endpoint_shouldShowPostDepositUpsell.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_shouldShowPostDepositUpsell.Emission> kSerializerSerializer2 = Endpoint_shouldShowPostDepositUpsell.Emission.INSTANCE.serializer();
            c3594912.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "shouldShowPostDepositUpsell", arguments, c3594912);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return boxing.boxBoolean(((Endpoint_shouldShowPostDepositUpsell.Emission) objCallSuspendFunction).m23744unboximpl());
    }

    @Override // com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts.ResurrectionUpsellService
    public Object resurrectionUpsellWasShown(ResurrectionUpsellLoggingModel resurrectionUpsellLoggingModel, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_resurrectionUpsellWasShown.Arguments arguments = new Endpoint_resurrectionUpsellWasShown.Arguments(resurrectionUpsellLoggingModel);
        json.getSerializersModule();
        KSerializer<Endpoint_resurrectionUpsellWasShown.Arguments> kSerializerSerializer = Endpoint_resurrectionUpsellWasShown.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "resurrectionUpsellWasShown", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* compiled from: ResurrectionUpsellService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionTakeoverUpsellModel;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_resurrectionTakeoverUpsellModel implements ServiceCallable {
        private final Json json;
        private final ResurrectionUpsellService service;

        public Endpoint_resurrectionTakeoverUpsellModel(ResurrectionUpsellService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C35945x71bc35ac c35945x71bc35ac = new C35945x71bc35ac(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c35945x71bc35ac);
        }

        /* compiled from: ResurrectionUpsellService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionTakeoverUpsellModel$Arguments;", "", "upsellIdentifier", "", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUpsellIdentifier", "()Ljava/lang/String;", "getSource", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String source;
            private final String upsellIdentifier;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.upsellIdentifier;
                }
                if ((i & 2) != 0) {
                    str2 = arguments.source;
                }
                return arguments.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUpsellIdentifier() {
                return this.upsellIdentifier;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            public final Arguments copy(String upsellIdentifier, String source) {
                Intrinsics.checkNotNullParameter(upsellIdentifier, "upsellIdentifier");
                return new Arguments(upsellIdentifier, source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.upsellIdentifier, arguments.upsellIdentifier) && Intrinsics.areEqual(this.source, arguments.source);
            }

            public int hashCode() {
                int iHashCode = this.upsellIdentifier.hashCode() * 31;
                String str = this.source;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Arguments(upsellIdentifier=" + this.upsellIdentifier + ", source=" + this.source + ")";
            }

            /* compiled from: ResurrectionUpsellService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionTakeoverUpsellModel$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionTakeoverUpsellModel$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C35940x872411e7.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C35940x872411e7.INSTANCE.getDescriptor());
                }
                this.upsellIdentifier = str;
                this.source = str2;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.upsellIdentifier);
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.source);
            }

            public Arguments(String upsellIdentifier, String str) {
                Intrinsics.checkNotNullParameter(upsellIdentifier, "upsellIdentifier");
                this.upsellIdentifier = upsellIdentifier;
                this.source = str;
            }

            public final String getUpsellIdentifier() {
                return this.upsellIdentifier;
            }

            public final String getSource() {
                return this.source;
            }
        }

        /* compiled from: ResurrectionUpsellService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionTakeoverUpsellModel$Emission;", "", "value", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;", "constructor-impl", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;)Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;", "getValue", "()Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;)I", "toString", "", "toString-impl", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellModel;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ResurrectionUpsellModel value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23731boximpl(ResurrectionUpsellModel resurrectionUpsellModel) {
                return new Emission(resurrectionUpsellModel);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static ResurrectionUpsellModel m23732constructorimpl(ResurrectionUpsellModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23733equalsimpl(ResurrectionUpsellModel resurrectionUpsellModel, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(resurrectionUpsellModel, ((Emission) obj).m23737unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23734equalsimpl0(ResurrectionUpsellModel resurrectionUpsellModel, ResurrectionUpsellModel resurrectionUpsellModel2) {
                return Intrinsics.areEqual(resurrectionUpsellModel, resurrectionUpsellModel2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23735hashCodeimpl(ResurrectionUpsellModel resurrectionUpsellModel) {
                return resurrectionUpsellModel.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23736toStringimpl(ResurrectionUpsellModel resurrectionUpsellModel) {
                return "Emission(value=" + resurrectionUpsellModel + ")";
            }

            public boolean equals(Object obj) {
                return m23733equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23735hashCodeimpl(this.value);
            }

            public String toString() {
                return m23736toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ ResurrectionUpsellModel m23737unboximpl() {
                return this.value;
            }

            /* compiled from: ResurrectionUpsellService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionTakeoverUpsellModel$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionTakeoverUpsellModel$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C35941x7c1581ba.INSTANCE;
                }
            }

            private /* synthetic */ Emission(ResurrectionUpsellModel resurrectionUpsellModel) {
                this.value = resurrectionUpsellModel;
            }

            public final ResurrectionUpsellModel getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: ResurrectionUpsellService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_shouldShowPostDepositUpsell implements ServiceCallable {
        private final Json json;
        private final ResurrectionUpsellService service;

        public Endpoint_shouldShowPostDepositUpsell(ResurrectionUpsellService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C35947x1b150c2b c35947x1b150c2b = new C35947x1b150c2b(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c35947x1b150c2b);
        }

        /* compiled from: ResurrectionUpsellService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell$Arguments;", "", "upsellIdentifier", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUpsellIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String upsellIdentifier;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.upsellIdentifier;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUpsellIdentifier() {
                return this.upsellIdentifier;
            }

            public final Arguments copy(String upsellIdentifier) {
                Intrinsics.checkNotNullParameter(upsellIdentifier, "upsellIdentifier");
                return new Arguments(upsellIdentifier);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.upsellIdentifier, ((Arguments) other).upsellIdentifier);
            }

            public int hashCode() {
                return this.upsellIdentifier.hashCode();
            }

            public String toString() {
                return "Arguments(upsellIdentifier=" + this.upsellIdentifier + ")";
            }

            /* compiled from: ResurrectionUpsellService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C35943xd9a18d88.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C35943xd9a18d88.INSTANCE.getDescriptor());
                }
                this.upsellIdentifier = str;
            }

            public Arguments(String upsellIdentifier) {
                Intrinsics.checkNotNullParameter(upsellIdentifier, "upsellIdentifier");
                this.upsellIdentifier = upsellIdentifier;
            }

            public final String getUpsellIdentifier() {
                return this.upsellIdentifier;
            }
        }

        /* compiled from: ResurrectionUpsellService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell$Emission;", "", "value", "", "constructor-impl", "(Z)Z", "getValue", "()Z", "equals", "other", "equals-impl", "(ZLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Z)I", "toString", "", "toString-impl", "(Z)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23738boximpl(boolean z) {
                return new Emission(z);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static boolean m23739constructorimpl(boolean z) {
                return z;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23740equalsimpl(boolean z, Object obj) {
                return (obj instanceof Emission) && z == ((Emission) obj).m23744unboximpl();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23741equalsimpl0(boolean z, boolean z2) {
                return z == z2;
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23742hashCodeimpl(boolean z) {
                return Boolean.hashCode(z);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23743toStringimpl(boolean z) {
                return "Emission(value=" + z + ")";
            }

            public boolean equals(Object obj) {
                return m23740equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23742hashCodeimpl(this.value);
            }

            public String toString() {
                return m23743toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ boolean m23744unboximpl() {
                return this.value;
            }

            /* compiled from: ResurrectionUpsellService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_shouldShowPostDepositUpsell$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C35944xea198df9.INSTANCE;
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

    /* compiled from: ResurrectionUpsellService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionUpsellWasShown;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_resurrectionUpsellWasShown implements ServiceCallable {
        private final Json json;
        private final ResurrectionUpsellService service;

        public Endpoint_resurrectionUpsellWasShown(ResurrectionUpsellService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C35946x4663c6dc c35946x4663c6dc = new C35946x4663c6dc(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c35946x4663c6dc);
        }

        /* compiled from: ResurrectionUpsellService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionUpsellWasShown$Arguments;", "", "loggingModel", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel;", "<init>", "(Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLoggingModel", "()Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingModel;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ResurrectionUpsellLoggingModel loggingModel;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, ResurrectionUpsellLoggingModel resurrectionUpsellLoggingModel, int i, Object obj) {
                if ((i & 1) != 0) {
                    resurrectionUpsellLoggingModel = arguments.loggingModel;
                }
                return arguments.copy(resurrectionUpsellLoggingModel);
            }

            /* renamed from: component1, reason: from getter */
            public final ResurrectionUpsellLoggingModel getLoggingModel() {
                return this.loggingModel;
            }

            public final Arguments copy(ResurrectionUpsellLoggingModel loggingModel) {
                Intrinsics.checkNotNullParameter(loggingModel, "loggingModel");
                return new Arguments(loggingModel);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.loggingModel, ((Arguments) other).loggingModel);
            }

            public int hashCode() {
                return this.loggingModel.hashCode();
            }

            public String toString() {
                return "Arguments(loggingModel=" + this.loggingModel + ")";
            }

            /* compiled from: ResurrectionUpsellService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionUpsellWasShown$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellService_Adapter$Endpoint_resurrectionUpsellWasShown$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C35942xd9a1fab7.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, ResurrectionUpsellLoggingModel resurrectionUpsellLoggingModel, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C35942xd9a1fab7.INSTANCE.getDescriptor());
                }
                this.loggingModel = resurrectionUpsellLoggingModel;
            }

            public Arguments(ResurrectionUpsellLoggingModel loggingModel) {
                Intrinsics.checkNotNullParameter(loggingModel, "loggingModel");
                this.loggingModel = loggingModel;
            }

            public final ResurrectionUpsellLoggingModel getLoggingModel() {
                return this.loggingModel;
            }
        }
    }
}
