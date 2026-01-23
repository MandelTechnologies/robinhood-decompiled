package com.robinhood.android.crypto.p094ui.detail.cards;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CryptoDetailCardComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$1$1", m3645f = "CryptoDetailCardComposable.kt", m3646l = {62}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoDetailCardComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoDetailCard $card;
    final /* synthetic */ MutableTransitionState<Boolean> $cardVisibleState;
    final /* synthetic */ CryptoDetailCardDuxo $duxo;
    final /* synthetic */ Function0<Unit> $onLoaded;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoDetailCardComposable2(CryptoDetailCard cryptoDetailCard, MutableTransitionState<Boolean> mutableTransitionState, Function0<Unit> function0, CryptoDetailCardDuxo cryptoDetailCardDuxo, Continuation<? super CryptoDetailCardComposable2> continuation) {
        super(2, continuation);
        this.$card = cryptoDetailCard;
        this.$cardVisibleState = mutableTransitionState;
        this.$onLoaded = function0;
        this.$duxo = cryptoDetailCardDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoDetailCardComposable2(this.$card, this.$cardVisibleState, this.$onLoaded, this.$duxo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoDetailCardComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$card != null) {
                if (!this.$cardVisibleState.getCurrentState().booleanValue() && !this.$cardVisibleState.getTargetState().booleanValue()) {
                    this.$cardVisibleState.setTargetState(boxing.boxBoolean(true));
                    this.$onLoaded.invoke();
                }
                final MutableTransitionState<Boolean> mutableTransitionState = this.$cardVisibleState;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(CryptoDetailCardComposable2.invokeSuspend$lambda$0(mutableTransitionState));
                    }
                });
                final CryptoDetailCardDuxo cryptoDetailCardDuxo = this.$duxo;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoDetailCardComposableKt$CryptoDetailCardComposable$1$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (z) {
                            cryptoDetailCardDuxo.onCardDismissed();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowSnapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(MutableTransitionState mutableTransitionState) {
        return mutableTransitionState.isIdle() && !((Boolean) mutableTransitionState.getTargetState()).booleanValue();
    }
}
