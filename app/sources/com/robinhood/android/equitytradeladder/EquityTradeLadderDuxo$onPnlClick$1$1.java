package com.robinhood.android.equitytradeladder;

import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderDisplayMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityTradeLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onPnlClick$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityTradeLadderDuxo$onPnlClick$1$1 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LadderDisplayMode.values().length];
            try {
                iArr[LadderDisplayMode.PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LadderDisplayMode.PNL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    EquityTradeLadderDuxo$onPnlClick$1$1(Continuation<? super EquityTradeLadderDuxo$onPnlClick$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityTradeLadderDuxo$onPnlClick$1$1 equityTradeLadderDuxo$onPnlClick$1$1 = new EquityTradeLadderDuxo$onPnlClick$1$1(continuation);
        equityTradeLadderDuxo$onPnlClick$1$1.L$0 = obj;
        return equityTradeLadderDuxo$onPnlClick$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
        return ((EquityTradeLadderDuxo$onPnlClick$1$1) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        LadderDisplayMode ladderDisplayMode;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) this.L$0;
        int i = WhenMappings.$EnumSwitchMapping$0[equityTradeLadderDataState.getLadderDisplayMode().ordinal()];
        if (i == 1) {
            ladderDisplayMode = LadderDisplayMode.PNL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ladderDisplayMode = LadderDisplayMode.PRICE;
        }
        return EquityTradeLadderDataState.copy$default(equityTradeLadderDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, ladderDisplayMode, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -134217729, 268435455, null);
    }
}
