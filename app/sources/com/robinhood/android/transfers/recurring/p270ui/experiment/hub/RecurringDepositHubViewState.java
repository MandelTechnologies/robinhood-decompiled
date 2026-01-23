package com.robinhood.android.transfers.recurring.p270ui.experiment.hub;

import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.api.cashier.DepositScheduleType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RecurringDepositHubViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState;", "", "infoBanner", "Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "labelPillForRecurringExtraCash", "", "sections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState$Section;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getInfoBanner", "()Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "getLabelPillForRecurringExtraCash", "()Ljava/lang/String;", "getSections", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Section", "Row", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecurringDepositHubViewState {
    public static final int $stable = 8;
    private final InfoBanner<GenericAction> infoBanner;
    private final String labelPillForRecurringExtraCash;
    private final ImmutableList<Section> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringDepositHubViewState copy$default(RecurringDepositHubViewState recurringDepositHubViewState, InfoBanner infoBanner, String str, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            infoBanner = recurringDepositHubViewState.infoBanner;
        }
        if ((i & 2) != 0) {
            str = recurringDepositHubViewState.labelPillForRecurringExtraCash;
        }
        if ((i & 4) != 0) {
            immutableList = recurringDepositHubViewState.sections;
        }
        return recurringDepositHubViewState.copy(infoBanner, str, immutableList);
    }

    public final InfoBanner<GenericAction> component1() {
        return this.infoBanner;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabelPillForRecurringExtraCash() {
        return this.labelPillForRecurringExtraCash;
    }

    public final ImmutableList<Section> component3() {
        return this.sections;
    }

    public final RecurringDepositHubViewState copy(InfoBanner<? extends GenericAction> infoBanner, String labelPillForRecurringExtraCash, ImmutableList<Section> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new RecurringDepositHubViewState(infoBanner, labelPillForRecurringExtraCash, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringDepositHubViewState)) {
            return false;
        }
        RecurringDepositHubViewState recurringDepositHubViewState = (RecurringDepositHubViewState) other;
        return Intrinsics.areEqual(this.infoBanner, recurringDepositHubViewState.infoBanner) && Intrinsics.areEqual(this.labelPillForRecurringExtraCash, recurringDepositHubViewState.labelPillForRecurringExtraCash) && Intrinsics.areEqual(this.sections, recurringDepositHubViewState.sections);
    }

    public int hashCode() {
        InfoBanner<GenericAction> infoBanner = this.infoBanner;
        int iHashCode = (infoBanner == null ? 0 : infoBanner.hashCode()) * 31;
        String str = this.labelPillForRecurringExtraCash;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.sections.hashCode();
    }

    public String toString() {
        return "RecurringDepositHubViewState(infoBanner=" + this.infoBanner + ", labelPillForRecurringExtraCash=" + this.labelPillForRecurringExtraCash + ", sections=" + this.sections + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecurringDepositHubViewState(InfoBanner<? extends GenericAction> infoBanner, String str, ImmutableList<Section> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.infoBanner = infoBanner;
        this.labelPillForRecurringExtraCash = str;
        this.sections = sections;
    }

    public final InfoBanner<GenericAction> getInfoBanner() {
        return this.infoBanner;
    }

    public final String getLabelPillForRecurringExtraCash() {
        return this.labelPillForRecurringExtraCash;
    }

    public final ImmutableList<Section> getSections() {
        return this.sections;
    }

    /* compiled from: RecurringDepositHubViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState$Section;", "", "startIcon24", "Lcom/robinhood/compose/bento/component/BentoIcons$Size24;", "title", "Landroidx/compose/ui/text/AnnotatedString;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState$Row;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons$Size24;Landroidx/compose/ui/text/AnnotatedString;Lkotlinx/collections/immutable/ImmutableList;)V", "getStartIcon24", "()Lcom/robinhood/compose/bento/component/BentoIcons$Size24;", "getTitle", "()Landroidx/compose/ui/text/AnnotatedString;", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Section {
        public static final int $stable = BentoIcon4.Size24.$stable;
        private final ImmutableList<Row> rows;
        private final BentoIcon4.Size24 startIcon24;
        private final AnnotatedString title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Section copy$default(Section section, BentoIcon4.Size24 size24, AnnotatedString annotatedString, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                size24 = section.startIcon24;
            }
            if ((i & 2) != 0) {
                annotatedString = section.title;
            }
            if ((i & 4) != 0) {
                immutableList = section.rows;
            }
            return section.copy(size24, annotatedString, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final BentoIcon4.Size24 getStartIcon24() {
            return this.startIcon24;
        }

        /* renamed from: component2, reason: from getter */
        public final AnnotatedString getTitle() {
            return this.title;
        }

        public final ImmutableList<Row> component3() {
            return this.rows;
        }

        public final Section copy(BentoIcon4.Size24 startIcon24, AnnotatedString title, ImmutableList<Row> rows) {
            Intrinsics.checkNotNullParameter(startIcon24, "startIcon24");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Section(startIcon24, title, rows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.areEqual(this.startIcon24, section.startIcon24) && Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.rows, section.rows);
        }

        public int hashCode() {
            return (((this.startIcon24.hashCode() * 31) + this.title.hashCode()) * 31) + this.rows.hashCode();
        }

        public String toString() {
            BentoIcon4.Size24 size24 = this.startIcon24;
            AnnotatedString annotatedString = this.title;
            return "Section(startIcon24=" + size24 + ", title=" + ((Object) annotatedString) + ", rows=" + this.rows + ")";
        }

        public Section(BentoIcon4.Size24 startIcon24, AnnotatedString title, ImmutableList<Row> rows) {
            Intrinsics.checkNotNullParameter(startIcon24, "startIcon24");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.startIcon24 = startIcon24;
            this.title = title;
            this.rows = rows;
        }

        public final BentoIcon4.Size24 getStartIcon24() {
            return this.startIcon24;
        }

        public final AnnotatedString getTitle() {
            return this.title;
        }

        public final ImmutableList<Row> getRows() {
            return this.rows;
        }
    }

    /* compiled from: RecurringDepositHubViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState$Row;", "", "id", "", "achRelationshipId", "type", "Lcom/robinhood/models/api/cashier/DepositScheduleType;", "titlePrimaryText", "Landroidx/compose/ui/text/AnnotatedString;", "titleSecondaryText", "firstSubtitle", "secondSubtitle", "secondSubtitleAsUpdateCta", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/cashier/DepositScheduleType;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Z)V", "getId", "()Ljava/lang/String;", "getAchRelationshipId", "getType", "()Lcom/robinhood/models/api/cashier/DepositScheduleType;", "getTitlePrimaryText", "()Landroidx/compose/ui/text/AnnotatedString;", "getTitleSecondaryText", "getFirstSubtitle", "getSecondSubtitle", "getSecondSubtitleAsUpdateCta", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = 0;
        private final String achRelationshipId;
        private final AnnotatedString firstSubtitle;
        private final String id;
        private final AnnotatedString secondSubtitle;
        private final boolean secondSubtitleAsUpdateCta;
        private final AnnotatedString titlePrimaryText;
        private final AnnotatedString titleSecondaryText;
        private final DepositScheduleType type;

        public static /* synthetic */ Row copy$default(Row row, String str, String str2, DepositScheduleType depositScheduleType, AnnotatedString annotatedString, AnnotatedString annotatedString2, AnnotatedString annotatedString3, AnnotatedString annotatedString4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = row.id;
            }
            if ((i & 2) != 0) {
                str2 = row.achRelationshipId;
            }
            if ((i & 4) != 0) {
                depositScheduleType = row.type;
            }
            if ((i & 8) != 0) {
                annotatedString = row.titlePrimaryText;
            }
            if ((i & 16) != 0) {
                annotatedString2 = row.titleSecondaryText;
            }
            if ((i & 32) != 0) {
                annotatedString3 = row.firstSubtitle;
            }
            if ((i & 64) != 0) {
                annotatedString4 = row.secondSubtitle;
            }
            if ((i & 128) != 0) {
                z = row.secondSubtitleAsUpdateCta;
            }
            AnnotatedString annotatedString5 = annotatedString4;
            boolean z2 = z;
            AnnotatedString annotatedString6 = annotatedString2;
            AnnotatedString annotatedString7 = annotatedString3;
            return row.copy(str, str2, depositScheduleType, annotatedString, annotatedString6, annotatedString7, annotatedString5, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAchRelationshipId() {
            return this.achRelationshipId;
        }

        /* renamed from: component3, reason: from getter */
        public final DepositScheduleType getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final AnnotatedString getTitlePrimaryText() {
            return this.titlePrimaryText;
        }

        /* renamed from: component5, reason: from getter */
        public final AnnotatedString getTitleSecondaryText() {
            return this.titleSecondaryText;
        }

        /* renamed from: component6, reason: from getter */
        public final AnnotatedString getFirstSubtitle() {
            return this.firstSubtitle;
        }

        /* renamed from: component7, reason: from getter */
        public final AnnotatedString getSecondSubtitle() {
            return this.secondSubtitle;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getSecondSubtitleAsUpdateCta() {
            return this.secondSubtitleAsUpdateCta;
        }

        public final Row copy(String id, String achRelationshipId, DepositScheduleType type2, AnnotatedString titlePrimaryText, AnnotatedString titleSecondaryText, AnnotatedString firstSubtitle, AnnotatedString secondSubtitle, boolean secondSubtitleAsUpdateCta) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(titlePrimaryText, "titlePrimaryText");
            Intrinsics.checkNotNullParameter(firstSubtitle, "firstSubtitle");
            return new Row(id, achRelationshipId, type2, titlePrimaryText, titleSecondaryText, firstSubtitle, secondSubtitle, secondSubtitleAsUpdateCta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.id, row.id) && Intrinsics.areEqual(this.achRelationshipId, row.achRelationshipId) && this.type == row.type && Intrinsics.areEqual(this.titlePrimaryText, row.titlePrimaryText) && Intrinsics.areEqual(this.titleSecondaryText, row.titleSecondaryText) && Intrinsics.areEqual(this.firstSubtitle, row.firstSubtitle) && Intrinsics.areEqual(this.secondSubtitle, row.secondSubtitle) && this.secondSubtitleAsUpdateCta == row.secondSubtitleAsUpdateCta;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.achRelationshipId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.titlePrimaryText.hashCode()) * 31;
            AnnotatedString annotatedString = this.titleSecondaryText;
            int iHashCode2 = (((iHashCode + (annotatedString == null ? 0 : annotatedString.hashCode())) * 31) + this.firstSubtitle.hashCode()) * 31;
            AnnotatedString annotatedString2 = this.secondSubtitle;
            return ((iHashCode2 + (annotatedString2 != null ? annotatedString2.hashCode() : 0)) * 31) + Boolean.hashCode(this.secondSubtitleAsUpdateCta);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.achRelationshipId;
            DepositScheduleType depositScheduleType = this.type;
            AnnotatedString annotatedString = this.titlePrimaryText;
            AnnotatedString annotatedString2 = this.titleSecondaryText;
            AnnotatedString annotatedString3 = this.firstSubtitle;
            AnnotatedString annotatedString4 = this.secondSubtitle;
            return "Row(id=" + str + ", achRelationshipId=" + str2 + ", type=" + depositScheduleType + ", titlePrimaryText=" + ((Object) annotatedString) + ", titleSecondaryText=" + ((Object) annotatedString2) + ", firstSubtitle=" + ((Object) annotatedString3) + ", secondSubtitle=" + ((Object) annotatedString4) + ", secondSubtitleAsUpdateCta=" + this.secondSubtitleAsUpdateCta + ")";
        }

        public Row(String id, String achRelationshipId, DepositScheduleType type2, AnnotatedString titlePrimaryText, AnnotatedString annotatedString, AnnotatedString firstSubtitle, AnnotatedString annotatedString2, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(titlePrimaryText, "titlePrimaryText");
            Intrinsics.checkNotNullParameter(firstSubtitle, "firstSubtitle");
            this.id = id;
            this.achRelationshipId = achRelationshipId;
            this.type = type2;
            this.titlePrimaryText = titlePrimaryText;
            this.titleSecondaryText = annotatedString;
            this.firstSubtitle = firstSubtitle;
            this.secondSubtitle = annotatedString2;
            this.secondSubtitleAsUpdateCta = z;
        }

        public final String getId() {
            return this.id;
        }

        public final String getAchRelationshipId() {
            return this.achRelationshipId;
        }

        public final DepositScheduleType getType() {
            return this.type;
        }

        public final AnnotatedString getTitlePrimaryText() {
            return this.titlePrimaryText;
        }

        public final AnnotatedString getTitleSecondaryText() {
            return this.titleSecondaryText;
        }

        public final AnnotatedString getFirstSubtitle() {
            return this.firstSubtitle;
        }

        public final AnnotatedString getSecondSubtitle() {
            return this.secondSubtitle;
        }

        public final boolean getSecondSubtitleAsUpdateCta() {
            return this.secondSubtitleAsUpdateCta;
        }
    }
}
