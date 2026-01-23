package com.robinhood.utils.extensions;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Builders.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u0002H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00032\u001d\u0010\u0005\u001a\u0019\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001a@\u0010\t\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\f¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, m3636d2 = {"optRun", "B", "", "T", "value", "modifier", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "runIf", "condition", "", "Lkotlin/Function1;", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class BuildersKt {
    public static final <B, T> B optRun(B b, T t, Function2<? super B, ? super T, ? extends B> modifier) {
        B bInvoke;
        Intrinsics.checkNotNullParameter(b, "<this>");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return (t == null || (bInvoke = modifier.invoke(b, t)) == null) ? b : bInvoke;
    }

    public static final <B> B runIf(B b, boolean z, Function1<? super B, ? extends B> modifier) {
        Intrinsics.checkNotNullParameter(b, "<this>");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return z ? modifier.invoke(b) : b;
    }
}
