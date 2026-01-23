package com.truelayer.payments.core.network.mandates.entity.shared;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.serializers.InstantSerializers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: MandateConstraints.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/MandateConstraints;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.mandates.entity.shared.MandateConstraints$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class MandateConstraints3 implements PluginHelperInterfaces<MandateConstraints> {
    public static final MandateConstraints3 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MandateConstraints3 mandateConstraints3 = new MandateConstraints3();
        INSTANCE = mandateConstraints3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.network.mandates.entity.shared.MandateConstraints", mandateConstraints3, 4);
        pluginGeneratedSerialDescriptor.addElement("valid_from", true);
        pluginGeneratedSerialDescriptor.addElement("valid_to", true);
        pluginGeneratedSerialDescriptor.addElement("maximum_individual_amount", false);
        pluginGeneratedSerialDescriptor.addElement("periodic_limits", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MandateConstraints3() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        InstantSerializers instantSerializers = InstantSerializers.INSTANCE;
        return new KSerializer[]{BuiltinSerializers.getNullable(instantSerializers), BuiltinSerializers.getNullable(instantSerializers), LongSerializer.INSTANCE, MandateConstraints5.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public MandateConstraints deserialize(Decoding2 decoder) {
        int i;
        Instant instant;
        long j;
        Instant instant2;
        PeriodicLimits periodicLimits;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        if (decodingBeginStructure.decodeSequentially()) {
            InstantSerializers instantSerializers = InstantSerializers.INSTANCE;
            Instant instant3 = (Instant) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, instantSerializers, null);
            Instant instant4 = (Instant) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, instantSerializers, null);
            long jDecodeLongElement = decodingBeginStructure.decodeLongElement(descriptor2, 2);
            i = 15;
            instant2 = instant4;
            periodicLimits = (PeriodicLimits) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, MandateConstraints5.INSTANCE, null);
            j = jDecodeLongElement;
            instant = instant3;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            Instant instant5 = null;
            Instant instant6 = null;
            PeriodicLimits periodicLimits2 = null;
            i = 0;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    instant5 = (Instant) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, InstantSerializers.INSTANCE, instant5);
                    i |= 1;
                } else if (iDecodeElementIndex == 1) {
                    instant6 = (Instant) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, InstantSerializers.INSTANCE, instant6);
                    i |= 2;
                } else if (iDecodeElementIndex == 2) {
                    jDecodeLongElement2 = decodingBeginStructure.decodeLongElement(descriptor2, 2);
                    i |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    periodicLimits2 = (PeriodicLimits) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, MandateConstraints5.INSTANCE, periodicLimits2);
                    i |= 8;
                }
            }
            instant = instant5;
            j = jDecodeLongElement2;
            instant2 = instant6;
            periodicLimits = periodicLimits2;
        }
        int i2 = i;
        decodingBeginStructure.endStructure(descriptor2);
        return new MandateConstraints(i2, instant, instant2, j, periodicLimits, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, MandateConstraints value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        MandateConstraints.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
