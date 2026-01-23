package com.robinhood.android.sentry;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonObjectReader;
import io.sentry.JsonObjectWriter;
import io.sentry.JsonSerializable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: Serialization.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a/\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a$\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u000f"}, m3636d2 = {"decode", "T", "Lio/sentry/JsonDeserializer;", "inputStream", "Ljava/io/InputStream;", "logger", "Lio/sentry/ILogger;", "(Lio/sentry/JsonDeserializer;Ljava/io/InputStream;Lio/sentry/ILogger;)Ljava/lang/Object;", "encode", "", "Lio/sentry/JsonSerializable;", "outputStream", "Ljava/io/OutputStream;", "maxDepth", "", "lib-sentry_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.sentry.SerializationKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Serialization {
    public static final <T> T decode(JsonDeserializer<? extends T> jsonDeserializer, InputStream inputStream, ILogger logger) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "<this>");
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return jsonDeserializer.deserialize(new JsonObjectReader(new InputStreamReader(inputStream, Charsets.UTF_8)), logger);
    }

    public static final void encode(JsonSerializable jsonSerializable, OutputStream outputStream, int i, ILogger logger) throws IOException {
        Intrinsics.checkNotNullParameter(jsonSerializable, "<this>");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Intrinsics.checkNotNullParameter(logger, "logger");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.UTF_8);
        jsonSerializable.serialize(new JsonObjectWriter(outputStreamWriter, i), logger);
        outputStreamWriter.flush();
    }
}
