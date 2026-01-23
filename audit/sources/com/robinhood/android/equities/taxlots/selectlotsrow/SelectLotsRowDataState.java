package com.robinhood.android.equities.taxlots.selectlotsrow;

import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.android.equities.taxlots.utils.TaxLotsStringsHelper;
import com.robinhood.models.p320db.Position;
import com.robinhood.rosetta.common.Money;
import com.robinhood.utils.resource.StringResource;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SelectLotsRowDataState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÂ\u0003J1\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowDataState;", "", "selectedLots", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "position", "Lcom/robinhood/models/db/Position;", "estimatedGainLoss", "Lcom/robinhood/rosetta/common/Money;", "<init>", "(Ljava/util/List;Lcom/robinhood/models/db/Position;Lcom/robinhood/rosetta/common/Money;)V", "getSelectedLots", "()Ljava/util/List;", "hasSelectedLots", "", "getHasSelectedLots", "()Z", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "numSelectedShares", "Ljava/math/BigDecimal;", "getNumSelectedShares", "()Ljava/math/BigDecimal;", "metaTitle", "getMetaTitle", "metaSubtitle", "getMetaSubtitle", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class SelectLotsRowDataState {
    public static final int $stable = 8;
    private final Money estimatedGainLoss;
    private final Position position;
    private final List<TaxLotSelection> selectedLots;

    public SelectLotsRowDataState() {
        this(null, null, null, 7, null);
    }

    /* renamed from: component2, reason: from getter */
    private final Position getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    private final Money getEstimatedGainLoss() {
        return this.estimatedGainLoss;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectLotsRowDataState copy$default(SelectLotsRowDataState selectLotsRowDataState, List list, Position position, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            list = selectLotsRowDataState.selectedLots;
        }
        if ((i & 2) != 0) {
            position = selectLotsRowDataState.position;
        }
        if ((i & 4) != 0) {
            money = selectLotsRowDataState.estimatedGainLoss;
        }
        return selectLotsRowDataState.copy(list, position, money);
    }

    public final List<TaxLotSelection> component1() {
        return this.selectedLots;
    }

    public final SelectLotsRowDataState copy(List<TaxLotSelection> selectedLots, Position position, Money estimatedGainLoss) {
        Intrinsics.checkNotNullParameter(selectedLots, "selectedLots");
        return new SelectLotsRowDataState(selectedLots, position, estimatedGainLoss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectLotsRowDataState)) {
            return false;
        }
        SelectLotsRowDataState selectLotsRowDataState = (SelectLotsRowDataState) other;
        return Intrinsics.areEqual(this.selectedLots, selectLotsRowDataState.selectedLots) && Intrinsics.areEqual(this.position, selectLotsRowDataState.position) && Intrinsics.areEqual(this.estimatedGainLoss, selectLotsRowDataState.estimatedGainLoss);
    }

    public int hashCode() {
        int iHashCode = this.selectedLots.hashCode() * 31;
        Position position = this.position;
        int iHashCode2 = (iHashCode + (position == null ? 0 : position.hashCode())) * 31;
        Money money = this.estimatedGainLoss;
        return iHashCode2 + (money != null ? money.hashCode() : 0);
    }

    public String toString() {
        return "SelectLotsRowDataState(selectedLots=" + this.selectedLots + ", position=" + this.position + ", estimatedGainLoss=" + this.estimatedGainLoss + ")";
    }

    public SelectLotsRowDataState(List<TaxLotSelection> selectedLots, Position position, Money money) {
        Intrinsics.checkNotNullParameter(selectedLots, "selectedLots");
        this.selectedLots = selectedLots;
        this.position = position;
        this.estimatedGainLoss = money;
    }

    public /* synthetic */ SelectLotsRowDataState(List list, Position position, Money money, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : position, (i & 4) != 0 ? null : money);
    }

    public final List<TaxLotSelection> getSelectedLots() {
        return this.selectedLots;
    }

    public final boolean getHasSelectedLots() {
        return !this.selectedLots.isEmpty();
    }

    public final StringResource getTitle() {
        return StringResource.INSTANCE.invoke(C14807R.string.tax_lot_row_title, new Object[0]);
    }

    private final BigDecimal getNumSelectedShares() {
        BigDecimal ZERO;
        List<TaxLotSelection> list = this.selectedLots;
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (Object obj : list) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            String shares = ((TaxLotSelection) obj).getShares();
            if (shares == null || (ZERO = StringsKt.toBigDecimalOrNull(shares)) == null) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
            bigDecimalAdd = bigDecimalAdd.add(ZERO);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd);
        return bigDecimalAdd;
    }

    public final StringResource getMetaTitle() {
        if (!getHasSelectedLots()) {
            return StringResource.INSTANCE.invoke(C14807R.string.tax_lot_select_lots, new Object[0]);
        }
        return TaxLotsStringsHelper.INSTANCE.getTermStringResource(getNumSelectedShares(), this.selectedLots);
    }

    public final StringResource getMetaSubtitle() {
        return TaxLotsStringsHelper.INSTANCE.getGainLossStringResource(getNumSelectedShares(), this.estimatedGainLoss);
    }
}
