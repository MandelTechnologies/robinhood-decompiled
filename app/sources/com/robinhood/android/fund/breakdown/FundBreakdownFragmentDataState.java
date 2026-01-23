package com.robinhood.android.fund.breakdown;

import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FundBreakdownFragmentDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/fund/breakdown/FundBreakdownFragmentDataState;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "selectedHoldingName", "", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/EtpDetails;Ljava/lang/String;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getEtpDetails", "()Lcom/robinhood/models/db/EtpDetails;", "getSelectedHoldingName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-fund-breakdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundBreakdownFragmentDataState {
    public static final int $stable = 8;
    private final EtpDetails etpDetails;
    private final Instrument instrument;
    private final String selectedHoldingName;

    public FundBreakdownFragmentDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ FundBreakdownFragmentDataState copy$default(FundBreakdownFragmentDataState fundBreakdownFragmentDataState, Instrument instrument, EtpDetails etpDetails, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = fundBreakdownFragmentDataState.instrument;
        }
        if ((i & 2) != 0) {
            etpDetails = fundBreakdownFragmentDataState.etpDetails;
        }
        if ((i & 4) != 0) {
            str = fundBreakdownFragmentDataState.selectedHoldingName;
        }
        return fundBreakdownFragmentDataState.copy(instrument, etpDetails, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component2, reason: from getter */
    public final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedHoldingName() {
        return this.selectedHoldingName;
    }

    public final FundBreakdownFragmentDataState copy(Instrument instrument, EtpDetails etpDetails, String selectedHoldingName) {
        return new FundBreakdownFragmentDataState(instrument, etpDetails, selectedHoldingName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundBreakdownFragmentDataState)) {
            return false;
        }
        FundBreakdownFragmentDataState fundBreakdownFragmentDataState = (FundBreakdownFragmentDataState) other;
        return Intrinsics.areEqual(this.instrument, fundBreakdownFragmentDataState.instrument) && Intrinsics.areEqual(this.etpDetails, fundBreakdownFragmentDataState.etpDetails) && Intrinsics.areEqual(this.selectedHoldingName, fundBreakdownFragmentDataState.selectedHoldingName);
    }

    public int hashCode() {
        Instrument instrument = this.instrument;
        int iHashCode = (instrument == null ? 0 : instrument.hashCode()) * 31;
        EtpDetails etpDetails = this.etpDetails;
        int iHashCode2 = (iHashCode + (etpDetails == null ? 0 : etpDetails.hashCode())) * 31;
        String str = this.selectedHoldingName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "FundBreakdownFragmentDataState(instrument=" + this.instrument + ", etpDetails=" + this.etpDetails + ", selectedHoldingName=" + this.selectedHoldingName + ")";
    }

    public FundBreakdownFragmentDataState(Instrument instrument, EtpDetails etpDetails, String str) {
        this.instrument = instrument;
        this.etpDetails = etpDetails;
        this.selectedHoldingName = str;
    }

    public /* synthetic */ FundBreakdownFragmentDataState(Instrument instrument, EtpDetails etpDetails, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instrument, (i & 2) != 0 ? null : etpDetails, (i & 4) != 0 ? null : str);
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    public final String getSelectedHoldingName() {
        return this.selectedHoldingName;
    }
}
