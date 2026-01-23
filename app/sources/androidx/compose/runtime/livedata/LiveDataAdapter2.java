package androidx.compose.runtime.livedata;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.SnapshotState;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LiveDataAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u0002*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m3636d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "R", "T", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$1, reason: use source file name */
/* loaded from: classes4.dex */
final class LiveDataAdapter2 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ SnapshotState<R> $state;
    final /* synthetic */ LiveData<T> $this_observeAsState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveDataAdapter2(LiveData<T> liveData, LifecycleOwner lifecycleOwner, SnapshotState<R> snapshotState) {
        super(1);
        this.$this_observeAsState = liveData;
        this.$lifecycleOwner = lifecycleOwner;
        this.$state = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final SnapshotState<R> snapshotState = this.$state;
        final Observer observer = new Observer() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$1$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                snapshotState.setValue(obj);
            }
        };
        this.$this_observeAsState.observe(this.$lifecycleOwner, observer);
        final LiveData<T> liveData = this.$this_observeAsState;
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                liveData.removeObserver(observer);
            }
        };
    }
}
