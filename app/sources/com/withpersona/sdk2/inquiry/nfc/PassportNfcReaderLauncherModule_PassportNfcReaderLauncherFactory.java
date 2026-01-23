package com.withpersona.sdk2.inquiry.nfc;

import androidx.view.result.ActivityResultLauncher;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class PassportNfcReaderLauncherModule_PassportNfcReaderLauncherFactory implements Factory<ActivityResultLauncher<PassportNfcReaderConfig>> {
    private final PassportNfcReaderLauncherModule module;

    public PassportNfcReaderLauncherModule_PassportNfcReaderLauncherFactory(PassportNfcReaderLauncherModule passportNfcReaderLauncherModule) {
        this.module = passportNfcReaderLauncherModule;
    }

    @Override // javax.inject.Provider
    public ActivityResultLauncher<PassportNfcReaderConfig> get() {
        return passportNfcReaderLauncher(this.module);
    }

    public static PassportNfcReaderLauncherModule_PassportNfcReaderLauncherFactory create(PassportNfcReaderLauncherModule passportNfcReaderLauncherModule) {
        return new PassportNfcReaderLauncherModule_PassportNfcReaderLauncherFactory(passportNfcReaderLauncherModule);
    }

    public static ActivityResultLauncher<PassportNfcReaderConfig> passportNfcReaderLauncher(PassportNfcReaderLauncherModule passportNfcReaderLauncherModule) {
        return (ActivityResultLauncher) Preconditions.checkNotNullFromProvides(passportNfcReaderLauncherModule.passportNfcReaderLauncher());
    }
}
