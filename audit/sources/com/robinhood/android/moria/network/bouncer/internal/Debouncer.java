package com.robinhood.android.moria.network.bouncer.internal;

import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.MaybeTransformer;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Debouncer.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/moria/network/bouncer/internal/Debouncer;", "T", "Lio/reactivex/MaybeTransformer;", "shouldDebounce", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "apply", "Lio/reactivex/Maybe;", "upstream", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class Debouncer<T> implements MaybeTransformer<T, T> {
    private final Function0<Boolean> shouldDebounce;

    public Debouncer(Function0<Boolean> shouldDebounce) {
        Intrinsics.checkNotNullParameter(shouldDebounce, "shouldDebounce");
        this.shouldDebounce = shouldDebounce;
    }

    @Override // io.reactivex.MaybeTransformer
    public Maybe<T> apply(final Maybe<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Maybe<T> maybeDefer = Maybe.defer(new Callable(this) { // from class: com.robinhood.android.moria.network.bouncer.internal.Debouncer.apply.1
            final /* synthetic */ Debouncer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.concurrent.Callable
            public final MaybeSource<? extends T> call() {
                if (((Boolean) ((Debouncer) this.this$0).shouldDebounce.invoke()).booleanValue()) {
                    return Maybe.empty();
                }
                return upstream;
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeDefer, "defer(...)");
        return maybeDefer;
    }
}
