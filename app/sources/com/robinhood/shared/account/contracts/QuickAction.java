package com.robinhood.shared.account.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNavigationTabFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/QuickAction;", "Landroid/os/Parcelable;", "actionName", "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(ILcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getActionName", "()I", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class QuickAction implements Parcelable {
    public static final Parcelable.Creator<QuickAction> CREATOR = new Creator();
    private final int actionName;
    private final ServerToBentoAssetMapper2 icon;
    private final FragmentKey key;

    /* compiled from: AccountNavigationTabFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<QuickAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuickAction(parcel.readInt(), ServerToBentoAssetMapper2.valueOf(parcel.readString()), (FragmentKey) parcel.readParcelable(QuickAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickAction[] newArray(int i) {
            return new QuickAction[i];
        }
    }

    public static /* synthetic */ QuickAction copy$default(QuickAction quickAction, int i, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, FragmentKey fragmentKey, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = quickAction.actionName;
        }
        if ((i2 & 2) != 0) {
            serverToBentoAssetMapper2 = quickAction.icon;
        }
        if ((i2 & 4) != 0) {
            fragmentKey = quickAction.key;
        }
        return quickAction.copy(i, serverToBentoAssetMapper2, fragmentKey);
    }

    /* renamed from: component1, reason: from getter */
    public final int getActionName() {
        return this.actionName;
    }

    /* renamed from: component2, reason: from getter */
    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final FragmentKey getKey() {
        return this.key;
    }

    public final QuickAction copy(int actionName, ServerToBentoAssetMapper2 icon, FragmentKey key) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(key, "key");
        return new QuickAction(actionName, icon, key);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickAction)) {
            return false;
        }
        QuickAction quickAction = (QuickAction) other;
        return this.actionName == quickAction.actionName && this.icon == quickAction.icon && Intrinsics.areEqual(this.key, quickAction.key);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.actionName) * 31) + this.icon.hashCode()) * 31) + this.key.hashCode();
    }

    public String toString() {
        return "QuickAction(actionName=" + this.actionName + ", icon=" + this.icon + ", key=" + this.key + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.actionName);
        dest.writeString(this.icon.name());
        dest.writeParcelable(this.key, flags);
    }

    public QuickAction(int i, ServerToBentoAssetMapper2 icon, FragmentKey key) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(key, "key");
        this.actionName = i;
        this.icon = icon;
        this.key = key;
    }

    public final int getActionName() {
        return this.actionName;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    public final FragmentKey getKey() {
        return this.key;
    }
}
