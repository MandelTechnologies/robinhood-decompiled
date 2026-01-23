package com.robinhood.futures.ordercheck.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderCheckRequest;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderChecksResult;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
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
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: FuturesOrderChecksService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;", "candidateOrder", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderChecksResult;", "validateOrderAndPresentErrorAlert", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_validateOrderAndPresentErrorAlert", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class FuturesOrderChecksService_Adapter implements FuturesOrderChecksService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: FuturesOrderChecksService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.futures.ordercheck.contracts.FuturesOrderChecksService_Adapter", m3645f = "FuturesOrderChecksService_Adapter.kt", m3646l = {131}, m3647m = "validateOrderAndPresentErrorAlert")
    /* renamed from: com.robinhood.futures.ordercheck.contracts.FuturesOrderChecksService_Adapter$validateOrderAndPresentErrorAlert$1 */
    static final class C333151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C333151(Continuation<? super C333151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOrderChecksService_Adapter.this.validateOrderAndPresentErrorAlert(null, this);
        }
    }

    public FuturesOrderChecksService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderChecksService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object validateOrderAndPresentErrorAlert(FuturesOrderCheckRequest futuresOrderCheckRequest, Continuation<? super FuturesOrderChecksResult> continuation) throws IOException {
        C333151 c333151;
        if (continuation instanceof C333151) {
            c333151 = (C333151) continuation;
            int i = c333151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c333151.label = i - Integer.MIN_VALUE;
            } else {
                c333151 = new C333151(continuation);
            }
        }
        C333151 c3331512 = c333151;
        Object objCallSuspendFunction = c3331512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3331512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_validateOrderAndPresentErrorAlert.Arguments arguments = new Endpoint_validateOrderAndPresentErrorAlert.Arguments(futuresOrderCheckRequest);
            json.getSerializersModule();
            KSerializer<Endpoint_validateOrderAndPresentErrorAlert.Arguments> kSerializerSerializer = Endpoint_validateOrderAndPresentErrorAlert.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_validateOrderAndPresentErrorAlert.Emission> kSerializerSerializer2 = Endpoint_validateOrderAndPresentErrorAlert.Emission.INSTANCE.serializer();
            c3331512.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "validateOrderAndPresentErrorAlert", arguments, c3331512);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_validateOrderAndPresentErrorAlert.Emission) objCallSuspendFunction).m22512unboximpl();
    }

    /* compiled from: FuturesOrderChecksService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_validateOrderAndPresentErrorAlert implements ServiceCallable {
        private final Json json;
        private final FuturesOrderChecksService service;

        public Endpoint_validateOrderAndPresentErrorAlert(FuturesOrderChecksService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            FuturesOrderChecksService_Adapter4 futuresOrderChecksService_Adapter4 = new FuturesOrderChecksService_Adapter4(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, futuresOrderChecksService_Adapter4);
        }

        /* compiled from: FuturesOrderChecksService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$Arguments;", "", "seen1", "", "candidateOrder", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;)V", "getCandidateOrder", "()Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesOrderCheckRequest candidateOrder;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, FuturesOrderCheckRequest futuresOrderCheckRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    futuresOrderCheckRequest = arguments.candidateOrder;
                }
                return arguments.copy(futuresOrderCheckRequest);
            }

            /* renamed from: component1, reason: from getter */
            public final FuturesOrderCheckRequest getCandidateOrder() {
                return this.candidateOrder;
            }

            public final Arguments copy(FuturesOrderCheckRequest candidateOrder) {
                Intrinsics.checkNotNullParameter(candidateOrder, "candidateOrder");
                return new Arguments(candidateOrder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.candidateOrder, ((Arguments) other).candidateOrder);
            }

            public int hashCode() {
                return this.candidateOrder.hashCode();
            }

            public String toString() {
                return "Arguments(candidateOrder=" + this.candidateOrder + ")";
            }

            /* compiled from: FuturesOrderChecksService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return FuturesOrderChecksService_Adapter2.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, FuturesOrderCheckRequest futuresOrderCheckRequest, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, FuturesOrderChecksService_Adapter2.INSTANCE.getDescriptor());
                }
                this.candidateOrder = futuresOrderCheckRequest;
            }

            public Arguments(FuturesOrderCheckRequest candidateOrder) {
                Intrinsics.checkNotNullParameter(candidateOrder, "candidateOrder");
                this.candidateOrder = candidateOrder;
            }

            public final FuturesOrderCheckRequest getCandidateOrder() {
                return this.candidateOrder;
            }
        }

        /* compiled from: FuturesOrderChecksService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$Emission;", "", "value", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderChecksResult;", "constructor-impl", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderChecksResult;)Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderChecksResult;", "getValue", "()Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderChecksResult;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderChecksResult;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderChecksResult;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderChecksResult;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {
            private final FuturesOrderChecksResult value;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {FuturesOrderChecksResult.INSTANCE.serializer()};

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22506boximpl(FuturesOrderChecksResult futuresOrderChecksResult) {
                return new Emission(futuresOrderChecksResult);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesOrderChecksResult m22507constructorimpl(FuturesOrderChecksResult value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22508equalsimpl(FuturesOrderChecksResult futuresOrderChecksResult, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresOrderChecksResult, ((Emission) obj).m22512unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22509equalsimpl0(FuturesOrderChecksResult futuresOrderChecksResult, FuturesOrderChecksResult futuresOrderChecksResult2) {
                return Intrinsics.areEqual(futuresOrderChecksResult, futuresOrderChecksResult2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22510hashCodeimpl(FuturesOrderChecksResult futuresOrderChecksResult) {
                return futuresOrderChecksResult.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22511toStringimpl(FuturesOrderChecksResult futuresOrderChecksResult) {
                return "Emission(value=" + futuresOrderChecksResult + ")";
            }

            public boolean equals(Object obj) {
                return m22508equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22510hashCodeimpl(this.value);
            }

            public String toString() {
                return m22511toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesOrderChecksResult m22512unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesOrderChecksService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService_Adapter$Endpoint_validateOrderAndPresentErrorAlert$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return FuturesOrderChecksService_Adapter3.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesOrderChecksResult futuresOrderChecksResult) {
                this.value = futuresOrderChecksResult;
            }

            public final FuturesOrderChecksResult getValue() {
                return this.value;
            }
        }
    }
}
