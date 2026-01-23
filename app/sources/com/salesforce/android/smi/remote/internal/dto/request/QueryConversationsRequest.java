package com.salesforce.android.smi.remote.internal.dto.request;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* compiled from: QueryConversationsRequest.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001BW\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB)\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/dto/request/QueryConversationsRequest;", "", "limit", "", "conversationId", "Ljava/util/UUID;", "startTimestamp", "", "endTimestamp", "channelAddressIdentifier", "", "includeClosedConversations", "", "useChannelAddressIdFromJWT", "<init>", "(ILjava/util/UUID;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZZ)V", "timestamp", "(ILjava/util/UUID;Ljava/lang/Long;)V", "getLimit", "()I", "getConversationId", "()Ljava/util/UUID;", "getStartTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTimestamp", "getChannelAddressIdentifier", "()Ljava/lang/String;", "getIncludeClosedConversations", "()Z", "getUseChannelAddressIdFromJWT", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class QueryConversationsRequest {
    private final String channelAddressIdentifier;
    private final UUID conversationId;
    private final Long endTimestamp;
    private final boolean includeClosedConversations;
    private final int limit;
    private final Long startTimestamp;
    private final boolean useChannelAddressIdFromJWT;

    private QueryConversationsRequest(int i, UUID uuid, Long l, Long l2, String str, boolean z, boolean z2) {
        this.limit = i;
        this.conversationId = uuid;
        this.startTimestamp = l;
        this.endTimestamp = l2;
        this.channelAddressIdentifier = str;
        this.includeClosedConversations = z;
        this.useChannelAddressIdFromJWT = z2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    /* synthetic */ QueryConversationsRequest(int r2, java.util.UUID r3, java.lang.Long r4, java.lang.Long r5, java.lang.String r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            r2 = 100
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = r0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            r0 = 1
            if (r10 == 0) goto L21
            r7 = r0
        L21:
            r9 = r9 & 64
            if (r9 == 0) goto L2e
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L36
        L2e:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L36:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.android.smi.remote.internal.dto.request.QueryConversationsRequest.<init>(int, java.util.UUID, java.lang.Long, java.lang.Long, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getLimit() {
        return this.limit;
    }

    public final UUID getConversationId() {
        return this.conversationId;
    }

    public final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final String getChannelAddressIdentifier() {
        return this.channelAddressIdentifier;
    }

    public final boolean getIncludeClosedConversations() {
        return this.includeClosedConversations;
    }

    public final boolean getUseChannelAddressIdFromJWT() {
        return this.useChannelAddressIdFromJWT;
    }

    public /* synthetic */ QueryConversationsRequest(int i, UUID uuid, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? null : uuid, l);
    }

    public QueryConversationsRequest(int i, UUID uuid, Long l) {
        this(i, uuid, null, l != null ? Long.valueOf(RangesKt.coerceAtLeast(l.longValue() - 1, 0L)) : null, null, false, false, 116, null);
    }
}
