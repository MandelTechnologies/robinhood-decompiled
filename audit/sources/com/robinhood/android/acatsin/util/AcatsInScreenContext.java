package com.robinhood.android.acatsin.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.rosetta.eventlogging.AcatsInContext;
import com.robinhood.rosetta.eventlogging.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rosetta.account.BrokerageAccountType;

/* compiled from: AcatsInScreenContext.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010!\u001a\u00060\"j\u0002`#J\u0006\u0010$\u001a\u00020%J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003Ji\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000201HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000201R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/acatsin/util/AcatsInScreenContext;", "Landroid/os/Parcelable;", "source", "", "skipIntro", "", "introShown", "accountType", "Lrosetta/account/BrokerageAccountType;", "contents", "", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$AccountContents;", "rejectReason", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "fromRetry", "dtcNumber", "usingPlaidAccount", "<init>", "(Ljava/lang/String;ZZLrosetta/account/BrokerageAccountType;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;ZLjava/lang/String;Z)V", "getSource", "()Ljava/lang/String;", "getSkipIntro", "()Z", "getIntroShown", "getAccountType", "()Lrosetta/account/BrokerageAccountType;", "getContents", "()Ljava/util/List;", "getRejectReason", "()Lcom/robinhood/rosetta/eventlogging/AcatsInContext$RejectReason;", "getFromRetry", "getDtcNumber", "getUsingPlaidAccount", "toEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "toLoggingContext", "Lcom/robinhood/rosetta/eventlogging/AcatsInContext;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInScreenContext implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AcatsInScreenContext> CREATOR = new Creator();
    private final BrokerageAccountType accountType;
    private final List<AcatsInContext.AccountContents> contents;
    private final String dtcNumber;
    private final boolean fromRetry;
    private final boolean introShown;
    private final AcatsInContext.RejectReason rejectReason;
    private final boolean skipIntro;
    private final String source;
    private final boolean usingPlaidAccount;

    /* compiled from: AcatsInScreenContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AcatsInScreenContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsInScreenContext createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            boolean z3 = parcel.readInt() != 0 ? z : false;
            BrokerageAccountType brokerageAccountTypeValueOf = BrokerageAccountType.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AcatsInContext.AccountContents.valueOf(parcel.readString()));
            }
            return new AcatsInScreenContext(string2, z2, z3, brokerageAccountTypeValueOf, arrayList, AcatsInContext.RejectReason.valueOf(parcel.readString()), parcel.readInt() != 0 ? z : false, parcel.readString(), parcel.readInt() != 0 ? z : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AcatsInScreenContext[] newArray(int i) {
            return new AcatsInScreenContext[i];
        }
    }

    public static /* synthetic */ AcatsInScreenContext copy$default(AcatsInScreenContext acatsInScreenContext, String str, boolean z, boolean z2, BrokerageAccountType brokerageAccountType, List list, AcatsInContext.RejectReason rejectReason, boolean z3, String str2, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acatsInScreenContext.source;
        }
        if ((i & 2) != 0) {
            z = acatsInScreenContext.skipIntro;
        }
        if ((i & 4) != 0) {
            z2 = acatsInScreenContext.introShown;
        }
        if ((i & 8) != 0) {
            brokerageAccountType = acatsInScreenContext.accountType;
        }
        if ((i & 16) != 0) {
            list = acatsInScreenContext.contents;
        }
        if ((i & 32) != 0) {
            rejectReason = acatsInScreenContext.rejectReason;
        }
        if ((i & 64) != 0) {
            z3 = acatsInScreenContext.fromRetry;
        }
        if ((i & 128) != 0) {
            str2 = acatsInScreenContext.dtcNumber;
        }
        if ((i & 256) != 0) {
            z4 = acatsInScreenContext.usingPlaidAccount;
        }
        String str3 = str2;
        boolean z5 = z4;
        AcatsInContext.RejectReason rejectReason2 = rejectReason;
        boolean z6 = z3;
        List list2 = list;
        boolean z7 = z2;
        return acatsInScreenContext.copy(str, z, z7, brokerageAccountType, list2, rejectReason2, z6, str3, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSkipIntro() {
        return this.skipIntro;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIntroShown() {
        return this.introShown;
    }

    /* renamed from: component4, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final List<AcatsInContext.AccountContents> component5() {
        return this.contents;
    }

    /* renamed from: component6, reason: from getter */
    public final AcatsInContext.RejectReason getRejectReason() {
        return this.rejectReason;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFromRetry() {
        return this.fromRetry;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDtcNumber() {
        return this.dtcNumber;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getUsingPlaidAccount() {
        return this.usingPlaidAccount;
    }

    public final AcatsInScreenContext copy(String source, boolean skipIntro, boolean introShown, BrokerageAccountType accountType, List<? extends AcatsInContext.AccountContents> contents, AcatsInContext.RejectReason rejectReason, boolean fromRetry, String dtcNumber, boolean usingPlaidAccount) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(rejectReason, "rejectReason");
        Intrinsics.checkNotNullParameter(dtcNumber, "dtcNumber");
        return new AcatsInScreenContext(source, skipIntro, introShown, accountType, contents, rejectReason, fromRetry, dtcNumber, usingPlaidAccount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInScreenContext)) {
            return false;
        }
        AcatsInScreenContext acatsInScreenContext = (AcatsInScreenContext) other;
        return Intrinsics.areEqual(this.source, acatsInScreenContext.source) && this.skipIntro == acatsInScreenContext.skipIntro && this.introShown == acatsInScreenContext.introShown && this.accountType == acatsInScreenContext.accountType && Intrinsics.areEqual(this.contents, acatsInScreenContext.contents) && this.rejectReason == acatsInScreenContext.rejectReason && this.fromRetry == acatsInScreenContext.fromRetry && Intrinsics.areEqual(this.dtcNumber, acatsInScreenContext.dtcNumber) && this.usingPlaidAccount == acatsInScreenContext.usingPlaidAccount;
    }

    public int hashCode() {
        return (((((((((((((((this.source.hashCode() * 31) + Boolean.hashCode(this.skipIntro)) * 31) + Boolean.hashCode(this.introShown)) * 31) + this.accountType.hashCode()) * 31) + this.contents.hashCode()) * 31) + this.rejectReason.hashCode()) * 31) + Boolean.hashCode(this.fromRetry)) * 31) + this.dtcNumber.hashCode()) * 31) + Boolean.hashCode(this.usingPlaidAccount);
    }

    public String toString() {
        return "AcatsInScreenContext(source=" + this.source + ", skipIntro=" + this.skipIntro + ", introShown=" + this.introShown + ", accountType=" + this.accountType + ", contents=" + this.contents + ", rejectReason=" + this.rejectReason + ", fromRetry=" + this.fromRetry + ", dtcNumber=" + this.dtcNumber + ", usingPlaidAccount=" + this.usingPlaidAccount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeInt(this.skipIntro ? 1 : 0);
        dest.writeInt(this.introShown ? 1 : 0);
        dest.writeString(this.accountType.name());
        List<AcatsInContext.AccountContents> list = this.contents;
        dest.writeInt(list.size());
        Iterator<AcatsInContext.AccountContents> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        dest.writeString(this.rejectReason.name());
        dest.writeInt(this.fromRetry ? 1 : 0);
        dest.writeString(this.dtcNumber);
        dest.writeInt(this.usingPlaidAccount ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInScreenContext(String source, boolean z, boolean z2, BrokerageAccountType accountType, List<? extends AcatsInContext.AccountContents> contents, AcatsInContext.RejectReason rejectReason, boolean z3, String dtcNumber, boolean z4) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(rejectReason, "rejectReason");
        Intrinsics.checkNotNullParameter(dtcNumber, "dtcNumber");
        this.source = source;
        this.skipIntro = z;
        this.introShown = z2;
        this.accountType = accountType;
        this.contents = contents;
        this.rejectReason = rejectReason;
        this.fromRetry = z3;
        this.dtcNumber = dtcNumber;
        this.usingPlaidAccount = z4;
    }

    public /* synthetic */ AcatsInScreenContext(String str, boolean z, boolean z2, BrokerageAccountType brokerageAccountType, List list, AcatsInContext.RejectReason rejectReason, boolean z3, String str2, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, z, z2, (i & 8) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? AcatsInContext.RejectReason.UNKNOWN : rejectReason, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? false : z4);
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getSkipIntro() {
        return this.skipIntro;
    }

    public final boolean getIntroShown() {
        return this.introShown;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final List<AcatsInContext.AccountContents> getContents() {
        return this.contents;
    }

    public final AcatsInContext.RejectReason getRejectReason() {
        return this.rejectReason;
    }

    public final boolean getFromRetry() {
        return this.fromRetry;
    }

    public final String getDtcNumber() {
        return this.dtcNumber;
    }

    public final boolean getUsingPlaidAccount() {
        return this.usingPlaidAccount;
    }

    public final Context toEventContext() {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, toLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -33554433, -1, -1, 16383, null);
    }

    public final AcatsInContext toLoggingContext() {
        return new AcatsInContext(this.skipIntro, this.introShown, this.accountType, this.contents, this.rejectReason, this.fromRetry, this.source, this.dtcNumber, this.usingPlaidAccount, null, 512, null);
    }
}
