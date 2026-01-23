package io.sentry.cache;

import io.sentry.Breadcrumb;
import io.sentry.IScope;
import io.sentry.JsonDeserializer;
import io.sentry.ScopeObserverAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.User;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes21.dex */
public final class PersistingScopeObserver extends ScopeObserverAdapter {
    private final SentryOptions options;

    public PersistingScopeObserver(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // io.sentry.IScopeObserver
    public void setUser(final User user) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PersistingScopeObserver.m28541$r8$lambda$NgwLYIrtvpAAHcyqT5l_j94YiI(this.f$0, user);
            }
        });
    }

    /* renamed from: $r8$lambda$NgwLYIrtvpA-AHcyqT5l_j94YiI, reason: not valid java name */
    public static /* synthetic */ void m28541$r8$lambda$NgwLYIrtvpAAHcyqT5l_j94YiI(PersistingScopeObserver persistingScopeObserver, User user) {
        if (user == null) {
            persistingScopeObserver.delete("user.json");
        } else {
            persistingScopeObserver.store(user, "user.json");
        }
    }

    @Override // io.sentry.IScopeObserver
    public void setBreadcrumbs(final Collection<Breadcrumb> collection) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.store(collection, "breadcrumbs.json");
            }
        });
    }

    @Override // io.sentry.IScopeObserver
    public void setTags(final Map<String, String> map) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.store(map, "tags.json");
            }
        });
    }

    @Override // io.sentry.IScopeObserver
    public void setTransaction(final String str) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                PersistingScopeObserver.m28540$r8$lambda$J5rxAaTAluXqEXCAJmCotuWKd0(this.f$0, str);
            }
        });
    }

    /* renamed from: $r8$lambda$J5rxAaTAluXqEXCAJmCotuWK-d0, reason: not valid java name */
    public static /* synthetic */ void m28540$r8$lambda$J5rxAaTAluXqEXCAJmCotuWKd0(PersistingScopeObserver persistingScopeObserver, String str) {
        if (str == null) {
            persistingScopeObserver.delete("transaction.json");
        } else {
            persistingScopeObserver.store(str, "transaction.json");
        }
    }

    @Override // io.sentry.IScopeObserver
    public void setTrace(final SpanContext spanContext, final IScope iScope) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                PersistingScopeObserver.m28539$r8$lambda$DL9oIlLBAUTYM3AnjJEmm2HP6Q(this.f$0, spanContext, iScope);
            }
        });
    }

    /* renamed from: $r8$lambda$DL9oIlLBAUTYM3AnjJEmm2HP6-Q, reason: not valid java name */
    public static /* synthetic */ void m28539$r8$lambda$DL9oIlLBAUTYM3AnjJEmm2HP6Q(PersistingScopeObserver persistingScopeObserver, SpanContext spanContext, IScope iScope) {
        if (spanContext != null) {
            persistingScopeObserver.store(spanContext, "trace.json");
        } else {
            persistingScopeObserver.getClass();
            persistingScopeObserver.store(iScope.getPropagationContext().toSpanContext(), "trace.json");
        }
    }

    @Override // io.sentry.IScopeObserver
    public void setContexts(final Contexts contexts) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.store(contexts, "contexts.json");
            }
        });
    }

    private void serializeToDisk(final Runnable runnable) {
        try {
            this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    PersistingScopeObserver.$r8$lambda$AO1PZL1KZyc0RmgJytBIHQ2ZX4Y(this.f$0, runnable);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Serialization task could not be scheduled", th);
        }
    }

    public static /* synthetic */ void $r8$lambda$AO1PZL1KZyc0RmgJytBIHQ2ZX4Y(PersistingScopeObserver persistingScopeObserver, Runnable runnable) {
        persistingScopeObserver.getClass();
        try {
            runnable.run();
        } catch (Throwable th) {
            persistingScopeObserver.options.getLogger().log(SentryLevel.ERROR, "Serialization task failed", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void store(T t, String str) {
        store(this.options, t, str);
    }

    private void delete(String str) {
        CacheUtils.delete(this.options, ".scope-cache", str);
    }

    public static <T> void store(SentryOptions sentryOptions, T t, String str) {
        CacheUtils.store(sentryOptions, t, ".scope-cache", str);
    }

    public static <T> T read(SentryOptions sentryOptions, String str, Class<T> cls) {
        return (T) read(sentryOptions, str, cls, null);
    }

    public static <T, R> T read(SentryOptions sentryOptions, String str, Class<T> cls, JsonDeserializer<R> jsonDeserializer) {
        return (T) CacheUtils.read(sentryOptions, ".scope-cache", str, cls, jsonDeserializer);
    }
}
