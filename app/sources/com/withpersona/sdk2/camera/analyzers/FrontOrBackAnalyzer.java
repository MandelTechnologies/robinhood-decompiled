package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import com.withpersona.sdk2.camera.GovernmentIdFeed5;
import com.withpersona.sdk2.camera.ImageToAnalyze;
import com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer2;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FrontOrBackAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/FrontOrBackAnalyzer;", "Lcom/withpersona/sdk2/camera/analyzers/ComposableImageAnalyzer;", "Lcom/withpersona/sdk2/camera/analyzers/IdFrontAnalyzer;", "idFrontAnalyzer", "Lcom/withpersona/sdk2/camera/analyzers/BarcodePdf417Analyzer;", "barcodePdf417Analyzer", "<init>", "(Lcom/withpersona/sdk2/camera/analyzers/IdFrontAnalyzer;Lcom/withpersona/sdk2/camera/analyzers/BarcodePdf417Analyzer;)V", "Lcom/withpersona/sdk2/camera/ImageToAnalyze;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "analyze-0E7RQCE", "(Lcom/withpersona/sdk2/camera/ImageToAnalyze;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyze", "Lcom/withpersona/sdk2/camera/analyzers/IdFrontAnalyzer;", "Lcom/withpersona/sdk2/camera/analyzers/BarcodePdf417Analyzer;", "", "Lcom/withpersona/sdk2/camera/ParsedIdSideOrNone$Side;", "analyzers", "Ljava/util/Map;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class FrontOrBackAnalyzer implements ComposableImageAnalyzer {
    private final Map<ComposableImageAnalyzer, GovernmentIdFeed5.Side> analyzers;
    private final BarcodePdf417Analyzer barcodePdf417Analyzer;
    private final IdFrontAnalyzer idFrontAnalyzer;

    public FrontOrBackAnalyzer(IdFrontAnalyzer idFrontAnalyzer, BarcodePdf417Analyzer barcodePdf417Analyzer) {
        Intrinsics.checkNotNullParameter(idFrontAnalyzer, "idFrontAnalyzer");
        Intrinsics.checkNotNullParameter(barcodePdf417Analyzer, "barcodePdf417Analyzer");
        this.idFrontAnalyzer = idFrontAnalyzer;
        this.barcodePdf417Analyzer = barcodePdf417Analyzer;
        this.analyzers = MapsKt.mapOf(Tuples4.m3642to(barcodePdf417Analyzer, GovernmentIdFeed5.Side.Back), Tuples4.m3642to(idFrontAnalyzer, GovernmentIdFeed5.Side.Front));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008c -> B:21:0x0091). Please report as a decompilation issue!!! */
    @Override // com.withpersona.sdk2.camera.analyzers.ComposableImageAnalyzer
    /* renamed from: analyze-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo27267analyze0E7RQCE(ImageToAnalyze imageToAnalyze, Rect rect, Continuation<? super Result<? extends ComposableImageAnalyzer2>> continuation) {
        FrontOrBackAnalyzer2 frontOrBackAnalyzer2;
        Rect rect2;
        Iterator<Map.Entry<ComposableImageAnalyzer, GovernmentIdFeed5.Side>> it;
        Ref.ObjectRef objectRef;
        if (continuation instanceof FrontOrBackAnalyzer2) {
            frontOrBackAnalyzer2 = (FrontOrBackAnalyzer2) continuation;
            int i = frontOrBackAnalyzer2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                frontOrBackAnalyzer2.label = i - Integer.MIN_VALUE;
            } else {
                frontOrBackAnalyzer2 = new FrontOrBackAnalyzer2(this, continuation);
            }
        }
        Object obj = frontOrBackAnalyzer2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = frontOrBackAnalyzer2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            rect2 = rect;
            it = this.analyzers.entrySet().iterator();
            objectRef = objectRef2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GovernmentIdFeed5.Side side = (GovernmentIdFeed5.Side) frontOrBackAnalyzer2.L$4;
            it = (Iterator) frontOrBackAnalyzer2.L$3;
            objectRef = (Ref.ObjectRef) frontOrBackAnalyzer2.L$2;
            Rect rect3 = (Rect) frontOrBackAnalyzer2.L$1;
            ImageToAnalyze imageToAnalyze2 = (ImageToAnalyze) frontOrBackAnalyzer2.L$0;
            ResultKt.throwOnFailure(obj);
            Object value = ((Result) obj).getValue();
            if (Result.m28556isSuccessimpl(value)) {
                ComposableImageAnalyzer2 composableImageAnalyzer2 = (ComposableImageAnalyzer2) value;
                if (!Intrinsics.areEqual(composableImageAnalyzer2, ComposableImageAnalyzer2.Empty.INSTANCE)) {
                    return Result.m28550constructorimpl(new ComposableImageAnalyzer2.FrontOrBackData(side, composableImageAnalyzer2));
                }
            }
            ?? M28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
            if (M28553exceptionOrNullimpl != 0 && objectRef.element == 0) {
                objectRef.element = M28553exceptionOrNullimpl;
            }
            rect2 = rect3;
            imageToAnalyze = imageToAnalyze2;
            if (it.hasNext()) {
                Map.Entry<ComposableImageAnalyzer, GovernmentIdFeed5.Side> next = it.next();
                ComposableImageAnalyzer key = next.getKey();
                GovernmentIdFeed5.Side value2 = next.getValue();
                frontOrBackAnalyzer2.L$0 = imageToAnalyze;
                frontOrBackAnalyzer2.L$1 = rect2;
                frontOrBackAnalyzer2.L$2 = objectRef;
                frontOrBackAnalyzer2.L$3 = it;
                frontOrBackAnalyzer2.L$4 = value2;
                frontOrBackAnalyzer2.label = 1;
                Object objMo27267analyze0E7RQCE = key.mo27267analyze0E7RQCE(imageToAnalyze, rect2, frontOrBackAnalyzer2);
                if (objMo27267analyze0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                imageToAnalyze2 = imageToAnalyze;
                side = value2;
                rect3 = rect2;
                value = objMo27267analyze0E7RQCE;
                if (Result.m28556isSuccessimpl(value)) {
                }
                ?? M28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(value);
                if (M28553exceptionOrNullimpl2 != 0) {
                    objectRef.element = M28553exceptionOrNullimpl2;
                }
                rect2 = rect3;
                imageToAnalyze = imageToAnalyze2;
                if (it.hasNext()) {
                    Throwable th = (Throwable) objectRef.element;
                    if (th != null) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m28550constructorimpl(ResultKt.createFailure(th));
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m28550constructorimpl(ComposableImageAnalyzer2.Empty.INSTANCE);
                }
            }
        }
    }
}
