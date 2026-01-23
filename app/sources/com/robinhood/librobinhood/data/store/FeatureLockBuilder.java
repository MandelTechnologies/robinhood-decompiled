package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.FeatureLock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureLockBuilder.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/FeatureLockBuilder;", "", "<init>", "()V", "locks", "", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "addLock", "", "lock", "buildAnd", "buildOr", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class FeatureLockBuilder {
    private final List<FeatureLock> locks = new ArrayList();

    public final void addLock(FeatureLock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.locks.add(lock);
    }

    public final FeatureLock buildAnd() {
        return new FeatureLock.And(this.locks);
    }

    public final FeatureLock buildOr() {
        return new FeatureLock.Or(this.locks);
    }
}
