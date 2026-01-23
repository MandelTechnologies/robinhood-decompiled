package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSettingsIntentKey.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldSettingsIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "showInTab", "", "skipGoldCheck", "scrollTarget", "Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "<init>", "(ZZLcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;)V", "getShowInTab", "()Z", "getSkipGoldCheck", "getScrollTarget", "()Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldSettingsIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<GoldSettingsIntentKey> CREATOR = new Creator();
    private final GoldHubSettingsComponentTargetType scrollTarget;
    private final boolean showInTab;
    private final boolean skipGoldCheck;

    /* compiled from: GoldSettingsIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<GoldSettingsIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSettingsIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldSettingsIntentKey(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : GoldHubSettingsComponentTargetType.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSettingsIntentKey[] newArray(int i) {
            return new GoldSettingsIntentKey[i];
        }
    }

    public GoldSettingsIntentKey() {
        this(false, false, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.showInTab ? 1 : 0);
        dest.writeInt(this.skipGoldCheck ? 1 : 0);
        GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType = this.scrollTarget;
        if (goldHubSettingsComponentTargetType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            goldHubSettingsComponentTargetType.writeToParcel(dest, flags);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public GoldSettingsIntentKey(boolean z, boolean z2, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType) {
        this.showInTab = z;
        this.skipGoldCheck = z2;
        this.scrollTarget = goldHubSettingsComponentTargetType;
    }

    public /* synthetic */ GoldSettingsIntentKey(boolean z, boolean z2, GoldHubSettingsComponentTargetType goldHubSettingsComponentTargetType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : goldHubSettingsComponentTargetType);
    }

    public final boolean getShowInTab() {
        return this.showInTab;
    }

    public final boolean getSkipGoldCheck() {
        return this.skipGoldCheck;
    }

    public final GoldHubSettingsComponentTargetType getScrollTarget() {
        return this.scrollTarget;
    }
}
