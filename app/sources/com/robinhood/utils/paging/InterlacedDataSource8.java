package com.robinhood.utils.paging;

import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function5;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InterlacedDataSource.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001aM\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\n0\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\u000b\u001a\u0002H\u00042\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"loadBeginning", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/paging/BeginningLoad;", "ValueT", "KeyT", "", "Lcom/robinhood/utils/paging/PaginationLoader;", "requestedLoadSize", "", "loadAround", "Lcom/robinhood/utils/paging/AroundLoad;", "key", "limit", "(Lcom/robinhood/utils/paging/PaginationLoader;Ljava/lang/Object;I)Lio/reactivex/Observable;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.paging.InterlacedDataSourceKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class InterlacedDataSource8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <KeyT, ValueT> Observable<BeginningLoad<ValueT>> loadBeginning(PaginationLoader<? super KeyT, ? extends ValueT> paginationLoader, int i) {
        Observables observables = Observables.INSTANCE;
        Observable<BeginningLoad<ValueT>> observableCombineLatest = Observable.combineLatest(paginationLoader.countTotal(), paginationLoader.loadFirst(i), new BiFunction<T1, T2, R>() { // from class: com.robinhood.utils.paging.InterlacedDataSourceKt$loadBeginning$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) new BeginningLoad((List) t2, ((Number) t1).intValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        return observableCombineLatest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <KeyT, ValueT> Observable<AroundLoad<ValueT>> loadAround(PaginationLoader<? super KeyT, ? extends ValueT> paginationLoader, KeyT keyt, int i) {
        Observables observables = Observables.INSTANCE;
        Observable<AroundLoad<ValueT>> observableCombineLatest = Observable.combineLatest(paginationLoader.countTotal(), paginationLoader.countBefore(keyt), paginationLoader.loadBefore(keyt, i), paginationLoader.loadBoundary(keyt), paginationLoader.loadAfter(keyt, i), new Function5<T1, T2, T3, T4, T5, R>() { // from class: com.robinhood.utils.paging.InterlacedDataSourceKt$loadAround$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                return (R) new AroundLoad((List) t3, (List) t4, (List) t5, ((Number) t2).intValue(), ((Number) t1).intValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        return observableCombineLatest;
    }
}
