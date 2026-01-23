package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: MarginCallMarketOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState;", "", "header", "", ErrorBundle.SUMMARY_ENTRY, "summaryViewOrder", "positionsClosed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeader", "()Ljava/lang/String;", "getSummary", "getSummaryViewOrder", "getPositionsClosed", "Completed", "Partial", "Pending", "Failed", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState$Completed;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState$Failed;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState$Partial;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState$Pending;", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderConfirmationViewState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class MarginCallMarketOrderViewState3 {
    public static final int $stable = 0;
    private final String header;
    private final String positionsClosed;
    private final String summary;
    private final String summaryViewOrder;

    public /* synthetic */ MarginCallMarketOrderViewState3(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    private MarginCallMarketOrderViewState3(String str, String str2, String str3, String str4) {
        this.header = str;
        this.summary = str2;
        this.summaryViewOrder = str3;
        this.positionsClosed = str4;
    }

    public final String getHeader() {
        return this.header;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getSummaryViewOrder() {
        return this.summaryViewOrder;
    }

    public String getPositionsClosed() {
        return this.positionsClosed;
    }

    /* compiled from: MarginCallMarketOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState$Completed;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState;", ErrorBundle.SUMMARY_ENTRY, "", "positionsClosed", "totalsHeader", "totalsValue", "towardsCallHeader", "towardsCallValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSummary", "()Ljava/lang/String;", "getPositionsClosed", "getTotalsHeader", "getTotalsValue", "getTowardsCallHeader", "getTowardsCallValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderConfirmationViewState$Completed, reason: from toString */
    public static final /* data */ class Completed extends MarginCallMarketOrderViewState3 {
        public static final int $stable = 0;
        private final String positionsClosed;
        private final String summary;
        private final String totalsHeader;
        private final String totalsValue;
        private final String towardsCallHeader;
        private final String towardsCallValue;

        public static /* synthetic */ Completed copy$default(Completed completed, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = completed.summary;
            }
            if ((i & 2) != 0) {
                str2 = completed.positionsClosed;
            }
            if ((i & 4) != 0) {
                str3 = completed.totalsHeader;
            }
            if ((i & 8) != 0) {
                str4 = completed.totalsValue;
            }
            if ((i & 16) != 0) {
                str5 = completed.towardsCallHeader;
            }
            if ((i & 32) != 0) {
                str6 = completed.towardsCallValue;
            }
            String str7 = str5;
            String str8 = str6;
            return completed.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPositionsClosed() {
            return this.positionsClosed;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTotalsHeader() {
            return this.totalsHeader;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTotalsValue() {
            return this.totalsValue;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTowardsCallHeader() {
            return this.towardsCallHeader;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTowardsCallValue() {
            return this.towardsCallValue;
        }

        public final Completed copy(String summary, String positionsClosed, String totalsHeader, String totalsValue, String towardsCallHeader, String towardsCallValue) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(positionsClosed, "positionsClosed");
            Intrinsics.checkNotNullParameter(totalsHeader, "totalsHeader");
            Intrinsics.checkNotNullParameter(totalsValue, "totalsValue");
            Intrinsics.checkNotNullParameter(towardsCallHeader, "towardsCallHeader");
            Intrinsics.checkNotNullParameter(towardsCallValue, "towardsCallValue");
            return new Completed(summary, positionsClosed, totalsHeader, totalsValue, towardsCallHeader, towardsCallValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) other;
            return Intrinsics.areEqual(this.summary, completed.summary) && Intrinsics.areEqual(this.positionsClosed, completed.positionsClosed) && Intrinsics.areEqual(this.totalsHeader, completed.totalsHeader) && Intrinsics.areEqual(this.totalsValue, completed.totalsValue) && Intrinsics.areEqual(this.towardsCallHeader, completed.towardsCallHeader) && Intrinsics.areEqual(this.towardsCallValue, completed.towardsCallValue);
        }

        public int hashCode() {
            return (((((((((this.summary.hashCode() * 31) + this.positionsClosed.hashCode()) * 31) + this.totalsHeader.hashCode()) * 31) + this.totalsValue.hashCode()) * 31) + this.towardsCallHeader.hashCode()) * 31) + this.towardsCallValue.hashCode();
        }

        public String toString() {
            return "Completed(summary=" + this.summary + ", positionsClosed=" + this.positionsClosed + ", totalsHeader=" + this.totalsHeader + ", totalsValue=" + this.totalsValue + ", towardsCallHeader=" + this.towardsCallHeader + ", towardsCallValue=" + this.towardsCallValue + ")";
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3
        public String getSummary() {
            return this.summary;
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3
        public String getPositionsClosed() {
            return this.positionsClosed;
        }

        public final String getTotalsHeader() {
            return this.totalsHeader;
        }

        public final String getTotalsValue() {
            return this.totalsValue;
        }

        public final String getTowardsCallHeader() {
            return this.towardsCallHeader;
        }

        public final String getTowardsCallValue() {
            return this.towardsCallValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(String summary, String positionsClosed, String totalsHeader, String totalsValue, String towardsCallHeader, String towardsCallValue) {
            super("Order completed", summary, null, positionsClosed, null);
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(positionsClosed, "positionsClosed");
            Intrinsics.checkNotNullParameter(totalsHeader, "totalsHeader");
            Intrinsics.checkNotNullParameter(totalsValue, "totalsValue");
            Intrinsics.checkNotNullParameter(towardsCallHeader, "towardsCallHeader");
            Intrinsics.checkNotNullParameter(towardsCallValue, "towardsCallValue");
            this.summary = summary;
            this.positionsClosed = positionsClosed;
            this.totalsHeader = totalsHeader;
            this.totalsValue = totalsValue;
            this.towardsCallHeader = towardsCallHeader;
            this.towardsCallValue = towardsCallValue;
        }
    }

    /* compiled from: MarginCallMarketOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState$Partial;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState;", ErrorBundle.SUMMARY_ENTRY, "", "summaryViewOrder", "positionsClosed", "totalsHeader", "totalsValue", "pendingHeader", "pendingValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSummary", "()Ljava/lang/String;", "getSummaryViewOrder", "getPositionsClosed", "getTotalsHeader", "getTotalsValue", "getPendingHeader", "getPendingValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderConfirmationViewState$Partial, reason: from toString */
    public static final /* data */ class Partial extends MarginCallMarketOrderViewState3 {
        public static final int $stable = 0;
        private final String pendingHeader;
        private final String pendingValue;
        private final String positionsClosed;
        private final String summary;
        private final String summaryViewOrder;
        private final String totalsHeader;
        private final String totalsValue;

        public static /* synthetic */ Partial copy$default(Partial partial, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = partial.summary;
            }
            if ((i & 2) != 0) {
                str2 = partial.summaryViewOrder;
            }
            if ((i & 4) != 0) {
                str3 = partial.positionsClosed;
            }
            if ((i & 8) != 0) {
                str4 = partial.totalsHeader;
            }
            if ((i & 16) != 0) {
                str5 = partial.totalsValue;
            }
            if ((i & 32) != 0) {
                str6 = partial.pendingHeader;
            }
            if ((i & 64) != 0) {
                str7 = partial.pendingValue;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return partial.copy(str, str2, str11, str4, str10, str8, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSummaryViewOrder() {
            return this.summaryViewOrder;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPositionsClosed() {
            return this.positionsClosed;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTotalsHeader() {
            return this.totalsHeader;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTotalsValue() {
            return this.totalsValue;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPendingHeader() {
            return this.pendingHeader;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPendingValue() {
            return this.pendingValue;
        }

        public final Partial copy(String summary, String summaryViewOrder, String positionsClosed, String totalsHeader, String totalsValue, String pendingHeader, String pendingValue) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(summaryViewOrder, "summaryViewOrder");
            Intrinsics.checkNotNullParameter(positionsClosed, "positionsClosed");
            Intrinsics.checkNotNullParameter(totalsHeader, "totalsHeader");
            Intrinsics.checkNotNullParameter(totalsValue, "totalsValue");
            Intrinsics.checkNotNullParameter(pendingHeader, "pendingHeader");
            Intrinsics.checkNotNullParameter(pendingValue, "pendingValue");
            return new Partial(summary, summaryViewOrder, positionsClosed, totalsHeader, totalsValue, pendingHeader, pendingValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Partial)) {
                return false;
            }
            Partial partial = (Partial) other;
            return Intrinsics.areEqual(this.summary, partial.summary) && Intrinsics.areEqual(this.summaryViewOrder, partial.summaryViewOrder) && Intrinsics.areEqual(this.positionsClosed, partial.positionsClosed) && Intrinsics.areEqual(this.totalsHeader, partial.totalsHeader) && Intrinsics.areEqual(this.totalsValue, partial.totalsValue) && Intrinsics.areEqual(this.pendingHeader, partial.pendingHeader) && Intrinsics.areEqual(this.pendingValue, partial.pendingValue);
        }

        public int hashCode() {
            return (((((((((((this.summary.hashCode() * 31) + this.summaryViewOrder.hashCode()) * 31) + this.positionsClosed.hashCode()) * 31) + this.totalsHeader.hashCode()) * 31) + this.totalsValue.hashCode()) * 31) + this.pendingHeader.hashCode()) * 31) + this.pendingValue.hashCode();
        }

        public String toString() {
            return "Partial(summary=" + this.summary + ", summaryViewOrder=" + this.summaryViewOrder + ", positionsClosed=" + this.positionsClosed + ", totalsHeader=" + this.totalsHeader + ", totalsValue=" + this.totalsValue + ", pendingHeader=" + this.pendingHeader + ", pendingValue=" + this.pendingValue + ")";
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3
        public String getSummary() {
            return this.summary;
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3
        public String getSummaryViewOrder() {
            return this.summaryViewOrder;
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3
        public String getPositionsClosed() {
            return this.positionsClosed;
        }

        public final String getTotalsHeader() {
            return this.totalsHeader;
        }

        public final String getTotalsValue() {
            return this.totalsValue;
        }

        public final String getPendingHeader() {
            return this.pendingHeader;
        }

        public final String getPendingValue() {
            return this.pendingValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Partial(String summary, String summaryViewOrder, String positionsClosed, String totalsHeader, String totalsValue, String pendingHeader, String pendingValue) {
            super("Order partially complete", summary, summaryViewOrder, positionsClosed, null);
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(summaryViewOrder, "summaryViewOrder");
            Intrinsics.checkNotNullParameter(positionsClosed, "positionsClosed");
            Intrinsics.checkNotNullParameter(totalsHeader, "totalsHeader");
            Intrinsics.checkNotNullParameter(totalsValue, "totalsValue");
            Intrinsics.checkNotNullParameter(pendingHeader, "pendingHeader");
            Intrinsics.checkNotNullParameter(pendingValue, "pendingValue");
            this.summary = summary;
            this.summaryViewOrder = summaryViewOrder;
            this.positionsClosed = positionsClosed;
            this.totalsHeader = totalsHeader;
            this.totalsValue = totalsValue;
            this.pendingHeader = pendingHeader;
            this.pendingValue = pendingValue;
        }
    }

    /* compiled from: MarginCallMarketOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState$Pending;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState;", ErrorBundle.SUMMARY_ENTRY, "", "summaryViewOrder", "positionsClosed", "estimatedTotalsHeader", "estimatedTotalsValue", "estimatedTowardsCallHeader", "estimatedTowardsCallValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSummary", "()Ljava/lang/String;", "getSummaryViewOrder", "getPositionsClosed", "getEstimatedTotalsHeader", "getEstimatedTotalsValue", "getEstimatedTowardsCallHeader", "getEstimatedTowardsCallValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderConfirmationViewState$Pending, reason: from toString */
    public static final /* data */ class Pending extends MarginCallMarketOrderViewState3 {
        public static final int $stable = 0;
        private final String estimatedTotalsHeader;
        private final String estimatedTotalsValue;
        private final String estimatedTowardsCallHeader;
        private final String estimatedTowardsCallValue;
        private final String positionsClosed;
        private final String summary;
        private final String summaryViewOrder;

        public static /* synthetic */ Pending copy$default(Pending pending, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pending.summary;
            }
            if ((i & 2) != 0) {
                str2 = pending.summaryViewOrder;
            }
            if ((i & 4) != 0) {
                str3 = pending.positionsClosed;
            }
            if ((i & 8) != 0) {
                str4 = pending.estimatedTotalsHeader;
            }
            if ((i & 16) != 0) {
                str5 = pending.estimatedTotalsValue;
            }
            if ((i & 32) != 0) {
                str6 = pending.estimatedTowardsCallHeader;
            }
            if ((i & 64) != 0) {
                str7 = pending.estimatedTowardsCallValue;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return pending.copy(str, str2, str11, str4, str10, str8, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSummaryViewOrder() {
            return this.summaryViewOrder;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPositionsClosed() {
            return this.positionsClosed;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEstimatedTotalsHeader() {
            return this.estimatedTotalsHeader;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEstimatedTotalsValue() {
            return this.estimatedTotalsValue;
        }

        /* renamed from: component6, reason: from getter */
        public final String getEstimatedTowardsCallHeader() {
            return this.estimatedTowardsCallHeader;
        }

        /* renamed from: component7, reason: from getter */
        public final String getEstimatedTowardsCallValue() {
            return this.estimatedTowardsCallValue;
        }

        public final Pending copy(String summary, String summaryViewOrder, String positionsClosed, String estimatedTotalsHeader, String estimatedTotalsValue, String estimatedTowardsCallHeader, String estimatedTowardsCallValue) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(summaryViewOrder, "summaryViewOrder");
            Intrinsics.checkNotNullParameter(positionsClosed, "positionsClosed");
            Intrinsics.checkNotNullParameter(estimatedTotalsHeader, "estimatedTotalsHeader");
            Intrinsics.checkNotNullParameter(estimatedTotalsValue, "estimatedTotalsValue");
            Intrinsics.checkNotNullParameter(estimatedTowardsCallHeader, "estimatedTowardsCallHeader");
            Intrinsics.checkNotNullParameter(estimatedTowardsCallValue, "estimatedTowardsCallValue");
            return new Pending(summary, summaryViewOrder, positionsClosed, estimatedTotalsHeader, estimatedTotalsValue, estimatedTowardsCallHeader, estimatedTowardsCallValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pending)) {
                return false;
            }
            Pending pending = (Pending) other;
            return Intrinsics.areEqual(this.summary, pending.summary) && Intrinsics.areEqual(this.summaryViewOrder, pending.summaryViewOrder) && Intrinsics.areEqual(this.positionsClosed, pending.positionsClosed) && Intrinsics.areEqual(this.estimatedTotalsHeader, pending.estimatedTotalsHeader) && Intrinsics.areEqual(this.estimatedTotalsValue, pending.estimatedTotalsValue) && Intrinsics.areEqual(this.estimatedTowardsCallHeader, pending.estimatedTowardsCallHeader) && Intrinsics.areEqual(this.estimatedTowardsCallValue, pending.estimatedTowardsCallValue);
        }

        public int hashCode() {
            return (((((((((((this.summary.hashCode() * 31) + this.summaryViewOrder.hashCode()) * 31) + this.positionsClosed.hashCode()) * 31) + this.estimatedTotalsHeader.hashCode()) * 31) + this.estimatedTotalsValue.hashCode()) * 31) + this.estimatedTowardsCallHeader.hashCode()) * 31) + this.estimatedTowardsCallValue.hashCode();
        }

        public String toString() {
            return "Pending(summary=" + this.summary + ", summaryViewOrder=" + this.summaryViewOrder + ", positionsClosed=" + this.positionsClosed + ", estimatedTotalsHeader=" + this.estimatedTotalsHeader + ", estimatedTotalsValue=" + this.estimatedTotalsValue + ", estimatedTowardsCallHeader=" + this.estimatedTowardsCallHeader + ", estimatedTowardsCallValue=" + this.estimatedTowardsCallValue + ")";
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3
        public String getSummary() {
            return this.summary;
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3
        public String getSummaryViewOrder() {
            return this.summaryViewOrder;
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3
        public String getPositionsClosed() {
            return this.positionsClosed;
        }

        public final String getEstimatedTotalsHeader() {
            return this.estimatedTotalsHeader;
        }

        public final String getEstimatedTotalsValue() {
            return this.estimatedTotalsValue;
        }

        public final String getEstimatedTowardsCallHeader() {
            return this.estimatedTowardsCallHeader;
        }

        public final String getEstimatedTowardsCallValue() {
            return this.estimatedTowardsCallValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pending(String summary, String summaryViewOrder, String positionsClosed, String estimatedTotalsHeader, String estimatedTotalsValue, String estimatedTowardsCallHeader, String estimatedTowardsCallValue) {
            super("Order pending", summary, summaryViewOrder, positionsClosed, null);
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(summaryViewOrder, "summaryViewOrder");
            Intrinsics.checkNotNullParameter(positionsClosed, "positionsClosed");
            Intrinsics.checkNotNullParameter(estimatedTotalsHeader, "estimatedTotalsHeader");
            Intrinsics.checkNotNullParameter(estimatedTotalsValue, "estimatedTotalsValue");
            Intrinsics.checkNotNullParameter(estimatedTowardsCallHeader, "estimatedTowardsCallHeader");
            Intrinsics.checkNotNullParameter(estimatedTowardsCallValue, "estimatedTowardsCallValue");
            this.summary = summary;
            this.summaryViewOrder = summaryViewOrder;
            this.positionsClosed = positionsClosed;
            this.estimatedTotalsHeader = estimatedTotalsHeader;
            this.estimatedTotalsValue = estimatedTotalsValue;
            this.estimatedTowardsCallHeader = estimatedTowardsCallHeader;
            this.estimatedTowardsCallValue = estimatedTowardsCallValue;
        }
    }

    /* compiled from: MarginCallMarketOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState$Failed;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderConfirmationViewState;", ErrorBundle.SUMMARY_ENTRY, "", "positionsClosed", "estimatedTotalsHeader", "estimatedTotalsValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSummary", "()Ljava/lang/String;", "getPositionsClosed", "getEstimatedTotalsHeader", "getEstimatedTotalsValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderConfirmationViewState$Failed, reason: from toString */
    public static final /* data */ class Failed extends MarginCallMarketOrderViewState3 {
        public static final int $stable = 0;
        private final String estimatedTotalsHeader;
        private final String estimatedTotalsValue;
        private final String positionsClosed;
        private final String summary;

        public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.summary;
            }
            if ((i & 2) != 0) {
                str2 = failed.positionsClosed;
            }
            if ((i & 4) != 0) {
                str3 = failed.estimatedTotalsHeader;
            }
            if ((i & 8) != 0) {
                str4 = failed.estimatedTotalsValue;
            }
            return failed.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPositionsClosed() {
            return this.positionsClosed;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEstimatedTotalsHeader() {
            return this.estimatedTotalsHeader;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEstimatedTotalsValue() {
            return this.estimatedTotalsValue;
        }

        public final Failed copy(String summary, String positionsClosed, String estimatedTotalsHeader, String estimatedTotalsValue) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(positionsClosed, "positionsClosed");
            Intrinsics.checkNotNullParameter(estimatedTotalsHeader, "estimatedTotalsHeader");
            Intrinsics.checkNotNullParameter(estimatedTotalsValue, "estimatedTotalsValue");
            return new Failed(summary, positionsClosed, estimatedTotalsHeader, estimatedTotalsValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.summary, failed.summary) && Intrinsics.areEqual(this.positionsClosed, failed.positionsClosed) && Intrinsics.areEqual(this.estimatedTotalsHeader, failed.estimatedTotalsHeader) && Intrinsics.areEqual(this.estimatedTotalsValue, failed.estimatedTotalsValue);
        }

        public int hashCode() {
            return (((((this.summary.hashCode() * 31) + this.positionsClosed.hashCode()) * 31) + this.estimatedTotalsHeader.hashCode()) * 31) + this.estimatedTotalsValue.hashCode();
        }

        public String toString() {
            return "Failed(summary=" + this.summary + ", positionsClosed=" + this.positionsClosed + ", estimatedTotalsHeader=" + this.estimatedTotalsHeader + ", estimatedTotalsValue=" + this.estimatedTotalsValue + ")";
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3
        public String getSummary() {
            return this.summary;
        }

        @Override // com.robinhood.android.feature.margin.call.p138v2.marketorder.MarginCallMarketOrderViewState3
        public String getPositionsClosed() {
            return this.positionsClosed;
        }

        public final String getEstimatedTotalsHeader() {
            return this.estimatedTotalsHeader;
        }

        public final String getEstimatedTotalsValue() {
            return this.estimatedTotalsValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String summary, String positionsClosed, String estimatedTotalsHeader, String estimatedTotalsValue) {
            super("Order failed", summary, null, positionsClosed, null);
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(positionsClosed, "positionsClosed");
            Intrinsics.checkNotNullParameter(estimatedTotalsHeader, "estimatedTotalsHeader");
            Intrinsics.checkNotNullParameter(estimatedTotalsValue, "estimatedTotalsValue");
            this.summary = summary;
            this.positionsClosed = positionsClosed;
            this.estimatedTotalsHeader = estimatedTotalsHeader;
            this.estimatedTotalsValue = estimatedTotalsValue;
        }
    }
}
