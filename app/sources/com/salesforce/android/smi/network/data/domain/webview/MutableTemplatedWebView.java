package com.salesforce.android.smi.network.data.domain.webview;

import android.net.Uri;
import com.salesforce.android.smi.common.internal.util.URLUtils;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.webView.SurveyParameter;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.StaticContentFormat;
import com.salesforce.android.smi.network.data.domain.webview.MutableTemplatedWebView;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: MutableTemplatedWebView.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 =2\u00020\u0001:\u0001=Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0016J\u0018\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0016J\u0018\u0010)\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0016J\u0018\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0016J(\u0010$\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0002J\b\u0010+\u001a\u0004\u0018\u00010\u0005J$\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030/H\u0002J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u0015\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u0015\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003Jm\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u00107\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#¨\u0006>"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/webview/MutableTemplatedWebView;", "Lcom/salesforce/android/smi/network/data/domain/webview/TemplatedWebView;", "title", "", "uri", "Landroid/net/Uri;", "formattedUri", "queryParams", "", "pathParams", "hostParams", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "webView", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$WebViewFormat;", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$WebViewFormat;)V", "getTitle", "()Ljava/lang/String;", "getUri", "()Landroid/net/Uri;", "getFormattedUri", "setFormattedUri", "(Landroid/net/Uri;)V", "getQueryParams", "()Ljava/util/Map;", "getPathParams", "getHostParams", "formattedUrl", "Ljava/net/URL;", "getFormattedUrl", "()Ljava/net/URL;", "url", "getUrl", "isUrlFormatted", "", "()Z", "setParameterValue", "", "key", "value", "setQueryParameterValue", "setPathParameterValue", "setHostParameterValue", "constructUri", "populateTemplatedValues", "str", "params", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class MutableTemplatedWebView implements TemplatedWebView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEFAULT_VALUE = "";
    private static final String TAG;
    private static final String TEMPLATE_END = "\\}{2}";
    private static final String TEMPLATE_START = "\\{{2}";
    private static final Logger logger;
    private Uri formattedUri;
    private final Map<String, String> hostParams;
    private final Map<String, String> pathParams;
    private final Map<String, String> queryParams;
    private final String title;
    private final Uri uri;
    private final URL url;

    public static /* synthetic */ MutableTemplatedWebView copy$default(MutableTemplatedWebView mutableTemplatedWebView, String str, Uri uri, Uri uri2, Map map, Map map2, Map map3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mutableTemplatedWebView.title;
        }
        if ((i & 2) != 0) {
            uri = mutableTemplatedWebView.uri;
        }
        if ((i & 4) != 0) {
            uri2 = mutableTemplatedWebView.formattedUri;
        }
        if ((i & 8) != 0) {
            map = mutableTemplatedWebView.queryParams;
        }
        if ((i & 16) != 0) {
            map2 = mutableTemplatedWebView.pathParams;
        }
        if ((i & 32) != 0) {
            map3 = mutableTemplatedWebView.hostParams;
        }
        Map map4 = map2;
        Map map5 = map3;
        return mutableTemplatedWebView.copy(str, uri, uri2, map, map4, map5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* renamed from: component3, reason: from getter */
    public final Uri getFormattedUri() {
        return this.formattedUri;
    }

    public final Map<String, String> component4() {
        return this.queryParams;
    }

    public final Map<String, String> component5() {
        return this.pathParams;
    }

    public final Map<String, String> component6() {
        return this.hostParams;
    }

    public final MutableTemplatedWebView copy(String title, Uri uri, Uri formattedUri, Map<String, String> queryParams, Map<String, String> pathParams, Map<String, String> hostParams) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        Intrinsics.checkNotNullParameter(pathParams, "pathParams");
        Intrinsics.checkNotNullParameter(hostParams, "hostParams");
        return new MutableTemplatedWebView(title, uri, formattedUri, queryParams, pathParams, hostParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MutableTemplatedWebView)) {
            return false;
        }
        MutableTemplatedWebView mutableTemplatedWebView = (MutableTemplatedWebView) other;
        return Intrinsics.areEqual(this.title, mutableTemplatedWebView.title) && Intrinsics.areEqual(this.uri, mutableTemplatedWebView.uri) && Intrinsics.areEqual(this.formattedUri, mutableTemplatedWebView.formattedUri) && Intrinsics.areEqual(this.queryParams, mutableTemplatedWebView.queryParams) && Intrinsics.areEqual(this.pathParams, mutableTemplatedWebView.pathParams) && Intrinsics.areEqual(this.hostParams, mutableTemplatedWebView.hostParams);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Uri uri = this.uri;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.formattedUri;
        return ((((((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31) + this.queryParams.hashCode()) * 31) + this.pathParams.hashCode()) * 31) + this.hostParams.hashCode();
    }

    public String toString() {
        return "MutableTemplatedWebView(title=" + this.title + ", uri=" + this.uri + ", formattedUri=" + this.formattedUri + ", queryParams=" + this.queryParams + ", pathParams=" + this.pathParams + ", hostParams=" + this.hostParams + ")";
    }

    public MutableTemplatedWebView(String title, Uri uri, Uri uri2, Map<String, String> queryParams, Map<String, String> pathParams, Map<String, String> hostParams) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        Intrinsics.checkNotNullParameter(pathParams, "pathParams");
        Intrinsics.checkNotNullParameter(hostParams, "hostParams");
        this.title = title;
        this.uri = uri;
        this.formattedUri = uri2;
        this.queryParams = queryParams;
        this.pathParams = pathParams;
        this.hostParams = hostParams;
        Uri uri3 = getUri();
        this.url = uri3 != null ? URLUtils.INSTANCE.getToUrlOrNull(uri3) : null;
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public String getTitle() {
        return this.title;
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public Uri getFormattedUri() {
        return this.formattedUri;
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public void setFormattedUri(Uri uri) {
        this.formattedUri = uri;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MutableTemplatedWebView(String str, Uri uri, Uri uri2, Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            map = MapsKt.toMutableMap(INSTANCE.parseTemplatedStrings(uri != null ? uri.getQuery() : null));
        }
        Map map4 = map;
        if ((i & 16) != 0) {
            map2 = MapsKt.toMutableMap(INSTANCE.parseTemplatedStrings(uri != null ? uri.getPath() : null));
        }
        Map map5 = map2;
        if ((i & 32) != 0) {
            map3 = MapsKt.toMutableMap(INSTANCE.parseTemplatedStrings(uri != null ? uri.getHost() : null));
        }
        this(str, uri, uri2, map4, map5, map3);
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public Map<String, String> getQueryParams() {
        return this.queryParams;
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public Map<String, String> getPathParams() {
        return this.pathParams;
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public Map<String, String> getHostParams() {
        return this.hostParams;
    }

    public MutableTemplatedWebView(StaticContentFormat.WebViewFormat webView) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(webView, "webView");
        String title = webView.getTitle().getTitle();
        Companion companion = INSTANCE;
        String baseUrl = webView.getBaseUrl();
        List<SurveyParameter> parameters = webView.getParameters();
        if (parameters != null) {
            List<SurveyParameter> list = parameters;
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (SurveyParameter surveyParameter : list) {
                Tuples2 tuples2M3642to = Tuples4.m3642to(surveyParameter.getName(), surveyParameter.getValue().getTextValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        this(title, companion.appendQueryParameters(baseUrl, linkedHashMap), webView.getPersistedUri(), null, null, null, 56, null);
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public URL getFormattedUrl() {
        Uri formattedUri = getFormattedUri();
        if (formattedUri != null) {
            return URLUtils.INSTANCE.getToUrlOrNull(formattedUri);
        }
        return null;
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public URL getUrl() {
        return this.url;
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public boolean isUrlFormatted() {
        return getFormattedUrl() != null;
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public void setParameterValue(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (getQueryParams().containsKey(key)) {
            setQueryParameterValue(key, value);
            return;
        }
        if (getPathParams().containsKey(key)) {
            setPathParameterValue(key, value);
            return;
        }
        if (getHostParams().containsKey(key)) {
            setHostParameterValue(key, value);
            return;
        }
        logger.log(Level.WARNING, key + " not found. Use one of: " + MapsKt.plus(MapsKt.plus(getQueryParams(), getPathParams()), getHostParams()).keySet());
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public void setQueryParameterValue(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        setParameterValue(getQueryParams(), key, value);
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public void setPathParameterValue(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        setParameterValue(getPathParams(), key, value);
    }

    @Override // com.salesforce.android.smi.network.data.domain.webview.TemplatedWebView
    public void setHostParameterValue(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        setParameterValue(getHostParams(), key, value);
    }

    private final void setParameterValue(Map<String, String> map, String str, String str2) {
        if (map.containsKey(str)) {
            map.put(str, str2);
            logger.log(Level.INFO, "Set " + str + " to " + str2);
            return;
        }
        logger.log(Level.WARNING, str + " not found. Use one of: " + map.keySet());
    }

    public final Uri constructUri() {
        Uri formattedUri = getFormattedUri();
        if (formattedUri != null) {
            return formattedUri;
        }
        Uri uri = getUri();
        Uri uriCopy = null;
        if (uri != null) {
            URLUtils uRLUtils = URLUtils.INSTANCE;
            String host = getUri().getHost();
            String strPopulateTemplatedValues = host != null ? populateTemplatedValues(host, getHostParams()) : null;
            String path = getUri().getPath();
            String strPopulateTemplatedValues2 = path != null ? populateTemplatedValues(path, getPathParams()) : null;
            String query = getUri().getQuery();
            uriCopy = uRLUtils.copy(uri, strPopulateTemplatedValues, strPopulateTemplatedValues2, query != null ? populateTemplatedValues(query, getQueryParams()) : null);
        }
        setFormattedUri(uriCopy);
        return uriCopy;
    }

    /* compiled from: MutableTemplatedWebView.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002J(\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/webview/MutableTemplatedWebView$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", "parseTemplatedStrings", "", "str", "appendQueryParameters", "Landroid/net/Uri;", "parameters", "templateRegex", "Lkotlin/text/Regex;", "match", "TEMPLATE_START", "TEMPLATE_END", "DEFAULT_VALUE", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getTAG() {
            return MutableTemplatedWebView.TAG;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, String> parseTemplatedStrings(String str) {
            Sequence sequenceFilterNotNull;
            if (str != null) {
                try {
                    Sequence map = SequencesKt.map(Regex.findAll$default(templateRegex$default(MutableTemplatedWebView.INSTANCE, null, 1, null), str, 0, 2, null), new Function1() { // from class: com.salesforce.android.smi.network.data.domain.webview.MutableTemplatedWebView$Companion$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MutableTemplatedWebView.Companion.parseTemplatedStrings$lambda$1$lambda$0((MatchResult) obj);
                        }
                    });
                    if (map != null && (sequenceFilterNotNull = SequencesKt.filterNotNull(map)) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator itIterator2 = sequenceFilterNotNull.iterator2();
                        while (itIterator2.hasNext()) {
                            Tuples2 tuples2M3642to = Tuples4.m3642to((String) itIterator2.next(), "");
                            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                        }
                        return linkedHashMap;
                    }
                } catch (Exception unused) {
                    MutableTemplatedWebView.logger.log(Level.WARNING, "Failed to parse templated string: " + str);
                    return MapsKt.emptyMap();
                }
            }
            return MapsKt.emptyMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String parseTemplatedStrings$lambda$1$lambda$0(MatchResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return (String) CollectionsKt.lastOrNull((List) result.getGroupValues());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Uri appendQueryParameters(String str, Map<String, String> parameters) {
            return URLUtils.INSTANCE.appendQueryParameters(str, parameters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Regex templateRegex(String match) {
            return new Regex(MutableTemplatedWebView.TEMPLATE_START + match + MutableTemplatedWebView.TEMPLATE_END);
        }

        static /* synthetic */ Regex templateRegex$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "(.+?)";
            }
            return companion.templateRegex(str);
        }
    }

    static {
        String name = MutableTemplatedWebView.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TAG = name;
        logger = Logger.getLogger(name);
    }

    private final String populateTemplatedValues(String str, Map<String, String> params) {
        for (Map.Entry<String, String> entry : params.entrySet()) {
            str = INSTANCE.templateRegex(entry.getKey()).replace(str, entry.getValue());
        }
        return str;
    }
}
