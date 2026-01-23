package com.robinhood.rhc.upsells;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.ionspin.kotlin.bignum.decimal.BigDecimalExtensions;
import com.ionspin.kotlin.bignum.decimal.DecimalMode;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.serializers.InstantSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.datasource.utils.BigDecimalSerializer;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: CryptoOrder.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0003Z[\\B\u0093\u0001\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0002\u0010\u0018B½\u0002\b\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001d\u0010\u0004\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u001d\u0010\u0006\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u001d\u0010\f\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\u001d\u0010\r\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\u001d\u0010\u000e\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u001d\u0010\u0015\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010 \u0012\b\u0010\u0017\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0002\u0010#B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001d\u0010\u0004\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0019\u0010\u0006\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0019\u0010\f\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\u0019\u0010\r\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\u0019\u0010\u000e\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u001d\u0010\u0015\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f\u0012\u0006\u0010\u0016\u001a\u00020 \u0012\u0006\u0010\u0017\u001a\u00020 ¢\u0006\u0002\u0010$J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u001c\u0010=\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001fHÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0012HÆ\u0003J\t\u0010@\u001a\u00020\u0014HÆ\u0003J \u0010A\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001fHÆ\u0003J\t\u0010B\u001a\u00020 HÆ\u0003J\t\u0010C\u001a\u00020 HÆ\u0003J \u0010D\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001fHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001c\u0010F\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001fHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u001c\u0010J\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001fHÆ\u0003J\u001c\u0010K\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001fHÆ\u0003J«\u0002\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001f\b\u0002\u0010\u0004\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u001b\b\u0002\u0010\u0006\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f2\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u001b\b\u0002\u0010\f\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f2\u001b\b\u0002\u0010\r\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f2\u001b\b\u0002\u0010\u000e\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u001f\b\u0002\u0010\u0015\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f2\b\b\u0002\u0010\u0016\u001a\u00020 2\b\b\u0002\u0010\u0017\u001a\u00020 HÆ\u0001J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u001aHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J&\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XHÁ\u0001¢\u0006\u0002\bYR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R(\u0010\u0004\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0017\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R$\u0010\u0006\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R(\u0010\u0015\u001a\u0019\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R$\u0010\f\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R$\u0010\r\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R$\u0010\u000e\u001a\u00150\u001bj\u0002`\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\t0\u001f¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0016\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+¨\u0006]"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/CryptoOrder;", "", "accountId", "", "averagePrice", "cancelUrl", "cumulativeQuantity", "currencyPairId", "executions", "", "Lcom/robinhood/rhc/upsells/CryptoOrder$Execution;", "id", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "roundedExecutedNotional", "side", "Lcom/robinhood/rhc/upsells/OrderSide;", "state", "Lcom/robinhood/rhc/upsells/OrderState;", "type", "Lcom/robinhood/rhc/upsells/CryptoOrderType;", "enteredPrice", "updatedAt", "createdAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rhc/upsells/OrderSide;Lcom/robinhood/rhc/upsells/OrderState;Lcom/robinhood/rhc/upsells/CryptoOrderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "Lkotlinx/serialization/Serializable;", "with", "Lmicrogram/datasource/utils/BigDecimalSerializer;", "Lkotlinx/datetime/Instant;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/robinhood/rhc/upsells/OrderSide;Lcom/robinhood/rhc/upsells/OrderState;Lcom/robinhood/rhc/upsells/CryptoOrderType;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lcom/robinhood/rhc/upsells/OrderSide;Lcom/robinhood/rhc/upsells/OrderState;Lcom/robinhood/rhc/upsells/CryptoOrderType;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;)V", "getAccountId", "()Ljava/lang/String;", "getAveragePrice", "()Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "getCancelUrl", "getCreatedAt", "()Lkotlinx/datetime/Instant;", "getCumulativeQuantity", "getCurrencyPairId", "getEnteredPrice", "getExecutions", "()Ljava/util/List;", "getId", "getPrice", "getQuantity", "getRoundedExecutedNotional", "getSide", "()Lcom/robinhood/rhc/upsells/OrderSide;", "getState", "()Lcom/robinhood/rhc/upsells/OrderState;", "getType", "()Lcom/robinhood/rhc/upsells/CryptoOrderType;", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "Execution", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes26.dex */
public final /* data */ class CryptoOrder {
    private final String accountId;
    private final BigDecimal averagePrice;
    private final String cancelUrl;
    private final Instant createdAt;
    private final BigDecimal cumulativeQuantity;
    private final String currencyPairId;
    private final BigDecimal enteredPrice;
    private final List<Execution> executions;
    private final String id;
    private final BigDecimal price;
    private final BigDecimal quantity;
    private final BigDecimal roundedExecutedNotional;
    private final OrderSide side;
    private final OrderState state;
    private final CryptoOrderType type;
    private final Instant updatedAt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(CryptoOrder9.INSTANCE), null, null, null, null, OrderSide.INSTANCE.serializer(), OrderState.INSTANCE.serializer(), CryptoOrderType.INSTANCE.serializer(), null, null, null};

    /* renamed from: component1, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component10, reason: from getter */
    public final BigDecimal getRoundedExecutedNotional() {
        return this.roundedExecutedNotional;
    }

    /* renamed from: component11, reason: from getter */
    public final OrderSide getSide() {
        return this.side;
    }

    /* renamed from: component12, reason: from getter */
    public final OrderState getState() {
        return this.state;
    }

    /* renamed from: component13, reason: from getter */
    public final CryptoOrderType getType() {
        return this.type;
    }

    /* renamed from: component14, reason: from getter */
    public final BigDecimal getEnteredPrice() {
        return this.enteredPrice;
    }

    /* renamed from: component15, reason: from getter */
    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component16, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAveragePrice() {
        return this.averagePrice;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getCumulativeQuantity() {
        return this.cumulativeQuantity;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final List<Execution> component6() {
        return this.executions;
    }

    /* renamed from: component7, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component8, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    /* renamed from: component9, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final CryptoOrder copy(String accountId, BigDecimal averagePrice, String cancelUrl, BigDecimal cumulativeQuantity, String currencyPairId, List<Execution> executions, String id, BigDecimal price, BigDecimal quantity, BigDecimal roundedExecutedNotional, OrderSide side, OrderState state, CryptoOrderType type2, BigDecimal enteredPrice, Instant updatedAt, Instant createdAt) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(cumulativeQuantity, "cumulativeQuantity");
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(roundedExecutedNotional, "roundedExecutedNotional");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new CryptoOrder(accountId, averagePrice, cancelUrl, cumulativeQuantity, currencyPairId, executions, id, price, quantity, roundedExecutedNotional, side, state, type2, enteredPrice, updatedAt, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrder)) {
            return false;
        }
        CryptoOrder cryptoOrder = (CryptoOrder) other;
        return Intrinsics.areEqual(this.accountId, cryptoOrder.accountId) && Intrinsics.areEqual(this.averagePrice, cryptoOrder.averagePrice) && Intrinsics.areEqual(this.cancelUrl, cryptoOrder.cancelUrl) && Intrinsics.areEqual(this.cumulativeQuantity, cryptoOrder.cumulativeQuantity) && Intrinsics.areEqual(this.currencyPairId, cryptoOrder.currencyPairId) && Intrinsics.areEqual(this.executions, cryptoOrder.executions) && Intrinsics.areEqual(this.id, cryptoOrder.id) && Intrinsics.areEqual(this.price, cryptoOrder.price) && Intrinsics.areEqual(this.quantity, cryptoOrder.quantity) && Intrinsics.areEqual(this.roundedExecutedNotional, cryptoOrder.roundedExecutedNotional) && this.side == cryptoOrder.side && this.state == cryptoOrder.state && this.type == cryptoOrder.type && Intrinsics.areEqual(this.enteredPrice, cryptoOrder.enteredPrice) && Intrinsics.areEqual(this.updatedAt, cryptoOrder.updatedAt) && Intrinsics.areEqual(this.createdAt, cryptoOrder.createdAt);
    }

    public int hashCode() {
        int iHashCode = this.accountId.hashCode() * 31;
        BigDecimal bigDecimal = this.averagePrice;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.cancelUrl;
        int iHashCode3 = (((((((((((((((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.cumulativeQuantity.hashCode()) * 31) + this.currencyPairId.hashCode()) * 31) + this.executions.hashCode()) * 31) + this.id.hashCode()) * 31) + this.price.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.roundedExecutedNotional.hashCode()) * 31) + this.side.hashCode()) * 31) + this.state.hashCode()) * 31) + this.type.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.enteredPrice;
        return ((((iHashCode3 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31) + this.updatedAt.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "CryptoOrder(accountId=" + this.accountId + ", averagePrice=" + this.averagePrice + ", cancelUrl=" + this.cancelUrl + ", cumulativeQuantity=" + this.cumulativeQuantity + ", currencyPairId=" + this.currencyPairId + ", executions=" + this.executions + ", id=" + this.id + ", price=" + this.price + ", quantity=" + this.quantity + ", roundedExecutedNotional=" + this.roundedExecutedNotional + ", side=" + this.side + ", state=" + this.state + ", type=" + this.type + ", enteredPrice=" + this.enteredPrice + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ")";
    }

    /* compiled from: CryptoOrder.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/CryptoOrder$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/CryptoOrder;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoOrder> serializer() {
            return CryptoOrder8.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ CryptoOrder(int i, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, String str3, List list, String str4, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, OrderSide orderSide, OrderState orderState, CryptoOrderType cryptoOrderType, BigDecimal bigDecimal6, Instant instant, Instant instant2, SerializationConstructorMarker serializationConstructorMarker) {
        if (65535 != (i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) {
            PluginExceptions.throwMissingFieldException(i, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, CryptoOrder8.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.averagePrice = bigDecimal;
        this.cancelUrl = str2;
        this.cumulativeQuantity = bigDecimal2;
        this.currencyPairId = str3;
        this.executions = list;
        this.id = str4;
        this.price = bigDecimal3;
        this.quantity = bigDecimal4;
        this.roundedExecutedNotional = bigDecimal5;
        this.side = orderSide;
        this.state = orderState;
        this.type = cryptoOrderType;
        this.enteredPrice = bigDecimal6;
        this.updatedAt = instant;
        this.createdAt = instant2;
    }

    public CryptoOrder(String accountId, BigDecimal bigDecimal, String str, BigDecimal cumulativeQuantity, String currencyPairId, List<Execution> executions, String id, BigDecimal price, BigDecimal quantity, BigDecimal roundedExecutedNotional, OrderSide side, OrderState state, CryptoOrderType type2, BigDecimal bigDecimal2, Instant updatedAt, Instant createdAt) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(cumulativeQuantity, "cumulativeQuantity");
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(roundedExecutedNotional, "roundedExecutedNotional");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.accountId = accountId;
        this.averagePrice = bigDecimal;
        this.cancelUrl = str;
        this.cumulativeQuantity = cumulativeQuantity;
        this.currencyPairId = currencyPairId;
        this.executions = executions;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.roundedExecutedNotional = roundedExecutedNotional;
        this.side = side;
        this.state = state;
        this.type = type2;
        this.enteredPrice = bigDecimal2;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(CryptoOrder self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.accountId);
        BigDecimalSerializer bigDecimalSerializer = BigDecimalSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, bigDecimalSerializer, self.averagePrice);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.cancelUrl);
        output.encodeSerializableElement(serialDesc, 3, bigDecimalSerializer, self.cumulativeQuantity);
        output.encodeStringElement(serialDesc, 4, self.currencyPairId);
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.executions);
        output.encodeStringElement(serialDesc, 6, self.id);
        output.encodeSerializableElement(serialDesc, 7, bigDecimalSerializer, self.price);
        output.encodeSerializableElement(serialDesc, 8, bigDecimalSerializer, self.quantity);
        output.encodeSerializableElement(serialDesc, 9, bigDecimalSerializer, self.roundedExecutedNotional);
        output.encodeSerializableElement(serialDesc, 10, kSerializerArr[10], self.side);
        output.encodeSerializableElement(serialDesc, 11, kSerializerArr[11], self.state);
        output.encodeSerializableElement(serialDesc, 12, kSerializerArr[12], self.type);
        output.encodeNullableSerializableElement(serialDesc, 13, bigDecimalSerializer, self.enteredPrice);
        InstantSerializers instantSerializers = InstantSerializers.INSTANCE;
        output.encodeSerializableElement(serialDesc, 14, instantSerializers, self.updatedAt);
        output.encodeSerializableElement(serialDesc, 15, instantSerializers, self.createdAt);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final BigDecimal getAveragePrice() {
        return this.averagePrice;
    }

    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    public final BigDecimal getCumulativeQuantity() {
        return this.cumulativeQuantity;
    }

    public final String getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final List<Execution> getExecutions() {
        return this.executions;
    }

    public final String getId() {
        return this.id;
    }

    public final BigDecimal getPrice() {
        return this.price;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final BigDecimal getRoundedExecutedNotional() {
        return this.roundedExecutedNotional;
    }

    public final OrderSide getSide() {
        return this.side;
    }

    public final OrderState getState() {
        return this.state;
    }

    public final CryptoOrderType getType() {
        return this.type;
    }

    public final BigDecimal getEnteredPrice() {
        return this.enteredPrice;
    }

    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoOrder(String accountId, String str, String str2, String cumulativeQuantity, String currencyPairId, List<Execution> executions, String id, String price, String quantity, String roundedExecutedNotional, OrderSide side, OrderState state, CryptoOrderType type2, String str3, String updatedAt, String createdAt) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(cumulativeQuantity, "cumulativeQuantity");
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(roundedExecutedNotional, "roundedExecutedNotional");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        BigDecimal bigDecimal$default = str != null ? BigDecimalExtensions.toBigDecimal$default(str, (Long) null, (DecimalMode) null, 3, (Object) null) : null;
        BigDecimal bigDecimal$default2 = BigDecimalExtensions.toBigDecimal$default(cumulativeQuantity, (Long) null, (DecimalMode) null, 3, (Object) null);
        BigDecimal bigDecimal$default3 = BigDecimalExtensions.toBigDecimal$default(price, (Long) null, (DecimalMode) null, 3, (Object) null);
        BigDecimal bigDecimal$default4 = BigDecimalExtensions.toBigDecimal$default(quantity, (Long) null, (DecimalMode) null, 3, (Object) null);
        BigDecimal bigDecimal$default5 = BigDecimalExtensions.toBigDecimal$default(roundedExecutedNotional, (Long) null, (DecimalMode) null, 3, (Object) null);
        BigDecimal bigDecimal$default6 = str3 != null ? BigDecimalExtensions.toBigDecimal$default(str3, (Long) null, (DecimalMode) null, 3, (Object) null) : null;
        Instant.Companion companion = Instant.INSTANCE;
        this(accountId, bigDecimal$default, str2, bigDecimal$default2, currencyPairId, executions, id, bigDecimal$default3, bigDecimal$default4, bigDecimal$default5, side, state, type2, bigDecimal$default6, Instant.Companion.parse$default(companion, updatedAt, null, 2, null), Instant.Companion.parse$default(companion, createdAt, null, 2, null));
    }

    /* compiled from: CryptoOrder.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006Ba\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u001d\u0010\u0002\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u001d\u0010\u0005\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BC\u0012\u0019\u0010\u0002\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0019\u0010\u0005\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0017\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u001c\u0010\u0019\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\u001b\b\u0002\u0010\u0002\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001b\b\u0002\u0010\u0005\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J&\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÁ\u0001¢\u0006\u0002\b'R$\u0010\u0002\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/CryptoOrder$Execution;", "", "effectivePrice", "", "id", "quantity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "Lkotlinx/serialization/Serializable;", "with", "Lmicrogram/datasource/utils/BigDecimalSerializer;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;)V", "getEffectivePrice", "()Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "getId", "()Ljava/lang/String;", "getQuantity", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Execution {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BigDecimal effectivePrice;
        private final String id;
        private final BigDecimal quantity;

        public static /* synthetic */ Execution copy$default(Execution execution, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = execution.effectivePrice;
            }
            if ((i & 2) != 0) {
                str = execution.id;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = execution.quantity;
            }
            return execution.copy(bigDecimal, str, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getEffectivePrice() {
            return this.effectivePrice;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final Execution copy(BigDecimal effectivePrice, String id, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(effectivePrice, "effectivePrice");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            return new Execution(effectivePrice, id, quantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Execution)) {
                return false;
            }
            Execution execution = (Execution) other;
            return Intrinsics.areEqual(this.effectivePrice, execution.effectivePrice) && Intrinsics.areEqual(this.id, execution.id) && Intrinsics.areEqual(this.quantity, execution.quantity);
        }

        public int hashCode() {
            return (((this.effectivePrice.hashCode() * 31) + this.id.hashCode()) * 31) + this.quantity.hashCode();
        }

        public String toString() {
            return "Execution(effectivePrice=" + this.effectivePrice + ", id=" + this.id + ", quantity=" + this.quantity + ")";
        }

        /* compiled from: CryptoOrder.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/CryptoOrder$Execution$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/CryptoOrder$Execution;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Execution> serializer() {
                return CryptoOrder9.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ Execution(int i, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, CryptoOrder9.INSTANCE.getDescriptor());
            }
            this.effectivePrice = bigDecimal;
            this.id = str;
            this.quantity = bigDecimal2;
        }

        public Execution(BigDecimal effectivePrice, String id, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(effectivePrice, "effectivePrice");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.effectivePrice = effectivePrice;
            this.id = id;
            this.quantity = quantity;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(Execution self, Encoding3 output, SerialDescriptor serialDesc) {
            BigDecimalSerializer bigDecimalSerializer = BigDecimalSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 0, bigDecimalSerializer, self.effectivePrice);
            output.encodeStringElement(serialDesc, 1, self.id);
            output.encodeSerializableElement(serialDesc, 2, bigDecimalSerializer, self.quantity);
        }

        public final BigDecimal getEffectivePrice() {
            return this.effectivePrice;
        }

        public final String getId() {
            return this.id;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Execution(String effectivePrice, String id, String quantity) {
            this(BigDecimalExtensions.toBigDecimal$default(effectivePrice, (Long) null, (DecimalMode) null, 3, (Object) null), id, BigDecimalExtensions.toBigDecimal$default(quantity, (Long) null, (DecimalMode) null, 3, (Object) null));
            Intrinsics.checkNotNullParameter(effectivePrice, "effectivePrice");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
        }
    }
}
