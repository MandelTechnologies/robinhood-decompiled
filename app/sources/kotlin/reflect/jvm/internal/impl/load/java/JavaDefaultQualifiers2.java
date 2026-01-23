package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.typeQualifiers3;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: JavaDefaultQualifiers.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiersKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class JavaDefaultQualifiers2 {
    private static final List<AnnotationQualifierApplicabilityType> APPLICABILITY_OF_JAVAX_DEFAULTS;
    private static final List<AnnotationQualifierApplicabilityType> APPLICABILITY_OF_JSPECIFY_DEFAULTS;
    private static final Map<FqName, JavaDefaultQualifiers> BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS;
    private static final Map<FqName, JavaDefaultQualifiers> JAVAX_DEFAULT_ANNOTATIONS;
    private static final Map<FqName, JavaDefaultQualifiers> JSPECIFY_DEFAULT_ANNOTATIONS;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> listListOf = CollectionsKt.listOf((Object[]) new AnnotationQualifierApplicabilityType[]{annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE});
        APPLICABILITY_OF_JSPECIFY_DEFAULTS = listListOf;
        List<AnnotationQualifierApplicabilityType> listListOf2 = CollectionsKt.listOf(annotationQualifierApplicabilityType3);
        APPLICABILITY_OF_JAVAX_DEFAULTS = listListOf2;
        FqName jspecify_old_null_marked_annotation_fq_name = JvmAnnotationNames2.getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME();
        typeQualifiers3 typequalifiers3 = typeQualifiers3.NOT_NULL;
        Map<FqName, JavaDefaultQualifiers> mapMapOf = MapsKt.mapOf(Tuples4.m3642to(jspecify_old_null_marked_annotation_fq_name, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(typequalifiers3, false, 2, null), listListOf, false)), Tuples4.m3642to(JvmAnnotationNames2.getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(typequalifiers3, false, 2, null), listListOf, false)), Tuples4.m3642to(JvmAnnotationNames2.getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(typeQualifiers3.FORCE_FLEXIBILITY, false, 2, null), listListOf, false, 4, null)));
        JSPECIFY_DEFAULT_ANNOTATIONS = mapMapOf;
        Map<FqName, JavaDefaultQualifiers> mapMapOf2 = MapsKt.mapOf(Tuples4.m3642to(JvmAnnotationNames2.getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(typequalifiers3, false, 2, null), listListOf2, false, 4, null)), Tuples4.m3642to(JvmAnnotationNames2.getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(typeQualifiers3.NULLABLE, false, 2, null), listListOf2, false, 4, null)));
        JAVAX_DEFAULT_ANNOTATIONS = mapMapOf2;
        BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS = MapsKt.plus(mapMapOf, mapMapOf2);
    }

    public static final Map<FqName, JavaDefaultQualifiers> getJSPECIFY_DEFAULT_ANNOTATIONS() {
        return JSPECIFY_DEFAULT_ANNOTATIONS;
    }

    public static final Map<FqName, JavaDefaultQualifiers> getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS() {
        return BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS;
    }
}
