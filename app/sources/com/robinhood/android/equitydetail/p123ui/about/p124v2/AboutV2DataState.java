package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Fundamental;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AboutV2DataState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003Ju\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eHÆ\u0001J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010 ¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2DataState;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "fundamental", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "aboutV2InfoData", "", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Info;", "resourceStrings", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ResourceStrings;", "doesAboutTextOverflow", "", "todayPercentChange", "Ljava/math/BigDecimal;", "isExpanded", "isLoading", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;Lcom/robinhood/models/db/EtpDetails;Ljava/util/List;Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ResourceStrings;ZLjava/math/BigDecimal;ZZ)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getFundamental", "()Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;", "getEtpDetails", "()Lcom/robinhood/models/db/EtpDetails;", "getAboutV2InfoData", "()Ljava/util/List;", "getResourceStrings", "()Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2ResourceStrings;", "getDoesAboutTextOverflow", "()Z", "getTodayPercentChange", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AboutV2DataState {
    public static final int $stable = 8;
    private final List<AboutV2Info> aboutV2InfoData;
    private final boolean doesAboutTextOverflow;
    private final EtpDetails etpDetails;
    private final Fundamental fundamental;
    private final Instrument instrument;
    private final boolean isExpanded;
    private final boolean isLoading;
    private final AboutV2ResourceStrings resourceStrings;
    private final BigDecimal todayPercentChange;

    public AboutV2DataState() {
        this(null, null, null, null, null, false, null, false, false, 511, null);
    }

    public static /* synthetic */ AboutV2DataState copy$default(AboutV2DataState aboutV2DataState, Instrument instrument, Fundamental fundamental, EtpDetails etpDetails, List list, AboutV2ResourceStrings aboutV2ResourceStrings, boolean z, BigDecimal bigDecimal, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = aboutV2DataState.instrument;
        }
        if ((i & 2) != 0) {
            fundamental = aboutV2DataState.fundamental;
        }
        if ((i & 4) != 0) {
            etpDetails = aboutV2DataState.etpDetails;
        }
        if ((i & 8) != 0) {
            list = aboutV2DataState.aboutV2InfoData;
        }
        if ((i & 16) != 0) {
            aboutV2ResourceStrings = aboutV2DataState.resourceStrings;
        }
        if ((i & 32) != 0) {
            z = aboutV2DataState.doesAboutTextOverflow;
        }
        if ((i & 64) != 0) {
            bigDecimal = aboutV2DataState.todayPercentChange;
        }
        if ((i & 128) != 0) {
            z2 = aboutV2DataState.isExpanded;
        }
        if ((i & 256) != 0) {
            z3 = aboutV2DataState.isLoading;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        BigDecimal bigDecimal2 = bigDecimal;
        AboutV2ResourceStrings aboutV2ResourceStrings2 = aboutV2ResourceStrings;
        EtpDetails etpDetails2 = etpDetails;
        return aboutV2DataState.copy(instrument, fundamental, etpDetails2, list, aboutV2ResourceStrings2, z6, bigDecimal2, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component2, reason: from getter */
    public final Fundamental getFundamental() {
        return this.fundamental;
    }

    /* renamed from: component3, reason: from getter */
    public final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    public final List<AboutV2Info> component4() {
        return this.aboutV2InfoData;
    }

    /* renamed from: component5, reason: from getter */
    public final AboutV2ResourceStrings getResourceStrings() {
        return this.resourceStrings;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDoesAboutTextOverflow() {
        return this.doesAboutTextOverflow;
    }

    /* renamed from: component7, reason: from getter */
    public final BigDecimal getTodayPercentChange() {
        return this.todayPercentChange;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final AboutV2DataState copy(Instrument instrument, Fundamental fundamental, EtpDetails etpDetails, List<AboutV2Info> aboutV2InfoData, AboutV2ResourceStrings resourceStrings, boolean doesAboutTextOverflow, BigDecimal todayPercentChange, boolean isExpanded, boolean isLoading) {
        return new AboutV2DataState(instrument, fundamental, etpDetails, aboutV2InfoData, resourceStrings, doesAboutTextOverflow, todayPercentChange, isExpanded, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AboutV2DataState)) {
            return false;
        }
        AboutV2DataState aboutV2DataState = (AboutV2DataState) other;
        return Intrinsics.areEqual(this.instrument, aboutV2DataState.instrument) && Intrinsics.areEqual(this.fundamental, aboutV2DataState.fundamental) && Intrinsics.areEqual(this.etpDetails, aboutV2DataState.etpDetails) && Intrinsics.areEqual(this.aboutV2InfoData, aboutV2DataState.aboutV2InfoData) && Intrinsics.areEqual(this.resourceStrings, aboutV2DataState.resourceStrings) && this.doesAboutTextOverflow == aboutV2DataState.doesAboutTextOverflow && Intrinsics.areEqual(this.todayPercentChange, aboutV2DataState.todayPercentChange) && this.isExpanded == aboutV2DataState.isExpanded && this.isLoading == aboutV2DataState.isLoading;
    }

    public int hashCode() {
        Instrument instrument = this.instrument;
        int iHashCode = (instrument == null ? 0 : instrument.hashCode()) * 31;
        Fundamental fundamental = this.fundamental;
        int iHashCode2 = (iHashCode + (fundamental == null ? 0 : fundamental.hashCode())) * 31;
        EtpDetails etpDetails = this.etpDetails;
        int iHashCode3 = (iHashCode2 + (etpDetails == null ? 0 : etpDetails.hashCode())) * 31;
        List<AboutV2Info> list = this.aboutV2InfoData;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        AboutV2ResourceStrings aboutV2ResourceStrings = this.resourceStrings;
        int iHashCode5 = (((iHashCode4 + (aboutV2ResourceStrings == null ? 0 : aboutV2ResourceStrings.hashCode())) * 31) + Boolean.hashCode(this.doesAboutTextOverflow)) * 31;
        BigDecimal bigDecimal = this.todayPercentChange;
        return ((((iHashCode5 + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31) + Boolean.hashCode(this.isExpanded)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "AboutV2DataState(instrument=" + this.instrument + ", fundamental=" + this.fundamental + ", etpDetails=" + this.etpDetails + ", aboutV2InfoData=" + this.aboutV2InfoData + ", resourceStrings=" + this.resourceStrings + ", doesAboutTextOverflow=" + this.doesAboutTextOverflow + ", todayPercentChange=" + this.todayPercentChange + ", isExpanded=" + this.isExpanded + ", isLoading=" + this.isLoading + ")";
    }

    public AboutV2DataState(Instrument instrument, Fundamental fundamental, EtpDetails etpDetails, List<AboutV2Info> list, AboutV2ResourceStrings aboutV2ResourceStrings, boolean z, BigDecimal bigDecimal, boolean z2, boolean z3) {
        this.instrument = instrument;
        this.fundamental = fundamental;
        this.etpDetails = etpDetails;
        this.aboutV2InfoData = list;
        this.resourceStrings = aboutV2ResourceStrings;
        this.doesAboutTextOverflow = z;
        this.todayPercentChange = bigDecimal;
        this.isExpanded = z2;
        this.isLoading = z3;
    }

    public /* synthetic */ AboutV2DataState(Instrument instrument, Fundamental fundamental, EtpDetails etpDetails, List list, AboutV2ResourceStrings aboutV2ResourceStrings, boolean z, BigDecimal bigDecimal, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instrument, (i & 2) != 0 ? null : fundamental, (i & 4) != 0 ? null : etpDetails, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : aboutV2ResourceStrings, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : bigDecimal, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? true : z3);
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Fundamental getFundamental() {
        return this.fundamental;
    }

    public final EtpDetails getEtpDetails() {
        return this.etpDetails;
    }

    public final List<AboutV2Info> getAboutV2InfoData() {
        return this.aboutV2InfoData;
    }

    public final AboutV2ResourceStrings getResourceStrings() {
        return this.resourceStrings;
    }

    public final boolean getDoesAboutTextOverflow() {
        return this.doesAboutTextOverflow;
    }

    public final BigDecimal getTodayPercentChange() {
        return this.todayPercentChange;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
