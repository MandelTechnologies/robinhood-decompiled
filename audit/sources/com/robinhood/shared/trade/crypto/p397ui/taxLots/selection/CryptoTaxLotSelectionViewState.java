package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.taxLots.TaxLotTableState;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionFooterState;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.views.CryptoTaxLotSelectionHeaderState;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoTaxLotSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J]\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionViewState;", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "headerState", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState;", "tableState", "Lcom/robinhood/shared/taxLots/TaxLotTableState;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionTapAction;", "footerState", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState;", "numpadState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "bottomSheetTypeDtos", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "<init>", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState;Lcom/robinhood/shared/taxLots/TaxLotTableState;Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;Lkotlinx/collections/immutable/ImmutableList;)V", "getCryptoOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "getHeaderState", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionHeaderState;", "getTableState", "()Lcom/robinhood/shared/taxLots/TaxLotTableState;", "getFooterState", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/views/CryptoTaxLotSelectionFooterState;", "getNumpadState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "getBottomSheetTypeDtos", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoTaxLotSelectionViewState {
    public static final int $stable = 8;
    private final ImmutableList<BottomSheetTypeDto> bottomSheetTypeDtos;
    private final CryptoOrderContext cryptoOrderContext;
    private final CryptoTaxLotSelectionFooterState footerState;
    private final CryptoTaxLotSelectionHeaderState headerState;
    private final CryptoOrderAnimatedBentoNumpadState numpadState;
    private final RequestInputs.AsAsset requestInputs;
    private final TaxLotTableState<CryptoTaxLotSelectionTapAction> tableState;

    public static /* synthetic */ CryptoTaxLotSelectionViewState copy$default(CryptoTaxLotSelectionViewState cryptoTaxLotSelectionViewState, CryptoOrderContext cryptoOrderContext, RequestInputs.AsAsset asAsset, CryptoTaxLotSelectionHeaderState cryptoTaxLotSelectionHeaderState, TaxLotTableState taxLotTableState, CryptoTaxLotSelectionFooterState cryptoTaxLotSelectionFooterState, CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoOrderContext = cryptoTaxLotSelectionViewState.cryptoOrderContext;
        }
        if ((i & 2) != 0) {
            asAsset = cryptoTaxLotSelectionViewState.requestInputs;
        }
        if ((i & 4) != 0) {
            cryptoTaxLotSelectionHeaderState = cryptoTaxLotSelectionViewState.headerState;
        }
        if ((i & 8) != 0) {
            taxLotTableState = cryptoTaxLotSelectionViewState.tableState;
        }
        if ((i & 16) != 0) {
            cryptoTaxLotSelectionFooterState = cryptoTaxLotSelectionViewState.footerState;
        }
        if ((i & 32) != 0) {
            cryptoOrderAnimatedBentoNumpadState = cryptoTaxLotSelectionViewState.numpadState;
        }
        if ((i & 64) != 0) {
            immutableList = cryptoTaxLotSelectionViewState.bottomSheetTypeDtos;
        }
        CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState2 = cryptoOrderAnimatedBentoNumpadState;
        ImmutableList immutableList2 = immutableList;
        CryptoTaxLotSelectionFooterState cryptoTaxLotSelectionFooterState2 = cryptoTaxLotSelectionFooterState;
        CryptoTaxLotSelectionHeaderState cryptoTaxLotSelectionHeaderState2 = cryptoTaxLotSelectionHeaderState;
        return cryptoTaxLotSelectionViewState.copy(cryptoOrderContext, asAsset, cryptoTaxLotSelectionHeaderState2, taxLotTableState, cryptoTaxLotSelectionFooterState2, cryptoOrderAnimatedBentoNumpadState2, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestInputs.AsAsset getRequestInputs() {
        return this.requestInputs;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoTaxLotSelectionHeaderState getHeaderState() {
        return this.headerState;
    }

    public final TaxLotTableState<CryptoTaxLotSelectionTapAction> component4() {
        return this.tableState;
    }

    /* renamed from: component5, reason: from getter */
    public final CryptoTaxLotSelectionFooterState getFooterState() {
        return this.footerState;
    }

    /* renamed from: component6, reason: from getter */
    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        return this.numpadState;
    }

    public final ImmutableList<BottomSheetTypeDto> component7() {
        return this.bottomSheetTypeDtos;
    }

    public final CryptoTaxLotSelectionViewState copy(CryptoOrderContext cryptoOrderContext, RequestInputs.AsAsset requestInputs, CryptoTaxLotSelectionHeaderState headerState, TaxLotTableState<CryptoTaxLotSelectionTapAction> tableState, CryptoTaxLotSelectionFooterState footerState, CryptoOrderAnimatedBentoNumpadState numpadState, ImmutableList<BottomSheetTypeDto> bottomSheetTypeDtos) {
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(tableState, "tableState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        Intrinsics.checkNotNullParameter(bottomSheetTypeDtos, "bottomSheetTypeDtos");
        return new CryptoTaxLotSelectionViewState(cryptoOrderContext, requestInputs, headerState, tableState, footerState, numpadState, bottomSheetTypeDtos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTaxLotSelectionViewState)) {
            return false;
        }
        CryptoTaxLotSelectionViewState cryptoTaxLotSelectionViewState = (CryptoTaxLotSelectionViewState) other;
        return Intrinsics.areEqual(this.cryptoOrderContext, cryptoTaxLotSelectionViewState.cryptoOrderContext) && Intrinsics.areEqual(this.requestInputs, cryptoTaxLotSelectionViewState.requestInputs) && Intrinsics.areEqual(this.headerState, cryptoTaxLotSelectionViewState.headerState) && Intrinsics.areEqual(this.tableState, cryptoTaxLotSelectionViewState.tableState) && Intrinsics.areEqual(this.footerState, cryptoTaxLotSelectionViewState.footerState) && Intrinsics.areEqual(this.numpadState, cryptoTaxLotSelectionViewState.numpadState) && Intrinsics.areEqual(this.bottomSheetTypeDtos, cryptoTaxLotSelectionViewState.bottomSheetTypeDtos);
    }

    public int hashCode() {
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        return ((((((((((((cryptoOrderContext == null ? 0 : cryptoOrderContext.hashCode()) * 31) + this.requestInputs.hashCode()) * 31) + this.headerState.hashCode()) * 31) + this.tableState.hashCode()) * 31) + this.footerState.hashCode()) * 31) + this.numpadState.hashCode()) * 31) + this.bottomSheetTypeDtos.hashCode();
    }

    public String toString() {
        return "CryptoTaxLotSelectionViewState(cryptoOrderContext=" + this.cryptoOrderContext + ", requestInputs=" + this.requestInputs + ", headerState=" + this.headerState + ", tableState=" + this.tableState + ", footerState=" + this.footerState + ", numpadState=" + this.numpadState + ", bottomSheetTypeDtos=" + this.bottomSheetTypeDtos + ")";
    }

    public CryptoTaxLotSelectionViewState(CryptoOrderContext cryptoOrderContext, RequestInputs.AsAsset requestInputs, CryptoTaxLotSelectionHeaderState headerState, TaxLotTableState<CryptoTaxLotSelectionTapAction> tableState, CryptoTaxLotSelectionFooterState footerState, CryptoOrderAnimatedBentoNumpadState numpadState, ImmutableList<BottomSheetTypeDto> bottomSheetTypeDtos) {
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(tableState, "tableState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        Intrinsics.checkNotNullParameter(bottomSheetTypeDtos, "bottomSheetTypeDtos");
        this.cryptoOrderContext = cryptoOrderContext;
        this.requestInputs = requestInputs;
        this.headerState = headerState;
        this.tableState = tableState;
        this.footerState = footerState;
        this.numpadState = numpadState;
        this.bottomSheetTypeDtos = bottomSheetTypeDtos;
    }

    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    public final RequestInputs.AsAsset getRequestInputs() {
        return this.requestInputs;
    }

    public final CryptoTaxLotSelectionHeaderState getHeaderState() {
        return this.headerState;
    }

    public final TaxLotTableState<CryptoTaxLotSelectionTapAction> getTableState() {
        return this.tableState;
    }

    public final CryptoTaxLotSelectionFooterState getFooterState() {
        return this.footerState;
    }

    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        return this.numpadState;
    }

    public final ImmutableList<BottomSheetTypeDto> getBottomSheetTypeDtos() {
        return this.bottomSheetTypeDtos;
    }
}
