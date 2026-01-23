package com.robinhood.android.crypto.tab.p093ui.interest;

import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeInterestSection.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/DataRowWithIconClickHandler;", "", "state", "Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;", "onClick", "Lkotlin/Function0;", "", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;Lkotlin/jvm/functions/Function0;)V", "getState", "()Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DataRowWithIconClickHandler {
    public static final int $stable = BentoDataRowState.$stable;
    private final Function0<Unit> onClick;
    private final BentoDataRowState state;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataRowWithIconClickHandler copy$default(DataRowWithIconClickHandler dataRowWithIconClickHandler, BentoDataRowState bentoDataRowState, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            bentoDataRowState = dataRowWithIconClickHandler.state;
        }
        if ((i & 2) != 0) {
            function0 = dataRowWithIconClickHandler.onClick;
        }
        return dataRowWithIconClickHandler.copy(bentoDataRowState, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoDataRowState getState() {
        return this.state;
    }

    public final Function0<Unit> component2() {
        return this.onClick;
    }

    public final DataRowWithIconClickHandler copy(BentoDataRowState state, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new DataRowWithIconClickHandler(state, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataRowWithIconClickHandler)) {
            return false;
        }
        DataRowWithIconClickHandler dataRowWithIconClickHandler = (DataRowWithIconClickHandler) other;
        return Intrinsics.areEqual(this.state, dataRowWithIconClickHandler.state) && Intrinsics.areEqual(this.onClick, dataRowWithIconClickHandler.onClick);
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        Function0<Unit> function0 = this.onClick;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public String toString() {
        return "DataRowWithIconClickHandler(state=" + this.state + ", onClick=" + this.onClick + ")";
    }

    public DataRowWithIconClickHandler(BentoDataRowState state, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.onClick = function0;
    }

    public final BentoDataRowState getState() {
        return this.state;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }
}
