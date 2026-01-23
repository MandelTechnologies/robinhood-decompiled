package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionStrategyBottomSheetFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010+\u001a\u00020\u0004HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\t\u00101\u001a\u00020\u0004HÆ\u0003J\t\u00102\u001a\u00020\u0013HÆ\u0003J\t\u00103\u001a\u00020\u0004HÆ\u0003J\t\u00104\u001a\u00020\u0016HÆ\u0003J}\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0006\u00106\u001a\u000207J\u0013\u00108\u001a\u00020\u00132\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u000207HÖ\u0001J\t\u0010<\u001a\u00020\u0004HÖ\u0001J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000207R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionStrategyBottomSheetFragmentKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "defaultPricingSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "optionsContext", "Lcom/robinhood/rosetta/eventlogging/OptionsContext;", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "positionCounts", "", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "source", "Lrosetta/option/OptionOrderFormSource;", "title", "tradable", "", "transitionReason", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/rosetta/eventlogging/OptionsContext;Lcom/robinhood/models/ui/OptionOrderBundle;Ljava/util/Map;Lrosetta/option/OptionOrderFormSource;Ljava/lang/String;ZLjava/lang/String;Lcom/robinhood/models/ui/UiOptionChain;)V", "getAccountNumber", "()Ljava/lang/String;", "getDefaultPricingSetting", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getOptionsContext", "()Lcom/robinhood/rosetta/eventlogging/OptionsContext;", "getOptionOrderBundle", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "getPositionCounts", "()Ljava/util/Map;", "getSource", "()Lrosetta/option/OptionOrderFormSource;", "getTitle", "getTradable", "()Z", "getTransitionReason", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptionStrategyBottomSheetFragmentKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<OptionStrategyBottomSheetFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final OptionSettings.DefaultPricingSetting defaultPricingSetting;
    private final OptionOrderBundle optionOrderBundle;
    private final OptionsContext optionsContext;
    private final Map<UUID, UiOptionPositionCounts> positionCounts;
    private final OptionOrderFormSource source;
    private final String title;
    private final boolean tradable;
    private final String transitionReason;
    private final UiOptionChain uiOptionChain;

    /* compiled from: OptionStrategyBottomSheetFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionStrategyBottomSheetFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionStrategyBottomSheetFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            OptionSettings.DefaultPricingSetting defaultPricingSettingValueOf = parcel.readInt() == 0 ? null : OptionSettings.DefaultPricingSetting.valueOf(parcel.readString());
            OptionsContext optionsContext = (OptionsContext) parcel.readSerializable();
            OptionOrderBundle optionOrderBundle = (OptionOrderBundle) parcel.readParcelable(OptionStrategyBottomSheetFragmentKey.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readSerializable(), parcel.readParcelable(OptionStrategyBottomSheetFragmentKey.class.getClassLoader()));
            }
            return new OptionStrategyBottomSheetFragmentKey(string2, defaultPricingSettingValueOf, optionsContext, optionOrderBundle, linkedHashMap, OptionOrderFormSource.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (UiOptionChain) parcel.readParcelable(OptionStrategyBottomSheetFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionStrategyBottomSheetFragmentKey[] newArray(int i) {
            return new OptionStrategyBottomSheetFragmentKey[i];
        }
    }

    public static /* synthetic */ OptionStrategyBottomSheetFragmentKey copy$default(OptionStrategyBottomSheetFragmentKey optionStrategyBottomSheetFragmentKey, String str, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionsContext optionsContext, OptionOrderBundle optionOrderBundle, Map map, OptionOrderFormSource optionOrderFormSource, String str2, boolean z, String str3, UiOptionChain uiOptionChain, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionStrategyBottomSheetFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            defaultPricingSetting = optionStrategyBottomSheetFragmentKey.defaultPricingSetting;
        }
        if ((i & 4) != 0) {
            optionsContext = optionStrategyBottomSheetFragmentKey.optionsContext;
        }
        if ((i & 8) != 0) {
            optionOrderBundle = optionStrategyBottomSheetFragmentKey.optionOrderBundle;
        }
        if ((i & 16) != 0) {
            map = optionStrategyBottomSheetFragmentKey.positionCounts;
        }
        if ((i & 32) != 0) {
            optionOrderFormSource = optionStrategyBottomSheetFragmentKey.source;
        }
        if ((i & 64) != 0) {
            str2 = optionStrategyBottomSheetFragmentKey.title;
        }
        if ((i & 128) != 0) {
            z = optionStrategyBottomSheetFragmentKey.tradable;
        }
        if ((i & 256) != 0) {
            str3 = optionStrategyBottomSheetFragmentKey.transitionReason;
        }
        if ((i & 512) != 0) {
            uiOptionChain = optionStrategyBottomSheetFragmentKey.uiOptionChain;
        }
        String str4 = str3;
        UiOptionChain uiOptionChain2 = uiOptionChain;
        String str5 = str2;
        boolean z2 = z;
        Map map2 = map;
        OptionOrderFormSource optionOrderFormSource2 = optionOrderFormSource;
        return optionStrategyBottomSheetFragmentKey.copy(str, defaultPricingSetting, optionsContext, optionOrderBundle, map2, optionOrderFormSource2, str5, z2, str4, uiOptionChain2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
        return this.defaultPricingSetting;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionsContext getOptionsContext() {
        return this.optionsContext;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionOrderBundle getOptionOrderBundle() {
        return this.optionOrderBundle;
    }

    public final Map<UUID, UiOptionPositionCounts> component5() {
        return this.positionCounts;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionOrderFormSource getSource() {
        return this.source;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getTradable() {
        return this.tradable;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTransitionReason() {
        return this.transitionReason;
    }

    public final OptionStrategyBottomSheetFragmentKey copy(String accountNumber, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionsContext optionsContext, OptionOrderBundle optionOrderBundle, Map<UUID, UiOptionPositionCounts> positionCounts, OptionOrderFormSource source, String title, boolean tradable, String transitionReason, UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
        Intrinsics.checkNotNullParameter(positionCounts, "positionCounts");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(transitionReason, "transitionReason");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        return new OptionStrategyBottomSheetFragmentKey(accountNumber, defaultPricingSetting, optionsContext, optionOrderBundle, positionCounts, source, title, tradable, transitionReason, uiOptionChain);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStrategyBottomSheetFragmentKey)) {
            return false;
        }
        OptionStrategyBottomSheetFragmentKey optionStrategyBottomSheetFragmentKey = (OptionStrategyBottomSheetFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, optionStrategyBottomSheetFragmentKey.accountNumber) && this.defaultPricingSetting == optionStrategyBottomSheetFragmentKey.defaultPricingSetting && Intrinsics.areEqual(this.optionsContext, optionStrategyBottomSheetFragmentKey.optionsContext) && Intrinsics.areEqual(this.optionOrderBundle, optionStrategyBottomSheetFragmentKey.optionOrderBundle) && Intrinsics.areEqual(this.positionCounts, optionStrategyBottomSheetFragmentKey.positionCounts) && this.source == optionStrategyBottomSheetFragmentKey.source && Intrinsics.areEqual(this.title, optionStrategyBottomSheetFragmentKey.title) && this.tradable == optionStrategyBottomSheetFragmentKey.tradable && Intrinsics.areEqual(this.transitionReason, optionStrategyBottomSheetFragmentKey.transitionReason) && Intrinsics.areEqual(this.uiOptionChain, optionStrategyBottomSheetFragmentKey.uiOptionChain);
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSetting;
        int iHashCode2 = (iHashCode + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31;
        OptionsContext optionsContext = this.optionsContext;
        return ((((((((((((((iHashCode2 + (optionsContext != null ? optionsContext.hashCode() : 0)) * 31) + this.optionOrderBundle.hashCode()) * 31) + this.positionCounts.hashCode()) * 31) + this.source.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.tradable)) * 31) + this.transitionReason.hashCode()) * 31) + this.uiOptionChain.hashCode();
    }

    public String toString() {
        return "OptionStrategyBottomSheetFragmentKey(accountNumber=" + this.accountNumber + ", defaultPricingSetting=" + this.defaultPricingSetting + ", optionsContext=" + this.optionsContext + ", optionOrderBundle=" + this.optionOrderBundle + ", positionCounts=" + this.positionCounts + ", source=" + this.source + ", title=" + this.title + ", tradable=" + this.tradable + ", transitionReason=" + this.transitionReason + ", uiOptionChain=" + this.uiOptionChain + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSetting;
        if (defaultPricingSetting == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(defaultPricingSetting.name());
        }
        dest.writeSerializable(this.optionsContext);
        dest.writeParcelable(this.optionOrderBundle, flags);
        Map<UUID, UiOptionPositionCounts> map = this.positionCounts;
        dest.writeInt(map.size());
        for (Map.Entry<UUID, UiOptionPositionCounts> entry : map.entrySet()) {
            dest.writeSerializable(entry.getKey());
            dest.writeParcelable(entry.getValue(), flags);
        }
        dest.writeString(this.source.name());
        dest.writeString(this.title);
        dest.writeInt(this.tradable ? 1 : 0);
        dest.writeString(this.transitionReason);
        dest.writeParcelable(this.uiOptionChain, flags);
    }

    public OptionStrategyBottomSheetFragmentKey(String accountNumber, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionsContext optionsContext, OptionOrderBundle optionOrderBundle, Map<UUID, UiOptionPositionCounts> positionCounts, OptionOrderFormSource source, String title, boolean z, String transitionReason, UiOptionChain uiOptionChain) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
        Intrinsics.checkNotNullParameter(positionCounts, "positionCounts");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(transitionReason, "transitionReason");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        this.accountNumber = accountNumber;
        this.defaultPricingSetting = defaultPricingSetting;
        this.optionsContext = optionsContext;
        this.optionOrderBundle = optionOrderBundle;
        this.positionCounts = positionCounts;
        this.source = source;
        this.title = title;
        this.tradable = z;
        this.transitionReason = transitionReason;
        this.uiOptionChain = uiOptionChain;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
        return this.defaultPricingSetting;
    }

    public final OptionsContext getOptionsContext() {
        return this.optionsContext;
    }

    public final OptionOrderBundle getOptionOrderBundle() {
        return this.optionOrderBundle;
    }

    public final Map<UUID, UiOptionPositionCounts> getPositionCounts() {
        return this.positionCounts;
    }

    public final OptionOrderFormSource getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getTradable() {
        return this.tradable;
    }

    public final String getTransitionReason() {
        return this.transitionReason;
    }

    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }
}
