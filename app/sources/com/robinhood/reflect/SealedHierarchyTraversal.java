package com.robinhood.reflect;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: SealedHierarchyTraversal.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0002\u001a*\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0002H\u0002¨\u0006\u0006"}, m3636d2 = {"sealedHierarchyTraversal", "Lkotlin/sequences/Sequence;", "Lkotlin/reflect/KClass;", "T", "", "sealedHierarchyTraversalImpl", "lib-reflect"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.reflect.SealedHierarchyTraversalKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class SealedHierarchyTraversal {
    public static final <T> Sequence<KClass<? extends T>> sealedHierarchyTraversal(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        if (!kClass.isSealed()) {
            throw new IllegalArgumentException((kClass + " is not a sealed class").toString());
        }
        return sealedHierarchyTraversalImpl(kClass);
    }

    private static final <T> Sequence<KClass<? extends T>> sealedHierarchyTraversalImpl(KClass<T> kClass) {
        return kClass.isSealed() ? SequencesKt.plus(SequencesKt.sequenceOf(kClass), SequencesKt.flatMap(CollectionsKt.asSequence(kClass.getSealedSubclasses()), new Function1() { // from class: com.robinhood.reflect.SealedHierarchyTraversalKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SealedHierarchyTraversal.sealedHierarchyTraversalImpl$lambda$1((KClass) obj);
            }
        })) : SequencesKt.sequenceOf(kClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence sealedHierarchyTraversalImpl$lambda$1(KClass it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return sealedHierarchyTraversalImpl(it);
    }
}
