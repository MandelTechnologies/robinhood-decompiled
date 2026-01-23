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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.equities.taxlots.taxlotsmodelsapi.TaxLotSelectionType;
import com.robinhood.android.equities.taxlots.utils.TaxLotsSharesBentoNumpadTextInputFormatter;
import com.robinhood.android.equities.taxlots.utils.TaxLotsStringsHelper;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import equity_trading_tax_lots.proto.p460v1.AvailableSelectionStrategyOption;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategySummary;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategySummaryResponse;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ITaxLots.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\nJ!\u0010\u0006\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\b\tH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots;", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;", "taxLotsState", "Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;", "getTaxLotsState", "()Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;", "mutateTaxLots", "mutator", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "TaxLotsState", "Lcom/robinhood/android/equityadvancedorder/datastate/LimitTaxLots;", "Lcom/robinhood/android/equityadvancedorder/datastate/MarketTaxLots;", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface ITaxLots extends EquityAdvancedOrderDataState {
    TaxLotsState getTaxLotsState();

    ITaxLots mutateTaxLots(Function1<? super TaxLotsState, TaxLotsState> mutator);

    /* compiled from: ITaxLots.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Account getActiveAccount(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getActiveAccount(iTaxLots);
        }

        public static Boolean getAdtTradable(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getAdtTradable(iTaxLots);
        }

        public static EquityAdvancedOrderBottomSheetState getBottomSheetState(ITaxLots iTaxLots, Boolean bool, Boolean bool2) {
            return EquityAdvancedOrderDataState.DefaultImpls.getBottomSheetState(iTaxLots, bool, bool2);
        }

        public static boolean getButtonEnabled(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getButtonEnabled(iTaxLots);
        }

        public static boolean getButtonLoading(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getButtonLoading(iTaxLots);
        }

        public static StringResource getEstimateRowTitle(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getEstimateRowTitle(iTaxLots);
        }

        public static EquityOrderFormRowState getEstimatedCostRow(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getEstimatedCostRow(iTaxLots);
        }

        public static StringResource getEstimatedCostString(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getEstimatedCostString(iTaxLots);
        }

        public static BigDecimal getNumberOfShares(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getNumberOfShares(iTaxLots);
        }

        public static StringResource getPrimaryButtonText(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getPrimaryButtonText(iTaxLots);
        }

        public static OrderRequest2 getQuantityOrAmount(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getQuantityOrAmount(iTaxLots);
        }

        public static boolean getShouldShowBackupWithholdingWarning(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getShouldShowBackupWithholdingWarning(iTaxLots);
        }

        public static EquityOrderRequestInputs.StaticInputs getStaticInputs(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getStaticInputs(iTaxLots);
        }

        public static StringResource getSubtitleStringResource(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getSubtitleStringResource(iTaxLots);
        }

        public static StringResource getTitleStringResource(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getTitleStringResource(iTaxLots);
        }

        public static boolean getUserHasMultipleAccounts(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.getUserHasMultipleAccounts(iTaxLots);
        }

        public static boolean isCancelNewOrder(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.isCancelNewOrder(iTaxLots);
        }

        public static boolean isShortPosition(ITaxLots iTaxLots) {
            return EquityAdvancedOrderDataState.DefaultImpls.isShortPosition(iTaxLots);
        }

        public static ITaxLots mutateTaxLots(ITaxLots iTaxLots, Function1<? super TaxLotsState, TaxLotsState> mutator) {
            Intrinsics.checkNotNullParameter(mutator, "mutator");
            if (iTaxLots instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) iTaxLots;
                return MarketTaxLots.copy$default(marketTaxLots, null, mutator.invoke(marketTaxLots.getTaxLotsState()), 1, null);
            }
            if (!(iTaxLots instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) iTaxLots;
            return LimitTaxLots.copy$default(limitTaxLots, null, mutator.invoke(limitTaxLots.getTaxLotsState()), 1, null);
        }
    }

    /* compiled from: ITaxLots.kt */
    @Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.J4\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001042\u0006\u0010-\u001a\u00020.2\u0006\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\bJ\u0010\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020\nJ\u0010\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020\u0011J\u0010\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u000204J\u001e\u0010>\u001a\b\u0012\u0004\u0012\u00020<0?2\u0006\u0010=\u001a\u0002042\b\u0010@\u001a\u0004\u0018\u000104J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ji\u0010I\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010J\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u000fHÖ\u0001J\t\u0010M\u001a\u000202HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/datastate/ITaxLots$TaxLotsState;", "", "taxLots", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "orderId", "Ljava/util/UUID;", "taxLotM1ExperimentMember", "", "availableSelectionStrategyOptions", "Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "userSelectedTaxLot", "taxLotsSelectionStrategySummary", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryResponse;", "maxNumberOfTaxLots", "", "currentSelectionStrategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "<init>", "(Ljava/util/List;Ljava/util/UUID;ZLjava/util/List;ZLequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryResponse;ILequity_trading_tax_lots/proto/v1/SelectionStrategy;)V", "getTaxLots", "()Ljava/util/List;", "getOrderId", "()Ljava/util/UUID;", "getTaxLotM1ExperimentMember", "()Z", "getAvailableSelectionStrategyOptions", "getUserSelectedTaxLot", "getTaxLotsSelectionStrategySummary", "()Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryResponse;", "getMaxNumberOfTaxLots", "()I", "getCurrentSelectionStrategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "currentSelectionStrategyAvailableOption", "getCurrentSelectionStrategyAvailableOption", "()Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "defaultSelectionStrategyOption", "getDefaultSelectionStrategyOption", "taxLotSelectionTypeForBrokeback", "Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "getTaxLotSelectionTypeForBrokeback", "()Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "getStrategyRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$DropdownEdit;", "orderFormState", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "getNumberOfSharesRow", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$EditableValue;", "numberOfSharesString", "", "sharesAvailable", "Ljava/math/BigDecimal;", "orderType", "Lcom/robinhood/models/db/OrderType;", "canSellFractional", "getStrategySummary", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "selectionStrategy", "getCustomStrategyRow", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState$BottomSheetRowState$BaseRow;", "numShares", "getStrategyRowStates", "Lkotlinx/collections/immutable/ImmutableList;", "maxShares", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class TaxLotsState {
        public static final int $stable = 8;
        private final List<AvailableSelectionStrategyOption> availableSelectionStrategyOptions;
        private final SelectionStrategy currentSelectionStrategy;
        private final int maxNumberOfTaxLots;
        private final UUID orderId;
        private final boolean taxLotM1ExperimentMember;
        private final List<TaxLotSelection> taxLots;
        private final StreamTaxLotsSelectionStrategySummaryResponse taxLotsSelectionStrategySummary;
        private final boolean userSelectedTaxLot;

        public static /* synthetic */ TaxLotsState copy$default(TaxLotsState taxLotsState, List list, UUID uuid, boolean z, List list2, boolean z2, StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse, int i, SelectionStrategy selectionStrategy, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = taxLotsState.taxLots;
            }
            if ((i2 & 2) != 0) {
                uuid = taxLotsState.orderId;
            }
            if ((i2 & 4) != 0) {
                z = taxLotsState.taxLotM1ExperimentMember;
            }
            if ((i2 & 8) != 0) {
                list2 = taxLotsState.availableSelectionStrategyOptions;
            }
            if ((i2 & 16) != 0) {
                z2 = taxLotsState.userSelectedTaxLot;
            }
            if ((i2 & 32) != 0) {
                streamTaxLotsSelectionStrategySummaryResponse = taxLotsState.taxLotsSelectionStrategySummary;
            }
            if ((i2 & 64) != 0) {
                i = taxLotsState.maxNumberOfTaxLots;
            }
            if ((i2 & 128) != 0) {
                selectionStrategy = taxLotsState.currentSelectionStrategy;
            }
            int i3 = i;
            SelectionStrategy selectionStrategy2 = selectionStrategy;
            boolean z3 = z2;
            StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse2 = streamTaxLotsSelectionStrategySummaryResponse;
            return taxLotsState.copy(list, uuid, z, list2, z3, streamTaxLotsSelectionStrategySummaryResponse2, i3, selectionStrategy2);
        }

        public final List<TaxLotSelection> component1() {
            return this.taxLots;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getOrderId() {
            return this.orderId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getTaxLotM1ExperimentMember() {
            return this.taxLotM1ExperimentMember;
        }

        public final List<AvailableSelectionStrategyOption> component4() {
            return this.availableSelectionStrategyOptions;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getUserSelectedTaxLot() {
            return this.userSelectedTaxLot;
        }

        /* renamed from: component6, reason: from getter */
        public final StreamTaxLotsSelectionStrategySummaryResponse getTaxLotsSelectionStrategySummary() {
            return this.taxLotsSelectionStrategySummary;
        }

        /* renamed from: component7, reason: from getter */
        public final int getMaxNumberOfTaxLots() {
            return this.maxNumberOfTaxLots;
        }

        /* renamed from: component8, reason: from getter */
        public final SelectionStrategy getCurrentSelectionStrategy() {
            return this.currentSelectionStrategy;
        }

        public final TaxLotsState copy(List<TaxLotSelection> taxLots, UUID orderId, boolean taxLotM1ExperimentMember, List<AvailableSelectionStrategyOption> availableSelectionStrategyOptions, boolean userSelectedTaxLot, StreamTaxLotsSelectionStrategySummaryResponse taxLotsSelectionStrategySummary, int maxNumberOfTaxLots, SelectionStrategy currentSelectionStrategy) {
            Intrinsics.checkNotNullParameter(taxLots, "taxLots");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(availableSelectionStrategyOptions, "availableSelectionStrategyOptions");
            return new TaxLotsState(taxLots, orderId, taxLotM1ExperimentMember, availableSelectionStrategyOptions, userSelectedTaxLot, taxLotsSelectionStrategySummary, maxNumberOfTaxLots, currentSelectionStrategy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TaxLotsState)) {
                return false;
            }
            TaxLotsState taxLotsState = (TaxLotsState) other;
            return Intrinsics.areEqual(this.taxLots, taxLotsState.taxLots) && Intrinsics.areEqual(this.orderId, taxLotsState.orderId) && this.taxLotM1ExperimentMember == taxLotsState.taxLotM1ExperimentMember && Intrinsics.areEqual(this.availableSelectionStrategyOptions, taxLotsState.availableSelectionStrategyOptions) && this.userSelectedTaxLot == taxLotsState.userSelectedTaxLot && Intrinsics.areEqual(this.taxLotsSelectionStrategySummary, taxLotsState.taxLotsSelectionStrategySummary) && this.maxNumberOfTaxLots == taxLotsState.maxNumberOfTaxLots && this.currentSelectionStrategy == taxLotsState.currentSelectionStrategy;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.taxLots.hashCode() * 31) + this.orderId.hashCode()) * 31) + Boolean.hashCode(this.taxLotM1ExperimentMember)) * 31) + this.availableSelectionStrategyOptions.hashCode()) * 31) + Boolean.hashCode(this.userSelectedTaxLot)) * 31;
            StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse = this.taxLotsSelectionStrategySummary;
            int iHashCode2 = (((iHashCode + (streamTaxLotsSelectionStrategySummaryResponse == null ? 0 : streamTaxLotsSelectionStrategySummaryResponse.hashCode())) * 31) + Integer.hashCode(this.maxNumberOfTaxLots)) * 31;
            SelectionStrategy selectionStrategy = this.currentSelectionStrategy;
            return iHashCode2 + (selectionStrategy != null ? selectionStrategy.hashCode() : 0);
        }

        public String toString() {
            return "TaxLotsState(taxLots=" + this.taxLots + ", orderId=" + this.orderId + ", taxLotM1ExperimentMember=" + this.taxLotM1ExperimentMember + ", availableSelectionStrategyOptions=" + this.availableSelectionStrategyOptions + ", userSelectedTaxLot=" + this.userSelectedTaxLot + ", taxLotsSelectionStrategySummary=" + this.taxLotsSelectionStrategySummary + ", maxNumberOfTaxLots=" + this.maxNumberOfTaxLots + ", currentSelectionStrategy=" + this.currentSelectionStrategy + ")";
        }

        public TaxLotsState(List<TaxLotSelection> taxLots, UUID orderId, boolean z, List<AvailableSelectionStrategyOption> availableSelectionStrategyOptions, boolean z2, StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse, int i, SelectionStrategy selectionStrategy) {
            Intrinsics.checkNotNullParameter(taxLots, "taxLots");
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            Intrinsics.checkNotNullParameter(availableSelectionStrategyOptions, "availableSelectionStrategyOptions");
            this.taxLots = taxLots;
            this.orderId = orderId;
            this.taxLotM1ExperimentMember = z;
            this.availableSelectionStrategyOptions = availableSelectionStrategyOptions;
            this.userSelectedTaxLot = z2;
            this.taxLotsSelectionStrategySummary = streamTaxLotsSelectionStrategySummaryResponse;
            this.maxNumberOfTaxLots = i;
            this.currentSelectionStrategy = selectionStrategy;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ TaxLotsState(java.util.List r2, java.util.UUID r3, boolean r4, java.util.List r5, boolean r6, equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSelectionStrategySummaryResponse r7, int r8, equity_trading_tax_lots.proto.p460v1.SelectionStrategy r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r11 = r10 & 4
                r0 = 0
                if (r11 == 0) goto Le
                r4 = r0
            Le:
                r11 = r10 & 8
                if (r11 == 0) goto L16
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            L16:
                r11 = r10 & 16
                if (r11 == 0) goto L1b
                r6 = r0
            L1b:
                r11 = r10 & 32
                r0 = 0
                if (r11 == 0) goto L21
                r7 = r0
            L21:
                r11 = r10 & 64
                if (r11 == 0) goto L27
                r8 = 30
            L27:
                r10 = r10 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L35
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L3e
            L35:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L3e:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equityadvancedorder.datastate.ITaxLots.TaxLotsState.<init>(java.util.List, java.util.UUID, boolean, java.util.List, boolean, equity_trading_tax_lots.proto.v1.StreamTaxLotsSelectionStrategySummaryResponse, int, equity_trading_tax_lots.proto.v1.SelectionStrategy, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<TaxLotSelection> getTaxLots() {
            return this.taxLots;
        }

        public final UUID getOrderId() {
            return this.orderId;
        }

        public final boolean getTaxLotM1ExperimentMember() {
            return this.taxLotM1ExperimentMember;
        }

        public final List<AvailableSelectionStrategyOption> getAvailableSelectionStrategyOptions() {
            return this.availableSelectionStrategyOptions;
        }

        public final boolean getUserSelectedTaxLot() {
            return this.userSelectedTaxLot;
        }

        public final StreamTaxLotsSelectionStrategySummaryResponse getTaxLotsSelectionStrategySummary() {
            return this.taxLotsSelectionStrategySummary;
        }

        public final int getMaxNumberOfTaxLots() {
            return this.maxNumberOfTaxLots;
        }

        public final SelectionStrategy getCurrentSelectionStrategy() {
            return this.currentSelectionStrategy;
        }

        public final AvailableSelectionStrategyOption getCurrentSelectionStrategyAvailableOption() {
            Object next;
            Iterator<T> it = this.availableSelectionStrategyOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AvailableSelectionStrategyOption) next).getSelection_strategy() == this.currentSelectionStrategy) {
                    break;
                }
            }
            AvailableSelectionStrategyOption availableSelectionStrategyOption = (AvailableSelectionStrategyOption) next;
            return availableSelectionStrategyOption == null ? getDefaultSelectionStrategyOption() : availableSelectionStrategyOption;
        }

        public final AvailableSelectionStrategyOption getDefaultSelectionStrategyOption() {
            Object next;
            Iterator<T> it = this.availableSelectionStrategyOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AvailableSelectionStrategyOption) next).getSelection_strategy() == SelectionStrategy.SELECTION_STRATEGY_CUSTOM) {
                    break;
                }
            }
            return (AvailableSelectionStrategyOption) (this.taxLotM1ExperimentMember ? null : next);
        }

        public final TaxLotSelectionType getTaxLotSelectionTypeForBrokeback() {
            return TaxLotSelectionType.CUSTOM;
        }

        public final EquityOrderFormRowState.DropdownEdit getStrategyRow(OrderForm6 orderFormState) {
            String title;
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(C15237R.string.tax_lot_strategy_row_title, new Object[0]);
            EditingField editingField = EditingField.STRATEGY;
            AvailableSelectionStrategyOption currentSelectionStrategyAvailableOption = getCurrentSelectionStrategyAvailableOption();
            EquityOrderFormRowState.DropdownEdit dropdownEdit = new EquityOrderFormRowState.DropdownEdit(EquityOrderFormRowState2.StrategyRowTestTag, stringResourceInvoke, null, editingField, orderFormState, (currentSelectionStrategyAvailableOption == null || (title = currentSelectionStrategyAvailableOption.getTitle()) == null) ? null : companion.invoke(title), companion.invoke(C15237R.string.tax_lot_strategy_row_placeholder, new Object[0]), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, null);
            if (this.taxLotM1ExperimentMember) {
                return dropdownEdit;
            }
            return null;
        }

        public static /* synthetic */ EquityOrderFormRowState.EditableValue getNumberOfSharesRow$default(TaxLotsState taxLotsState, String str, BigDecimal bigDecimal, OrderForm6 orderForm6, OrderType orderType, boolean z, int i, Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            return taxLotsState.getNumberOfSharesRow(str, bigDecimal, orderForm6, orderType, z);
        }

        public final EquityOrderFormRowState.EditableValue getNumberOfSharesRow(String numberOfSharesString, final BigDecimal sharesAvailable, OrderForm6 orderFormState, OrderType orderType, boolean canSellFractional) {
            EditingField editingField;
            Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(C15237R.string.order_create_number_of_shares_row_title, new Object[0]);
            Function2<Composer, Integer, AnnotatedString> function2 = null;
            StringResource stringResourceInvoke2 = numberOfSharesString != null ? companion.invoke(numberOfSharesString) : null;
            StringResource stringResourceInvoke3 = companion.invoke(C15237R.string.order_create_default_number_of_share, new Object[0]);
            if (orderType == OrderType.MARKET && canSellFractional) {
                editingField = EditingField.NUMBER_OF_FRACTIONAL_SHARES;
            } else {
                editingField = EditingField.NUMBER_OF_WHOLE_SHARES;
            }
            EditingField editingField2 = editingField;
            TaxLotsSharesBentoNumpadTextInputFormatter taxLotsSharesBentoNumpadTextInputFormatter = TaxLotsSharesBentoNumpadTextInputFormatter.INSTANCE;
            EquityOrderFormRowState.Icon icon = new EquityOrderFormRowState.Icon(ServerToBentoAssetMapper2.TRIANGLE_ALERT_16, null, EquityOrderFormRowState.Icon.IconId.NONE);
            if (sharesAvailable != null) {
                if (BigDecimals7.orZero(numberOfSharesString != null ? StringsKt.toBigDecimalOrNull(numberOfSharesString) : null).compareTo(sharesAvailable) > 0) {
                    function2 = new Function2<Composer, Integer, AnnotatedString>() { // from class: com.robinhood.android.equityadvancedorder.datastate.ITaxLots$TaxLotsState$getNumberOfSharesRow$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ AnnotatedString invoke(Composer composer, Integer num) {
                            return invoke(composer, num.intValue());
                        }

                        public final AnnotatedString invoke(Composer composer, int i) {
                            composer.startReplaceGroup(-505106440);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-505106440, i, -1, "com.robinhood.android.equityadvancedorder.datastate.ITaxLots.TaxLotsState.getNumberOfSharesRow.<anonymous> (ITaxLots.kt:127)");
                            }
                            BigDecimal bigDecimal = sharesAvailable;
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            composer.startReplaceGroup(-75981460);
                            int iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                            try {
                                int i2 = C15237R.string.tax_lots_number_of_shares_row_maximum_error_text;
                                String sharesQuantityText = InitialDataStateHelper2.toSharesQuantityText(bigDecimal);
                                if (sharesQuantityText == null) {
                                    sharesQuantityText = "";
                                }
                                builder.append(StringResources_androidKt.stringResource(i2, new Object[]{sharesQuantityText}, composer, 0));
                                Unit unit = Unit.INSTANCE;
                                builder.pop(iPushStyle);
                                composer.endReplaceGroup();
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer.endReplaceGroup();
                                return annotatedString;
                            } catch (Throwable th) {
                                builder.pop(iPushStyle);
                                throw th;
                            }
                        }
                    };
                }
            }
            return new EquityOrderFormRowState.EditableValue(EquityOrderFormRowState2.NumberOfSharesRowTestTag, stringResourceInvoke, false, editingField2, orderFormState, stringResourceInvoke2, stringResourceInvoke3, null, EquityAdvancedOrderDataState2.SHARE_QUANTITY_FIELD_ID, new Function2<Composer, Integer, AnnotatedString>() { // from class: com.robinhood.android.equityadvancedorder.datastate.ITaxLots$TaxLotsState$getNumberOfSharesRow$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ AnnotatedString invoke(Composer composer, Integer num) {
                    return invoke(composer, num.intValue());
                }

                public final AnnotatedString invoke(Composer composer, int i) {
                    composer.startReplaceGroup(18630369);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(18630369, i, -1, "com.robinhood.android.equityadvancedorder.datastate.ITaxLots.TaxLotsState.getNumberOfSharesRow.<anonymous> (ITaxLots.kt:102)");
                    }
                    BigDecimal bigDecimal = sharesAvailable;
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    composer.startReplaceGroup(723918147);
                    if (bigDecimal != null) {
                        int iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                        try {
                            int i2 = C15237R.string.tax_lots_number_of_shares_row_secondary_text;
                            String sharesQuantityText = InitialDataStateHelper2.toSharesQuantityText(bigDecimal);
                            if (sharesQuantityText == null) {
                                sharesQuantityText = "";
                            }
                            builder.append(StringResources_androidKt.stringResource(i2, new Object[]{sharesQuantityText}, composer, 0));
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                        } catch (Throwable th) {
                            builder.pop(iPushStyle);
                            throw th;
                        }
                    }
                    composer.endReplaceGroup();
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return annotatedString;
                }
            }, null, taxLotsSharesBentoNumpadTextInputFormatter, function2, icon, 1156, null);
        }

        public final SelectionStrategySummary getStrategySummary(AvailableSelectionStrategyOption selectionStrategy) {
            List<SelectionStrategySummary> selection_strategies;
            Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
            StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse = this.taxLotsSelectionStrategySummary;
            Object obj = null;
            if (streamTaxLotsSelectionStrategySummaryResponse == null || (selection_strategies = streamTaxLotsSelectionStrategySummaryResponse.getSelection_strategies()) == null) {
                return null;
            }
            Iterator<T> it = selection_strategies.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SelectionStrategySummary) next).getSelection_strategy() == selectionStrategy.getSelection_strategy()) {
                    obj = next;
                    break;
                }
            }
            return (SelectionStrategySummary) obj;
        }

        public final SelectionStrategySummary getStrategySummary(SelectionStrategy selectionStrategy) {
            List<SelectionStrategySummary> selection_strategies;
            Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
            StreamTaxLotsSelectionStrategySummaryResponse streamTaxLotsSelectionStrategySummaryResponse = this.taxLotsSelectionStrategySummary;
            Object obj = null;
            if (streamTaxLotsSelectionStrategySummaryResponse == null || (selection_strategies = streamTaxLotsSelectionStrategySummaryResponse.getSelection_strategies()) == null) {
                return null;
            }
            Iterator<T> it = selection_strategies.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SelectionStrategySummary) next).getSelection_strategy() == selectionStrategy) {
                    obj = next;
                    break;
                }
            }
            return (SelectionStrategySummary) obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
        public final EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow getCustomStrategyRow(BigDecimal numShares) {
            AvailableSelectionStrategyOption next;
            Intrinsics.checkNotNullParameter(numShares, "numShares");
            Iterator it = this.availableSelectionStrategyOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                }
                next = it.next();
                if (((AvailableSelectionStrategyOption) next).getSelection_strategy() == SelectionStrategy.SELECTION_STRATEGY_CUSTOM) {
                    break;
                }
            }
            AvailableSelectionStrategyOption availableSelectionStrategyOption = next;
            if (availableSelectionStrategyOption == null) {
                return null;
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(availableSelectionStrategyOption.getTitle());
            TaxLotsStringsHelper taxLotsStringsHelper = TaxLotsStringsHelper.INSTANCE;
            SelectionStrategySummary strategySummary = getStrategySummary(availableSelectionStrategyOption);
            StringResource gainLossStringResource = taxLotsStringsHelper.getGainLossStringResource(numShares, strategySummary != null ? strategySummary.getEstimated_gain_loss() : null);
            if (gainLossStringResource == null) {
                gainLossStringResource = companion.invoke("");
            }
            EquityAdvancedOrderBottomSheetState.BottomSheetRowState.StrategyRow strategyRow = new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.StrategyRow(stringResourceInvoke, gainLossStringResource, true, true, EditingField.STRATEGY, false, false, availableSelectionStrategyOption, 96, null);
            if (this.userSelectedTaxLot) {
                AvailableSelectionStrategyOption currentSelectionStrategyAvailableOption = getCurrentSelectionStrategyAvailableOption();
                if ((currentSelectionStrategyAvailableOption != null ? currentSelectionStrategyAvailableOption.getSelection_strategy() : null) == SelectionStrategy.SELECTION_STRATEGY_CUSTOM) {
                    return strategyRow;
                }
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
        /* JADX WARN: Type inference failed for: r7v3, types: [com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState$BottomSheetRowState$StrategyRow] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ImmutableList<EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow> getStrategyRowStates(BigDecimal numShares, BigDecimal maxShares) {
            StringResource stringResourceInvoke;
            Intrinsics.checkNotNullParameter(numShares, "numShares");
            List<AvailableSelectionStrategyOption> list = this.availableSelectionStrategyOptions;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    return extensions2.toImmutableList(CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.filterNotNull(CollectionsKt.listOf((Object[]) new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseRow[]{getCustomStrategyRow(numShares), new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DisclaimerTextRow(StringResource.INSTANCE.invoke(C15237R.string.tax_lot_strategy_row_disclaimer, new Object[0])), new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.DoneButtonRow(null, 1, null)}))));
                }
                AvailableSelectionStrategyOption availableSelectionStrategyOption = (AvailableSelectionStrategyOption) it.next();
                SelectionStrategySummary strategySummary = getStrategySummary(availableSelectionStrategyOption);
                if (strategySummary != null || availableSelectionStrategyOption.getSelection_strategy() != SelectionStrategy.SELECTION_STRATEGY_CUSTOM) {
                    StringResource.Companion companion = StringResource.INSTANCE;
                    StringResource stringResourceInvoke2 = companion.invoke(availableSelectionStrategyOption.getTitle());
                    if (!Intrinsics.areEqual(numShares, BigDecimal.ZERO)) {
                        if ((strategySummary != null ? strategySummary.getFailure_reason() : null) == null && numShares.compareTo(BigDecimals7.orZero(maxShares)) <= 0) {
                            stringResourceInvoke = TaxLotsStringsHelper.INSTANCE.getGainLossStringResource(numShares, strategySummary != null ? strategySummary.getEstimated_gain_loss() : null);
                            if (stringResourceInvoke == null) {
                                stringResourceInvoke = companion.invoke(C15237R.string.tax_lots_selection_strategy_max_share_limit_subtitle, new Object[0]);
                            }
                        }
                        strategyRow = new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.StrategyRow(stringResourceInvoke2, stringResourceInvoke, Intrinsics.areEqual(availableSelectionStrategyOption, getCurrentSelectionStrategyAvailableOption()), true, EditingField.STRATEGY, false, false, availableSelectionStrategyOption, 64, null);
                    } else {
                        stringResourceInvoke = companion.invoke(C15237R.string.tax_lots_selection_strategy_max_share_limit_subtitle, new Object[0]);
                        strategyRow = new EquityAdvancedOrderBottomSheetState.BottomSheetRowState.StrategyRow(stringResourceInvoke2, stringResourceInvoke, Intrinsics.areEqual(availableSelectionStrategyOption, getCurrentSelectionStrategyAvailableOption()), true, EditingField.STRATEGY, false, false, availableSelectionStrategyOption, 64, null);
                    }
                }
                if (strategyRow != null) {
                    arrayList.add(strategyRow);
                }
            }
        }
    }
}
