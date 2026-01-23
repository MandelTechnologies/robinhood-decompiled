package com.robinhood.android.matcha.p177ui.p178qr;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.camera.analyzer.QrCodeImageAnalyzer;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MatchaQrComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$CameraPreviewScanner$1$1", m3645f = "MatchaQrComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$CameraPreviewScanner$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaQrComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $onQrCodeScanned;
    final /* synthetic */ QrCodeImageAnalyzer $qrCodeAnalyzer;
    final /* synthetic */ CoroutineScope $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchaQrComposable2(CoroutineScope coroutineScope, QrCodeImageAnalyzer qrCodeImageAnalyzer, Function1<? super String, Unit> function1, Continuation<? super MatchaQrComposable2> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
        this.$qrCodeAnalyzer = qrCodeImageAnalyzer;
        this.$onQrCodeScanned = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchaQrComposable2(this.$scope, this.$qrCodeAnalyzer, this.$onQrCodeScanned, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchaQrComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: MatchaQrComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$CameraPreviewScanner$1$1$1", m3645f = "MatchaQrComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$CameraPreviewScanner$1$1$1 */
    static final class C214241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $onQrCodeScanned;
        final /* synthetic */ QrCodeImageAnalyzer $qrCodeAnalyzer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C214241(QrCodeImageAnalyzer qrCodeImageAnalyzer, Function1<? super String, Unit> function1, Continuation<? super C214241> continuation) {
            super(2, continuation);
            this.$qrCodeAnalyzer = qrCodeImageAnalyzer;
            this.$onQrCodeScanned = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C214241(this.$qrCodeAnalyzer, this.$onQrCodeScanned, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C214241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.$qrCodeAnalyzer.getSuccessfullyScannedQrCodes());
                final Function1<String, Unit> function1 = this.$onQrCodeScanned;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt.CameraPreviewScanner.1.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                        Object value = ((Result) obj2).getValue();
                        Function1<String, Unit> function12 = function1;
                        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
                        if (thM28553exceptionOrNullimpl == null) {
                            String displayValue = ((Barcode) value).getDisplayValue();
                            if (displayValue != null) {
                                function12.invoke(displayValue);
                            }
                        } else {
                            String localizedMessage = thM28553exceptionOrNullimpl.getLocalizedMessage();
                            if (localizedMessage != null) {
                                CrashReporter.INSTANCE.log(localizedMessage);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C214241(this.$qrCodeAnalyzer, this.$onQrCodeScanned, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
