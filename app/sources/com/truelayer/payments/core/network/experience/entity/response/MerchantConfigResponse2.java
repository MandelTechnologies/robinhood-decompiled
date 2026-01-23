package com.truelayer.payments.core.network.experience.entity.response;

import com.robinhood.android.car.result.CarResultComposable2;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: MerchantConfigResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/experience/entity/response/MerchantConfigResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/MerchantConfigResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.truelayer.payments.core.network.experience.entity.response.MerchantConfigResponse$$serializer, reason: use source file name */
/* loaded from: classes6.dex */
public final class MerchantConfigResponse2 implements PluginHelperInterfaces<MerchantConfigResponse> {
    public static final MerchantConfigResponse2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MerchantConfigResponse2 merchantConfigResponse2 = new MerchantConfigResponse2();
        INSTANCE = merchantConfigResponse2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.truelayer.payments.core.network.experience.entity.response.MerchantConfigResponse", merchantConfigResponse2, 14);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("logo_uri", true);
        pluginGeneratedSerialDescriptor.addElement("primary_color", true);
        pluginGeneratedSerialDescriptor.addElement("secondary_color", true);
        pluginGeneratedSerialDescriptor.addElement("tertiary_color", true);
        pluginGeneratedSerialDescriptor.addElement("colors", false);
        pluginGeneratedSerialDescriptor.addElement("fonts", false);
        pluginGeneratedSerialDescriptor.addElement(CarResultComposable2.BUTTONS, false);
        pluginGeneratedSerialDescriptor.addElement("inputs", false);
        pluginGeneratedSerialDescriptor.addElement("list_option", false);
        pluginGeneratedSerialDescriptor.addElement("spinner", false);
        pluginGeneratedSerialDescriptor.addElement("illustration", false);
        pluginGeneratedSerialDescriptor.addElement("branding", false);
        pluginGeneratedSerialDescriptor.addElement("regulated", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MerchantConfigResponse2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, nullable, nullable2, nullable3, nullable4, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public MerchantConfigResponse deserialize(Decoding2 decoder) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        boolean z;
        boolean zDecodeBooleanElement;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean zDecodeBooleanElement2;
        boolean zDecodeBooleanElement3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        int i2 = 11;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            String str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            String str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            String str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            boolean zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(descriptor2, 5);
            boolean zDecodeBooleanElement5 = decodingBeginStructure.decodeBooleanElement(descriptor2, 6);
            boolean zDecodeBooleanElement6 = decodingBeginStructure.decodeBooleanElement(descriptor2, 7);
            boolean zDecodeBooleanElement7 = decodingBeginStructure.decodeBooleanElement(descriptor2, 8);
            boolean zDecodeBooleanElement8 = decodingBeginStructure.decodeBooleanElement(descriptor2, 9);
            boolean zDecodeBooleanElement9 = decodingBeginStructure.decodeBooleanElement(descriptor2, 10);
            str2 = strDecodeStringElement2;
            str3 = str9;
            z = zDecodeBooleanElement4;
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 11);
            z2 = zDecodeBooleanElement9;
            z3 = zDecodeBooleanElement8;
            z4 = zDecodeBooleanElement6;
            z5 = zDecodeBooleanElement5;
            z6 = zDecodeBooleanElement7;
            str4 = str8;
            zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 12);
            zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 13);
            str5 = str7;
            str = str6;
            i = 16383;
        } else {
            int i3 = 13;
            int i4 = 0;
            boolean zDecodeBooleanElement10 = false;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            boolean zDecodeBooleanElement16 = false;
            boolean zDecodeBooleanElement17 = false;
            boolean zDecodeBooleanElement18 = false;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            boolean z7 = true;
            String str13 = null;
            while (z7) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z7 = false;
                        i3 = 13;
                    case 0:
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i4 |= 1;
                        i3 = 13;
                        i2 = 11;
                    case 1:
                        str10 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str10);
                        i4 |= 2;
                        i3 = 13;
                        i2 = 11;
                    case 2:
                        str13 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str13);
                        i4 |= 4;
                        i3 = 13;
                        i2 = 11;
                    case 3:
                        str12 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str12);
                        i4 |= 8;
                        i3 = 13;
                        i2 = 11;
                    case 4:
                        str11 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str11);
                        i4 |= 16;
                        i3 = 13;
                        i2 = 11;
                    case 5:
                        zDecodeBooleanElement10 = decodingBeginStructure.decodeBooleanElement(descriptor2, 5);
                        i4 |= 32;
                        i3 = 13;
                    case 6:
                        zDecodeBooleanElement15 = decodingBeginStructure.decodeBooleanElement(descriptor2, 6);
                        i4 |= 64;
                    case 7:
                        zDecodeBooleanElement14 = decodingBeginStructure.decodeBooleanElement(descriptor2, 7);
                        i4 |= 128;
                    case 8:
                        zDecodeBooleanElement16 = decodingBeginStructure.decodeBooleanElement(descriptor2, 8);
                        i4 |= 256;
                    case 9:
                        zDecodeBooleanElement13 = decodingBeginStructure.decodeBooleanElement(descriptor2, 9);
                        i4 |= 512;
                    case 10:
                        zDecodeBooleanElement12 = decodingBeginStructure.decodeBooleanElement(descriptor2, 10);
                        i4 |= 1024;
                    case 11:
                        zDecodeBooleanElement11 = decodingBeginStructure.decodeBooleanElement(descriptor2, i2);
                        i4 |= 2048;
                    case 12:
                        zDecodeBooleanElement17 = decodingBeginStructure.decodeBooleanElement(descriptor2, 12);
                        i4 |= 4096;
                    case 13:
                        zDecodeBooleanElement18 = decodingBeginStructure.decodeBooleanElement(descriptor2, i3);
                        i4 |= 8192;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            str = str10;
            str2 = strDecodeStringElement;
            str3 = str11;
            i = i4;
            str4 = str12;
            str5 = str13;
            z = zDecodeBooleanElement10;
            zDecodeBooleanElement = zDecodeBooleanElement11;
            z2 = zDecodeBooleanElement12;
            z3 = zDecodeBooleanElement13;
            z4 = zDecodeBooleanElement14;
            z5 = zDecodeBooleanElement15;
            z6 = zDecodeBooleanElement16;
            zDecodeBooleanElement2 = zDecodeBooleanElement17;
            zDecodeBooleanElement3 = zDecodeBooleanElement18;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new MerchantConfigResponse(i, str2, str, str5, str4, str3, z, z5, z4, z6, z3, z2, zDecodeBooleanElement, zDecodeBooleanElement2, zDecodeBooleanElement3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, MerchantConfigResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        MerchantConfigResponse.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
