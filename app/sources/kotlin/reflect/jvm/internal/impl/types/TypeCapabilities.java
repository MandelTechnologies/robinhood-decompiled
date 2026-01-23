package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: TypeCapabilities.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter, reason: use source file name */
/* loaded from: classes23.dex */
public interface TypeCapabilities {
    boolean isTypeParameter();

    KotlinType substitutionResult(KotlinType kotlinType);
}
