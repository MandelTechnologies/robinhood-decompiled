package com.robinhood.android.event.gamedetail;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: GameDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/event/gamedetail/GameDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.GameDetailDuxo$onPropsViewAllToggle$1$1", m3645f = "GameDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class GameDetailDuxo$onPropsViewAllToggle$1$1 extends ContinuationImpl7 implements Function2<GameDetailDataState, Continuation<? super GameDetailDataState>, Object> {
    final /* synthetic */ GameDetailDataState $ds;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameDetailDuxo$onPropsViewAllToggle$1$1(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDuxo$onPropsViewAllToggle$1$1> continuation) {
        super(2, continuation);
        this.$ds = gameDetailDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GameDetailDuxo$onPropsViewAllToggle$1$1 gameDetailDuxo$onPropsViewAllToggle$1$1 = new GameDetailDuxo$onPropsViewAllToggle$1$1(this.$ds, continuation);
        gameDetailDuxo$onPropsViewAllToggle$1$1.L$0 = obj;
        return gameDetailDuxo$onPropsViewAllToggle$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GameDetailDataState gameDetailDataState, Continuation<? super GameDetailDataState> continuation) {
        return ((GameDetailDuxo$onPropsViewAllToggle$1$1) create(gameDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        GameDetailDataState gameDetailDataState = (GameDetailDataState) this.L$0;
        int selectedPropsCategoryIndex = this.$ds.getSelectedPropsCategoryIndex();
        return gameDetailDataState.copy(((-536870913) & 1) != 0 ? gameDetailDataState.isComboEnabled : false, ((-536870913) & 2) != 0 ? gameDetailDataState.event : null, ((-536870913) & 4) != 0 ? gameDetailDataState.swapAccount : null, ((-536870913) & 8) != 0 ? gameDetailDataState.individualAccountNumber : null, ((-536870913) & 16) != 0 ? gameDetailDataState.marketSessionChangeDataState : null, ((-536870913) & 32) != 0 ? gameDetailDataState.chartSpan : null, ((-536870913) & 64) != 0 ? gameDetailDataState.chart : null, ((-536870913) & 128) != 0 ? gameDetailDataState.scrubbedPoint : null, ((-536870913) & 256) != 0 ? gameDetailDataState.allContractIdsForGame : null, ((-536870913) & 512) != 0 ? gameDetailDataState.contractIdToQuotes : null, ((-536870913) & 1024) != 0 ? gameDetailDataState.contractIdToOpenInterestDeltas : null, ((-536870913) & 2048) != 0 ? gameDetailDataState.contractIdToFundamentals : null, ((-536870913) & 4096) != 0 ? gameDetailDataState.contractIdToStrikeContract : null, ((-536870913) & 8192) != 0 ? gameDetailDataState.allContractIdsToEventContract : null, ((-536870913) & 16384) != 0 ? gameDetailDataState.contractGroup : null, ((-536870913) & 32768) != 0 ? gameDetailDataState.prepacksContractGroup : null, ((-536870913) & 65536) != 0 ? gameDetailDataState.playerPropsGroupSection : null, ((-536870913) & 131072) != 0 ? gameDetailDataState.displayDetails : null, ((-536870913) & 262144) != 0 ? gameDetailDataState.bottomSheetDisplayDetails : null, ((-536870913) & 524288) != 0 ? gameDetailDataState.comboSelection : null, ((-536870913) & 1048576) != 0 ? gameDetailDataState.comboSheetDisplayDetails : null, ((-536870913) & 2097152) != 0 ? gameDetailDataState.comboSelectedStrikeContracts : null, ((-536870913) & 4194304) != 0 ? gameDetailDataState.comboQuoteResult : null, ((-536870913) & 8388608) != 0 ? gameDetailDataState.contractIdToPositionsForCurrentGame : null, ((-536870913) & 16777216) != 0 ? gameDetailDataState.pendingOrders : null, ((-536870913) & 33554432) != 0 ? gameDetailDataState.eventTimeline : null, ((-536870913) & 67108864) != 0 ? gameDetailDataState.eventState : null, ((-536870913) & 134217728) != 0 ? gameDetailDataState.titleState : null, ((-536870913) & 268435456) != 0 ? gameDetailDataState.bottomSheetSelection : null, ((-536870913) & 536870912) != 0 ? gameDetailDataState.selectedAboutEventType : null, ((-536870913) & 1073741824) != 0 ? gameDetailDataState.showDisabledTradeButtonMessage : false, ((-536870913) & Integer.MIN_VALUE) != 0 ? gameDetailDataState.selectedPropsCategoryIndex : 0, (255 & 1) != 0 ? gameDetailDataState.propsExpansionState : MapsKt.plus(gameDetailDataState.getPropsExpansionState(), Tuples4.m3642to(boxing.boxInt(selectedPropsCategoryIndex), boxing.boxBoolean(!(gameDetailDataState.getPropsExpansionState().get(boxing.boxInt(selectedPropsCategoryIndex)) != null ? r3.booleanValue() : false)))), (255 & 2) != 0 ? gameDetailDataState.estimatedFeesPerQuantity : null, (255 & 4) != 0 ? gameDetailDataState.isInEcSportsExperiment : false, (255 & 8) != 0 ? gameDetailDataState.isInAmericanOddsExperiment : false, (255 & 16) != 0 ? gameDetailDataState.isInLastPlayExperiment : false, (255 & 32) != 0 ? gameDetailDataState.isInPricePayoutExperiment : false, (255 & 64) != 0 ? gameDetailDataState.showAmericanOdds : false, (255 & 128) != 0 ? gameDetailDataState.contractIdToEstimatedFees : null);
    }
}
