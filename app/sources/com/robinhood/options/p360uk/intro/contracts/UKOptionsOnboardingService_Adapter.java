package com.robinhood.options.p360uk.intro.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.options.p360uk.intro.contracts.model.UkOptionsOnboardingContent;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: UKOptionsOnboardingService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/UKOptionsOnboardingService_Adapter;", "Lcom/robinhood/options/uk/intro/contracts/UKOptionsOnboardingService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "getUKOptionsOnboardingContent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_getUKOptionsOnboardingContent", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
final class UKOptionsOnboardingService_Adapter implements UKOptionsOnboardingService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: UKOptionsOnboardingService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.options.uk.intro.contracts.UKOptionsOnboardingService_Adapter", m3645f = "UKOptionsOnboardingService_Adapter.kt", m3646l = {117}, m3647m = "getUKOptionsOnboardingContent")
    /* renamed from: com.robinhood.options.uk.intro.contracts.UKOptionsOnboardingService_Adapter$getUKOptionsOnboardingContent$1 */
    static final class C359531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359531(Continuation<? super C359531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UKOptionsOnboardingService_Adapter.this.getUKOptionsOnboardingContent(this);
        }
    }

    public UKOptionsOnboardingService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.options.p360uk.intro.contracts.UKOptionsOnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUKOptionsOnboardingContent(Continuation<? super UkOptionsOnboardingContent> continuation) throws IOException {
        C359531 c359531;
        if (continuation instanceof C359531) {
            c359531 = (C359531) continuation;
            int i = c359531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359531.label = i - Integer.MIN_VALUE;
            } else {
                c359531 = new C359531(continuation);
            }
        }
        C359531 c3595312 = c359531;
        Object objCallSuspendFunction = c3595312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3595312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Unit unit = Unit.INSTANCE;
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            KSerializer<Endpoint_getUKOptionsOnboardingContent.Emission> kSerializerSerializer = Endpoint_getUKOptionsOnboardingContent.Emission.INSTANCE.serializer();
            c3595312.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, kSerializerSerializer, "getUKOptionsOnboardingContent", unit, c3595312);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getUKOptionsOnboardingContent.Emission) objCallSuspendFunction).m23753unboximpl();
    }

    /* compiled from: UKOptionsOnboardingService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/UKOptionsOnboardingService_Adapter$Endpoint_getUKOptionsOnboardingContent;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/options/uk/intro/contracts/UKOptionsOnboardingService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/options/uk/intro/contracts/UKOptionsOnboardingService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getUKOptionsOnboardingContent implements ServiceCallable {
        private final Json json;
        private final UKOptionsOnboardingService service;

        public Endpoint_getUKOptionsOnboardingContent(UKOptionsOnboardingService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            UKOptionsOnboardingService_Adapter3 uKOptionsOnboardingService_Adapter3 = new UKOptionsOnboardingService_Adapter3(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, Emission.INSTANCE.serializer(), body, uKOptionsOnboardingService_Adapter3);
        }

        /* compiled from: UKOptionsOnboardingService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/UKOptionsOnboardingService_Adapter$Endpoint_getUKOptionsOnboardingContent$Emission;", "", "value", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "constructor-impl", "(Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;)Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "getValue", "()Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;)I", "toString", "", "toString-impl", "(Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final UkOptionsOnboardingContent value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23747boximpl(UkOptionsOnboardingContent ukOptionsOnboardingContent) {
                return new Emission(ukOptionsOnboardingContent);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static UkOptionsOnboardingContent m23748constructorimpl(UkOptionsOnboardingContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23749equalsimpl(UkOptionsOnboardingContent ukOptionsOnboardingContent, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(ukOptionsOnboardingContent, ((Emission) obj).m23753unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23750equalsimpl0(UkOptionsOnboardingContent ukOptionsOnboardingContent, UkOptionsOnboardingContent ukOptionsOnboardingContent2) {
                return Intrinsics.areEqual(ukOptionsOnboardingContent, ukOptionsOnboardingContent2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23751hashCodeimpl(UkOptionsOnboardingContent ukOptionsOnboardingContent) {
                return ukOptionsOnboardingContent.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23752toStringimpl(UkOptionsOnboardingContent ukOptionsOnboardingContent) {
                return "Emission(value=" + ukOptionsOnboardingContent + ")";
            }

            public boolean equals(Object obj) {
                return m23749equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23751hashCodeimpl(this.value);
            }

            public String toString() {
                return m23752toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ UkOptionsOnboardingContent m23753unboximpl() {
                return this.value;
            }

            /* compiled from: UKOptionsOnboardingService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/UKOptionsOnboardingService_Adapter$Endpoint_getUKOptionsOnboardingContent$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/UKOptionsOnboardingService_Adapter$Endpoint_getUKOptionsOnboardingContent$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return UKOptionsOnboardingService_Adapter2.INSTANCE;
                }
            }

            private /* synthetic */ Emission(UkOptionsOnboardingContent ukOptionsOnboardingContent) {
                this.value = ukOptionsOnboardingContent;
            }

            public final UkOptionsOnboardingContent getValue() {
                return this.value;
            }
        }
    }
}
