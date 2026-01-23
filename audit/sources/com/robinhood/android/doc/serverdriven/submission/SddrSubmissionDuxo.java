package com.robinhood.android.doc.serverdriven.submission;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.doc.serverdriven.submission.SddrSubmissionEvent;
import com.robinhood.android.idupload.IdUploadSubmissionStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.DocUploadCapturedDocument;
import com.robinhood.models.api.PdfDocument;
import com.robinhood.models.api.PhotoDocument;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SddrSubmissionDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "submissionStore", "Lcom/robinhood/android/idupload/IdUploadSubmissionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/idupload/IdUploadSubmissionStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SddrSubmissionDuxo extends BaseDuxo5<Unit, SddrSubmissionEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final IdUploadSubmissionStore submissionStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SddrSubmissionDuxo(IdUploadSubmissionStore submissionStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(submissionStore, "submissionStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.submissionStore = submissionStore;
        this.savedStateHandle = savedStateHandle;
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C143221(null), 3, null);
    }

    /* compiled from: SddrSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.submission.SddrSubmissionDuxo$1", m3645f = "SddrSubmissionDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.submission.SddrSubmissionDuxo$1 */
    static final class C143221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143221(Continuation<? super C143221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SddrSubmissionDuxo.this.new C143221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Tuples2 tuples2M3642to;
            C143221 c143221;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Companion companion = SddrSubmissionDuxo.INSTANCE;
                PdfDocument pdfToUpload = ((SddrDestination.Submission) companion.getArgs((HasSavedState) SddrSubmissionDuxo.this)).getState().getPdfToUpload();
                PhotoDocument frontPhotoToUpload = ((SddrDestination.Submission) companion.getArgs((HasSavedState) SddrSubmissionDuxo.this)).getState().getFrontPhotoToUpload();
                PhotoDocument backPhotoToUpload = ((SddrDestination.Submission) companion.getArgs((HasSavedState) SddrSubmissionDuxo.this)).getState().getBackPhotoToUpload();
                if (pdfToUpload == null && frontPhotoToUpload != null) {
                    tuples2M3642to = Tuples4.m3642to(frontPhotoToUpload, backPhotoToUpload);
                } else if (pdfToUpload != null && frontPhotoToUpload == null) {
                    tuples2M3642to = Tuples4.m3642to(pdfToUpload, null);
                } else {
                    SddrSubmissionDuxo.this.submit(new SddrSubmissionEvent.StateError("Invalid front and back upload states"));
                    return Unit.INSTANCE;
                }
                DocUploadCapturedDocument docUploadCapturedDocument = (DocUploadCapturedDocument) tuples2M3642to.component1();
                PhotoDocument photoDocument = (PhotoDocument) tuples2M3642to.component2();
                try {
                    IdUploadSubmissionStore idUploadSubmissionStore = SddrSubmissionDuxo.this.submissionStore;
                    UUID requestId = ((SddrDestination.Submission) companion.getArgs((HasSavedState) SddrSubmissionDuxo.this)).getRequestId();
                    String requestType = ((SddrDestination.Submission) companion.getArgs((HasSavedState) SddrSubmissionDuxo.this)).getRequestType();
                    String documentTypeToUpload = ((SddrDestination.Submission) companion.getArgs((HasSavedState) SddrSubmissionDuxo.this)).getState().getDocumentTypeToUpload();
                    CountryCode countryToUpload = ((SddrDestination.Submission) companion.getArgs((HasSavedState) SddrSubmissionDuxo.this)).getState().getCountryToUpload();
                    this.label = 1;
                    c143221 = this;
                    try {
                        if (idUploadSubmissionStore.submitServerDrivenRequest(requestId, requestType, documentTypeToUpload, countryToUpload, docUploadCapturedDocument, photoDocument, c143221) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        SddrSubmissionDuxo.this.submit(new SddrSubmissionEvent.SubmissionError(th));
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c143221 = this;
                    th = th;
                    SddrSubmissionDuxo.this.submit(new SddrSubmissionEvent.SubmissionError(th));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c143221 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c143221 = this;
                    SddrSubmissionDuxo.this.submit(new SddrSubmissionEvent.SubmissionError(th));
                    return Unit.INSTANCE;
                }
            }
            SddrSubmissionDuxo.this.submit(SddrSubmissionEvent.Success.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SddrSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionDuxo;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$Submission;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SddrSubmissionDuxo, SddrDestination.Submission> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrDestination.Submission getArgs(SavedStateHandle savedStateHandle) {
            return (SddrDestination.Submission) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SddrDestination.Submission getArgs(SddrSubmissionDuxo sddrSubmissionDuxo) {
            return (SddrDestination.Submission) DuxoCompanion.DefaultImpls.getArgs(this, sddrSubmissionDuxo);
        }
    }
}
