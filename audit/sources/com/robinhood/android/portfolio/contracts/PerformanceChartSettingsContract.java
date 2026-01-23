package com.robinhood.android.portfolio.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceChartSettingsContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/PerformanceChartSettingsContract;", "", "Key", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface PerformanceChartSettingsContract {

    /* compiled from: PerformanceChartSettingsContract.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/PerformanceChartSettingsContract$Key;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "accountNumber", "", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "allowReturnsComparisons", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Z)V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getAccountNumber", "()Ljava/lang/String;", "getChartType", "()Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "getAllowReturnsComparisons", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements DialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean allowReturnsComparisons;
        private final PerformanceChartType chartType;
        private final Screen screen;

        /* compiled from: PerformanceChartSettingsContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((Screen) parcel.readSerializable(), parcel.readString(), PerformanceChartType.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, Screen screen, String str, PerformanceChartType performanceChartType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                screen = key.screen;
            }
            if ((i & 2) != 0) {
                str = key.accountNumber;
            }
            if ((i & 4) != 0) {
                performanceChartType = key.chartType;
            }
            if ((i & 8) != 0) {
                z = key.allowReturnsComparisons;
            }
            return key.copy(screen, str, performanceChartType, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Screen getScreen() {
            return this.screen;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final PerformanceChartType getChartType() {
            return this.chartType;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAllowReturnsComparisons() {
            return this.allowReturnsComparisons;
        }

        public final Key copy(Screen screen, String accountNumber, PerformanceChartType chartType, boolean allowReturnsComparisons) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            return new Key(screen, accountNumber, chartType, allowReturnsComparisons);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.screen, key.screen) && Intrinsics.areEqual(this.accountNumber, key.accountNumber) && this.chartType == key.chartType && this.allowReturnsComparisons == key.allowReturnsComparisons;
        }

        public int hashCode() {
            return (((((this.screen.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.chartType.hashCode()) * 31) + Boolean.hashCode(this.allowReturnsComparisons);
        }

        public String toString() {
            return "Key(screen=" + this.screen + ", accountNumber=" + this.accountNumber + ", chartType=" + this.chartType + ", allowReturnsComparisons=" + this.allowReturnsComparisons + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.screen);
            dest.writeString(this.accountNumber);
            dest.writeString(this.chartType.name());
            dest.writeInt(this.allowReturnsComparisons ? 1 : 0);
        }

        public Key(Screen screen, String accountNumber, PerformanceChartType chartType, boolean z) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            this.screen = screen;
            this.accountNumber = accountNumber;
            this.chartType = chartType;
            this.allowReturnsComparisons = z;
        }

        public /* synthetic */ Key(Screen screen, String str, PerformanceChartType performanceChartType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(screen, str, performanceChartType, (i & 8) != 0 ? true : z);
        }

        public final Screen getScreen() {
            return this.screen;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final PerformanceChartType getChartType() {
            return this.chartType;
        }

        public final boolean getAllowReturnsComparisons() {
            return this.allowReturnsComparisons;
        }
    }
}
