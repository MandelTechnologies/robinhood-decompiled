package com.robinhood.android.advisory.dashboard.deposit;

import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.android.advisory.dashboard.LoggingUtils2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.ManagedAccountState;
import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.p355ui.bonfire.dashboardsection.UiGetDepositsSummaryRow;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.LocalDate;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: DashboardDepositsDataState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00015Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jw\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00100\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010!R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;", "", "rhsAccountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "lastDeposit", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "nextDeposit", "Lcom/robinhood/models/db/AutomaticDeposit;", "goldValuePropsPillTitle", "accountState", "Lcom/robinhood/models/advisory/db/ManagedAccountState;", "isInAdvisoryInstantExperiment", "", "depositSummaryRows", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/ui/bonfire/dashboardsection/UiGetDepositsSummaryRow;", "promoCardLocation", "Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard$Alignment;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/db/bonfire/PaymentTransfer;Lcom/robinhood/models/db/AutomaticDeposit;Ljava/lang/String;Lcom/robinhood/models/advisory/db/ManagedAccountState;ZLkotlinx/collections/immutable/PersistentList;Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard$Alignment;)V", "getRhsAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getLastDeposit", "()Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "getNextDeposit", "()Lcom/robinhood/models/db/AutomaticDeposit;", "getGoldValuePropsPillTitle", "getAccountState", "()Lcom/robinhood/models/advisory/db/ManagedAccountState;", "()Z", "getDepositSummaryRows", "()Lkotlinx/collections/immutable/PersistentList;", "getPromoCardLocation", "()Lcom/robinhood/models/advisory/db/card/StrategiesDashboardCard$Alignment;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DashboardDepositsDataState {
    private final ManagedAccountState accountState;
    private final BrokerageAccountType brokerageAccountType;
    private final ImmutableList3<UiGetDepositsSummaryRow> depositSummaryRows;
    private final String goldValuePropsPillTitle;
    private final boolean isInAdvisoryInstantExperiment;
    private final PaymentTransfer lastDeposit;
    private final AutomaticDeposit nextDeposit;
    private final StrategiesDashboardCard.Alignment promoCardLocation;
    private final String rhsAccountNumber;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DashboardDepositsDataState() {
        this(null, null, null, null, null, null, false, null, null, 511, null);
    }

    public static /* synthetic */ DashboardDepositsDataState copy$default(DashboardDepositsDataState dashboardDepositsDataState, String str, BrokerageAccountType brokerageAccountType, PaymentTransfer paymentTransfer, AutomaticDeposit automaticDeposit, String str2, ManagedAccountState managedAccountState, boolean z, ImmutableList3 immutableList3, StrategiesDashboardCard.Alignment alignment, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardDepositsDataState.rhsAccountNumber;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = dashboardDepositsDataState.brokerageAccountType;
        }
        if ((i & 4) != 0) {
            paymentTransfer = dashboardDepositsDataState.lastDeposit;
        }
        if ((i & 8) != 0) {
            automaticDeposit = dashboardDepositsDataState.nextDeposit;
        }
        if ((i & 16) != 0) {
            str2 = dashboardDepositsDataState.goldValuePropsPillTitle;
        }
        if ((i & 32) != 0) {
            managedAccountState = dashboardDepositsDataState.accountState;
        }
        if ((i & 64) != 0) {
            z = dashboardDepositsDataState.isInAdvisoryInstantExperiment;
        }
        if ((i & 128) != 0) {
            immutableList3 = dashboardDepositsDataState.depositSummaryRows;
        }
        if ((i & 256) != 0) {
            alignment = dashboardDepositsDataState.promoCardLocation;
        }
        ImmutableList3 immutableList32 = immutableList3;
        StrategiesDashboardCard.Alignment alignment2 = alignment;
        ManagedAccountState managedAccountState2 = managedAccountState;
        boolean z2 = z;
        String str3 = str2;
        PaymentTransfer paymentTransfer2 = paymentTransfer;
        return dashboardDepositsDataState.copy(str, brokerageAccountType, paymentTransfer2, automaticDeposit, str3, managedAccountState2, z2, immutableList32, alignment2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentTransfer getLastDeposit() {
        return this.lastDeposit;
    }

    /* renamed from: component4, reason: from getter */
    public final AutomaticDeposit getNextDeposit() {
        return this.nextDeposit;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGoldValuePropsPillTitle() {
        return this.goldValuePropsPillTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final ManagedAccountState getAccountState() {
        return this.accountState;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInAdvisoryInstantExperiment() {
        return this.isInAdvisoryInstantExperiment;
    }

    public final ImmutableList3<UiGetDepositsSummaryRow> component8() {
        return this.depositSummaryRows;
    }

    /* renamed from: component9, reason: from getter */
    public final StrategiesDashboardCard.Alignment getPromoCardLocation() {
        return this.promoCardLocation;
    }

    public final DashboardDepositsDataState copy(String rhsAccountNumber, BrokerageAccountType brokerageAccountType, PaymentTransfer lastDeposit, AutomaticDeposit nextDeposit, String goldValuePropsPillTitle, ManagedAccountState accountState, boolean isInAdvisoryInstantExperiment, ImmutableList3<UiGetDepositsSummaryRow> depositSummaryRows, StrategiesDashboardCard.Alignment promoCardLocation) {
        Intrinsics.checkNotNullParameter(depositSummaryRows, "depositSummaryRows");
        return new DashboardDepositsDataState(rhsAccountNumber, brokerageAccountType, lastDeposit, nextDeposit, goldValuePropsPillTitle, accountState, isInAdvisoryInstantExperiment, depositSummaryRows, promoCardLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardDepositsDataState)) {
            return false;
        }
        DashboardDepositsDataState dashboardDepositsDataState = (DashboardDepositsDataState) other;
        return Intrinsics.areEqual(this.rhsAccountNumber, dashboardDepositsDataState.rhsAccountNumber) && this.brokerageAccountType == dashboardDepositsDataState.brokerageAccountType && Intrinsics.areEqual(this.lastDeposit, dashboardDepositsDataState.lastDeposit) && Intrinsics.areEqual(this.nextDeposit, dashboardDepositsDataState.nextDeposit) && Intrinsics.areEqual(this.goldValuePropsPillTitle, dashboardDepositsDataState.goldValuePropsPillTitle) && this.accountState == dashboardDepositsDataState.accountState && this.isInAdvisoryInstantExperiment == dashboardDepositsDataState.isInAdvisoryInstantExperiment && Intrinsics.areEqual(this.depositSummaryRows, dashboardDepositsDataState.depositSummaryRows) && this.promoCardLocation == dashboardDepositsDataState.promoCardLocation;
    }

    public int hashCode() {
        String str = this.rhsAccountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
        int iHashCode2 = (iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        PaymentTransfer paymentTransfer = this.lastDeposit;
        int iHashCode3 = (iHashCode2 + (paymentTransfer == null ? 0 : paymentTransfer.hashCode())) * 31;
        AutomaticDeposit automaticDeposit = this.nextDeposit;
        int iHashCode4 = (iHashCode3 + (automaticDeposit == null ? 0 : automaticDeposit.hashCode())) * 31;
        String str2 = this.goldValuePropsPillTitle;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ManagedAccountState managedAccountState = this.accountState;
        int iHashCode6 = (((((iHashCode5 + (managedAccountState == null ? 0 : managedAccountState.hashCode())) * 31) + Boolean.hashCode(this.isInAdvisoryInstantExperiment)) * 31) + this.depositSummaryRows.hashCode()) * 31;
        StrategiesDashboardCard.Alignment alignment = this.promoCardLocation;
        return iHashCode6 + (alignment != null ? alignment.hashCode() : 0);
    }

    public String toString() {
        return "DashboardDepositsDataState(rhsAccountNumber=" + this.rhsAccountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ", lastDeposit=" + this.lastDeposit + ", nextDeposit=" + this.nextDeposit + ", goldValuePropsPillTitle=" + this.goldValuePropsPillTitle + ", accountState=" + this.accountState + ", isInAdvisoryInstantExperiment=" + this.isInAdvisoryInstantExperiment + ", depositSummaryRows=" + this.depositSummaryRows + ", promoCardLocation=" + this.promoCardLocation + ")";
    }

    public DashboardDepositsDataState(String str, BrokerageAccountType brokerageAccountType, PaymentTransfer paymentTransfer, AutomaticDeposit automaticDeposit, String str2, ManagedAccountState managedAccountState, boolean z, ImmutableList3<UiGetDepositsSummaryRow> depositSummaryRows, StrategiesDashboardCard.Alignment alignment) {
        Intrinsics.checkNotNullParameter(depositSummaryRows, "depositSummaryRows");
        this.rhsAccountNumber = str;
        this.brokerageAccountType = brokerageAccountType;
        this.lastDeposit = paymentTransfer;
        this.nextDeposit = automaticDeposit;
        this.goldValuePropsPillTitle = str2;
        this.accountState = managedAccountState;
        this.isInAdvisoryInstantExperiment = z;
        this.depositSummaryRows = depositSummaryRows;
        this.promoCardLocation = alignment;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final PaymentTransfer getLastDeposit() {
        return this.lastDeposit;
    }

    public final AutomaticDeposit getNextDeposit() {
        return this.nextDeposit;
    }

    public final String getGoldValuePropsPillTitle() {
        return this.goldValuePropsPillTitle;
    }

    public final ManagedAccountState getAccountState() {
        return this.accountState;
    }

    public final boolean isInAdvisoryInstantExperiment() {
        return this.isInAdvisoryInstantExperiment;
    }

    public /* synthetic */ DashboardDepositsDataState(String str, BrokerageAccountType brokerageAccountType, PaymentTransfer paymentTransfer, AutomaticDeposit automaticDeposit, String str2, ManagedAccountState managedAccountState, boolean z, ImmutableList3 immutableList3, StrategiesDashboardCard.Alignment alignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : brokerageAccountType, (i & 4) != 0 ? null : paymentTransfer, (i & 8) != 0 ? null : automaticDeposit, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : managedAccountState, (i & 64) != 0 ? false : z, (i & 128) != 0 ? extensions2.persistentListOf() : immutableList3, (i & 256) != 0 ? null : alignment);
    }

    public final ImmutableList3<UiGetDepositsSummaryRow> getDepositSummaryRows() {
        return this.depositSummaryRows;
    }

    public final StrategiesDashboardCard.Alignment getPromoCardLocation() {
        return this.promoCardLocation;
    }

    /* compiled from: DashboardDepositsDataState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsViewState;", "<init>", "()V", "Ljava/math/BigDecimal;", "amount", "j$/time/LocalDate", InquiryField.DateField.TYPE, "Lcom/robinhood/utils/resource/StringResource;", "depositOnDateResource", "(Ljava/math/BigDecimal;Lj$/time/LocalDate;)Lcom/robinhood/utils/resource/StringResource;", "dataState", "reduce", "(Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDataState;)Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsViewState;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<DashboardDepositsDataState, DashboardDepositsViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final StringResource depositOnDateResource(BigDecimal amount, LocalDate date) {
            NumberFormatter wholeNumberCurrencyFormat;
            if (BigDecimals7.getNumberOfDecimalPlaces(amount) > 0) {
                wholeNumberCurrencyFormat = Formats.getCurrencyFormat();
            } else {
                wholeNumberCurrencyFormat = Formats.getWholeNumberCurrencyFormat();
            }
            return StringResource.INSTANCE.invoke(C8626R.string.advisory_dashboard_deposits_section_amount_on_date, wholeNumberCurrencyFormat.format(amount), date.format(DateTimeFormatter.ofPattern("MMM d")));
        }

        @Override // com.robinhood.android.udf.StateProvider
        public DashboardDepositsViewState reduce(DashboardDepositsDataState dataState) {
            StringResource stringResourceInvoke;
            StringResource stringResourceInvoke2;
            ImmutableList3<UiGetDepositsSummaryRow> immutableList3PersistentListOf;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            Context contextBuildManagedAccountLoggingContext = null;
            TransferConfiguration.TransferAccountSelection transferAccountSelection = (dataState.getRhsAccountNumber() == null || dataState.getBrokerageAccountType() == null) ? null : new TransferConfiguration.TransferAccountSelection(dataState.getRhsAccountNumber(), false, ApiTransferAccount.TransferAccountType.INSTANCE.fromBrokerageAccountType(dataState.getBrokerageAccountType()), 2, null);
            PaymentTransfer lastDeposit = dataState.getLastDeposit();
            if (lastDeposit == null || (stringResourceInvoke = DashboardDepositsDataState.INSTANCE.depositOnDateResource(lastDeposit.getAmount(), Instants.toLocalDate$default(lastDeposit.getCreatedAt(), null, 1, null))) == null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C8626R.string.advisory_dashboard_deposits_section_last_deposit_empty, new Object[0]);
            }
            AutomaticDeposit nextDeposit = dataState.getNextDeposit();
            if (nextDeposit == null || (stringResourceInvoke2 = DashboardDepositsDataState.INSTANCE.depositOnDateResource(nextDeposit.getAmount().getDecimalValue(), nextDeposit.getNextDepositDate())) == null) {
                stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8626R.string.advisory_dashboard_deposits_section_next_deposit_empty, new Object[0]);
            }
            StringResource stringResource = stringResourceInvoke2;
            TransferConfiguration.TransferAccountSelection transferAccountSelection2 = transferAccountSelection;
            TransferConfiguration.Standard standard = new TransferConfiguration.Standard(null, null, false, null, transferAccountSelection2, null, MAXTransferContext.EntryPoint.ADVISORY_DASHBOARD_DEPOSIT_BUTTON, null, false, false, null, null, false, 8111, null);
            String goldValuePropsPillTitle = dataState.getGoldValuePropsPillTitle();
            if (dataState.getBrokerageAccountType() != null && dataState.getAccountState() != null) {
                contextBuildManagedAccountLoggingContext = LoggingUtils2.buildManagedAccountLoggingContext(dataState.getAccountState(), dataState.getBrokerageAccountType());
            }
            Context context = contextBuildManagedAccountLoggingContext;
            if (dataState.isInAdvisoryInstantExperiment()) {
                immutableList3PersistentListOf = dataState.getDepositSummaryRows();
            } else {
                immutableList3PersistentListOf = extensions2.persistentListOf();
            }
            return new DashboardDepositsViewState(stringResourceInvoke, stringResource, transferAccountSelection2, standard, goldValuePropsPillTitle, context, immutableList3PersistentListOf, dataState.getPromoCardLocation());
        }
    }
}
