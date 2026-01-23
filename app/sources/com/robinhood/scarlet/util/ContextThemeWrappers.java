package com.robinhood.scarlet.util;

import android.annotation.SuppressLint;
import android.view.ContextThemeWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContextThemeWrappers.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"themeResId", "", "Landroid/view/ContextThemeWrapper;", "getThemeResId", "(Landroid/view/ContextThemeWrapper;)Ljava/lang/Integer;", "platformContextThemeWrapperResExtractor", "Lkotlin/Function1;", "reflectiveExtractor", "method", "Ljava/lang/reflect/Method;", "lib-scarlet_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.scarlet.util.ContextThemeWrappersKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ContextThemeWrappers {

    @SuppressLint({"DiscouragedPrivateApi"})
    private static final Function1<ContextThemeWrapper, Integer> platformContextThemeWrapperResExtractor;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer platformContextThemeWrapperResExtractor$lambda$1(ContextThemeWrapper it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return null;
    }

    public static final Integer getThemeResId(ContextThemeWrapper contextThemeWrapper) {
        Intrinsics.checkNotNullParameter(contextThemeWrapper, "<this>");
        return platformContextThemeWrapperResExtractor.invoke(contextThemeWrapper);
    }

    static {
        Function1<ContextThemeWrapper, Integer> function1ReflectiveExtractor;
        try {
            Method declaredMethod = ContextThemeWrapper.class.getDeclaredMethod("getThemeResId", null);
            declaredMethod.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "apply(...)");
            function1ReflectiveExtractor = reflectiveExtractor(declaredMethod);
        } catch (ReflectiveOperationException unused) {
            function1ReflectiveExtractor = new Function1() { // from class: com.robinhood.scarlet.util.ContextThemeWrappersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ContextThemeWrappers.platformContextThemeWrapperResExtractor$lambda$1((ContextThemeWrapper) obj);
                }
            };
        }
        platformContextThemeWrapperResExtractor = function1ReflectiveExtractor;
    }

    private static final Function1<ContextThemeWrapper, Integer> reflectiveExtractor(final Method method) {
        return new Function1() { // from class: com.robinhood.scarlet.util.ContextThemeWrappersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContextThemeWrappers.reflectiveExtractor$lambda$3(method, (ContextThemeWrapper) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer reflectiveExtractor$lambda$3(Method method, ContextThemeWrapper context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Integer num;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object objInvoke = method.invoke(context, null);
            num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
        } catch (ReflectiveOperationException unused) {
        }
        if (num != null) {
            if (num.intValue() == 0) {
                return null;
            }
        }
        return num;
    }
}
