package com.robinhood.shared.tradeladder.p398ui.ladder;

import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo2;
import com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo4;
import com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseLadderDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u00072\u00020\bB+\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/BaseLadderDuxo;", "DS", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderDataState;", "VS", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderViewState;", "E", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderEvent;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderDuxo;", "initialDataState", "stateProvider", "Lcom/robinhood/android/udf/StateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderDataState;Lcom/robinhood/android/udf/StateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class BaseLadderDuxo<DS extends BaseLadderDuxo2, VS extends BaseLadderDuxo5, E extends BaseLadderDuxo4> extends BaseDuxo3<DS, VS, E> implements BaseLadderDuxo3 {
    public static final int $stable = BaseDuxo3.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLadderDuxo(DS initialDataState, StateProvider<? super DS, ? extends VS> stateProvider, DuxoBundle duxoBundle) {
        super(initialDataState, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(initialDataState, "initialDataState");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }
}
