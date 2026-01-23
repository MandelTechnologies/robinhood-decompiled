package microgram.android.internal.guest;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okio.BufferedSource;

/* compiled from: ResourceLoader.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m3636d2 = {"Lmicrogram/android/internal/guest/Resource;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lokhttp3/MediaType;", "mediaType", "Lokio/BufferedSource;", "source", "", "contentLength", "<init>", "(Lokhttp3/MediaType;Lokio/BufferedSource;J)V", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokhttp3/MediaType;", "getMediaType", "()Lokhttp3/MediaType;", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "J", "getContentLength", "()J", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Resource implements Closeable {
    private final long contentLength;
    private final MediaType mediaType;
    private final BufferedSource source;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) other;
        return Intrinsics.areEqual(this.mediaType, resource.mediaType) && Intrinsics.areEqual(this.source, resource.source) && this.contentLength == resource.contentLength;
    }

    public int hashCode() {
        MediaType mediaType = this.mediaType;
        return ((((mediaType == null ? 0 : mediaType.hashCode()) * 31) + this.source.hashCode()) * 31) + Long.hashCode(this.contentLength);
    }

    public String toString() {
        return "Resource(mediaType=" + this.mediaType + ", source=" + this.source + ", contentLength=" + this.contentLength + ")";
    }

    public Resource(MediaType mediaType, BufferedSource source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.mediaType = mediaType;
        this.source = source;
        this.contentLength = j;
    }

    public final MediaType getMediaType() {
        return this.mediaType;
    }

    public final BufferedSource getSource() {
        return this.source;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }
}
