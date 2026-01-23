package com.robinhood.shared.common.singular;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkParams.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/common/singular/LinkParams;", "", "metadata", "", "", "deeplink", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getMetadata", "()Ljava/util/Map;", "getDeeplink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-singular_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class LinkParams {
    private final String deeplink;
    private final Map<String, String> metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkParams copy$default(LinkParams linkParams, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = linkParams.metadata;
        }
        if ((i & 2) != 0) {
            str = linkParams.deeplink;
        }
        return linkParams.copy(map, str);
    }

    public final Map<String, String> component1() {
        return this.metadata;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final LinkParams copy(Map<String, String> metadata, String deeplink) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkParams(metadata, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkParams)) {
            return false;
        }
        LinkParams linkParams = (LinkParams) other;
        return Intrinsics.areEqual(this.metadata, linkParams.metadata) && Intrinsics.areEqual(this.deeplink, linkParams.deeplink);
    }

    public int hashCode() {
        int iHashCode = this.metadata.hashCode() * 31;
        String str = this.deeplink;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LinkParams(metadata=" + this.metadata + ", deeplink=" + this.deeplink + ")";
    }

    public LinkParams(Map<String, String> metadata, String str) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.metadata = metadata;
        this.deeplink = str;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }
}
