package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;

/* compiled from: javaTypes.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType, reason: use source file name */
/* loaded from: classes14.dex */
public interface javaTypes2 extends javaTypes4 {
    JavaClassifier getClassifier();

    String getClassifierQualifiedName();

    String getPresentableText();

    List<javaTypes4> getTypeArguments();

    boolean isRaw();
}
