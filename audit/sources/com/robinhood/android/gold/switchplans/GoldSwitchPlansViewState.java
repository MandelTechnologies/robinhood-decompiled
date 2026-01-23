package com.robinhood.android.gold.switchplans;

import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import midas.service.p509v1.GoldPlanSelectionOption;
import midas.service.p509v1.PlanSelectionPageContent;
import midas.service.p509v1.SwitchPlansConfirmationContent;
import midas.service.p509v1.SwitchPlansContentResponse;
import midas.service.p509v1.UpsellScreenContent;
import okio.ByteString;

/* compiled from: GoldSwitchPlansViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Companion", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState$Error;", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState$Loaded;", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState$Loading;", "feature-gold-switch-plans_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldSwitchPlansViewState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Loaded loadingMock;

    public /* synthetic */ GoldSwitchPlansViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoldSwitchPlansViewState() {
    }

    /* compiled from: GoldSwitchPlansViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState$Loading;", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-switch-plans_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends GoldSwitchPlansViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 651799030;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: GoldSwitchPlansViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState$Loaded;", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState;", "switchPlans", "Lmidas/service/v1/SwitchPlansContentResponse;", "<init>", "(Lmidas/service/v1/SwitchPlansContentResponse;)V", "getSwitchPlans", "()Lmidas/service/v1/SwitchPlansContentResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-switch-plans_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends GoldSwitchPlansViewState {
        public static final int $stable = 8;
        private final SwitchPlansContentResponse switchPlans;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, SwitchPlansContentResponse switchPlansContentResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                switchPlansContentResponse = loaded.switchPlans;
            }
            return loaded.copy(switchPlansContentResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final SwitchPlansContentResponse getSwitchPlans() {
            return this.switchPlans;
        }

        public final Loaded copy(SwitchPlansContentResponse switchPlans) {
            Intrinsics.checkNotNullParameter(switchPlans, "switchPlans");
            return new Loaded(switchPlans);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.switchPlans, ((Loaded) other).switchPlans);
        }

        public int hashCode() {
            return this.switchPlans.hashCode();
        }

        public String toString() {
            return "Loaded(switchPlans=" + this.switchPlans + ")";
        }

        public final SwitchPlansContentResponse getSwitchPlans() {
            return this.switchPlans;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(SwitchPlansContentResponse switchPlans) {
            super(null);
            Intrinsics.checkNotNullParameter(switchPlans, "switchPlans");
            this.switchPlans = switchPlans;
        }
    }

    /* compiled from: GoldSwitchPlansViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState$Error;", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-switch-plans_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends GoldSwitchPlansViewState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: GoldSwitchPlansViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState$Loaded;", "getLoadingMock", "()Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState$Loaded;", "feature-gold-switch-plans_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Loaded getLoadingMock() {
            return GoldSwitchPlansViewState.loadingMock;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        SwitchPlansConfirmationContent switchPlansConfirmationContent = null;
        UpsellScreenContent upsellScreenContent = null;
        ByteString byteString = null;
        loadingMock = new Loaded(new SwitchPlansContentResponse(new PlanSelectionPageContent("----- - ------- ----", CollectionsKt.listOf((Object[]) new GoldPlanSelectionOption[]{new GoldPlanSelectionOption(OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, null, null, "-- - ------ ------ ----- -- ----", null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null), new GoldPlanSelectionOption(OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, objArr, null, "-- - ------ ------ ----- -- ----", objArr2, objArr3, objArr4, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null)}), OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, 0 == true ? 1 : 0, 8, null), switchPlansConfirmationContent, upsellScreenContent, byteString, 14, null));
    }
}
