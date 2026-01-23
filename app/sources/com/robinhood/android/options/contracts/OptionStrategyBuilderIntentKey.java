package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p355ui.UiOptionChain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderIntentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionStrategyBuilderIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "initialAccountNumber", "", "strategyId", "uiOptionChains", "", "Lcom/robinhood/models/ui/UiOptionChain;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getInitialAccountNumber", "()Ljava/lang/String;", "getStrategyId", "getUiOptionChains", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptionStrategyBuilderIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<OptionStrategyBuilderIntentKey> CREATOR = new Creator();
    private final String initialAccountNumber;
    private final String strategyId;
    private final List<UiOptionChain> uiOptionChains;

    /* compiled from: OptionStrategyBuilderIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionStrategyBuilderIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionStrategyBuilderIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(OptionStrategyBuilderIntentKey.class.getClassLoader()));
            }
            return new OptionStrategyBuilderIntentKey(string2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionStrategyBuilderIntentKey[] newArray(int i) {
            return new OptionStrategyBuilderIntentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionStrategyBuilderIntentKey copy$default(OptionStrategyBuilderIntentKey optionStrategyBuilderIntentKey, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionStrategyBuilderIntentKey.initialAccountNumber;
        }
        if ((i & 2) != 0) {
            str2 = optionStrategyBuilderIntentKey.strategyId;
        }
        if ((i & 4) != 0) {
            list = optionStrategyBuilderIntentKey.uiOptionChains;
        }
        return optionStrategyBuilderIntentKey.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInitialAccountNumber() {
        return this.initialAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStrategyId() {
        return this.strategyId;
    }

    public final List<UiOptionChain> component3() {
        return this.uiOptionChains;
    }

    public final OptionStrategyBuilderIntentKey copy(String initialAccountNumber, String strategyId, List<UiOptionChain> uiOptionChains) {
        Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
        Intrinsics.checkNotNullParameter(strategyId, "strategyId");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        return new OptionStrategyBuilderIntentKey(initialAccountNumber, strategyId, uiOptionChains);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStrategyBuilderIntentKey)) {
            return false;
        }
        OptionStrategyBuilderIntentKey optionStrategyBuilderIntentKey = (OptionStrategyBuilderIntentKey) other;
        return Intrinsics.areEqual(this.initialAccountNumber, optionStrategyBuilderIntentKey.initialAccountNumber) && Intrinsics.areEqual(this.strategyId, optionStrategyBuilderIntentKey.strategyId) && Intrinsics.areEqual(this.uiOptionChains, optionStrategyBuilderIntentKey.uiOptionChains);
    }

    public int hashCode() {
        return (((this.initialAccountNumber.hashCode() * 31) + this.strategyId.hashCode()) * 31) + this.uiOptionChains.hashCode();
    }

    public String toString() {
        return "OptionStrategyBuilderIntentKey(initialAccountNumber=" + this.initialAccountNumber + ", strategyId=" + this.strategyId + ", uiOptionChains=" + this.uiOptionChains + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.initialAccountNumber);
        dest.writeString(this.strategyId);
        List<UiOptionChain> list = this.uiOptionChains;
        dest.writeInt(list.size());
        Iterator<UiOptionChain> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public OptionStrategyBuilderIntentKey(String initialAccountNumber, String strategyId, List<UiOptionChain> uiOptionChains) {
        Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
        Intrinsics.checkNotNullParameter(strategyId, "strategyId");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        this.initialAccountNumber = initialAccountNumber;
        this.strategyId = strategyId;
        this.uiOptionChains = uiOptionChains;
    }

    public final String getInitialAccountNumber() {
        return this.initialAccountNumber;
    }

    public final String getStrategyId() {
        return this.strategyId;
    }

    public final List<UiOptionChain> getUiOptionChains() {
        return this.uiOptionChains;
    }
}
