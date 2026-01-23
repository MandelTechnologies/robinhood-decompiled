package com.robinhood.android.advisory.tlh.summary;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowState;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TaxLossHarvestDashboardViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012HÆ\u0003J}\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012HÆ\u0001J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState;", "", "title", "", "subtitle", "status", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$Status;", "timeline", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState$TimelineState;", "gainsAndLossHeader", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$GainsAndLossesSectionHeader;", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$Cta;", "updateEnrollmentToastText", "loading", "", "activeYear", "availableYears", "Lkotlinx/collections/immutable/ImmutableList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$Status;Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState$TimelineState;Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$GainsAndLossesSectionHeader;Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$Cta;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getStatus", "()Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$Status;", "getTimeline", "()Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState$TimelineState;", "getGainsAndLossHeader", "()Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$GainsAndLossesSectionHeader;", "getCta", "()Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$Cta;", "getUpdateEnrollmentToastText", "getLoading", "()Z", "getActiveYear", "getAvailableYears", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "TimelineState", "Companion", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TaxLossHarvestDashboardViewState {
    private static final TaxLossHarvestDashboardViewState Loading;
    private final String activeYear;
    private final ImmutableList<String> availableYears;
    private final TaxLossHarvestDashboard.Cta cta;
    private final TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossHeader;
    private final boolean loading;
    private final TaxLossHarvestDashboard.Status status;
    private final String subtitle;
    private final TimelineState timeline;
    private final String title;
    private final String updateEnrollmentToastText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ TaxLossHarvestDashboardViewState copy$default(TaxLossHarvestDashboardViewState taxLossHarvestDashboardViewState, String str, String str2, TaxLossHarvestDashboard.Status status, TimelineState timelineState, TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader, TaxLossHarvestDashboard.Cta cta, String str3, boolean z, String str4, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestDashboardViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = taxLossHarvestDashboardViewState.subtitle;
        }
        if ((i & 4) != 0) {
            status = taxLossHarvestDashboardViewState.status;
        }
        if ((i & 8) != 0) {
            timelineState = taxLossHarvestDashboardViewState.timeline;
        }
        if ((i & 16) != 0) {
            gainsAndLossesSectionHeader = taxLossHarvestDashboardViewState.gainsAndLossHeader;
        }
        if ((i & 32) != 0) {
            cta = taxLossHarvestDashboardViewState.cta;
        }
        if ((i & 64) != 0) {
            str3 = taxLossHarvestDashboardViewState.updateEnrollmentToastText;
        }
        if ((i & 128) != 0) {
            z = taxLossHarvestDashboardViewState.loading;
        }
        if ((i & 256) != 0) {
            str4 = taxLossHarvestDashboardViewState.activeYear;
        }
        if ((i & 512) != 0) {
            immutableList = taxLossHarvestDashboardViewState.availableYears;
        }
        String str5 = str4;
        ImmutableList immutableList2 = immutableList;
        String str6 = str3;
        boolean z2 = z;
        TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader2 = gainsAndLossesSectionHeader;
        TaxLossHarvestDashboard.Cta cta2 = cta;
        return taxLossHarvestDashboardViewState.copy(str, str2, status, timelineState, gainsAndLossesSectionHeader2, cta2, str6, z2, str5, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList<String> component10() {
        return this.availableYears;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final TaxLossHarvestDashboard.Status getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final TimelineState getTimeline() {
        return this.timeline;
    }

    /* renamed from: component5, reason: from getter */
    public final TaxLossHarvestDashboard.GainsAndLossesSectionHeader getGainsAndLossHeader() {
        return this.gainsAndLossHeader;
    }

    /* renamed from: component6, reason: from getter */
    public final TaxLossHarvestDashboard.Cta getCta() {
        return this.cta;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUpdateEnrollmentToastText() {
        return this.updateEnrollmentToastText;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component9, reason: from getter */
    public final String getActiveYear() {
        return this.activeYear;
    }

    public final TaxLossHarvestDashboardViewState copy(String title, String subtitle, TaxLossHarvestDashboard.Status status, TimelineState timeline, TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossHeader, TaxLossHarvestDashboard.Cta cta, String updateEnrollmentToastText, boolean loading, String activeYear, ImmutableList<String> availableYears) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(availableYears, "availableYears");
        return new TaxLossHarvestDashboardViewState(title, subtitle, status, timeline, gainsAndLossHeader, cta, updateEnrollmentToastText, loading, activeYear, availableYears);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestDashboardViewState)) {
            return false;
        }
        TaxLossHarvestDashboardViewState taxLossHarvestDashboardViewState = (TaxLossHarvestDashboardViewState) other;
        return Intrinsics.areEqual(this.title, taxLossHarvestDashboardViewState.title) && Intrinsics.areEqual(this.subtitle, taxLossHarvestDashboardViewState.subtitle) && Intrinsics.areEqual(this.status, taxLossHarvestDashboardViewState.status) && Intrinsics.areEqual(this.timeline, taxLossHarvestDashboardViewState.timeline) && Intrinsics.areEqual(this.gainsAndLossHeader, taxLossHarvestDashboardViewState.gainsAndLossHeader) && Intrinsics.areEqual(this.cta, taxLossHarvestDashboardViewState.cta) && Intrinsics.areEqual(this.updateEnrollmentToastText, taxLossHarvestDashboardViewState.updateEnrollmentToastText) && this.loading == taxLossHarvestDashboardViewState.loading && Intrinsics.areEqual(this.activeYear, taxLossHarvestDashboardViewState.activeYear) && Intrinsics.areEqual(this.availableYears, taxLossHarvestDashboardViewState.availableYears);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.status.hashCode()) * 31;
        TimelineState timelineState = this.timeline;
        int iHashCode2 = (iHashCode + (timelineState == null ? 0 : timelineState.hashCode())) * 31;
        TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader = this.gainsAndLossHeader;
        int iHashCode3 = (iHashCode2 + (gainsAndLossesSectionHeader == null ? 0 : gainsAndLossesSectionHeader.hashCode())) * 31;
        TaxLossHarvestDashboard.Cta cta = this.cta;
        int iHashCode4 = (iHashCode3 + (cta == null ? 0 : cta.hashCode())) * 31;
        String str = this.updateEnrollmentToastText;
        int iHashCode5 = (((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.loading)) * 31;
        String str2 = this.activeYear;
        return ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.availableYears.hashCode();
    }

    public String toString() {
        return "TaxLossHarvestDashboardViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", status=" + this.status + ", timeline=" + this.timeline + ", gainsAndLossHeader=" + this.gainsAndLossHeader + ", cta=" + this.cta + ", updateEnrollmentToastText=" + this.updateEnrollmentToastText + ", loading=" + this.loading + ", activeYear=" + this.activeYear + ", availableYears=" + this.availableYears + ")";
    }

    public TaxLossHarvestDashboardViewState(String title, String subtitle, TaxLossHarvestDashboard.Status status, TimelineState timelineState, TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader, TaxLossHarvestDashboard.Cta cta, String str, boolean z, String str2, ImmutableList<String> availableYears) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(availableYears, "availableYears");
        this.title = title;
        this.subtitle = subtitle;
        this.status = status;
        this.timeline = timelineState;
        this.gainsAndLossHeader = gainsAndLossesSectionHeader;
        this.cta = cta;
        this.updateEnrollmentToastText = str;
        this.loading = z;
        this.activeYear = str2;
        this.availableYears = availableYears;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TaxLossHarvestDashboard.Status getStatus() {
        return this.status;
    }

    public final TimelineState getTimeline() {
        return this.timeline;
    }

    public final TaxLossHarvestDashboard.GainsAndLossesSectionHeader getGainsAndLossHeader() {
        return this.gainsAndLossHeader;
    }

    public final TaxLossHarvestDashboard.Cta getCta() {
        return this.cta;
    }

    public final String getUpdateEnrollmentToastText() {
        return this.updateEnrollmentToastText;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getActiveYear() {
        return this.activeYear;
    }

    public /* synthetic */ TaxLossHarvestDashboardViewState(String str, String str2, TaxLossHarvestDashboard.Status status, TimelineState timelineState, TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader, TaxLossHarvestDashboard.Cta cta, String str3, boolean z, String str4, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, status, timelineState, gainsAndLossesSectionHeader, cta, str3, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? extensions2.persistentListOf() : immutableList);
    }

    public final ImmutableList<String> getAvailableYears() {
        return this.availableYears;
    }

    /* compiled from: TaxLossHarvestDashboardViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState$TimelineState;", "", "title", "", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState$TimelineState$TimelineRow;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Ljava/lang/String;", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TimelineRow", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TimelineState {
        public static final int $stable = 8;
        private final ImmutableList<TimelineRow> rows;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TimelineState copy$default(TimelineState timelineState, String str, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                str = timelineState.title;
            }
            if ((i & 2) != 0) {
                immutableList = timelineState.rows;
            }
            return timelineState.copy(str, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final ImmutableList<TimelineRow> component2() {
            return this.rows;
        }

        public final TimelineState copy(String title, ImmutableList<TimelineRow> rows) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new TimelineState(title, rows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimelineState)) {
                return false;
            }
            TimelineState timelineState = (TimelineState) other;
            return Intrinsics.areEqual(this.title, timelineState.title) && Intrinsics.areEqual(this.rows, timelineState.rows);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.rows.hashCode();
        }

        public String toString() {
            return "TimelineState(title=" + this.title + ", rows=" + this.rows + ")";
        }

        public TimelineState(String title, ImmutableList<TimelineRow> rows) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.title = title;
            this.rows = rows;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ImmutableList<TimelineRow> getRows() {
            return this.rows;
        }

        /* compiled from: TaxLossHarvestDashboardViewState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState$TimelineState$TimelineRow;", "", "state", "Lcom/robinhood/compose/bento/component/rows/BentoTimelineRowState;", "bottomSheet", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$BottomSheet;", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoTimelineRowState;Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$BottomSheet;)V", "getState", "()Lcom/robinhood/compose/bento/component/rows/BentoTimelineRowState;", "getBottomSheet", "()Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$BottomSheet;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TimelineRow {
            public static final int $stable = 8;
            private final TaxLossHarvestDashboard.BottomSheet bottomSheet;
            private final BentoTimelineRowState state;

            public static /* synthetic */ TimelineRow copy$default(TimelineRow timelineRow, BentoTimelineRowState bentoTimelineRowState, TaxLossHarvestDashboard.BottomSheet bottomSheet, int i, Object obj) {
                if ((i & 1) != 0) {
                    bentoTimelineRowState = timelineRow.state;
                }
                if ((i & 2) != 0) {
                    bottomSheet = timelineRow.bottomSheet;
                }
                return timelineRow.copy(bentoTimelineRowState, bottomSheet);
            }

            /* renamed from: component1, reason: from getter */
            public final BentoTimelineRowState getState() {
                return this.state;
            }

            /* renamed from: component2, reason: from getter */
            public final TaxLossHarvestDashboard.BottomSheet getBottomSheet() {
                return this.bottomSheet;
            }

            public final TimelineRow copy(BentoTimelineRowState state, TaxLossHarvestDashboard.BottomSheet bottomSheet) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new TimelineRow(state, bottomSheet);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimelineRow)) {
                    return false;
                }
                TimelineRow timelineRow = (TimelineRow) other;
                return Intrinsics.areEqual(this.state, timelineRow.state) && Intrinsics.areEqual(this.bottomSheet, timelineRow.bottomSheet);
            }

            public int hashCode() {
                int iHashCode = this.state.hashCode() * 31;
                TaxLossHarvestDashboard.BottomSheet bottomSheet = this.bottomSheet;
                return iHashCode + (bottomSheet == null ? 0 : bottomSheet.hashCode());
            }

            public String toString() {
                return "TimelineRow(state=" + this.state + ", bottomSheet=" + this.bottomSheet + ")";
            }

            public TimelineRow(BentoTimelineRowState state, TaxLossHarvestDashboard.BottomSheet bottomSheet) {
                Intrinsics.checkNotNullParameter(state, "state");
                this.state = state;
                this.bottomSheet = bottomSheet;
            }

            public /* synthetic */ TimelineRow(BentoTimelineRowState bentoTimelineRowState, TaxLossHarvestDashboard.BottomSheet bottomSheet, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(bentoTimelineRowState, (i & 2) != 0 ? null : bottomSheet);
            }

            public final BentoTimelineRowState getState() {
                return this.state;
            }

            public final TaxLossHarvestDashboard.BottomSheet getBottomSheet() {
                return this.bottomSheet;
            }
        }
    }

    /* compiled from: TaxLossHarvestDashboardViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState$Companion;", "", "<init>", "()V", "Loading", "Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState;", "getLoading", "()Lcom/robinhood/android/advisory/tlh/summary/TaxLossHarvestDashboardViewState;", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TaxLossHarvestDashboardViewState getLoading() {
            return TaxLossHarvestDashboardViewState.Loading;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        TaxLossHarvestDashboard.Status status = new TaxLossHarvestDashboard.Status("--------", TaxLossHarvestDashboard2.getDefaultStatusColor(), "------------------------------------------------------------------------------", null);
        Timeline.Status status2 = Timeline.Status.INCOMPLETE;
        int i = 2;
        Loading = new TaxLossHarvestDashboardViewState("-------------------", "----------------------------------------------------------------------------", status, new TimelineState("-------------", extensions2.persistentListOf(new TimelineState.TimelineRow(new BentoTimelineRowState(status2, Timeline.Position.TOP, "-------------", null, null, "--------------------------------------------------------------------------", null, null, null, false, null, null, null, null, false, false, 0, false, 0, false, false, false, null, null, 16777176, null), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new TimelineState.TimelineRow(new BentoTimelineRowState(status2, Timeline.Position.BETWEEN, "-------------", null, null, "--------------------------------------------------------------------------", null, null, null, false, null, null, null, null, false, false, 0, false, 0, false, false, false, null, null, 16777176, null), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new TimelineState.TimelineRow(new BentoTimelineRowState(status2, Timeline.Position.BOTTOM, "-------------", null, null, "--------------------------------------------------------------------------", null, null, null, false, null, null, null, null, false, false, 0, false, 0, false, false, false, null, null, 16777176, null), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0))), null, null, null, true, null, null, 768, null);
    }
}
