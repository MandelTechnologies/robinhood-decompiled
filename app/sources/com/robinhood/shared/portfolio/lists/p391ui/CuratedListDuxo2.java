package com.robinhood.shared.portfolio.lists.p391ui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$13$1", m3645f = "CuratedListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.portfolio.lists.ui.CuratedListDuxo$bind$13$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CuratedListDuxo2 extends ContinuationImpl7 implements Function2<CuratedListDataState, Continuation<? super CuratedListDataState>, Object> {
    final /* synthetic */ Boolean $isEnabled;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListDuxo2(Boolean bool, Continuation<? super CuratedListDuxo2> continuation) {
        super(2, continuation);
        this.$isEnabled = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CuratedListDuxo2 curatedListDuxo2 = new CuratedListDuxo2(this.$isEnabled, continuation);
        curatedListDuxo2.L$0 = obj;
        return curatedListDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CuratedListDataState curatedListDataState, Continuation<? super CuratedListDataState> continuation) {
        return ((CuratedListDuxo2) create(curatedListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CuratedListDataState curatedListDataState = (CuratedListDataState) this.L$0;
        Boolean bool = this.$isEnabled;
        Intrinsics.checkNotNull(bool);
        return curatedListDataState.copy((32767 & 1) != 0 ? curatedListDataState.screeners : null, (32767 & 2) != 0 ? curatedListDataState.followedCuratedLists : null, (32767 & 4) != 0 ? curatedListDataState.listOrder : null, (32767 & 8) != 0 ? curatedListDataState.curatedListItems : null, (32767 & 16) != 0 ? curatedListDataState.activeOptionWatchlistItems : null, (32767 & 32) != 0 ? curatedListDataState.expandedCuratedListIds : null, (32767 & 64) != 0 ? curatedListDataState.curatedListViewModes : null, (32767 & 128) != 0 ? curatedListDataState.positions : null, (32767 & 256) != 0 ? curatedListDataState.shouldShowListRows : false, (32767 & 512) != 0 ? curatedListDataState.isSwipeToBuyEnabled : false, (32767 & 1024) != 0 ? curatedListDataState.accountNumber : null, (32767 & 2048) != 0 ? curatedListDataState.swipeAnimationPreview : null, (32767 & 4096) != 0 ? curatedListDataState.swipeTooltip : null, (32767 & 8192) != 0 ? curatedListDataState.source : null, (32767 & 16384) != 0 ? curatedListDataState.isInEtfSupportedRegion : false, (32767 & 32768) != 0 ? curatedListDataState.subzeroEnabled : bool.booleanValue());
    }
}
