package com.truelayer.payments.core.network.mandates.entity.shared;

import com.truelayer.payments.core.network.mandates.entity.shared.PeriodicLimits;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: MandateConstraints.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits.Limit.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits$Limit;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.mandates.entity.shared.PeriodicLimits$Limit$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class MandateConstraints6 implements PluginHelperInterfaces<PeriodicLimits.Limit> {
    public static final MandateConstraints6 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MandateConstraints6 mandateConstraints6 = new MandateConstraints6();
        INSTANCE = mandateConstraints6;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.network.mandates.entity.shared.PeriodicLimits.Limit", mandateConstraints6, 2);
        pluginGeneratedSerialDescriptor.addElement("maximum_amount", false);
        pluginGeneratedSerialDescriptor.addElement("period_alignment", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MandateConstraints6() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{LongSerializer.INSTANCE, PeriodicLimits.Limit.$childSerializers[1]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public PeriodicLimits.Limit deserialize(Decoding2 decoder) {
        long jDecodeLongElement;
        int i;
        PeriodicLimits.PeriodAlignment periodAlignment;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = PeriodicLimits.Limit.$childSerializers;
        PeriodicLimits.PeriodAlignment periodAlignment2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            jDecodeLongElement = decodingBeginStructure.decodeLongElement(descriptor2, 0);
            i = 3;
            periodAlignment = (PeriodicLimits.PeriodAlignment) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
        } else {
            jDecodeLongElement = 0;
            boolean z = true;
            i = 0;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    jDecodeLongElement = decodingBeginStructure.decodeLongElement(descriptor2, 0);
                    i |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    periodAlignment2 = (PeriodicLimits.PeriodAlignment) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], periodAlignment2);
                    i |= 2;
                }
            }
            periodAlignment = periodAlignment2;
        }
        int i2 = i;
        long j = jDecodeLongElement;
        decodingBeginStructure.endStructure(descriptor2);
        return new PeriodicLimits.Limit(i2, j, periodAlignment, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, PeriodicLimits.Limit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        PeriodicLimits.Limit.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
