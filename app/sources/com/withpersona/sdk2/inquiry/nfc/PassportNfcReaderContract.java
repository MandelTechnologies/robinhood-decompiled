package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.os.BundleCompat;
import androidx.view.result.contract.ActivityResultContract;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PassportNfcReaderContract.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "nfc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class PassportNfcReaderContract extends ActivityResultContract<PassportNfcReaderConfig, PassportNfcReaderOutput> {
    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, PassportNfcReaderConfig input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intent = new Intent(context, NfcUtils.INSTANCE.getPassportNfcActivityClass$nfc_release());
        intent.putExtra("EXTRA_NFC_READER_CONFIG", input);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public PassportNfcReaderOutput parseResult(int resultCode, Intent intent) {
        Bundle extras;
        PassportNfcReaderOutput passportNfcReaderOutput;
        return (intent == null || (extras = intent.getExtras()) == null || (passportNfcReaderOutput = (PassportNfcReaderOutput) BundleCompat.getParcelable(extras, "EXTRA_RESULT", PassportNfcReaderOutput.class)) == null) ? new PassportNfcReaderOutput.Error("Unable to extract output from result intent.", PassportNfcReaderOutput.ErrorType.Unknown) : passportNfcReaderOutput;
    }
}
