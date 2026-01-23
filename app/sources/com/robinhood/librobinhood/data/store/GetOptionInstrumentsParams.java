package com.robinhood.librobinhood.data.store;

import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/GetOptionInstrumentsParams;", "", "optionChainId", "Ljava/util/UUID;", "queryParams", "", "", "<init>", "(Ljava/util/UUID;Ljava/util/Map;)V", "getOptionChainId", "()Ljava/util/UUID;", "getQueryParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetOptionInstrumentsParams {
    private final UUID optionChainId;
    private final Map<String, String> queryParams;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetOptionInstrumentsParams copy$default(GetOptionInstrumentsParams getOptionInstrumentsParams, UUID uuid, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = getOptionInstrumentsParams.optionChainId;
        }
        if ((i & 2) != 0) {
            map = getOptionInstrumentsParams.queryParams;
        }
        return getOptionInstrumentsParams.copy(uuid, map);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    public final Map<String, String> component2() {
        return this.queryParams;
    }

    public final GetOptionInstrumentsParams copy(UUID optionChainId, Map<String, String> queryParams) {
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return new GetOptionInstrumentsParams(optionChainId, queryParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetOptionInstrumentsParams)) {
            return false;
        }
        GetOptionInstrumentsParams getOptionInstrumentsParams = (GetOptionInstrumentsParams) other;
        return Intrinsics.areEqual(this.optionChainId, getOptionInstrumentsParams.optionChainId) && Intrinsics.areEqual(this.queryParams, getOptionInstrumentsParams.queryParams);
    }

    public int hashCode() {
        return (this.optionChainId.hashCode() * 31) + this.queryParams.hashCode();
    }

    public String toString() {
        return "GetOptionInstrumentsParams(optionChainId=" + this.optionChainId + ", queryParams=" + this.queryParams + ")";
    }

    public GetOptionInstrumentsParams(UUID optionChainId, Map<String, String> queryParams) {
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        this.optionChainId = optionChainId;
        this.queryParams = queryParams;
    }

    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    public final Map<String, String> getQueryParams() {
        return this.queryParams;
    }
}
