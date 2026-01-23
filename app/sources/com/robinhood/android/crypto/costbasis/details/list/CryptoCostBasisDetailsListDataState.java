package com.robinhood.android.crypto.costbasis.details.list;

import com.robinhood.android.crypto.costbasis.C12782R;
import com.robinhood.android.crypto.costbasis.details.entry.CostBasisEntryArgs;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.models.crypto.p314db.costbasis.CryptoCostBasisDetails;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import nummus.p512v1.CostBasisLotDto;
import nummus.p512v1.CostBasisLotsSummaryDto;
import nummus.p512v1.GetCostBasisDetailsResponseDto;
import p479j$.time.Instant;

/* compiled from: CryptoCostBasisDetailsListDataState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010&\u001a\u00020\u0003HÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010*\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00058G¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListDataState;", "", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "costBasisDetails", "Lcom/robinhood/models/crypto/db/costbasis/CryptoCostBasisDetails;", "<init>", "(Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/costbasis/CryptoCostBasisDetails;)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCostBasisDetails", "()Lcom/robinhood/models/crypto/db/costbasis/CryptoCostBasisDetails;", "isLoading", "", "()Z", "isCompleted", "()Ljava/lang/Boolean;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "spannedSubtitle", "getSpannedSubtitle", "breakdownCardState", "Lcom/robinhood/android/crypto/costbasis/details/list/BreakdownCardState;", "getBreakdownCardState", "()Lcom/robinhood/android/crypto/costbasis/details/list/BreakdownCardState;", "lots", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/costbasis/details/list/CostBasisLotRowData;", "getLots", "()Lkotlinx/collections/immutable/ImmutableList;", "passthroughArgs", "Lcom/robinhood/android/crypto/costbasis/details/entry/CostBasisEntryArgs;", "getPassthroughArgs", "()Lcom/robinhood/android/crypto/costbasis/details/entry/CostBasisEntryArgs;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoCostBasisDetailsListDataState {
    private static final String BOTTOM_SHEET_FIELD_KEY_AVAILABLE_QUANTITY = "available_quantity";
    private final CryptoCostBasisDetails costBasisDetails;
    private final UiCurrencyPair currencyPair;
    private final LocalizedDateTimeFormatter localizedDateTimeFormatter;
    public static final int $stable = 8;

    /* renamed from: component1, reason: from getter */
    private final LocalizedDateTimeFormatter getLocalizedDateTimeFormatter() {
        return this.localizedDateTimeFormatter;
    }

    public static /* synthetic */ CryptoCostBasisDetailsListDataState copy$default(CryptoCostBasisDetailsListDataState cryptoCostBasisDetailsListDataState, LocalizedDateTimeFormatter localizedDateTimeFormatter, UiCurrencyPair uiCurrencyPair, CryptoCostBasisDetails cryptoCostBasisDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            localizedDateTimeFormatter = cryptoCostBasisDetailsListDataState.localizedDateTimeFormatter;
        }
        if ((i & 2) != 0) {
            uiCurrencyPair = cryptoCostBasisDetailsListDataState.currencyPair;
        }
        if ((i & 4) != 0) {
            cryptoCostBasisDetails = cryptoCostBasisDetailsListDataState.costBasisDetails;
        }
        return cryptoCostBasisDetailsListDataState.copy(localizedDateTimeFormatter, uiCurrencyPair, cryptoCostBasisDetails);
    }

    /* renamed from: component2, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoCostBasisDetails getCostBasisDetails() {
        return this.costBasisDetails;
    }

    public final CryptoCostBasisDetailsListDataState copy(LocalizedDateTimeFormatter localizedDateTimeFormatter, UiCurrencyPair currencyPair, CryptoCostBasisDetails costBasisDetails) {
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        return new CryptoCostBasisDetailsListDataState(localizedDateTimeFormatter, currencyPair, costBasisDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCostBasisDetailsListDataState)) {
            return false;
        }
        CryptoCostBasisDetailsListDataState cryptoCostBasisDetailsListDataState = (CryptoCostBasisDetailsListDataState) other;
        return Intrinsics.areEqual(this.localizedDateTimeFormatter, cryptoCostBasisDetailsListDataState.localizedDateTimeFormatter) && Intrinsics.areEqual(this.currencyPair, cryptoCostBasisDetailsListDataState.currencyPair) && Intrinsics.areEqual(this.costBasisDetails, cryptoCostBasisDetailsListDataState.costBasisDetails);
    }

    public int hashCode() {
        int iHashCode = this.localizedDateTimeFormatter.hashCode() * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode2 = (iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        CryptoCostBasisDetails cryptoCostBasisDetails = this.costBasisDetails;
        return iHashCode2 + (cryptoCostBasisDetails != null ? cryptoCostBasisDetails.hashCode() : 0);
    }

    public String toString() {
        return "CryptoCostBasisDetailsListDataState(localizedDateTimeFormatter=" + this.localizedDateTimeFormatter + ", currencyPair=" + this.currencyPair + ", costBasisDetails=" + this.costBasisDetails + ")";
    }

    public CryptoCostBasisDetailsListDataState(LocalizedDateTimeFormatter localizedDateTimeFormatter, UiCurrencyPair uiCurrencyPair, CryptoCostBasisDetails cryptoCostBasisDetails) {
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.currencyPair = uiCurrencyPair;
        this.costBasisDetails = cryptoCostBasisDetails;
    }

    public /* synthetic */ CryptoCostBasisDetailsListDataState(LocalizedDateTimeFormatter localizedDateTimeFormatter, UiCurrencyPair uiCurrencyPair, CryptoCostBasisDetails cryptoCostBasisDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(localizedDateTimeFormatter, (i & 2) != 0 ? null : uiCurrencyPair, (i & 4) != 0 ? null : cryptoCostBasisDetails);
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final CryptoCostBasisDetails getCostBasisDetails() {
        return this.costBasisDetails;
    }

    public final boolean isLoading() {
        return this.costBasisDetails == null;
    }

    public final Boolean isCompleted() {
        GetCostBasisDetailsResponseDto proto;
        CostBasisLotsSummaryDto summary;
        CryptoCostBasisDetails cryptoCostBasisDetails = this.costBasisDetails;
        if (cryptoCostBasisDetails == null || (proto = cryptoCostBasisDetails.getProto()) == null || (summary = proto.getSummary()) == null) {
            return null;
        }
        return Boolean.valueOf(summary.getCompleted());
    }

    public final StringResource getTitle() {
        Boolean boolIsCompleted = isCompleted();
        return Intrinsics.areEqual(boolIsCompleted, Boolean.TRUE) ? StringResource.INSTANCE.invoke(C12782R.string.cost_basis_details_list_title_complete, new Object[0]) : Intrinsics.areEqual(boolIsCompleted, Boolean.FALSE) ? StringResource.INSTANCE.invoke(C12782R.string.cost_basis_details_list_title_incomplete, new Object[0]) : StringResource.INSTANCE.invoke("---------------");
    }

    public final StringResource getSpannedSubtitle() {
        Boolean boolIsCompleted = isCompleted();
        return Intrinsics.areEqual(boolIsCompleted, Boolean.TRUE) ? StringResource.INSTANCE.invoke(C12782R.string.cost_basis_details_list_subtitle_complete, new Object[0]) : Intrinsics.areEqual(boolIsCompleted, Boolean.FALSE) ? StringResource.INSTANCE.invoke(C12782R.string.cost_basis_details_list_subtitle_incomplete, new Object[0]) : StringResource.INSTANCE.invoke("---------------------------------------------");
    }

    public final BreakdownCardState getBreakdownCardState() {
        GetCostBasisDetailsResponseDto proto;
        GetCostBasisDetailsResponseDto proto2;
        CryptoCostBasisDetails cryptoCostBasisDetails = this.costBasisDetails;
        Instant deposit_date = (cryptoCostBasisDetails == null || (proto2 = cryptoCostBasisDetails.getProto()) == null) ? null : proto2.getDeposit_date();
        CryptoCostBasisDetails cryptoCostBasisDetails2 = this.costBasisDetails;
        CostBasisLotsSummaryDto summary = (cryptoCostBasisDetails2 == null || (proto = cryptoCostBasisDetails2.getProto()) == null) ? null : proto.getSummary();
        if (this.costBasisDetails == null || this.currencyPair == null || deposit_date == null || summary == null) {
            return null;
        }
        return new BreakdownCardState(StringResource.INSTANCE.invoke(C12782R.string.cost_basis_details_list_deposited_on_label, this.localizedDateTimeFormatter.format(deposit_date, LocalizedDateTimeFormatter.Format.ShortDate.INSTANCE)), CurrencyDefinitions.formatCurrency$default(this.currencyPair.getAssetCurrency(), summary.getTotal_quantity().toBigDecimalOrThrow(), false, false, null, 0, null, null, false, false, false, false, 2026, null), CurrencyDefinitions.formatCurrency$default(this.currencyPair.getAssetCurrency(), summary.getAvailable_quantity().toBigDecimalOrThrow(), false, false, null, 0, null, null, false, false, false, false, 2026, null), CurrencyDefinitions.formatCurrency$default(this.currencyPair.getAssetCurrency(), summary.getClosed_quantity().toBigDecimalOrThrow(), false, false, null, 0, null, null, false, false, false, false, 2026, null), this.costBasisDetails.getProto().getBottom_sheets().get(BOTTOM_SHEET_FIELD_KEY_AVAILABLE_QUANTITY));
    }

    public final ImmutableList<CostBasisLotRowData> getLots() {
        GetCostBasisDetailsResponseDto proto;
        List<CostBasisLotDto> lots;
        String str;
        CryptoCostBasisDetails cryptoCostBasisDetails = this.costBasisDetails;
        if (cryptoCostBasisDetails != null && (proto = cryptoCostBasisDetails.getProto()) != null && (lots = proto.getLots()) != null) {
            List<CostBasisLotDto> list = lots;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CostBasisLotDto costBasisLotDto : list) {
                String lot_id = costBasisLotDto.getLot_id();
                String display_title = costBasisLotDto.getDisplay_title();
                String display_subtitle = costBasisLotDto.getDisplay_subtitle();
                Instant acquisition_date = costBasisLotDto.getAcquisition_date();
                if (acquisition_date == null || (str = this.localizedDateTimeFormatter.format(acquisition_date, LocalizedDateTimeFormatter.Format.ShortDate.INSTANCE)) == null) {
                    str = "";
                }
                arrayList.add(new CostBasisLotRowData(lot_id, display_title, display_subtitle, str));
            }
            ImmutableList<CostBasisLotRowData> immutableList = extensions2.toImmutableList(arrayList);
            if (immutableList != null) {
                return immutableList;
            }
        }
        return extensions2.persistentListOf();
    }

    public final CostBasisEntryArgs getPassthroughArgs() {
        CryptoCostBasisDetails cryptoCostBasisDetails = this.costBasisDetails;
        if (cryptoCostBasisDetails != null) {
            return new CostBasisEntryArgs(cryptoCostBasisDetails.getAccountId(), cryptoCostBasisDetails.getSourceId(), cryptoCostBasisDetails.getSourceType());
        }
        return null;
    }
}
