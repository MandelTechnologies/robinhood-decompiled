package com.withpersona.sdk2.inquiry.shared.navigation;

import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalInquiryController;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class NavigationStateManager_Factory implements Factory<NavigationStateManager> {
    private final Provider<ExternalInquiryController> externalInquiryControllerProvider;

    public NavigationStateManager_Factory(Provider<ExternalInquiryController> provider) {
        this.externalInquiryControllerProvider = provider;
    }

    @Override // javax.inject.Provider
    public NavigationStateManager get() {
        return newInstance(this.externalInquiryControllerProvider.get());
    }

    public static NavigationStateManager_Factory create(Provider<ExternalInquiryController> provider) {
        return new NavigationStateManager_Factory(provider);
    }

    public static NavigationStateManager newInstance(ExternalInquiryController externalInquiryController) {
        return new NavigationStateManager(externalInquiryController);
    }
}
