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
import microgram.p507ui.sdui.SduiText;
import microgram.p507ui.sdui.SduiText$$serializer;

/* compiled from: GoldEarningsModel.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel;", "", "seen1", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lmicrogram/ui/sdui/SduiText;", "trailingTextButton", "trailingTextButtonAction", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorAlertAction;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILmicrogram/ui/sdui/SduiText;Lmicrogram/ui/sdui/SduiText;Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorAlertAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lmicrogram/ui/sdui/SduiText;Lmicrogram/ui/sdui/SduiText;Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorAlertAction;)V", "getDisclosure", "()Lmicrogram/ui/sdui/SduiText;", "getTrailingTextButton", "getTrailingTextButtonAction", "()Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorAlertAction;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes22.dex */
public final /* data */ class GoldEarningsCalculatorDisclosureViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiText disclosure;
    private final SduiText trailingTextButton;
    private final GoldEarningsCalculatorAlertAction trailingTextButtonAction;

    public static /* synthetic */ GoldEarningsCalculatorDisclosureViewModel copy$default(GoldEarningsCalculatorDisclosureViewModel goldEarningsCalculatorDisclosureViewModel, SduiText sduiText, SduiText sduiText2, GoldEarningsCalculatorAlertAction goldEarningsCalculatorAlertAction, int i, Object obj) {
        if ((i & 1) != 0) {
            sduiText = goldEarningsCalculatorDisclosureViewModel.disclosure;
        }
        if ((i & 2) != 0) {
            sduiText2 = goldEarningsCalculatorDisclosureViewModel.trailingTextButton;
        }
        if ((i & 4) != 0) {
            goldEarningsCalculatorAlertAction = goldEarningsCalculatorDisclosureViewModel.trailingTextButtonAction;
        }
        return goldEarningsCalculatorDisclosureViewModel.copy(sduiText, sduiText2, goldEarningsCalculatorAlertAction);
    }

    /* renamed from: component1, reason: from getter */
    public final SduiText getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component2, reason: from getter */
    public final SduiText getTrailingTextButton() {
        return this.trailingTextButton;
    }

    /* renamed from: component3, reason: from getter */
    public final GoldEarningsCalculatorAlertAction getTrailingTextButtonAction() {
        return this.trailingTextButtonAction;
    }

    public final GoldEarningsCalculatorDisclosureViewModel copy(SduiText disclosure, SduiText trailingTextButton, GoldEarningsCalculatorAlertAction trailingTextButtonAction) {
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(trailingTextButton, "trailingTextButton");
        Intrinsics.checkNotNullParameter(trailingTextButtonAction, "trailingTextButtonAction");
        return new GoldEarningsCalculatorDisclosureViewModel(disclosure, trailingTextButton, trailingTextButtonAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldEarningsCalculatorDisclosureViewModel)) {
            return false;
        }
        GoldEarningsCalculatorDisclosureViewModel goldEarningsCalculatorDisclosureViewModel = (GoldEarningsCalculatorDisclosureViewModel) other;
        return Intrinsics.areEqual(this.disclosure, goldEarningsCalculatorDisclosureViewModel.disclosure) && Intrinsics.areEqual(this.trailingTextButton, goldEarningsCalculatorDisclosureViewModel.trailingTextButton) && Intrinsics.areEqual(this.trailingTextButtonAction, goldEarningsCalculatorDisclosureViewModel.trailingTextButtonAction);
    }

    public int hashCode() {
        return (((this.disclosure.hashCode() * 31) + this.trailingTextButton.hashCode()) * 31) + this.trailingTextButtonAction.hashCode();
    }

    public String toString() {
        return "GoldEarningsCalculatorDisclosureViewModel(disclosure=" + this.disclosure + ", trailingTextButton=" + this.trailingTextButton + ", trailingTextButtonAction=" + this.trailingTextButtonAction + ")";
    }

    /* compiled from: GoldEarningsModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/onboarding/goldearningspotential/contracts/GoldEarningsCalculatorDisclosureViewModel;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GoldEarningsCalculatorDisclosureViewModel> serializer() {
            return GoldEarningsCalculatorDisclosureViewModel$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ GoldEarningsCalculatorDisclosureViewModel(int i, SduiText sduiText, SduiText sduiText2, GoldEarningsCalculatorAlertAction goldEarningsCalculatorAlertAction, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, GoldEarningsCalculatorDisclosureViewModel$$serializer.INSTANCE.getDescriptor());
        }
        this.disclosure = sduiText;
        this.trailingTextButton = sduiText2;
        this.trailingTextButtonAction = goldEarningsCalculatorAlertAction;
    }

    public GoldEarningsCalculatorDisclosureViewModel(SduiText disclosure, SduiText trailingTextButton, GoldEarningsCalculatorAlertAction trailingTextButtonAction) {
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(trailingTextButton, "trailingTextButton");
        Intrinsics.checkNotNullParameter(trailingTextButtonAction, "trailingTextButtonAction");
        this.disclosure = disclosure;
        this.trailingTextButton = trailingTextButton;
        this.trailingTextButtonAction = trailingTextButtonAction;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$contracts(GoldEarningsCalculatorDisclosureViewModel self, Encoding3 output, SerialDescriptor serialDesc) {
        SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, sduiText$$serializer, self.disclosure);
        output.encodeSerializableElement(serialDesc, 1, sduiText$$serializer, self.trailingTextButton);
        output.encodeSerializableElement(serialDesc, 2, GoldEarningsCalculatorAlertAction$$serializer.INSTANCE, self.trailingTextButtonAction);
    }

    public final SduiText getDisclosure() {
        return this.disclosure;
    }

    public final SduiText getTrailingTextButton() {
        return this.trailingTextButton;
    }

    public final GoldEarningsCalculatorAlertAction getTrailingTextButtonAction() {
        return this.trailingTextButtonAction;
    }
}
