package com.robinhood.android.doc.p109ui.photo;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.singular.sdk.internal.Constants;
import dispatch.core.Suspend;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocUploadReviewPdfDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "contentResolver", "Landroid/content/ContentResolver;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroid/content/ContentResolver;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "updatePage", "newPageIdx", "", "width", "height", "getPageBitmap", "Landroid/graphics/Bitmap;", "uri", "Landroid/net/Uri;", "pageIdx", "(Landroid/net/Uri;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DocUploadReviewPdfDuxo extends OldBaseDuxo<DocUploadReviewPdfViewState> implements HasSavedState {
    private static final long FILE_SIZE_LIMIT = 10485760;
    private final ContentResolver contentResolver;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocUploadReviewPdfDuxo(ContentResolver contentResolver, SavedStateHandle savedStateHandle) {
        super(new DocUploadReviewPdfViewState(null, 0, null, false, null, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.contentResolver = contentResolver;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C144051(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadReviewPdfDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C144063(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadReviewPdfDuxo.onCreate$lambda$3(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: DocUploadReviewPdfDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$onCreate$1", m3645f = "DocUploadReviewPdfDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$onCreate$1 */
    static final class C144051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends Integer>>, Object> {
        int label;

        C144051(Continuation<? super C144051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadReviewPdfDuxo.this.new C144051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends Integer>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<Integer>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<Integer>> continuation) {
            return ((C144051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DocUploadReviewPdfDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$onCreate$1$1", m3645f = "DocUploadReviewPdfDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends Integer>>, Object> {
            int label;
            final /* synthetic */ DocUploadReviewPdfDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DocUploadReviewPdfDuxo docUploadReviewPdfDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = docUploadReviewPdfDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends Integer>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Optional<Integer>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<Integer>> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws FileNotFoundException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    Optional.Companion companion = Optional.INSTANCE;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.this$0.contentResolver.openFileDescriptor(((DocUploadDestination.PdfReview) DocUploadReviewPdfDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getPdf().getUri(), Constants.REVENUE_AMOUNT_KEY);
                    Integer numBoxInt = null;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                        try {
                            int pageCount = pdfRenderer.getPageCount();
                            AutoCloseableJVM.closeFinally(pdfRenderer, null);
                            numBoxInt = boxing.boxInt(pageCount);
                        } finally {
                        }
                    }
                    return companion.m2972of(numBoxInt);
                } catch (SecurityException unused) {
                    return Optional2.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(DocUploadReviewPdfDuxo.this, null);
            this.label = 1;
            Object objWithIO$default = Suspend.withIO$default(null, anonymousClass1, this, 1, null);
            return objWithIO$default == coroutine_suspended ? coroutine_suspended : objWithIO$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DocUploadReviewPdfDuxo docUploadReviewPdfDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final Integer num = (Integer) optional.component1();
        docUploadReviewPdfDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadReviewPdfDuxo.onCreate$lambda$1$lambda$0(num, (DocUploadReviewPdfViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadReviewPdfViewState onCreate$lambda$1$lambda$0(Integer num, DocUploadReviewPdfViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DocUploadReviewPdfViewState.copy$default(applyMutation, num, 0, null, false, null, null, 62, null);
    }

    /* compiled from: DocUploadReviewPdfDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$onCreate$3", m3645f = "DocUploadReviewPdfDuxo.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$onCreate$3 */
    static final class C144063 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends Long>>, Object> {
        int label;

        C144063(Continuation<? super C144063> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadReviewPdfDuxo.this.new C144063(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends Long>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<Long>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<Long>> continuation) {
            return ((C144063) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DocUploadReviewPdfDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$onCreate$3$1", m3645f = "DocUploadReviewPdfDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends Long>>, Object> {
            int label;
            final /* synthetic */ DocUploadReviewPdfDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DocUploadReviewPdfDuxo docUploadReviewPdfDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = docUploadReviewPdfDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends Long>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Optional<Long>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<Long>> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion = Optional.INSTANCE;
                Cursor cursorQuery = this.this$0.contentResolver.query(((DocUploadDestination.PdfReview) DocUploadReviewPdfDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getPdf().getUri(), null, null, null, null);
                Long l = null;
                if (cursorQuery != null) {
                    try {
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        cursorQuery.moveToFirst();
                        Long lBoxLong = boxing.boxLong(cursorQuery.getLong(columnIndex));
                        Closeable.closeFinally(cursorQuery, null);
                        l = lBoxLong;
                    } finally {
                    }
                }
                return companion.m2972of(l);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(DocUploadReviewPdfDuxo.this, null);
            this.label = 1;
            Object objWithIO$default = Suspend.withIO$default(null, anonymousClass1, this, 1, null);
            return objWithIO$default == coroutine_suspended ? coroutine_suspended : objWithIO$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(DocUploadReviewPdfDuxo docUploadReviewPdfDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        Long l = (Long) optional.component1();
        if (l != null && l.longValue() > 10485760) {
            docUploadReviewPdfDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocUploadReviewPdfDuxo.onCreate$lambda$3$lambda$2((DocUploadReviewPdfViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadReviewPdfViewState onCreate$lambda$3$lambda$2(DocUploadReviewPdfViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DocUploadReviewPdfViewState.copy$default(applyMutation, null, 0, null, false, new UiEvent(Boolean.TRUE), null, 47, null);
    }

    public final void updatePage(final int newPageIdx, int width, int height) {
        applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadReviewPdfDuxo.updatePage$lambda$4((DocUploadReviewPdfViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C144072(((DocUploadDestination.PdfReview) INSTANCE.getArgs((HasSavedState) this)).getPdf().getUri(), newPageIdx, width, height, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadReviewPdfDuxo.updatePage$lambda$7(this.f$0, newPageIdx, (Either) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadReviewPdfViewState updatePage$lambda$4(DocUploadReviewPdfViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DocUploadReviewPdfViewState.copy$default(applyMutation, null, 0, null, true, null, null, 51, null);
    }

    /* compiled from: DocUploadReviewPdfDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Either;", "Landroid/graphics/Bitmap;", "Ljava/lang/Exception;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$updatePage$2", m3645f = "DocUploadReviewPdfDuxo.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$updatePage$2 */
    static final class C144072 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Either<? extends Bitmap, ? extends Exception>>, Object> {
        final /* synthetic */ int $height;
        final /* synthetic */ int $newPageIdx;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ int $width;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144072(Uri uri, int i, int i2, int i3, Continuation<? super C144072> continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.$newPageIdx = i;
            this.$width = i2;
            this.$height = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadReviewPdfDuxo.this.new C144072(this.$uri, this.$newPageIdx, this.$width, this.$height, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Either<? extends Bitmap, ? extends Exception>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Either<Bitmap, ? extends Exception>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Either<Bitmap, ? extends Exception>> continuation) {
            return ((C144072) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DocUploadReviewPdfDuxo docUploadReviewPdfDuxo = DocUploadReviewPdfDuxo.this;
                    Uri uri = this.$uri;
                    int i2 = this.$newPageIdx;
                    int i3 = this.$width;
                    int i4 = this.$height;
                    this.label = 1;
                    obj = docUploadReviewPdfDuxo.getPageBitmap(uri, i2, i3, i4, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return new Either.Left(obj);
            } catch (IOException e) {
                return new Either.Right(e);
            } catch (SecurityException e2) {
                return new Either.Right(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePage$lambda$7(DocUploadReviewPdfDuxo docUploadReviewPdfDuxo, final int i, final Either result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof Either.Left) {
            docUploadReviewPdfDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocUploadReviewPdfDuxo.updatePage$lambda$7$lambda$5(result, i, (DocUploadReviewPdfViewState) obj);
                }
            });
        } else {
            if (!(result instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            docUploadReviewPdfDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocUploadReviewPdfDuxo.updatePage$lambda$7$lambda$6(result, (DocUploadReviewPdfViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadReviewPdfViewState updatePage$lambda$7$lambda$5(Either either, int i, DocUploadReviewPdfViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DocUploadReviewPdfViewState.copy$default(applyMutation, null, i, (Bitmap) ((Either.Left) either).getValue(), false, null, null, 49, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocUploadReviewPdfViewState updatePage$lambda$7$lambda$6(Either either, DocUploadReviewPdfViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DocUploadReviewPdfViewState.copy$default(applyMutation, null, 0, null, false, null, new UiEvent(((Either.Right) either).getValue()), 31, null);
    }

    /* compiled from: DocUploadReviewPdfDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$getPageBitmap$2", m3645f = "DocUploadReviewPdfDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.photo.DocUploadReviewPdfDuxo$getPageBitmap$2 */
    static final class C144042 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ int $height;
        final /* synthetic */ int $pageIdx;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ int $width;
        int label;
        final /* synthetic */ DocUploadReviewPdfDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144042(int i, int i2, DocUploadReviewPdfDuxo docUploadReviewPdfDuxo, Uri uri, int i3, Continuation<? super C144042> continuation) {
            super(2, continuation);
            this.$width = i;
            this.$height = i2;
            this.this$0 = docUploadReviewPdfDuxo;
            this.$uri = uri;
            this.$pageIdx = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C144042(this.$width, this.$height, this.this$0, this.$uri, this.$pageIdx, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((C144042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws FileNotFoundException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.$width, this.$height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.this$0.contentResolver.openFileDescriptor(this.$uri, Constants.REVENUE_AMOUNT_KEY);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return bitmapCreateBitmap;
            }
            int i = this.$pageIdx;
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
            try {
                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getPageBitmap(Uri uri, int i, int i2, int i3, Continuation<? super Bitmap> continuation) {
        return Suspend.withIO$default(null, new C144042(i2, i3, this, uri, i, null), continuation, 1, null);
    }

    /* compiled from: DocUploadReviewPdfDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/ui/photo/DocUploadReviewPdfDuxo;", "Lcom/robinhood/android/doc/event/DocUploadDestination$PdfReview;", "<init>", "()V", "FILE_SIZE_LIMIT", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DocUploadReviewPdfDuxo, DocUploadDestination.PdfReview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadDestination.PdfReview getArgs(SavedStateHandle savedStateHandle) {
            return (DocUploadDestination.PdfReview) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadDestination.PdfReview getArgs(DocUploadReviewPdfDuxo docUploadReviewPdfDuxo) {
            return (DocUploadDestination.PdfReview) DuxoCompanion.DefaultImpls.getArgs(this, docUploadReviewPdfDuxo);
        }
    }
}
