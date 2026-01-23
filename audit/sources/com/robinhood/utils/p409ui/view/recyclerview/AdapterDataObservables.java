package com.robinhood.utils.p409ui.view.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdapterDataObservables.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\f\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030\u0004*\u0002H\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"dataEvents", "Lio/reactivex/Observable;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)Lio/reactivex/Observable;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.view.recyclerview.AdapterDataObservablesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class AdapterDataObservables {
    public static final <T extends RecyclerView.Adapter<?>> Observable<Unit> dataEvents(final T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Observable<Unit> observableCreate = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.utils.ui.view.recyclerview.AdapterDataObservablesKt.dataEvents.1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter<Unit> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final AdapterDataObservables2 adapterDataObservables2 = new AdapterDataObservables2(emitter);
                t.registerAdapterDataObserver(adapterDataObservables2);
                final RecyclerView.Adapter adapter = t;
                emitter.setCancellable(new Cancellable() { // from class: com.robinhood.utils.ui.view.recyclerview.AdapterDataObservablesKt.dataEvents.1.1
                    @Override // io.reactivex.functions.Cancellable
                    public final void cancel() {
                        adapter.unregisterAdapterDataObserver(adapterDataObservables2);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCreate, "create(...)");
        return observableCreate;
    }
}
