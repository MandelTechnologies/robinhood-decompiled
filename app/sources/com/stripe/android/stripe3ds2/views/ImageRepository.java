package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.StripeHttpClient;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.BuildersKt;

/* compiled from: ImageRepository.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "imageSupplier", "Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;)V", "cacheImage", "", MarkdownText4.TagImageUrl, "", "image", "Landroid/graphics/Bitmap;", "getImage", "getImage$3ds2sdk_release", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalImage", "getRemoteImage", "ImageSupplier", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ImageRepository {
    private final ImageCache imageCache;
    private final ImageSupplier imageSupplier;
    private final CoroutineContext workContext;

    public ImageRepository(CoroutineContext workContext, ImageCache imageCache, ImageSupplier imageSupplier) {
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(imageSupplier, "imageSupplier");
        this.workContext = workContext;
        this.imageCache = imageCache;
        this.imageSupplier = imageSupplier;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageRepository(ErrorReporter errorReporter, CoroutineContext workContext) {
        this(workContext, ImageCache.Default.INSTANCE, new ImageSupplier.Default(errorReporter, workContext));
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    public final Object getImage$3ds2sdk_release(String str, Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(this.workContext, new ImageRepository3(str, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getLocalImage(String imageUrl) {
        return this.imageCache.get(imageUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRemoteImage(String str, Continuation<? super Bitmap> continuation) {
        return this.imageSupplier.getBitmap(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cacheImage(String imageUrl, Bitmap image) {
        if (image != null) {
            this.imageCache.set(imageUrl, image);
        }
    }

    /* compiled from: ImageRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "", "getBitmap", "Landroid/graphics/Bitmap;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Default", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface ImageSupplier {
        Object getBitmap(String str, Continuation<? super Bitmap> continuation);

        /* compiled from: ImageRepository.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier$Default;", "Lcom/stripe/android/stripe3ds2/views/ImageRepository$ImageSupplier;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "getBitmap", "Landroid/graphics/Bitmap;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Default implements ImageSupplier {
            private final ErrorReporter errorReporter;
            private final CoroutineContext workContext;

            public Default(ErrorReporter errorReporter, CoroutineContext workContext) {
                Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
                Intrinsics.checkNotNullParameter(workContext, "workContext");
                this.errorReporter = errorReporter;
                this.workContext = workContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // com.stripe.android.stripe3ds2.views.ImageRepository.ImageSupplier
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object getBitmap(String str, Continuation<? super Bitmap> continuation) {
                ImageRepository2 imageRepository2;
                Throwable th;
                Default r1;
                Object objM28550constructorimpl;
                Throwable thM28553exceptionOrNullimpl;
                Bitmap bitmapDecodeStream;
                if (continuation instanceof ImageRepository2) {
                    imageRepository2 = (ImageRepository2) continuation;
                    int i = imageRepository2.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        imageRepository2.label = i - Integer.MIN_VALUE;
                    } else {
                        imageRepository2 = new ImageRepository2(this, continuation);
                    }
                }
                Object objDoGetRequest = imageRepository2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = imageRepository2.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objDoGetRequest);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        try {
                            StripeHttpClient stripeHttpClient = new StripeHttpClient(str, null, this.errorReporter, this.workContext, 2, null);
                            imageRepository2.L$0 = this;
                            imageRepository2.L$1 = str;
                            imageRepository2.label = 1;
                            objDoGetRequest = stripeHttpClient.doGetRequest(imageRepository2);
                            if (objDoGetRequest == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r1 = this;
                            str = str;
                        } catch (Throwable th2) {
                            th = th2;
                            r1 = this;
                            str = str;
                            Result.Companion companion2 = Result.INSTANCE;
                            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                            if (thM28553exceptionOrNullimpl != null) {
                            }
                            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r1 = this;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) imageRepository2.L$1;
                    r1 = (Default) imageRepository2.L$0;
                    try {
                        ResultKt.throwOnFailure(objDoGetRequest);
                    } catch (Throwable th4) {
                        th = th4;
                        Result.Companion companion22 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl != null) {
                        }
                        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                        }
                    }
                }
                InputStream inputStream = (InputStream) objDoGetRequest;
                if (inputStream != null) {
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                        Closeable.closeFinally(inputStream, null);
                    } finally {
                    }
                } else {
                    bitmapDecodeStream = null;
                }
                objM28550constructorimpl = Result.m28550constructorimpl(bitmapDecodeStream);
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    r1.errorReporter.reportError(new RuntimeException("Could not get bitmap from url: " + str + ".", thM28553exceptionOrNullimpl));
                }
                if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                    return null;
                }
                return objM28550constructorimpl;
            }
        }
    }
}
