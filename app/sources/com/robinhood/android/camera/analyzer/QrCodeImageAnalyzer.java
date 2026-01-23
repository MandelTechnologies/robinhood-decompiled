package com.robinhood.android.camera.analyzer;

import android.graphics.Matrix;
import android.media.Image;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.robinhood.models.card.p311db.Card;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: QrCodeImageAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R.\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R%\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/camera/analyzer/QrCodeImageAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "j$/time/Clock", Card.Icon.CLOCK, "", "", "types", "<init>", "(Lj$/time/Clock;Ljava/util/Set;)V", "", "clear", "()V", "Landroidx/camera/core/ImageProxy;", "image", "analyze", "(Landroidx/camera/core/ImageProxy;)V", "Lj$/time/Clock;", "Ljava/util/Set;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "j$/time/Instant", "Lkotlin/Result;", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/Flow;", "successfullyScannedQrCodes", "Lkotlinx/coroutines/flow/Flow;", "getSuccessfullyScannedQrCodes", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "scanner", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class QrCodeImageAnalyzer implements ImageAnalysis.Analyzer {
    public static final int $stable = 8;
    private final Clock clock;
    private final BarcodeScanner scanner;
    private final StateFlow2<Tuples2<Instant, Result<Barcode>>> stateFlow;
    private final Flow<Result<Barcode>> successfullyScannedQrCodes;
    private final Set<Integer> types;

    /* JADX WARN: Multi-variable type inference failed */
    public QrCodeImageAnalyzer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }

    public QrCodeImageAnalyzer(Clock clock, Set<Integer> types) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(types, "types");
        this.clock = clock;
        this.types = types;
        StateFlow2<Tuples2<Instant, Result<Barcode>>> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(Tuples4.m3642to(Instant.now(), null));
        this.stateFlow = stateFlow2MutableStateFlow;
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(stateFlow2MutableStateFlow, new Function2() { // from class: com.robinhood.android.camera.analyzer.QrCodeImageAnalyzer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(QrCodeImageAnalyzer.successfullyScannedQrCodes$lambda$0((Tuples2) obj, (Tuples2) obj2));
            }
        });
        this.successfullyScannedQrCodes = new Flow<Result<? extends Barcode>>() { // from class: com.robinhood.android.camera.analyzer.QrCodeImageAnalyzer$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.camera.analyzer.QrCodeImageAnalyzer$special$$inlined$map$1$2 */
            public static final class C99302<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.camera.analyzer.QrCodeImageAnalyzer$special$$inlined$map$1$2", m3645f = "QrCodeImageAnalyzer.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.camera.analyzer.QrCodeImageAnalyzer$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C99302.this.emit(null, this);
                    }
                }

                public C99302(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object second = ((Tuples2) obj).getSecond();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(second, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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
            public Object collect(FlowCollector<? super Result<? extends Barcode>> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C99302(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().setBarcodeFormats(256, new int[0]).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        this.scanner = client;
    }

    public /* synthetic */ QrCodeImageAnalyzer(Clock clock, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Clock.systemUTC() : clock, (i & 2) != 0 ? SetsKt.setOf((Object[]) new Integer[]{0, 7, 8}) : set);
    }

    public final Flow<Result<Barcode>> getSuccessfullyScannedQrCodes() {
        return this.successfullyScannedQrCodes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean successfullyScannedQrCodes$lambda$0(Tuples2 old, Tuples2 tuples2) {
        String rawValue;
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(tuples2, "new");
        Result result = (Result) old.getSecond();
        String rawValue2 = null;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            Barcode barcode = (Barcode) value;
            rawValue = barcode != null ? barcode.getRawValue() : null;
        }
        Result result2 = (Result) tuples2.getSecond();
        if (result2 != null) {
            Object value2 = result2.getValue();
            if (Result.m28555isFailureimpl(value2)) {
                value2 = null;
            }
            Barcode barcode2 = (Barcode) value2;
            if (barcode2 != null) {
                rawValue2 = barcode2.getRawValue();
            }
        }
        return Intrinsics.areEqual(rawValue, rawValue2);
    }

    public final void clear() {
        this.stateFlow.setValue(Tuples4.m3642to(this.clock.instant(), null));
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(final ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Image image2 = image.getImage();
        if (image2 != null) {
            InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image2, image.getImageInfo().getRotationDegrees());
            Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
            final Instant instant = this.clock.instant();
            this.scanner.process(inputImageFromMediaImage).addOnSuccessListener(new OnSuccessListener() { // from class: com.robinhood.android.camera.analyzer.QrCodeImageAnalyzer.analyze.1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(List<Barcode> list) {
                    Object value;
                    Intrinsics.checkNotNull(list);
                    QrCodeImageAnalyzer qrCodeImageAnalyzer = QrCodeImageAnalyzer.this;
                    ArrayList<Barcode> arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (qrCodeImageAnalyzer.types.contains(Integer.valueOf(((Barcode) obj).getValueType()))) {
                            arrayList.add(obj);
                        }
                    }
                    QrCodeImageAnalyzer qrCodeImageAnalyzer2 = QrCodeImageAnalyzer.this;
                    Instant instant2 = instant;
                    for (Barcode barcode : arrayList) {
                        StateFlow2 stateFlow2 = qrCodeImageAnalyzer2.stateFlow;
                        do {
                            value = stateFlow2.getValue();
                        } while (!stateFlow2.compareAndSet(value, Tuples4.m3642to(instant2, Result.m28549boximpl(Result.m28550constructorimpl(barcode)))));
                    }
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.robinhood.android.camera.analyzer.QrCodeImageAnalyzer.analyze.2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exception) {
                    Object value;
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    StateFlow2 stateFlow2 = QrCodeImageAnalyzer.this.stateFlow;
                    Instant instant2 = instant;
                    do {
                        value = stateFlow2.getValue();
                        Result.Companion companion = Result.INSTANCE;
                    } while (!stateFlow2.compareAndSet(value, Tuples4.m3642to(instant2, Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(exception))))));
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: com.robinhood.android.camera.analyzer.QrCodeImageAnalyzer.analyze.3
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task<List<Barcode>> it) {
                    Object value;
                    Intrinsics.checkNotNullParameter(it, "it");
                    image.close();
                    if (Intrinsics.areEqual(((Tuples2) this.stateFlow.getValue()).getFirst(), instant)) {
                        return;
                    }
                    StateFlow2 stateFlow2 = this.stateFlow;
                    Instant instant2 = instant;
                    do {
                        value = stateFlow2.getValue();
                    } while (!stateFlow2.compareAndSet(value, Tuples4.m3642to(instant2, null)));
                }
            });
        }
    }
}
