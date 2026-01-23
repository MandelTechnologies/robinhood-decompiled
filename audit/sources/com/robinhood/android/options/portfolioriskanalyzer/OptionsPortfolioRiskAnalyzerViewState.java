package com.robinhood.android.options.portfolioriskanalyzer;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/OptionsPortfolioRiskAnalyzerViewState;", "", "accountNumber", "", "currentUnderlyingId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getCurrentUnderlyingId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID currentUnderlyingId;

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerViewState copy$default(OptionsPortfolioRiskAnalyzerViewState optionsPortfolioRiskAnalyzerViewState, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsPortfolioRiskAnalyzerViewState.accountNumber;
        }
        if ((i & 2) != 0) {
            uuid = optionsPortfolioRiskAnalyzerViewState.currentUnderlyingId;
        }
        return optionsPortfolioRiskAnalyzerViewState.copy(str, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getCurrentUnderlyingId() {
        return this.currentUnderlyingId;
    }

    public final OptionsPortfolioRiskAnalyzerViewState copy(String accountNumber, UUID currentUnderlyingId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new OptionsPortfolioRiskAnalyzerViewState(accountNumber, currentUnderlyingId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerViewState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerViewState optionsPortfolioRiskAnalyzerViewState = (OptionsPortfolioRiskAnalyzerViewState) other;
        return Intrinsics.areEqual(this.accountNumber, optionsPortfolioRiskAnalyzerViewState.accountNumber) && Intrinsics.areEqual(this.currentUnderlyingId, optionsPortfolioRiskAnalyzerViewState.currentUnderlyingId);
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        UUID uuid = this.currentUnderlyingId;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerViewState(accountNumber=" + this.accountNumber + ", currentUnderlyingId=" + this.currentUnderlyingId + ")";
    }

    public OptionsPortfolioRiskAnalyzerViewState(String accountNumber, UUID uuid) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.currentUnderlyingId = uuid;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getCurrentUnderlyingId() {
        return this.currentUnderlyingId;
    }
}
