package com.robinhood.android.cash.rhy.tab.p077v2.settings;

import android.content.Context;
import com.robinhood.android.cash.rhy.tab.C10285R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyMailCardViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyMailCardViewState;", "", "isLoading", "", "cardEta", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getCardEta", "context", "Landroid/content/Context;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RhyMailCardViewState {
    public static final int $stable = 0;
    private final String cardEta;
    private final boolean isLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public RhyMailCardViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component2, reason: from getter */
    private final String getCardEta() {
        return this.cardEta;
    }

    public static /* synthetic */ RhyMailCardViewState copy$default(RhyMailCardViewState rhyMailCardViewState, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rhyMailCardViewState.isLoading;
        }
        if ((i & 2) != 0) {
            str = rhyMailCardViewState.cardEta;
        }
        return rhyMailCardViewState.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final RhyMailCardViewState copy(boolean isLoading, String cardEta) {
        return new RhyMailCardViewState(isLoading, cardEta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyMailCardViewState)) {
            return false;
        }
        RhyMailCardViewState rhyMailCardViewState = (RhyMailCardViewState) other;
        return this.isLoading == rhyMailCardViewState.isLoading && Intrinsics.areEqual(this.cardEta, rhyMailCardViewState.cardEta);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        String str = this.cardEta;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RhyMailCardViewState(isLoading=" + this.isLoading + ", cardEta=" + this.cardEta + ")";
    }

    public RhyMailCardViewState(boolean z, String str) {
        this.isLoading = z;
        this.cardEta = str;
    }

    public /* synthetic */ RhyMailCardViewState(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getCardEta(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.cardEta;
        if (str != null) {
            return str;
        }
        String string2 = context.getString(C10285R.string.rhy_mail_card_estimated_shipping_fallback);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
