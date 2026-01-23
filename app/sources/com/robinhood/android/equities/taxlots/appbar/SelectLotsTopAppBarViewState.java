package com.robinhood.android.equities.taxlots.appbar;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsTopAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/appbar/SelectLotsTopAppBarViewState;", "", "title", "", "subtitle", "m1Enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getM1Enabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectLotsTopAppBarViewState {
    public static final int $stable = 0;
    private final boolean m1Enabled;
    private final String subtitle;
    private final String title;

    public SelectLotsTopAppBarViewState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ SelectLotsTopAppBarViewState copy$default(SelectLotsTopAppBarViewState selectLotsTopAppBarViewState, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectLotsTopAppBarViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = selectLotsTopAppBarViewState.subtitle;
        }
        if ((i & 4) != 0) {
            z = selectLotsTopAppBarViewState.m1Enabled;
        }
        return selectLotsTopAppBarViewState.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getM1Enabled() {
        return this.m1Enabled;
    }

    public final SelectLotsTopAppBarViewState copy(String title, String subtitle, boolean m1Enabled) {
        return new SelectLotsTopAppBarViewState(title, subtitle, m1Enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectLotsTopAppBarViewState)) {
            return false;
        }
        SelectLotsTopAppBarViewState selectLotsTopAppBarViewState = (SelectLotsTopAppBarViewState) other;
        return Intrinsics.areEqual(this.title, selectLotsTopAppBarViewState.title) && Intrinsics.areEqual(this.subtitle, selectLotsTopAppBarViewState.subtitle) && this.m1Enabled == selectLotsTopAppBarViewState.m1Enabled;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.m1Enabled);
    }

    public String toString() {
        return "SelectLotsTopAppBarViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", m1Enabled=" + this.m1Enabled + ")";
    }

    public SelectLotsTopAppBarViewState(String str, String str2, boolean z) {
        this.title = str;
        this.subtitle = str2;
        this.m1Enabled = z;
    }

    public /* synthetic */ SelectLotsTopAppBarViewState(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getM1Enabled() {
        return this.m1Enabled;
    }
}
