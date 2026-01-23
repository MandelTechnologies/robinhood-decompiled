package com.withpersona.sdk2.inquiry.shared;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class SharedModule_FileHelperFactory implements Factory<FileHelper> {
    private final Provider<FileHelper2> fileHelperProvider;
    private final SharedModule module;

    public SharedModule_FileHelperFactory(SharedModule sharedModule, Provider<FileHelper2> provider) {
        this.module = sharedModule;
        this.fileHelperProvider = provider;
    }

    @Override // javax.inject.Provider
    public FileHelper get() {
        return fileHelper(this.module, this.fileHelperProvider.get());
    }

    public static SharedModule_FileHelperFactory create(SharedModule sharedModule, Provider<FileHelper2> provider) {
        return new SharedModule_FileHelperFactory(sharedModule, provider);
    }

    public static FileHelper fileHelper(SharedModule sharedModule, FileHelper2 fileHelper2) {
        return (FileHelper) Preconditions.checkNotNullFromProvides(sharedModule.fileHelper(fileHelper2));
    }
}
