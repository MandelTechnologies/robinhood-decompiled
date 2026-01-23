package sprig.p546d;

import com.singular.sdk.internal.Constants;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a<\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\b\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¨\u0006\n"}, m3636d2 = {"Lsprig/d/c;", "", "target", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "Ljava/lang/Class;", "parameterTypes", "parameters", "(Lsprig/d/c;Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", "Lsprig/d/b;", "userleap_release"}, m3637k = 2, m3638mv = {1, 8, 0})
/* renamed from: sprig.d.f */
/* loaded from: classes28.dex */
public final class C49008f {
    /* renamed from: a */
    public static final Object m4156a(C49005c c49005c, Object target) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(c49005c, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(target.getClass().getMethod(c49005c.getName(), null).invoke(target, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Function1<Throwable, Unit> function1M4144a = c49005c.m4144a();
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            function1M4144a.invoke(thM28553exceptionOrNullimpl);
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return objM28550constructorimpl;
    }

    /* renamed from: a */
    public static final Object m4157a(C49005c c49005c, Object target, Class<?>[] parameterTypes, Object[] parameters) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(c49005c, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(target.getClass().getMethod(c49005c.getName(), (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length)).invoke(target, Arrays.copyOf(parameters, parameters.length)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Function1<Throwable, Unit> function1M4144a = c49005c.m4144a();
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            function1M4144a.invoke(thM28553exceptionOrNullimpl);
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return objM28550constructorimpl;
    }

    /* renamed from: a */
    public static final Object m4155a(C49004b c49004b, Object target) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(c49004b, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Result.Companion companion = Result.INSTANCE;
            Field declaredField = target.getClass().getDeclaredField(c49004b.getName());
            declaredField.setAccessible(true);
            objM28550constructorimpl = Result.m28550constructorimpl(declaredField.get(target));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Function1<Throwable, Unit> function1M4142a = c49004b.m4142a();
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            function1M4142a.invoke(thM28553exceptionOrNullimpl);
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return objM28550constructorimpl;
    }
}
