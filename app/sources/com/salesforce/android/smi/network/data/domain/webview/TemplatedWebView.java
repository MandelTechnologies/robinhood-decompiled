package com.salesforce.android.smi.network.data.domain.webview;

import android.net.Uri;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: TemplatedWebView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H&J\u0018\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H&J\u0018\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H&J\u0018\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u001e¨\u0006&"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/webview/TemplatedWebView;", "", "title", "", "getTitle", "()Ljava/lang/String;", "url", "Ljava/net/URL;", "getUrl", "()Ljava/net/URL;", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "queryParams", "", "getQueryParams", "()Ljava/util/Map;", "pathParams", "getPathParams", "hostParams", "getHostParams", "isUrlFormatted", "", "()Z", "formattedUrl", "getFormattedUrl", "formattedUri", "getFormattedUri", "setFormattedUri", "(Landroid/net/Uri;)V", "setParameterValue", "", "key", "value", "setQueryParameterValue", "setPathParameterValue", "setHostParameterValue", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface TemplatedWebView {
    Uri getFormattedUri();

    URL getFormattedUrl();

    Map<String, String> getHostParams();

    Map<String, String> getPathParams();

    Map<String, String> getQueryParams();

    String getTitle();

    Uri getUri();

    URL getUrl();

    boolean isUrlFormatted();

    void setFormattedUri(Uri uri);

    void setHostParameterValue(String key, String value);

    void setParameterValue(String key, String value);

    void setPathParameterValue(String key, String value);

    void setQueryParameterValue(String key, String value);
}
