package com.robinhood.android.portfolio.benchmarkIntro;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BenchmarkIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkIntro/BenchmarkIntroViewState;", "", "inEtfRegionGate", "", "inCryptoRegionGate", "<init>", "(ZZ)V", "getInEtfRegionGate", "()Z", "getInCryptoRegionGate", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BenchmarkIntroViewState {
    public static final int $stable = 0;
    private final boolean inCryptoRegionGate;
    private final boolean inEtfRegionGate;

    /* JADX WARN: Illegal instructions before constructor call */
    public BenchmarkIntroViewState() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ BenchmarkIntroViewState copy$default(BenchmarkIntroViewState benchmarkIntroViewState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = benchmarkIntroViewState.inEtfRegionGate;
        }
        if ((i & 2) != 0) {
            z2 = benchmarkIntroViewState.inCryptoRegionGate;
        }
        return benchmarkIntroViewState.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getInEtfRegionGate() {
        return this.inEtfRegionGate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInCryptoRegionGate() {
        return this.inCryptoRegionGate;
    }

    public final BenchmarkIntroViewState copy(boolean inEtfRegionGate, boolean inCryptoRegionGate) {
        return new BenchmarkIntroViewState(inEtfRegionGate, inCryptoRegionGate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BenchmarkIntroViewState)) {
            return false;
        }
        BenchmarkIntroViewState benchmarkIntroViewState = (BenchmarkIntroViewState) other;
        return this.inEtfRegionGate == benchmarkIntroViewState.inEtfRegionGate && this.inCryptoRegionGate == benchmarkIntroViewState.inCryptoRegionGate;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.inEtfRegionGate) * 31) + Boolean.hashCode(this.inCryptoRegionGate);
    }

    public String toString() {
        return "BenchmarkIntroViewState(inEtfRegionGate=" + this.inEtfRegionGate + ", inCryptoRegionGate=" + this.inCryptoRegionGate + ")";
    }

    public BenchmarkIntroViewState(boolean z, boolean z2) {
        this.inEtfRegionGate = z;
        this.inCryptoRegionGate = z2;
    }

    public /* synthetic */ BenchmarkIntroViewState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean getInEtfRegionGate() {
        return this.inEtfRegionGate;
    }

    public final boolean getInCryptoRegionGate() {
        return this.inCryptoRegionGate;
    }
}
