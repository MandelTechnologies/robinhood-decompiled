package com.robinhood.shared.account.contracts.switcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.models.p320db.Account;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSwitcherData.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289Ba\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012BY\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003Jg\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020-HÖ\u0001J\t\u00102\u001a\u00020\rHÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020-R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001f¨\u0006:"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "Landroid/os/Parcelable;", "rows", "", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;", "activeSelection", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection;", "showAllAccountsRow", "", "showRefresh", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "dismissButtonText", "", "deeplinkCta", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherDeeplinkCta;", "title", "<init>", "(Ljava/util/List;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection;ZZLcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherDeeplinkCta;Ljava/lang/String;)V", "activeAccountNumber", "(Ljava/util/List;Ljava/lang/String;ZLcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherDeeplinkCta;Ljava/lang/String;)V", "getRows", "()Ljava/util/List;", "getActiveSelection", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection;", "getShowAllAccountsRow", "()Z", "getShowRefresh", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getDismissButtonText", "()Ljava/lang/String;", "getDeeplinkCta", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherDeeplinkCta;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ActiveSelection", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AccountSwitcherData implements Parcelable {
    private final ActiveSelection activeSelection;
    private final AccountSwitcherDeeplinkCta deeplinkCta;
    private final String dismissButtonText;
    private final Screen eventScreen;
    private final List<AccountSwitcherRowData> rows;
    private final boolean showAllAccountsRow;
    private final boolean showRefresh;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AccountSwitcherData> CREATOR = new Creator();

    /* compiled from: AccountSwitcherData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountSwitcherData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSwitcherData createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(AccountSwitcherData.class.getClassLoader()));
            }
            ActiveSelection activeSelection = (ActiveSelection) parcel.readParcelable(AccountSwitcherData.class.getClassLoader());
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            return new AccountSwitcherData(arrayList, activeSelection, z2, parcel.readInt() != 0 ? z : false, (Screen) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : AccountSwitcherDeeplinkCta.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSwitcherData[] newArray(int i) {
            return new AccountSwitcherData[i];
        }
    }

    public static /* synthetic */ AccountSwitcherData copy$default(AccountSwitcherData accountSwitcherData, List list, ActiveSelection activeSelection, boolean z, boolean z2, Screen screen, String str, AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = accountSwitcherData.rows;
        }
        if ((i & 2) != 0) {
            activeSelection = accountSwitcherData.activeSelection;
        }
        if ((i & 4) != 0) {
            z = accountSwitcherData.showAllAccountsRow;
        }
        if ((i & 8) != 0) {
            z2 = accountSwitcherData.showRefresh;
        }
        if ((i & 16) != 0) {
            screen = accountSwitcherData.eventScreen;
        }
        if ((i & 32) != 0) {
            str = accountSwitcherData.dismissButtonText;
        }
        if ((i & 64) != 0) {
            accountSwitcherDeeplinkCta = accountSwitcherData.deeplinkCta;
        }
        if ((i & 128) != 0) {
            str2 = accountSwitcherData.title;
        }
        AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta2 = accountSwitcherDeeplinkCta;
        String str3 = str2;
        Screen screen2 = screen;
        String str4 = str;
        return accountSwitcherData.copy(list, activeSelection, z, z2, screen2, str4, accountSwitcherDeeplinkCta2, str3);
    }

    public final List<AccountSwitcherRowData> component1() {
        return this.rows;
    }

    /* renamed from: component2, reason: from getter */
    public final ActiveSelection getActiveSelection() {
        return this.activeSelection;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowAllAccountsRow() {
        return this.showAllAccountsRow;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowRefresh() {
        return this.showRefresh;
    }

    /* renamed from: component5, reason: from getter */
    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDismissButtonText() {
        return this.dismissButtonText;
    }

    /* renamed from: component7, reason: from getter */
    public final AccountSwitcherDeeplinkCta getDeeplinkCta() {
        return this.deeplinkCta;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final AccountSwitcherData copy(List<? extends AccountSwitcherRowData> rows, ActiveSelection activeSelection, boolean showAllAccountsRow, boolean showRefresh, Screen eventScreen, String dismissButtonText, AccountSwitcherDeeplinkCta deeplinkCta, String title) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(activeSelection, "activeSelection");
        return new AccountSwitcherData(rows, activeSelection, showAllAccountsRow, showRefresh, eventScreen, dismissButtonText, deeplinkCta, title);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSwitcherData)) {
            return false;
        }
        AccountSwitcherData accountSwitcherData = (AccountSwitcherData) other;
        return Intrinsics.areEqual(this.rows, accountSwitcherData.rows) && Intrinsics.areEqual(this.activeSelection, accountSwitcherData.activeSelection) && this.showAllAccountsRow == accountSwitcherData.showAllAccountsRow && this.showRefresh == accountSwitcherData.showRefresh && Intrinsics.areEqual(this.eventScreen, accountSwitcherData.eventScreen) && Intrinsics.areEqual(this.dismissButtonText, accountSwitcherData.dismissButtonText) && Intrinsics.areEqual(this.deeplinkCta, accountSwitcherData.deeplinkCta) && Intrinsics.areEqual(this.title, accountSwitcherData.title);
    }

    public int hashCode() {
        int iHashCode = ((((((this.rows.hashCode() * 31) + this.activeSelection.hashCode()) * 31) + Boolean.hashCode(this.showAllAccountsRow)) * 31) + Boolean.hashCode(this.showRefresh)) * 31;
        Screen screen = this.eventScreen;
        int iHashCode2 = (iHashCode + (screen == null ? 0 : screen.hashCode())) * 31;
        String str = this.dismissButtonText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta = this.deeplinkCta;
        int iHashCode4 = (iHashCode3 + (accountSwitcherDeeplinkCta == null ? 0 : accountSwitcherDeeplinkCta.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AccountSwitcherData(rows=" + this.rows + ", activeSelection=" + this.activeSelection + ", showAllAccountsRow=" + this.showAllAccountsRow + ", showRefresh=" + this.showRefresh + ", eventScreen=" + this.eventScreen + ", dismissButtonText=" + this.dismissButtonText + ", deeplinkCta=" + this.deeplinkCta + ", title=" + this.title + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<AccountSwitcherRowData> list = this.rows;
        dest.writeInt(list.size());
        Iterator<AccountSwitcherRowData> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.activeSelection, flags);
        dest.writeInt(this.showAllAccountsRow ? 1 : 0);
        dest.writeInt(this.showRefresh ? 1 : 0);
        dest.writeSerializable(this.eventScreen);
        dest.writeString(this.dismissButtonText);
        AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta = this.deeplinkCta;
        if (accountSwitcherDeeplinkCta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            accountSwitcherDeeplinkCta.writeToParcel(dest, flags);
        }
        dest.writeString(this.title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountSwitcherData(List<? extends AccountSwitcherRowData> rows, ActiveSelection activeSelection, boolean z, boolean z2, Screen screen, String str, AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta, String str2) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(activeSelection, "activeSelection");
        this.rows = rows;
        this.activeSelection = activeSelection;
        this.showAllAccountsRow = z;
        this.showRefresh = z2;
        this.eventScreen = screen;
        this.dismissButtonText = str;
        this.deeplinkCta = accountSwitcherDeeplinkCta;
        this.title = str2;
        if (z || !(activeSelection instanceof ActiveSelection.AllAccounts)) {
            return;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Account Switcher configured to hide 'All' item, but active selection is 'All'"), true, null, 4, null);
    }

    public /* synthetic */ AccountSwitcherData(List list, ActiveSelection activeSelection, boolean z, boolean z2, Screen screen, String str, AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, activeSelection, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : screen, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : accountSwitcherDeeplinkCta, (i & 128) != 0 ? null : str2);
    }

    public final List<AccountSwitcherRowData> getRows() {
        return this.rows;
    }

    public final ActiveSelection getActiveSelection() {
        return this.activeSelection;
    }

    public final boolean getShowAllAccountsRow() {
        return this.showAllAccountsRow;
    }

    public final boolean getShowRefresh() {
        return this.showRefresh;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    public final String getDismissButtonText() {
        return this.dismissButtonText;
    }

    public final AccountSwitcherDeeplinkCta getDeeplinkCta() {
        return this.deeplinkCta;
    }

    public final String getTitle() {
        return this.title;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AccountSwitcherData(java.util.List r9, java.lang.String r10, boolean r11, com.robinhood.rosetta.eventlogging.Screen r12, java.lang.String r13, com.robinhood.shared.account.contracts.switcher.AccountSwitcherDeeplinkCta r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L5
            r11 = 0
        L5:
            r3 = r11
            r11 = r16 & 8
            r0 = 0
            if (r11 == 0) goto Ld
            r4 = r0
            goto Le
        Ld:
            r4 = r12
        Le:
            r11 = r16 & 16
            if (r11 == 0) goto L14
            r5 = r0
            goto L15
        L14:
            r5 = r13
        L15:
            r11 = r16 & 32
            if (r11 == 0) goto L1b
            r6 = r0
            goto L1c
        L1b:
            r6 = r14
        L1c:
            r11 = r16 & 64
            if (r11 == 0) goto L25
            r7 = r0
            r1 = r9
            r2 = r10
            r0 = r8
            goto L29
        L25:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
        L29:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.account.contracts.switcher.AccountSwitcherData.<init>(java.util.List, java.lang.String, boolean, com.robinhood.rosetta.eventlogging.Screen, java.lang.String, com.robinhood.shared.account.contracts.switcher.AccountSwitcherDeeplinkCta, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountSwitcherData(List<? extends AccountSwitcherRowData> rows, String activeAccountNumber, boolean z, Screen screen, String str, AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta, String str2) {
        this(rows, new ActiveSelection.AccountRow(activeAccountNumber), false, z, screen, str, accountSwitcherDeeplinkCta, str2);
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
    }

    /* compiled from: AccountSwitcherData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection;", "Landroid/os/Parcelable;", "<init>", "()V", "AllAccounts", EquityOrderFormRowState2.AccountRowTestTag, "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection$AccountRow;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection$AllAccounts;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ActiveSelection implements Parcelable {
        public /* synthetic */ ActiveSelection(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActiveSelection() {
        }

        /* compiled from: AccountSwitcherData.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection$AllAccounts;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AllAccounts extends ActiveSelection {
            public static final AllAccounts INSTANCE = new AllAccounts();
            public static final Parcelable.Creator<AllAccounts> CREATOR = new Creator();

            /* compiled from: AccountSwitcherData.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AllAccounts> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AllAccounts createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AllAccounts.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AllAccounts[] newArray(int i) {
                    return new AllAccounts[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AllAccounts);
            }

            public int hashCode() {
                return 739588510;
            }

            public String toString() {
                return "AllAccounts";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private AllAccounts() {
                super(null);
            }
        }

        /* compiled from: AccountSwitcherData.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection$AccountRow;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountRow extends ActiveSelection {
            public static final Parcelable.Creator<AccountRow> CREATOR = new Creator();
            private final String accountNumber;

            /* compiled from: AccountSwitcherData.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountRow> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AccountRow createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AccountRow(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AccountRow[] newArray(int i) {
                    return new AccountRow[i];
                }
            }

            public static /* synthetic */ AccountRow copy$default(AccountRow accountRow, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = accountRow.accountNumber;
                }
                return accountRow.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final AccountRow copy(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return new AccountRow(accountNumber);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountRow) && Intrinsics.areEqual(this.accountNumber, ((AccountRow) other).accountNumber);
            }

            public int hashCode() {
                return this.accountNumber.hashCode();
            }

            public String toString() {
                return "AccountRow(accountNumber=" + this.accountNumber + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountRow(String accountNumber) {
                super(null);
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.accountNumber = accountNumber;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }
        }
    }

    /* compiled from: AccountSwitcherData.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJF\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "activeAccountNumber", "", "accounts", "", "Lcom/robinhood/models/db/Account;", "showRefresh", "", "selectionEnabled", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "activeSelection", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData$ActiveSelection;", "showAllAccountsRow", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ AccountSwitcherData from$default(Companion companion, String str, List list, boolean z, boolean z2, Screen screen, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                screen = null;
            }
            return companion.from(str, list, z3, z4, screen);
        }

        public final AccountSwitcherData from(String activeAccountNumber, List<Account> accounts2, boolean showRefresh, boolean selectionEnabled, Screen eventScreen) {
            Intrinsics.checkNotNullParameter(activeAccountNumber, "activeAccountNumber");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            return from(new ActiveSelection.AccountRow(activeAccountNumber), accounts2, false, showRefresh, selectionEnabled, eventScreen);
        }

        public static /* synthetic */ AccountSwitcherData from$default(Companion companion, ActiveSelection activeSelection, List list, boolean z, boolean z2, boolean z3, Screen screen, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            if ((i & 16) != 0) {
                z3 = true;
            }
            if ((i & 32) != 0) {
                screen = null;
            }
            return companion.from(activeSelection, list, z, z2, z3, screen);
        }

        public final AccountSwitcherData from(ActiveSelection activeSelection, List<Account> accounts2, boolean showAllAccountsRow, boolean showRefresh, boolean selectionEnabled, Screen eventScreen) {
            Intrinsics.checkNotNullParameter(activeSelection, "activeSelection");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            List<Account> list = accounts2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Account account : list) {
                arrayList.add(new AccountSwitcherRowData.Account(account.getAccountNumber(), account.getBrokerageAccountType(), account.getManagementType(), account.getCreatedAt(), null, AccountDisplayNames.getDisplayName(account).getWithInvesting().getTitle(), null, null, null, AccountDisplayIcons.getDisplayIcon(account), selectionEnabled, 464, null));
            }
            return new AccountSwitcherData(arrayList, activeSelection, showAllAccountsRow, showRefresh, eventScreen, null, null, null, 224, null);
        }
    }
}
