package com.robinhood.rhc.upsells;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.serializers.InstantSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import microgram.datasource.utils.BigDecimalSerializer;

/* compiled from: CryptoOrder.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/rhc/upsells/CryptoOrder.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/rhc/upsells/CryptoOrder;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.rhc.upsells.CryptoOrder$$serializer, reason: use source file name */
/* loaded from: classes26.dex */
public final class CryptoOrder8 implements PluginHelperInterfaces<CryptoOrder> {
    public static final CryptoOrder8 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CryptoOrder8 cryptoOrder8 = new CryptoOrder8();
        INSTANCE = cryptoOrder8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.rhc.upsells.CryptoOrder", cryptoOrder8, 16);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("averagePrice", false);
        pluginGeneratedSerialDescriptor.addElement("cancelUrl", false);
        pluginGeneratedSerialDescriptor.addElement("cumulativeQuantity", false);
        pluginGeneratedSerialDescriptor.addElement("currencyPairId", false);
        pluginGeneratedSerialDescriptor.addElement("executions", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement(AnalyticsStrings.TAG_SORT_ORDER_PRICE, false);
        pluginGeneratedSerialDescriptor.addElement("quantity", false);
        pluginGeneratedSerialDescriptor.addElement("roundedExecutedNotional", false);
        pluginGeneratedSerialDescriptor.addElement("side", false);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("enteredPrice", false);
        pluginGeneratedSerialDescriptor.addElement("updatedAt", false);
        pluginGeneratedSerialDescriptor.addElement("createdAt", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CryptoOrder8() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CryptoOrder.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BigDecimalSerializer bigDecimalSerializer = BigDecimalSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(bigDecimalSerializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> kSerializer = kSerializerArr[5];
        KSerializer<?> kSerializer2 = kSerializerArr[10];
        KSerializer<?> kSerializer3 = kSerializerArr[11];
        KSerializer<?> kSerializer4 = kSerializerArr[12];
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(bigDecimalSerializer);
        InstantSerializers instantSerializers = InstantSerializers.INSTANCE;
        return new KSerializer[]{stringSerializer, nullable, nullable2, bigDecimalSerializer, stringSerializer, kSerializer, stringSerializer, bigDecimalSerializer, bigDecimalSerializer, bigDecimalSerializer, kSerializer2, kSerializer3, kSerializer4, nullable3, instantSerializers, instantSerializers};
    }

    @Override // kotlinx.serialization.KSerializer2
    public CryptoOrder deserialize(Decoding2 decoder) {
        BigDecimal bigDecimal;
        OrderSide orderSide;
        List list;
        Instant instant;
        CryptoOrderType cryptoOrderType;
        OrderState orderState;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        BigDecimal bigDecimal5;
        BigDecimal bigDecimal6;
        Instant instant2;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = CryptoOrder.$childSerializers;
        Instant instant3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            BigDecimalSerializer bigDecimalSerializer = BigDecimalSerializer.INSTANCE;
            BigDecimal bigDecimal7 = (BigDecimal) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, bigDecimalSerializer, null);
            String str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            BigDecimal bigDecimal8 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, bigDecimalSerializer, null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            List list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 6);
            BigDecimal bigDecimal9 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, bigDecimalSerializer, null);
            BigDecimal bigDecimal10 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, bigDecimalSerializer, null);
            BigDecimal bigDecimal11 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, bigDecimalSerializer, null);
            OrderSide orderSide2 = (OrderSide) decodingBeginStructure.decodeSerializableElement(descriptor2, 10, kSerializerArr[10], null);
            OrderState orderState2 = (OrderState) decodingBeginStructure.decodeSerializableElement(descriptor2, 11, kSerializerArr[11], null);
            CryptoOrderType cryptoOrderType2 = (CryptoOrderType) decodingBeginStructure.decodeSerializableElement(descriptor2, 12, kSerializerArr[12], null);
            BigDecimal bigDecimal12 = (BigDecimal) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 13, bigDecimalSerializer, null);
            InstantSerializers instantSerializers = InstantSerializers.INSTANCE;
            Instant instant4 = (Instant) decodingBeginStructure.decodeSerializableElement(descriptor2, 14, instantSerializers, null);
            instant2 = (Instant) decodingBeginStructure.decodeSerializableElement(descriptor2, 15, instantSerializers, null);
            str4 = strDecodeStringElement;
            str2 = str7;
            list = list2;
            bigDecimal = bigDecimal7;
            bigDecimal4 = bigDecimal11;
            bigDecimal5 = bigDecimal9;
            str3 = strDecodeStringElement3;
            bigDecimal6 = bigDecimal8;
            bigDecimal2 = bigDecimal10;
            str = strDecodeStringElement2;
            bigDecimal3 = bigDecimal12;
            i = 65535;
            instant = instant4;
            cryptoOrderType = cryptoOrderType2;
            orderState = orderState2;
            orderSide = orderSide2;
        } else {
            int i2 = 5;
            boolean z = true;
            int i3 = 0;
            BigDecimal bigDecimal13 = null;
            String str8 = null;
            OrderSide orderSide3 = null;
            List list3 = null;
            Instant instant5 = null;
            CryptoOrderType cryptoOrderType3 = null;
            OrderState orderState3 = null;
            BigDecimal bigDecimal14 = null;
            BigDecimal bigDecimal15 = null;
            BigDecimal bigDecimal16 = null;
            BigDecimal bigDecimal17 = null;
            BigDecimal bigDecimal18 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                BigDecimal bigDecimal19 = bigDecimal13;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        str8 = str8;
                        i2 = 5;
                        bigDecimal13 = bigDecimal19;
                        i3 = i3;
                    case 0:
                        str6 = str8;
                        strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        bigDecimal13 = bigDecimal19;
                        i3 |= 1;
                        str8 = str6;
                        i2 = 5;
                    case 1:
                        str6 = str8;
                        bigDecimal13 = (BigDecimal) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, BigDecimalSerializer.INSTANCE, bigDecimal19);
                        i3 |= 2;
                        str8 = str6;
                        i2 = 5;
                    case 2:
                        str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str8);
                        i3 |= 4;
                        bigDecimal13 = bigDecimal19;
                        i2 = 5;
                    case 3:
                        bigDecimal18 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, BigDecimalSerializer.INSTANCE, bigDecimal18);
                        i3 |= 8;
                        bigDecimal13 = bigDecimal19;
                        str8 = str8;
                        i2 = 5;
                    case 4:
                        str5 = str8;
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i3 |= 16;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 5:
                        str5 = str8;
                        list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, kSerializerArr[i2], list3);
                        i3 |= 32;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 6:
                        str5 = str8;
                        strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 6);
                        i3 |= 64;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 7:
                        str5 = str8;
                        bigDecimal17 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, BigDecimalSerializer.INSTANCE, bigDecimal17);
                        i3 |= 128;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 8:
                        str5 = str8;
                        bigDecimal14 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, BigDecimalSerializer.INSTANCE, bigDecimal14);
                        i3 |= 256;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 9:
                        str5 = str8;
                        bigDecimal16 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, BigDecimalSerializer.INSTANCE, bigDecimal16);
                        i3 |= 512;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 10:
                        str5 = str8;
                        orderSide3 = (OrderSide) decodingBeginStructure.decodeSerializableElement(descriptor2, 10, kSerializerArr[10], orderSide3);
                        i3 |= 1024;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 11:
                        str5 = str8;
                        orderState3 = (OrderState) decodingBeginStructure.decodeSerializableElement(descriptor2, 11, kSerializerArr[11], orderState3);
                        i3 |= 2048;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 12:
                        str5 = str8;
                        cryptoOrderType3 = (CryptoOrderType) decodingBeginStructure.decodeSerializableElement(descriptor2, 12, kSerializerArr[12], cryptoOrderType3);
                        i3 |= 4096;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 13:
                        str5 = str8;
                        bigDecimal15 = (BigDecimal) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 13, BigDecimalSerializer.INSTANCE, bigDecimal15);
                        i3 |= 8192;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 14:
                        str5 = str8;
                        instant5 = (Instant) decodingBeginStructure.decodeSerializableElement(descriptor2, 14, InstantSerializers.INSTANCE, instant5);
                        i3 |= 16384;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    case 15:
                        str5 = str8;
                        instant3 = (Instant) decodingBeginStructure.decodeSerializableElement(descriptor2, 15, InstantSerializers.INSTANCE, instant3);
                        i3 |= 32768;
                        bigDecimal13 = bigDecimal19;
                        str8 = str5;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            bigDecimal = bigDecimal13;
            orderSide = orderSide3;
            list = list3;
            instant = instant5;
            cryptoOrderType = cryptoOrderType3;
            orderState = orderState3;
            bigDecimal2 = bigDecimal14;
            bigDecimal3 = bigDecimal15;
            bigDecimal4 = bigDecimal16;
            bigDecimal5 = bigDecimal17;
            bigDecimal6 = bigDecimal18;
            instant2 = instant3;
            str = strDecodeStringElement4;
            str2 = str8;
            str3 = strDecodeStringElement5;
            i = i3;
            str4 = strDecodeStringElement6;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new CryptoOrder(i, str4, bigDecimal, str2, bigDecimal6, str, list, str3, bigDecimal5, bigDecimal2, bigDecimal4, orderSide, orderState, cryptoOrderType, bigDecimal3, instant, instant2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, CryptoOrder value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        CryptoOrder.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
