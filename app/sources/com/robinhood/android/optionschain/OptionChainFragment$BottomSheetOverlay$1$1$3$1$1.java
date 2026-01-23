package com.robinhood.android.optionschain;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.utils.extensions.ViewsKt;
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

/* compiled from: OptionChainFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainFragment$BottomSheetOverlay$1$1$3$1$1", m3645f = "OptionChainFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionChainFragment$BottomSheetOverlay$1$1$3$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $bottomPadding;
    int label;
    final /* synthetic */ OptionChainFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainFragment$BottomSheetOverlay$1$1$3$1$1(OptionChainFragment optionChainFragment, int i, Continuation<? super OptionChainFragment$BottomSheetOverlay$1$1$3$1$1> continuation) {
        super(2, continuation);
        this.this$0 = optionChainFragment;
        this.$bottomPadding = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionChainFragment$BottomSheetOverlay$1$1$3$1$1(this.this$0, this.$bottomPadding, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionChainFragment$BottomSheetOverlay$1$1$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ConstraintLayout optionChainMainContent = this.this$0.getBinding().optionChainMainContent;
            Intrinsics.checkNotNullExpressionValue(optionChainMainContent, "optionChainMainContent");
            ViewsKt.setBottomPadding(optionChainMainContent, this.$bottomPadding);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
