package com.robinhood.android.moria.p196db;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.moria.p196db.reactor.Reactor;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Query.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001\u000bJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0006\u001a\u00028\u0000H'¢\u0006\u0002\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/moria/db/Query;", "P", "", "T", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "params", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "asObservable", "Lio/reactivex/Observable;", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "Companion", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface Query<P, T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Flow<T> asFlow(P params);

    @Deprecated
    Observable<T> asObservable(P params);

    /* compiled from: Query.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0089\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\".\b\u0002\u0010\b*\u0016\u0012\u0004\u0012\u0002H\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\n0\t*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\n0\u000b\"\b\b\u0003\u0010\u0006*\u00020\u0001\"\b\b\u0004\u0010\u0007*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00100\u000f2\u0006\u0010\u0011\u001a\u0002H\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014Jp\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0001\"\b\b\u0003\u0010\u0007*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00100\u000f2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u0002H\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\n0\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013Jv\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00180\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0001\"\b\b\u0003\u0010\u0007*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00100\u000f2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u0002H\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\n0\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/moria/db/Query$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/moria/db/Query;", "P", "T", "F", "Lkotlin/Function1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/reflect/KCallable;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "reactors", "", "Lcom/robinhood/android/moria/db/reactor/Reactor;", "function", "enableDebugLogging", "", "(Lcom/robinhood/coroutines/rx/RxFactory;Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)Lcom/robinhood/android/moria/db/Query;", "name", "", "createOptional", "Lcom/robinhood/utils/Optional;", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ Query create$default(Companion companion, RxFactory rxFactory, List list, Function1 function1, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.create(rxFactory, list, function1, z);
        }

        /* JADX WARN: Incorrect types in method signature: <F::Lkotlin/jvm/functions/Function1<-TP;+Lkotlinx/coroutines/flow/Flow<+TT;>;>;:Lkotlin/reflect/KCallable<+Lkotlinx/coroutines/flow/Flow<+TT;>;>;P:Ljava/lang/Object;T:Ljava/lang/Object;>(Lcom/robinhood/coroutines/rx/RxFactory;Ljava/util/List<+Lcom/robinhood/android/moria/db/reactor/Reactor<-TP;>;>;TF;Z)Lcom/robinhood/android/moria/db/Query<TP;TT;>; */
        public final Query create(RxFactory rxFactory, List reactors, Function1 function, boolean enableDebugLogging) {
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(reactors, "reactors");
            Intrinsics.checkNotNullParameter(function, "function");
            return create(rxFactory, ((KCallable) function).getName(), reactors, function, enableDebugLogging);
        }

        public static /* synthetic */ Query create$default(Companion companion, RxFactory rxFactory, String str, List list, Function1 function1, boolean z, int i, Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            return companion.create(rxFactory, str, list, function1, z);
        }

        public final <P, T> Query<P, T> create(RxFactory rxFactory, String name, List<? extends Reactor<? super P>> reactors, Function1<? super P, ? extends Flow<? extends T>> function, boolean enableDebugLogging) {
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(reactors, "reactors");
            Intrinsics.checkNotNullParameter(function, "function");
            return new BaseQuery(rxFactory, name, reactors, enableDebugLogging, function, Query$Companion$create$1.INSTANCE);
        }

        public static /* synthetic */ Query createOptional$default(Companion companion, RxFactory rxFactory, String str, List list, Function1 function1, boolean z, int i, Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            return companion.createOptional(rxFactory, str, list, function1, z);
        }

        public final <P, T> Query<P, Optional<T>> createOptional(RxFactory rxFactory, String name, List<? extends Reactor<? super P>> reactors, Function1<? super P, ? extends Flow<? extends T>> function, boolean enableDebugLogging) {
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(reactors, "reactors");
            Intrinsics.checkNotNullParameter(function, "function");
            return new BaseQuery(rxFactory, name, reactors, enableDebugLogging, function, Query$Companion$createOptional$1.INSTANCE);
        }
    }
}
