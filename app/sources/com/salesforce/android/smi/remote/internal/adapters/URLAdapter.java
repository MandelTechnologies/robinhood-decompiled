package com.salesforce.android.smi.remote.internal.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: URLAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/adapters/URLAdapter;", "", "<init>", "()V", "toJson", "", "url", "Ljava/net/URL;", "fromJson", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class URLAdapter {
    @ToJson
    public final String toJson(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String string2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @FromJson
    public final URL fromJson(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new URL(url);
    }
}
