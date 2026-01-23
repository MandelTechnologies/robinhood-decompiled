package com.robinhood.microgram.authentication;

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

/* compiled from: AuthenticationService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/microgram/authentication/AuthenticationService_Adapter;", "Lcom/robinhood/microgram/authentication/AuthenticationService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "isAuthenticated", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_isAuthenticated", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class AuthenticationService_Adapter implements AuthenticationService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: AuthenticationService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.authentication.AuthenticationService_Adapter", m3645f = "AuthenticationService_Adapter.kt", m3646l = {115}, m3647m = "isAuthenticated")
    /* renamed from: com.robinhood.microgram.authentication.AuthenticationService_Adapter$isAuthenticated$1 */
    static final class C349551 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349551(Continuation<? super C349551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthenticationService_Adapter.this.isAuthenticated(this);
        }
    }

    public AuthenticationService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.microgram.authentication.AuthenticationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isAuthenticated(Continuation<? super Boolean> continuation) throws IOException {
        C349551 c349551;
        if (continuation instanceof C349551) {
            c349551 = (C349551) continuation;
            int i = c349551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349551.label = i - Integer.MIN_VALUE;
            } else {
                c349551 = new C349551(continuation);
            }
        }
        C349551 c3495512 = c349551;
        Object objCallSuspendFunction = c3495512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3495512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Unit unit = Unit.INSTANCE;
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            KSerializer<Endpoint_isAuthenticated.Emission> kSerializerSerializer = Endpoint_isAuthenticated.Emission.INSTANCE.serializer();
            c3495512.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, kSerializerSerializer, "isAuthenticated", unit, c3495512);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return boxing.boxBoolean(((Endpoint_isAuthenticated.Emission) objCallSuspendFunction).m22908unboximpl());
    }

    /* compiled from: AuthenticationService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/authentication/AuthenticationService_Adapter$Endpoint_isAuthenticated;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/authentication/AuthenticationService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/authentication/AuthenticationService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Emission", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_isAuthenticated implements ServiceCallable {
        private final Json json;
        private final AuthenticationService service;

        public Endpoint_isAuthenticated(AuthenticationService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AuthenticationService_Adapter3 authenticationService_Adapter3 = new AuthenticationService_Adapter3(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, Emission.INSTANCE.serializer(), body, authenticationService_Adapter3);
        }

        /* compiled from: AuthenticationService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/microgram/authentication/AuthenticationService_Adapter$Endpoint_isAuthenticated$Emission;", "", "value", "", "constructor-impl", "(Z)Z", "getValue", "()Z", "equals", "other", "equals-impl", "(ZLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Z)I", "toString", "", "toString-impl", "(Z)Ljava/lang/String;", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22902boximpl(boolean z) {
                return new Emission(z);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static boolean m22903constructorimpl(boolean z) {
                return z;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22904equalsimpl(boolean z, Object obj) {
                return (obj instanceof Emission) && z == ((Emission) obj).m22908unboximpl();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22905equalsimpl0(boolean z, boolean z2) {
                return z == z2;
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22906hashCodeimpl(boolean z) {
                return Boolean.hashCode(z);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22907toStringimpl(boolean z) {
                return "Emission(value=" + z + ")";
            }

            public boolean equals(Object obj) {
                return m22904equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22906hashCodeimpl(this.value);
            }

            public String toString() {
                return m22907toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ boolean m22908unboximpl() {
                return this.value;
            }

            /* compiled from: AuthenticationService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/authentication/AuthenticationService_Adapter$Endpoint_isAuthenticated$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/authentication/AuthenticationService_Adapter$Endpoint_isAuthenticated$Emission;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return AuthenticationService_Adapter2.INSTANCE;
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
}
