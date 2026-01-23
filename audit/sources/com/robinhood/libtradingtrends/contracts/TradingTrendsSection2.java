package com.robinhood.libtradingtrends.contracts;

import java.util.List;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.sdui.SduiChartGroup;
import microgram.p507ui.sdui.SduiChartGroup$$serializer;

/* compiled from: TradingTrendsSection.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/libtradingtrends/contracts/TradingTrendsSection.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.libtradingtrends.contracts.TradingTrendsSection$$serializer, reason: use source file name */
/* loaded from: classes13.dex */
public final class TradingTrendsSection2 implements PluginHelperInterfaces<TradingTrendsSection> {
    public static final TradingTrendsSection2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TradingTrendsSection2 tradingTrendsSection2 = new TradingTrendsSection2();
        INSTANCE = tradingTrendsSection2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.libtradingtrends.contracts.TradingTrendsSection", tradingTrendsSection2, 7);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("segmentedControlOptions", false);
        pluginGeneratedSerialDescriptor.addElement("selectedType", false);
        pluginGeneratedSerialDescriptor.addElement("chart", false);
        pluginGeneratedSerialDescriptor.addElement("expandButtonAccessibilityLabel", false);
        pluginGeneratedSerialDescriptor.addElement("insightsPanelText", false);
        pluginGeneratedSerialDescriptor.addElement("sourceText", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TradingTrendsSection2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TradingTrendsSection.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, SduiChartGroup$$serializer.INSTANCE, BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public TradingTrendsSection deserialize(Decoding2 decoder) {
        int i;
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        SduiChartGroup sduiChartGroup;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = TradingTrendsSection.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            List list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            SduiChartGroup sduiChartGroup2 = (SduiChartGroup) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, SduiChartGroup$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            String str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            list = list2;
            str3 = strDecodeStringElement2;
            str = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            str2 = str7;
            sduiChartGroup = sduiChartGroup2;
            str5 = str6;
            str4 = strDecodeStringElement3;
            i = 127;
        } else {
            boolean z = true;
            int i4 = 0;
            String str8 = null;
            String str9 = null;
            List list3 = null;
            String strDecodeStringElement4 = null;
            SduiChartGroup sduiChartGroup3 = null;
            String str10 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], list3);
                        i4 |= 2;
                        i2 = 6;
                        i3 = 5;
                    case 2:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i4 |= 4;
                    case 3:
                        sduiChartGroup3 = (SduiChartGroup) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, SduiChartGroup$$serializer.INSTANCE, sduiChartGroup3);
                        i4 |= 8;
                    case 4:
                        str10 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str10);
                        i4 |= 16;
                    case 5:
                        str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, StringSerializer.INSTANCE, str9);
                        i4 |= 32;
                    case 6:
                        str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str8);
                        i4 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i4;
            str = str8;
            str2 = str9;
            str3 = strDecodeStringElement;
            list = list3;
            str4 = strDecodeStringElement4;
            sduiChartGroup = sduiChartGroup3;
            str5 = str10;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new TradingTrendsSection(i, str3, list, str4, sduiChartGroup, str5, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, TradingTrendsSection value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        TradingTrendsSection.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
