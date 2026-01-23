package com.robinhood.android.pdfrenderer;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.pdfrenderer.PdfRendererEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.shared.common.contracts.PdfRendererIntentKey;
import com.robinhood.utils.dagger.annotation.CacheDirectory;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
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
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PdfRendererDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0016B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/pdfrenderer/PdfRendererDataState;", "Lcom/robinhood/android/pdfrenderer/PdfRendererViewState;", "Lcom/robinhood/android/pdfrenderer/PdfRendererEvent;", "Lcom/robinhood/android/udf/HasSavedState;", PlaceTypes.STORE, "Lcom/robinhood/android/pdfrenderer/PdfRendererStore;", "cacheDirectory", "Ljava/io/File;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/pdfrenderer/PdfRendererStateProvider;", "<init>", "(Lcom/robinhood/android/pdfrenderer/PdfRendererStore;Ljava/io/File;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/pdfrenderer/PdfRendererStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PdfRendererDuxo extends BaseDuxo3<PdfRendererDataState, PdfRendererViewState, PdfRendererEvent> implements HasSavedState {
    private final File cacheDirectory;
    private final SavedStateHandle savedStateHandle;
    private final PdfRendererStore store;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfRendererDuxo(PdfRendererStore store, @CacheDirectory File cacheDirectory, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, PdfRendererStateProvider stateProvider) {
        super(new PdfRendererDataState(((PdfRendererIntentKey) INSTANCE.getExtras(savedStateHandle)).getTitle(), null, 2, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.store = store;
        this.cacheDirectory = cacheDirectory;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C254691(null), 3, null);
    }

    /* compiled from: PdfRendererDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pdfrenderer.PdfRendererDuxo$onCreate$1", m3645f = "PdfRendererDuxo.kt", m3646l = {39, 54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pdfrenderer.PdfRendererDuxo$onCreate$1 */
    static final class C254691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C254691(Continuation<? super C254691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PdfRendererDuxo.this.new C254691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C254691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v7, types: [android.os.ParcelFileDescriptor, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws FileNotFoundException {
            Object objMo17601fetchPdf0E7RQCE;
            ?? Open;
            PdfRendererDuxo pdfRendererDuxo;
            PdfRenderer pdfRenderer;
            AutoCloseable autoCloseable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            PdfRendererStore pdfRendererStore = PdfRendererDuxo.this.store;
                            String url = ((PdfRendererIntentKey) PdfRendererDuxo.INSTANCE.getExtras(PdfRendererDuxo.this.getSavedStateHandle())).getUrl();
                            File file = PdfRendererDuxo.this.cacheDirectory;
                            this.label = 1;
                            objMo17601fetchPdf0E7RQCE = pdfRendererStore.mo17601fetchPdf0E7RQCE(url, file, this);
                            if (objMo17601fetchPdf0E7RQCE == coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            autoCloseable = (AutoCloseable) this.L$1;
                            Open = (Closeable) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Open = Open;
                                throw new ExceptionsH();
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        ResultKt.throwOnFailure(obj);
                        objMo17601fetchPdf0E7RQCE = ((Result) obj).getValue();
                        pdfRendererDuxo.applyMutation(new PdfRendererDuxo2(new RhPdfRenderer(pdfRenderer, CoroutineScope2.plus(ViewModel2.getViewModelScope(pdfRendererDuxo), Dispatchers.getDefault())), null));
                        this.L$0 = Open;
                        this.L$1 = pdfRenderer;
                        this.label = 2;
                        if (DelayKt.awaitCancellation(this) != coroutine_suspended) {
                            autoCloseable = pdfRenderer;
                            Open = Open;
                            throw new ExceptionsH();
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        autoCloseable = pdfRenderer;
                        throw th;
                    }
                    pdfRenderer = new PdfRenderer(Open);
                } finally {
                }
                ResultKt.throwOnFailure(objMo17601fetchPdf0E7RQCE);
                Open = ParcelFileDescriptor.open((File) objMo17601fetchPdf0E7RQCE, 268435456);
                pdfRendererDuxo = PdfRendererDuxo.this;
            } catch (Throwable th3) {
                PdfRendererDuxo.this.submit(new PdfRendererEvent.Error(th3));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: PdfRendererDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/PdfRendererDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/pdfrenderer/PdfRendererDuxo;", "Lcom/robinhood/shared/common/contracts/PdfRendererIntentKey;", "<init>", "()V", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<PdfRendererDuxo, PdfRendererIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public PdfRendererIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (PdfRendererIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public PdfRendererIntentKey getExtras(PdfRendererDuxo pdfRendererDuxo) {
            return (PdfRendererIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, pdfRendererDuxo);
        }
    }
}
