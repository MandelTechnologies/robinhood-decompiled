package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.runtime.SnapshotState;
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
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainBottomSheetScaffold.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$3$1", m3645f = "OptionChainBottomSheetScaffold.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt$OptionChainBottomSheetScaffold$3$1 */
/* loaded from: classes11.dex */
final class C24191x4821a17 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<ImmutableList<Integer>> $noQuoteSectionHeight$delegate;
    final /* synthetic */ SnapshotState<ImmutableList<MultiModeSheetState2>> $noQuoteSheetValues$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C24191x4821a17(SnapshotState<ImmutableList<Integer>> snapshotState, SnapshotState<ImmutableList<MultiModeSheetState2>> snapshotState2, Continuation<? super C24191x4821a17> continuation) {
        super(2, continuation);
        this.$noQuoteSectionHeight$delegate = snapshotState;
        this.$noQuoteSheetValues$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24191x4821a17(this.$noQuoteSectionHeight$delegate, this.$noQuoteSheetValues$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24191x4821a17) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$22(this.$noQuoteSectionHeight$delegate).isEmpty() && OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$19(this.$noQuoteSheetValues$delegate).isEmpty()) {
                this.$noQuoteSheetValues$delegate.setValue(extensions2.persistentListOf(new MultiModeSheetState2.FixedHeight(((Number) CollectionsKt.first((List) OptionChainBottomSheetScaffoldKt.OptionChainBottomSheetScaffold_TCVpFMg$lambda$22(this.$noQuoteSectionHeight$delegate))).intValue()), MultiModeSheetState2.Expanded.INSTANCE));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
