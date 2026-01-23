package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CacheByClass.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lkotlin/reflect/jvm/internal/CacheByClass;", "createCache", "(Lkotlin/jvm/functions/Function1;)Lkotlin/reflect/jvm/internal/CacheByClass;", "kotlin-reflection"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.CacheByClassKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class CacheByClass2 {
    static {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = Boolean.TRUE;
        }
        Object objM28550constructorimpl2 = Result.m28550constructorimpl(objM28550constructorimpl);
        Boolean bool = Boolean.FALSE;
        if (Result.m28555isFailureimpl(objM28550constructorimpl2)) {
            objM28550constructorimpl2 = bool;
        }
        ((Boolean) objM28550constructorimpl2).getClass();
    }

    public static final <V> CacheByClass<V> createCache(Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        return new CacheByClass3(compute);
    }
}
