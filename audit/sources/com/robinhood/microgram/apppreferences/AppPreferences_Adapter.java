package com.robinhood.microgram.apppreferences;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.io.IOException;
import kotlin.Deprecated;
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
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: AppPreferences_Adapter.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\r()*+,-./01234B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\rJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0015\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b \u0010!J \u0010\"\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\"\u0010\u001dJ\u0018\u0010#\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b#\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'¨\u00065"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter;", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "key", "", "getBool", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getString", "", "getLong", "", "getDouble", "", "getInt", "getEpochSeconds", "value", "", "setBool", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setString", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLong", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDouble", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInt", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEpochSeconds", AnalyticsStrings.BUTTON_LIST_DELETE, "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_deleteKey", "Endpoint_getBool", "Endpoint_getDouble", "Endpoint_getEpochSeconds", "Endpoint_getInt", "Endpoint_getLong", "Endpoint_getString", "Endpoint_setBool", "Endpoint_setDouble", "Endpoint_setEpochSeconds", "Endpoint_setInt", "Endpoint_setLong", "Endpoint_setString", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class AppPreferences_Adapter implements AppPreferences {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.apppreferences.AppPreferences_Adapter", m3645f = "AppPreferences_Adapter.kt", m3646l = {401}, m3647m = "getBool")
    /* renamed from: com.robinhood.microgram.apppreferences.AppPreferences_Adapter$getBool$1 */
    static final class C349471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349471(Continuation<? super C349471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppPreferences_Adapter.this.getBool(null, this);
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.apppreferences.AppPreferences_Adapter", m3645f = "AppPreferences_Adapter.kt", m3646l = {401}, m3647m = "getDouble")
    /* renamed from: com.robinhood.microgram.apppreferences.AppPreferences_Adapter$getDouble$1 */
    static final class C349481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349481(Continuation<? super C349481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppPreferences_Adapter.this.getDouble(null, this);
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.apppreferences.AppPreferences_Adapter", m3645f = "AppPreferences_Adapter.kt", m3646l = {401}, m3647m = "getEpochSeconds")
    /* renamed from: com.robinhood.microgram.apppreferences.AppPreferences_Adapter$getEpochSeconds$1 */
    static final class C349491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349491(Continuation<? super C349491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppPreferences_Adapter.this.getEpochSeconds(null, this);
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.apppreferences.AppPreferences_Adapter", m3645f = "AppPreferences_Adapter.kt", m3646l = {401}, m3647m = "getInt")
    /* renamed from: com.robinhood.microgram.apppreferences.AppPreferences_Adapter$getInt$1 */
    static final class C349501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349501(Continuation<? super C349501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppPreferences_Adapter.this.getInt(null, this);
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.apppreferences.AppPreferences_Adapter", m3645f = "AppPreferences_Adapter.kt", m3646l = {401}, m3647m = "getLong")
    /* renamed from: com.robinhood.microgram.apppreferences.AppPreferences_Adapter$getLong$1 */
    static final class C349511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349511(Continuation<? super C349511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppPreferences_Adapter.this.getLong(null, this);
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.microgram.apppreferences.AppPreferences_Adapter", m3645f = "AppPreferences_Adapter.kt", m3646l = {401}, m3647m = "getString")
    /* renamed from: com.robinhood.microgram.apppreferences.AppPreferences_Adapter$getString$1 */
    static final class C349521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349521(Continuation<? super C349521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppPreferences_Adapter.this.getString(null, this);
        }
    }

    public AppPreferences_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getBool(String str, Continuation<? super Boolean> continuation) throws IOException {
        C349471 c349471;
        if (continuation instanceof C349471) {
            c349471 = (C349471) continuation;
            int i = c349471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349471.label = i - Integer.MIN_VALUE;
            } else {
                c349471 = new C349471(continuation);
            }
        }
        C349471 c3494712 = c349471;
        Object objCallSuspendFunction = c3494712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3494712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getBool.Arguments arguments = new Endpoint_getBool.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_getBool.Arguments> kSerializerSerializer = Endpoint_getBool.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getBool.Emission> kSerializerSerializer2 = Endpoint_getBool.Emission.INSTANCE.serializer();
            c3494712.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getBool", arguments, c3494712);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return boxing.boxBoolean(((Endpoint_getBool.Emission) objCallSuspendFunction).m22864unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getString(String str, Continuation<? super String> continuation) throws IOException {
        C349521 c349521;
        if (continuation instanceof C349521) {
            c349521 = (C349521) continuation;
            int i = c349521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349521.label = i - Integer.MIN_VALUE;
            } else {
                c349521 = new C349521(continuation);
            }
        }
        C349521 c3495212 = c349521;
        Object objCallSuspendFunction = c3495212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3495212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getString.Arguments arguments = new Endpoint_getString.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_getString.Arguments> kSerializerSerializer = Endpoint_getString.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getString.Emission> kSerializerSerializer2 = Endpoint_getString.Emission.INSTANCE.serializer();
            c3495212.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getString", arguments, c3495212);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getString.Emission) objCallSuspendFunction).m22899unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getLong(String str, Continuation<? super Long> continuation) throws IOException {
        C349511 c349511;
        if (continuation instanceof C349511) {
            c349511 = (C349511) continuation;
            int i = c349511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349511.label = i - Integer.MIN_VALUE;
            } else {
                c349511 = new C349511(continuation);
            }
        }
        C349511 c3495112 = c349511;
        Object objCallSuspendFunction = c3495112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3495112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getLong.Arguments arguments = new Endpoint_getLong.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_getLong.Arguments> kSerializerSerializer = Endpoint_getLong.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getLong.Emission> kSerializerSerializer2 = Endpoint_getLong.Emission.INSTANCE.serializer();
            c3495112.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getLong", arguments, c3495112);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getLong.Emission) objCallSuspendFunction).m22892unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDouble(String str, Continuation<? super Double> continuation) throws IOException {
        C349481 c349481;
        if (continuation instanceof C349481) {
            c349481 = (C349481) continuation;
            int i = c349481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349481.label = i - Integer.MIN_VALUE;
            } else {
                c349481 = new C349481(continuation);
            }
        }
        C349481 c3494812 = c349481;
        Object objCallSuspendFunction = c3494812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3494812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getDouble.Arguments arguments = new Endpoint_getDouble.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_getDouble.Arguments> kSerializerSerializer = Endpoint_getDouble.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getDouble.Emission> kSerializerSerializer2 = Endpoint_getDouble.Emission.INSTANCE.serializer();
            c3494812.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getDouble", arguments, c3494812);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getDouble.Emission) objCallSuspendFunction).m22871unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getInt(String str, Continuation<? super Integer> continuation) throws IOException {
        C349501 c349501;
        if (continuation instanceof C349501) {
            c349501 = (C349501) continuation;
            int i = c349501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349501.label = i - Integer.MIN_VALUE;
            } else {
                c349501 = new C349501(continuation);
            }
        }
        C349501 c3495012 = c349501;
        Object objCallSuspendFunction = c3495012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3495012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getInt.Arguments arguments = new Endpoint_getInt.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_getInt.Arguments> kSerializerSerializer = Endpoint_getInt.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getInt.Emission> kSerializerSerializer2 = Endpoint_getInt.Emission.INSTANCE.serializer();
            c3495012.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getInt", arguments, c3495012);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getInt.Emission) objCallSuspendFunction).m22885unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getEpochSeconds(String str, Continuation<? super Long> continuation) throws IOException {
        C349491 c349491;
        if (continuation instanceof C349491) {
            c349491 = (C349491) continuation;
            int i = c349491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349491.label = i - Integer.MIN_VALUE;
            } else {
                c349491 = new C349491(continuation);
            }
        }
        C349491 c3494912 = c349491;
        Object objCallSuspendFunction = c3494912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3494912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getEpochSeconds.Arguments arguments = new Endpoint_getEpochSeconds.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_getEpochSeconds.Arguments> kSerializerSerializer = Endpoint_getEpochSeconds.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getEpochSeconds.Emission> kSerializerSerializer2 = Endpoint_getEpochSeconds.Emission.INSTANCE.serializer();
            c3494912.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getEpochSeconds", arguments, c3494912);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getEpochSeconds.Emission) objCallSuspendFunction).m22878unboximpl();
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setBool(String str, boolean z, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_setBool.Arguments arguments = new Endpoint_setBool.Arguments(str, z);
        json.getSerializersModule();
        KSerializer<Endpoint_setBool.Arguments> kSerializerSerializer = Endpoint_setBool.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "setBool", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setString(String str, String str2, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_setString.Arguments arguments = new Endpoint_setString.Arguments(str, str2);
        json.getSerializersModule();
        KSerializer<Endpoint_setString.Arguments> kSerializerSerializer = Endpoint_setString.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "setString", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setLong(String str, long j, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_setLong.Arguments arguments = new Endpoint_setLong.Arguments(str, j);
        json.getSerializersModule();
        KSerializer<Endpoint_setLong.Arguments> kSerializerSerializer = Endpoint_setLong.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "setLong", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setDouble(String str, double d, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_setDouble.Arguments arguments = new Endpoint_setDouble.Arguments(str, d);
        json.getSerializersModule();
        KSerializer<Endpoint_setDouble.Arguments> kSerializerSerializer = Endpoint_setDouble.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "setDouble", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setInt(String str, int i, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_setInt.Arguments arguments = new Endpoint_setInt.Arguments(str, i);
        json.getSerializersModule();
        KSerializer<Endpoint_setInt.Arguments> kSerializerSerializer = Endpoint_setInt.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "setInt", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object setEpochSeconds(String str, long j, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_setEpochSeconds.Arguments arguments = new Endpoint_setEpochSeconds.Arguments(str, j);
        json.getSerializersModule();
        KSerializer<Endpoint_setEpochSeconds.Arguments> kSerializerSerializer = Endpoint_setEpochSeconds.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "setEpochSeconds", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.apppreferences.AppPreferences
    public Object delete(String str, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_deleteKey.Arguments arguments = new Endpoint_deleteKey.Arguments(str);
        json.getSerializersModule();
        KSerializer<Endpoint_deleteKey.Arguments> kSerializerSerializer = Endpoint_deleteKey.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "deleteKey", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getBool;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getBool implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_getBool(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_getBool$call$1 appPreferences_Adapter$Endpoint_getBool$call$1 = new AppPreferences_Adapter$Endpoint_getBool$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, appPreferences_Adapter$Endpoint_getBool$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getBool$Arguments;", "", "seen1", "", "key", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            public final Arguments copy(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.key, ((Arguments) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "Arguments(key=" + this.key + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getBool$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getBool$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_getBool$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AppPreferences_Adapter$Endpoint_getBool$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
            }

            public Arguments(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            public final String getKey() {
                return this.key;
            }
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getBool$Emission;", "", "value", "", "constructor-impl", "(Z)Z", "getValue", "()Z", "equals", "other", "equals-impl", "(ZLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Z)I", "toString", "", "toString-impl", "(Z)Ljava/lang/String;", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22858boximpl(boolean z) {
                return new Emission(z);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static boolean m22859constructorimpl(boolean z) {
                return z;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22860equalsimpl(boolean z, Object obj) {
                return (obj instanceof Emission) && z == ((Emission) obj).m22864unboximpl();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22861equalsimpl0(boolean z, boolean z2) {
                return z == z2;
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22862hashCodeimpl(boolean z) {
                return Boolean.hashCode(z);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22863toStringimpl(boolean z) {
                return "Emission(value=" + z + ")";
            }

            public boolean equals(Object obj) {
                return m22860equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22862hashCodeimpl(this.value);
            }

            public String toString() {
                return m22863toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ boolean m22864unboximpl() {
                return this.value;
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getBool$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getBool$Emission;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return AppPreferences_Adapter$Endpoint_getBool$Emission$$serializer.INSTANCE;
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

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getString;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getString implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_getString(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_getString$call$1 appPreferences_Adapter$Endpoint_getString$call$1 = new AppPreferences_Adapter$Endpoint_getString$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, appPreferences_Adapter$Endpoint_getString$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getString$Arguments;", "", "seen1", "", "key", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            public final Arguments copy(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.key, ((Arguments) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "Arguments(key=" + this.key + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getString$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getString$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_getString$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AppPreferences_Adapter$Endpoint_getString$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
            }

            public Arguments(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            public final String getKey() {
                return this.key;
            }
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getString$Emission;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22893boximpl(String str) {
                return new Emission(str);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static String m22894constructorimpl(String str) {
                return str;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22895equalsimpl(String str, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(str, ((Emission) obj).m22899unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22896equalsimpl0(String str, String str2) {
                return Intrinsics.areEqual(str, str2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22897hashCodeimpl(String str) {
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22898toStringimpl(String str) {
                return "Emission(value=" + str + ")";
            }

            public boolean equals(Object obj) {
                return m22895equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22897hashCodeimpl(this.value);
            }

            public String toString() {
                return m22898toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m22899unboximpl() {
                return this.value;
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getString$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getString$Emission;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return AppPreferences_Adapter$Endpoint_getString$Emission$$serializer.INSTANCE;
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

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getLong;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getLong implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_getLong(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_getLong$call$1 appPreferences_Adapter$Endpoint_getLong$call$1 = new AppPreferences_Adapter$Endpoint_getLong$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, appPreferences_Adapter$Endpoint_getLong$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getLong$Arguments;", "", "seen1", "", "key", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            public final Arguments copy(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.key, ((Arguments) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "Arguments(key=" + this.key + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getLong$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getLong$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_getLong$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AppPreferences_Adapter$Endpoint_getLong$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
            }

            public Arguments(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            public final String getKey() {
                return this.key;
            }
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getLong$Emission;", "", "value", "", "constructor-impl", "(Ljava/lang/Long;)Ljava/lang/Long;", "getValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "equals", "", "other", "equals-impl", "(Ljava/lang/Long;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/Long;)I", "toString", "", "toString-impl", "(Ljava/lang/Long;)Ljava/lang/String;", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Long value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22886boximpl(Long l) {
                return new Emission(l);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static Long m22887constructorimpl(Long l) {
                return l;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22888equalsimpl(Long l, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(l, ((Emission) obj).m22892unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22889equalsimpl0(Long l, Long l2) {
                return Intrinsics.areEqual(l, l2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22890hashCodeimpl(Long l) {
                if (l == null) {
                    return 0;
                }
                return l.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22891toStringimpl(Long l) {
                return "Emission(value=" + l + ")";
            }

            public boolean equals(Object obj) {
                return m22888equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22890hashCodeimpl(this.value);
            }

            public String toString() {
                return m22891toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ Long m22892unboximpl() {
                return this.value;
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getLong$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getLong$Emission;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return AppPreferences_Adapter$Endpoint_getLong$Emission$$serializer.INSTANCE;
                }
            }

            private /* synthetic */ Emission(Long l) {
                this.value = l;
            }

            public final Long getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getDouble;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getDouble implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_getDouble(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_getDouble$call$1 appPreferences_Adapter$Endpoint_getDouble$call$1 = new AppPreferences_Adapter$Endpoint_getDouble$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, appPreferences_Adapter$Endpoint_getDouble$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getDouble$Arguments;", "", "seen1", "", "key", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            public final Arguments copy(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.key, ((Arguments) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "Arguments(key=" + this.key + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getDouble$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getDouble$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_getDouble$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AppPreferences_Adapter$Endpoint_getDouble$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
            }

            public Arguments(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            public final String getKey() {
                return this.key;
            }
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getDouble$Emission;", "", "value", "", "constructor-impl", "(Ljava/lang/Double;)Ljava/lang/Double;", "getValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "equals", "", "other", "equals-impl", "(Ljava/lang/Double;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/Double;)I", "toString", "", "toString-impl", "(Ljava/lang/Double;)Ljava/lang/String;", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Double value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22865boximpl(Double d) {
                return new Emission(d);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static Double m22866constructorimpl(Double d) {
                return d;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22867equalsimpl(Double d, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual((Object) d, (Object) ((Emission) obj).m22871unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22868equalsimpl0(Double d, Double d2) {
                return Intrinsics.areEqual((Object) d, (Object) d2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22869hashCodeimpl(Double d) {
                if (d == null) {
                    return 0;
                }
                return d.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22870toStringimpl(Double d) {
                return "Emission(value=" + d + ")";
            }

            public boolean equals(Object obj) {
                return m22867equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22869hashCodeimpl(this.value);
            }

            public String toString() {
                return m22870toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ Double m22871unboximpl() {
                return this.value;
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getDouble$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getDouble$Emission;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return AppPreferences_Adapter$Endpoint_getDouble$Emission$$serializer.INSTANCE;
                }
            }

            private /* synthetic */ Emission(Double d) {
                this.value = d;
            }

            public final Double getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getInt;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getInt implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_getInt(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_getInt$call$1 appPreferences_Adapter$Endpoint_getInt$call$1 = new AppPreferences_Adapter$Endpoint_getInt$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, appPreferences_Adapter$Endpoint_getInt$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getInt$Arguments;", "", "seen1", "", "key", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            public final Arguments copy(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.key, ((Arguments) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "Arguments(key=" + this.key + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getInt$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getInt$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_getInt$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AppPreferences_Adapter$Endpoint_getInt$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
            }

            public Arguments(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            public final String getKey() {
                return this.key;
            }
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getInt$Emission;", "", "value", "", "constructor-impl", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "equals", "", "other", "equals-impl", "(Ljava/lang/Integer;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "(Ljava/lang/Integer;)I", "toString", "", "toString-impl", "(Ljava/lang/Integer;)Ljava/lang/String;", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Integer value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22879boximpl(Integer num) {
                return new Emission(num);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static Integer m22880constructorimpl(Integer num) {
                return num;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22881equalsimpl(Integer num, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(num, ((Emission) obj).m22885unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22882equalsimpl0(Integer num, Integer num2) {
                return Intrinsics.areEqual(num, num2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22883hashCodeimpl(Integer num) {
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22884toStringimpl(Integer num) {
                return "Emission(value=" + num + ")";
            }

            public boolean equals(Object obj) {
                return m22881equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22883hashCodeimpl(this.value);
            }

            public String toString() {
                return m22884toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ Integer m22885unboximpl() {
                return this.value;
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getInt$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getInt$Emission;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return AppPreferences_Adapter$Endpoint_getInt$Emission$$serializer.INSTANCE;
                }
            }

            private /* synthetic */ Emission(Integer num) {
                this.value = num;
            }

            public final Integer getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getEpochSeconds;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getEpochSeconds implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_getEpochSeconds(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_getEpochSeconds$call$1 appPreferences_Adapter$Endpoint_getEpochSeconds$call$1 = new AppPreferences_Adapter$Endpoint_getEpochSeconds$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, appPreferences_Adapter$Endpoint_getEpochSeconds$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getEpochSeconds$Arguments;", "", "seen1", "", "key", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            public final Arguments copy(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.key, ((Arguments) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "Arguments(key=" + this.key + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getEpochSeconds$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getEpochSeconds$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C34944xf2f479e3.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C34944xf2f479e3.INSTANCE.getDescriptor());
                }
                this.key = str;
            }

            public Arguments(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            public final String getKey() {
                return this.key;
            }
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getEpochSeconds$Emission;", "", "value", "", "constructor-impl", "(Ljava/lang/Long;)Ljava/lang/Long;", "getValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "equals", "", "other", "equals-impl", "(Ljava/lang/Long;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/Long;)I", "toString", "", "toString-impl", "(Ljava/lang/Long;)Ljava/lang/String;", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Long value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22872boximpl(Long l) {
                return new Emission(l);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static Long m22873constructorimpl(Long l) {
                return l;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22874equalsimpl(Long l, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(l, ((Emission) obj).m22878unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22875equalsimpl0(Long l, Long l2) {
                return Intrinsics.areEqual(l, l2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22876hashCodeimpl(Long l) {
                if (l == null) {
                    return 0;
                }
                return l.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22877toStringimpl(Long l) {
                return "Emission(value=" + l + ")";
            }

            public boolean equals(Object obj) {
                return m22874equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22876hashCodeimpl(this.value);
            }

            public String toString() {
                return m22877toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ Long m22878unboximpl() {
                return this.value;
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getEpochSeconds$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_getEpochSeconds$Emission;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C34945xa8da2a3e.INSTANCE;
                }
            }

            private /* synthetic */ Emission(Long l) {
                this.value = l;
            }

            public final Long getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setBool;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_setBool implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_setBool(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_setBool$call$1 appPreferences_Adapter$Endpoint_setBool$call$1 = new AppPreferences_Adapter$Endpoint_setBool$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, appPreferences_Adapter$Endpoint_setBool$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setBool$Arguments;", "", "seen1", "", "key", "", "value", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getValue", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;
            private final boolean value;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                if ((i & 2) != 0) {
                    z = arguments.value;
                }
                return arguments.copy(str, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final Arguments copy(String key, boolean value) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.key, arguments.key) && this.value == arguments.value;
            }

            public int hashCode() {
                return (this.key.hashCode() * 31) + Boolean.hashCode(this.value);
            }

            public String toString() {
                return "Arguments(key=" + this.key + ", value=" + this.value + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setBool$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setBool$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_setBool$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AppPreferences_Adapter$Endpoint_setBool$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
                this.value = z;
            }

            public Arguments(String key, boolean z) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
                this.value = z;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_common_services(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.key);
                output.encodeBooleanElement(serialDesc, 1, self.value);
            }

            public final String getKey() {
                return this.key;
            }

            public final boolean getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setString;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_setString implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_setString(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_setString$call$1 appPreferences_Adapter$Endpoint_setString$call$1 = new AppPreferences_Adapter$Endpoint_setString$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, appPreferences_Adapter$Endpoint_setString$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setString$Arguments;", "", "seen1", "", "key", "", "value", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;
            private final String value;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                if ((i & 2) != 0) {
                    str2 = arguments.value;
                }
                return arguments.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final Arguments copy(String key, String value) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                return new Arguments(key, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.key, arguments.key) && Intrinsics.areEqual(this.value, arguments.value);
            }

            public int hashCode() {
                return (this.key.hashCode() * 31) + this.value.hashCode();
            }

            public String toString() {
                return "Arguments(key=" + this.key + ", value=" + this.value + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setString$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setString$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_setString$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AppPreferences_Adapter$Endpoint_setString$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
                this.value = str2;
            }

            public Arguments(String key, String value) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                this.key = key;
                this.value = value;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_common_services(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.key);
                output.encodeStringElement(serialDesc, 1, self.value);
            }

            public final String getKey() {
                return this.key;
            }

            public final String getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setLong;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_setLong implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_setLong(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_setLong$call$1 appPreferences_Adapter$Endpoint_setLong$call$1 = new AppPreferences_Adapter$Endpoint_setLong$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, appPreferences_Adapter$Endpoint_setLong$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setLong$Arguments;", "", "seen1", "", "key", "", "value", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;J)V", "getKey", "()Ljava/lang/String;", "getValue", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;
            private final long value;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                if ((i & 2) != 0) {
                    j = arguments.value;
                }
                return arguments.copy(str, j);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final long getValue() {
                return this.value;
            }

            public final Arguments copy(String key, long value) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.key, arguments.key) && this.value == arguments.value;
            }

            public int hashCode() {
                return (this.key.hashCode() * 31) + Long.hashCode(this.value);
            }

            public String toString() {
                return "Arguments(key=" + this.key + ", value=" + this.value + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setLong$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setLong$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_setLong$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, long j, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AppPreferences_Adapter$Endpoint_setLong$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
                this.value = j;
            }

            public Arguments(String key, long j) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
                this.value = j;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_common_services(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.key);
                output.encodeLongElement(serialDesc, 1, self.value);
            }

            public final String getKey() {
                return this.key;
            }

            public final long getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setDouble;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_setDouble implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_setDouble(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_setDouble$call$1 appPreferences_Adapter$Endpoint_setDouble$call$1 = new AppPreferences_Adapter$Endpoint_setDouble$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, appPreferences_Adapter$Endpoint_setDouble$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setDouble$Arguments;", "", "seen1", "", "key", "", "value", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;D)V", "getKey", "()Ljava/lang/String;", "getValue", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;
            private final double value;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                if ((i & 2) != 0) {
                    d = arguments.value;
                }
                return arguments.copy(str, d);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final double getValue() {
                return this.value;
            }

            public final Arguments copy(String key, double value) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.key, arguments.key) && Double.compare(this.value, arguments.value) == 0;
            }

            public int hashCode() {
                return (this.key.hashCode() * 31) + Double.hashCode(this.value);
            }

            public String toString() {
                return "Arguments(key=" + this.key + ", value=" + this.value + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setDouble$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setDouble$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_setDouble$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, double d, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AppPreferences_Adapter$Endpoint_setDouble$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
                this.value = d;
            }

            public Arguments(String key, double d) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
                this.value = d;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_common_services(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.key);
                output.encodeDoubleElement(serialDesc, 1, self.value);
            }

            public final String getKey() {
                return this.key;
            }

            public final double getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setInt;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_setInt implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_setInt(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_setInt$call$1 appPreferences_Adapter$Endpoint_setInt$call$1 = new AppPreferences_Adapter$Endpoint_setInt$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, appPreferences_Adapter$Endpoint_setInt$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setInt$Arguments;", "", "seen1", "", "key", "", "value", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;I)V", "getKey", "()Ljava/lang/String;", "getValue", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;
            private final int value;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = arguments.key;
                }
                if ((i2 & 2) != 0) {
                    i = arguments.value;
                }
                return arguments.copy(str, i);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            public final Arguments copy(String key, int value) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.key, arguments.key) && this.value == arguments.value;
            }

            public int hashCode() {
                return (this.key.hashCode() * 31) + Integer.hashCode(this.value);
            }

            public String toString() {
                return "Arguments(key=" + this.key + ", value=" + this.value + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setInt$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setInt$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_setInt$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, AppPreferences_Adapter$Endpoint_setInt$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
                this.value = i2;
            }

            public Arguments(String key, int i) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
                this.value = i;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_common_services(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.key);
                output.encodeIntElement(serialDesc, 1, self.value);
            }

            public final String getKey() {
                return this.key;
            }

            public final int getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setEpochSeconds;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_setEpochSeconds implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_setEpochSeconds(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_setEpochSeconds$call$1 appPreferences_Adapter$Endpoint_setEpochSeconds$call$1 = new AppPreferences_Adapter$Endpoint_setEpochSeconds$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, appPreferences_Adapter$Endpoint_setEpochSeconds$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B+\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setEpochSeconds$Arguments;", "", "seen1", "", "key", "", "value", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;J)V", "getKey", "()Ljava/lang/String;", "getValue", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;
            private final long value;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                if ((i & 2) != 0) {
                    j = arguments.value;
                }
                return arguments.copy(str, j);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final long getValue() {
                return this.value;
            }

            public final Arguments copy(String key, long value) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.key, arguments.key) && this.value == arguments.value;
            }

            public int hashCode() {
                return (this.key.hashCode() * 31) + Long.hashCode(this.value);
            }

            public String toString() {
                return "Arguments(key=" + this.key + ", value=" + this.value + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setEpochSeconds$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_setEpochSeconds$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C34946xded263ef.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, long j, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C34946xded263ef.INSTANCE.getDescriptor());
                }
                this.key = str;
                this.value = j;
            }

            public Arguments(String key, long j) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
                this.value = j;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$microgram_common_services(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.key);
                output.encodeLongElement(serialDesc, 1, self.value);
            }

            public final String getKey() {
                return this.key;
            }

            public final long getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: AppPreferences_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_deleteKey;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/microgram/apppreferences/AppPreferences;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/microgram/apppreferences/AppPreferences;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_deleteKey implements ServiceCallable {
        private final Json json;
        private final AppPreferences service;

        public Endpoint_deleteKey(AppPreferences service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            AppPreferences_Adapter$Endpoint_deleteKey$call$1 appPreferences_Adapter$Endpoint_deleteKey$call$1 = new AppPreferences_Adapter$Endpoint_deleteKey$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, appPreferences_Adapter$Endpoint_deleteKey$call$1);
        }

        /* compiled from: AppPreferences_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_deleteKey$Arguments;", "", "seen1", "", "key", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$microgram_common_services", "$serializer", "Companion", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String key;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.key;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            public final Arguments copy(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new Arguments(key);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.key, ((Arguments) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "Arguments(key=" + this.key + ")";
            }

            /* compiled from: AppPreferences_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_deleteKey$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/apppreferences/AppPreferences_Adapter$Endpoint_deleteKey$Arguments;", "microgram-common-services"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return AppPreferences_Adapter$Endpoint_deleteKey$Arguments$$serializer.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, AppPreferences_Adapter$Endpoint_deleteKey$Arguments$$serializer.INSTANCE.getDescriptor());
                }
                this.key = str;
            }

            public Arguments(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.key = key;
            }

            public final String getKey() {
                return this.key;
            }
        }
    }
}
