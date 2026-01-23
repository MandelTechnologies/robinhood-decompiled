package com.robinhood.android.psp;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import androidx.core.view.ViewKt;
import com.robinhood.utils.extensions.Files;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PspSharableImageManager.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/psp/PspSharableImageManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getSharableCardImage", "Lcom/robinhood/android/psp/PspSharableImageManager$Result;", "card", "Landroid/view/View;", "imageName", "", "(Landroid/view/View;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeImageToDisk", "fileName", "bitmap", "Landroid/graphics/Bitmap;", "Result", "Companion", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PspSharableImageManager {
    private static final String DIRECTORY_PSP_IMAGES = "psp_images";
    private static final String MIME_TYPE = "image/jpg";
    private final Context context;
    public static final int $stable = 8;

    public PspSharableImageManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* compiled from: PspSharableImageManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/psp/PspSharableImageManager$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.psp.PspSharableImageManager$getSharableCardImage$2", m3645f = "PspSharableImageManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.psp.PspSharableImageManager$getSharableCardImage$2 */
    static final class C259652 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result>, Object> {
        final /* synthetic */ View $card;
        final /* synthetic */ String $imageName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C259652(String str, View view, Continuation<? super C259652> continuation) {
            super(2, continuation);
            this.$imageName = str;
            this.$card = view;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PspSharableImageManager.this.new C259652(this.$imageName, this.$card, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result> continuation) {
            return ((C259652) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PspSharableImageManager.this.writeImageToDisk(this.$imageName + ".jpg", ViewKt.drawToBitmap$default(this.$card, null, 1, null));
        }
    }

    public final Object getSharableCardImage(View view, String str, Continuation<? super Result> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C259652(str, view, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result writeImageToDisk(String fileName, Bitmap bitmap) throws Throwable {
        File file;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file2 = new File(this.context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), DIRECTORY_PSP_IMAGES);
                file2.mkdirs();
                file = new File(file2, fileName);
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            Result.Success success = new Result.Success(Files.toFileProviderUri$default(file, this.context, null, 2, null), MIME_TYPE);
            fileOutputStream.close();
            return success;
        } catch (Exception unused2) {
            fileOutputStream2 = fileOutputStream;
            Result.Failure failure = Result.Failure.INSTANCE;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            return failure;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    /* compiled from: PspSharableImageManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/psp/PspSharableImageManager$Result;", "", "<init>", "()V", "Success", "Failure", "Lcom/robinhood/android/psp/PspSharableImageManager$Result$Failure;", "Lcom/robinhood/android/psp/PspSharableImageManager$Result$Success;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: PspSharableImageManager.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/psp/PspSharableImageManager$Result$Success;", "Lcom/robinhood/android/psp/PspSharableImageManager$Result;", "uri", "Landroid/net/Uri;", "mimeType", "", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "getUri", "()Landroid/net/Uri;", "getMimeType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Result {
            public static final int $stable = 8;
            private final String mimeType;
            private final Uri uri;

            public static /* synthetic */ Success copy$default(Success success, Uri uri, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = success.uri;
                }
                if ((i & 2) != 0) {
                    str = success.mimeType;
                }
                return success.copy(uri, str);
            }

            /* renamed from: component1, reason: from getter */
            public final Uri getUri() {
                return this.uri;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMimeType() {
                return this.mimeType;
            }

            public final Success copy(Uri uri, String mimeType) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                return new Success(uri, mimeType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.uri, success.uri) && Intrinsics.areEqual(this.mimeType, success.mimeType);
            }

            public int hashCode() {
                return (this.uri.hashCode() * 31) + this.mimeType.hashCode();
            }

            public String toString() {
                return "Success(uri=" + this.uri + ", mimeType=" + this.mimeType + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(Uri uri, String mimeType) {
                super(null);
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                this.uri = uri;
                this.mimeType = mimeType;
            }

            public final String getMimeType() {
                return this.mimeType;
            }

            public final Uri getUri() {
                return this.uri;
            }
        }

        private Result() {
        }

        /* compiled from: PspSharableImageManager.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/psp/PspSharableImageManager$Result$Failure;", "Lcom/robinhood/android/psp/PspSharableImageManager$Result;", "<init>", "()V", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Failure extends Result {
            public static final int $stable = 0;
            public static final Failure INSTANCE = new Failure();

            private Failure() {
                super(null);
            }
        }
    }
}
