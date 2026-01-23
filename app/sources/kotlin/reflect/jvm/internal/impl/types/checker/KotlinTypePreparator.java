package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor3;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType2;
import kotlin.reflect.jvm.internal.impl.types.KotlinType4;
import kotlin.reflect.jvm.internal.impl.types.KotlinType5;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement4;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;

/* compiled from: KotlinTypePreparator.kt */
@SourceDebugExtension
/* loaded from: classes23.dex */
public abstract class KotlinTypePreparator extends AbstractTypePreparator {
    private final KotlinType4 transformToNewType(KotlinType4 kotlinType4) {
        KotlinType type2;
        TypeConstructor constructor = kotlinType4.getConstructor();
        IntersectionTypeConstructor alternative = null;
        kotlinType5Unwrap = null;
        KotlinType5 kotlinType5Unwrap = null;
        if (constructor instanceof CapturedTypeConstructor3) {
            CapturedTypeConstructor3 capturedTypeConstructor3 = (CapturedTypeConstructor3) constructor;
            TypeProjection projection = capturedTypeConstructor3.getProjection();
            if (projection.getProjectionKind() != Variance.IN_VARIANCE) {
                projection = null;
            }
            if (projection != null && (type2 = projection.getType()) != null) {
                kotlinType5Unwrap = type2.unwrap();
            }
            KotlinType5 kotlinType5 = kotlinType5Unwrap;
            if (capturedTypeConstructor3.getNewTypeConstructor() == null) {
                TypeProjection projection2 = capturedTypeConstructor3.getProjection();
                Collection<KotlinType> collectionMo28705getSupertypes = capturedTypeConstructor3.mo28705getSupertypes();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo28705getSupertypes, 10));
                Iterator<T> it = collectionMo28705getSupertypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(((KotlinType) it.next()).unwrap());
                }
                capturedTypeConstructor3.setNewTypeConstructor(new NewCapturedType2(projection2, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            NewCapturedType2 newTypeConstructor = capturedTypeConstructor3.getNewTypeConstructor();
            Intrinsics.checkNotNull(newTypeConstructor);
            return new NewCapturedType(captureStatus, newTypeConstructor, kotlinType5, kotlinType4.getAttributes(), kotlinType4.isMarkedNullable(), false, 32, null);
        }
        boolean z = false;
        if (constructor instanceof IntegerValueTypeConstructor) {
            Collection<KotlinType> collectionMo28705getSupertypes2 = ((IntegerValueTypeConstructor) constructor).mo28705getSupertypes();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo28705getSupertypes2, 10));
            Iterator<T> it2 = collectionMo28705getSupertypes2.iterator();
            while (it2.hasNext()) {
                KotlinType kotlinTypeMakeNullableAsSpecified = TypeUtils.makeNullableAsSpecified((KotlinType) it2.next(), kotlinType4.isMarkedNullable());
                Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNullableAsSpecified, "makeNullableAsSpecified(...)");
                arrayList2.add(kotlinTypeMakeNullableAsSpecified);
            }
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(kotlinType4.getAttributes(), new IntersectionTypeConstructor(arrayList2), CollectionsKt.emptyList(), false, kotlinType4.getMemberScope());
        }
        if (!(constructor instanceof IntersectionTypeConstructor) || !kotlinType4.isMarkedNullable()) {
            return kotlinType4;
        }
        IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
        Collection<KotlinType> collectionMo28705getSupertypes3 = intersectionTypeConstructor.mo28705getSupertypes();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo28705getSupertypes3, 10));
        Iterator<T> it3 = collectionMo28705getSupertypes3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(TypeUtils2.makeNullable((KotlinType) it3.next()));
            z = true;
        }
        if (z) {
            KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
            alternative = new IntersectionTypeConstructor(arrayList3).setAlternative(alternativeType != null ? TypeUtils2.makeNullable(alternativeType) : null);
        }
        if (alternative != null) {
            intersectionTypeConstructor = alternative;
        }
        return intersectionTypeConstructor.createType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypePreparator
    public KotlinType5 prepareType(KotlinTypeMarker type2) {
        KotlinType5 kotlinType5FlexibleType;
        Intrinsics.checkNotNullParameter(type2, "type");
        if (!(type2 instanceof KotlinType)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        KotlinType5 kotlinType5Unwrap = ((KotlinType) type2).unwrap();
        if (kotlinType5Unwrap instanceof KotlinType4) {
            kotlinType5FlexibleType = transformToNewType((KotlinType4) kotlinType5Unwrap);
        } else {
            if (!(kotlinType5Unwrap instanceof KotlinType2)) {
                throw new NoWhenBranchMatchedException();
            }
            KotlinType2 kotlinType2 = (KotlinType2) kotlinType5Unwrap;
            KotlinType4 kotlinType4TransformToNewType = transformToNewType(kotlinType2.getLowerBound());
            KotlinType4 kotlinType4TransformToNewType2 = transformToNewType(kotlinType2.getUpperBound());
            kotlinType5FlexibleType = (kotlinType4TransformToNewType == kotlinType2.getLowerBound() && kotlinType4TransformToNewType2 == kotlinType2.getUpperBound()) ? kotlinType5Unwrap : KotlinTypeFactory.flexibleType(kotlinType4TransformToNewType, kotlinType4TransformToNewType2);
        }
        return TypeWithEnhancement4.inheritEnhancement(kotlinType5FlexibleType, kotlinType5Unwrap, new C460061(this));
    }

    /* compiled from: KotlinTypePreparator.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator$prepareType$1 */
    /* synthetic */ class C460061 extends FunctionReferenceImpl implements Function1<KotlinTypeMarker, KotlinType5> {
        C460061(Object obj) {
            super(1, obj, KotlinTypePreparator.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final KotlinType5 invoke(KotlinTypeMarker p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((KotlinTypePreparator) this.receiver).prepareType(p0);
        }
    }

    /* compiled from: KotlinTypePreparator.kt */
    public static final class Default extends KotlinTypePreparator {
        public static final Default INSTANCE = new Default();

        private Default() {
        }
    }
}
