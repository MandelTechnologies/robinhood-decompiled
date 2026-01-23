package com.robinhood.android.options.combo.p207ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.options.combo.api.ApiComboOrder;
import com.robinhood.android.options.combo.p206db.ComboOrder;
import com.robinhood.android.options.combo.p206db.ComboOrderExecution;
import com.robinhood.android.options.combo.p206db.ComboOrderSalesTax;
import com.robinhood.models.SortableHistoryItem;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.UiComboOrderOptionLeg;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: UiComboOrder.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b*\u0010\u0013J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003¢\u0006\u0004\b+\u0010\u0013JN\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b1\u0010#J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010%R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010)R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010\u0013R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b?\u0010\u0013R#\u0010G\u001a\u0004\u0018\u00010@8BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010DR\u0011\u0010J\u001a\u0002048F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010N\u001a\u00020K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010P\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bO\u0010DR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0\n8F¢\u0006\u0006\u001a\u0004\bR\u0010\u0013R\u0014\u0010U\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010DR\u0014\u0010V\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010IR\u0016\u0010Z\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010DR\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006h"}, m3636d2 = {"Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/models/SortableHistoryItem;", "Lcom/robinhood/android/options/combo/db/ComboOrder;", "comboOrder", "Lcom/robinhood/models/db/OptionChain;", "optionChain", "Lcom/robinhood/models/db/Instrument;", "instrument", "", "Lcom/robinhood/android/options/combo/ui/UiComboOrderLeg;", "legs", "Lcom/robinhood/android/options/combo/db/ComboOrderSalesTax;", "salesTax", "<init>", "(Lcom/robinhood/android/options/combo/db/ComboOrder;Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/Instrument;Ljava/util/List;Ljava/util/List;)V", "Lcom/robinhood/models/ui/UiComboOrderOptionLeg;", "getUiComboOrderOptionLegs", "()Ljava/util/List;", "Lcom/robinhood/models/db/Document;", "tradeConfirms", "getTradeConfirmation", "(Ljava/util/List;)Lcom/robinhood/models/db/Document;", "Ljava/math/BigDecimal;", "getTotalExecutionPrice", "()Ljava/math/BigDecimal;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/android/options/combo/db/ComboOrder;", "component2", "()Lcom/robinhood/models/db/OptionChain;", "component3", "()Lcom/robinhood/models/db/Instrument;", "component4", "component5", "copy", "(Lcom/robinhood/android/options/combo/db/ComboOrder;Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/Instrument;Ljava/util/List;Ljava/util/List;)Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/options/combo/db/ComboOrder;", "getComboOrder", "Lcom/robinhood/models/db/OptionChain;", "getOptionChain", "Lcom/robinhood/models/db/Instrument;", "getInstrument", "Ljava/util/List;", "getLegs", "getSalesTax", "j$/time/Instant", "lastExecutionTimestamp$delegate", "Lkotlin/Lazy;", "getLastExecutionTimestamp", "()Lj$/time/Instant;", "getLastExecutionTimestamp$annotations", "()V", "lastExecutionTimestamp", "getHasSingleOptionLeg", "()Z", "hasSingleOptionLeg", "Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;", "getEffect", "()Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;", "effect", "getLatestExecution", "latestExecution", "Ljava/util/UUID;", "getExecutionIds", "executionIds", "getSortingTimestamp", "sortingTimestamp", "isPending", "Lcom/robinhood/models/util/Money$Adjustment;", "getAdjustment", "()Lcom/robinhood/models/util/Money$Adjustment;", "adjustment", "getId", "()Ljava/util/UUID;", "id", "getInitiatedAt", "initiatedAt", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "getHistoryState", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "historyState", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "transactionReference", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class UiComboOrder implements HistoryEvent, Parcelable, SortableHistoryItem {
    public static final Parcelable.Creator<UiComboOrder> CREATOR = new Creator();
    private final ComboOrder comboOrder;
    private final Instrument instrument;

    /* renamed from: lastExecutionTimestamp$delegate, reason: from kotlin metadata */
    private final transient Lazy lastExecutionTimestamp;
    private final List<UiComboOrderLeg> legs;
    private final OptionChain optionChain;
    private final List<ComboOrderSalesTax> salesTax;

    /* compiled from: UiComboOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiComboOrder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiComboOrder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ComboOrder comboOrderCreateFromParcel = ComboOrder.CREATOR.createFromParcel(parcel);
            OptionChain optionChain = (OptionChain) parcel.readParcelable(UiComboOrder.class.getClassLoader());
            Instrument instrument = (Instrument) parcel.readParcelable(UiComboOrder.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UiComboOrderLeg.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(ComboOrderSalesTax.CREATOR.createFromParcel(parcel));
            }
            return new UiComboOrder(comboOrderCreateFromParcel, optionChain, instrument, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiComboOrder[] newArray(int i) {
            return new UiComboOrder[i];
        }
    }

    public static /* synthetic */ UiComboOrder copy$default(UiComboOrder uiComboOrder, ComboOrder comboOrder, OptionChain optionChain, Instrument instrument, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            comboOrder = uiComboOrder.comboOrder;
        }
        if ((i & 2) != 0) {
            optionChain = uiComboOrder.optionChain;
        }
        if ((i & 4) != 0) {
            instrument = uiComboOrder.instrument;
        }
        if ((i & 8) != 0) {
            list = uiComboOrder.legs;
        }
        if ((i & 16) != 0) {
            list2 = uiComboOrder.salesTax;
        }
        List list3 = list2;
        Instrument instrument2 = instrument;
        return uiComboOrder.copy(comboOrder, optionChain, instrument2, list, list3);
    }

    private static /* synthetic */ void getLastExecutionTimestamp$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final ComboOrder getComboOrder() {
        return this.comboOrder;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionChain getOptionChain() {
        return this.optionChain;
    }

    /* renamed from: component3, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final List<UiComboOrderLeg> component4() {
        return this.legs;
    }

    public final List<ComboOrderSalesTax> component5() {
        return this.salesTax;
    }

    public final UiComboOrder copy(ComboOrder comboOrder, OptionChain optionChain, Instrument instrument, List<UiComboOrderLeg> legs, List<ComboOrderSalesTax> salesTax) {
        Intrinsics.checkNotNullParameter(comboOrder, "comboOrder");
        Intrinsics.checkNotNullParameter(optionChain, "optionChain");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(salesTax, "salesTax");
        return new UiComboOrder(comboOrder, optionChain, instrument, legs, salesTax);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiComboOrder)) {
            return false;
        }
        UiComboOrder uiComboOrder = (UiComboOrder) other;
        return Intrinsics.areEqual(this.comboOrder, uiComboOrder.comboOrder) && Intrinsics.areEqual(this.optionChain, uiComboOrder.optionChain) && Intrinsics.areEqual(this.instrument, uiComboOrder.instrument) && Intrinsics.areEqual(this.legs, uiComboOrder.legs) && Intrinsics.areEqual(this.salesTax, uiComboOrder.salesTax);
    }

    public int hashCode() {
        return (((((((this.comboOrder.hashCode() * 31) + this.optionChain.hashCode()) * 31) + this.instrument.hashCode()) * 31) + this.legs.hashCode()) * 31) + this.salesTax.hashCode();
    }

    public String toString() {
        return "UiComboOrder(comboOrder=" + this.comboOrder + ", optionChain=" + this.optionChain + ", instrument=" + this.instrument + ", legs=" + this.legs + ", salesTax=" + this.salesTax + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.comboOrder.writeToParcel(dest, flags);
        dest.writeParcelable(this.optionChain, flags);
        dest.writeParcelable(this.instrument, flags);
        List<UiComboOrderLeg> list = this.legs;
        dest.writeInt(list.size());
        Iterator<UiComboOrderLeg> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<ComboOrderSalesTax> list2 = this.salesTax;
        dest.writeInt(list2.size());
        Iterator<ComboOrderSalesTax> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public boolean getDefaultIsExpanded() {
        return HistoryEvent.DefaultImpls.getDefaultIsExpanded(this);
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public HistoryEvent.SortKey getSortKey() {
        return HistoryEvent.DefaultImpls.getSortKey(this);
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public StatefulHistoryEvent<HistoryEvent> toStatefulHistoryEvent() {
        return HistoryEvent.DefaultImpls.toStatefulHistoryEvent(this);
    }

    public UiComboOrder(ComboOrder comboOrder, OptionChain optionChain, Instrument instrument, List<UiComboOrderLeg> legs, List<ComboOrderSalesTax> salesTax) {
        Intrinsics.checkNotNullParameter(comboOrder, "comboOrder");
        Intrinsics.checkNotNullParameter(optionChain, "optionChain");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(salesTax, "salesTax");
        this.comboOrder = comboOrder;
        this.optionChain = optionChain;
        this.instrument = instrument;
        this.legs = legs;
        this.salesTax = salesTax;
        this.lastExecutionTimestamp = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.options.combo.ui.UiComboOrder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiComboOrder.lastExecutionTimestamp_delegate$lambda$10(this.f$0);
            }
        });
    }

    public final ComboOrder getComboOrder() {
        return this.comboOrder;
    }

    public final OptionChain getOptionChain() {
        return this.optionChain;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final List<UiComboOrderLeg> getLegs() {
        return this.legs;
    }

    public final List<ComboOrderSalesTax> getSalesTax() {
        return this.salesTax;
    }

    public final boolean getHasSingleOptionLeg() {
        int i;
        List<UiComboOrderLeg> list = this.legs;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((UiComboOrderLeg) it.next()).getOptionInstrument() != null && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i == 1;
    }

    public final UiOptionStrategyDisplay.OptionOrderPositionEffect getEffect() {
        if (this.comboOrder.getOpeningStrategy() != null && this.comboOrder.getClosingStrategy() != null) {
            return UiOptionStrategyDisplay.OptionOrderPositionEffect.CUSTOM;
        }
        List<UiComboOrderLeg> list = this.legs;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((UiComboOrderLeg) it.next()).getLeg().getPositionEffect() != OrderPositionEffect.OPEN) {
                    List<UiComboOrderLeg> list2 = this.legs;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((UiComboOrderLeg) it2.next()).getLeg().getPositionEffect() != OrderPositionEffect.CLOSE) {
                                return UiOptionStrategyDisplay.OptionOrderPositionEffect.CUSTOM;
                            }
                        }
                    }
                    return UiOptionStrategyDisplay.OptionOrderPositionEffect.CLOSE;
                }
            }
        }
        return UiOptionStrategyDisplay.OptionOrderPositionEffect.OPEN;
    }

    public final Instant getLatestExecution() {
        Iterator itIterator2 = SequencesKt.flatMapIterable(CollectionsKt.asSequence(this.legs), new Function1() { // from class: com.robinhood.android.options.combo.ui.UiComboOrder$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiComboOrder._get_latestExecution_$lambda$3((UiComboOrderLeg) obj);
            }
        }).iterator2();
        if (!itIterator2.hasNext()) {
            return null;
        }
        Instant timestamp = ((ComboOrderExecution) itIterator2.next()).getTimestamp();
        while (itIterator2.hasNext()) {
            Instant timestamp2 = ((ComboOrderExecution) itIterator2.next()).getTimestamp();
            if (timestamp.compareTo(timestamp2) > 0) {
                timestamp = timestamp2;
            }
        }
        return timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable _get_latestExecution_$lambda$3(UiComboOrderLeg it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getExecutions();
    }

    public final List<UUID> getExecutionIds() {
        List<UiComboOrderLeg> list = this.legs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<ComboOrderExecution> executions = ((UiComboOrderLeg) it.next()).getExecutions();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
            Iterator<T> it2 = executions.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ComboOrderExecution) it2.next()).getId());
            }
            arrayList.add(arrayList2);
        }
        return CollectionsKt.flatten(arrayList);
    }

    @Override // com.robinhood.models.SortableHistoryItem
    public Instant getSortingTimestamp() {
        return this.comboOrder.getCreatedAt();
    }

    @Override // com.robinhood.models.SortableHistoryItem
    /* renamed from: isPending */
    public boolean getIsPending() {
        return this.comboOrder.getDerivedState().isPending();
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public Money.Adjustment getAdjustment() {
        return this.comboOrder.getAdjustment();
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public UUID getId() {
        return this.comboOrder.getId();
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public Instant getInitiatedAt() {
        return this.comboOrder.getInitiatedAt();
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public HistoryEvent.State getHistoryState() {
        return this.comboOrder.getHistoryState();
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public TransactionReference getTransactionReference() {
        return this.comboOrder.getTransactionReference();
    }

    public final List<UiComboOrderOptionLeg> getUiComboOrderOptionLegs() {
        ArrayList arrayList = new ArrayList();
        List<UiComboOrderLeg> list = this.legs;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (UiComboOrderLeg uiComboOrder2 : list) {
            if (uiComboOrder2.getLeg().getInstrumentType() == ApiComboOrder.InstrumentType.OPTION && uiComboOrder2.getOptionInstrument() != null) {
                OptionInstrument optionInstrument = uiComboOrder2.getOptionInstrument();
                OptionContractType contractType = uiComboOrder2.getOptionInstrument().getContractType();
                LocalDate expirationDate = uiComboOrder2.getOptionInstrument().getExpirationDate();
                OptionPositionType optionPositionTypeM2736of = OptionPositionType.INSTANCE.m2736of(uiComboOrder2.getLeg().getSide(), uiComboOrder2.getLeg().getPositionEffect());
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(uiComboOrder2.getLeg().getRatioQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                arrayList.add(new UiComboOrderOptionLeg(contractType, expirationDate, optionInstrument, optionPositionTypeM2736of, bigDecimalValueOf));
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return arrayList;
    }

    private final Instant getLastExecutionTimestamp() {
        return (Instant) this.lastExecutionTimestamp.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Instant lastExecutionTimestamp_delegate$lambda$10(UiComboOrder uiComboOrder) {
        return (Instant) SequencesKt.maxOrNull(SequencesKt.map(SequencesKt.flatMap(CollectionsKt.asSequence(uiComboOrder.legs), new Function1() { // from class: com.robinhood.android.options.combo.ui.UiComboOrder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiComboOrder.lastExecutionTimestamp_delegate$lambda$10$lambda$8((UiComboOrderLeg) obj);
            }
        }), new Function1() { // from class: com.robinhood.android.options.combo.ui.UiComboOrder$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiComboOrder.lastExecutionTimestamp_delegate$lambda$10$lambda$9((ComboOrderExecution) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence lastExecutionTimestamp_delegate$lambda$10$lambda$8(UiComboOrderLeg it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.asSequence(it.getExecutions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Instant lastExecutionTimestamp_delegate$lambda$10$lambda$9(ComboOrderExecution it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTimestamp();
    }

    public final Document getTradeConfirmation(List<Document> tradeConfirms) {
        Instant lastExecutionTimestamp = getLastExecutionTimestamp();
        Object obj = null;
        LocalDate localDate = lastExecutionTimestamp != null ? Instants.toLocalDate(lastExecutionTimestamp, ZoneIds.INSTANCE.getNEW_YORK()) : null;
        if (localDate == null || tradeConfirms == null) {
            return null;
        }
        Iterator<T> it = tradeConfirms.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(localDate, ((Document) next).getDate())) {
                obj = next;
                break;
            }
        }
        return (Document) obj;
    }

    public final BigDecimal getTotalExecutionPrice() {
        Sequence<Tuples3> sequenceFlatMapIterable = SequencesKt.flatMapIterable(CollectionsKt.asSequence(this.legs), new Function1() { // from class: com.robinhood.android.options.combo.ui.UiComboOrder$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiComboOrder.getTotalExecutionPrice$lambda$13((UiComboOrderLeg) obj);
            }
        });
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (Tuples3 tuples3 : sequenceFlatMapIterable) {
            BigDecimal bigDecimal = (BigDecimal) tuples3.component1();
            BigDecimal bigDecimal2 = (BigDecimal) tuples3.component2();
            OrderSide orderSide = (OrderSide) tuples3.component3();
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(orderSide.getDirection().getMultiplier());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        BigDecimal bigDecimalMultiply3 = bigDecimalValueOf.multiply(this.comboOrder.getDirection().getMultiplier());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        return bigDecimalMultiply3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable getTotalExecutionPrice$lambda$13(UiComboOrderLeg leg) {
        BigDecimal quantity;
        Intrinsics.checkNotNullParameter(leg, "leg");
        List<ComboOrderExecution> executions = leg.getExecutions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
        for (ComboOrderExecution comboOrder2 : executions) {
            if (leg.getLeg().getInstrumentType() == ApiComboOrder.InstrumentType.EQUITY) {
                quantity = new BigDecimal(1);
            } else {
                quantity = comboOrder2.getQuantity();
            }
            arrayList.add(new Tuples3(quantity, comboOrder2.getPrice(), leg.getLeg().getSide()));
        }
        return arrayList;
    }
}
