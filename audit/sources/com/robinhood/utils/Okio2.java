package com.robinhood.utils;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.Okio;

/* compiled from: Okio.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"bufferedSource", "Lokio/BufferedSource;", "Ljava/io/InputStream;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.OkioKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Okio2 {
    public static final BufferedSource bufferedSource(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return Okio.buffer(Okio.source(inputStream));
    }
}
