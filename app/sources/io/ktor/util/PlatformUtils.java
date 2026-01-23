package io.ktor.util;

import kotlin.Metadata;

/* compiled from: PlatformUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lio/ktor/util/PlatformUtils;", "", "<init>", "()V", "", "IS_BROWSER", "Z", "getIS_BROWSER", "()Z", "IS_NODE", "getIS_NODE", "IS_JVM", "getIS_JVM", "IS_NATIVE", "getIS_NATIVE", "IS_DEVELOPMENT_MODE", "getIS_DEVELOPMENT_MODE", "IS_NEW_MM_ENABLED", "getIS_NEW_MM_ENABLED", "ktor-utils"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PlatformUtils {
    public static final PlatformUtils INSTANCE;
    private static final boolean IS_BROWSER;
    private static final boolean IS_DEVELOPMENT_MODE;
    private static final boolean IS_JVM;
    private static final boolean IS_NATIVE;
    private static final boolean IS_NEW_MM_ENABLED;
    private static final boolean IS_NODE;

    private PlatformUtils() {
    }

    static {
        PlatformUtils platformUtils = new PlatformUtils();
        INSTANCE = platformUtils;
        IS_BROWSER = PlatformUtilsJvm.getPlatform(platformUtils) == PlatformUtils2.Browser;
        IS_NODE = PlatformUtilsJvm.getPlatform(platformUtils) == PlatformUtils2.Node;
        IS_JVM = PlatformUtilsJvm.getPlatform(platformUtils) == PlatformUtils2.Jvm;
        IS_NATIVE = PlatformUtilsJvm.getPlatform(platformUtils) == PlatformUtils2.Native;
        IS_DEVELOPMENT_MODE = PlatformUtilsJvm.isDevelopmentMode(platformUtils);
        IS_NEW_MM_ENABLED = PlatformUtilsJvm.isNewMemoryModel(platformUtils);
    }

    public final boolean getIS_BROWSER() {
        return IS_BROWSER;
    }

    public final boolean getIS_NATIVE() {
        return IS_NATIVE;
    }

    public final boolean getIS_DEVELOPMENT_MODE() {
        return IS_DEVELOPMENT_MODE;
    }
}
