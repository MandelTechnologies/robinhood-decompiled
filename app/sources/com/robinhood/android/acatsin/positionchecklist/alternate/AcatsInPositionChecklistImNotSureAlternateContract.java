package com.robinhood.android.acatsin.positionchecklist.alternate;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.utils.Either;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPositionChecklistImNotSureAlternateContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateContract;", "", "<init>", "()V", "Key", "Callbacks", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPositionChecklistImNotSureAlternateContract {
    public static final int $stable = 0;
    public static final AcatsInPositionChecklistImNotSureAlternateContract INSTANCE = new AcatsInPositionChecklistImNotSureAlternateContract();

    /* compiled from: AcatsInPositionChecklistImNotSureAlternateContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateContract$Callbacks;", "", "onFullTransferSelected", "", "onPartialTransferSelected", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFullTransferSelected();

        void onPartialTransferSelected();
    }

    private AcatsInPositionChecklistImNotSureAlternateContract() {
    }

    /* compiled from: AcatsInPositionChecklistImNotSureAlternateContract.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/acatsin/positionchecklist/alternate/AcatsInPositionChecklistImNotSureAlternateContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "screenContext", "Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "brokerageOrDtcNumber", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "unsupportedContents", "", "<init>", "(Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;Lcom/robinhood/utils/Either;Ljava/util/List;)V", "getScreenContext", "()Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "getBrokerageOrDtcNumber", "()Lcom/robinhood/utils/Either;", "getUnsupportedContents", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final Either<ApiBrokerage, String> brokerageOrDtcNumber;
        private final AcatsInScreenContext screenContext;
        private final List<String> unsupportedContents;

        /* compiled from: AcatsInPositionChecklistImNotSureAlternateContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((AcatsInScreenContext) parcel.readParcelable(Key.class.getClassLoader()), EitherParceler.INSTANCE.m23663create(parcel), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Key copy$default(Key key, AcatsInScreenContext acatsInScreenContext, Either either, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsInScreenContext = key.screenContext;
            }
            if ((i & 2) != 0) {
                either = key.brokerageOrDtcNumber;
            }
            if ((i & 4) != 0) {
                list = key.unsupportedContents;
            }
            return key.copy(acatsInScreenContext, either, list);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> component2() {
            return this.brokerageOrDtcNumber;
        }

        public final List<String> component3() {
            return this.unsupportedContents;
        }

        public final Key copy(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, List<String> unsupportedContents) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            return new Key(screenContext, brokerageOrDtcNumber, unsupportedContents);
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
            return Intrinsics.areEqual(this.screenContext, key.screenContext) && Intrinsics.areEqual(this.brokerageOrDtcNumber, key.brokerageOrDtcNumber) && Intrinsics.areEqual(this.unsupportedContents, key.unsupportedContents);
        }

        public int hashCode() {
            int iHashCode = ((this.screenContext.hashCode() * 31) + this.brokerageOrDtcNumber.hashCode()) * 31;
            List<String> list = this.unsupportedContents;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Key(screenContext=" + this.screenContext + ", brokerageOrDtcNumber=" + this.brokerageOrDtcNumber + ", unsupportedContents=" + this.unsupportedContents + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.screenContext, flags);
            EitherParceler.INSTANCE.write((Either<?, ?>) this.brokerageOrDtcNumber, dest, flags);
            dest.writeStringList(this.unsupportedContents);
        }

        public Key(AcatsInScreenContext screenContext, Either<ApiBrokerage, String> brokerageOrDtcNumber, List<String> list) {
            Intrinsics.checkNotNullParameter(screenContext, "screenContext");
            Intrinsics.checkNotNullParameter(brokerageOrDtcNumber, "brokerageOrDtcNumber");
            this.screenContext = screenContext;
            this.brokerageOrDtcNumber = brokerageOrDtcNumber;
            this.unsupportedContents = list;
        }

        public final AcatsInScreenContext getScreenContext() {
            return this.screenContext;
        }

        public final Either<ApiBrokerage, String> getBrokerageOrDtcNumber() {
            return this.brokerageOrDtcNumber;
        }

        public final List<String> getUnsupportedContents() {
            return this.unsupportedContents;
        }
    }
}
