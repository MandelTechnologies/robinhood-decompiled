package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.LogoutKillswitch;
import kotlin.Metadata;
import kotlin.Tuples2;
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

/* compiled from: PaginatedEndpoint.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0019J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\bJ-\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012R4\u0010\u0018\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/api/PaginatedEndpoint;", "P", "T", "", "params", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/PaginatedResult;", "fetchAllPages", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "forceFetchAllPages", "j$/time/Duration", "duration", "pollAllPages", "(Ljava/lang/Object;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refreshAllPages", "(Ljava/lang/Object;Z)Lkotlinx/coroutines/Job;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Lcom/robinhood/models/PaginationCursor;", "getEndpoint", "()Lcom/robinhood/android/moria/network/Endpoint;", "endpoint", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface PaginatedEndpoint<P, T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Flow<PaginatedResult<T>> fetchAllPages(P params);

    Flow<PaginatedResult<T>> forceFetchAllPages(P params);

    Endpoint<Tuples2<P, PaginationCursor>, PaginatedResult<T>> getEndpoint();

    Flow<PaginatedResult<T>> pollAllPages(P params, Duration duration);

    Job refreshAllPages(P params, boolean force);

    /* compiled from: PaginatedEndpoint.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Flow pollAllPages$default(PaginatedEndpoint paginatedEndpoint, Object obj, Duration duration, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pollAllPages");
            }
            if ((i & 2) != 0) {
                duration = Duration.ofSeconds(5L);
            }
            return paginatedEndpoint.pollAllPages(obj, duration);
        }

        public static /* synthetic */ Job refreshAllPages$default(PaginatedEndpoint paginatedEndpoint, Object obj, boolean z, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshAllPages");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return paginatedEndpoint.refreshAllPages(obj, z);
        }
    }

    /* compiled from: PaginatedEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001c\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¯\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0016\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u000526\u0010\u000b\u001a2\b\u0001\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\r\u001a\u00020\f2(\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0017\u0010\u0018JU\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0016\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0006\u0010\r\u001a\u00020\f2&\u0010\u001a\u001a\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\u0019¢\u0006\u0004\b\u0017\u0010\u001bJÃ\u0001\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0016\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u000526\u0010\u000b\u001a2\b\u0001\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\r\u001a\u00020\f2<\u0010\u000f\u001a8\b\u0001\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u001d\u0010\u001eJÃ\u0001\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0004\u0012\u00028\u00030\u0016\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0006\u0010 \u001a\u00020\u001f2<\u0010\u000b\u001a8\b\u0001\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\r\u001a\u00020\f2(\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\"\u0010#Ji\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0004\u0012\u00028\u00030\u0016\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2,\u0010\u001a\u001a(\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\u0019¢\u0006\u0004\b\"\u0010$J×\u0001\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0004\u0012\u00028\u00030\u0016\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0006\u0010%\u001a\u00020\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u001f0\u00122<\u0010\u000b\u001a8\b\u0001\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\r\u001a\u00020\f2(\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/api/PaginatedEndpoint$Companion;", "", "<init>", "()V", "P", "T", "Lkotlin/Function2;", "Lkotlin/Pair;", "Lcom/robinhood/models/PaginationCursor;", "Lkotlin/coroutines/Continuation;", "Lcom/robinhood/models/PaginatedResult;", "networkCall", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "", "defaultSaveAction", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlin/Function1;", "", "", "staleDecider", "Lcom/robinhood/api/PaginatedEndpoint;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/LogoutKillswitch;Lkotlin/jvm/functions/Function2;Lj$/time/Clock;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/android/moria/network/Endpoint;", "endpoint", "(Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/android/moria/network/Endpoint;)Lcom/robinhood/api/PaginatedEndpoint;", "Lkotlin/Function3;", "createWithParams", "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/LogoutKillswitch;Lkotlin/jvm/functions/Function3;Lj$/time/Clock;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/api/PaginatedEndpoint;", "", "batchSize", "", "createBatched", "(ILkotlin/jvm/functions/Function2;Lcom/robinhood/utils/LogoutKillswitch;Lkotlin/jvm/functions/Function2;Lj$/time/Clock;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/api/PaginatedEndpoint;", "(ILcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/android/moria/network/Endpoint;)Lcom/robinhood/api/PaginatedEndpoint;", "maxWeightPerBatch", "weight", "createWeightedBatched", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/robinhood/utils/LogoutKillswitch;Lkotlin/jvm/functions/Function2;Lj$/time/Clock;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/api/PaginatedEndpoint;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PaginatedEndpoint create$default(Companion companion, Function2 function2, LogoutKillswitch logoutKillswitch, Function2 function22, Clock clock, Function1 function1, int i, Object obj) {
            if ((i & 16) != 0) {
                Duration durationOfSeconds = Duration.ofSeconds(5L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                function1 = new DefaultStaleDecider(durationOfSeconds, clock);
            }
            return companion.create(function2, logoutKillswitch, function22, clock, function1);
        }

        public final <P, T> PaginatedEndpoint<P, T> create(Function2<? super Tuples2<? extends P, PaginationCursor>, ? super Continuation<? super PaginatedResult<? extends T>>, ? extends Object> networkCall, LogoutKillswitch logoutKillswitch, Function2<? super PaginatedResult<? extends T>, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction, Clock clock, Function1<? super Long, Boolean> staleDecider) {
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
            return new RealPaginatedEndpoint(logoutKillswitch, Endpoint.INSTANCE.create(networkCall, logoutKillswitch, defaultSaveAction, clock, staleDecider));
        }

        public final <P, T> PaginatedEndpoint<P, T> create(LogoutKillswitch logoutKillswitch, Endpoint<Tuples2<P, PaginationCursor>, PaginatedResult<T>> endpoint) {
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            return new RealPaginatedEndpoint(logoutKillswitch, endpoint);
        }

        public static /* synthetic */ PaginatedEndpoint createWithParams$default(Companion companion, Function2 function2, LogoutKillswitch logoutKillswitch, Function3 function3, Clock clock, Function1 function1, int i, Object obj) {
            if ((i & 16) != 0) {
                Duration durationOfSeconds = Duration.ofSeconds(5L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                function1 = new DefaultStaleDecider(durationOfSeconds, clock);
            }
            return companion.createWithParams(function2, logoutKillswitch, function3, clock, function1);
        }

        public final <P, T> PaginatedEndpoint<P, T> createWithParams(Function2<? super Tuples2<? extends P, PaginationCursor>, ? super Continuation<? super PaginatedResult<? extends T>>, ? extends Object> networkCall, LogoutKillswitch logoutKillswitch, Function3<? super Tuples2<? extends P, PaginationCursor>, ? super PaginatedResult<? extends T>, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction, Clock clock, Function1<? super Long, Boolean> staleDecider) {
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
            return new RealPaginatedEndpoint(logoutKillswitch, Endpoint.INSTANCE.createWithParams(networkCall, logoutKillswitch, defaultSaveAction, clock, staleDecider));
        }

        public static /* synthetic */ PaginatedEndpoint createBatched$default(Companion companion, int i, Function2 function2, LogoutKillswitch logoutKillswitch, Function2 function22, Clock clock, Function1 function1, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                Duration durationOfSeconds = Duration.ofSeconds(5L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                function1 = new DefaultStaleDecider(durationOfSeconds, clock);
            }
            return companion.createBatched(i, function2, logoutKillswitch, function22, clock, function1);
        }

        public final <P, T> PaginatedEndpoint<Iterable<P>, T> createBatched(int batchSize, Function2<? super Tuples2<? extends Iterable<? extends P>, PaginationCursor>, ? super Continuation<? super PaginatedResult<? extends T>>, ? extends Object> networkCall, LogoutKillswitch logoutKillswitch, Function2<? super PaginatedResult<? extends T>, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction, Clock clock, Function1<? super Long, Boolean> staleDecider) {
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
            return new BatchedPaginatedEndpoint(batchSize, logoutKillswitch, Endpoint.INSTANCE.create(networkCall, logoutKillswitch, defaultSaveAction, clock, staleDecider));
        }

        public final <P, T> PaginatedEndpoint<Iterable<P>, T> createBatched(int batchSize, LogoutKillswitch logoutKillswitch, Endpoint<Tuples2<Iterable<P>, PaginationCursor>, PaginatedResult<T>> endpoint) {
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            return new BatchedPaginatedEndpoint(batchSize, logoutKillswitch, endpoint);
        }

        public static /* synthetic */ PaginatedEndpoint createWeightedBatched$default(Companion companion, int i, Function1 function1, Function2 function2, LogoutKillswitch logoutKillswitch, Function2 function22, Clock clock, Function1 function12, int i2, Object obj) {
            Clock clock2;
            Function1 defaultStaleDecider;
            if ((i2 & 64) != 0) {
                Duration durationOfSeconds = Duration.ofSeconds(5L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                clock2 = clock;
                defaultStaleDecider = new DefaultStaleDecider(durationOfSeconds, clock2);
            } else {
                clock2 = clock;
                defaultStaleDecider = function12;
            }
            return companion.createWeightedBatched(i, function1, function2, logoutKillswitch, function22, clock2, defaultStaleDecider);
        }

        public final <P, T> PaginatedEndpoint<Iterable<P>, T> createWeightedBatched(int maxWeightPerBatch, Function1<? super P, Integer> weight, Function2<? super Tuples2<? extends Iterable<? extends P>, PaginationCursor>, ? super Continuation<? super PaginatedResult<? extends T>>, ? extends Object> networkCall, LogoutKillswitch logoutKillswitch, Function2<? super PaginatedResult<? extends T>, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction, Clock clock, Function1<? super Long, Boolean> staleDecider) {
            Intrinsics.checkNotNullParameter(weight, "weight");
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
            return new WeightedBatchedPaginatedEndpoint(maxWeightPerBatch, weight, logoutKillswitch, Endpoint.INSTANCE.create(networkCall, logoutKillswitch, defaultSaveAction, clock, staleDecider));
        }
    }
}
