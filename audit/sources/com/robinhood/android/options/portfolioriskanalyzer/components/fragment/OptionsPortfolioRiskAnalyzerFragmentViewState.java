package com.robinhood.android.options.portfolioriskanalyzer.components.fragment;

import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerFragmentViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/fragment/OptionsPortfolioRiskAnalyzerFragmentViewState;", "", "argsWithAccountNumber", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer$WithAccountNumber;", "inPortfolioRiskAnalyzerExperiment", "", "<init>", "(Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer$WithAccountNumber;Z)V", "getArgsWithAccountNumber", "()Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer$WithAccountNumber;", "getInPortfolioRiskAnalyzerExperiment", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerFragmentViewState {
    public static final int $stable = 8;
    private final OptionsPortfolioRiskAnalyzer.WithAccountNumber argsWithAccountNumber;
    private final boolean inPortfolioRiskAnalyzerExperiment;

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerFragmentViewState copy$default(OptionsPortfolioRiskAnalyzerFragmentViewState optionsPortfolioRiskAnalyzerFragmentViewState, OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            withAccountNumber = optionsPortfolioRiskAnalyzerFragmentViewState.argsWithAccountNumber;
        }
        if ((i & 2) != 0) {
            z = optionsPortfolioRiskAnalyzerFragmentViewState.inPortfolioRiskAnalyzerExperiment;
        }
        return optionsPortfolioRiskAnalyzerFragmentViewState.copy(withAccountNumber, z);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionsPortfolioRiskAnalyzer.WithAccountNumber getArgsWithAccountNumber() {
        return this.argsWithAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInPortfolioRiskAnalyzerExperiment() {
        return this.inPortfolioRiskAnalyzerExperiment;
    }

    public final OptionsPortfolioRiskAnalyzerFragmentViewState copy(OptionsPortfolioRiskAnalyzer.WithAccountNumber argsWithAccountNumber, boolean inPortfolioRiskAnalyzerExperiment) {
        return new OptionsPortfolioRiskAnalyzerFragmentViewState(argsWithAccountNumber, inPortfolioRiskAnalyzerExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerFragmentViewState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerFragmentViewState optionsPortfolioRiskAnalyzerFragmentViewState = (OptionsPortfolioRiskAnalyzerFragmentViewState) other;
        return Intrinsics.areEqual(this.argsWithAccountNumber, optionsPortfolioRiskAnalyzerFragmentViewState.argsWithAccountNumber) && this.inPortfolioRiskAnalyzerExperiment == optionsPortfolioRiskAnalyzerFragmentViewState.inPortfolioRiskAnalyzerExperiment;
    }

    public int hashCode() {
        OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber = this.argsWithAccountNumber;
        return ((withAccountNumber == null ? 0 : withAccountNumber.hashCode()) * 31) + Boolean.hashCode(this.inPortfolioRiskAnalyzerExperiment);
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerFragmentViewState(argsWithAccountNumber=" + this.argsWithAccountNumber + ", inPortfolioRiskAnalyzerExperiment=" + this.inPortfolioRiskAnalyzerExperiment + ")";
    }

    public OptionsPortfolioRiskAnalyzerFragmentViewState(OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber, boolean z) {
        this.argsWithAccountNumber = withAccountNumber;
        this.inPortfolioRiskAnalyzerExperiment = z;
    }

    public /* synthetic */ OptionsPortfolioRiskAnalyzerFragmentViewState(OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(withAccountNumber, (i & 2) != 0 ? true : z);
    }

    public final OptionsPortfolioRiskAnalyzer.WithAccountNumber getArgsWithAccountNumber() {
        return this.argsWithAccountNumber;
    }

    public final boolean getInPortfolioRiskAnalyzerExperiment() {
        return this.inPortfolioRiskAnalyzerExperiment;
    }
}
