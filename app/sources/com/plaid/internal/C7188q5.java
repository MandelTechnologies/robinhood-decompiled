package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json6;

/* renamed from: com.plaid.internal.q5 */
/* loaded from: classes16.dex */
public final class C7188q5 implements Factory<Json> {

    /* renamed from: a */
    public final C7117j5 f3142a;

    public C7188q5(C7117j5 c7117j5) {
        this.f3142a = c7117j5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f3142a.getClass();
        return (Json) Preconditions.checkNotNullFromProvides(Json6.Json$default(null, C7126k5.f2904a, 1, null));
    }
}
