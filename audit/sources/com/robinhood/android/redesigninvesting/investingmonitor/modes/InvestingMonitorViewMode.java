package com.robinhood.android.redesigninvesting.investingmonitor.modes;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvestingMonitorViewMode.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/modes/InvestingMonitorViewMode;", "Landroid/os/Parcelable;", "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Ljava/lang/String;ILcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "HEAT_MAP", "LIST", "GRID", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestingMonitorViewMode implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestingMonitorViewMode[] $VALUES;
    public static final Parcelable.Creator<InvestingMonitorViewMode> CREATOR;
    private final ServerToBentoAssetMapper2 icon;
    public static final InvestingMonitorViewMode HEAT_MAP = new InvestingMonitorViewMode("HEAT_MAP", 0, ServerToBentoAssetMapper2.TAB_CRYPTO_32);
    public static final InvestingMonitorViewMode LIST = new InvestingMonitorViewMode("LIST", 1, ServerToBentoAssetMapper2.LIST_24);
    public static final InvestingMonitorViewMode GRID = new InvestingMonitorViewMode("GRID", 2, ServerToBentoAssetMapper2.BANKING_24);

    private static final /* synthetic */ InvestingMonitorViewMode[] $values() {
        return new InvestingMonitorViewMode[]{HEAT_MAP, LIST, GRID};
    }

    public static EnumEntries<InvestingMonitorViewMode> getEntries() {
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

    private InvestingMonitorViewMode(String str, int i, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
        this.icon = serverToBentoAssetMapper2;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    static {
        InvestingMonitorViewMode[] investingMonitorViewModeArr$values = $values();
        $VALUES = investingMonitorViewModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investingMonitorViewModeArr$values);
        CREATOR = new Parcelable.Creator<InvestingMonitorViewMode>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.modes.InvestingMonitorViewMode.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestingMonitorViewMode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return InvestingMonitorViewMode.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestingMonitorViewMode[] newArray(int i) {
                return new InvestingMonitorViewMode[i];
            }
        };
    }

    public static InvestingMonitorViewMode valueOf(String str) {
        return (InvestingMonitorViewMode) Enum.valueOf(InvestingMonitorViewMode.class, str);
    }

    public static InvestingMonitorViewMode[] values() {
        return (InvestingMonitorViewMode[]) $VALUES.clone();
    }
}
