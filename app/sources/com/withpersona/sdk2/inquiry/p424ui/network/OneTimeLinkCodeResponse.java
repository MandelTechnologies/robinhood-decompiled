package com.withpersona.sdk2.inquiry.p424ui.network;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneTimeLinkCodeResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;", Constants.REFERRER_API_META, "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;", "getMeta", "()Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class OneTimeLinkCodeResponse {
    private final Metadata meta;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OneTimeLinkCodeResponse) && Intrinsics.areEqual(this.meta, ((OneTimeLinkCodeResponse) other).meta);
    }

    public int hashCode() {
        Metadata metadata = this.meta;
        if (metadata == null) {
            return 0;
        }
        return metadata.hashCode();
    }

    public String toString() {
        return "OneTimeLinkCodeResponse(meta=" + this.meta + ")";
    }

    public OneTimeLinkCodeResponse(Metadata metadata) {
        this.meta = metadata;
    }

    public final Metadata getMeta() {
        return this.meta;
    }
}
