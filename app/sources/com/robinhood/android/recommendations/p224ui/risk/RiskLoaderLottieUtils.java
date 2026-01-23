package com.robinhood.android.recommendations.p224ui.risk;

import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.shared.remote.assets.LottieUrl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: RiskLoaderLottieUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"riskToPortfolioLottieMapDay", "", "", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "riskToPortfolioLottieMapNight", "getRiskToPortfolioLottieUrl", "volatilityTarget", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "feature-recommendations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.risk.RiskLoaderLottieUtilsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RiskLoaderLottieUtils {
    private static final Map<Integer, LottieUrl> riskToPortfolioLottieMapDay = MapsKt.mapOf(Tuples4.m3642to(1, LottieUrl.RECS_RISK_TO_PORTFOLIO_LV1_DAY), Tuples4.m3642to(2, LottieUrl.RECS_RISK_TO_PORTFOLIO_LV2_DAY), Tuples4.m3642to(3, LottieUrl.RECS_RISK_TO_PORTFOLIO_LV3_DAY), Tuples4.m3642to(4, LottieUrl.RECS_RISK_TO_PORTFOLIO_LV4_DAY), Tuples4.m3642to(5, LottieUrl.RECS_RISK_TO_PORTFOLIO_LV5_DAY));
    private static final Map<Integer, LottieUrl> riskToPortfolioLottieMapNight = MapsKt.mapOf(Tuples4.m3642to(1, LottieUrl.RECS_RISK_TO_PORTFOLIO_LV1_NIGHT), Tuples4.m3642to(2, LottieUrl.RECS_RISK_TO_PORTFOLIO_LV2_NIGHT), Tuples4.m3642to(3, LottieUrl.RECS_RISK_TO_PORTFOLIO_LV3_NIGHT), Tuples4.m3642to(4, LottieUrl.RECS_RISK_TO_PORTFOLIO_LV4_NIGHT), Tuples4.m3642to(5, LottieUrl.RECS_RISK_TO_PORTFOLIO_LV5_NIGHT));

    /* compiled from: RiskLoaderLottieUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.risk.RiskLoaderLottieUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final LottieUrl getRiskToPortfolioLottieUrl(int i, DayNightOverlay dayNightOverlay) {
        LottieUrl lottieUrl;
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        int iCoerceIn = RangesKt.coerceIn(i, 1, 5);
        int i2 = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
        if (i2 == 1) {
            lottieUrl = riskToPortfolioLottieMapDay.get(Integer.valueOf(iCoerceIn));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lottieUrl = riskToPortfolioLottieMapNight.get(Integer.valueOf(iCoerceIn));
        }
        Intrinsics.checkNotNull(lottieUrl);
        return lottieUrl;
    }
}
