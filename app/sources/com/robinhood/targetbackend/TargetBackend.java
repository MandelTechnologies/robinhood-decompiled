package com.robinhood.targetbackend;

import android.content.SharedPreferences;
import com.robinhood.android.debugconfig.DebugConfig;
import com.robinhood.targetbackend.Endpoint;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: TargetBackend.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/targetbackend/TargetBackend;", "", "id", "Lcom/robinhood/targetbackend/TargetBackend$Id;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "<init>", "(Lcom/robinhood/targetbackend/TargetBackend$Id;Lcom/robinhood/targetbackend/Endpoint;)V", "getId", "()Lcom/robinhood/targetbackend/TargetBackend$Id;", "getEndpoint", "()Lcom/robinhood/targetbackend/Endpoint;", "toString", "", "analyticsName", "getAnalyticsName", "()Ljava/lang/String;", "isApollo", "", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "Id", "Companion", "lib-target-backend_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class TargetBackend {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TargetBackend EXTERNAL_TEST;
    private static final TargetBackend EXTERNAL_TEST_DEGRADED;
    private static final String PREF_KEY_CUSTOM_ENDPOINT = "custom_endpoint_url";
    private static final String PREF_KEY_DOCKER_NAMESPACE = "docker_namespace";
    private static final TargetBackend PROD;
    private static final TargetBackend PROD_RHC;
    private static final TargetBackend STAGING;
    private static final String URL_LOCALHOST = "http://10.0.2.2:8100/";
    private static UiTestEnvironment externalTestEnvironment;
    private final Endpoint endpoint;
    private final EnumC41639Id id;

    public static /* synthetic */ TargetBackend copy$default(TargetBackend targetBackend, EnumC41639Id enumC41639Id, Endpoint endpoint, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC41639Id = targetBackend.id;
        }
        if ((i & 2) != 0) {
            endpoint = targetBackend.endpoint;
        }
        return targetBackend.copy(enumC41639Id, endpoint);
    }

    /* renamed from: component1, reason: from getter */
    public final EnumC41639Id getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Endpoint getEndpoint() {
        return this.endpoint;
    }

    public final TargetBackend copy(EnumC41639Id id, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        return new TargetBackend(id, endpoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetBackend)) {
            return false;
        }
        TargetBackend targetBackend = (TargetBackend) other;
        return this.id == targetBackend.id && Intrinsics.areEqual(this.endpoint, targetBackend.endpoint);
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.endpoint.hashCode();
    }

    public TargetBackend(EnumC41639Id id, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.id = id;
        this.endpoint = endpoint;
    }

    public final EnumC41639Id getId() {
        return this.id;
    }

    public final Endpoint getEndpoint() {
        return this.endpoint;
    }

    public String toString() {
        return this.id.name();
    }

    public final String getAnalyticsName() {
        return isApollo() ? "APOLLO" : this.id.name();
    }

    public final boolean isApollo() {
        return this.endpoint.getApolloNamespace() != null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TargetBackend.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/targetbackend/TargetBackend$Id;", "", "<init>", "(Ljava/lang/String;I)V", "PROD", "STAGING", "EXTERNAL_TEST", "EXTERNAL_DEGRADED_TEST", "CUSTOM_HOSTNAME", "NAMESPACE", "UAT", "lib-target-backend_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.targetbackend.TargetBackend$Id */
    public static final class EnumC41639Id {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC41639Id[] $VALUES;
        public static final EnumC41639Id PROD = new EnumC41639Id("PROD", 0);
        public static final EnumC41639Id STAGING = new EnumC41639Id("STAGING", 1);
        public static final EnumC41639Id EXTERNAL_TEST = new EnumC41639Id("EXTERNAL_TEST", 2);
        public static final EnumC41639Id EXTERNAL_DEGRADED_TEST = new EnumC41639Id("EXTERNAL_DEGRADED_TEST", 3);
        public static final EnumC41639Id CUSTOM_HOSTNAME = new EnumC41639Id("CUSTOM_HOSTNAME", 4);
        public static final EnumC41639Id NAMESPACE = new EnumC41639Id("NAMESPACE", 5);
        public static final EnumC41639Id UAT = new EnumC41639Id("UAT", 6);

        private static final /* synthetic */ EnumC41639Id[] $values() {
            return new EnumC41639Id[]{PROD, STAGING, EXTERNAL_TEST, EXTERNAL_DEGRADED_TEST, CUSTOM_HOSTNAME, NAMESPACE, UAT};
        }

        public static EnumEntries<EnumC41639Id> getEntries() {
            return $ENTRIES;
        }

        private EnumC41639Id(String str, int i) {
        }

        static {
            EnumC41639Id[] enumC41639IdArr$values = $values();
            $VALUES = enumC41639IdArr$values;
            $ENTRIES = EnumEntries2.enumEntries(enumC41639IdArr$values);
        }

        public static EnumC41639Id valueOf(String str) {
            return (EnumC41639Id) Enum.valueOf(EnumC41639Id.class, str);
        }

        public static EnumC41639Id[] values() {
            return (EnumC41639Id[]) $VALUES.clone();
        }
    }

    /* compiled from: TargetBackend.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/targetbackend/TargetBackend$Companion;", "", "<init>", "()V", "PROD", "Lcom/robinhood/targetbackend/TargetBackend;", "getPROD", "()Lcom/robinhood/targetbackend/TargetBackend;", "PROD_RHC", "getPROD_RHC", "STAGING", "getSTAGING", "EXTERNAL_TEST", "getEXTERNAL_TEST", "EXTERNAL_TEST_DEGRADED", "getEXTERNAL_TEST_DEGRADED", "externalTestEnvironment", "Lcom/robinhood/targetbackend/UiTestEnvironment;", "getExternalTestEnvironment", "()Lcom/robinhood/targetbackend/UiTestEnvironment;", "setExternalTestEnvironment", "(Lcom/robinhood/targetbackend/UiTestEnvironment;)V", "PREF_KEY_CUSTOM_ENDPOINT", "", "URL_LOCALHOST", "PREF_KEY_DOCKER_NAMESPACE", "getCustomDockerUrl", "Lokhttp3/HttpUrl;", "sharedPrefs", "Landroid/content/SharedPreferences;", "setCustomDockerUrl", "", "url", "getDockerNamespace", "setDockerNamespace", "namespace", "lib-target-backend_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TargetBackend getPROD() {
            return TargetBackend.PROD;
        }

        public final void setCustomDockerUrl(SharedPreferences sharedPrefs, HttpUrl url) {
            Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
            Intrinsics.checkNotNullParameter(url, "url");
            SharedPreferences.Editor editorEdit = sharedPrefs.edit();
            editorEdit.putString(TargetBackend.PREF_KEY_CUSTOM_ENDPOINT, url.getUrl());
            editorEdit.apply();
        }

        public final void setDockerNamespace(SharedPreferences sharedPrefs, String namespace) {
            Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            SharedPreferences.Editor editorEdit = sharedPrefs.edit();
            editorEdit.putString(TargetBackend.PREF_KEY_DOCKER_NAMESPACE, namespace);
            editorEdit.apply();
        }

        public final TargetBackend getPROD_RHC() {
            return TargetBackend.PROD_RHC;
        }

        public final TargetBackend getSTAGING() {
            return TargetBackend.STAGING;
        }

        public final TargetBackend getEXTERNAL_TEST() {
            return TargetBackend.EXTERNAL_TEST;
        }

        public final TargetBackend getEXTERNAL_TEST_DEGRADED() {
            return TargetBackend.EXTERNAL_TEST_DEGRADED;
        }

        public final UiTestEnvironment getExternalTestEnvironment() {
            return TargetBackend.externalTestEnvironment;
        }

        public final void setExternalTestEnvironment(UiTestEnvironment uiTestEnvironment) {
            Intrinsics.checkNotNullParameter(uiTestEnvironment, "<set-?>");
            TargetBackend.externalTestEnvironment = uiTestEnvironment;
        }

        public final HttpUrl getCustomDockerUrl(SharedPreferences sharedPrefs) {
            Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
            String string2 = sharedPrefs.getString(TargetBackend.PREF_KEY_CUSTOM_ENDPOINT, null);
            if (string2 == null) {
                string2 = TargetBackend.URL_LOCALHOST;
            }
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            HttpUrl httpUrl = companion.parse(string2);
            return httpUrl == null ? companion.get(TargetBackend.URL_LOCALHOST) : httpUrl;
        }

        public final String getDockerNamespace(SharedPreferences sharedPrefs) {
            Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
            DebugConfig debugConfig = DebugConfig.INSTANCE;
            String string2 = sharedPrefs.getString(TargetBackend.PREF_KEY_DOCKER_NAMESPACE, debugConfig.getApolloNamespace());
            return string2 == null ? debugConfig.getApolloNamespace() : string2;
        }
    }

    static {
        EnumC41639Id enumC41639Id = EnumC41639Id.PROD;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        TargetBackend targetBackend = new TargetBackend(enumC41639Id, new Endpoint("c82SH0WZOsabOXGP2sxqcj34FxkvfnWRZBKlBjFS", "6LfDLyUUAAAAALr9pk9306vwKbQVrp1NMSODcWCQ", true, null, null, Endpoint.Companion.url$default(companion, "crumbs.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"arsenal"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "atlas.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "bonfire.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "cashier.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"ceres"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"chatbot"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"creditcard"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"crypto-transfers"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"banking", "cross-sell"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"discovery"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "dora.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"kaizen", "experiments"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "identi.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"managed-marketdata"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"marketdata"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"media"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"midlands"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "minerva.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "nummus.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"options-product"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"pathfinder"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"privacy"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[]{"pluto"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "scroll.robinhood.com", new String[0], null, false, 12, null), null, Endpoint.Companion.url$default(companion, "api-streaming.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "api.robinhood.com", new String[0], null, false, 12, null), 24, 0, null));
        PROD = targetBackend;
        PROD_RHC = copy$default(targetBackend, null, Endpoint.copy$default(targetBackend.endpoint, "h3XQQ7E08J9QaCqni9YQqGeOENyOHfTBPygxHNuJ", null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 7, null), 1, null);
        STAGING = new TargetBackend(EnumC41639Id.STAGING, new Endpoint(Constants.SdidMigrationStatusCodes.ALREADY_SDID, "", false, null, null, Endpoint.Companion.url$default(companion, "goku-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "arsenal-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "atlas-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "bonfire-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "brokeback-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "cashier-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "ceres-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "chatbot-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "credit-card-api-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "crypto-transfers-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "xsell-api.staging.internal.x1.co", new String[]{"banking", "cross-sell"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "discovery-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "dora-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "analytics-docker.staging.robinhood.com", new String[]{"vegeta", "experiments"}, null, false, 12, null), Endpoint.Companion.url$default(companion, "identi-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "inbox-renderer-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "managed-marketdata-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "marketdata-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "media-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "midlands-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "minerva-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "nummus-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "options-product-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "pathfinder-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "pims-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "pluto-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "scroll-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "test-data-api-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "websocket-gateway-docker.staging.robinhood.com", new String[0], null, false, 12, null), Endpoint.Companion.url$default(companion, "portfolio-docker.staging.robinhood.com", new String[0], null, false, 12, null), 24, 0, null));
        EnumC41639Id enumC41639Id2 = EnumC41639Id.EXTERNAL_TEST;
        HttpUrl.Companion companion2 = HttpUrl.INSTANCE;
        DebugConfig debugConfig = DebugConfig.INSTANCE;
        TargetBackend targetBackend2 = new TargetBackend(enumC41639Id2, companion.forDocker(companion2.get(debugConfig.getExternalTestUrl())));
        EXTERNAL_TEST = targetBackend2;
        EXTERNAL_TEST_DEGRADED = new TargetBackend(EnumC41639Id.EXTERNAL_DEGRADED_TEST, companion.forDocker(companion2.get(debugConfig.getExternalDegradedTestUrl())));
        externalTestEnvironment = new UiTestEnvironment(targetBackend2, debugConfig.getApolloHeaderHost(), debugConfig.getApolloHeaderPort());
    }
}
