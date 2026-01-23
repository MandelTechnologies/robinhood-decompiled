package com.robinhood.android.moria.network.bouncer.internal;

import androidx.collection.LruCache;
import com.robinhood.android.moria.network.bouncer.RealMetadata;
import com.robinhood.android.moria.network.bouncer.internal.MetadataMap;
import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: RealMetadataMap.kt */
@Metadata(m3635d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u000f\u0018\u0000 \u0012*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0012B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/moria/network/bouncer/internal/RealMetadataMap;", "", "P", "Lcom/robinhood/android/moria/network/bouncer/internal/MetadataMap;", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "key", "Lcom/robinhood/android/moria/network/bouncer/Metadata;", "getMetadata", "(Ljava/lang/Object;)Lcom/robinhood/android/moria/network/bouncer/Metadata;", "", "clearMap", "()V", "com/robinhood/android/moria/network/bouncer/internal/RealMetadataMap$map$1", "map", "Lcom/robinhood/android/moria/network/bouncer/internal/RealMetadataMap$map$1;", "Companion", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RealMetadataMap<P> implements MetadataMap<P> {
    public static final int CACHE_SIZE = 500;
    private final RealMetadataMap2 map;

    public RealMetadataMap(final Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.map = new LruCache<P, com.robinhood.android.moria.network.bouncer.Metadata>(this) { // from class: com.robinhood.android.moria.network.bouncer.internal.RealMetadataMap$map$1
            final /* synthetic */ RealMetadataMap<P> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(500);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.collection.LruCache
            public /* bridge */ /* synthetic */ com.robinhood.android.moria.network.bouncer.Metadata create(Object obj) {
                return create((RealMetadataMap2<P>) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.collection.LruCache
            protected com.robinhood.android.moria.network.bouncer.Metadata create(P key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return new RealMetadata(key, this.this$0, clock);
            }
        };
    }

    @Override // com.robinhood.android.moria.network.bouncer.internal.MetadataMap
    public <R> Object track(P p, Function2<? super P, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return MetadataMap.DefaultImpls.track(this, p, function2, continuation);
    }

    @Override // com.robinhood.android.moria.network.bouncer.internal.MetadataMap
    public com.robinhood.android.moria.network.bouncer.Metadata getMetadata(P key) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.robinhood.android.moria.network.bouncer.Metadata metadata = get(key);
        if (metadata != null) {
            return metadata;
        }
        throw new IllegalStateException("overridden create() should handle null case");
    }

    @Override // com.robinhood.android.moria.network.bouncer.internal.MetadataMap
    public void clearMap() {
        evictAll();
    }
}
