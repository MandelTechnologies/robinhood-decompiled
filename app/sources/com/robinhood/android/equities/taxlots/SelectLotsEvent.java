package com.robinhood.android.equities.taxlots;

import com.robinhood.android.equities.taxlots.SelectLotsKey;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectLotsEvent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsEvent;", "", BentoAlertSheet6.button2Title, "ScrollToTop", "SelectionStrategyChange", "ShowIntraDayLotsOrderAlert", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface SelectLotsEvent {

    /* compiled from: SelectLotsEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsEvent$Dismiss;", "Lcom/robinhood/android/equities/taxlots/SelectLotsEvent;", "result", "Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result;", "<init>", "(Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result;)V", "getResult", "()Lcom/robinhood/android/equities/taxlots/SelectLotsKey$Result;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Dismiss implements SelectLotsEvent {
        public static final int $stable = 8;
        private final SelectLotsKey.Result result;

        public static /* synthetic */ Dismiss copy$default(Dismiss dismiss, SelectLotsKey.Result result, int i, Object obj) {
            if ((i & 1) != 0) {
                result = dismiss.result;
            }
            return dismiss.copy(result);
        }

        /* renamed from: component1, reason: from getter */
        public final SelectLotsKey.Result getResult() {
            return this.result;
        }

        public final Dismiss copy(SelectLotsKey.Result result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Dismiss(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dismiss) && Intrinsics.areEqual(this.result, ((Dismiss) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Dismiss(result=" + this.result + ")";
        }

        public Dismiss(SelectLotsKey.Result result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public final SelectLotsKey.Result getResult() {
            return this.result;
        }
    }

    /* compiled from: SelectLotsEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsEvent$ScrollToTop;", "Lcom/robinhood/android/equities/taxlots/SelectLotsEvent;", "<init>", "()V", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ScrollToTop implements SelectLotsEvent {
        public static final int $stable = 0;
        public static final ScrollToTop INSTANCE = new ScrollToTop();

        private ScrollToTop() {
        }
    }

    /* compiled from: SelectLotsEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsEvent$SelectionStrategyChange;", "Lcom/robinhood/android/equities/taxlots/SelectLotsEvent;", "lotsToUpdate", "", "", "<init>", "(Ljava/util/Map;)V", "getLotsToUpdate", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SelectionStrategyChange implements SelectLotsEvent {
        public static final int $stable = 8;
        private final Map<String, String> lotsToUpdate;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectionStrategyChange copy$default(SelectionStrategyChange selectionStrategyChange, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = selectionStrategyChange.lotsToUpdate;
            }
            return selectionStrategyChange.copy(map);
        }

        public final Map<String, String> component1() {
            return this.lotsToUpdate;
        }

        public final SelectionStrategyChange copy(Map<String, String> lotsToUpdate) {
            Intrinsics.checkNotNullParameter(lotsToUpdate, "lotsToUpdate");
            return new SelectionStrategyChange(lotsToUpdate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectionStrategyChange) && Intrinsics.areEqual(this.lotsToUpdate, ((SelectionStrategyChange) other).lotsToUpdate);
        }

        public int hashCode() {
            return this.lotsToUpdate.hashCode();
        }

        public String toString() {
            return "SelectionStrategyChange(lotsToUpdate=" + this.lotsToUpdate + ")";
        }

        public SelectionStrategyChange(Map<String, String> lotsToUpdate) {
            Intrinsics.checkNotNullParameter(lotsToUpdate, "lotsToUpdate");
            this.lotsToUpdate = lotsToUpdate;
        }

        public final Map<String, String> getLotsToUpdate() {
            return this.lotsToUpdate;
        }
    }

    /* compiled from: SelectLotsEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/SelectLotsEvent$ShowIntraDayLotsOrderAlert;", "Lcom/robinhood/android/equities/taxlots/SelectLotsEvent;", "<init>", "()V", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowIntraDayLotsOrderAlert implements SelectLotsEvent {
        public static final int $stable = 0;
        public static final ShowIntraDayLotsOrderAlert INSTANCE = new ShowIntraDayLotsOrderAlert();

        private ShowIntraDayLotsOrderAlert() {
        }
    }
}
