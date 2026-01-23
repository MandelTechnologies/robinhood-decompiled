package com.plaid.internal;

import android.util.LruCache;

/* renamed from: com.plaid.internal.U3 */
/* loaded from: classes16.dex */
public final class C5978U3<K, V> implements InterfaceC7255y<K, V> {

    /* renamed from: a */
    public final LruCache<K, V> f1747a = new LruCache<>(10);

    @Override // com.plaid.internal.InterfaceC7255y
    /* renamed from: a */
    public final void mo1328a(String str, Object obj) {
        this.f1747a.put(str, obj);
    }

    @Override // com.plaid.internal.InterfaceC7255y
    public final void clear() {
        this.f1747a.evictAll();
    }

    @Override // com.plaid.internal.InterfaceC7255y
    /* renamed from: a */
    public final Object mo1327a(String str) {
        return this.f1747a.get(str);
    }
}
