package com.robinhood.utils;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import java.util.Arrays;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Preconditions.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007J%\u0010\t\u001a\u00020\u00052\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00020\u0011\"\u00020\u000fH\u0007J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\b\u0015J\u001b\u0010\u0016\u001a\u00060\u0017j\u0002`\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u001aJ\u0017\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u001cJ\u001b\u0010\u001d\u001a\u00060\u0017j\u0002`\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u001fJ\u0017\u0010\u001f\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/utils/Preconditions;", "", "<init>", "()V", "checkImplementsInterface", "", "host", "interfaceClass", "Ljava/lang/Class;", "checkNotNull", "objects", "", "([Ljava/lang/Object;)V", "checkEquals", "arg", "", "args", "", "$javaAssertCondition", "condition", "", "assertCondition", "$javafailUnknownEnum", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "value", "failUnknownEnum", "", "failUnknownEnumKotlin", "$javaFailUnexpectedItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "failUnexpectedItem", "failUnexpectedItemKotlin", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class Preconditions {
    public static final Preconditions INSTANCE = new Preconditions();

    private Preconditions() {
    }

    @JvmStatic
    public static final void checkImplementsInterface(Object host, Class<?> interfaceClass) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(interfaceClass, "interfaceClass");
        if (interfaceClass.isInstance(host)) {
            return;
        }
        throw new IllegalStateException(("Host must implement " + interfaceClass).toString());
    }

    @JvmStatic
    public static final void checkNotNull(Object... objects) {
        Intrinsics.checkNotNullParameter(objects, "objects");
        int length = objects.length;
        for (int i = 0; i < length; i++) {
            if (objects[i] == null) {
                throw new NullPointerException("Object[" + i + "] can't be null");
            }
        }
    }

    @JvmStatic
    @JvmName
    public static final void assertCondition(boolean condition) {
        if (!condition) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @JvmStatic
    @JvmName
    public static final RuntimeException failUnknownEnum(Object value) {
        INSTANCE.failUnknownEnumKotlin(value);
        throw new ExceptionsH();
    }

    @JvmName
    public final Void failUnknownEnumKotlin(Object value) {
        throw new IllegalStateException(("Unknown enum value: " + value).toString());
    }

    @JvmStatic
    @JvmName
    public static final RuntimeException failUnexpectedItem(Object item) {
        INSTANCE.failUnexpectedItemKotlin(item);
        throw new ExceptionsH();
    }

    @JvmName
    public final Void failUnexpectedItemKotlin(Object item) {
        throw new IllegalStateException(("Unexpected item: " + item).toString());
    }

    @JvmStatic
    public static final void checkEquals(int arg, int... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        for (int i : args) {
            if (i != arg) {
                String string2 = Arrays.toString(args);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                throw new IllegalStateException(("Args " + string2 + " does not equal to " + arg).toString());
            }
        }
    }
}
