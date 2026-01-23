package com.robinhood.hammer.core.internal;

import com.robinhood.hammer.core.internal.ComponentManager;
import kotlin.Metadata;

/* compiled from: ComponentManagerHolder.kt */
@InternalHammerApi
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001 \u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/hammer/core/internal/ComponentManagerHolder;", "V", "Lcom/robinhood/hammer/core/internal/ComponentManager;", "", "componentManager", "getComponentManager", "()Lcom/robinhood/hammer/core/internal/ComponentManager;", "lib-hammer"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface ComponentManagerHolder<V extends ComponentManager<?>> {
    V getComponentManager();
}
