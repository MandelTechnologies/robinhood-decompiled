package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.context3;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawType2;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType2;
import kotlin.reflect.jvm.internal.impl.types.KotlinType3;
import kotlin.reflect.jvm.internal.impl.types.KotlinType4;
import kotlin.reflect.jvm.internal.impl.types.KotlinType5;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypes5;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes3;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement4;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.flexibleTypes2;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;

/* compiled from: typeEnhancement.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement, reason: use source file name */
/* loaded from: classes21.dex */
public final class typeEnhancement3 {
    private final context3 javaResolverSettings;

    /* compiled from: typeEnhancement.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$Result */
    /* loaded from: classes14.dex */
    private static final class Result {
        private final int subtreeSize;

        /* renamed from: type, reason: collision with root package name */
        private final KotlinType f10750type;

        public Result(KotlinType kotlinType, int i) {
            this.f10750type = kotlinType;
            this.subtreeSize = i;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final KotlinType getType() {
            return this.f10750type;
        }
    }

    public typeEnhancement3(context3 javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.javaResolverSettings = javaResolverSettings;
    }

    /* compiled from: typeEnhancement.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement$SimpleResult */
    /* loaded from: classes14.dex */
    private static final class SimpleResult {
        private final boolean forWarnings;
        private final int subtreeSize;

        /* renamed from: type, reason: collision with root package name */
        private final KotlinType4 f10751type;

        public SimpleResult(KotlinType4 kotlinType4, int i, boolean z) {
            this.f10751type = kotlinType4;
            this.subtreeSize = i;
            this.forWarnings = z;
        }

        public final boolean getForWarnings() {
            return this.forWarnings;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final KotlinType4 getType() {
            return this.f10751type;
        }
    }

    public final KotlinType enhance(KotlinType kotlinType, Function1<? super Integer, typeQualifiers> qualifiers, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return enhancePossiblyFlexible(kotlinType.unwrap(), qualifiers, 0, z).getType();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Result enhancePossiblyFlexible(KotlinType5 kotlinType5, Function1<? super Integer, typeQualifiers> function1, int i, boolean z) {
        KotlinType type2;
        KotlinType kotlinTypeWrapEnhancement = null;
        if (KotlinType3.isError(kotlinType5)) {
            return new Result(null, 1);
        }
        if (kotlinType5 instanceof KotlinType2) {
            boolean z2 = kotlinType5 instanceof RawType;
            KotlinType2 kotlinType2 = (KotlinType2) kotlinType5;
            SimpleResult simpleResultEnhanceInflexible = enhanceInflexible(kotlinType2.getLowerBound(), function1, i, TypeComponentPosition.FLEXIBLE_LOWER, z2, z);
            SimpleResult simpleResultEnhanceInflexible2 = enhanceInflexible(kotlinType2.getUpperBound(), function1, i, TypeComponentPosition.FLEXIBLE_UPPER, z2, z);
            simpleResultEnhanceInflexible.getSubtreeSize();
            simpleResultEnhanceInflexible2.getSubtreeSize();
            if (simpleResultEnhanceInflexible.getType() != null || simpleResultEnhanceInflexible2.getType() != null) {
                if (simpleResultEnhanceInflexible.getForWarnings() || simpleResultEnhanceInflexible2.getForWarnings()) {
                    KotlinType4 type3 = simpleResultEnhanceInflexible2.getType();
                    if (type3 == null) {
                        type2 = simpleResultEnhanceInflexible.getType();
                        Intrinsics.checkNotNull(type2);
                        kotlinTypeWrapEnhancement = TypeWithEnhancement4.wrapEnhancement(kotlinType5, type2);
                    } else {
                        KotlinType4 type4 = simpleResultEnhanceInflexible.getType();
                        if (type4 == null) {
                            type4 = type3;
                        }
                        type2 = KotlinTypeFactory.flexibleType(type4, type3);
                        if (type2 == null) {
                        }
                        kotlinTypeWrapEnhancement = TypeWithEnhancement4.wrapEnhancement(kotlinType5, type2);
                    }
                } else if (z2) {
                    KotlinType4 type5 = simpleResultEnhanceInflexible.getType();
                    if (type5 == null) {
                        type5 = kotlinType2.getLowerBound();
                    }
                    KotlinType4 type6 = simpleResultEnhanceInflexible2.getType();
                    if (type6 == null) {
                        type6 = kotlinType2.getUpperBound();
                    }
                    kotlinTypeWrapEnhancement = new RawType2(type5, type6);
                } else {
                    KotlinType4 type7 = simpleResultEnhanceInflexible.getType();
                    if (type7 == null) {
                        type7 = kotlinType2.getLowerBound();
                    }
                    KotlinType4 type8 = simpleResultEnhanceInflexible2.getType();
                    if (type8 == null) {
                        type8 = kotlinType2.getUpperBound();
                    }
                    kotlinTypeWrapEnhancement = KotlinTypeFactory.flexibleType(type7, type8);
                }
            }
            return new Result(kotlinTypeWrapEnhancement, simpleResultEnhanceInflexible.getSubtreeSize());
        }
        if (!(kotlinType5 instanceof KotlinType4)) {
            throw new NoWhenBranchMatchedException();
        }
        SimpleResult simpleResultEnhanceInflexible$default = enhanceInflexible$default(this, (KotlinType4) kotlinType5, function1, i, TypeComponentPosition.INFLEXIBLE, false, z, 8, null);
        return new Result(simpleResultEnhanceInflexible$default.getForWarnings() ? TypeWithEnhancement4.wrapEnhancement(kotlinType5, simpleResultEnhanceInflexible$default.getType()) : simpleResultEnhanceInflexible$default.getType(), simpleResultEnhanceInflexible$default.getSubtreeSize());
    }

    static /* synthetic */ SimpleResult enhanceInflexible$default(typeEnhancement3 typeenhancement3, KotlinType4 kotlinType4, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        return typeenhancement3.enhanceInflexible(kotlinType4, function1, i, typeComponentPosition, z, z2);
    }

    private final SimpleResult enhanceInflexible(KotlinType4 kotlinType4, Function1<? super Integer, typeQualifiers> function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        TypeConstructor constructor;
        Boolean bool;
        Result result;
        TypeProjection typeProjectionMakeStarProjection;
        Function1<? super Integer, typeQualifiers> function12 = function1;
        boolean zShouldEnhance = TypeComponentPosition2.shouldEnhance(typeComponentPosition);
        boolean z3 = (z2 && z) ? false : true;
        KotlinType kotlinType = null;
        if (!zShouldEnhance && kotlinType4.getArguments().isEmpty()) {
            return new SimpleResult(null, 1, false);
        }
        ClassifierDescriptor classifierDescriptorMo28704getDeclarationDescriptor = kotlinType4.getConstructor().mo28704getDeclarationDescriptor();
        if (classifierDescriptorMo28704getDeclarationDescriptor == null) {
            return new SimpleResult(null, 1, false);
        }
        typeQualifiers typequalifiersInvoke = function12.invoke(Integer.valueOf(i));
        ClassifierDescriptor classifierDescriptorEnhanceMutability = typeEnhancement5.enhanceMutability(classifierDescriptorMo28704getDeclarationDescriptor, typequalifiersInvoke, typeComponentPosition);
        Boolean enhancedNullability = typeEnhancement5.getEnhancedNullability(typequalifiersInvoke, typeComponentPosition);
        if (classifierDescriptorEnhanceMutability == null || (constructor = classifierDescriptorEnhanceMutability.getTypeConstructor()) == null) {
            constructor = kotlinType4.getConstructor();
        }
        TypeConstructor typeConstructor = constructor;
        int subtreeSize = i + 1;
        List<TypeProjection> arguments = kotlinType4.getArguments();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        Iterator<T> it = arguments.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arguments, 10), CollectionsKt.collectionSizeOrDefault(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection = (TypeProjection) next;
            if (!z3) {
                bool = enhancedNullability;
                result = new Result(kotlinType, 0);
            } else {
                bool = enhancedNullability;
                if (!typeProjection.isStarProjection()) {
                    result = enhancePossiblyFlexible(typeProjection.getType().unwrap(), function12, subtreeSize, z2);
                } else if (function12.invoke(Integer.valueOf(subtreeSize)).getNullability() == typeQualifiers3.FORCE_FLEXIBILITY) {
                    KotlinType5 kotlinType5Unwrap = typeProjection.getType().unwrap();
                    result = new Result(KotlinTypeFactory.flexibleType(flexibleTypes2.lowerIfFlexible(kotlinType5Unwrap).makeNullableAsSpecified(false), flexibleTypes2.upperIfFlexible(kotlinType5Unwrap).makeNullableAsSpecified(true)), 1);
                } else {
                    result = new Result(null, 1);
                }
            }
            subtreeSize += result.getSubtreeSize();
            if (result.getType() != null) {
                KotlinType type2 = result.getType();
                Variance projectionKind = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtils2.createProjection(type2, projectionKind, typeParameterDescriptor);
            } else if (classifierDescriptorEnhanceMutability == null || typeProjection.isStarProjection()) {
                typeProjectionMakeStarProjection = classifierDescriptorEnhanceMutability != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
            } else {
                KotlinType type3 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                Variance projectionKind2 = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind2, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtils2.createProjection(type3, projectionKind2, typeParameterDescriptor);
            }
            arrayList.add(typeProjectionMakeStarProjection);
            function12 = function1;
            enhancedNullability = bool;
            kotlinType = null;
        }
        Boolean bool2 = enhancedNullability;
        int i2 = subtreeSize - i;
        if (classifierDescriptorEnhanceMutability == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((TypeProjection) it3.next()) == null) {
                    }
                }
            }
            return new SimpleResult(null, i2, false);
        }
        Annotations annotations = kotlinType4.getAnnotations();
        typeEnhancement2 typeenhancement2 = typeEnhancement5.ENHANCED_MUTABILITY_ANNOTATIONS;
        if (classifierDescriptorEnhanceMutability == null) {
            typeenhancement2 = null;
        }
        TypeAttributes defaultAttributes = TypeAttributes3.toDefaultAttributes(typeEnhancement5.compositeAnnotationsOrSingle(CollectionsKt.listOfNotNull((Object[]) new Annotations[]{annotations, typeenhancement2, bool2 != null ? typeEnhancement5.getENHANCED_NULLABILITY_ANNOTATIONS() : null})));
        List<TypeProjection> arguments2 = kotlinType4.getArguments();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = arguments2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arrayList, 10), CollectionsKt.collectionSizeOrDefault(arguments2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection2 = (TypeProjection) it5.next();
            TypeProjection typeProjection3 = (TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList2.add(typeProjection2);
        }
        KotlinType4 kotlinType4SimpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, bool2 != null ? bool2.booleanValue() : kotlinType4.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
        if (typequalifiersInvoke.getDefinitelyNotNull()) {
            kotlinType4SimpleType$default = notNullTypeParameter(kotlinType4SimpleType$default);
        }
        return new SimpleResult(kotlinType4SimpleType$default, i2, bool2 != null && typequalifiersInvoke.isNullabilityQualifierForWarning());
    }

    private final KotlinType4 notNullTypeParameter(KotlinType4 kotlinType4) {
        if (this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter()) {
            return SpecialTypes5.makeSimpleTypeDefinitelyNotNullOrNotNull(kotlinType4, true);
        }
        return new typeEnhancement4(kotlinType4);
    }
}
