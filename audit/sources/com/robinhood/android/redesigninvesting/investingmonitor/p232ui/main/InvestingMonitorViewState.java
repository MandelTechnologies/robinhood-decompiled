package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.android.redesigninvesting.investingmonitor.modes.InvestingMonitorViewMode;
import com.robinhood.udf.UiEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: InvestingMonitorViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState;", "", "Loading", "Loaded", "Empty", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState$Empty;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState$Loaded;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState$Loading;", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface InvestingMonitorViewState {

    /* compiled from: InvestingMonitorViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState$Loading;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements InvestingMonitorViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -601037609;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: InvestingMonitorViewState.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010!\u001a\u00020\u000eHÆ\u0003Ja\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState$Loaded;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState;", "tableData", "Lcom/robinhood/android/generic/table/GenericTableData;", "pages", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/model/InvestingMonitorPage;", "titles", "", "recentlyCreatedPage", "Lcom/robinhood/udf/UiEvent;", "sortingInProgressListId", "Ljava/util/UUID;", "viewMode", "Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;", "<init>", "(Lcom/robinhood/android/generic/table/GenericTableData;Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/udf/UiEvent;Ljava/util/UUID;Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;)V", "getTableData", "()Lcom/robinhood/android/generic/table/GenericTableData;", "getPages", "()Lkotlinx/collections/immutable/PersistentList;", "getTitles", "getRecentlyCreatedPage", "()Lcom/robinhood/udf/UiEvent;", "getSortingInProgressListId", "()Ljava/util/UUID;", "getViewMode", "()Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements InvestingMonitorViewState {
        public static final int $stable = 8;
        private final ImmutableList3<InvestingMonitorPage> pages;
        private final UiEvent<InvestingMonitorPage> recentlyCreatedPage;
        private final UUID sortingInProgressListId;
        private final GenericTableData<?> tableData;
        private final ImmutableList3<String> titles;
        private final InvestingMonitorViewMode viewMode;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, GenericTableData genericTableData, ImmutableList3 immutableList3, ImmutableList3 immutableList32, UiEvent uiEvent, UUID uuid, InvestingMonitorViewMode investingMonitorViewMode, int i, Object obj) {
            if ((i & 1) != 0) {
                genericTableData = loaded.tableData;
            }
            if ((i & 2) != 0) {
                immutableList3 = loaded.pages;
            }
            if ((i & 4) != 0) {
                immutableList32 = loaded.titles;
            }
            if ((i & 8) != 0) {
                uiEvent = loaded.recentlyCreatedPage;
            }
            if ((i & 16) != 0) {
                uuid = loaded.sortingInProgressListId;
            }
            if ((i & 32) != 0) {
                investingMonitorViewMode = loaded.viewMode;
            }
            UUID uuid2 = uuid;
            InvestingMonitorViewMode investingMonitorViewMode2 = investingMonitorViewMode;
            return loaded.copy(genericTableData, immutableList3, immutableList32, uiEvent, uuid2, investingMonitorViewMode2);
        }

        public final GenericTableData<?> component1() {
            return this.tableData;
        }

        public final ImmutableList3<InvestingMonitorPage> component2() {
            return this.pages;
        }

        public final ImmutableList3<String> component3() {
            return this.titles;
        }

        public final UiEvent<InvestingMonitorPage> component4() {
            return this.recentlyCreatedPage;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getSortingInProgressListId() {
            return this.sortingInProgressListId;
        }

        /* renamed from: component6, reason: from getter */
        public final InvestingMonitorViewMode getViewMode() {
            return this.viewMode;
        }

        public final Loaded copy(GenericTableData<?> tableData, ImmutableList3<InvestingMonitorPage> pages, ImmutableList3<String> titles, UiEvent<InvestingMonitorPage> recentlyCreatedPage, UUID sortingInProgressListId, InvestingMonitorViewMode viewMode) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(titles, "titles");
            Intrinsics.checkNotNullParameter(viewMode, "viewMode");
            return new Loaded(tableData, pages, titles, recentlyCreatedPage, sortingInProgressListId, viewMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.tableData, loaded.tableData) && Intrinsics.areEqual(this.pages, loaded.pages) && Intrinsics.areEqual(this.titles, loaded.titles) && Intrinsics.areEqual(this.recentlyCreatedPage, loaded.recentlyCreatedPage) && Intrinsics.areEqual(this.sortingInProgressListId, loaded.sortingInProgressListId) && this.viewMode == loaded.viewMode;
        }

        public int hashCode() {
            GenericTableData<?> genericTableData = this.tableData;
            int iHashCode = (((((genericTableData == null ? 0 : genericTableData.hashCode()) * 31) + this.pages.hashCode()) * 31) + this.titles.hashCode()) * 31;
            UiEvent<InvestingMonitorPage> uiEvent = this.recentlyCreatedPage;
            int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
            UUID uuid = this.sortingInProgressListId;
            return ((iHashCode2 + (uuid != null ? uuid.hashCode() : 0)) * 31) + this.viewMode.hashCode();
        }

        public String toString() {
            return "Loaded(tableData=" + this.tableData + ", pages=" + this.pages + ", titles=" + this.titles + ", recentlyCreatedPage=" + this.recentlyCreatedPage + ", sortingInProgressListId=" + this.sortingInProgressListId + ", viewMode=" + this.viewMode + ")";
        }

        public Loaded(GenericTableData<?> genericTableData, ImmutableList3<InvestingMonitorPage> pages, ImmutableList3<String> titles, UiEvent<InvestingMonitorPage> uiEvent, UUID uuid, InvestingMonitorViewMode viewMode) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(titles, "titles");
            Intrinsics.checkNotNullParameter(viewMode, "viewMode");
            this.tableData = genericTableData;
            this.pages = pages;
            this.titles = titles;
            this.recentlyCreatedPage = uiEvent;
            this.sortingInProgressListId = uuid;
            this.viewMode = viewMode;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Loaded(GenericTableData genericTableData, ImmutableList3 immutableList3, ImmutableList3 immutableList32, UiEvent uiEvent, UUID uuid, InvestingMonitorViewMode investingMonitorViewMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            InvestingMonitorViewMode investingMonitorViewMode2;
            UUID uuid2;
            genericTableData = (i & 1) != 0 ? null : genericTableData;
            uiEvent = (i & 8) != 0 ? null : uiEvent;
            if ((i & 16) != 0) {
                investingMonitorViewMode2 = investingMonitorViewMode;
                uuid2 = null;
            } else {
                investingMonitorViewMode2 = investingMonitorViewMode;
                uuid2 = uuid;
            }
            this(genericTableData, immutableList3, immutableList32, uiEvent, uuid2, investingMonitorViewMode2);
        }

        public final GenericTableData<?> getTableData() {
            return this.tableData;
        }

        public final ImmutableList3<InvestingMonitorPage> getPages() {
            return this.pages;
        }

        public final ImmutableList3<String> getTitles() {
            return this.titles;
        }

        public final UiEvent<InvestingMonitorPage> getRecentlyCreatedPage() {
            return this.recentlyCreatedPage;
        }

        public final UUID getSortingInProgressListId() {
            return this.sortingInProgressListId;
        }

        public final InvestingMonitorViewMode getViewMode() {
            return this.viewMode;
        }
    }

    /* compiled from: InvestingMonitorViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState$Empty;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements InvestingMonitorViewState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return -793726040;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
        }
    }
}
