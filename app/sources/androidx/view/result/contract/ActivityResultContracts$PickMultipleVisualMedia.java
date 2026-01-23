package androidx.view.result.contract;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.view.result.PickVisualMediaRequest;
import androidx.view.result.contract.ActivityResultContract;
import androidx.view.result.contract.ActivityResultContracts$PickVisualMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ActivityResultContracts.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00182\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0018B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0011\u001a\u0015\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"androidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "maxItems", "<init>", "(I)V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Landroidx/activity/result/PickVisualMediaRequest;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "I", "Companion", "activity_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class ActivityResultContracts$PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int maxItems;

    public ActivityResultContracts$PickMultipleVisualMedia() {
        this(0, 1, null);
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, PickVisualMediaRequest input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    public /* synthetic */ ActivityResultContracts$PickMultipleVisualMedia(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? INSTANCE.getMaxItems$activity_release() : i);
    }

    public ActivityResultContracts$PickMultipleVisualMedia(int i) {
        this.maxItems = i;
        if (i <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public Intent createIntent(Context context, PickVisualMediaRequest input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        ActivityResultContracts$PickVisualMedia.Companion companion = ActivityResultContracts$PickVisualMedia.INSTANCE;
        if (companion.isSystemPickerAvailable$activity_release()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
            int iMin = Math.min(this.maxItems, input.getMaxItems());
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().getValue());
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", input.getIsOrderedSelection());
            if (input.getIsCustomAccentColorApplied()) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
            }
            return intent;
        }
        if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
            ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
            if (systemFallbackPicker$activity_release == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
            int iMin2 = Math.min(this.maxItems, input.getMaxItems());
            if (iMin2 <= 1) {
                throw new IllegalArgumentException("Max items must be greater than 1");
            }
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().getValue());
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", input.getIsOrderedSelection());
            if (input.getIsCustomAccentColorApplied()) {
                intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
            }
            return intent2;
        }
        Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent3.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
        intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent3.getType() == null) {
            intent3.setType("*/*");
            intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        }
        return intent3;
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public final List<Uri> parseResult(int resultCode, Intent intent) {
        List<Uri> clipDataUris$activity_release;
        if (resultCode != -1) {
            intent = null;
        }
        return (intent == null || (clipDataUris$activity_release = ActivityResultContracts$GetMultipleContents.INSTANCE.getClipDataUris$activity_release(intent)) == null) ? CollectionsKt.emptyList() : clipDataUris$activity_release;
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia$Companion;", "", "()V", "getMaxItems", "", "getMaxItems$activity_release", "activity_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final int getMaxItems$activity_release() {
            if (ActivityResultContracts$PickVisualMedia.INSTANCE.isSystemPickerAvailable$activity_release()) {
                return MediaStore.getPickImagesMaxLimit();
            }
            return Integer.MAX_VALUE;
        }
    }
}
