package com.robinhood.libtradingtrends.contracts;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TradingTrendsTable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/libtradingtrends/contracts/TableColumn.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TableColumn;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes13.dex */
public final class TableColumn$$serializer implements PluginHelperInterfaces<TableColumn> {
    public static final TableColumn$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TableColumn$$serializer tableColumn$$serializer = new TableColumn$$serializer();
        INSTANCE = tableColumn$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.libtradingtrends.contracts.TableColumn", tableColumn$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("alignment", false);
        pluginGeneratedSerialDescriptor.addElement("width", false);
        pluginGeneratedSerialDescriptor.addElement("headerItem", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TableColumn$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, TableColumn.$childSerializers[1], BuiltinSerializers.getNullable(IntSerializer.INSTANCE), TableHeader$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public TableColumn deserialize(Decoding2 decoder) {
        int i;
        String str;
        TableColumnAlignment tableColumnAlignment;
        Integer num;
        TableHeader tableHeader;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = TableColumn.$childSerializers;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            TableColumnAlignment tableColumnAlignment2 = (TableColumnAlignment) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            Integer num2 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, null);
            tableColumnAlignment = tableColumnAlignment2;
            str = strDecodeStringElement2;
            tableHeader = (TableHeader) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, TableHeader$$serializer.INSTANCE, null);
            num = num2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            TableColumnAlignment tableColumnAlignment3 = null;
            Integer num3 = null;
            TableHeader tableHeader2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    tableColumnAlignment3 = (TableColumnAlignment) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], tableColumnAlignment3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    num3 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, num3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    tableHeader2 = (TableHeader) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, TableHeader$$serializer.INSTANCE, tableHeader2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            tableColumnAlignment = tableColumnAlignment3;
            num = num3;
            tableHeader = tableHeader2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new TableColumn(i, str, tableColumnAlignment, num, tableHeader, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, TableColumn value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        TableColumn.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
