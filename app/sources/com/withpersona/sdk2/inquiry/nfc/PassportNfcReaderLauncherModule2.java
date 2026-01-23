package com.withpersona.sdk2.inquiry.nfc;

import androidx.view.result.ActivityResultCallback;
import com.withpersona.sdk2.inquiry.launchers.ReusableActivityResultLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassportNfcReaderLauncherModule.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m3636d2 = {"createPassportNfcReaderLauncher", "Lcom/withpersona/sdk2/inquiry/launchers/ReusableActivityResultLauncher;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "nfc_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderLauncherModuleKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class PassportNfcReaderLauncherModule2 {
    public static final ReusableActivityResultLauncher<PassportNfcReaderConfig, PassportNfcReaderOutput> createPassportNfcReaderLauncher() {
        return new ReusableActivityResultLauncher<>(new PassportNfcReaderContract(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderLauncherModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                PassportNfcReaderLauncherModule2.createPassportNfcReaderLauncher$lambda$0((PassportNfcReaderOutput) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPassportNfcReaderLauncher$lambda$0(PassportNfcReaderOutput result) {
        Intrinsics.checkNotNullParameter(result, "result");
        new PassportNfcReaderResultSender().sendResults(result);
    }
}
