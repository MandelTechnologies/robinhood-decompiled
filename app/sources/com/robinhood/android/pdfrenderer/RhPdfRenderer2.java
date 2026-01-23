package com.robinhood.android.pdfrenderer;

import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import com.robinhood.android.pdfrenderer.RhPdfRenderer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: RhPdfRenderer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pdfrenderer.RhPdfRenderer$Page$load$1", m3645f = "RhPdfRenderer.kt", m3646l = {113, 73}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.pdfrenderer.RhPdfRenderer$Page$load$1, reason: use source file name */
/* loaded from: classes11.dex */
final class RhPdfRenderer2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ RhPdfRenderer this$0;
    final /* synthetic */ RhPdfRenderer.Page this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhPdfRenderer2(RhPdfRenderer rhPdfRenderer, RhPdfRenderer.Page page, Context context, Continuation<? super RhPdfRenderer2> continuation) {
        super(2, continuation);
        this.this$0 = rhPdfRenderer;
        this.this$1 = page;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhPdfRenderer2(this.this$0, this.this$1, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RhPdfRenderer2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, android.graphics.Bitmap] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        RhPdfRenderer rhPdfRenderer;
        RhPdfRenderer.Page page;
        Context context;
        Mutex mutex2;
        Throwable th;
        Ref.ObjectRef objectRef;
        PdfRenderer.Page pageOpenPage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = this.this$0.getMutex();
                    rhPdfRenderer = this.this$0;
                    page = this.this$1;
                    context = this.$context;
                    this.L$0 = mutex;
                    this.L$1 = rhPdfRenderer;
                    this.L$2 = page;
                    this.L$3 = context;
                    this.label = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                context = (Context) this.L$3;
                page = (RhPdfRenderer.Page) this.L$2;
                rhPdfRenderer = (RhPdfRenderer) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                int i2 = context.getResources().getDisplayMetrics().widthPixels;
                ?? CreateBlankBitmap = page.createBlankBitmap(i2, page.getHeightFromWidth(i2));
                objectRef.element = CreateBlankBitmap;
                pageOpenPage.render(CreateBlankBitmap, null, null, 1);
                Unit unit2 = Unit.INSTANCE;
                AutoCloseableJVM.closeFinally(pageOpenPage, null);
                page.isLoaded = true;
                FlowCollector pageContent = page.getPageContent();
                T t = objectRef.element;
                this.L$0 = mutex;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (pageContent.emit(t, this) != coroutine_suspended) {
                    mutex2 = mutex;
                    Unit unit3 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } finally {
            }
            objectRef = new Ref.ObjectRef();
            pageOpenPage = rhPdfRenderer.pdfRenderer.openPage(page.getIndex());
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
