package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import android.content.res.Resources;
import androidx.compose.p011ui.state.ToggleableState;
import cbc.service.p048v1.TermTypeDto;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.taxLots.TaxLotCell;
import com.robinhood.shared.taxLots.views.TaxLotDisplayCellState;
import com.robinhood.shared.taxLots.views.TaxLotTableHeaderCellState;
import com.robinhood.shared.taxLots.views.TaxLotTableInputCellState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.extensions.TermTypeDtos2;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.CryptoTaxLotSelectionTapAction;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotViewModelsResponseDto;
import nummus.p512v1.SortDirectionDto;
import nummus.p512v1.TaxLotSortTypeDto;

/* compiled from: StreamTaxLotViewModelsResponseDtos.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000\u001a,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000\u001a$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000\u001a,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000\"\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001d"}, m3636d2 = {"headerCell", "Lcom/robinhood/shared/taxLots/TaxLotCell$HeaderCell;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionTapAction;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto;", "getHeaderCell", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto;)Lcom/robinhood/shared/taxLots/TaxLotCell$HeaderCell;", "availableQuantityCell", "Lcom/robinhood/shared/taxLots/TaxLotCell$DisplayCell;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "assetCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "disabledContentDto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;", "costPerUnitCell", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "quoteCurrencyForPrice", "resources", "Landroid/content/res/Resources;", "dateCell", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", "gainLossCell", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "quoteCurrency", "inputCell", "Lcom/robinhood/shared/taxLots/TaxLotCell$InputCell;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "id", "", "focusedInputTaxLotId", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.StreamTaxLotViewModelsResponseDtosKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class StreamTaxLotViewModelsResponseDtos {

    /* compiled from: StreamTaxLotViewModelsResponseDtos.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.StreamTaxLotViewModelsResponseDtosKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SortDirectionDto.values().length];
            try {
                iArr[SortDirectionDto.SORT_DIRECTION_ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortDirectionDto.SORT_DIRECTION_DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TermTypeDto.values().length];
            try {
                iArr2[TermTypeDto.TERM_TYPE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.CheckStateDto.values().length];
            try {
                iArr3[StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.CheckStateDto.CHECK_STATE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.CheckStateDto.CHECK_STATE_UNCHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.CheckStateDto.CHECK_STATE_HALF_CHECKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.CheckStateDto.CHECK_STATE_CHECKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final TaxLotCell.HeaderCell<CryptoTaxLotSelectionTapAction> getHeaderCell(StreamTaxLotViewModelsResponseDto.HeaderDto headerDto) {
        String display_name;
        StreamTaxLotViewModelsResponseDto.HeaderDto.SortableDto value;
        TaxLotSortTypeDto sort_type;
        Intrinsics.checkNotNullParameter(headerDto, "<this>");
        StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto type2 = headerDto.getType();
        TaxLotTableHeaderCellState.SortDirection sortDirection = null;
        StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable sortable = type2 instanceof StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable ? (StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable) type2 : null;
        String json_value = (sortable == null || (value = sortable.getValue()) == null || (sort_type = value.getSort_type()) == null) ? null : sort_type.getJson_value();
        StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto type3 = headerDto.getType();
        if (type3 instanceof StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.NonSortable) {
            display_name = ((StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.NonSortable) type3).getValue().getDisplay_name();
        } else {
            if (!(type3 instanceof StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable)) {
                if (type3 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unknown header type");
            }
            display_name = ((StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable) type3).getValue().getDisplay_name();
        }
        StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto type4 = headerDto.getType();
        if (type4 instanceof StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable) {
            SortDirectionDto sort_direction = ((StreamTaxLotViewModelsResponseDto.HeaderDto.TypeDto.Sortable) type4).getValue().getSort_direction();
            int i = sort_direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sort_direction.ordinal()];
            if (i == 1) {
                sortDirection = TaxLotTableHeaderCellState.SortDirection.ASCENDING;
            } else if (i == 2) {
                sortDirection = TaxLotTableHeaderCellState.SortDirection.DESCENDING;
            }
        }
        return new TaxLotCell.HeaderCell<>(new TaxLotTableHeaderCellState(json_value, display_name, sortDirection));
    }

    public static final TaxLotCell.DisplayCell<CryptoTaxLotSelectionTapAction> availableQuantityCell(StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.AvailableQuantityDto availableQuantityDto, Currency assetCurrency, StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto disabledContentDto) {
        StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto.DismissableAlertDto dismissable_alert;
        Intrinsics.checkNotNullParameter(availableQuantityDto, "<this>");
        Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
        BigDecimal bigDecimalOrThrow = availableQuantityDto.getAvailable_quantity().toBigDecimalOrThrow();
        return new TaxLotCell.DisplayCell<>(new TaxLotDisplayCellState(new TaxLotDisplayCellState.TextContent(CurrencyDefinitions.formatCurrency$default(assetCurrency, bigDecimalOrThrow, false, false, null, 0, Integer.valueOf(bigDecimalOrThrow.scale()), null, false, false, false, false, 2012, null), null, null, 6, null), null, TaxLotDisplayCellState.ContentAlignment.END, (disabledContentDto == null || (dismissable_alert = disabledContentDto.getDismissable_alert()) == null) ? null : new CryptoTaxLotSelectionTapAction.ShowDismissableAlert(dismissable_alert), disabledContentDto == null, 2, null));
    }

    public static final TaxLotCell.DisplayCell<CryptoTaxLotSelectionTapAction> costPerUnitCell(StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.CostPerUnitDto costPerUnitDto, Currency quoteCurrencyForPrice, Resources resources, StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto disabledContentDto) {
        TaxLotDisplayCellState.TextContent textContent;
        StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto.DismissableAlertDto dismissable_alert;
        Intrinsics.checkNotNullParameter(costPerUnitDto, "<this>");
        Intrinsics.checkNotNullParameter(quoteCurrencyForPrice, "quoteCurrencyForPrice");
        Intrinsics.checkNotNullParameter(resources, "resources");
        IdlDecimal cost_per_unit = costPerUnitDto.getCost_per_unit();
        if (cost_per_unit != null) {
            textContent = new TaxLotDisplayCellState.TextContent(CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPrice, cost_per_unit.toBigDecimalOrThrow(), false, false, null, 0, null, null, false, false, false, false, 2046, null), null, null, 6, null);
        } else {
            String string2 = resources.getString(C40095R.string.crypto_tax_lot_selection_table_not_available);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            textContent = new TaxLotDisplayCellState.TextContent(string2, TaxLotDisplayCellState.ColorOverride.FG_2, null, 4, null);
        }
        return new TaxLotCell.DisplayCell<>(new TaxLotDisplayCellState(textContent, null, TaxLotDisplayCellState.ContentAlignment.END, (disabledContentDto == null || (dismissable_alert = disabledContentDto.getDismissable_alert()) == null) ? null : new CryptoTaxLotSelectionTapAction.ShowDismissableAlert(dismissable_alert), disabledContentDto == null, 2, null));
    }

    public static final TaxLotCell.DisplayCell<CryptoTaxLotSelectionTapAction> dateCell(StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.DateDto dateDto, Resources resources, StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto disabledContentDto) {
        StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto.DismissableAlertDto dismissable_alert;
        Intrinsics.checkNotNullParameter(dateDto, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        TaxLotDisplayCellState.TextContent textContent = new TaxLotDisplayCellState.TextContent(dateDto.getDisplay_date(), null, null, 6, null);
        String string2 = TermTypeDtos2.getDisplayString(dateDto.getTerm_type()).getText(resources).toString();
        CryptoTaxLotSelectionTapAction.ShowDismissableAlert showDismissableAlert = null;
        TaxLotDisplayCellState.TextContent textContent2 = new TaxLotDisplayCellState.TextContent(string2, null, WhenMappings.$EnumSwitchMapping$1[dateDto.getTerm_type().ordinal()] == 1 ? new TaxLotDisplayCellState.IconContent(new BentoIcon4.Size12(ServerToBentoAssetMapper2.QUESTION_FILLED_12), CryptoTaxLotSelectionTapAction.ShowTransferredInBottomSheet.INSTANCE, null, 4, null) : null, 2, null);
        TaxLotDisplayCellState.ContentAlignment contentAlignment = TaxLotDisplayCellState.ContentAlignment.START;
        if (disabledContentDto != null && (dismissable_alert = disabledContentDto.getDismissable_alert()) != null) {
            showDismissableAlert = new CryptoTaxLotSelectionTapAction.ShowDismissableAlert(dismissable_alert);
        }
        return new TaxLotCell.DisplayCell<>(new TaxLotDisplayCellState(textContent, textContent2, contentAlignment, showDismissableAlert, disabledContentDto == null));
    }

    public static final TaxLotCell.DisplayCell<CryptoTaxLotSelectionTapAction> gainLossCell(StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto gainLossDto, Currency quoteCurrency, Resources resources, StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto disabledContentDto) {
        TaxLotDisplayCellState.TextContent textContent;
        StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto.DismissableAlertDto dismissable_alert;
        StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.GainLossContentDto.TypeDto type2;
        BigDecimal bigDecimalNegate;
        TaxLotDisplayCellState.ColorOverride colorOverride;
        Intrinsics.checkNotNullParameter(gainLossDto, "<this>");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        Intrinsics.checkNotNullParameter(resources, "resources");
        StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.GainLossContentDto gain_loss_content = gainLossDto.getGain_loss_content();
        if (gain_loss_content != null && (type2 = gain_loss_content.getType()) != null) {
            boolean z = type2 instanceof StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.GainLossContentDto.TypeDto.GainContent;
            if (z) {
                bigDecimalNegate = ((StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.GainLossContentDto.TypeDto.GainContent) type2).getValue().getGain_quote_amount().toBigDecimalOrThrow();
            } else {
                if (!(type2 instanceof StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.GainLossContentDto.TypeDto.LossContent)) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimalNegate = ((StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.GainLossContentDto.TypeDto.LossContent) type2).getValue().getLoss_quote_amount().toBigDecimalOrThrow().negate();
            }
            Intrinsics.checkNotNull(bigDecimalNegate);
            String currency$default = CurrencyDefinitions.formatCurrency$default(quoteCurrency, bigDecimalNegate, false, false, null, 0, null, Boolean.TRUE, true, true, false, false, 1598, null);
            if (z) {
                colorOverride = TaxLotDisplayCellState.ColorOverride.POSITIVE;
            } else {
                if (!(type2 instanceof StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.GainLossContentDto.TypeDto.LossContent)) {
                    throw new NoWhenBranchMatchedException();
                }
                colorOverride = TaxLotDisplayCellState.ColorOverride.NEGATIVE;
            }
            textContent = new TaxLotDisplayCellState.TextContent(currency$default, colorOverride, null, 4, null);
        } else {
            String string2 = resources.getString(C40095R.string.crypto_tax_lot_selection_table_not_available);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            textContent = new TaxLotDisplayCellState.TextContent(string2, TaxLotDisplayCellState.ColorOverride.FG_2, null, 4, null);
        }
        return new TaxLotCell.DisplayCell<>(new TaxLotDisplayCellState(textContent, null, TaxLotDisplayCellState.ContentAlignment.END, (disabledContentDto == null || (dismissable_alert = disabledContentDto.getDismissable_alert()) == null) ? null : new CryptoTaxLotSelectionTapAction.ShowDismissableAlert(dismissable_alert), disabledContentDto == null, 2, null));
    }

    public static final TaxLotCell.InputCell<CryptoTaxLotSelectionTapAction> inputCell(StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto selectedQuantityDto, String id, Currency assetCurrency, StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto disabledContentDto, String str) {
        ToggleableState toggleableState;
        StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto.DismissableAlertDto dismissable_alert;
        BigDecimal bigDecimalOrThrow;
        Intrinsics.checkNotNullParameter(selectedQuantityDto, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
        BigDecimal bigDecimalOrThrow2 = selectedQuantityDto.getHint_quantity().toBigDecimalOrThrow();
        String formatted_selected_quantity = selectedQuantityDto.getFormatted_selected_quantity();
        if (formatted_selected_quantity == null) {
            IdlDecimal selected_quantity = selectedQuantityDto.getSelected_quantity();
            formatted_selected_quantity = (selected_quantity == null || (bigDecimalOrThrow = selected_quantity.toBigDecimalOrThrow()) == null) ? null : CurrencyDefinitions.formatCurrency$default(assetCurrency, bigDecimalOrThrow, false, false, null, 0, Integer.valueOf(bigDecimalOrThrow.scale()), null, false, false, false, false, 2012, null);
            if (formatted_selected_quantity == null) {
                formatted_selected_quantity = "";
            }
        }
        String str2 = formatted_selected_quantity;
        String currency$default = CurrencyDefinitions.formatCurrency$default(assetCurrency, bigDecimalOrThrow2, false, false, null, 0, Integer.valueOf(bigDecimalOrThrow2.scale()), null, false, false, false, false, 2012, null);
        int i = WhenMappings.$EnumSwitchMapping$2[selectedQuantityDto.getCheck_state().ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Unspecified check state");
        }
        if (i == 2) {
            toggleableState = ToggleableState.Off;
        } else if (i == 3) {
            toggleableState = ToggleableState.Indeterminate;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            toggleableState = ToggleableState.f174On;
        }
        return new TaxLotCell.InputCell<>(new TaxLotTableInputCellState(id, str2, currency$default, toggleableState, disabledContentDto == null, selectedQuantityDto.is_error(), (disabledContentDto == null || (dismissable_alert = disabledContentDto.getDismissable_alert()) == null) ? null : new CryptoTaxLotSelectionTapAction.ShowDismissableAlert(dismissable_alert), Intrinsics.areEqual(str, id)));
    }
}
