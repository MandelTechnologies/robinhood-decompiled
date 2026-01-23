package com.robinhood.utils.logging;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.sentry.Sentry;
import io.sentry.SentryEvent;
import io.sentry.SentryExceptionFactory;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CrashReporters.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002\u001a\b\u0010\f\u001a\u00020\rH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0002\u001a\u001c\u0010\u000f\u001a\u00020\n*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0013"}, m3636d2 = {"addMetadata", "", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "metadata", "", "", "", "key", "value", "populate", "Lio/sentry/SentryEvent;", "Lcom/robinhood/utils/logging/EventMetadata;", "reportNonFatalMechanism", "Lio/sentry/protocol/Mechanism;", "reportLocationMechanism", "toSentryEvent", "", "reportException", "Lcom/robinhood/utils/logging/ReportException;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.logging.CrashReportersKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class CrashReporters {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMetadata(FirebaseCrashlytics firebaseCrashlytics, String str, Object obj) {
        if (obj instanceof Boolean) {
            firebaseCrashlytics.setCustomKey(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            firebaseCrashlytics.setCustomKey(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Float) {
            firebaseCrashlytics.setCustomKey(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            firebaseCrashlytics.setCustomKey(str, ((Number) obj).longValue());
        } else if (obj instanceof String) {
            firebaseCrashlytics.setCustomKey(str, (String) obj);
        } else {
            firebaseCrashlytics.setCustomKey(str, obj.toString());
        }
    }

    private static final void populate(SentryEvent sentryEvent, EventMetadata eventMetadata) {
        sentryEvent.setLevel(SentryLevel.WARNING);
        sentryEvent.setTags(MapsKt.plus(eventMetadata.getTags(), MapsKt.mapOf(Tuples4.m3642to("team", eventMetadata.getTeam().toString()))));
        sentryEvent.setExtras(eventMetadata.getExtras());
    }

    private static final Mechanism reportNonFatalMechanism() {
        Mechanism mechanism = new Mechanism(Thread.currentThread());
        mechanism.setType("CrashReporter.reportNonFatal");
        mechanism.setDescription("Reported by a call to `CrashReporter.reportNonFatal`.");
        mechanism.setHandled(Boolean.TRUE);
        return mechanism;
    }

    private static final Mechanism reportLocationMechanism() {
        Mechanism mechanism = new Mechanism(Thread.currentThread());
        mechanism.setType("ReportLocation");
        mechanism.setDescription("Stack trace of the call to report the event.");
        return mechanism;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SentryEvent toSentryEvent(Throwable th, EventMetadata eventMetadata, CrashReporters5 crashReporters5) {
        SentryOptions options = Sentry.getCurrentHub().getOptions();
        Intrinsics.checkNotNullExpressionValue(options, "getOptions(...)");
        SentryExceptionFactory sentryExceptionFactory = new SentryExceptionFactory(new SentryStackTraceFactory(options));
        List<SentryException> sentryExceptions = sentryExceptionFactory.getSentryExceptions(crashReporters5);
        Intrinsics.checkNotNull(sentryExceptions);
        SentryException sentryException = (SentryException) CollectionsKt.lastOrNull((List) sentryExceptions);
        if (sentryException != null) {
            sentryException.setMechanism(reportLocationMechanism());
        }
        Intrinsics.checkNotNullExpressionValue(sentryExceptions, "apply(...)");
        List<SentryException> sentryExceptions2 = sentryExceptionFactory.getSentryExceptions(th);
        Intrinsics.checkNotNull(sentryExceptions2);
        SentryException sentryException2 = (SentryException) CollectionsKt.lastOrNull((List) sentryExceptions2);
        if (sentryException2 != null) {
            sentryException2.setMechanism(reportNonFatalMechanism());
        }
        Intrinsics.checkNotNullExpressionValue(sentryExceptions2, "apply(...)");
        SentryEvent sentryEvent = new SentryEvent();
        sentryEvent.setExceptions(CollectionsKt.plus((Collection) sentryExceptions, (Iterable) sentryExceptions2));
        populate(sentryEvent, eventMetadata);
        return sentryEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMetadata(FirebaseCrashlytics firebaseCrashlytics, Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            addMetadata(firebaseCrashlytics, entry.getKey(), entry.getValue());
        }
    }
}
