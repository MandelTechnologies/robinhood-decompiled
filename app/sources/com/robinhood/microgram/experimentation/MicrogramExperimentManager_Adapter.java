package com.robinhood.microgram.experimentation;

import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: MicrogramExperimentManager_Adapter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter;", "Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "experimentName", "", "logExposure", "variationForExperiment", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "variant", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_logExposure", "Endpoint_variationForExperiment", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class MicrogramExperimentManager_Adapter implements MicrogramExperimentManager {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: MicrogramExperimentManager_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.experimentation.MicrogramExperimentManager_Adapter", m3645f = "MicrogramExperimentManager_Adapter.kt", m3646l = {147}, m3647m = "variationForExperiment")
    /* renamed from: com.robinhood.microgram.experimentation.MicrogramExperimentManager_Adapter$variationForExperiment$1 */
    static final class C349661 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349661(Continuation<? super C349661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MicrogramExperimentManager_Adapter.this.variationForExperiment(null, false, this);
        }
    }

    public MicrogramExperimentManager_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.microgram.experimentation.MicrogramExperimentManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object variationForExperiment(String str, boolean z, Continuation<? super String> continuation) throws IOException {
        C349661 c349661;
        if (continuation instanceof C349661) {
            c349661 = (C349661) continuation;
            int i = c349661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349661.label = i - Integer.MIN_VALUE;
            } else {
                c349661 = new C349661(continuation);
            }
        }
        C349661 c3496612 = c349661;
        Object objCallSuspendFunction = c3496612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3496612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_variationForExperiment.Arguments arguments = new Endpoint_variationForExperiment.Arguments(str, z);
            json.getSerializersModule();
            KSerializer<Endpoint_variationForExperiment.Arguments> kSerializerSerializer = Endpoint_variationForExperiment.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_variationForExperiment.Emission> kSerializerSerializer2 = Endpoint_variationForExperiment.Emission.INSTANCE.serializer();
            c3496612.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "variationForExperiment", arguments, c3496612);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_variationForExperiment.Emission) objCallSuspendFunction).m22917unboximpl();
    }

    @Override // com.robinhood.microgram.experimentation.MicrogramExperimentManager
    public Object logExposure(String str, String str2, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_logExposure.Arguments arguments = new Endpoint_logExposure.Arguments(str, str2);
        json.getSerializersModule();
        KSerializer<Endpoint_logExposure.Arguments> kSerializerSerializer = Endpoint_logExposure.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "logExposure", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* compiled from: MicrogramExperimentManager_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_variationForExperiment implements ServiceCallable {
        private final Json json;
        private final MicrogramExperimentManager service;

        public Endpoint_variationForExperiment(MicrogramExperimentManager service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            MicrogramExperimentManager_Adapter6 microgramExperimentManager_Adapter6 = new MicrogramExperimentManager_Adapter6(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, microgramExperimentManager_Adapter6);
        }

        /* compiled from: MicrogramExperimentManager_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment$Arguments;", "", "seen1", "", "experimentName", "", "logExposure", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Z)V", "getExperimentName", "()Ljava/lang/String;", "getLogExposure", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String experimentName;
            private final boolean logExposure;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.experimentName;
                }
                if ((i & 2) != 0) {
                    z = arguments.logExposure;
                }
                return arguments.copy(str, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getExperimentName() {
                return this.experimentName;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getLogExposure() {
                return this.logExposure;
            }

            public final Arguments copy(String experimentName, boolean logExposure) {
                Intrinsics.checkNotNullParameter(experimentName, "experimentName");
                return new Arguments(experimentName, logExposure);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.experimentName, arguments.experimentName) && this.logExposure == arguments.logExposure;
            }

            public int hashCode() {
                return (this.experimentName.hashCode() * 31) + Boolean.hashCode(this.logExposure);
            }

            public String toString() {
                return "Arguments(experimentName=" + this.experimentName + ", logExposure=" + this.logExposure + ")";
            }

            /* compiled from: MicrogramExperimentManager_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return MicrogramExperimentManager_Adapter3.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, MicrogramExperimentManager_Adapter3.INSTANCE.getDescriptor());
                }
                this.experimentName = str;
                this.logExposure = z;
            }

            public Arguments(String experimentName, boolean z) {
                Intrinsics.checkNotNullParameter(experimentName, "experimentName");
                this.experimentName = experimentName;
                this.logExposure = z;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_common_services(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.experimentName);
                output.encodeBooleanElement(serialDesc, 1, self.logExposure);
            }

            public final String getExperimentName() {
                return this.experimentName;
            }

            public final boolean getLogExposure() {
                return this.logExposure;
            }
        }

        /* compiled from: MicrogramExperimentManager_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment$Emission;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22911boximpl(String str) {
                return new Emission(str);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static String m22912constructorimpl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22913equalsimpl(String str, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(str, ((Emission) obj).m22917unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22914equalsimpl0(String str, String str2) {
                return Intrinsics.areEqual(str, str2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22915hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22916toStringimpl(String str) {
                return "Emission(value=" + str + ")";
            }

            public boolean equals(Object obj) {
                return m22913equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22915hashCodeimpl(this.value);
            }

            public String toString() {
                return m22916toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m22917unboximpl() {
                return this.value;
            }

            /* compiled from: MicrogramExperimentManager_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment$Emission;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return MicrogramExperimentManager_Adapter4.INSTANCE;
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

    /* compiled from: MicrogramExperimentManager_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_logExposure;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_logExposure implements ServiceCallable {
        private final Json json;
        private final MicrogramExperimentManager service;

        public Endpoint_logExposure(MicrogramExperimentManager service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            MicrogramExperimentManager_Adapter5 microgramExperimentManager_Adapter5 = new MicrogramExperimentManager_Adapter5(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, microgramExperimentManager_Adapter5);
        }

        /* compiled from: MicrogramExperimentManager_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_logExposure$Arguments;", "", "seen1", "", "experimentName", "", "variant", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getExperimentName", "()Ljava/lang/String;", "getVariant", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String experimentName;
            private final String variant;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.experimentName;
                }
                if ((i & 2) != 0) {
                    str2 = arguments.variant;
                }
                return arguments.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getExperimentName() {
                return this.experimentName;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVariant() {
                return this.variant;
            }

            public final Arguments copy(String experimentName, String variant) {
                Intrinsics.checkNotNullParameter(experimentName, "experimentName");
                Intrinsics.checkNotNullParameter(variant, "variant");
                return new Arguments(experimentName, variant);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.experimentName, arguments.experimentName) && Intrinsics.areEqual(this.variant, arguments.variant);
            }

            public int hashCode() {
                return (this.experimentName.hashCode() * 31) + this.variant.hashCode();
            }

            public String toString() {
                return "Arguments(experimentName=" + this.experimentName + ", variant=" + this.variant + ")";
            }

            /* compiled from: MicrogramExperimentManager_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_logExposure$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_logExposure$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return MicrogramExperimentManager_Adapter2.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, MicrogramExperimentManager_Adapter2.INSTANCE.getDescriptor());
                }
                this.experimentName = str;
                this.variant = str2;
            }

            public Arguments(String experimentName, String variant) {
                Intrinsics.checkNotNullParameter(experimentName, "experimentName");
                Intrinsics.checkNotNullParameter(variant, "variant");
                this.experimentName = experimentName;
                this.variant = variant;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_common_services(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.experimentName);
                output.encodeStringElement(serialDesc, 1, self.variant);
            }

            public final String getExperimentName() {
                return this.experimentName;
            }

            public final String getVariant() {
                return this.variant;
            }
        }
    }
}
