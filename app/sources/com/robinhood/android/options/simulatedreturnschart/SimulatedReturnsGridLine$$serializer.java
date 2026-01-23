package com.robinhood.android.options.simulatedreturnschart;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SimulatedReturnsChart.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes11.dex */
public /* synthetic */ class SimulatedReturnsGridLine$$serializer implements PluginHelperInterfaces<SimulatedReturnsGridLine> {
    public static final int $stable;
    public static final SimulatedReturnsGridLine$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private SimulatedReturnsGridLine$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SimulatedReturnsGridLine$$serializer simulatedReturnsGridLine$$serializer = new SimulatedReturnsGridLine$$serializer();
        INSTANCE = simulatedReturnsGridLine$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsGridLine", simulatedReturnsGridLine$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("position", false);
        pluginGeneratedSerialDescriptor.addElement(AnnotatedPrivateKey.LABEL, false);
        pluginGeneratedSerialDescriptor.addElement("isBold", false);
        pluginGeneratedSerialDescriptor.addElement("opacity", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{doubleSerializer, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, doubleSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final SimulatedReturnsGridLine deserialize(Decoding2 decoder) {
        String strDecodeStringElement;
        int i;
        boolean zDecodeBooleanElement;
        double d;
        double dDecodeDoubleElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        if (decodingBeginStructure.decodeSequentially()) {
            double dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 0);
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 1);
            i = 15;
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            d = dDecodeDoubleElement2;
            dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 3);
        } else {
            strDecodeStringElement = null;
            boolean z = true;
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            int i2 = 0;
            boolean zDecodeBooleanElement2 = false;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    dDecodeDoubleElement3 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    dDecodeDoubleElement4 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            d = dDecodeDoubleElement3;
            dDecodeDoubleElement = dDecodeDoubleElement4;
        }
        String str = strDecodeStringElement;
        decodingBeginStructure.endStructure(serialDescriptor);
        return new SimulatedReturnsGridLine(i, d, str, zDecodeBooleanElement, dDecodeDoubleElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, SimulatedReturnsGridLine value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        SimulatedReturnsGridLine.write$Self$lib_options_simulated_returns_chart_externalDebug(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
