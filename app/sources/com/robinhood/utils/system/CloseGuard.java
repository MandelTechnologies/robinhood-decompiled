package com.robinhood.utils.system;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: CloseGuard.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/system/CloseGuard;", "", "<init>", "()V", "open", "", "closer", "", "warnIfOpen", "close", "Methods", "Companion", "Lcom/robinhood/utils/system/NativeCloseGuard;", "Lcom/robinhood/utils/system/NoopCloseGuard;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CloseGuard {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final Methods methods;

    public /* synthetic */ CloseGuard(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final CloseGuard get() {
        return INSTANCE.get();
    }

    public abstract void close();

    public abstract void open(String closer);

    public abstract void warnIfOpen();

    private CloseGuard() {
    }

    /* compiled from: CloseGuard.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/system/CloseGuard$Methods;", "", "getMethod", "Ljava/lang/reflect/Method;", "openMethod", "closeMethod", "warnIfOpenMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetMethod", "()Ljava/lang/reflect/Method;", "getOpenMethod", "getCloseMethod", "getWarnIfOpenMethod", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    protected static final class Methods {
        private final Method closeMethod;
        private final Method getMethod;
        private final Method openMethod;
        private final Method warnIfOpenMethod;

        public Methods(Method getMethod, Method openMethod, Method closeMethod, Method warnIfOpenMethod) {
            Intrinsics.checkNotNullParameter(getMethod, "getMethod");
            Intrinsics.checkNotNullParameter(openMethod, "openMethod");
            Intrinsics.checkNotNullParameter(closeMethod, "closeMethod");
            Intrinsics.checkNotNullParameter(warnIfOpenMethod, "warnIfOpenMethod");
            this.getMethod = getMethod;
            this.openMethod = openMethod;
            this.closeMethod = closeMethod;
            this.warnIfOpenMethod = warnIfOpenMethod;
        }

        public final Method getGetMethod() {
            return this.getMethod;
        }

        public final Method getOpenMethod() {
            return this.openMethod;
        }

        public final Method getCloseMethod() {
            return this.closeMethod;
        }

        public final Method getWarnIfOpenMethod() {
            return this.warnIfOpenMethod;
        }
    }

    /* compiled from: CloseGuard.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/system/CloseGuard$Companion;", "", "<init>", "()V", "methods", "Lcom/robinhood/utils/system/CloseGuard$Methods;", "get", "Lcom/robinhood/utils/system/CloseGuard;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CloseGuard get() {
            return CloseGuard3.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Methods methods2 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method = cls.getMethod("get", null);
            Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
            Method method2 = cls.getMethod("open", String.class);
            Intrinsics.checkNotNullExpressionValue(method2, "getMethod(...)");
            Method method3 = cls.getMethod("close", null);
            Intrinsics.checkNotNullExpressionValue(method3, "getMethod(...)");
            Method method4 = cls.getMethod("warnIfOpen", null);
            Intrinsics.checkNotNullExpressionValue(method4, "getMethod(...)");
            methods2 = new Methods(method, method2, method3, method4);
        } catch (Exception e) {
            Timber.INSTANCE.mo3364w(e, "Could not init CloseGuard", new Object[0]);
        }
        methods = methods2;
    }
}
