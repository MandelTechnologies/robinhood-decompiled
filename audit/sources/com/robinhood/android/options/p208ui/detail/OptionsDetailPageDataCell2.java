package com.robinhood.android.options.p208ui.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageDataCell.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip;", "", "<init>", "()V", "AverageCostTooltip", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip$AverageCostTooltip;", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageCellTooltip, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionsDetailPageDataCell2 {
    public static final int $stable = 0;

    public /* synthetic */ OptionsDetailPageDataCell2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionsDetailPageDataCell2() {
    }

    /* compiled from: OptionsDetailPageDataCell.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip$AverageCostTooltip;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip;", "strategyCodeForLogging", "", "<init>", "(Ljava/lang/String;)V", "getStrategyCodeForLogging", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageCellTooltip$AverageCostTooltip, reason: from toString */
    public static final /* data */ class AverageCostTooltip extends OptionsDetailPageDataCell2 {
        public static final int $stable = 0;
        private final String strategyCodeForLogging;

        public static /* synthetic */ AverageCostTooltip copy$default(AverageCostTooltip averageCostTooltip, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = averageCostTooltip.strategyCodeForLogging;
            }
            return averageCostTooltip.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getStrategyCodeForLogging() {
            return this.strategyCodeForLogging;
        }

        public final AverageCostTooltip copy(String strategyCodeForLogging) {
            Intrinsics.checkNotNullParameter(strategyCodeForLogging, "strategyCodeForLogging");
            return new AverageCostTooltip(strategyCodeForLogging);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AverageCostTooltip) && Intrinsics.areEqual(this.strategyCodeForLogging, ((AverageCostTooltip) other).strategyCodeForLogging);
        }

        public int hashCode() {
            return this.strategyCodeForLogging.hashCode();
        }

        public String toString() {
            return "AverageCostTooltip(strategyCodeForLogging=" + this.strategyCodeForLogging + ")";
        }

        public final String getStrategyCodeForLogging() {
            return this.strategyCodeForLogging;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AverageCostTooltip(String strategyCodeForLogging) {
            super(null);
            Intrinsics.checkNotNullParameter(strategyCodeForLogging, "strategyCodeForLogging");
            this.strategyCodeForLogging = strategyCodeForLogging;
        }
    }
}
