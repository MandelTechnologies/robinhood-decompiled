package com.robinhood.utils.extensions;

import com.plaid.internal.EnumC7081g;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flowables.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* renamed from: com.robinhood.utils.extensions.FlowablesKt$zipWith$zipFunction$1, reason: use source file name */
/* loaded from: classes12.dex */
public final class Flowables2<T1, T2, R> implements BiFunction {
    final /* synthetic */ Function2<T, U, R> $zipper;

    /* JADX WARN: Multi-variable type inference failed */
    public Flowables2(Function2<? super T, ? super U, ? extends R> function2) {
        this.$zipper = function2;
    }

    @Override // io.reactivex.functions.BiFunction
    public final R apply(T t, U u) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(u, "u");
        return this.$zipper.invoke(t, u);
    }
}
