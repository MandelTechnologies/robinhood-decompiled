package com.robinhood.android.advisory.dashboard.deposit;

import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard;
import com.robinhood.models.p355ui.bonfire.dashboardsection.UiGetDepositsSummaryRow;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: DashboardDepositsViewState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jg\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsViewState;", "", "lastDepositValueText", "Lcom/robinhood/utils/resource/StringResource;", "nextDepositValueText", "recurringDepositToSelection", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "transferConfig", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "goldValuePropsPillTitle", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "depositSummaryRows", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/ui/bonfire/dashboardsection/UiGetDepositsSummaryRow;", "promoCardLocation", "Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard$Alignment;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Context;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard$Alignment;)V", "getLastDepositValueText", "()Lcom/robinhood/utils/resource/StringResource;", "getNextDepositValueText", "getRecurringDepositToSelection", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "getTransferConfig", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "getGoldValuePropsPillTitle", "()Ljava/lang/String;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getDepositSummaryRows", "()Lkotlinx/collections/immutable/PersistentList;", "getPromoCardLocation", "()Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard$Alignment;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DashboardDepositsViewState {
    public static final int $stable = 8;
    private final ImmutableList3<UiGetDepositsSummaryRow> depositSummaryRows;
    private final Context eventContext;
    private final String goldValuePropsPillTitle;
    private final StringResource lastDepositValueText;
    private final StringResource nextDepositValueText;
    private final StrategiesDashboardCard.Alignment promoCardLocation;
    private final TransferConfiguration.TransferAccountSelection recurringDepositToSelection;
    private final TransferConfiguration transferConfig;

    public static /* synthetic */ DashboardDepositsViewState copy$default(DashboardDepositsViewState dashboardDepositsViewState, StringResource stringResource, StringResource stringResource2, TransferConfiguration.TransferAccountSelection transferAccountSelection, TransferConfiguration transferConfiguration, String str, Context context, ImmutableList3 immutableList3, StrategiesDashboardCard.Alignment alignment, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = dashboardDepositsViewState.lastDepositValueText;
        }
        if ((i & 2) != 0) {
            stringResource2 = dashboardDepositsViewState.nextDepositValueText;
        }
        if ((i & 4) != 0) {
            transferAccountSelection = dashboardDepositsViewState.recurringDepositToSelection;
        }
        if ((i & 8) != 0) {
            transferConfiguration = dashboardDepositsViewState.transferConfig;
        }
        if ((i & 16) != 0) {
            str = dashboardDepositsViewState.goldValuePropsPillTitle;
        }
        if ((i & 32) != 0) {
            context = dashboardDepositsViewState.eventContext;
        }
        if ((i & 64) != 0) {
            immutableList3 = dashboardDepositsViewState.depositSummaryRows;
        }
        if ((i & 128) != 0) {
            alignment = dashboardDepositsViewState.promoCardLocation;
        }
        ImmutableList3 immutableList32 = immutableList3;
        StrategiesDashboardCard.Alignment alignment2 = alignment;
        String str2 = str;
        Context context2 = context;
        return dashboardDepositsViewState.copy(stringResource, stringResource2, transferAccountSelection, transferConfiguration, str2, context2, immutableList32, alignment2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLastDepositValueText() {
        return this.lastDepositValueText;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getNextDepositValueText() {
        return this.nextDepositValueText;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferConfiguration.TransferAccountSelection getRecurringDepositToSelection() {
        return this.recurringDepositToSelection;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferConfiguration getTransferConfig() {
        return this.transferConfig;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGoldValuePropsPillTitle() {
        return this.goldValuePropsPillTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final Context getEventContext() {
        return this.eventContext;
    }

    public final ImmutableList3<UiGetDepositsSummaryRow> component7() {
        return this.depositSummaryRows;
    }

    /* renamed from: component8, reason: from getter */
    public final StrategiesDashboardCard.Alignment getPromoCardLocation() {
        return this.promoCardLocation;
    }

    public final DashboardDepositsViewState copy(StringResource lastDepositValueText, StringResource nextDepositValueText, TransferConfiguration.TransferAccountSelection recurringDepositToSelection, TransferConfiguration transferConfig, String goldValuePropsPillTitle, Context eventContext, ImmutableList3<UiGetDepositsSummaryRow> depositSummaryRows, StrategiesDashboardCard.Alignment promoCardLocation) {
        Intrinsics.checkNotNullParameter(lastDepositValueText, "lastDepositValueText");
        Intrinsics.checkNotNullParameter(nextDepositValueText, "nextDepositValueText");
        Intrinsics.checkNotNullParameter(transferConfig, "transferConfig");
        Intrinsics.checkNotNullParameter(depositSummaryRows, "depositSummaryRows");
        return new DashboardDepositsViewState(lastDepositValueText, nextDepositValueText, recurringDepositToSelection, transferConfig, goldValuePropsPillTitle, eventContext, depositSummaryRows, promoCardLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardDepositsViewState)) {
            return false;
        }
        DashboardDepositsViewState dashboardDepositsViewState = (DashboardDepositsViewState) other;
        return Intrinsics.areEqual(this.lastDepositValueText, dashboardDepositsViewState.lastDepositValueText) && Intrinsics.areEqual(this.nextDepositValueText, dashboardDepositsViewState.nextDepositValueText) && Intrinsics.areEqual(this.recurringDepositToSelection, dashboardDepositsViewState.recurringDepositToSelection) && Intrinsics.areEqual(this.transferConfig, dashboardDepositsViewState.transferConfig) && Intrinsics.areEqual(this.goldValuePropsPillTitle, dashboardDepositsViewState.goldValuePropsPillTitle) && Intrinsics.areEqual(this.eventContext, dashboardDepositsViewState.eventContext) && Intrinsics.areEqual(this.depositSummaryRows, dashboardDepositsViewState.depositSummaryRows) && this.promoCardLocation == dashboardDepositsViewState.promoCardLocation;
    }

    public int hashCode() {
        int iHashCode = ((this.lastDepositValueText.hashCode() * 31) + this.nextDepositValueText.hashCode()) * 31;
        TransferConfiguration.TransferAccountSelection transferAccountSelection = this.recurringDepositToSelection;
        int iHashCode2 = (((iHashCode + (transferAccountSelection == null ? 0 : transferAccountSelection.hashCode())) * 31) + this.transferConfig.hashCode()) * 31;
        String str = this.goldValuePropsPillTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Context context = this.eventContext;
        int iHashCode4 = (((iHashCode3 + (context == null ? 0 : context.hashCode())) * 31) + this.depositSummaryRows.hashCode()) * 31;
        StrategiesDashboardCard.Alignment alignment = this.promoCardLocation;
        return iHashCode4 + (alignment != null ? alignment.hashCode() : 0);
    }

    public String toString() {
        return "DashboardDepositsViewState(lastDepositValueText=" + this.lastDepositValueText + ", nextDepositValueText=" + this.nextDepositValueText + ", recurringDepositToSelection=" + this.recurringDepositToSelection + ", transferConfig=" + this.transferConfig + ", goldValuePropsPillTitle=" + this.goldValuePropsPillTitle + ", eventContext=" + this.eventContext + ", depositSummaryRows=" + this.depositSummaryRows + ", promoCardLocation=" + this.promoCardLocation + ")";
    }

    public DashboardDepositsViewState(StringResource lastDepositValueText, StringResource nextDepositValueText, TransferConfiguration.TransferAccountSelection transferAccountSelection, TransferConfiguration transferConfig, String str, Context context, ImmutableList3<UiGetDepositsSummaryRow> depositSummaryRows, StrategiesDashboardCard.Alignment alignment) {
        Intrinsics.checkNotNullParameter(lastDepositValueText, "lastDepositValueText");
        Intrinsics.checkNotNullParameter(nextDepositValueText, "nextDepositValueText");
        Intrinsics.checkNotNullParameter(transferConfig, "transferConfig");
        Intrinsics.checkNotNullParameter(depositSummaryRows, "depositSummaryRows");
        this.lastDepositValueText = lastDepositValueText;
        this.nextDepositValueText = nextDepositValueText;
        this.recurringDepositToSelection = transferAccountSelection;
        this.transferConfig = transferConfig;
        this.goldValuePropsPillTitle = str;
        this.eventContext = context;
        this.depositSummaryRows = depositSummaryRows;
        this.promoCardLocation = alignment;
    }

    public final StringResource getLastDepositValueText() {
        return this.lastDepositValueText;
    }

    public final StringResource getNextDepositValueText() {
        return this.nextDepositValueText;
    }

    public final TransferConfiguration.TransferAccountSelection getRecurringDepositToSelection() {
        return this.recurringDepositToSelection;
    }

    public final TransferConfiguration getTransferConfig() {
        return this.transferConfig;
    }

    public final String getGoldValuePropsPillTitle() {
        return this.goldValuePropsPillTitle;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }

    public final ImmutableList3<UiGetDepositsSummaryRow> getDepositSummaryRows() {
        return this.depositSummaryRows;
    }

    public final StrategiesDashboardCard.Alignment getPromoCardLocation() {
        return this.promoCardLocation;
    }
}
