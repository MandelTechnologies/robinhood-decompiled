package com.withpersona.sdk2.inquiry.p424ui.network;

import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneTimeLinkCodeResponse.kt */
@JsonClass(generateAdapter = true)
@kotlin.Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;", "", "", "oneTimeLinkCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOneTimeLinkCode", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Metadata {
    private final String oneTimeLinkCode;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Metadata) && Intrinsics.areEqual(this.oneTimeLinkCode, ((Metadata) other).oneTimeLinkCode);
    }

    public int hashCode() {
        String str = this.oneTimeLinkCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "Metadata(oneTimeLinkCode=" + this.oneTimeLinkCode + ")";
    }

    public Metadata(String str) {
        this.oneTimeLinkCode = str;
    }

    public final String getOneTimeLinkCode() {
        return this.oneTimeLinkCode;
    }
}
