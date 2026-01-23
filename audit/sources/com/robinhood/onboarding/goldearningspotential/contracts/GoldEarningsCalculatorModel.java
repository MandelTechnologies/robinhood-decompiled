package com.robinhood.onboarding.goldearningspotential.contracts;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GoldEarningsModel.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;", "", "seen1", "", "calculator", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorViewModel;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorViewModel;Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorViewModel;Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel;)V", "getCalculator", "()Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorViewModel;", "getDisclosure", "()Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes22.dex */
public final /* data */ class GoldEarningsCalculatorModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final GoldEarningsCalculatorViewModel calculator;
    private final GoldEarningsCalculatorDisclosureViewModel disclosure;

    public static /* synthetic */ GoldEarningsCalculatorModel copy$default(GoldEarningsCalculatorModel goldEarningsCalculatorModel, GoldEarningsCalculatorViewModel goldEarningsCalculatorViewModel, GoldEarningsCalculatorDisclosureViewModel goldEarningsCalculatorDisclosureViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            goldEarningsCalculatorViewModel = goldEarningsCalculatorModel.calculator;
        }
        if ((i & 2) != 0) {
            goldEarningsCalculatorDisclosureViewModel = goldEarningsCalculatorModel.disclosure;
        }
        return goldEarningsCalculatorModel.copy(goldEarningsCalculatorViewModel, goldEarningsCalculatorDisclosureViewModel);
    }

    /* renamed from: component1, reason: from getter */
    public final GoldEarningsCalculatorViewModel getCalculator() {
        return this.calculator;
    }

    /* renamed from: component2, reason: from getter */
    public final GoldEarningsCalculatorDisclosureViewModel getDisclosure() {
        return this.disclosure;
    }

    public final GoldEarningsCalculatorModel copy(GoldEarningsCalculatorViewModel calculator, GoldEarningsCalculatorDisclosureViewModel disclosure) {
        Intrinsics.checkNotNullParameter(calculator, "calculator");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        return new GoldEarningsCalculatorModel(calculator, disclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldEarningsCalculatorModel)) {
            return false;
        }
        GoldEarningsCalculatorModel goldEarningsCalculatorModel = (GoldEarningsCalculatorModel) other;
        return Intrinsics.areEqual(this.calculator, goldEarningsCalculatorModel.calculator) && Intrinsics.areEqual(this.disclosure, goldEarningsCalculatorModel.disclosure);
    }

    public int hashCode() {
        return (this.calculator.hashCode() * 31) + this.disclosure.hashCode();
    }

    public String toString() {
        return "GoldEarningsCalculatorModel(calculator=" + this.calculator + ", disclosure=" + this.disclosure + ")";
    }

    /* compiled from: GoldEarningsModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorModel;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GoldEarningsCalculatorModel> serializer() {
            return GoldEarningsCalculatorModel$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ GoldEarningsCalculatorModel(int i, GoldEarningsCalculatorViewModel goldEarningsCalculatorViewModel, GoldEarningsCalculatorDisclosureViewModel goldEarningsCalculatorDisclosureViewModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, GoldEarningsCalculatorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.calculator = goldEarningsCalculatorViewModel;
        this.disclosure = goldEarningsCalculatorDisclosureViewModel;
    }

    public GoldEarningsCalculatorModel(GoldEarningsCalculatorViewModel calculator, GoldEarningsCalculatorDisclosureViewModel disclosure) {
        Intrinsics.checkNotNullParameter(calculator, "calculator");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        this.calculator = calculator;
        this.disclosure = disclosure;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(GoldEarningsCalculatorModel self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, GoldEarningsCalculatorViewModel$$serializer.INSTANCE, self.calculator);
        output.encodeSerializableElement(serialDesc, 1, GoldEarningsCalculatorDisclosureViewModel$$serializer.INSTANCE, self.disclosure);
    }

    public final GoldEarningsCalculatorViewModel getCalculator() {
        return this.calculator;
    }

    public final GoldEarningsCalculatorDisclosureViewModel getDisclosure() {
        return this.disclosure;
    }
}
