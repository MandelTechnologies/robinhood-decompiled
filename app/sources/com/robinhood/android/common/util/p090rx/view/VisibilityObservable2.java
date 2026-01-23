package com.robinhood.android.common.util.p090rx.view;

import com.robinhood.android.common.util.p090rx.view.VisibilityObservable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VisibilityObservable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"visibilityChanges", "Lio/reactivex/Observable;", "", "Lcom/robinhood/android/common/util/rx/view/VisibilityObservable;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.rx.view.VisibilityObservableKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class VisibilityObservable2 {
    public static final Observable<Boolean> visibilityChanges(final VisibilityObservable visibilityObservable) {
        Intrinsics.checkNotNullParameter(visibilityObservable, "<this>");
        Observable<Boolean> observableCreate = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.android.common.util.rx.view.VisibilityObservableKt.visibilityChanges.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v3, types: [com.robinhood.android.common.util.rx.view.VisibilityObservable$VisibilityChangeListener, com.robinhood.android.common.util.rx.view.VisibilityObservableKt$visibilityChanges$1$listener$1] */
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<Boolean> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                if (emitter.getDisposed()) {
                    return;
                }
                try {
                    final ?? r0 = new VisibilityObservable.VisibilityChangeListener() { // from class: com.robinhood.android.common.util.rx.view.VisibilityObservableKt$visibilityChanges$1$listener$1
                        @Override // com.robinhood.android.common.util.rx.view.VisibilityObservable.VisibilityChangeListener
                        public void onVisibilityChange(boolean visible) {
                            if (emitter.getDisposed()) {
                                return;
                            }
                            emitter.onNext(Boolean.valueOf(visible));
                        }
                    };
                    visibilityObservable.addVisibilityListener(r0);
                    final VisibilityObservable visibilityObservable2 = visibilityObservable;
                    emitter.setCancellable(new Cancellable() { // from class: com.robinhood.android.common.util.rx.view.VisibilityObservableKt.visibilityChanges.1.1
                        @Override // io.reactivex.functions.Cancellable
                        public final void cancel() {
                            visibilityObservable2.removeVisibilityListener(r0);
                        }
                    });
                } catch (Exception e) {
                    emitter.onError(e);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCreate, "create(...)");
        return observableCreate;
    }
}
