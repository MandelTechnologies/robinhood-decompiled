package com.robinhood.onboarding.goldearningspotential.contracts;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
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
import microgram.p507ui.sdui.SduiText;
import microgram.p507ui.sdui.SduiText$$serializer;

/* compiled from: GoldEarningsModel.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes22.dex */
public final class GoldEarningsCalculatorDisclosureViewModel$$serializer implements PluginHelperInterfaces<GoldEarningsCalculatorDisclosureViewModel> {
    public static final GoldEarningsCalculatorDisclosureViewModel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GoldEarningsCalculatorDisclosureViewModel$$serializer goldEarningsCalculatorDisclosureViewModel$$serializer = new GoldEarningsCalculatorDisclosureViewModel$$serializer();
        INSTANCE = goldEarningsCalculatorDisclosureViewModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsCalculatorDisclosureViewModel", goldEarningsCalculatorDisclosureViewModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement(OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, false);
        pluginGeneratedSerialDescriptor.addElement("trailingTextButton", false);
        pluginGeneratedSerialDescriptor.addElement("trailingTextButtonAction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GoldEarningsCalculatorDisclosureViewModel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
        return new KSerializer[]{sduiText$$serializer, sduiText$$serializer, GoldEarningsCalculatorAlertAction$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public GoldEarningsCalculatorDisclosureViewModel deserialize(Decoding2 decoder) {
        int i;
        SduiText sduiText;
        SduiText sduiText2;
        GoldEarningsCalculatorAlertAction goldEarningsCalculatorAlertAction;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        SduiText sduiText3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
            SduiText sduiText4 = (SduiText) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, sduiText$$serializer, null);
            sduiText2 = (SduiText) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, sduiText$$serializer, null);
            goldEarningsCalculatorAlertAction = (GoldEarningsCalculatorAlertAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, GoldEarningsCalculatorAlertAction$$serializer.INSTANCE, null);
            i = 7;
            sduiText = sduiText4;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiText sduiText5 = null;
            GoldEarningsCalculatorAlertAction goldEarningsCalculatorAlertAction2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiText3 = (SduiText) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiText$$serializer.INSTANCE, sduiText3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiText5 = (SduiText) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiText$$serializer.INSTANCE, sduiText5);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    goldEarningsCalculatorAlertAction2 = (GoldEarningsCalculatorAlertAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, GoldEarningsCalculatorAlertAction$$serializer.INSTANCE, goldEarningsCalculatorAlertAction2);
                    i2 |= 4;
                }
            }
            i = i2;
            sduiText = sduiText3;
            sduiText2 = sduiText5;
            goldEarningsCalculatorAlertAction = goldEarningsCalculatorAlertAction2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new GoldEarningsCalculatorDisclosureViewModel(i, sduiText, sduiText2, goldEarningsCalculatorAlertAction, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, GoldEarningsCalculatorDisclosureViewModel value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        GoldEarningsCalculatorDisclosureViewModel.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
