package com.robinhood.android;

import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.hammer.core.internal.InternalHammerApi;
import com.robinhood.shared.app.BaseApp;
import kotlin.Metadata;

/* compiled from: App.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\t8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/App;", "Lcom/robinhood/shared/app/BaseApp;", "Lcom/robinhood/hammer/android/application/ApplicationComponentManagerHolder;", "Lcom/robinhood/android/AppComponent;", "<init>", "()V", "componentManagerLock", "", "_componentManager", "Lcom/robinhood/android/AppComponentManager;", "resetComponent", "", "componentManager", "getComponentManager$annotations", "getComponentManager", "()Lcom/robinhood/android/AppComponentManager;", "rebuildObjectGraph", "app-2025.51.4_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class App extends BaseApp implements ApplicationComponentManagerHolder<AppComponent> {
    private volatile AppComponentManager _componentManager;
    private final Object componentManagerLock = new Object();

    @InternalHammerApi
    public static /* synthetic */ void getComponentManager$annotations() {
    }

    @Override // com.robinhood.hammer.android.application.ApplicationComponentManagerHolder
    public void resetComponent() {
        this._componentManager = null;
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public AppComponentManager getComponentManager() {
        AppComponentManager appComponentManager;
        AppComponentManager appComponentManager2 = this._componentManager;
        if (appComponentManager2 != null) {
            return appComponentManager2;
        }
        synchronized (this.componentManagerLock) {
            appComponentManager = this._componentManager;
            if (appComponentManager == null) {
                appComponentManager = new AppComponentManager(this);
                this._componentManager = appComponentManager;
            }
        }
        return appComponentManager;
    }

    @Override // com.robinhood.shared.app.BaseApp
    public void rebuildObjectGraph() {
        AppObjectGraph.INSTANCE.rebuildObjectGraph(this);
    }
}
