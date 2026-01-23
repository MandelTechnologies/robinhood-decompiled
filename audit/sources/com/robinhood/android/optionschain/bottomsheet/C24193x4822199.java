package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$5$1", m3645f = "OptionChainBottomSheetScaffold.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, 200}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$5$1 */
/* loaded from: classes11.dex */
final class C24193x4822199 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<MultiModeSheetState> $bottomSheetState$delegate;
    final /* synthetic */ SnapshotState<ImmutableList<MultiModeSheetState2>> $sheetValues$delegate;
    final /* synthetic */ boolean $shouldShowBottomSheet;
    final /* synthetic */ boolean $shouldShowL2BottomSheet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24193x4822199(boolean z, boolean z2, SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState, SnapshotState4<MultiModeSheetState> snapshotState4, Continuation<? super C24193x4822199> continuation) {
        super(2, continuation);
        this.$shouldShowL2BottomSheet = z;
        this.$shouldShowBottomSheet = z2;
        this.$sheetValues$delegate = snapshotState;
        this.$bottomSheetState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24193x4822199(this.$shouldShowL2BottomSheet, this.$shouldShowBottomSheet, this.$sheetValues$delegate, this.$bottomSheetState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24193x4822199) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState.animateTo$default(r6, r7, 0.0f, r12, 2, null) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState.animateTo$default(r1, r2, 0.0f, r12, 2, null) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState.animateTo$default(r1, r2, 0.0f, r12, 2, null) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState.animateTo$default(r1, r2, 0.0f, r12, 2, null) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$shouldShowL2BottomSheet) {
                if (OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate).size() >= 2) {
                    MultiModeSheetState multiModeSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$44 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$44(this.$bottomSheetState$delegate);
                    MultiModeSheetState2 multiModeSheetState2 = (MultiModeSheetState2) OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate).get(1);
                    this.label = 1;
                } else {
                    MultiModeSheetState multiModeSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$442 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$44(this.$bottomSheetState$delegate);
                    MultiModeSheetState2 multiModeSheetState22 = (MultiModeSheetState2) CollectionsKt.first((List) OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate));
                    this.label = 2;
                }
            } else if (this.$shouldShowBottomSheet) {
                MultiModeSheetState multiModeSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$443 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$44(this.$bottomSheetState$delegate);
                MultiModeSheetState2 multiModeSheetState23 = (MultiModeSheetState2) CollectionsKt.first((List) OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate));
                this.label = 3;
            } else {
                MultiModeSheetState multiModeSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$444 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$44(this.$bottomSheetState$delegate);
                MultiModeSheetState2.Hidden hidden = MultiModeSheetState2.Hidden.INSTANCE;
                this.label = 4;
            }
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
