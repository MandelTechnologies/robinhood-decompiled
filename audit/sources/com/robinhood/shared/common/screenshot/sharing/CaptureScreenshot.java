package com.robinhood.shared.common.screenshot.sharing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CaptureScreenshot.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a(\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087@¢\u0006\u0004\b\u000b\u0010\t\u001a(\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\r\u0010\t\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"captureScreenshotCompat", "Landroid/graphics/Bitmap;", "view", "Landroid/view/View;", "position", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/unit/IntSize;", "captureScreenshotCompat-OXOWCTw", "(Landroid/view/View;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "captureScreenshot", "captureScreenshot-OXOWCTw", "captureScreenshotLegacy", "captureScreenshotLegacy-OXOWCTw", "toFileUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "(Landroid/graphics/Bitmap;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-screenshot-sharing_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.screenshot.sharing.CaptureScreenshotKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class CaptureScreenshot {
    /* renamed from: captureScreenshotCompat-OXOWCTw, reason: not valid java name */
    public static final Object m24850captureScreenshotCompatOXOWCTw(View view, long j, long j2, Continuation<? super Bitmap> continuation) {
        if (Build.VERSION.SDK_INT >= 26) {
            return m24849captureScreenshotOXOWCTw(view, j, j2, continuation);
        }
        return m24851captureScreenshotLegacyOXOWCTw(view, j, j2, continuation);
    }

    /* compiled from: CaptureScreenshot.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.screenshot.sharing.CaptureScreenshotKt$toFileUri$2", m3645f = "CaptureScreenshot.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.screenshot.sharing.CaptureScreenshotKt$toFileUri$2 */
    static final class C374782 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Bitmap $this_toFileUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374782(Context context, Bitmap bitmap, Continuation<? super C374782> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$this_toFileUri = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C374782(this.$context, this.$this_toFileUri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
            return ((C374782) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File file = new File(this.$context.getCacheDir(), "robinhood_screenshot.png");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.$this_toFileUri.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return Files.toFileProviderUri(file, this.$context, "screenshot_fileprovider");
        }
    }

    public static final Object toFileUri(Bitmap bitmap, Context context, Continuation<? super Uri> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C374782(context, bitmap, null), continuation);
    }

    /* renamed from: captureScreenshot-OXOWCTw, reason: not valid java name */
    public static final Object m24849captureScreenshotOXOWCTw(View view, long j, long j2, Continuation<? super Bitmap> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i3 = (int) (j >> 32);
        int i4 = (int) (j & 4294967295L);
        Rect rect = new Rect(((int) Float.intBitsToFloat(i3)) - iArr[0], ((int) Float.intBitsToFloat(i4)) - iArr[1], (((int) Float.intBitsToFloat(i3)) - iArr[0]) + i, (((int) Float.intBitsToFloat(i4)) - iArr[1]) + i2);
        try {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            PixelCopy.request(BaseContexts.requireActivityBaseContext(context).getWindow(), rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.robinhood.shared.common.screenshot.sharing.CaptureScreenshotKt$captureScreenshot$2$1
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i5) {
                    if (i5 == 0) {
                        CancellableContinuation<Bitmap> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m28550constructorimpl(bitmapCreateBitmap));
                    } else {
                        CancellableContinuation<Bitmap> cancellableContinuation2 = cancellableContinuationImpl;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new RuntimeException("PixelCopy failed"))));
                    }
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (IllegalArgumentException e) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(e)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: captureScreenshotLegacy-OXOWCTw, reason: not valid java name */
    public static final Object m24851captureScreenshotLegacyOXOWCTw(View view, long j, long j2, Continuation<? super Bitmap> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j2 >> 32), (int) (j2 & 4294967295L), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            view.getLocationInWindow(new int[2]);
            canvas.translate((-r3[0]) + Float.intBitsToFloat((int) (j >> 32)), (-r3[1]) + Float.intBitsToFloat((int) (j & 4294967295L)));
            view.draw(canvas);
            cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(bitmapCreateBitmap));
        } catch (Exception e) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(e)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
