package com.salesforce.android.smi.remote.internal.dto.request;

import com.salesforce.android.smi.network.api.rest.QueryDirection;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QueryConversationEntriesRequest.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B=\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fB7\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/QueryConversationEntriesRequest;", "", "limit", "", "entryTypeFilter", "", "", "startTimestamp", "", "endTimestamp", "direction", "<init>", "(ILjava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "timestamp", "comparison", "Lcom/salesforce/android/smi/network/api/rest/QueryDirection;", "(ILjava/util/List;Ljava/lang/Long;Lcom/salesforce/android/smi/network/api/rest/QueryDirection;)V", "getLimit", "()I", "getEntryTypeFilter", "()Ljava/util/List;", "getStartTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTimestamp", "getDirection", "()Ljava/lang/String;", "toString", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class QueryConversationEntriesRequest {
    private final String direction;
    private final Long endTimestamp;
    private final List<String> entryTypeFilter;
    private final int limit;
    private final Long startTimestamp;

    private QueryConversationEntriesRequest(int i, List<String> list, Long l, Long l2, String str) {
        this.limit = i;
        this.entryTypeFilter = list;
        this.startTimestamp = l;
        this.endTimestamp = l2;
        this.direction = str;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final List<String> getEntryTypeFilter() {
        return this.entryTypeFilter;
    }

    public final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final String getDirection() {
        return this.direction;
    }

    public /* synthetic */ QueryConversationEntriesRequest(int i, List list, Long l, QueryDirection queryDirection, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? null : list, l, queryDirection);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QueryConversationEntriesRequest(int i, List<String> list, Long l, QueryDirection comparison) {
        Long lValueOf;
        long time;
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        Long lValueOf2 = null;
        if (comparison == QueryDirection.Ascending) {
            lValueOf = Long.valueOf(l != null ? l.longValue() + 1 : new Date().getTime());
        } else {
            lValueOf = null;
        }
        if (comparison == QueryDirection.Descending) {
            time = l != null ? l.longValue() - 1 : time;
            this(i, list, lValueOf, lValueOf2, comparison.getValue());
        }
        time = new Date().getTime();
        lValueOf2 = Long.valueOf(time);
        this(i, list, lValueOf, lValueOf2, comparison.getValue());
    }

    public String toString() {
        return "QueryConversationEntries - limit: " + this.limit + ", start: " + this.startTimestamp + ", end: " + this.endTimestamp + ", direction: " + this.direction;
    }
}
