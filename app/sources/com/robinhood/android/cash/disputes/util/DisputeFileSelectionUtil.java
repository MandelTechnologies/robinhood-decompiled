package com.robinhood.android.cash.disputes.util;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.p070ui.question.image.FileSelectionItem;
import com.robinhood.android.cash.disputes.util.DisputeFileData;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.logging.CrashReporter;
import com.singular.sdk.internal.Constants;
import io.reactivex.Single;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import kotlin.p481io.FilesKt;
import kotlin.p481io.IOStreams;

/* compiled from: DisputeFileSelectionUtil.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002+,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u001bJ(\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001d0\u00172\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001dJ\u0018\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u001fJ\u0018\u0010#\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001fH\u0002J\u001a\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\rH\u0002J\u001a\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\rH\u0002J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil;", "", "<init>", "()V", "MAX_FILE_SIZE", "", "DISPUTE_CAMERA_FILES_DIRECTORY", "", "getImagePickerIntent", "Landroid/content/Intent;", "getPdfPickerIntent", "getCameraIntent", "outputFileUri", "Landroid/net/Uri;", "getImageViewerIntent", "contentUri", "getPdfViewerIntent", "createCameraImageUri", "context", "Landroid/content/Context;", "clearCameraImageDirectory", "", "loadFileFromContentRequestIntent", "Lio/reactivex/Single;", "Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult;", "intent", "fileType", "Lcom/robinhood/android/cash/disputes/util/DisputeFileData$Type;", "loadFilesFromPreviousSelections", "", "files", "Lcom/robinhood/android/cash/disputes/util/DisputeFileData;", "loadFileDataAsByteArray", "", "file", "loadFileSelectionItem", "fileData", "getRenderedPdfBitmap", "Landroid/graphics/Bitmap;", "fileUri", "getFileInfoFromUri", "Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileInfo;", "getFileExtension", "FileInfo", "FileSelectionResult", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DisputeFileSelectionUtil {
    public static final int $stable = 0;
    private static final String DISPUTE_CAMERA_FILES_DIRECTORY = "dispute_camera_images";
    public static final DisputeFileSelectionUtil INSTANCE = new DisputeFileSelectionUtil();
    private static final long MAX_FILE_SIZE = 5000000;

    /* compiled from: DisputeFileSelectionUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisputeFileData.Type.values().length];
            try {
                iArr[DisputeFileData.Type.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisputeFileData.Type.PDF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DisputeFileSelectionUtil() {
    }

    public final Intent getImagePickerIntent() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/jpeg", "image/png"});
        intent.setType("image/*");
        return intent;
    }

    public final Intent getPdfPickerIntent() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.setType("application/pdf");
        return intent;
    }

    public final Intent getCameraIntent(Uri outputFileUri) {
        Intrinsics.checkNotNullParameter(outputFileUri, "outputFileUri");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", outputFileUri);
        return intent;
    }

    public final Intent getImageViewerIntent(Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(contentUri, "image/*");
        intent.setFlags(1);
        return intent;
    }

    public final Intent getPdfViewerIntent(Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(contentUri, "application/pdf");
        intent.setFlags(1);
        return intent;
    }

    public final Uri createCameraImageUri(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), DISPUTE_CAMERA_FILES_DIRECTORY);
            file.mkdirs();
            return Files.toFileProviderUri$default(new File(file, "camera_" + new SimpleDateFormat(context.getString(C10007R.string.camera_file_timestamp_format), Locale.US).format(new Date()) + ".jpg"), context, null, 2, null);
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            return null;
        }
    }

    public final void clearCameraImageDirectory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            FilesKt.deleteRecursively(new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), DISPUTE_CAMERA_FILES_DIRECTORY));
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
        }
    }

    public final Single<FileSelectionResult> loadFileFromContentRequestIntent(final Context context, Intent intent, final DisputeFileData.Type fileType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        final Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            Single<FileSelectionResult> singleJust = Single.just(FileSelectionResult.FileLoadingError.INSTANCE);
            Intrinsics.checkNotNull(singleJust);
            return singleJust;
        }
        Single<FileSelectionResult> singleFromCallable = Single.fromCallable(new Callable() { // from class: com.robinhood.android.cash.disputes.util.DisputeFileSelectionUtil.loadFileFromContentRequestIntent.1
            @Override // java.util.concurrent.Callable
            public final FileSelectionResult call() {
                DisputeFileSelectionUtil disputeFileSelectionUtil = DisputeFileSelectionUtil.INSTANCE;
                Context context2 = context;
                UUID uuidRandomUUID = UUID.randomUUID();
                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                Uri uri = data;
                return disputeFileSelectionUtil.loadFileSelectionItem(context2, new DisputeFileData(uuidRandomUUID, uri, fileType, disputeFileSelectionUtil.getFileExtension(context, uri)));
            }
        });
        Intrinsics.checkNotNull(singleFromCallable);
        return singleFromCallable;
    }

    public final Single<List<FileSelectionResult>> loadFilesFromPreviousSelections(final Context context, final List<DisputeFileData> files) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(files, "files");
        Single<List<FileSelectionResult>> singleFromCallable = Single.fromCallable(new Callable() { // from class: com.robinhood.android.cash.disputes.util.DisputeFileSelectionUtil.loadFilesFromPreviousSelections.1
            @Override // java.util.concurrent.Callable
            public final List<FileSelectionResult> call() {
                List<DisputeFileData> list = files;
                Context context2 = context;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(DisputeFileSelectionUtil.INSTANCE.loadFileSelectionItem(context2, (DisputeFileData) it.next()));
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFromCallable, "fromCallable(...)");
        return singleFromCallable;
    }

    public final byte[] loadFileDataAsByteArray(Context context, DisputeFileData file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(file.getUri());
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            byte[] bytes = IOStreams.readBytes(inputStreamOpenInputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStreamOpenInputStream : new BufferedInputStream(inputStreamOpenInputStream, 8192));
            Closeable.closeFinally(inputStreamOpenInputStream, null);
            return bytes;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FileSelectionResult loadFileSelectionItem(Context context, DisputeFileData fileData) throws Resources.NotFoundException, FileNotFoundException {
        Bitmap bitmapFromContentUri$default;
        Uri uri = fileData.getUri();
        DisputeFileData.Type type2 = fileData.getType();
        FileInfo fileInfoFromUri = getFileInfoFromUri(context, uri);
        if (fileInfoFromUri == null) {
            return FileSelectionResult.FileLoadingError.INSTANCE;
        }
        if (fileInfoFromUri.getSize() > MAX_FILE_SIZE) {
            return FileSelectionResult.FileTooLargeError.INSTANCE;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            bitmapFromContentUri$default = ContextsUiExtensions.getBitmapFromContentUri$default(context, uri, 0L, null, 6, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bitmapFromContentUri$default = getRenderedPdfBitmap(context, uri);
        }
        if (bitmapFromContentUri$default != null) {
            return new FileSelectionResult.Success(new FileSelectionItem(fileData, fileInfoFromUri.getName(), bitmapFromContentUri$default));
        }
        return FileSelectionResult.FileLoadingError.INSTANCE;
    }

    private final Bitmap getRenderedPdfBitmap(Context context, Uri fileUri) throws Resources.NotFoundException, FileNotFoundException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fileUri, Constants.REVENUE_AMOUNT_KEY);
        if (parcelFileDescriptorOpenFileDescriptor != null) {
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
            if (pdfRenderer.getPageCount() > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C10007R.dimen.dispute_file_selection_item_size);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
                pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                pageOpenPage.close();
                return bitmapCreateBitmap;
            }
        }
        return null;
    }

    private final FileInfo getFileInfoFromUri(Context context, Uri fileUri) {
        FileInfo fileInfo;
        Cursor cursorQuery = context.getContentResolver().query(fileUri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                Intrinsics.checkNotNull(string2);
                fileInfo = new FileInfo(string2, j);
            } else {
                fileInfo = null;
            }
            Closeable.closeFinally(cursorQuery, null);
            return fileInfo;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFileExtension(Context context, Uri fileUri) {
        String type2 = context.getContentResolver().getType(fileUri);
        Intrinsics.checkNotNull(type2);
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type2);
        Intrinsics.checkNotNull(extensionFromMimeType);
        return extensionFromMimeType;
    }

    /* compiled from: DisputeFileSelectionUtil.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileInfo;", "", "name", "", "size", "", "<init>", "(Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getSize", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FileInfo {
        public static final int $stable = 0;
        private final String name;
        private final long size;

        public static /* synthetic */ FileInfo copy$default(FileInfo fileInfo, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fileInfo.name;
            }
            if ((i & 2) != 0) {
                j = fileInfo.size;
            }
            return fileInfo.copy(str, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        public final FileInfo copy(String name, long size) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new FileInfo(name, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileInfo)) {
                return false;
            }
            FileInfo fileInfo = (FileInfo) other;
            return Intrinsics.areEqual(this.name, fileInfo.name) && this.size == fileInfo.size;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Long.hashCode(this.size);
        }

        public String toString() {
            return "FileInfo(name=" + this.name + ", size=" + this.size + ")";
        }

        public FileInfo(String name, long j) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.size = j;
        }

        public final String getName() {
            return this.name;
        }

        public final long getSize() {
            return this.size;
        }
    }

    /* compiled from: DisputeFileSelectionUtil.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult;", "", "<init>", "()V", "Success", "FileLoadingError", "FileTooLargeError", "Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult$FileLoadingError;", "Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult$FileTooLargeError;", "Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult$Success;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class FileSelectionResult {
        public static final int $stable = 0;

        public /* synthetic */ FileSelectionResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private FileSelectionResult() {
        }

        /* compiled from: DisputeFileSelectionUtil.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult$Success;", "Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult;", "fileSelectionItem", "Lcom/robinhood/android/cash/disputes/ui/question/image/FileSelectionItem;", "<init>", "(Lcom/robinhood/android/cash/disputes/ui/question/image/FileSelectionItem;)V", "getFileSelectionItem", "()Lcom/robinhood/android/cash/disputes/ui/question/image/FileSelectionItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends FileSelectionResult {
            public static final int $stable = 8;
            private final FileSelectionItem fileSelectionItem;

            public static /* synthetic */ Success copy$default(Success success, FileSelectionItem fileSelectionItem, int i, Object obj) {
                if ((i & 1) != 0) {
                    fileSelectionItem = success.fileSelectionItem;
                }
                return success.copy(fileSelectionItem);
            }

            /* renamed from: component1, reason: from getter */
            public final FileSelectionItem getFileSelectionItem() {
                return this.fileSelectionItem;
            }

            public final Success copy(FileSelectionItem fileSelectionItem) {
                Intrinsics.checkNotNullParameter(fileSelectionItem, "fileSelectionItem");
                return new Success(fileSelectionItem);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.fileSelectionItem, ((Success) other).fileSelectionItem);
            }

            public int hashCode() {
                return this.fileSelectionItem.hashCode();
            }

            public String toString() {
                return "Success(fileSelectionItem=" + this.fileSelectionItem + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(FileSelectionItem fileSelectionItem) {
                super(null);
                Intrinsics.checkNotNullParameter(fileSelectionItem, "fileSelectionItem");
                this.fileSelectionItem = fileSelectionItem;
            }

            public final FileSelectionItem getFileSelectionItem() {
                return this.fileSelectionItem;
            }
        }

        /* compiled from: DisputeFileSelectionUtil.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult$FileLoadingError;", "Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class FileLoadingError extends FileSelectionResult {
            public static final int $stable = 0;
            public static final FileLoadingError INSTANCE = new FileLoadingError();

            private FileLoadingError() {
                super(null);
            }
        }

        /* compiled from: DisputeFileSelectionUtil.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult$FileTooLargeError;", "Lcom/robinhood/android/cash/disputes/util/DisputeFileSelectionUtil$FileSelectionResult;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class FileTooLargeError extends FileSelectionResult {
            public static final int $stable = 0;
            public static final FileTooLargeError INSTANCE = new FileTooLargeError();

            private FileTooLargeError() {
                super(null);
            }
        }
    }
}
