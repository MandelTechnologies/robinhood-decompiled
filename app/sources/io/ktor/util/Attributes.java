package io.ktor.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Attributes.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001c\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H¦\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lio/ktor/util/Attributes;", "", "T", "Lio/ktor/util/AttributeKey;", "key", "get", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "getOrNull", "", "contains", "(Lio/ktor/util/AttributeKey;)Z", "value", "", "put", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "remove", "(Lio/ktor/util/AttributeKey;)V", "Lkotlin/Function0;", "block", "computeIfAbsent", "(Lio/ktor/util/AttributeKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "getAllKeys", "()Ljava/util/List;", "allKeys", "ktor-utils"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface Attributes {
    <T> T computeIfAbsent(Attributes2<T> key, Function0<? extends T> block);

    boolean contains(Attributes2<?> key);

    <T> T get(Attributes2<T> key);

    List<Attributes2<?>> getAllKeys();

    <T> T getOrNull(Attributes2<T> key);

    <T> void put(Attributes2<T> key, T value);

    <T> void remove(Attributes2<T> key);

    /* compiled from: Attributes.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static <T> T get(Attributes attributes, Attributes2<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            T t = (T) attributes.getOrNull(key);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException("No instance for key " + key);
        }
    }
}
