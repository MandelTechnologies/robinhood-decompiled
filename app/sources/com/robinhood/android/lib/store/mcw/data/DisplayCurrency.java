package com.robinhood.android.lib.store.mcw.data;

import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: McwDataModels.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/DisplayCurrency;", "", "title", "", "money", "Lcom/robinhood/models/util/Money;", "sweepDisplayLabel", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/util/Money;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMoney", "()Lcom/robinhood/models/util/Money;", "getSweepDisplayLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DisplayCurrency {
    public static final int $stable = 8;
    private final Money money;
    private final String sweepDisplayLabel;
    private final String title;

    public static /* synthetic */ DisplayCurrency copy$default(DisplayCurrency displayCurrency, String str, Money money, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayCurrency.title;
        }
        if ((i & 2) != 0) {
            money = displayCurrency.money;
        }
        if ((i & 4) != 0) {
            str2 = displayCurrency.sweepDisplayLabel;
        }
        return displayCurrency.copy(str, money, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSweepDisplayLabel() {
        return this.sweepDisplayLabel;
    }

    public final DisplayCurrency copy(String title, Money money, String sweepDisplayLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(money, "money");
        return new DisplayCurrency(title, money, sweepDisplayLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayCurrency)) {
            return false;
        }
        DisplayCurrency displayCurrency = (DisplayCurrency) other;
        return Intrinsics.areEqual(this.title, displayCurrency.title) && Intrinsics.areEqual(this.money, displayCurrency.money) && Intrinsics.areEqual(this.sweepDisplayLabel, displayCurrency.sweepDisplayLabel);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.money.hashCode()) * 31;
        String str = this.sweepDisplayLabel;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DisplayCurrency(title=" + this.title + ", money=" + this.money + ", sweepDisplayLabel=" + this.sweepDisplayLabel + ")";
    }

    public DisplayCurrency(String title, Money money, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(money, "money");
        this.title = title;
        this.money = money;
        this.sweepDisplayLabel = str;
    }

    public /* synthetic */ DisplayCurrency(String str, Money money, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, money, (i & 4) != 0 ? null : str2);
    }

    public final String getTitle() {
        return this.title;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getSweepDisplayLabel() {
        return this.sweepDisplayLabel;
    }
}
