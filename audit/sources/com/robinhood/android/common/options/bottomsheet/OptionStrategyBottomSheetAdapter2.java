package com.robinhood.android.common.options.bottomsheet;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.aggregatequotes.ClientAggregateOptionStrategyQuote;
import com.robinhood.android.options.contracts.OptionsProfitLossChartAnalysisFragmentKey;
import com.robinhood.android.options.optionsstring.common.OptionLegBundles;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionStrategyBottomSheetAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/SpreadData;", "", "viewType", "", "<init>", "(I)V", "getViewType", "()I", "TitleData", "RowData", "GreeksAndProfitLossData", "TwoItemRowData", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData$GreeksAndProfitLossData;", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData$RowData;", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData$TitleData;", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData$TwoItemRowData;", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.bottomsheet.SpreadData, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class OptionStrategyBottomSheetAdapter2 {
    private final int viewType;

    public /* synthetic */ OptionStrategyBottomSheetAdapter2(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* compiled from: OptionStrategyBottomSheetAdapter.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0015J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/SpreadData$RowData;", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData;", "leg", "Lcom/robinhood/models/ui/OptionLegBundle;", "positionCounts", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "quote", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "<init>", "(Lcom/robinhood/models/ui/OptionLegBundle;Lcom/robinhood/models/ui/UiOptionPositionCounts;Lcom/robinhood/models/db/OptionInstrumentQuote;)V", "getLeg", "()Lcom/robinhood/models/ui/OptionLegBundle;", "getPositionCounts", "()Lcom/robinhood/models/ui/UiOptionPositionCounts;", "getQuote", "()Lcom/robinhood/models/db/OptionInstrumentQuote;", "getPrimaryText", "Landroid/text/SpannedString;", "resources", "Landroid/content/res/Resources;", "getSecondaryText", "", "getPriceText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.options.bottomsheet.SpreadData$RowData, reason: from toString */
    public static final /* data */ class RowData extends OptionStrategyBottomSheetAdapter2 {
        private final OptionLegBundle leg;
        private final UiOptionPositionCounts positionCounts;
        private final OptionInstrumentQuote quote;

        /* compiled from: OptionStrategyBottomSheetAdapter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.common.options.bottomsheet.SpreadData$RowData$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderSide.values().length];
                try {
                    iArr[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ RowData copy$default(RowData rowData, OptionLegBundle optionLegBundle, UiOptionPositionCounts uiOptionPositionCounts, OptionInstrumentQuote optionInstrumentQuote, int i, Object obj) {
            if ((i & 1) != 0) {
                optionLegBundle = rowData.leg;
            }
            if ((i & 2) != 0) {
                uiOptionPositionCounts = rowData.positionCounts;
            }
            if ((i & 4) != 0) {
                optionInstrumentQuote = rowData.quote;
            }
            return rowData.copy(optionLegBundle, uiOptionPositionCounts, optionInstrumentQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionLegBundle getLeg() {
            return this.leg;
        }

        /* renamed from: component2, reason: from getter */
        public final UiOptionPositionCounts getPositionCounts() {
            return this.positionCounts;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionInstrumentQuote getQuote() {
            return this.quote;
        }

        public final RowData copy(OptionLegBundle leg, UiOptionPositionCounts positionCounts, OptionInstrumentQuote quote) {
            Intrinsics.checkNotNullParameter(leg, "leg");
            return new RowData(leg, positionCounts, quote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowData)) {
                return false;
            }
            RowData rowData = (RowData) other;
            return Intrinsics.areEqual(this.leg, rowData.leg) && Intrinsics.areEqual(this.positionCounts, rowData.positionCounts) && Intrinsics.areEqual(this.quote, rowData.quote);
        }

        public int hashCode() {
            int iHashCode = this.leg.hashCode() * 31;
            UiOptionPositionCounts uiOptionPositionCounts = this.positionCounts;
            int iHashCode2 = (iHashCode + (uiOptionPositionCounts == null ? 0 : uiOptionPositionCounts.hashCode())) * 31;
            OptionInstrumentQuote optionInstrumentQuote = this.quote;
            return iHashCode2 + (optionInstrumentQuote != null ? optionInstrumentQuote.hashCode() : 0);
        }

        public String toString() {
            return "RowData(leg=" + this.leg + ", positionCounts=" + this.positionCounts + ", quote=" + this.quote + ")";
        }

        public final SpannedString getPrimaryText(Resources resources) {
            String string2;
            int longQuantity;
            int shortQuantity;
            Intrinsics.checkNotNullParameter(resources, "resources");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            NumberFormatter strikeFormatter = OptionUnderlyings.getStrikeFormatter(this.leg.getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain().getUnderlyingType());
            int i = C11312R.string.bottom_sheet_row_title;
            String str = strikeFormatter.format(this.leg.getOptionInstrument().getStrikePrice());
            OrderSide optionSide = this.leg.getOptionConfigurationBundle().getOptionSide();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i2 = iArr[optionSide.ordinal()];
            if (i2 == 1) {
                string2 = resources.getString(C11312R.string.bottom_sheet_row_long);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = resources.getString(C11312R.string.bottom_sheet_row_short);
            }
            String string3 = resources.getString(i, str, string2, OptionExtensions.getContractTypeString$default(resources, this.leg.getOptionInstrument().getContractType(), 0, 4, null));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            spannableStringBuilder.append((CharSequence) string3);
            if (this.positionCounts != null) {
                int i3 = iArr[this.leg.getOptionConfigurationBundle().getOptionSide().ordinal()];
                if (i3 == 1) {
                    longQuantity = this.positionCounts.getLongQuantity();
                    shortQuantity = this.positionCounts.getShortQuantity();
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    longQuantity = this.positionCounts.getShortQuantity();
                    shortQuantity = this.positionCounts.getLongQuantity();
                }
                int i4 = longQuantity - shortQuantity;
                if (i4 != 0) {
                    String str2 = Formats.getIntegerDeltaFormat().format(Integer.valueOf(i4));
                    spannableStringBuilder.append(' ');
                    Object[] objArr = {new AbsoluteSizeSpan(resources.getDimensionPixelSize(C13997R.dimen.text_size_mobius_regular_small)), new ThemableColorSpans3(new ThemedResourceReference(ResourceType.COLOR.INSTANCE, android.R.attr.textColorSecondary))};
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) str2);
                    for (int i5 = 0; i5 < 2; i5++) {
                        spannableStringBuilder.setSpan(objArr[i5], length, spannableStringBuilder.length(), 17);
                    }
                }
            }
            return new SpannedString(spannableStringBuilder);
        }

        public final OptionLegBundle getLeg() {
            return this.leg;
        }

        public final UiOptionPositionCounts getPositionCounts() {
            return this.positionCounts;
        }

        public final OptionInstrumentQuote getQuote() {
            return this.quote;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RowData(OptionLegBundle leg, UiOptionPositionCounts uiOptionPositionCounts, OptionInstrumentQuote optionInstrumentQuote) {
            super(1, null);
            Intrinsics.checkNotNullParameter(leg, "leg");
            this.leg = leg;
            this.positionCounts = uiOptionPositionCounts;
            this.quote = optionInstrumentQuote;
        }

        public final String getSecondaryText(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            OptionLegBundle optionLegBundle = this.leg;
            return OptionLegBundles.getShoppingCartSubtitle(optionLegBundle, resources, optionLegBundle.getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain().getOptionChain().getSettleOnOpen());
        }

        public final String getPriceText() {
            BigDecimal bigDecimalMultiply;
            BigDecimal markPrice;
            BigDecimal multiplier = this.leg.getOptionConfigurationBundle().getOptionSide().getDirection().getMultiplier();
            NumberFormatter amountFormat = Formats.getAmountFormat();
            OptionInstrumentQuote optionInstrumentQuote = this.quote;
            if (optionInstrumentQuote == null || (markPrice = optionInstrumentQuote.getMarkPrice()) == null) {
                bigDecimalMultiply = null;
            } else {
                bigDecimalMultiply = markPrice.multiply(multiplier);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            }
            return amountFormat.format(BigDecimals7.orZero(bigDecimalMultiply));
        }
    }

    private OptionStrategyBottomSheetAdapter2(int i) {
        this.viewType = i;
    }

    public final int getViewType() {
        return this.viewType;
    }

    /* compiled from: OptionStrategyBottomSheetAdapter.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/SpreadData$TitleData;", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData;", "title", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.bottomsheet.SpreadData$TitleData, reason: from toString */
    public static final /* data */ class TitleData extends OptionStrategyBottomSheetAdapter2 {
        private final StringResource title;

        public static /* synthetic */ TitleData copy$default(TitleData titleData, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = titleData.title;
            }
            return titleData.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        public final TitleData copy(StringResource title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new TitleData(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TitleData) && Intrinsics.areEqual(this.title, ((TitleData) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "TitleData(title=" + this.title + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleData(StringResource title) {
            super(0, null);
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public final StringResource getTitle() {
            return this.title;
        }
    }

    /* compiled from: OptionStrategyBottomSheetAdapter.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/SpreadData$GreeksAndProfitLossData;", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData;", "analysisBtnEnabled", "", "analysisBtnFragmentKey", "Lcom/robinhood/android/options/contracts/OptionsProfitLossChartAnalysisFragmentKey;", "chainSymbol", "", "profitLossChartParams", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "optionQuote", "Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;", "<init>", "(ZLcom/robinhood/android/options/contracts/OptionsProfitLossChartAnalysisFragmentKey;Ljava/lang/String;Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;)V", "getAnalysisBtnEnabled", "()Z", "getAnalysisBtnFragmentKey", "()Lcom/robinhood/android/options/contracts/OptionsProfitLossChartAnalysisFragmentKey;", "getChainSymbol", "()Ljava/lang/String;", "getProfitLossChartParams", "()Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "getOptionQuote", "()Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.bottomsheet.SpreadData$GreeksAndProfitLossData, reason: from toString */
    public static final /* data */ class GreeksAndProfitLossData extends OptionStrategyBottomSheetAdapter2 {
        private final boolean analysisBtnEnabled;
        private final OptionsProfitLossChartAnalysisFragmentKey analysisBtnFragmentKey;
        private final String chainSymbol;
        private final ClientAggregateOptionStrategyQuote optionQuote;
        private final ApiOptionsProfitLossChartRequestParams profitLossChartParams;

        public static /* synthetic */ GreeksAndProfitLossData copy$default(GreeksAndProfitLossData greeksAndProfitLossData, boolean z, OptionsProfitLossChartAnalysisFragmentKey optionsProfitLossChartAnalysisFragmentKey, String str, ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams, ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote, int i, Object obj) {
            if ((i & 1) != 0) {
                z = greeksAndProfitLossData.analysisBtnEnabled;
            }
            if ((i & 2) != 0) {
                optionsProfitLossChartAnalysisFragmentKey = greeksAndProfitLossData.analysisBtnFragmentKey;
            }
            if ((i & 4) != 0) {
                str = greeksAndProfitLossData.chainSymbol;
            }
            if ((i & 8) != 0) {
                apiOptionsProfitLossChartRequestParams = greeksAndProfitLossData.profitLossChartParams;
            }
            if ((i & 16) != 0) {
                clientAggregateOptionStrategyQuote = greeksAndProfitLossData.optionQuote;
            }
            ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote2 = clientAggregateOptionStrategyQuote;
            String str2 = str;
            return greeksAndProfitLossData.copy(z, optionsProfitLossChartAnalysisFragmentKey, str2, apiOptionsProfitLossChartRequestParams, clientAggregateOptionStrategyQuote2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAnalysisBtnEnabled() {
            return this.analysisBtnEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionsProfitLossChartAnalysisFragmentKey getAnalysisBtnFragmentKey() {
            return this.analysisBtnFragmentKey;
        }

        /* renamed from: component3, reason: from getter */
        public final String getChainSymbol() {
            return this.chainSymbol;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiOptionsProfitLossChartRequestParams getProfitLossChartParams() {
            return this.profitLossChartParams;
        }

        /* renamed from: component5, reason: from getter */
        public final ClientAggregateOptionStrategyQuote getOptionQuote() {
            return this.optionQuote;
        }

        public final GreeksAndProfitLossData copy(boolean analysisBtnEnabled, OptionsProfitLossChartAnalysisFragmentKey analysisBtnFragmentKey, String chainSymbol, ApiOptionsProfitLossChartRequestParams profitLossChartParams, ClientAggregateOptionStrategyQuote optionQuote) {
            return new GreeksAndProfitLossData(analysisBtnEnabled, analysisBtnFragmentKey, chainSymbol, profitLossChartParams, optionQuote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GreeksAndProfitLossData)) {
                return false;
            }
            GreeksAndProfitLossData greeksAndProfitLossData = (GreeksAndProfitLossData) other;
            return this.analysisBtnEnabled == greeksAndProfitLossData.analysisBtnEnabled && Intrinsics.areEqual(this.analysisBtnFragmentKey, greeksAndProfitLossData.analysisBtnFragmentKey) && Intrinsics.areEqual(this.chainSymbol, greeksAndProfitLossData.chainSymbol) && Intrinsics.areEqual(this.profitLossChartParams, greeksAndProfitLossData.profitLossChartParams) && Intrinsics.areEqual(this.optionQuote, greeksAndProfitLossData.optionQuote);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.analysisBtnEnabled) * 31;
            OptionsProfitLossChartAnalysisFragmentKey optionsProfitLossChartAnalysisFragmentKey = this.analysisBtnFragmentKey;
            int iHashCode2 = (iHashCode + (optionsProfitLossChartAnalysisFragmentKey == null ? 0 : optionsProfitLossChartAnalysisFragmentKey.hashCode())) * 31;
            String str = this.chainSymbol;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams = this.profitLossChartParams;
            int iHashCode4 = (iHashCode3 + (apiOptionsProfitLossChartRequestParams == null ? 0 : apiOptionsProfitLossChartRequestParams.hashCode())) * 31;
            ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote = this.optionQuote;
            return iHashCode4 + (clientAggregateOptionStrategyQuote != null ? clientAggregateOptionStrategyQuote.hashCode() : 0);
        }

        public String toString() {
            return "GreeksAndProfitLossData(analysisBtnEnabled=" + this.analysisBtnEnabled + ", analysisBtnFragmentKey=" + this.analysisBtnFragmentKey + ", chainSymbol=" + this.chainSymbol + ", profitLossChartParams=" + this.profitLossChartParams + ", optionQuote=" + this.optionQuote + ")";
        }

        public final boolean getAnalysisBtnEnabled() {
            return this.analysisBtnEnabled;
        }

        public final OptionsProfitLossChartAnalysisFragmentKey getAnalysisBtnFragmentKey() {
            return this.analysisBtnFragmentKey;
        }

        public final String getChainSymbol() {
            return this.chainSymbol;
        }

        public final ApiOptionsProfitLossChartRequestParams getProfitLossChartParams() {
            return this.profitLossChartParams;
        }

        public final ClientAggregateOptionStrategyQuote getOptionQuote() {
            return this.optionQuote;
        }

        public GreeksAndProfitLossData(boolean z, OptionsProfitLossChartAnalysisFragmentKey optionsProfitLossChartAnalysisFragmentKey, String str, ApiOptionsProfitLossChartRequestParams apiOptionsProfitLossChartRequestParams, ClientAggregateOptionStrategyQuote clientAggregateOptionStrategyQuote) {
            super(2, null);
            this.analysisBtnEnabled = z;
            this.analysisBtnFragmentKey = optionsProfitLossChartAnalysisFragmentKey;
            this.chainSymbol = str;
            this.profitLossChartParams = apiOptionsProfitLossChartRequestParams;
            this.optionQuote = clientAggregateOptionStrategyQuote;
        }
    }

    /* compiled from: OptionStrategyBottomSheetAdapter.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/SpreadData$TwoItemRowData;", "Lcom/robinhood/android/common/options/bottomsheet/SpreadData;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.bottomsheet.SpreadData$TwoItemRowData, reason: from toString */
    public static final /* data */ class TwoItemRowData extends OptionStrategyBottomSheetAdapter2 {
        private final StringResource primaryText;
        private final StringResource secondaryText;

        public static /* synthetic */ TwoItemRowData copy$default(TwoItemRowData twoItemRowData, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = twoItemRowData.primaryText;
            }
            if ((i & 2) != 0) {
                stringResource2 = twoItemRowData.secondaryText;
            }
            return twoItemRowData.copy(stringResource, stringResource2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        public final TwoItemRowData copy(StringResource primaryText, StringResource secondaryText) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            return new TwoItemRowData(primaryText, secondaryText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TwoItemRowData)) {
                return false;
            }
            TwoItemRowData twoItemRowData = (TwoItemRowData) other;
            return Intrinsics.areEqual(this.primaryText, twoItemRowData.primaryText) && Intrinsics.areEqual(this.secondaryText, twoItemRowData.secondaryText);
        }

        public int hashCode() {
            int iHashCode = this.primaryText.hashCode() * 31;
            StringResource stringResource = this.secondaryText;
            return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
        }

        public String toString() {
            return "TwoItemRowData(primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ")";
        }

        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        public final StringResource getSecondaryText() {
            return this.secondaryText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TwoItemRowData(StringResource primaryText, StringResource stringResource) {
            super(3, null);
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            this.primaryText = primaryText;
            this.secondaryText = stringResource;
        }
    }
}
