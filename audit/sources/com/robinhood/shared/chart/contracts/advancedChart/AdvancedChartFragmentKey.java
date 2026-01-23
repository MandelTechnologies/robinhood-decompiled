package com.robinhood.shared.chart.contracts.advancedChart;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00013BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003JM\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020(HÖ\u0001J\t\u0010-\u001a\u00020\u000bHÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "instrumentId", "Ljava/util/UUID;", "instrument", "Lcom/robinhood/models/db/Instrument;", "graphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "backToStockDetailPage", "", "accountNumber", "", "alertArgs", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartFragmentKey$AlertArgs;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/ui/GraphSelection;ZLjava/lang/String;Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartFragmentKey$AlertArgs;)V", "getInstrumentId", "()Ljava/util/UUID;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getGraphSelection", "()Lcom/robinhood/models/ui/GraphSelection;", "getBackToStockDetailPage", "()Z", "getAccountNumber", "()Ljava/lang/String;", "getAlertArgs", "()Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartFragmentKey$AlertArgs;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AlertArgs", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class AdvancedChartFragmentKey implements TabFragmentKey {
    public static final Parcelable.Creator<AdvancedChartFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final AlertArgs alertArgs;
    private final boolean backToStockDetailPage;
    private final GraphSelection graphSelection;
    private final Instrument instrument;
    private final UUID instrumentId;

    /* compiled from: AdvancedChartFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<AdvancedChartFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedChartFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvancedChartFragmentKey((UUID) parcel.readSerializable(), (Instrument) parcel.readParcelable(AdvancedChartFragmentKey.class.getClassLoader()), parcel.readInt() == 0 ? null : GraphSelection.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? AlertArgs.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedChartFragmentKey[] newArray(int i) {
            return new AdvancedChartFragmentKey[i];
        }
    }

    public static /* synthetic */ AdvancedChartFragmentKey copy$default(AdvancedChartFragmentKey advancedChartFragmentKey, UUID uuid, Instrument instrument, GraphSelection graphSelection, boolean z, String str, AlertArgs alertArgs, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = advancedChartFragmentKey.instrumentId;
        }
        if ((i & 2) != 0) {
            instrument = advancedChartFragmentKey.instrument;
        }
        if ((i & 4) != 0) {
            graphSelection = advancedChartFragmentKey.graphSelection;
        }
        if ((i & 8) != 0) {
            z = advancedChartFragmentKey.backToStockDetailPage;
        }
        if ((i & 16) != 0) {
            str = advancedChartFragmentKey.accountNumber;
        }
        if ((i & 32) != 0) {
            alertArgs = advancedChartFragmentKey.alertArgs;
        }
        String str2 = str;
        AlertArgs alertArgs2 = alertArgs;
        return advancedChartFragmentKey.copy(uuid, instrument, graphSelection, z, str2, alertArgs2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component3, reason: from getter */
    public final GraphSelection getGraphSelection() {
        return this.graphSelection;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getBackToStockDetailPage() {
        return this.backToStockDetailPage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final AlertArgs getAlertArgs() {
        return this.alertArgs;
    }

    public final AdvancedChartFragmentKey copy(UUID instrumentId, Instrument instrument, GraphSelection graphSelection, boolean backToStockDetailPage, String accountNumber, AlertArgs alertArgs) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new AdvancedChartFragmentKey(instrumentId, instrument, graphSelection, backToStockDetailPage, accountNumber, alertArgs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedChartFragmentKey)) {
            return false;
        }
        AdvancedChartFragmentKey advancedChartFragmentKey = (AdvancedChartFragmentKey) other;
        return Intrinsics.areEqual(this.instrumentId, advancedChartFragmentKey.instrumentId) && Intrinsics.areEqual(this.instrument, advancedChartFragmentKey.instrument) && this.graphSelection == advancedChartFragmentKey.graphSelection && this.backToStockDetailPage == advancedChartFragmentKey.backToStockDetailPage && Intrinsics.areEqual(this.accountNumber, advancedChartFragmentKey.accountNumber) && Intrinsics.areEqual(this.alertArgs, advancedChartFragmentKey.alertArgs);
    }

    public int hashCode() {
        int iHashCode = this.instrumentId.hashCode() * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31;
        GraphSelection graphSelection = this.graphSelection;
        int iHashCode3 = (((iHashCode2 + (graphSelection == null ? 0 : graphSelection.hashCode())) * 31) + Boolean.hashCode(this.backToStockDetailPage)) * 31;
        String str = this.accountNumber;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        AlertArgs alertArgs = this.alertArgs;
        return iHashCode4 + (alertArgs != null ? alertArgs.hashCode() : 0);
    }

    public String toString() {
        return "AdvancedChartFragmentKey(instrumentId=" + this.instrumentId + ", instrument=" + this.instrument + ", graphSelection=" + this.graphSelection + ", backToStockDetailPage=" + this.backToStockDetailPage + ", accountNumber=" + this.accountNumber + ", alertArgs=" + this.alertArgs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.instrumentId);
        dest.writeParcelable(this.instrument, flags);
        GraphSelection graphSelection = this.graphSelection;
        if (graphSelection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(graphSelection.name());
        }
        dest.writeInt(this.backToStockDetailPage ? 1 : 0);
        dest.writeString(this.accountNumber);
        AlertArgs alertArgs = this.alertArgs;
        if (alertArgs == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            alertArgs.writeToParcel(dest, flags);
        }
    }

    public AdvancedChartFragmentKey(UUID instrumentId, Instrument instrument, GraphSelection graphSelection, boolean z, String str, AlertArgs alertArgs) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.instrumentId = instrumentId;
        this.instrument = instrument;
        this.graphSelection = graphSelection;
        this.backToStockDetailPage = z;
        this.accountNumber = str;
        this.alertArgs = alertArgs;
    }

    public /* synthetic */ AdvancedChartFragmentKey(UUID uuid, Instrument instrument, GraphSelection graphSelection, boolean z, String str, AlertArgs alertArgs, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, instrument, (i & 4) != 0 ? null : graphSelection, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : alertArgs);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final GraphSelection getGraphSelection() {
        return this.graphSelection;
    }

    public final boolean getBackToStockDetailPage() {
        return this.backToStockDetailPage;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final AlertArgs getAlertArgs() {
        return this.alertArgs;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.HOME;
    }

    /* compiled from: AdvancedChartFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartFragmentKey$AlertArgs;", "Landroid/os/Parcelable;", "chartSpan", "Lcom/robinhood/models/ui/Historical$Span;", "hideExtendedHours", "", "source", "", "selectedIndicators", "", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "<init>", "(Lcom/robinhood/models/ui/Historical$Span;ZLjava/lang/String;Ljava/util/List;)V", "getChartSpan", "()Lcom/robinhood/models/ui/Historical$Span;", "getHideExtendedHours", "()Z", "getSource", "()Ljava/lang/String;", "getSelectedIndicators", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final /* data */ class AlertArgs implements Parcelable {
        public static final Parcelable.Creator<AlertArgs> CREATOR = new Creator();
        private final Historical.Span chartSpan;
        private final boolean hideExtendedHours;
        private final List<ApiTechnicalIndicator> selectedIndicators;
        private final String source;

        /* compiled from: AdvancedChartFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AlertArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AlertArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ArrayList arrayList = null;
                Historical.Span spanValueOf = parcel.readInt() == 0 ? null : Historical.Span.valueOf(parcel.readString());
                boolean z = parcel.readInt() != 0;
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(parcel.readParcelable(AlertArgs.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new AlertArgs(spanValueOf, z, string2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AlertArgs[] newArray(int i) {
                return new AlertArgs[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AlertArgs copy$default(AlertArgs alertArgs, Historical.Span span, boolean z, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                span = alertArgs.chartSpan;
            }
            if ((i & 2) != 0) {
                z = alertArgs.hideExtendedHours;
            }
            if ((i & 4) != 0) {
                str = alertArgs.source;
            }
            if ((i & 8) != 0) {
                list = alertArgs.selectedIndicators;
            }
            return alertArgs.copy(span, z, str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final Historical.Span getChartSpan() {
            return this.chartSpan;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHideExtendedHours() {
            return this.hideExtendedHours;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final List<ApiTechnicalIndicator> component4() {
            return this.selectedIndicators;
        }

        public final AlertArgs copy(Historical.Span chartSpan, boolean hideExtendedHours, String source, List<? extends ApiTechnicalIndicator> selectedIndicators) {
            return new AlertArgs(chartSpan, hideExtendedHours, source, selectedIndicators);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertArgs)) {
                return false;
            }
            AlertArgs alertArgs = (AlertArgs) other;
            return this.chartSpan == alertArgs.chartSpan && this.hideExtendedHours == alertArgs.hideExtendedHours && Intrinsics.areEqual(this.source, alertArgs.source) && Intrinsics.areEqual(this.selectedIndicators, alertArgs.selectedIndicators);
        }

        public int hashCode() {
            Historical.Span span = this.chartSpan;
            int iHashCode = (((span == null ? 0 : span.hashCode()) * 31) + Boolean.hashCode(this.hideExtendedHours)) * 31;
            String str = this.source;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<ApiTechnicalIndicator> list = this.selectedIndicators;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "AlertArgs(chartSpan=" + this.chartSpan + ", hideExtendedHours=" + this.hideExtendedHours + ", source=" + this.source + ", selectedIndicators=" + this.selectedIndicators + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Historical.Span span = this.chartSpan;
            if (span == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(span.name());
            }
            dest.writeInt(this.hideExtendedHours ? 1 : 0);
            dest.writeString(this.source);
            List<ApiTechnicalIndicator> list = this.selectedIndicators;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<ApiTechnicalIndicator> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AlertArgs(Historical.Span span, boolean z, String str, List<? extends ApiTechnicalIndicator> list) {
            this.chartSpan = span;
            this.hideExtendedHours = z;
            this.source = str;
            this.selectedIndicators = list;
        }

        public /* synthetic */ AlertArgs(Historical.Span span, boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(span, (i & 2) != 0 ? false : z, str, (i & 8) != 0 ? null : list);
        }

        public final Historical.Span getChartSpan() {
            return this.chartSpan;
        }

        public final boolean getHideExtendedHours() {
            return this.hideExtendedHours;
        }

        public final String getSource() {
            return this.source;
        }

        public final List<ApiTechnicalIndicator> getSelectedIndicators() {
            return this.selectedIndicators;
        }
    }
}
