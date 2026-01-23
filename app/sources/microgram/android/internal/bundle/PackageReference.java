package microgram.android.internal.bundle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: PackageModels.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lmicrogram/android/internal/bundle/PackageReference;", "", "Lmicrogram/android/internal/bundle/PackageId;", "id", "Lokhttp3/HttpUrl;", "url", "", "sha256", "<init>", "(Lmicrogram/android/internal/bundle/PackageId;Lokhttp3/HttpUrl;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/android/internal/bundle/PackageId;", "getId", "()Lmicrogram/android/internal/bundle/PackageId;", "Lokhttp3/HttpUrl;", "getUrl", "()Lokhttp3/HttpUrl;", "Ljava/lang/String;", "getSha256", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PackageReference {
    private final PackageId id;
    private final String sha256;
    private final HttpUrl url;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackageReference)) {
            return false;
        }
        PackageReference packageReference = (PackageReference) other;
        return Intrinsics.areEqual(this.id, packageReference.id) && Intrinsics.areEqual(this.url, packageReference.url) && Intrinsics.areEqual(this.sha256, packageReference.sha256);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.url.hashCode()) * 31) + this.sha256.hashCode();
    }

    public String toString() {
        return "PackageReference(id=" + this.id + ", url=" + this.url + ", sha256=" + this.sha256 + ")";
    }

    public PackageReference(PackageId id, HttpUrl url, String sha256) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(sha256, "sha256");
        this.id = id;
        this.url = url;
        this.sha256 = sha256;
    }

    public final PackageId getId() {
        return this.id;
    }

    public final HttpUrl getUrl() {
        return this.url;
    }

    public final String getSha256() {
        return this.sha256;
    }
}
