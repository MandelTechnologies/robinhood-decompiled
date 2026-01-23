package com.robinhood.utils.extensions;

import io.reactivex.Emitter;
import io.reactivex.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Observers.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/extensions/ObserverEmitter;", "T", "", "Lio/reactivex/Emitter;", "observer", "Lio/reactivex/Observer;", "<init>", "(Lio/reactivex/Observer;)V", "onComplete", "", "onNext", "value", "(Ljava/lang/Object;)V", "onError", "error", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ObserverEmitter, reason: use source file name */
/* loaded from: classes12.dex */
final class Observers<T> implements Emitter<T> {
    private final Observer<? super T> observer;

    public Observers(Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observer = observer;
    }

    @Override // io.reactivex.Emitter
    public void onComplete() {
        this.observer.onComplete();
    }

    @Override // io.reactivex.Emitter
    public void onNext(T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.observer.onNext(value);
    }

    @Override // io.reactivex.Emitter
    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.observer.onError(error);
    }
}
