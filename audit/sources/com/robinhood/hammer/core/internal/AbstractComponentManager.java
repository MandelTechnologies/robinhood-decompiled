package com.robinhood.hammer.core.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbstractComponentManager.kt */
@InternalHammerApi
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0002\u0010\bJ\u0017\u0010\f\u001a\u0002H\r\"\b\b\u0001\u0010\r*\u00020\u0002H\u0016¢\u0006\u0002\u0010\bR\u001b\u0010\u0006\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/hammer/core/internal/AbstractComponentManager;", "T", "", "Lcom/robinhood/hammer/core/internal/ComponentManager;", "<init>", "()V", "component", "getComponent", "()Ljava/lang/Object;", "component$delegate", "Lkotlin/Lazy;", "createComponent", "get", "U", "runtime"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public abstract class AbstractComponentManager<T> implements ComponentManager<T> {

    /* renamed from: component$delegate, reason: from kotlin metadata */
    private final Lazy component = LazyKt.lazy(new Function0() { // from class: com.robinhood.hammer.core.internal.AbstractComponentManager$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.createComponent();
        }
    });

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T createComponent();

    private final T getComponent() {
        return (T) this.component.getValue();
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManager
    public <U> U get() {
        T component = getComponent();
        Intrinsics.checkNotNull(component, "null cannot be cast to non-null type U of com.robinhood.hammer.core.internal.AbstractComponentManager.get");
        return component;
    }
}
