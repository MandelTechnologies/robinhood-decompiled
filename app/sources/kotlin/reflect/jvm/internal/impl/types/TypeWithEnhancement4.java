package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TypeWithEnhancement.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class TypeWithEnhancement4 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final KotlinType getEnhancement(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        if (kotlinType instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) kotlinType).getEnhancement();
        }
        return null;
    }

    public static final KotlinType5 inheritEnhancement(KotlinType5 kotlinType5, KotlinType origin, Function1<? super KotlinType, ? extends KotlinType> transform) {
        Intrinsics.checkNotNullParameter(kotlinType5, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(transform, "transform");
        KotlinType enhancement = getEnhancement(origin);
        return wrapEnhancement(kotlinType5, enhancement != null ? transform.invoke(enhancement) : null);
    }

    public static final KotlinType5 inheritEnhancement(KotlinType5 kotlinType5, KotlinType origin) {
        Intrinsics.checkNotNullParameter(kotlinType5, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return wrapEnhancement(kotlinType5, getEnhancement(origin));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final KotlinType5 wrapEnhancement(KotlinType5 kotlinType5, KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType5, "<this>");
        if (kotlinType5 instanceof TypeWithEnhancement) {
            return wrapEnhancement(((TypeWithEnhancement) kotlinType5).getOrigin(), kotlinType);
        }
        if (kotlinType == null || Intrinsics.areEqual(kotlinType, kotlinType5)) {
            return kotlinType5;
        }
        if (kotlinType5 instanceof KotlinType4) {
            return new TypeWithEnhancement3((KotlinType4) kotlinType5, kotlinType);
        }
        if (kotlinType5 instanceof KotlinType2) {
            return new TypeWithEnhancement2((KotlinType2) kotlinType5, kotlinType);
        }
        throw new NoWhenBranchMatchedException();
    }
}
