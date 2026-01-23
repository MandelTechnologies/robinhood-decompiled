package com.robinhood.hammer.android.service;

import android.app.Service;
import android.content.ComponentCallbacks2;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.hammer.android.service.ServiceComponent;
import com.robinhood.hammer.core.internal.AbstractComponentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServiceComponentManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/hammer/android/service/ServiceComponentManager;", "Lcom/robinhood/hammer/core/internal/AbstractComponentManager;", "Lcom/robinhood/hammer/android/service/ServiceComponent;", "service", "Landroid/app/Service;", "<init>", "(Landroid/app/Service;)V", "createComponent", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ServiceComponentManager extends AbstractComponentManager<ServiceComponent> {
    private final Service service;

    public ServiceComponentManager(Service service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.hammer.core.internal.AbstractComponentManager
    public ServiceComponent createComponent() {
        ComponentCallbacks2 application = this.service.getApplication();
        ApplicationComponentManagerHolder applicationComponentManagerHolder = application instanceof ApplicationComponentManagerHolder ? (ApplicationComponentManagerHolder) application : null;
        if (applicationComponentManagerHolder == null) {
            throw new IllegalStateException("Application class must implement ApplicationComponentManagerHolder");
        }
        return ((ServiceComponent.ParentComponent) applicationComponentManagerHolder.getComponentManager().get()).createServiceSubcomponentFactory().build(this.service);
    }
}
