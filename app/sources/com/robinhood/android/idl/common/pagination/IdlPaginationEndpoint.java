package com.robinhood.android.idl.common.pagination;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.idl.Dto3;
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

/* compiled from: IdlPaginationEndpoint.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001\u0019J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\bJ-\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\u0018\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014\u0012\u0004\u0012\u00028\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "P", "", "T", "params", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;", "fetchAllPages", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "forceFetchAllPages", "j$/time/Duration", "duration", "pollAllPages", "(Ljava/lang/Object;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "", "force", "Lkotlinx/coroutines/Job;", "refreshAllPages", "(Ljava/lang/Object;Z)Lkotlinx/coroutines/Job;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "getEndpoint", "()Lcom/robinhood/android/moria/network/Endpoint;", "endpoint", "Companion", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.idl.common.pagination.IdlPaginatedEndpoint, reason: use source file name */
/* loaded from: classes10.dex */
public interface IdlPaginationEndpoint<P, T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Flow<IdlPaginatedResult<T>> fetchAllPages(P params);

    Flow<IdlPaginatedResult<T>> forceFetchAllPages(P params);

    Endpoint<Tuples2<P, IdlPaginationCursor>, T> getEndpoint();

    Flow<IdlPaginatedResult<T>> pollAllPages(P params, Duration duration);

    Job refreshAllPages(P params, boolean force);

    /* compiled from: IdlPaginationEndpoint.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.idl.common.pagination.IdlPaginatedEndpoint$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ Flow pollAllPages$default(IdlPaginationEndpoint idlPaginationEndpoint, Object obj, Duration duration, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pollAllPages");
            }
            if ((i & 2) != 0) {
                duration = Duration.ofSeconds(5L);
            }
            return idlPaginationEndpoint.pollAllPages(obj, duration);
        }

        public static /* synthetic */ Job refreshAllPages$default(IdlPaginationEndpoint idlPaginationEndpoint, Object obj, boolean z, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshAllPages");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return idlPaginationEndpoint.refreshAllPages(obj, z);
        }
    }

    /* compiled from: IdlPaginationEndpoint.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jë\u0001\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0019\"\u0004\b\u0002\u0010\u0004\"\f\b\u0003\u0010\u0006*\u0006\u0012\u0002\b\u00030\u000520\u0010\u000b\u001a,\b\u0001\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\fj\b\u0012\u0004\u0012\u00028\u0003`\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\fj\b\u0012\u0004\u0012\u00028\u0003`\r2\u0006\u0010\u0011\u001a\u00020\u00102\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0097\u0001\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0019\"\u0004\b\u0002\u0010\u0004\"\f\b\u0003\u0010\u0006*\u0006\u0012\u0002\b\u00030\u00052\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\fj\b\u0012\u0004\u0012\u00028\u0003`\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\fj\b\u0012\u0004\u0012\u00028\u0003`\r2 \u0010\u001d\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0004\u0012\u00028\u00030\u001c2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001eJÿ\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0019\"\u0004\b\u0002\u0010\u0004\"\f\b\u0003\u0010\u0006*\u0006\u0012\u0002\b\u00030\u000520\u0010\u000b\u001a,\b\u0001\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\fj\b\u0012\u0004\u0012\u00028\u0003`\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\fj\b\u0012\u0004\u0012\u00028\u0003`\r2\u0006\u0010\u0011\u001a\u00020\u001026\u0010\u0013\u001a2\b\u0001\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0004\b \u0010!¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint$Companion;", "", "<init>", "()V", "P", "Lcom/robinhood/idl/MessageDto;", "T", "Lkotlin/Function2;", "Lkotlin/Pair;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "Lkotlin/coroutines/Continuation;", "networkCall", "Lkotlin/Function1;", "Lcom/robinhood/android/idl/common/pagination/CursorMapping;", "previousMapping", "nextMapping", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "", "defaultSaveAction", "j$/time/Clock", Card.Icon.CLOCK, "", "", "staleDecider", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/utils/LogoutKillswitch;Lkotlin/jvm/functions/Function2;Lj$/time/Clock;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "Lcom/robinhood/android/moria/network/Endpoint;", "endpoint", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/moria/network/Endpoint;Lcom/robinhood/utils/LogoutKillswitch;)Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "Lkotlin/Function3;", "createWithParams", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/utils/LogoutKillswitch;Lkotlin/jvm/functions/Function3;Lj$/time/Clock;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.idl.common.pagination.IdlPaginatedEndpoint$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ IdlPaginationEndpoint create$default(Companion companion, Function2 function2, Function1 function1, Function1 function12, LogoutKillswitch logoutKillswitch, Function2 function22, Clock clock, Function1 function13, int i, Object obj) {
            Clock clock2;
            Function1 defaultStaleDecider;
            if ((i & 64) != 0) {
                Duration durationOfSeconds = Duration.ofSeconds(5L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                clock2 = clock;
                defaultStaleDecider = new DefaultStaleDecider(durationOfSeconds, clock2);
            } else {
                clock2 = clock;
                defaultStaleDecider = function13;
            }
            return companion.create(function2, function1, function12, logoutKillswitch, function22, clock2, defaultStaleDecider);
        }

        public final <P, T extends Dto3<?>> IdlPaginationEndpoint<P, T> create(Function2<? super Tuples2<? extends P, IdlPaginationCursor>, ? super Continuation<? super T>, ? extends Object> networkCall, Function1<? super T, IdlPaginationCursor> previousMapping, Function1<? super T, IdlPaginationCursor> nextMapping, LogoutKillswitch logoutKillswitch, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction, Clock clock, Function1<? super Long, Boolean> staleDecider) {
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(previousMapping, "previousMapping");
            Intrinsics.checkNotNullParameter(nextMapping, "nextMapping");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
            return new IdlPaginationEndpoint3(previousMapping, nextMapping, logoutKillswitch, Endpoint.INSTANCE.create(networkCall, logoutKillswitch, defaultSaveAction, clock, staleDecider));
        }

        public final <P, T extends Dto3<?>> IdlPaginationEndpoint<P, T> create(Function1<? super T, IdlPaginationCursor> previousMapping, Function1<? super T, IdlPaginationCursor> nextMapping, Endpoint<Tuples2<P, IdlPaginationCursor>, T> endpoint, LogoutKillswitch logoutKillswitch) {
            Intrinsics.checkNotNullParameter(previousMapping, "previousMapping");
            Intrinsics.checkNotNullParameter(nextMapping, "nextMapping");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            return new IdlPaginationEndpoint3(previousMapping, nextMapping, logoutKillswitch, endpoint);
        }

        public static /* synthetic */ IdlPaginationEndpoint createWithParams$default(Companion companion, Function2 function2, Function1 function1, Function1 function12, LogoutKillswitch logoutKillswitch, Function3 function3, Clock clock, Function1 function13, int i, Object obj) {
            Clock clock2;
            Function1 defaultStaleDecider;
            if ((i & 64) != 0) {
                Duration durationOfSeconds = Duration.ofSeconds(5L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                clock2 = clock;
                defaultStaleDecider = new DefaultStaleDecider(durationOfSeconds, clock2);
            } else {
                clock2 = clock;
                defaultStaleDecider = function13;
            }
            return companion.createWithParams(function2, function1, function12, logoutKillswitch, function3, clock2, defaultStaleDecider);
        }

        public final <P, T extends Dto3<?>> IdlPaginationEndpoint<P, T> createWithParams(Function2<? super Tuples2<? extends P, IdlPaginationCursor>, ? super Continuation<? super T>, ? extends Object> networkCall, Function1<? super T, IdlPaginationCursor> previousMapping, Function1<? super T, IdlPaginationCursor> nextMapping, LogoutKillswitch logoutKillswitch, Function3<? super Tuples2<? extends P, IdlPaginationCursor>, ? super T, ? super Continuation<? super Unit>, ? extends Object> defaultSaveAction, Clock clock, Function1<? super Long, Boolean> staleDecider) {
            Intrinsics.checkNotNullParameter(networkCall, "networkCall");
            Intrinsics.checkNotNullParameter(previousMapping, "previousMapping");
            Intrinsics.checkNotNullParameter(nextMapping, "nextMapping");
            Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
            Intrinsics.checkNotNullParameter(defaultSaveAction, "defaultSaveAction");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
            return new IdlPaginationEndpoint3(previousMapping, nextMapping, logoutKillswitch, Endpoint.INSTANCE.createWithParams(networkCall, logoutKillswitch, defaultSaveAction, clock, staleDecider));
        }
    }
}
