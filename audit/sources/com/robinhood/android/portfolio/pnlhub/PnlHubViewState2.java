package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\f\u0010\n\u001a\u00020\u0002*\u00020\u0001H\u0000\u001a*\u0010\u000b\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0000¨\u0006\u000e"}, m3636d2 = {"toProfitAndLossChartSpan", "Lcom/robinhood/android/portfolio/pnl/api/ProfitAndLossChartSpan;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "toAssetTypeList", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "isCryptoPnlHubEnabled", "", "optionsSupported", "toDisplaySpan", "toPnlHubAssetClass", "etfSupported", "cryptoSupported", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubViewStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubViewState2 {

    /* compiled from: PnlHubViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnlhub.PnlHubViewStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DisplaySpan.values().length];
            try {
                iArr[DisplaySpan.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySpan.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySpan.f93673MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisplaySpan.YTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisplaySpan.ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PnlHubAssetClass.values().length];
            try {
                iArr2[PnlHubAssetClass.EQUITY_ETF.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PnlHubAssetClass.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PnlHubAssetClass.OPTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PnlHubAssetClass.CRYPTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PnlHubAssetClass.ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ProfitAndLossChartSpan.values().length];
            try {
                iArr3[ProfitAndLossChartSpan.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ProfitAndLossChartSpan.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ProfitAndLossChartSpan.THREE_MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ProfitAndLossChartSpan.YTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ProfitAndLossChartSpan.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AssetClass.values().length];
            try {
                iArr4[AssetClass.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[AssetClass.OPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[AssetClass.FOREX.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[AssetClass.CRYPTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final ProfitAndLossChartSpan toProfitAndLossChartSpan(DisplaySpan displaySpan) {
        Intrinsics.checkNotNullParameter(displaySpan, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[displaySpan.ordinal()];
        if (i == 1) {
            return ProfitAndLossChartSpan.WEEK;
        }
        if (i == 2) {
            return ProfitAndLossChartSpan.MONTH;
        }
        if (i == 3) {
            return ProfitAndLossChartSpan.THREE_MONTHS;
        }
        if (i == 4) {
            return ProfitAndLossChartSpan.YTD;
        }
        if (i == 5) {
            return ProfitAndLossChartSpan.MAX;
        }
        return ProfitAndLossChartSpan.UNKNOWN;
    }

    public static final List<AssetClass> toAssetTypeList(PnlHubAssetClass pnlHubAssetClass, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(pnlHubAssetClass, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[pnlHubAssetClass.ordinal()];
        if (i == 1 || i == 2) {
            return CollectionsKt.listOf(AssetClass.EQUITY);
        }
        if (i == 3) {
            return CollectionsKt.listOf(AssetClass.OPTION);
        }
        if (i == 4) {
            return CollectionsKt.listOf(AssetClass.FOREX);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt.listOfNotNull((Object[]) new AssetClass[]{AssetClass.EQUITY, z2 ? AssetClass.OPTION : null, z ? AssetClass.FOREX : null});
    }

    public static final DisplaySpan toDisplaySpan(ProfitAndLossChartSpan profitAndLossChartSpan) {
        Intrinsics.checkNotNullParameter(profitAndLossChartSpan, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[profitAndLossChartSpan.ordinal()];
        if (i == 1) {
            return DisplaySpan.WEEK;
        }
        if (i == 2) {
            return DisplaySpan.MONTH;
        }
        if (i == 3) {
            return DisplaySpan.f93673MONTH;
        }
        if (i == 4) {
            return DisplaySpan.YTD;
        }
        if (i == 5) {
            return DisplaySpan.ALL;
        }
        return DisplaySpan.UNKNOWN;
    }

    public static final PnlHubAssetClass toPnlHubAssetClass(List<? extends AssetClass> list, boolean z, boolean z2, boolean z3) {
        PnlHubAssetClass pnlHubAssetClass;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (z2) {
            pnlHubAssetClass = PnlHubAssetClass.EQUITY_ETF;
        } else {
            pnlHubAssetClass = PnlHubAssetClass.EQUITY;
        }
        if (list.isEmpty()) {
            if (z && z3) {
                return PnlHubAssetClass.ALL;
            }
            if (z && !z3) {
                return PnlHubAssetClass.ALL;
            }
            if (!z && z3) {
                return PnlHubAssetClass.ALL;
            }
        } else if (list.size() == 1) {
            int i = WhenMappings.$EnumSwitchMapping$3[((AssetClass) CollectionsKt.first((List) list)).ordinal()];
            if (i == 2) {
                return PnlHubAssetClass.OPTIONS;
            }
            if (i == 3 || i == 4) {
                return PnlHubAssetClass.CRYPTO;
            }
        } else {
            return PnlHubAssetClass.ALL;
        }
        return pnlHubAssetClass;
    }
}
