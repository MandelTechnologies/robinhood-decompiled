package com.robinhood.hammer.core.internal;

import dagger.MembersInjector;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicInjector.kt */
@InternalHammerApi
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rR\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/hammer/core/internal/MapDynamicInjector;", "T", "", "Lcom/robinhood/hammer/core/internal/DynamicInjector;", "membersInjectors", "", "", "Ldagger/MembersInjector;", "<init>", "(Ljava/util/Map;)V", "inject", "", "instance", "(Ljava/lang/Object;)V", "common"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.core.internal.MapDynamicInjector, reason: use source file name */
/* loaded from: classes20.dex */
public final class DynamicInjector2<T> implements DynamicInjector<T> {
    private final Map<String, MembersInjector<? extends T>> membersInjectors;

    /* JADX WARN: Multi-variable type inference failed */
    public DynamicInjector2(Map<String, ? extends MembersInjector<? extends T>> membersInjectors) {
        Intrinsics.checkNotNullParameter(membersInjectors, "membersInjectors");
        this.membersInjectors = membersInjectors;
    }

    @Override // com.robinhood.hammer.core.internal.DynamicInjector
    public void inject(T instance) throws DynamicInjector3 {
        Intrinsics.checkNotNullParameter(instance, "instance");
        MembersInjector<? extends T> membersInjector = this.membersInjectors.get(instance.getClass().getName());
        if (membersInjector == null) {
            throw new DynamicInjector3("No injector available for " + instance.getClass(), null, 2, null);
        }
        membersInjector.injectMembers(instance);
    }
}
