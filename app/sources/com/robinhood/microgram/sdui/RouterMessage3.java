package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RouterMessage.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/NavigationType;", "Lcom/robinhood/enums/RhEnum;", "Landroid/os/Parcelable;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "PUSH", "PRESENT", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.NavigationType, reason: use source file name */
/* loaded from: classes13.dex */
public final class RouterMessage3 implements RhEnum<RouterMessage3>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RouterMessage3[] $VALUES;
    public static final Parcelable.Creator<RouterMessage3> CREATOR;
    private final String serverValue;
    public static final RouterMessage3 PUSH = new RouterMessage3("PUSH", 0, "PUSH");
    public static final RouterMessage3 PRESENT = new RouterMessage3("PRESENT", 1, "PRESENT");

    private static final /* synthetic */ RouterMessage3[] $values() {
        return new RouterMessage3[]{PUSH, PRESENT};
    }

    public static EnumEntries<RouterMessage3> getEntries() {
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

    private RouterMessage3(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        RouterMessage3[] routerMessage3Arr$values = $values();
        $VALUES = routerMessage3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(routerMessage3Arr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<RouterMessage3>() { // from class: com.robinhood.microgram.sdui.NavigationType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RouterMessage3 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return RouterMessage3.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RouterMessage3[] newArray(int i) {
                return new RouterMessage3[i];
            }
        };
    }

    public static RouterMessage3 valueOf(String str) {
        return (RouterMessage3) Enum.valueOf(RouterMessage3.class, str);
    }

    public static RouterMessage3[] values() {
        return (RouterMessage3[]) $VALUES.clone();
    }
}
