package com.robinhood.lib.transfers.nonoriginated;

import bff_money_movement.service.p019v1.DataRowDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: NonOriginatedAccountInfoComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoState;", "", "title", "", "subtitleMarkdown", "sections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoState$Section;", "disclosureMarkdown", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitleMarkdown", "getSections", "()Lkotlinx/collections/immutable/ImmutableList;", "getDisclosureMarkdown", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Section", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NonOriginatedAccountInfoState {
    public static final int $stable = 8;
    private final String disclosureMarkdown;
    private final ImmutableList<Section> sections;
    private final String subtitleMarkdown;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NonOriginatedAccountInfoState copy$default(NonOriginatedAccountInfoState nonOriginatedAccountInfoState, String str, String str2, ImmutableList immutableList, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nonOriginatedAccountInfoState.title;
        }
        if ((i & 2) != 0) {
            str2 = nonOriginatedAccountInfoState.subtitleMarkdown;
        }
        if ((i & 4) != 0) {
            immutableList = nonOriginatedAccountInfoState.sections;
        }
        if ((i & 8) != 0) {
            str3 = nonOriginatedAccountInfoState.disclosureMarkdown;
        }
        return nonOriginatedAccountInfoState.copy(str, str2, immutableList, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final ImmutableList<Section> component3() {
        return this.sections;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final NonOriginatedAccountInfoState copy(String title, String subtitleMarkdown, ImmutableList<Section> sections, String disclosureMarkdown) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new NonOriginatedAccountInfoState(title, subtitleMarkdown, sections, disclosureMarkdown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonOriginatedAccountInfoState)) {
            return false;
        }
        NonOriginatedAccountInfoState nonOriginatedAccountInfoState = (NonOriginatedAccountInfoState) other;
        return Intrinsics.areEqual(this.title, nonOriginatedAccountInfoState.title) && Intrinsics.areEqual(this.subtitleMarkdown, nonOriginatedAccountInfoState.subtitleMarkdown) && Intrinsics.areEqual(this.sections, nonOriginatedAccountInfoState.sections) && Intrinsics.areEqual(this.disclosureMarkdown, nonOriginatedAccountInfoState.disclosureMarkdown);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.subtitleMarkdown.hashCode()) * 31) + this.sections.hashCode()) * 31;
        String str = this.disclosureMarkdown;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NonOriginatedAccountInfoState(title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", sections=" + this.sections + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
    }

    public NonOriginatedAccountInfoState(String title, String subtitleMarkdown, ImmutableList<Section> sections, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleMarkdown, "subtitleMarkdown");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.title = title;
        this.subtitleMarkdown = subtitleMarkdown;
        this.sections = sections;
        this.disclosureMarkdown = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final ImmutableList<Section> getSections() {
        return this.sections;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* compiled from: NonOriginatedAccountInfoComposable.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JL\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoState$Section;", "", "rows", "", "Lbff_money_movement/service/v1/DataRowDto;", "title", "", "subtitleMarkdown", "collapsableCount", "", "isExpanded", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getRows", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getSubtitleMarkdown", "getCollapsableCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "visibleRows", "getVisibleRows", "isCollapsable", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoState$Section;", "equals", "other", "hashCode", "toString", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Section {
        public static final int $stable = 8;
        private final Integer collapsableCount;
        private final boolean isExpanded;
        private final List<DataRowDto> rows;
        private final String subtitleMarkdown;
        private final String title;

        public static /* synthetic */ Section copy$default(Section section, List list, String str, String str2, Integer num, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = section.rows;
            }
            if ((i & 2) != 0) {
                str = section.title;
            }
            if ((i & 4) != 0) {
                str2 = section.subtitleMarkdown;
            }
            if ((i & 8) != 0) {
                num = section.collapsableCount;
            }
            if ((i & 16) != 0) {
                z = section.isExpanded;
            }
            boolean z2 = z;
            String str3 = str2;
            return section.copy(list, str, str3, num, z2);
        }

        public final List<DataRowDto> component1() {
            return this.rows;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitleMarkdown() {
            return this.subtitleMarkdown;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getCollapsableCount() {
            return this.collapsableCount;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        public final Section copy(List<DataRowDto> rows, String title, String subtitleMarkdown, Integer collapsableCount, boolean isExpanded) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Section(rows, title, subtitleMarkdown, collapsableCount, isExpanded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.areEqual(this.rows, section.rows) && Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.subtitleMarkdown, section.subtitleMarkdown) && Intrinsics.areEqual(this.collapsableCount, section.collapsableCount) && this.isExpanded == section.isExpanded;
        }

        public int hashCode() {
            int iHashCode = this.rows.hashCode() * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitleMarkdown;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.collapsableCount;
            return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isExpanded);
        }

        public String toString() {
            return "Section(rows=" + this.rows + ", title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", collapsableCount=" + this.collapsableCount + ", isExpanded=" + this.isExpanded + ")";
        }

        public Section(List<DataRowDto> rows, String str, String str2, Integer num, boolean z) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.rows = rows;
            this.title = str;
            this.subtitleMarkdown = str2;
            this.collapsableCount = num;
            this.isExpanded = z;
        }

        public /* synthetic */ Section(List list, String str, String str2, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? true : z);
        }

        public final List<DataRowDto> getRows() {
            return this.rows;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitleMarkdown() {
            return this.subtitleMarkdown;
        }

        public final Integer getCollapsableCount() {
            return this.collapsableCount;
        }

        public final boolean isExpanded() {
            return this.isExpanded;
        }

        public final List<DataRowDto> getVisibleRows() {
            if (this.isExpanded) {
                return this.rows;
            }
            Integer num = this.collapsableCount;
            if (num != null) {
                List<DataRowDto> listTake = CollectionsKt.take(this.rows, num.intValue());
                if (listTake != null) {
                    return listTake;
                }
            }
            return this.rows;
        }

        public final boolean isCollapsable() {
            Integer num = this.collapsableCount;
            return num != null && num.intValue() < this.rows.size();
        }
    }
}
