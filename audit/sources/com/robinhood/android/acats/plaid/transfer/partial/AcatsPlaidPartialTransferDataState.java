package com.robinhood.android.acats.plaid.transfer.partial;

import com.robinhood.android.acats.C7376R;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import com.robinhood.models.api.bonfire.plaid.brokerassets.AcatsInBrokerAssetOptionPosition;
import com.robinhood.models.api.bonfire.plaid.brokerassets.AcatsInBrokerAssetOptionType;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: AcatsPlaidPartialTransferDataState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u00102\u001a\u00020/H\u0002J8\u00103\u001a\b\u0012\u0004\u0012\u0002040\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0002J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0002J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0002J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0002J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010A\u001a\u00020\u0014HÆ\u0003Jy\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0014HÖ\u0001J\t\u0010G\u001a\u00020HHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0013\u0010.\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;", "", "plaidBrokerAssets", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;", "cashAsset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;", "marginCashAsset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$MarginCashAssetWithAdjustment;", "equityAssets", "", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$EquityAssetWithAdjustment;", "optionAssets", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$OptionAssetWithAdjustment;", "filterState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;", "editState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "removeAssetConfirmationState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "unsupportedAssetCount", "", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$MarginCashAssetWithAdjustment;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;I)V", "getPlaidBrokerAssets", "()Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;", "getCashAsset", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$CashAssetWithAdjustment;", "getMarginCashAsset", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType$MarginCashAssetWithAdjustment;", "getEquityAssets", "()Ljava/util/List;", "getOptionAssets", "getFilterState", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;", "getEditState", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "getRemoveAssetConfirmationState", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "getUnsupportedAssetCount", "()I", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "assetCount", "getAssetCount", "uiState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferUiState;", "getUiState", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferUiState;", "buildUiState", "buildSortDataUiState", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortData;", "cashAssets", "buildOptionsUiState", "buildEquityUiState", "buildCashUiState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AcatsPlaidPartialTransferDataState {
    public static final int $stable = 8;
    private final AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAsset;
    private final AcatsPlaidPartialTransferAssetRowData editState;
    private final List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> equityAssets;
    private final AcatsPlaidPartialTransferDuxo6 filterState;
    private final AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAsset;
    private final List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> optionAssets;
    private final PlaidBrokerAssets plaidBrokerAssets;
    private final AcatsPlaidPartialTransferDuxo3 removeAssetConfirmationState;
    private final int unsupportedAssetCount;

    /* compiled from: AcatsPlaidPartialTransferDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AcatsInBrokerAssetOptionType.values().length];
            try {
                iArr[AcatsInBrokerAssetOptionType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AcatsInBrokerAssetOptionType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AcatsInBrokerAssetOptionType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AcatsInBrokerAssetOptionPosition.values().length];
            try {
                iArr2[AcatsInBrokerAssetOptionPosition.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AcatsInBrokerAssetOptionPosition.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AcatsInBrokerAssetOptionPosition.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AcatsPlaidPartialTransferDataState() {
        this(null, null, null, null, null, null, null, null, 0, 511, null);
    }

    public static /* synthetic */ AcatsPlaidPartialTransferDataState copy$default(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, PlaidBrokerAssets plaidBrokerAssets, AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment, AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment, List list, List list2, AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            plaidBrokerAssets = acatsPlaidPartialTransferDataState.plaidBrokerAssets;
        }
        if ((i2 & 2) != 0) {
            cashAssetWithAdjustment = acatsPlaidPartialTransferDataState.cashAsset;
        }
        if ((i2 & 4) != 0) {
            marginCashAssetWithAdjustment = acatsPlaidPartialTransferDataState.marginCashAsset;
        }
        if ((i2 & 8) != 0) {
            list = acatsPlaidPartialTransferDataState.equityAssets;
        }
        if ((i2 & 16) != 0) {
            list2 = acatsPlaidPartialTransferDataState.optionAssets;
        }
        if ((i2 & 32) != 0) {
            acatsPlaidPartialTransferDuxo6 = acatsPlaidPartialTransferDataState.filterState;
        }
        if ((i2 & 64) != 0) {
            acatsPlaidPartialTransferAssetRowData = acatsPlaidPartialTransferDataState.editState;
        }
        if ((i2 & 128) != 0) {
            acatsPlaidPartialTransferDuxo3 = acatsPlaidPartialTransferDataState.removeAssetConfirmationState;
        }
        if ((i2 & 256) != 0) {
            i = acatsPlaidPartialTransferDataState.unsupportedAssetCount;
        }
        AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo32 = acatsPlaidPartialTransferDuxo3;
        int i3 = i;
        AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo62 = acatsPlaidPartialTransferDuxo6;
        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData2 = acatsPlaidPartialTransferAssetRowData;
        List list3 = list2;
        AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment2 = marginCashAssetWithAdjustment;
        return acatsPlaidPartialTransferDataState.copy(plaidBrokerAssets, cashAssetWithAdjustment, marginCashAssetWithAdjustment2, list, list3, acatsPlaidPartialTransferDuxo62, acatsPlaidPartialTransferAssetRowData2, acatsPlaidPartialTransferDuxo32, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final PlaidBrokerAssets getPlaidBrokerAssets() {
        return this.plaidBrokerAssets;
    }

    /* renamed from: component2, reason: from getter */
    public final AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment getCashAsset() {
        return this.cashAsset;
    }

    /* renamed from: component3, reason: from getter */
    public final AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment getMarginCashAsset() {
        return this.marginCashAsset;
    }

    public final List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> component4() {
        return this.equityAssets;
    }

    public final List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> component5() {
        return this.optionAssets;
    }

    /* renamed from: component6, reason: from getter */
    public final AcatsPlaidPartialTransferDuxo6 getFilterState() {
        return this.filterState;
    }

    /* renamed from: component7, reason: from getter */
    public final AcatsPlaidPartialTransferAssetRowData getEditState() {
        return this.editState;
    }

    /* renamed from: component8, reason: from getter */
    public final AcatsPlaidPartialTransferDuxo3 getRemoveAssetConfirmationState() {
        return this.removeAssetConfirmationState;
    }

    /* renamed from: component9, reason: from getter */
    public final int getUnsupportedAssetCount() {
        return this.unsupportedAssetCount;
    }

    public final AcatsPlaidPartialTransferDataState copy(PlaidBrokerAssets plaidBrokerAssets, AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAsset, AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAsset, List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> equityAssets, List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> optionAssets, AcatsPlaidPartialTransferDuxo6 filterState, AcatsPlaidPartialTransferAssetRowData editState, AcatsPlaidPartialTransferDuxo3 removeAssetConfirmationState, int unsupportedAssetCount) {
        Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
        Intrinsics.checkNotNullParameter(optionAssets, "optionAssets");
        Intrinsics.checkNotNullParameter(filterState, "filterState");
        return new AcatsPlaidPartialTransferDataState(plaidBrokerAssets, cashAsset, marginCashAsset, equityAssets, optionAssets, filterState, editState, removeAssetConfirmationState, unsupportedAssetCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsPlaidPartialTransferDataState)) {
            return false;
        }
        AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState = (AcatsPlaidPartialTransferDataState) other;
        return Intrinsics.areEqual(this.plaidBrokerAssets, acatsPlaidPartialTransferDataState.plaidBrokerAssets) && Intrinsics.areEqual(this.cashAsset, acatsPlaidPartialTransferDataState.cashAsset) && Intrinsics.areEqual(this.marginCashAsset, acatsPlaidPartialTransferDataState.marginCashAsset) && Intrinsics.areEqual(this.equityAssets, acatsPlaidPartialTransferDataState.equityAssets) && Intrinsics.areEqual(this.optionAssets, acatsPlaidPartialTransferDataState.optionAssets) && this.filterState == acatsPlaidPartialTransferDataState.filterState && Intrinsics.areEqual(this.editState, acatsPlaidPartialTransferDataState.editState) && Intrinsics.areEqual(this.removeAssetConfirmationState, acatsPlaidPartialTransferDataState.removeAssetConfirmationState) && this.unsupportedAssetCount == acatsPlaidPartialTransferDataState.unsupportedAssetCount;
    }

    public int hashCode() {
        PlaidBrokerAssets plaidBrokerAssets = this.plaidBrokerAssets;
        int iHashCode = (plaidBrokerAssets == null ? 0 : plaidBrokerAssets.hashCode()) * 31;
        AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment = this.cashAsset;
        int iHashCode2 = (iHashCode + (cashAssetWithAdjustment == null ? 0 : cashAssetWithAdjustment.hashCode())) * 31;
        AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment = this.marginCashAsset;
        int iHashCode3 = (((((((iHashCode2 + (marginCashAssetWithAdjustment == null ? 0 : marginCashAssetWithAdjustment.hashCode())) * 31) + this.equityAssets.hashCode()) * 31) + this.optionAssets.hashCode()) * 31) + this.filterState.hashCode()) * 31;
        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = this.editState;
        int iHashCode4 = (iHashCode3 + (acatsPlaidPartialTransferAssetRowData == null ? 0 : acatsPlaidPartialTransferAssetRowData.hashCode())) * 31;
        AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3 = this.removeAssetConfirmationState;
        return ((iHashCode4 + (acatsPlaidPartialTransferDuxo3 != null ? acatsPlaidPartialTransferDuxo3.hashCode() : 0)) * 31) + Integer.hashCode(this.unsupportedAssetCount);
    }

    public String toString() {
        return "AcatsPlaidPartialTransferDataState(plaidBrokerAssets=" + this.plaidBrokerAssets + ", cashAsset=" + this.cashAsset + ", marginCashAsset=" + this.marginCashAsset + ", equityAssets=" + this.equityAssets + ", optionAssets=" + this.optionAssets + ", filterState=" + this.filterState + ", editState=" + this.editState + ", removeAssetConfirmationState=" + this.removeAssetConfirmationState + ", unsupportedAssetCount=" + this.unsupportedAssetCount + ")";
    }

    public AcatsPlaidPartialTransferDataState(PlaidBrokerAssets plaidBrokerAssets, AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment, AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment, List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> equityAssets, List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> optionAssets, AcatsPlaidPartialTransferDuxo6 filterState, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3, int i) {
        Intrinsics.checkNotNullParameter(equityAssets, "equityAssets");
        Intrinsics.checkNotNullParameter(optionAssets, "optionAssets");
        Intrinsics.checkNotNullParameter(filterState, "filterState");
        this.plaidBrokerAssets = plaidBrokerAssets;
        this.cashAsset = cashAssetWithAdjustment;
        this.marginCashAsset = marginCashAssetWithAdjustment;
        this.equityAssets = equityAssets;
        this.optionAssets = optionAssets;
        this.filterState = filterState;
        this.editState = acatsPlaidPartialTransferAssetRowData;
        this.removeAssetConfirmationState = acatsPlaidPartialTransferDuxo3;
        this.unsupportedAssetCount = i;
    }

    public final PlaidBrokerAssets getPlaidBrokerAssets() {
        return this.plaidBrokerAssets;
    }

    public final AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment getCashAsset() {
        return this.cashAsset;
    }

    public final AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment getMarginCashAsset() {
        return this.marginCashAsset;
    }

    public /* synthetic */ AcatsPlaidPartialTransferDataState(PlaidBrokerAssets plaidBrokerAssets, AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment, AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment, List list, List list2, AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : plaidBrokerAssets, (i2 & 2) != 0 ? null : cashAssetWithAdjustment, (i2 & 4) != 0 ? null : marginCashAssetWithAdjustment, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 32) != 0 ? AcatsPlaidPartialTransferDuxo6.ALL : acatsPlaidPartialTransferDuxo6, (i2 & 64) != 0 ? null : acatsPlaidPartialTransferAssetRowData, (i2 & 128) != 0 ? null : acatsPlaidPartialTransferDuxo3, (i2 & 256) != 0 ? 0 : i);
    }

    public final List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> getEquityAssets() {
        return this.equityAssets;
    }

    public final List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> getOptionAssets() {
        return this.optionAssets;
    }

    public final AcatsPlaidPartialTransferDuxo6 getFilterState() {
        return this.filterState;
    }

    public final AcatsPlaidPartialTransferAssetRowData getEditState() {
        return this.editState;
    }

    public final AcatsPlaidPartialTransferDuxo3 getRemoveAssetConfirmationState() {
        return this.removeAssetConfirmationState;
    }

    public final int getUnsupportedAssetCount() {
        return this.unsupportedAssetCount;
    }

    public final StringResource getToolbarTitle() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = this.editState;
        AcatsPlaidPartialTransferDuxo3 type2 = acatsPlaidPartialTransferAssetRowData != null ? acatsPlaidPartialTransferAssetRowData.getType() : null;
        if (type2 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) {
            i = C7376R.string.acats_plaid_partial_transfer_edit_cash_balance;
        } else if (type2 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
            i = C7376R.string.acats_plaid_partial_transfer_edit_stock_etfs;
        } else if (type2 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) {
            i = C7376R.string.acats_plaid_partial_transfer_edit_margin_balance;
        } else if (type2 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) {
            i = C7686R.string.acats_in_edit_option_title;
        } else {
            i = C7686R.string.assets_label;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final int getAssetCount() {
        int size = this.equityAssets.size() + this.optionAssets.size();
        if (this.cashAsset != null) {
            size++;
        }
        return this.marginCashAsset != null ? size + 1 : size;
    }

    public final AcatsPlaidPartialTransferUiState getUiState() {
        if (this.plaidBrokerAssets != null) {
            return buildUiState();
        }
        return null;
    }

    private final AcatsPlaidPartialTransferUiState buildUiState() {
        List<AcatsPlaidPartialTransferAssetRowData> listBuildCashUiState = buildCashUiState();
        List<AcatsPlaidPartialTransferAssetRowData> listBuildEquityUiState = buildEquityUiState();
        List<AcatsPlaidPartialTransferAssetRowData> listBuildOptionsUiState = buildOptionsUiState();
        return new AcatsPlaidPartialTransferUiState(listBuildCashUiState, listBuildEquityUiState, listBuildOptionsUiState, buildSortDataUiState(listBuildCashUiState, listBuildEquityUiState, listBuildOptionsUiState), this.unsupportedAssetCount);
    }

    private final List<AcatsPlaidPartialTransferSortData> buildSortDataUiState(List<AcatsPlaidPartialTransferAssetRowData> cashAssets, List<AcatsPlaidPartialTransferAssetRowData> equityAssets, List<AcatsPlaidPartialTransferAssetRowData> optionAssets) {
        ArrayList arrayList = new ArrayList();
        if (!cashAssets.isEmpty()) {
            arrayList.add(new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.CASH, StringResource.INSTANCE.invoke(C7376R.string.acats_plaid_partial_cash_sort_chip, new Object[0])));
        }
        if (!equityAssets.isEmpty()) {
            arrayList.add(new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.STOCKS_ETFS, StringResource.INSTANCE.invoke(C7686R.string.acats_in_build_partial_equity_header, new Object[0])));
        }
        if (!optionAssets.isEmpty()) {
            arrayList.add(new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.OPTIONS, StringResource.INSTANCE.invoke(C7686R.string.acats_in_build_partial_options_header, new Object[0])));
        }
        if (arrayList.size() < 2) {
            return CollectionsKt.emptyList();
        }
        arrayList.add(0, new AcatsPlaidPartialTransferSortData(AcatsPlaidPartialTransferDuxo6.ALL, StringResource.INSTANCE.invoke(C7686R.string.acats_in_build_partial_all_assets_chip, new Object[0])));
        return arrayList;
    }

    private final List<AcatsPlaidPartialTransferAssetRowData> buildOptionsUiState() {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        StringResource stringResourceInvoke3;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> listSortedWith = CollectionsKt.sortedWith(this.optionAssets, new Comparator() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDataState$buildOptionsUiState$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) t).getOptionsAsset().getName(), ((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) t2).getOptionsAsset().getName());
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment optionAssetWithAdjustment : listSortedWith) {
            int i = WhenMappings.$EnumSwitchMapping$0[optionAssetWithAdjustment.getOptionsAsset().getType().ordinal()];
            if (i == 1) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i2 = C7686R.string.acats_in_build_partial_options_title_call;
                String name = optionAssetWithAdjustment.getOptionsAsset().getName();
                Money strikePrice = optionAssetWithAdjustment.getOptionsAsset().getStrikePrice();
                stringResourceInvoke = companion.invoke(i2, name, strikePrice != null ? Format2.format(strikePrice) : null);
            } else if (i == 2) {
                StringResource.Companion companion2 = StringResource.INSTANCE;
                int i3 = C7686R.string.acats_in_build_partial_options_title_put;
                String name2 = optionAssetWithAdjustment.getOptionsAsset().getName();
                Money strikePrice2 = optionAssetWithAdjustment.getOptionsAsset().getStrikePrice();
                stringResourceInvoke = companion2.invoke(i3, name2, strikePrice2 != null ? Format2.format(strikePrice2) : null);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke("");
            }
            int i4 = WhenMappings.$EnumSwitchMapping$1[optionAssetWithAdjustment.getOptionsAsset().getPosition().ordinal()];
            if (i4 == 1) {
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C7376R.string.acats_plaid_partial_options_expiration_contracts_long, dateTimeFormatterOfPattern.format(optionAssetWithAdjustment.getOptionsAsset().getExpirationDate()), Integer.valueOf(optionAssetWithAdjustment.getOptionsAsset().getQuantity().intValue()));
            } else if (i4 == 2) {
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C7376R.string.acats_plaid_partial_options_expiration_contracts_short, dateTimeFormatterOfPattern.format(optionAssetWithAdjustment.getOptionsAsset().getExpirationDate()), Integer.valueOf(optionAssetWithAdjustment.getOptionsAsset().getQuantity().intValue()));
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                stringResourceInvoke2 = StringResource.INSTANCE.invoke("");
            }
            if (Intrinsics.areEqual(optionAssetWithAdjustment.getOptionsAsset().getQuantity(), optionAssetWithAdjustment.getAdjustableQuantity())) {
                stringResourceInvoke3 = StringResource.INSTANCE.invoke(C7686R.string.acats_in_build_partial_options_all_contracts, new Object[0]);
            } else {
                stringResourceInvoke3 = StringResource.INSTANCE.invoke(C7686R.string.acats_in_build_partial_options_numerical_contracts, Integer.valueOf(optionAssetWithAdjustment.getAdjustableQuantity().intValue()));
            }
            arrayList.add(new AcatsPlaidPartialTransferAssetRowData(optionAssetWithAdjustment, stringResourceInvoke, stringResourceInvoke2, stringResourceInvoke3));
        }
        return arrayList;
    }

    private final List<AcatsPlaidPartialTransferAssetRowData> buildEquityUiState() {
        StringResource stringResourceInvoke;
        List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> listSortedWith = CollectionsKt.sortedWith(this.equityAssets, new Comparator() { // from class: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDataState$buildEquityUiState$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) t).getEquityAsset().getName(), ((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) t2).getEquityAsset().getName());
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment equityAssetWithAdjustment : listSortedWith) {
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke2 = companion.invoke(equityAssetWithAdjustment.getEquityAsset().getName());
            StringResource stringResourceInvoke3 = companion.invoke(C7686R.string.acats_in_build_partial_equity_numerical_shares, Integer.valueOf(equityAssetWithAdjustment.getEquityAsset().getQuantity().intValue()));
            if (Intrinsics.areEqual(equityAssetWithAdjustment.getEquityAsset().getQuantity(), equityAssetWithAdjustment.getAdjustableQuantity())) {
                stringResourceInvoke = companion.invoke(C7686R.string.acats_in_build_partial_equity_all_shares, new Object[0]);
            } else {
                stringResourceInvoke = companion.invoke(C7686R.string.acats_in_build_partial_equity_numerical_shares, Integer.valueOf(equityAssetWithAdjustment.getAdjustableQuantity().intValue()));
            }
            arrayList.add(new AcatsPlaidPartialTransferAssetRowData(equityAssetWithAdjustment, stringResourceInvoke2, stringResourceInvoke3, stringResourceInvoke));
        }
        return arrayList;
    }

    private final List<AcatsPlaidPartialTransferAssetRowData> buildCashUiState() {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        ArrayList arrayList = new ArrayList();
        if (this.cashAsset != null) {
            AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment = this.cashAsset;
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke3 = companion.invoke(C7686R.string.acats_in_cash_input_cash_row_text, new Object[0]);
            StringResource stringResourceInvoke4 = companion.invoke(Format2.format(this.cashAsset.getOriginalCashBalance()));
            if (Intrinsics.areEqual(this.cashAsset.getOriginalCashBalance().getAmount(), this.cashAsset.getAdjustableCashBalance().getAmount())) {
                stringResourceInvoke2 = companion.invoke(C7686R.string.acats_in_cash_input_entire_balance, new Object[0]);
            } else {
                stringResourceInvoke2 = companion.invoke(Format2.format(this.cashAsset.getAdjustableCashBalance()));
            }
            arrayList.add(new AcatsPlaidPartialTransferAssetRowData(cashAssetWithAdjustment, stringResourceInvoke3, stringResourceInvoke4, stringResourceInvoke2));
        }
        if (this.marginCashAsset != null) {
            AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment = this.marginCashAsset;
            StringResource.Companion companion2 = StringResource.INSTANCE;
            StringResource stringResourceInvoke5 = companion2.invoke(C7686R.string.acats_in_cash_input_margin_row_text, new Object[0]);
            StringResource stringResourceInvoke6 = companion2.invoke(Format2.format(this.marginCashAsset.getOriginalMarginCashBalance()));
            if (Intrinsics.areEqual(this.marginCashAsset.getOriginalMarginCashBalance().getAmount(), this.marginCashAsset.getAdjustableMarginCashBalance().getAmount())) {
                stringResourceInvoke = companion2.invoke(C7686R.string.acats_in_cash_input_entire_balance, new Object[0]);
            } else {
                stringResourceInvoke = companion2.invoke(Format2.format(this.marginCashAsset.getAdjustableMarginCashBalance()));
            }
            arrayList.add(new AcatsPlaidPartialTransferAssetRowData(marginCashAssetWithAdjustment, stringResourceInvoke5, stringResourceInvoke6, stringResourceInvoke));
        }
        return arrayList;
    }
}
