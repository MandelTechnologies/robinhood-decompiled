package com.robinhood.android.internalassettransfers.accountselection;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiEligibleAccounts.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006\u0012\u001a\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J\u001d\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003JU\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/UiEligibleAccounts;", "", "accounts", "", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "validSourceToSink", "", "", "validSinkToSource", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getAccounts", "()Ljava/util/List;", "getValidSourceToSink", "()Ljava/util/Map;", "getValidSinkToSource", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UiEligibleAccounts {
    public static final int $stable = 8;
    private final List<UiIatAccount> accounts;
    private final Map<String, List<UiIatAccount>> validSinkToSource;
    private final Map<String, List<UiIatAccount>> validSourceToSink;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiEligibleAccounts copy$default(UiEligibleAccounts uiEligibleAccounts, List list, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = uiEligibleAccounts.accounts;
        }
        if ((i & 2) != 0) {
            map = uiEligibleAccounts.validSourceToSink;
        }
        if ((i & 4) != 0) {
            map2 = uiEligibleAccounts.validSinkToSource;
        }
        return uiEligibleAccounts.copy(list, map, map2);
    }

    public final List<UiIatAccount> component1() {
        return this.accounts;
    }

    public final Map<String, List<UiIatAccount>> component2() {
        return this.validSourceToSink;
    }

    public final Map<String, List<UiIatAccount>> component3() {
        return this.validSinkToSource;
    }

    public final UiEligibleAccounts copy(List<UiIatAccount> accounts2, Map<String, ? extends List<UiIatAccount>> validSourceToSink, Map<String, ? extends List<UiIatAccount>> validSinkToSource) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(validSourceToSink, "validSourceToSink");
        Intrinsics.checkNotNullParameter(validSinkToSource, "validSinkToSource");
        return new UiEligibleAccounts(accounts2, validSourceToSink, validSinkToSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiEligibleAccounts)) {
            return false;
        }
        UiEligibleAccounts uiEligibleAccounts = (UiEligibleAccounts) other;
        return Intrinsics.areEqual(this.accounts, uiEligibleAccounts.accounts) && Intrinsics.areEqual(this.validSourceToSink, uiEligibleAccounts.validSourceToSink) && Intrinsics.areEqual(this.validSinkToSource, uiEligibleAccounts.validSinkToSource);
    }

    public int hashCode() {
        return (((this.accounts.hashCode() * 31) + this.validSourceToSink.hashCode()) * 31) + this.validSinkToSource.hashCode();
    }

    public String toString() {
        return "UiEligibleAccounts(accounts=" + this.accounts + ", validSourceToSink=" + this.validSourceToSink + ", validSinkToSource=" + this.validSinkToSource + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiEligibleAccounts(List<UiIatAccount> accounts2, Map<String, ? extends List<UiIatAccount>> validSourceToSink, Map<String, ? extends List<UiIatAccount>> validSinkToSource) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(validSourceToSink, "validSourceToSink");
        Intrinsics.checkNotNullParameter(validSinkToSource, "validSinkToSource");
        this.accounts = accounts2;
        this.validSourceToSink = validSourceToSink;
        this.validSinkToSource = validSinkToSource;
    }

    public final List<UiIatAccount> getAccounts() {
        return this.accounts;
    }

    public final Map<String, List<UiIatAccount>> getValidSourceToSink() {
        return this.validSourceToSink;
    }

    public final Map<String, List<UiIatAccount>> getValidSinkToSource() {
        return this.validSinkToSource;
    }
}
