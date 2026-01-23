package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionEditLegRatioFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionEditLegRatioFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "optionOrderIntentKeyWithBundle", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;)V", "getOptionOrderIntentKeyWithBundle", "()Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionEditLegRatioFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<OptionEditLegRatioFragmentKey> CREATOR = new Creator();
    private final OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKeyWithBundle;

    /* compiled from: OptionEditLegRatioFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionEditLegRatioFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionEditLegRatioFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionEditLegRatioFragmentKey(OptionOrderIntentKey.FromOptionOrderBundle.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionEditLegRatioFragmentKey[] newArray(int i) {
            return new OptionEditLegRatioFragmentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.optionOrderIntentKeyWithBundle.writeToParcel(dest, flags);
    }

    public OptionEditLegRatioFragmentKey(OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKeyWithBundle) {
        Intrinsics.checkNotNullParameter(optionOrderIntentKeyWithBundle, "optionOrderIntentKeyWithBundle");
        this.optionOrderIntentKeyWithBundle = optionOrderIntentKeyWithBundle;
    }

    public final OptionOrderIntentKey.FromOptionOrderBundle getOptionOrderIntentKeyWithBundle() {
        return this.optionOrderIntentKeyWithBundle;
    }
}
