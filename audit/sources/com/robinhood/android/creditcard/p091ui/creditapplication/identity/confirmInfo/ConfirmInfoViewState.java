package com.robinhood.android.creditcard.p091ui.creditapplication.identity.confirmInfo;

import com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points.BonusPointsTextVariant;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse2;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/identity/confirmInfo/ConfirmInfoViewState;", "", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;", "showFreeGoldBottomSheet", "", "bonusPointsTextVariant", "Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;ZLcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;)V", "getInfo", "()Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;", "getShowFreeGoldBottomSheet", "()Z", "getBonusPointsTextVariant", "()Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ConfirmInfoViewState {
    public static final int $stable = 8;
    private final BonusPointsTextVariant bonusPointsTextVariant;
    private final IdentityDetailsPrefillResponse2 info;
    private final boolean showFreeGoldBottomSheet;

    public ConfirmInfoViewState() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ ConfirmInfoViewState copy$default(ConfirmInfoViewState confirmInfoViewState, IdentityDetailsPrefillResponse2 identityDetailsPrefillResponse2, boolean z, BonusPointsTextVariant bonusPointsTextVariant, int i, Object obj) {
        if ((i & 1) != 0) {
            identityDetailsPrefillResponse2 = confirmInfoViewState.info;
        }
        if ((i & 2) != 0) {
            z = confirmInfoViewState.showFreeGoldBottomSheet;
        }
        if ((i & 4) != 0) {
            bonusPointsTextVariant = confirmInfoViewState.bonusPointsTextVariant;
        }
        return confirmInfoViewState.copy(identityDetailsPrefillResponse2, z, bonusPointsTextVariant);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentityDetailsPrefillResponse2 getInfo() {
        return this.info;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowFreeGoldBottomSheet() {
        return this.showFreeGoldBottomSheet;
    }

    /* renamed from: component3, reason: from getter */
    public final BonusPointsTextVariant getBonusPointsTextVariant() {
        return this.bonusPointsTextVariant;
    }

    public final ConfirmInfoViewState copy(IdentityDetailsPrefillResponse2 info, boolean showFreeGoldBottomSheet, BonusPointsTextVariant bonusPointsTextVariant) {
        return new ConfirmInfoViewState(info, showFreeGoldBottomSheet, bonusPointsTextVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmInfoViewState)) {
            return false;
        }
        ConfirmInfoViewState confirmInfoViewState = (ConfirmInfoViewState) other;
        return Intrinsics.areEqual(this.info, confirmInfoViewState.info) && this.showFreeGoldBottomSheet == confirmInfoViewState.showFreeGoldBottomSheet && this.bonusPointsTextVariant == confirmInfoViewState.bonusPointsTextVariant;
    }

    public int hashCode() {
        IdentityDetailsPrefillResponse2 identityDetailsPrefillResponse2 = this.info;
        int iHashCode = (((identityDetailsPrefillResponse2 == null ? 0 : identityDetailsPrefillResponse2.hashCode()) * 31) + Boolean.hashCode(this.showFreeGoldBottomSheet)) * 31;
        BonusPointsTextVariant bonusPointsTextVariant = this.bonusPointsTextVariant;
        return iHashCode + (bonusPointsTextVariant != null ? bonusPointsTextVariant.hashCode() : 0);
    }

    public String toString() {
        return "ConfirmInfoViewState(info=" + this.info + ", showFreeGoldBottomSheet=" + this.showFreeGoldBottomSheet + ", bonusPointsTextVariant=" + this.bonusPointsTextVariant + ")";
    }

    public ConfirmInfoViewState(IdentityDetailsPrefillResponse2 identityDetailsPrefillResponse2, boolean z, BonusPointsTextVariant bonusPointsTextVariant) {
        this.info = identityDetailsPrefillResponse2;
        this.showFreeGoldBottomSheet = z;
        this.bonusPointsTextVariant = bonusPointsTextVariant;
    }

    public /* synthetic */ ConfirmInfoViewState(IdentityDetailsPrefillResponse2 identityDetailsPrefillResponse2, boolean z, BonusPointsTextVariant bonusPointsTextVariant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : identityDetailsPrefillResponse2, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : bonusPointsTextVariant);
    }

    public final IdentityDetailsPrefillResponse2 getInfo() {
        return this.info;
    }

    public final boolean getShowFreeGoldBottomSheet() {
        return this.showFreeGoldBottomSheet;
    }

    public final BonusPointsTextVariant getBonusPointsTextVariant() {
        return this.bonusPointsTextVariant;
    }
}
