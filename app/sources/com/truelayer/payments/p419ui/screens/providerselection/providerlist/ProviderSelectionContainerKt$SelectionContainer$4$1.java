package com.truelayer.payments.p419ui.screens.providerselection.providerlist;

import androidx.compose.runtime.SnapshotState;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.QueryState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProviderSelectionContainer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.providerlist.ProviderSelectionContainerKt$SelectionContainer$4$1", m3645f = "ProviderSelectionContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ProviderSelectionContainerKt$SelectionContainer$4$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $branchSelection;
    final /* synthetic */ SnapshotState<QueryState> $query$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProviderSelectionContainerKt$SelectionContainer$4$1(boolean z, SnapshotState<QueryState> snapshotState, Continuation<? super ProviderSelectionContainerKt$SelectionContainer$4$1> continuation) {
        super(2, continuation);
        this.$branchSelection = z;
        this.$query$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProviderSelectionContainerKt$SelectionContainer$4$1(this.$branchSelection, this.$query$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProviderSelectionContainerKt$SelectionContainer$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (ProviderSelectionContainerKt.SelectionContainer$lambda$2(this.$query$delegate) instanceof QueryState.Focused) {
            if (this.$branchSelection) {
                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.BranchSelectionSearch(ProviderSelectionContainerKt.SelectionContainer$lambda$2(this.$query$delegate).getInner(), null, 2, null));
            } else {
                TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.ProviderSelectionSearch(ProviderSelectionContainerKt.SelectionContainer$lambda$2(this.$query$delegate).getInner(), null, 2, null));
            }
        }
        return Unit.INSTANCE;
    }
}
