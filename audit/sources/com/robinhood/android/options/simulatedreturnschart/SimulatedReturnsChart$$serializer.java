package com.robinhood.android.options.simulatedreturnschart;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes11.dex */
public /* synthetic */ class SimulatedReturnsChart$$serializer implements PluginHelperInterfaces<SimulatedReturnsChart> {
    public static final int $stable;
    public static final SimulatedReturnsChart$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private SimulatedReturnsChart$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SimulatedReturnsChart$$serializer simulatedReturnsChart$$serializer = new SimulatedReturnsChart$$serializer();
        INSTANCE = simulatedReturnsChart$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsChart", simulatedReturnsChart$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("line", false);
        pluginGeneratedSerialDescriptor.addElement("xAxis", false);
        pluginGeneratedSerialDescriptor.addElement("yAxis", false);
        pluginGeneratedSerialDescriptor.addElement("maxProfit", false);
        pluginGeneratedSerialDescriptor.addElement("maxLoss", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = SimulatedReturnsChart.$childSerializers;
        SimulatedReturnsGridLine$$serializer simulatedReturnsGridLine$$serializer = SimulatedReturnsGridLine$$serializer.INSTANCE;
        return new KSerializer[]{SimulatedReturnsLine$$serializer.INSTANCE, lazyArr[1].getValue(), lazyArr[2].getValue(), BuiltinSerializers.getNullable(simulatedReturnsGridLine$$serializer), BuiltinSerializers.getNullable(simulatedReturnsGridLine$$serializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final SimulatedReturnsChart deserialize(Decoding2 decoder) {
        int i;
        SimulatedReturnsLine simulatedReturnsLine;
        List list;
        List list2;
        SimulatedReturnsGridLine simulatedReturnsGridLine;
        SimulatedReturnsGridLine simulatedReturnsGridLine2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SimulatedReturnsChart.$childSerializers;
        SimulatedReturnsLine simulatedReturnsLine2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SimulatedReturnsLine simulatedReturnsLine3 = (SimulatedReturnsLine) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, SimulatedReturnsLine$$serializer.INSTANCE, null);
            List list3 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer2) lazyArr[1].getValue(), null);
            List list4 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 2, (KSerializer2) lazyArr[2].getValue(), null);
            SimulatedReturnsGridLine$$serializer simulatedReturnsGridLine$$serializer = SimulatedReturnsGridLine$$serializer.INSTANCE;
            list2 = list4;
            simulatedReturnsLine = simulatedReturnsLine3;
            simulatedReturnsGridLine = (SimulatedReturnsGridLine) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, simulatedReturnsGridLine$$serializer, null);
            simulatedReturnsGridLine2 = (SimulatedReturnsGridLine) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, simulatedReturnsGridLine$$serializer, null);
            i = 31;
            list = list3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list5 = null;
            List list6 = null;
            SimulatedReturnsGridLine simulatedReturnsGridLine3 = null;
            SimulatedReturnsGridLine simulatedReturnsGridLine4 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    simulatedReturnsLine2 = (SimulatedReturnsLine) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, SimulatedReturnsLine$$serializer.INSTANCE, simulatedReturnsLine2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list5 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, (KSerializer2) lazyArr[1].getValue(), list5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list6 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 2, (KSerializer2) lazyArr[2].getValue(), list6);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    simulatedReturnsGridLine3 = (SimulatedReturnsGridLine) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, SimulatedReturnsGridLine$$serializer.INSTANCE, simulatedReturnsGridLine3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    simulatedReturnsGridLine4 = (SimulatedReturnsGridLine) decodingBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SimulatedReturnsGridLine$$serializer.INSTANCE, simulatedReturnsGridLine4);
                    i2 |= 16;
                }
            }
            i = i2;
            simulatedReturnsLine = simulatedReturnsLine2;
            list = list5;
            list2 = list6;
            simulatedReturnsGridLine = simulatedReturnsGridLine3;
            simulatedReturnsGridLine2 = simulatedReturnsGridLine4;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new SimulatedReturnsChart(i, simulatedReturnsLine, list, list2, simulatedReturnsGridLine, simulatedReturnsGridLine2, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, SimulatedReturnsChart value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        SimulatedReturnsChart.write$Self$lib_options_simulated_returns_chart_externalDebug(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
