package com.robinhood.android.indexes.api.fundamentals;

import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiIndexFundamentalsListRequest.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsListRequest;", "", "ApiIndexFundamentalsRequestByIds", "ApiIndexFundamentalsRequestBySymbols", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsListRequest$ApiIndexFundamentalsRequestByIds;", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsListRequest$ApiIndexFundamentalsRequestBySymbols;", "lib-models-indexes-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface ApiIndexFundamentalsListRequest {

    /* compiled from: ApiIndexFundamentalsListRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsListRequest$ApiIndexFundamentalsRequestByIds;", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsListRequest;", "ids", "", "Ljava/util/UUID;", "<init>", "(Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-models-indexes-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiIndexFundamentalsRequestByIds implements ApiIndexFundamentalsListRequest {
        private final List<UUID> ids;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiIndexFundamentalsRequestByIds copy$default(ApiIndexFundamentalsRequestByIds apiIndexFundamentalsRequestByIds, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = apiIndexFundamentalsRequestByIds.ids;
            }
            return apiIndexFundamentalsRequestByIds.copy(list);
        }

        public final List<UUID> component1() {
            return this.ids;
        }

        public final ApiIndexFundamentalsRequestByIds copy(List<UUID> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            return new ApiIndexFundamentalsRequestByIds(ids);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApiIndexFundamentalsRequestByIds) && Intrinsics.areEqual(this.ids, ((ApiIndexFundamentalsRequestByIds) other).ids);
        }

        public int hashCode() {
            return this.ids.hashCode();
        }

        public String toString() {
            return "ApiIndexFundamentalsRequestByIds(ids=" + this.ids + ")";
        }

        public ApiIndexFundamentalsRequestByIds(List<UUID> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.ids = ids;
        }

        public final List<UUID> getIds() {
            return this.ids;
        }
    }

    /* compiled from: ApiIndexFundamentalsListRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsListRequest$ApiIndexFundamentalsRequestBySymbols;", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsListRequest;", "symbols", "", "", "<init>", "(Ljava/util/List;)V", "getSymbols", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-models-indexes-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiIndexFundamentalsRequestBySymbols implements ApiIndexFundamentalsListRequest {
        private final List<String> symbols;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiIndexFundamentalsRequestBySymbols copy$default(ApiIndexFundamentalsRequestBySymbols apiIndexFundamentalsRequestBySymbols, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = apiIndexFundamentalsRequestBySymbols.symbols;
            }
            return apiIndexFundamentalsRequestBySymbols.copy(list);
        }

        public final List<String> component1() {
            return this.symbols;
        }

        public final ApiIndexFundamentalsRequestBySymbols copy(List<String> symbols) {
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            return new ApiIndexFundamentalsRequestBySymbols(symbols);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApiIndexFundamentalsRequestBySymbols) && Intrinsics.areEqual(this.symbols, ((ApiIndexFundamentalsRequestBySymbols) other).symbols);
        }

        public int hashCode() {
            return this.symbols.hashCode();
        }

        public String toString() {
            return "ApiIndexFundamentalsRequestBySymbols(symbols=" + this.symbols + ")";
        }

        public ApiIndexFundamentalsRequestBySymbols(List<String> symbols) {
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            this.symbols = symbols;
        }

        public final List<String> getSymbols() {
            return this.symbols;
        }
    }
}
