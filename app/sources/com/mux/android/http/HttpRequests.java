package com.mux.android.http;

import android.net.Uri;
import com.robinhood.utils.http.ContentEncoding;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: HttpRequests.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0005*\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Landroid/net/Uri;", "Ljava/net/URL;", "toURL", "(Landroid/net/Uri;)Ljava/net/URL;", "", "", "asRequestBody", "(Ljava/lang/String;)[B", ContentEncoding.GZIP, "([B)[B", "envKey", "domain", "beaconAuthority", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "DEFAULT_CHARSET", "Ljava/nio/charset/Charset;", "mux-kt-utils_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.mux.android.http.HttpRequestsKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class HttpRequests {
    private static final Charset DEFAULT_CHARSET = Charsets.UTF_8;

    public static final URL toURL(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return new URL(uri.toString());
    }

    public static final byte[] asRequestBody(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static final byte[] gzip(byte[] bArr) throws IOException {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.flush();
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(gZIPOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Closeable.closeFinally(byteArrayOutputStream, null);
                Intrinsics.checkNotNull(byteArray);
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final String beaconAuthority(String envKey, String domain) {
        Intrinsics.checkNotNullParameter(envKey, "envKey");
        Intrinsics.checkNotNullParameter(domain, "domain");
        if (!StringsKt.startsWith$default(domain, ".", false, 2, (Object) null)) {
            return domain;
        }
        if (Pattern.matches("^[a-z0-9]+$", envKey)) {
            return envKey + domain;
        }
        return "img" + domain;
    }
}
