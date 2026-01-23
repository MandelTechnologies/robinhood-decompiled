package com.withpersona.sdk2.inquiry.launchers;

import android.net.Uri;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.PickVisualMediaRequest;
import androidx.view.result.contract.ActivityResultContracts$OpenMultipleDocuments;
import androidx.view.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.view.result.contract.ActivityResultContracts$TakePicture;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentLaunchersModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u001a#\u0010\u0004\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\b0\u00070\u0001\u001a\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\n\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\b0\u00070\u0001¨\u0006\u000b"}, m3636d2 = {"createTakePictureLauncher", "Lcom/withpersona/sdk2/inquiry/launchers/ReusableActivityResultLauncher;", "Landroid/net/Uri;", "", "createOpenDocumentsLauncher", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "createOpenFromPhotoLibraryLauncher", "Landroidx/activity/result/PickVisualMediaRequest;", "launchers_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class DocumentLaunchersModule2 {
    public static final ReusableActivityResultLauncher<Uri, Boolean> createTakePictureLauncher() {
        return new ReusableActivityResultLauncher<>(new ActivityResultContracts$TakePicture(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DocumentLaunchersModule2.createTakePictureLauncher$lambda$0(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTakePictureLauncher$lambda$0(boolean z) {
        new PictureLauncherResult().sendStatus(z);
    }

    public static final ReusableActivityResultLauncher<String[], List<Uri>> createOpenDocumentsLauncher() {
        return new ReusableActivityResultLauncher<>(new ActivityResultContracts$OpenMultipleDocuments(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DocumentLaunchersModule2.createOpenDocumentsLauncher$lambda$1((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createOpenDocumentsLauncher$lambda$1(List uriList) {
        Intrinsics.checkNotNullParameter(uriList, "uriList");
        new DocumentsSelectLauncherResult().sendDocuments(uriList);
    }

    public static final ReusableActivityResultLauncher<PickVisualMediaRequest, List<Uri>> createOpenFromPhotoLibraryLauncher() {
        return new ReusableActivityResultLauncher<>(new ActivityResultContracts$PickMultipleVisualMedia(0, 1, null), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModuleKt$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DocumentLaunchersModule2.createOpenFromPhotoLibraryLauncher$lambda$2((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createOpenFromPhotoLibraryLauncher$lambda$2(List uriList) {
        Intrinsics.checkNotNullParameter(uriList, "uriList");
        new DocumentsSelectLauncherResult().sendDocuments(uriList);
    }
}
