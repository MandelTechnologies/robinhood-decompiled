package com.truelayer.payments.core.domain.payments;

import com.robinhood.models.card.p311db.Card;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ProviderConfig.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/domain/payments/ProviderConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/domain/payments/ProviderConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.domain.payments.ProviderConfig$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class ProviderConfig2 implements PluginHelperInterfaces<ProviderConfig> {
    public static final ProviderConfig2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ProviderConfig2 providerConfig2 = new ProviderConfig2();
        INSTANCE = providerConfig2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.domain.payments.ProviderConfig", providerConfig2, 5);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement(Card.Icon.ORDER, false);
        pluginGeneratedSerialDescriptor.addElement("hasUserPriming", true);
        pluginGeneratedSerialDescriptor.addElement("branches", false);
        pluginGeneratedSerialDescriptor.addElement("iconExtended", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProviderConfig2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ProviderConfig.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, FloatSerializer.INSTANCE, BooleanSerializer.INSTANCE, kSerializerArr[3], BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public ProviderConfig deserialize(Decoding2 decoder) {
        boolean z;
        int i;
        float f;
        String str;
        List list;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = ProviderConfig.$childSerializers;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            float fDecodeFloatElement = decodingBeginStructure.decodeFloatElement(descriptor2, 1);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
            list = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            str = strDecodeStringElement;
            str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, null);
            z = zDecodeBooleanElement;
            i = 31;
            f = fDecodeFloatElement;
        } else {
            float fDecodeFloatElement2 = 0.0f;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement2 = null;
            List list2 = null;
            String str3 = null;
            int i2 = 0;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    fDecodeFloatElement2 = decodingBeginStructure.decodeFloatElement(descriptor2, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], list2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str3);
                    i2 |= 16;
                }
            }
            z = zDecodeBooleanElement2;
            i = i2;
            f = fDecodeFloatElement2;
            str = strDecodeStringElement2;
            list = list2;
            str2 = str3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new ProviderConfig(i, str, f, z, list, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, ProviderConfig value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        ProviderConfig.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
