package com.robinhood.utils;

import com.robinhood.utils.Either;
import kotlin.Metadata;

/* compiled from: Either.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0002H\u0002¢\u0006\u0002\u0010\u0003\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\u0002H\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"asLeft", "Lcom/robinhood/utils/Either$Left;", "T", "(Ljava/lang/Object;)Lcom/robinhood/utils/Either$Left;", "asRight", "Lcom/robinhood/utils/Either$Right;", "(Ljava/lang/Object;)Lcom/robinhood/utils/Either$Right;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.EitherKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Either2 {
    public static final <T> Either.Left<T> asLeft(T t) {
        return new Either.Left<>(t);
    }

    public static final <T> Either.Right<T> asRight(T t) {
        return new Either.Right<>(t);
    }
}
