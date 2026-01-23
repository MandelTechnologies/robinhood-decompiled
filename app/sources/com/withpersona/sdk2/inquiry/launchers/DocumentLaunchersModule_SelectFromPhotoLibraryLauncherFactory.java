package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.PickVisualMediaRequest;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class DocumentLaunchersModule_SelectFromPhotoLibraryLauncherFactory implements Factory<ActivityResultLauncher<PickVisualMediaRequest>> {
    private final DocumentLaunchersModule module;

    public DocumentLaunchersModule_SelectFromPhotoLibraryLauncherFactory(DocumentLaunchersModule documentLaunchersModule) {
        this.module = documentLaunchersModule;
    }

    @Override // javax.inject.Provider
    public ActivityResultLauncher<PickVisualMediaRequest> get() {
        return selectFromPhotoLibraryLauncher(this.module);
    }

    public static DocumentLaunchersModule_SelectFromPhotoLibraryLauncherFactory create(DocumentLaunchersModule documentLaunchersModule) {
        return new DocumentLaunchersModule_SelectFromPhotoLibraryLauncherFactory(documentLaunchersModule);
    }

    public static ActivityResultLauncher<PickVisualMediaRequest> selectFromPhotoLibraryLauncher(DocumentLaunchersModule documentLaunchersModule) {
        return (ActivityResultLauncher) Preconditions.checkNotNullFromProvides(documentLaunchersModule.selectFromPhotoLibraryLauncher());
    }
}
