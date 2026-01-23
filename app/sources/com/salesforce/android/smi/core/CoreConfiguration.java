package com.salesforce.android.smi.core;

import com.salesforce.android.smi.remote.internal.adapters.URLAdapter;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter2;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.ReadWrite2;
import kotlin.text.Charsets;

/* compiled from: CoreConfiguration.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u000b\u0010\fBA\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u000b\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0005H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/salesforce/android/smi/core/CoreConfiguration;", "Lcom/salesforce/android/smi/core/Configuration;", "serviceAPI", "Ljava/net/URL;", "organizationId", "", "developerName", "isUserVerificationRequired", "", "remoteLocaleMap", "", "<init>", "(Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "(Lcom/salesforce/android/smi/core/Configuration;)V", "getServiceAPI", "()Ljava/net/URL;", "getOrganizationId", "()Ljava/lang/String;", "getDeveloperName", "()Z", "getRemoteLocaleMap", "()Ljava/util/Map;", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CoreConfiguration implements Configuration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String developerName;
    private final transient boolean isUserVerificationRequired;
    private final String organizationId;
    private final transient Map<String, String> remoteLocaleMap;
    private final URL serviceAPI;

    public static /* synthetic */ CoreConfiguration copy$default(CoreConfiguration coreConfiguration, URL url, String str, String str2, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            url = coreConfiguration.serviceAPI;
        }
        if ((i & 2) != 0) {
            str = coreConfiguration.organizationId;
        }
        if ((i & 4) != 0) {
            str2 = coreConfiguration.developerName;
        }
        if ((i & 8) != 0) {
            z = coreConfiguration.isUserVerificationRequired;
        }
        if ((i & 16) != 0) {
            map = coreConfiguration.remoteLocaleMap;
        }
        Map map2 = map;
        String str3 = str2;
        return coreConfiguration.copy(url, str, str3, z, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final URL getServiceAPI() {
        return this.serviceAPI;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrganizationId() {
        return this.organizationId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeveloperName() {
        return this.developerName;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsUserVerificationRequired() {
        return this.isUserVerificationRequired;
    }

    public final Map<String, String> component5() {
        return this.remoteLocaleMap;
    }

    public final CoreConfiguration copy(@Json(name = "Url") URL serviceAPI, @Json(name = "OrganizationId") String organizationId, @Json(name = "DeveloperName") String developerName, boolean isUserVerificationRequired, Map<String, String> remoteLocaleMap) {
        Intrinsics.checkNotNullParameter(serviceAPI, "serviceAPI");
        Intrinsics.checkNotNullParameter(organizationId, "organizationId");
        Intrinsics.checkNotNullParameter(developerName, "developerName");
        Intrinsics.checkNotNullParameter(remoteLocaleMap, "remoteLocaleMap");
        return new CoreConfiguration(serviceAPI, organizationId, developerName, isUserVerificationRequired, remoteLocaleMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreConfiguration)) {
            return false;
        }
        CoreConfiguration coreConfiguration = (CoreConfiguration) other;
        return Intrinsics.areEqual(this.serviceAPI, coreConfiguration.serviceAPI) && Intrinsics.areEqual(this.organizationId, coreConfiguration.organizationId) && Intrinsics.areEqual(this.developerName, coreConfiguration.developerName) && this.isUserVerificationRequired == coreConfiguration.isUserVerificationRequired && Intrinsics.areEqual(this.remoteLocaleMap, coreConfiguration.remoteLocaleMap);
    }

    public int hashCode() {
        return (((((((this.serviceAPI.hashCode() * 31) + this.organizationId.hashCode()) * 31) + this.developerName.hashCode()) * 31) + Boolean.hashCode(this.isUserVerificationRequired)) * 31) + this.remoteLocaleMap.hashCode();
    }

    public CoreConfiguration(@Json(name = "Url") URL serviceAPI, @Json(name = "OrganizationId") String organizationId, @Json(name = "DeveloperName") String developerName, boolean z, Map<String, String> remoteLocaleMap) {
        Intrinsics.checkNotNullParameter(serviceAPI, "serviceAPI");
        Intrinsics.checkNotNullParameter(organizationId, "organizationId");
        Intrinsics.checkNotNullParameter(developerName, "developerName");
        Intrinsics.checkNotNullParameter(remoteLocaleMap, "remoteLocaleMap");
        this.serviceAPI = serviceAPI;
        this.organizationId = organizationId;
        this.developerName = developerName;
        this.isUserVerificationRequired = z;
        this.remoteLocaleMap = remoteLocaleMap;
    }

    @Override // com.salesforce.android.smi.core.Configuration
    public URL getServiceAPI() {
        return this.serviceAPI;
    }

    @Override // com.salesforce.android.smi.core.Configuration
    public String getOrganizationId() {
        return this.organizationId;
    }

    @Override // com.salesforce.android.smi.core.Configuration
    public String getDeveloperName() {
        return this.developerName;
    }

    @Override // com.salesforce.android.smi.core.Configuration
    public boolean isUserVerificationRequired() {
        return this.isUserVerificationRequired;
    }

    @Override // com.salesforce.android.smi.core.Configuration
    public Map<String, String> getRemoteLocaleMap() {
        return this.remoteLocaleMap;
    }

    public /* synthetic */ CoreConfiguration(URL url, String str, String str2, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(url, str, str2, (i & 8) != 0 ? false : z, (Map<String, String>) ((i & 16) != 0 ? MapsKt.emptyMap() : map));
    }

    public /* synthetic */ CoreConfiguration(String str, String str2, String str3, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (Map<String, String>) ((i & 16) != 0 ? MapsKt.emptyMap() : map));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoreConfiguration(String serviceAPI, String organizationId, String developerName, boolean z, Map<String, String> remoteLocaleMap) {
        this(new URL(serviceAPI), organizationId, developerName, z, remoteLocaleMap);
        Intrinsics.checkNotNullParameter(serviceAPI, "serviceAPI");
        Intrinsics.checkNotNullParameter(organizationId, "organizationId");
        Intrinsics.checkNotNullParameter(developerName, "developerName");
        Intrinsics.checkNotNullParameter(remoteLocaleMap, "remoteLocaleMap");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoreConfiguration(Configuration configuration) {
        this(configuration.getServiceAPI(), configuration.getOrganizationId(), configuration.getDeveloperName(), configuration.isUserVerificationRequired(), configuration.getRemoteLocaleMap());
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    public String toString() {
        return "CoreConfiguration:\nserviceAPI: " + getServiceAPI() + "\norganizationId: " + getOrganizationId() + "\ndeveloperName: " + getDeveloperName() + "\nuserVerified: " + isUserVerificationRequired();
    }

    /* compiled from: CoreConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/salesforce/android/smi/core/CoreConfiguration$Companion;", "", "<init>", "()V", "Ljava/io/InputStream;", "inputStream", "", "isUserVerificationRequired", "", "", "remoteLocaleMap", "Lcom/salesforce/android/smi/core/CoreConfiguration;", "fromInputStream", "(Ljava/io/InputStream;ZLjava/util/Map;)Lcom/salesforce/android/smi/core/CoreConfiguration;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CoreConfiguration fromInputStream$default(Companion companion, InputStream inputStream, boolean z, Map map, int i, Object obj) throws IOException {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.fromInputStream(inputStream, z, map);
        }

        @JvmOverloads
        public final CoreConfiguration fromInputStream(InputStream inputStream, boolean isUserVerificationRequired, Map<String, String> remoteLocaleMap) throws Exception {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(remoteLocaleMap, "remoteLocaleMap");
            JsonAdapter jsonAdapterAdapter = new Moshi.Builder().add(new URLAdapter()).add((JsonAdapter.Factory) new KotlinJsonAdapter2()).build().adapter(CoreConfiguration.class);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
            try {
                String text = ReadWrite2.readText(bufferedReader);
                Closeable.closeFinally(bufferedReader, null);
                CoreConfiguration coreConfiguration = (CoreConfiguration) jsonAdapterAdapter.fromJson(text);
                if (coreConfiguration != null) {
                    return new CoreConfiguration(coreConfiguration.getServiceAPI(), coreConfiguration.getOrganizationId(), coreConfiguration.getDeveloperName(), isUserVerificationRequired, remoteLocaleMap);
                }
                throw new Exception("Failed to deserialize JSON: " + text);
            } finally {
            }
        }
    }
}
