package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonExceptions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lkotlinx/serialization/json/internal/JsonEncodingException;", "Lkotlinx/serialization/json/internal/JsonException;", "message", "", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.internal.JsonEncodingException, reason: use source file name */
/* loaded from: classes14.dex */
public final class JsonExceptions2 extends JsonExceptions3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonExceptions2(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
