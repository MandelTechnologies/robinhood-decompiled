package com.robinhood.android.doc.serverdriven.pdfupload;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadErrorEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.shared.common.utilspdf.PdfReader;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: SddrPdfUploadDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001 B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0016\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0016\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J'\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010\u001dJ\f\u0010\u001e\u001a\u00020\u0004*\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadDataState;", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadViewState;", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadErrorEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "pdfReader", "Lcom/robinhood/shared/common/utilspdf/PdfReader;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/common/utilspdf/PdfReader;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "firstPage", "width", "", "height", "nextPage", "prevPage", "updatePage", "isNext", "", "(Ljava/lang/Boolean;II)V", "toErrorEvent", "", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SddrPdfUploadDuxo extends BaseDuxo3<SddrPdfUploadDataState, SddrPdfUploadViewState, SddrPdfUploadErrorEvent> implements HasSavedState {
    public static final long FILE_SIZE_LIMIT = 10485760;
    private final PdfReader pdfReader;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SddrPdfUploadDuxo(PdfReader pdfReader, SavedStateHandle savedStateHandle, SddrPdfUploadStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new SddrPdfUploadDataState(0, 0, null, false, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(pdfReader, "pdfReader");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.pdfReader = pdfReader;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C142991(null));
    }

    /* compiled from: SddrPdfUploadDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$onCreate$1", m3645f = "SddrPdfUploadDuxo.kt", m3646l = {44, 51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$onCreate$1 */
    static final class C142991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C142991(Continuation<? super C142991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C142991 c142991 = SddrPdfUploadDuxo.this.new C142991(continuation);
            c142991.L$0 = obj;
            return c142991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        
            if (r12 == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred deferredAsync$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SddrPdfUploadDuxo3(SddrPdfUploadDuxo.this, null), 3, null);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SddrPdfUploadDuxo2(SddrPdfUploadDuxo.this, null), 3, null);
                this.L$0 = deferredAsync$default;
                this.label = 1;
                obj = deferredAsync$default2.await(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Integer num = (Integer) obj;
                if (num != null) {
                    SddrPdfUploadDuxo.this.applyMutation(new AnonymousClass1(num.intValue(), null));
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            deferredAsync$default = (Deferred) this.L$0;
            ResultKt.throwOnFailure(obj);
            Long l = (Long) obj;
            if (l == null) {
                return Unit.INSTANCE;
            }
            if (l.longValue() > SddrPdfUploadDuxo.FILE_SIZE_LIMIT) {
                SddrPdfUploadDuxo.this.submit(SddrPdfUploadErrorEvent.FileSizeError.INSTANCE);
                return Unit.INSTANCE;
            }
            this.L$0 = null;
            this.label = 2;
            obj = deferredAsync$default.await(this);
        }

        /* compiled from: SddrPdfUploadDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$onCreate$1$1", m3645f = "SddrPdfUploadDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SddrPdfUploadDataState, Continuation<? super SddrPdfUploadDataState>, Object> {
            final /* synthetic */ int $numPages;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(int i, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$numPages = i;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$numPages, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SddrPdfUploadDataState sddrPdfUploadDataState, Continuation<? super SddrPdfUploadDataState> continuation) {
                return ((AnonymousClass1) create(sddrPdfUploadDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SddrPdfUploadDataState.copy$default((SddrPdfUploadDataState) this.L$0, this.$numPages, 0, null, false, 14, null);
            }
        }
    }

    public final void firstPage(int width, int height) {
        updatePage(null, width, height);
    }

    public final void nextPage(int width, int height) {
        updatePage(Boolean.TRUE, width, height);
    }

    public final void prevPage(int width, int height) {
        updatePage(Boolean.FALSE, width, height);
    }

    /* compiled from: SddrPdfUploadDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$updatePage$1", m3645f = "SddrPdfUploadDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$updatePage$1 */
    static final class C143001 extends ContinuationImpl7 implements Function2<SddrPdfUploadDataState, Continuation<? super SddrPdfUploadDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C143001(Continuation<? super C143001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C143001 c143001 = new C143001(continuation);
            c143001.L$0 = obj;
            return c143001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SddrPdfUploadDataState sddrPdfUploadDataState, Continuation<? super SddrPdfUploadDataState> continuation) {
            return ((C143001) create(sddrPdfUploadDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SddrPdfUploadDataState.copy$default((SddrPdfUploadDataState) this.L$0, 0, 0, null, true, 7, null);
        }
    }

    private final void updatePage(Boolean isNext, int width, int height) {
        applyMutation(new C143001(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C143012(isNext, width, height, null), 3, null);
    }

    /* compiled from: SddrPdfUploadDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$updatePage$2", m3645f = "SddrPdfUploadDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$updatePage$2 */
    static final class C143012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $height;
        final /* synthetic */ Boolean $isNext;
        final /* synthetic */ int $width;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C143012(Boolean bool, int i, int i2, Continuation<? super C143012> continuation) {
            super(2, continuation);
            this.$isNext = bool;
            this.$width = i;
            this.$height = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SddrPdfUploadDuxo.this.new C143012(this.$isNext, this.$width, this.$height, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SddrPdfUploadDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$updatePage$2$1", m3645f = "SddrPdfUploadDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadDuxo$updatePage$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SddrPdfUploadDataState, Continuation<? super SddrPdfUploadDataState>, Object> {
            final /* synthetic */ int $height;
            final /* synthetic */ Boolean $isNext;
            final /* synthetic */ int $width;
            int I$0;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SddrPdfUploadDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Boolean bool, SddrPdfUploadDuxo sddrPdfUploadDuxo, int i, int i2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$isNext = bool;
                this.this$0 = sddrPdfUploadDuxo;
                this.$width = i;
                this.$height = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isNext, this.this$0, this.$width, this.$height, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SddrPdfUploadDataState sddrPdfUploadDataState, Continuation<? super SddrPdfUploadDataState> continuation) {
                return ((AnonymousClass1) create(sddrPdfUploadDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(7:12|(4:(1:14)(2:16|(1:18)(1:(8:20|21|50|22|23|56|24|(1:26)(3:27|54|28))(2:48|49)))|56|24|(0)(0))|15|21|50|22|23) */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
            
                r8 = r9;
             */
            /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00ba A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i;
                int currentIndex;
                AnonymousClass1 anonymousClass1;
                SddrPdfUploadDataState sddrPdfUploadDataState;
                Throwable th;
                int i2;
                Object objLoadPdf;
                Object objM28550constructorimpl;
                Throwable thM28553exceptionOrNullimpl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SddrPdfUploadDataState sddrPdfUploadDataState2 = (SddrPdfUploadDataState) this.L$0;
                    Boolean bool = this.$isNext;
                    try {
                        if (Intrinsics.areEqual(bool, boxing.boxBoolean(true))) {
                            currentIndex = sddrPdfUploadDataState2.getCurrentIndex() + 1;
                        } else if (Intrinsics.areEqual(bool, boxing.boxBoolean(false))) {
                            currentIndex = sddrPdfUploadDataState2.getCurrentIndex() - 1;
                        } else {
                            if (bool != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = 0;
                            SddrPdfUploadDuxo sddrPdfUploadDuxo = this.this$0;
                            int i4 = this.$width;
                            int i5 = this.$height;
                            Result.Companion companion = Result.INSTANCE;
                            PdfReader pdfReader = sddrPdfUploadDuxo.pdfReader;
                            Uri uri = ((SddrDestination.PdfReview) SddrPdfUploadDuxo.INSTANCE.getArgs((HasSavedState) sddrPdfUploadDuxo)).getPdf().getUri();
                            this.L$0 = sddrPdfUploadDataState2;
                            this.I$0 = i;
                            this.label = 1;
                            anonymousClass1 = this;
                            objLoadPdf = pdfReader.loadPdf(uri, i, i4, i5, anonymousClass1);
                            if (objLoadPdf != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            sddrPdfUploadDataState = sddrPdfUploadDataState2;
                            obj = objLoadPdf;
                            i2 = i;
                            objM28550constructorimpl = Result.m28550constructorimpl((Bitmap) obj);
                        }
                        objLoadPdf = pdfReader.loadPdf(uri, i, i4, i5, anonymousClass1);
                        if (objLoadPdf != coroutine_suspended) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sddrPdfUploadDataState = sddrPdfUploadDataState2;
                        th = th;
                        i2 = i;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        SddrPdfUploadDataState sddrPdfUploadDataState3 = sddrPdfUploadDataState;
                        int i6 = i2;
                        SddrPdfUploadDuxo sddrPdfUploadDuxo2 = anonymousClass1.this$0;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl != null) {
                        }
                        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                        }
                        Bitmap bitmap = (Bitmap) objM28550constructorimpl;
                        if (bitmap != null) {
                        }
                    }
                    i = currentIndex;
                    SddrPdfUploadDuxo sddrPdfUploadDuxo3 = this.this$0;
                    int i42 = this.$width;
                    int i52 = this.$height;
                    Result.Companion companion3 = Result.INSTANCE;
                    PdfReader pdfReader2 = sddrPdfUploadDuxo3.pdfReader;
                    Uri uri2 = ((SddrDestination.PdfReview) SddrPdfUploadDuxo.INSTANCE.getArgs((HasSavedState) sddrPdfUploadDuxo3)).getPdf().getUri();
                    this.L$0 = sddrPdfUploadDataState2;
                    this.I$0 = i;
                    this.label = 1;
                    anonymousClass1 = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.I$0;
                    sddrPdfUploadDataState = (SddrPdfUploadDataState) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = this;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass1 = this;
                        Result.Companion companion22 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        SddrPdfUploadDataState sddrPdfUploadDataState32 = sddrPdfUploadDataState;
                        int i62 = i2;
                        SddrPdfUploadDuxo sddrPdfUploadDuxo22 = anonymousClass1.this$0;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl != null) {
                        }
                        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                        }
                        Bitmap bitmap2 = (Bitmap) objM28550constructorimpl;
                        if (bitmap2 != null) {
                        }
                    }
                    try {
                        objM28550constructorimpl = Result.m28550constructorimpl((Bitmap) obj);
                    } catch (Throwable th4) {
                        th = th4;
                        Result.Companion companion222 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        SddrPdfUploadDataState sddrPdfUploadDataState322 = sddrPdfUploadDataState;
                        int i622 = i2;
                        SddrPdfUploadDuxo sddrPdfUploadDuxo222 = anonymousClass1.this$0;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl != null) {
                        }
                        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                        }
                        Bitmap bitmap22 = (Bitmap) objM28550constructorimpl;
                        if (bitmap22 != null) {
                        }
                    }
                }
                SddrPdfUploadDataState sddrPdfUploadDataState3222 = sddrPdfUploadDataState;
                int i6222 = i2;
                SddrPdfUploadDuxo sddrPdfUploadDuxo2222 = anonymousClass1.this$0;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    sddrPdfUploadDuxo2222.submit(sddrPdfUploadDuxo2222.toErrorEvent(thM28553exceptionOrNullimpl));
                }
                if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                    objM28550constructorimpl = null;
                }
                Bitmap bitmap222 = (Bitmap) objM28550constructorimpl;
                return bitmap222 != null ? sddrPdfUploadDataState3222 : SddrPdfUploadDataState.copy$default(sddrPdfUploadDataState3222, 0, i6222, bitmap222, false, 1, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SddrPdfUploadDuxo sddrPdfUploadDuxo = SddrPdfUploadDuxo.this;
            sddrPdfUploadDuxo.applyMutation(new AnonymousClass1(this.$isNext, sddrPdfUploadDuxo, this.$width, this.$height, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SddrPdfUploadErrorEvent toErrorEvent(Throwable th) {
        return th instanceof IOException ? SddrPdfUploadErrorEvent.IOError.INSTANCE : th instanceof SecurityException ? SddrPdfUploadErrorEvent.SecurityError.INSTANCE : new SddrPdfUploadErrorEvent.InternalError(th);
    }

    /* compiled from: SddrPdfUploadDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadDuxo;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$PdfReview;", "<init>", "()V", "FILE_SIZE_LIMIT", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SddrPdfUploadDuxo, SddrDestination.PdfReview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrDestination.PdfReview getArgs(SavedStateHandle savedStateHandle) {
            return (SddrDestination.PdfReview) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrDestination.PdfReview getArgs(SddrPdfUploadDuxo sddrPdfUploadDuxo) {
            return (SddrDestination.PdfReview) DuxoCompanion.DefaultImpls.getArgs(this, sddrPdfUploadDuxo);
        }
    }
}
