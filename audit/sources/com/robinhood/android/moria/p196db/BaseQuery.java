package com.robinhood.android.moria.p196db;

import com.robinhood.android.moria.p196db.reactor.Reactor;
import com.robinhood.coroutines.p287rx.RxFactory;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Query.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00040\u0005Bx\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00110\u0010\u0012%\u0010\u0012\u001a!\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00110\u0010¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u00112\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00020 2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u0012\u001a!\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00110\u0010¢\u0006\u0002\b\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/moria/db/BaseQuery;", "P", "", "T", "R", "Lcom/robinhood/android/moria/db/Query;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "name", "", "reactors", "", "Lcom/robinhood/android/moria/db/reactor/Reactor;", "enableDebugLogging", "", "runQuery", "Lkotlin/Function1;", "Lkotlinx/coroutines/flow/Flow;", "queryTransform", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lcom/robinhood/coroutines/rx/RxFactory;Ljava/lang/String;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getName", "()Ljava/lang/String;", "activeSubscriptions", "Lcom/robinhood/android/moria/db/ActiveSubscriptions;", "getActiveSubscriptions", "()Lcom/robinhood/android/moria/db/ActiveSubscriptions;", "asFlow", "params", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "asObservable", "Lio/reactivex/Observable;", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class BaseQuery<P, T, R> implements Query<P, R> {
    private final ActiveSubscriptions<P> activeSubscriptions;
    private final boolean enableDebugLogging;
    private final String name;
    private final Function1<Flow<? extends T>, Flow<R>> queryTransform;
    private final Function1<P, Flow<T>> runQuery;
    private final RxFactory rxFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseQuery(RxFactory rxFactory, String name, List<? extends Reactor<? super P>> reactors, boolean z, Function1<? super P, ? extends Flow<? extends T>> runQuery, Function1<? super Flow<? extends T>, ? extends Flow<? extends R>> queryTransform) {
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactors, "reactors");
        Intrinsics.checkNotNullParameter(runQuery, "runQuery");
        Intrinsics.checkNotNullParameter(queryTransform, "queryTransform");
        this.rxFactory = rxFactory;
        this.name = name;
        this.enableDebugLogging = z;
        this.runQuery = runQuery;
        this.queryTransform = queryTransform;
        this.activeSubscriptions = new ActiveSubscriptions<>(name, reactors);
    }

    public /* synthetic */ BaseQuery(RxFactory rxFactory, String str, List list, boolean z, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rxFactory, str, list, (i & 8) != 0 ? false : z, function1, function12);
    }

    public final String getName() {
        return this.name;
    }

    public final ActiveSubscriptions<P> getActiveSubscriptions() {
        return this.activeSubscriptions;
    }

    @Override // com.robinhood.android.moria.p196db.Query
    public Flow<R> asFlow(P params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new QueryTracker(this.activeSubscriptions, params, this.name, this.enableDebugLogging).invoke((QueryTracker) this.queryTransform.invoke(this.runQuery.invoke(params)));
    }

    @Override // com.robinhood.android.moria.p196db.Query
    public Observable<R> asObservable(P params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.rxFactory.convertToObservable(asFlow(params));
    }
}
