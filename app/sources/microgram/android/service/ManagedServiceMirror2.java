package microgram.android.service;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: ManagedServiceMirror.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0002\"&\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"singleIdentifier", "", "Ljava/lang/Class;", "enclosingClasses", "Lkotlin/sequences/Sequence;", "getEnclosingClasses", "(Ljava/lang/Class;)Lkotlin/sequences/Sequence;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.service.ManagedServiceMirrorKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ManagedServiceMirror2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String singleIdentifier(Class<?> cls) {
        return CollectionsKt.joinToString$default(CollectionsKt.asReversed(SequencesKt.toList(getEnclosingClasses(cls))), "_", null, null, 0, null, new Function1() { // from class: microgram.android.service.ManagedServiceMirrorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManagedServiceMirror2.singleIdentifier$lambda$0((Class) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence singleIdentifier$lambda$0(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String simpleName = it.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class _get_enclosingClasses_$lambda$1(Class it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getEnclosingClass();
    }

    private static final Sequence<Class<?>> getEnclosingClasses(Class<?> cls) {
        return SequencesKt.generateSequence(cls, (Function1<? super Class<?>, ? extends Class<?>>) new Function1() { // from class: microgram.android.service.ManagedServiceMirrorKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ManagedServiceMirror2._get_enclosingClasses_$lambda$1((Class) obj);
            }
        });
    }
}
