package com.robinhood.android.equity.history.p121ui.borrowcharge;

import com.robinhood.models.p320db.Instrument;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: BorrowChargeDetailViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailViewState;", "", "accountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "totalChargeAmount", "", "paymentDate", "chargePeriod", "status", "instrumentBorrowCharges", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailViewState$UiBorrowCharge;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;)V", "getAccountDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "getTotalChargeAmount", "()Ljava/lang/String;", "getPaymentDate", "getChargePeriod", "getStatus", "getInstrumentBorrowCharges", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "UiBorrowCharge", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BorrowChargeDetailViewState {
    public static final int $stable = 8;
    private final StringResource accountDisplayName;
    private final StringResource chargePeriod;
    private final ImmutableList<UiBorrowCharge> instrumentBorrowCharges;
    private final String paymentDate;
    private final StringResource status;
    private final String totalChargeAmount;

    public static /* synthetic */ BorrowChargeDetailViewState copy$default(BorrowChargeDetailViewState borrowChargeDetailViewState, StringResource stringResource, String str, String str2, StringResource stringResource2, StringResource stringResource3, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = borrowChargeDetailViewState.accountDisplayName;
        }
        if ((i & 2) != 0) {
            str = borrowChargeDetailViewState.totalChargeAmount;
        }
        if ((i & 4) != 0) {
            str2 = borrowChargeDetailViewState.paymentDate;
        }
        if ((i & 8) != 0) {
            stringResource2 = borrowChargeDetailViewState.chargePeriod;
        }
        if ((i & 16) != 0) {
            stringResource3 = borrowChargeDetailViewState.status;
        }
        if ((i & 32) != 0) {
            immutableList = borrowChargeDetailViewState.instrumentBorrowCharges;
        }
        StringResource stringResource4 = stringResource3;
        ImmutableList immutableList2 = immutableList;
        return borrowChargeDetailViewState.copy(stringResource, str, str2, stringResource2, stringResource4, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getAccountDisplayName() {
        return this.accountDisplayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTotalChargeAmount() {
        return this.totalChargeAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentDate() {
        return this.paymentDate;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getChargePeriod() {
        return this.chargePeriod;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getStatus() {
        return this.status;
    }

    public final ImmutableList<UiBorrowCharge> component6() {
        return this.instrumentBorrowCharges;
    }

    public final BorrowChargeDetailViewState copy(StringResource accountDisplayName, String totalChargeAmount, String paymentDate, StringResource chargePeriod, StringResource status, ImmutableList<UiBorrowCharge> instrumentBorrowCharges) {
        return new BorrowChargeDetailViewState(accountDisplayName, totalChargeAmount, paymentDate, chargePeriod, status, instrumentBorrowCharges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorrowChargeDetailViewState)) {
            return false;
        }
        BorrowChargeDetailViewState borrowChargeDetailViewState = (BorrowChargeDetailViewState) other;
        return Intrinsics.areEqual(this.accountDisplayName, borrowChargeDetailViewState.accountDisplayName) && Intrinsics.areEqual(this.totalChargeAmount, borrowChargeDetailViewState.totalChargeAmount) && Intrinsics.areEqual(this.paymentDate, borrowChargeDetailViewState.paymentDate) && Intrinsics.areEqual(this.chargePeriod, borrowChargeDetailViewState.chargePeriod) && Intrinsics.areEqual(this.status, borrowChargeDetailViewState.status) && Intrinsics.areEqual(this.instrumentBorrowCharges, borrowChargeDetailViewState.instrumentBorrowCharges);
    }

    public int hashCode() {
        StringResource stringResource = this.accountDisplayName;
        int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
        String str = this.totalChargeAmount;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StringResource stringResource2 = this.chargePeriod;
        int iHashCode4 = (iHashCode3 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.status;
        int iHashCode5 = (iHashCode4 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
        ImmutableList<UiBorrowCharge> immutableList = this.instrumentBorrowCharges;
        return iHashCode5 + (immutableList != null ? immutableList.hashCode() : 0);
    }

    public String toString() {
        return "BorrowChargeDetailViewState(accountDisplayName=" + this.accountDisplayName + ", totalChargeAmount=" + this.totalChargeAmount + ", paymentDate=" + this.paymentDate + ", chargePeriod=" + this.chargePeriod + ", status=" + this.status + ", instrumentBorrowCharges=" + this.instrumentBorrowCharges + ")";
    }

    public BorrowChargeDetailViewState(StringResource stringResource, String str, String str2, StringResource stringResource2, StringResource stringResource3, ImmutableList<UiBorrowCharge> immutableList) {
        this.accountDisplayName = stringResource;
        this.totalChargeAmount = str;
        this.paymentDate = str2;
        this.chargePeriod = stringResource2;
        this.status = stringResource3;
        this.instrumentBorrowCharges = immutableList;
    }

    public final StringResource getAccountDisplayName() {
        return this.accountDisplayName;
    }

    public final String getTotalChargeAmount() {
        return this.totalChargeAmount;
    }

    public final String getPaymentDate() {
        return this.paymentDate;
    }

    public final StringResource getChargePeriod() {
        return this.chargePeriod;
    }

    public final StringResource getStatus() {
        return this.status;
    }

    public final ImmutableList<UiBorrowCharge> getInstrumentBorrowCharges() {
        return this.instrumentBorrowCharges;
    }

    /* compiled from: BorrowChargeDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailViewState$UiBorrowCharge;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "chargeAmount", "", "<init>", "(Lcom/robinhood/models/db/Instrument;Ljava/lang/String;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getChargeAmount", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UiBorrowCharge {
        public static final int $stable = 8;
        private final String chargeAmount;
        private final Instrument instrument;

        public static /* synthetic */ UiBorrowCharge copy$default(UiBorrowCharge uiBorrowCharge, Instrument instrument, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                instrument = uiBorrowCharge.instrument;
            }
            if ((i & 2) != 0) {
                str = uiBorrowCharge.chargeAmount;
            }
            return uiBorrowCharge.copy(instrument, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component2, reason: from getter */
        public final String getChargeAmount() {
            return this.chargeAmount;
        }

        public final UiBorrowCharge copy(Instrument instrument, String chargeAmount) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(chargeAmount, "chargeAmount");
            return new UiBorrowCharge(instrument, chargeAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiBorrowCharge)) {
                return false;
            }
            UiBorrowCharge uiBorrowCharge = (UiBorrowCharge) other;
            return Intrinsics.areEqual(this.instrument, uiBorrowCharge.instrument) && Intrinsics.areEqual(this.chargeAmount, uiBorrowCharge.chargeAmount);
        }

        public int hashCode() {
            return (this.instrument.hashCode() * 31) + this.chargeAmount.hashCode();
        }

        public String toString() {
            return "UiBorrowCharge(instrument=" + this.instrument + ", chargeAmount=" + this.chargeAmount + ")";
        }

        public UiBorrowCharge(Instrument instrument, String chargeAmount) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(chargeAmount, "chargeAmount");
            this.instrument = instrument;
            this.chargeAmount = chargeAmount;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final String getChargeAmount() {
            return this.chargeAmount;
        }
    }
}
