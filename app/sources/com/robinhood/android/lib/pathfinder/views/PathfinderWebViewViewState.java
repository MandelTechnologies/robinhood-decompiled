package com.robinhood.android.lib.pathfinder.views;

import com.robinhood.android.lib.webview.data.WebConfig;
import com.robinhood.udf.UiEvent;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: PathfinderWebViewViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J_\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebViewViewState;", "", "hostedUrl", "Lokhttp3/HttpUrl;", "topicId", "", "inquiryId", "Ljava/util/UUID;", "unknownParams", "", "webConfig", "Lcom/robinhood/android/lib/webview/data/WebConfig;", "logout", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/util/UUID;Ljava/util/Map;Lcom/robinhood/android/lib/webview/data/WebConfig;Lcom/robinhood/udf/UiEvent;)V", "getHostedUrl", "()Lokhttp3/HttpUrl;", "getTopicId", "()Ljava/lang/String;", "getInquiryId", "()Ljava/util/UUID;", "getUnknownParams", "()Ljava/util/Map;", "getWebConfig", "()Lcom/robinhood/android/lib/webview/data/WebConfig;", "getLogout", "()Lcom/robinhood/udf/UiEvent;", "userAgentSuffix", "getUserAgentSuffix", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PathfinderWebViewViewState {
    public static final int $stable = 8;
    private final HttpUrl hostedUrl;
    private final UUID inquiryId;
    private final UiEvent<Unit> logout;
    private final String topicId;
    private final Map<String, String> unknownParams;
    private final String userAgentSuffix;
    private final WebConfig webConfig;

    public static /* synthetic */ PathfinderWebViewViewState copy$default(PathfinderWebViewViewState pathfinderWebViewViewState, HttpUrl httpUrl, String str, UUID uuid, Map map, WebConfig webConfig, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            httpUrl = pathfinderWebViewViewState.hostedUrl;
        }
        if ((i & 2) != 0) {
            str = pathfinderWebViewViewState.topicId;
        }
        if ((i & 4) != 0) {
            uuid = pathfinderWebViewViewState.inquiryId;
        }
        if ((i & 8) != 0) {
            map = pathfinderWebViewViewState.unknownParams;
        }
        if ((i & 16) != 0) {
            webConfig = pathfinderWebViewViewState.webConfig;
        }
        if ((i & 32) != 0) {
            uiEvent = pathfinderWebViewViewState.logout;
        }
        WebConfig webConfig2 = webConfig;
        UiEvent uiEvent2 = uiEvent;
        return pathfinderWebViewViewState.copy(httpUrl, str, uuid, map, webConfig2, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final HttpUrl getHostedUrl() {
        return this.hostedUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTopicId() {
        return this.topicId;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public final Map<String, String> component4() {
        return this.unknownParams;
    }

    /* renamed from: component5, reason: from getter */
    public final WebConfig getWebConfig() {
        return this.webConfig;
    }

    public final UiEvent<Unit> component6() {
        return this.logout;
    }

    public final PathfinderWebViewViewState copy(HttpUrl hostedUrl, String topicId, UUID inquiryId, Map<String, String> unknownParams, WebConfig webConfig, UiEvent<Unit> logout) {
        Intrinsics.checkNotNullParameter(unknownParams, "unknownParams");
        Intrinsics.checkNotNullParameter(webConfig, "webConfig");
        return new PathfinderWebViewViewState(hostedUrl, topicId, inquiryId, unknownParams, webConfig, logout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PathfinderWebViewViewState)) {
            return false;
        }
        PathfinderWebViewViewState pathfinderWebViewViewState = (PathfinderWebViewViewState) other;
        return Intrinsics.areEqual(this.hostedUrl, pathfinderWebViewViewState.hostedUrl) && Intrinsics.areEqual(this.topicId, pathfinderWebViewViewState.topicId) && Intrinsics.areEqual(this.inquiryId, pathfinderWebViewViewState.inquiryId) && Intrinsics.areEqual(this.unknownParams, pathfinderWebViewViewState.unknownParams) && Intrinsics.areEqual(this.webConfig, pathfinderWebViewViewState.webConfig) && Intrinsics.areEqual(this.logout, pathfinderWebViewViewState.logout);
    }

    public int hashCode() {
        HttpUrl httpUrl = this.hostedUrl;
        int iHashCode = (httpUrl == null ? 0 : httpUrl.hashCode()) * 31;
        String str = this.topicId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.inquiryId;
        int iHashCode3 = (((((iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.unknownParams.hashCode()) * 31) + this.webConfig.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.logout;
        return iHashCode3 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "PathfinderWebViewViewState(hostedUrl=" + this.hostedUrl + ", topicId=" + this.topicId + ", inquiryId=" + this.inquiryId + ", unknownParams=" + this.unknownParams + ", webConfig=" + this.webConfig + ", logout=" + this.logout + ")";
    }

    public PathfinderWebViewViewState(HttpUrl httpUrl, String str, UUID uuid, Map<String, String> unknownParams, WebConfig webConfig, UiEvent<Unit> uiEvent) {
        Intrinsics.checkNotNullParameter(unknownParams, "unknownParams");
        Intrinsics.checkNotNullParameter(webConfig, "webConfig");
        this.hostedUrl = httpUrl;
        this.topicId = str;
        this.inquiryId = uuid;
        this.unknownParams = unknownParams;
        this.webConfig = webConfig;
        this.logout = uiEvent;
        this.userAgentSuffix = "rhwebview/" + webConfig.getAppVersionString();
    }

    public final HttpUrl getHostedUrl() {
        return this.hostedUrl;
    }

    public final String getTopicId() {
        return this.topicId;
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public /* synthetic */ PathfinderWebViewViewState(HttpUrl httpUrl, String str, UUID uuid, Map map, WebConfig webConfig, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : httpUrl, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : uuid, (i & 8) != 0 ? MapsKt.emptyMap() : map, webConfig, (i & 32) != 0 ? null : uiEvent);
    }

    public final Map<String, String> getUnknownParams() {
        return this.unknownParams;
    }

    public final WebConfig getWebConfig() {
        return this.webConfig;
    }

    public final UiEvent<Unit> getLogout() {
        return this.logout;
    }

    public final String getUserAgentSuffix() {
        return this.userAgentSuffix;
    }
}
