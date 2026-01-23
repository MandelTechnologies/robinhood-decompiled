package com.robinhood.utils.extensions;

import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;

/* compiled from: Flowables.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u00050\u0001\u001a&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0001\u001ax\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\t*\u00020\u0004\"\b\b\u0002\u0010\b*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001a\b\u0004\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\u0010H\u0086\bø\u0001\u0000\u001at\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\t*\u00020\u0004\"\b\b\u0002\u0010\b*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u001c\b\u0004\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u0002H\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\t0\u00010\u00132\u001a\b\u0004\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\u0010H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, m3636d2 = {"mapFirstOptional", "Lio/reactivex/Flowable;", "Lcom/robinhood/utils/Optional;", "T", "", "", "toOptionals", "zipWith", "R", "U", "other", "delayError", "", "bufferSize", "", "zipper", "Lkotlin/Function2;", "switchMap", "mapper", "Lkotlin/Function1;", "combiner", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.FlowablesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Flowables {
    public static final <T> Flowable<Optional<T>> mapFirstOptional(Flowable<? extends List<? extends T>> flowable) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Flowable<Optional<T>> flowable2 = (Flowable<Optional<T>>) flowable.map(new Function() { // from class: com.robinhood.utils.extensions.FlowablesKt.mapFirstOptional.1
            @Override // io.reactivex.functions.Function
            public final Optional<T> apply(List<? extends T> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Lists4.firstOptional(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(flowable2, "map(...)");
        return flowable2;
    }

    public static final <T> Flowable<Optional<T>> toOptionals(Flowable<T> flowable) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Flowable<Optional<T>> flowable2 = (Flowable<Optional<T>>) flowable.map(new Function() { // from class: com.robinhood.utils.extensions.FlowablesKt.toOptionals.1
            @Override // io.reactivex.functions.Function
            public final Optional<T> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C419141<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(flowable2, "map(...)");
        return flowable2;
    }

    public static /* synthetic */ Flowable zipWith$default(Flowable flowable, Flowable other, boolean z, int i, Function2 zipper, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = Flowable.bufferSize();
        }
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Flowable flowableZip = Flowable.zip(flowable, other, new Flowables2(zipper), z, i);
        Intrinsics.checkNotNullExpressionValue(flowableZip, "zip(...)");
        return flowableZip;
    }

    public static final <T, U, R> Flowable<R> zipWith(Flowable<T> flowable, Flowable<U> other, boolean z, int i, Function2<? super T, ? super U, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Flowable<R> flowableZip = Flowable.zip(flowable, other, new Flowables2(zipper), z, i);
        Intrinsics.checkNotNullExpressionValue(flowableZip, "zip(...)");
        return flowableZip;
    }

    public static final <T, U, R> Flowable<R> switchMap(Flowable<T> flowable, final Function1<? super T, ? extends Flowable<? extends U>> mapper, final Function2<? super T, ? super U, ? extends R> combiner) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(combiner, "combiner");
        Flowable<R> flowableSwitchMap = flowable.switchMap(new Function() { // from class: com.robinhood.utils.extensions.FlowablesKt.switchMap.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C419131<T, R>) obj);
            }

            @Override // io.reactivex.functions.Function
            public final Publisher<? extends R> apply(final T t) {
                Intrinsics.checkNotNullParameter(t, "t");
                Flowable flowable2 = (Flowable) mapper.invoke(t);
                final Function2<T, U, R> function2 = combiner;
                return flowable2.map(new Function() { // from class: com.robinhood.utils.extensions.FlowablesKt.switchMap.1.1
                    @Override // io.reactivex.functions.Function
                    public final R apply(U u) {
                        Intrinsics.checkNotNullParameter(u, "u");
                        Function2<T, U, R> function22 = function2;
                        T t2 = t;
                        Intrinsics.checkNotNull(t2);
                        return function22.invoke(t2, u);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(flowableSwitchMap, "switchMap(...)");
        return flowableSwitchMap;
    }
}
