package com.stripe.android.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiVersion.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/core/ApiVersion;", "", "", "version", "", "betaCodes", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "betas", "(Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVersion$stripe_core_release", "Ljava/util/Set;", "getBetaCodes$stripe_core_release", "()Ljava/util/Set;", "getCode", "code", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class ApiVersion {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ApiVersion INSTANCE = new ApiVersion("2020-03-02", 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    private final Set<String> betaCodes;
    private final String version;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiVersion)) {
            return false;
        }
        ApiVersion apiVersion = (ApiVersion) other;
        return Intrinsics.areEqual(this.version, apiVersion.version) && Intrinsics.areEqual(this.betaCodes, apiVersion.betaCodes);
    }

    public int hashCode() {
        return (this.version.hashCode() * 31) + this.betaCodes.hashCode();
    }

    public String toString() {
        return "ApiVersion(version=" + this.version + ", betaCodes=" + this.betaCodes + ")";
    }

    public ApiVersion(String version, Set<String> betaCodes) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(betaCodes, "betaCodes");
        this.version = version;
        this.betaCodes = betaCodes;
    }

    public /* synthetic */ ApiVersion(String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApiVersion(Set<String> betas) {
        this("2020-03-02", betas);
        Intrinsics.checkNotNullParameter(betas, "betas");
    }

    public final String getCode() {
        List listListOf = CollectionsKt.listOf(this.version);
        Set<String> set = this.betaCodes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return CollectionsKt.joinToString$default(CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList), ";", null, null, 0, null, null, 62, null);
    }

    /* compiled from: ApiVersion.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/core/ApiVersion$Companion;", "", "()V", "API_VERSION_CODE", "", "INSTANCE", "Lcom/stripe/android/core/ApiVersion;", "get", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ ApiVersion get() {
            return ApiVersion.INSTANCE;
        }
    }
}
