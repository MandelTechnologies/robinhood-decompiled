package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.context4;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.resolvers2;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.javaTypes;
import kotlin.reflect.jvm.internal.impl.load.java.structure.javaTypes2;
import kotlin.reflect.jvm.internal.impl.load.java.structure.javaTypes3;
import kotlin.reflect.jvm.internal.impl.load.java.structure.javaTypes4;
import kotlin.reflect.jvm.internal.impl.load.java.structure.javaTypes5;
import kotlin.reflect.jvm.internal.impl.load.java.structure.javaTypes6;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType4;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypes4;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes3;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;

/* compiled from: JavaTypeResolver.kt */
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class JavaTypeResolver {

    /* renamed from: c */
    private final context4 f7024c;
    private final RawProjectionComputer projectionComputer;
    private final resolvers2 typeParameterResolver;
    private final TypeParameterUpperBoundEraser typeParameterUpperBoundEraser;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(context4 c, resolvers2 typeParameterResolver) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        this.f7024c = c;
        this.typeParameterResolver = typeParameterResolver;
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.projectionComputer = rawProjectionComputer;
        this.typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
    }

    public final KotlinType transformJavaType(javaTypes4 javatypes4, JavaTypeAttributes attr) {
        KotlinType kotlinTypeTransformJavaType;
        KotlinType4 unitType;
        Intrinsics.checkNotNullParameter(attr, "attr");
        if (javatypes4 instanceof javaTypes3) {
            PrimitiveType type2 = ((javaTypes3) javatypes4).getType();
            if (type2 != null) {
                unitType = this.f7024c.getModule().getBuiltIns().getPrimitiveKotlinType(type2);
            } else {
                unitType = this.f7024c.getModule().getBuiltIns().getUnitType();
            }
            Intrinsics.checkNotNull(unitType);
            return unitType;
        }
        if (javatypes4 instanceof javaTypes2) {
            return transformJavaClassifierType((javaTypes2) javatypes4, attr);
        }
        if (javatypes4 instanceof javaTypes) {
            return transformArrayType$default(this, (javaTypes) javatypes4, attr, false, 4, null);
        }
        if (javatypes4 instanceof javaTypes6) {
            javaTypes4 bound = ((javaTypes6) javatypes4).getBound();
            if (bound != null && (kotlinTypeTransformJavaType = transformJavaType(bound, attr)) != null) {
                return kotlinTypeTransformJavaType;
            }
            KotlinType4 defaultBound = this.f7024c.getModule().getBuiltIns().getDefaultBound();
            Intrinsics.checkNotNullExpressionValue(defaultBound, "getDefaultBound(...)");
            return defaultBound;
        }
        if (javatypes4 == null) {
            KotlinType4 defaultBound2 = this.f7024c.getModule().getBuiltIns().getDefaultBound();
            Intrinsics.checkNotNullExpressionValue(defaultBound2, "getDefaultBound(...)");
            return defaultBound2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + javatypes4);
    }

    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, javaTypes javatypes, JavaTypeAttributes javaTypeAttributes, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.transformArrayType(javatypes, javaTypeAttributes, z);
    }

    public final KotlinType transformArrayType(javaTypes arrayType, JavaTypeAttributes attr, boolean z) {
        Intrinsics.checkNotNullParameter(arrayType, "arrayType");
        Intrinsics.checkNotNullParameter(attr, "attr");
        javaTypes4 componentType = arrayType.getComponentType();
        javaTypes3 javatypes3 = componentType instanceof javaTypes3 ? (javaTypes3) componentType : null;
        PrimitiveType type2 = javatypes3 != null ? javatypes3.getType() : null;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.f7024c, arrayType, true);
        if (type2 != null) {
            KotlinType4 primitiveArrayKotlinType = this.f7024c.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type2);
            Intrinsics.checkNotNull(primitiveArrayKotlinType);
            KotlinType kotlinTypeReplaceAnnotations = TypeUtils2.replaceAnnotations(primitiveArrayKotlinType, new CompositeAnnotations(primitiveArrayKotlinType.getAnnotations(), lazyJavaAnnotations));
            Intrinsics.checkNotNull(kotlinTypeReplaceAnnotations, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            KotlinType4 kotlinType4 = (KotlinType4) kotlinTypeReplaceAnnotations;
            return attr.isForAnnotationParameter() ? kotlinType4 : KotlinTypeFactory.flexibleType(kotlinType4, kotlinType4.makeNullableAsSpecified(true));
        }
        KotlinType kotlinTypeTransformJavaType = transformJavaType(componentType, JavaTypeAttributes2.toAttributes$default(TypeUsage.COMMON, attr.isForAnnotationParameter(), false, null, 6, null));
        if (attr.isForAnnotationParameter()) {
            KotlinType4 arrayType2 = this.f7024c.getModule().getBuiltIns().getArrayType(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, kotlinTypeTransformJavaType, lazyJavaAnnotations);
            Intrinsics.checkNotNullExpressionValue(arrayType2, "getArrayType(...)");
            return arrayType2;
        }
        KotlinType4 arrayType3 = this.f7024c.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, kotlinTypeTransformJavaType, lazyJavaAnnotations);
        Intrinsics.checkNotNullExpressionValue(arrayType3, "getArrayType(...)");
        return KotlinTypeFactory.flexibleType(arrayType3, this.f7024c.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, kotlinTypeTransformJavaType, lazyJavaAnnotations).makeNullableAsSpecified(true));
    }

    private static final ErrorType transformJavaClassifierType$errorType(javaTypes2 javatypes2) {
        return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javatypes2.getPresentableText());
    }

    private final KotlinType transformJavaClassifierType(javaTypes2 javatypes2, JavaTypeAttributes javaTypeAttributes) {
        boolean z = (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
        boolean zIsRaw = javatypes2.isRaw();
        if (!zIsRaw && !z) {
            KotlinType4 kotlinType4ComputeSimpleJavaClassifierType = computeSimpleJavaClassifierType(javatypes2, javaTypeAttributes, null);
            return kotlinType4ComputeSimpleJavaClassifierType != null ? kotlinType4ComputeSimpleJavaClassifierType : transformJavaClassifierType$errorType(javatypes2);
        }
        KotlinType4 kotlinType4ComputeSimpleJavaClassifierType2 = computeSimpleJavaClassifierType(javatypes2, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (kotlinType4ComputeSimpleJavaClassifierType2 == null) {
            return transformJavaClassifierType$errorType(javatypes2);
        }
        KotlinType4 kotlinType4ComputeSimpleJavaClassifierType3 = computeSimpleJavaClassifierType(javatypes2, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), kotlinType4ComputeSimpleJavaClassifierType2);
        if (kotlinType4ComputeSimpleJavaClassifierType3 == null) {
            return transformJavaClassifierType$errorType(javatypes2);
        }
        if (zIsRaw) {
            return new RawType2(kotlinType4ComputeSimpleJavaClassifierType2, kotlinType4ComputeSimpleJavaClassifierType3);
        }
        return KotlinTypeFactory.flexibleType(kotlinType4ComputeSimpleJavaClassifierType2, kotlinType4ComputeSimpleJavaClassifierType3);
    }

    private final KotlinType4 computeSimpleJavaClassifierType(javaTypes2 javatypes2, JavaTypeAttributes javaTypeAttributes, KotlinType4 kotlinType4) {
        javaTypes2 javatypes22;
        TypeAttributes defaultAttributes;
        if (kotlinType4 == null || (defaultAttributes = kotlinType4.getAttributes()) == null) {
            javatypes22 = javatypes2;
            defaultAttributes = TypeAttributes3.toDefaultAttributes(new LazyJavaAnnotations(this.f7024c, javatypes22, false, 4, null));
        } else {
            javatypes22 = javatypes2;
        }
        TypeAttributes typeAttributes = defaultAttributes;
        TypeConstructor typeConstructorComputeTypeConstructor = computeTypeConstructor(javatypes22, javaTypeAttributes);
        if (typeConstructorComputeTypeConstructor == null) {
            return null;
        }
        boolean zIsNullable = isNullable(javaTypeAttributes);
        if (Intrinsics.areEqual(kotlinType4 != null ? kotlinType4.getConstructor() : null, typeConstructorComputeTypeConstructor) && !javatypes22.isRaw() && zIsNullable) {
            return kotlinType4.makeNullableAsSpecified(true);
        }
        return KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructorComputeTypeConstructor, computeArguments(javatypes22, javaTypeAttributes, typeConstructorComputeTypeConstructor), zIsNullable, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    private final TypeConstructor computeTypeConstructor(javaTypes2 javatypes2, JavaTypeAttributes javaTypeAttributes) {
        TypeConstructor typeConstructor;
        JavaClassifier classifier = javatypes2.getClassifier();
        if (classifier == null) {
            return createNotFoundClass(javatypes2);
        }
        if (classifier instanceof JavaClass) {
            JavaClass javaClass = (JavaClass) classifier;
            FqName fqName = javaClass.getFqName();
            if (fqName == null) {
                throw new AssertionError("Class type should have a FQ name: " + classifier);
            }
            ClassDescriptor classDescriptorMapKotlinClass = mapKotlinClass(javatypes2, javaTypeAttributes, fqName);
            if (classDescriptorMapKotlinClass == null) {
                classDescriptorMapKotlinClass = this.f7024c.getComponents().getModuleClassResolver().resolveClass(javaClass);
            }
            return (classDescriptorMapKotlinClass == null || (typeConstructor = classDescriptorMapKotlinClass.getTypeConstructor()) == null) ? createNotFoundClass(javatypes2) : typeConstructor;
        }
        if (classifier instanceof JavaTypeParameter) {
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = this.typeParameterResolver.resolveTypeParameter((JavaTypeParameter) classifier);
            if (typeParameterDescriptorResolveTypeParameter != null) {
                return typeParameterDescriptorResolveTypeParameter.getTypeConstructor();
            }
            return null;
        }
        throw new IllegalStateException("Unknown classifier kind: " + classifier);
    }

    private final TypeConstructor createNotFoundClass(javaTypes2 javatypes2) {
        TypeConstructor typeConstructor = this.f7024c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(ClassId.Companion.topLevel(new FqName(javatypes2.getClassifierQualifiedName())), CollectionsKt.listOf(0)).getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    private final ClassDescriptor mapKotlinClass(javaTypes2 javatypes2, JavaTypeAttributes javaTypeAttributes, FqName fqName) {
        if (javaTypeAttributes.isForAnnotationParameter() && Intrinsics.areEqual(fqName, JavaTypeResolver2.JAVA_LANG_CLASS_FQ_NAME)) {
            return this.f7024c.getComponents().getReflectionTypes().getKClass();
        }
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
        ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName, this.f7024c.getModule().getBuiltIns(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return null;
        }
        return (javaToKotlinClassMapper.isReadOnly(classDescriptorMapJavaToKotlin$default) && (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE || argumentsMakeSenseOnlyForMutableContainer(javatypes2, classDescriptorMapJavaToKotlin$default))) ? javaToKotlinClassMapper.convertReadOnlyToMutable(classDescriptorMapJavaToKotlin$default) : classDescriptorMapJavaToKotlin$default;
    }

    private final boolean argumentsMakeSenseOnlyForMutableContainer(javaTypes2 javatypes2, ClassDescriptor classDescriptor) {
        Variance variance;
        if (!javaTypes5.isSuperWildcard((javaTypes4) CollectionsKt.lastOrNull((List) javatypes2.getTypeArguments()))) {
            return false;
        }
        List<TypeParameterDescriptor> parameters = JavaToKotlinClassMapper.INSTANCE.convertReadOnlyToMutable(classDescriptor).getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull((List) parameters);
        return (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null || variance == Variance.OUT_VARIANCE) ? false : true;
    }

    private final List<TypeProjection> computeRawTypeArguments(javaTypes2 javatypes2, List<? extends TypeParameterDescriptor> list, TypeConstructor typeConstructor, JavaTypeAttributes javaTypeAttributes) {
        final javaTypes2 javatypes22;
        final TypeConstructor typeConstructor2;
        final JavaTypeAttributes javaTypeAttributes2;
        TypeProjection typeProjectionComputeProjection;
        List<? extends TypeParameterDescriptor> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (final TypeParameterDescriptor typeParameterDescriptor : list2) {
            if (TypeUtils2.hasTypeParameterRecursiveBounds(typeParameterDescriptor, null, javaTypeAttributes.getVisitedTypeParameters())) {
                typeProjectionComputeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
                javatypes22 = javatypes2;
                typeConstructor2 = typeConstructor;
                javaTypeAttributes2 = javaTypeAttributes;
            } else {
                javatypes22 = javatypes2;
                typeConstructor2 = typeConstructor;
                javaTypeAttributes2 = javaTypeAttributes;
                typeProjectionComputeProjection = this.projectionComputer.computeProjection(typeParameterDescriptor, javaTypeAttributes2.markIsRaw(javatypes22.isRaw()), this.typeParameterUpperBoundEraser, new SpecialTypes4(this.f7024c.getStorageManager(), new Function0(this, typeParameterDescriptor, javaTypeAttributes2, typeConstructor2, javatypes22) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$$Lambda$0
                    private final JavaTypeResolver arg$0;
                    private final TypeParameterDescriptor arg$1;
                    private final JavaTypeAttributes arg$2;
                    private final TypeConstructor arg$3;
                    private final javaTypes2 arg$4;

                    {
                        this.arg$0 = this;
                        this.arg$1 = typeParameterDescriptor;
                        this.arg$2 = javaTypeAttributes2;
                        this.arg$3 = typeConstructor2;
                        this.arg$4 = javatypes22;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return JavaTypeResolver.computeRawTypeArguments$lambda$4$lambda$3(this.arg$0, this.arg$1, this.arg$2, this.arg$3, this.arg$4);
                    }
                }));
            }
            arrayList.add(typeProjectionComputeProjection);
            javaTypeAttributes = javaTypeAttributes2;
            typeConstructor = typeConstructor2;
            javatypes2 = javatypes22;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType computeRawTypeArguments$lambda$4$lambda$3(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, javaTypes2 javatypes2) {
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = javaTypeResolver.typeParameterUpperBoundEraser;
        ClassifierDescriptor classifierDescriptorMo28704getDeclarationDescriptor = typeConstructor.mo28704getDeclarationDescriptor();
        return typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor, javaTypeAttributes.withDefaultType(classifierDescriptorMo28704getDeclarationDescriptor != null ? classifierDescriptorMo28704getDeclarationDescriptor.getDefaultType() : null).markIsRaw(javatypes2.isRaw()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<TypeProjection> computeArguments(javaTypes2 javatypes2, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor) {
        boolean z;
        if (javatypes2.isRaw()) {
            z = true;
        } else {
            if (javatypes2.getTypeArguments().isEmpty()) {
                List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                if (!parameters.isEmpty()) {
                }
            }
            z = false;
        }
        List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
        if (z) {
            return computeRawTypeArguments(javatypes2, parameters2, typeConstructor, javaTypeAttributes);
        }
        if (parameters2.size() != javatypes2.getTypeArguments().size()) {
            List<TypeParameterDescriptor> list = parameters2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, ((TypeParameterDescriptor) it.next()).getName().asString())));
            }
            return CollectionsKt.toList(arrayList);
        }
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(javatypes2.getTypeArguments());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            int index = indexedValue.getIndex();
            javaTypes4 javatypes4 = (javaTypes4) indexedValue.component2();
            parameters2.size();
            TypeParameterDescriptor typeParameterDescriptor = parameters2.get(index);
            JavaTypeAttributes attributes$default = JavaTypeAttributes2.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            Intrinsics.checkNotNull(typeParameterDescriptor);
            arrayList2.add(transformToTypeProjection(javatypes4, attributes$default, typeParameterDescriptor));
        }
        return CollectionsKt.toList(arrayList2);
    }

    private final TypeProjection transformToTypeProjection(javaTypes4 javatypes4, JavaTypeAttributes javaTypeAttributes, TypeParameterDescriptor typeParameterDescriptor) {
        if (javatypes4 instanceof javaTypes6) {
            javaTypes6 javatypes6 = (javaTypes6) javatypes4;
            javaTypes4 bound = javatypes6.getBound();
            Variance variance = javatypes6.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
            if (bound == null || isConflictingArgumentFor(variance, typeParameterDescriptor)) {
                TypeProjection typeProjectionMakeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
                Intrinsics.checkNotNullExpressionValue(typeProjectionMakeStarProjection, "makeStarProjection(...)");
                return typeProjectionMakeStarProjection;
            }
            AnnotationDescriptor annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard = UtilsKt.extractNullabilityAnnotationOnBoundedWildcard(this.f7024c, javatypes6);
            KotlinType kotlinTypeTransformJavaType = transformJavaType(bound, JavaTypeAttributes2.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
            if (annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard != null) {
                kotlinTypeTransformJavaType = TypeUtils2.replaceAnnotations(kotlinTypeTransformJavaType, Annotations.Companion.create(CollectionsKt.plus(kotlinTypeTransformJavaType.getAnnotations(), annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard)));
            }
            return TypeUtils2.createProjection(kotlinTypeTransformJavaType, variance, typeParameterDescriptor);
        }
        return new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javatypes4, javaTypeAttributes));
    }

    private final boolean isConflictingArgumentFor(Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        return (typeParameterDescriptor.getVariance() == Variance.INVARIANT || variance == typeParameterDescriptor.getVariance()) ? false : true;
    }

    private final boolean isNullable(JavaTypeAttributes javaTypeAttributes) {
        return (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
    }
}
