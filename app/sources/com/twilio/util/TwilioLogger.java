package com.twilio.util;

import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.singular.sdk.internal.Constants;
import com.twilio.util.TwilioLogger2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicFU2;
import kotlinx.atomicfu.AtomicFU4;

/* compiled from: TwilioLogger.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J&\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0086\bø\u0001\u0000J\u001c\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J&\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0086\bø\u0001\u0000J\u001c\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J&\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0086\bø\u0001\u0000J\u001c\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u001c\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J&\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0086\bø\u0001\u0000J\u001c\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J&\u0010\u0017\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0086\bø\u0001\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, m3636d2 = {"Lcom/twilio/util/TwilioLogger;", "", "name", "", "(Ljava/lang/String;)V", "isDebugEnabled", "", "()Z", "isErrorEnabled", "isInfoEnabled", "isVerboseEnabled", "isWarnEnabled", "d", "", "msg", "t", "", "buildMsg", "Lkotlin/Function0;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, Constants.RequestParamsKeys.PACKAGE_NAME_KEY, SduiFeatureDiscovery3.INFO_TAG, "v", "w", "Companion", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TwilioLogger {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int INHERIT = 9;
    public static final int SILENT = 8;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicFU2 globalLogLevel$delegate = AtomicFU.atomic(8);
    private static final AtomicFU4<Map<KClass<?>, TwilioLogger>> loggers = AtomicFU.atomic(MapsKt.emptyMap());

    public /* synthetic */ TwilioLogger(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @JvmStatic
    public static final int getLogLevel() {
        return INSTANCE.getLogLevel();
    }

    @JvmStatic
    public static final TwilioLogger getLogger(String str) {
        return INSTANCE.getLogger(str);
    }

    @JvmStatic
    public static final TwilioLogger getLogger(KClass<?> kClass) {
        return INSTANCE.getLogger(kClass);
    }

    @JvmStatic
    public static final void setLogLevel(int i) {
        INSTANCE.setLogLevel(i);
    }

    @JvmOverloads
    /* renamed from: d */
    public final void m3188d(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        d$default(this, msg, (Throwable) null, 2, (Object) null);
    }

    @JvmOverloads
    /* renamed from: e */
    public final void m3191e(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        e$default(this, msg, (Throwable) null, 2, (Object) null);
    }

    @JvmOverloads
    /* renamed from: i */
    public final void m3195i(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        i$default(this, msg, (Throwable) null, 2, (Object) null);
    }

    @JvmOverloads
    public final void info(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        info$default(this, msg, null, 2, null);
    }

    @JvmOverloads
    /* renamed from: v */
    public final void m3198v(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        v$default(this, msg, (Throwable) null, 2, (Object) null);
    }

    @JvmOverloads
    /* renamed from: w */
    public final void m3201w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        w$default(this, msg, (Throwable) null, 2, (Object) null);
    }

    private TwilioLogger(String str) {
        this.name = str;
    }

    public final boolean isVerboseEnabled() {
        return INSTANCE.getGlobalLogLevel() <= 2;
    }

    public final boolean isDebugEnabled() {
        return INSTANCE.getGlobalLogLevel() <= 3;
    }

    public final boolean isInfoEnabled() {
        return INSTANCE.getGlobalLogLevel() <= 4;
    }

    public final boolean isWarnEnabled() {
        return INSTANCE.getGlobalLogLevel() <= 5;
    }

    public final boolean isErrorEnabled() {
        return INSTANCE.getGlobalLogLevel() <= 6;
    }

    public static /* synthetic */ void v$default(TwilioLogger twilioLogger, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        twilioLogger.m3199v(str, th);
    }

    @JvmOverloads
    /* renamed from: v */
    public final void m3199v(String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (isVerboseEnabled()) {
            TwilioLogger3.getLogWriter().mo3181v(this.name, msg, t);
        }
    }

    public static /* synthetic */ void d$default(TwilioLogger twilioLogger, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        twilioLogger.m3189d(str, th);
    }

    @JvmOverloads
    /* renamed from: d */
    public final void m3189d(String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (isDebugEnabled()) {
            TwilioLogger3.getLogWriter().mo3178d(this.name, msg, t);
        }
    }

    public static /* synthetic */ void i$default(TwilioLogger twilioLogger, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        twilioLogger.m3196i(str, th);
    }

    @JvmOverloads
    /* renamed from: i */
    public final void m3196i(String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (isInfoEnabled()) {
            TwilioLogger3.getLogWriter().mo3180i(this.name, msg, t);
        }
    }

    public static /* synthetic */ void info$default(TwilioLogger twilioLogger, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        twilioLogger.info(str, th);
    }

    @JvmOverloads
    public final void info(String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        TwilioLogger3.getLogWriter().mo3180i(this.name, msg, t);
    }

    public static /* synthetic */ void w$default(TwilioLogger twilioLogger, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        twilioLogger.m3202w(str, th);
    }

    @JvmOverloads
    /* renamed from: w */
    public final void m3202w(String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (isWarnEnabled()) {
            TwilioLogger3.getLogWriter().mo3182w(this.name, msg, t);
        }
    }

    public static /* synthetic */ void e$default(TwilioLogger twilioLogger, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        twilioLogger.m3192e(str, th);
    }

    @JvmOverloads
    /* renamed from: e */
    public final void m3192e(String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (isErrorEnabled()) {
            TwilioLogger3.getLogWriter().mo3179e(this.name, msg, t);
        }
    }

    /* renamed from: e */
    public final void m3193e(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        if (isErrorEnabled()) {
            TwilioLogger2.DefaultImpls.e$default(TwilioLogger3.getLogWriter(), this.name, null, t, 2, null);
        }
    }

    public static /* synthetic */ void v$default(TwilioLogger twilioLogger, Throwable th, Function0 buildMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(buildMsg, "buildMsg");
        if (twilioLogger.isVerboseEnabled()) {
            twilioLogger.m3199v((String) buildMsg.invoke(), th);
        }
    }

    /* renamed from: v */
    public final void m3200v(Throwable t, Function0<String> buildMsg) {
        Intrinsics.checkNotNullParameter(buildMsg, "buildMsg");
        if (isVerboseEnabled()) {
            m3199v(buildMsg.invoke(), t);
        }
    }

    public static /* synthetic */ void d$default(TwilioLogger twilioLogger, Throwable th, Function0 buildMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(buildMsg, "buildMsg");
        if (twilioLogger.isDebugEnabled()) {
            twilioLogger.m3189d((String) buildMsg.invoke(), th);
        }
    }

    /* renamed from: d */
    public final void m3190d(Throwable t, Function0<String> buildMsg) {
        Intrinsics.checkNotNullParameter(buildMsg, "buildMsg");
        if (isDebugEnabled()) {
            m3189d(buildMsg.invoke(), t);
        }
    }

    public static /* synthetic */ void i$default(TwilioLogger twilioLogger, Throwable th, Function0 buildMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(buildMsg, "buildMsg");
        if (twilioLogger.isInfoEnabled()) {
            twilioLogger.m3196i((String) buildMsg.invoke(), th);
        }
    }

    /* renamed from: i */
    public final void m3197i(Throwable t, Function0<String> buildMsg) {
        Intrinsics.checkNotNullParameter(buildMsg, "buildMsg");
        if (isInfoEnabled()) {
            m3196i(buildMsg.invoke(), t);
        }
    }

    public static /* synthetic */ void w$default(TwilioLogger twilioLogger, Throwable th, Function0 buildMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(buildMsg, "buildMsg");
        if (twilioLogger.isWarnEnabled()) {
            twilioLogger.m3202w((String) buildMsg.invoke(), th);
        }
    }

    /* renamed from: w */
    public final void m3203w(Throwable t, Function0<String> buildMsg) {
        Intrinsics.checkNotNullParameter(buildMsg, "buildMsg");
        if (isWarnEnabled()) {
            m3202w(buildMsg.invoke(), t);
        }
    }

    public static /* synthetic */ void e$default(TwilioLogger twilioLogger, Throwable th, Function0 buildMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(buildMsg, "buildMsg");
        if (twilioLogger.isErrorEnabled()) {
            twilioLogger.m3192e((String) buildMsg.invoke(), th);
        }
    }

    /* renamed from: e */
    public final void m3194e(Throwable t, Function0<String> buildMsg) {
        Intrinsics.checkNotNullParameter(buildMsg, "buildMsg");
        if (isErrorEnabled()) {
            m3192e(buildMsg.invoke(), t);
        }
    }

    /* compiled from: TwilioLogger.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0014\u0010\u001a\u001a\u00020\u00182\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/twilio/util/TwilioLogger$Companion;", "", "()V", "ASSERT", "", "DEBUG", "ERROR", "INFO", "INHERIT", "SILENT", "VERBOSE", "WARN", "<set-?>", "globalLogLevel", "getGlobalLogLevel", "()I", "setGlobalLogLevel", "(I)V", "globalLogLevel$delegate", "Lkotlinx/atomicfu/AtomicInt;", "loggers", "Lkotlinx/atomicfu/AtomicRef;", "", "Lkotlin/reflect/KClass;", "Lcom/twilio/util/TwilioLogger;", "getLogLevel", "getLogger", "name", "", "cls", "setLogLevel", "", "level", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getGlobalLogLevel() {
            return TwilioLogger.globalLogLevel$delegate.getValue();
        }

        private final void setGlobalLogLevel(int i) {
            TwilioLogger.globalLogLevel$delegate.setValue(i);
        }

        @JvmStatic
        public final void setLogLevel(int level) {
            setGlobalLogLevel(level);
        }

        @JvmStatic
        public final int getLogLevel() {
            return getGlobalLogLevel();
        }

        @JvmStatic
        public final TwilioLogger getLogger(KClass<?> cls) {
            Object value;
            Intrinsics.checkNotNullParameter(cls, "cls");
            TwilioLogger twilioLogger = (TwilioLogger) ((Map) TwilioLogger.loggers.getValue()).get(cls);
            if (twilioLogger != null) {
                return twilioLogger;
            }
            String simpleName = cls.getSimpleName();
            if (simpleName == null) {
                simpleName = "Unknown";
            }
            TwilioLogger twilioLogger2 = new TwilioLogger(simpleName, null);
            AtomicFU4 atomicFU4 = TwilioLogger.loggers;
            do {
                value = atomicFU4.getValue();
            } while (!atomicFU4.compareAndSet(value, MapsKt.plus((Map) value, Tuples4.m3642to(cls, twilioLogger2))));
            return twilioLogger2;
        }

        @JvmStatic
        public final TwilioLogger getLogger(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new TwilioLogger(name, null);
        }
    }
}
