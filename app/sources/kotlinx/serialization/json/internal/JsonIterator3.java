package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json3;

/* compiled from: JsonIterator.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\fH\u0002¨\u0006\u0010"}, m3636d2 = {"JsonIterator", "", "T", "mode", "Lkotlinx/serialization/json/DecodeSequenceMode;", "json", "Lkotlinx/serialization/json/Json;", "lexer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "determineFormat", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "suggested", "tryConsumeStartArray", "", "kotlinx-serialization-json"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.internal.JsonIteratorKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class JsonIterator3 {

    /* compiled from: JsonIterator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: kotlinx.serialization.json.internal.JsonIteratorKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Json3.values().length];
            try {
                iArr[Json3.WHITESPACE_SEPARATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Json3.ARRAY_WRAPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Json3.AUTO_DETECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> Iterator<T> JsonIterator(Json3 mode, Json json, ReaderJsonLexer lexer, KSerializer2<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        int i = WhenMappings.$EnumSwitchMapping$0[determineFormat(lexer, mode).ordinal()];
        if (i == 1) {
            return new JsonIterator4(json, lexer, deserializer);
        }
        if (i == 2) {
            return new JsonIterator2(json, lexer, deserializer);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
    }

    private static final Json3 determineFormat(JsonReader jsonReader, Json3 json3) {
        int i = WhenMappings.$EnumSwitchMapping$0[json3.ordinal()];
        if (i == 1) {
            return Json3.WHITESPACE_SEPARATED;
        }
        if (i != 2) {
            if (i == 3) {
                return tryConsumeStartArray(jsonReader) ? Json3.ARRAY_WRAPPED : Json3.WHITESPACE_SEPARATED;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (tryConsumeStartArray(jsonReader)) {
            return Json3.ARRAY_WRAPPED;
        }
        JsonReader.fail$kotlinx_serialization_json$default(jsonReader, (byte) 8, false, 2, null);
        throw new ExceptionsH();
    }

    private static final boolean tryConsumeStartArray(JsonReader jsonReader) {
        if (jsonReader.peekNextToken() != 8) {
            return false;
        }
        jsonReader.consumeNextToken((byte) 8);
        return true;
    }
}
