package com.robinhood.utils.logging;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.robinhood.Logger;
import com.robinhood.shared.bitdrift.BitdriftCapture;
import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.Sentry;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* compiled from: CrashReporters.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\"\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J,\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u001eH\u0016J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/utils/logging/DebugCrashReporter;", "Lcom/robinhood/utils/logging/CrashReporter;", "<init>", "()V", "crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "getCrashlytics", "()Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics$delegate", "Lkotlin/Lazy;", "value", "", "userIdentifier", "getUserIdentifier", "()Ljava/lang/String;", "setUserIdentifier", "(Ljava/lang/String;)V", "log", "", "message", "reportNonFatal", "t", "", "throwIfDebug", "", "metadata", "Lcom/robinhood/utils/logging/EventMetadata;", "reportLeak", "leakTrace", "", "", "addMetadata", "key", "setContext", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.logging.DebugCrashReporter, reason: use source file name */
/* loaded from: classes12.dex */
public final class CrashReporters2 implements CrashReporter {
    public static final CrashReporters2 INSTANCE = new CrashReporters2();

    /* renamed from: crashlytics$delegate, reason: from kotlin metadata */
    private static final Lazy crashlytics = LazyKt.lazy(new Function0() { // from class: com.robinhood.utils.logging.DebugCrashReporter$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CrashReporters2.crashlytics_delegate$lambda$1();
        }
    });
    private static String userIdentifier;

    private CrashReporters2() {
    }

    static {
        Timber.INSTANCE.plant(CrashlyticsTree.INSTANCE);
    }

    private final FirebaseCrashlytics getCrashlytics() {
        return (FirebaseCrashlytics) crashlytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseCrashlytics crashlytics_delegate$lambda$1() {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        if (firebaseCrashlytics.didCrashOnPreviousExecution()) {
            BitdriftCapture.INSTANCE.errorTriggered();
        }
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "apply(...)");
        return firebaseCrashlytics;
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public String getUserIdentifier() {
        return userIdentifier;
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void setUserIdentifier(String str) {
        userIdentifier = str;
        if (str != null) {
            getCrashlytics().setUserId(str);
        }
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        getCrashlytics().log(message);
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void reportNonFatal(Throwable t, boolean throwIfDebug, EventMetadata metadata) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        getCrashlytics().recordException(t);
        if (metadata != null) {
            Sentry.captureEvent(CrashReporters.toSentryEvent(t, metadata, new CrashReporters5()));
        }
        if (throwIfDebug) {
            throw t;
        }
        Logger.INSTANCE.mo1682e(t, "CrashReporter.reportNonFatal()", new Object[0]);
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void reportLeak(Throwable t, String leakTrace, Map<String, ? extends Object> metadata) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(leakTrace, "leakTrace");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        FirebaseCrashlytics crashlytics2 = getCrashlytics();
        Iterator<String> itIterator2 = StringsKt.lineSequence(leakTrace).iterator2();
        while (itIterator2.hasNext()) {
            crashlytics2.log(itIterator2.next());
        }
        CrashReporters.addMetadata(crashlytics2, metadata);
        crashlytics2.recordException(t);
        Logger.INSTANCE.mo1682e(t, "CrashReporter.reportLeak()", new Object[0]);
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void addMetadata(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        CrashReporters.addMetadata(getCrashlytics(), key, value);
        Logger.INSTANCE.mo1683i("Add metadata: %s = %s", key, value);
    }

    @Override // com.robinhood.utils.logging.CrashReporter
    public void setContext(final String key, final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        CrashReporters.addMetadata(getCrashlytics(), key, value);
        Sentry.configureScope(new ScopeCallback() { // from class: com.robinhood.utils.logging.DebugCrashReporter.setContext.1
            @Override // io.sentry.ScopeCallback
            public final void run(IScope scope) {
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.setContexts(key, value);
            }
        });
        Logger.INSTANCE.mo1683i("Add context: %s = %s", key, value);
    }
}
