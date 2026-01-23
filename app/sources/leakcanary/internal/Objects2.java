package leakcanary.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: Objects.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Ljava/lang/reflect/InvocationHandler;", "NO_OP_HANDLER", "Ljava/lang/reflect/InvocationHandler;", "leakcanary-android-utils_release"}, m3637k = 2, m3638mv = {1, 4, 1})
/* renamed from: leakcanary.internal.ObjectsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Objects2 {
    private static final InvocationHandler NO_OP_HANDLER = new InvocationHandler() { // from class: leakcanary.internal.ObjectsKt$NO_OP_HANDLER$1
        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            invoke(obj, method, objArr);
            return Unit.INSTANCE;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final void invoke(Object obj, Method method, Object[] objArr) {
        }
    };
}
