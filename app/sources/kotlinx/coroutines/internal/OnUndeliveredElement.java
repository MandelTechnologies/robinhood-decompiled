package kotlinx.coroutines.internal;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler7;

/* compiled from: OnUndeliveredElement.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0004\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0001*\u0018\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u00062\u0006\u0010\u0007\u001a\u0002H\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\t\u001a=\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0001*\u0018\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u00062\u0006\u0010\u0007\u001a\u0002H\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\r**\b\u0000\u0010\u0000\u001a\u0004\b\u0000\u0010\u0001\"\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u000e"}, m3636d2 = {"OnUndeliveredElement", "E", "Lkotlin/Function1;", "", "callUndeliveredElementCatchingException", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "undeliveredElementException", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "callUndeliveredElement", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.internal.OnUndeliveredElementKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class OnUndeliveredElement {
    public static /* synthetic */ OnUndeliveredElement2 callUndeliveredElementCatchingException$default(Function1 function1, Object obj, OnUndeliveredElement2 onUndeliveredElement2, int i, Object obj2) {
        if ((i & 2) != 0) {
            onUndeliveredElement2 = null;
        }
        return callUndeliveredElementCatchingException(function1, obj, onUndeliveredElement2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> OnUndeliveredElement2 callUndeliveredElementCatchingException(Function1<? super E, Unit> function1, E e, OnUndeliveredElement2 onUndeliveredElement2) {
        try {
            function1.invoke(e);
            return onUndeliveredElement2;
        } catch (Throwable th) {
            if (onUndeliveredElement2 != null && onUndeliveredElement2.getCause() != th) {
                ExceptionsKt.addSuppressed(onUndeliveredElement2, th);
                return onUndeliveredElement2;
            }
            return new OnUndeliveredElement2("Exception in undelivered element handler for " + e, th);
        }
    }

    public static final <E> void callUndeliveredElement(Function1<? super E, Unit> function1, E e, CoroutineContext coroutineContext) {
        OnUndeliveredElement2 onUndeliveredElement2CallUndeliveredElementCatchingException = callUndeliveredElementCatchingException(function1, e, null);
        if (onUndeliveredElement2CallUndeliveredElementCatchingException != null) {
            CoroutineExceptionHandler7.handleCoroutineException(coroutineContext, onUndeliveredElement2CallUndeliveredElementCatchingException);
        }
    }
}
