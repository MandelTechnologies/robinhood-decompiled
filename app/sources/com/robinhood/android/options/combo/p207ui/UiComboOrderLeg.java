package com.robinhood.android.options.combo.p207ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.options.combo.p206db.ComboOrderExecution;
import com.robinhood.android.options.combo.p206db.ComboOrderLeg;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionInstrument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiComboOrder.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/options/combo/ui/UiComboOrderLeg;", "Landroid/os/Parcelable;", "leg", "Lcom/robinhood/android/options/combo/db/ComboOrderLeg;", "executions", "", "Lcom/robinhood/android/options/combo/db/ComboOrderExecution;", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Lcom/robinhood/android/options/combo/db/ComboOrderLeg;Ljava/util/List;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/Instrument;)V", "getLeg", "()Lcom/robinhood/android/options/combo/db/ComboOrderLeg;", "getExecutions", "()Ljava/util/List;", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UiComboOrderLeg implements Parcelable {
    public static final Parcelable.Creator<UiComboOrderLeg> CREATOR = new Creator();
    private final List<ComboOrderExecution> executions;
    private final Instrument instrument;
    private final ComboOrderLeg leg;
    private final OptionInstrument optionInstrument;

    /* compiled from: UiComboOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiComboOrderLeg> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiComboOrderLeg createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ComboOrderLeg comboOrderLegCreateFromParcel = ComboOrderLeg.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ComboOrderExecution.CREATOR.createFromParcel(parcel));
            }
            return new UiComboOrderLeg(comboOrderLegCreateFromParcel, arrayList, (OptionInstrument) parcel.readParcelable(UiComboOrderLeg.class.getClassLoader()), (Instrument) parcel.readParcelable(UiComboOrderLeg.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiComboOrderLeg[] newArray(int i) {
            return new UiComboOrderLeg[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiComboOrderLeg copy$default(UiComboOrderLeg uiComboOrderLeg, ComboOrderLeg comboOrderLeg, List list, OptionInstrument optionInstrument, Instrument instrument, int i, Object obj) {
        if ((i & 1) != 0) {
            comboOrderLeg = uiComboOrderLeg.leg;
        }
        if ((i & 2) != 0) {
            list = uiComboOrderLeg.executions;
        }
        if ((i & 4) != 0) {
            optionInstrument = uiComboOrderLeg.optionInstrument;
        }
        if ((i & 8) != 0) {
            instrument = uiComboOrderLeg.instrument;
        }
        return uiComboOrderLeg.copy(comboOrderLeg, list, optionInstrument, instrument);
    }

    /* renamed from: component1, reason: from getter */
    public final ComboOrderLeg getLeg() {
        return this.leg;
    }

    public final List<ComboOrderExecution> component2() {
        return this.executions;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    /* renamed from: component4, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final UiComboOrderLeg copy(ComboOrderLeg leg, List<ComboOrderExecution> executions, OptionInstrument optionInstrument, Instrument instrument) {
        Intrinsics.checkNotNullParameter(leg, "leg");
        Intrinsics.checkNotNullParameter(executions, "executions");
        return new UiComboOrderLeg(leg, executions, optionInstrument, instrument);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiComboOrderLeg)) {
            return false;
        }
        UiComboOrderLeg uiComboOrderLeg = (UiComboOrderLeg) other;
        return Intrinsics.areEqual(this.leg, uiComboOrderLeg.leg) && Intrinsics.areEqual(this.executions, uiComboOrderLeg.executions) && Intrinsics.areEqual(this.optionInstrument, uiComboOrderLeg.optionInstrument) && Intrinsics.areEqual(this.instrument, uiComboOrderLeg.instrument);
    }

    public int hashCode() {
        int iHashCode = ((this.leg.hashCode() * 31) + this.executions.hashCode()) * 31;
        OptionInstrument optionInstrument = this.optionInstrument;
        int iHashCode2 = (iHashCode + (optionInstrument == null ? 0 : optionInstrument.hashCode())) * 31;
        Instrument instrument = this.instrument;
        return iHashCode2 + (instrument != null ? instrument.hashCode() : 0);
    }

    public String toString() {
        return "UiComboOrderLeg(leg=" + this.leg + ", executions=" + this.executions + ", optionInstrument=" + this.optionInstrument + ", instrument=" + this.instrument + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.leg.writeToParcel(dest, flags);
        List<ComboOrderExecution> list = this.executions;
        dest.writeInt(list.size());
        Iterator<ComboOrderExecution> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.optionInstrument, flags);
        dest.writeParcelable(this.instrument, flags);
    }

    public UiComboOrderLeg(ComboOrderLeg leg, List<ComboOrderExecution> executions, OptionInstrument optionInstrument, Instrument instrument) {
        Intrinsics.checkNotNullParameter(leg, "leg");
        Intrinsics.checkNotNullParameter(executions, "executions");
        this.leg = leg;
        this.executions = executions;
        this.optionInstrument = optionInstrument;
        this.instrument = instrument;
    }

    public final ComboOrderLeg getLeg() {
        return this.leg;
    }

    public final List<ComboOrderExecution> getExecutions() {
        return this.executions;
    }

    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }
}
