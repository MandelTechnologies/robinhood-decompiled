package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* compiled from: KotlinType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.UnwrappedType, reason: use source file name */
/* loaded from: classes23.dex */
public abstract class KotlinType5 extends KotlinType {
    public /* synthetic */ KotlinType5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract KotlinType5 makeNullableAsSpecified(boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public abstract KotlinType5 refine(KotlinTypeRefiner kotlinTypeRefiner);

    public abstract KotlinType5 replaceAttributes(TypeAttributes typeAttributes);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType5 unwrap() {
        return this;
    }

    private KotlinType5() {
        super(null);
    }
}
