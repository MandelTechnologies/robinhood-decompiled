package com.robinhood.android.goldearningspotential.microgram;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldEarningsCalculatorUiModel.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsDisclosureUiModel;", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/models/serverdriven/experimental/api/Text;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "trailingTextButton", "trailingTextButtonAlert", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Text;Lcom/robinhood/models/serverdriven/experimental/api/Text;Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;)V", "getDisclosure", "()Lcom/robinhood/models/serverdriven/experimental/api/Text;", "getTrailingTextButton", "getTrailingTextButtonAlert", "()Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldEarningsDisclosureUiModel {
    public static final int $stable = 8;
    private final Text<GenericAction> disclosure;
    private final Text<GenericAction> trailingTextButton;
    private final GoldEarningsCalculatorAlertContentUiModel trailingTextButtonAlert;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoldEarningsDisclosureUiModel copy$default(GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel, Text text, Text text2, GoldEarningsCalculatorAlertContentUiModel goldEarningsCalculatorAlertContentUiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            text = goldEarningsDisclosureUiModel.disclosure;
        }
        if ((i & 2) != 0) {
            text2 = goldEarningsDisclosureUiModel.trailingTextButton;
        }
        if ((i & 4) != 0) {
            goldEarningsCalculatorAlertContentUiModel = goldEarningsDisclosureUiModel.trailingTextButtonAlert;
        }
        return goldEarningsDisclosureUiModel.copy(text, text2, goldEarningsCalculatorAlertContentUiModel);
    }

    public final Text<GenericAction> component1() {
        return this.disclosure;
    }

    public final Text<GenericAction> component2() {
        return this.trailingTextButton;
    }

    /* renamed from: component3, reason: from getter */
    public final GoldEarningsCalculatorAlertContentUiModel getTrailingTextButtonAlert() {
        return this.trailingTextButtonAlert;
    }

    public final GoldEarningsDisclosureUiModel copy(Text<? extends GenericAction> disclosure, Text<? extends GenericAction> trailingTextButton, GoldEarningsCalculatorAlertContentUiModel trailingTextButtonAlert) {
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(trailingTextButton, "trailingTextButton");
        Intrinsics.checkNotNullParameter(trailingTextButtonAlert, "trailingTextButtonAlert");
        return new GoldEarningsDisclosureUiModel(disclosure, trailingTextButton, trailingTextButtonAlert);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldEarningsDisclosureUiModel)) {
            return false;
        }
        GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel = (GoldEarningsDisclosureUiModel) other;
        return Intrinsics.areEqual(this.disclosure, goldEarningsDisclosureUiModel.disclosure) && Intrinsics.areEqual(this.trailingTextButton, goldEarningsDisclosureUiModel.trailingTextButton) && Intrinsics.areEqual(this.trailingTextButtonAlert, goldEarningsDisclosureUiModel.trailingTextButtonAlert);
    }

    public int hashCode() {
        return (((this.disclosure.hashCode() * 31) + this.trailingTextButton.hashCode()) * 31) + this.trailingTextButtonAlert.hashCode();
    }

    public String toString() {
        return "GoldEarningsDisclosureUiModel(disclosure=" + this.disclosure + ", trailingTextButton=" + this.trailingTextButton + ", trailingTextButtonAlert=" + this.trailingTextButtonAlert + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoldEarningsDisclosureUiModel(Text<? extends GenericAction> disclosure, Text<? extends GenericAction> trailingTextButton, GoldEarningsCalculatorAlertContentUiModel trailingTextButtonAlert) {
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(trailingTextButton, "trailingTextButton");
        Intrinsics.checkNotNullParameter(trailingTextButtonAlert, "trailingTextButtonAlert");
        this.disclosure = disclosure;
        this.trailingTextButton = trailingTextButton;
        this.trailingTextButtonAlert = trailingTextButtonAlert;
    }

    public final Text<GenericAction> getDisclosure() {
        return this.disclosure;
    }

    public final Text<GenericAction> getTrailingTextButton() {
        return this.trailingTextButton;
    }

    public final GoldEarningsCalculatorAlertContentUiModel getTrailingTextButtonAlert() {
        return this.trailingTextButtonAlert;
    }
}
