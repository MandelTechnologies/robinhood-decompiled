package io.sentry.util;

import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.hints.ApplyScopeData;
import io.sentry.hints.Backfillable;
import io.sentry.hints.Cached;
import io.sentry.hints.EventDropReason;

/* loaded from: classes21.dex */
public final class HintUtils {

    @FunctionalInterface
    public interface SentryConsumer<T> {
        void accept(T t);
    }

    @FunctionalInterface
    public interface SentryHintFallback {
        void accept(Object obj, Class<?> cls);
    }

    @FunctionalInterface
    /* loaded from: classes14.dex */
    public interface SentryNullableConsumer<T> {
        void accept(T t);
    }

    public static /* synthetic */ void $r8$lambda$OUcjqrtILP5lzF84olFtQrhh_4U(Object obj, Class cls) {
    }

    public static /* synthetic */ void $r8$lambda$wlbHv1m5L5OHoftwZIyw71awROE(Object obj) {
    }

    public static void setIsFromHybridSdk(Hint hint, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            hint.set("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    public static boolean isFromHybridSdk(Hint hint) {
        return Boolean.TRUE.equals(hint.getAs("sentry:isFromHybridSdk", Boolean.class));
    }

    public static void setEventDropReason(Hint hint, EventDropReason eventDropReason) {
        hint.set("sentry:eventDropReason", eventDropReason);
    }

    public static EventDropReason getEventDropReason(Hint hint) {
        return (EventDropReason) hint.getAs("sentry:eventDropReason", EventDropReason.class);
    }

    public static Hint createWithTypeCheckHint(Object obj) {
        Hint hint = new Hint();
        setTypeCheckHint(hint, obj);
        return hint;
    }

    public static void setTypeCheckHint(Hint hint, Object obj) {
        hint.set("sentry:typeCheckHint", obj);
    }

    public static Object getSentrySdkHint(Hint hint) {
        return hint.get("sentry:typeCheckHint");
    }

    public static boolean hasType(Hint hint, Class<?> cls) {
        return cls.isInstance(getSentrySdkHint(hint));
    }

    public static <T> void runIfDoesNotHaveType(Hint hint, Class<T> cls, final SentryNullableConsumer<Object> sentryNullableConsumer) {
        runIfHasType(hint, cls, new SentryConsumer() { // from class: io.sentry.util.HintUtils$$ExternalSyntheticLambda2
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                HintUtils.$r8$lambda$wlbHv1m5L5OHoftwZIyw71awROE(obj);
            }
        }, new SentryHintFallback() { // from class: io.sentry.util.HintUtils$$ExternalSyntheticLambda3
            @Override // io.sentry.util.HintUtils.SentryHintFallback
            public final void accept(Object obj, Class cls2) {
                sentryNullableConsumer.accept(obj);
            }
        });
    }

    public static <T> void runIfHasType(Hint hint, Class<T> cls, SentryConsumer<T> sentryConsumer) {
        runIfHasType(hint, cls, sentryConsumer, new SentryHintFallback() { // from class: io.sentry.util.HintUtils$$ExternalSyntheticLambda0
            @Override // io.sentry.util.HintUtils.SentryHintFallback
            public final void accept(Object obj, Class cls2) {
                HintUtils.$r8$lambda$OUcjqrtILP5lzF84olFtQrhh_4U(obj, cls2);
            }
        });
    }

    public static <T> void runIfHasTypeLogIfNot(Hint hint, Class<T> cls, final ILogger iLogger, SentryConsumer<T> sentryConsumer) {
        runIfHasType(hint, cls, sentryConsumer, new SentryHintFallback() { // from class: io.sentry.util.HintUtils$$ExternalSyntheticLambda1
            @Override // io.sentry.util.HintUtils.SentryHintFallback
            public final void accept(Object obj, Class cls2) {
                LogUtils.logNotInstanceOf(cls2, obj, iLogger);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void runIfHasType(Hint hint, Class<T> cls, SentryConsumer<T> sentryConsumer, SentryHintFallback sentryHintFallback) {
        Object sentrySdkHint = getSentrySdkHint(hint);
        if (hasType(hint, cls) && sentrySdkHint != null) {
            sentryConsumer.accept(sentrySdkHint);
        } else {
            sentryHintFallback.accept(sentrySdkHint, cls);
        }
    }

    public static boolean shouldApplyScopeData(Hint hint) {
        return !(hasType(hint, Cached.class) || hasType(hint, Backfillable.class)) || hasType(hint, ApplyScopeData.class);
    }
}
