package com.withpersona.sdk2.inquiry.shared.files;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class FilesModule_ProvideSdkFilesManagerFactory implements Factory<SdkFilesManager> {
    private final FilesModule module;

    public FilesModule_ProvideSdkFilesManagerFactory(FilesModule filesModule) {
        this.module = filesModule;
    }

    @Override // javax.inject.Provider
    public SdkFilesManager get() {
        return provideSdkFilesManager(this.module);
    }

    public static FilesModule_ProvideSdkFilesManagerFactory create(FilesModule filesModule) {
        return new FilesModule_ProvideSdkFilesManagerFactory(filesModule);
    }

    public static SdkFilesManager provideSdkFilesManager(FilesModule filesModule) {
        return (SdkFilesManager) Preconditions.checkNotNullFromProvides(filesModule.getSdkFilesManager());
    }
}
