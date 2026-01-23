package com.robinhood.android.advisory.dashboard.overview;

import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.util.Money;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ManagedDashboardOverviewChartState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003:;<Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0013HÆ\u0003Ju\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00104\u001a\u00020\u00132\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewChartState;", "accountNumber", "", "bars", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsBar;", "activeSpan", "supportedSpans", "", "Lcom/robinhood/android/charts/models/db/SpanOption;", "defaultCursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "selectedBarInfo", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$SelectedBarInfo;", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "learnMore", "showUnreadIndicator", "", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$SelectedBarInfo;Lcom/robinhood/models/serverdriven/experimental/api/Direction;Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getBars", "()Lkotlinx/collections/immutable/ImmutableList;", "getActiveSpan", "getSupportedSpans", "()Ljava/util/List;", "getDefaultCursorData", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getSelectedBarInfo", "()Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$SelectedBarInfo;", "getDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getLearnMore", "getShowUnreadIndicator", "()Z", "type", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "getType", "()Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "SelectedBarInfo", "ReturnsBar", "ReturnsType", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ManagedReturnsChartState implements ManagedDashboardOverviewChartState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final String activeSpan;
    private final ImmutableList<ReturnsBar> bars;
    private final CursorData defaultCursorData;
    private final Direction direction;
    private final String learnMore;
    private final SelectedBarInfo selectedBarInfo;
    private final boolean showUnreadIndicator;
    private final List<SpanOption> supportedSpans;

    public static /* synthetic */ ManagedReturnsChartState copy$default(ManagedReturnsChartState managedReturnsChartState, String str, ImmutableList immutableList, String str2, List list, CursorData cursorData, SelectedBarInfo selectedBarInfo, Direction direction, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managedReturnsChartState.accountNumber;
        }
        if ((i & 2) != 0) {
            immutableList = managedReturnsChartState.bars;
        }
        if ((i & 4) != 0) {
            str2 = managedReturnsChartState.activeSpan;
        }
        if ((i & 8) != 0) {
            list = managedReturnsChartState.supportedSpans;
        }
        if ((i & 16) != 0) {
            cursorData = managedReturnsChartState.defaultCursorData;
        }
        if ((i & 32) != 0) {
            selectedBarInfo = managedReturnsChartState.selectedBarInfo;
        }
        if ((i & 64) != 0) {
            direction = managedReturnsChartState.direction;
        }
        if ((i & 128) != 0) {
            str3 = managedReturnsChartState.learnMore;
        }
        if ((i & 256) != 0) {
            z = managedReturnsChartState.showUnreadIndicator;
        }
        String str4 = str3;
        boolean z2 = z;
        SelectedBarInfo selectedBarInfo2 = selectedBarInfo;
        Direction direction2 = direction;
        CursorData cursorData2 = cursorData;
        String str5 = str2;
        return managedReturnsChartState.copy(str, immutableList, str5, list, cursorData2, selectedBarInfo2, direction2, str4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ImmutableList<ReturnsBar> component2() {
        return this.bars;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActiveSpan() {
        return this.activeSpan;
    }

    public final List<SpanOption> component4() {
        return this.supportedSpans;
    }

    /* renamed from: component5, reason: from getter */
    public final CursorData getDefaultCursorData() {
        return this.defaultCursorData;
    }

    /* renamed from: component6, reason: from getter */
    public final SelectedBarInfo getSelectedBarInfo() {
        return this.selectedBarInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLearnMore() {
        return this.learnMore;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowUnreadIndicator() {
        return this.showUnreadIndicator;
    }

    public final ManagedReturnsChartState copy(String accountNumber, ImmutableList<ReturnsBar> bars, String activeSpan, List<SpanOption> supportedSpans, CursorData defaultCursorData, SelectedBarInfo selectedBarInfo, Direction direction, String learnMore, boolean showUnreadIndicator) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(bars, "bars");
        Intrinsics.checkNotNullParameter(activeSpan, "activeSpan");
        Intrinsics.checkNotNullParameter(supportedSpans, "supportedSpans");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new ManagedReturnsChartState(accountNumber, bars, activeSpan, supportedSpans, defaultCursorData, selectedBarInfo, direction, learnMore, showUnreadIndicator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManagedReturnsChartState)) {
            return false;
        }
        ManagedReturnsChartState managedReturnsChartState = (ManagedReturnsChartState) other;
        return Intrinsics.areEqual(this.accountNumber, managedReturnsChartState.accountNumber) && Intrinsics.areEqual(this.bars, managedReturnsChartState.bars) && Intrinsics.areEqual(this.activeSpan, managedReturnsChartState.activeSpan) && Intrinsics.areEqual(this.supportedSpans, managedReturnsChartState.supportedSpans) && Intrinsics.areEqual(this.defaultCursorData, managedReturnsChartState.defaultCursorData) && Intrinsics.areEqual(this.selectedBarInfo, managedReturnsChartState.selectedBarInfo) && this.direction == managedReturnsChartState.direction && Intrinsics.areEqual(this.learnMore, managedReturnsChartState.learnMore) && this.showUnreadIndicator == managedReturnsChartState.showUnreadIndicator;
    }

    public int hashCode() {
        int iHashCode = ((((((this.accountNumber.hashCode() * 31) + this.bars.hashCode()) * 31) + this.activeSpan.hashCode()) * 31) + this.supportedSpans.hashCode()) * 31;
        CursorData cursorData = this.defaultCursorData;
        int iHashCode2 = (iHashCode + (cursorData == null ? 0 : cursorData.hashCode())) * 31;
        SelectedBarInfo selectedBarInfo = this.selectedBarInfo;
        int iHashCode3 = (((iHashCode2 + (selectedBarInfo == null ? 0 : selectedBarInfo.hashCode())) * 31) + this.direction.hashCode()) * 31;
        String str = this.learnMore;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.showUnreadIndicator);
    }

    public String toString() {
        return "ManagedReturnsChartState(accountNumber=" + this.accountNumber + ", bars=" + this.bars + ", activeSpan=" + this.activeSpan + ", supportedSpans=" + this.supportedSpans + ", defaultCursorData=" + this.defaultCursorData + ", selectedBarInfo=" + this.selectedBarInfo + ", direction=" + this.direction + ", learnMore=" + this.learnMore + ", showUnreadIndicator=" + this.showUnreadIndicator + ")";
    }

    public ManagedReturnsChartState(String accountNumber, ImmutableList<ReturnsBar> bars, String activeSpan, List<SpanOption> supportedSpans, CursorData cursorData, SelectedBarInfo selectedBarInfo, Direction direction, String str, boolean z) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(bars, "bars");
        Intrinsics.checkNotNullParameter(activeSpan, "activeSpan");
        Intrinsics.checkNotNullParameter(supportedSpans, "supportedSpans");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.accountNumber = accountNumber;
        this.bars = bars;
        this.activeSpan = activeSpan;
        this.supportedSpans = supportedSpans;
        this.defaultCursorData = cursorData;
        this.selectedBarInfo = selectedBarInfo;
        this.direction = direction;
        this.learnMore = str;
        this.showUnreadIndicator = z;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ImmutableList<ReturnsBar> getBars() {
        return this.bars;
    }

    public final String getActiveSpan() {
        return this.activeSpan;
    }

    public final List<SpanOption> getSupportedSpans() {
        return this.supportedSpans;
    }

    public final CursorData getDefaultCursorData() {
        return this.defaultCursorData;
    }

    public final SelectedBarInfo getSelectedBarInfo() {
        return this.selectedBarInfo;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final String getLearnMore() {
        return this.learnMore;
    }

    @Override // com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewChartState
    public boolean getShowUnreadIndicator() {
        return this.showUnreadIndicator;
    }

    /* compiled from: ManagedDashboardOverviewChartState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$SelectedBarInfo;", "", "nameRes", "", OrderTypeEducationLearnMoreFragment.ARG_DESCRIPTION_RES, "<init>", "(II)V", "getNameRes", "()I", "getDescriptionRes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectedBarInfo {
        public static final int $stable = 0;
        private final int descriptionRes;
        private final int nameRes;

        public static /* synthetic */ SelectedBarInfo copy$default(SelectedBarInfo selectedBarInfo, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = selectedBarInfo.nameRes;
            }
            if ((i3 & 2) != 0) {
                i2 = selectedBarInfo.descriptionRes;
            }
            return selectedBarInfo.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNameRes() {
            return this.nameRes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        public final SelectedBarInfo copy(int nameRes, int descriptionRes) {
            return new SelectedBarInfo(nameRes, descriptionRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectedBarInfo)) {
                return false;
            }
            SelectedBarInfo selectedBarInfo = (SelectedBarInfo) other;
            return this.nameRes == selectedBarInfo.nameRes && this.descriptionRes == selectedBarInfo.descriptionRes;
        }

        public int hashCode() {
            return (Integer.hashCode(this.nameRes) * 31) + Integer.hashCode(this.descriptionRes);
        }

        public String toString() {
            return "SelectedBarInfo(nameRes=" + this.nameRes + ", descriptionRes=" + this.descriptionRes + ")";
        }

        public SelectedBarInfo(int i, int i2) {
            this.nameRes = i;
            this.descriptionRes = i2;
        }

        public final int getNameRes() {
            return this.nameRes;
        }

        public final int getDescriptionRes() {
            return this.descriptionRes;
        }
    }

    /* compiled from: ManagedDashboardOverviewChartState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsBar;", "", "type", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsType;", "value", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsType;Lcom/robinhood/models/util/Money;)V", "getType", "()Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsType;", "getValue", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReturnsBar {
        public static final int $stable = 8;
        private final ReturnsType type;
        private final Money value;

        public static /* synthetic */ ReturnsBar copy$default(ReturnsBar returnsBar, ReturnsType returnsType, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                returnsType = returnsBar.type;
            }
            if ((i & 2) != 0) {
                money = returnsBar.value;
            }
            return returnsBar.copy(returnsType, money);
        }

        /* renamed from: component1, reason: from getter */
        public final ReturnsType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getValue() {
            return this.value;
        }

        public final ReturnsBar copy(ReturnsType type2, Money value) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(value, "value");
            return new ReturnsBar(type2, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReturnsBar)) {
                return false;
            }
            ReturnsBar returnsBar = (ReturnsBar) other;
            return this.type == returnsBar.type && Intrinsics.areEqual(this.value, returnsBar.value);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "ReturnsBar(type=" + this.type + ", value=" + this.value + ")";
        }

        public ReturnsBar(ReturnsType type2, Money value) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(value, "value");
            this.type = type2;
            this.value = value;
        }

        public final ReturnsType getType() {
            return this.type;
        }

        public final Money getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ManagedDashboardOverviewChartState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsType;", "", "<init>", "(Ljava/lang/String;I)V", "APPRECIATION", "INCOME", "FEES", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReturnsType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReturnsType[] $VALUES;
        public static final ReturnsType APPRECIATION = new ReturnsType("APPRECIATION", 0);
        public static final ReturnsType INCOME = new ReturnsType("INCOME", 1);
        public static final ReturnsType FEES = new ReturnsType("FEES", 2);

        private static final /* synthetic */ ReturnsType[] $values() {
            return new ReturnsType[]{APPRECIATION, INCOME, FEES};
        }

        public static EnumEntries<ReturnsType> getEntries() {
            return $ENTRIES;
        }

        private ReturnsType(String str, int i) {
        }

        static {
            ReturnsType[] returnsTypeArr$values = $values();
            $VALUES = returnsTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(returnsTypeArr$values);
        }

        public static ReturnsType valueOf(String str) {
            return (ReturnsType) Enum.valueOf(ReturnsType.class, str);
        }

        public static ReturnsType[] values() {
            return (ReturnsType[]) $VALUES.clone();
        }
    }

    @Override // com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewChartState
    public AdvisoryChartSwitcher getType() {
        return AdvisoryChartSwitcher.RETURNS;
    }
}
