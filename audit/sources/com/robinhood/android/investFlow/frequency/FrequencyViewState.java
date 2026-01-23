package com.robinhood.android.investFlow.frequency;

import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: FrequencyViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJj\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0003\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u001bR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b3\u0010\u001bR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b4\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u0010\u001f¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/investFlow/frequency/FrequencyViewState;", "", "Lcom/robinhood/android/investFlow/frequency/Frequency;", "selectedFrequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "investFlowFrequency", "j$/time/LocalDate", "nextInvestmentDate", "", "frequencies", "", "useLearnMoreDisclaimer", "continueButtonEnabled", "dateSelectionEnabled", "", "disclaimerResId", "<init>", "(Lcom/robinhood/android/investFlow/frequency/Frequency;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;Lj$/time/LocalDate;Ljava/util/List;ZZZI)V", "component1", "()Lcom/robinhood/android/investFlow/frequency/Frequency;", "component2", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "component3", "()Lj$/time/LocalDate;", "component4", "()Ljava/util/List;", "component5", "()Z", "component6", "component7", "component8", "()I", "copy", "(Lcom/robinhood/android/investFlow/frequency/Frequency;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;Lj$/time/LocalDate;Ljava/util/List;ZZZI)Lcom/robinhood/android/investFlow/frequency/FrequencyViewState;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/investFlow/frequency/Frequency;", "getSelectedFrequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "getInvestFlowFrequency", "Lj$/time/LocalDate;", "getNextInvestmentDate", "Ljava/util/List;", "getFrequencies", "Z", "getUseLearnMoreDisclaimer", "getContinueButtonEnabled", "getDateSelectionEnabled", "I", "getDisclaimerResId", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FrequencyViewState {
    public static final int $stable = 8;
    private final boolean continueButtonEnabled;
    private final boolean dateSelectionEnabled;
    private final int disclaimerResId;
    private final List<Frequency> frequencies;
    private final InvestFlowFrequency investFlowFrequency;
    private final LocalDate nextInvestmentDate;
    private final Frequency selectedFrequency;
    private final boolean useLearnMoreDisclaimer;

    public static /* synthetic */ FrequencyViewState copy$default(FrequencyViewState frequencyViewState, Frequency frequency, InvestFlowFrequency investFlowFrequency, LocalDate localDate, List list, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            frequency = frequencyViewState.selectedFrequency;
        }
        if ((i2 & 2) != 0) {
            investFlowFrequency = frequencyViewState.investFlowFrequency;
        }
        if ((i2 & 4) != 0) {
            localDate = frequencyViewState.nextInvestmentDate;
        }
        if ((i2 & 8) != 0) {
            list = frequencyViewState.frequencies;
        }
        if ((i2 & 16) != 0) {
            z = frequencyViewState.useLearnMoreDisclaimer;
        }
        if ((i2 & 32) != 0) {
            z2 = frequencyViewState.continueButtonEnabled;
        }
        if ((i2 & 64) != 0) {
            z3 = frequencyViewState.dateSelectionEnabled;
        }
        if ((i2 & 128) != 0) {
            i = frequencyViewState.disclaimerResId;
        }
        boolean z4 = z3;
        int i3 = i;
        boolean z5 = z;
        boolean z6 = z2;
        return frequencyViewState.copy(frequency, investFlowFrequency, localDate, list, z5, z6, z4, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final Frequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestFlowFrequency getInvestFlowFrequency() {
        return this.investFlowFrequency;
    }

    /* renamed from: component3, reason: from getter */
    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    public final List<Frequency> component4() {
        return this.frequencies;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseLearnMoreDisclaimer() {
        return this.useLearnMoreDisclaimer;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getContinueButtonEnabled() {
        return this.continueButtonEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDateSelectionEnabled() {
        return this.dateSelectionEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDisclaimerResId() {
        return this.disclaimerResId;
    }

    public final FrequencyViewState copy(Frequency selectedFrequency, InvestFlowFrequency investFlowFrequency, LocalDate nextInvestmentDate, List<? extends Frequency> frequencies, boolean useLearnMoreDisclaimer, boolean continueButtonEnabled, boolean dateSelectionEnabled, int disclaimerResId) {
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        return new FrequencyViewState(selectedFrequency, investFlowFrequency, nextInvestmentDate, frequencies, useLearnMoreDisclaimer, continueButtonEnabled, dateSelectionEnabled, disclaimerResId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequencyViewState)) {
            return false;
        }
        FrequencyViewState frequencyViewState = (FrequencyViewState) other;
        return this.selectedFrequency == frequencyViewState.selectedFrequency && Intrinsics.areEqual(this.investFlowFrequency, frequencyViewState.investFlowFrequency) && Intrinsics.areEqual(this.nextInvestmentDate, frequencyViewState.nextInvestmentDate) && Intrinsics.areEqual(this.frequencies, frequencyViewState.frequencies) && this.useLearnMoreDisclaimer == frequencyViewState.useLearnMoreDisclaimer && this.continueButtonEnabled == frequencyViewState.continueButtonEnabled && this.dateSelectionEnabled == frequencyViewState.dateSelectionEnabled && this.disclaimerResId == frequencyViewState.disclaimerResId;
    }

    public int hashCode() {
        Frequency frequency = this.selectedFrequency;
        int iHashCode = (frequency == null ? 0 : frequency.hashCode()) * 31;
        InvestFlowFrequency investFlowFrequency = this.investFlowFrequency;
        return ((((((((((((iHashCode + (investFlowFrequency != null ? investFlowFrequency.hashCode() : 0)) * 31) + this.nextInvestmentDate.hashCode()) * 31) + this.frequencies.hashCode()) * 31) + Boolean.hashCode(this.useLearnMoreDisclaimer)) * 31) + Boolean.hashCode(this.continueButtonEnabled)) * 31) + Boolean.hashCode(this.dateSelectionEnabled)) * 31) + Integer.hashCode(this.disclaimerResId);
    }

    public String toString() {
        return "FrequencyViewState(selectedFrequency=" + this.selectedFrequency + ", investFlowFrequency=" + this.investFlowFrequency + ", nextInvestmentDate=" + this.nextInvestmentDate + ", frequencies=" + this.frequencies + ", useLearnMoreDisclaimer=" + this.useLearnMoreDisclaimer + ", continueButtonEnabled=" + this.continueButtonEnabled + ", dateSelectionEnabled=" + this.dateSelectionEnabled + ", disclaimerResId=" + this.disclaimerResId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FrequencyViewState(Frequency frequency, InvestFlowFrequency investFlowFrequency, LocalDate nextInvestmentDate, List<? extends Frequency> frequencies, boolean z, boolean z2, boolean z3, int i) {
        Intrinsics.checkNotNullParameter(nextInvestmentDate, "nextInvestmentDate");
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        this.selectedFrequency = frequency;
        this.investFlowFrequency = investFlowFrequency;
        this.nextInvestmentDate = nextInvestmentDate;
        this.frequencies = frequencies;
        this.useLearnMoreDisclaimer = z;
        this.continueButtonEnabled = z2;
        this.dateSelectionEnabled = z3;
        this.disclaimerResId = i;
    }

    public final Frequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final InvestFlowFrequency getInvestFlowFrequency() {
        return this.investFlowFrequency;
    }

    public final LocalDate getNextInvestmentDate() {
        return this.nextInvestmentDate;
    }

    public final List<Frequency> getFrequencies() {
        return this.frequencies;
    }

    public final boolean getUseLearnMoreDisclaimer() {
        return this.useLearnMoreDisclaimer;
    }

    public final boolean getContinueButtonEnabled() {
        return this.continueButtonEnabled;
    }

    public final boolean getDateSelectionEnabled() {
        return this.dateSelectionEnabled;
    }

    public final int getDisclaimerResId() {
        return this.disclaimerResId;
    }
}
