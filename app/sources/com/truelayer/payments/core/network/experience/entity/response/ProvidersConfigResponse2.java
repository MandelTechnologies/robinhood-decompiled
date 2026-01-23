package com.truelayer.payments.core.network.experience.entity.response;

import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.network.experience.entity.response.ProvidersConfigResponse;
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

/* compiled from: ProvidersConfigResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/ProvidersConfigResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.experience.entity.response.ProvidersConfigResponse$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class ProvidersConfigResponse2 implements PluginHelperInterfaces<ProvidersConfigResponse> {
    public static final ProvidersConfigResponse2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ProvidersConfigResponse2 providersConfigResponse2 = new ProvidersConfigResponse2();
        INSTANCE = providersConfigResponse2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.network.experience.entity.response.ProvidersConfigResponse", providersConfigResponse2, 7);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("country_code", false);
        pluginGeneratedSerialDescriptor.addElement(Card.Icon.ORDER, false);
        pluginGeneratedSerialDescriptor.addElement("user_priming", true);
        pluginGeneratedSerialDescriptor.addElement("branches", false);
        pluginGeneratedSerialDescriptor.addElement("icons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProvidersConfigResponse2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = ProvidersConfigResponse.$childSerializers[5];
        KSerializer<?> nullable = BuiltinSerializers.getNullable(ProvidersConfigResponse3.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, FloatSerializer.INSTANCE, BooleanSerializer.INSTANCE, kSerializer, nullable};
    }

    @Override // kotlinx.serialization.KSerializer2
    public ProvidersConfigResponse deserialize(Decoding2 decoder) {
        float f;
        ProvidersConfigResponse.ProviderIcons providerIcons;
        List list;
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = ProvidersConfigResponse.$childSerializers;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            float fDecodeFloatElement = decodingBeginStructure.decodeFloatElement(descriptor2, 3);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 4);
            list = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            str = strDecodeStringElement;
            providerIcons = (ProvidersConfigResponse.ProviderIcons) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, ProvidersConfigResponse3.INSTANCE, null);
            f = fDecodeFloatElement;
            z = zDecodeBooleanElement;
            str3 = strDecodeStringElement3;
            i = 127;
            str2 = strDecodeStringElement2;
        } else {
            float fDecodeFloatElement2 = 0.0f;
            boolean z2 = true;
            int i2 = 0;
            ProvidersConfigResponse.ProviderIcons providerIcons2 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement2 = false;
            List list2 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        i2 |= 1;
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        continue;
                    case 1:
                        i2 |= 2;
                        strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        continue;
                    case 2:
                        strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i2 |= 4;
                        continue;
                    case 3:
                        fDecodeFloatElement2 = decodingBeginStructure.decodeFloatElement(descriptor2, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], list2);
                        i2 |= 32;
                        break;
                    case 6:
                        providerIcons2 = (ProvidersConfigResponse.ProviderIcons) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, ProvidersConfigResponse3.INSTANCE, providerIcons2);
                        i2 |= 64;
                        break;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            f = fDecodeFloatElement2;
            providerIcons = providerIcons2;
            list = list2;
            z = zDecodeBooleanElement2;
            i = i2;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new ProvidersConfigResponse(i, str, str2, str3, f, z, list, providerIcons, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, ProvidersConfigResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        ProvidersConfigResponse.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
