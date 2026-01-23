package com.robinhood.android.odyssey.lib.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import kotlin.p481io.IOStreams;
import kotlin.text.Charsets;

/* compiled from: GzipExt.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"gzipCompress", "", "", "gzipDecompress", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.utils.GzipExtKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GzipExt {
    public static final byte[] gzipCompress(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                gZIPOutputStream.write(bytes);
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(gZIPOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Closeable.closeFinally(byteArrayOutputStream, null);
                Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final String gzipDecompress(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byte[] bytes = IOStreams.readBytes(gZIPInputStream);
                Closeable.closeFinally(gZIPInputStream, null);
                String str = new String(bytes, Charsets.UTF_8);
                Closeable.closeFinally(byteArrayInputStream, null);
                return str;
            } finally {
            }
        } finally {
        }
    }
}
