package com.robinhood.android.crypto.p094ui.detail.recurring;

import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoDetailRecurringViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003Js\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\tHÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\tHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001a¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringViewState;", "", "showRecurringHeaderView", "", "showRecurringHeaderInfoIcon", "showRecurringNuxView", "showRecurringListView", "showHistoryAllCta", "ctaText", "", "recurringScheduleHistoryItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "title", "<init>", "(ZZZZZILkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;I)V", "getShowRecurringHeaderView", "()Z", "getShowRecurringHeaderInfoIcon", "getShowRecurringNuxView", "getShowRecurringListView", "getShowHistoryAllCta", "getCtaText", "()I", "getRecurringScheduleHistoryItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailRecurringViewState {
    public static final int $stable = 8;
    private final int ctaText;
    private final UiCurrencyPair currencyPair;
    private final ImmutableList<StatefulHistoryEvent<HistoryEvent>> recurringScheduleHistoryItems;
    private final boolean showHistoryAllCta;
    private final boolean showRecurringHeaderInfoIcon;
    private final boolean showRecurringHeaderView;
    private final boolean showRecurringListView;
    private final boolean showRecurringNuxView;
    private final int title;

    public static /* synthetic */ CryptoDetailRecurringViewState copy$default(CryptoDetailRecurringViewState cryptoDetailRecurringViewState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, ImmutableList immutableList, UiCurrencyPair uiCurrencyPair, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = cryptoDetailRecurringViewState.showRecurringHeaderView;
        }
        if ((i3 & 2) != 0) {
            z2 = cryptoDetailRecurringViewState.showRecurringHeaderInfoIcon;
        }
        if ((i3 & 4) != 0) {
            z3 = cryptoDetailRecurringViewState.showRecurringNuxView;
        }
        if ((i3 & 8) != 0) {
            z4 = cryptoDetailRecurringViewState.showRecurringListView;
        }
        if ((i3 & 16) != 0) {
            z5 = cryptoDetailRecurringViewState.showHistoryAllCta;
        }
        if ((i3 & 32) != 0) {
            i = cryptoDetailRecurringViewState.ctaText;
        }
        if ((i3 & 64) != 0) {
            immutableList = cryptoDetailRecurringViewState.recurringScheduleHistoryItems;
        }
        if ((i3 & 128) != 0) {
            uiCurrencyPair = cryptoDetailRecurringViewState.currencyPair;
        }
        if ((i3 & 256) != 0) {
            i2 = cryptoDetailRecurringViewState.title;
        }
        UiCurrencyPair uiCurrencyPair2 = uiCurrencyPair;
        int i4 = i2;
        int i5 = i;
        ImmutableList immutableList2 = immutableList;
        boolean z6 = z5;
        boolean z7 = z3;
        return cryptoDetailRecurringViewState.copy(z, z2, z7, z4, z6, i5, immutableList2, uiCurrencyPair2, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowRecurringHeaderView() {
        return this.showRecurringHeaderView;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowRecurringHeaderInfoIcon() {
        return this.showRecurringHeaderInfoIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowRecurringNuxView() {
        return this.showRecurringNuxView;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowRecurringListView() {
        return this.showRecurringListView;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowHistoryAllCta() {
        return this.showHistoryAllCta;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCtaText() {
        return this.ctaText;
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> component7() {
        return this.recurringScheduleHistoryItems;
    }

    /* renamed from: component8, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    public final CryptoDetailRecurringViewState copy(boolean showRecurringHeaderView, boolean showRecurringHeaderInfoIcon, boolean showRecurringNuxView, boolean showRecurringListView, boolean showHistoryAllCta, int ctaText, ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> recurringScheduleHistoryItems, UiCurrencyPair currencyPair, int title) {
        return new CryptoDetailRecurringViewState(showRecurringHeaderView, showRecurringHeaderInfoIcon, showRecurringNuxView, showRecurringListView, showHistoryAllCta, ctaText, recurringScheduleHistoryItems, currencyPair, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailRecurringViewState)) {
            return false;
        }
        CryptoDetailRecurringViewState cryptoDetailRecurringViewState = (CryptoDetailRecurringViewState) other;
        return this.showRecurringHeaderView == cryptoDetailRecurringViewState.showRecurringHeaderView && this.showRecurringHeaderInfoIcon == cryptoDetailRecurringViewState.showRecurringHeaderInfoIcon && this.showRecurringNuxView == cryptoDetailRecurringViewState.showRecurringNuxView && this.showRecurringListView == cryptoDetailRecurringViewState.showRecurringListView && this.showHistoryAllCta == cryptoDetailRecurringViewState.showHistoryAllCta && this.ctaText == cryptoDetailRecurringViewState.ctaText && Intrinsics.areEqual(this.recurringScheduleHistoryItems, cryptoDetailRecurringViewState.recurringScheduleHistoryItems) && Intrinsics.areEqual(this.currencyPair, cryptoDetailRecurringViewState.currencyPair) && this.title == cryptoDetailRecurringViewState.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.showRecurringHeaderView) * 31) + Boolean.hashCode(this.showRecurringHeaderInfoIcon)) * 31) + Boolean.hashCode(this.showRecurringNuxView)) * 31) + Boolean.hashCode(this.showRecurringListView)) * 31) + Boolean.hashCode(this.showHistoryAllCta)) * 31) + Integer.hashCode(this.ctaText)) * 31;
        ImmutableList<StatefulHistoryEvent<HistoryEvent>> immutableList = this.recurringScheduleHistoryItems;
        int iHashCode2 = (iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        return ((iHashCode2 + (uiCurrencyPair != null ? uiCurrencyPair.hashCode() : 0)) * 31) + Integer.hashCode(this.title);
    }

    public String toString() {
        return "CryptoDetailRecurringViewState(showRecurringHeaderView=" + this.showRecurringHeaderView + ", showRecurringHeaderInfoIcon=" + this.showRecurringHeaderInfoIcon + ", showRecurringNuxView=" + this.showRecurringNuxView + ", showRecurringListView=" + this.showRecurringListView + ", showHistoryAllCta=" + this.showHistoryAllCta + ", ctaText=" + this.ctaText + ", recurringScheduleHistoryItems=" + this.recurringScheduleHistoryItems + ", currencyPair=" + this.currencyPair + ", title=" + this.title + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoDetailRecurringViewState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> immutableList, UiCurrencyPair uiCurrencyPair, int i2) {
        this.showRecurringHeaderView = z;
        this.showRecurringHeaderInfoIcon = z2;
        this.showRecurringNuxView = z3;
        this.showRecurringListView = z4;
        this.showHistoryAllCta = z5;
        this.ctaText = i;
        this.recurringScheduleHistoryItems = immutableList;
        this.currencyPair = uiCurrencyPair;
        this.title = i2;
    }

    public final boolean getShowRecurringHeaderView() {
        return this.showRecurringHeaderView;
    }

    public final boolean getShowRecurringHeaderInfoIcon() {
        return this.showRecurringHeaderInfoIcon;
    }

    public final boolean getShowRecurringNuxView() {
        return this.showRecurringNuxView;
    }

    public final boolean getShowRecurringListView() {
        return this.showRecurringListView;
    }

    public final boolean getShowHistoryAllCta() {
        return this.showHistoryAllCta;
    }

    public final int getCtaText() {
        return this.ctaText;
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> getRecurringScheduleHistoryItems() {
        return this.recurringScheduleHistoryItems;
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final int getTitle() {
        return this.title;
    }
}
