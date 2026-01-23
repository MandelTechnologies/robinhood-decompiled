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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLeg.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLeg;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes11.dex */
public /* synthetic */ class SimulatedReturnsLeg$$serializer implements PluginHelperInterfaces<SimulatedReturnsLeg> {
    public static final int $stable;
    public static final SimulatedReturnsLeg$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private SimulatedReturnsLeg$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SimulatedReturnsLeg$$serializer simulatedReturnsLeg$$serializer = new SimulatedReturnsLeg$$serializer();
        INSTANCE = simulatedReturnsLeg$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsLeg", simulatedReturnsLeg$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("strikePrice", false);
        pluginGeneratedSerialDescriptor.addElement("expiration", false);
        pluginGeneratedSerialDescriptor.addElement("impliedVolatility", false);
        pluginGeneratedSerialDescriptor.addElement("interestRate", false);
        pluginGeneratedSerialDescriptor.addElement("dividendYield", false);
        pluginGeneratedSerialDescriptor.addElement("ratio", false);
        pluginGeneratedSerialDescriptor.addElement("isBuy", false);
        pluginGeneratedSerialDescriptor.addElement("isPut", false);
        pluginGeneratedSerialDescriptor.addElement("isEuropean", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{doubleSerializer, InstantSerializers.INSTANCE, doubleSerializer, doubleSerializer, doubleSerializer, IntSerializer.INSTANCE, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final SimulatedReturnsLeg deserialize(Decoding2 decoder) {
        boolean zDecodeBooleanElement;
        Instant instant;
        boolean z;
        int i;
        boolean zDecodeBooleanElement2;
        int i2;
        double d;
        double d2;
        double d3;
        double d4;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 7;
        if (decodingBeginStructure.decodeSequentially()) {
            double dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 0);
            Instant instant2 = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, InstantSerializers.INSTANCE, null);
            double dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 2);
            double dDecodeDoubleElement3 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 3);
            double dDecodeDoubleElement4 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 4);
            int iDecodeIntElement = decodingBeginStructure.decodeIntElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            instant = instant2;
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            z = zDecodeBooleanElement3;
            i = iDecodeIntElement;
            zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            i2 = 511;
            d = dDecodeDoubleElement2;
            d2 = dDecodeDoubleElement3;
            d3 = dDecodeDoubleElement;
            d4 = dDecodeDoubleElement4;
        } else {
            boolean z3 = true;
            boolean zDecodeBooleanElement4 = false;
            int i4 = 0;
            double dDecodeDoubleElement5 = 0.0d;
            double dDecodeDoubleElement6 = 0.0d;
            double dDecodeDoubleElement7 = 0.0d;
            double dDecodeDoubleElement8 = 0.0d;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement5 = false;
            Instant instant3 = null;
            boolean zDecodeBooleanElement6 = false;
            while (z3) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                    case 0:
                        z2 = true;
                        dDecodeDoubleElement7 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 7;
                    case 1:
                        z2 = true;
                        instant3 = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, InstantSerializers.INSTANCE, instant3);
                        i4 |= 2;
                        i3 = 7;
                    case 2:
                        dDecodeDoubleElement5 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                        i4 |= 4;
                    case 3:
                        dDecodeDoubleElement6 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                        i4 |= 8;
                    case 4:
                        dDecodeDoubleElement8 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 4);
                        i4 |= 16;
                    case 5:
                        iDecodeIntElement2 = decodingBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i4 |= 32;
                    case 6:
                        zDecodeBooleanElement6 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i4 |= 64;
                    case 7:
                        zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i4 |= 128;
                    case 8:
                        zDecodeBooleanElement5 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i4 |= 256;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement4;
            instant = instant3;
            z = zDecodeBooleanElement6;
            i = iDecodeIntElement2;
            zDecodeBooleanElement2 = zDecodeBooleanElement5;
            i2 = i4;
            d = dDecodeDoubleElement5;
            d2 = dDecodeDoubleElement6;
            d3 = dDecodeDoubleElement7;
            d4 = dDecodeDoubleElement8;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new SimulatedReturnsLeg(i2, d3, instant, d, d2, d4, i, z, zDecodeBooleanElement, zDecodeBooleanElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, SimulatedReturnsLeg value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        SimulatedReturnsLeg.write$Self$lib_options_simulated_returns_chart_externalDebug(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
