package com.robinhood.android.equitydetail.p123ui.position;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRowType;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossData;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.IssuerType;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionSectionData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0014\u0010(\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0014\u0010*\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001f¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/position/PositionSectionData;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "position", "Lcom/robinhood/models/db/Position;", "quote", "Lcom/robinhood/models/db/Quote;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "unrealizedProfitAndLossData", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;", "profitAndLossRetirementExperimentEnabled", "", "subzeroExperimentEnabled", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;ZZ)V", "isRetirement", "showPnl", "showAverageCostAsterisk", "buildDataRows", "", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "totalReturnValue", "Lcom/robinhood/utils/resource/StringResource;", "getTotalReturnValue$feature_equity_detail_externalDebug", "()Lcom/robinhood/utils/resource/StringResource;", "todayReturnValue", "getTodayReturnValue$feature_equity_detail_externalDebug", "totalReturnRowState", "getTotalReturnRowState$feature_equity_detail_externalDebug", "()Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "portfolioDiversityRowStateSubzero", "getPortfolioDiversityRowStateSubzero$feature_equity_detail_externalDebug", "portfolioDiversityRowState", "getPortfolioDiversityRowState$feature_equity_detail_externalDebug", "averageCostRowState", "getAverageCostRowState$feature_equity_detail_externalDebug", "sharesRowState", "getSharesRowState$feature_equity_detail_externalDebug", "marketValueRowState", "getMarketValueRowState$feature_equity_detail_externalDebug", "todayReturnRowState", "getTodayReturnRowState$feature_equity_detail_externalDebug", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PositionSectionData {
    public static final int $stable = 8;
    private final SdpDataRow3 averageCostRowState;
    private final Instrument instrument;
    private final boolean isRetirement;
    private final SdpDataRow3 marketValueRowState;
    private final Position position;
    private final Quote quote;
    private final SdpDataRow3 sharesRowState;
    private final boolean showAverageCostAsterisk;
    private final boolean showPnl;
    private final boolean subzeroExperimentEnabled;
    private final UnifiedAccountV2 unifiedAccount;
    private final UnrealizedProfitAndLossData unrealizedProfitAndLossData;

    /* compiled from: PositionSectionData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IssuerType.values().length];
            try {
                iArr[IssuerType.RHV_CEF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IssuerType.THIRD_PARTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PositionSectionData(Instrument instrument, Position position, Quote quote, UnifiedAccountV2 unifiedAccountV2, UnrealizedProfitAndLossData unrealizedProfitAndLossData, boolean z, boolean z2) {
        SdpDataRowType sdpDataRowType;
        StringResource stringResourceInvoke;
        SdpDataRow3.Default r4;
        StringResource defaultCellStr;
        SdpDataRowType sdpDataRowType2;
        StringResource defaultCellStr2;
        BrokerageAccountType brokerageAccountType;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(position, "position");
        this.instrument = instrument;
        this.position = position;
        this.quote = quote;
        this.unifiedAccount = unifiedAccountV2;
        this.unrealizedProfitAndLossData = unrealizedProfitAndLossData;
        this.subzeroExperimentEnabled = z2;
        boolean z3 = false;
        boolean z4 = (unifiedAccountV2 == null || (brokerageAccountType = unifiedAccountV2.getBrokerageAccountType()) == null || !brokerageAccountType.isRetirement()) ? false : true;
        this.isRetirement = z4;
        boolean z5 = !z4 || z;
        this.showPnl = z5;
        if (z4 && !z) {
            z3 = true;
        }
        this.showAverageCostAsterisk = z3;
        if (z5 && unrealizedProfitAndLossData != null) {
            Money averageCostBasis = position.getAverageCostBasis();
            if (Position5.isShortPosition(position) && z2) {
                sdpDataRowType2 = SdpDataRowType.PositionAverageCredit;
            } else {
                sdpDataRowType2 = SdpDataRowType.PositionAverageCostV2;
            }
            if (averageCostBasis != null && !Position5.isBoxed(position)) {
                defaultCellStr2 = StringResource.INSTANCE.invoke(Money.format$default(averageCostBasis, null, false, null, false, 0, null, false, RoundingMode.HALF_UP, false, false, 895, null));
            } else {
                defaultCellStr2 = PositionSectionData2.getDefaultCellStr();
            }
            r4 = new SdpDataRow3.Default(sdpDataRowType2, null, defaultCellStr2, null, null, null, 58, null);
        } else {
            if (z3) {
                sdpDataRowType = SdpDataRowType.PositionAverageCostWithAsterisk;
            } else {
                sdpDataRowType = SdpDataRowType.PositionAverageCost;
            }
            SdpDataRowType sdpDataRowType3 = sdpDataRowType;
            if (Position5.isShortPosition(position)) {
                stringResourceInvoke = PositionSectionData2.getDefaultCellStr();
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(Money.format$default(position.getDisplayAverageBuyPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            }
            r4 = new SdpDataRow3.Default(sdpDataRowType3, null, stringResourceInvoke, null, null, null, 58, null);
        }
        this.averageCostRowState = r4;
        SdpDataRowType sdpDataRowType4 = SdpDataRowType.PositionShares;
        StringResource.Companion companion = StringResource.INSTANCE;
        this.sharesRowState = new SdpDataRow3.Default(sdpDataRowType4, null, companion.invoke(Formats.getShareQuantityFormat().format(position.getDisplayQuantity())), null, null, null, 58, null);
        SdpDataRowType sdpDataRowType5 = SdpDataRowType.PositionMarketValue;
        if (quote != null) {
            defaultCellStr = companion.invoke(Formats.getAmountFormat().format(position.getTotalEquity(quote).getDecimalValue()));
        } else {
            defaultCellStr = PositionSectionData2.getDefaultCellStr();
        }
        this.marketValueRowState = new SdpDataRow3.Default(sdpDataRowType5, null, defaultCellStr, null, null, null, 58, null);
    }

    public final List<SdpDataRow3> buildDataRows() {
        if (Position5.isShortPosition(this.position) && !this.subzeroExperimentEnabled) {
            return CollectionsKt.listOf((Object[]) new SdpDataRow3[]{this.sharesRowState, this.marketValueRowState, this.averageCostRowState, getTotalReturnRowState$feature_equity_detail_externalDebug()});
        }
        SdpDataRow3 sdpDataRow3 = this.sharesRowState;
        SdpDataRow3 sdpDataRow32 = this.marketValueRowState;
        SdpDataRow3 sdpDataRow33 = this.averageCostRowState;
        SdpDataRow3 sdpDataRow3M1983x4f64fa85 = m1983x4f64fa85();
        if (this.subzeroExperimentEnabled) {
            sdpDataRow3M1983x4f64fa85 = null;
        }
        return CollectionsKt.listOfNotNull((Object[]) new SdpDataRow3[]{sdpDataRow3, sdpDataRow32, sdpDataRow33, sdpDataRow3M1983x4f64fa85, this.subzeroExperimentEnabled ? m1984x7f2b85d1() : null, getTodayReturnRowState$feature_equity_detail_externalDebug(), getTotalReturnRowState$feature_equity_detail_externalDebug()});
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StringResource getTotalReturnValue$feature_equity_detail_externalDebug() {
        StringResource stringResourceInvoke;
        UnrealizedProfitAndLossData unrealizedProfitAndLossData;
        BigDecimal bigDecimalCompat;
        StringResource stringResourceInvoke2;
        NumberFormatter numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default = Formats.currencyDeltaFourMaxFractionalDigitsFormat$default(0, null, 3, null);
        NumberFormatter percentDeltaFormat = Formats.getPercentDeltaFormat();
        if (this.showPnl && (unrealizedProfitAndLossData = this.unrealizedProfitAndLossData) != null) {
            Money totalReturn = unrealizedProfitAndLossData.getTotalReturn();
            if (totalReturn != null && (bigDecimalCompat = Money3.getBigDecimalCompat(totalReturn)) != null) {
                BigDecimal totalReturnPercentage = this.unrealizedProfitAndLossData.getTotalReturnPercentage();
                if (totalReturnPercentage == null || (stringResourceInvoke2 = StringResource.INSTANCE.invoke(C11048R.string.bolded_number_and_percent_change_format, numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default.format(bigDecimalCompat), percentDeltaFormat.format(totalReturnPercentage))) == null) {
                    stringResourceInvoke2 = StringResource.INSTANCE.invoke(numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default.format(bigDecimalCompat));
                }
                if (stringResourceInvoke2 != null) {
                    return stringResourceInvoke2;
                }
            }
            return PositionSectionData2.getDefaultCellStr();
        }
        Quote quote = this.quote;
        if (quote != null) {
            Money totalReturnAmount = this.position.getTotalReturnAmount(quote);
            if (totalReturnAmount != null) {
                BigDecimal totalReturnPercentage2 = this.position.getTotalReturnPercentage(this.quote);
                if (totalReturnPercentage2 != null) {
                    if (this.position.getDisplayAverageBuyPrice().isZero()) {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default.format(Money3.getBigDecimalCompat(totalReturnAmount)));
                    } else {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.bolded_number_and_percent_change_format, numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default.format(Money3.getBigDecimalCompat(totalReturnAmount)), percentDeltaFormat.format(totalReturnPercentage2));
                    }
                    if (stringResourceInvoke == null) {
                    }
                    if (stringResourceInvoke != null) {
                    }
                } else {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default.format(Money3.getBigDecimalCompat(totalReturnAmount)));
                    if (stringResourceInvoke != null) {
                        return stringResourceInvoke;
                    }
                }
            }
            return PositionSectionData2.getDefaultCellStr();
        }
        return PositionSectionData2.getDefaultCellStr();
    }

    public final StringResource getTodayReturnValue$feature_equity_detail_externalDebug() {
        Quote quote;
        Quote quote2;
        UnrealizedProfitAndLossData unrealizedProfitAndLossData;
        BigDecimal bigDecimalCompat;
        StringResource stringResourceInvoke;
        NumberFormatter numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default = Formats.currencyDeltaFourMaxFractionalDigitsFormat$default(0, null, 3, null);
        NumberFormatter percentDeltaFormat = Formats.getPercentDeltaFormat();
        if (this.showPnl && (unrealizedProfitAndLossData = this.unrealizedProfitAndLossData) != null) {
            Money todaysReturn = unrealizedProfitAndLossData.getTodaysReturn();
            if (todaysReturn != null && (bigDecimalCompat = Money3.getBigDecimalCompat(todaysReturn)) != null) {
                BigDecimal todaysReturnPercentage = this.unrealizedProfitAndLossData.getTodaysReturnPercentage();
                if (todaysReturnPercentage == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.bolded_number_and_percent_change_format, numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default.format(bigDecimalCompat), percentDeltaFormat.format(todaysReturnPercentage))) == null) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default.format(bigDecimalCompat));
                }
                if (stringResourceInvoke != null) {
                    return stringResourceInvoke;
                }
            }
            return PositionSectionData2.getDefaultCellStr();
        }
        boolean zIsZero = this.position.getDisplayAverageBuyPrice().isZero();
        if (zIsZero && (quote2 = this.quote) != null) {
            return StringResource.INSTANCE.invoke(numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default.format(Money3.getBigDecimalCompat(this.position.getTodaysReturnAmount(quote2))));
        }
        if (!zIsZero && (quote = this.quote) != null) {
            return StringResource.INSTANCE.invoke(C11048R.string.bolded_number_and_percent_change_format, numberFormatterCurrencyDeltaFourMaxFractionalDigitsFormat$default.format(Money3.getBigDecimalCompat(this.position.getTodaysReturnAmount(quote))), percentDeltaFormat.format(this.position.getTodaysReturnPercentage(this.quote)));
        }
        return PositionSectionData2.getDefaultCellStr();
    }

    public final SdpDataRow3 getTotalReturnRowState$feature_equity_detail_externalDebug() {
        SdpDataRowType sdpDataRowType;
        StringResource totalReturnValue$feature_equity_detail_externalDebug;
        IssuerType issuerType = this.instrument.getIssuerType();
        int i = issuerType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[issuerType.ordinal()];
        if (i == -1) {
            sdpDataRowType = SdpDataRowType.PositionTotalReturn;
        } else if (i == 1) {
            sdpDataRowType = SdpDataRowType.PositionTotalReturnVentures;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sdpDataRowType = SdpDataRowType.PositionTotalReturn;
        }
        SdpDataRowType sdpDataRowType2 = sdpDataRowType;
        if ((Position5.isShortPosition(this.position) && !this.subzeroExperimentEnabled) || Position5.isBoxed(this.position)) {
            totalReturnValue$feature_equity_detail_externalDebug = PositionSectionData2.getDefaultCellStr();
        } else {
            totalReturnValue$feature_equity_detail_externalDebug = getTotalReturnValue$feature_equity_detail_externalDebug();
        }
        StringResource stringResource = totalReturnValue$feature_equity_detail_externalDebug;
        SdpDataRowType sdpDataRowType3 = SdpDataRowType.PositionTotalReturnVentures;
        return new SdpDataRow3.Default(sdpDataRowType2, null, stringResource, sdpDataRowType2 == sdpDataRowType3 ? new BentoIcon4.Size12(ServerToBentoAssetMapper2.INFO_12) : null, sdpDataRowType2 == sdpDataRowType3 ? new SdpDataRow3.Tooltip(C15314R.id.instrument_detail_positions_total_return_ventures_tooltip, StringResource.INSTANCE.invoke(C15314R.string.instrument_detail_positions_ventures_return_tooltip, this.instrument.getSymbol())) : null, null, 34, null);
    }

    /* renamed from: getPortfolioDiversityRowStateSubzero$feature_equity_detail_externalDebug */
    public final SdpDataRow3 m1984x7f2b85d1() {
        Money totalAbsoluteMarketValue;
        BigDecimal bigDecimalCompat = null;
        if (this.quote == null) {
            return null;
        }
        SdpDataRowType sdpDataRowType = SdpDataRowType.PositionPortfolioDiversity;
        BigDecimal bigDecimalCompat2 = Money3.getBigDecimalCompat(this.position.getTotalEquity(this.quote).abs());
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        if (unifiedAccountV2 != null && (totalAbsoluteMarketValue = unifiedAccountV2.getTotalAbsoluteMarketValue()) != null) {
            bigDecimalCompat = Money3.getBigDecimalCompat(totalAbsoluteMarketValue);
        }
        return new SdpDataRow3.PieChart(sdpDataRowType, null, BigDecimals7.safeDivide(bigDecimalCompat2, bigDecimalCompat).floatValue(), 2, null);
    }

    /* renamed from: getPortfolioDiversityRowState$feature_equity_detail_externalDebug */
    public final SdpDataRow3 m1983x4f64fa85() {
        Money totalMarketValue;
        BigDecimal bigDecimalCompat = null;
        if (this.quote == null) {
            return null;
        }
        SdpDataRowType sdpDataRowType = SdpDataRowType.PositionPortfolioDiversity;
        BigDecimal bigDecimalCompat2 = Money3.getBigDecimalCompat(this.position.getTotalEquity(this.quote));
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        if (unifiedAccountV2 != null && (totalMarketValue = unifiedAccountV2.getTotalMarketValue()) != null) {
            bigDecimalCompat = Money3.getBigDecimalCompat(totalMarketValue);
        }
        return new SdpDataRow3.PieChart(sdpDataRowType, null, BigDecimals7.safeDivide(bigDecimalCompat2, bigDecimalCompat).floatValue(), 2, null);
    }

    /* renamed from: getAverageCostRowState$feature_equity_detail_externalDebug, reason: from getter */
    public final SdpDataRow3 getAverageCostRowState() {
        return this.averageCostRowState;
    }

    /* renamed from: getSharesRowState$feature_equity_detail_externalDebug, reason: from getter */
    public final SdpDataRow3 getSharesRowState() {
        return this.sharesRowState;
    }

    /* renamed from: getMarketValueRowState$feature_equity_detail_externalDebug, reason: from getter */
    public final SdpDataRow3 getMarketValueRowState() {
        return this.marketValueRowState;
    }

    public final SdpDataRow3 getTodayReturnRowState$feature_equity_detail_externalDebug() {
        SdpDataRowType sdpDataRowType;
        IssuerType issuerType = this.instrument.getIssuerType();
        int i = issuerType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[issuerType.ordinal()];
        if (i == -1) {
            sdpDataRowType = SdpDataRowType.PositionTodayReturn;
        } else if (i == 1) {
            sdpDataRowType = SdpDataRowType.PositionTodayReturnVentures;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sdpDataRowType = SdpDataRowType.PositionTodayReturn;
        }
        SdpDataRowType sdpDataRowType2 = sdpDataRowType;
        StringResource todayReturnValue$feature_equity_detail_externalDebug = getTodayReturnValue$feature_equity_detail_externalDebug();
        SdpDataRowType sdpDataRowType3 = SdpDataRowType.PositionTodayReturnVentures;
        return new SdpDataRow3.Default(sdpDataRowType2, null, todayReturnValue$feature_equity_detail_externalDebug, sdpDataRowType2 == sdpDataRowType3 ? new BentoIcon4.Size12(ServerToBentoAssetMapper2.INFO_12) : null, sdpDataRowType2 == sdpDataRowType3 ? new SdpDataRow3.Tooltip(C15314R.id.instrument_detail_positions_todays_return_ventures_tooltip, StringResource.INSTANCE.invoke(C15314R.string.instrument_detail_positions_ventures_return_tooltip, this.instrument.getSymbol())) : null, null, 34, null);
    }
}
