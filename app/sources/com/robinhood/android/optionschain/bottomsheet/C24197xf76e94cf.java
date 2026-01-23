package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7$1$1$1$1$1", m3645f = "OptionChainBottomSheetScaffold.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, EnumC7081g.f2774x74902ae0}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$7$1$1$1$1$1 */
/* loaded from: classes11.dex */
final class C24197xf76e94cf extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<MultiModeSheetState> $bottomSheetState$delegate;
    final /* synthetic */ SnapshotState<MultiModeSheetState2> $currentBottomSheetValue$delegate;
    final /* synthetic */ SnapshotState<ImmutableList<MultiModeSheetState2>> $sheetValues$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24197xf76e94cf(SnapshotState<MultiModeSheetState2> snapshotState, SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState2, SnapshotState4<MultiModeSheetState> snapshotState4, Continuation<? super C24197xf76e94cf> continuation) {
        super(2, continuation);
        this.$currentBottomSheetValue$delegate = snapshotState;
        this.$sheetValues$delegate = snapshotState2;
        this.$bottomSheetState$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24197xf76e94cf(this.$currentBottomSheetValue$delegate, this.$sheetValues$delegate, this.$bottomSheetState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24197xf76e94cf) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState.animateTo$default(r3, r4, 0.0f, r9, 2, null) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState.animateTo$default(r1, r2, 0.0f, r9, 2, null) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MultiModeSheetState2 multiModeSheetState2OptionChainBottomSheetScaffold_TCVpFMg$lambda$36 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$36(this.$currentBottomSheetValue$delegate);
            if (multiModeSheetState2OptionChainBottomSheetScaffold_TCVpFMg$lambda$36 instanceof MultiModeSheetState2.FixedHeight) {
                int iIndexOf = CollectionsKt.indexOf((List<? extends MultiModeSheetState2>) OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate), OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$36(this.$currentBottomSheetValue$delegate));
                if (iIndexOf >= 0 && (i = iIndexOf + 1) < OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate).size()) {
                    MultiModeSheetState multiModeSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$44 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$44(this.$bottomSheetState$delegate);
                    MultiModeSheetState2 multiModeSheetState2 = (MultiModeSheetState2) OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate).get(i);
                    this.label = 1;
                }
            } else if (Intrinsics.areEqual(multiModeSheetState2OptionChainBottomSheetScaffold_TCVpFMg$lambda$36, MultiModeSheetState2.Expanded.INSTANCE)) {
                if (OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate).size() - 2 >= 0) {
                    MultiModeSheetState multiModeSheetStateOptionChainBottomSheetScaffold_TCVpFMg$lambda$442 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$44(this.$bottomSheetState$delegate);
                    MultiModeSheetState2 multiModeSheetState22 = (MultiModeSheetState2) OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate).get(OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate).size() - 2);
                    this.label = 2;
                }
            } else if (!Intrinsics.areEqual(multiModeSheetState2OptionChainBottomSheetScaffold_TCVpFMg$lambda$36, MultiModeSheetState2.Hidden.INSTANCE) && multiModeSheetState2OptionChainBottomSheetScaffold_TCVpFMg$lambda$36 != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
