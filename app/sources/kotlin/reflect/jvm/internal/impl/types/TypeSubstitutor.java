package kotlin.reflect.jvm.internal.impl.types;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor4;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType2;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximation2;
import kotlin.reflect.jvm.internal.impl.utils.exceptionUtils;

/* loaded from: classes14.dex */
public class TypeSubstitutor {
    public static final TypeSubstitutor EMPTY = create(TypeSubstitution.EMPTY);
    private final TypeSubstitution substitution;

    private enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                            }
                    }
            }
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = AnalyticsStrings.BUTTON_NEW_LIST_CREATE;
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                            }
                    }
            }
        }
        throw new IllegalStateException(str2);
    }

    private static final class SubstitutionException extends Exception {
        public SubstitutionException(String str) {
            super(str);
        }
    }

    public static TypeSubstitutor create(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(0);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    public TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        TypeSubstitution typeSubstitution = this.substitution;
        return ((typeSubstitution instanceof TypeSubstitution3) && typeSubstitution.approximateContravariantCapturedTypes()) ? new TypeSubstitutor(new TypeSubstitution3(((TypeSubstitution3) this.substitution).getParameters(), ((TypeSubstitution3) this.substitution).getArguments(), false)) : this;
    }

    public static TypeSubstitutor createChainedSubstitutor(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(3);
        }
        if (typeSubstitution2 == null) {
            $$$reportNull$$$0(4);
        }
        return create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
    }

    public static TypeSubstitutor create(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(6);
        }
        return create(TypeSubstitution4.create(kotlinType.getConstructor(), kotlinType.getArguments()));
    }

    protected TypeSubstitutor(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(7);
        }
        this.substitution = typeSubstitution;
    }

    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    public TypeSubstitution getSubstitution() {
        TypeSubstitution typeSubstitution = this.substitution;
        if (typeSubstitution == null) {
            $$$reportNull$$$0(8);
        }
        return typeSubstitution;
    }

    public KotlinType safeSubstitute(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            $$$reportNull$$$0(9);
        }
        if (variance == null) {
            $$$reportNull$$$0(10);
        }
        if (isEmpty()) {
            if (kotlinType == null) {
                $$$reportNull$$$0(11);
            }
            return kotlinType;
        }
        try {
            KotlinType type2 = unsafeSubstitute(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type2 == null) {
                $$$reportNull$$$0(12);
            }
            return type2;
        } catch (SubstitutionException e) {
            ErrorType errorTypeCreateErrorType = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (errorTypeCreateErrorType == null) {
                $$$reportNull$$$0(13);
            }
            return errorTypeCreateErrorType;
        }
    }

    public KotlinType substitute(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            $$$reportNull$$$0(14);
        }
        if (variance == null) {
            $$$reportNull$$$0(15);
        }
        TypeProjection typeProjectionSubstitute = substitute(new TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (typeProjectionSubstitute == null) {
            return null;
        }
        return typeProjectionSubstitute.getType();
    }

    public TypeProjection substitute(TypeProjection typeProjection) {
        if (typeProjection == null) {
            $$$reportNull$$$0(16);
        }
        TypeProjection typeProjectionSubstituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
        return (this.substitution.approximateCapturedTypes() || this.substitution.approximateContravariantCapturedTypes()) ? CapturedTypeApproximation2.approximateCapturedTypesIfNecessary(typeProjectionSubstituteWithoutApproximation, this.substitution.approximateContravariantCapturedTypes()) : typeProjectionSubstituteWithoutApproximation;
    }

    public TypeProjection substituteWithoutApproximation(TypeProjection typeProjection) {
        if (typeProjection == null) {
            $$$reportNull$$$0(17);
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return unsafeSubstitute(typeProjection, null, 0);
        } catch (SubstitutionException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeProjection unsafeSubstitute(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, int i) throws SubstitutionException {
        KotlinType kotlinTypeMakeNullableIfNeeded;
        if (typeProjection == null) {
            $$$reportNull$$$0(18);
        }
        assertRecursionDepth(i, typeProjection, this.substitution);
        if (!typeProjection.isStarProjection()) {
            KotlinType type2 = typeProjection.getType();
            if (type2 instanceof TypeWithEnhancement) {
                TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type2;
                KotlinType5 origin = typeWithEnhancement.getOrigin();
                KotlinType enhancement = typeWithEnhancement.getEnhancement();
                TypeProjection typeProjectionUnsafeSubstitute = unsafeSubstitute(new TypeProjectionImpl(typeProjection.getProjectionKind(), origin), typeParameterDescriptor, i + 1);
                return typeProjectionUnsafeSubstitute.isStarProjection() ? typeProjectionUnsafeSubstitute : new TypeProjectionImpl(typeProjectionUnsafeSubstitute.getProjectionKind(), TypeWithEnhancement4.wrapEnhancement(typeProjectionUnsafeSubstitute.getType().unwrap(), substitute(enhancement, typeProjection.getProjectionKind())));
            }
            if (!dynamicTypes2.isDynamic(type2) && !(type2.unwrap() instanceof RawType)) {
                TypeProjection typeProjectionMo28709get = this.substitution.mo28709get(type2);
                TypeProjection typeProjectionProjectedTypeForConflictedTypeWithUnsafeVariance = typeProjectionMo28709get != null ? projectedTypeForConflictedTypeWithUnsafeVariance(type2, typeProjectionMo28709get, typeParameterDescriptor, typeProjection) : null;
                Variance projectionKind = typeProjection.getProjectionKind();
                if (typeProjectionProjectedTypeForConflictedTypeWithUnsafeVariance == null && flexibleTypes2.isFlexible(type2) && !TypeCapabilities3.isCustomTypeParameter(type2)) {
                    KotlinType2 kotlinType2AsFlexibleType = flexibleTypes2.asFlexibleType(type2);
                    int i2 = i + 1;
                    TypeProjection typeProjectionUnsafeSubstitute2 = unsafeSubstitute(new TypeProjectionImpl(projectionKind, kotlinType2AsFlexibleType.getLowerBound()), typeParameterDescriptor, i2);
                    TypeProjection typeProjectionUnsafeSubstitute3 = unsafeSubstitute(new TypeProjectionImpl(projectionKind, kotlinType2AsFlexibleType.getUpperBound()), typeParameterDescriptor, i2);
                    Variance projectionKind2 = typeProjectionUnsafeSubstitute2.getProjectionKind();
                    if (typeProjectionUnsafeSubstitute2.getType() != kotlinType2AsFlexibleType.getLowerBound() || typeProjectionUnsafeSubstitute3.getType() != kotlinType2AsFlexibleType.getUpperBound()) {
                        return new TypeProjectionImpl(projectionKind2, KotlinTypeFactory.flexibleType(TypeSubstitution7.asSimpleType(typeProjectionUnsafeSubstitute2.getType()), TypeSubstitution7.asSimpleType(typeProjectionUnsafeSubstitute3.getType())));
                    }
                } else if (!KotlinBuiltIns.isNothing(type2) && !KotlinType3.isError(type2)) {
                    if (typeProjectionProjectedTypeForConflictedTypeWithUnsafeVariance != null) {
                        VarianceConflictType varianceConflictTypeConflictType = conflictType(projectionKind, typeProjectionProjectedTypeForConflictedTypeWithUnsafeVariance.getProjectionKind());
                        if (!CapturedTypeConstructor4.isCaptured(type2)) {
                            int i3 = C460052.f7035x4790888d[varianceConflictTypeConflictType.ordinal()];
                            if (i3 == 1) {
                                throw new SubstitutionException("Out-projection in in-position");
                            }
                            if (i3 == 2) {
                                return new TypeProjectionImpl(Variance.OUT_VARIANCE, type2.getConstructor().getBuiltIns().getNullableAnyType());
                            }
                        }
                        TypeCapabilities customTypeParameter = TypeCapabilities3.getCustomTypeParameter(type2);
                        if (typeProjectionProjectedTypeForConflictedTypeWithUnsafeVariance.isStarProjection()) {
                            return typeProjectionProjectedTypeForConflictedTypeWithUnsafeVariance;
                        }
                        if (customTypeParameter != null) {
                            kotlinTypeMakeNullableIfNeeded = customTypeParameter.substitutionResult(typeProjectionProjectedTypeForConflictedTypeWithUnsafeVariance.getType());
                        } else {
                            kotlinTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(typeProjectionProjectedTypeForConflictedTypeWithUnsafeVariance.getType(), type2.isMarkedNullable());
                        }
                        if (!type2.getAnnotations().isEmpty()) {
                            kotlinTypeMakeNullableIfNeeded = TypeUtils2.replaceAnnotations(kotlinTypeMakeNullableIfNeeded, new CompositeAnnotations(kotlinTypeMakeNullableIfNeeded.getAnnotations(), filterOutUnsafeVariance(this.substitution.filterAnnotations(type2.getAnnotations()))));
                        }
                        if (varianceConflictTypeConflictType == VarianceConflictType.NO_CONFLICT) {
                            projectionKind = combine(projectionKind, typeProjectionProjectedTypeForConflictedTypeWithUnsafeVariance.getProjectionKind());
                        }
                        return new TypeProjectionImpl(projectionKind, kotlinTypeMakeNullableIfNeeded);
                    }
                    typeProjection = substituteCompoundType(typeProjection, i);
                    if (typeProjection == null) {
                        $$$reportNull$$$0(25);
                    }
                }
            }
        }
        return typeProjection;
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$2 */
    static /* synthetic */ class C460052 {

        /* renamed from: $SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType */
        static final /* synthetic */ int[] f7035x4790888d;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f7035x4790888d = iArr;
            try {
                iArr[VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7035x4790888d[VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7035x4790888d[VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static TypeProjection projectedTypeForConflictedTypeWithUnsafeVariance(KotlinType kotlinType, TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, TypeProjection typeProjection2) {
        if (kotlinType == null) {
            $$$reportNull$$$0(26);
        }
        if (typeProjection == null) {
            $$$reportNull$$$0(27);
        }
        if (typeProjection2 == null) {
            $$$reportNull$$$0(28);
        }
        if (!kotlinType.getAnnotations().hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
            if (typeProjection == null) {
                $$$reportNull$$$0(29);
            }
            return typeProjection;
        }
        TypeConstructor constructor = typeProjection.getType().getConstructor();
        if (!(constructor instanceof NewCapturedType2)) {
            return typeProjection;
        }
        TypeProjection projection = ((NewCapturedType2) constructor).getProjection();
        Variance projectionKind = projection.getProjectionKind();
        VarianceConflictType varianceConflictTypeConflictType = conflictType(typeProjection2.getProjectionKind(), projectionKind);
        VarianceConflictType varianceConflictType = VarianceConflictType.OUT_IN_IN_POSITION;
        if (varianceConflictTypeConflictType == varianceConflictType) {
            return new TypeProjectionImpl(projection.getType());
        }
        return (typeParameterDescriptor != null && conflictType(typeParameterDescriptor.getVariance(), projectionKind) == varianceConflictType) ? new TypeProjectionImpl(projection.getType()) : typeProjection;
    }

    private static Annotations filterOutUnsafeVariance(Annotations annotations) {
        if (annotations == null) {
            $$$reportNull$$$0(33);
        }
        return !annotations.hasAnnotation(StandardNames.FqNames.unsafeVariance) ? annotations : new FilteredAnnotations(annotations, new Function1<FqName, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.1
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(FqName fqName) {
                if (fqName == null) {
                    $$$reportNull$$$0(0);
                }
                return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.unsafeVariance));
            }
        });
    }

    private TypeProjection substituteCompoundType(TypeProjection typeProjection, int i) throws SubstitutionException {
        KotlinType type2 = typeProjection.getType();
        Variance projectionKind = typeProjection.getProjectionKind();
        if (type2.getConstructor().mo28704getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        KotlinType4 abbreviation = SpecialTypes5.getAbbreviation(type2);
        KotlinType kotlinTypeSubstitute = abbreviation != null ? replaceWithNonApproximatingSubstitution().substitute(abbreviation, Variance.INVARIANT) : null;
        KotlinType kotlinTypeReplace = TypeSubstitution7.replace(type2, substituteTypeArguments(type2.getConstructor().getParameters(), type2.getArguments(), i), this.substitution.filterAnnotations(type2.getAnnotations()));
        if ((kotlinTypeReplace instanceof KotlinType4) && (kotlinTypeSubstitute instanceof KotlinType4)) {
            kotlinTypeReplace = SpecialTypes5.withAbbreviation((KotlinType4) kotlinTypeReplace, (KotlinType4) kotlinTypeSubstitute);
        }
        return new TypeProjectionImpl(projectionKind, kotlinTypeReplace);
    }

    private List<TypeProjection> substituteTypeArguments(List<TypeParameterDescriptor> list, List<TypeProjection> list2, int i) throws SubstitutionException {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            TypeParameterDescriptor typeParameterDescriptor = list.get(i2);
            TypeProjection typeProjection = list2.get(i2);
            TypeProjection typeProjectionUnsafeSubstitute = unsafeSubstitute(typeProjection, typeParameterDescriptor, i + 1);
            int i3 = C460052.f7035x4790888d[conflictType(typeParameterDescriptor.getVariance(), typeProjectionUnsafeSubstitute.getProjectionKind()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                typeProjectionUnsafeSubstitute = TypeUtils.makeStarProjection(typeParameterDescriptor);
            } else if (i3 == 3) {
                Variance variance = typeParameterDescriptor.getVariance();
                Variance variance2 = Variance.INVARIANT;
                if (variance != variance2 && !typeProjectionUnsafeSubstitute.isStarProjection()) {
                    typeProjectionUnsafeSubstitute = new TypeProjectionImpl(variance2, typeProjectionUnsafeSubstitute.getType());
                }
            }
            if (typeProjectionUnsafeSubstitute != typeProjection) {
                z = true;
            }
            arrayList.add(typeProjectionUnsafeSubstitute);
        }
        return !z ? list2 : arrayList;
    }

    public static Variance combine(Variance variance, TypeProjection typeProjection) {
        if (variance == null) {
            $$$reportNull$$$0(35);
        }
        if (typeProjection == null) {
            $$$reportNull$$$0(36);
        }
        if (!typeProjection.isStarProjection()) {
            return combine(variance, typeProjection.getProjectionKind());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 == null) {
            $$$reportNull$$$0(37);
        }
        return variance2;
    }

    public static Variance combine(Variance variance, Variance variance2) {
        if (variance == null) {
            $$$reportNull$$$0(38);
        }
        if (variance2 == null) {
            $$$reportNull$$$0(39);
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 == null) {
                $$$reportNull$$$0(40);
            }
            return variance2;
        }
        if (variance2 == variance3) {
            if (variance == null) {
                $$$reportNull$$$0(41);
            }
            return variance;
        }
        if (variance == variance2) {
            if (variance2 == null) {
                $$$reportNull$$$0(42);
            }
            return variance2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    private static VarianceConflictType conflictType(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        if (variance == Variance.OUT_VARIANCE && variance2 == variance3) {
            return VarianceConflictType.IN_IN_OUT_POSITION;
        }
        return VarianceConflictType.NO_CONFLICT;
    }

    private static void assertRecursionDepth(int i, TypeProjection typeProjection, TypeSubstitution typeSubstitution) {
        if (i <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + safeToString(typeProjection) + "; substitution: " + safeToString(typeSubstitution));
    }

    private static String safeToString(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (exceptionUtils.isProcessCanceledException(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }
}
