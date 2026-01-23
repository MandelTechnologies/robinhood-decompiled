package com.robinhood.android.cash.flat.cashback.p071ui.bottomsheet;

import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackUpsellBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetViewState;", "", "title", "", "merchantOffer", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;)V", "getTitle", "()Ljava/lang/String;", "getMerchantOffer", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "isPromoLocked", "", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FlatCashbackUpsellBottomSheetViewState {
    private static final FlatCashbackUpsellBottomSheetViewState mock;
    private final MerchantOfferV2 merchantOffer;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ FlatCashbackUpsellBottomSheetViewState copy$default(FlatCashbackUpsellBottomSheetViewState flatCashbackUpsellBottomSheetViewState, String str, MerchantOfferV2 merchantOfferV2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flatCashbackUpsellBottomSheetViewState.title;
        }
        if ((i & 2) != 0) {
            merchantOfferV2 = flatCashbackUpsellBottomSheetViewState.merchantOffer;
        }
        return flatCashbackUpsellBottomSheetViewState.copy(str, merchantOfferV2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final MerchantOfferV2 getMerchantOffer() {
        return this.merchantOffer;
    }

    public final FlatCashbackUpsellBottomSheetViewState copy(String title, MerchantOfferV2 merchantOffer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
        return new FlatCashbackUpsellBottomSheetViewState(title, merchantOffer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlatCashbackUpsellBottomSheetViewState)) {
            return false;
        }
        FlatCashbackUpsellBottomSheetViewState flatCashbackUpsellBottomSheetViewState = (FlatCashbackUpsellBottomSheetViewState) other;
        return Intrinsics.areEqual(this.title, flatCashbackUpsellBottomSheetViewState.title) && Intrinsics.areEqual(this.merchantOffer, flatCashbackUpsellBottomSheetViewState.merchantOffer);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.merchantOffer.hashCode();
    }

    public String toString() {
        return "FlatCashbackUpsellBottomSheetViewState(title=" + this.title + ", merchantOffer=" + this.merchantOffer + ")";
    }

    public FlatCashbackUpsellBottomSheetViewState(String title, MerchantOfferV2 merchantOffer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
        this.title = title;
        this.merchantOffer = merchantOffer;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MerchantOfferV2 getMerchantOffer() {
        return this.merchantOffer;
    }

    public final boolean isPromoLocked() {
        return Intrinsics.areEqual(this.merchantOffer.getLocked(), Boolean.TRUE);
    }

    /* compiled from: FlatCashbackUpsellBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetViewState$Companion;", "", "<init>", "()V", "mock", "Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetViewState;", "getMock$feature_cash_flat_cashback_externalDebug", "()Lcom/robinhood/android/cash/flat/cashback/ui/bottomsheet/FlatCashbackUpsellBottomSheetViewState;", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FlatCashbackUpsellBottomSheetViewState getMock$feature_cash_flat_cashback_externalDebug() {
            return FlatCashbackUpsellBottomSheetViewState.mock;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        mock = new FlatCashbackUpsellBottomSheetViewState("--- -- ---- ---- -- -------- --- --- ------- --------- ---- ------ -------", new MerchantOfferV2(uuidRandomUUID, null, "", "", "", new MerchantOfferV2.DetailAsset.Image("", 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), CollectionsKt.emptyList(), null, null, null, null, true, 0, null, null, Boolean.TRUE, "", null, false, 4096, null));
    }
}
