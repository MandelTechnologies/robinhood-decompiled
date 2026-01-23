package com.robinhood.android.transfers.p271ui.max.i18n.details;

import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkBankTransferDetailsViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsViewState;", "", "amountTitle", "", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "contentList", "", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsRow;", "isCancelable", "", "showLoadingView", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;ZZ)V", "getAmountTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getContentList", "()Ljava/util/List;", "()Z", "getShowLoadingView", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UkBankTransferDetailsViewState {
    private static final UkBankTransferDetailsViewState loadingMock;
    private final String amountTitle;
    private final List<UkBankTransferDetailsRow> contentList;
    private final boolean isCancelable;
    private final boolean showLoadingView;
    private final StringResource subtitle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ UkBankTransferDetailsViewState copy$default(UkBankTransferDetailsViewState ukBankTransferDetailsViewState, String str, StringResource stringResource, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ukBankTransferDetailsViewState.amountTitle;
        }
        if ((i & 2) != 0) {
            stringResource = ukBankTransferDetailsViewState.subtitle;
        }
        if ((i & 4) != 0) {
            list = ukBankTransferDetailsViewState.contentList;
        }
        if ((i & 8) != 0) {
            z = ukBankTransferDetailsViewState.isCancelable;
        }
        if ((i & 16) != 0) {
            z2 = ukBankTransferDetailsViewState.showLoadingView;
        }
        boolean z3 = z2;
        List list2 = list;
        return ukBankTransferDetailsViewState.copy(str, stringResource, list2, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAmountTitle() {
        return this.amountTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final List<UkBankTransferDetailsRow> component3() {
        return this.contentList;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCancelable() {
        return this.isCancelable;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final UkBankTransferDetailsViewState copy(String amountTitle, StringResource subtitle, List<UkBankTransferDetailsRow> contentList, boolean isCancelable, boolean showLoadingView) {
        Intrinsics.checkNotNullParameter(amountTitle, "amountTitle");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new UkBankTransferDetailsViewState(amountTitle, subtitle, contentList, isCancelable, showLoadingView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkBankTransferDetailsViewState)) {
            return false;
        }
        UkBankTransferDetailsViewState ukBankTransferDetailsViewState = (UkBankTransferDetailsViewState) other;
        return Intrinsics.areEqual(this.amountTitle, ukBankTransferDetailsViewState.amountTitle) && Intrinsics.areEqual(this.subtitle, ukBankTransferDetailsViewState.subtitle) && Intrinsics.areEqual(this.contentList, ukBankTransferDetailsViewState.contentList) && this.isCancelable == ukBankTransferDetailsViewState.isCancelable && this.showLoadingView == ukBankTransferDetailsViewState.showLoadingView;
    }

    public int hashCode() {
        int iHashCode = ((this.amountTitle.hashCode() * 31) + this.subtitle.hashCode()) * 31;
        List<UkBankTransferDetailsRow> list = this.contentList;
        return ((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isCancelable)) * 31) + Boolean.hashCode(this.showLoadingView);
    }

    public String toString() {
        return "UkBankTransferDetailsViewState(amountTitle=" + this.amountTitle + ", subtitle=" + this.subtitle + ", contentList=" + this.contentList + ", isCancelable=" + this.isCancelable + ", showLoadingView=" + this.showLoadingView + ")";
    }

    public UkBankTransferDetailsViewState(String amountTitle, StringResource subtitle, List<UkBankTransferDetailsRow> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(amountTitle, "amountTitle");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.amountTitle = amountTitle;
        this.subtitle = subtitle;
        this.contentList = list;
        this.isCancelable = z;
        this.showLoadingView = z2;
    }

    public final String getAmountTitle() {
        return this.amountTitle;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final List<UkBankTransferDetailsRow> getContentList() {
        return this.contentList;
    }

    public final boolean isCancelable() {
        return this.isCancelable;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    /* compiled from: UkBankTransferDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsViewState;", "getLoadingMock", "()Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsViewState;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UkBankTransferDetailsViewState getLoadingMock() {
            return UkBankTransferDetailsViewState.loadingMock;
        }
    }

    static {
        StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("-------");
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            StringResource.Companion companion = StringResource.INSTANCE;
            arrayList.add(new UkBankTransferDetailsRow(companion.invoke(OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER), companion.invoke("----------"), null, 4, null));
        }
        loadingMock = new UkBankTransferDetailsViewState("---------", stringResourceInvoke, arrayList, false, true);
    }
}
