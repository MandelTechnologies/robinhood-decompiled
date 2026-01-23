package com.robinhood.android.equities.taxlots.alert;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.rosetta.eventlogging.Context;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategySummary;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsSelectionStrategyMaximumSelectedLotsKey.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0019\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bHÆ\u0003J9\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/alert/TaxLotsSelectionStrategyMaximumSelectedLotsKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "selectionStrategySummary", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "selectionStrategy", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "maxNumberOfTaxLots", "", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;Lequity_trading_tax_lots/proto/v1/SelectionStrategy;ILcom/robinhood/rosetta/eventlogging/Context;)V", "getSelectionStrategySummary", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "getSelectionStrategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "getMaxNumberOfTaxLots", "()I", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TaxLotsSelectionStrategyMaximumSelectedLotsKey implements DialogFragmentKey, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TaxLotsSelectionStrategyMaximumSelectedLotsKey> CREATOR = new Creator();
    private final Context eventContext;
    private final int maxNumberOfTaxLots;
    private final SelectionStrategy selectionStrategy;
    private final SelectionStrategySummary selectionStrategySummary;

    /* compiled from: TaxLotsSelectionStrategyMaximumSelectedLotsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<TaxLotsSelectionStrategyMaximumSelectedLotsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaxLotsSelectionStrategyMaximumSelectedLotsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxLotsSelectionStrategyMaximumSelectedLotsKey((SelectionStrategySummary) parcel.readSerializable(), SelectionStrategy.valueOf(parcel.readString()), parcel.readInt(), (Context) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TaxLotsSelectionStrategyMaximumSelectedLotsKey[] newArray(int i) {
            return new TaxLotsSelectionStrategyMaximumSelectedLotsKey[i];
        }
    }

    public static /* synthetic */ TaxLotsSelectionStrategyMaximumSelectedLotsKey copy$default(TaxLotsSelectionStrategyMaximumSelectedLotsKey taxLotsSelectionStrategyMaximumSelectedLotsKey, SelectionStrategySummary selectionStrategySummary, SelectionStrategy selectionStrategy, int i, Context context, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            selectionStrategySummary = taxLotsSelectionStrategyMaximumSelectedLotsKey.selectionStrategySummary;
        }
        if ((i2 & 2) != 0) {
            selectionStrategy = taxLotsSelectionStrategyMaximumSelectedLotsKey.selectionStrategy;
        }
        if ((i2 & 4) != 0) {
            i = taxLotsSelectionStrategyMaximumSelectedLotsKey.maxNumberOfTaxLots;
        }
        if ((i2 & 8) != 0) {
            context = taxLotsSelectionStrategyMaximumSelectedLotsKey.eventContext;
        }
        return taxLotsSelectionStrategyMaximumSelectedLotsKey.copy(selectionStrategySummary, selectionStrategy, i, context);
    }

    /* renamed from: component1, reason: from getter */
    public final SelectionStrategySummary getSelectionStrategySummary() {
        return this.selectionStrategySummary;
    }

    /* renamed from: component2, reason: from getter */
    public final SelectionStrategy getSelectionStrategy() {
        return this.selectionStrategy;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxNumberOfTaxLots() {
        return this.maxNumberOfTaxLots;
    }

    /* renamed from: component4, reason: from getter */
    public final Context getEventContext() {
        return this.eventContext;
    }

    public final TaxLotsSelectionStrategyMaximumSelectedLotsKey copy(SelectionStrategySummary selectionStrategySummary, SelectionStrategy selectionStrategy, int maxNumberOfTaxLots, Context eventContext) {
        Intrinsics.checkNotNullParameter(selectionStrategySummary, "selectionStrategySummary");
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        return new TaxLotsSelectionStrategyMaximumSelectedLotsKey(selectionStrategySummary, selectionStrategy, maxNumberOfTaxLots, eventContext);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotsSelectionStrategyMaximumSelectedLotsKey)) {
            return false;
        }
        TaxLotsSelectionStrategyMaximumSelectedLotsKey taxLotsSelectionStrategyMaximumSelectedLotsKey = (TaxLotsSelectionStrategyMaximumSelectedLotsKey) other;
        return Intrinsics.areEqual(this.selectionStrategySummary, taxLotsSelectionStrategyMaximumSelectedLotsKey.selectionStrategySummary) && this.selectionStrategy == taxLotsSelectionStrategyMaximumSelectedLotsKey.selectionStrategy && this.maxNumberOfTaxLots == taxLotsSelectionStrategyMaximumSelectedLotsKey.maxNumberOfTaxLots && Intrinsics.areEqual(this.eventContext, taxLotsSelectionStrategyMaximumSelectedLotsKey.eventContext);
    }

    public int hashCode() {
        int iHashCode = ((((this.selectionStrategySummary.hashCode() * 31) + this.selectionStrategy.hashCode()) * 31) + Integer.hashCode(this.maxNumberOfTaxLots)) * 31;
        Context context = this.eventContext;
        return iHashCode + (context == null ? 0 : context.hashCode());
    }

    public String toString() {
        return "TaxLotsSelectionStrategyMaximumSelectedLotsKey(selectionStrategySummary=" + this.selectionStrategySummary + ", selectionStrategy=" + this.selectionStrategy + ", maxNumberOfTaxLots=" + this.maxNumberOfTaxLots + ", eventContext=" + this.eventContext + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.selectionStrategySummary);
        dest.writeString(this.selectionStrategy.name());
        dest.writeInt(this.maxNumberOfTaxLots);
        dest.writeSerializable(this.eventContext);
    }

    public TaxLotsSelectionStrategyMaximumSelectedLotsKey(SelectionStrategySummary selectionStrategySummary, SelectionStrategy selectionStrategy, int i, Context context) {
        Intrinsics.checkNotNullParameter(selectionStrategySummary, "selectionStrategySummary");
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        this.selectionStrategySummary = selectionStrategySummary;
        this.selectionStrategy = selectionStrategy;
        this.maxNumberOfTaxLots = i;
        this.eventContext = context;
    }

    public /* synthetic */ TaxLotsSelectionStrategyMaximumSelectedLotsKey(SelectionStrategySummary selectionStrategySummary, SelectionStrategy selectionStrategy, int i, Context context, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(selectionStrategySummary, selectionStrategy, i, (i2 & 8) != 0 ? null : context);
    }

    public final SelectionStrategySummary getSelectionStrategySummary() {
        return this.selectionStrategySummary;
    }

    public final SelectionStrategy getSelectionStrategy() {
        return this.selectionStrategy;
    }

    public final int getMaxNumberOfTaxLots() {
        return this.maxNumberOfTaxLots;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }
}
