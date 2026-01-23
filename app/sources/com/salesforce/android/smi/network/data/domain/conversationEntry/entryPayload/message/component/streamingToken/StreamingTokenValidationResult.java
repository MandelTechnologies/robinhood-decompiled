package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StreamingTokenValidationResult.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0005H\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenValidationResult;", "", "valid", "", "reason", "", "<init>", "(ZLjava/lang/String;)V", "getValid", "()Z", "getReason", "()Ljava/lang/String;", "toString", "component1", "component2", "copy", "equals", "other", "hashCode", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StreamingTokenValidationResult {
    private final String reason;
    private final boolean valid;

    public static /* synthetic */ StreamingTokenValidationResult copy$default(StreamingTokenValidationResult streamingTokenValidationResult, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = streamingTokenValidationResult.valid;
        }
        if ((i & 2) != 0) {
            str = streamingTokenValidationResult.reason;
        }
        return streamingTokenValidationResult.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final StreamingTokenValidationResult copy(boolean valid, String reason) {
        return new StreamingTokenValidationResult(valid, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamingTokenValidationResult)) {
            return false;
        }
        StreamingTokenValidationResult streamingTokenValidationResult = (StreamingTokenValidationResult) other;
        return this.valid == streamingTokenValidationResult.valid && Intrinsics.areEqual(this.reason, streamingTokenValidationResult.reason);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.valid) * 31;
        String str = this.reason;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public StreamingTokenValidationResult(boolean z, String str) {
        this.valid = z;
        this.reason = str;
    }

    public /* synthetic */ StreamingTokenValidationResult(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }

    public final String getReason() {
        return this.reason;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public String toString() {
        return "valid: " + this.valid + ", reason: " + this.reason;
    }
}
