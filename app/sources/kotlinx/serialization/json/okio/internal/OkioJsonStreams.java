package kotlinx.serialization.json.okio.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonStreams2;
import okio.BufferedSource;

/* compiled from: OkioJsonStreams.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lkotlinx/serialization/json/okio/internal/OkioSerialReader;", "Lkotlinx/serialization/json/internal/InternalJsonReaderCodePointImpl;", "source", "Lokio/BufferedSource;", "<init>", "(Lokio/BufferedSource;)V", "exhausted", "", "nextCodePoint", "", "kotlinx-serialization-json-okio"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.okio.internal.OkioSerialReader, reason: use source file name */
/* loaded from: classes14.dex */
public final class OkioJsonStreams extends JsonStreams2 {
    private final BufferedSource source;

    public OkioJsonStreams(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // kotlinx.serialization.json.internal.JsonStreams2
    public boolean exhausted() {
        return this.source.exhausted();
    }

    @Override // kotlinx.serialization.json.internal.JsonStreams2
    public int nextCodePoint() {
        return this.source.readUtf8CodePoint();
    }
}
