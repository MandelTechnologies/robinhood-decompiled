package com.withpersona.sdk2.inquiry.launchers;

import android.net.Uri;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.PickVisualMediaRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocumentLaunchersModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/DocumentLaunchersModule;", "", "pictureLaunchResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "openDocumentsResultLauncher", "", "", "selectFromPhotoLibraryLauncher", "Landroidx/activity/result/PickVisualMediaRequest;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/ActivityResultLauncher;)V", "takePictureResultLauncher", "launchers_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DocumentLaunchersModule {
    private final ActivityResultLauncher<String[]> openDocumentsResultLauncher;
    private final ActivityResultLauncher<Uri> pictureLaunchResultLauncher;
    private final ActivityResultLauncher<PickVisualMediaRequest> selectFromPhotoLibraryLauncher;

    public DocumentLaunchersModule(ActivityResultLauncher<Uri> pictureLaunchResultLauncher, ActivityResultLauncher<String[]> openDocumentsResultLauncher, ActivityResultLauncher<PickVisualMediaRequest> selectFromPhotoLibraryLauncher) {
        Intrinsics.checkNotNullParameter(pictureLaunchResultLauncher, "pictureLaunchResultLauncher");
        Intrinsics.checkNotNullParameter(openDocumentsResultLauncher, "openDocumentsResultLauncher");
        Intrinsics.checkNotNullParameter(selectFromPhotoLibraryLauncher, "selectFromPhotoLibraryLauncher");
        this.pictureLaunchResultLauncher = pictureLaunchResultLauncher;
        this.openDocumentsResultLauncher = openDocumentsResultLauncher;
        this.selectFromPhotoLibraryLauncher = selectFromPhotoLibraryLauncher;
    }

    public final ActivityResultLauncher<Uri> takePictureResultLauncher() {
        return this.pictureLaunchResultLauncher;
    }

    public final ActivityResultLauncher<String[]> openDocumentsResultLauncher() {
        return this.openDocumentsResultLauncher;
    }

    public final ActivityResultLauncher<PickVisualMediaRequest> selectFromPhotoLibraryLauncher() {
        return this.selectFromPhotoLibraryLauncher;
    }
}
