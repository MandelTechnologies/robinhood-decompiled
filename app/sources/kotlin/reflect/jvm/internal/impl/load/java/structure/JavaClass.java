package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;

/* compiled from: javaElements.kt */
/* loaded from: classes21.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    Collection<JavaConstructor> getConstructors();

    Collection<JavaField> getFields();

    FqName getFqName();

    Collection<Name> getInnerClassNames();

    LightClassOriginKind getLightClassOriginKind();

    Collection<JavaMethod> getMethods();

    JavaClass getOuterClass();

    Sequence<javaTypes2> getPermittedTypes();

    Collection<JavaRecordComponent> getRecordComponents();

    Collection<javaTypes2> getSupertypes();

    boolean hasDefaultConstructor();

    boolean isAnnotationType();

    boolean isEnum();

    boolean isInterface();

    boolean isRecord();

    boolean isSealed();
}
