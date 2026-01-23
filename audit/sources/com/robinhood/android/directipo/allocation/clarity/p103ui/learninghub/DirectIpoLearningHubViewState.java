package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub;

import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHub;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHubSection;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHubSectionData;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHubTab;
import com.robinhood.directipo.models.p292db.IpoAccessTabbedHub;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: DirectIpoLearningHubViewState.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0003789BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u00103\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u001eHÖ\u0001J\t\u00106\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState;", "", "ipoAccessLearningHub", "Lcom/robinhood/directipo/models/db/IpoAccessLearningHub;", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "isLoading", "", "error", "Lcom/robinhood/udf/UiEvent;", "", "selectedTabKey", "", "<init>", "(Lcom/robinhood/directipo/models/db/IpoAccessLearningHub;Lcom/robinhood/android/designsystem/style/DayNightOverlay;ZLcom/robinhood/udf/UiEvent;Ljava/lang/String;)V", "getIpoAccessLearningHub", "()Lcom/robinhood/directipo/models/db/IpoAccessLearningHub;", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "()Z", "getError", "()Lcom/robinhood/udf/UiEvent;", "getSelectedTabKey", "()Ljava/lang/String;", "tabs", "", "Lcom/robinhood/directipo/models/db/IpoAccessLearningHubTab;", "getTabs", "()Ljava/util/List;", "currentTabIndex", "", "getCurrentTabIndex", "()I", "topTabState", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$TopTabState;", "getTopTabState", "()Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$TopTabState;", "sectionContentState", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$SectionViewContentState;", "getSectionContentState", "()Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$SectionViewContentState;", "titleAndFooterState", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$TitleAndFooterState;", "getTitleAndFooterState", "()Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$TitleAndFooterState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "TopTabState", "SectionViewContentState", "TitleAndFooterState", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final /* data */ class DirectIpoLearningHubViewState {
    public static final int $stable = 8;
    private final DayNightOverlay dayNightOverlay;
    private final UiEvent<Throwable> error;
    private final IpoAccessLearningHub ipoAccessLearningHub;
    private final boolean isLoading;
    private final String selectedTabKey;

    public DirectIpoLearningHubViewState() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ DirectIpoLearningHubViewState copy$default(DirectIpoLearningHubViewState directIpoLearningHubViewState, IpoAccessLearningHub ipoAccessLearningHub, DayNightOverlay dayNightOverlay, boolean z, UiEvent uiEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ipoAccessLearningHub = directIpoLearningHubViewState.ipoAccessLearningHub;
        }
        if ((i & 2) != 0) {
            dayNightOverlay = directIpoLearningHubViewState.dayNightOverlay;
        }
        if ((i & 4) != 0) {
            z = directIpoLearningHubViewState.isLoading;
        }
        if ((i & 8) != 0) {
            uiEvent = directIpoLearningHubViewState.error;
        }
        if ((i & 16) != 0) {
            str = directIpoLearningHubViewState.selectedTabKey;
        }
        String str2 = str;
        boolean z2 = z;
        return directIpoLearningHubViewState.copy(ipoAccessLearningHub, dayNightOverlay, z2, uiEvent, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final IpoAccessLearningHub getIpoAccessLearningHub() {
        return this.ipoAccessLearningHub;
    }

    /* renamed from: component2, reason: from getter */
    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> component4() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSelectedTabKey() {
        return this.selectedTabKey;
    }

    public final DirectIpoLearningHubViewState copy(IpoAccessLearningHub ipoAccessLearningHub, DayNightOverlay dayNightOverlay, boolean isLoading, UiEvent<Throwable> error, String selectedTabKey) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        return new DirectIpoLearningHubViewState(ipoAccessLearningHub, dayNightOverlay, isLoading, error, selectedTabKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectIpoLearningHubViewState)) {
            return false;
        }
        DirectIpoLearningHubViewState directIpoLearningHubViewState = (DirectIpoLearningHubViewState) other;
        return Intrinsics.areEqual(this.ipoAccessLearningHub, directIpoLearningHubViewState.ipoAccessLearningHub) && this.dayNightOverlay == directIpoLearningHubViewState.dayNightOverlay && this.isLoading == directIpoLearningHubViewState.isLoading && Intrinsics.areEqual(this.error, directIpoLearningHubViewState.error) && Intrinsics.areEqual(this.selectedTabKey, directIpoLearningHubViewState.selectedTabKey);
    }

    public int hashCode() {
        IpoAccessLearningHub ipoAccessLearningHub = this.ipoAccessLearningHub;
        int iHashCode = (((((ipoAccessLearningHub == null ? 0 : ipoAccessLearningHub.hashCode()) * 31) + this.dayNightOverlay.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        String str = this.selectedTabKey;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DirectIpoLearningHubViewState(ipoAccessLearningHub=" + this.ipoAccessLearningHub + ", dayNightOverlay=" + this.dayNightOverlay + ", isLoading=" + this.isLoading + ", error=" + this.error + ", selectedTabKey=" + this.selectedTabKey + ")";
    }

    public DirectIpoLearningHubViewState(IpoAccessLearningHub ipoAccessLearningHub, DayNightOverlay dayNightOverlay, boolean z, UiEvent<Throwable> uiEvent, String str) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        this.ipoAccessLearningHub = ipoAccessLearningHub;
        this.dayNightOverlay = dayNightOverlay;
        this.isLoading = z;
        this.error = uiEvent;
        this.selectedTabKey = str;
    }

    public final IpoAccessLearningHub getIpoAccessLearningHub() {
        return this.ipoAccessLearningHub;
    }

    public /* synthetic */ DirectIpoLearningHubViewState(IpoAccessLearningHub ipoAccessLearningHub, DayNightOverlay dayNightOverlay, boolean z, UiEvent uiEvent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ipoAccessLearningHub, (i & 2) != 0 ? DayNightOverlay.DAY : dayNightOverlay, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : str);
    }

    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final String getSelectedTabKey() {
        return this.selectedTabKey;
    }

    private final List<IpoAccessLearningHubTab> getTabs() {
        IpoAccessTabbedHub tabbedHub;
        List<IpoAccessLearningHubTab> tabs;
        IpoAccessLearningHub ipoAccessLearningHub = this.ipoAccessLearningHub;
        return (ipoAccessLearningHub == null || (tabbedHub = ipoAccessLearningHub.getTabbedHub()) == null || (tabs = tabbedHub.getTabs()) == null) ? CollectionsKt.emptyList() : tabs;
    }

    private final int getCurrentTabIndex() {
        List<IpoAccessLearningHubTab> tabs = getTabs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(((IpoAccessLearningHubTab) it.next()).getKey());
        }
        return RangesKt.coerceAtLeast(CollectionsKt.indexOf((List<? extends String>) arrayList, this.selectedTabKey), 0);
    }

    public final TopTabState getTopTabState() {
        return new TopTabState(getCurrentTabIndex(), getTabs());
    }

    public final SectionViewContentState getSectionContentState() {
        ArrayList arrayList;
        List<IpoAccessLearningHubSection> sections;
        DayNightOverlay dayNightOverlay = this.dayNightOverlay;
        IpoAccessLearningHubTab ipoAccessLearningHubTab = (IpoAccessLearningHubTab) CollectionsKt.getOrNull(getTabs(), getCurrentTabIndex());
        if (ipoAccessLearningHubTab == null || (sections = ipoAccessLearningHubTab.getSections()) == null) {
            arrayList = null;
        } else {
            List<IpoAccessLearningHubSection> list = sections;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((IpoAccessLearningHubSection) it.next()).getSectionData());
            }
        }
        return new SectionViewContentState(dayNightOverlay, arrayList);
    }

    public final TitleAndFooterState getTitleAndFooterState() {
        IpoAccessTabbedHub tabbedHub;
        IpoAccessTabbedHub tabbedHub2;
        IpoAccessLearningHub ipoAccessLearningHub = this.ipoAccessLearningHub;
        GenericButton footerButton = null;
        String title = (ipoAccessLearningHub == null || (tabbedHub2 = ipoAccessLearningHub.getTabbedHub()) == null) ? null : tabbedHub2.getTitle();
        IpoAccessLearningHub ipoAccessLearningHub2 = this.ipoAccessLearningHub;
        if (ipoAccessLearningHub2 != null && (tabbedHub = ipoAccessLearningHub2.getTabbedHub()) != null) {
            footerButton = tabbedHub.getFooterButton();
        }
        return new TitleAndFooterState(title, footerButton);
    }

    /* compiled from: DirectIpoLearningHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$TopTabState;", "", "currentTabIndex", "", "tabs", "", "Lcom/robinhood/directipo/models/db/IpoAccessLearningHubTab;", "<init>", "(ILjava/util/List;)V", "getCurrentTabIndex", "()I", "getTabs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TopTabState {
        public static final int $stable = 8;
        private final int currentTabIndex;
        private final List<IpoAccessLearningHubTab> tabs;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TopTabState copy$default(TopTabState topTabState, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = topTabState.currentTabIndex;
            }
            if ((i2 & 2) != 0) {
                list = topTabState.tabs;
            }
            return topTabState.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCurrentTabIndex() {
            return this.currentTabIndex;
        }

        public final List<IpoAccessLearningHubTab> component2() {
            return this.tabs;
        }

        public final TopTabState copy(int currentTabIndex, List<IpoAccessLearningHubTab> tabs) {
            Intrinsics.checkNotNullParameter(tabs, "tabs");
            return new TopTabState(currentTabIndex, tabs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopTabState)) {
                return false;
            }
            TopTabState topTabState = (TopTabState) other;
            return this.currentTabIndex == topTabState.currentTabIndex && Intrinsics.areEqual(this.tabs, topTabState.tabs);
        }

        public int hashCode() {
            return (Integer.hashCode(this.currentTabIndex) * 31) + this.tabs.hashCode();
        }

        public String toString() {
            return "TopTabState(currentTabIndex=" + this.currentTabIndex + ", tabs=" + this.tabs + ")";
        }

        public TopTabState(int i, List<IpoAccessLearningHubTab> tabs) {
            Intrinsics.checkNotNullParameter(tabs, "tabs");
            this.currentTabIndex = i;
            this.tabs = tabs;
        }

        public /* synthetic */ TopTabState(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, list);
        }

        public final int getCurrentTabIndex() {
            return this.currentTabIndex;
        }

        public final List<IpoAccessLearningHubTab> getTabs() {
            return this.tabs;
        }
    }

    /* compiled from: DirectIpoLearningHubViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$SectionViewContentState;", "", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "selectedSectionDataList", "", "Lcom/robinhood/directipo/models/db/IpoAccessLearningHubSectionData;", "<init>", "(Lcom/robinhood/android/designsystem/style/DayNightOverlay;Ljava/util/List;)V", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getSelectedSectionDataList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SectionViewContentState {
        public static final int $stable = 8;
        private final DayNightOverlay dayNightOverlay;
        private final List<IpoAccessLearningHubSectionData> selectedSectionDataList;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SectionViewContentState copy$default(SectionViewContentState sectionViewContentState, DayNightOverlay dayNightOverlay, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                dayNightOverlay = sectionViewContentState.dayNightOverlay;
            }
            if ((i & 2) != 0) {
                list = sectionViewContentState.selectedSectionDataList;
            }
            return sectionViewContentState.copy(dayNightOverlay, list);
        }

        /* renamed from: component1, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        public final List<IpoAccessLearningHubSectionData> component2() {
            return this.selectedSectionDataList;
        }

        public final SectionViewContentState copy(DayNightOverlay dayNightOverlay, List<? extends IpoAccessLearningHubSectionData> selectedSectionDataList) {
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            return new SectionViewContentState(dayNightOverlay, selectedSectionDataList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionViewContentState)) {
                return false;
            }
            SectionViewContentState sectionViewContentState = (SectionViewContentState) other;
            return this.dayNightOverlay == sectionViewContentState.dayNightOverlay && Intrinsics.areEqual(this.selectedSectionDataList, sectionViewContentState.selectedSectionDataList);
        }

        public int hashCode() {
            int iHashCode = this.dayNightOverlay.hashCode() * 31;
            List<IpoAccessLearningHubSectionData> list = this.selectedSectionDataList;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "SectionViewContentState(dayNightOverlay=" + this.dayNightOverlay + ", selectedSectionDataList=" + this.selectedSectionDataList + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SectionViewContentState(DayNightOverlay dayNightOverlay, List<? extends IpoAccessLearningHubSectionData> list) {
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            this.dayNightOverlay = dayNightOverlay;
            this.selectedSectionDataList = list;
        }

        public /* synthetic */ SectionViewContentState(DayNightOverlay dayNightOverlay, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DayNightOverlay.DAY : dayNightOverlay, list);
        }

        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        public final List<IpoAccessLearningHubSectionData> getSelectedSectionDataList() {
            return this.selectedSectionDataList;
        }
    }

    /* compiled from: DirectIpoLearningHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$TitleAndFooterState;", "", "title", "", "footerButton", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/db/GenericButton;)V", "getTitle", "()Ljava/lang/String;", "getFooterButton", "()Lcom/robinhood/models/serverdriven/db/GenericButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TitleAndFooterState {
        public static final int $stable = 8;
        private final GenericButton footerButton;
        private final String title;

        public static /* synthetic */ TitleAndFooterState copy$default(TitleAndFooterState titleAndFooterState, String str, GenericButton genericButton, int i, Object obj) {
            if ((i & 1) != 0) {
                str = titleAndFooterState.title;
            }
            if ((i & 2) != 0) {
                genericButton = titleAndFooterState.footerButton;
            }
            return titleAndFooterState.copy(str, genericButton);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final GenericButton getFooterButton() {
            return this.footerButton;
        }

        public final TitleAndFooterState copy(String title, GenericButton footerButton) {
            return new TitleAndFooterState(title, footerButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleAndFooterState)) {
                return false;
            }
            TitleAndFooterState titleAndFooterState = (TitleAndFooterState) other;
            return Intrinsics.areEqual(this.title, titleAndFooterState.title) && Intrinsics.areEqual(this.footerButton, titleAndFooterState.footerButton);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            GenericButton genericButton = this.footerButton;
            return iHashCode + (genericButton != null ? genericButton.hashCode() : 0);
        }

        public String toString() {
            return "TitleAndFooterState(title=" + this.title + ", footerButton=" + this.footerButton + ")";
        }

        public TitleAndFooterState(String str, GenericButton genericButton) {
            this.title = str;
            this.footerButton = genericButton;
        }

        public final String getTitle() {
            return this.title;
        }

        public final GenericButton getFooterButton() {
            return this.footerButton;
        }
    }
}
