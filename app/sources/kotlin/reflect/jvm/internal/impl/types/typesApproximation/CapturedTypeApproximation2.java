package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor4;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtils2;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType4;
import kotlin.reflect.jvm.internal.impl.types.KotlinType5;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution4;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution7;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement4;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.flexibleTypes2;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;

/* compiled from: CapturedTypeApproximation.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class CapturedTypeApproximation2 {

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final TypeProjection toTypeProjection(CapturedTypeApproximation4 capturedTypeApproximation4) {
        capturedTypeApproximation4.isConsistent();
        if (!Intrinsics.areEqual(capturedTypeApproximation4.getInProjection(), capturedTypeApproximation4.getOutProjection())) {
            Variance variance = capturedTypeApproximation4.getTypeParameter().getVariance();
            Variance variance2 = Variance.IN_VARIANCE;
            if (variance != variance2) {
                if (!KotlinBuiltIns.isNothing(capturedTypeApproximation4.getInProjection()) || capturedTypeApproximation4.getTypeParameter().getVariance() == variance2) {
                    return KotlinBuiltIns.isNullableAny(capturedTypeApproximation4.getOutProjection()) ? new TypeProjectionImpl(toTypeProjection$removeProjectionIfRedundant(capturedTypeApproximation4, variance2), capturedTypeApproximation4.getInProjection()) : new TypeProjectionImpl(toTypeProjection$removeProjectionIfRedundant(capturedTypeApproximation4, Variance.OUT_VARIANCE), capturedTypeApproximation4.getOutProjection());
                }
                return new TypeProjectionImpl(toTypeProjection$removeProjectionIfRedundant(capturedTypeApproximation4, Variance.OUT_VARIANCE), capturedTypeApproximation4.getOutProjection());
            }
        }
        return new TypeProjectionImpl(capturedTypeApproximation4.getInProjection());
    }

    private static final Variance toTypeProjection$removeProjectionIfRedundant(CapturedTypeApproximation4 capturedTypeApproximation4, Variance variance) {
        return variance == capturedTypeApproximation4.getTypeParameter().getVariance() ? Variance.INVARIANT : variance;
    }

    private static final CapturedTypeApproximation4 toTypeArgument(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        int i = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
        if (i == 1) {
            KotlinType type2 = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            KotlinType type3 = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
            return new CapturedTypeApproximation4(typeParameterDescriptor, type2, type3);
        }
        if (i == 2) {
            KotlinType type4 = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
            KotlinType4 nullableAnyType = DescriptorUtils2.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
            Intrinsics.checkNotNullExpressionValue(nullableAnyType, "getNullableAnyType(...)");
            return new CapturedTypeApproximation4(typeParameterDescriptor, type4, nullableAnyType);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        KotlinType4 nothingType = DescriptorUtils2.getBuiltIns(typeParameterDescriptor).getNothingType();
        Intrinsics.checkNotNullExpressionValue(nothingType, "getNothingType(...)");
        KotlinType type5 = typeProjection.getType();
        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
        return new CapturedTypeApproximation4(typeParameterDescriptor, nothingType, type5);
    }

    public static final TypeProjection approximateCapturedTypesIfNecessary(TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.isStarProjection()) {
            KotlinType type2 = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            if (TypeUtils.contains(type2, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$$Lambda$1
                @Override // kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return CapturedTypeApproximation2.approximateCapturedTypesIfNecessary$lambda$2((KotlinType5) obj);
                }
            })) {
                Variance projectionKind = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                if (projectionKind == Variance.OUT_VARIANCE) {
                    return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type2).getUpper());
                }
                if (z) {
                    return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type2).getLower());
                }
                return substituteCapturedTypesWithProjections(typeProjection);
            }
        }
        return typeProjection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean approximateCapturedTypesIfNecessary$lambda$2(KotlinType5 kotlinType5) {
        Intrinsics.checkNotNull(kotlinType5);
        return Boolean.valueOf(CapturedTypeConstructor4.isCaptured(kotlinType5));
    }

    private static final TypeProjection substituteCapturedTypesWithProjections(TypeProjection typeProjection) {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(new TypeSubstitution4() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution4
            public TypeProjection get(TypeConstructor key) {
                Intrinsics.checkNotNullParameter(key, "key");
                CapturedTypeConstructor capturedTypeConstructor = key instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) key : null;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                if (capturedTypeConstructor.getProjection().isStarProjection()) {
                    return new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType());
                }
                return capturedTypeConstructor.getProjection();
            }
        });
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorCreate, "create(...)");
        return typeSubstitutorCreate.substituteWithoutApproximation(typeProjection);
    }

    public static final CapturedTypeApproximation<KotlinType> approximateCapturedTypes(KotlinType type2) {
        Object objReplaceTypeArguments;
        Intrinsics.checkNotNullParameter(type2, "type");
        if (flexibleTypes2.isFlexible(type2)) {
            CapturedTypeApproximation<KotlinType> capturedTypeApproximationApproximateCapturedTypes = approximateCapturedTypes(flexibleTypes2.lowerIfFlexible(type2));
            CapturedTypeApproximation<KotlinType> capturedTypeApproximationApproximateCapturedTypes2 = approximateCapturedTypes(flexibleTypes2.upperIfFlexible(type2));
            return new CapturedTypeApproximation<>(TypeWithEnhancement4.inheritEnhancement(KotlinTypeFactory.flexibleType(flexibleTypes2.lowerIfFlexible(capturedTypeApproximationApproximateCapturedTypes.getLower()), flexibleTypes2.upperIfFlexible(capturedTypeApproximationApproximateCapturedTypes2.getLower())), type2), TypeWithEnhancement4.inheritEnhancement(KotlinTypeFactory.flexibleType(flexibleTypes2.lowerIfFlexible(capturedTypeApproximationApproximateCapturedTypes.getUpper()), flexibleTypes2.upperIfFlexible(capturedTypeApproximationApproximateCapturedTypes2.getUpper())), type2));
        }
        TypeConstructor constructor = type2.getConstructor();
        if (CapturedTypeConstructor4.isCaptured(type2)) {
            Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            TypeProjection projection = ((CapturedTypeConstructor) constructor).getProjection();
            KotlinType type3 = projection.getType();
            Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
            KotlinType kotlinTypeApproximateCapturedTypes$makeNullableIfNeeded = approximateCapturedTypes$makeNullableIfNeeded(type3, type2);
            int i = WhenMappings.$EnumSwitchMapping$0[projection.getProjectionKind().ordinal()];
            if (i == 2) {
                return new CapturedTypeApproximation<>(kotlinTypeApproximateCapturedTypes$makeNullableIfNeeded, TypeUtils2.getBuiltIns(type2).getNullableAnyType());
            }
            if (i == 3) {
                KotlinType4 nothingType = TypeUtils2.getBuiltIns(type2).getNothingType();
                Intrinsics.checkNotNullExpressionValue(nothingType, "getNothingType(...)");
                return new CapturedTypeApproximation<>(approximateCapturedTypes$makeNullableIfNeeded(nothingType, type2), kotlinTypeApproximateCapturedTypes$makeNullableIfNeeded);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + projection);
        }
        if (type2.getArguments().isEmpty() || type2.getArguments().size() != constructor.getParameters().size()) {
            return new CapturedTypeApproximation<>(type2, type2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> arguments = type2.getArguments();
        List<TypeParameterDescriptor> parameters = constructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        for (Tuples2 tuples2 : CollectionsKt.zip(arguments, parameters)) {
            TypeProjection typeProjection = (TypeProjection) tuples2.component1();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) tuples2.component2();
            Intrinsics.checkNotNull(typeParameterDescriptor);
            CapturedTypeApproximation4 typeArgument = toTypeArgument(typeProjection, typeParameterDescriptor);
            if (typeProjection.isStarProjection()) {
                arrayList.add(typeArgument);
                arrayList2.add(typeArgument);
            } else {
                CapturedTypeApproximation<CapturedTypeApproximation4> capturedTypeApproximationApproximateProjection = approximateProjection(typeArgument);
                CapturedTypeApproximation4 capturedTypeApproximation4Component1 = capturedTypeApproximationApproximateProjection.component1();
                CapturedTypeApproximation4 capturedTypeApproximation4Component2 = capturedTypeApproximationApproximateProjection.component2();
                arrayList.add(capturedTypeApproximation4Component1);
                arrayList2.add(capturedTypeApproximation4Component2);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((CapturedTypeApproximation4) it.next()).isConsistent()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            objReplaceTypeArguments = TypeUtils2.getBuiltIns(type2).getNothingType();
            Intrinsics.checkNotNullExpressionValue(objReplaceTypeArguments, "getNothingType(...)");
        } else {
            objReplaceTypeArguments = replaceTypeArguments(type2, arrayList);
        }
        return new CapturedTypeApproximation<>(objReplaceTypeArguments, replaceTypeArguments(type2, arrayList2));
    }

    private static final KotlinType approximateCapturedTypes$makeNullableIfNeeded(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType kotlinTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(kotlinType, kotlinType2.isMarkedNullable());
        Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNullableIfNeeded, "makeNullableIfNeeded(...)");
        return kotlinTypeMakeNullableIfNeeded;
    }

    private static final KotlinType replaceTypeArguments(KotlinType kotlinType, List<CapturedTypeApproximation4> list) {
        kotlinType.getArguments().size();
        list.size();
        List<CapturedTypeApproximation4> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toTypeProjection((CapturedTypeApproximation4) it.next()));
        }
        return TypeSubstitution7.replace$default(kotlinType, arrayList, null, null, 6, null);
    }

    private static final CapturedTypeApproximation<CapturedTypeApproximation4> approximateProjection(CapturedTypeApproximation4 capturedTypeApproximation4) {
        CapturedTypeApproximation<KotlinType> capturedTypeApproximationApproximateCapturedTypes = approximateCapturedTypes(capturedTypeApproximation4.getInProjection());
        KotlinType kotlinTypeComponent1 = capturedTypeApproximationApproximateCapturedTypes.component1();
        KotlinType kotlinTypeComponent2 = capturedTypeApproximationApproximateCapturedTypes.component2();
        CapturedTypeApproximation<KotlinType> capturedTypeApproximationApproximateCapturedTypes2 = approximateCapturedTypes(capturedTypeApproximation4.getOutProjection());
        return new CapturedTypeApproximation<>(new CapturedTypeApproximation4(capturedTypeApproximation4.getTypeParameter(), kotlinTypeComponent2, capturedTypeApproximationApproximateCapturedTypes2.component1()), new CapturedTypeApproximation4(capturedTypeApproximation4.getTypeParameter(), kotlinTypeComponent1, capturedTypeApproximationApproximateCapturedTypes2.component2()));
    }
}
