package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: utils.kt */
/* loaded from: classes14.dex */
final class SubtypePathNode {
    private final SubtypePathNode previous;

    /* renamed from: type, reason: collision with root package name */
    private final KotlinType f10760type;

    public SubtypePathNode(KotlinType type2, SubtypePathNode subtypePathNode) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.f10760type = type2;
        this.previous = subtypePathNode;
    }

    public final SubtypePathNode getPrevious() {
        return this.previous;
    }

    public final KotlinType getType() {
        return this.f10760type;
    }
}
