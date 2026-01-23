package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/PnLUiState;", "", "pnlNumeric", "Ljava/math/BigDecimal;", "pnlPercentage", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getPnlNumeric", "()Ljava/math/BigDecimal;", "getPnlPercentage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PnLUiState {
    public static final int $stable = 8;
    private final BigDecimal pnlNumeric;
    private final BigDecimal pnlPercentage;

    /* JADX WARN: Multi-variable type inference failed */
    public PnLUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PnLUiState copy$default(PnLUiState pnLUiState, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = pnLUiState.pnlNumeric;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = pnLUiState.pnlPercentage;
        }
        return pnLUiState.copy(bigDecimal, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getPnlNumeric() {
        return this.pnlNumeric;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getPnlPercentage() {
        return this.pnlPercentage;
    }

    public final PnLUiState copy(BigDecimal pnlNumeric, BigDecimal pnlPercentage) {
        return new PnLUiState(pnlNumeric, pnlPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PnLUiState)) {
            return false;
        }
        PnLUiState pnLUiState = (PnLUiState) other;
        return Intrinsics.areEqual(this.pnlNumeric, pnLUiState.pnlNumeric) && Intrinsics.areEqual(this.pnlPercentage, pnLUiState.pnlPercentage);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.pnlNumeric;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.pnlPercentage;
        return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public String toString() {
        return "PnLUiState(pnlNumeric=" + this.pnlNumeric + ", pnlPercentage=" + this.pnlPercentage + ")";
    }

    public PnLUiState(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.pnlNumeric = bigDecimal;
        this.pnlPercentage = bigDecimal2;
    }

    public /* synthetic */ PnLUiState(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : bigDecimal2);
    }

    public final BigDecimal getPnlNumeric() {
        return this.pnlNumeric;
    }

    public final BigDecimal getPnlPercentage() {
        return this.pnlPercentage;
    }
}
