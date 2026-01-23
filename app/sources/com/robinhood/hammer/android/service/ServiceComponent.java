package com.robinhood.hammer.android.service;

import android.app.Service;
import kotlin.Metadata;

/* compiled from: ServiceComponent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/hammer/android/service/ServiceComponent;", "", "Factory", "ParentComponent", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface ServiceComponent {

    /* compiled from: ServiceComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/hammer/android/service/ServiceComponent$Factory;", "", "build", "Lcom/robinhood/hammer/android/service/ServiceComponent;", "service", "Landroid/app/Service;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory {
        ServiceComponent build(Service service);
    }

    /* compiled from: ServiceComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/hammer/android/service/ServiceComponent$ParentComponent;", "", "createServiceSubcomponentFactory", "Lcom/robinhood/hammer/android/service/ServiceComponent$Factory;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public interface ParentComponent {
        Factory createServiceSubcomponentFactory();
    }
}
