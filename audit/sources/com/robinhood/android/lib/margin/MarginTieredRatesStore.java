package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import com.robinhood.android.lib.margin.p167db.models.MarginTieredRates;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginTieredRatesStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginTieredRatesStore;", "Lcom/robinhood/store/Store;", "marginInvestingApi", "Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;Lcom/robinhood/store/StoreBundle;)V", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/lib/margin/MarginTieredRatesStore$Request;", "Lcom/robinhood/android/lib/margin/db/models/MarginTieredRates;", "getMarginTieredRates", "accountNumber", "", "skip2kCheck", "", "skipSuitability", "source", "(Ljava/lang/String;ZZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Request", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginTieredRatesStore extends Store {
    private final Endpoint<Request, MarginTieredRates> getEndpoint;
    private final MarginInvestingApi marginInvestingApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginTieredRatesStore(MarginInvestingApi marginInvestingApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(marginInvestingApi, "marginInvestingApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.marginInvestingApi = marginInvestingApi;
        this.getEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new MarginTieredRatesStore2(this, null), getLogoutKillswitch(), new MarginTieredRatesStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public static /* synthetic */ Object getMarginTieredRates$default(MarginTieredRatesStore marginTieredRatesStore, String str, boolean z, boolean z2, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return marginTieredRatesStore.getMarginTieredRates(str, z, z2, str2, continuation);
    }

    public final Object getMarginTieredRates(String str, boolean z, boolean z2, String str2, Continuation<? super MarginTieredRates> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getEndpoint, new Request(str, z, z2, str2), null, continuation, 2, null);
    }

    /* compiled from: MarginTieredRatesStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginTieredRatesStore$Request;", "", "accountNumber", "", "skipMin2kEquityCheck", "", "skipSuitability", "source", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getSkipMin2kEquityCheck", "()Z", "getSkipSuitability", "getSource", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Request {
        private final String accountNumber;
        private final boolean skipMin2kEquityCheck;
        private final boolean skipSuitability;
        private final String source;

        public static /* synthetic */ Request copy$default(Request request, String str, boolean z, boolean z2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.accountNumber;
            }
            if ((i & 2) != 0) {
                z = request.skipMin2kEquityCheck;
            }
            if ((i & 4) != 0) {
                z2 = request.skipSuitability;
            }
            if ((i & 8) != 0) {
                str2 = request.source;
            }
            return request.copy(str, z, z2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSkipMin2kEquityCheck() {
            return this.skipMin2kEquityCheck;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSkipSuitability() {
            return this.skipSuitability;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Request copy(String accountNumber, boolean skipMin2kEquityCheck, boolean skipSuitability, String source) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Request(accountNumber, skipMin2kEquityCheck, skipSuitability, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.accountNumber, request.accountNumber) && this.skipMin2kEquityCheck == request.skipMin2kEquityCheck && this.skipSuitability == request.skipSuitability && Intrinsics.areEqual(this.source, request.source);
        }

        public int hashCode() {
            int iHashCode = ((((this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.skipMin2kEquityCheck)) * 31) + Boolean.hashCode(this.skipSuitability)) * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Request(accountNumber=" + this.accountNumber + ", skipMin2kEquityCheck=" + this.skipMin2kEquityCheck + ", skipSuitability=" + this.skipSuitability + ", source=" + this.source + ")";
        }

        public Request(String accountNumber, boolean z, boolean z2, String str) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.skipMin2kEquityCheck = z;
            this.skipSuitability = z2;
            this.source = str;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getSkipMin2kEquityCheck() {
            return this.skipMin2kEquityCheck;
        }

        public final boolean getSkipSuitability() {
            return this.skipSuitability;
        }

        public final String getSource() {
            return this.source;
        }
    }
}
