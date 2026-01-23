package com.withpersona.sdk2.inquiry.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassportNfcReaderConfig.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101¨\u00062"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Landroid/os/Parcelable;", "", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "passportNfcStrings", "", "Lcom/withpersona/sdk2/inquiry/nfc/NfcDataGroupType;", "enabledDataGroups", "", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardAccessNumber", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "getMrzKey", "()Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "getPassportNfcStrings", "()Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "Ljava/util/List;", "getEnabledDataGroups", "()Ljava/util/List;", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "nfc_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PassportNfcReaderConfig implements Parcelable {
    public static final Parcelable.Creator<PassportNfcReaderConfig> CREATOR = new Creator();
    private final String cardAccessNumber;
    private final List<NfcDataGroupType> enabledDataGroups;
    private final MrzKey mrzKey;
    private final PassportNfcStrings passportNfcStrings;
    private final StepStyles.UiStepStyle styles;
    private final Integer theme;

    /* compiled from: PassportNfcReaderConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportNfcReaderConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportNfcReaderConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            MrzKey mrzKeyCreateFromParcel = MrzKey.CREATOR.createFromParcel(parcel);
            PassportNfcStrings passportNfcStringsCreateFromParcel = PassportNfcStrings.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(NfcDataGroupType.valueOf(parcel.readString()));
            }
            return new PassportNfcReaderConfig(string2, mrzKeyCreateFromParcel, passportNfcStringsCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (StepStyles.UiStepStyle) parcel.readParcelable(PassportNfcReaderConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportNfcReaderConfig[] newArray(int i) {
            return new PassportNfcReaderConfig[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportNfcReaderConfig)) {
            return false;
        }
        PassportNfcReaderConfig passportNfcReaderConfig = (PassportNfcReaderConfig) other;
        return Intrinsics.areEqual(this.cardAccessNumber, passportNfcReaderConfig.cardAccessNumber) && Intrinsics.areEqual(this.mrzKey, passportNfcReaderConfig.mrzKey) && Intrinsics.areEqual(this.passportNfcStrings, passportNfcReaderConfig.passportNfcStrings) && Intrinsics.areEqual(this.enabledDataGroups, passportNfcReaderConfig.enabledDataGroups) && Intrinsics.areEqual(this.theme, passportNfcReaderConfig.theme) && Intrinsics.areEqual(this.styles, passportNfcReaderConfig.styles);
    }

    public int hashCode() {
        int iHashCode = ((((((this.cardAccessNumber.hashCode() * 31) + this.mrzKey.hashCode()) * 31) + this.passportNfcStrings.hashCode()) * 31) + this.enabledDataGroups.hashCode()) * 31;
        Integer num = this.theme;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.styles;
        return iHashCode2 + (uiStepStyle != null ? uiStepStyle.hashCode() : 0);
    }

    public String toString() {
        return "PassportNfcReaderConfig(cardAccessNumber=" + this.cardAccessNumber + ", mrzKey=" + this.mrzKey + ", passportNfcStrings=" + this.passportNfcStrings + ", enabledDataGroups=" + this.enabledDataGroups + ", theme=" + this.theme + ", styles=" + this.styles + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.cardAccessNumber);
        this.mrzKey.writeToParcel(dest, flags);
        this.passportNfcStrings.writeToParcel(dest, flags);
        List<NfcDataGroupType> list = this.enabledDataGroups;
        dest.writeInt(list.size());
        Iterator<NfcDataGroupType> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        Integer num = this.theme;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeParcelable(this.styles, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassportNfcReaderConfig(String cardAccessNumber, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends NfcDataGroupType> enabledDataGroups, Integer num, StepStyles.UiStepStyle uiStepStyle) {
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(mrzKey, "mrzKey");
        Intrinsics.checkNotNullParameter(passportNfcStrings, "passportNfcStrings");
        Intrinsics.checkNotNullParameter(enabledDataGroups, "enabledDataGroups");
        this.cardAccessNumber = cardAccessNumber;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = enabledDataGroups;
        this.theme = num;
        this.styles = uiStepStyle;
    }
}
