package com.robinhood.android.acats.plaid.transfer.partial;

import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidPartialTransferDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0014\u001a\u00020\u0011J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "", "type", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "metaText", "<init>", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getType", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "getMetaText", "composeKey", "", "getComposeKey", "()Ljava/lang/String;", "editLoggingIdentifier", "shouldShowPositionInformation", "", "getShouldShowPositionInformation", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsPlaidPartialTransferAssetRowData {
    public static final int $stable = 0;
    private final StringResource metaText;
    private final StringResource primaryText;
    private final StringResource secondaryText;
    private final AcatsPlaidPartialTransferDuxo3 type;

    public static /* synthetic */ AcatsPlaidPartialTransferAssetRowData copy$default(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, int i, Object obj) {
        if ((i & 1) != 0) {
            acatsPlaidPartialTransferDuxo3 = acatsPlaidPartialTransferAssetRowData.type;
        }
        if ((i & 2) != 0) {
            stringResource = acatsPlaidPartialTransferAssetRowData.primaryText;
        }
        if ((i & 4) != 0) {
            stringResource2 = acatsPlaidPartialTransferAssetRowData.secondaryText;
        }
        if ((i & 8) != 0) {
            stringResource3 = acatsPlaidPartialTransferAssetRowData.metaText;
        }
        return acatsPlaidPartialTransferAssetRowData.copy(acatsPlaidPartialTransferDuxo3, stringResource, stringResource2, stringResource3);
    }

    /* renamed from: component1, reason: from getter */
    public final AcatsPlaidPartialTransferDuxo3 getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getMetaText() {
        return this.metaText;
    }

    public final AcatsPlaidPartialTransferAssetRowData copy(AcatsPlaidPartialTransferDuxo3 type2, StringResource primaryText, StringResource secondaryText, StringResource metaText) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(metaText, "metaText");
        return new AcatsPlaidPartialTransferAssetRowData(type2, primaryText, secondaryText, metaText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsPlaidPartialTransferAssetRowData)) {
            return false;
        }
        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = (AcatsPlaidPartialTransferAssetRowData) other;
        return Intrinsics.areEqual(this.type, acatsPlaidPartialTransferAssetRowData.type) && Intrinsics.areEqual(this.primaryText, acatsPlaidPartialTransferAssetRowData.primaryText) && Intrinsics.areEqual(this.secondaryText, acatsPlaidPartialTransferAssetRowData.secondaryText) && Intrinsics.areEqual(this.metaText, acatsPlaidPartialTransferAssetRowData.metaText);
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + this.metaText.hashCode();
    }

    public String toString() {
        return "AcatsPlaidPartialTransferAssetRowData(type=" + this.type + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", metaText=" + this.metaText + ")";
    }

    public AcatsPlaidPartialTransferAssetRowData(AcatsPlaidPartialTransferDuxo3 type2, StringResource primaryText, StringResource secondaryText, StringResource metaText) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(metaText, "metaText");
        this.type = type2;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.metaText = metaText;
    }

    public final AcatsPlaidPartialTransferDuxo3 getType() {
        return this.type;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final StringResource getMetaText() {
        return this.metaText;
    }

    public final String getComposeKey() {
        AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3 = this.type;
        if (acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) {
            return "cash-" + this.primaryText.hashCode();
        }
        if (acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) {
            return "margin-" + this.primaryText.hashCode();
        }
        if (acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
            AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment equityAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) acatsPlaidPartialTransferDuxo3;
            return equityAssetWithAdjustment.getEquityAsset().getInstrumentId() + "-" + equityAssetWithAdjustment.getEquityAsset().getQuantity();
        }
        if (!(acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
            throw new NoWhenBranchMatchedException();
        }
        AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment optionAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) acatsPlaidPartialTransferDuxo3;
        return optionAssetWithAdjustment.getOptionsAsset().getChainId() + "-" + optionAssetWithAdjustment.getOptionsAsset().getQuantity();
    }

    public final String editLoggingIdentifier() {
        String name;
        AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3 = this.type;
        String str = "balance";
        if (!(acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) && !(acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment)) {
            if (acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
                str = ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY;
            } else {
                if (!(acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION;
            }
        }
        if (acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) {
            name = AnalyticsStrings.BUTTON_GROUP_TITLE_CASH;
        } else if (acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) {
            name = GoldFeature.MARGIN;
        } else if (acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
            name = ((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) acatsPlaidPartialTransferDuxo3).getEquityAsset().getName();
        } else {
            if (!(acatsPlaidPartialTransferDuxo3 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
                throw new NoWhenBranchMatchedException();
            }
            name = ((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) acatsPlaidPartialTransferDuxo3).getOptionsAsset().getName();
        }
        return "edit-" + str + "-" + name;
    }

    public final boolean getShouldShowPositionInformation() {
        return this.type instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment;
    }
}
