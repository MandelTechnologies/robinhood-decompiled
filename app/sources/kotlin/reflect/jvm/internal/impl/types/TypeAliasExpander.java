package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;

/* compiled from: TypeAliasExpander.kt */
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class TypeAliasExpander {
    public static final Companion Companion = new Companion(null);
    private static final TypeAliasExpander NON_REPORTING = new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);
    private final TypeAliasExpansionReportStrategy reportStrategy;
    private final boolean shouldCheckBounds;

    public TypeAliasExpander(TypeAliasExpansionReportStrategy reportStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(reportStrategy, "reportStrategy");
        this.reportStrategy = reportStrategy;
        this.shouldCheckBounds = z;
    }

    public final KotlinType4 expand(TypeAliasExpansion typeAliasExpansion, TypeAttributes attributes) {
        Intrinsics.checkNotNullParameter(typeAliasExpansion, "typeAliasExpansion");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return expandRecursively(typeAliasExpansion, attributes, false, 0, true);
    }

    private final KotlinType4 expandRecursively(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z, int i, boolean z2) {
        TypeProjection typeProjectionExpandTypeProjection = expandTypeProjection(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i);
        KotlinType type2 = typeProjectionExpandTypeProjection.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        KotlinType4 kotlinType4AsSimpleType = TypeSubstitution7.asSimpleType(type2);
        if (KotlinType3.isError(kotlinType4AsSimpleType)) {
            return kotlinType4AsSimpleType;
        }
        typeProjectionExpandTypeProjection.getProjectionKind();
        checkRepeatedAnnotations(kotlinType4AsSimpleType.getAnnotations(), AnnotationsTypeAttribute2.getAnnotations(typeAttributes));
        KotlinType4 kotlinType4MakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(combineAttributes(kotlinType4AsSimpleType, typeAttributes), z);
        Intrinsics.checkNotNullExpressionValue(kotlinType4MakeNullableIfNeeded, "let(...)");
        return z2 ? SpecialTypes5.withAbbreviation(kotlinType4MakeNullableIfNeeded, createAbbreviation(typeAliasExpansion, typeAttributes, z)) : kotlinType4MakeNullableIfNeeded;
    }

    private final KotlinType4 createAbbreviation(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z) {
        TypeConstructor typeConstructor = typeAliasExpansion.getDescriptor().getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, typeAliasExpansion.getArguments(), z, MemberScope.Empty.INSTANCE);
    }

    private final TypeProjection expandTypeProjection(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i) {
        Variance variance;
        KotlinType kotlinTypeCombineNullabilityAndAnnotations;
        Variance variance2;
        Variance variance3;
        Companion.assertRecursionDepth(i, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            Intrinsics.checkNotNull(typeParameterDescriptor);
            TypeProjection typeProjectionMakeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            Intrinsics.checkNotNullExpressionValue(typeProjectionMakeStarProjection, "makeStarProjection(...)");
            return typeProjectionMakeStarProjection;
        }
        KotlinType type2 = typeProjection.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        TypeProjection replacement = typeAliasExpansion.getReplacement(type2.getConstructor());
        if (replacement == null) {
            return expandNonArgumentTypeProjection(typeProjection, typeAliasExpansion, i);
        }
        if (replacement.isStarProjection()) {
            Intrinsics.checkNotNull(typeParameterDescriptor);
            TypeProjection typeProjectionMakeStarProjection2 = TypeUtils.makeStarProjection(typeParameterDescriptor);
            Intrinsics.checkNotNullExpressionValue(typeProjectionMakeStarProjection2, "makeStarProjection(...)");
            return typeProjectionMakeStarProjection2;
        }
        KotlinType5 kotlinType5Unwrap = replacement.getType().unwrap();
        Variance projectionKind = replacement.getProjectionKind();
        Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
        Variance projectionKind2 = typeProjection.getProjectionKind();
        Intrinsics.checkNotNullExpressionValue(projectionKind2, "getProjectionKind(...)");
        if (projectionKind2 != projectionKind && projectionKind2 != (variance3 = Variance.INVARIANT)) {
            if (projectionKind == variance3) {
                projectionKind = projectionKind2;
            } else {
                this.reportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, kotlinType5Unwrap);
            }
        }
        if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
            variance = Variance.INVARIANT;
        }
        if (variance != projectionKind && variance != (variance2 = Variance.INVARIANT)) {
            if (projectionKind == variance2) {
                projectionKind = variance2;
            } else {
                this.reportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, kotlinType5Unwrap);
            }
        }
        checkRepeatedAnnotations(type2.getAnnotations(), kotlinType5Unwrap.getAnnotations());
        if (kotlinType5Unwrap instanceof dynamicTypes) {
            kotlinTypeCombineNullabilityAndAnnotations = combineAttributes((dynamicTypes) kotlinType5Unwrap, type2.getAttributes());
        } else {
            kotlinTypeCombineNullabilityAndAnnotations = combineNullabilityAndAnnotations(TypeSubstitution7.asSimpleType(kotlinType5Unwrap), type2);
        }
        return new TypeProjectionImpl(projectionKind, kotlinTypeCombineNullabilityAndAnnotations);
    }

    private final dynamicTypes combineAttributes(dynamicTypes dynamictypes, TypeAttributes typeAttributes) {
        return dynamictypes.replaceAttributes(createdCombinedAttributes(dynamictypes, typeAttributes));
    }

    private final KotlinType4 combineAttributes(KotlinType4 kotlinType4, TypeAttributes typeAttributes) {
        return KotlinType3.isError(kotlinType4) ? kotlinType4 : TypeSubstitution7.replace$default(kotlinType4, null, createdCombinedAttributes(kotlinType4, typeAttributes), 1, null);
    }

    private final TypeAttributes createdCombinedAttributes(KotlinType kotlinType, TypeAttributes typeAttributes) {
        return KotlinType3.isError(kotlinType) ? kotlinType.getAttributes() : typeAttributes.add(kotlinType.getAttributes());
    }

    private final void checkRepeatedAnnotations(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFqName());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.getFqName())) {
                this.reportStrategy.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    private final KotlinType4 combineNullability(KotlinType4 kotlinType4, KotlinType kotlinType) {
        KotlinType4 kotlinType4MakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(kotlinType4, kotlinType.isMarkedNullable());
        Intrinsics.checkNotNullExpressionValue(kotlinType4MakeNullableIfNeeded, "makeNullableIfNeeded(...)");
        return kotlinType4MakeNullableIfNeeded;
    }

    private final KotlinType4 combineNullabilityAndAnnotations(KotlinType4 kotlinType4, KotlinType kotlinType) {
        return combineAttributes(combineNullability(kotlinType4, kotlinType), kotlinType.getAttributes());
    }

    private final TypeProjection expandNonArgumentTypeProjection(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, int i) {
        KotlinType5 kotlinType5Unwrap = typeProjection.getType().unwrap();
        if (!dynamicTypes2.isDynamic(kotlinType5Unwrap)) {
            KotlinType4 kotlinType4AsSimpleType = TypeSubstitution7.asSimpleType(kotlinType5Unwrap);
            if (!KotlinType3.isError(kotlinType4AsSimpleType) && TypeUtils2.requiresTypeAliasExpansion(kotlinType4AsSimpleType)) {
                TypeConstructor constructor = kotlinType4AsSimpleType.getConstructor();
                ClassifierDescriptor classifierDescriptorMo28704getDeclarationDescriptor = constructor.mo28704getDeclarationDescriptor();
                constructor.getParameters().size();
                kotlinType4AsSimpleType.getArguments().size();
                if (!(classifierDescriptorMo28704getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                    if (classifierDescriptorMo28704getDeclarationDescriptor instanceof TypeAliasDescriptor) {
                        TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorMo28704getDeclarationDescriptor;
                        if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
                            this.reportStrategy.recursiveTypeAlias(typeAliasDescriptor);
                            return new TypeProjectionImpl(Variance.INVARIANT, ErrorUtils.createErrorType(ErrorTypeKind.RECURSIVE_TYPE_ALIAS, typeAliasDescriptor.getName().toString()));
                        }
                        List<TypeProjection> arguments = kotlinType4AsSimpleType.getArguments();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
                        int i2 = 0;
                        for (Object obj : arguments) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            arrayList.add(expandTypeProjection((TypeProjection) obj, typeAliasExpansion, constructor.getParameters().get(i2), i + 1));
                            i2 = i3;
                        }
                        KotlinType4 kotlinType4ExpandRecursively = expandRecursively(TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), kotlinType4AsSimpleType.getAttributes(), kotlinType4AsSimpleType.isMarkedNullable(), i + 1, false);
                        KotlinType4 kotlinType4SubstituteArguments = substituteArguments(kotlinType4AsSimpleType, typeAliasExpansion, i);
                        if (!dynamicTypes2.isDynamic(kotlinType4ExpandRecursively)) {
                            kotlinType4ExpandRecursively = SpecialTypes5.withAbbreviation(kotlinType4ExpandRecursively, kotlinType4SubstituteArguments);
                        }
                        return new TypeProjectionImpl(typeProjection.getProjectionKind(), kotlinType4ExpandRecursively);
                    }
                    KotlinType4 kotlinType4SubstituteArguments2 = substituteArguments(kotlinType4AsSimpleType, typeAliasExpansion, i);
                    checkTypeArgumentsSubstitution(kotlinType4AsSimpleType, kotlinType4SubstituteArguments2);
                    return new TypeProjectionImpl(typeProjection.getProjectionKind(), kotlinType4SubstituteArguments2);
                }
            }
        }
        return typeProjection;
    }

    private final KotlinType4 substituteArguments(KotlinType4 kotlinType4, TypeAliasExpansion typeAliasExpansion, int i) {
        TypeConstructor constructor = kotlinType4.getConstructor();
        List<TypeProjection> arguments = kotlinType4.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        int i2 = 0;
        for (Object obj : arguments) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionExpandTypeProjection = expandTypeProjection(typeProjection, typeAliasExpansion, constructor.getParameters().get(i2), i + 1);
            if (!typeProjectionExpandTypeProjection.isStarProjection()) {
                typeProjectionExpandTypeProjection = new TypeProjectionImpl(typeProjectionExpandTypeProjection.getProjectionKind(), TypeUtils.makeNullableIfNeeded(typeProjectionExpandTypeProjection.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(typeProjectionExpandTypeProjection);
            i2 = i3;
        }
        return TypeSubstitution7.replace$default(kotlinType4, arrayList, null, 2, null);
    }

    private final void checkTypeArgumentsSubstitution(KotlinType kotlinType, KotlinType kotlinType2) {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(kotlinType2);
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorCreate, "create(...)");
        int i = 0;
        for (Object obj : kotlinType2.getArguments()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (!typeProjection.isStarProjection()) {
                KotlinType type2 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                if (!TypeUtils2.containsTypeAliasParameters(type2)) {
                    TypeProjection typeProjection2 = kotlinType.getArguments().get(i);
                    TypeParameterDescriptor typeParameterDescriptor = kotlinType.getConstructor().getParameters().get(i);
                    if (this.shouldCheckBounds) {
                        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.reportStrategy;
                        KotlinType type3 = typeProjection2.getType();
                        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                        KotlinType type4 = typeProjection.getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        Intrinsics.checkNotNull(typeParameterDescriptor);
                        typeAliasExpansionReportStrategy.boundsViolationInSubstitution(typeSubstitutorCreate, type3, type4, typeParameterDescriptor);
                    }
                }
            }
            i = i2;
        }
    }

    /* compiled from: TypeAliasExpander.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void assertRecursionDepth(int i, TypeAliasDescriptor typeAliasDescriptor) {
            if (i <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor.getName());
        }
    }
}
