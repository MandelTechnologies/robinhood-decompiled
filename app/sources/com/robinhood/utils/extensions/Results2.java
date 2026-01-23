package com.robinhood.utils.extensions;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Results.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, m3636d2 = {"runCatchingNetworkExceptions", "Lkotlin/Result;", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.ResultsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Results2 {
    public static final <R> Object runCatchingNetworkExceptions(Function0<? extends R> block) throws Throwable {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(block.invoke());
        } catch (Throwable th) {
            Throwables.rethrowIfNotNetworkRelated(th);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }
}
