package com.salesforce.android.smi.remote.internal.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageServerTimestampAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/adapters/MessageTimestampsAdapter;", "", "<init>", "()V", "toJson", "", "timestamp", "", "fromJson", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.salesforce.android.smi.remote.internal.adapters.MessageTimestampsAdapter, reason: use source file name */
/* loaded from: classes12.dex */
public final class MessageServerTimestampAdapter2 {
    @ToJson
    public final String toJson(@MessageServerTimestampAdapter long timestamp) {
        return String.valueOf(timestamp);
    }

    @MessageServerTimestampAdapter
    @FromJson
    public final long fromJson(String timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return Long.parseLong(timestamp);
    }
}
