package io.sentry.cache;

import io.sentry.IOptionsObserver;
import io.sentry.JsonDeserializer;
import io.sentry.SentryOptions;
import io.sentry.protocol.SdkVersion;
import java.util.Map;

/* loaded from: classes21.dex */
public final class PersistingOptionsObserver implements IOptionsObserver {
    private final SentryOptions options;

    public PersistingOptionsObserver(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // io.sentry.IOptionsObserver
    public void setRelease(String str) {
        if (str == null) {
            delete("release.json");
        } else {
            store(str, "release.json");
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setProguardUuid(String str) {
        if (str == null) {
            delete("proguard-uuid.json");
        } else {
            store(str, "proguard-uuid.json");
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setSdkVersion(SdkVersion sdkVersion) {
        if (sdkVersion == null) {
            delete("sdk-version.json");
        } else {
            store(sdkVersion, "sdk-version.json");
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setDist(String str) {
        if (str == null) {
            delete("dist.json");
        } else {
            store(str, "dist.json");
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setEnvironment(String str) {
        if (str == null) {
            delete("environment.json");
        } else {
            store(str, "environment.json");
        }
    }

    @Override // io.sentry.IOptionsObserver
    public void setTags(Map<String, String> map) {
        store(map, "tags.json");
    }

    @Override // io.sentry.IOptionsObserver
    public void setReplayErrorSampleRate(Double d) {
        if (d != null) {
            store(d.toString(), "replay-error-sample-rate.json");
        } else {
            delete("replay-error-sample-rate.json");
        }
    }

    private <T> void store(T t, String str) {
        CacheUtils.store(this.options, t, ".options-cache", str);
    }

    private void delete(String str) {
        CacheUtils.delete(this.options, ".options-cache", str);
    }

    public static <T> T read(SentryOptions sentryOptions, String str, Class<T> cls) {
        return (T) read(sentryOptions, str, cls, null);
    }

    public static <T, R> T read(SentryOptions sentryOptions, String str, Class<T> cls, JsonDeserializer<R> jsonDeserializer) {
        return (T) CacheUtils.read(sentryOptions, ".options-cache", str, cls, jsonDeserializer);
    }
}
