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

/* compiled from: UkOptionsOnboardingContent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes22.dex */
public final class UkOptionsOnboardingContent$$serializer implements PluginHelperInterfaces<UkOptionsOnboardingContent> {
    public static final UkOptionsOnboardingContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UkOptionsOnboardingContent$$serializer ukOptionsOnboardingContent$$serializer = new UkOptionsOnboardingContent$$serializer();
        INSTANCE = ukOptionsOnboardingContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.options.uk.intro.contracts.model.UkOptionsOnboardingContent", ukOptionsOnboardingContent$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("l2SplashScreen", false);
        pluginGeneratedSerialDescriptor.addElement("l3SplashScreen", false);
        pluginGeneratedSerialDescriptor.addElement("benefitsScreen", false);
        pluginGeneratedSerialDescriptor.addElement("risksScreen", false);
        pluginGeneratedSerialDescriptor.addElement("professionalTraderScreen", false);
        pluginGeneratedSerialDescriptor.addElement("investorProfileSplashScreen", false);
        pluginGeneratedSerialDescriptor.addElement("experienceTestSplashScreen", false);
        pluginGeneratedSerialDescriptor.addElement("knowledgeTestSplashScreen", false);
        pluginGeneratedSerialDescriptor.addElement("l3benefitsScreen", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UkOptionsOnboardingContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer = UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer.INSTANCE;
        return new KSerializer[]{UkOptionsOnboardingContent$L2SplashScreen$$serializer.INSTANCE, UkOptionsOnboardingContent$L3SplashScreen$$serializer.INSTANCE, UkOptionsOnboardingContent$BenefitsScreen$$serializer.INSTANCE, UkOptionsOnboardingContent$RisksScreen$$serializer.INSTANCE, UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer.INSTANCE, ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer, ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer, ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer, UkOptionsOnboardingContent$L3BenefitsScreen$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public UkOptionsOnboardingContent deserialize(Decoding2 decoder) {
        int i;
        UkOptionsOnboardingContent.QuestionnaireSplashScreen questionnaireSplashScreen;
        UkOptionsOnboardingContent.L3BenefitsScreen l3BenefitsScreen;
        UkOptionsOnboardingContent.QuestionnaireSplashScreen questionnaireSplashScreen2;
        UkOptionsOnboardingContent.QuestionnaireSplashScreen questionnaireSplashScreen3;
        UkOptionsOnboardingContent.ProfessionalTraderScreen professionalTraderScreen;
        UkOptionsOnboardingContent.L2SplashScreen l2SplashScreen;
        UkOptionsOnboardingContent.L3SplashScreen l3SplashScreen;
        UkOptionsOnboardingContent.BenefitsScreen benefitsScreen;
        UkOptionsOnboardingContent.RisksScreen risksScreen;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        int i2 = 7;
        UkOptionsOnboardingContent.L2SplashScreen l2SplashScreen2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            UkOptionsOnboardingContent.L2SplashScreen l2SplashScreen3 = (UkOptionsOnboardingContent.L2SplashScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, UkOptionsOnboardingContent$L2SplashScreen$$serializer.INSTANCE, null);
            UkOptionsOnboardingContent.L3SplashScreen l3SplashScreen2 = (UkOptionsOnboardingContent.L3SplashScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, UkOptionsOnboardingContent$L3SplashScreen$$serializer.INSTANCE, null);
            UkOptionsOnboardingContent.BenefitsScreen benefitsScreen2 = (UkOptionsOnboardingContent.BenefitsScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, UkOptionsOnboardingContent$BenefitsScreen$$serializer.INSTANCE, null);
            UkOptionsOnboardingContent.RisksScreen risksScreen2 = (UkOptionsOnboardingContent.RisksScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, UkOptionsOnboardingContent$RisksScreen$$serializer.INSTANCE, null);
            UkOptionsOnboardingContent.ProfessionalTraderScreen professionalTraderScreen2 = (UkOptionsOnboardingContent.ProfessionalTraderScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer.INSTANCE, null);
            UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer = UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer.INSTANCE;
            UkOptionsOnboardingContent.QuestionnaireSplashScreen questionnaireSplashScreen4 = (UkOptionsOnboardingContent.QuestionnaireSplashScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer, null);
            UkOptionsOnboardingContent.QuestionnaireSplashScreen questionnaireSplashScreen5 = (UkOptionsOnboardingContent.QuestionnaireSplashScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer, null);
            l2SplashScreen = l2SplashScreen3;
            questionnaireSplashScreen = (UkOptionsOnboardingContent.QuestionnaireSplashScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer, null);
            questionnaireSplashScreen2 = questionnaireSplashScreen5;
            questionnaireSplashScreen3 = questionnaireSplashScreen4;
            risksScreen = risksScreen2;
            l3BenefitsScreen = (UkOptionsOnboardingContent.L3BenefitsScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, UkOptionsOnboardingContent$L3BenefitsScreen$$serializer.INSTANCE, null);
            professionalTraderScreen = professionalTraderScreen2;
            benefitsScreen = benefitsScreen2;
            l3SplashScreen = l3SplashScreen2;
            i = 511;
        } else {
            boolean z = true;
            int i3 = 0;
            UkOptionsOnboardingContent.QuestionnaireSplashScreen questionnaireSplashScreen6 = null;
            UkOptionsOnboardingContent.L3BenefitsScreen l3BenefitsScreen2 = null;
            UkOptionsOnboardingContent.QuestionnaireSplashScreen questionnaireSplashScreen7 = null;
            UkOptionsOnboardingContent.QuestionnaireSplashScreen questionnaireSplashScreen8 = null;
            UkOptionsOnboardingContent.ProfessionalTraderScreen professionalTraderScreen3 = null;
            UkOptionsOnboardingContent.L3SplashScreen l3SplashScreen3 = null;
            UkOptionsOnboardingContent.BenefitsScreen benefitsScreen3 = null;
            UkOptionsOnboardingContent.RisksScreen risksScreen3 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        l2SplashScreen2 = (UkOptionsOnboardingContent.L2SplashScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, UkOptionsOnboardingContent$L2SplashScreen$$serializer.INSTANCE, l2SplashScreen2);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        l3SplashScreen3 = (UkOptionsOnboardingContent.L3SplashScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, UkOptionsOnboardingContent$L3SplashScreen$$serializer.INSTANCE, l3SplashScreen3);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        benefitsScreen3 = (UkOptionsOnboardingContent.BenefitsScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, UkOptionsOnboardingContent$BenefitsScreen$$serializer.INSTANCE, benefitsScreen3);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        risksScreen3 = (UkOptionsOnboardingContent.RisksScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, UkOptionsOnboardingContent$RisksScreen$$serializer.INSTANCE, risksScreen3);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        professionalTraderScreen3 = (UkOptionsOnboardingContent.ProfessionalTraderScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer.INSTANCE, professionalTraderScreen3);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        questionnaireSplashScreen8 = (UkOptionsOnboardingContent.QuestionnaireSplashScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer.INSTANCE, questionnaireSplashScreen8);
                        i3 |= 32;
                        i2 = 7;
                    case 6:
                        questionnaireSplashScreen7 = (UkOptionsOnboardingContent.QuestionnaireSplashScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer.INSTANCE, questionnaireSplashScreen7);
                        i3 |= 64;
                    case 7:
                        questionnaireSplashScreen6 = (UkOptionsOnboardingContent.QuestionnaireSplashScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer.INSTANCE, questionnaireSplashScreen6);
                        i3 |= 128;
                    case 8:
                        l3BenefitsScreen2 = (UkOptionsOnboardingContent.L3BenefitsScreen) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, UkOptionsOnboardingContent$L3BenefitsScreen$$serializer.INSTANCE, l3BenefitsScreen2);
                        i3 |= 256;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            questionnaireSplashScreen = questionnaireSplashScreen6;
            l3BenefitsScreen = l3BenefitsScreen2;
            questionnaireSplashScreen2 = questionnaireSplashScreen7;
            questionnaireSplashScreen3 = questionnaireSplashScreen8;
            professionalTraderScreen = professionalTraderScreen3;
            l2SplashScreen = l2SplashScreen2;
            l3SplashScreen = l3SplashScreen3;
            benefitsScreen = benefitsScreen3;
            risksScreen = risksScreen3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new UkOptionsOnboardingContent(i, l2SplashScreen, l3SplashScreen, benefitsScreen, risksScreen, professionalTraderScreen, questionnaireSplashScreen3, questionnaireSplashScreen2, questionnaireSplashScreen, l3BenefitsScreen, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, UkOptionsOnboardingContent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        UkOptionsOnboardingContent.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
