package com.withpersona.sdk2.inquiry.launchers;

import androidx.view.result.ActivityResultLauncher;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class DocumentSelectLauncherModule_OpenDocumentResultLauncherFactory implements Factory<ActivityResultLauncher<String[]>> {
    private final DocumentSelectLauncherModule module;

    public DocumentSelectLauncherModule_OpenDocumentResultLauncherFactory(DocumentSelectLauncherModule documentSelectLauncherModule) {
        this.module = documentSelectLauncherModule;
    }

    @Override // javax.inject.Provider
    public ActivityResultLauncher<String[]> get() {
        return openDocumentResultLauncher(this.module);
    }

    public static DocumentSelectLauncherModule_OpenDocumentResultLauncherFactory create(DocumentSelectLauncherModule documentSelectLauncherModule) {
        return new DocumentSelectLauncherModule_OpenDocumentResultLauncherFactory(documentSelectLauncherModule);
    }

    public static ActivityResultLauncher<String[]> openDocumentResultLauncher(DocumentSelectLauncherModule documentSelectLauncherModule) {
        return (ActivityResultLauncher) Preconditions.checkNotNullFromProvides(documentSelectLauncherModule.openDocumentResultLauncher());
    }
}
