package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.utils.logging.CrashReporter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GoldHubSettingsComponentTargetType.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "Landroid/os/Parcelable;", "", "deeplinkValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDeeplinkValue", "()Ljava/lang/String;", "GOLD_BILLING_COMPONENT", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.contracts.GoldHubSettingsComponentScrollTarget, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldHubSettingsComponentTargetType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GoldHubSettingsComponentTargetType[] $VALUES;
    public static final Parcelable.Creator<GoldHubSettingsComponentTargetType> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final GoldHubSettingsComponentTargetType GOLD_BILLING_COMPONENT = new GoldHubSettingsComponentTargetType("GOLD_BILLING_COMPONENT", 0, "billing_payment_method");
    private final String deeplinkValue;

    private static final /* synthetic */ GoldHubSettingsComponentTargetType[] $values() {
        return new GoldHubSettingsComponentTargetType[]{GOLD_BILLING_COMPONENT};
    }

    public static EnumEntries<GoldHubSettingsComponentTargetType> getEntries() {
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

    private GoldHubSettingsComponentTargetType(String str, int i, String str2) {
        this.deeplinkValue = str2;
    }

    public final String getDeeplinkValue() {
        return this.deeplinkValue;
    }

    static {
        GoldHubSettingsComponentTargetType[] goldHubSettingsComponentTargetTypeArr$values = $values();
        $VALUES = goldHubSettingsComponentTargetTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(goldHubSettingsComponentTargetTypeArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<GoldHubSettingsComponentTargetType>() { // from class: com.robinhood.android.gold.contracts.GoldHubSettingsComponentScrollTarget.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoldHubSettingsComponentTargetType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return GoldHubSettingsComponentTargetType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoldHubSettingsComponentTargetType[] newArray(int i) {
                return new GoldHubSettingsComponentTargetType[i];
            }
        };
    }

    /* compiled from: GoldHubSettingsComponentTargetType.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget$Companion;", "", "<init>", "()V", "getComponentFromValue", "Lcom/robinhood/android/gold/contracts/GoldHubSettingsComponentScrollTarget;", "deeplinkValue", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.contracts.GoldHubSettingsComponentScrollTarget$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GoldHubSettingsComponentTargetType getComponentFromValue(String deeplinkValue) {
            GoldHubSettingsComponentTargetType next;
            if (deeplinkValue == null) {
                return null;
            }
            try {
                Iterator<GoldHubSettingsComponentTargetType> it = GoldHubSettingsComponentTargetType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getDeeplinkValue(), deeplinkValue)) {
                        break;
                    }
                }
                return next;
            } catch (Exception e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
                return null;
            }
        }
    }

    public static GoldHubSettingsComponentTargetType valueOf(String str) {
        return (GoldHubSettingsComponentTargetType) Enum.valueOf(GoldHubSettingsComponentTargetType.class, str);
    }

    public static GoldHubSettingsComponentTargetType[] values() {
        return (GoldHubSettingsComponentTargetType[]) $VALUES.clone();
    }
}
