package com.truelayer.payments.core.network.payments.entity.shared;

import com.truelayer.payments.core.network.payments.entity.shared.ProviderCapabilities;
import java.util.List;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ProviderCapabilities.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities.PaymentCapabilities.BankTransferCapability.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderCapabilities$PaymentCapabilities$BankTransferCapability;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.payments.entity.shared.ProviderCapabilities$PaymentCapabilities$BankTransferCapability$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class ProviderCapabilities6 implements PluginHelperInterfaces<ProviderCapabilities.PaymentCapabilities.BankTransferCapability> {
    public static final ProviderCapabilities6 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ProviderCapabilities6 providerCapabilities6 = new ProviderCapabilities6();
        INSTANCE = providerCapabilities6;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.network.payments.entity.shared.ProviderCapabilities.PaymentCapabilities.BankTransferCapability", providerCapabilities6, 3);
        pluginGeneratedSerialDescriptor.addElement("release_channel", false);
        pluginGeneratedSerialDescriptor.addElement("availability", true);
        pluginGeneratedSerialDescriptor.addElement("schemes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProviderCapabilities6() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializers.getNullable(ProviderAvailability4.INSTANCE), BuiltinSerializers.getNullable(ProviderCapabilities.PaymentCapabilities.BankTransferCapability.$childSerializers[2])};
    }

    @Override // kotlinx.serialization.KSerializer2
    public ProviderCapabilities.PaymentCapabilities.BankTransferCapability deserialize(Decoding2 decoder) {
        int i;
        String str;
        ProviderAvailability providerAvailability;
        List list;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = ProviderCapabilities.PaymentCapabilities.BankTransferCapability.$childSerializers;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            ProviderAvailability providerAvailability2 = (ProviderAvailability) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ProviderAvailability4.INSTANCE, null);
            list = (List) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            str = strDecodeStringElement2;
            i = 7;
            providerAvailability = providerAvailability2;
        } else {
            boolean z = true;
            int i2 = 0;
            ProviderAvailability providerAvailability3 = null;
            List list2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    providerAvailability3 = (ProviderAvailability) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ProviderAvailability4.INSTANCE, providerAvailability3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    list2 = (List) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], list2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            providerAvailability = providerAvailability3;
            list = list2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new ProviderCapabilities.PaymentCapabilities.BankTransferCapability(i, str, providerAvailability, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, ProviderCapabilities.PaymentCapabilities.BankTransferCapability value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        ProviderCapabilities.PaymentCapabilities.BankTransferCapability.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
