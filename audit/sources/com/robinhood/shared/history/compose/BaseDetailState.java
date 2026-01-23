package com.robinhood.shared.history.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/history/compose/BaseDetailState;", "", "accountNumber", "", "title", "subtitle", "underlying", "Lcom/robinhood/shared/history/compose/Underlying;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/history/compose/Underlying;)V", "getAccountNumber", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getUnderlying", "()Lcom/robinhood/shared/history/compose/Underlying;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-history-compose_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BaseDetailState {
    public static final int $stable = 0;
    private final String accountNumber;
    private final String subtitle;
    private final String title;
    private final Underlying underlying;

    public BaseDetailState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BaseDetailState copy$default(BaseDetailState baseDetailState, String str, String str2, String str3, Underlying underlying, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baseDetailState.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = baseDetailState.title;
        }
        if ((i & 4) != 0) {
            str3 = baseDetailState.subtitle;
        }
        if ((i & 8) != 0) {
            underlying = baseDetailState.underlying;
        }
        return baseDetailState.copy(str, str2, str3, underlying);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Underlying getUnderlying() {
        return this.underlying;
    }

    public final BaseDetailState copy(String accountNumber, String title, String subtitle, Underlying underlying) {
        return new BaseDetailState(accountNumber, title, subtitle, underlying);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseDetailState)) {
            return false;
        }
        BaseDetailState baseDetailState = (BaseDetailState) other;
        return Intrinsics.areEqual(this.accountNumber, baseDetailState.accountNumber) && Intrinsics.areEqual(this.title, baseDetailState.title) && Intrinsics.areEqual(this.subtitle, baseDetailState.subtitle) && Intrinsics.areEqual(this.underlying, baseDetailState.underlying);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Underlying underlying = this.underlying;
        return iHashCode3 + (underlying != null ? underlying.hashCode() : 0);
    }

    public String toString() {
        return "BaseDetailState(accountNumber=" + this.accountNumber + ", title=" + this.title + ", subtitle=" + this.subtitle + ", underlying=" + this.underlying + ")";
    }

    public BaseDetailState(String str, String str2, String str3, Underlying underlying) {
        this.accountNumber = str;
        this.title = str2;
        this.subtitle = str3;
        this.underlying = underlying;
    }

    public /* synthetic */ BaseDetailState(String str, String str2, String str3, Underlying underlying, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : underlying);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Underlying getUnderlying() {
        return this.underlying;
    }
}
