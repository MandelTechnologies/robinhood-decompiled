package com.withpersona.sdk2.inquiry.shared;

import android.view.Window;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class SharedModule_SystemUiControllerFactory implements Factory<SystemUiController> {
    private final SharedModule module;
    private final Provider<Window> windowProvider;

    public SharedModule_SystemUiControllerFactory(SharedModule sharedModule, Provider<Window> provider) {
        this.module = sharedModule;
        this.windowProvider = provider;
    }

    @Override // javax.inject.Provider
    public SystemUiController get() {
        return systemUiController(this.module, this.windowProvider.get());
    }

    public static SharedModule_SystemUiControllerFactory create(SharedModule sharedModule, Provider<Window> provider) {
        return new SharedModule_SystemUiControllerFactory(sharedModule, provider);
    }

    public static SystemUiController systemUiController(SharedModule sharedModule, Window window) {
        return (SystemUiController) Preconditions.checkNotNullFromProvides(sharedModule.systemUiController(window));
    }
}
