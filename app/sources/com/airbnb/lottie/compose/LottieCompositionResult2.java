package com.airbnb.lottie.compose;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;

/* compiled from: LottieCompositionResult.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R/\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\bR/\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\rR\u001b\u0010 \u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001b\u0010%\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001b\u0010'\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!¨\u0006("}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "<init>", "()V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "complete$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)V", "complete", "", "error", "completeExceptionally$lottie_compose_release", "(Ljava/lang/Throwable;)V", "completeExceptionally", "Lkotlinx/coroutines/CompletableDeferred;", "compositionDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Lcom/airbnb/lottie/LottieComposition;", "setValue", "value", "error$delegate", "getError", "()Ljava/lang/Throwable;", "setError", "", "isLoading$delegate", "Landroidx/compose/runtime/State;", "isLoading", "()Z", "isComplete$delegate", "isComplete", "isFailure$delegate", "isFailure", "isSuccess$delegate", "isSuccess", "lottie-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.airbnb.lottie.compose.LottieCompositionResultImpl, reason: use source file name */
/* loaded from: classes16.dex */
public final class LottieCompositionResult2 implements LottieCompositionResult {
    private final CompletableDeferred<LottieComposition> compositionDeferred = CompletableDeferred3.CompletableDeferred$default(null, 1, null);

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final SnapshotState value = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* renamed from: error$delegate, reason: from kotlin metadata */
    private final SnapshotState error = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* renamed from: isLoading$delegate, reason: from kotlin metadata */
    private final SnapshotState4 isLoading = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isLoading$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.getValue() == null && this.this$0.getError() == null);
        }
    });

    /* renamed from: isComplete$delegate, reason: from kotlin metadata */
    private final SnapshotState4 isComplete = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl.isComplete.2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf((LottieCompositionResult2.this.getValue() == null && LottieCompositionResult2.this.getError() == null) ? false : true);
        }
    });

    /* renamed from: isFailure$delegate, reason: from kotlin metadata */
    private final SnapshotState4 isFailure = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isFailure$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.getError() != null);
        }
    });

    /* renamed from: isSuccess$delegate, reason: from kotlin metadata */
    private final SnapshotState4 isSuccess = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl.isSuccess.2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResult2.this.getValue() != null);
        }
    });

    private void setValue(LottieComposition lottieComposition) {
        this.value.setValue(lottieComposition);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.SnapshotState4
    public LottieComposition getValue() {
        return (LottieComposition) this.value.getValue();
    }

    private void setError(Throwable th) {
        this.error.setValue(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Throwable getError() {
        return (Throwable) this.error.getValue();
    }

    public boolean isComplete() {
        return ((Boolean) this.isComplete.getValue()).booleanValue();
    }

    public boolean isSuccess() {
        return ((Boolean) this.isSuccess.getValue()).booleanValue();
    }

    public final synchronized void complete$lottie_compose_release(LottieComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        if (isComplete()) {
            return;
        }
        setValue(composition);
        this.compositionDeferred.complete(composition);
    }

    public final synchronized void completeExceptionally$lottie_compose_release(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (isComplete()) {
            return;
        }
        setError(error);
        this.compositionDeferred.completeExceptionally(error);
    }
}
