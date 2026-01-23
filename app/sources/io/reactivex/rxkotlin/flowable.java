package io.reactivex.rxkotlin;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;

/* compiled from: flowable.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"", "T", "Lio/reactivex/Flowable;", "mergeAll", "(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", "rxkotlin"}, m3637k = 2, m3638mv = {1, 4, 0})
/* renamed from: io.reactivex.rxkotlin.FlowableKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class flowable {
    public static final <T> Flowable<T> mergeAll(Flowable<Flowable<T>> mergeAll) {
        Intrinsics.checkParameterIsNotNull(mergeAll, "$this$mergeAll");
        Flowable<T> flowable = (Flowable<T>) mergeAll.flatMap(new Function<T, Publisher<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt.mergeAll.1
            @Override // io.reactivex.functions.Function
            public final Flowable<T> apply(Flowable<T> it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable, "flatMap { it }");
        return flowable;
    }
}
