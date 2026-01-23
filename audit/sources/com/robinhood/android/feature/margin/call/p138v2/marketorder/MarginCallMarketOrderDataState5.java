package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import com.robinhood.android.equities.equitytrade.OrderSubmitResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginCallMarketOrderDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState;", "", "<init>", "()V", "NotStarted", "Submitting", "Complete", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState$Complete;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState$NotStarted;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState$Submitting;", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.TradeSubmissionState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class MarginCallMarketOrderDataState5 {
    public static final int $stable = 0;

    public /* synthetic */ MarginCallMarketOrderDataState5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: MarginCallMarketOrderDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState$NotStarted;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.TradeSubmissionState$NotStarted */
    public static final /* data */ class NotStarted extends MarginCallMarketOrderDataState5 {
        public static final int $stable = 0;
        public static final NotStarted INSTANCE = new NotStarted();

        public boolean equals(Object other) {
            return this == other || (other instanceof NotStarted);
        }

        public int hashCode() {
            return -2142970775;
        }

        public String toString() {
            return "NotStarted";
        }

        private NotStarted() {
            super(null);
        }
    }

    private MarginCallMarketOrderDataState5() {
    }

    /* compiled from: MarginCallMarketOrderDataState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState$Submitting;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState;", "results", "", "", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "<init>", "(Ljava/util/Map;)V", "getResults", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.TradeSubmissionState$Submitting, reason: from toString */
    public static final /* data */ class Submitting extends MarginCallMarketOrderDataState5 {
        public static final int $stable = 8;
        private final Map<String, OrderSubmitResult> results;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Submitting copy$default(Submitting submitting, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = submitting.results;
            }
            return submitting.copy(map);
        }

        public final Map<String, OrderSubmitResult> component1() {
            return this.results;
        }

        public final Submitting copy(Map<String, ? extends OrderSubmitResult> results) {
            Intrinsics.checkNotNullParameter(results, "results");
            return new Submitting(results);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Submitting) && Intrinsics.areEqual(this.results, ((Submitting) other).results);
        }

        public int hashCode() {
            return this.results.hashCode();
        }

        public String toString() {
            return "Submitting(results=" + this.results + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Submitting(Map<String, ? extends OrderSubmitResult> results) {
            super(null);
            Intrinsics.checkNotNullParameter(results, "results");
            this.results = results;
        }

        public final Map<String, OrderSubmitResult> getResults() {
            return this.results;
        }
    }

    /* compiled from: MarginCallMarketOrderDataState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState$Complete;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/TradeSubmissionState;", "results", "", "", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "<init>", "(Ljava/util/Map;)V", "getResults", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.TradeSubmissionState$Complete, reason: from toString */
    public static final /* data */ class Complete extends MarginCallMarketOrderDataState5 {
        public static final int $stable = 8;
        private final Map<String, OrderSubmitResult> results;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Complete copy$default(Complete complete, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = complete.results;
            }
            return complete.copy(map);
        }

        public final Map<String, OrderSubmitResult> component1() {
            return this.results;
        }

        public final Complete copy(Map<String, ? extends OrderSubmitResult> results) {
            Intrinsics.checkNotNullParameter(results, "results");
            return new Complete(results);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Complete) && Intrinsics.areEqual(this.results, ((Complete) other).results);
        }

        public int hashCode() {
            return this.results.hashCode();
        }

        public String toString() {
            return "Complete(results=" + this.results + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Complete(Map<String, ? extends OrderSubmitResult> results) {
            super(null);
            Intrinsics.checkNotNullParameter(results, "results");
            this.results = results;
        }

        public final Map<String, OrderSubmitResult> getResults() {
            return this.results;
        }
    }
}
