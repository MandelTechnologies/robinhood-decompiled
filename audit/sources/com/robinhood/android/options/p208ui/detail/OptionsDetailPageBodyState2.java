package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.charts.models.p080db.OptionHistoricalChartModel;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexHistoricals;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import com.robinhood.android.options.p208ui.bottomsheet.LateCloseBottomSheetDialogFragment;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UiQuoteHistorical;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.utils.money.Currencies;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: OptionsDetailPageBodyState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", "", "<init>", "()V", "Banner", "Chart", "Disclosure", "Stats", "Greeks", "Options", "History", "Position", "Upsell", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Banner;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Chart;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Disclosure;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Greeks;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$History;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Options;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Position;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Stats;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell;", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionsDetailPageBodyState2 {
    public static final int $stable = 0;

    public /* synthetic */ OptionsDetailPageBodyState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionsDetailPageBodyState2() {
    }

    /* compiled from: OptionsDetailPageBodyState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Banner;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", "infoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "<init>", "(Lcom/robinhood/models/db/IacInfoBanner;)V", "getInfoBanner", "()Lcom/robinhood/models/db/IacInfoBanner;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState$Banner, reason: from toString */
    public static final /* data */ class Banner extends OptionsDetailPageBodyState2 {
        public static final int $stable = 8;
        private final IacInfoBanner infoBanner;

        public static /* synthetic */ Banner copy$default(Banner banner, IacInfoBanner iacInfoBanner, int i, Object obj) {
            if ((i & 1) != 0) {
                iacInfoBanner = banner.infoBanner;
            }
            return banner.copy(iacInfoBanner);
        }

        /* renamed from: component1, reason: from getter */
        public final IacInfoBanner getInfoBanner() {
            return this.infoBanner;
        }

        public final Banner copy(IacInfoBanner infoBanner) {
            Intrinsics.checkNotNullParameter(infoBanner, "infoBanner");
            return new Banner(infoBanner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Banner) && Intrinsics.areEqual(this.infoBanner, ((Banner) other).infoBanner);
        }

        public int hashCode() {
            return this.infoBanner.hashCode();
        }

        public String toString() {
            return "Banner(infoBanner=" + this.infoBanner + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Banner(IacInfoBanner infoBanner) {
            super(null);
            Intrinsics.checkNotNullParameter(infoBanner, "infoBanner");
            this.infoBanner = infoBanner;
        }

        public final IacInfoBanner getInfoBanner() {
            return this.infoBanner;
        }
    }

    /* compiled from: OptionsDetailPageBodyState.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0006\u0010#\u001a\u00020\u0010\u0012\b\b\u0002\u0010$\u001a\u00020\u001a\u0012\b\b\u0002\u0010%\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b:\u00107J\u0010\u0010;\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b;\u00107J\u0012\u0010<\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bF\u00107J\u0012\u0010G\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bI\u00107J\u0010\u0010J\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bJ\u0010AJ\u0010\u0010K\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bK\u00107Jþ\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00102\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010#\u001a\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010%\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\bN\u0010AJ\u0010\u0010P\u001a\u00020OHÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010T\u001a\u00020\u00102\b\u0010S\u001a\u0004\u0018\u00010RHÖ\u0003¢\u0006\u0004\bT\u0010UR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010V\u001a\u0004\bW\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010X\u001a\u0004\bY\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010Z\u001a\u0004\b[\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\\\u001a\u0004\b]\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010^\u001a\u0004\b_\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010`\u001a\u0004\ba\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010b\u001a\u0004\bc\u00105R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010d\u001a\u0004\b\u0011\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010e\u001a\u0004\bf\u00109R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010d\u001a\u0004\bg\u00107R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010d\u001a\u0004\bh\u00107R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010i\u001a\u0004\bj\u0010=R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010k\u001a\u0004\bl\u0010?R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010m\u001a\u0004\bn\u0010AR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010o\u001a\u0004\bp\u0010CR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010q\u001a\u0004\br\u0010ER\u0017\u0010 \u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b \u0010d\u001a\u0004\bs\u00107R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010t\u001a\u0004\bu\u0010HR\u0017\u0010#\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b#\u0010d\u001a\u0004\b#\u00107R\u0017\u0010$\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b$\u0010m\u001a\u0004\bv\u0010AR\u0017\u0010%\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010d\u001a\u0004\bw\u00107¨\u0006x"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Chart;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "activeDisplaySpan", "", "displayName", "j$/time/Instant", "firstTradeTimestamp", "Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", "historicalChart", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexHistoricals;", "indexHistoricals", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "indexValue", "", "isLateCloseOptionChain", "Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;", "lateCloseBottomSheetArgs", "showCandlestickChart", "showAllHoursChart", "Lcom/robinhood/models/ui/UiQuoteHistorical;", "underlyingHistorical", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "underlyingFragmentKey", "", "underlyingSymbol", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "Lcom/robinhood/models/db/Quote;", "underlyingQuote", "showCurrencySymbol", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;", "tertiaryValueTooltip", "isOptionsExtendedHoursEnabled", "displayCurrencyCode", "showDisplayCurrencyLabel", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Ljava/lang/CharSequence;Lj$/time/Instant;Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;Lcom/robinhood/android/indexes/models/db/IndexHistoricals;Lcom/robinhood/android/indexes/models/db/IndexValue;ZLcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;ZZLcom/robinhood/models/ui/UiQuoteHistorical;Lcom/robinhood/android/navigation/keys/FragmentKey;Ljava/lang/String;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Lcom/robinhood/models/db/Quote;ZLcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;ZLjava/lang/String;Z)V", "component1", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "component2", "()Ljava/lang/CharSequence;", "component3", "()Lj$/time/Instant;", "component4", "()Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", "component5", "()Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "component6", "()Lcom/robinhood/android/indexes/models/db/IndexHistoricals;", "component7", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "component8", "()Z", "component9", "()Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;", "component10", "component11", "component12", "()Lcom/robinhood/models/ui/UiQuoteHistorical;", "component13", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component14", "()Ljava/lang/String;", "component15", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "component16", "()Lcom/robinhood/models/db/Quote;", "component17", "component18", "()Lcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;", "component19", "component20", "component21", "copy", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Ljava/lang/CharSequence;Lj$/time/Instant;Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;Lcom/robinhood/android/indexes/models/db/IndexHistoricals;Lcom/robinhood/android/indexes/models/db/IndexValue;ZLcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;ZZLcom/robinhood/models/ui/UiQuoteHistorical;Lcom/robinhood/android/navigation/keys/FragmentKey;Ljava/lang/String;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Lcom/robinhood/models/db/Quote;ZLcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;ZLjava/lang/String;Z)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Chart;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getActiveDisplaySpan", "Ljava/lang/CharSequence;", "getDisplayName", "Lj$/time/Instant;", "getFirstTradeTimestamp", "Lcom/robinhood/android/charts/models/db/OptionHistoricalChartModel;", "getHistoricalChart", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "getIndexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexHistoricals;", "getIndexHistoricals", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "getIndexValue", "Z", "Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;", "getLateCloseBottomSheetArgs", "getShowCandlestickChart", "getShowAllHoursChart", "Lcom/robinhood/models/ui/UiQuoteHistorical;", "getUnderlyingHistorical", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getUnderlyingFragmentKey", "Ljava/lang/String;", "getUnderlyingSymbol", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getUnderlyingType", "Lcom/robinhood/models/db/Quote;", "getUnderlyingQuote", "getShowCurrencySymbol", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers$TertiaryValueTooltip;", "getTertiaryValueTooltip", "getDisplayCurrencyCode", "getShowDisplayCurrencyLabel", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState$Chart, reason: from toString */
    public static final /* data */ class Chart extends OptionsDetailPageBodyState2 {
        public static final int $stable = 8;
        private final DisplaySpan activeDisplaySpan;
        private final String displayCurrencyCode;
        private final CharSequence displayName;
        private final Instant firstTradeTimestamp;
        private final OptionHistoricalChartModel historicalChart;
        private final IndexCloseValue indexCloseValue;
        private final IndexHistoricals indexHistoricals;
        private final IndexValue indexValue;
        private final boolean isLateCloseOptionChain;
        private final boolean isOptionsExtendedHoursEnabled;
        private final LateCloseBottomSheetDialogFragment.Args lateCloseBottomSheetArgs;
        private final boolean showAllHoursChart;
        private final boolean showCandlestickChart;
        private final boolean showCurrencySymbol;
        private final boolean showDisplayCurrencyLabel;
        private final CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip;
        private final FragmentKey underlyingFragmentKey;
        private final UiQuoteHistorical underlyingHistorical;
        private final Quote underlyingQuote;
        private final String underlyingSymbol;
        private final OptionChain.UnderlyingType underlyingType;

        public static /* synthetic */ Chart copy$default(Chart chart, DisplaySpan displaySpan, CharSequence charSequence, Instant instant, OptionHistoricalChartModel optionHistoricalChartModel, IndexCloseValue indexCloseValue, IndexHistoricals indexHistoricals, IndexValue indexValue, boolean z, LateCloseBottomSheetDialogFragment.Args args, boolean z2, boolean z3, UiQuoteHistorical uiQuoteHistorical, FragmentKey fragmentKey, String str, OptionChain.UnderlyingType underlyingType, Quote quote, boolean z4, CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip, boolean z5, String str2, boolean z6, int i, Object obj) {
            boolean z7;
            String str3;
            DisplaySpan displaySpan2 = (i & 1) != 0 ? chart.activeDisplaySpan : displaySpan;
            CharSequence charSequence2 = (i & 2) != 0 ? chart.displayName : charSequence;
            Instant instant2 = (i & 4) != 0 ? chart.firstTradeTimestamp : instant;
            OptionHistoricalChartModel optionHistoricalChartModel2 = (i & 8) != 0 ? chart.historicalChart : optionHistoricalChartModel;
            IndexCloseValue indexCloseValue2 = (i & 16) != 0 ? chart.indexCloseValue : indexCloseValue;
            IndexHistoricals indexHistoricals2 = (i & 32) != 0 ? chart.indexHistoricals : indexHistoricals;
            IndexValue indexValue2 = (i & 64) != 0 ? chart.indexValue : indexValue;
            boolean z8 = (i & 128) != 0 ? chart.isLateCloseOptionChain : z;
            LateCloseBottomSheetDialogFragment.Args args2 = (i & 256) != 0 ? chart.lateCloseBottomSheetArgs : args;
            boolean z9 = (i & 512) != 0 ? chart.showCandlestickChart : z2;
            boolean z10 = (i & 1024) != 0 ? chart.showAllHoursChart : z3;
            UiQuoteHistorical uiQuoteHistorical2 = (i & 2048) != 0 ? chart.underlyingHistorical : uiQuoteHistorical;
            FragmentKey fragmentKey2 = (i & 4096) != 0 ? chart.underlyingFragmentKey : fragmentKey;
            String str4 = (i & 8192) != 0 ? chart.underlyingSymbol : str;
            DisplaySpan displaySpan3 = displaySpan2;
            OptionChain.UnderlyingType underlyingType2 = (i & 16384) != 0 ? chart.underlyingType : underlyingType;
            Quote quote2 = (i & 32768) != 0 ? chart.underlyingQuote : quote;
            boolean z11 = (i & 65536) != 0 ? chart.showCurrencySymbol : z4;
            CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip2 = (i & 131072) != 0 ? chart.tertiaryValueTooltip : tertiaryValueTooltip;
            boolean z12 = (i & 262144) != 0 ? chart.isOptionsExtendedHoursEnabled : z5;
            String str5 = (i & 524288) != 0 ? chart.displayCurrencyCode : str2;
            if ((i & 1048576) != 0) {
                str3 = str5;
                z7 = chart.showDisplayCurrencyLabel;
            } else {
                z7 = z6;
                str3 = str5;
            }
            return chart.copy(displaySpan3, charSequence2, instant2, optionHistoricalChartModel2, indexCloseValue2, indexHistoricals2, indexValue2, z8, args2, z9, z10, uiQuoteHistorical2, fragmentKey2, str4, underlyingType2, quote2, z11, tertiaryValueTooltip2, z12, str3, z7);
        }

        /* renamed from: component1, reason: from getter */
        public final DisplaySpan getActiveDisplaySpan() {
            return this.activeDisplaySpan;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getShowCandlestickChart() {
            return this.showCandlestickChart;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getShowAllHoursChart() {
            return this.showAllHoursChart;
        }

        /* renamed from: component12, reason: from getter */
        public final UiQuoteHistorical getUnderlyingHistorical() {
            return this.underlyingHistorical;
        }

        /* renamed from: component13, reason: from getter */
        public final FragmentKey getUnderlyingFragmentKey() {
            return this.underlyingFragmentKey;
        }

        /* renamed from: component14, reason: from getter */
        public final String getUnderlyingSymbol() {
            return this.underlyingSymbol;
        }

        /* renamed from: component15, reason: from getter */
        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        /* renamed from: component16, reason: from getter */
        public final Quote getUnderlyingQuote() {
            return this.underlyingQuote;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getShowCurrencySymbol() {
            return this.showCurrencySymbol;
        }

        /* renamed from: component18, reason: from getter */
        public final CursorRowModifiers.TertiaryValueTooltip getTertiaryValueTooltip() {
            return this.tertiaryValueTooltip;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getIsOptionsExtendedHoursEnabled() {
            return this.isOptionsExtendedHoursEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component20, reason: from getter */
        public final String getDisplayCurrencyCode() {
            return this.displayCurrencyCode;
        }

        /* renamed from: component21, reason: from getter */
        public final boolean getShowDisplayCurrencyLabel() {
            return this.showDisplayCurrencyLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getFirstTradeTimestamp() {
            return this.firstTradeTimestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionHistoricalChartModel getHistoricalChart() {
            return this.historicalChart;
        }

        /* renamed from: component5, reason: from getter */
        public final IndexCloseValue getIndexCloseValue() {
            return this.indexCloseValue;
        }

        /* renamed from: component6, reason: from getter */
        public final IndexHistoricals getIndexHistoricals() {
            return this.indexHistoricals;
        }

        /* renamed from: component7, reason: from getter */
        public final IndexValue getIndexValue() {
            return this.indexValue;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsLateCloseOptionChain() {
            return this.isLateCloseOptionChain;
        }

        /* renamed from: component9, reason: from getter */
        public final LateCloseBottomSheetDialogFragment.Args getLateCloseBottomSheetArgs() {
            return this.lateCloseBottomSheetArgs;
        }

        public final Chart copy(DisplaySpan activeDisplaySpan, CharSequence displayName, Instant firstTradeTimestamp, OptionHistoricalChartModel historicalChart, IndexCloseValue indexCloseValue, IndexHistoricals indexHistoricals, IndexValue indexValue, boolean isLateCloseOptionChain, LateCloseBottomSheetDialogFragment.Args lateCloseBottomSheetArgs, boolean showCandlestickChart, boolean showAllHoursChart, UiQuoteHistorical underlyingHistorical, FragmentKey underlyingFragmentKey, String underlyingSymbol, OptionChain.UnderlyingType underlyingType, Quote underlyingQuote, boolean showCurrencySymbol, CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip, boolean isOptionsExtendedHoursEnabled, String displayCurrencyCode, boolean showDisplayCurrencyLabel) {
            Intrinsics.checkNotNullParameter(displayCurrencyCode, "displayCurrencyCode");
            return new Chart(activeDisplaySpan, displayName, firstTradeTimestamp, historicalChart, indexCloseValue, indexHistoricals, indexValue, isLateCloseOptionChain, lateCloseBottomSheetArgs, showCandlestickChart, showAllHoursChart, underlyingHistorical, underlyingFragmentKey, underlyingSymbol, underlyingType, underlyingQuote, showCurrencySymbol, tertiaryValueTooltip, isOptionsExtendedHoursEnabled, displayCurrencyCode, showDisplayCurrencyLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Chart)) {
                return false;
            }
            Chart chart = (Chart) other;
            return this.activeDisplaySpan == chart.activeDisplaySpan && Intrinsics.areEqual(this.displayName, chart.displayName) && Intrinsics.areEqual(this.firstTradeTimestamp, chart.firstTradeTimestamp) && Intrinsics.areEqual(this.historicalChart, chart.historicalChart) && Intrinsics.areEqual(this.indexCloseValue, chart.indexCloseValue) && Intrinsics.areEqual(this.indexHistoricals, chart.indexHistoricals) && Intrinsics.areEqual(this.indexValue, chart.indexValue) && this.isLateCloseOptionChain == chart.isLateCloseOptionChain && Intrinsics.areEqual(this.lateCloseBottomSheetArgs, chart.lateCloseBottomSheetArgs) && this.showCandlestickChart == chart.showCandlestickChart && this.showAllHoursChart == chart.showAllHoursChart && Intrinsics.areEqual(this.underlyingHistorical, chart.underlyingHistorical) && Intrinsics.areEqual(this.underlyingFragmentKey, chart.underlyingFragmentKey) && Intrinsics.areEqual(this.underlyingSymbol, chart.underlyingSymbol) && this.underlyingType == chart.underlyingType && Intrinsics.areEqual(this.underlyingQuote, chart.underlyingQuote) && this.showCurrencySymbol == chart.showCurrencySymbol && Intrinsics.areEqual(this.tertiaryValueTooltip, chart.tertiaryValueTooltip) && this.isOptionsExtendedHoursEnabled == chart.isOptionsExtendedHoursEnabled && Intrinsics.areEqual(this.displayCurrencyCode, chart.displayCurrencyCode) && this.showDisplayCurrencyLabel == chart.showDisplayCurrencyLabel;
        }

        public int hashCode() {
            DisplaySpan displaySpan = this.activeDisplaySpan;
            int iHashCode = (displaySpan == null ? 0 : displaySpan.hashCode()) * 31;
            CharSequence charSequence = this.displayName;
            int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            Instant instant = this.firstTradeTimestamp;
            int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
            OptionHistoricalChartModel optionHistoricalChartModel = this.historicalChart;
            int iHashCode4 = (iHashCode3 + (optionHistoricalChartModel == null ? 0 : optionHistoricalChartModel.hashCode())) * 31;
            IndexCloseValue indexCloseValue = this.indexCloseValue;
            int iHashCode5 = (iHashCode4 + (indexCloseValue == null ? 0 : indexCloseValue.hashCode())) * 31;
            IndexHistoricals indexHistoricals = this.indexHistoricals;
            int iHashCode6 = (iHashCode5 + (indexHistoricals == null ? 0 : indexHistoricals.hashCode())) * 31;
            IndexValue indexValue = this.indexValue;
            int iHashCode7 = (((iHashCode6 + (indexValue == null ? 0 : indexValue.hashCode())) * 31) + Boolean.hashCode(this.isLateCloseOptionChain)) * 31;
            LateCloseBottomSheetDialogFragment.Args args = this.lateCloseBottomSheetArgs;
            int iHashCode8 = (((((iHashCode7 + (args == null ? 0 : args.hashCode())) * 31) + Boolean.hashCode(this.showCandlestickChart)) * 31) + Boolean.hashCode(this.showAllHoursChart)) * 31;
            UiQuoteHistorical uiQuoteHistorical = this.underlyingHistorical;
            int iHashCode9 = (iHashCode8 + (uiQuoteHistorical == null ? 0 : uiQuoteHistorical.hashCode())) * 31;
            FragmentKey fragmentKey = this.underlyingFragmentKey;
            int iHashCode10 = (iHashCode9 + (fragmentKey == null ? 0 : fragmentKey.hashCode())) * 31;
            String str = this.underlyingSymbol;
            int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
            OptionChain.UnderlyingType underlyingType = this.underlyingType;
            int iHashCode12 = (iHashCode11 + (underlyingType == null ? 0 : underlyingType.hashCode())) * 31;
            Quote quote = this.underlyingQuote;
            int iHashCode13 = (((iHashCode12 + (quote == null ? 0 : quote.hashCode())) * 31) + Boolean.hashCode(this.showCurrencySymbol)) * 31;
            CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip = this.tertiaryValueTooltip;
            return ((((((iHashCode13 + (tertiaryValueTooltip != null ? tertiaryValueTooltip.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOptionsExtendedHoursEnabled)) * 31) + this.displayCurrencyCode.hashCode()) * 31) + Boolean.hashCode(this.showDisplayCurrencyLabel);
        }

        public String toString() {
            DisplaySpan displaySpan = this.activeDisplaySpan;
            CharSequence charSequence = this.displayName;
            return "Chart(activeDisplaySpan=" + displaySpan + ", displayName=" + ((Object) charSequence) + ", firstTradeTimestamp=" + this.firstTradeTimestamp + ", historicalChart=" + this.historicalChart + ", indexCloseValue=" + this.indexCloseValue + ", indexHistoricals=" + this.indexHistoricals + ", indexValue=" + this.indexValue + ", isLateCloseOptionChain=" + this.isLateCloseOptionChain + ", lateCloseBottomSheetArgs=" + this.lateCloseBottomSheetArgs + ", showCandlestickChart=" + this.showCandlestickChart + ", showAllHoursChart=" + this.showAllHoursChart + ", underlyingHistorical=" + this.underlyingHistorical + ", underlyingFragmentKey=" + this.underlyingFragmentKey + ", underlyingSymbol=" + this.underlyingSymbol + ", underlyingType=" + this.underlyingType + ", underlyingQuote=" + this.underlyingQuote + ", showCurrencySymbol=" + this.showCurrencySymbol + ", tertiaryValueTooltip=" + this.tertiaryValueTooltip + ", isOptionsExtendedHoursEnabled=" + this.isOptionsExtendedHoursEnabled + ", displayCurrencyCode=" + this.displayCurrencyCode + ", showDisplayCurrencyLabel=" + this.showDisplayCurrencyLabel + ")";
        }

        public final DisplaySpan getActiveDisplaySpan() {
            return this.activeDisplaySpan;
        }

        public final CharSequence getDisplayName() {
            return this.displayName;
        }

        public final Instant getFirstTradeTimestamp() {
            return this.firstTradeTimestamp;
        }

        public final OptionHistoricalChartModel getHistoricalChart() {
            return this.historicalChart;
        }

        public final IndexCloseValue getIndexCloseValue() {
            return this.indexCloseValue;
        }

        public final IndexHistoricals getIndexHistoricals() {
            return this.indexHistoricals;
        }

        public final IndexValue getIndexValue() {
            return this.indexValue;
        }

        public final boolean isLateCloseOptionChain() {
            return this.isLateCloseOptionChain;
        }

        public final LateCloseBottomSheetDialogFragment.Args getLateCloseBottomSheetArgs() {
            return this.lateCloseBottomSheetArgs;
        }

        public final boolean getShowCandlestickChart() {
            return this.showCandlestickChart;
        }

        public final boolean getShowAllHoursChart() {
            return this.showAllHoursChart;
        }

        public final UiQuoteHistorical getUnderlyingHistorical() {
            return this.underlyingHistorical;
        }

        public final FragmentKey getUnderlyingFragmentKey() {
            return this.underlyingFragmentKey;
        }

        public final String getUnderlyingSymbol() {
            return this.underlyingSymbol;
        }

        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        public final Quote getUnderlyingQuote() {
            return this.underlyingQuote;
        }

        public final boolean getShowCurrencySymbol() {
            return this.showCurrencySymbol;
        }

        public final CursorRowModifiers.TertiaryValueTooltip getTertiaryValueTooltip() {
            return this.tertiaryValueTooltip;
        }

        public final boolean isOptionsExtendedHoursEnabled() {
            return this.isOptionsExtendedHoursEnabled;
        }

        public /* synthetic */ Chart(DisplaySpan displaySpan, CharSequence charSequence, Instant instant, OptionHistoricalChartModel optionHistoricalChartModel, IndexCloseValue indexCloseValue, IndexHistoricals indexHistoricals, IndexValue indexValue, boolean z, LateCloseBottomSheetDialogFragment.Args args, boolean z2, boolean z3, UiQuoteHistorical uiQuoteHistorical, FragmentKey fragmentKey, String str, OptionChain.UnderlyingType underlyingType, Quote quote, boolean z4, CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip, boolean z5, String str2, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(displaySpan, charSequence, instant, optionHistoricalChartModel, indexCloseValue, indexHistoricals, indexValue, z, args, z2, z3, uiQuoteHistorical, fragmentKey, str, underlyingType, quote, z4, tertiaryValueTooltip, z5, (i & 524288) != 0 ? Currencies.USD.getCurrencyCode() : str2, (i & 1048576) != 0 ? false : z6);
        }

        public final String getDisplayCurrencyCode() {
            return this.displayCurrencyCode;
        }

        public final boolean getShowDisplayCurrencyLabel() {
            return this.showDisplayCurrencyLabel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Chart(DisplaySpan displaySpan, CharSequence charSequence, Instant instant, OptionHistoricalChartModel optionHistoricalChartModel, IndexCloseValue indexCloseValue, IndexHistoricals indexHistoricals, IndexValue indexValue, boolean z, LateCloseBottomSheetDialogFragment.Args args, boolean z2, boolean z3, UiQuoteHistorical uiQuoteHistorical, FragmentKey fragmentKey, String str, OptionChain.UnderlyingType underlyingType, Quote quote, boolean z4, CursorRowModifiers.TertiaryValueTooltip tertiaryValueTooltip, boolean z5, String displayCurrencyCode, boolean z6) {
            super(null);
            Intrinsics.checkNotNullParameter(displayCurrencyCode, "displayCurrencyCode");
            this.activeDisplaySpan = displaySpan;
            this.displayName = charSequence;
            this.firstTradeTimestamp = instant;
            this.historicalChart = optionHistoricalChartModel;
            this.indexCloseValue = indexCloseValue;
            this.indexHistoricals = indexHistoricals;
            this.indexValue = indexValue;
            this.isLateCloseOptionChain = z;
            this.lateCloseBottomSheetArgs = args;
            this.showCandlestickChart = z2;
            this.showAllHoursChart = z3;
            this.underlyingHistorical = uiQuoteHistorical;
            this.underlyingFragmentKey = fragmentKey;
            this.underlyingSymbol = str;
            this.underlyingType = underlyingType;
            this.underlyingQuote = quote;
            this.showCurrencySymbol = z4;
            this.tertiaryValueTooltip = tertiaryValueTooltip;
            this.isOptionsExtendedHoursEnabled = z5;
            this.displayCurrencyCode = displayCurrencyCode;
            this.showDisplayCurrencyLabel = z6;
        }
    }

    /* compiled from: OptionsDetailPageBodyState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Disclosure;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "", "fullDisclosureContentfulId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisclosure", "()Ljava/lang/String;", "getFullDisclosureContentfulId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState$Disclosure, reason: from toString */
    public static final /* data */ class Disclosure extends OptionsDetailPageBodyState2 {
        public static final int $stable = 0;
        private final String disclosure;
        private final String fullDisclosureContentfulId;

        public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = disclosure.disclosure;
            }
            if ((i & 2) != 0) {
                str2 = disclosure.fullDisclosureContentfulId;
            }
            return disclosure.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFullDisclosureContentfulId() {
            return this.fullDisclosureContentfulId;
        }

        public final Disclosure copy(String disclosure, String fullDisclosureContentfulId) {
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(fullDisclosureContentfulId, "fullDisclosureContentfulId");
            return new Disclosure(disclosure, fullDisclosureContentfulId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disclosure)) {
                return false;
            }
            Disclosure disclosure = (Disclosure) other;
            return Intrinsics.areEqual(this.disclosure, disclosure.disclosure) && Intrinsics.areEqual(this.fullDisclosureContentfulId, disclosure.fullDisclosureContentfulId);
        }

        public int hashCode() {
            return (this.disclosure.hashCode() * 31) + this.fullDisclosureContentfulId.hashCode();
        }

        public String toString() {
            return "Disclosure(disclosure=" + this.disclosure + ", fullDisclosureContentfulId=" + this.fullDisclosureContentfulId + ")";
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final String getFullDisclosureContentfulId() {
            return this.fullDisclosureContentfulId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disclosure(String disclosure, String fullDisclosureContentfulId) {
            super(null);
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            Intrinsics.checkNotNullParameter(fullDisclosureContentfulId, "fullDisclosureContentfulId");
            this.disclosure = disclosure;
            this.fullDisclosureContentfulId = fullDisclosureContentfulId;
        }
    }

    /* compiled from: OptionsDetailPageBodyState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u008b\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00102\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0006HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Stats;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", "bidPrice", "", "askPrice", "bidSize", "", "askSize", "mark", "lastTrade", "impliedVolatility", "previousClose", "high", "low", SduiChartZoomTransformer.VOLUME_IDENTIFIER, "openInterest", "inBidAskSdpStatsExperiment", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBidPrice", "()Ljava/lang/String;", "getAskPrice", "getBidSize", "()I", "getAskSize", "getMark", "getLastTrade", "getImpliedVolatility", "getPreviousClose", "getHigh", "getLow", "getVolume", "getOpenInterest", "getInBidAskSdpStatsExperiment", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "", "hashCode", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState$Stats, reason: from toString */
    public static final /* data */ class Stats extends OptionsDetailPageBodyState2 {
        public static final int $stable = 0;
        private final String askPrice;
        private final int askSize;
        private final String bidPrice;
        private final int bidSize;
        private final String high;
        private final String impliedVolatility;
        private final boolean inBidAskSdpStatsExperiment;
        private final String lastTrade;
        private final String low;
        private final String mark;
        private final String openInterest;
        private final String previousClose;
        private final String volume;

        public static /* synthetic */ Stats copy$default(Stats stats, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = stats.bidPrice;
            }
            return stats.copy(str, (i3 & 2) != 0 ? stats.askPrice : str2, (i3 & 4) != 0 ? stats.bidSize : i, (i3 & 8) != 0 ? stats.askSize : i2, (i3 & 16) != 0 ? stats.mark : str3, (i3 & 32) != 0 ? stats.lastTrade : str4, (i3 & 64) != 0 ? stats.impliedVolatility : str5, (i3 & 128) != 0 ? stats.previousClose : str6, (i3 & 256) != 0 ? stats.high : str7, (i3 & 512) != 0 ? stats.low : str8, (i3 & 1024) != 0 ? stats.volume : str9, (i3 & 2048) != 0 ? stats.openInterest : str10, (i3 & 4096) != 0 ? stats.inBidAskSdpStatsExperiment : z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBidPrice() {
            return this.bidPrice;
        }

        /* renamed from: component10, reason: from getter */
        public final String getLow() {
            return this.low;
        }

        /* renamed from: component11, reason: from getter */
        public final String getVolume() {
            return this.volume;
        }

        /* renamed from: component12, reason: from getter */
        public final String getOpenInterest() {
            return this.openInterest;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getInBidAskSdpStatsExperiment() {
            return this.inBidAskSdpStatsExperiment;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAskPrice() {
            return this.askPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final int getBidSize() {
            return this.bidSize;
        }

        /* renamed from: component4, reason: from getter */
        public final int getAskSize() {
            return this.askSize;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMark() {
            return this.mark;
        }

        /* renamed from: component6, reason: from getter */
        public final String getLastTrade() {
            return this.lastTrade;
        }

        /* renamed from: component7, reason: from getter */
        public final String getImpliedVolatility() {
            return this.impliedVolatility;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPreviousClose() {
            return this.previousClose;
        }

        /* renamed from: component9, reason: from getter */
        public final String getHigh() {
            return this.high;
        }

        public final Stats copy(String bidPrice, String askPrice, int bidSize, int askSize, String mark, String lastTrade, String impliedVolatility, String previousClose, String high, String low, String volume, String openInterest, boolean inBidAskSdpStatsExperiment) {
            Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
            Intrinsics.checkNotNullParameter(askPrice, "askPrice");
            Intrinsics.checkNotNullParameter(mark, "mark");
            Intrinsics.checkNotNullParameter(lastTrade, "lastTrade");
            Intrinsics.checkNotNullParameter(impliedVolatility, "impliedVolatility");
            Intrinsics.checkNotNullParameter(previousClose, "previousClose");
            Intrinsics.checkNotNullParameter(high, "high");
            Intrinsics.checkNotNullParameter(low, "low");
            Intrinsics.checkNotNullParameter(volume, "volume");
            Intrinsics.checkNotNullParameter(openInterest, "openInterest");
            return new Stats(bidPrice, askPrice, bidSize, askSize, mark, lastTrade, impliedVolatility, previousClose, high, low, volume, openInterest, inBidAskSdpStatsExperiment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) other;
            return Intrinsics.areEqual(this.bidPrice, stats.bidPrice) && Intrinsics.areEqual(this.askPrice, stats.askPrice) && this.bidSize == stats.bidSize && this.askSize == stats.askSize && Intrinsics.areEqual(this.mark, stats.mark) && Intrinsics.areEqual(this.lastTrade, stats.lastTrade) && Intrinsics.areEqual(this.impliedVolatility, stats.impliedVolatility) && Intrinsics.areEqual(this.previousClose, stats.previousClose) && Intrinsics.areEqual(this.high, stats.high) && Intrinsics.areEqual(this.low, stats.low) && Intrinsics.areEqual(this.volume, stats.volume) && Intrinsics.areEqual(this.openInterest, stats.openInterest) && this.inBidAskSdpStatsExperiment == stats.inBidAskSdpStatsExperiment;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.bidPrice.hashCode() * 31) + this.askPrice.hashCode()) * 31) + Integer.hashCode(this.bidSize)) * 31) + Integer.hashCode(this.askSize)) * 31) + this.mark.hashCode()) * 31) + this.lastTrade.hashCode()) * 31) + this.impliedVolatility.hashCode()) * 31) + this.previousClose.hashCode()) * 31) + this.high.hashCode()) * 31) + this.low.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.openInterest.hashCode()) * 31) + Boolean.hashCode(this.inBidAskSdpStatsExperiment);
        }

        public String toString() {
            return "Stats(bidPrice=" + this.bidPrice + ", askPrice=" + this.askPrice + ", bidSize=" + this.bidSize + ", askSize=" + this.askSize + ", mark=" + this.mark + ", lastTrade=" + this.lastTrade + ", impliedVolatility=" + this.impliedVolatility + ", previousClose=" + this.previousClose + ", high=" + this.high + ", low=" + this.low + ", volume=" + this.volume + ", openInterest=" + this.openInterest + ", inBidAskSdpStatsExperiment=" + this.inBidAskSdpStatsExperiment + ")";
        }

        public final String getBidPrice() {
            return this.bidPrice;
        }

        public final String getAskPrice() {
            return this.askPrice;
        }

        public final int getBidSize() {
            return this.bidSize;
        }

        public final int getAskSize() {
            return this.askSize;
        }

        public final String getMark() {
            return this.mark;
        }

        public final String getLastTrade() {
            return this.lastTrade;
        }

        public final String getImpliedVolatility() {
            return this.impliedVolatility;
        }

        public final String getPreviousClose() {
            return this.previousClose;
        }

        public final String getHigh() {
            return this.high;
        }

        public final String getLow() {
            return this.low;
        }

        public final String getVolume() {
            return this.volume;
        }

        public final String getOpenInterest() {
            return this.openInterest;
        }

        public final boolean getInBidAskSdpStatsExperiment() {
            return this.inBidAskSdpStatsExperiment;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stats(String bidPrice, String askPrice, int i, int i2, String mark, String lastTrade, String impliedVolatility, String previousClose, String high, String low, String volume, String openInterest, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
            Intrinsics.checkNotNullParameter(askPrice, "askPrice");
            Intrinsics.checkNotNullParameter(mark, "mark");
            Intrinsics.checkNotNullParameter(lastTrade, "lastTrade");
            Intrinsics.checkNotNullParameter(impliedVolatility, "impliedVolatility");
            Intrinsics.checkNotNullParameter(previousClose, "previousClose");
            Intrinsics.checkNotNullParameter(high, "high");
            Intrinsics.checkNotNullParameter(low, "low");
            Intrinsics.checkNotNullParameter(volume, "volume");
            Intrinsics.checkNotNullParameter(openInterest, "openInterest");
            this.bidPrice = bidPrice;
            this.askPrice = askPrice;
            this.bidSize = i;
            this.askSize = i2;
            this.mark = mark;
            this.lastTrade = lastTrade;
            this.impliedVolatility = impliedVolatility;
            this.previousClose = previousClose;
            this.high = high;
            this.low = low;
            this.volume = volume;
            this.openInterest = openInterest;
            this.inBidAskSdpStatsExperiment = z;
        }
    }

    /* compiled from: OptionsDetailPageBodyState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Greeks;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", "delta", "", "gamma", "theta", "vega", "rho", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDelta", "()Ljava/lang/String;", "getGamma", "getTheta", "getVega", "getRho", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState$Greeks, reason: from toString */
    public static final /* data */ class Greeks extends OptionsDetailPageBodyState2 {
        public static final int $stable = 0;
        private final String delta;
        private final String gamma;
        private final String rho;
        private final String theta;
        private final String vega;

        public static /* synthetic */ Greeks copy$default(Greeks greeks, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = greeks.delta;
            }
            if ((i & 2) != 0) {
                str2 = greeks.gamma;
            }
            if ((i & 4) != 0) {
                str3 = greeks.theta;
            }
            if ((i & 8) != 0) {
                str4 = greeks.vega;
            }
            if ((i & 16) != 0) {
                str5 = greeks.rho;
            }
            String str6 = str5;
            String str7 = str3;
            return greeks.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDelta() {
            return this.delta;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGamma() {
            return this.gamma;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTheta() {
            return this.theta;
        }

        /* renamed from: component4, reason: from getter */
        public final String getVega() {
            return this.vega;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRho() {
            return this.rho;
        }

        public final Greeks copy(String delta, String gamma, String theta, String vega, String rho) {
            Intrinsics.checkNotNullParameter(delta, "delta");
            Intrinsics.checkNotNullParameter(gamma, "gamma");
            Intrinsics.checkNotNullParameter(theta, "theta");
            Intrinsics.checkNotNullParameter(vega, "vega");
            Intrinsics.checkNotNullParameter(rho, "rho");
            return new Greeks(delta, gamma, theta, vega, rho);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Greeks)) {
                return false;
            }
            Greeks greeks = (Greeks) other;
            return Intrinsics.areEqual(this.delta, greeks.delta) && Intrinsics.areEqual(this.gamma, greeks.gamma) && Intrinsics.areEqual(this.theta, greeks.theta) && Intrinsics.areEqual(this.vega, greeks.vega) && Intrinsics.areEqual(this.rho, greeks.rho);
        }

        public int hashCode() {
            return (((((((this.delta.hashCode() * 31) + this.gamma.hashCode()) * 31) + this.theta.hashCode()) * 31) + this.vega.hashCode()) * 31) + this.rho.hashCode();
        }

        public String toString() {
            return "Greeks(delta=" + this.delta + ", gamma=" + this.gamma + ", theta=" + this.theta + ", vega=" + this.vega + ", rho=" + this.rho + ")";
        }

        public final String getDelta() {
            return this.delta;
        }

        public final String getGamma() {
            return this.gamma;
        }

        public final String getTheta() {
            return this.theta;
        }

        public final String getVega() {
            return this.vega;
        }

        public final String getRho() {
            return this.rho;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Greeks(String delta, String gamma, String theta, String vega, String rho) {
            super(null);
            Intrinsics.checkNotNullParameter(delta, "delta");
            Intrinsics.checkNotNullParameter(gamma, "gamma");
            Intrinsics.checkNotNullParameter(theta, "theta");
            Intrinsics.checkNotNullParameter(vega, "vega");
            Intrinsics.checkNotNullParameter(rho, "rho");
            this.delta = delta;
            this.gamma = gamma;
            this.theta = theta;
            this.vega = vega;
            this.rho = rho;
        }
    }

    /* compiled from: OptionsDetailPageBodyState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Options;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", "legs", "", "Lcom/robinhood/android/options/ui/detail/OptionRow;", "<init>", "(Ljava/util/List;)V", "getLegs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState$Options, reason: from toString */
    public static final /* data */ class Options extends OptionsDetailPageBodyState2 {
        public static final int $stable = 8;
        private final List<OptionRow> legs;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Options copy$default(Options options, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = options.legs;
            }
            return options.copy(list);
        }

        public final List<OptionRow> component1() {
            return this.legs;
        }

        public final Options copy(List<OptionRow> legs) {
            Intrinsics.checkNotNullParameter(legs, "legs");
            return new Options(legs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Options) && Intrinsics.areEqual(this.legs, ((Options) other).legs);
        }

        public int hashCode() {
            return this.legs.hashCode();
        }

        public String toString() {
            return "Options(legs=" + this.legs + ")";
        }

        public final List<OptionRow> getLegs() {
            return this.legs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Options(List<OptionRow> legs) {
            super(null);
            Intrinsics.checkNotNullParameter(legs, "legs");
            this.legs = legs;
        }
    }

    /* compiled from: OptionsDetailPageBodyState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$History;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", "rows", "", "Lcom/robinhood/android/options/ui/detail/OptionRow;", "allHistoryKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Ljava/util/List;Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getRows", "()Ljava/util/List;", "getAllHistoryKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState$History, reason: from toString */
    public static final /* data */ class History extends OptionsDetailPageBodyState2 {
        public static final int $stable = 8;
        private final FragmentKey allHistoryKey;
        private final List<OptionRow> rows;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ History copy$default(History history, List list, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                list = history.rows;
            }
            if ((i & 2) != 0) {
                fragmentKey = history.allHistoryKey;
            }
            return history.copy(list, fragmentKey);
        }

        public final List<OptionRow> component1() {
            return this.rows;
        }

        /* renamed from: component2, reason: from getter */
        public final FragmentKey getAllHistoryKey() {
            return this.allHistoryKey;
        }

        public final History copy(List<OptionRow> rows, FragmentKey allHistoryKey) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new History(rows, allHistoryKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof History)) {
                return false;
            }
            History history = (History) other;
            return Intrinsics.areEqual(this.rows, history.rows) && Intrinsics.areEqual(this.allHistoryKey, history.allHistoryKey);
        }

        public int hashCode() {
            int iHashCode = this.rows.hashCode() * 31;
            FragmentKey fragmentKey = this.allHistoryKey;
            return iHashCode + (fragmentKey == null ? 0 : fragmentKey.hashCode());
        }

        public String toString() {
            return "History(rows=" + this.rows + ", allHistoryKey=" + this.allHistoryKey + ")";
        }

        public final List<OptionRow> getRows() {
            return this.rows;
        }

        public final FragmentKey getAllHistoryKey() {
            return this.allHistoryKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public History(List<OptionRow> rows, FragmentKey fragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.rows = rows;
            this.allHistoryKey = fragmentKey;
        }
    }

    /* compiled from: OptionsDetailPageBodyState.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003J{\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Position;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", "title", "", "subtitle", "cells", "", "Lcom/robinhood/android/options/ui/detail/CellState;", "todayReturnValue", "totalReturnValue", "showReturns", "", "simulatedReturnState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageSimulatedReturnState;", "exerciseKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "showDataCellTooltip", "portfolioRiskAnalyzerKey", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/android/options/ui/detail/OptionsDetailPageSimulatedReturnState;Lcom/robinhood/android/navigation/keys/IntentKey;ZLcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCells", "()Ljava/util/List;", "getTodayReturnValue", "getTotalReturnValue", "getShowReturns", "()Z", "getSimulatedReturnState", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageSimulatedReturnState;", "getExerciseKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "getShowDataCellTooltip", "getPortfolioRiskAnalyzerKey", "()Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState$Position, reason: from toString */
    public static final /* data */ class Position extends OptionsDetailPageBodyState2 {
        public static final int $stable = 8;
        private final List<CellState> cells;
        private final IntentKey exerciseKey;
        private final OptionsPortfolioRiskAnalyzer portfolioRiskAnalyzerKey;
        private final boolean showDataCellTooltip;
        private final boolean showReturns;
        private final OptionsDetailPageSimulatedReturnState simulatedReturnState;
        private final String subtitle;
        private final String title;
        private final String todayReturnValue;
        private final String totalReturnValue;

        public static /* synthetic */ Position copy$default(Position position, String str, String str2, List list, String str3, String str4, boolean z, OptionsDetailPageSimulatedReturnState optionsDetailPageSimulatedReturnState, IntentKey intentKey, boolean z2, OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer, int i, Object obj) {
            if ((i & 1) != 0) {
                str = position.title;
            }
            if ((i & 2) != 0) {
                str2 = position.subtitle;
            }
            if ((i & 4) != 0) {
                list = position.cells;
            }
            if ((i & 8) != 0) {
                str3 = position.todayReturnValue;
            }
            if ((i & 16) != 0) {
                str4 = position.totalReturnValue;
            }
            if ((i & 32) != 0) {
                z = position.showReturns;
            }
            if ((i & 64) != 0) {
                optionsDetailPageSimulatedReturnState = position.simulatedReturnState;
            }
            if ((i & 128) != 0) {
                intentKey = position.exerciseKey;
            }
            if ((i & 256) != 0) {
                z2 = position.showDataCellTooltip;
            }
            if ((i & 512) != 0) {
                optionsPortfolioRiskAnalyzer = position.portfolioRiskAnalyzerKey;
            }
            boolean z3 = z2;
            OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer2 = optionsPortfolioRiskAnalyzer;
            OptionsDetailPageSimulatedReturnState optionsDetailPageSimulatedReturnState2 = optionsDetailPageSimulatedReturnState;
            IntentKey intentKey2 = intentKey;
            String str5 = str4;
            boolean z4 = z;
            return position.copy(str, str2, list, str3, str5, z4, optionsDetailPageSimulatedReturnState2, intentKey2, z3, optionsPortfolioRiskAnalyzer2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final OptionsPortfolioRiskAnalyzer getPortfolioRiskAnalyzerKey() {
            return this.portfolioRiskAnalyzerKey;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<CellState> component3() {
            return this.cells;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTodayReturnValue() {
            return this.todayReturnValue;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTotalReturnValue() {
            return this.totalReturnValue;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowReturns() {
            return this.showReturns;
        }

        /* renamed from: component7, reason: from getter */
        public final OptionsDetailPageSimulatedReturnState getSimulatedReturnState() {
            return this.simulatedReturnState;
        }

        /* renamed from: component8, reason: from getter */
        public final IntentKey getExerciseKey() {
            return this.exerciseKey;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShowDataCellTooltip() {
            return this.showDataCellTooltip;
        }

        public final Position copy(String title, String subtitle, List<CellState> cells, String todayReturnValue, String totalReturnValue, boolean showReturns, OptionsDetailPageSimulatedReturnState simulatedReturnState, IntentKey exerciseKey, boolean showDataCellTooltip, OptionsPortfolioRiskAnalyzer portfolioRiskAnalyzerKey) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cells, "cells");
            Intrinsics.checkNotNullParameter(todayReturnValue, "todayReturnValue");
            Intrinsics.checkNotNullParameter(totalReturnValue, "totalReturnValue");
            return new Position(title, subtitle, cells, todayReturnValue, totalReturnValue, showReturns, simulatedReturnState, exerciseKey, showDataCellTooltip, portfolioRiskAnalyzerKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            Position position = (Position) other;
            return Intrinsics.areEqual(this.title, position.title) && Intrinsics.areEqual(this.subtitle, position.subtitle) && Intrinsics.areEqual(this.cells, position.cells) && Intrinsics.areEqual(this.todayReturnValue, position.todayReturnValue) && Intrinsics.areEqual(this.totalReturnValue, position.totalReturnValue) && this.showReturns == position.showReturns && Intrinsics.areEqual(this.simulatedReturnState, position.simulatedReturnState) && Intrinsics.areEqual(this.exerciseKey, position.exerciseKey) && this.showDataCellTooltip == position.showDataCellTooltip && Intrinsics.areEqual(this.portfolioRiskAnalyzerKey, position.portfolioRiskAnalyzerKey);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cells.hashCode()) * 31) + this.todayReturnValue.hashCode()) * 31) + this.totalReturnValue.hashCode()) * 31) + Boolean.hashCode(this.showReturns)) * 31;
            OptionsDetailPageSimulatedReturnState optionsDetailPageSimulatedReturnState = this.simulatedReturnState;
            int iHashCode3 = (iHashCode2 + (optionsDetailPageSimulatedReturnState == null ? 0 : optionsDetailPageSimulatedReturnState.hashCode())) * 31;
            IntentKey intentKey = this.exerciseKey;
            int iHashCode4 = (((iHashCode3 + (intentKey == null ? 0 : intentKey.hashCode())) * 31) + Boolean.hashCode(this.showDataCellTooltip)) * 31;
            OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer = this.portfolioRiskAnalyzerKey;
            return iHashCode4 + (optionsPortfolioRiskAnalyzer != null ? optionsPortfolioRiskAnalyzer.hashCode() : 0);
        }

        public String toString() {
            return "Position(title=" + this.title + ", subtitle=" + this.subtitle + ", cells=" + this.cells + ", todayReturnValue=" + this.todayReturnValue + ", totalReturnValue=" + this.totalReturnValue + ", showReturns=" + this.showReturns + ", simulatedReturnState=" + this.simulatedReturnState + ", exerciseKey=" + this.exerciseKey + ", showDataCellTooltip=" + this.showDataCellTooltip + ", portfolioRiskAnalyzerKey=" + this.portfolioRiskAnalyzerKey + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<CellState> getCells() {
            return this.cells;
        }

        public final String getTodayReturnValue() {
            return this.todayReturnValue;
        }

        public final String getTotalReturnValue() {
            return this.totalReturnValue;
        }

        public final boolean getShowReturns() {
            return this.showReturns;
        }

        public final OptionsDetailPageSimulatedReturnState getSimulatedReturnState() {
            return this.simulatedReturnState;
        }

        public final IntentKey getExerciseKey() {
            return this.exerciseKey;
        }

        public final boolean getShowDataCellTooltip() {
            return this.showDataCellTooltip;
        }

        public final OptionsPortfolioRiskAnalyzer getPortfolioRiskAnalyzerKey() {
            return this.portfolioRiskAnalyzerKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Position(String title, String str, List<CellState> cells, String todayReturnValue, String totalReturnValue, boolean z, OptionsDetailPageSimulatedReturnState optionsDetailPageSimulatedReturnState, IntentKey intentKey, boolean z2, OptionsPortfolioRiskAnalyzer optionsPortfolioRiskAnalyzer) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cells, "cells");
            Intrinsics.checkNotNullParameter(todayReturnValue, "todayReturnValue");
            Intrinsics.checkNotNullParameter(totalReturnValue, "totalReturnValue");
            this.title = title;
            this.subtitle = str;
            this.cells = cells;
            this.todayReturnValue = todayReturnValue;
            this.totalReturnValue = totalReturnValue;
            this.showReturns = z;
            this.simulatedReturnState = optionsDetailPageSimulatedReturnState;
            this.exerciseKey = intentKey;
            this.showDataCellTooltip = z2;
            this.portfolioRiskAnalyzerKey = optionsPortfolioRiskAnalyzer;
        }
    }

    /* compiled from: OptionsDetailPageBodyState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState;", "upsellDismissed", "", "<init>", "(Z)V", "LateClose", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell$LateClose;", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState$Upsell */
    public static abstract class Upsell extends OptionsDetailPageBodyState2 {
        public static final int $stable = 0;

        public /* synthetic */ Upsell(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private Upsell(boolean z) {
            super(null);
        }

        /* compiled from: OptionsDetailPageBodyState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell$LateClose;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell;", "Ljava/util/UUID;", "chainId", "", "chainSymbol", "j$/time/Instant", "lateCloseTime", "", "upsellDismissed", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lj$/time/Instant;Z)V", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "()Lj$/time/Instant;", "component4", "()Z", "copy", "(Ljava/util/UUID;Ljava/lang/String;Lj$/time/Instant;Z)Lcom/robinhood/android/options/ui/detail/OptionsDetailPageBodySectionState$Upsell$LateClose;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getChainId", "Ljava/lang/String;", "getChainSymbol", "Lj$/time/Instant;", "getLateCloseTime", "Z", "getUpsellDismissed", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageBodySectionState$Upsell$LateClose, reason: from toString */
        public static final /* data */ class LateClose extends Upsell {
            public static final int $stable = 8;
            private final UUID chainId;
            private final String chainSymbol;
            private final Instant lateCloseTime;
            private final boolean upsellDismissed;

            public static /* synthetic */ LateClose copy$default(LateClose lateClose, UUID uuid, String str, Instant instant, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = lateClose.chainId;
                }
                if ((i & 2) != 0) {
                    str = lateClose.chainSymbol;
                }
                if ((i & 4) != 0) {
                    instant = lateClose.lateCloseTime;
                }
                if ((i & 8) != 0) {
                    z = lateClose.upsellDismissed;
                }
                return lateClose.copy(uuid, str, instant, z);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getChainId() {
                return this.chainId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getChainSymbol() {
                return this.chainSymbol;
            }

            /* renamed from: component3, reason: from getter */
            public final Instant getLateCloseTime() {
                return this.lateCloseTime;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getUpsellDismissed() {
                return this.upsellDismissed;
            }

            public final LateClose copy(UUID chainId, String chainSymbol, Instant lateCloseTime, boolean upsellDismissed) {
                Intrinsics.checkNotNullParameter(chainId, "chainId");
                Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
                return new LateClose(chainId, chainSymbol, lateCloseTime, upsellDismissed);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LateClose)) {
                    return false;
                }
                LateClose lateClose = (LateClose) other;
                return Intrinsics.areEqual(this.chainId, lateClose.chainId) && Intrinsics.areEqual(this.chainSymbol, lateClose.chainSymbol) && Intrinsics.areEqual(this.lateCloseTime, lateClose.lateCloseTime) && this.upsellDismissed == lateClose.upsellDismissed;
            }

            public int hashCode() {
                int iHashCode = ((this.chainId.hashCode() * 31) + this.chainSymbol.hashCode()) * 31;
                Instant instant = this.lateCloseTime;
                return ((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + Boolean.hashCode(this.upsellDismissed);
            }

            public String toString() {
                return "LateClose(chainId=" + this.chainId + ", chainSymbol=" + this.chainSymbol + ", lateCloseTime=" + this.lateCloseTime + ", upsellDismissed=" + this.upsellDismissed + ")";
            }

            public final UUID getChainId() {
                return this.chainId;
            }

            public final String getChainSymbol() {
                return this.chainSymbol;
            }

            public final Instant getLateCloseTime() {
                return this.lateCloseTime;
            }

            public final boolean getUpsellDismissed() {
                return this.upsellDismissed;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LateClose(UUID chainId, String chainSymbol, Instant instant, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(chainId, "chainId");
                Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
                this.chainId = chainId;
                this.chainSymbol = chainSymbol;
                this.lateCloseTime = instant;
                this.upsellDismissed = z;
            }
        }
    }
}
