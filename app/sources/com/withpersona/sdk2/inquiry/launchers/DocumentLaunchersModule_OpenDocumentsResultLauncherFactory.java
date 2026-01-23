package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResultLauncher;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class DocumentLaunchersModule_OpenDocumentsResultLauncherFactory implements Factory<ActivityResultLauncher<String[]>> {
    private final DocumentLaunchersModule module;

    public DocumentLaunchersModule_OpenDocumentsResultLauncherFactory(DocumentLaunchersModule documentLaunchersModule) {
        this.module = documentLaunchersModule;
    }

    @Override // javax.inject.Provider
    public ActivityResultLauncher<String[]> get() {
        return openDocumentsResultLauncher(this.module);
    }

    public static DocumentLaunchersModule_OpenDocumentsResultLauncherFactory create(DocumentLaunchersModule documentLaunchersModule) {
        return new DocumentLaunchersModule_OpenDocumentsResultLauncherFactory(documentLaunchersModule);
    }

    public static ActivityResultLauncher<String[]> openDocumentsResultLauncher(DocumentLaunchersModule documentLaunchersModule) {
        return (ActivityResultLauncher) Preconditions.checkNotNullFromProvides(documentLaunchersModule.openDocumentsResultLauncher());
    }
}
