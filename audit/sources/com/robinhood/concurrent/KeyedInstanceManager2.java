package com.robinhood.concurrent;

import com.robinhood.concurrent.KeyedInstanceManager2;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: KeyedInstanceManager.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001\"B<\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0014J4\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0002\u0010\u00162\u0006\u0010\u0011\u001a\u00028\u00002\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00160\u0006¢\u0006\u0002\b\nH\u0016¢\u0006\u0002\u0010\u0018J4\u0010\u0019\u001a\u0002H\u0016\"\u0004\b\u0002\u0010\u00162\u0006\u0010\u0011\u001a\u00028\u00002\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00160\u0006¢\u0006\u0002\b\nH\u0016¢\u0006\u0002\u0010\u0018J6\u0010!\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0002\u0010\u00162\u0006\u0010\u0011\u001a\u00028\u00002\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00160\u0006¢\u0006\u0002\b\nH\u0016¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m3636d2 = {"Lcom/robinhood/concurrent/DefaultKeyedInstanceManager;", "K", "", "V", "Lcom/robinhood/concurrent/KeyedInstanceManager;", "createInstance", "Lkotlin/Function1;", "destroyInstance", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/robinhood/concurrent/DefaultKeyedInstanceManager$Entry;", "obtain", "key", "(Ljava/lang/Object;)Lcom/robinhood/concurrent/DefaultKeyedInstanceManager$Entry;", "free", "(Ljava/lang/Object;)V", "acquire", "R", "takeInstance", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "release", "dropInstance", "keys", "", "getKeys$annotations", "()V", "getKeys", "()Ljava/util/Set;", "getOrNull", "Entry", "lib-concurrent"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.concurrent.DefaultKeyedInstanceManager, reason: use source file name */
/* loaded from: classes15.dex */
public final class KeyedInstanceManager2<K, V> implements KeyedInstanceManager<K, V> {
    private final Function1<K, V> createInstance;
    private final Function2<V, K, Unit> destroyInstance;
    private final ConcurrentHashMap<K, Entry<K, V>> map;

    public static /* synthetic */ void getKeys$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyedInstanceManager2(Function1<? super K, ? extends V> createInstance, Function2<? super V, ? super K, Unit> destroyInstance) {
        Intrinsics.checkNotNullParameter(createInstance, "createInstance");
        Intrinsics.checkNotNullParameter(destroyInstance, "destroyInstance");
        this.createInstance = createInstance;
        this.destroyInstance = destroyInstance;
        this.map = new ConcurrentHashMap<>();
    }

    public /* synthetic */ KeyedInstanceManager2(Function1 function1, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? new Function2() { // from class: com.robinhood.concurrent.DefaultKeyedInstanceManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KeyedInstanceManager2._init_$lambda$0(obj, obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(Object obj, Object it) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final Entry<K, V> obtain(final K key) {
        Entry<K, V> entryCompute = this.map.compute(key, new BiFunction() { // from class: com.robinhood.concurrent.DefaultKeyedInstanceManager$obtain$entry$1
            @Override // java.util.function.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((KeyedInstanceManager3<T, U, R>) obj, (KeyedInstanceManager2.Entry<KeyedInstanceManager3<T, U, R>, V>) obj2);
            }

            public final KeyedInstanceManager2.Entry<K, V> apply(K k, KeyedInstanceManager2.Entry<K, V> entry) {
                Intrinsics.checkNotNullParameter(k, "<unused var>");
                KeyedInstanceManager2.Entry entry2 = entry;
                if (entry == 0) {
                    entry2 = new KeyedInstanceManager2.Entry(key, ((KeyedInstanceManager2) this).createInstance.invoke(key), ((KeyedInstanceManager2) this).destroyInstance);
                }
                return entry2.acquire();
            }
        });
        if (entryCompute != null) {
            return entryCompute;
        }
        throw new IllegalStateException(("Entry not acquired for " + key).toString());
    }

    private final void free(K key) {
        this.map.compute(key, new BiFunction() { // from class: com.robinhood.concurrent.DefaultKeyedInstanceManager.free.1
            public final Entry<K, V> apply(K k, Entry<K, V> entry) {
                Intrinsics.checkNotNullParameter(k, "<unused var>");
                if (entry != null) {
                    return entry.release();
                }
                return null;
            }

            @Override // java.util.function.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((C327221<T, U, R>) obj, (Entry<C327221<T, U, R>, V>) obj2);
            }
        });
    }

    @Override // com.robinhood.concurrent.KeyedInstanceManager
    public <R> R acquire(K key, Function1<? super V, ? extends R> takeInstance) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(takeInstance, "takeInstance");
        try {
            return takeInstance.invoke(obtain(key).getInstance());
        } catch (Throwable th) {
            free(key);
            throw th;
        }
    }

    @Override // com.robinhood.concurrent.KeyedInstanceManager
    public <R> R release(K key, Function1<? super V, ? extends R> dropInstance) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(dropInstance, "dropInstance");
        R rInvoke = dropInstance.invoke((Object) ((Entry) MapsKt.getValue(this.map, key)).getInstance());
        free(key);
        return rInvoke;
    }

    public final Set<K> getKeys() {
        Set<K> setKeySet = this.map.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        return setKeySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KeyedInstanceManager.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0002B6\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003\u0012\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000J\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0000J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\u0004\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR(\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/concurrent/DefaultKeyedInstanceManager$Entry;", "K", "", "V", "key", "instance", "destroyInstance", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getInstance", "getDestroyInstance", "()Lkotlin/jvm/functions/Function2;", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "acquire", "release", "toString", "", "lib-concurrent"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.concurrent.DefaultKeyedInstanceManager$Entry, reason: from toString */
    static final class Entry<K, V> {
        private final AtomicInteger counter;
        private final Function2<V, K, Unit> destroyInstance;
        private final V instance;
        private final K key;

        /* JADX WARN: Multi-variable type inference failed */
        public Entry(K key, V instance, Function2<? super V, ? super K, Unit> destroyInstance) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(destroyInstance, "destroyInstance");
            this.key = key;
            this.instance = instance;
            this.destroyInstance = destroyInstance;
            this.counter = new AtomicInteger(0);
        }

        public final Function2<V, K, Unit> getDestroyInstance() {
            return this.destroyInstance;
        }

        public final V getInstance() {
            return this.instance;
        }

        public final K getKey() {
            return this.key;
        }

        public final Entry<K, V> acquire() {
            this.counter.incrementAndGet();
            return this;
        }

        public final Entry<K, V> release() {
            if (this.counter.decrementAndGet() != 0) {
                return this;
            }
            this.destroyInstance.invoke(this.instance, this.key);
            return null;
        }

        public String toString() {
            return "Entry(" + this.key + ", " + this.instance + ", " + this.counter + ")";
        }
    }

    @Override // com.robinhood.concurrent.KeyedInstanceManager
    public <R> R getOrNull(K key, Function1<? super V, ? extends R> takeInstance) {
        V entry;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(takeInstance, "takeInstance");
        Entry<K, V> entry2 = this.map.get(key);
        if (entry2 == null || (entry = entry2.getInstance()) == null) {
            return null;
        }
        return takeInstance.invoke(entry);
    }
}
