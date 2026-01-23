package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetState2;
import java.util.ArrayList;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$4$1", m3645f = "OptionChainBottomSheetScaffold.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$4$1 */
/* loaded from: classes11.dex */
final class C24192x4821dd8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<ImmutableList<Integer>> $chartErrorSectionHeight$delegate;
    final /* synthetic */ SnapshotState<ImmutableList<MultiModeSheetState2>> $chartErrorSheetValues$delegate;
    final /* synthetic */ SnapshotIntState2 $dragHandleHeight$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24192x4821dd8(SnapshotState<ImmutableList<Integer>> snapshotState, SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState2, SnapshotIntState2 snapshotIntState2, Continuation<? super C24192x4821dd8> continuation) {
        super(2, continuation);
        this.$chartErrorSectionHeight$delegate = snapshotState;
        this.$chartErrorSheetValues$delegate = snapshotState2;
        this.$dragHandleHeight$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24192x4821dd8(this.$chartErrorSectionHeight$delegate, this.$chartErrorSheetValues$delegate, this.$dragHandleHeight$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24192x4821dd8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$29(this.$chartErrorSectionHeight$delegate).isEmpty() && OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$26(this.$chartErrorSheetValues$delegate).isEmpty()) {
                SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState = this.$chartErrorSheetValues$delegate;
                SnapshotState<ImmutableList<Integer>> snapshotState2 = this.$chartErrorSectionHeight$delegate;
                SnapshotIntState2 snapshotIntState2 = this.$dragHandleHeight$delegate;
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                ImmutableList immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$29 = OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$29(snapshotState2);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$29, 10));
                Iterator<E> it = immutableListOptionChainBottomSheetScaffold_TCVpFMg$lambda$29.iterator();
                while (it.hasNext()) {
                    arrayList.add(boxing.boxBoolean(listCreateListBuilder.add(new MultiModeSheetState2.FixedHeight(((Number) it.next()).intValue() + snapshotIntState2.getIntValue()))));
                }
                listCreateListBuilder.add(MultiModeSheetState2.Expanded.INSTANCE);
                snapshotState.setValue(extensions2.toPersistentList(CollectionsKt.build(listCreateListBuilder)));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
