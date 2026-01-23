package com.robinhood.android.feature.linking;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: AuraComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.linking.AuraComposableKt$AuraComposable$1$1", m3645f = "AuraComposable.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.linking.AuraComposableKt$AuraComposable$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class AuraComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<ImmutableList<Color>> $animatedColors$delegate;
    final /* synthetic */ ImmutableList<Color> $colors;
    final /* synthetic */ SnapshotState<Boolean> $hasFadedIn$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuraComposable2(ImmutableList<Color> immutableList, SnapshotState<Boolean> snapshotState, SnapshotState<ImmutableList<Color>> snapshotState2, Continuation<? super AuraComposable2> continuation) {
        super(2, continuation);
        this.$colors = immutableList;
        this.$hasFadedIn$delegate = snapshotState;
        this.$animatedColors$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuraComposable2(this.$colors, this.$hasFadedIn$delegate, this.$animatedColors$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AuraComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AuraComposable.AuraComposable$lambda$2(this.$hasFadedIn$delegate, false);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$animatedColors$delegate.setValue(this.$colors);
        AuraComposable.AuraComposable$lambda$2(this.$hasFadedIn$delegate, true);
        return Unit.INSTANCE;
    }
}
