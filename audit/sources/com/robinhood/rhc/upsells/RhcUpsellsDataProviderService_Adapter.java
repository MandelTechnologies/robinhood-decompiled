package com.robinhood.rhc.upsells;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmField;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
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

/* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\t)*+,-./01B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\rJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0096@¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eH\u0096@¢\u0006\u0004\b\u001f\u0010\u0010J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b$\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(¨\u00062"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "rewardId", "", "hasSeenRewardConfirmation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "rewardsSeen", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "markRewardConfirmationSeen", "Lcom/robinhood/rhc/upsells/SeenUpsell;", "getSeenUpsells", "seenUpsell", "markUpsellAsSeen", "(Lcom/robinhood/rhc/upsells/SeenUpsell;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currencyCode", "amount", "", "minimumFractionDigits", "formatMoney", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/rhc/upsells/CryptoOrder;", "getCryptoOrders", "Lcom/robinhood/rhc/upsells/TouchPoint;", "touchPoint", "upsellsSeenAtTouchPointThisSession", "(Lcom/robinhood/rhc/upsells/TouchPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markUpsellSeenAtTouchPointThisSession", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_formatMoney", "Endpoint_getSeenUpsells", "Endpoint_hasSeenRewardConfirmation", "Endpoint_markRewardConfirmationSeen", "Endpoint_markUpsellAsSeen", "Endpoint_markUpsellSeenAtTouchPointThisSession", "Endpoint_rewardsSeen", "Endpoint_streamCryptoOrders", "Endpoint_upsellsSeenAtTouchPointThisSession", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
final class RhcUpsellsDataProviderService_Adapter implements RhcUpsellsDataProviderService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter", m3645f = "RhcUpsellsDataProviderService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "formatMoney")
    /* renamed from: com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter$formatMoney$1 */
    static final class C361911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361911(Continuation<? super C361911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhcUpsellsDataProviderService_Adapter.this.formatMoney(null, null, null, this);
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter", m3645f = "RhcUpsellsDataProviderService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "getCryptoOrders")
    /* renamed from: com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter$getCryptoOrders$1 */
    static final class C361921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361921(Continuation<? super C361921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhcUpsellsDataProviderService_Adapter.this.getCryptoOrders(this);
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter", m3645f = "RhcUpsellsDataProviderService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "getSeenUpsells")
    /* renamed from: com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter$getSeenUpsells$1 */
    static final class C361931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361931(Continuation<? super C361931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhcUpsellsDataProviderService_Adapter.this.getSeenUpsells(this);
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter", m3645f = "RhcUpsellsDataProviderService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "hasSeenRewardConfirmation")
    /* renamed from: com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter$hasSeenRewardConfirmation$1 */
    static final class C361941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361941(Continuation<? super C361941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhcUpsellsDataProviderService_Adapter.this.hasSeenRewardConfirmation(null, this);
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter", m3645f = "RhcUpsellsDataProviderService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "rewardsSeen")
    /* renamed from: com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter$rewardsSeen$1 */
    static final class C361951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361951(Continuation<? super C361951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhcUpsellsDataProviderService_Adapter.this.rewardsSeen(this);
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter", m3645f = "RhcUpsellsDataProviderService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "upsellsSeenAtTouchPointThisSession")
    /* renamed from: com.robinhood.rhc.upsells.RhcUpsellsDataProviderService_Adapter$upsellsSeenAtTouchPointThisSession$1 */
    static final class C361961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C361961(Continuation<? super C361961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhcUpsellsDataProviderService_Adapter.this.upsellsSeenAtTouchPointThisSession(null, this);
        }
    }

    public RhcUpsellsDataProviderService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.rhc.upsells.RhcUpsellsDataProviderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object hasSeenRewardConfirmation(String str, Continuation<? super Boolean> continuation) throws IOException {
        C361941 c361941;
        if (continuation instanceof C361941) {
            c361941 = (C361941) continuation;
            int i = c361941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361941.label = i - Integer.MIN_VALUE;
            } else {
                c361941 = new C361941(continuation);
            }
        }
        C361941 c3619412 = c361941;
        Object objCallSuspendFunction = c3619412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3619412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_hasSeenRewardConfirmation.Arguments arguments = new Endpoint_hasSeenRewardConfirmation.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_hasSeenRewardConfirmation.Arguments> kSerializerSerializer = Endpoint_hasSeenRewardConfirmation.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_hasSeenRewardConfirmation.Emission> kSerializerSerializer2 = Endpoint_hasSeenRewardConfirmation.Emission.INSTANCE.serializer();
            c3619412.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "hasSeenRewardConfirmation", arguments, c3619412);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return boxing.boxBoolean(((Endpoint_hasSeenRewardConfirmation.Emission) objCallSuspendFunction).m23911unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.rhc.upsells.RhcUpsellsDataProviderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rewardsSeen(Continuation<? super List<String>> continuation) throws IOException {
        C361951 c361951;
        if (continuation instanceof C361951) {
            c361951 = (C361951) continuation;
            int i = c361951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361951.label = i - Integer.MIN_VALUE;
            } else {
                c361951 = new C361951(continuation);
            }
        }
        C361951 c3619512 = c361951;
        Object objCallSuspendFunction = c3619512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3619512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Unit unit = Unit.INSTANCE;
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            KSerializer<Endpoint_rewardsSeen.Emission> kSerializerSerializer = Endpoint_rewardsSeen.Emission.INSTANCE.serializer();
            c3619512.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, kSerializerSerializer, "rewardsSeen", unit, c3619512);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_rewardsSeen.Emission) objCallSuspendFunction).getValue();
    }

    @Override // com.robinhood.rhc.upsells.RhcUpsellsDataProviderService
    public Object markRewardConfirmationSeen(String str, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_markRewardConfirmationSeen.Arguments arguments = new Endpoint_markRewardConfirmationSeen.Arguments(str);
        json.getSerializersModule();
        KSerializer<Endpoint_markRewardConfirmationSeen.Arguments> kSerializerSerializer = Endpoint_markRewardConfirmationSeen.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "markRewardConfirmationSeen", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.rhc.upsells.RhcUpsellsDataProviderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSeenUpsells(Continuation<? super List<SeenUpsell>> continuation) throws IOException {
        C361931 c361931;
        if (continuation instanceof C361931) {
            c361931 = (C361931) continuation;
            int i = c361931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361931.label = i - Integer.MIN_VALUE;
            } else {
                c361931 = new C361931(continuation);
            }
        }
        C361931 c3619312 = c361931;
        Object objCallSuspendFunction = c3619312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3619312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Unit unit = Unit.INSTANCE;
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            KSerializer<Endpoint_getSeenUpsells.Emission> kSerializerSerializer = Endpoint_getSeenUpsells.Emission.INSTANCE.serializer();
            c3619312.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, kSerializerSerializer, "getSeenUpsells", unit, c3619312);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getSeenUpsells.Emission) objCallSuspendFunction).getValue();
    }

    @Override // com.robinhood.rhc.upsells.RhcUpsellsDataProviderService
    public Object markUpsellAsSeen(SeenUpsell seenUpsell, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_markUpsellAsSeen.Arguments arguments = new Endpoint_markUpsellAsSeen.Arguments(seenUpsell);
        json.getSerializersModule();
        KSerializer<Endpoint_markUpsellAsSeen.Arguments> kSerializerSerializer = Endpoint_markUpsellAsSeen.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "markUpsellAsSeen", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.rhc.upsells.RhcUpsellsDataProviderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object formatMoney(String str, String str2, Integer num, Continuation<? super String> continuation) throws IOException {
        C361911 c361911;
        if (continuation instanceof C361911) {
            c361911 = (C361911) continuation;
            int i = c361911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361911.label = i - Integer.MIN_VALUE;
            } else {
                c361911 = new C361911(continuation);
            }
        }
        C361911 c3619112 = c361911;
        Object objCallSuspendFunction = c3619112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3619112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_formatMoney.Arguments arguments = new Endpoint_formatMoney.Arguments(str, str2, num);
            json.getSerializersModule();
            KSerializer<Endpoint_formatMoney.Arguments> kSerializerSerializer = Endpoint_formatMoney.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_formatMoney.Emission> kSerializerSerializer2 = Endpoint_formatMoney.Emission.INSTANCE.serializer();
            c3619112.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "formatMoney", arguments, c3619112);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_formatMoney.Emission) objCallSuspendFunction).m23897unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.rhc.upsells.RhcUpsellsDataProviderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCryptoOrders(Continuation<? super List<CryptoOrder>> continuation) throws IOException {
        C361921 c361921;
        if (continuation instanceof C361921) {
            c361921 = (C361921) continuation;
            int i = c361921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361921.label = i - Integer.MIN_VALUE;
            } else {
                c361921 = new C361921(continuation);
            }
        }
        C361921 c3619212 = c361921;
        Object objCallSuspendFunction = c3619212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3619212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Unit unit = Unit.INSTANCE;
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            KSerializer<Endpoint_streamCryptoOrders.Emission> kSerializerSerializer = Endpoint_streamCryptoOrders.Emission.INSTANCE.serializer();
            c3619212.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, kSerializerSerializer, "streamCryptoOrders", unit, c3619212);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_streamCryptoOrders.Emission) objCallSuspendFunction).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.rhc.upsells.RhcUpsellsDataProviderService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object upsellsSeenAtTouchPointThisSession(TouchPoint touchPoint, Continuation<? super Integer> continuation) throws IOException {
        C361961 c361961;
        if (continuation instanceof C361961) {
            c361961 = (C361961) continuation;
            int i = c361961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361961.label = i - Integer.MIN_VALUE;
            } else {
                c361961 = new C361961(continuation);
            }
        }
        C361961 c3619612 = c361961;
        Object objCallSuspendFunction = c3619612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3619612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_upsellsSeenAtTouchPointThisSession.Arguments arguments = new Endpoint_upsellsSeenAtTouchPointThisSession.Arguments(touchPoint);
            json.getSerializersModule();
            KSerializer<Endpoint_upsellsSeenAtTouchPointThisSession.Arguments> kSerializerSerializer = Endpoint_upsellsSeenAtTouchPointThisSession.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_upsellsSeenAtTouchPointThisSession.Emission> kSerializerSerializer2 = Endpoint_upsellsSeenAtTouchPointThisSession.Emission.INSTANCE.serializer();
            c3619612.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "upsellsSeenAtTouchPointThisSession", arguments, c3619612);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return boxing.boxInt(((Endpoint_upsellsSeenAtTouchPointThisSession.Emission) objCallSuspendFunction).m23932unboximpl());
    }

    @Override // com.robinhood.rhc.upsells.RhcUpsellsDataProviderService
    public Object markUpsellSeenAtTouchPointThisSession(TouchPoint touchPoint, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_markUpsellSeenAtTouchPointThisSession.Arguments arguments = new Endpoint_markUpsellSeenAtTouchPointThisSession.Arguments(touchPoint);
        json.getSerializersModule();
        KSerializer<Endpoint_markUpsellSeenAtTouchPointThisSession.Arguments> kSerializerSerializer = Endpoint_markUpsellSeenAtTouchPointThisSession.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "markUpsellSeenAtTouchPointThisSession", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_hasSeenRewardConfirmation;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_hasSeenRewardConfirmation implements ServiceCallable {
        private final Json json;
        private final RhcUpsellsDataProviderService service;

        public Endpoint_hasSeenRewardConfirmation(RhcUpsellsDataProviderService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C36184x5b1aa74d c36184x5b1aa74d = new C36184x5b1aa74d(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c36184x5b1aa74d);
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_hasSeenRewardConfirmation$Arguments;", "", "seen1", "", "rewardId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getRewardId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String rewardId;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.rewardId;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getRewardId() {
                return this.rewardId;
            }

            public final Arguments copy(String rewardId) {
                Intrinsics.checkNotNullParameter(rewardId, "rewardId");
                return new Arguments(rewardId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.rewardId, ((Arguments) other).rewardId);
            }

            public int hashCode() {
                return this.rewardId.hashCode();
            }

            public String toString() {
                return "Arguments(rewardId=" + this.rewardId + ")";
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_hasSeenRewardConfirmation$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_hasSeenRewardConfirmation$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C36173x35b20a26.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C36173x35b20a26.INSTANCE.getDescriptor());
                }
                this.rewardId = str;
            }

            public Arguments(String rewardId) {
                Intrinsics.checkNotNullParameter(rewardId, "rewardId");
                this.rewardId = rewardId;
            }

            public final String getRewardId() {
                return this.rewardId;
            }
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_hasSeenRewardConfirmation$Emission;", "", "value", "", "constructor-impl", "(Z)Z", "getValue", "()Z", "equals", "other", "equals-impl", "(ZLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Z)I", "toString", "", "toString-impl", "(Z)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23905boximpl(boolean z) {
                return new Emission(z);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static boolean m23906constructorimpl(boolean z) {
                return z;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23907equalsimpl(boolean z, Object obj) {
                return (obj instanceof Emission) && z == ((Emission) obj).m23911unboximpl();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23908equalsimpl0(boolean z, boolean z2) {
                return z == z2;
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23909hashCodeimpl(boolean z) {
                return Boolean.hashCode(z);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23910toStringimpl(boolean z) {
                return "Emission(value=" + z + ")";
            }

            public boolean equals(Object obj) {
                return m23907equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23909hashCodeimpl(this.value);
            }

            public String toString() {
                return m23910toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ boolean m23911unboximpl() {
                return this.value;
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_hasSeenRewardConfirmation$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_hasSeenRewardConfirmation$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C36174x5d8059b.INSTANCE;
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

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_rewardsSeen;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_rewardsSeen implements ServiceCallable {
        private final Json json;
        private final RhcUpsellsDataProviderService service;

        public Endpoint_rewardsSeen(RhcUpsellsDataProviderService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C36188x2cbb727 c36188x2cbb727 = new C36188x2cbb727(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, Emission.INSTANCE.serializer(), body, c36188x2cbb727);
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_rewardsSeen$Emission;", "", "value", "", "", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getValue", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {
            private final List<String> value;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23912boximpl(List list) {
                return new Emission(list);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends String> m23913constructorimpl(List<String> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23914equalsimpl(List<? extends String> list, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(list, ((Emission) obj).getValue());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23915equalsimpl0(List<? extends String> list, List<? extends String> list2) {
                return Intrinsics.areEqual(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23916hashCodeimpl(List<? extends String> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23917toStringimpl(List<? extends String> list) {
                return "Emission(value=" + list + ")";
            }

            public boolean equals(Object obj) {
                return m23914equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23916hashCodeimpl(this.value);
            }

            public String toString() {
                return m23917toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getValue() {
                return this.value;
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_rewardsSeen$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_rewardsSeen$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C36178x43db4ff5.INSTANCE;
                }
            }

            private /* synthetic */ Emission(List list) {
                this.value = list;
            }

            public final List<String> getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markRewardConfirmationSeen;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_markRewardConfirmationSeen implements ServiceCallable {
        private final Json json;
        private final RhcUpsellsDataProviderService service;

        public Endpoint_markRewardConfirmationSeen(RhcUpsellsDataProviderService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C36185x575ec62c c36185x575ec62c = new C36185x575ec62c(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c36185x575ec62c);
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019HÁ\u0001¢\u0006\u0002\b\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markRewardConfirmationSeen$Arguments;", "", "seen1", "", "rewardId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getRewardId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String rewardId;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.rewardId;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getRewardId() {
                return this.rewardId;
            }

            public final Arguments copy(String rewardId) {
                Intrinsics.checkNotNullParameter(rewardId, "rewardId");
                return new Arguments(rewardId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.rewardId, ((Arguments) other).rewardId);
            }

            public int hashCode() {
                return this.rewardId.hashCode();
            }

            public String toString() {
                return "Arguments(rewardId=" + this.rewardId + ")";
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markRewardConfirmationSeen$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markRewardConfirmationSeen$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C36175x3efe7167.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C36175x3efe7167.INSTANCE.getDescriptor());
                }
                this.rewardId = str;
            }

            public Arguments(String rewardId) {
                Intrinsics.checkNotNullParameter(rewardId, "rewardId");
                this.rewardId = rewardId;
            }

            public final String getRewardId() {
                return this.rewardId;
            }
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_getSeenUpsells;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getSeenUpsells implements ServiceCallable {
        private final Json json;
        private final RhcUpsellsDataProviderService service;

        public Endpoint_getSeenUpsells(RhcUpsellsDataProviderService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C36183x2bfd52e3 c36183x2bfd52e3 = new C36183x2bfd52e3(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, Emission.INSTANCE.serializer(), body, c36183x2bfd52e3);
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_getSeenUpsells$Emission;", "", "value", "", "Lcom/robinhood/rhc/upsells/SeenUpsell;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getValue", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {
            private final List<SeenUpsell> value;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SeenUpsell2.INSTANCE)};

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23898boximpl(List list) {
                return new Emission(list);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends SeenUpsell> m23899constructorimpl(List<SeenUpsell> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23900equalsimpl(List<? extends SeenUpsell> list, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(list, ((Emission) obj).getValue());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23901equalsimpl0(List<? extends SeenUpsell> list, List<? extends SeenUpsell> list2) {
                return Intrinsics.areEqual(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23902hashCodeimpl(List<? extends SeenUpsell> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23903toStringimpl(List<? extends SeenUpsell> list) {
                return "Emission(value=" + list + ")";
            }

            public boolean equals(Object obj) {
                return m23900equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23902hashCodeimpl(this.value);
            }

            public String toString() {
                return m23903toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getValue() {
                return this.value;
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_getSeenUpsells$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_getSeenUpsells$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C36172xd9c3b2b1.INSTANCE;
                }
            }

            private /* synthetic */ Emission(List list) {
                this.value = list;
            }

            public final List<SeenUpsell> getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markUpsellAsSeen;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_markUpsellAsSeen implements ServiceCallable {
        private final Json json;
        private final RhcUpsellsDataProviderService service;

        public Endpoint_markUpsellAsSeen(RhcUpsellsDataProviderService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C36186x490195d1 c36186x490195d1 = new C36186x490195d1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c36186x490195d1);
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markUpsellAsSeen$Arguments;", "", "seen1", "", "seenUpsell", "Lcom/robinhood/rhc/upsells/SeenUpsell;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rhc/upsells/SeenUpsell;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/rhc/upsells/SeenUpsell;)V", "getSeenUpsell", "()Lcom/robinhood/rhc/upsells/SeenUpsell;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final SeenUpsell seenUpsell;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, SeenUpsell seenUpsell, int i, Object obj) {
                if ((i & 1) != 0) {
                    seenUpsell = arguments.seenUpsell;
                }
                return arguments.copy(seenUpsell);
            }

            /* renamed from: component1, reason: from getter */
            public final SeenUpsell getSeenUpsell() {
                return this.seenUpsell;
            }

            public final Arguments copy(SeenUpsell seenUpsell) {
                Intrinsics.checkNotNullParameter(seenUpsell, "seenUpsell");
                return new Arguments(seenUpsell);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.seenUpsell, ((Arguments) other).seenUpsell);
            }

            public int hashCode() {
                return this.seenUpsell.hashCode();
            }

            public String toString() {
                return "Arguments(seenUpsell=" + this.seenUpsell + ")";
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markUpsellAsSeen$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markUpsellAsSeen$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C36176xea87c322.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, SeenUpsell seenUpsell, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C36176xea87c322.INSTANCE.getDescriptor());
                }
                this.seenUpsell = seenUpsell;
            }

            public Arguments(SeenUpsell seenUpsell) {
                Intrinsics.checkNotNullParameter(seenUpsell, "seenUpsell");
                this.seenUpsell = seenUpsell;
            }

            public final SeenUpsell getSeenUpsell() {
                return this.seenUpsell;
            }
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_formatMoney implements ServiceCallable {
        private final Json json;
        private final RhcUpsellsDataProviderService service;

        public Endpoint_formatMoney(RhcUpsellsDataProviderService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C36182xdb645c9d c36182xdb645c9d = new C36182xdb645c9d(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c36182xdb645c9d);
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$Arguments;", "", "seen1", "", "currencyCode", "", "amount", "minimumFractionDigits", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAmount", "()Ljava/lang/String;", "getCurrencyCode", "getMinimumFractionDigits", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$Arguments;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String amount;
            private final String currencyCode;
            private final Integer minimumFractionDigits;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, String str2, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.currencyCode;
                }
                if ((i & 2) != 0) {
                    str2 = arguments.amount;
                }
                if ((i & 4) != 0) {
                    num = arguments.minimumFractionDigits;
                }
                return arguments.copy(str, str2, num);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCurrencyCode() {
                return this.currencyCode;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAmount() {
                return this.amount;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getMinimumFractionDigits() {
                return this.minimumFractionDigits;
            }

            public final Arguments copy(String currencyCode, String amount, Integer minimumFractionDigits) {
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                Intrinsics.checkNotNullParameter(amount, "amount");
                return new Arguments(currencyCode, amount, minimumFractionDigits);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.currencyCode, arguments.currencyCode) && Intrinsics.areEqual(this.amount, arguments.amount) && Intrinsics.areEqual(this.minimumFractionDigits, arguments.minimumFractionDigits);
            }

            public int hashCode() {
                int iHashCode = ((this.currencyCode.hashCode() * 31) + this.amount.hashCode()) * 31;
                Integer num = this.minimumFractionDigits;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            public String toString() {
                return "Arguments(currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", minimumFractionDigits=" + this.minimumFractionDigits + ")";
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C36170x99bd0ad6.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, String str2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptions.throwMissingFieldException(i, 7, C36170x99bd0ad6.INSTANCE.getDescriptor());
                }
                this.currencyCode = str;
                this.amount = str2;
                this.minimumFractionDigits = num;
            }

            public Arguments(String currencyCode, String amount, Integer num) {
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.currencyCode = currencyCode;
                this.amount = amount;
                this.minimumFractionDigits = num;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.currencyCode);
                output.encodeStringElement(serialDesc, 1, self.amount);
                output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.minimumFractionDigits);
            }

            public final String getCurrencyCode() {
                return this.currencyCode;
            }

            public final String getAmount() {
                return this.amount;
            }

            public final Integer getMinimumFractionDigits() {
                return this.minimumFractionDigits;
            }
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$Emission;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23891boximpl(String str) {
                return new Emission(str);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static String m23892constructorimpl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23893equalsimpl(String str, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(str, ((Emission) obj).m23897unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23894equalsimpl0(String str, String str2) {
                return Intrinsics.areEqual(str, str2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23895hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23896toStringimpl(String str) {
                return "Emission(value=" + str + ")";
            }

            public boolean equals(Object obj) {
                return m23893equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23895hashCodeimpl(this.value);
            }

            public String toString() {
                return m23896toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m23897unboximpl() {
                return this.value;
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_formatMoney$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C36171x9122eeb.INSTANCE;
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

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_streamCryptoOrders;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_streamCryptoOrders implements ServiceCallable {
        private final Json json;
        private final RhcUpsellsDataProviderService service;

        public Endpoint_streamCryptoOrders(RhcUpsellsDataProviderService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C36189x7dae7412 c36189x7dae7412 = new C36189x7dae7412(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, Emission.INSTANCE.serializer(), body, c36189x7dae7412);
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_streamCryptoOrders$Emission;", "", "value", "", "Lcom/robinhood/rhc/upsells/CryptoOrder;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getValue", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {
            private final List<CryptoOrder> value;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CryptoOrder8.INSTANCE)};

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23919boximpl(List list) {
                return new Emission(list);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends CryptoOrder> m23920constructorimpl(List<CryptoOrder> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23921equalsimpl(List<? extends CryptoOrder> list, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(list, ((Emission) obj).getValue());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23922equalsimpl0(List<? extends CryptoOrder> list, List<? extends CryptoOrder> list2) {
                return Intrinsics.areEqual(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23923hashCodeimpl(List<? extends CryptoOrder> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23924toStringimpl(List<? extends CryptoOrder> list) {
                return "Emission(value=" + list + ")";
            }

            public boolean equals(Object obj) {
                return m23921equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23923hashCodeimpl(this.value);
            }

            public String toString() {
                return m23924toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getValue() {
                return this.value;
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_streamCryptoOrders$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_streamCryptoOrders$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C36179xa9af95a0.INSTANCE;
                }
            }

            private /* synthetic */ Emission(List list) {
                this.value = list;
            }

            public final List<CryptoOrder> getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_upsellsSeenAtTouchPointThisSession;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_upsellsSeenAtTouchPointThisSession implements ServiceCallable {
        private final Json json;
        private final RhcUpsellsDataProviderService service;

        public Endpoint_upsellsSeenAtTouchPointThisSession(RhcUpsellsDataProviderService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C36190xf3847d45 c36190xf3847d45 = new C36190xf3847d45(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c36190xf3847d45);
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_upsellsSeenAtTouchPointThisSession$Arguments;", "", "seen1", "", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rhc/upsells/TouchPoint;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/rhc/upsells/TouchPoint;)V", "getTouchPoint", "()Lcom/robinhood/rhc/upsells/TouchPoint;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final TouchPoint touchPoint;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {TouchPoint.INSTANCE.serializer()};

            public static /* synthetic */ Arguments copy$default(Arguments arguments, TouchPoint touchPoint, int i, Object obj) {
                if ((i & 1) != 0) {
                    touchPoint = arguments.touchPoint;
                }
                return arguments.copy(touchPoint);
            }

            /* renamed from: component1, reason: from getter */
            public final TouchPoint getTouchPoint() {
                return this.touchPoint;
            }

            public final Arguments copy(TouchPoint touchPoint) {
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                return new Arguments(touchPoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && this.touchPoint == ((Arguments) other).touchPoint;
            }

            public int hashCode() {
                return this.touchPoint.hashCode();
            }

            public String toString() {
                return "Arguments(touchPoint=" + this.touchPoint + ")";
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_upsellsSeenAtTouchPointThisSession$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_upsellsSeenAtTouchPointThisSession$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C36180x8112852e.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, TouchPoint touchPoint, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C36180x8112852e.INSTANCE.getDescriptor());
                }
                this.touchPoint = touchPoint;
            }

            public Arguments(TouchPoint touchPoint) {
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                this.touchPoint = touchPoint;
            }

            public final TouchPoint getTouchPoint() {
                return this.touchPoint;
            }
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_upsellsSeenAtTouchPointThisSession$Emission;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final int value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23926boximpl(int i) {
                return new Emission(i);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static int m23927constructorimpl(int i) {
                return i;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23928equalsimpl(int i, Object obj) {
                return (obj instanceof Emission) && i == ((Emission) obj).m23932unboximpl();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23929equalsimpl0(int i, int i2) {
                return i == i2;
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23930hashCodeimpl(int i) {
                return Integer.hashCode(i);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23931toStringimpl(int i) {
                return "Emission(value=" + i + ")";
            }

            public boolean equals(Object obj) {
                return m23928equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23930hashCodeimpl(this.value);
            }

            public String toString() {
                return m23931toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ int m23932unboximpl() {
                return this.value;
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_upsellsSeenAtTouchPointThisSession$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_upsellsSeenAtTouchPointThisSession$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C36181xce780993.INSTANCE;
                }
            }

            private /* synthetic */ Emission(int i) {
                this.value = i;
            }

            public final int getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markUpsellSeenAtTouchPointThisSession;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_markUpsellSeenAtTouchPointThisSession implements ServiceCallable {
        private final Json json;
        private final RhcUpsellsDataProviderService service;

        public Endpoint_markUpsellSeenAtTouchPointThisSession(RhcUpsellsDataProviderService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C36187x378adc7 c36187x378adc7 = new C36187x378adc7(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c36187x378adc7);
        }

        /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markUpsellSeenAtTouchPointThisSession$Arguments;", "", "seen1", "", "touchPoint", "Lcom/robinhood/rhc/upsells/TouchPoint;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rhc/upsells/TouchPoint;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/rhc/upsells/TouchPoint;)V", "getTouchPoint", "()Lcom/robinhood/rhc/upsells/TouchPoint;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final TouchPoint touchPoint;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {TouchPoint.INSTANCE.serializer()};

            public static /* synthetic */ Arguments copy$default(Arguments arguments, TouchPoint touchPoint, int i, Object obj) {
                if ((i & 1) != 0) {
                    touchPoint = arguments.touchPoint;
                }
                return arguments.copy(touchPoint);
            }

            /* renamed from: component1, reason: from getter */
            public final TouchPoint getTouchPoint() {
                return this.touchPoint;
            }

            public final Arguments copy(TouchPoint touchPoint) {
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                return new Arguments(touchPoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && this.touchPoint == ((Arguments) other).touchPoint;
            }

            public int hashCode() {
                return this.touchPoint.hashCode();
            }

            public String toString() {
                return "Arguments(touchPoint=" + this.touchPoint + ")";
            }

            /* compiled from: RhcUpsellsDataProviderService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markUpsellSeenAtTouchPointThisSession$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/RhcUpsellsDataProviderService_Adapter$Endpoint_markUpsellSeenAtTouchPointThisSession$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C36177xf04b006c.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, TouchPoint touchPoint, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C36177xf04b006c.INSTANCE.getDescriptor());
                }
                this.touchPoint = touchPoint;
            }

            public Arguments(TouchPoint touchPoint) {
                Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
                this.touchPoint = touchPoint;
            }

            public final TouchPoint getTouchPoint() {
                return this.touchPoint;
            }
        }
    }
}
