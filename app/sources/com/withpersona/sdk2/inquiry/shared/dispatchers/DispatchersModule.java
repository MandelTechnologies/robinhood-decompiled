package com.withpersona.sdk2.inquiry.shared.dispatchers;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: DispatchersModule.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/dispatchers/DispatchersModule;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideDefaultDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DispatchersModule {
    public final CoroutineDispatcher provideDefaultDispatcher() {
        return Dispatchers.getDefault();
    }
}
