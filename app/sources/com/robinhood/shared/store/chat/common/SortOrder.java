package com.robinhood.shared.store.chat.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SortOrder.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/store/chat/common/SortOrder;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ASCENDING_CREATED_TIME", "DESCENDING_CREATED_TIME", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-store-chat-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SortOrder implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SortOrder[] $VALUES;
    public static final Parcelable.Creator<SortOrder> CREATOR;
    public static final SortOrder ASCENDING_CREATED_TIME = new SortOrder("ASCENDING_CREATED_TIME", 0);
    public static final SortOrder DESCENDING_CREATED_TIME = new SortOrder("DESCENDING_CREATED_TIME", 1);

    private static final /* synthetic */ SortOrder[] $values() {
        return new SortOrder[]{ASCENDING_CREATED_TIME, DESCENDING_CREATED_TIME};
    }

    public static EnumEntries<SortOrder> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private SortOrder(String str, int i) {
    }

    static {
        SortOrder[] sortOrderArr$values = $values();
        $VALUES = sortOrderArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sortOrderArr$values);
        CREATOR = new Parcelable.Creator<SortOrder>() { // from class: com.robinhood.shared.store.chat.common.SortOrder.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SortOrder createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return SortOrder.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SortOrder[] newArray(int i) {
                return new SortOrder[i];
            }
        };
    }

    public static SortOrder valueOf(String str) {
        return (SortOrder) Enum.valueOf(SortOrder.class, str);
    }

    public static SortOrder[] values() {
        return (SortOrder[]) $VALUES.clone();
    }
}
