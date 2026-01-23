package com.robinhood.android.moria.network;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: Endpoint.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000 #*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001#J\u0018\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H¦@¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H¦@¢\u0006\u0004\b\r\u0010\fJS\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012Ji\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H&¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00162*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cR6\u0010\u001f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR8\u0010\"\u001a&\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/moria/network/Endpoint;", "P", "", "T", "params", ResourceTypes.RAW, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "saveAction", "forceFetch", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetch", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "poll", "(Ljava/lang/Object;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "pollWithDynamicParams", "(Lkotlin/jvm/functions/Function1;Lj$/time/Duration;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refresh", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", "markAllParamsAsStale", "()V", "getDefaultSaveAction", "()Lkotlin/jvm/functions/Function3;", "defaultSaveAction", "", "getStaleDecider", "staleDecider", "Companion", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface Endpoint<P, T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object fetch(P p, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super T> continuation);

    Object forceFetch(P p, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super T> continuation);

    Function3<P, T, Continuation<? super Unit>, Object> getDefaultSaveAction();

    Function3<Long, P, Continuation<? super Boolean>, Object> getStaleDecider();

    void markAllParamsAsStale();

    Flow<T> poll(P params, Duration duration, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction);

    Flow<T> pollWithDynamicParams(Function1<? super Continuation<? super P>, ? extends Object> params, Duration duration, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction);

    Object raw(P p, Continuation<? super T> continuation);

    Job refresh(P params, boolean force, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> saveAction);

    /* compiled from: Endpoint.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object forceFetch$default(Endpoint endpoint, Object obj, Function3 function3, Continuation continuation, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceFetch");
            }
            if ((i & 2) != 0) {
                function3 = endpoint.getDefaultSaveAction();
            }
            return endpoint.forceFetch(obj, function3, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetch$default(Endpoint endpoint, Object obj, Function3 function3, Continuation continuation, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i & 2) != 0) {
                function3 = endpoint.getDefaultSaveAction();
            }
            return endpoint.fetch(obj, function3, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow poll$default(Endpoint endpoint, Object obj, Duration duration, Function3 function3, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: poll");
            }
            if ((i & 2) != 0) {
                duration = Duration.ofSeconds(5L);
            }
            if ((i & 4) != 0) {
                function3 = endpoint.getDefaultSaveAction();
            }
            return endpoint.poll(obj, duration, function3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow pollWithDynamicParams$default(Endpoint endpoint, Function1 function1, Duration duration, Function3 function3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pollWithDynamicParams");
            }
            if ((i & 2) != 0) {
                duration = Duration.ofSeconds(5L);
            }
            if ((i & 4) != 0) {
                function3 = endpoint.getDefaultSaveAction();
            }
            return endpoint.pollWithDynamicParams(function1, duration, function3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Job refresh$default(Endpoint endpoint, Object obj, boolean z, Function3 function3, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refresh");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                function3 = endpoint.getDefaultSaveAction();
            }
            return endpoint.refresh(obj, z, function3);
        }
    }

    /* compiled from: Endpoint.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009d\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0013\"\b\b\u0002\u0010\u0004*\u00020\u0001\"\b\b\u0003\u0010\u0005*\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0014\u0010\u0015J£\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0013\"\b\b\u0002\u0010\u0004*\u00020\u0001\"\b\b\u0003\u0010\u0005*\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\n\u001a\u00020\t2(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0017\u0010\u0018J·\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0013\"\b\b\u0002\u0010\u0004*\u00020\u0001\"\b\b\u0003\u0010\u0005*\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\n\u001a\u00020\t2(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162*\u0010\u0012\u001a&\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00162\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/moria/network/Endpoint$Companion;", "", "<init>", "()V", "P", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "networkCall", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "", "defaultSaveAction", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlin/Function1;", "", "", "staleDecider", "Lcom/robinhood/android/moria/network/Endpoint;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/LogoutKillswitch;Lkotlin/jvm/functions/Function2;Lj$/time/Clock;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Function3;", "createWithParams", "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/LogoutKillswitch;Lkotlin/jvm/functions/Function3;Lj$/time/Clock;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/android/moria/network/Endpoint;", "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/LogoutKillswitch;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lj$/time/Clock;)Lcom/robinhood/android/moria/network/Endpoint;", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ Endpoint create$default(Companion companion, Function2 function2, LogoutKillswitch logoutKillswitch, Function2 function22, Clock clock, Function1 function1, int i, Object obj) {
            if ((i & 16) != 0) {
                Duration durationOfSeconds = Duration.ofSeconds(5L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                function1 = new DefaultStaleDecider(durationOfSeconds, clock);
            }
            return companion.create(function2, logoutKillswitch, function22, clock, function1);
        }

        public final <P, T> Endpoint<P, T> create(Function2<? super P, ? super Continuation<? super T>, ? extends Object> networkCall, LogoutKillswitch logoutKillswitch, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction, Clock clock, Function1<? super Long, Boolean> staleDecider) {
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
            return new Endpoint2(networkCall, logoutKillswitch, new Endpoint5(defaultSaveAction, null), clock, new Endpoint6(staleDecider, null));
        }

        public static /* synthetic */ Endpoint createWithParams$default(Companion companion, Function2 function2, LogoutKillswitch logoutKillswitch, Function3 function3, Clock clock, Function1 function1, int i, Object obj) {
            if ((i & 16) != 0) {
                Duration durationOfSeconds = Duration.ofSeconds(5L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                function1 = new DefaultStaleDecider(durationOfSeconds, clock);
            }
            return companion.createWithParams(function2, logoutKillswitch, function3, clock, (Function1<? super Long, Boolean>) function1);
        }

        public final <P, T> Endpoint<P, T> createWithParams(Function2<? super P, ? super Continuation<? super T>, ? extends Object> networkCall, LogoutKillswitch logoutKillswitch, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction, Clock clock, Function1<? super Long, Boolean> staleDecider) {
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
            return new Endpoint2(networkCall, logoutKillswitch, defaultSaveAction, clock, new Endpoint7(staleDecider, null));
        }

        public final <P, T> Endpoint<P, T> createWithParams(Function2<? super P, ? super Continuation<? super T>, ? extends Object> networkCall, LogoutKillswitch logoutKillswitch, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction, Function3<? super Long, ? super P, ? super Continuation<? super Boolean>, ? extends Object> staleDecider, Clock clock) {
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new Endpoint2(networkCall, logoutKillswitch, defaultSaveAction, clock, staleDecider);
        }
    }
}
