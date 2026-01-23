package com.robinhood.android.options.simulatedreturnschart;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.serializers.InstantSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes11.dex */
public /* synthetic */ class SimulatedReturnsParams$$serializer implements PluginHelperInterfaces<SimulatedReturnsParams> {
    public static final int $stable;
    public static final SimulatedReturnsParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private SimulatedReturnsParams$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SimulatedReturnsParams$$serializer simulatedReturnsParams$$serializer = new SimulatedReturnsParams$$serializer();
        INSTANCE = simulatedReturnsParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsParams", simulatedReturnsParams$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("now", false);
        pluginGeneratedSerialDescriptor.addElement("spotPrice", false);
        pluginGeneratedSerialDescriptor.addElement("averageOpeningPrice", false);
        pluginGeneratedSerialDescriptor.addElement("isOrderCredit", false);
        pluginGeneratedSerialDescriptor.addElement("legs", false);
        pluginGeneratedSerialDescriptor.addElement("usePercentageReturns", false);
        pluginGeneratedSerialDescriptor.addElement("insets", false);
        pluginGeneratedSerialDescriptor.addElement("quantity", false);
        pluginGeneratedSerialDescriptor.addElement("returnSingleCursorDataPoint", false);
        pluginGeneratedSerialDescriptor.addElement("returnRoundedDataPoints", true);
        pluginGeneratedSerialDescriptor.addElement("maxVerticalGridlines", false);
        pluginGeneratedSerialDescriptor.addElement("maxHorizontalGridlines", false);
        pluginGeneratedSerialDescriptor.addElement("tradeValueMultiplier", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        Lazy[] lazyArr = SimulatedReturnsParams.$childSerializers;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{InstantSerializers.INSTANCE, doubleSerializer, doubleSerializer, booleanSerializer, lazyArr[4].getValue(), booleanSerializer, SimulatedReturnsChartInsets$$serializer.INSTANCE, intSerializer, booleanSerializer, booleanSerializer, intSerializer, intSerializer, doubleSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final SimulatedReturnsParams deserialize(Decoding2 decoder) {
        List list;
        boolean z;
        Instant instant;
        int i;
        SimulatedReturnsChartInsets simulatedReturnsChartInsets;
        int iDecodeIntElement;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int iDecodeIntElement2;
        double dDecodeDoubleElement;
        double d;
        double d2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SimulatedReturnsParams.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        if (decodingBeginStructure.decodeSequentially()) {
            Instant instant2 = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, InstantSerializers.INSTANCE, null);
            double dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 1);
            double dDecodeDoubleElement3 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            List list2 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 4, (KSerializer2) lazyArr[4].getValue(), null);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            SimulatedReturnsChartInsets simulatedReturnsChartInsets2 = (SimulatedReturnsChartInsets) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 6, SimulatedReturnsChartInsets$$serializer.INSTANCE, null);
            int iDecodeIntElement3 = decodingBeginStructure.decodeIntElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            list = list2;
            instant = instant2;
            z = zDecodeBooleanElement;
            simulatedReturnsChartInsets = simulatedReturnsChartInsets2;
            iDecodeIntElement = decodingBeginStructure.decodeIntElement(serialDescriptor, 10);
            z2 = zDecodeBooleanElement4;
            i2 = iDecodeIntElement3;
            z3 = zDecodeBooleanElement3;
            z4 = zDecodeBooleanElement2;
            iDecodeIntElement2 = decodingBeginStructure.decodeIntElement(serialDescriptor, 11);
            dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 12);
            i = 8191;
            d = dDecodeDoubleElement2;
            d2 = dDecodeDoubleElement3;
        } else {
            int i5 = 12;
            int i6 = 0;
            boolean zDecodeBooleanElement5 = false;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            int iDecodeIntElement5 = 0;
            Instant instant3 = null;
            boolean z5 = true;
            double dDecodeDoubleElement4 = 0.0d;
            double dDecodeDoubleElement5 = 0.0d;
            double dDecodeDoubleElement6 = 0.0d;
            boolean zDecodeBooleanElement8 = false;
            int iDecodeIntElement6 = 0;
            List list3 = null;
            SimulatedReturnsChartInsets simulatedReturnsChartInsets3 = null;
            while (z5) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i3 = 10;
                        i4 = 9;
                    case 0:
                        instant3 = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, InstantSerializers.INSTANCE, instant3);
                        i6 |= 1;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                    case 1:
                        dDecodeDoubleElement5 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 12;
                    case 2:
                        dDecodeDoubleElement6 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 12;
                    case 3:
                        zDecodeBooleanElement8 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 12;
                    case 4:
                        list3 = (List) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 4, (KSerializer2) lazyArr[4].getValue(), list3);
                        i6 |= 16;
                        i5 = 12;
                    case 5:
                        zDecodeBooleanElement7 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i6 |= 32;
                        i5 = 12;
                    case 6:
                        simulatedReturnsChartInsets3 = (SimulatedReturnsChartInsets) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 6, SimulatedReturnsChartInsets$$serializer.INSTANCE, simulatedReturnsChartInsets3);
                        i6 |= 64;
                        i5 = 12;
                    case 7:
                        iDecodeIntElement4 = decodingBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i6 |= 128;
                    case 8:
                        zDecodeBooleanElement6 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i6 |= 256;
                    case 9:
                        zDecodeBooleanElement5 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i6 |= 512;
                    case 10:
                        iDecodeIntElement6 = decodingBeginStructure.decodeIntElement(serialDescriptor, i3);
                        i6 |= 1024;
                    case 11:
                        iDecodeIntElement5 = decodingBeginStructure.decodeIntElement(serialDescriptor, 11);
                        i6 |= 2048;
                    case 12:
                        dDecodeDoubleElement4 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, i5);
                        i6 |= 4096;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            list = list3;
            z = zDecodeBooleanElement8;
            instant = instant3;
            i = i6;
            simulatedReturnsChartInsets = simulatedReturnsChartInsets3;
            iDecodeIntElement = iDecodeIntElement6;
            z2 = zDecodeBooleanElement5;
            i2 = iDecodeIntElement4;
            z3 = zDecodeBooleanElement6;
            z4 = zDecodeBooleanElement7;
            iDecodeIntElement2 = iDecodeIntElement5;
            dDecodeDoubleElement = dDecodeDoubleElement4;
            d = dDecodeDoubleElement5;
            d2 = dDecodeDoubleElement6;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new SimulatedReturnsParams(i, instant, d, d2, z, list, z4, simulatedReturnsChartInsets, i2, z3, z2, iDecodeIntElement, iDecodeIntElement2, dDecodeDoubleElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, SimulatedReturnsParams value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        SimulatedReturnsParams.write$Self$lib_options_simulated_returns_chart_externalDebug(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
