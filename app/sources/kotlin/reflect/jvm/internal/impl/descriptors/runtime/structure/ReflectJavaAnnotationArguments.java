package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class ReflectJavaAnnotationArguments implements annotationArguments {
    public static final Factory Factory = new Factory(null);
    private final Name name;

    public /* synthetic */ ReflectJavaAnnotationArguments(Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(name);
    }

    private ReflectJavaAnnotationArguments(Name name) {
        this.name = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments
    public Name getName() {
        return this.name;
    }

    /* compiled from: ReflectJavaAnnotationArguments.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument$Factory */
    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Factory() {
        }

        public final ReflectJavaAnnotationArguments create(Object value, Name name) {
            Intrinsics.checkNotNullParameter(value, "value");
            return reflectClassUtil.isEnumClassOrSpecializedEnumEntryClass(value.getClass()) ? new ReflectJavaAnnotationArguments5(name, (Enum) value) : value instanceof Annotation ? new ReflectJavaAnnotationArguments2(name, (Annotation) value) : value instanceof Object[] ? new ReflectJavaAnnotationArguments3(name, (Object[]) value) : value instanceof Class ? new ReflectJavaAnnotationArguments4(name, (Class) value) : new ReflectJavaAnnotationArguments6(name, value);
        }
    }
}
