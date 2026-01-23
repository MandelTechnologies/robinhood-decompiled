package com.robinhood.android.portfolio.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlTradeDetailDialogFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/PnlTradeDetailDialogFragmentKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "accountNumber", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "showPnlHubButton", "", "showSdpButton", "pnlUpdatesEnabled", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;Lcom/robinhood/rosetta/eventlogging/Screen;ZZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getItem", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getShowPnlHubButton", "()Z", "getShowSdpButton", "getPnlUpdatesEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PnlTradeDetailDialogFragmentKey implements Parcelable, DialogFragmentKey {
    public static final Parcelable.Creator<PnlTradeDetailDialogFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final ProfitAndLossTradeItem item;
    private final boolean pnlUpdatesEnabled;
    private final Screen screen;
    private final boolean showPnlHubButton;
    private final boolean showSdpButton;

    /* compiled from: PnlTradeDetailDialogFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<PnlTradeDetailDialogFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnlTradeDetailDialogFragmentKey createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            ProfitAndLossTradeItem profitAndLossTradeItem = (ProfitAndLossTradeItem) parcel.readParcelable(PnlTradeDetailDialogFragmentKey.class.getClassLoader());
            Screen screen = (Screen) parcel.readSerializable();
            boolean z3 = false;
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new PnlTradeDetailDialogFragmentKey(string2, profitAndLossTradeItem, screen, z3, z4, z2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnlTradeDetailDialogFragmentKey[] newArray(int i) {
            return new PnlTradeDetailDialogFragmentKey[i];
        }
    }

    public static /* synthetic */ PnlTradeDetailDialogFragmentKey copy$default(PnlTradeDetailDialogFragmentKey pnlTradeDetailDialogFragmentKey, String str, ProfitAndLossTradeItem profitAndLossTradeItem, Screen screen, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pnlTradeDetailDialogFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            profitAndLossTradeItem = pnlTradeDetailDialogFragmentKey.item;
        }
        if ((i & 4) != 0) {
            screen = pnlTradeDetailDialogFragmentKey.screen;
        }
        if ((i & 8) != 0) {
            z = pnlTradeDetailDialogFragmentKey.showPnlHubButton;
        }
        if ((i & 16) != 0) {
            z2 = pnlTradeDetailDialogFragmentKey.showSdpButton;
        }
        if ((i & 32) != 0) {
            z3 = pnlTradeDetailDialogFragmentKey.pnlUpdatesEnabled;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return pnlTradeDetailDialogFragmentKey.copy(str, profitAndLossTradeItem, screen, z, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final ProfitAndLossTradeItem getItem() {
        return this.item;
    }

    /* renamed from: component3, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowPnlHubButton() {
        return this.showPnlHubButton;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowSdpButton() {
        return this.showSdpButton;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final PnlTradeDetailDialogFragmentKey copy(String accountNumber, ProfitAndLossTradeItem item, Screen screen, boolean showPnlHubButton, boolean showSdpButton, boolean pnlUpdatesEnabled) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new PnlTradeDetailDialogFragmentKey(accountNumber, item, screen, showPnlHubButton, showSdpButton, pnlUpdatesEnabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PnlTradeDetailDialogFragmentKey)) {
            return false;
        }
        PnlTradeDetailDialogFragmentKey pnlTradeDetailDialogFragmentKey = (PnlTradeDetailDialogFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, pnlTradeDetailDialogFragmentKey.accountNumber) && Intrinsics.areEqual(this.item, pnlTradeDetailDialogFragmentKey.item) && Intrinsics.areEqual(this.screen, pnlTradeDetailDialogFragmentKey.screen) && this.showPnlHubButton == pnlTradeDetailDialogFragmentKey.showPnlHubButton && this.showSdpButton == pnlTradeDetailDialogFragmentKey.showSdpButton && this.pnlUpdatesEnabled == pnlTradeDetailDialogFragmentKey.pnlUpdatesEnabled;
    }

    public int hashCode() {
        return (((((((((this.accountNumber.hashCode() * 31) + this.item.hashCode()) * 31) + this.screen.hashCode()) * 31) + Boolean.hashCode(this.showPnlHubButton)) * 31) + Boolean.hashCode(this.showSdpButton)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled);
    }

    public String toString() {
        return "PnlTradeDetailDialogFragmentKey(accountNumber=" + this.accountNumber + ", item=" + this.item + ", screen=" + this.screen + ", showPnlHubButton=" + this.showPnlHubButton + ", showSdpButton=" + this.showSdpButton + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeParcelable(this.item, flags);
        dest.writeSerializable(this.screen);
        dest.writeInt(this.showPnlHubButton ? 1 : 0);
        dest.writeInt(this.showSdpButton ? 1 : 0);
        dest.writeInt(this.pnlUpdatesEnabled ? 1 : 0);
    }

    public PnlTradeDetailDialogFragmentKey(String accountNumber, ProfitAndLossTradeItem item, Screen screen, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.accountNumber = accountNumber;
        this.item = item;
        this.screen = screen;
        this.showPnlHubButton = z;
        this.showSdpButton = z2;
        this.pnlUpdatesEnabled = z3;
    }

    public /* synthetic */ PnlTradeDetailDialogFragmentKey(String str, ProfitAndLossTradeItem profitAndLossTradeItem, Screen screen, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, profitAndLossTradeItem, screen, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ProfitAndLossTradeItem getItem() {
        return this.item;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final boolean getShowPnlHubButton() {
        return this.showPnlHubButton;
    }

    public final boolean getShowSdpButton() {
        return this.showSdpButton;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }
}
