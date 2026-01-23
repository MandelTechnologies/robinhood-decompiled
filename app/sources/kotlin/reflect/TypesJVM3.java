package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypesJVM.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class TypesJVM3 extends FunctionReferenceImpl implements Function1<Type, String> {
    public static final TypesJVM3 INSTANCE = new TypesJVM3();

    TypesJVM3() {
        super(1, TypesJVM5.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Type p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return TypesJVM5.typeToString(p0);
    }
}
