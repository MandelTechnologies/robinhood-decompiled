package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.storage4;
import kotlin.reflect.jvm.internal.impl.utils.collections;

/* compiled from: resolvers.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver, reason: use source file name */
/* loaded from: classes21.dex */
public final class resolvers implements resolvers2 {

    /* renamed from: c */
    private final context4 f7017c;
    private final DeclarationDescriptor containingDeclaration;
    private final storage4<JavaTypeParameter, LazyJavaTypeParameterDescriptor> resolve;
    private final Map<JavaTypeParameter, Integer> typeParameters;
    private final int typeParametersIndexOffset;

    public resolvers(context4 c, DeclarationDescriptor containingDeclaration, JavaTypeParameterListOwner typeParameterOwner, int i) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        this.f7017c = c;
        this.containingDeclaration = containingDeclaration;
        this.typeParametersIndexOffset = i;
        this.typeParameters = collections.mapToIndex(typeParameterOwner.getTypeParameters());
        this.resolve = c.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$$Lambda$0
            private final resolvers arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return resolvers.resolve$lambda$1(this.arg$0, (JavaTypeParameter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaTypeParameterDescriptor resolve$lambda$1(resolvers resolversVar, JavaTypeParameter typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Integer num = resolversVar.typeParameters.get(typeParameter);
        if (num == null) {
            return null;
        }
        return new LazyJavaTypeParameterDescriptor(context.copyWithNewDefaultTypeQualifiers(context.child(resolversVar.f7017c, resolversVar), resolversVar.containingDeclaration.getAnnotations()), typeParameter, resolversVar.typeParametersIndexOffset + num.intValue(), resolversVar.containingDeclaration);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.resolvers2
    public TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter) {
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = (LazyJavaTypeParameterDescriptor) this.resolve.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptor != null ? lazyJavaTypeParameterDescriptor : this.f7017c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
    }
}
