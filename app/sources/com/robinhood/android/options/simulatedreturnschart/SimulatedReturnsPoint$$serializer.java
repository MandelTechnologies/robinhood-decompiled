package com.robinhood.android.options.simulatedreturnschart;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.serializers.InstantSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/android/options/simulatedreturnschart/SimulatedReturnsPoint.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsPoint;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes11.dex */
public /* synthetic */ class SimulatedReturnsPoint$$serializer implements PluginHelperInterfaces<SimulatedReturnsPoint> {
    public static final int $stable;
    public static final SimulatedReturnsPoint$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private SimulatedReturnsPoint$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SimulatedReturnsPoint$$serializer simulatedReturnsPoint$$serializer = new SimulatedReturnsPoint$$serializer();
        INSTANCE = simulatedReturnsPoint$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsPoint", simulatedReturnsPoint$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("isBreakevenPoint", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("theoreticalPrice", false);
        pluginGeneratedSerialDescriptor.addElement("theoreticalPriceRounded", false);
        pluginGeneratedSerialDescriptor.addElement("theoreticalReturn", false);
        pluginGeneratedSerialDescriptor.addElement("theoreticalReturnRounded", false);
        pluginGeneratedSerialDescriptor.addElement("theoreticalReturnPercent", false);
        pluginGeneratedSerialDescriptor.addElement("timestampLabel", false);
        pluginGeneratedSerialDescriptor.addElement("usingPercentageReturns", false);
        pluginGeneratedSerialDescriptor.addElement("x", false);
        pluginGeneratedSerialDescriptor.addElement("y", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, InstantSerializers.INSTANCE, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, StringSerializer.INSTANCE, booleanSerializer, doubleSerializer, doubleSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final SimulatedReturnsPoint deserialize(Decoding2 decoder) {
        boolean zDecodeBooleanElement;
        Instant instant;
        int i;
        boolean z;
        double dDecodeDoubleElement;
        double d;
        double d2;
        double d3;
        String str;
        double d4;
        double d5;
        double d6;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 0;
        if (decodingBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            Instant instant2 = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, InstantSerializers.INSTANCE, null);
            double dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 2);
            double dDecodeDoubleElement3 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 3);
            double dDecodeDoubleElement4 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 4);
            double dDecodeDoubleElement5 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 5);
            double dDecodeDoubleElement6 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 6);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            double dDecodeDoubleElement7 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 9);
            dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 10);
            str = strDecodeStringElement;
            z = zDecodeBooleanElement2;
            d = dDecodeDoubleElement5;
            i = 2047;
            d2 = dDecodeDoubleElement4;
            instant = instant2;
            d3 = dDecodeDoubleElement2;
            d4 = dDecodeDoubleElement3;
            d5 = dDecodeDoubleElement6;
            d6 = dDecodeDoubleElement7;
        } else {
            double dDecodeDoubleElement8 = 0.0d;
            boolean z3 = true;
            zDecodeBooleanElement = false;
            Instant instant3 = null;
            String strDecodeStringElement2 = null;
            double dDecodeDoubleElement9 = 0.0d;
            double dDecodeDoubleElement10 = 0.0d;
            double dDecodeDoubleElement11 = 0.0d;
            double dDecodeDoubleElement12 = 0.0d;
            double dDecodeDoubleElement13 = 0.0d;
            double dDecodeDoubleElement14 = 0.0d;
            boolean zDecodeBooleanElement3 = false;
            while (z3) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 10;
                    case 0:
                        z2 = true;
                        zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 10;
                        i3 = 9;
                    case 1:
                        z2 = true;
                        i4 |= 2;
                        instant3 = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, InstantSerializers.INSTANCE, instant3);
                        i2 = 10;
                        i3 = 9;
                    case 2:
                        dDecodeDoubleElement11 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                        i4 |= 4;
                    case 3:
                        dDecodeDoubleElement12 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                        i4 |= 8;
                    case 4:
                        dDecodeDoubleElement10 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 4);
                        i4 |= 16;
                    case 5:
                        dDecodeDoubleElement9 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 5);
                        i4 |= 32;
                    case 6:
                        dDecodeDoubleElement13 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 6);
                        i4 |= 64;
                    case 7:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                    case 8:
                        zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i4 |= 256;
                    case 9:
                        dDecodeDoubleElement14 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, i3);
                        i4 |= 512;
                    case 10:
                        dDecodeDoubleElement8 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, i2);
                        i4 |= 1024;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            instant = instant3;
            i = i4;
            z = zDecodeBooleanElement3;
            dDecodeDoubleElement = dDecodeDoubleElement8;
            d = dDecodeDoubleElement9;
            d2 = dDecodeDoubleElement10;
            d3 = dDecodeDoubleElement11;
            str = strDecodeStringElement2;
            d4 = dDecodeDoubleElement12;
            d5 = dDecodeDoubleElement13;
            d6 = dDecodeDoubleElement14;
        }
        boolean z4 = zDecodeBooleanElement;
        decodingBeginStructure.endStructure(serialDescriptor);
        return new SimulatedReturnsPoint(i, z4, instant, d3, d4, d2, d, d5, str, z, d6, dDecodeDoubleElement, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, SimulatedReturnsPoint value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        SimulatedReturnsPoint.write$Self$lib_options_simulated_returns_chart_externalDebug(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
