package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import android.content.res.Resources;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.crypto.utils.UiCurrencyPairs2;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.taxLots.TaxLotTableState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionFooterState;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderState;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.SelectedTaxLotDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamSelectedTaxLotsResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotSelectionFooterResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotViewModelsResponseDto;

/* compiled from: CryptoTaxLotSelectionDataState.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020+J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010C\u001a\u00020\u000fHÆ\u0003J\t\u0010D\u001a\u00020\u000fHÆ\u0003Jc\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010F\u001a\u00020\u000f2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010 R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020:098F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006K"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDataState;", "", "initialRequestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "taxLotSelectionFooterResponseDto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto;", "selectedTaxLotsResponseDto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;", "taxLotViewModelsResponseDto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto;", "focusedInputTaxLotId", "", "hasCustomLotSelection", "", "isCtaLoading", "<init>", "(Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto;Ljava/lang/String;ZZ)V", "getInitialRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "getCryptoOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getTaxLotSelectionFooterResponseDto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto;", "getSelectedTaxLotsResponseDto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;", "getTaxLotViewModelsResponseDto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto;", "getFocusedInputTaxLotId", "()Ljava/lang/String;", "getHasCustomLotSelection", "()Z", "requestInputs", "getRequestInputs", "headerState", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState;", "getHeaderState", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState;", "tableState", "Lcom/robinhood/shared/taxLots/TaxLotTableState;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionTapAction;", "resources", "Landroid/content/res/Resources;", "footerState", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState;", "getFooterState", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState;", "numpadState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "getNumpadState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "focusedInputCell", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "getFocusedInputCell", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "bottomSheetTypeDtos", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "getBottomSheetTypeDtos", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CryptoTaxLotSelectionDataState {
    public static final int $stable = 8;
    private final CryptoOrderContext cryptoOrderContext;
    private final String focusedInputTaxLotId;
    private final boolean hasCustomLotSelection;
    private final RequestInputs.AsAsset initialRequestInputs;
    private final boolean isCtaLoading;
    private final StreamSelectedTaxLotsResponseDto selectedTaxLotsResponseDto;
    private final StreamTaxLotSelectionFooterResponseDto taxLotSelectionFooterResponseDto;
    private final StreamTaxLotViewModelsResponseDto taxLotViewModelsResponseDto;

    public static /* synthetic */ CryptoTaxLotSelectionDataState copy$default(CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState, RequestInputs.AsAsset asAsset, CryptoOrderContext cryptoOrderContext, StreamTaxLotSelectionFooterResponseDto streamTaxLotSelectionFooterResponseDto, StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto, StreamTaxLotViewModelsResponseDto streamTaxLotViewModelsResponseDto, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            asAsset = cryptoTaxLotSelectionDataState.initialRequestInputs;
        }
        if ((i & 2) != 0) {
            cryptoOrderContext = cryptoTaxLotSelectionDataState.cryptoOrderContext;
        }
        if ((i & 4) != 0) {
            streamTaxLotSelectionFooterResponseDto = cryptoTaxLotSelectionDataState.taxLotSelectionFooterResponseDto;
        }
        if ((i & 8) != 0) {
            streamSelectedTaxLotsResponseDto = cryptoTaxLotSelectionDataState.selectedTaxLotsResponseDto;
        }
        if ((i & 16) != 0) {
            streamTaxLotViewModelsResponseDto = cryptoTaxLotSelectionDataState.taxLotViewModelsResponseDto;
        }
        if ((i & 32) != 0) {
            str = cryptoTaxLotSelectionDataState.focusedInputTaxLotId;
        }
        if ((i & 64) != 0) {
            z = cryptoTaxLotSelectionDataState.hasCustomLotSelection;
        }
        if ((i & 128) != 0) {
            z2 = cryptoTaxLotSelectionDataState.isCtaLoading;
        }
        boolean z3 = z;
        boolean z4 = z2;
        StreamTaxLotViewModelsResponseDto streamTaxLotViewModelsResponseDto2 = streamTaxLotViewModelsResponseDto;
        String str2 = str;
        return cryptoTaxLotSelectionDataState.copy(asAsset, cryptoOrderContext, streamTaxLotSelectionFooterResponseDto, streamSelectedTaxLotsResponseDto, streamTaxLotViewModelsResponseDto2, str2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestInputs.AsAsset getInitialRequestInputs() {
        return this.initialRequestInputs;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    /* renamed from: component3, reason: from getter */
    public final StreamTaxLotSelectionFooterResponseDto getTaxLotSelectionFooterResponseDto() {
        return this.taxLotSelectionFooterResponseDto;
    }

    /* renamed from: component4, reason: from getter */
    public final StreamSelectedTaxLotsResponseDto getSelectedTaxLotsResponseDto() {
        return this.selectedTaxLotsResponseDto;
    }

    /* renamed from: component5, reason: from getter */
    public final StreamTaxLotViewModelsResponseDto getTaxLotViewModelsResponseDto() {
        return this.taxLotViewModelsResponseDto;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFocusedInputTaxLotId() {
        return this.focusedInputTaxLotId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasCustomLotSelection() {
        return this.hasCustomLotSelection;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsCtaLoading() {
        return this.isCtaLoading;
    }

    public final CryptoTaxLotSelectionDataState copy(RequestInputs.AsAsset initialRequestInputs, CryptoOrderContext cryptoOrderContext, StreamTaxLotSelectionFooterResponseDto taxLotSelectionFooterResponseDto, StreamSelectedTaxLotsResponseDto selectedTaxLotsResponseDto, StreamTaxLotViewModelsResponseDto taxLotViewModelsResponseDto, String focusedInputTaxLotId, boolean hasCustomLotSelection, boolean isCtaLoading) {
        Intrinsics.checkNotNullParameter(initialRequestInputs, "initialRequestInputs");
        return new CryptoTaxLotSelectionDataState(initialRequestInputs, cryptoOrderContext, taxLotSelectionFooterResponseDto, selectedTaxLotsResponseDto, taxLotViewModelsResponseDto, focusedInputTaxLotId, hasCustomLotSelection, isCtaLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTaxLotSelectionDataState)) {
            return false;
        }
        CryptoTaxLotSelectionDataState cryptoTaxLotSelectionDataState = (CryptoTaxLotSelectionDataState) other;
        return Intrinsics.areEqual(this.initialRequestInputs, cryptoTaxLotSelectionDataState.initialRequestInputs) && Intrinsics.areEqual(this.cryptoOrderContext, cryptoTaxLotSelectionDataState.cryptoOrderContext) && Intrinsics.areEqual(this.taxLotSelectionFooterResponseDto, cryptoTaxLotSelectionDataState.taxLotSelectionFooterResponseDto) && Intrinsics.areEqual(this.selectedTaxLotsResponseDto, cryptoTaxLotSelectionDataState.selectedTaxLotsResponseDto) && Intrinsics.areEqual(this.taxLotViewModelsResponseDto, cryptoTaxLotSelectionDataState.taxLotViewModelsResponseDto) && Intrinsics.areEqual(this.focusedInputTaxLotId, cryptoTaxLotSelectionDataState.focusedInputTaxLotId) && this.hasCustomLotSelection == cryptoTaxLotSelectionDataState.hasCustomLotSelection && this.isCtaLoading == cryptoTaxLotSelectionDataState.isCtaLoading;
    }

    public int hashCode() {
        int iHashCode = this.initialRequestInputs.hashCode() * 31;
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        int iHashCode2 = (iHashCode + (cryptoOrderContext == null ? 0 : cryptoOrderContext.hashCode())) * 31;
        StreamTaxLotSelectionFooterResponseDto streamTaxLotSelectionFooterResponseDto = this.taxLotSelectionFooterResponseDto;
        int iHashCode3 = (iHashCode2 + (streamTaxLotSelectionFooterResponseDto == null ? 0 : streamTaxLotSelectionFooterResponseDto.hashCode())) * 31;
        StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto = this.selectedTaxLotsResponseDto;
        int iHashCode4 = (iHashCode3 + (streamSelectedTaxLotsResponseDto == null ? 0 : streamSelectedTaxLotsResponseDto.hashCode())) * 31;
        StreamTaxLotViewModelsResponseDto streamTaxLotViewModelsResponseDto = this.taxLotViewModelsResponseDto;
        int iHashCode5 = (iHashCode4 + (streamTaxLotViewModelsResponseDto == null ? 0 : streamTaxLotViewModelsResponseDto.hashCode())) * 31;
        String str = this.focusedInputTaxLotId;
        return ((((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasCustomLotSelection)) * 31) + Boolean.hashCode(this.isCtaLoading);
    }

    public String toString() {
        return "CryptoTaxLotSelectionDataState(initialRequestInputs=" + this.initialRequestInputs + ", cryptoOrderContext=" + this.cryptoOrderContext + ", taxLotSelectionFooterResponseDto=" + this.taxLotSelectionFooterResponseDto + ", selectedTaxLotsResponseDto=" + this.selectedTaxLotsResponseDto + ", taxLotViewModelsResponseDto=" + this.taxLotViewModelsResponseDto + ", focusedInputTaxLotId=" + this.focusedInputTaxLotId + ", hasCustomLotSelection=" + this.hasCustomLotSelection + ", isCtaLoading=" + this.isCtaLoading + ")";
    }

    public CryptoTaxLotSelectionDataState(RequestInputs.AsAsset initialRequestInputs, CryptoOrderContext cryptoOrderContext, StreamTaxLotSelectionFooterResponseDto streamTaxLotSelectionFooterResponseDto, StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto, StreamTaxLotViewModelsResponseDto streamTaxLotViewModelsResponseDto, String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(initialRequestInputs, "initialRequestInputs");
        this.initialRequestInputs = initialRequestInputs;
        this.cryptoOrderContext = cryptoOrderContext;
        this.taxLotSelectionFooterResponseDto = streamTaxLotSelectionFooterResponseDto;
        this.selectedTaxLotsResponseDto = streamSelectedTaxLotsResponseDto;
        this.taxLotViewModelsResponseDto = streamTaxLotViewModelsResponseDto;
        this.focusedInputTaxLotId = str;
        this.hasCustomLotSelection = z;
        this.isCtaLoading = z2;
    }

    public /* synthetic */ CryptoTaxLotSelectionDataState(RequestInputs.AsAsset asAsset, CryptoOrderContext cryptoOrderContext, StreamTaxLotSelectionFooterResponseDto streamTaxLotSelectionFooterResponseDto, StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto, StreamTaxLotViewModelsResponseDto streamTaxLotViewModelsResponseDto, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(asAsset, (i & 2) != 0 ? null : cryptoOrderContext, (i & 4) != 0 ? null : streamTaxLotSelectionFooterResponseDto, (i & 8) != 0 ? null : streamSelectedTaxLotsResponseDto, (i & 16) != 0 ? null : streamTaxLotViewModelsResponseDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2);
    }

    public final RequestInputs.AsAsset getInitialRequestInputs() {
        return this.initialRequestInputs;
    }

    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    public final StreamTaxLotSelectionFooterResponseDto getTaxLotSelectionFooterResponseDto() {
        return this.taxLotSelectionFooterResponseDto;
    }

    public final StreamSelectedTaxLotsResponseDto getSelectedTaxLotsResponseDto() {
        return this.selectedTaxLotsResponseDto;
    }

    public final StreamTaxLotViewModelsResponseDto getTaxLotViewModelsResponseDto() {
        return this.taxLotViewModelsResponseDto;
    }

    public final String getFocusedInputTaxLotId() {
        return this.focusedInputTaxLotId;
    }

    public final boolean getHasCustomLotSelection() {
        return this.hasCustomLotSelection;
    }

    public final boolean isCtaLoading() {
        return this.isCtaLoading;
    }

    public final RequestInputs.AsAsset getRequestInputs() {
        BigDecimal purchaseSize;
        ArrayList arrayList;
        List<SelectedTaxLotDto> selected_tax_lots;
        IdlDecimal total_quantity;
        RequestInputs.AsAsset asAsset = this.initialRequestInputs;
        StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto = this.selectedTaxLotsResponseDto;
        if (streamSelectedTaxLotsResponseDto == null || (total_quantity = streamSelectedTaxLotsResponseDto.getTotal_quantity()) == null || (purchaseSize = total_quantity.toBigDecimalOrThrow()) == null) {
            purchaseSize = this.initialRequestInputs.getPurchaseSize();
        }
        StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto2 = this.selectedTaxLotsResponseDto;
        if (streamSelectedTaxLotsResponseDto2 == null || (selected_tax_lots = streamSelectedTaxLotsResponseDto2.getSelected_tax_lots()) == null) {
            arrayList = null;
        } else {
            List<SelectedTaxLotDto> list = selected_tax_lots;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (SelectedTaxLotDto selectedTaxLotDto : list) {
                arrayList.add(new RequestInputs.TaxLot(StringsKt.toUuid(selectedTaxLotDto.getId()), selectedTaxLotDto.getQuantity().toBigDecimalOrThrow()));
            }
        }
        return RequestInputs.AsAsset.copy$default(asAsset, purchaseSize, null, null, null, null, false, null, null, false, arrayList, 510, null);
    }

    public final CryptoTaxLotSelectionHeaderState getHeaderState() {
        CryptoTaxLotSelectionHeaderState.PriceInfo stopLoss;
        CryptoOrderContext.RequestContext requestContext;
        UiCurrencyPair currencyPair;
        Currency assetCurrency;
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        CryptoTaxLotSelectionHeaderState.PriceInfo market = null;
        String code = (cryptoOrderContext == null || (requestContext = cryptoOrderContext.getRequestContext()) == null || (currencyPair = requestContext.getCurrencyPair()) == null || (assetCurrency = currencyPair.getAssetCurrency()) == null) ? null : assetCurrency.getCode();
        CryptoOrderContext cryptoOrderContext2 = this.cryptoOrderContext;
        if (cryptoOrderContext2 != null) {
            Currency quoteCurrencyForPriceInput = cryptoOrderContext2.getRequestContext().getCurrencyPair().getQuoteCurrencyForPriceInput();
            CryptoOrderPrices orderPrices = this.initialRequestInputs.getOrderPrices();
            if (orderPrices instanceof CryptoOrderPrices.Limit) {
                stopLoss = new CryptoTaxLotSelectionHeaderState.PriceInfo.Limit(CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, ((CryptoOrderPrices.Limit) orderPrices).getLimitPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            } else if (orderPrices instanceof CryptoOrderPrices.Market) {
                market = new CryptoTaxLotSelectionHeaderState.PriceInfo.Market(CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, cryptoOrderContext2.getRequestContext().getQuote().getBidPrice().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            } else if (orderPrices instanceof CryptoOrderPrices.StopLimit) {
                stopLoss = new CryptoTaxLotSelectionHeaderState.PriceInfo.StopLimit(CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, ((CryptoOrderPrices.StopLimit) orderPrices).getLimitPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            } else {
                if (!(orderPrices instanceof CryptoOrderPrices.StopLoss)) {
                    throw new NoWhenBranchMatchedException();
                }
                stopLoss = new CryptoTaxLotSelectionHeaderState.PriceInfo.StopLoss(CurrencyDefinitions.formatCurrency$default(quoteCurrencyForPriceInput, ((CryptoOrderPrices.StopLoss) orderPrices).getStopPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
            market = stopLoss;
        }
        return new CryptoTaxLotSelectionHeaderState(code, market);
    }

    public final TaxLotTableState<CryptoTaxLotSelectionTapAction> tableState(Resources resources) {
        CryptoOrderContext cryptoOrderContext;
        GenericCell genericCellInputCell;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this.taxLotViewModelsResponseDto == null || this.selectedTaxLotsResponseDto == null || (cryptoOrderContext = this.cryptoOrderContext) == null) {
            boolean z = false;
            return new TaxLotTableState.Loading(z, z, 3, null);
        }
        Currency assetCurrency = cryptoOrderContext.getRequestContext().getCurrencyPair().getAssetCurrency();
        Currency quoteCurrency = this.cryptoOrderContext.getRequestContext().getCurrencyPair().getQuoteCurrency();
        Currency quoteCurrencyForPriceInput = this.cryptoOrderContext.getRequestContext().getCurrencyPair().getQuoteCurrencyForPriceInput();
        List<StreamTaxLotViewModelsResponseDto.HeaderDto> headers = this.taxLotViewModelsResponseDto.getHeaders();
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(headers, 10));
        Iterator<T> it = headers.iterator();
        while (it.hasNext()) {
            arrayList.add(StreamTaxLotViewModelsResponseDtos.getHeaderCell((StreamTaxLotViewModelsResponseDto.HeaderDto) it.next()));
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        List<StreamTaxLotViewModelsResponseDto.TaxLotRowDto> tax_lot_rows = this.taxLotViewModelsResponseDto.getTax_lot_rows();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lot_rows, 10));
        for (StreamTaxLotViewModelsResponseDto.TaxLotRowDto taxLotRowDto : tax_lot_rows) {
            StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto disabled_content = taxLotRowDto.getDisabled_content();
            String id = taxLotRowDto.getId();
            List<StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto> cells = taxLotRowDto.getCells();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(cells, i));
            Iterator<T> it2 = cells.iterator();
            while (it2.hasNext()) {
                StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto type2 = ((StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto) it2.next()).getType();
                if (type2 instanceof StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.AvailableQuantity) {
                    genericCellInputCell = StreamTaxLotViewModelsResponseDtos.availableQuantityCell(((StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.AvailableQuantity) type2).getValue(), assetCurrency, disabled_content);
                } else if (type2 instanceof StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.CostPerUnit) {
                    genericCellInputCell = StreamTaxLotViewModelsResponseDtos.costPerUnitCell(((StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.CostPerUnit) type2).getValue(), quoteCurrencyForPriceInput, resources, disabled_content);
                } else if (type2 instanceof StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.Date) {
                    genericCellInputCell = StreamTaxLotViewModelsResponseDtos.dateCell(((StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.Date) type2).getValue(), resources, disabled_content);
                } else if (type2 instanceof StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.GainLoss) {
                    genericCellInputCell = StreamTaxLotViewModelsResponseDtos.gainLossCell(((StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.GainLoss) type2).getValue(), quoteCurrency, resources, disabled_content);
                } else {
                    if (!(type2 instanceof StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.SelectedQuantity)) {
                        if (type2 == null) {
                            throw new IllegalStateException("Unknown cell type");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    genericCellInputCell = StreamTaxLotViewModelsResponseDtos.inputCell(((StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.SelectedQuantity) type2).getValue(), taxLotRowDto.getId(), assetCurrency, disabled_content, this.focusedInputTaxLotId);
                }
                arrayList3.add(genericCellInputCell);
            }
            arrayList2.add(new GenericRow(id, arrayList3, false, null, null, 28, null));
            i = 10;
        }
        return new TaxLotTableState.Loaded(new GenericTableData(persistentList, extensions2.toImmutableList(arrayList2)), new StickyColumn.StickAtEndUntilOnScreen(CollectionsKt.getLastIndex(this.taxLotViewModelsResponseDto.getHeaders())), this.taxLotViewModelsResponseDto.getHas_next());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CryptoTaxLotSelectionFooterState getFooterState() {
        CryptoTaxLotSelectionFooterState.TextContent text;
        CryptoTaxLotSelectionFooterState.TextContent text2;
        CryptoOrderContext.RequestContext requestContext;
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        StringResource stringResourceInvoke = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        UiCurrencyPair currencyPair = (cryptoOrderContext == null || (requestContext = cryptoOrderContext.getRequestContext()) == null) ? null : requestContext.getCurrencyPair();
        StreamTaxLotSelectionFooterResponseDto streamTaxLotSelectionFooterResponseDto = this.taxLotSelectionFooterResponseDto;
        StreamSelectedTaxLotsResponseDto streamSelectedTaxLotsResponseDto = this.selectedTaxLotsResponseDto;
        if (currencyPair == null || streamTaxLotSelectionFooterResponseDto == null || streamSelectedTaxLotsResponseDto == null) {
            CryptoTaxLotSelectionFooterState.TextContent.Loading loading = CryptoTaxLotSelectionFooterState.TextContent.Loading.INSTANCE;
            return new CryptoTaxLotSelectionFooterState(loading, loading, loading, null, false, false, 40, null);
        }
        int i = 2;
        if (streamSelectedTaxLotsResponseDto.getSelected_tax_lots().isEmpty()) {
            text = CryptoTaxLotSelectionFooterState.TextContent.None.INSTANCE;
        } else {
            text = new CryptoTaxLotSelectionFooterState.TextContent.Text(StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(currencyPair.getQuoteCurrencyForPriceInput(), this.cryptoOrderContext.getOrderInfo().getUncollaredTotalCost(), false, false, null, 0, null, null, false, false, false, false, 2046, null)), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
        }
        StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto estimated_gain_loss_content = streamTaxLotSelectionFooterResponseDto.getEstimated_gain_loss_content();
        StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto.ContentDto content = estimated_gain_loss_content != null ? estimated_gain_loss_content.getContent() : null;
        if (content instanceof StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto.ContentDto.EstimatedGainContent) {
            text2 = new CryptoTaxLotSelectionFooterState.TextContent.Text(StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(currencyPair.getQuoteCurrency(), ((StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto.ContentDto.EstimatedGainContent) content).getValue().getEstimated_gain_quote_amount().toBigDecimalOrThrow(), false, false, null, 0, null, Boolean.TRUE, true, false, false, false, 1854, null)), CryptoTaxLotSelectionFooterState.TextContent.Text.ColorOverride.POSITIVE);
        } else if (content instanceof StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto.ContentDto.EstimatedLossContent) {
            StringResource.Companion companion = StringResource.INSTANCE;
            Currency quoteCurrency = currencyPair.getQuoteCurrency();
            BigDecimal bigDecimalNegate = ((StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto.ContentDto.EstimatedLossContent) content).getValue().getEstimated_loss_quote_amount().toBigDecimalOrThrow().negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            text2 = new CryptoTaxLotSelectionFooterState.TextContent.Text(companion.invoke(CurrencyDefinitions.formatCurrency$default(quoteCurrency, bigDecimalNegate, false, false, null, 0, null, Boolean.TRUE, false, true, false, false, 1726, null)), CryptoTaxLotSelectionFooterState.TextContent.Text.ColorOverride.NEGATIVE);
        } else if (content instanceof StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto.ContentDto.TextContent) {
            text2 = new CryptoTaxLotSelectionFooterState.TextContent.Text(StringResource.INSTANCE.invoke(((StreamTaxLotSelectionFooterResponseDto.EstimatedGainLossContentDto.ContentDto.TextContent) content).getValue()), objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
        } else {
            if (content != null) {
                throw new NoWhenBranchMatchedException();
            }
            text2 = CryptoTaxLotSelectionFooterState.TextContent.None.INSTANCE;
        }
        CryptoTaxLotSelectionFooterState.TextContent textContent = text2;
        StringResource.Companion companion2 = StringResource.INSTANCE;
        CryptoTaxLotSelectionFooterState.TextContent.Text text3 = new CryptoTaxLotSelectionFooterState.TextContent.Text(companion2.invoke(CurrencyDefinitions.formatCurrency$default(currencyPair.getAssetCurrency(), streamTaxLotSelectionFooterResponseDto.getQuantity().toBigDecimalOrThrow(), false, !BigDecimals7.isZero(streamTaxLotSelectionFooterResponseDto.getQuantity().toBigDecimalOrThrow()), null, BigDecimals7.isZero(streamTaxLotSelectionFooterResponseDto.getQuantity().toBigDecimalOrThrow()) ? 0 : 2, Integer.valueOf(streamTaxLotSelectionFooterResponseDto.getQuantity().toBigDecimalOrThrow().scale()), null, false, false, false, false, 1992, null)), objArr6 == true ? 1 : 0, i, objArr5 == true ? 1 : 0);
        StreamTaxLotSelectionFooterResponseDto.ErrorContentDto error_content = streamTaxLotSelectionFooterResponseDto.getError_content();
        StreamTaxLotSelectionFooterResponseDto.ErrorContentDto.TypeDto type2 = error_content != null ? error_content.getType() : null;
        if (type2 instanceof StreamTaxLotSelectionFooterResponseDto.ErrorContentDto.TypeDto.InputQuantityExceedsAvailableQuantity) {
            stringResourceInvoke = companion2.invoke(C40095R.string.f6292x71e2d22f, CurrencyDefinitions.formatCurrency$default(currencyPair.getAssetCurrency(), ((StreamTaxLotSelectionFooterResponseDto.ErrorContentDto.TypeDto.InputQuantityExceedsAvailableQuantity) type2).getValue().getAvailable_quantity().toBigDecimalOrThrow(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        } else if (type2 != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new CryptoTaxLotSelectionFooterState(text, textContent, text3, stringResourceInvoke, streamTaxLotSelectionFooterResponseDto.is_cta_enabled(), this.isCtaLoading);
    }

    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        CryptoOrderContext.RequestContext requestContext;
        StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto focusedInputCell = getFocusedInputCell();
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        StringResource stringResourceInvoke = null;
        UiCurrencyPair currencyPair = (cryptoOrderContext == null || (requestContext = cryptoOrderContext.getRequestContext()) == null) ? null : requestContext.getCurrencyPair();
        String formatted_selected_quantity = focusedInputCell != null ? focusedInputCell.getFormatted_selected_quantity() : null;
        boolean zAllowDecimalInput = currencyPair != null ? UiCurrencyPairs2.allowDecimalInput(currencyPair, CryptoInputMode.ASSET_CURRENCY) : true;
        boolean zContains$default = formatted_selected_quantity != null ? kotlin.text.StringsKt.contains$default((CharSequence) formatted_selected_quantity, '.', false, 2, (Object) null) : false;
        boolean z = this.focusedInputTaxLotId != null;
        boolean z2 = zAllowDecimalInput && !zContains$default;
        if (focusedInputCell != null && focusedInputCell.getSelected_quantity() == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_selection_footer_max_text, new Object[0]);
        }
        return new CryptoOrderAnimatedBentoNumpadState(z, false, z2, stringResourceInvoke, 2, null);
    }

    public final StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto getFocusedInputCell() {
        StreamTaxLotViewModelsResponseDto streamTaxLotViewModelsResponseDto;
        List<StreamTaxLotViewModelsResponseDto.TaxLotRowDto> tax_lot_rows;
        Object next;
        List<StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto> cells;
        if (this.focusedInputTaxLotId != null && (streamTaxLotViewModelsResponseDto = this.taxLotViewModelsResponseDto) != null && (tax_lot_rows = streamTaxLotViewModelsResponseDto.getTax_lot_rows()) != null) {
            Iterator<T> it = tax_lot_rows.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((StreamTaxLotViewModelsResponseDto.TaxLotRowDto) next).getId(), this.focusedInputTaxLotId)) {
                    break;
                }
            }
            StreamTaxLotViewModelsResponseDto.TaxLotRowDto taxLotRowDto = (StreamTaxLotViewModelsResponseDto.TaxLotRowDto) next;
            if (taxLotRowDto != null && (cells = taxLotRowDto.getCells()) != null) {
                List<StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto> list = cells;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto) it2.next()).getType());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.SelectedQuantity) {
                        arrayList2.add(obj);
                    }
                }
                StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.SelectedQuantity selectedQuantity = (StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.TypeDto.SelectedQuantity) CollectionsKt.firstOrNull((List) arrayList2);
                if (selectedQuantity != null) {
                    return selectedQuantity.getValue();
                }
            }
        }
        return null;
    }

    public final ImmutableList<BottomSheetTypeDto> getBottomSheetTypeDtos() {
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        return extensions2.toPersistentList(CollectionsKt.listOfNotNull(cryptoOrderContext != null ? CryptoOrderContexts.getLimitOrderDefinitionBottomSheetTypeDto(cryptoOrderContext) : null));
    }
}
