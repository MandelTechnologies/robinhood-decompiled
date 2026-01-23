package com.squareup.wire;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: RuntimeEnumAdapter.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u0017*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0017B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0014¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/squareup/wire/RuntimeEnumAdapter;", "E", "Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/EnumAdapter;", "javaType", "Ljava/lang/Class;", "syntax", "Lcom/squareup/wire/Syntax;", "<init>", "(Ljava/lang/Class;Lcom/squareup/wire/Syntax;)V", "(Ljava/lang/Class;)V", "fromValueMethod", "Ljava/lang/reflect/Method;", "getFromValueMethod", "fromValue", "value", "", "(I)Lcom/squareup/wire/WireEnum;", "equals", "", "other", "", "hashCode", "Companion", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Method fromValueMethod;
    private final Class<E> javaType;

    @JvmStatic
    public static final <E extends WireEnum> RuntimeEnumAdapter<E> create(Class<E> cls) {
        return INSTANCE.create(cls);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeEnumAdapter(Class<E> javaType, Syntax syntax) {
        super((KClass<WireEnum>) JvmClassMapping.getKotlinClass(javaType), syntax, Internal.getIdentityOrNull(javaType));
        Intrinsics.checkNotNullParameter(javaType, "javaType");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        this.javaType = javaType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RuntimeEnumAdapter(Class<E> javaType) {
        this(javaType, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(javaType, "javaType");
    }

    private final Method getFromValueMethod() throws NoSuchMethodException, SecurityException {
        Method method = this.fromValueMethod;
        if (method != null) {
            return method;
        }
        Method method2 = this.javaType.getMethod("fromValue", Integer.TYPE);
        this.fromValueMethod = method2;
        Intrinsics.checkNotNullExpressionValue(method2, "also(...)");
        return method2;
    }

    @Override // com.squareup.wire.EnumAdapter
    protected E fromValue(int value) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = getFromValueMethod().invoke(null, Integer.valueOf(value));
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type E of com.squareup.wire.RuntimeEnumAdapter");
        return (E) objInvoke;
    }

    public boolean equals(Object other) {
        return (other instanceof RuntimeEnumAdapter) && Intrinsics.areEqual(((RuntimeEnumAdapter) other).getType(), getType());
    }

    public int hashCode() {
        KClass<?> type2 = getType();
        if (type2 != null) {
            return type2.hashCode();
        }
        return 0;
    }

    /* compiled from: RuntimeEnumAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/squareup/wire/RuntimeEnumAdapter$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/wire/RuntimeEnumAdapter;", "E", "Lcom/squareup/wire/WireEnum;", "enumType", "Ljava/lang/Class;", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <E extends WireEnum> RuntimeEnumAdapter<E> create(Class<E> enumType) {
            Intrinsics.checkNotNullParameter(enumType, "enumType");
            return new RuntimeEnumAdapter<>(enumType, ProtoAdapter.INSTANCE.get(enumType).getSyntax());
        }
    }
}
