package com.robinhood.futures.ordercheck.contracts;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderPriceType;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
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
import microgram.datasource.utils.BigDecimalSerializer;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: FuturesOrderCheckResolver_Adapter.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u001f !\"#B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\t2\u0019\u0010\u0011\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0015\u0010\u000bJ3\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0019\u0010\u0018\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "applyForAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "Lkotlinx/serialization/Serializable;", "with", "Lmicrogram/datasource/utils/BigDecimalSerializer;", "suggestedAmount", "makeDeposit", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "focusOnQuantityText", "focusOnPriceText", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;", "priceType", "newPrice", "updatePrice", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_applyForAccount", "Endpoint_focusOnPriceText", "Endpoint_focusOnQuantityText", "Endpoint_makeDeposit", "Endpoint_updatePrice", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class FuturesOrderCheckResolver_Adapter implements FuturesOrderCheckResolver {
    private final ClientBridge __bridge;
    private final Json json;

    public FuturesOrderCheckResolver_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object applyForAccount(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Unit unit = Unit.INSTANCE;
        json.getSerializersModule();
        UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, unitSerializer, "applyForAccount", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object makeDeposit(BigDecimal bigDecimal, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_makeDeposit.Arguments arguments = new Endpoint_makeDeposit.Arguments(bigDecimal);
        json.getSerializersModule();
        KSerializer<Endpoint_makeDeposit.Arguments> kSerializerSerializer = Endpoint_makeDeposit.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "makeDeposit", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object focusOnQuantityText(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Unit unit = Unit.INSTANCE;
        json.getSerializersModule();
        UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, unitSerializer, "focusOnQuantityText", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object focusOnPriceText(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Unit unit = Unit.INSTANCE;
        json.getSerializersModule();
        UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, unitSerializer, "focusOnPriceText", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    @Override // com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver
    public Object updatePrice(FuturesOrderPriceType futuresOrderPriceType, BigDecimal bigDecimal, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_updatePrice.Arguments arguments = new Endpoint_updatePrice.Arguments(futuresOrderPriceType, bigDecimal);
        json.getSerializersModule();
        KSerializer<Endpoint_updatePrice.Arguments> kSerializerSerializer = Endpoint_updatePrice.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "updatePrice", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* compiled from: FuturesOrderCheckResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_applyForAccount;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_applyForAccount implements ServiceCallable {
        private final Json json;
        private final FuturesOrderCheckResolver service;

        public Endpoint_applyForAccount(FuturesOrderCheckResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C33308x732ffc3 c33308x732ffc3 = new C33308x732ffc3(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, unitSerializer, body, c33308x732ffc3);
        }
    }

    /* compiled from: FuturesOrderCheckResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_makeDeposit;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_makeDeposit implements ServiceCallable {
        private final Json json;
        private final FuturesOrderCheckResolver service;

        public Endpoint_makeDeposit(FuturesOrderCheckResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            FuturesOrderCheckResolver_Adapter$Endpoint_makeDeposit$call$1 futuresOrderCheckResolver_Adapter$Endpoint_makeDeposit$call$1 = new FuturesOrderCheckResolver_Adapter$Endpoint_makeDeposit$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, futuresOrderCheckResolver_Adapter$Endpoint_makeDeposit$call$1);
        }

        /* compiled from: FuturesOrderCheckResolver_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B8\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001d\u0010\u0004\u001a\u0019\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB \u0012\u0019\u0010\u0004\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\u0002\u0010\rJ\u001c\u0010\u0010\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J&\u0010\u0011\u001a\u00020\u00002\u001b\b\u0002\u0010\u0004\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR$\u0010\u0004\u001a\u00150\u0005j\u0002`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_makeDeposit$Arguments;", "", "seen1", "", "suggestedAmount", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "Lkotlinx/serialization/Serializable;", "with", "Lmicrogram/datasource/utils/BigDecimalSerializer;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;)V", "getSuggestedAmount", "()Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BigDecimal suggestedAmount;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = arguments.suggestedAmount;
                }
                return arguments.copy(bigDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getSuggestedAmount() {
                return this.suggestedAmount;
            }

            public final Arguments copy(BigDecimal suggestedAmount) {
                Intrinsics.checkNotNullParameter(suggestedAmount, "suggestedAmount");
                return new Arguments(suggestedAmount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.suggestedAmount, ((Arguments) other).suggestedAmount);
            }

            public int hashCode() {
                return this.suggestedAmount.hashCode();
            }

            public String toString() {
                return "Arguments(suggestedAmount=" + this.suggestedAmount + ")";
            }

            /* compiled from: FuturesOrderCheckResolver_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_makeDeposit$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_makeDeposit$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C33306x83322b0e.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, BigDecimal bigDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C33306x83322b0e.INSTANCE.getDescriptor());
                }
                this.suggestedAmount = bigDecimal;
            }

            public Arguments(BigDecimal suggestedAmount) {
                Intrinsics.checkNotNullParameter(suggestedAmount, "suggestedAmount");
                this.suggestedAmount = suggestedAmount;
            }

            public final BigDecimal getSuggestedAmount() {
                return this.suggestedAmount;
            }
        }
    }

    /* compiled from: FuturesOrderCheckResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_focusOnQuantityText;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_focusOnQuantityText implements ServiceCallable {
        private final Json json;
        private final FuturesOrderCheckResolver service;

        public Endpoint_focusOnQuantityText(FuturesOrderCheckResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C33310x3ef1ee86 c33310x3ef1ee86 = new C33310x3ef1ee86(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, unitSerializer, body, c33310x3ef1ee86);
        }
    }

    /* compiled from: FuturesOrderCheckResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_focusOnPriceText;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_focusOnPriceText implements ServiceCallable {
        private final Json json;
        private final FuturesOrderCheckResolver service;

        public Endpoint_focusOnPriceText(FuturesOrderCheckResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C33309x4c6d1eca c33309x4c6d1eca = new C33309x4c6d1eca(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, unitSerializer, body, c33309x4c6d1eca);
        }
    }

    /* compiled from: FuturesOrderCheckResolver_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_updatePrice implements ServiceCallable {
        private final Json json;
        private final FuturesOrderCheckResolver service;

        public Endpoint_updatePrice(FuturesOrderCheckResolver service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1 futuresOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1 = new FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, futuresOrderCheckResolver_Adapter$Endpoint_updatePrice$call$1);
        }

        /* compiled from: FuturesOrderCheckResolver_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&BB\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001d\u0010\u0006\u001a\u0019\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB(\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0019\u0010\u0006\u001a\u00150\u0007j\u0002`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001c\u0010\u0015\u001a\u00150\u0007j\u0002`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J0\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001b\b\u0002\u0010\u0006\u001a\u00150\u0007j\u0002`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÁ\u0001¢\u0006\u0002\b$R$\u0010\u0006\u001a\u00150\u0007j\u0002`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$Arguments;", "", "seen1", "", "priceType", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;", "newPrice", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "Lkotlinx/serialization/Serializable;", "with", "Lmicrogram/datasource/utils/BigDecimalSerializer;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;)V", "getNewPrice", "()Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "getPriceType", "()Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final BigDecimal newPrice;
            private final FuturesOrderPriceType priceType;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final KSerializer<Object>[] $childSerializers = {FuturesOrderPriceType.INSTANCE.serializer(), null};

            public static /* synthetic */ Arguments copy$default(Arguments arguments, FuturesOrderPriceType futuresOrderPriceType, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    futuresOrderPriceType = arguments.priceType;
                }
                if ((i & 2) != 0) {
                    bigDecimal = arguments.newPrice;
                }
                return arguments.copy(futuresOrderPriceType, bigDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final FuturesOrderPriceType getPriceType() {
                return this.priceType;
            }

            /* renamed from: component2, reason: from getter */
            public final BigDecimal getNewPrice() {
                return this.newPrice;
            }

            public final Arguments copy(FuturesOrderPriceType priceType, BigDecimal newPrice) {
                Intrinsics.checkNotNullParameter(priceType, "priceType");
                Intrinsics.checkNotNullParameter(newPrice, "newPrice");
                return new Arguments(priceType, newPrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return this.priceType == arguments.priceType && Intrinsics.areEqual(this.newPrice, arguments.newPrice);
            }

            public int hashCode() {
                return (this.priceType.hashCode() * 31) + this.newPrice.hashCode();
            }

            public String toString() {
                return "Arguments(priceType=" + this.priceType + ", newPrice=" + this.newPrice + ")";
            }

            /* compiled from: FuturesOrderCheckResolver_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver_Adapter$Endpoint_updatePrice$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C33307x744043e.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, FuturesOrderPriceType futuresOrderPriceType, BigDecimal bigDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C33307x744043e.INSTANCE.getDescriptor());
                }
                this.priceType = futuresOrderPriceType;
                this.newPrice = bigDecimal;
            }

            public Arguments(FuturesOrderPriceType priceType, BigDecimal newPrice) {
                Intrinsics.checkNotNullParameter(priceType, "priceType");
                Intrinsics.checkNotNullParameter(newPrice, "newPrice");
                this.priceType = priceType;
                this.newPrice = newPrice;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.priceType);
                output.encodeSerializableElement(serialDesc, 1, BigDecimalSerializer.INSTANCE, self.newPrice);
            }

            public final FuturesOrderPriceType getPriceType() {
                return this.priceType;
            }

            public final BigDecimal getNewPrice() {
                return this.newPrice;
            }
        }
    }
}
