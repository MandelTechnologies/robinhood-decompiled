package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: KotlinType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.WrappedType, reason: use source file name */
/* loaded from: classes23.dex */
public abstract class KotlinType6 extends KotlinType {
    protected abstract KotlinType getDelegate();

    public boolean isComputed() {
        return true;
    }

    public KotlinType6() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType5 unwrap() {
        KotlinType delegate = getDelegate();
        while (delegate instanceof KotlinType6) {
            delegate = ((KotlinType6) delegate).getDelegate();
        }
        Intrinsics.checkNotNull(delegate, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (KotlinType5) delegate;
    }

    public String toString() {
        if (isComputed()) {
            return getDelegate().toString();
        }
        return "<Not computed yet>";
    }
}
