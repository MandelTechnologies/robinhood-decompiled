package kotlinx.serialization.json.okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.JsonStreams4;
import kotlinx.serialization.json.okio.internal.OkioJsonStreams;
import okio.BufferedSource;

/* compiled from: OkioStreams.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"T", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lokio/BufferedSource;", "source", "decodeFromBufferedSource", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lokio/BufferedSource;)Ljava/lang/Object;", "kotlinx-serialization-json-okio"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.okio.OkioStreamsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class OkioStreams {
    public static final <T> T decodeFromBufferedSource(Json json, KSerializer2<? extends T> deserializer, BufferedSource source) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(source, "source");
        return (T) JsonStreams4.decodeByReader(json, deserializer, new OkioJsonStreams(source));
    }
}
