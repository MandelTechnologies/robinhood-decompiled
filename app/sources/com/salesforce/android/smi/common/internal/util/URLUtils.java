package com.salesforce.android.smi.common.internal.util;

import android.annotation.SuppressLint;
import android.net.Uri;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* compiled from: URLUtils.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/common/internal/util/URLUtils;", "", "<init>", "()V", "Landroid/net/Uri;", "", "authority", "path", "query", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "", "parameters", "appendQueryParameters", "(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "getToAndroidUriOrNull", "(Ljava/lang/String;)Landroid/net/Uri;", "toAndroidUriOrNull", "Ljava/net/URL;", "getToUrlOrNull", "(Landroid/net/Uri;)Ljava/net/URL;", "toUrlOrNull", "getToUriOrNull", "toUriOrNull", "(Ljava/lang/String;)Ljava/net/URL;", "common_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SuppressLint({"UseKtx"})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class URLUtils {
    public static final URLUtils INSTANCE = new URLUtils();
    private static final Logger logger = Logger.getLogger(URLUtils.class.getName());

    private URLUtils() {
    }

    public final Uri copy(Uri uri, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        try {
            return new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(str).encodedPath(str2).encodedQuery(str3).fragment(uri.getFragment()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final URL getToUrlOrNull(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return getToUrlOrNull(uri.toString());
    }

    public final Uri getToUriOrNull(String str) {
        Uri uri;
        if (str == null) {
            return null;
        }
        try {
            String str2 = new Regex("^.+:.*$").matches(str) ? str : null;
            if (str2 != null && (uri = Uri.parse(str2)) != null) {
                return uri;
            }
            return Uri.parse("http://" + str);
        } catch (Exception e) {
            logger.log(Level.WARNING, "URI is malformed: " + e.getMessage() + ".");
            return null;
        }
    }

    public final URL getToUrlOrNull(String str) {
        try {
            return new URL(str);
        } catch (Exception e) {
            logger.log(Level.WARNING, "Url is malformed: " + e.getMessage() + ".");
            return null;
        }
    }

    private final Uri getToAndroidUriOrNull(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            logger.log(Level.WARNING, "Uri is malformed: " + e.getMessage() + ".");
            return null;
        }
    }

    public final Uri appendQueryParameters(String str, Map<String, String> map) {
        Uri.Builder builderBuildUpon;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Uri toAndroidUriOrNull = getToAndroidUriOrNull(str);
            if (toAndroidUriOrNull != null && (builderBuildUpon = toAndroidUriOrNull.buildUpon()) != null) {
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                }
                Uri uri = Uri.parse(URLDecoder.decode(builderBuildUpon.build().toString(), Charsets.UTF_8.toString()));
                if (uri != null) {
                    return uri;
                }
            }
            return getToAndroidUriOrNull(str);
        } catch (Exception e) {
            logger.log(Level.WARNING, "Can not appendQueryParameters to URI: " + e.getMessage() + ".");
            return null;
        }
    }
}
