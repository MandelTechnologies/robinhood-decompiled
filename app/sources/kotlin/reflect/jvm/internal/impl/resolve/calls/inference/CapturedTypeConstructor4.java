package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import kotlin.Tuples2;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypes4;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution2;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution3;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: CapturedTypeConstructor.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class CapturedTypeConstructor4 {
    public static final KotlinType createCapturedType(TypeProjection typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        return new CapturedTypeConstructor2(typeProjection, null, false, null, 14, null);
    }

    public static final boolean isCaptured(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.getConstructor() instanceof CapturedTypeConstructor;
    }

    public static /* synthetic */ TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z);
    }

    public static final TypeSubstitution wrapWithCapturingSubstitution(TypeSubstitution typeSubstitution, final boolean z) {
        Intrinsics.checkNotNullParameter(typeSubstitution, "<this>");
        if (typeSubstitution instanceof TypeSubstitution3) {
            TypeSubstitution3 typeSubstitution3 = (TypeSubstitution3) typeSubstitution;
            TypeParameterDescriptor[] parameters = typeSubstitution3.getParameters();
            List<Tuples2> listZip = ArraysKt.zip(typeSubstitution3.getArguments(), typeSubstitution3.getParameters());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
            for (Tuples2 tuples2 : listZip) {
                arrayList.add(createCapturedIfNeeded((TypeProjection) tuples2.getFirst(), (TypeParameterDescriptor) tuples2.getSecond()));
            }
            return new TypeSubstitution3(parameters, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), z);
        }
        return new TypeSubstitution2(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution.2
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution2, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateContravariantCapturedTypes() {
                return z;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution2, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* renamed from: get */
            public TypeProjection mo28709get(KotlinType key) {
                Intrinsics.checkNotNullParameter(key, "key");
                TypeProjection typeProjectionMo28709get = super.mo28709get(key);
                if (typeProjectionMo28709get == null) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo28704getDeclarationDescriptor = key.getConstructor().mo28704getDeclarationDescriptor();
                return CapturedTypeConstructor4.createCapturedIfNeeded(typeProjectionMo28709get, classifierDescriptorMo28704getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo28704getDeclarationDescriptor : null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeProjection createCapturedIfNeeded(final TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.getProjectionKind() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.getVariance() == typeProjection.getProjectionKind()) {
            if (typeProjection.isStarProjection()) {
                StorageManager NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
                Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
                return new TypeProjectionImpl(new SpecialTypes4(NO_LOCKS, new Function0(typeProjection) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$$Lambda$0
                    private final TypeProjection arg$0;

                    {
                        this.arg$0 = typeProjection;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Object invoke() {
                        return CapturedTypeConstructor4.createCapturedIfNeeded$lambda$1(this.arg$0);
                    }
                }));
            }
            return new TypeProjectionImpl(typeProjection.getType());
        }
        return new TypeProjectionImpl(createCapturedType(typeProjection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType createCapturedIfNeeded$lambda$1(TypeProjection typeProjection) {
        KotlinType type2 = typeProjection.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        return type2;
    }
}
