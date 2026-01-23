package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import androidx.view.result.ActivityResultLauncher;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import dagger.internal.Provider;
import java.util.List;

/* renamed from: com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes18.dex */
public final class C50860ScanNfcWorker_Factory {
    private final Provider<Context> contextProvider;
    private final Provider<ActivityResultLauncher<PassportNfcReaderConfig>> passportNfcReaderLauncherProvider;
    private final Provider<SandboxFlags> sandboxFlagsProvider;

    public C50860ScanNfcWorker_Factory(Provider<ActivityResultLauncher<PassportNfcReaderConfig>> provider, Provider<Context> provider2, Provider<SandboxFlags> provider3) {
        this.passportNfcReaderLauncherProvider = provider;
        this.contextProvider = provider2;
        this.sandboxFlagsProvider = provider3;
    }

    public ScanNfcWorker get(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends NfcDataGroupType> list, StepStyles.UiStepStyle uiStepStyle, Integer num) {
        return newInstance(this.passportNfcReaderLauncherProvider.get(), this.contextProvider.get(), this.sandboxFlagsProvider.get(), str, mrzKey, passportNfcStrings, list, uiStepStyle, num);
    }

    public static C50860ScanNfcWorker_Factory create(Provider<ActivityResultLauncher<PassportNfcReaderConfig>> provider, Provider<Context> provider2, Provider<SandboxFlags> provider3) {
        return new C50860ScanNfcWorker_Factory(provider, provider2, provider3);
    }

    public static ScanNfcWorker newInstance(ActivityResultLauncher<PassportNfcReaderConfig> activityResultLauncher, Context context, SandboxFlags sandboxFlags, String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends NfcDataGroupType> list, StepStyles.UiStepStyle uiStepStyle, Integer num) {
        return new ScanNfcWorker(activityResultLauncher, context, sandboxFlags, str, mrzKey, passportNfcStrings, list, uiStepStyle, num);
    }
}
