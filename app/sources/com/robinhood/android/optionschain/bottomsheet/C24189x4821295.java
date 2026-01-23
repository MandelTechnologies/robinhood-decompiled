package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$1$1", m3645f = "OptionChainBottomSheetScaffold.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$1$1 */
/* loaded from: classes11.dex */
final class C24189x4821295 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $dragHandleHeight$delegate;
    final /* synthetic */ SnapshotState<ImmutableList<Integer>> $sectionHeight$delegate;
    final /* synthetic */ SnapshotState<ImmutableList<MultiModeSheetState2>> $sheetValues$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24189x4821295(SnapshotState<ImmutableList<Integer>> snapshotState, SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState2, SnapshotIntState2 snapshotIntState2, Continuation<? super C24189x4821295> continuation) {
        super(2, continuation);
        this.$sectionHeight$delegate = snapshotState;
        this.$sheetValues$delegate = snapshotState2;
        this.$dragHandleHeight$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24189x4821295(this.$sectionHeight$delegate, this.$sheetValues$delegate, this.$dragHandleHeight$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24189x4821295) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$8(this.$sectionHeight$delegate).isEmpty() && OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$5(this.$sheetValues$delegate).size() == 1) {
                SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState = this.$sheetValues$delegate;
                SnapshotState<ImmutableList<Integer>> snapshotState2 = this.$sectionHeight$delegate;
                SnapshotIntState2 snapshotIntState2 = this.$dragHandleHeight$delegate;
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                Iterator<E> it = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$8(snapshotState2).iterator();
                while (it.hasNext()) {
                    listCreateListBuilder.add(new MultiModeSheetState2.FixedHeight(((Number) it.next()).intValue() + snapshotIntState2.getIntValue()));
                }
                listCreateListBuilder.add(MultiModeSheetState2.Expanded.INSTANCE);
                snapshotState.setValue(extensions2.toPersistentList(CollectionsKt.build(listCreateListBuilder)));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
