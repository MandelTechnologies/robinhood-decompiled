package com.robinhood.android.equitytradeladder;

import com.robinhood.shared.tradeladder.p398ui.LadderInteraction;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceLevels;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityTradeLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onUserInteraction$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityTradeLadderDuxo$onUserInteraction$1$1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
    final /* synthetic */ EquityTradeLadderDataState $it;
    final /* synthetic */ LadderInteraction $ladderInteraction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderDuxo$onUserInteraction$1$1(LadderInteraction ladderInteraction, EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDuxo$onUserInteraction$1$1> continuation) {
        super(2, continuation);
        this.$ladderInteraction = ladderInteraction;
        this.$it = equityTradeLadderDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradeLadderDuxo$onUserInteraction$1$1 equityTradeLadderDuxo$onUserInteraction$1$1 = new EquityTradeLadderDuxo$onUserInteraction$1$1(this.$ladderInteraction, this.$it, continuation);
        equityTradeLadderDuxo$onUserInteraction$1$1.L$0 = obj;
        return equityTradeLadderDuxo$onUserInteraction$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
        return ((EquityTradeLadderDuxo$onUserInteraction$1$1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
        boolean started = ((LadderInteraction.ZoomStateChanged) this.$ladderInteraction).getStarted();
        Integer zoomCenterIndex = ((LadderInteraction.ZoomStateChanged) this.$ladderInteraction).getZoomCenterIndex();
        Integer zoomCenterIndex2 = ((LadderInteraction.ZoomStateChanged) this.$ladderInteraction).getZoomCenterIndex();
        BigDecimal price = null;
        if (zoomCenterIndex2 != null) {
            EquityTradeLadderDataState equityTradeLadderDataState2 = this.$it;
            int iIntValue = zoomCenterIndex2.intValue();
            LadderPriceLevels ladderPriceLevels = equityTradeLadderDataState2.getLadderPriceLevels();
            if (ladderPriceLevels != null) {
                price = ladderPriceLevels.getPrice(iIntValue);
            }
        }
        Integer zoomNumberOfItems = ((LadderInteraction.ZoomStateChanged) this.$ladderInteraction).getZoomNumberOfItems();
        return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, new LinkedHashMap(), null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, started, zoomCenterIndex, price, zoomNumberOfItems, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -513, 268434975, null);
    }
}
