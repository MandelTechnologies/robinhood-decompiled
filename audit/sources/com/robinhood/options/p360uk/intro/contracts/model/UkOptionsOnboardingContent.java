package com.robinhood.options.p360uk.intro.contracts.model;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.sdui.SduiIcon;
import microgram.p507ui.sdui.SduiNumberPog;
import microgram.p507ui.sdui.SduiNumberPog$$serializer;

/* compiled from: UkOptionsOnboardingContent.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 B2\u00020\u0001:\f@ABCDEFGHIJKBs\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0017J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0013HÆ\u0003Jc\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001J&\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>HÁ\u0001¢\u0006\u0002\b?R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006L"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "", "seen1", "", "l2SplashScreen", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L2SplashScreen;", "l3SplashScreen", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3SplashScreen;", "benefitsScreen", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$BenefitsScreen;", "risksScreen", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$RisksScreen;", "professionalTraderScreen", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ProfessionalTraderScreen;", "investorProfileSplashScreen", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen;", "experienceTestSplashScreen", "knowledgeTestSplashScreen", "l3benefitsScreen", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3BenefitsScreen;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L2SplashScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3SplashScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$BenefitsScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$RisksScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ProfessionalTraderScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3BenefitsScreen;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L2SplashScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3SplashScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$BenefitsScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$RisksScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ProfessionalTraderScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen;Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3BenefitsScreen;)V", "getBenefitsScreen", "()Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$BenefitsScreen;", "getExperienceTestSplashScreen", "()Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen;", "getInvestorProfileSplashScreen", "getKnowledgeTestSplashScreen", "getL2SplashScreen", "()Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L2SplashScreen;", "getL3SplashScreen", "()Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3SplashScreen;", "getL3benefitsScreen", "()Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3BenefitsScreen;", "getProfessionalTraderScreen", "()Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ProfessionalTraderScreen;", "getRisksScreen", "()Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$RisksScreen;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "BenefitsScreen", "Companion", "L2SplashScreen", "L3BenefitsScreen", "L3SplashScreen", "ProfessionalTraderScreen", "QuestionnaireSplashScreen", "RisksScreen", "ValueProp", "ValuePropWithNumberPog", "ValuePropWithTitle", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes22.dex */
public final /* data */ class UkOptionsOnboardingContent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BenefitsScreen benefitsScreen;
    private final QuestionnaireSplashScreen experienceTestSplashScreen;
    private final QuestionnaireSplashScreen investorProfileSplashScreen;
    private final QuestionnaireSplashScreen knowledgeTestSplashScreen;
    private final L2SplashScreen l2SplashScreen;
    private final L3SplashScreen l3SplashScreen;
    private final L3BenefitsScreen l3benefitsScreen;
    private final ProfessionalTraderScreen professionalTraderScreen;
    private final RisksScreen risksScreen;

    public static /* synthetic */ UkOptionsOnboardingContent copy$default(UkOptionsOnboardingContent ukOptionsOnboardingContent, L2SplashScreen l2SplashScreen, L3SplashScreen l3SplashScreen, BenefitsScreen benefitsScreen, RisksScreen risksScreen, ProfessionalTraderScreen professionalTraderScreen, QuestionnaireSplashScreen questionnaireSplashScreen, QuestionnaireSplashScreen questionnaireSplashScreen2, QuestionnaireSplashScreen questionnaireSplashScreen3, L3BenefitsScreen l3BenefitsScreen, int i, Object obj) {
        if ((i & 1) != 0) {
            l2SplashScreen = ukOptionsOnboardingContent.l2SplashScreen;
        }
        if ((i & 2) != 0) {
            l3SplashScreen = ukOptionsOnboardingContent.l3SplashScreen;
        }
        if ((i & 4) != 0) {
            benefitsScreen = ukOptionsOnboardingContent.benefitsScreen;
        }
        if ((i & 8) != 0) {
            risksScreen = ukOptionsOnboardingContent.risksScreen;
        }
        if ((i & 16) != 0) {
            professionalTraderScreen = ukOptionsOnboardingContent.professionalTraderScreen;
        }
        if ((i & 32) != 0) {
            questionnaireSplashScreen = ukOptionsOnboardingContent.investorProfileSplashScreen;
        }
        if ((i & 64) != 0) {
            questionnaireSplashScreen2 = ukOptionsOnboardingContent.experienceTestSplashScreen;
        }
        if ((i & 128) != 0) {
            questionnaireSplashScreen3 = ukOptionsOnboardingContent.knowledgeTestSplashScreen;
        }
        if ((i & 256) != 0) {
            l3BenefitsScreen = ukOptionsOnboardingContent.l3benefitsScreen;
        }
        QuestionnaireSplashScreen questionnaireSplashScreen4 = questionnaireSplashScreen3;
        L3BenefitsScreen l3BenefitsScreen2 = l3BenefitsScreen;
        QuestionnaireSplashScreen questionnaireSplashScreen5 = questionnaireSplashScreen;
        QuestionnaireSplashScreen questionnaireSplashScreen6 = questionnaireSplashScreen2;
        ProfessionalTraderScreen professionalTraderScreen2 = professionalTraderScreen;
        BenefitsScreen benefitsScreen2 = benefitsScreen;
        return ukOptionsOnboardingContent.copy(l2SplashScreen, l3SplashScreen, benefitsScreen2, risksScreen, professionalTraderScreen2, questionnaireSplashScreen5, questionnaireSplashScreen6, questionnaireSplashScreen4, l3BenefitsScreen2);
    }

    /* renamed from: component1, reason: from getter */
    public final L2SplashScreen getL2SplashScreen() {
        return this.l2SplashScreen;
    }

    /* renamed from: component2, reason: from getter */
    public final L3SplashScreen getL3SplashScreen() {
        return this.l3SplashScreen;
    }

    /* renamed from: component3, reason: from getter */
    public final BenefitsScreen getBenefitsScreen() {
        return this.benefitsScreen;
    }

    /* renamed from: component4, reason: from getter */
    public final RisksScreen getRisksScreen() {
        return this.risksScreen;
    }

    /* renamed from: component5, reason: from getter */
    public final ProfessionalTraderScreen getProfessionalTraderScreen() {
        return this.professionalTraderScreen;
    }

    /* renamed from: component6, reason: from getter */
    public final QuestionnaireSplashScreen getInvestorProfileSplashScreen() {
        return this.investorProfileSplashScreen;
    }

    /* renamed from: component7, reason: from getter */
    public final QuestionnaireSplashScreen getExperienceTestSplashScreen() {
        return this.experienceTestSplashScreen;
    }

    /* renamed from: component8, reason: from getter */
    public final QuestionnaireSplashScreen getKnowledgeTestSplashScreen() {
        return this.knowledgeTestSplashScreen;
    }

    /* renamed from: component9, reason: from getter */
    public final L3BenefitsScreen getL3benefitsScreen() {
        return this.l3benefitsScreen;
    }

    public final UkOptionsOnboardingContent copy(L2SplashScreen l2SplashScreen, L3SplashScreen l3SplashScreen, BenefitsScreen benefitsScreen, RisksScreen risksScreen, ProfessionalTraderScreen professionalTraderScreen, QuestionnaireSplashScreen investorProfileSplashScreen, QuestionnaireSplashScreen experienceTestSplashScreen, QuestionnaireSplashScreen knowledgeTestSplashScreen, L3BenefitsScreen l3benefitsScreen) {
        Intrinsics.checkNotNullParameter(l2SplashScreen, "l2SplashScreen");
        Intrinsics.checkNotNullParameter(l3SplashScreen, "l3SplashScreen");
        Intrinsics.checkNotNullParameter(benefitsScreen, "benefitsScreen");
        Intrinsics.checkNotNullParameter(risksScreen, "risksScreen");
        Intrinsics.checkNotNullParameter(professionalTraderScreen, "professionalTraderScreen");
        Intrinsics.checkNotNullParameter(investorProfileSplashScreen, "investorProfileSplashScreen");
        Intrinsics.checkNotNullParameter(experienceTestSplashScreen, "experienceTestSplashScreen");
        Intrinsics.checkNotNullParameter(knowledgeTestSplashScreen, "knowledgeTestSplashScreen");
        Intrinsics.checkNotNullParameter(l3benefitsScreen, "l3benefitsScreen");
        return new UkOptionsOnboardingContent(l2SplashScreen, l3SplashScreen, benefitsScreen, risksScreen, professionalTraderScreen, investorProfileSplashScreen, experienceTestSplashScreen, knowledgeTestSplashScreen, l3benefitsScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkOptionsOnboardingContent)) {
            return false;
        }
        UkOptionsOnboardingContent ukOptionsOnboardingContent = (UkOptionsOnboardingContent) other;
        return Intrinsics.areEqual(this.l2SplashScreen, ukOptionsOnboardingContent.l2SplashScreen) && Intrinsics.areEqual(this.l3SplashScreen, ukOptionsOnboardingContent.l3SplashScreen) && Intrinsics.areEqual(this.benefitsScreen, ukOptionsOnboardingContent.benefitsScreen) && Intrinsics.areEqual(this.risksScreen, ukOptionsOnboardingContent.risksScreen) && Intrinsics.areEqual(this.professionalTraderScreen, ukOptionsOnboardingContent.professionalTraderScreen) && Intrinsics.areEqual(this.investorProfileSplashScreen, ukOptionsOnboardingContent.investorProfileSplashScreen) && Intrinsics.areEqual(this.experienceTestSplashScreen, ukOptionsOnboardingContent.experienceTestSplashScreen) && Intrinsics.areEqual(this.knowledgeTestSplashScreen, ukOptionsOnboardingContent.knowledgeTestSplashScreen) && Intrinsics.areEqual(this.l3benefitsScreen, ukOptionsOnboardingContent.l3benefitsScreen);
    }

    public int hashCode() {
        return (((((((((((((((this.l2SplashScreen.hashCode() * 31) + this.l3SplashScreen.hashCode()) * 31) + this.benefitsScreen.hashCode()) * 31) + this.risksScreen.hashCode()) * 31) + this.professionalTraderScreen.hashCode()) * 31) + this.investorProfileSplashScreen.hashCode()) * 31) + this.experienceTestSplashScreen.hashCode()) * 31) + this.knowledgeTestSplashScreen.hashCode()) * 31) + this.l3benefitsScreen.hashCode();
    }

    public String toString() {
        return "UkOptionsOnboardingContent(l2SplashScreen=" + this.l2SplashScreen + ", l3SplashScreen=" + this.l3SplashScreen + ", benefitsScreen=" + this.benefitsScreen + ", risksScreen=" + this.risksScreen + ", professionalTraderScreen=" + this.professionalTraderScreen + ", investorProfileSplashScreen=" + this.investorProfileSplashScreen + ", experienceTestSplashScreen=" + this.experienceTestSplashScreen + ", knowledgeTestSplashScreen=" + this.knowledgeTestSplashScreen + ", l3benefitsScreen=" + this.l3benefitsScreen + ")";
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UkOptionsOnboardingContent> serializer() {
            return UkOptionsOnboardingContent$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ UkOptionsOnboardingContent(int i, L2SplashScreen l2SplashScreen, L3SplashScreen l3SplashScreen, BenefitsScreen benefitsScreen, RisksScreen risksScreen, ProfessionalTraderScreen professionalTraderScreen, QuestionnaireSplashScreen questionnaireSplashScreen, QuestionnaireSplashScreen questionnaireSplashScreen2, QuestionnaireSplashScreen questionnaireSplashScreen3, L3BenefitsScreen l3BenefitsScreen, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            PluginExceptions.throwMissingFieldException(i, 511, UkOptionsOnboardingContent$$serializer.INSTANCE.getDescriptor());
        }
        this.l2SplashScreen = l2SplashScreen;
        this.l3SplashScreen = l3SplashScreen;
        this.benefitsScreen = benefitsScreen;
        this.risksScreen = risksScreen;
        this.professionalTraderScreen = professionalTraderScreen;
        this.investorProfileSplashScreen = questionnaireSplashScreen;
        this.experienceTestSplashScreen = questionnaireSplashScreen2;
        this.knowledgeTestSplashScreen = questionnaireSplashScreen3;
        this.l3benefitsScreen = l3BenefitsScreen;
    }

    public UkOptionsOnboardingContent(L2SplashScreen l2SplashScreen, L3SplashScreen l3SplashScreen, BenefitsScreen benefitsScreen, RisksScreen risksScreen, ProfessionalTraderScreen professionalTraderScreen, QuestionnaireSplashScreen investorProfileSplashScreen, QuestionnaireSplashScreen experienceTestSplashScreen, QuestionnaireSplashScreen knowledgeTestSplashScreen, L3BenefitsScreen l3benefitsScreen) {
        Intrinsics.checkNotNullParameter(l2SplashScreen, "l2SplashScreen");
        Intrinsics.checkNotNullParameter(l3SplashScreen, "l3SplashScreen");
        Intrinsics.checkNotNullParameter(benefitsScreen, "benefitsScreen");
        Intrinsics.checkNotNullParameter(risksScreen, "risksScreen");
        Intrinsics.checkNotNullParameter(professionalTraderScreen, "professionalTraderScreen");
        Intrinsics.checkNotNullParameter(investorProfileSplashScreen, "investorProfileSplashScreen");
        Intrinsics.checkNotNullParameter(experienceTestSplashScreen, "experienceTestSplashScreen");
        Intrinsics.checkNotNullParameter(knowledgeTestSplashScreen, "knowledgeTestSplashScreen");
        Intrinsics.checkNotNullParameter(l3benefitsScreen, "l3benefitsScreen");
        this.l2SplashScreen = l2SplashScreen;
        this.l3SplashScreen = l3SplashScreen;
        this.benefitsScreen = benefitsScreen;
        this.risksScreen = risksScreen;
        this.professionalTraderScreen = professionalTraderScreen;
        this.investorProfileSplashScreen = investorProfileSplashScreen;
        this.experienceTestSplashScreen = experienceTestSplashScreen;
        this.knowledgeTestSplashScreen = knowledgeTestSplashScreen;
        this.l3benefitsScreen = l3benefitsScreen;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(UkOptionsOnboardingContent self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, UkOptionsOnboardingContent$L2SplashScreen$$serializer.INSTANCE, self.l2SplashScreen);
        output.encodeSerializableElement(serialDesc, 1, UkOptionsOnboardingContent$L3SplashScreen$$serializer.INSTANCE, self.l3SplashScreen);
        output.encodeSerializableElement(serialDesc, 2, UkOptionsOnboardingContent$BenefitsScreen$$serializer.INSTANCE, self.benefitsScreen);
        output.encodeSerializableElement(serialDesc, 3, UkOptionsOnboardingContent$RisksScreen$$serializer.INSTANCE, self.risksScreen);
        output.encodeSerializableElement(serialDesc, 4, UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer.INSTANCE, self.professionalTraderScreen);
        UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer = UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 5, ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer, self.investorProfileSplashScreen);
        output.encodeSerializableElement(serialDesc, 6, ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer, self.experienceTestSplashScreen);
        output.encodeSerializableElement(serialDesc, 7, ukOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer, self.knowledgeTestSplashScreen);
        output.encodeSerializableElement(serialDesc, 8, UkOptionsOnboardingContent$L3BenefitsScreen$$serializer.INSTANCE, self.l3benefitsScreen);
    }

    public final L2SplashScreen getL2SplashScreen() {
        return this.l2SplashScreen;
    }

    public final L3SplashScreen getL3SplashScreen() {
        return this.l3SplashScreen;
    }

    public final BenefitsScreen getBenefitsScreen() {
        return this.benefitsScreen;
    }

    public final RisksScreen getRisksScreen() {
        return this.risksScreen;
    }

    public final ProfessionalTraderScreen getProfessionalTraderScreen() {
        return this.professionalTraderScreen;
    }

    public final QuestionnaireSplashScreen getInvestorProfileSplashScreen() {
        return this.investorProfileSplashScreen;
    }

    public final QuestionnaireSplashScreen getExperienceTestSplashScreen() {
        return this.experienceTestSplashScreen;
    }

    public final QuestionnaireSplashScreen getKnowledgeTestSplashScreen() {
        return this.knowledgeTestSplashScreen;
    }

    public final L3BenefitsScreen getL3benefitsScreen() {
        return this.l3benefitsScreen;
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L2SplashScreen;", "", "seen1", "", "title", "", "description", "disclosureMarkdown", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getDisclosureMarkdown", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class L2SplashScreen {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String description;
        private final String disclosureMarkdown;
        private final String title;

        public static /* synthetic */ L2SplashScreen copy$default(L2SplashScreen l2SplashScreen, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = l2SplashScreen.title;
            }
            if ((i & 2) != 0) {
                str2 = l2SplashScreen.description;
            }
            if ((i & 4) != 0) {
                str3 = l2SplashScreen.disclosureMarkdown;
            }
            return l2SplashScreen.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final L2SplashScreen copy(String title, String description, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            return new L2SplashScreen(title, description, disclosureMarkdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof L2SplashScreen)) {
                return false;
            }
            L2SplashScreen l2SplashScreen = (L2SplashScreen) other;
            return Intrinsics.areEqual(this.title, l2SplashScreen.title) && Intrinsics.areEqual(this.description, l2SplashScreen.description) && Intrinsics.areEqual(this.disclosureMarkdown, l2SplashScreen.disclosureMarkdown);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.disclosureMarkdown.hashCode();
        }

        public String toString() {
            return "L2SplashScreen(title=" + this.title + ", description=" + this.description + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
        }

        /* compiled from: UkOptionsOnboardingContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L2SplashScreen$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L2SplashScreen;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<L2SplashScreen> serializer() {
                return UkOptionsOnboardingContent$L2SplashScreen$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ L2SplashScreen(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, UkOptionsOnboardingContent$L2SplashScreen$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.description = str2;
            this.disclosureMarkdown = str3;
        }

        public L2SplashScreen(String title, String description, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            this.title = title;
            this.description = description;
            this.disclosureMarkdown = disclosureMarkdown;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(L2SplashScreen self, Encoding3 output, SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeStringElement(serialDesc, 1, self.description);
            output.encodeStringElement(serialDesc, 2, self.disclosureMarkdown);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3SplashScreen;", "", "seen1", "", "title", "", "description", "disclosureMarkdown", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getDisclosureMarkdown", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class L3SplashScreen {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String description;
        private final String disclosureMarkdown;
        private final String title;

        public static /* synthetic */ L3SplashScreen copy$default(L3SplashScreen l3SplashScreen, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = l3SplashScreen.title;
            }
            if ((i & 2) != 0) {
                str2 = l3SplashScreen.description;
            }
            if ((i & 4) != 0) {
                str3 = l3SplashScreen.disclosureMarkdown;
            }
            return l3SplashScreen.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final L3SplashScreen copy(String title, String description, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            return new L3SplashScreen(title, description, disclosureMarkdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof L3SplashScreen)) {
                return false;
            }
            L3SplashScreen l3SplashScreen = (L3SplashScreen) other;
            return Intrinsics.areEqual(this.title, l3SplashScreen.title) && Intrinsics.areEqual(this.description, l3SplashScreen.description) && Intrinsics.areEqual(this.disclosureMarkdown, l3SplashScreen.disclosureMarkdown);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.disclosureMarkdown.hashCode();
        }

        public String toString() {
            return "L3SplashScreen(title=" + this.title + ", description=" + this.description + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
        }

        /* compiled from: UkOptionsOnboardingContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3SplashScreen$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3SplashScreen;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<L3SplashScreen> serializer() {
                return UkOptionsOnboardingContent$L3SplashScreen$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ L3SplashScreen(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, UkOptionsOnboardingContent$L3SplashScreen$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.description = str2;
            this.disclosureMarkdown = str3;
        }

        public L3SplashScreen(String title, String description, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            this.title = title;
            this.description = description;
            this.disclosureMarkdown = disclosureMarkdown;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(L3SplashScreen self, Encoding3 output, SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeStringElement(serialDesc, 1, self.description);
            output.encodeStringElement(serialDesc, 2, self.disclosureMarkdown);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$BenefitsScreen;", "", "seen1", "", "title", "", "valueProps", "", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValuePropWithTitle;", "disclosureMarkdown", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDisclosureMarkdown", "()Ljava/lang/String;", "getTitle", "getValueProps", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class BenefitsScreen {
        private final String disclosureMarkdown;
        private final String title;
        private final List<ValuePropWithTitle> valueProps;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(UkOptionsOnboardingContent$ValuePropWithTitle$$serializer.INSTANCE), null};

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BenefitsScreen copy$default(BenefitsScreen benefitsScreen, String str, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = benefitsScreen.title;
            }
            if ((i & 2) != 0) {
                list = benefitsScreen.valueProps;
            }
            if ((i & 4) != 0) {
                str2 = benefitsScreen.disclosureMarkdown;
            }
            return benefitsScreen.copy(str, list, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<ValuePropWithTitle> component2() {
            return this.valueProps;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final BenefitsScreen copy(String title, List<ValuePropWithTitle> valueProps, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            return new BenefitsScreen(title, valueProps, disclosureMarkdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BenefitsScreen)) {
                return false;
            }
            BenefitsScreen benefitsScreen = (BenefitsScreen) other;
            return Intrinsics.areEqual(this.title, benefitsScreen.title) && Intrinsics.areEqual(this.valueProps, benefitsScreen.valueProps) && Intrinsics.areEqual(this.disclosureMarkdown, benefitsScreen.disclosureMarkdown);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.valueProps.hashCode()) * 31) + this.disclosureMarkdown.hashCode();
        }

        public String toString() {
            return "BenefitsScreen(title=" + this.title + ", valueProps=" + this.valueProps + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
        }

        /* compiled from: UkOptionsOnboardingContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$BenefitsScreen$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$BenefitsScreen;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<BenefitsScreen> serializer() {
                return UkOptionsOnboardingContent$BenefitsScreen$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ BenefitsScreen(int i, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, UkOptionsOnboardingContent$BenefitsScreen$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.valueProps = list;
            this.disclosureMarkdown = str2;
        }

        public BenefitsScreen(String title, List<ValuePropWithTitle> valueProps, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            this.title = title;
            this.valueProps = valueProps;
            this.disclosureMarkdown = disclosureMarkdown;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(BenefitsScreen self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.valueProps);
            output.encodeStringElement(serialDesc, 2, self.disclosureMarkdown);
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<ValuePropWithTitle> getValueProps() {
            return this.valueProps;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$RisksScreen;", "", "seen1", "", "title", "", "valueProps", "", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValuePropWithTitle;", "disclosureMarkdown", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDisclosureMarkdown", "()Ljava/lang/String;", "getTitle", "getValueProps", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class RisksScreen {
        private final String disclosureMarkdown;
        private final String title;
        private final List<ValuePropWithTitle> valueProps;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(UkOptionsOnboardingContent$ValuePropWithTitle$$serializer.INSTANCE), null};

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RisksScreen copy$default(RisksScreen risksScreen, String str, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = risksScreen.title;
            }
            if ((i & 2) != 0) {
                list = risksScreen.valueProps;
            }
            if ((i & 4) != 0) {
                str2 = risksScreen.disclosureMarkdown;
            }
            return risksScreen.copy(str, list, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<ValuePropWithTitle> component2() {
            return this.valueProps;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final RisksScreen copy(String title, List<ValuePropWithTitle> valueProps, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            return new RisksScreen(title, valueProps, disclosureMarkdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RisksScreen)) {
                return false;
            }
            RisksScreen risksScreen = (RisksScreen) other;
            return Intrinsics.areEqual(this.title, risksScreen.title) && Intrinsics.areEqual(this.valueProps, risksScreen.valueProps) && Intrinsics.areEqual(this.disclosureMarkdown, risksScreen.disclosureMarkdown);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.valueProps.hashCode()) * 31) + this.disclosureMarkdown.hashCode();
        }

        public String toString() {
            return "RisksScreen(title=" + this.title + ", valueProps=" + this.valueProps + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
        }

        /* compiled from: UkOptionsOnboardingContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$RisksScreen$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$RisksScreen;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RisksScreen> serializer() {
                return UkOptionsOnboardingContent$RisksScreen$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ RisksScreen(int i, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, UkOptionsOnboardingContent$RisksScreen$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.valueProps = list;
            this.disclosureMarkdown = str2;
        }

        public RisksScreen(String title, List<ValuePropWithTitle> valueProps, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            this.title = title;
            this.valueProps = valueProps;
            this.disclosureMarkdown = disclosureMarkdown;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(RisksScreen self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.valueProps);
            output.encodeStringElement(serialDesc, 2, self.disclosureMarkdown);
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<ValuePropWithTitle> getValueProps() {
            return this.valueProps;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValuePropWithTitle;", "", "seen1", "", "title", "", "description", "icon", "Lmicrogram/ui/sdui/SduiIcon;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiIcon;)V", "getDescription", "()Ljava/lang/String;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class ValuePropWithTitle {
        private final String description;
        private final SduiIcon icon;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, SduiIcon.INSTANCE.serializer()};

        public static /* synthetic */ ValuePropWithTitle copy$default(ValuePropWithTitle valuePropWithTitle, String str, String str2, SduiIcon sduiIcon, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valuePropWithTitle.title;
            }
            if ((i & 2) != 0) {
                str2 = valuePropWithTitle.description;
            }
            if ((i & 4) != 0) {
                sduiIcon = valuePropWithTitle.icon;
            }
            return valuePropWithTitle.copy(str, str2, sduiIcon);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final SduiIcon getIcon() {
            return this.icon;
        }

        public final ValuePropWithTitle copy(String title, String description, SduiIcon icon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new ValuePropWithTitle(title, description, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValuePropWithTitle)) {
                return false;
            }
            ValuePropWithTitle valuePropWithTitle = (ValuePropWithTitle) other;
            return Intrinsics.areEqual(this.title, valuePropWithTitle.title) && Intrinsics.areEqual(this.description, valuePropWithTitle.description) && this.icon == valuePropWithTitle.icon;
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.icon.hashCode();
        }

        public String toString() {
            return "ValuePropWithTitle(title=" + this.title + ", description=" + this.description + ", icon=" + this.icon + ")";
        }

        /* compiled from: UkOptionsOnboardingContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValuePropWithTitle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValuePropWithTitle;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ValuePropWithTitle> serializer() {
                return UkOptionsOnboardingContent$ValuePropWithTitle$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ ValuePropWithTitle(int i, String str, String str2, SduiIcon sduiIcon, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, UkOptionsOnboardingContent$ValuePropWithTitle$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.description = str2;
            this.icon = sduiIcon;
        }

        public ValuePropWithTitle(String title, String description, SduiIcon icon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.title = title;
            this.description = description;
            this.icon = icon;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(ValuePropWithTitle self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeStringElement(serialDesc, 1, self.description);
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.icon);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final SduiIcon getIcon() {
            return this.icon;
        }
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BG\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÁ\u0001¢\u0006\u0002\b&R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ProfessionalTraderScreen;", "", "seen1", "", "title", "", "description", "valueProps", "", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValueProp;", "disclosureMarkdown", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getDisclosureMarkdown", "getTitle", "getValueProps", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class ProfessionalTraderScreen {
        private final String description;
        private final String disclosureMarkdown;
        private final String title;
        private final List<ValueProp> valueProps;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(UkOptionsOnboardingContent$ValueProp$$serializer.INSTANCE), null};

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProfessionalTraderScreen copy$default(ProfessionalTraderScreen professionalTraderScreen, String str, String str2, List list, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = professionalTraderScreen.title;
            }
            if ((i & 2) != 0) {
                str2 = professionalTraderScreen.description;
            }
            if ((i & 4) != 0) {
                list = professionalTraderScreen.valueProps;
            }
            if ((i & 8) != 0) {
                str3 = professionalTraderScreen.disclosureMarkdown;
            }
            return professionalTraderScreen.copy(str, str2, list, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final List<ValueProp> component3() {
            return this.valueProps;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final ProfessionalTraderScreen copy(String title, String description, List<ValueProp> valueProps, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            return new ProfessionalTraderScreen(title, description, valueProps, disclosureMarkdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfessionalTraderScreen)) {
                return false;
            }
            ProfessionalTraderScreen professionalTraderScreen = (ProfessionalTraderScreen) other;
            return Intrinsics.areEqual(this.title, professionalTraderScreen.title) && Intrinsics.areEqual(this.description, professionalTraderScreen.description) && Intrinsics.areEqual(this.valueProps, professionalTraderScreen.valueProps) && Intrinsics.areEqual(this.disclosureMarkdown, professionalTraderScreen.disclosureMarkdown);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.valueProps.hashCode()) * 31) + this.disclosureMarkdown.hashCode();
        }

        public String toString() {
            return "ProfessionalTraderScreen(title=" + this.title + ", description=" + this.description + ", valueProps=" + this.valueProps + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
        }

        /* compiled from: UkOptionsOnboardingContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ProfessionalTraderScreen$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ProfessionalTraderScreen;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ProfessionalTraderScreen> serializer() {
                return UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ ProfessionalTraderScreen(int i, String str, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptions.throwMissingFieldException(i, 15, UkOptionsOnboardingContent$ProfessionalTraderScreen$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.description = str2;
            this.valueProps = list;
            this.disclosureMarkdown = str3;
        }

        public ProfessionalTraderScreen(String title, String description, List<ValueProp> valueProps, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            this.title = title;
            this.description = description;
            this.valueProps = valueProps;
            this.disclosureMarkdown = disclosureMarkdown;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(ProfessionalTraderScreen self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeStringElement(serialDesc, 1, self.description);
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.valueProps);
            output.encodeStringElement(serialDesc, 3, self.disclosureMarkdown);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final List<ValueProp> getValueProps() {
            return this.valueProps;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValueProp;", "", "seen1", "", "text", "", "icon", "Lmicrogram/ui/sdui/SduiIcon;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lmicrogram/ui/sdui/SduiIcon;)V", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class ValueProp {
        private final SduiIcon icon;
        private final String text;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, SduiIcon.INSTANCE.serializer()};

        public static /* synthetic */ ValueProp copy$default(ValueProp valueProp, String str, SduiIcon sduiIcon, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valueProp.text;
            }
            if ((i & 2) != 0) {
                sduiIcon = valueProp.icon;
            }
            return valueProp.copy(str, sduiIcon);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final SduiIcon getIcon() {
            return this.icon;
        }

        public final ValueProp copy(String text, SduiIcon icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new ValueProp(text, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValueProp)) {
                return false;
            }
            ValueProp valueProp = (ValueProp) other;
            return Intrinsics.areEqual(this.text, valueProp.text) && this.icon == valueProp.icon;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.icon.hashCode();
        }

        public String toString() {
            return "ValueProp(text=" + this.text + ", icon=" + this.icon + ")";
        }

        /* compiled from: UkOptionsOnboardingContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValueProp$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValueProp;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ValueProp> serializer() {
                return UkOptionsOnboardingContent$ValueProp$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ ValueProp(int i, String str, SduiIcon sduiIcon, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptions.throwMissingFieldException(i, 3, UkOptionsOnboardingContent$ValueProp$$serializer.INSTANCE.getDescriptor());
            }
            this.text = str;
            this.icon = sduiIcon;
        }

        public ValueProp(String text, SduiIcon icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.text = text;
            this.icon = icon;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(ValueProp self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.text);
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.icon);
        }

        public final String getText() {
            return this.text;
        }

        public final SduiIcon getIcon() {
            return this.icon;
        }
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen;", "", "seen1", "", "title", "", "description", "l3description", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getL3description", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class QuestionnaireSplashScreen {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String description;
        private final String l3description;
        private final String title;

        public static /* synthetic */ QuestionnaireSplashScreen copy$default(QuestionnaireSplashScreen questionnaireSplashScreen, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = questionnaireSplashScreen.title;
            }
            if ((i & 2) != 0) {
                str2 = questionnaireSplashScreen.description;
            }
            if ((i & 4) != 0) {
                str3 = questionnaireSplashScreen.l3description;
            }
            return questionnaireSplashScreen.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getL3description() {
            return this.l3description;
        }

        public final QuestionnaireSplashScreen copy(String title, String description, String l3description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new QuestionnaireSplashScreen(title, description, l3description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionnaireSplashScreen)) {
                return false;
            }
            QuestionnaireSplashScreen questionnaireSplashScreen = (QuestionnaireSplashScreen) other;
            return Intrinsics.areEqual(this.title, questionnaireSplashScreen.title) && Intrinsics.areEqual(this.description, questionnaireSplashScreen.description) && Intrinsics.areEqual(this.l3description, questionnaireSplashScreen.l3description);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.description.hashCode()) * 31;
            String str = this.l3description;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "QuestionnaireSplashScreen(title=" + this.title + ", description=" + this.description + ", l3description=" + this.l3description + ")";
        }

        /* compiled from: UkOptionsOnboardingContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$QuestionnaireSplashScreen;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<QuestionnaireSplashScreen> serializer() {
                return UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ QuestionnaireSplashScreen(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptions.throwMissingFieldException(i, 3, UkOptionsOnboardingContent$QuestionnaireSplashScreen$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.description = str2;
            if ((i & 4) == 0) {
                this.l3description = null;
            } else {
                this.l3description = str3;
            }
        }

        public QuestionnaireSplashScreen(String title, String description, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = title;
            this.description = description;
            this.l3description = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(QuestionnaireSplashScreen self, Encoding3 output, SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeStringElement(serialDesc, 1, self.description);
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.l3description == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.l3description);
        }

        public /* synthetic */ QuestionnaireSplashScreen(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getL3description() {
            return this.l3description;
        }
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValuePropWithNumberPog;", "", "seen1", "", "title", "", "description", "numberIcon", "Lmicrogram/ui/sdui/SduiNumberPog;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiNumberPog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiNumberPog;)V", "getDescription", "()Ljava/lang/String;", "getNumberIcon", "()Lmicrogram/ui/sdui/SduiNumberPog;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class ValuePropWithNumberPog {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String description;
        private final SduiNumberPog numberIcon;
        private final String title;

        public static /* synthetic */ ValuePropWithNumberPog copy$default(ValuePropWithNumberPog valuePropWithNumberPog, String str, String str2, SduiNumberPog sduiNumberPog, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valuePropWithNumberPog.title;
            }
            if ((i & 2) != 0) {
                str2 = valuePropWithNumberPog.description;
            }
            if ((i & 4) != 0) {
                sduiNumberPog = valuePropWithNumberPog.numberIcon;
            }
            return valuePropWithNumberPog.copy(str, str2, sduiNumberPog);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final SduiNumberPog getNumberIcon() {
            return this.numberIcon;
        }

        public final ValuePropWithNumberPog copy(String title, String description, SduiNumberPog numberIcon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(numberIcon, "numberIcon");
            return new ValuePropWithNumberPog(title, description, numberIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValuePropWithNumberPog)) {
                return false;
            }
            ValuePropWithNumberPog valuePropWithNumberPog = (ValuePropWithNumberPog) other;
            return Intrinsics.areEqual(this.title, valuePropWithNumberPog.title) && Intrinsics.areEqual(this.description, valuePropWithNumberPog.description) && Intrinsics.areEqual(this.numberIcon, valuePropWithNumberPog.numberIcon);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.numberIcon.hashCode();
        }

        public String toString() {
            return "ValuePropWithNumberPog(title=" + this.title + ", description=" + this.description + ", numberIcon=" + this.numberIcon + ")";
        }

        /* compiled from: UkOptionsOnboardingContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValuePropWithNumberPog$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValuePropWithNumberPog;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ValuePropWithNumberPog> serializer() {
                return UkOptionsOnboardingContent$ValuePropWithNumberPog$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ ValuePropWithNumberPog(int i, String str, String str2, SduiNumberPog sduiNumberPog, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, UkOptionsOnboardingContent$ValuePropWithNumberPog$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.description = str2;
            this.numberIcon = sduiNumberPog;
        }

        public ValuePropWithNumberPog(String title, String description, SduiNumberPog numberIcon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(numberIcon, "numberIcon");
            this.title = title;
            this.description = description;
            this.numberIcon = numberIcon;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(ValuePropWithNumberPog self, Encoding3 output, SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeStringElement(serialDesc, 1, self.description);
            output.encodeSerializableElement(serialDesc, 2, SduiNumberPog$$serializer.INSTANCE, self.numberIcon);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final SduiNumberPog getNumberIcon() {
            return this.numberIcon;
        }
    }

    /* compiled from: UkOptionsOnboardingContent.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3BenefitsScreen;", "", "seen1", "", "title", "", "valueProps", "", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$ValuePropWithNumberPog;", "disclosureMarkdown", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDisclosureMarkdown", "()Ljava/lang/String;", "getTitle", "getValueProps", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class L3BenefitsScreen {
        private final String disclosureMarkdown;
        private final String title;
        private final List<ValuePropWithNumberPog> valueProps;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(UkOptionsOnboardingContent$ValuePropWithNumberPog$$serializer.INSTANCE), null};

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ L3BenefitsScreen copy$default(L3BenefitsScreen l3BenefitsScreen, String str, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = l3BenefitsScreen.title;
            }
            if ((i & 2) != 0) {
                list = l3BenefitsScreen.valueProps;
            }
            if ((i & 4) != 0) {
                str2 = l3BenefitsScreen.disclosureMarkdown;
            }
            return l3BenefitsScreen.copy(str, list, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<ValuePropWithNumberPog> component2() {
            return this.valueProps;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final L3BenefitsScreen copy(String title, List<ValuePropWithNumberPog> valueProps, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            return new L3BenefitsScreen(title, valueProps, disclosureMarkdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof L3BenefitsScreen)) {
                return false;
            }
            L3BenefitsScreen l3BenefitsScreen = (L3BenefitsScreen) other;
            return Intrinsics.areEqual(this.title, l3BenefitsScreen.title) && Intrinsics.areEqual(this.valueProps, l3BenefitsScreen.valueProps) && Intrinsics.areEqual(this.disclosureMarkdown, l3BenefitsScreen.disclosureMarkdown);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.valueProps.hashCode()) * 31) + this.disclosureMarkdown.hashCode();
        }

        public String toString() {
            return "L3BenefitsScreen(title=" + this.title + ", valueProps=" + this.valueProps + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
        }

        /* compiled from: UkOptionsOnboardingContent.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3BenefitsScreen$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/options/uk/intro/contracts/model/UkOptionsOnboardingContent$L3BenefitsScreen;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<L3BenefitsScreen> serializer() {
                return UkOptionsOnboardingContent$L3BenefitsScreen$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ L3BenefitsScreen(int i, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptions.throwMissingFieldException(i, 7, UkOptionsOnboardingContent$L3BenefitsScreen$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.valueProps = list;
            this.disclosureMarkdown = str2;
        }

        public L3BenefitsScreen(String title, List<ValuePropWithNumberPog> valueProps, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            this.title = title;
            this.valueProps = valueProps;
            this.disclosureMarkdown = disclosureMarkdown;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts(L3BenefitsScreen self, Encoding3 output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.valueProps);
            output.encodeStringElement(serialDesc, 2, self.disclosureMarkdown);
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<ValuePropWithNumberPog> getValueProps() {
            return this.valueProps;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }
    }
}
