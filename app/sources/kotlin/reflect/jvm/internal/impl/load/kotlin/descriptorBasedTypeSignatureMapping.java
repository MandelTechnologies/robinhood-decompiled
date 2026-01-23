package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.robinhood.android.tickerinputview.TickerInputView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.functionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.suspendFunctionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.inlineClassesUtils;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker4;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.expandedTypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;
import kotlin.reflect.jvm.internal.impl.utils.functions;
import kotlin.text.StringsKt;

/* compiled from: descriptorBasedTypeSignatureMapping.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.DescriptorBasedTypeSignatureMappingKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class descriptorBasedTypeSignatureMapping {
    public static /* synthetic */ Object mapType$default(KotlinType kotlinType, typeSignatureMapping2 typesignaturemapping2, TypeMappingMode typeMappingMode, descriptorBasedTypeSignatureMapping2 descriptorbasedtypesignaturemapping2, typeSignatureMapping typesignaturemapping, Function3 function3, int i, Object obj) {
        if ((i & 32) != 0) {
            function3 = functions.getDO_NOTHING_3();
        }
        return mapType(kotlinType, typesignaturemapping2, typeMappingMode, descriptorbasedtypesignaturemapping2, typesignaturemapping, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v31, types: [T, java.lang.Object] */
    public static final <T> T mapType(KotlinType kotlinType, typeSignatureMapping2<T> factory, TypeMappingMode mode, descriptorBasedTypeSignatureMapping2<? extends T> typeMappingConfiguration, typeSignatureMapping<T> typesignaturemapping, Function3<? super KotlinType, ? super T, ? super TypeMappingMode, Unit> writeGenericType) {
        T predefinedTypeForClass;
        KotlinType kotlinType2;
        Object objMapType;
        Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        Intrinsics.checkNotNullParameter(writeGenericType, "writeGenericType");
        KotlinType kotlinTypePreprocessType = typeMappingConfiguration.preprocessType(kotlinType);
        if (kotlinTypePreprocessType != null) {
            return (T) mapType(kotlinTypePreprocessType, factory, mode, typeMappingConfiguration, typesignaturemapping, writeGenericType);
        }
        if (functionTypes.isSuspendFunctionType(kotlinType)) {
            return (T) mapType(suspendFunctionTypes.transformSuspendFunctionToRuntimeFunctionType(kotlinType), factory, mode, typeMappingConfiguration, typesignaturemapping, writeGenericType);
        }
        NewKotlinTypeChecker4 newKotlinTypeChecker4 = NewKotlinTypeChecker4.INSTANCE;
        Object objMapBuiltInType = typeSignatureMapping3.mapBuiltInType(newKotlinTypeChecker4, kotlinType, factory, mode);
        if (objMapBuiltInType != null) {
            ?? r8 = (Object) typeSignatureMapping3.boxTypeIfNeeded(factory, objMapBuiltInType, mode.getNeedPrimitiveBoxing());
            writeGenericType.invoke(kotlinType, r8, mode);
            return r8;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
            KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
            if (alternativeType == null) {
                alternativeType = typeMappingConfiguration.commonSupertype(intersectionTypeConstructor.mo28705getSupertypes());
            }
            return (T) mapType(TypeUtils2.replaceArgumentsWithStarProjections(alternativeType), factory, mode, typeMappingConfiguration, typesignaturemapping, writeGenericType);
        }
        ClassifierDescriptor classifierDescriptorMo28704getDeclarationDescriptor = constructor.mo28704getDeclarationDescriptor();
        if (classifierDescriptorMo28704getDeclarationDescriptor == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (ErrorUtils.isError(classifierDescriptorMo28704getDeclarationDescriptor)) {
            T t = (T) factory.createObjectType("error/NonExistentClass");
            typeMappingConfiguration.processErrorType(kotlinType, (ClassDescriptor) classifierDescriptorMo28704getDeclarationDescriptor);
            if (typesignaturemapping != 0) {
                typesignaturemapping.writeClass(t);
            }
            return t;
        }
        boolean z = classifierDescriptorMo28704getDeclarationDescriptor instanceof ClassDescriptor;
        if (z && KotlinBuiltIns.isArray(kotlinType)) {
            if (kotlinType.getArguments().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            TypeProjection typeProjection = kotlinType.getArguments().get(0);
            KotlinType type2 = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            if (typeProjection.getProjectionKind() == Variance.IN_VARIANCE) {
                objMapType = factory.createObjectType("java/lang/Object");
                if (typesignaturemapping != 0) {
                    typesignaturemapping.writeArrayType();
                    typesignaturemapping.writeClass(objMapType);
                    typesignaturemapping.writeArrayEnd();
                }
            } else {
                if (typesignaturemapping != 0) {
                    typesignaturemapping.writeArrayType();
                }
                Variance projectionKind = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                objMapType = mapType(type2, factory, mode.toGenericArgumentMode(projectionKind, true), typeMappingConfiguration, typesignaturemapping, writeGenericType);
                if (typesignaturemapping != 0) {
                    typesignaturemapping.writeArrayEnd();
                }
            }
            return (T) factory.createFromString('[' + factory.toString(objMapType));
        }
        if (z) {
            if (inlineClassesUtils.isInlineClass(classifierDescriptorMo28704getDeclarationDescriptor) && !mode.getNeedInlineClassWrapping() && (kotlinType2 = (KotlinType) expandedTypeUtils.computeExpandedTypeForInlineClass(newKotlinTypeChecker4, kotlinType)) != null) {
                return (T) mapType(kotlinType2, factory, mode.wrapInlineClassesMode(), typeMappingConfiguration, typesignaturemapping, writeGenericType);
            }
            if (mode.isForAnnotationParameter() && KotlinBuiltIns.isKClass((ClassDescriptor) classifierDescriptorMo28704getDeclarationDescriptor)) {
                predefinedTypeForClass = (Object) factory.getJavaLangClassType();
            } else {
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo28704getDeclarationDescriptor;
                ClassDescriptor original = classDescriptor.getOriginal();
                Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
                predefinedTypeForClass = typeMappingConfiguration.getPredefinedTypeForClass(original);
                if (predefinedTypeForClass == null) {
                    if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
                        DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
                        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        classDescriptor = (ClassDescriptor) containingDeclaration;
                    }
                    ClassDescriptor original2 = classDescriptor.getOriginal();
                    Intrinsics.checkNotNullExpressionValue(original2, "getOriginal(...)");
                    predefinedTypeForClass = (Object) factory.createObjectType(computeInternalName(original2, typeMappingConfiguration));
                }
            }
            writeGenericType.invoke(kotlinType, predefinedTypeForClass, mode);
            return predefinedTypeForClass;
        }
        if (classifierDescriptorMo28704getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            KotlinType representativeUpperBound = TypeUtils2.getRepresentativeUpperBound((TypeParameterDescriptor) classifierDescriptorMo28704getDeclarationDescriptor);
            if (kotlinType.isMarkedNullable()) {
                representativeUpperBound = TypeUtils2.makeNullable(representativeUpperBound);
            }
            T t2 = (T) mapType(representativeUpperBound, factory, mode, typeMappingConfiguration, null, functions.getDO_NOTHING_3());
            if (typesignaturemapping != 0) {
                Name name = classifierDescriptorMo28704getDeclarationDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                typesignaturemapping.writeTypeVariable(name, t2);
            }
            return t2;
        }
        if ((classifierDescriptorMo28704getDeclarationDescriptor instanceof TypeAliasDescriptor) && mode.getMapTypeAliases()) {
            return (T) mapType(((TypeAliasDescriptor) classifierDescriptorMo28704getDeclarationDescriptor).getExpandedType(), factory, mode, typeMappingConfiguration, typesignaturemapping, writeGenericType);
        }
        throw new UnsupportedOperationException("Unknown type " + kotlinType);
    }

    public static final boolean hasVoidReturnType(CallableDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        if (!KotlinBuiltIns.isUnit(returnType)) {
            return false;
        }
        KotlinType returnType2 = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType2);
        return (TypeUtils.isNullableType(returnType2) || (descriptor instanceof PropertyGetterDescriptor)) ? false : true;
    }

    public static /* synthetic */ String computeInternalName$default(ClassDescriptor classDescriptor, descriptorBasedTypeSignatureMapping2 descriptorbasedtypesignaturemapping2, int i, Object obj) {
        if ((i & 2) != 0) {
            descriptorbasedtypesignaturemapping2 = methodSignatureMapping4.INSTANCE;
        }
        return computeInternalName(classDescriptor, descriptorbasedtypesignaturemapping2);
    }

    public static final String computeInternalName(ClassDescriptor klass, descriptorBasedTypeSignatureMapping2<?> typeMappingConfiguration) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        String predefinedFullInternalNameForClass = typeMappingConfiguration.getPredefinedFullInternalNameForClass(klass);
        if (predefinedFullInternalNameForClass != null) {
            return predefinedFullInternalNameForClass;
        }
        DeclarationDescriptor containingDeclaration = klass.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
        String identifier = SpecialNames.safeIdentifier(klass.getName()).getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "getIdentifier(...)");
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
            if (fqName.isRoot()) {
                return identifier;
            }
            return StringsKt.replace$default(fqName.asString(), '.', '/', false, 4, (Object) null) + '/' + identifier;
        }
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            throw new IllegalArgumentException("Unexpected container: " + containingDeclaration + " for " + klass);
        }
        String predefinedInternalNameForClass = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor);
        if (predefinedInternalNameForClass == null) {
            predefinedInternalNameForClass = computeInternalName(classDescriptor, typeMappingConfiguration);
        }
        return predefinedInternalNameForClass + TickerInputView.CURRENCY_SYMBOL + identifier;
    }
}
