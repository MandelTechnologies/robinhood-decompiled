package com.robinhood.shared.common.utilspdf;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.singular.sdk.internal.Constants;
import dispatch.core.Suspend;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RealPdfReader.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ.\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/common/utilspdf/RealPdfReader;", "Lcom/robinhood/shared/common/utilspdf/PdfReader;", "contentResolver", "Landroid/content/ContentResolver;", "<init>", "(Landroid/content/ContentResolver;)V", "numPages", "", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileSize", "", "loadPdf", "Landroid/graphics/Bitmap;", "pageIndex", "pageWidth", "pageHeight", "(Landroid/net/Uri;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-utils-pdf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RealPdfReader implements PdfReader {
    private final ContentResolver contentResolver;

    public RealPdfReader(ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.contentResolver = contentResolver;
    }

    /* compiled from: RealPdfReader.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.utilspdf.RealPdfReader$numPages$2", m3645f = "RealPdfReader.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.common.utilspdf.RealPdfReader$numPages$2 */
    static final class C374982 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374982(Uri uri, Continuation<? super C374982> continuation) {
            super(2, continuation);
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealPdfReader.this.new C374982(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((C374982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws PdfReaderException, FileNotFoundException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = RealPdfReader.this.contentResolver.openFileDescriptor(this.$uri, Constants.REVENUE_AMOUNT_KEY);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    throw new PdfReaderException("ParcelFileDescriptor for " + this.$uri + " recently crashed");
                }
                PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                try {
                    Integer numBoxInt = boxing.boxInt(pdfRenderer.getPageCount());
                    AutoCloseableJVM.closeFinally(pdfRenderer, null);
                    return numBoxInt;
                } finally {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.shared.common.utilspdf.PdfReader
    public Object numPages(Uri uri, Continuation<? super Integer> continuation) {
        return Suspend.withIO$default(null, new C374982(uri, null), continuation, 1, null);
    }

    /* compiled from: RealPdfReader.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.utilspdf.RealPdfReader$fileSize$2", m3645f = "RealPdfReader.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.utilspdf.RealPdfReader$fileSize$2 */
    static final class C374962 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374962(Uri uri, Continuation<? super C374962> continuation) {
            super(2, continuation);
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealPdfReader.this.new C374962(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
            return ((C374962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws PdfReaderException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Cursor cursorQuery = RealPdfReader.this.contentResolver.query(this.$uri, new String[]{"_size"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.moveToFirst();
                        long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                        Closeable.closeFinally(cursorQuery, null);
                        return boxing.boxLong(j);
                    } finally {
                    }
                } else {
                    throw new PdfReaderException("Underlying content provider of " + this.$uri + " returned null or crashed");
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.shared.common.utilspdf.PdfReader
    public Object fileSize(Uri uri, Continuation<? super Long> continuation) {
        return Suspend.withIO$default(null, new C374962(uri, null), continuation, 1, null);
    }

    /* compiled from: RealPdfReader.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.utilspdf.RealPdfReader$loadPdf$2", m3645f = "RealPdfReader.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.common.utilspdf.RealPdfReader$loadPdf$2 */
    static final class C374972 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ int $pageHeight;
        final /* synthetic */ int $pageIndex;
        final /* synthetic */ int $pageWidth;
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374972(Uri uri, int i, int i2, int i3, Continuation<? super C374972> continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.$pageWidth = i;
            this.$pageHeight = i2;
            this.$pageIndex = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealPdfReader.this.new C374972(this.$uri, this.$pageWidth, this.$pageHeight, this.$pageIndex, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C374972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws PdfReaderException, FileNotFoundException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = RealPdfReader.this.contentResolver.openFileDescriptor(this.$uri, Constants.REVENUE_AMOUNT_KEY);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    throw new PdfReaderException("ParcelFileDescriptor for " + this.$uri + " recently crashed");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.$pageWidth, this.$pageHeight, Bitmap.Config.ARGB_8888);
                PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                try {
                    PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(this.$pageIndex);
                    try {
                        pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                        Unit unit = Unit.INSTANCE;
                        AutoCloseableJVM.closeFinally(pageOpenPage, null);
                        AutoCloseableJVM.closeFinally(pdfRenderer, null);
                        return bitmapCreateBitmap;
                    } finally {
                    }
                } finally {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.shared.common.utilspdf.PdfReader
    public Object loadPdf(Uri uri, int i, int i2, int i3, Continuation<? super Bitmap> continuation) {
        return Suspend.withIO$default(null, new C374972(uri, i2, i3, i, null), continuation, 1, null);
    }
}
