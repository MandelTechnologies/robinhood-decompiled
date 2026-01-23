package com.robinhood.libtradingtrends.contracts;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TradingTrendsTable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/libtradingtrends/contracts/TradingTrendsTable.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes13.dex */
public final class TradingTrendsTable$$serializer implements PluginHelperInterfaces<TradingTrendsTable> {
    public static final TradingTrendsTable$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TradingTrendsTable$$serializer tradingTrendsTable$$serializer = new TradingTrendsTable$$serializer();
        INSTANCE = tradingTrendsTable$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.libtradingtrends.contracts.TradingTrendsTable", tradingTrendsTable$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("selectedType", false);
        pluginGeneratedSerialDescriptor.addElement("sortKey", false);
        pluginGeneratedSerialDescriptor.addElement("sortDirection", false);
        pluginGeneratedSerialDescriptor.addElement("availableSortKeys", true);
        pluginGeneratedSerialDescriptor.addElement("columns", false);
        pluginGeneratedSerialDescriptor.addElement("rows", false);
        pluginGeneratedSerialDescriptor.addElement(OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TradingTrendsTable$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TradingTrendsTable.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), kSerializerArr[3], kSerializerArr[4], kSerializerArr[5], BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public TradingTrendsTable deserialize(Decoding2 decoder) {
        int i;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        List list2;
        List list3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = TradingTrendsTable.$childSerializers;
        int i2 = 6;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            String str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            List list4 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            List list5 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            list = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            str2 = strDecodeStringElement2;
            str = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            str4 = str6;
            i = 127;
            list2 = list4;
            list3 = list5;
            str3 = str5;
        } else {
            boolean z = true;
            int i3 = 0;
            String str7 = null;
            List list6 = null;
            String str8 = null;
            String str9 = null;
            List list7 = null;
            List list8 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                    case 0:
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str8);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str9);
                        i3 |= 4;
                        i2 = 6;
                    case 3:
                        list7 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], list7);
                        i3 |= 8;
                    case 4:
                        list8 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], list8);
                        i3 |= 16;
                    case 5:
                        list6 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], list6);
                        i3 |= 32;
                    case 6:
                        str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str7);
                        i3 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str7;
            list = list6;
            str2 = strDecodeStringElement;
            str3 = str8;
            str4 = str9;
            list2 = list7;
            list3 = list8;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new TradingTrendsTable(i, str2, str3, str4, list2, list3, list, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, TradingTrendsTable value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        TradingTrendsTable.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
