package com.withpersona.sdk2.camera;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.GovernmentIdFeed5;
import com.withpersona.sdk2.camera.analyzers.BarcodePdf417Analyzer;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer2;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer3;
import com.withpersona.sdk2.camera.analyzers.FrontOrBackAnalyzer;
import com.withpersona.sdk2.camera.analyzers.IdFrontAnalyzer;
import com.withpersona.sdk2.camera.analyzers.MrzAnalyzer;
import com.withpersona.sdk2.camera.analyzers.TextExtractionAnalyzer;
import com.withpersona.sdk2.camera.camera2.Camera2ImageAnalyzer;
import com.withpersona.sdk2.camera.feed.CameraFeed;
import com.withpersona.sdk2.camera.feed.ViewfinderInfo;
import com.withpersona.sdk2.camera.feed.ViewfinderInfo2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: GovernmentIdFeed.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u00020\u0006B\u001d\b\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u000f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u000f\u0010!J\u001f\u0010\u000f\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b\u000f\u0010&J+\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0012H\u0001¢\u0006\u0004\b)\u0010*J$\u0010/\u001a\u00020.2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040,H\u0096A¢\u0006\u0004\b/\u00100R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00102R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u00150\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/GovernmentIdFeed;", "Lcom/withpersona/sdk2/camera/feed/CameraFeed;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone;", "Lcom/withpersona/sdk2/camera/camera2/Camera2ImageAnalyzer;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "resultFlow", "<init>", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "imageToAnalyze", "analyze-gIAlu-s", "(Lcom/withpersona/sdk2/camera/ImageToAnalyze;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyze", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;", "side", "", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "rules", "Lcom/withpersona/sdk2/camera/analyzers/ComposableImageAnalyzer;", "passiveAnalyzers", "", "applyRules", "(Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;Ljava/util/List;Ljava/util/List;)V", "Landroid/graphics/Rect;", "rect", "previewRect", "setViewfinderRect", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "Landroidx/camera/core/ImageProxy;", "imageProxy", "(Landroidx/camera/core/ImageProxy;)V", "Landroid/media/Image;", "image", "", "rotationDegrees", "(Landroid/media/Image;I)V", "Lcom/withpersona/sdk2/camera/AnalyzerResult;", "analyzerResults", "combineResults-gIAlu-s$camera_release", "(Lcom/withpersona/sdk2/camera/ImageToAnalyze;Ljava/util/List;)Ljava/lang/Object;", "combineResults", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;", "analyzers", "Ljava/util/List;", "Lcom/withpersona/sdk2/camera/feed/ViewfinderInfo;", "viewfinderInfo", "Lcom/withpersona/sdk2/camera/feed/ViewfinderInfo;", "getReplayCache", "()Ljava/util/List;", "replayCache", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class GovernmentIdFeed implements CameraFeed, ImageAnalysis.Analyzer, SharedFlow<Result<? extends GovernmentIdFeed5>>, Camera2ImageAnalyzer {
    private List<? extends ComposableImageAnalyzer> analyzers;
    private List<? extends ComposableImageAnalyzer> passiveAnalyzers;
    private final SharedFlow2<Result<GovernmentIdFeed5>> resultFlow;
    private GovernmentIdFeed5.Side side;
    private ViewfinderInfo viewfinderInfo;

    /* compiled from: GovernmentIdFeed.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.GovernmentIdFeed", m3645f = "GovernmentIdFeed.kt", m3646l = {91, 97}, m3647m = "analyze-gIAlu-s")
    /* renamed from: com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$1 */
    static final class C435401 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C435401(Continuation<? super C435401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objM27262analyzegIAlus = GovernmentIdFeed.this.m27262analyzegIAlus(null, this);
            return objM27262analyzegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM27262analyzegIAlus : Result.m28549boximpl(objM27262analyzegIAlus);
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super Result<? extends GovernmentIdFeed5>> flowCollector, Continuation<?> continuation) {
        return this.resultFlow.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<Result<? extends GovernmentIdFeed5>> getReplayCache() {
        return this.resultFlow.getReplayCache();
    }

    public GovernmentIdFeed(SharedFlow2<Result<GovernmentIdFeed5>> resultFlow) {
        Intrinsics.checkNotNullParameter(resultFlow, "resultFlow");
        this.resultFlow = resultFlow;
        this.analyzers = CollectionsKt.emptyList();
        this.passiveAnalyzers = CollectionsKt.emptyList();
    }

    public final void applyRules(GovernmentIdFeed5.Side side, List<? extends AutoCaptureRule> rules, List<? extends ComposableImageAnalyzer> passiveAnalyzers) {
        Object textExtractionAnalyzer;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(passiveAnalyzers, "passiveAnalyzers");
        this.side = side;
        List<? extends AutoCaptureRule> list = rules;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (AutoCaptureRule autoCaptureRule : list) {
            if (autoCaptureRule instanceof AutoCaptureRule.BarcodePdf417Rule) {
                textExtractionAnalyzer = new BarcodePdf417Analyzer();
            } else if (autoCaptureRule instanceof AutoCaptureRule.FrontOrBackRule) {
                textExtractionAnalyzer = new FrontOrBackAnalyzer(new IdFrontAnalyzer(), new BarcodePdf417Analyzer());
            } else if (autoCaptureRule instanceof AutoCaptureRule.FrontRule) {
                textExtractionAnalyzer = new IdFrontAnalyzer();
            } else if (autoCaptureRule instanceof AutoCaptureRule.MrzRule) {
                textExtractionAnalyzer = new MrzAnalyzer();
            } else {
                if (!(autoCaptureRule instanceof AutoCaptureRule.TextExtractionRule)) {
                    throw new NoWhenBranchMatchedException();
                }
                textExtractionAnalyzer = new TextExtractionAnalyzer();
            }
            arrayList.add(textExtractionAnalyzer);
        }
        this.analyzers = arrayList;
        this.passiveAnalyzers = passiveAnalyzers;
    }

    @Override // com.withpersona.sdk2.camera.feed.CameraFeed
    public void setViewfinderRect(Rect rect, Rect previewRect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00cd -> B:32:0x00d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x010e -> B:40:0x0111). Please report as a decompilation issue!!! */
    /* renamed from: analyze-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m27262analyzegIAlus(ImageToAnalyze imageToAnalyze, Continuation<? super Result<? extends GovernmentIdFeed5>> continuation) {
        C435401 c435401;
        Rect rect;
        Iterator it;
        GovernmentIdFeed governmentIdFeed;
        List<AnalyzerResult> list;
        Iterator it2;
        Rect rect2;
        List<AnalyzerResult> list2;
        GovernmentIdFeed governmentIdFeed2;
        ImageToAnalyze imageToAnalyze2;
        if (continuation instanceof C435401) {
            c435401 = (C435401) continuation;
            int i = c435401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c435401.label = i - Integer.MIN_VALUE;
            } else {
                c435401 = new C435401(continuation);
            }
        }
        Object obj = c435401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c435401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            ViewfinderInfo viewfinderInfo = this.viewfinderInfo;
            rect = null;
            Rect rectCalculateViewfinderRect = viewfinderInfo != null ? ViewfinderInfo2.calculateViewfinderRect(viewfinderInfo, imageToAnalyze) : null;
            Rect rect3 = new Rect(0, 0, imageToAnalyze.getWidth(), imageToAnalyze.getHeight());
            if (rectCalculateViewfinderRect != null && rect3.contains(rectCalculateViewfinderRect)) {
                rect = rectCalculateViewfinderRect;
            }
            it = this.analyzers.iterator();
            governmentIdFeed = this;
            list = arrayList;
            if (it.hasNext()) {
            }
        } else if (i2 == 1) {
            Collection collection = (Collection) c435401.L$5;
            it = (Iterator) c435401.L$4;
            rect = (Rect) c435401.L$3;
            list = (List) c435401.L$2;
            ImageToAnalyze imageToAnalyze3 = (ImageToAnalyze) c435401.L$1;
            governmentIdFeed = (GovernmentIdFeed) c435401.L$0;
            ResultKt.throwOnFailure(obj);
            Object objMo27267analyze0E7RQCE = ((Result) obj).getValue();
            collection.add(new AnalyzerResult(objMo27267analyze0E7RQCE, true));
            imageToAnalyze = imageToAnalyze3;
            if (it.hasNext()) {
                List<AnalyzerResult> list3 = list;
                ComposableImageAnalyzer composableImageAnalyzer = (ComposableImageAnalyzer) it.next();
                c435401.L$0 = governmentIdFeed;
                c435401.L$1 = imageToAnalyze;
                c435401.L$2 = list;
                c435401.L$3 = rect;
                c435401.L$4 = it;
                c435401.L$5 = list3;
                c435401.label = 1;
                objMo27267analyze0E7RQCE = composableImageAnalyzer.mo27267analyze0E7RQCE(imageToAnalyze, rect, c435401);
                if (objMo27267analyze0E7RQCE != coroutine_suspended) {
                    imageToAnalyze3 = imageToAnalyze;
                    collection = list3;
                    collection.add(new AnalyzerResult(objMo27267analyze0E7RQCE, true));
                    imageToAnalyze = imageToAnalyze3;
                    if (it.hasNext()) {
                        it2 = governmentIdFeed.passiveAnalyzers.iterator();
                        rect2 = rect;
                        list2 = list;
                        governmentIdFeed2 = governmentIdFeed;
                        imageToAnalyze2 = imageToAnalyze;
                        if (it2.hasNext()) {
                        }
                    }
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection2 = (Collection) c435401.L$5;
            it2 = (Iterator) c435401.L$4;
            rect2 = (Rect) c435401.L$3;
            list2 = (List) c435401.L$2;
            imageToAnalyze2 = (ImageToAnalyze) c435401.L$1;
            governmentIdFeed2 = (GovernmentIdFeed) c435401.L$0;
            ResultKt.throwOnFailure(obj);
            Object value = ((Result) obj).getValue();
            collection2.add(new AnalyzerResult(value, false));
            if (it2.hasNext()) {
                List<AnalyzerResult> list4 = list2;
                ComposableImageAnalyzer composableImageAnalyzer2 = (ComposableImageAnalyzer) it2.next();
                c435401.L$0 = governmentIdFeed2;
                c435401.L$1 = imageToAnalyze2;
                c435401.L$2 = list2;
                c435401.L$3 = rect2;
                c435401.L$4 = it2;
                c435401.L$5 = list4;
                c435401.label = 2;
                Object objMo27267analyze0E7RQCE2 = composableImageAnalyzer2.mo27267analyze0E7RQCE(imageToAnalyze2, rect2, c435401);
                if (objMo27267analyze0E7RQCE2 != coroutine_suspended) {
                    value = objMo27267analyze0E7RQCE2;
                    collection2 = list4;
                    collection2.add(new AnalyzerResult(value, false));
                    if (it2.hasNext()) {
                        return governmentIdFeed2.m27263combineResultsgIAlus$camera_release(imageToAnalyze2, list2);
                    }
                }
                return coroutine_suspended;
            }
        }
    }

    /* compiled from: GovernmentIdFeed.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$4", m3645f = "GovernmentIdFeed.kt", m3646l = {111, 113}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$4 */
    static final class C435414 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ImageProxy $imageProxy;
        Object L$0;
        int label;
        final /* synthetic */ GovernmentIdFeed this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435414(ImageProxy imageProxy, GovernmentIdFeed governmentIdFeed, Continuation<? super C435414> continuation) {
            super(2, continuation);
            this.$imageProxy = imageProxy;
            this.this$0 = governmentIdFeed;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435414(this.$imageProxy, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435414) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L25;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.AutoCloseable] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM27262analyzegIAlus;
            ImageProxy imageProxy;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ImageProxy imageProxy2 = this.$imageProxy;
                    GovernmentIdFeed governmentIdFeed = this.this$0;
                    ImageToAnalyze imageToAnalyze = ImageToAnalyze2.toImageToAnalyze(imageProxy2);
                    if (imageToAnalyze == null) {
                        Unit unit = Unit.INSTANCE;
                        AutoCloseableJVM.closeFinally(imageProxy2, null);
                        return unit;
                    }
                    this.L$0 = imageProxy2;
                    this.label = 1;
                    objM27262analyzegIAlus = governmentIdFeed.m27262analyzegIAlus(imageToAnalyze, this);
                    imageProxy = imageProxy2;
                    if (objM27262analyzegIAlus != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ?? r12 = (AutoCloseable) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM27262analyzegIAlus = ((Result) obj).getValue();
                imageProxy = r12;
                AutoCloseableJVM.closeFinally(imageProxy, null);
                SharedFlow2 sharedFlow2 = this.this$0.resultFlow;
                Result resultM28549boximpl = Result.m28549boximpl(objM27262analyzegIAlus);
                this.L$0 = null;
                this.label = 2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableJVM.closeFinally(r1, th);
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy imageProxy) throws InterruptedException {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        BuildersKt__BuildersKt.runBlocking$default(null, new C435414(imageProxy, this, null), 1, null);
    }

    /* compiled from: GovernmentIdFeed.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5", m3645f = "GovernmentIdFeed.kt", m3646l = {120, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5 */
    static final class C435425 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Image $image;
        final /* synthetic */ int $rotationDegrees;
        Object L$0;
        int label;
        final /* synthetic */ GovernmentIdFeed this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435425(Image image, GovernmentIdFeed governmentIdFeed, int i, Continuation<? super C435425> continuation) {
            super(2, continuation);
            this.$image = image;
            this.this$0 = governmentIdFeed;
            this.$rotationDegrees = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435425(this.$image, this.this$0, this.$rotationDegrees, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435425) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.flow.MutableSharedFlow] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.AutoCloseable] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM27262analyzegIAlus;
            Image image;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Image image2 = this.$image;
                    GovernmentIdFeed governmentIdFeed = this.this$0;
                    ImageToAnalyze imageToAnalyze = ImageToAnalyze2.toImageToAnalyze(image2, this.$rotationDegrees);
                    this.L$0 = image2;
                    this.label = 1;
                    objM27262analyzegIAlus = governmentIdFeed.m27262analyzegIAlus(imageToAnalyze, this);
                    image = image2;
                    if (objM27262analyzegIAlus != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ?? r12 = (AutoCloseable) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM27262analyzegIAlus = ((Result) obj).getValue();
                image = r12;
                AutoCloseableJVM.closeFinally(image, null);
                r1 = this.this$0.resultFlow;
                Result resultM28549boximpl = Result.m28549boximpl(objM27262analyzegIAlus);
                this.L$0 = null;
                this.label = 2;
            } finally {
            }
        }
    }

    @Override // com.withpersona.sdk2.camera.camera2.Camera2ImageAnalyzer
    public void analyze(Image image, int rotationDegrees) throws InterruptedException {
        Intrinsics.checkNotNullParameter(image, "image");
        BuildersKt__BuildersKt.runBlocking$default(null, new C435425(image, this, rotationDegrees, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.withpersona.sdk2.camera.ParsedIdSideOrNone$Side] */
    /* renamed from: combineResults-gIAlu-s$camera_release, reason: not valid java name */
    public final Object m27263combineResultsgIAlus$camera_release(ImageToAnalyze imageToAnalyze, List<AnalyzerResult> analyzerResults) {
        Throwable th;
        Intrinsics.checkNotNullParameter(imageToAnalyze, "imageToAnalyze");
        Intrinsics.checkNotNullParameter(analyzerResults, "analyzerResults");
        if (analyzerResults.isEmpty()) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new ComposableImageAnalyzer3.NoAnalyzerError()));
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.side;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        Throwable thM28553exceptionOrNullimpl = null;
        loop0: while (true) {
            th = thM28553exceptionOrNullimpl;
            for (AnalyzerResult analyzerResult : analyzerResults) {
                Object result = analyzerResult.getResult();
                if (Result.m28556isSuccessimpl(result)) {
                    combineResults_gIAlu_s$processAnalysisData(booleanRef, objectRef3, objectRef2, objectRef, objectRef4, booleanRef2, objectRef5, (ComposableImageAnalyzer2) result, analyzerResult.getIsActiveAnalyzer());
                }
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(result);
                if (thM28553exceptionOrNullimpl == null || th != null || !analyzerResult.getIsActiveAnalyzer()) {
                }
            }
            booleanRef2.element = true;
        }
        if (booleanRef2.element) {
            if (th != null) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m28550constructorimpl(new GovernmentIdFeed5.None((ImageLightCondition) objectRef5.element));
        }
        if (!booleanRef.element) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m28550constructorimpl(new GovernmentIdFeed5.None((ImageLightCondition) objectRef5.element));
        }
        GovernmentIdFeed5.Side side = (GovernmentIdFeed5.Side) objectRef.element;
        if (side == null) {
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m28550constructorimpl(new GovernmentIdFeed5.None((ImageLightCondition) objectRef5.element));
        }
        Bitmap bitmap = imageToAnalyze.getBitmap();
        if (bitmap == null) {
            Result.Companion companion6 = Result.INSTANCE;
            return Result.m28550constructorimpl(new GovernmentIdFeed5.None((ImageLightCondition) objectRef5.element));
        }
        Result.Companion companion7 = Result.INSTANCE;
        return Result.m28550constructorimpl(new GovernmentIdFeed5.ParsedIdSide(side, bitmap, (ImageIdMetadata) objectRef2.element, (BarcodeInfo) objectRef3.element, (ExtractedTexts) objectRef4.element, (ImageLightCondition) objectRef5.element));
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [T, com.withpersona.sdk2.camera.ExtractedTexts] */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, com.withpersona.sdk2.camera.ParsedIdSideOrNone$Side] */
    /* JADX WARN: Type inference failed for: r10v14, types: [T, com.withpersona.sdk2.camera.ImageIdMetadata] */
    /* JADX WARN: Type inference failed for: r10v18, types: [T, com.withpersona.sdk2.camera.BarcodeInfo] */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, com.withpersona.sdk2.camera.ImageLightCondition] */
    private static final void combineResults_gIAlu_s$processAnalysisData(Ref.BooleanRef booleanRef, Ref.ObjectRef<BarcodeInfo> objectRef, Ref.ObjectRef<ImageIdMetadata> objectRef2, Ref.ObjectRef<GovernmentIdFeed5.Side> objectRef3, Ref.ObjectRef<ExtractedTexts> objectRef4, Ref.BooleanRef booleanRef2, Ref.ObjectRef<ImageLightCondition> objectRef5, ComposableImageAnalyzer2 composableImageAnalyzer2, boolean z) {
        ComposableImageAnalyzer2.Empty empty = ComposableImageAnalyzer2.Empty.INSTANCE;
        if (!Intrinsics.areEqual(composableImageAnalyzer2, empty) && z) {
            booleanRef.element = true;
        }
        if (composableImageAnalyzer2 instanceof ComposableImageAnalyzer2.BarcodeAnalysisData) {
            if (objectRef.element == null) {
                objectRef.element = ((ComposableImageAnalyzer2.BarcodeAnalysisData) composableImageAnalyzer2).getExtractedBarcode();
                return;
            }
            return;
        }
        if (composableImageAnalyzer2 instanceof ComposableImageAnalyzer2.IdFrontAnalysisData) {
            objectRef2.element = ((ComposableImageAnalyzer2.IdFrontAnalysisData) composableImageAnalyzer2).getMetadata();
            return;
        }
        if (composableImageAnalyzer2 instanceof ComposableImageAnalyzer2.FrontOrBackData) {
            ComposableImageAnalyzer2.FrontOrBackData frontOrBackData = (ComposableImageAnalyzer2.FrontOrBackData) composableImageAnalyzer2;
            combineResults_gIAlu_s$processAnalysisData(booleanRef, objectRef, objectRef2, objectRef3, objectRef4, booleanRef2, objectRef5, frontOrBackData.getFrontOrBackData(), z);
            objectRef3.element = frontOrBackData.getSide();
        } else if (composableImageAnalyzer2 instanceof ComposableImageAnalyzer2.TextExtractionData) {
            objectRef4.element = ((ComposableImageAnalyzer2.TextExtractionData) composableImageAnalyzer2).getExtractedTexts();
        } else if (Intrinsics.areEqual(composableImageAnalyzer2, empty)) {
            booleanRef2.element = true;
        } else {
            if (!(composableImageAnalyzer2 instanceof ComposableImageAnalyzer2.LightConditionData)) {
                throw new NoWhenBranchMatchedException();
            }
            objectRef5.element = ((ComposableImageAnalyzer2.LightConditionData) composableImageAnalyzer2).getImageLightCondition();
        }
    }
}
