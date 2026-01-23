package com.truelayer.payments.core.network.payments.entity.shared;

import com.truelayer.payments.core.network.payments.entity.shared.FormInput;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: FormInput.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/payments/entity/shared/FormInput.TextWithImage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$TextWithImage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes6.dex */
public final class FormInput$TextWithImage$$serializer implements PluginHelperInterfaces<FormInput.TextWithImage> {
    public static final FormInput$TextWithImage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FormInput$TextWithImage$$serializer formInput$TextWithImage$$serializer = new FormInput$TextWithImage$$serializer();
        INSTANCE = formInput$TextWithImage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("text_with_image", formInput$TextWithImage$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("mandatory", false);
        pluginGeneratedSerialDescriptor.addElement("display_text", false);
        pluginGeneratedSerialDescriptor.addElement("format", true);
        pluginGeneratedSerialDescriptor.addElement("sensitive", false);
        pluginGeneratedSerialDescriptor.addElement("min_length", true);
        pluginGeneratedSerialDescriptor.addElement("max_length", true);
        pluginGeneratedSerialDescriptor.addElement("regexes", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("image", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FormInput$TextWithImage$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FormInput.TextWithImage.$childSerializers;
        TranslatableText4 translatableText4 = TranslatableText4.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(intSerializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(intSerializer);
        KSerializer<?> kSerializer = kSerializerArr[7];
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(translatableText4);
        KSerializer<?> kSerializer2 = kSerializerArr[9];
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, booleanSerializer, translatableText4, FormInput.Text.TextFormat.TextFormatSerializer.INSTANCE, booleanSerializer, nullable, nullable2, kSerializer, nullable3, kSerializer2};
    }

    @Override // kotlinx.serialization.KSerializer2
    public FormInput.TextWithImage deserialize(Decoding2 decoder) {
        boolean z;
        FormInput.TextWithImage.Image image;
        TranslatableText translatableText;
        Integer num;
        List list;
        Integer num2;
        FormInput.Text.TextFormat textFormat;
        TranslatableText translatableText2;
        int i;
        boolean z2;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = FormInput.TextWithImage.$childSerializers;
        int i2 = 8;
        int i3 = 9;
        int i4 = 7;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
            TranslatableText4 translatableText4 = TranslatableText4.INSTANCE;
            TranslatableText translatableText3 = (TranslatableText) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, translatableText4, null);
            FormInput.Text.TextFormat textFormat2 = (FormInput.Text.TextFormat) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, FormInput.Text.TextFormat.TextFormatSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 4);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, intSerializer, null);
            Integer num4 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, intSerializer, null);
            List list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            TranslatableText translatableText5 = (TranslatableText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, translatableText4, null);
            image = (FormInput.TextWithImage.Image) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            str = strDecodeStringElement;
            num = num4;
            num2 = num3;
            textFormat = textFormat2;
            translatableText = translatableText5;
            z = zDecodeBooleanElement2;
            translatableText2 = translatableText3;
            i = 1023;
            list = list2;
            z2 = zDecodeBooleanElement;
        } else {
            boolean z3 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            FormInput.TextWithImage.Image image2 = null;
            TranslatableText translatableText6 = null;
            Integer num5 = null;
            List list3 = null;
            Integer num6 = null;
            FormInput.Text.TextFormat textFormat3 = null;
            String strDecodeStringElement2 = null;
            int i5 = 0;
            TranslatableText translatableText7 = null;
            while (z3) {
                int i6 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 8;
                        i4 = 7;
                    case 0:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i5 |= 1;
                        i2 = 8;
                        i3 = 9;
                        i4 = 7;
                    case 1:
                        zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
                        i5 |= 2;
                        i2 = 8;
                        i3 = 9;
                        i4 = 7;
                    case 2:
                        translatableText7 = (TranslatableText) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, TranslatableText4.INSTANCE, translatableText7);
                        i5 |= 4;
                        i2 = 8;
                        i3 = 9;
                        i4 = 7;
                    case 3:
                        textFormat3 = (FormInput.Text.TextFormat) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, FormInput.Text.TextFormat.TextFormatSerializer.INSTANCE, textFormat3);
                        i5 |= 8;
                        i2 = 8;
                        i3 = 9;
                        i4 = 7;
                    case 4:
                        zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 4);
                        i5 |= 16;
                        i2 = 8;
                        i4 = 7;
                    case 5:
                        num6 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, IntSerializer.INSTANCE, num6);
                        i5 |= 32;
                        i2 = 8;
                        i4 = 7;
                    case 6:
                        num5 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, num5);
                        i5 |= 64;
                        i2 = 8;
                        i4 = 7;
                    case 7:
                        list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], list3);
                        i5 |= 128;
                        i4 = i6;
                        i2 = 8;
                    case 8:
                        translatableText6 = (TranslatableText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, TranslatableText4.INSTANCE, translatableText6);
                        i5 |= 256;
                        i4 = i6;
                    case 9:
                        image2 = (FormInput.TextWithImage.Image) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], image2);
                        i5 |= 512;
                        i4 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement3;
            image = image2;
            translatableText = translatableText6;
            num = num5;
            list = list3;
            num2 = num6;
            textFormat = textFormat3;
            translatableText2 = translatableText7;
            i = i5;
            z2 = zDecodeBooleanElement4;
            str = strDecodeStringElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new FormInput.TextWithImage(i, str, z2, translatableText2, textFormat, z, num2, num, list, translatableText, image, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, FormInput.TextWithImage value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        FormInput.TextWithImage.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
