package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackUpsellViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellViewState;", "", "title", "", "subtitle", "merchantOffer", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getMerchantOffer", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FlatCashbackUpsellViewState {
    private static final FlatCashbackUpsellViewState mock;
    private final MerchantOfferV2 merchantOffer;
    private final String subtitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ FlatCashbackUpsellViewState copy$default(FlatCashbackUpsellViewState flatCashbackUpsellViewState, String str, String str2, MerchantOfferV2 merchantOfferV2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flatCashbackUpsellViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = flatCashbackUpsellViewState.subtitle;
        }
        if ((i & 4) != 0) {
            merchantOfferV2 = flatCashbackUpsellViewState.merchantOffer;
        }
        return flatCashbackUpsellViewState.copy(str, str2, merchantOfferV2);
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
    public final MerchantOfferV2 getMerchantOffer() {
        return this.merchantOffer;
    }

    public final FlatCashbackUpsellViewState copy(String title, String subtitle, MerchantOfferV2 merchantOffer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
        return new FlatCashbackUpsellViewState(title, subtitle, merchantOffer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlatCashbackUpsellViewState)) {
            return false;
        }
        FlatCashbackUpsellViewState flatCashbackUpsellViewState = (FlatCashbackUpsellViewState) other;
        return Intrinsics.areEqual(this.title, flatCashbackUpsellViewState.title) && Intrinsics.areEqual(this.subtitle, flatCashbackUpsellViewState.subtitle) && Intrinsics.areEqual(this.merchantOffer, flatCashbackUpsellViewState.merchantOffer);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.merchantOffer.hashCode();
    }

    public String toString() {
        return "FlatCashbackUpsellViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", merchantOffer=" + this.merchantOffer + ")";
    }

    public FlatCashbackUpsellViewState(String title, String subtitle, MerchantOfferV2 merchantOffer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
        this.title = title;
        this.subtitle = subtitle;
        this.merchantOffer = merchantOffer;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final MerchantOfferV2 getMerchantOffer() {
        return this.merchantOffer;
    }

    /* compiled from: FlatCashbackUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellViewState$Companion;", "", "<init>", "()V", "mock", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellViewState;", "getMock$feature_cash_flat_cashback_externalDebug", "()Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellViewState;", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FlatCashbackUpsellViewState getMock$feature_cash_flat_cashback_externalDebug() {
            return FlatCashbackUpsellViewState.mock;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        mock = new FlatCashbackUpsellViewState("---- -- ---- -- --- --- ---------", "--- ---- ---- ------ -- - --- ---- ---- ----- --- ----- ----- ----- ----- ---- ---- -- --- --", new MerchantOfferV2(uuidRandomUUID, null, "", "", "", new MerchantOfferV2.DetailAsset.Image("", 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), CollectionsKt.emptyList(), null, null, null, null, true, 0, null, null, null, "", null, false, 4096, null));
    }
}
