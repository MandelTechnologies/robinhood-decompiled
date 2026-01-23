package com.robinhood.options.p360uk.intro.contracts.model;

import com.robinhood.options.p360uk.intro.contracts.model.UkOptionsOnboardingContent;
import java.util.List;
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

/* compiled from: UkOptionsOnboardingContent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent.ProfessionalTraderScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ProfessionalTraderScreen;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes22.dex */
public final class UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer implements PluginHelperInterfaces<UkOptionsOnboardingContent.ProfessionalTraderScreen> {
    public static final UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer ukOptionsOnboardingContent$ProfessionalTraderScreen$$serializer = new UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer();
        INSTANCE = ukOptionsOnboardingContent$ProfessionalTraderScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.options.uk.intro.contracts.model.UkOptionsOnboardingContent.ProfessionalTraderScreen", ukOptionsOnboardingContent$ProfessionalTraderScreen$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("valueProps", false);
        pluginGeneratedSerialDescriptor.addElement("disclosureMarkdown", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = UkOptionsOnboardingContent.ProfessionalTraderScreen.$childSerializers[2];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, kSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public UkOptionsOnboardingContent.ProfessionalTraderScreen deserialize(Decoding2 decoder) {
        int i;
        String str;
        String str2;
        List list;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = UkOptionsOnboardingContent.ProfessionalTraderScreen.$childSerializers;
        String strDecodeStringElement2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            list = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            str = strDecodeStringElement3;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            i = 15;
            str2 = strDecodeStringElement4;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement5 = null;
            List list2 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], list2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement5;
            list = list2;
            strDecodeStringElement = strDecodeStringElement6;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new UkOptionsOnboardingContent.ProfessionalTraderScreen(i, str, str2, list, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, UkOptionsOnboardingContent.ProfessionalTraderScreen value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        UkOptionsOnboardingContent.ProfessionalTraderScreen.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
