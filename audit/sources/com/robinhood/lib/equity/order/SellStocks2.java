package com.robinhood.lib.equity.order;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.datasource.utils.BigDecimalSerializer;

/* compiled from: SellStocks.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/lib/equity/order/SellStocksBody.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/lib/equity/order/SellStocksBody;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.lib.equity.order.SellStocksBody$$serializer, reason: use source file name */
/* loaded from: classes27.dex */
public final class SellStocks2 implements PluginHelperInterfaces<SellStocksBody> {
    public static final SellStocks2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SellStocks2 sellStocks2 = new SellStocks2();
        INSTANCE = sellStocks2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.lib.equity.order.SellStocksBody", sellStocks2, 12);
        pluginGeneratedSerialDescriptor.addElement("quantity", false);
        pluginGeneratedSerialDescriptor.addElement("symbol", false);
        pluginGeneratedSerialDescriptor.addElement("account", false);
        pluginGeneratedSerialDescriptor.addElement("instrument", false);
        pluginGeneratedSerialDescriptor.addElement("ref_id", false);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("trigger", true);
        pluginGeneratedSerialDescriptor.addElement("order_form_version", true);
        pluginGeneratedSerialDescriptor.addElement("time_in_force", true);
        pluginGeneratedSerialDescriptor.addElement("market_hours", true);
        pluginGeneratedSerialDescriptor.addElement("extended_hours", true);
        pluginGeneratedSerialDescriptor.addElement("side", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SellStocks2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BigDecimalSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SellStocksBody deserialize(Decoding2 decoder) {
        boolean z;
        BigDecimal bigDecimal;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 0;
        if (decodingBeginStructure.decodeSequentially()) {
            BigDecimal bigDecimal2 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, BigDecimalSerializer.INSTANCE, null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            String strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(descriptor2, 6);
            int iDecodeIntElement = decodingBeginStructure.decodeIntElement(descriptor2, 7);
            String strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(descriptor2, 8);
            String strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(descriptor2, 9);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 10);
            i5 = 4095;
            bigDecimal = bigDecimal2;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 11);
            z = zDecodeBooleanElement;
            str8 = strDecodeStringElement9;
            i = iDecodeIntElement;
            str6 = strDecodeStringElement7;
            str5 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            str7 = strDecodeStringElement8;
            str4 = strDecodeStringElement5;
            str2 = strDecodeStringElement3;
            str = strDecodeStringElement2;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            BigDecimal bigDecimal3 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            int iDecodeIntElement2 = 0;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 10;
                        i4 = 9;
                    case 0:
                        bigDecimal3 = (BigDecimal) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, BigDecimalSerializer.INSTANCE, bigDecimal3);
                        i5 |= 1;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                    case 1:
                        strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i5 |= 2;
                    case 2:
                        strDecodeStringElement11 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i5 |= 4;
                    case 3:
                        strDecodeStringElement12 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i5 |= 8;
                    case 4:
                        strDecodeStringElement13 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i5 |= 16;
                    case 5:
                        strDecodeStringElement14 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
                        i5 |= 32;
                    case 6:
                        strDecodeStringElement15 = decodingBeginStructure.decodeStringElement(descriptor2, 6);
                        i5 |= 64;
                    case 7:
                        iDecodeIntElement2 = decodingBeginStructure.decodeIntElement(descriptor2, 7);
                        i5 |= 128;
                    case 8:
                        strDecodeStringElement16 = decodingBeginStructure.decodeStringElement(descriptor2, 8);
                        i5 |= 256;
                    case 9:
                        strDecodeStringElement17 = decodingBeginStructure.decodeStringElement(descriptor2, i4);
                        i5 |= 512;
                    case 10:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, i3);
                        i5 |= 1024;
                    case 11:
                        strDecodeStringElement18 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i5 |= 2048;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            bigDecimal = bigDecimal3;
            i = iDecodeIntElement2;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement13;
            str5 = strDecodeStringElement14;
            str6 = strDecodeStringElement15;
            str7 = strDecodeStringElement16;
            str8 = strDecodeStringElement17;
            strDecodeStringElement = strDecodeStringElement18;
        }
        int i6 = i5;
        decodingBeginStructure.endStructure(descriptor2);
        return new SellStocksBody(i6, bigDecimal, str, str2, str3, str4, str5, str6, i, str7, str8, z, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SellStocksBody value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SellStocksBody.write$Self$lib_equity_store(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
