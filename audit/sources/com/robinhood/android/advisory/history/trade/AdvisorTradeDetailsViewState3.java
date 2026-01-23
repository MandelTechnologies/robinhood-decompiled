package com.robinhood.android.advisory.history.trade;

import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisorTradeDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/OrderGroupItem;", "", "Title", "SectionHeader", "HistoryRow", "Spacer", "Lcom/robinhood/android/advisory/history/trade/OrderGroupItem$HistoryRow;", "Lcom/robinhood/android/advisory/history/trade/OrderGroupItem$SectionHeader;", "Lcom/robinhood/android/advisory/history/trade/OrderGroupItem$Spacer;", "Lcom/robinhood/android/advisory/history/trade/OrderGroupItem$Title;", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.history.trade.OrderGroupItem, reason: use source file name */
/* loaded from: classes7.dex */
public interface AdvisorTradeDetailsViewState3 {

    /* compiled from: AdvisorTradeDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/OrderGroupItem$Title;", "Lcom/robinhood/android/advisory/history/trade/OrderGroupItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.history.trade.OrderGroupItem$Title */
    public static final /* data */ class Title implements AdvisorTradeDetailsViewState3 {
        public static final int $stable = 0;
        public static final Title INSTANCE = new Title();

        public boolean equals(Object other) {
            return this == other || (other instanceof Title);
        }

        public int hashCode() {
            return -2037318957;
        }

        public String toString() {
            return "Title";
        }

        private Title() {
        }
    }

    /* compiled from: AdvisorTradeDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/OrderGroupItem$SectionHeader;", "Lcom/robinhood/android/advisory/history/trade/OrderGroupItem;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.history.trade.OrderGroupItem$SectionHeader, reason: from toString */
    public static final /* data */ class SectionHeader implements AdvisorTradeDetailsViewState3 {
        public static final int $stable = 0;
        private final String title;

        public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sectionHeader.title;
            }
            return sectionHeader.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final SectionHeader copy(String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new SectionHeader(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SectionHeader) && Intrinsics.areEqual(this.title, ((SectionHeader) other).title);
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "SectionHeader(title=" + this.title + ")";
        }

        public SectionHeader(String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: AdvisorTradeDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/OrderGroupItem$HistoryRow;", "Lcom/robinhood/android/advisory/history/trade/OrderGroupItem;", "event", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "<init>", "(Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;)V", "getEvent", "()Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.history.trade.OrderGroupItem$HistoryRow, reason: from toString */
    public static final /* data */ class HistoryRow implements AdvisorTradeDetailsViewState3 {
        public static final int $stable = 8;
        private final StatefulHistoryEvent<HistoryEvent> event;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HistoryRow copy$default(HistoryRow historyRow, StatefulHistoryEvent statefulHistoryEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                statefulHistoryEvent = historyRow.event;
            }
            return historyRow.copy(statefulHistoryEvent);
        }

        public final StatefulHistoryEvent<HistoryEvent> component1() {
            return this.event;
        }

        public final HistoryRow copy(StatefulHistoryEvent<? extends HistoryEvent> event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return new HistoryRow(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HistoryRow) && Intrinsics.areEqual(this.event, ((HistoryRow) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "HistoryRow(event=" + this.event + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HistoryRow(StatefulHistoryEvent<? extends HistoryEvent> event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public final StatefulHistoryEvent<HistoryEvent> getEvent() {
            return this.event;
        }
    }

    /* compiled from: AdvisorTradeDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/OrderGroupItem$Spacer;", "Lcom/robinhood/android/advisory/history/trade/OrderGroupItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.history.trade.OrderGroupItem$Spacer */
    public static final /* data */ class Spacer implements AdvisorTradeDetailsViewState3 {
        public static final int $stable = 0;
        public static final Spacer INSTANCE = new Spacer();

        public boolean equals(Object other) {
            return this == other || (other instanceof Spacer);
        }

        public int hashCode() {
            return 1244882705;
        }

        public String toString() {
            return "Spacer";
        }

        private Spacer() {
        }
    }
}
