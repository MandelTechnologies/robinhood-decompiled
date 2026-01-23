package com.robinhood.android.deeplink.config;

import java.io.InputStream;
import java.util.Properties;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;

/* compiled from: DeeplinkConfig.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/deeplink/config/DeeplinkConfig;", "", "<init>", "()V", "properties", "Ljava/util/Properties;", "scheme", "", "getScheme", "()Ljava/lang/String;", "scheme$delegate", "Lkotlin/Lazy;", "lib-deeplink-config"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DeeplinkConfig {
    public static final DeeplinkConfig INSTANCE;
    private static final Properties properties;

    /* renamed from: scheme$delegate, reason: from kotlin metadata */
    private static final Lazy scheme;

    private DeeplinkConfig() {
    }

    static {
        DeeplinkConfig deeplinkConfig = new DeeplinkConfig();
        INSTANCE = deeplinkConfig;
        Properties properties2 = new Properties();
        InputStream resourceAsStream = deeplinkConfig.getClass().getClassLoader().getResourceAsStream("deeplink.properties");
        if (resourceAsStream != null) {
            try {
                properties2.load(resourceAsStream);
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(resourceAsStream, null);
            } finally {
            }
        }
        properties = properties2;
        scheme = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.deeplink.config.DeeplinkConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeeplinkConfig.scheme_delegate$lambda$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String scheme_delegate$lambda$2() {
        String property = properties.getProperty("scheme");
        return property == null ? "robinhood" : property;
    }

    public final String getScheme() {
        return (String) scheme.getValue();
    }
}
