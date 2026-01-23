package com.robinhood.options.p360uk.intro.contracts.model;

import com.robinhood.options.p360uk.intro.contracts.model.UkOptionsOnboardingContent;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.sdui.SduiIcon;

/* compiled from: UkOptionsOnboardingContent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent.ValueProp.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValueProp;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes22.dex */
public final class UkOptionsOnboardingContent$ValueProp$$serializer implements PluginHelperInterfaces<UkOptionsOnboardingContent.ValueProp> {
    public static final UkOptionsOnboardingContent$ValueProp$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UkOptionsOnboardingContent$ValueProp$$serializer ukOptionsOnboardingContent$ValueProp$$serializer = new UkOptionsOnboardingContent$ValueProp$$serializer();
        INSTANCE = ukOptionsOnboardingContent$ValueProp$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.options.uk.intro.contracts.model.UkOptionsOnboardingContent.ValueProp", ukOptionsOnboardingContent$ValueProp$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UkOptionsOnboardingContent$ValueProp$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, UkOptionsOnboardingContent.ValueProp.$childSerializers[1]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public UkOptionsOnboardingContent.ValueProp deserialize(Decoding2 decoder) {
        SduiIcon sduiIcon;
        String strDecodeStringElement;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = UkOptionsOnboardingContent.ValueProp.$childSerializers;
        if (decodingBeginStructure.decodeSequentially()) {
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            sduiIcon = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiIcon sduiIcon2 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], sduiIcon2);
                    i2 |= 2;
                }
            }
            sduiIcon = sduiIcon2;
            strDecodeStringElement = strDecodeStringElement2;
            i = i2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new UkOptionsOnboardingContent.ValueProp(i, strDecodeStringElement, sduiIcon, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, UkOptionsOnboardingContent.ValueProp value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        UkOptionsOnboardingContent.ValueProp.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
