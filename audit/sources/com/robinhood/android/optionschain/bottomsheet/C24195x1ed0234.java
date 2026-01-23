package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$6$1$1$1", m3645f = "OptionChainBottomSheetScaffold.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$6$1$1$1 */
/* loaded from: classes11.dex */
final class C24195x1ed0234 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<MultiModeSheetState> $bottomSheetState$delegate;
    final /* synthetic */ OptionChainBottomSheetScaffoldDuxo $duxo;
    final /* synthetic */ float $nuxDistance;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24195x1ed0234(float f, OptionChainBottomSheetScaffoldDuxo optionChainBottomSheetScaffoldDuxo, SnapshotState4<MultiModeSheetState> snapshotState4, Continuation<? super C24195x1ed0234> continuation) {
        super(2, continuation);
        this.$nuxDistance = f;
        this.$duxo = optionChainBottomSheetScaffoldDuxo;
        this.$bottomSheetState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24195x1ed0234(this.$nuxDistance, this.$duxo, this.$bottomSheetState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24195x1ed0234) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MultiModeSheetState multiModeSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$44 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$44(this.$bottomSheetState$delegate);
            float f = this.$nuxDistance;
            this.label = 1;
            if (OptionChainBottomSheetScaffoldKt.playNuxAnimation(multiModeSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$44, f, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$duxo.markNuxAsShown();
        return Unit.INSTANCE;
    }
}
