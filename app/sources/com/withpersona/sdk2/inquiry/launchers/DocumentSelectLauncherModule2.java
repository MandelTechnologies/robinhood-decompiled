package com.withpersona.sdk2.inquiry.launchers;

import android.net.Uri;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.contract.ActivityResultContracts$OpenDocument;
import kotlin.Metadata;

/* compiled from: DocumentSelectLauncherModule.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¨\u0006\u0005"}, m3636d2 = {"createOpenDocumentLauncher", "Lcom/withpersona/sdk2/inquiry/launchers/ReusableActivityResultLauncher;", "", "", "Landroid/net/Uri;", "launchers_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModuleKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class DocumentSelectLauncherModule2 {
    public static final ReusableActivityResultLauncher<String[], Uri> createOpenDocumentLauncher() {
        return new ReusableActivityResultLauncher<>(new ActivityResultContracts$OpenDocument(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DocumentSelectLauncherModule2.createOpenDocumentLauncher$lambda$0((Uri) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createOpenDocumentLauncher$lambda$0(Uri uri) {
        new DocumentSelectLauncherResult().sendDocument(uri);
    }
}
