package com.robinhood.android.equityadvancedorder.datastate;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equityadvancedorder.BentoNumpadTextInputFormatters3;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.equityadvancedorder.LimitPriceBentoNumpadTextInputFormatter;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.ILimit;
import com.robinhood.android.equityadvancedorder.utils.InstrumentAccountSwitcherUtils;
import com.robinhood.android.equityadvancedorder.utils.MarketHours3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDataState2;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration2;
import com.robinhood.android.tradinghourvisual.lib.p263ui.OrderTradingSessionVisualizerUtil;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.TradingSession2;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: LimitStandard.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010.\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u00108\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010<\u001a\u0002078\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u0019\u0010?\u001a\u0004\u0018\u00010>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010C\u001a\u0004\u0018\u00010>8\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u0019\u0010E\u001a\u0004\u0018\u00010>8\u0006¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010BR\u0017\u0010G\u001a\u00020>8\u0006¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010BR\u0014\u0010J\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010!R\u0016\u0010L\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010!R\u0016\u0010N\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010!R\u0014\u0010Q\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010U\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0013\u0010Y\u001a\u0004\u0018\u00010V8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020V0Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010a\u001a\u0004\u0018\u00010^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010e\u001a\u0004\u0018\u00010b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0016\u0010h\u001a\u0004\u0018\u00010\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0013\u0010j\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bi\u0010!R\u0011\u0010n\u001a\u00020k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;", "Lcom/robinhood/android/equityadvancedorder/datastate/ILimit;", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "commonState", "Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;", "limitState", "<init>", "(Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;)V", "component1", "()Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "component2", "()Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;", "copy", "(Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;)Lcom/robinhood/android/equityadvancedorder/datastate/LimitStandard;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState$CommonState;", "getCommonState", "Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;", "getLimitState", "Lcom/robinhood/utils/resource/StringResource;", "actionOrderTypeHeaderLabel", "Lcom/robinhood/utils/resource/StringResource;", "getActionOrderTypeHeaderLabel", "()Lcom/robinhood/utils/resource/StringResource;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/AnnotatedString;", "bidAskString", "Lkotlin/jvm/functions/Function2;", "getBidAskString", "()Lkotlin/jvm/functions/Function2;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderTitle;", "titleRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderTitle;", "getTitleRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderTitle;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderSubtitle;", "subtitleRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderSubtitle;", "getSubtitleRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$HeaderSubtitle;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Empty;", "emptyRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Empty;", "getEmptyRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Empty;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "numberOfSharesRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "getNumberOfSharesRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "limitPriceRow", "getLimitPriceRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$DropdownEdit;", "marketSessionRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$DropdownEdit;", "getMarketSessionRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$DropdownEdit;", "timeInForceRow", "getTimeInForceRow", "accountRow", "getAccountRow", "tradingSessionSettingsRow", "getTradingSessionSettingsRow", "getTradingSessionDropdownEditRowValueText", "tradingSessionDropdownEditRowValueText", "getTradingSessionSettingsRowSecondaryValueText", "tradingSessionSettingsRowSecondaryValueText", "getTimeInForceRowValueText", "timeInForceRowValueText", "getReadyToAdvanceToDetailEdit", "()Z", "readyToAdvanceToDetailEdit", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "getSellToOpenTimeInForceRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Information;", "sellToOpenTimeInForceRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "getSellToOpenTradingSessionRow", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "sellToOpenTradingSessionRow", "Lkotlinx/collections/immutable/ImmutableList;", "getRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "rowStates", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getAccountSwitcherState", "()Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "accountSwitcherState", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "getTradingHourVisualizerArgs", "()Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "tradingHourVisualizerArgs", "getNasdaqPrefix", "()Ljava/lang/Integer;", "nasdaqPrefix", "getFtuxTooltip", "ftuxTooltip", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "orderConfiguration", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class LimitStandard implements ILimit {
    public static final int $stable = 8;
    private final EquityOrderFormRowState.DropdownEdit accountRow;
    private final StringResource actionOrderTypeHeaderLabel;
    private final Function2<Composer, Integer, AnnotatedString> bidAskString;
    private final EquityAdvancedOrderDataState.CommonState commonState;
    private final EquityOrderFormRowState.Empty emptyRow;
    private final EquityOrderFormRowState.EditableValue limitPriceRow;
    private final ILimit.LimitState limitState;
    private final EquityOrderFormRowState.DropdownEdit marketSessionRow;
    private final EquityOrderFormRowState.EditableValue numberOfSharesRow;
    private final EquityOrderFormRowState.HeaderSubtitle subtitleRow;
    private final EquityOrderFormRowState.DropdownEdit timeInForceRow;
    private final EquityOrderFormRowState.HeaderTitle titleRow;
    private final EquityOrderFormRowState.DropdownEdit tradingSessionSettingsRow;

    /* compiled from: LimitStandard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OrderMarketHours.values().length];
            try {
                iArr[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderTimeInForce.values().length];
            try {
                iArr2[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EquityOrderSide.values().length];
            try {
                iArr3[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static /* synthetic */ LimitStandard copy$default(LimitStandard limitStandard, EquityAdvancedOrderDataState.CommonState commonState, ILimit.LimitState limitState, int i, Object obj) {
        if ((i & 1) != 0) {
            commonState = limitStandard.commonState;
        }
        if ((i & 2) != 0) {
            limitState = limitStandard.limitState;
        }
        return limitStandard.copy(commonState, limitState);
    }

    /* renamed from: component1, reason: from getter */
    public final EquityAdvancedOrderDataState.CommonState getCommonState() {
        return this.commonState;
    }

    /* renamed from: component2, reason: from getter */
    public final ILimit.LimitState getLimitState() {
        return this.limitState;
    }

    public final LimitStandard copy(EquityAdvancedOrderDataState.CommonState commonState, ILimit.LimitState limitState) {
        Intrinsics.checkNotNullParameter(commonState, "commonState");
        Intrinsics.checkNotNullParameter(limitState, "limitState");
        return new LimitStandard(commonState, limitState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitStandard)) {
            return false;
        }
        LimitStandard limitStandard = (LimitStandard) other;
        return Intrinsics.areEqual(this.commonState, limitStandard.commonState) && Intrinsics.areEqual(this.limitState, limitStandard.limitState);
    }

    public int hashCode() {
        return (this.commonState.hashCode() * 31) + this.limitState.hashCode();
    }

    public String toString() {
        return "LimitStandard(commonState=" + this.commonState + ", limitState=" + this.limitState + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public LimitStandard(EquityAdvancedOrderDataState.CommonState commonState, ILimit.LimitState limitState) {
        DisplayName displayName;
        DisplayName.Variants variants;
        Intrinsics.checkNotNullParameter(commonState, "commonState");
        Intrinsics.checkNotNullParameter(limitState, "limitState");
        this.commonState = commonState;
        this.limitState = limitState;
        StringResource.Companion companion = StringResource.INSTANCE;
        this.actionOrderTypeHeaderLabel = companion.invoke(C29312R.string.order_type_limit_title, new Object[0]);
        this.bidAskString = new Function2<Composer, Integer, AnnotatedString>() { // from class: com.robinhood.android.equityadvancedorder.datastate.LimitStandard$bidAskString$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ AnnotatedString invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }

            public final AnnotatedString invoke(Composer composer, int i) {
                long jM21426getFg20d7_KjU;
                String str;
                String str2;
                composer.startReplaceGroup(672205982);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(672205982, i, -1, "com.robinhood.android.equityadvancedorder.datastate.LimitStandard.bidAskString.<anonymous> (LimitStandard.kt:63)");
                }
                LimitStandard limitStandard = this.this$0;
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                SpanStyle spanStyle = new SpanStyle(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null);
                FontWeight bold = FontWeight.INSTANCE.getBold();
                if (limitStandard.getCommonState().getEditMode() == EquityOrderConfiguration2.SIMPLE) {
                    composer.startReplaceGroup(1496929171);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1496994674);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                    composer.endReplaceGroup();
                }
                SpanStyle spanStyle2 = new SpanStyle(jM21426getFg20d7_KjU, 0L, bold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null);
                composer.startReplaceGroup(1744867792);
                int iPushStyle = builder.pushStyle(spanStyle);
                try {
                    Integer nasdaqPrefix = limitStandard.getNasdaqPrefix();
                    composer.startReplaceGroup(1744869381);
                    if (nasdaqPrefix != null) {
                        builder.append(StringResources_androidKt.stringResource(nasdaqPrefix.intValue(), composer, 0));
                    }
                    composer.endReplaceGroup();
                    builder.append(StringResources_androidKt.stringResource(C15237R.string.order_create_limit_price_row_subtitle_bid_label, composer, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composer.endReplaceGroup();
                    iPushStyle = builder.pushStyle(spanStyle2);
                    try {
                        BigDecimal bidPrice = limitStandard.getBidPrice();
                        String str3 = "-";
                        if (bidPrice == null || (str = Formats.getCurrencyFormat().format(bidPrice)) == null) {
                            str = "-";
                        }
                        builder.append(str);
                        builder.pop(iPushStyle);
                        composer.startReplaceGroup(1744880362);
                        iPushStyle = builder.pushStyle(spanStyle);
                        try {
                            builder.append(StringResources_androidKt.stringResource(C15237R.string.order_create_limit_price_row_subtitle_ask_label, composer, 0));
                            builder.pop(iPushStyle);
                            composer.endReplaceGroup();
                            iPushStyle = builder.pushStyle(spanStyle2);
                            try {
                                BigDecimal askPrice = limitStandard.getAskPrice();
                                if (askPrice != null && (str2 = Formats.getCurrencyFormat().format(askPrice)) != null) {
                                    str3 = str2;
                                }
                                builder.append(str3);
                                builder.pop(iPushStyle);
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer.endReplaceGroup();
                                return annotatedString;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
        };
        StringResource titleStringResource = getTitleStringResource();
        EquityOrderFormRowState.DropdownEdit dropdownEdit = 0;
        dropdownEdit = 0;
        dropdownEdit = 0;
        this.titleRow = titleStringResource != null ? new EquityOrderFormRowState.HeaderTitle(titleStringResource) : null;
        StringResource subtitleStringResource = getSubtitleStringResource();
        this.subtitleRow = subtitleStringResource != null ? new EquityOrderFormRowState.HeaderSubtitle(subtitleStringResource) : null;
        this.emptyRow = new EquityOrderFormRowState.Empty(C2002Dp.m7995constructorimpl(16), dropdownEdit);
        StringResource stringResourceInvoke = companion.invoke(C15237R.string.order_create_number_of_shares_row_title, new Object[0]);
        EquityAdvancedOrderDataState.CommonState commonState2 = getCommonState();
        this.numberOfSharesRow = new EquityOrderFormRowState.EditableValue(EquityOrderFormRowState2.NumberOfSharesRowTestTag, stringResourceInvoke, false, EditingField.NUMBER_OF_WHOLE_SHARES, getCommonState().getOrderFormState(), commonState2.getNumberOfSharesString() != null ? companion.invoke(commonState2.getNumberOfSharesString()) : null, companion.invoke(C15237R.string.order_create_default_number_of_share, new Object[0]), null, EquityAdvancedOrderDataState2.SHARE_QUANTITY_FIELD_ID, null, null, BentoNumpadTextInputFormatters3.INSTANCE, null, null, 13956, null);
        StringResource stringResourceInvoke2 = companion.invoke(C15237R.string.order_create_limit_price_row_title, new Object[0]);
        EquityOrderFormRowState.Icon icon = new EquityOrderFormRowState.Icon(ServerToBentoAssetMapper2.QUESTION_16, companion.invoke(C15237R.string.order_create_limit_price_row_info, new Object[0]), EquityOrderFormRowState.Icon.IconId.MARKET_DATA);
        String limitPriceString = getLimitPriceString();
        StringResource stringResourceInvoke3 = limitPriceString != null ? companion.invoke(C15237R.string.dollar_sign_format, limitPriceString) : null;
        String defaultLimitPriceString = getDefaultLimitPriceString();
        this.limitPriceRow = new EquityOrderFormRowState.EditableValue(EquityOrderFormRowState2.LimitPriceRowTestTag, stringResourceInvoke2, false, EditingField.LIMIT_PRICE, getCommonState().getOrderFormState(), stringResourceInvoke3, defaultLimitPriceString != null ? companion.invoke(defaultLimitPriceString) : null, icon, LimitStandard3.getLIMIT_STANDARD_TEXT_FIELD_ID_LIMIT_PRICE(), getBidAskString(), getFtuxTooltip(), new LimitPriceBentoNumpadTextInputFormatter(0, 0, 0, 0, 15, null), null, null, 12292, null);
        EquityOrderFormRowState.DropdownEdit dropdownEdit2 = new EquityOrderFormRowState.DropdownEdit(EquityOrderFormRowState2.MarketSessionRowTestTag, companion.invoke(C15237R.string.order_create_trading_session_row_title, new Object[0]), null, EditingField.TRADING_SESSION, getCommonState().getOrderFormState(), getTradingSessionDropdownEditRowValueText(), null, null, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, null);
        EquityOrderConfiguration2 editMode = getCommonState().getEditMode();
        EquityOrderConfiguration2 equityOrderConfiguration2 = EquityOrderConfiguration2.DETAIL;
        this.marketSessionRow = editMode != equityOrderConfiguration2 ? null : dropdownEdit2;
        this.timeInForceRow = getCommonState().getEditMode() != equityOrderConfiguration2 ? null : new EquityOrderFormRowState.DropdownEdit(EquityOrderFormRowState2.TimeInForceRowTestTag, companion.invoke(C15237R.string.order_create_time_in_force_row_title, new Object[0]), null, EditingField.TIME_IN_FORCE, getCommonState().getOrderFormState(), getTimeInForceRowValueText(), null, null, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, null);
        StringResource stringResourceInvoke4 = companion.invoke(C15237R.string.order_create_account_row_title, new Object[0]);
        Account activeAccount = getActiveAccount();
        EquityOrderFormRowState.DropdownEdit dropdownEdit3 = new EquityOrderFormRowState.DropdownEdit(EquityOrderFormRowState2.AccountRowTestTag, stringResourceInvoke4, null, EditingField.ACCOUNT, getCommonState().getOrderFormState(), (activeAccount == null || (displayName = AccountDisplayNames.getDisplayName(activeAccount)) == null || (variants = displayName.getShort()) == null) ? null : variants.getTitle(), null, null, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, null);
        if (getUserHasMultipleAccounts() && getCommonState().getEditMode() == equityOrderConfiguration2 && !isCancelNewOrder()) {
            dropdownEdit = dropdownEdit3;
        }
        this.accountRow = dropdownEdit;
        this.tradingSessionSettingsRow = new EquityOrderFormRowState.DropdownEdit(EquityOrderFormRowState2.TradingSessionSettingsRowTestTag, companion.invoke(C15237R.string.order_create_trading_session_settings_row_title, new Object[0]), null, EditingField.TRADING_SESSION_SETTINGS, getCommonState().getOrderFormState(), getTradingSessionDropdownEditRowValueText(), null, getTradingSessionSettingsRowSecondaryValueText(), 68, null);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public Account getActiveAccount() {
        return ILimit.DefaultImpls.getActiveAccount(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public Boolean getAdtTradable() {
        return ILimit.DefaultImpls.getAdtTradable(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public BigDecimal getAskPrice() {
        return ILimit.DefaultImpls.getAskPrice(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public BigDecimal getBidPrice() {
        return ILimit.DefaultImpls.getBidPrice(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit, com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public ImmutableList<EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow> getBottomSheetRowStates(Boolean bool, Boolean bool2, boolean z) {
        return ILimit.DefaultImpls.getBottomSheetRowStates(this, bool, bool2, z);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityAdvancedOrderBottomSheetState getBottomSheetState(Boolean bool, Boolean bool2) {
        return ILimit.DefaultImpls.getBottomSheetState(this, bool, bool2);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getButtonEnabled() {
        return ILimit.DefaultImpls.getButtonEnabled(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getButtonLoading() {
        return ILimit.DefaultImpls.getButtonLoading(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public boolean getCanShowTooltip() {
        return ILimit.DefaultImpls.getCanShowTooltip(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public AdvancedOrder.LimitComplete getCompletedConfiguration() {
        return ILimit.DefaultImpls.getCompletedConfiguration(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public BigDecimal getDefaultLimitPrice() {
        return ILimit.DefaultImpls.getDefaultLimitPrice(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public String getDefaultLimitPriceString() {
        return ILimit.DefaultImpls.getDefaultLimitPriceString(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit, com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityOrderContext getEquityOrderContext() {
        return ILimit.DefaultImpls.getEquityOrderContext(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getEstimateRowTitle() {
        return ILimit.DefaultImpls.getEstimateRowTitle(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityOrderFormRowState getEstimatedCostRow() {
        return ILimit.DefaultImpls.getEstimatedCostRow(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getEstimatedCostString() {
        return ILimit.DefaultImpls.getEstimatedCostString(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public StringResource getGfdTitle() {
        return ILimit.DefaultImpls.getGfdTitle(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public StringResource getGtcTitle() {
        return ILimit.DefaultImpls.getGtcTitle(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public BigDecimal getLimitPrice() {
        return ILimit.DefaultImpls.getLimitPrice(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public String getLimitPriceString() {
        return ILimit.DefaultImpls.getLimitPriceString(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public BigDecimal getNumberOfShares() {
        return ILimit.DefaultImpls.getNumberOfShares(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getPrimaryButtonText() {
        return ILimit.DefaultImpls.getPrimaryButtonText(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public OrderRequest2 getQuantityOrAmount() {
        return ILimit.DefaultImpls.getQuantityOrAmount(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getShouldShowBackupWithholdingWarning() {
        return ILimit.DefaultImpls.getShouldShowBackupWithholdingWarning(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public boolean getShowOrderTypeSelectionRow() {
        return ILimit.DefaultImpls.getShowOrderTypeSelectionRow(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit, com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getShowTextButton() {
        return ILimit.DefaultImpls.getShowTextButton(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityOrderRequestInputs.StaticInputs getStaticInputs() {
        return ILimit.DefaultImpls.getStaticInputs(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getSubtitleStringResource() {
        return ILimit.DefaultImpls.getSubtitleStringResource(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getTitleStringResource() {
        return ILimit.DefaultImpls.getTitleStringResource(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public boolean getTooltipWillBeShown() {
        return ILimit.DefaultImpls.getTooltipWillBeShown(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getUserHasMultipleAccounts() {
        return ILimit.DefaultImpls.getUserHasMultipleAccounts(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public AdvancedOrder.LimitNew getWorkingConfiguration() {
        return ILimit.DefaultImpls.getWorkingConfiguration(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean isCancelNewOrder() {
        return ILimit.DefaultImpls.isCancelNewOrder(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean isShortPosition() {
        return ILimit.DefaultImpls.isShortPosition(this);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public EquityAdvancedOrderDataState.CommonState getCommonState() {
        return this.commonState;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public ILimit.LimitState getLimitState() {
        return this.limitState;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public boolean getReadyToAdvanceToDetailEdit() {
        BigDecimal numberOfShares = getNumberOfShares();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return numberOfShares.compareTo(bigDecimal) > 0 && getLimitPrice().compareTo(bigDecimal) > 0;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public StringResource getActionOrderTypeHeaderLabel() {
        return this.actionOrderTypeHeaderLabel;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public Function2<Composer, Integer, AnnotatedString> getBidAskString() {
        return this.bidAskString;
    }

    public final EquityOrderFormRowState.HeaderTitle getTitleRow() {
        return this.titleRow;
    }

    public final EquityOrderFormRowState.HeaderSubtitle getSubtitleRow() {
        return this.subtitleRow;
    }

    public final EquityOrderFormRowState.Empty getEmptyRow() {
        return this.emptyRow;
    }

    public final EquityOrderFormRowState.EditableValue getNumberOfSharesRow() {
        return this.numberOfSharesRow;
    }

    public final EquityOrderFormRowState.EditableValue getLimitPriceRow() {
        return this.limitPriceRow;
    }

    public final EquityOrderFormRowState.DropdownEdit getMarketSessionRow() {
        return this.marketSessionRow;
    }

    public final EquityOrderFormRowState.DropdownEdit getTimeInForceRow() {
        return this.timeInForceRow;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EquityOrderFormRowState.Information getSellToOpenTimeInForceRow() {
        MarketHours currentMarketHours;
        StringResource extendedHoursCloseTime;
        EquityOrderFormRowState.Information information;
        MarketHours currentMarketHours2;
        int i = WhenMappings.$EnumSwitchMapping$0[getLimitState().getTradingSession().ordinal()];
        if (i == 1) {
            TradingSession tradingSession = getCommonState().getTradingSession();
            if (tradingSession != null && (currentMarketHours = tradingSession.getCurrentMarketHours()) != null) {
                extendedHoursCloseTime = MarketHours3.getExtendedHoursCloseTime(currentMarketHours);
            }
        } else {
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5) {
                    throw new IllegalStateException("Unsupported trading session");
                }
                throw new NoWhenBranchMatchedException();
            }
            TradingSession tradingSession2 = getCommonState().getTradingSession();
            extendedHoursCloseTime = (tradingSession2 == null || (currentMarketHours2 = tradingSession2.getCurrentMarketHours()) == null) ? null : MarketHours3.getRegularHoursCloseTime(currentMarketHours2);
        }
        if (extendedHoursCloseTime != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            information = new EquityOrderFormRowState.Information(EquityOrderFormRowState2.TimeInForceRowTestTag, companion.invoke(C15237R.string.order_create_time_in_force_row_title, new Object[0]), new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{extendedHoursCloseTime, companion.invoke(C15237R.string.order_create_time_in_force_row_suffix_sell_to_open, new Object[0])}), PlaceholderUtils.XXShortPlaceholderText), null, false, null, null, false, true, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        } else {
            information = null;
        }
        if (getCommonState().getEditMode() == EquityOrderConfiguration2.DETAIL) {
            return information;
        }
        return null;
    }

    public final EquityOrderFormRowState.DropdownEdit getAccountRow() {
        return this.accountRow;
    }

    public final EquityOrderFormRowState.DropdownEdit getTradingSessionSettingsRow() {
        return this.tradingSessionSettingsRow;
    }

    public final EquityOrderFormRowState getSellToOpenTradingSessionRow() {
        EquityOrderFormRowState information;
        TradingSession tradingSession = getCommonState().getTradingSession();
        if (tradingSession == null || !TradingSession2.allowsRegularHoursShorting(tradingSession) || !TradingSession2.allowsExtendedHoursShorting(getCommonState().getTradingSession())) {
            StringResource.Companion companion = StringResource.INSTANCE;
            information = new EquityOrderFormRowState.Information(EquityOrderFormRowState2.SellToOpenTradingSessionSettingsRowTestTag, companion.invoke(C15237R.string.order_create_trading_session_row_title, new Object[0]), companion.invoke(C15237R.string.order_create_bottom_sheet_extended_hours_row_title, new Object[0]), null, false, null, null, false, true, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        } else {
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C15237R.string.order_create_trading_session_row_title, new Object[0]);
            StringResource tradingSessionDropdownEditRowValueText = getTradingSessionDropdownEditRowValueText();
            information = new EquityOrderFormRowState.DropdownEdit(EquityOrderFormRowState2.SellToOpenTradingSessionSettingsRowTestTag, stringResourceInvoke, null, EditingField.TRADING_SESSION, getCommonState().getOrderFormState(), tradingSessionDropdownEditRowValueText, null, null, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, null);
        }
        if (getCommonState().getEditMode() == EquityOrderConfiguration2.DETAIL) {
            return information;
        }
        return null;
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public ImmutableList<EquityOrderFormRowState> getRowStates() {
        List listListOfNotNull;
        if (getCommonState().getSide() == EquityOrderSide.SELL_SHORT) {
            EquityOrderFormRowState.HeaderTitle headerTitle = this.titleRow;
            EquityOrderFormRowState.HeaderSubtitle headerSubtitle = this.subtitleRow;
            if (getCommonState().getAccountsWithAccessToMargin().size() != 1) {
                headerSubtitle = null;
            }
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new EquityOrderFormRowState[]{headerTitle, headerSubtitle, this.emptyRow, getCommonState().getAdvancedMarketOrdersEnabled() ? EquityAdvancedOrderDataState2.getOrderTypeSelectionRow(this) : null, this.numberOfSharesRow, this.limitPriceRow, getSellToOpenTradingSessionRow(), getSellToOpenTimeInForceRow(), this.accountRow, getEstimatedCostRow()});
        } else {
            listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new EquityOrderFormRowState[]{this.titleRow, this.subtitleRow, this.emptyRow, getCommonState().getAdvancedMarketOrdersEnabled() ? EquityAdvancedOrderDataState2.getOrderTypeSelectionRow(this) : null, this.numberOfSharesRow, this.limitPriceRow, this.marketSessionRow, this.timeInForceRow, this.accountRow, getEstimatedCostRow()});
        }
        return extensions2.toImmutableList(listListOfNotNull);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public InstrumentAccountSwitcherState getAccountSwitcherState() {
        EquityAdvancedOrderDataState.CommonState commonState = getCommonState();
        return InstrumentAccountSwitcherUtils.INSTANCE.makeAccountSwitcherState(commonState.getAccountSwitcher(), commonState.getAllAccounts(), isCancelNewOrder(), commonState.getSide(), commonState.getPositionEffect(), commonState.getAccountNumber(), commonState.getLoadingAccountSwitcher(), commonState.getUseSduiAccountSwitcher());
    }

    private final StringResource getTradingSessionDropdownEditRowValueText() {
        int i = WhenMappings.$EnumSwitchMapping$0[getLimitState().getTradingSession().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C15237R.string.order_create_bottom_sheet_market_hours_row_title, new Object[0]);
            }
            if (i == 3) {
                return StringResource.INSTANCE.invoke(C15237R.string.order_create_bottom_sheet_all_day_hours_row_title, new Object[0]);
            }
            if (i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Index options curb hours is not supported for equities");
            }
        }
        return StringResource.INSTANCE.invoke(C15237R.string.order_create_bottom_sheet_extended_hours_row_title, new Object[0]);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState
    public SetTradingHourVisualizerArgs getTradingHourVisualizerArgs() {
        EquityAdvancedOrderDataState.CommonState commonState = getCommonState();
        if (commonState.getEditingField() != EditingField.TRADING_SESSION && commonState.getEditingField() != EditingField.TRADING_SESSION_SETTINGS) {
            return null;
        }
        OrderTradingSessionVisualizerUtil orderTradingSessionVisualizerUtil = OrderTradingSessionVisualizerUtil.INSTANCE;
        OrderMarketHours tradingSession = getLimitState().getTradingSession();
        TradingSession tradingSession2 = commonState.getTradingSession();
        return orderTradingSessionVisualizerUtil.getVisualizerArg(tradingSession, tradingSession2 != null ? tradingSession2.getCurrentMarketHours() : null);
    }

    @Override // com.robinhood.android.equityadvancedorder.datastate.ILimit
    public Integer getNasdaqPrefix() {
        EquityAdvancedOrderDataState.CommonState commonState = getCommonState();
        Quote quote = commonState.getQuote();
        if (quote != null && MarketDataDisclosureDataState2.isAskNasdaq(quote) && MarketDataDisclosureDataState2.isBidNasdaq(commonState.getQuote())) {
            return Integer.valueOf(C15237R.string.order_create_limit_price_row_subtitle_nasdaq_prefix);
        }
        return null;
    }

    private final StringResource getTradingSessionSettingsRowSecondaryValueText() {
        StringResource timeInForceRowValueText = getTimeInForceRowValueText();
        if (timeInForceRowValueText != null) {
            return new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{StringResource.INSTANCE.invoke(C15237R.string.order_create_trading_session_settings_row_secondary_value_prefix, new Object[0]), timeInForceRowValueText}), PlaceholderUtils.XXShortPlaceholderText);
        }
        return null;
    }

    private final StringResource getTimeInForceRowValueText() {
        int i = WhenMappings.$EnumSwitchMapping$1[getLimitState().getTimeInForce().ordinal()];
        if (i == 1) {
            return getGfdTitle();
        }
        if (i != 2) {
            return null;
        }
        return getGtcTitle();
    }

    public final StringResource getFtuxTooltip() {
        int i;
        if (!getTooltipWillBeShown()) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$2[getCommonState().getSide().ordinal()];
        if (i2 == 1) {
            i = C15237R.string.ftux_tooltip_buy;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Not implemented yet");
            }
            i = C15237R.string.ftux_tooltip_sell;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final Order.Configuration getOrderConfiguration() {
        return Order.Configuration.LIMIT;
    }
}
