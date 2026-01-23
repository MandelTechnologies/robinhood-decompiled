package com.robinhood.utils.retrofit.lazy;

import com.plaid.internal.EnumC7081g;
import dagger.internal.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Lazy.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* loaded from: classes12.dex */
public final class LazyRetrofitKt$lazyRetrofitService$$inlined$daggerLazy$1<T> implements Provider {
    final /* synthetic */ Function0 $initializer;

    public LazyRetrofitKt$lazyRetrofitService$$inlined$daggerLazy$1(Function0 function0) {
        this.$initializer = function0;
    }

    @Override // javax.inject.Provider
    public final T get() {
        return (T) this.$initializer.invoke();
    }
}
