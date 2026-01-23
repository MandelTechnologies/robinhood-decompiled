package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;

/* compiled from: javaElements.kt */
/* loaded from: classes14.dex */
public interface JavaMethod extends JavaMember, JavaTypeParameterListOwner {
    annotationArguments getAnnotationParameterDefaultValue();

    boolean getHasAnnotationParameterDefaultValue();

    javaTypes4 getReturnType();

    List<JavaValueParameter> getValueParameters();
}
