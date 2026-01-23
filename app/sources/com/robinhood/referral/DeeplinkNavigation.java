package com.robinhood.referral;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributionNavigation.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/referral/DeeplinkNavigation;", "Lcom/robinhood/referral/AttributionNavigation;", "deeplink", "", "<init>", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class DeeplinkNavigation implements AttributionNavigation {
    private final String deeplink;

    public static /* synthetic */ DeeplinkNavigation copy$default(DeeplinkNavigation deeplinkNavigation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deeplinkNavigation.deeplink;
        }
        return deeplinkNavigation.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final DeeplinkNavigation copy(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new DeeplinkNavigation(deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeeplinkNavigation) && Intrinsics.areEqual(this.deeplink, ((DeeplinkNavigation) other).deeplink);
    }

    public int hashCode() {
        return this.deeplink.hashCode();
    }

    public String toString() {
        return "DeeplinkNavigation(deeplink=" + this.deeplink + ")";
    }

    public DeeplinkNavigation(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.deeplink = deeplink;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }
}
