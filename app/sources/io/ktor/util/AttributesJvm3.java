package io.ktor.util;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AttributesJvm.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eR&\u0010\u0003\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m3636d2 = {"Lio/ktor/util/ConcurrentSafeAttributes;", "Lio/ktor/util/AttributesJvmBase;", "()V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "Lio/ktor/util/AttributeKey;", "", "getMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "computeIfAbsent", "T", "key", "block", "Lkotlin/Function0;", "(Lio/ktor/util/AttributeKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ktor-utils"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.util.ConcurrentSafeAttributes, reason: use source file name */
/* loaded from: classes14.dex */
final class AttributesJvm3 extends AttributesJvm {
    private final ConcurrentHashMap<Attributes2<?>, Object> map = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.util.AttributesJvm
    public ConcurrentHashMap<Attributes2<?>, Object> getMap() {
        return this.map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.Attributes
    public <T> T computeIfAbsent(Attributes2<T> key, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        T t = (T) getMap().get(key);
        if (t != null) {
            return t;
        }
        T tInvoke = block.invoke();
        Object objPutIfAbsent = getMap().putIfAbsent(key, tInvoke);
        if (objPutIfAbsent != 0) {
            tInvoke = objPutIfAbsent;
        }
        Intrinsics.checkNotNull(tInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return tInvoke;
    }
}
