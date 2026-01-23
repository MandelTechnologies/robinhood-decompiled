package com.robinhood.android.mcw.currencyconverter;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.mcw.currencyconverter.util.Animations2;
import com.robinhood.android.mcw.currencyconverter.util.FieldAnimationValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CurrencyConverterComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$1$1", m3645f = "CurrencyConverterComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterComposableKt$MainContent$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class CurrencyConverterComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FieldAnimationValues $fieldAnimatables;
    final /* synthetic */ SnapshotState<Boolean> $finishedInitialAnimation$delegate;
    final /* synthetic */ SnapshotState<Boolean> $numpadIsVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyConverterComposable4(FieldAnimationValues fieldAnimationValues, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super CurrencyConverterComposable4> continuation) {
        super(2, continuation);
        this.$fieldAnimatables = fieldAnimationValues;
        this.$numpadIsVisible$delegate = snapshotState;
        this.$finishedInitialAnimation$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrencyConverterComposable4(this.$fieldAnimatables, this.$numpadIsVisible$delegate, this.$finishedInitialAnimation$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrencyConverterComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CurrencyConverterComposable3.MainContent$lambda$16(this.$numpadIsVisible$delegate, true);
            FieldAnimationValues fieldAnimationValues = this.$fieldAnimatables;
            this.label = 1;
            if (Animations2.doEnterAnimation(fieldAnimationValues, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CurrencyConverterComposable3.MainContent$lambda$13(this.$finishedInitialAnimation$delegate, true);
        return Unit.INSTANCE;
    }
}
