package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: constantValues.kt */
/* loaded from: classes14.dex */
public final class TypedArrayValue extends ArrayValue {

    /* renamed from: type, reason: collision with root package name */
    private final KotlinType f10757type;

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType _init_$lambda$0(KotlinType kotlinType, ModuleDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return kotlinType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(List<? extends ConstantValue<?>> value, final KotlinType type2) {
        super(value, new Function1(type2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue$$Lambda$0
            private final KotlinType arg$0;

            {
                this.arg$0 = type2;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return TypedArrayValue._init_$lambda$0(this.arg$0, (ModuleDescriptor) obj);
            }
        });
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.f10757type = type2;
    }

    public final KotlinType getType() {
        return this.f10757type;
    }
}
