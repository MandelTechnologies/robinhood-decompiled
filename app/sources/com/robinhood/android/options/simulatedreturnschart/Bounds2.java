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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: Bounds.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"com/robinhood/android/options/simulatedreturnschart/Bounds.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/android/options/simulatedreturnschart/Bounds;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.android.options.simulatedreturnschart.Bounds$$serializer, reason: use source file name */
/* loaded from: classes11.dex */
public /* synthetic */ class Bounds2 implements PluginHelperInterfaces<Bounds> {
    public static final int $stable;
    public static final Bounds2 INSTANCE;
    private static final SerialDescriptor descriptor;

    private Bounds2() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Bounds2 bounds2 = new Bounds2();
        INSTANCE = bounds2;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.android.options.simulatedreturnschart.Bounds", bounds2, 4);
        pluginGeneratedSerialDescriptor.addElement("minX", false);
        pluginGeneratedSerialDescriptor.addElement("maxX", false);
        pluginGeneratedSerialDescriptor.addElement("minY", false);
        pluginGeneratedSerialDescriptor.addElement("maxY", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public final KSerializer<?>[] childSerializers() {
        InstantSerializers instantSerializers = InstantSerializers.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{instantSerializers, instantSerializers, doubleSerializer, doubleSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public final Bounds deserialize(Decoding2 decoder) {
        int i;
        Instant instant;
        double dDecodeDoubleElement;
        Instant instant2;
        double dDecodeDoubleElement2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Decoding decodingBeginStructure = decoder.beginStructure(serialDescriptor);
        Instant instant3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            InstantSerializers instantSerializers = InstantSerializers.INSTANCE;
            Instant instant4 = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, instantSerializers, null);
            instant2 = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, instantSerializers, null);
            i = 15;
            dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 2);
            instant = instant4;
            dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 3);
        } else {
            double dDecodeDoubleElement3 = 0.0d;
            boolean z = true;
            int i2 = 0;
            Instant instant5 = null;
            double dDecodeDoubleElement4 = 0.0d;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    instant3 = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 0, InstantSerializers.INSTANCE, instant3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    instant5 = (Instant) decodingBeginStructure.decodeSerializableElement(serialDescriptor, 1, InstantSerializers.INSTANCE, instant5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    dDecodeDoubleElement3 = decodingBeginStructure.decodeDoubleElement(serialDescriptor, 2);
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
            instant = instant3;
            dDecodeDoubleElement = dDecodeDoubleElement3;
            instant2 = instant5;
            dDecodeDoubleElement2 = dDecodeDoubleElement4;
        }
        decodingBeginStructure.endStructure(serialDescriptor);
        return new Bounds(i, instant, instant2, dDecodeDoubleElement, dDecodeDoubleElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer3
    public final void serialize(Encoding4 encoder, Bounds value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Encoding3 encoding3BeginStructure = encoder.beginStructure(serialDescriptor);
        Bounds.write$Self$lib_options_simulated_returns_chart_externalDebug(value, encoding3BeginStructure, serialDescriptor);
        encoding3BeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
