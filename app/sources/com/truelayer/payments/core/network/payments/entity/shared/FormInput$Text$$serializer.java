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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/truelayer/payments/core/network/payments/entity/shared/FormInput.Text.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/FormInput$Text;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes6.dex */
public final class FormInput$Text$$serializer implements PluginHelperInterfaces<FormInput.Text> {
    public static final FormInput$Text$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FormInput$Text$$serializer formInput$Text$$serializer = new FormInput$Text$$serializer();
        INSTANCE = formInput$Text$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("text", formInput$Text$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("mandatory", false);
        pluginGeneratedSerialDescriptor.addElement("display_text", false);
        pluginGeneratedSerialDescriptor.addElement("format", true);
        pluginGeneratedSerialDescriptor.addElement("sensitive", false);
        pluginGeneratedSerialDescriptor.addElement("min_length", true);
        pluginGeneratedSerialDescriptor.addElement("max_length", true);
        pluginGeneratedSerialDescriptor.addElement("regexes", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FormInput$Text$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FormInput.Text.$childSerializers;
        TranslatableText4 translatableText4 = TranslatableText4.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(intSerializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(intSerializer);
        KSerializer<?> kSerializer = kSerializerArr[7];
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(translatableText4);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, booleanSerializer, translatableText4, FormInput.Text.TextFormat.TextFormatSerializer.INSTANCE, booleanSerializer, nullable, nullable2, kSerializer, nullable3};
    }

    @Override // kotlinx.serialization.KSerializer2
    public FormInput.Text deserialize(Decoding2 decoder) {
        boolean z;
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
        KSerializer[] kSerializerArr = FormInput.Text.$childSerializers;
        int i2 = 8;
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
            list = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            str = strDecodeStringElement;
            num = num4;
            num2 = num3;
            textFormat = textFormat2;
            translatableText = (TranslatableText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, translatableText4, null);
            z = zDecodeBooleanElement2;
            translatableText2 = translatableText3;
            i = 511;
            z2 = zDecodeBooleanElement;
        } else {
            boolean z3 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            TranslatableText translatableText5 = null;
            Integer num5 = null;
            List list2 = null;
            Integer num6 = null;
            FormInput.Text.TextFormat textFormat3 = null;
            String strDecodeStringElement2 = null;
            int i3 = 0;
            TranslatableText translatableText6 = null;
            while (z3) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 = 8;
                    case 1:
                        zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
                        i3 |= 2;
                        i2 = 8;
                    case 2:
                        translatableText6 = (TranslatableText) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, TranslatableText4.INSTANCE, translatableText6);
                        i3 |= 4;
                        i2 = 8;
                    case 3:
                        textFormat3 = (FormInput.Text.TextFormat) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, FormInput.Text.TextFormat.TextFormatSerializer.INSTANCE, textFormat3);
                        i3 |= 8;
                        i2 = 8;
                    case 4:
                        zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 4);
                        i3 |= 16;
                        i2 = 8;
                    case 5:
                        num6 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, IntSerializer.INSTANCE, num6);
                        i3 |= 32;
                        i2 = 8;
                    case 6:
                        num5 = (Integer) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, IntSerializer.INSTANCE, num5);
                        i3 |= 64;
                        i2 = 8;
                    case 7:
                        list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], list2);
                        i3 |= 128;
                    case 8:
                        translatableText5 = (TranslatableText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, TranslatableText4.INSTANCE, translatableText5);
                        i3 |= 256;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement3;
            translatableText = translatableText5;
            num = num5;
            list = list2;
            num2 = num6;
            textFormat = textFormat3;
            translatableText2 = translatableText6;
            i = i3;
            z2 = zDecodeBooleanElement4;
            str = strDecodeStringElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new FormInput.Text(i, str, z2, translatableText2, textFormat, z, num2, num, list, translatableText, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, FormInput.Text value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        FormInput.Text.write$Self$payments_core_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
