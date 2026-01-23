package com.robinhood.coroutines.p287rx;

import io.reactivex.CompletableSource;
import io.reactivex.MaybeSource;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: RxAwait.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086H¢\u0006\u0002\u0010\u0004\u001a\"\u0010\u0005\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086H¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\u0005\u001a\u00020\b*\u00020\tH\u0086H¢\u0006\u0002\u0010\n\u001a\"\u0010\u000b\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\fH\u0086H¢\u0006\u0002\u0010\r\u001a\"\u0010\u000e\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\fH\u0086H¢\u0006\u0002\u0010\r\u001a$\u0010\u000f\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\fH\u0086H¢\u0006\u0002\u0010\r¨\u0006\u0010"}, m3636d2 = {"awaitSingleOrNull", "T", "", "Lio/reactivex/MaybeSource;", "(Lio/reactivex/MaybeSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "await", "Lio/reactivex/SingleSource;", "(Lio/reactivex/SingleSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lio/reactivex/CompletableSource;", "(Lio/reactivex/CompletableSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirst", "Lio/reactivex/ObservableSource;", "(Lio/reactivex/ObservableSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLast", "awaitFirstOrNull", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.rx.RxAwaitKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class RxAwait {
    public static final <T> Object awaitSingleOrNull(MaybeSource<T> maybeSource, Continuation<? super T> continuation) {
        return RxAwait3.awaitSingleOrNull(maybeSource, continuation);
    }

    private static final <T> Object awaitSingleOrNull$$forInline(MaybeSource<T> maybeSource, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        Object objAwaitSingleOrNull = RxAwait3.awaitSingleOrNull(maybeSource, continuation);
        InlineMarker.mark(1);
        return objAwaitSingleOrNull;
    }

    public static final <T> Object await(SingleSource<T> singleSource, Continuation<? super T> continuation) {
        return RxAwait3.await(singleSource, continuation);
    }

    private static final <T> Object await$$forInline(SingleSource<T> singleSource, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        Object objAwait = RxAwait3.await(singleSource, continuation);
        InlineMarker.mark(1);
        return objAwait;
    }

    public static final Object await(CompletableSource completableSource, Continuation<? super Unit> continuation) {
        Object objAwait = RxAwait3.await(completableSource, continuation);
        return objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : Unit.INSTANCE;
    }

    private static final Object await$$forInline(CompletableSource completableSource, Continuation<? super Unit> continuation) {
        InlineMarker.mark(0);
        RxAwait3.await(completableSource, continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    public static final <T> Object awaitFirst(ObservableSource<T> observableSource, Continuation<? super T> continuation) {
        return RxAwait3.awaitFirst(observableSource, continuation);
    }

    private static final <T> Object awaitFirst$$forInline(ObservableSource<T> observableSource, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        Object objAwaitFirst = RxAwait3.awaitFirst(observableSource, continuation);
        InlineMarker.mark(1);
        return objAwaitFirst;
    }

    public static final <T> Object awaitLast(ObservableSource<T> observableSource, Continuation<? super T> continuation) {
        return RxAwait3.awaitLast(observableSource, continuation);
    }

    private static final <T> Object awaitLast$$forInline(ObservableSource<T> observableSource, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        Object objAwaitLast = RxAwait3.awaitLast(observableSource, continuation);
        InlineMarker.mark(1);
        return objAwaitLast;
    }

    public static final <T> Object awaitFirstOrNull(ObservableSource<T> observableSource, Continuation<? super T> continuation) {
        return RxAwait3.awaitFirstOrNull(observableSource, continuation);
    }

    private static final <T> Object awaitFirstOrNull$$forInline(ObservableSource<T> observableSource, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        Object objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(observableSource, continuation);
        InlineMarker.mark(1);
        return objAwaitFirstOrNull;
    }
}
