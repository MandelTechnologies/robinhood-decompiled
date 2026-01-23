package com.robinhood.android.debugconfig;

import java.io.InputStream;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.text.StringsKt;

/* compiled from: DebugConfig.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/debugconfig/DebugConfig;", "", "<init>", "()V", "properties", "Ljava/util/Properties;", "apolloNamespace", "", "getApolloNamespace", "()Ljava/lang/String;", "defaultTargetBackend", "getDefaultTargetBackend", "externalTestUrl", "getExternalTestUrl", "externalDegradedTestUrl", "getExternalDegradedTestUrl", "apolloHeaderHost", "getApolloHeaderHost", "apolloHeaderPort", "getApolloHeaderPort", "apolloHeaderHostDegraded", "getApolloHeaderHostDegraded", "apolloHeaderPortDegraded", "getApolloHeaderPortDegraded", "recordNetworkTapes", "", "getRecordNetworkTapes", "()Z", "disableLockscreen", "getDisableLockscreen", "lib-debug-config"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class DebugConfig {
    public static final DebugConfig INSTANCE;
    private static final Properties properties;

    private DebugConfig() {
    }

    static {
        DebugConfig debugConfig = new DebugConfig();
        INSTANCE = debugConfig;
        Properties properties2 = new Properties();
        InputStream resourceAsStream = debugConfig.getClass().getClassLoader().getResourceAsStream("com/robinhood/build/debug/config.properties");
        if (resourceAsStream != null) {
            try {
                properties2.load(resourceAsStream);
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(resourceAsStream, null);
            } finally {
            }
        }
        properties = properties2;
    }

    public final String getApolloNamespace() {
        String property = properties.getProperty("apolloNamespace");
        return property == null ? "" : property;
    }

    public final String getDefaultTargetBackend() {
        String property = properties.getProperty("defaultTargetBackend");
        return property == null ? "PROD" : property;
    }

    public final String getExternalTestUrl() {
        String property = properties.getProperty("externalTestUrl");
        return property == null ? "http://127.0.0.1/" : property;
    }

    public final String getExternalDegradedTestUrl() {
        String property = properties.getProperty("externalDegradedTestUrl");
        return property == null ? "http://127.0.0.1/" : property;
    }

    public final String getApolloHeaderHost() {
        String property = properties.getProperty("apolloHeaderHost");
        if (property == null || StringsKt.isBlank(property)) {
            return null;
        }
        return property;
    }

    public final String getApolloHeaderPort() {
        String property = properties.getProperty("apolloHeaderPort");
        if (property == null || StringsKt.isBlank(property)) {
            return null;
        }
        return property;
    }

    public final String getApolloHeaderHostDegraded() {
        String property = properties.getProperty("apolloHeaderHostDegraded");
        if (property == null || StringsKt.isBlank(property)) {
            return null;
        }
        return property;
    }

    public final String getApolloHeaderPortDegraded() {
        String property = properties.getProperty("apolloHeaderPortDegraded");
        if (property == null || StringsKt.isBlank(property)) {
            return null;
        }
        return property;
    }

    public final boolean getRecordNetworkTapes() {
        String property = properties.getProperty("recordNetworkTapes");
        if (property != null) {
            return Boolean.parseBoolean(property);
        }
        return false;
    }

    public final boolean getDisableLockscreen() {
        String property = properties.getProperty("disableLockscreen");
        if (property != null) {
            return Boolean.parseBoolean(property);
        }
        return true;
    }
}
