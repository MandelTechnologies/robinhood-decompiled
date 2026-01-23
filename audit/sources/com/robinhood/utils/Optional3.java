package com.robinhood.utils;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Optional.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0006H\u0086\bø\u0001\u0000\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0004\u0018\u0001H\u0003¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m3636d2 = {"map", "Lcom/robinhood/utils/Optional;", "U", "T", "", "f", "Lkotlin/Function1;", "asOptional", "(Ljava/lang/Object;)Lcom/robinhood/utils/Optional;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.OptionalKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class Optional3 {
    public static final <T, U> Optional<U> map(Optional<? extends T> optional, Function1<? super T, ? extends U> f) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        if (optional instanceof Some) {
            return Optional.INSTANCE.m2972of(f.invoke((Object) ((Some) optional).getValue()));
        }
        if (optional instanceof Optional2) {
            return Optional2.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> Optional<T> asOptional(T t) {
        return Optional.INSTANCE.m2972of(t);
    }
}
