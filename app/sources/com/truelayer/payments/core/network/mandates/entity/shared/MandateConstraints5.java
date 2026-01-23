package com.truelayer.payments.core.network.mandates.entity.shared;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.truelayer.payments.core.network.mandates.entity.shared.PeriodicLimits;
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

/* compiled from: MandateConstraints.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/mandates/entity/shared/PeriodicLimits;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.mandates.entity.shared.PeriodicLimits$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class MandateConstraints5 implements PluginHelperInterfaces<PeriodicLimits> {
    public static final MandateConstraints5 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MandateConstraints5 mandateConstraints5 = new MandateConstraints5();
        INSTANCE = mandateConstraints5;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.network.mandates.entity.shared.PeriodicLimits", mandateConstraints5, 6);
        pluginGeneratedSerialDescriptor.addElement("day", true);
        pluginGeneratedSerialDescriptor.addElement("week", true);
        pluginGeneratedSerialDescriptor.addElement("fortnight", true);
        pluginGeneratedSerialDescriptor.addElement(ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS, true);
        pluginGeneratedSerialDescriptor.addElement("half_year", true);
        pluginGeneratedSerialDescriptor.addElement("year", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MandateConstraints5() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        MandateConstraints6 mandateConstraints6 = MandateConstraints6.INSTANCE;
        return new KSerializer[]{BuiltinSerializers.getNullable(mandateConstraints6), BuiltinSerializers.getNullable(mandateConstraints6), BuiltinSerializers.getNullable(mandateConstraints6), BuiltinSerializers.getNullable(mandateConstraints6), BuiltinSerializers.getNullable(mandateConstraints6), BuiltinSerializers.getNullable(mandateConstraints6)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public PeriodicLimits deserialize(Decoding2 decoder) {
        int i;
        PeriodicLimits.Limit limit;
        PeriodicLimits.Limit limit2;
        PeriodicLimits.Limit limit3;
        PeriodicLimits.Limit limit4;
        PeriodicLimits.Limit limit5;
        PeriodicLimits.Limit limit6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        int i2 = 5;
        PeriodicLimits.Limit limit7 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            MandateConstraints6 mandateConstraints6 = MandateConstraints6.INSTANCE;
            PeriodicLimits.Limit limit8 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, mandateConstraints6, null);
            PeriodicLimits.Limit limit9 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, mandateConstraints6, null);
            PeriodicLimits.Limit limit10 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, mandateConstraints6, null);
            PeriodicLimits.Limit limit11 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, mandateConstraints6, null);
            PeriodicLimits.Limit limit12 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, mandateConstraints6, null);
            limit6 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, mandateConstraints6, null);
            i = 63;
            limit4 = limit11;
            limit5 = limit12;
            limit3 = limit10;
            limit2 = limit9;
            limit = limit8;
        } else {
            boolean z = true;
            int i3 = 0;
            PeriodicLimits.Limit limit13 = null;
            PeriodicLimits.Limit limit14 = null;
            PeriodicLimits.Limit limit15 = null;
            PeriodicLimits.Limit limit16 = null;
            PeriodicLimits.Limit limit17 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        limit7 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, MandateConstraints6.INSTANCE, limit7);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        limit13 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, MandateConstraints6.INSTANCE, limit13);
                        i3 |= 2;
                    case 2:
                        limit14 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, MandateConstraints6.INSTANCE, limit14);
                        i3 |= 4;
                    case 3:
                        limit15 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, MandateConstraints6.INSTANCE, limit15);
                        i3 |= 8;
                    case 4:
                        limit16 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, MandateConstraints6.INSTANCE, limit16);
                        i3 |= 16;
                    case 5:
                        limit17 = (PeriodicLimits.Limit) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, MandateConstraints6.INSTANCE, limit17);
                        i3 |= 32;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            limit = limit7;
            limit2 = limit13;
            limit3 = limit14;
            limit4 = limit15;
            limit5 = limit16;
            limit6 = limit17;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new PeriodicLimits(i, limit, limit2, limit3, limit4, limit5, limit6, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, PeriodicLimits value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        PeriodicLimits.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
