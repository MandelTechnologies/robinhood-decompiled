package com.robinhood.android.equities.contracts.screeners;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.equityscreener.models.api.ScreenerOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateScreenerContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/screeners/CreateScreenerContract;", "", "<init>", "()V", "Key", "Callbacks", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class CreateScreenerContract {
    public static final CreateScreenerContract INSTANCE = new CreateScreenerContract();

    /* compiled from: CreateScreenerContract.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/screeners/CreateScreenerContract$Callbacks;", "", "onPresetSelected", "", "screenerId", "", "onCreateScreenerFromPreset", "onCreateCanceled", "onPresetBack", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCreateCanceled();

        void onCreateScreenerFromPreset(String screenerId);

        void onPresetBack();

        void onPresetSelected(String screenerId);
    }

    private CreateScreenerContract() {
    }

    /* compiled from: CreateScreenerContract.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/screeners/CreateScreenerContract$Key;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "screenerOrder", "Lcom/robinhood/equityscreener/models/api/ScreenerOrder;", "<init>", "(Lcom/robinhood/equityscreener/models/api/ScreenerOrder;)V", "getScreenerOrder", "()Lcom/robinhood/equityscreener/models/api/ScreenerOrder;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements DialogFragmentKey, Parcelable {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final ScreenerOrder screenerOrder;

        /* compiled from: CreateScreenerContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key(ScreenerOrder.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Key() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Key copy$default(Key key, ScreenerOrder screenerOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                screenerOrder = key.screenerOrder;
            }
            return key.copy(screenerOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final ScreenerOrder getScreenerOrder() {
            return this.screenerOrder;
        }

        public final Key copy(ScreenerOrder screenerOrder) {
            Intrinsics.checkNotNullParameter(screenerOrder, "screenerOrder");
            return new Key(screenerOrder);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Key) && this.screenerOrder == ((Key) other).screenerOrder;
        }

        public int hashCode() {
            return this.screenerOrder.hashCode();
        }

        public String toString() {
            return "Key(screenerOrder=" + this.screenerOrder + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.screenerOrder.name());
        }

        public Key(ScreenerOrder screenerOrder) {
            Intrinsics.checkNotNullParameter(screenerOrder, "screenerOrder");
            this.screenerOrder = screenerOrder;
        }

        public /* synthetic */ Key(ScreenerOrder screenerOrder, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ScreenerOrder.DEFAULT : screenerOrder);
        }

        public final ScreenerOrder getScreenerOrder() {
            return this.screenerOrder;
        }
    }
}
