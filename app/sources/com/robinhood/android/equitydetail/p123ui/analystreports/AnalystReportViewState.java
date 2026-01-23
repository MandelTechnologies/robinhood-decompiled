package com.robinhood.android.equitydetail.p123ui.analystreports;

import com.robinhood.models.api.ApiAnalystReport;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.udf.UiEvent;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalystReportViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportViewState;", "", "report", "Lcom/robinhood/models/api/ApiAnalystReport;", "instrument", "Lcom/robinhood/models/db/Instrument;", "error", "Lcom/robinhood/udf/UiEvent;", "", "isUpForTheDay", "", "downloadingPdf", "downloadedPdfFile", "Ljava/io/File;", "<init>", "(Lcom/robinhood/models/api/ApiAnalystReport;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/udf/UiEvent;ZZLcom/robinhood/udf/UiEvent;)V", "getReport", "()Lcom/robinhood/models/api/ApiAnalystReport;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getError", "()Lcom/robinhood/udf/UiEvent;", "()Z", "getDownloadingPdf", "getDownloadedPdfFile", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AnalystReportViewState {
    public static final int $stable = 8;
    private final UiEvent<File> downloadedPdfFile;
    private final boolean downloadingPdf;
    private final UiEvent<Throwable> error;
    private final Instrument instrument;
    private final boolean isUpForTheDay;
    private final ApiAnalystReport report;

    public AnalystReportViewState() {
        this(null, null, null, false, false, null, 63, null);
    }

    public static /* synthetic */ AnalystReportViewState copy$default(AnalystReportViewState analystReportViewState, ApiAnalystReport apiAnalystReport, Instrument instrument, UiEvent uiEvent, boolean z, boolean z2, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAnalystReport = analystReportViewState.report;
        }
        if ((i & 2) != 0) {
            instrument = analystReportViewState.instrument;
        }
        if ((i & 4) != 0) {
            uiEvent = analystReportViewState.error;
        }
        if ((i & 8) != 0) {
            z = analystReportViewState.isUpForTheDay;
        }
        if ((i & 16) != 0) {
            z2 = analystReportViewState.downloadingPdf;
        }
        if ((i & 32) != 0) {
            uiEvent2 = analystReportViewState.downloadedPdfFile;
        }
        boolean z3 = z2;
        UiEvent uiEvent3 = uiEvent2;
        return analystReportViewState.copy(apiAnalystReport, instrument, uiEvent, z, z3, uiEvent3);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAnalystReport getReport() {
        return this.report;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final UiEvent<Throwable> component3() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsUpForTheDay() {
        return this.isUpForTheDay;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDownloadingPdf() {
        return this.downloadingPdf;
    }

    public final UiEvent<File> component6() {
        return this.downloadedPdfFile;
    }

    public final AnalystReportViewState copy(ApiAnalystReport report, Instrument instrument, UiEvent<Throwable> error, boolean isUpForTheDay, boolean downloadingPdf, UiEvent<File> downloadedPdfFile) {
        return new AnalystReportViewState(report, instrument, error, isUpForTheDay, downloadingPdf, downloadedPdfFile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalystReportViewState)) {
            return false;
        }
        AnalystReportViewState analystReportViewState = (AnalystReportViewState) other;
        return Intrinsics.areEqual(this.report, analystReportViewState.report) && Intrinsics.areEqual(this.instrument, analystReportViewState.instrument) && Intrinsics.areEqual(this.error, analystReportViewState.error) && this.isUpForTheDay == analystReportViewState.isUpForTheDay && this.downloadingPdf == analystReportViewState.downloadingPdf && Intrinsics.areEqual(this.downloadedPdfFile, analystReportViewState.downloadedPdfFile);
    }

    public int hashCode() {
        ApiAnalystReport apiAnalystReport = this.report;
        int iHashCode = (apiAnalystReport == null ? 0 : apiAnalystReport.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        int iHashCode3 = (((((iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.isUpForTheDay)) * 31) + Boolean.hashCode(this.downloadingPdf)) * 31;
        UiEvent<File> uiEvent2 = this.downloadedPdfFile;
        return iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "AnalystReportViewState(report=" + this.report + ", instrument=" + this.instrument + ", error=" + this.error + ", isUpForTheDay=" + this.isUpForTheDay + ", downloadingPdf=" + this.downloadingPdf + ", downloadedPdfFile=" + this.downloadedPdfFile + ")";
    }

    public AnalystReportViewState(ApiAnalystReport apiAnalystReport, Instrument instrument, UiEvent<Throwable> uiEvent, boolean z, boolean z2, UiEvent<File> uiEvent2) {
        this.report = apiAnalystReport;
        this.instrument = instrument;
        this.error = uiEvent;
        this.isUpForTheDay = z;
        this.downloadingPdf = z2;
        this.downloadedPdfFile = uiEvent2;
    }

    public /* synthetic */ AnalystReportViewState(ApiAnalystReport apiAnalystReport, Instrument instrument, UiEvent uiEvent, boolean z, boolean z2, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiAnalystReport, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : uiEvent2);
    }

    public final ApiAnalystReport getReport() {
        return this.report;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final boolean isUpForTheDay() {
        return this.isUpForTheDay;
    }

    public final boolean getDownloadingPdf() {
        return this.downloadingPdf;
    }

    public final UiEvent<File> getDownloadedPdfFile() {
        return this.downloadedPdfFile;
    }
}
