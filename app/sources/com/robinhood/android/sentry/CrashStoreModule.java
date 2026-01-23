package com.robinhood.android.sentry;

import io.sentry.Integration;
import io.sentry.Sentry;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: CrashStoreModule.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/sentry/CrashStoreModule;", "", "<init>", "()V", "provideCrashStore", "Lcom/robinhood/android/sentry/CrashStore;", "lib-sentry_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class CrashStoreModule {
    public static final CrashStoreModule INSTANCE = new CrashStoreModule();

    private CrashStoreModule() {
    }

    public final CrashStore provideCrashStore() {
        List<Integration> integrations = Sentry.getCurrentHub().getOptions().getIntegrations();
        Intrinsics.checkNotNullExpressionValue(integrations, "getIntegrations(...)");
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(integrations), new Function1<Object, Boolean>() { // from class: com.robinhood.android.sentry.CrashStoreModule$provideCrashStore$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof CrashStore);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return (CrashStore) SequencesKt.first(sequenceFilter);
    }
}
