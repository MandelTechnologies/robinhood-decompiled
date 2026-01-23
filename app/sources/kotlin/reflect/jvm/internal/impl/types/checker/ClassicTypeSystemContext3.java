package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.KotlinType5;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypes5;

/* compiled from: ClassicTypeSystemContext.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContextKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ClassicTypeSystemContext3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType5 makeDefinitelyNotNullOrNotNullInternal(KotlinType5 kotlinType5) {
        return SpecialTypes5.makeDefinitelyNotNullOrNotNull$default(kotlinType5, false, 1, null);
    }
}
