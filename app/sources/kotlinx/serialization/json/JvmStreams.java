package kotlinx.serialization.json;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.json.internal.JsonStreams4;
import kotlinx.serialization.json.internal.JvmJsonStreams;

/* compiled from: JvmStreams.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"T", "Lkotlinx/serialization/json/Json;", "Ljava/io/InputStream;", "stream", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lkotlinx/serialization/json/DecodeSequenceMode;", "format", "Lkotlin/sequences/Sequence;", "decodeToSequence", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/DecodeSequenceMode;)Lkotlin/sequences/Sequence;", "kotlinx-serialization-json"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.JvmStreamsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class JvmStreams {
    public static /* synthetic */ Sequence decodeToSequence$default(Json json, InputStream inputStream, KSerializer2 kSerializer2, Json3 json3, int i, Object obj) {
        if ((i & 4) != 0) {
            json3 = Json3.AUTO_DETECT;
        }
        return decodeToSequence(json, inputStream, kSerializer2, json3);
    }

    public static final <T> Sequence<T> decodeToSequence(Json json, InputStream stream, KSerializer2<? extends T> deserializer, Json3 format2) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(stream, "stream");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(format2, "format");
        return JsonStreams4.decodeToSequenceByReader(json, new JvmJsonStreams(stream), deserializer, format2);
    }
}
