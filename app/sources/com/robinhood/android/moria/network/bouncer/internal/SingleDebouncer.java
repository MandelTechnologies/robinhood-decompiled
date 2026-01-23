package com.robinhood.android.moria.network.bouncer.internal;

import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleDebouncer.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¨\u0006\u0007"}, m3636d2 = {"debounce", "Lio/reactivex/Maybe;", "T", "Lio/reactivex/Single;", "shouldDebounce", "Lkotlin/Function0;", "", "lib-moria"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.moria.network.bouncer.internal.SingleDebouncerKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SingleDebouncer {
    public static final <T> Maybe<T> debounce(final Single<T> single, final Function0<Boolean> shouldDebounce) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(shouldDebounce, "shouldDebounce");
        Maybe<T> maybeDefer = Maybe.defer(new Callable() { // from class: com.robinhood.android.moria.network.bouncer.internal.SingleDebouncerKt.debounce.1
            @Override // java.util.concurrent.Callable
            public final MaybeSource<? extends T> call() {
                if (shouldDebounce.invoke().booleanValue()) {
                    return Maybe.empty();
                }
                return single.toMaybe();
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeDefer, "defer(...)");
        return maybeDefer;
    }
}
