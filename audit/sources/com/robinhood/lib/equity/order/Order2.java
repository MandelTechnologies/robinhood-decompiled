package com.robinhood.lib.equity.order;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import microgram.datasource.bonfire.models.Money;
import microgram.datasource.bonfire.models.Money7;
import microgram.datasource.utils.BigDecimalSerializer;

/* compiled from: Order.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/lib/equity/order/Order.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/lib/equity/order/Order;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.lib.equity.order.Order$$serializer, reason: use source file name */
/* loaded from: classes27.dex */
public final class Order2 implements PluginHelperInterfaces<Order> {
    public static final Order2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Order2 order2 = new Order2();
        INSTANCE = order2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.lib.equity.order.Order", order2, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement("side", false);
        pluginGeneratedSerialDescriptor.addElement("quantity", false);
        pluginGeneratedSerialDescriptor.addElement("trigger", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("instrument", false);
        pluginGeneratedSerialDescriptor.addElement("preset_percent_limit", false);
        pluginGeneratedSerialDescriptor.addElement("trailing_peg", false);
        pluginGeneratedSerialDescriptor.addElement("dollar_based_amount", false);
        pluginGeneratedSerialDescriptor.addElement("executed_notional", false);
        pluginGeneratedSerialDescriptor.addElement("is_ipo_access_order", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Order2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = Order.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[1];
        KSerializer<?> kSerializer2 = kSerializerArr[2];
        BigDecimalSerializer bigDecimalSerializer = BigDecimalSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(bigDecimalSerializer);
        KSerializer<?> kSerializer3 = kSerializerArr[4];
        KSerializer<?> kSerializer4 = kSerializerArr[5];
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(bigDecimalSerializer);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(OrderTrailingPeg2.INSTANCE);
        Money7 money7 = Money7.INSTANCE;
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(money7);
        KSerializer<?> nullable5 = BuiltinSerializers.getNullable(money7);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializer, kSerializer2, nullable, kSerializer3, kSerializer4, stringSerializer, nullable2, nullable3, nullable4, nullable5, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public Order deserialize(Decoding2 decoder) {
        String str;
        OrderState orderState;
        Money money;
        Money money2;
        OrderType orderType;
        int i;
        OrderTrailingPeg orderTrailingPeg;
        BigDecimal bigDecimal;
        OrderTrigger orderTrigger;
        BigDecimal bigDecimal2;
        OrderSide orderSide;
        String str2;
        boolean zDecodeBooleanElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = Order.$childSerializers;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            OrderState orderState2 = (OrderState) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            OrderSide orderSide2 = (OrderSide) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            BigDecimalSerializer bigDecimalSerializer = BigDecimalSerializer.INSTANCE;
            BigDecimal bigDecimal3 = (BigDecimal) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, bigDecimalSerializer, null);
            OrderTrigger orderTrigger2 = (OrderTrigger) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            OrderType orderType2 = (OrderType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 6);
            BigDecimal bigDecimal4 = (BigDecimal) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, bigDecimalSerializer, null);
            OrderTrailingPeg orderTrailingPeg2 = (OrderTrailingPeg) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, OrderTrailingPeg2.INSTANCE, null);
            Money7 money7 = Money7.INSTANCE;
            Money money3 = (Money) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, money7, null);
            orderType = orderType2;
            str = strDecodeStringElement2;
            money = (Money) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 10, money7, null);
            orderTrigger = orderTrigger2;
            money2 = money3;
            bigDecimal = bigDecimal4;
            str2 = strDecodeStringElement3;
            bigDecimal2 = bigDecimal3;
            orderTrailingPeg = orderTrailingPeg2;
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 11);
            i = 4095;
            orderSide = orderSide2;
            orderState = orderState2;
        } else {
            int i2 = 11;
            OrderState orderState3 = null;
            Money money4 = null;
            Money money5 = null;
            OrderType orderType3 = null;
            String strDecodeStringElement4 = null;
            int i3 = 5;
            int i4 = 4;
            int i5 = 2;
            boolean z = true;
            int i6 = 0;
            boolean zDecodeBooleanElement2 = false;
            OrderTrailingPeg orderTrailingPeg3 = null;
            BigDecimal bigDecimal5 = null;
            OrderTrigger orderTrigger3 = null;
            BigDecimal bigDecimal6 = null;
            OrderSide orderSide3 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 11;
                        i5 = 2;
                        i4 = 4;
                        i3 = 5;
                    case 0:
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i6 |= 1;
                        i2 = 11;
                        i5 = 2;
                        i4 = 4;
                        i3 = 5;
                    case 1:
                        orderState3 = (OrderState) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], orderState3);
                        i6 |= 2;
                        i2 = 11;
                        i5 = 2;
                        i4 = 4;
                        i3 = 5;
                    case 2:
                        orderSide3 = (OrderSide) decodingBeginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], orderSide3);
                        i6 |= 4;
                        i2 = 11;
                        i4 = 4;
                        i3 = 5;
                    case 3:
                        bigDecimal6 = (BigDecimal) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, BigDecimalSerializer.INSTANCE, bigDecimal6);
                        i6 |= 8;
                        i2 = 11;
                        i4 = 4;
                        i3 = 5;
                    case 4:
                        orderTrigger3 = (OrderTrigger) decodingBeginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], orderTrigger3);
                        i6 |= 16;
                        i2 = 11;
                        i3 = 5;
                    case 5:
                        orderType3 = (OrderType) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], orderType3);
                        i6 |= 32;
                        i2 = 11;
                    case 6:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 6);
                        i6 |= 64;
                        i2 = 11;
                    case 7:
                        bigDecimal5 = (BigDecimal) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, BigDecimalSerializer.INSTANCE, bigDecimal5);
                        i6 |= 128;
                        i2 = 11;
                    case 8:
                        orderTrailingPeg3 = (OrderTrailingPeg) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, OrderTrailingPeg2.INSTANCE, orderTrailingPeg3);
                        i6 |= 256;
                        i2 = 11;
                    case 9:
                        money5 = (Money) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, Money7.INSTANCE, money5);
                        i6 |= 512;
                        i2 = 11;
                    case 10:
                        money4 = (Money) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 10, Money7.INSTANCE, money4);
                        i6 |= 1024;
                        i2 = 11;
                    case 11:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, i2);
                        i6 |= 2048;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement;
            orderState = orderState3;
            money = money4;
            money2 = money5;
            orderType = orderType3;
            i = i6;
            orderTrailingPeg = orderTrailingPeg3;
            bigDecimal = bigDecimal5;
            orderTrigger = orderTrigger3;
            bigDecimal2 = bigDecimal6;
            orderSide = orderSide3;
            str2 = strDecodeStringElement4;
            zDecodeBooleanElement = zDecodeBooleanElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new Order(i, str, orderState, orderSide, bigDecimal2, orderTrigger, orderType, str2, bigDecimal, orderTrailingPeg, money2, money, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, Order value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        Order.write$Self$lib_equity_store(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
