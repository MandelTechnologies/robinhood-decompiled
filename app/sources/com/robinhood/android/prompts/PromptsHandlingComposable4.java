package com.robinhood.android.prompts;

import androidx.compose.runtime.SnapshotState;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PromptsHandlingComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.prompts.PromptsHandlingComposableKt$Map$1$1", m3645f = "PromptsHandlingComposable.kt", m3646l = {280, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.prompts.PromptsHandlingComposableKt$Map$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PromptsHandlingComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LatLng $location;
    final /* synthetic */ SnapshotState<Boolean> $mapLoaded$delegate;
    final /* synthetic */ CameraPositionState $positionState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromptsHandlingComposable4(CameraPositionState cameraPositionState, LatLng latLng, SnapshotState<Boolean> snapshotState, Continuation<? super PromptsHandlingComposable4> continuation) {
        super(2, continuation);
        this.$positionState = cameraPositionState;
        this.$location = latLng;
        this.$mapLoaded$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PromptsHandlingComposable4(this.$positionState, this.$location, this.$mapLoaded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PromptsHandlingComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (com.google.maps.android.compose.CameraPositionState.animate$default(r3, r4, 0, r9, 2, null) != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (PromptsHandlingComposable3.Map$lambda$16(this.$mapLoaded$delegate)) {
                this.label = 1;
                if (DelayKt.delay(500L, this) != coroutine_suspended) {
                    CameraPositionState cameraPositionState = this.$positionState;
                    CameraUpdate cameraUpdateNewLatLngZoom = CameraUpdateFactory.newLatLngZoom(this.$location, 5.0f);
                    Intrinsics.checkNotNullExpressionValue(cameraUpdateNewLatLngZoom, "newLatLngZoom(...)");
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CameraPositionState cameraPositionState2 = this.$positionState;
        CameraUpdate cameraUpdateNewLatLngZoom2 = CameraUpdateFactory.newLatLngZoom(this.$location, 5.0f);
        Intrinsics.checkNotNullExpressionValue(cameraUpdateNewLatLngZoom2, "newLatLngZoom(...)");
        this.label = 2;
    }
}
