package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginCallMarketOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState;", "", "<init>", "()V", "Error", "Loading", "Content", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState$Content;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState$Error;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState$Loading;", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderSummaryViewState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class MarginCallMarketOrderViewState4 {
    public static final int $stable = 0;

    public /* synthetic */ MarginCallMarketOrderViewState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: MarginCallMarketOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState$Error;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderSummaryViewState$Error, reason: from toString */
    public static final /* data */ class Error extends MarginCallMarketOrderViewState4 {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    private MarginCallMarketOrderViewState4() {
    }

    /* compiled from: MarginCallMarketOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState$Loading;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderSummaryViewState$Loading */
    public static final /* data */ class Loading extends MarginCallMarketOrderViewState4 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1181299888;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: MarginCallMarketOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState$Content;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/OrderSummaryViewState;", "tradesCount", "", "totalCreditCostHeader", "", "totalCreditCostValue", "callCreditCostValue", "accountType", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTradesCount", "()I", "getTotalCreditCostHeader", "()Ljava/lang/String;", "getTotalCreditCostValue", "getCallCreditCostValue", "getAccountType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.OrderSummaryViewState$Content, reason: from toString */
    public static final /* data */ class Content extends MarginCallMarketOrderViewState4 {
        public static final int $stable = 0;
        private final String accountType;
        private final String callCreditCostValue;
        private final String totalCreditCostHeader;
        private final String totalCreditCostValue;
        private final int tradesCount;

        public static /* synthetic */ Content copy$default(Content content, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = content.tradesCount;
            }
            if ((i2 & 2) != 0) {
                str = content.totalCreditCostHeader;
            }
            if ((i2 & 4) != 0) {
                str2 = content.totalCreditCostValue;
            }
            if ((i2 & 8) != 0) {
                str3 = content.callCreditCostValue;
            }
            if ((i2 & 16) != 0) {
                str4 = content.accountType;
            }
            String str5 = str4;
            String str6 = str2;
            return content.copy(i, str, str6, str3, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTradesCount() {
            return this.tradesCount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTotalCreditCostHeader() {
            return this.totalCreditCostHeader;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTotalCreditCostValue() {
            return this.totalCreditCostValue;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCallCreditCostValue() {
            return this.callCreditCostValue;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        public final Content copy(int tradesCount, String totalCreditCostHeader, String totalCreditCostValue, String callCreditCostValue, String accountType) {
            Intrinsics.checkNotNullParameter(totalCreditCostHeader, "totalCreditCostHeader");
            Intrinsics.checkNotNullParameter(totalCreditCostValue, "totalCreditCostValue");
            Intrinsics.checkNotNullParameter(callCreditCostValue, "callCreditCostValue");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new Content(tradesCount, totalCreditCostHeader, totalCreditCostValue, callCreditCostValue, accountType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return this.tradesCount == content.tradesCount && Intrinsics.areEqual(this.totalCreditCostHeader, content.totalCreditCostHeader) && Intrinsics.areEqual(this.totalCreditCostValue, content.totalCreditCostValue) && Intrinsics.areEqual(this.callCreditCostValue, content.callCreditCostValue) && Intrinsics.areEqual(this.accountType, content.accountType);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.tradesCount) * 31) + this.totalCreditCostHeader.hashCode()) * 31) + this.totalCreditCostValue.hashCode()) * 31) + this.callCreditCostValue.hashCode()) * 31) + this.accountType.hashCode();
        }

        public String toString() {
            return "Content(tradesCount=" + this.tradesCount + ", totalCreditCostHeader=" + this.totalCreditCostHeader + ", totalCreditCostValue=" + this.totalCreditCostValue + ", callCreditCostValue=" + this.callCreditCostValue + ", accountType=" + this.accountType + ")";
        }

        public final int getTradesCount() {
            return this.tradesCount;
        }

        public final String getTotalCreditCostHeader() {
            return this.totalCreditCostHeader;
        }

        public final String getTotalCreditCostValue() {
            return this.totalCreditCostValue;
        }

        public final String getCallCreditCostValue() {
            return this.callCreditCostValue;
        }

        public final String getAccountType() {
            return this.accountType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(int i, String totalCreditCostHeader, String totalCreditCostValue, String callCreditCostValue, String accountType) {
            super(null);
            Intrinsics.checkNotNullParameter(totalCreditCostHeader, "totalCreditCostHeader");
            Intrinsics.checkNotNullParameter(totalCreditCostValue, "totalCreditCostValue");
            Intrinsics.checkNotNullParameter(callCreditCostValue, "callCreditCostValue");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.tradesCount = i;
            this.totalCreditCostHeader = totalCreditCostHeader;
            this.totalCreditCostValue = totalCreditCostValue;
            this.callCreditCostValue = callCreditCostValue;
            this.accountType = accountType;
        }
    }
}
