package com.robinhood.android.api.creditcard.waitlist;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditCardWaitlistApi.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/api/creditcard/waitlist/JoinWaitlistBody;", "", "email", "", "referred_by", "attribution_source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getReferred_by", "getAttribution_source", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-api-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class JoinWaitlistBody {
    private final String attribution_source;
    private final String email;
    private final String referred_by;

    public static /* synthetic */ JoinWaitlistBody copy$default(JoinWaitlistBody joinWaitlistBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = joinWaitlistBody.email;
        }
        if ((i & 2) != 0) {
            str2 = joinWaitlistBody.referred_by;
        }
        if ((i & 4) != 0) {
            str3 = joinWaitlistBody.attribution_source;
        }
        return joinWaitlistBody.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReferred_by() {
        return this.referred_by;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAttribution_source() {
        return this.attribution_source;
    }

    public final JoinWaitlistBody copy(String email, String referred_by, String attribution_source) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new JoinWaitlistBody(email, referred_by, attribution_source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinWaitlistBody)) {
            return false;
        }
        JoinWaitlistBody joinWaitlistBody = (JoinWaitlistBody) other;
        return Intrinsics.areEqual(this.email, joinWaitlistBody.email) && Intrinsics.areEqual(this.referred_by, joinWaitlistBody.referred_by) && Intrinsics.areEqual(this.attribution_source, joinWaitlistBody.attribution_source);
    }

    public int hashCode() {
        int iHashCode = this.email.hashCode() * 31;
        String str = this.referred_by;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.attribution_source;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "JoinWaitlistBody(email=" + this.email + ", referred_by=" + this.referred_by + ", attribution_source=" + this.attribution_source + ")";
    }

    public JoinWaitlistBody(String email, String str, String str2) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
        this.referred_by = str;
        this.attribution_source = str2;
    }

    public /* synthetic */ JoinWaitlistBody(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getReferred_by() {
        return this.referred_by;
    }

    public final String getAttribution_source() {
        return this.attribution_source;
    }
}
