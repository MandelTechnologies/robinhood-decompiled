package com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots;

import android.content.res.Resources;
import com.robinhood.android.generic.table.GenericRow;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.taxLots.TaxLotCell;
import com.robinhood.shared.taxLots.TaxLotTableState;
import com.robinhood.shared.taxLots.views.TaxLotDisplayCellState;
import com.robinhood.shared.taxLots.views.TaxLotTableHeaderCellState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsViewState;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.extensions.TermTypeDtos2;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import nummus.p512v1.OrderTaxLotDetailDto;

/* compiled from: CryptoOrderDetailTaxLotsDataState.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003JX\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0005\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00065"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDataState;", "", "assetCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "quoteCurrency", "isConfirmed", "", "totalGainLossAmount", "Ljava/math/BigDecimal;", "taxLotDetails", "", "Lnummus/v1/OrderTaxLotDetailDto;", "nextCursor", "", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/models/crypto/db/Currency;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;)V", "getAssetCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getQuoteCurrency", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTotalGainLossAmount", "()Ljava/math/BigDecimal;", "getTaxLotDetails", "()Ljava/util/List;", "getNextCursor", "()Ljava/lang/String;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState$SubtitleContent;", "getSubtitle", "()Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState$SubtitleContent;", "taxLotTableState", "Lcom/robinhood/shared/taxLots/TaxLotTableState;", "", "resources", "Landroid/content/res/Resources;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/models/crypto/db/Currency;Lcom/robinhood/models/crypto/db/Currency;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;)Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDataState;", "equals", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderDetailTaxLotsDataState {
    public static final int $stable = 8;
    private final Currency assetCurrency;
    private final Boolean isConfirmed;
    private final String nextCursor;
    private final Currency quoteCurrency;
    private final List<OrderTaxLotDetailDto> taxLotDetails;
    private final BigDecimal totalGainLossAmount;

    public static /* synthetic */ CryptoOrderDetailTaxLotsDataState copy$default(CryptoOrderDetailTaxLotsDataState cryptoOrderDetailTaxLotsDataState, Currency currency, Currency currency2, Boolean bool, BigDecimal bigDecimal, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            currency = cryptoOrderDetailTaxLotsDataState.assetCurrency;
        }
        if ((i & 2) != 0) {
            currency2 = cryptoOrderDetailTaxLotsDataState.quoteCurrency;
        }
        if ((i & 4) != 0) {
            bool = cryptoOrderDetailTaxLotsDataState.isConfirmed;
        }
        if ((i & 8) != 0) {
            bigDecimal = cryptoOrderDetailTaxLotsDataState.totalGainLossAmount;
        }
        if ((i & 16) != 0) {
            list = cryptoOrderDetailTaxLotsDataState.taxLotDetails;
        }
        if ((i & 32) != 0) {
            str = cryptoOrderDetailTaxLotsDataState.nextCursor;
        }
        List list2 = list;
        String str2 = str;
        return cryptoOrderDetailTaxLotsDataState.copy(currency, currency2, bool, bigDecimal, list2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Currency getAssetCurrency() {
        return this.assetCurrency;
    }

    /* renamed from: component2, reason: from getter */
    public final Currency getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getTotalGainLossAmount() {
        return this.totalGainLossAmount;
    }

    public final List<OrderTaxLotDetailDto> component5() {
        return this.taxLotDetails;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final CryptoOrderDetailTaxLotsDataState copy(Currency assetCurrency, Currency quoteCurrency, Boolean isConfirmed, BigDecimal totalGainLossAmount, List<OrderTaxLotDetailDto> taxLotDetails, String nextCursor) {
        Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        return new CryptoOrderDetailTaxLotsDataState(assetCurrency, quoteCurrency, isConfirmed, totalGainLossAmount, taxLotDetails, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderDetailTaxLotsDataState)) {
            return false;
        }
        CryptoOrderDetailTaxLotsDataState cryptoOrderDetailTaxLotsDataState = (CryptoOrderDetailTaxLotsDataState) other;
        return Intrinsics.areEqual(this.assetCurrency, cryptoOrderDetailTaxLotsDataState.assetCurrency) && Intrinsics.areEqual(this.quoteCurrency, cryptoOrderDetailTaxLotsDataState.quoteCurrency) && Intrinsics.areEqual(this.isConfirmed, cryptoOrderDetailTaxLotsDataState.isConfirmed) && Intrinsics.areEqual(this.totalGainLossAmount, cryptoOrderDetailTaxLotsDataState.totalGainLossAmount) && Intrinsics.areEqual(this.taxLotDetails, cryptoOrderDetailTaxLotsDataState.taxLotDetails) && Intrinsics.areEqual(this.nextCursor, cryptoOrderDetailTaxLotsDataState.nextCursor);
    }

    public int hashCode() {
        int iHashCode = ((this.assetCurrency.hashCode() * 31) + this.quoteCurrency.hashCode()) * 31;
        Boolean bool = this.isConfirmed;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalGainLossAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        List<OrderTaxLotDetailDto> list = this.taxLotDetails;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.nextCursor;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CryptoOrderDetailTaxLotsDataState(assetCurrency=" + this.assetCurrency + ", quoteCurrency=" + this.quoteCurrency + ", isConfirmed=" + this.isConfirmed + ", totalGainLossAmount=" + this.totalGainLossAmount + ", taxLotDetails=" + this.taxLotDetails + ", nextCursor=" + this.nextCursor + ")";
    }

    public CryptoOrderDetailTaxLotsDataState(Currency assetCurrency, Currency quoteCurrency, Boolean bool, BigDecimal bigDecimal, List<OrderTaxLotDetailDto> list, String str) {
        Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        this.assetCurrency = assetCurrency;
        this.quoteCurrency = quoteCurrency;
        this.isConfirmed = bool;
        this.totalGainLossAmount = bigDecimal;
        this.taxLotDetails = list;
        this.nextCursor = str;
    }

    public /* synthetic */ CryptoOrderDetailTaxLotsDataState(Currency currency, Currency currency2, Boolean bool, BigDecimal bigDecimal, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(currency, currency2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str);
    }

    public final Currency getAssetCurrency() {
        return this.assetCurrency;
    }

    public final Currency getQuoteCurrency() {
        return this.quoteCurrency;
    }

    public final Boolean isConfirmed() {
        return this.isConfirmed;
    }

    public final BigDecimal getTotalGainLossAmount() {
        return this.totalGainLossAmount;
    }

    public final List<OrderTaxLotDetailDto> getTaxLotDetails() {
        return this.taxLotDetails;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final StringResource getTitle() {
        Boolean bool = this.isConfirmed;
        if (bool == null) {
            return null;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_detail_tax_lots_title_lots_filled, new Object[0]);
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_detail_tax_lots_title_lots_selected, new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final CryptoOrderDetailTaxLotsViewState.SubtitleContent getSubtitle() {
        int i;
        int i2;
        Boolean bool = this.isConfirmed;
        if (bool == null) {
            return null;
        }
        boolean zBooleanValue = bool.booleanValue();
        BigDecimal bigDecimal = this.totalGainLossAmount;
        if (bigDecimal == null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            if (zBooleanValue) {
                i2 = C40095R.string.crypto_order_detail_tax_lots_total_realized_gain_or_loss;
            } else {
                if (zBooleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C40095R.string.crypto_order_detail_tax_lots_total_estimated_gain_or_loss;
            }
            return new CryptoOrderDetailTaxLotsViewState.SubtitleContent(companion.invoke(i2, new Object[0]), companion.invoke(C40095R.string.crypto_order_detail_tax_lots_gain_or_loss_not_available, new Object[0]), null, 4, null);
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        if (BigDecimals7.isNegative(bigDecimal)) {
            if (zBooleanValue) {
                i = C40095R.string.crypto_order_detail_tax_lots_total_realized_loss;
            } else {
                if (zBooleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C40095R.string.crypto_order_detail_tax_lots_total_estimated_loss;
            }
        } else if (zBooleanValue) {
            i = C40095R.string.crypto_order_detail_tax_lots_total_realized_gain;
        } else {
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            i = C40095R.string.crypto_order_detail_tax_lots_total_estimated_gain;
        }
        return new CryptoOrderDetailTaxLotsViewState.SubtitleContent(companion2.invoke(i, new Object[0]), companion2.invoke(CurrencyDefinitions.formatCurrency$default(this.quoteCurrency, bigDecimal, false, false, null, 0, null, Boolean.TRUE, true, true, false, false, 1598, null)), BigDecimals7.isNegative(bigDecimal) ? CryptoOrderDetailTaxLotsViewState.SubtitleContent.ColorOverride.NEGATIVE : CryptoOrderDetailTaxLotsViewState.SubtitleContent.ColorOverride.POSITIVE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TaxLotTableState<Unit> taxLotTableState(Resources resources) throws Resources.NotFoundException {
        TaxLotDisplayCellState.TextContent textContent;
        TaxLotDisplayCellState.TextContent textContent2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        List<OrderTaxLotDetailDto> list = this.taxLotDetails;
        if (list == null || list.isEmpty()) {
            return new TaxLotTableState.Loading(false, false);
        }
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C40095R.string.crypto_order_detail_tax_lots_date_header), Integer.valueOf(C40095R.string.crypto_order_detail_tax_lots_cost_per_unit_header), Integer.valueOf(C40095R.string.crypto_order_detail_tax_lots_gain_loss_header), Integer.valueOf(C40095R.string.crypto_order_detail_tax_lots_quantity_header)});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            String string2 = resources.getString(((Number) it.next()).intValue());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new TaxLotCell.HeaderCell(new TaxLotTableHeaderCellState(null, string2, null, 5, null)));
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        List<OrderTaxLotDetailDto> list2 = this.taxLotDetails;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (OrderTaxLotDetailDto orderTaxLotDetailDto : list2) {
            String id = orderTaxLotDetailDto.getId();
            DefaultConstructorMarker defaultConstructorMarker = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            TaxLotCell.DisplayCell displayCell = new TaxLotCell.DisplayCell(new TaxLotDisplayCellState(new TaxLotDisplayCellState.TextContent(orderTaxLotDetailDto.getDate(), null, null, 6, null), new TaxLotDisplayCellState.TextContent(TermTypeDtos2.getDisplayString(orderTaxLotDetailDto.getTerm_type()).getText(resources).toString(), objArr, null, 6, defaultConstructorMarker), TaxLotDisplayCellState.ContentAlignment.START, objArr2, false, 24, defaultConstructorMarker));
            IdlDecimal cost_per_unit = orderTaxLotDetailDto.getCost_per_unit();
            if (cost_per_unit != null) {
                textContent = new TaxLotDisplayCellState.TextContent(CurrencyDefinitions.formatCurrency$default(this.quoteCurrency, cost_per_unit.toBigDecimalOrThrow(), false, false, null, 0, null, null, false, false, false, false, 2046, null), null, null, 6, null);
            } else {
                String string3 = resources.getString(C40095R.string.crypto_order_detail_tax_lots_info_na);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                textContent = new TaxLotDisplayCellState.TextContent(string3, TaxLotDisplayCellState.ColorOverride.FG_2, null, 4, null);
            }
            TaxLotDisplayCellState.ContentAlignment contentAlignment = TaxLotDisplayCellState.ContentAlignment.END;
            TaxLotCell.DisplayCell displayCell2 = new TaxLotCell.DisplayCell(new TaxLotDisplayCellState(textContent, null, contentAlignment, null, false, 26, null));
            IdlDecimal gain_loss = orderTaxLotDetailDto.getGain_loss();
            if (gain_loss != null) {
                BigDecimal bigDecimalOrThrow = gain_loss.toBigDecimalOrThrow();
                textContent2 = new TaxLotDisplayCellState.TextContent(CurrencyDefinitions.formatCurrency$default(this.quoteCurrency, bigDecimalOrThrow, false, false, null, 0, null, Boolean.TRUE, true, true, false, false, 1598, null), BigDecimals7.isNegative(bigDecimalOrThrow) ? TaxLotDisplayCellState.ColorOverride.NEGATIVE : TaxLotDisplayCellState.ColorOverride.POSITIVE, null, 4, null);
            } else {
                String string4 = resources.getString(C40095R.string.crypto_order_detail_tax_lots_info_na);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                textContent2 = new TaxLotDisplayCellState.TextContent(string4, TaxLotDisplayCellState.ColorOverride.FG_2, null, 4, null);
            }
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            TaxLotDisplayCellState.ColorOverride colorOverride = null;
            arrayList2.add(new GenericRow(id, CollectionsKt.listOf((Object[]) new TaxLotCell.DisplayCell[]{displayCell, displayCell2, new TaxLotCell.DisplayCell(new TaxLotDisplayCellState(textContent2, null, contentAlignment, null, false, 26, defaultConstructorMarker2)), new TaxLotCell.DisplayCell(new TaxLotDisplayCellState(new TaxLotDisplayCellState.TextContent(CurrencyDefinitions.formatCurrency$default(this.assetCurrency, orderTaxLotDetailDto.getQuantity().toBigDecimalOrThrow(), false, false, null, 0, null, null, false, false, false, false, 2044, null), colorOverride, null, 6, defaultConstructorMarker2), null, contentAlignment, colorOverride, false, 26, defaultConstructorMarker2))}), false, null, null, 28, null));
        }
        return new TaxLotTableState.Loaded(new GenericTableData(persistentList, extensions2.toPersistentList(arrayList2)), null, this.nextCursor != null, 2, null);
    }
}
