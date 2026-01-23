package com.robinhood.onboarding.nggoldearningsindepositstep.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: NGGoldEarningsService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0018\u0019\u001a\u001bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fJ\"\u0010\u0012\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0012\u0010\u000fJ\"\u0010\u0013\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter;", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "", "entryPoint", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", "getNewUserAlertContent", "(Ljava/lang/Double;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExistingUserAlertContent", "", "showNewUserBottomSheetIfEligible", "showExistingUserBottomSheetIfEligible", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_getExistingUserAlertContent", "Endpoint_getNewUserAlertContent", "Endpoint_showExistingUserBottomSheetIfEligible", "Endpoint_showNewUserBottomSheetIfEligible", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
final class NGGoldEarningsService_Adapter implements NGGoldEarningsService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: NGGoldEarningsService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService_Adapter", m3645f = "NGGoldEarningsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "getExistingUserAlertContent")
    /* renamed from: com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService_Adapter$getExistingUserAlertContent$1 */
    static final class C359321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359321(Continuation<? super C359321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NGGoldEarningsService_Adapter.this.getExistingUserAlertContent(null, null, this);
        }
    }

    /* compiled from: NGGoldEarningsService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService_Adapter", m3645f = "NGGoldEarningsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "getNewUserAlertContent")
    /* renamed from: com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService_Adapter$getNewUserAlertContent$1 */
    static final class C359331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C359331(Continuation<? super C359331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NGGoldEarningsService_Adapter.this.getNewUserAlertContent(null, null, this);
        }
    }

    public NGGoldEarningsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNewUserAlertContent(Double d, String str, Continuation<? super NGEarningsFirstDepositAlertContent> continuation) throws IOException {
        C359331 c359331;
        if (continuation instanceof C359331) {
            c359331 = (C359331) continuation;
            int i = c359331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359331.label = i - Integer.MIN_VALUE;
            } else {
                c359331 = new C359331(continuation);
            }
        }
        C359331 c3593312 = c359331;
        Object objCallSuspendFunction = c3593312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3593312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getNewUserAlertContent.Arguments arguments = new Endpoint_getNewUserAlertContent.Arguments(d, str);
            json.getSerializersModule();
            KSerializer<Endpoint_getNewUserAlertContent.Arguments> kSerializerSerializer = Endpoint_getNewUserAlertContent.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getNewUserAlertContent.Emission> kSerializerSerializer2 = Endpoint_getNewUserAlertContent.Emission.INSTANCE.serializer();
            c3593312.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getNewUserAlertContent", arguments, c3593312);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getNewUserAlertContent.Emission) objCallSuspendFunction).m23726unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getExistingUserAlertContent(Double d, String str, Continuation<? super NGEarningsFirstDepositAlertContent> continuation) throws IOException {
        C359321 c359321;
        if (continuation instanceof C359321) {
            c359321 = (C359321) continuation;
            int i = c359321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c359321.label = i - Integer.MIN_VALUE;
            } else {
                c359321 = new C359321(continuation);
            }
        }
        C359321 c3593212 = c359321;
        Object objCallSuspendFunction = c3593212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3593212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getExistingUserAlertContent.Arguments arguments = new Endpoint_getExistingUserAlertContent.Arguments(d, str);
            json.getSerializersModule();
            KSerializer<Endpoint_getExistingUserAlertContent.Arguments> kSerializerSerializer = Endpoint_getExistingUserAlertContent.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getExistingUserAlertContent.Emission> kSerializerSerializer2 = Endpoint_getExistingUserAlertContent.Emission.INSTANCE.serializer();
            c3593212.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getExistingUserAlertContent", arguments, c3593212);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getExistingUserAlertContent.Emission) objCallSuspendFunction).m23719unboximpl();
    }

    @Override // com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService
    public Object showNewUserBottomSheetIfEligible(Double d, String str, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_showNewUserBottomSheetIfEligible.Arguments arguments = new Endpoint_showNewUserBottomSheetIfEligible.Arguments(d, str);
        json.getSerializersModule();
        KSerializer<Endpoint_showNewUserBottomSheetIfEligible.Arguments> kSerializerSerializer = Endpoint_showNewUserBottomSheetIfEligible.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "showNewUserBottomSheetIfEligible", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService
    public Object showExistingUserBottomSheetIfEligible(Double d, String str, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_showExistingUserBottomSheetIfEligible.Arguments arguments = new Endpoint_showExistingUserBottomSheetIfEligible.Arguments(d, str);
        json.getSerializersModule();
        KSerializer<Endpoint_showExistingUserBottomSheetIfEligible.Arguments> kSerializerSerializer = Endpoint_showExistingUserBottomSheetIfEligible.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "showExistingUserBottomSheetIfEligible", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* compiled from: NGGoldEarningsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getNewUserAlertContent;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getNewUserAlertContent implements ServiceCallable {
        private final Json json;
        private final NGGoldEarningsService service;

        public Endpoint_getNewUserAlertContent(NGGoldEarningsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C35929x1dcacbd4 c35929x1dcacbd4 = new C35929x1dcacbd4(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c35929x1dcacbd4);
        }

        /* compiled from: NGGoldEarningsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J$\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getNewUserAlertContent$Arguments;", "", "seen1", "", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "", "entryPoint", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Double;Ljava/lang/String;)V", "getDepositAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEntryPoint", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/String;)Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getNewUserAlertContent$Arguments;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Double depositAmount;
            private final String entryPoint;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, Double d, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = arguments.depositAmount;
                }
                if ((i & 2) != 0) {
                    str = arguments.entryPoint;
                }
                return arguments.copy(d, str);
            }

            /* renamed from: component1, reason: from getter */
            public final Double getDepositAmount() {
                return this.depositAmount;
            }

            /* renamed from: component2, reason: from getter */
            public final String getEntryPoint() {
                return this.entryPoint;
            }

            public final Arguments copy(Double depositAmount, String entryPoint) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                return new Arguments(depositAmount, entryPoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual((Object) this.depositAmount, (Object) arguments.depositAmount) && Intrinsics.areEqual(this.entryPoint, arguments.entryPoint);
            }

            public int hashCode() {
                Double d = this.depositAmount;
                return ((d == null ? 0 : d.hashCode()) * 31) + this.entryPoint.hashCode();
            }

            public String toString() {
                return "Arguments(depositAmount=" + this.depositAmount + ", entryPoint=" + this.entryPoint + ")";
            }

            /* compiled from: NGGoldEarningsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getNewUserAlertContent$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getNewUserAlertContent$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C35924x342166bf.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, Double d, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C35924x342166bf.INSTANCE.getDescriptor());
                }
                this.depositAmount = d;
                this.entryPoint = str;
            }

            public Arguments(Double d, String entryPoint) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                this.depositAmount = d;
                this.entryPoint = entryPoint;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeNullableSerializableElement(serialDesc, 0, DoubleSerializer.INSTANCE, self.depositAmount);
                output.encodeStringElement(serialDesc, 1, self.entryPoint);
            }

            public final Double getDepositAmount() {
                return this.depositAmount;
            }

            public final String getEntryPoint() {
                return this.entryPoint;
            }
        }

        /* compiled from: NGGoldEarningsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getNewUserAlertContent$Emission;", "", "value", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", "constructor-impl", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;)Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", "getValue", "()Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;)I", "toString", "", "toString-impl", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final NGEarningsFirstDepositAlertContent value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23720boximpl(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent) {
                return new Emission(nGEarningsFirstDepositAlertContent);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static NGEarningsFirstDepositAlertContent m23721constructorimpl(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent) {
                return nGEarningsFirstDepositAlertContent;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23722equalsimpl(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(nGEarningsFirstDepositAlertContent, ((Emission) obj).m23726unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23723equalsimpl0(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent, NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent2) {
                return Intrinsics.areEqual(nGEarningsFirstDepositAlertContent, nGEarningsFirstDepositAlertContent2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23724hashCodeimpl(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent) {
                if (nGEarningsFirstDepositAlertContent == null) {
                    return 0;
                }
                return nGEarningsFirstDepositAlertContent.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23725toStringimpl(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent) {
                return "Emission(value=" + nGEarningsFirstDepositAlertContent + ")";
            }

            public boolean equals(Object obj) {
                return m23722equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23724hashCodeimpl(this.value);
            }

            public String toString() {
                return m23725toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ NGEarningsFirstDepositAlertContent m23726unboximpl() {
                return this.value;
            }

            /* compiled from: NGGoldEarningsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getNewUserAlertContent$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getNewUserAlertContent$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C35925x922e31e2.INSTANCE;
                }
            }

            private /* synthetic */ Emission(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent) {
                this.value = nGEarningsFirstDepositAlertContent;
            }

            public final NGEarningsFirstDepositAlertContent getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: NGGoldEarningsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getExistingUserAlertContent;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getExistingUserAlertContent implements ServiceCallable {
        private final Json json;
        private final NGGoldEarningsService service;

        public Endpoint_getExistingUserAlertContent(NGGoldEarningsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C35928xb7c719cf c35928xb7c719cf = new C35928xb7c719cf(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c35928xb7c719cf);
        }

        /* compiled from: NGGoldEarningsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J$\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getExistingUserAlertContent$Arguments;", "", "seen1", "", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "", "entryPoint", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Double;Ljava/lang/String;)V", "getDepositAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEntryPoint", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/String;)Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getExistingUserAlertContent$Arguments;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Double depositAmount;
            private final String entryPoint;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, Double d, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = arguments.depositAmount;
                }
                if ((i & 2) != 0) {
                    str = arguments.entryPoint;
                }
                return arguments.copy(d, str);
            }

            /* renamed from: component1, reason: from getter */
            public final Double getDepositAmount() {
                return this.depositAmount;
            }

            /* renamed from: component2, reason: from getter */
            public final String getEntryPoint() {
                return this.entryPoint;
            }

            public final Arguments copy(Double depositAmount, String entryPoint) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                return new Arguments(depositAmount, entryPoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual((Object) this.depositAmount, (Object) arguments.depositAmount) && Intrinsics.areEqual(this.entryPoint, arguments.entryPoint);
            }

            public int hashCode() {
                Double d = this.depositAmount;
                return ((d == null ? 0 : d.hashCode()) * 31) + this.entryPoint.hashCode();
            }

            public String toString() {
                return "Arguments(depositAmount=" + this.depositAmount + ", entryPoint=" + this.entryPoint + ")";
            }

            /* compiled from: NGGoldEarningsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getExistingUserAlertContent$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getExistingUserAlertContent$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C35922xec660364.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, Double d, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C35922xec660364.INSTANCE.getDescriptor());
                }
                this.depositAmount = d;
                this.entryPoint = str;
            }

            public Arguments(Double d, String entryPoint) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                this.depositAmount = d;
                this.entryPoint = entryPoint;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeNullableSerializableElement(serialDesc, 0, DoubleSerializer.INSTANCE, self.depositAmount);
                output.encodeStringElement(serialDesc, 1, self.entryPoint);
            }

            public final Double getDepositAmount() {
                return this.depositAmount;
            }

            public final String getEntryPoint() {
                return this.entryPoint;
            }
        }

        /* compiled from: NGGoldEarningsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getExistingUserAlertContent$Emission;", "", "value", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", "constructor-impl", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;)Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", "getValue", "()Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;)I", "toString", "", "toString-impl", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final NGEarningsFirstDepositAlertContent value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m23713boximpl(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent) {
                return new Emission(nGEarningsFirstDepositAlertContent);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static NGEarningsFirstDepositAlertContent m23714constructorimpl(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent) {
                return nGEarningsFirstDepositAlertContent;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m23715equalsimpl(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(nGEarningsFirstDepositAlertContent, ((Emission) obj).m23719unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m23716equalsimpl0(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent, NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent2) {
                return Intrinsics.areEqual(nGEarningsFirstDepositAlertContent, nGEarningsFirstDepositAlertContent2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m23717hashCodeimpl(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent) {
                if (nGEarningsFirstDepositAlertContent == null) {
                    return 0;
                }
                return nGEarningsFirstDepositAlertContent.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m23718toStringimpl(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent) {
                return "Emission(value=" + nGEarningsFirstDepositAlertContent + ")";
            }

            public boolean equals(Object obj) {
                return m23715equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m23717hashCodeimpl(this.value);
            }

            public String toString() {
                return m23718toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ NGEarningsFirstDepositAlertContent m23719unboximpl() {
                return this.value;
            }

            /* compiled from: NGGoldEarningsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getExistingUserAlertContent$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getExistingUserAlertContent$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C35923x1c40ec9d.INSTANCE;
                }
            }

            private /* synthetic */ Emission(NGEarningsFirstDepositAlertContent nGEarningsFirstDepositAlertContent) {
                this.value = nGEarningsFirstDepositAlertContent;
            }

            public final NGEarningsFirstDepositAlertContent getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: NGGoldEarningsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showNewUserBottomSheetIfEligible;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_showNewUserBottomSheetIfEligible implements ServiceCallable {
        private final Json json;
        private final NGGoldEarningsService service;

        public Endpoint_showNewUserBottomSheetIfEligible(NGGoldEarningsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C35931x7ef0938c c35931x7ef0938c = new C35931x7ef0938c(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c35931x7ef0938c);
        }

        /* compiled from: NGGoldEarningsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J$\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showNewUserBottomSheetIfEligible$Arguments;", "", "seen1", "", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "", "entryPoint", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Double;Ljava/lang/String;)V", "getDepositAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEntryPoint", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/String;)Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showNewUserBottomSheetIfEligible$Arguments;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Double depositAmount;
            private final String entryPoint;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, Double d, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = arguments.depositAmount;
                }
                if ((i & 2) != 0) {
                    str = arguments.entryPoint;
                }
                return arguments.copy(d, str);
            }

            /* renamed from: component1, reason: from getter */
            public final Double getDepositAmount() {
                return this.depositAmount;
            }

            /* renamed from: component2, reason: from getter */
            public final String getEntryPoint() {
                return this.entryPoint;
            }

            public final Arguments copy(Double depositAmount, String entryPoint) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                return new Arguments(depositAmount, entryPoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual((Object) this.depositAmount, (Object) arguments.depositAmount) && Intrinsics.areEqual(this.entryPoint, arguments.entryPoint);
            }

            public int hashCode() {
                Double d = this.depositAmount;
                return ((d == null ? 0 : d.hashCode()) * 31) + this.entryPoint.hashCode();
            }

            public String toString() {
                return "Arguments(depositAmount=" + this.depositAmount + ", entryPoint=" + this.entryPoint + ")";
            }

            /* compiled from: NGGoldEarningsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showNewUserBottomSheetIfEligible$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showNewUserBottomSheetIfEligible$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C35927x48ac3807.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, Double d, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C35927x48ac3807.INSTANCE.getDescriptor());
                }
                this.depositAmount = d;
                this.entryPoint = str;
            }

            public Arguments(Double d, String entryPoint) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                this.depositAmount = d;
                this.entryPoint = entryPoint;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeNullableSerializableElement(serialDesc, 0, DoubleSerializer.INSTANCE, self.depositAmount);
                output.encodeStringElement(serialDesc, 1, self.entryPoint);
            }

            public final Double getDepositAmount() {
                return this.depositAmount;
            }

            public final String getEntryPoint() {
                return this.entryPoint;
            }
        }
    }

    /* compiled from: NGGoldEarningsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showExistingUserBottomSheetIfEligible;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_showExistingUserBottomSheetIfEligible implements ServiceCallable {
        private final Json json;
        private final NGGoldEarningsService service;

        public Endpoint_showExistingUserBottomSheetIfEligible(NGGoldEarningsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C35930xcd0007c3 c35930xcd0007c3 = new C35930xcd0007c3(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, c35930xcd0007c3);
        }

        /* compiled from: NGGoldEarningsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J$\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showExistingUserBottomSheetIfEligible$Arguments;", "", "seen1", "", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "", "entryPoint", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Double;Ljava/lang/String;)V", "getDepositAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEntryPoint", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/String;)Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showExistingUserBottomSheetIfEligible$Arguments;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Double depositAmount;
            private final String entryPoint;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, Double d, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = arguments.depositAmount;
                }
                if ((i & 2) != 0) {
                    str = arguments.entryPoint;
                }
                return arguments.copy(d, str);
            }

            /* renamed from: component1, reason: from getter */
            public final Double getDepositAmount() {
                return this.depositAmount;
            }

            /* renamed from: component2, reason: from getter */
            public final String getEntryPoint() {
                return this.entryPoint;
            }

            public final Arguments copy(Double depositAmount, String entryPoint) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                return new Arguments(depositAmount, entryPoint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual((Object) this.depositAmount, (Object) arguments.depositAmount) && Intrinsics.areEqual(this.entryPoint, arguments.entryPoint);
            }

            public int hashCode() {
                Double d = this.depositAmount;
                return ((d == null ? 0 : d.hashCode()) * 31) + this.entryPoint.hashCode();
            }

            public String toString() {
                return "Arguments(depositAmount=" + this.depositAmount + ", entryPoint=" + this.entryPoint + ")";
            }

            /* compiled from: NGGoldEarningsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showExistingUserBottomSheetIfEligible$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showExistingUserBottomSheetIfEligible$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C35926xc99ceef0.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, Double d, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C35926xc99ceef0.INSTANCE.getDescriptor());
                }
                this.depositAmount = d;
                this.entryPoint = str;
            }

            public Arguments(Double d, String entryPoint) {
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                this.depositAmount = d;
                this.entryPoint = entryPoint;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeNullableSerializableElement(serialDesc, 0, DoubleSerializer.INSTANCE, self.depositAmount);
                output.encodeStringElement(serialDesc, 1, self.entryPoint);
            }

            public final Double getDepositAmount() {
                return this.depositAmount;
            }

            public final String getEntryPoint() {
                return this.entryPoint;
            }
        }
    }
}
