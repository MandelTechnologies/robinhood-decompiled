package com.robinhood.android.options.p208ui.detail;

import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0006¢\u0006\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"indexed", "Lkotlin/Pair;", "T", "", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageViewState;", "paramGetter", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageViewStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPageViewState3 {
    public static final <T> Tuples2<T, Integer> indexed(OptionsDetailPageViewState optionsDetailPageViewState, Function1<? super OptionsDetailPageViewState, ? extends T> paramGetter) {
        Intrinsics.checkNotNullParameter(optionsDetailPageViewState, "<this>");
        Intrinsics.checkNotNullParameter(paramGetter, "paramGetter");
        T tInvoke = paramGetter.invoke(optionsDetailPageViewState);
        if (optionsDetailPageViewState.getCurrentPage() == null || tInvoke == null) {
            return null;
        }
        return Tuples4.m3642to(tInvoke, optionsDetailPageViewState.getCurrentPage());
    }
}
