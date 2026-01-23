package com.robinhood.concurrent;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: KeyedInstanceManager.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u00020\u0002J4\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0002\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00050\b¢\u0006\u0002\b\tH&¢\u0006\u0002\u0010\nJ6\u0010\u000b\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0002\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00050\b¢\u0006\u0002\b\tH&¢\u0006\u0002\u0010\nJ4\u0010\f\u001a\u0002H\u0005\"\u0004\b\u0002\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00050\b¢\u0006\u0002\b\tH&¢\u0006\u0002\u0010\n¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/concurrent/KeyedInstanceManager;", "K", "", "V", "acquire", "R", "key", "takeInstance", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOrNull", "release", "dropInstance", "lib-concurrent"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface KeyedInstanceManager<K, V> {
    <R> R acquire(K key, Function1<? super V, ? extends R> takeInstance);

    <R> R getOrNull(K key, Function1<? super V, ? extends R> takeInstance);

    <R> R release(K key, Function1<? super V, ? extends R> dropInstance);
}
