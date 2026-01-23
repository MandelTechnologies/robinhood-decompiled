package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* compiled from: ReaderJsonLexer.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "reader", "", "buffer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "ReaderJsonLexer", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonReader;[C)Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "kotlinx-serialization-json"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.internal.ReaderJsonLexerKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ReaderJsonLexer3 {
    public static /* synthetic */ ReaderJsonLexer ReaderJsonLexer$default(Json json, JsonStreams jsonStreams, char[] cArr, int i, Object obj) {
        if ((i & 4) != 0) {
            cArr = ArrayPools6.INSTANCE.take();
        }
        return ReaderJsonLexer(json, jsonStreams, cArr);
    }

    public static final ReaderJsonLexer ReaderJsonLexer(Json json, JsonStreams reader, char[] buffer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return !json.getConfiguration().getAllowComments() ? new ReaderJsonLexer(reader, buffer) : new CommentLexers(reader, buffer);
    }
}
