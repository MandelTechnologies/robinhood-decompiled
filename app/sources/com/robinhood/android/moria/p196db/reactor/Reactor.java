package com.robinhood.android.moria.p196db.reactor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Reactor.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/moria/db/reactor/Reactor;", "P", "", "onSubscriptionAdded", "", "params", "(Ljava/lang/Object;)V", "onSubscriptionRemoved", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface Reactor<P> {

    /* compiled from: Reactor.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static <P> void onSubscriptionAdded(Reactor<? super P> reactor, P params) {
            Intrinsics.checkNotNullParameter(params, "params");
        }

        public static <P> void onSubscriptionRemoved(Reactor<? super P> reactor, P params) {
            Intrinsics.checkNotNullParameter(params, "params");
        }
    }

    void onSubscriptionAdded(P params);

    void onSubscriptionRemoved(P params);
}
