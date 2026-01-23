package com.withpersona.sdk2.inquiry.launchers;

import android.net.Uri;
import androidx.view.result.ActivityResultLauncher;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class DocumentLaunchersModule_TakePictureResultLauncherFactory implements Factory<ActivityResultLauncher<Uri>> {
    private final DocumentLaunchersModule module;

    public DocumentLaunchersModule_TakePictureResultLauncherFactory(DocumentLaunchersModule documentLaunchersModule) {
        this.module = documentLaunchersModule;
    }

    @Override // javax.inject.Provider
    public ActivityResultLauncher<Uri> get() {
        return takePictureResultLauncher(this.module);
    }

    public static DocumentLaunchersModule_TakePictureResultLauncherFactory create(DocumentLaunchersModule documentLaunchersModule) {
        return new DocumentLaunchersModule_TakePictureResultLauncherFactory(documentLaunchersModule);
    }

    public static ActivityResultLauncher<Uri> takePictureResultLauncher(DocumentLaunchersModule documentLaunchersModule) {
        return (ActivityResultLauncher) Preconditions.checkNotNullFromProvides(documentLaunchersModule.takePictureResultLauncher());
    }
}
