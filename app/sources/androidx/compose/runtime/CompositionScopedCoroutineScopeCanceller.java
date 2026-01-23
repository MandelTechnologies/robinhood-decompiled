package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: Effects.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m3636d2 = {"Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;", "Landroidx/compose/runtime/RememberObserver;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@PublishedApi
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    private final CoroutineScope coroutineScope;

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    public CompositionScopedCoroutineScopeCanceller(CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) coroutineScope).cancelIfCreated();
        } else {
            CoroutineScope2.cancel(coroutineScope, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) coroutineScope).cancelIfCreated();
        } else {
            CoroutineScope2.cancel(coroutineScope, new LeftCompositionCancellationException());
        }
    }
}
