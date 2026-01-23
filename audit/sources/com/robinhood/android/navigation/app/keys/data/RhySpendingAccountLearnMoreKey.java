package com.robinhood.android.navigation.app.keys.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhySpendingAccountLearnMoreKey.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/RhySpendingAccountLearnMoreKey;", "Landroid/os/Parcelable;", "", "id", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;ILjava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "RHY_ONBOARDING", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class RhySpendingAccountLearnMoreKey implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhySpendingAccountLearnMoreKey[] $VALUES;
    public static final Parcelable.Creator<RhySpendingAccountLearnMoreKey> CREATOR;
    public static final RhySpendingAccountLearnMoreKey RHY_ONBOARDING;
    private final UUID id;

    private static final /* synthetic */ RhySpendingAccountLearnMoreKey[] $values() {
        return new RhySpendingAccountLearnMoreKey[]{RHY_ONBOARDING};
    }

    public static EnumEntries<RhySpendingAccountLearnMoreKey> getEntries() {
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

    private RhySpendingAccountLearnMoreKey(String str, int i, UUID uuid) {
        this.id = uuid;
    }

    public final UUID getId() {
        return this.id;
    }

    static {
        UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-00000000000");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        RHY_ONBOARDING = new RhySpendingAccountLearnMoreKey("RHY_ONBOARDING", 0, uuidFromString);
        RhySpendingAccountLearnMoreKey[] rhySpendingAccountLearnMoreKeyArr$values = $values();
        $VALUES = rhySpendingAccountLearnMoreKeyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhySpendingAccountLearnMoreKeyArr$values);
        CREATOR = new Parcelable.Creator<RhySpendingAccountLearnMoreKey>() { // from class: com.robinhood.android.navigation.app.keys.data.RhySpendingAccountLearnMoreKey.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhySpendingAccountLearnMoreKey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return RhySpendingAccountLearnMoreKey.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RhySpendingAccountLearnMoreKey[] newArray(int i) {
                return new RhySpendingAccountLearnMoreKey[i];
            }
        };
    }

    public static RhySpendingAccountLearnMoreKey valueOf(String str) {
        return (RhySpendingAccountLearnMoreKey) Enum.valueOf(RhySpendingAccountLearnMoreKey.class, str);
    }

    public static RhySpendingAccountLearnMoreKey[] values() {
        return (RhySpendingAccountLearnMoreKey[]) $VALUES.clone();
    }
}
