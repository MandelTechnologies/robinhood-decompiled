package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.context4;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments;
import kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments3;
import kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments5;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.storage5;
import kotlin.reflect.jvm.internal.impl.storage.storage7;

/* compiled from: JavaAnnotationMapper.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor, reason: use source file name */
/* loaded from: classes14.dex */
public final class JavaAnnotationMapper6 extends JavaAnnotationMapper2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(JavaAnnotationMapper6.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    private final storage5 allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaAnnotationMapper6(JavaAnnotation annotation, context4 c) {
        super(c, annotation, StandardNames.FqNames.target);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c, "c");
        this.allValueArguments$delegate = c.getStorageManager().createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$$Lambda$0
            private final JavaAnnotationMapper6 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return JavaAnnotationMapper6.allValueArguments_delegate$lambda$1(this.arg$0);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<Object>> getAllValueArguments() {
        return (Map) storage7.getValue(this.allValueArguments$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allValueArguments_delegate$lambda$1(JavaAnnotationMapper6 javaAnnotationMapper6) {
        ConstantValue<?> constantValueMapJavaTargetArguments$descriptors_jvm;
        annotationArguments firstArgument = javaAnnotationMapper6.getFirstArgument();
        if (firstArgument instanceof annotationArguments3) {
            constantValueMapJavaTargetArguments$descriptors_jvm = JavaAnnotationMapper3.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((annotationArguments3) javaAnnotationMapper6.getFirstArgument()).getElements());
        } else {
            constantValueMapJavaTargetArguments$descriptors_jvm = firstArgument instanceof annotationArguments5 ? JavaAnnotationMapper3.INSTANCE.mapJavaTargetArguments$descriptors_jvm(CollectionsKt.listOf(javaAnnotationMapper6.getFirstArgument())) : null;
        }
        Map mapMapOf = constantValueMapJavaTargetArguments$descriptors_jvm != null ? MapsKt.mapOf(Tuples4.m3642to(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), constantValueMapJavaTargetArguments$descriptors_jvm)) : null;
        return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
    }
}
