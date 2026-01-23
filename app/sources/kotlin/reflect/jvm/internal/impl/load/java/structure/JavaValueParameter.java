package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: javaElements.kt */
/* loaded from: classes14.dex */
public interface JavaValueParameter extends JavaAnnotationOwner {
    Name getName();

    javaTypes4 getType();

    boolean isVararg();
}
