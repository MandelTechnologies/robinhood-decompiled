package androidx.view.result;

import androidx.view.result.PickVisualMediaRequest;
import androidx.view.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.view.result.contract.ActivityResultContracts$PickVisualMedia;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PickVisualMediaRequest.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "", "maxItems", "", "isOrderedSelection", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "defaultTab", "Landroidx/activity/result/PickVisualMediaRequest;", "PickVisualMediaRequest", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;IZLandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)Landroidx/activity/result/PickVisualMediaRequest;", "activity_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.activity.result.PickVisualMediaRequestKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class PickVisualMediaRequest2 {
    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts$PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z, ActivityResultContracts$PickVisualMedia.DefaultTab defaultTab, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            visualMediaType = ActivityResultContracts$PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = ActivityResultContracts$PickMultipleVisualMedia.INSTANCE.getMaxItems$activity_release();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            defaultTab = ActivityResultContracts$PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType, i, z, defaultTab);
    }

    public static final PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts$PickVisualMedia.VisualMediaType mediaType, int i, boolean z, ActivityResultContracts$PickVisualMedia.DefaultTab defaultTab) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i).setOrderedSelection(z).setDefaultTab(defaultTab).build();
    }
}
