package com.robinhood.hammer.android.application;

import com.robinhood.hammer.core.internal.ComponentManager;
import com.robinhood.hammer.core.internal.ComponentManagerHolder;
import kotlin.Metadata;

/* compiled from: ApplicationComponentManagerHolder.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/hammer/android/application/ApplicationComponentManagerHolder;", "T", "", "Lcom/robinhood/hammer/core/internal/ComponentManagerHolder;", "Lcom/robinhood/hammer/core/internal/ComponentManager;", "resetComponent", "", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface ApplicationComponentManagerHolder<T> extends ComponentManagerHolder<ComponentManager<? extends T>> {
    void resetComponent();
}
