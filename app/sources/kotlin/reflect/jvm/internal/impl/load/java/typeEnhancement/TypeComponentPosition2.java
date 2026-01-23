package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypeComponentPosition.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPositionKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class TypeComponentPosition2 {
    public static final boolean shouldEnhance(TypeComponentPosition typeComponentPosition) {
        Intrinsics.checkNotNullParameter(typeComponentPosition, "<this>");
        return typeComponentPosition != TypeComponentPosition.INFLEXIBLE;
    }
}
