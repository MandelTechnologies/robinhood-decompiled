package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginCallMarketOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState;", "", "<init>", "()V", "Error", "Loading", "Content", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState$Content;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState$Error;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState$Loading;", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.NbboSummaryViewState, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class MarginCallMarketOrderViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ MarginCallMarketOrderViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: MarginCallMarketOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState$Error;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.NbboSummaryViewState$Error, reason: from toString */
    public static final /* data */ class Error extends MarginCallMarketOrderViewState2 {
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

    private MarginCallMarketOrderViewState2() {
    }

    /* compiled from: MarginCallMarketOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState$Loading;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.NbboSummaryViewState$Loading */
    public static final /* data */ class Loading extends MarginCallMarketOrderViewState2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1418822841;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: MarginCallMarketOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState$Content;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/NbboSummaryViewState;", "nbboSummaries", "", "Lkotlin/Pair;", "", "refreshedAt", "refreshString", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getNbboSummaries", "()Ljava/util/List;", "getRefreshedAt", "()Ljava/lang/String;", "getRefreshString", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.NbboSummaryViewState$Content, reason: from toString */
    public static final /* data */ class Content extends MarginCallMarketOrderViewState2 {
        public static final int $stable = 8;
        private final List<Tuples2<String, String>> nbboSummaries;
        private final String refreshString;
        private final String refreshedAt;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = content.nbboSummaries;
            }
            if ((i & 2) != 0) {
                str = content.refreshedAt;
            }
            if ((i & 4) != 0) {
                str2 = content.refreshString;
            }
            return content.copy(list, str, str2);
        }

        public final List<Tuples2<String, String>> component1() {
            return this.nbboSummaries;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRefreshedAt() {
            return this.refreshedAt;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRefreshString() {
            return this.refreshString;
        }

        public final Content copy(List<Tuples2<String, String>> nbboSummaries, String refreshedAt, String refreshString) {
            Intrinsics.checkNotNullParameter(nbboSummaries, "nbboSummaries");
            Intrinsics.checkNotNullParameter(refreshedAt, "refreshedAt");
            Intrinsics.checkNotNullParameter(refreshString, "refreshString");
            return new Content(nbboSummaries, refreshedAt, refreshString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.nbboSummaries, content.nbboSummaries) && Intrinsics.areEqual(this.refreshedAt, content.refreshedAt) && Intrinsics.areEqual(this.refreshString, content.refreshString);
        }

        public int hashCode() {
            return (((this.nbboSummaries.hashCode() * 31) + this.refreshedAt.hashCode()) * 31) + this.refreshString.hashCode();
        }

        public String toString() {
            return "Content(nbboSummaries=" + this.nbboSummaries + ", refreshedAt=" + this.refreshedAt + ", refreshString=" + this.refreshString + ")";
        }

        public final List<Tuples2<String, String>> getNbboSummaries() {
            return this.nbboSummaries;
        }

        public final String getRefreshedAt() {
            return this.refreshedAt;
        }

        public final String getRefreshString() {
            return this.refreshString;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(List<Tuples2<String, String>> nbboSummaries, String refreshedAt, String refreshString) {
            super(null);
            Intrinsics.checkNotNullParameter(nbboSummaries, "nbboSummaries");
            Intrinsics.checkNotNullParameter(refreshedAt, "refreshedAt");
            Intrinsics.checkNotNullParameter(refreshString, "refreshString");
            this.nbboSummaries = nbboSummaries;
            this.refreshedAt = refreshedAt;
            this.refreshString = refreshString;
        }
    }
}
