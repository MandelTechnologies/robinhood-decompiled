package com.robinhood.android.pdfrenderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfRenderer;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: RhPdfRenderer.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00000\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/RhPdfRenderer;", "", "pdfRenderer", "Landroid/graphics/pdf/PdfRenderer;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/graphics/pdf/PdfRenderer;Lkotlinx/coroutines/CoroutineScope;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "coroutineScope", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "pageCount", "", "getPageCount", "()I", "pageList", "", "Lcom/robinhood/android/pdfrenderer/RhPdfRenderer$Page;", "getPageList", "()Ljava/util/List;", "Page", "Dimension", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RhPdfRenderer {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final Mutex mutex;
    private final List<Page> pageList;
    private final PdfRenderer pdfRenderer;

    public RhPdfRenderer(PdfRenderer pdfRenderer, CoroutineScope lifecycleScope) {
        Intrinsics.checkNotNullParameter(pdfRenderer, "pdfRenderer");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        this.pdfRenderer = pdfRenderer;
        this.mutex = Mutex3.Mutex$default(false, 1, null);
        this.coroutineScope = CoroutineScope2.plus(lifecycleScope, Supervisor3.SupervisorJob$default(null, 1, null));
        int pageCount = pdfRenderer.getPageCount();
        ArrayList arrayList = new ArrayList(pageCount);
        for (int i = 0; i < pageCount; i++) {
            arrayList.add(new Page(i));
        }
        this.pageList = arrayList;
    }

    public final Mutex getMutex() {
        return this.mutex;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final int getPageCount() {
        return this.pdfRenderer.getPageCount();
    }

    public final List<Page> getPageList() {
        return this.pageList;
    }

    /* compiled from: RhPdfRenderer.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/RhPdfRenderer$Page;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "<init>", "(Lcom/robinhood/android/pdfrenderer/RhPdfRenderer;I)V", "getIndex", "()I", "isLoaded", "", "dimension", "Lcom/robinhood/android/pdfrenderer/RhPdfRenderer$Dimension;", "pageContent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroid/graphics/Bitmap;", "getPageContent", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getHeightFromWidth", "width", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "", "context", "Landroid/content/Context;", "recycle", "createBlankBitmap", "height", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public final class Page {
        private final Dimension dimension;
        private final int index;
        private boolean isLoaded;
        private final StateFlow2<Bitmap> pageContent;

        public Page(int i) {
            this.index = i;
            PdfRenderer.Page pageOpenPage = RhPdfRenderer.this.pdfRenderer.openPage(i);
            try {
                Dimension dimension = new Dimension(pageOpenPage.getWidth(), pageOpenPage.getHeight());
                AutoCloseableJVM.closeFinally(pageOpenPage, null);
                this.dimension = dimension;
                this.pageContent = StateFlow4.MutableStateFlow(null);
                BuildersKt__Builders_commonKt.launch$default(RhPdfRenderer.this.getCoroutineScope(), null, null, new C254731(null), 3, null);
            } finally {
            }
        }

        public final int getIndex() {
            return this.index;
        }

        public final StateFlow2<Bitmap> getPageContent() {
            return this.pageContent;
        }

        /* compiled from: RhPdfRenderer.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pdfrenderer.RhPdfRenderer$Page$1", m3645f = "RhPdfRenderer.kt", m3646l = {42}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.pdfrenderer.RhPdfRenderer$Page$1 */
        static final class C254731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            C254731(Continuation<? super C254731> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return Page.this.new C254731(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C254731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<Integer> subscriptionCount = Page.this.getPageContent().getSubscriptionCount();
                    Flow<Integer> flow = new Flow<Integer>() { // from class: com.robinhood.android.pdfrenderer.RhPdfRenderer$Page$1$invokeSuspend$$inlined$filter$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.pdfrenderer.RhPdfRenderer$Page$1$invokeSuspend$$inlined$filter$1$2 */
                        public static final class C254722<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.pdfrenderer.RhPdfRenderer$Page$1$invokeSuspend$$inlined$filter$1$2", m3645f = "RhPdfRenderer.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.pdfrenderer.RhPdfRenderer$Page$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C254722.this.emit(null, this);
                                }
                            }

                            public C254722(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (((Number) obj).intValue() == 0) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                            Object objCollect = subscriptionCount.collect(new C254722(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    final Page page = Page.this;
                    FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.robinhood.android.pdfrenderer.RhPdfRenderer.Page.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(int i2, Continuation<? super Unit> continuation) {
                            page.recycle();
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public final int getHeightFromWidth(int width) {
            return (int) ((this.dimension.getHeight() / this.dimension.getWidth()) * width);
        }

        public final void load(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isLoaded) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(RhPdfRenderer.this.getCoroutineScope(), null, null, new RhPdfRenderer2(RhPdfRenderer.this, this, context, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void recycle() {
            this.isLoaded = false;
            Bitmap value = this.pageContent.getValue();
            this.pageContent.tryEmit(null);
            if (value != null) {
                value.recycle();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap createBlankBitmap(int width, int height) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            return bitmapCreateBitmap;
        }
    }

    /* compiled from: RhPdfRenderer.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/pdfrenderer/RhPdfRenderer$Dimension;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-pdf-renderer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Dimension {
        public static final int $stable = 0;
        private final int height;
        private final int width;

        public static /* synthetic */ Dimension copy$default(Dimension dimension, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = dimension.width;
            }
            if ((i3 & 2) != 0) {
                i2 = dimension.height;
            }
            return dimension.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final Dimension copy(int width, int height) {
            return new Dimension(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dimension)) {
                return false;
            }
            Dimension dimension = (Dimension) other;
            return this.width == dimension.width && this.height == dimension.height;
        }

        public int hashCode() {
            return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "Dimension(width=" + this.width + ", height=" + this.height + ")";
        }

        public Dimension(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getHeight() {
            return this.height;
        }
    }
}
