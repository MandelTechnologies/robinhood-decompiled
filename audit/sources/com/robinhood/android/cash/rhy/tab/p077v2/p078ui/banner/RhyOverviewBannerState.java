package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.banner;

import android.content.Context;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.banner.RhyOverviewBannerState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.rhy.contracts.CardBackorder;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.p355ui.bonfire.rhy.RhsNoaRedirectStatus;
import com.robinhood.prefs.LongPreference;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOverviewBannerState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState;", "", "logIdentifier", "", "<init>", "(Ljava/lang/String;)V", "getLogIdentifier", "()Ljava/lang/String;", "Hidden", "Visible", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class RhyOverviewBannerState {
    public static final int $stable = 0;
    private final String logIdentifier;

    public /* synthetic */ RhyOverviewBannerState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private RhyOverviewBannerState(String str) {
        this.logIdentifier = str;
    }

    public final String getLogIdentifier() {
        return this.logIdentifier;
    }

    /* compiled from: RhyOverviewBannerState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Hidden extends RhyOverviewBannerState {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        private Hidden() {
            super("hidden", null);
        }
    }

    /* compiled from: RhyOverviewBannerState.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\"#$%&'()*+,-B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0001\u000b./012345678¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState;", "logIdentifier", "", "<init>", "(Ljava/lang/String;)V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "bannerDismissAction", "Lkotlin/Function0;", "getBannerDismissAction", "()Lkotlin/jvm/functions/Function0;", "BannerActionParams", "ActivateCard", "SetPin", "CardLocked", "CardRestricted", "CardBackordered", "UnauthorizedTransaction", "NegativeBalance", "AddToGooglePay", "FirstTimeFunding", "RhsNoaRedirect", "DeactivatedAccount", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$ActivateCard;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$AddToGooglePay;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$CardBackordered;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$CardLocked;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$CardRestricted;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$DeactivatedAccount;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$FirstTimeFunding;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$NegativeBalance;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$RhsNoaRedirect;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$SetPin;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$UnauthorizedTransaction;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Visible extends RhyOverviewBannerState {
        public static final int $stable = 0;

        public /* synthetic */ Visible(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public abstract Function1<BannerActionParams, Unit> getBannerAction();

        public abstract StringResource getBannerCtaText();

        public Function0<Unit> getBannerDismissAction() {
            return null;
        }

        public abstract ServerToBentoAssetMapper2 getBannerIcon();

        public abstract int getBannerIconRes();

        public abstract StringResource getBannerText();

        public abstract RhyOverviewBannerType getBannerType();

        private Visible(String str) {
            super(str, null);
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;)V", "getContext", "()Landroid/content/Context;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BannerActionParams {
            public static final int $stable = 8;
            private final Context context;
            private final Navigator navigator;

            public static /* synthetic */ BannerActionParams copy$default(BannerActionParams bannerActionParams, Context context, Navigator navigator, int i, Object obj) {
                if ((i & 1) != 0) {
                    context = bannerActionParams.context;
                }
                if ((i & 2) != 0) {
                    navigator = bannerActionParams.navigator;
                }
                return bannerActionParams.copy(context, navigator);
            }

            /* renamed from: component1, reason: from getter */
            public final Context getContext() {
                return this.context;
            }

            /* renamed from: component2, reason: from getter */
            public final Navigator getNavigator() {
                return this.navigator;
            }

            public final BannerActionParams copy(Context context, Navigator navigator) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                return new BannerActionParams(context, navigator);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BannerActionParams)) {
                    return false;
                }
                BannerActionParams bannerActionParams = (BannerActionParams) other;
                return Intrinsics.areEqual(this.context, bannerActionParams.context) && Intrinsics.areEqual(this.navigator, bannerActionParams.navigator);
            }

            public int hashCode() {
                return (this.context.hashCode() * 31) + this.navigator.hashCode();
            }

            public String toString() {
                return "BannerActionParams(context=" + this.context + ", navigator=" + this.navigator + ")";
            }

            public BannerActionParams(Context context, Navigator navigator) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                this.context = context;
                this.navigator = navigator;
            }

            public final Context getContext() {
                return this.context;
            }

            public final Navigator getNavigator() {
                return this.navigator;
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010&\u001a\u00020\u0003HÂ\u0003J\u0013\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\rHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u000fR\u0014\u0010$\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000f¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$ActivateCard;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;)V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "cardId", "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "bannerTextRes", "getBannerTextRes", "bannerCtaRes", "getBannerCtaRes", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ActivateCard extends Visible {
            public static final int $stable = 8;
            private final RhyOverviewBannerType bannerType;
            private final PaymentCard paymentCard;

            /* renamed from: component1, reason: from getter */
            private final PaymentCard getPaymentCard() {
                return this.paymentCard;
            }

            public static /* synthetic */ ActivateCard copy$default(ActivateCard activateCard, PaymentCard paymentCard, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentCard = activateCard.paymentCard;
                }
                return activateCard.copy(paymentCard);
            }

            public final ActivateCard copy(PaymentCard paymentCard) {
                Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
                return new ActivateCard(paymentCard);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ActivateCard) && Intrinsics.areEqual(this.paymentCard, ((ActivateCard) other).paymentCard);
            }

            public int hashCode() {
                return this.paymentCard.hashCode();
            }

            public String toString() {
                return "ActivateCard(paymentCard=" + this.paymentCard + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivateCard(PaymentCard paymentCard) {
                super("activate_card", null);
                Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
                this.paymentCard = paymentCard;
                this.bannerType = RhyOverviewBannerType.NORMAL;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(getBannerTextRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return StringResource.INSTANCE.invoke(getBannerCtaRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_payment_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.PAYMENT_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return this.bannerType;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$ActivateCard$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewBannerState.Visible.ActivateCard._get_bannerAction_$lambda$0(this.f$0, (RhyOverviewBannerState.Visible.BannerActionParams) obj);
                    }
                };
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerAction_$lambda$0(ActivateCard activateCard, BannerActionParams bannerActionParams) {
                Intrinsics.checkNotNullParameter(bannerActionParams, "<destruct>");
                Navigator.DefaultImpls.startActivity$default(bannerActionParams.getNavigator(), bannerActionParams.getContext(), new LegacyIntentKey.ActivateCard(activateCard.getCardId()), null, false, null, null, 60, null);
                return Unit.INSTANCE;
            }

            public final UUID getCardId() {
                return this.paymentCard.getId();
            }

            private final int getBannerTextRes() {
                return C10285R.string.rhy_overview_card_banner_activate_card_text;
            }

            private final int getBannerCtaRes() {
                return C10285R.string.rhy_overview_card_banner_activate_card_cta;
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010)\u001a\u00020\u0003HÂ\u0003J\u0013\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\rHÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0014\u0010%\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u000fR\u0014\u0010'\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u000f¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$SetPin;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;)V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "cardId", "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "isCardVirtual", "", "()Z", "bannerTextRes", "getBannerTextRes", "bannerCtaRes", "getBannerCtaRes", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SetPin extends Visible {
            public static final int $stable = 8;
            private final RhyOverviewBannerType bannerType;
            private final PaymentCard paymentCard;

            /* renamed from: component1, reason: from getter */
            private final PaymentCard getPaymentCard() {
                return this.paymentCard;
            }

            public static /* synthetic */ SetPin copy$default(SetPin setPin, PaymentCard paymentCard, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentCard = setPin.paymentCard;
                }
                return setPin.copy(paymentCard);
            }

            public final SetPin copy(PaymentCard paymentCard) {
                Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
                return new SetPin(paymentCard);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPin) && Intrinsics.areEqual(this.paymentCard, ((SetPin) other).paymentCard);
            }

            public int hashCode() {
                return this.paymentCard.hashCode();
            }

            public String toString() {
                return "SetPin(paymentCard=" + this.paymentCard + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetPin(PaymentCard paymentCard) {
                super("set_pin", null);
                Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
                this.paymentCard = paymentCard;
                this.bannerType = RhyOverviewBannerType.NORMAL;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(getBannerTextRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return StringResource.INSTANCE.invoke(getBannerCtaRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_payment_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.PAYMENT_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return this.bannerType;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$SetPin$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewBannerState.Visible.SetPin._get_bannerAction_$lambda$0(this.f$0, (RhyOverviewBannerState.Visible.BannerActionParams) obj);
                    }
                };
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerAction_$lambda$0(SetPin setPin, BannerActionParams bannerActionParams) {
                Intrinsics.checkNotNullParameter(bannerActionParams, "<destruct>");
                Navigator.DefaultImpls.startActivity$default(bannerActionParams.getNavigator(), bannerActionParams.getContext(), new LegacyIntentKey.ChangeCardPin(setPin.getCardId(), setPin.isCardVirtual(), LegacyIntentKey.ChangeCardPin.Action.SET_PIN), null, false, null, null, 60, null);
                return Unit.INSTANCE;
            }

            public final UUID getCardId() {
                return this.paymentCard.getId();
            }

            private final boolean isCardVirtual() {
                return this.paymentCard.isVirtual();
            }

            private final int getBannerTextRes() {
                return C10285R.string.rhy_overview_card_banner_set_your_pin_text;
            }

            private final int getBannerCtaRes() {
                return C10285R.string.rhy_overview_card_banner_set_your_pin_cta;
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$CardLocked;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "<init>", "()V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "bannerTextRes", "getBannerTextRes", "bannerCtaRes", "getBannerCtaRes", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CardLocked extends Visible {
            public static final int $stable = 0;
            public static final CardLocked INSTANCE = new CardLocked();
            private static final RhyOverviewBannerType bannerType = RhyOverviewBannerType.NORMAL;

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$CardLocked$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewBannerState.Visible.CardLocked._get_bannerAction_$lambda$0((RhyOverviewBannerState.Visible.BannerActionParams) obj);
                    }
                };
            }

            private CardLocked() {
                super("card_locked", null);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(getBannerTextRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return StringResource.INSTANCE.invoke(getBannerCtaRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_lock_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.LOCK_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return bannerType;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerAction_$lambda$0(BannerActionParams bannerActionParams) {
                Intrinsics.checkNotNullParameter(bannerActionParams, "<destruct>");
                Navigator.DefaultImpls.showFragment$default(bannerActionParams.getNavigator(), bannerActionParams.getContext(), new LegacyFragmentKey.RhyCardSettings(LegacyFragmentKey.RhyCardSettings.Action.UNLOCK_CARD), false, false, false, null, false, null, false, false, null, null, 4092, null);
                return Unit.INSTANCE;
            }

            private final int getBannerTextRes() {
                return C10285R.string.rhy_overview_card_banner_card_is_locked_text;
            }

            private final int getBannerCtaRes() {
                return C10285R.string.rhy_overview_card_banner_card_is_locked_cta;
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$CardRestricted;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "<init>", "()V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "bannerTextRes", "getBannerTextRes", "bannerCtaRes", "getBannerCtaRes", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CardRestricted extends Visible {
            public static final int $stable = 0;
            public static final CardRestricted INSTANCE = new CardRestricted();
            private static final RhyOverviewBannerType bannerType = RhyOverviewBannerType.WARNING;

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$CardRestricted$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewBannerState.Visible.CardRestricted._get_bannerAction_$lambda$0((RhyOverviewBannerState.Visible.BannerActionParams) obj);
                    }
                };
            }

            private CardRestricted() {
                super("card_restricted", null);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(getBannerTextRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return StringResource.INSTANCE.invoke(getBannerCtaRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_lock_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.LOCK_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return bannerType;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerAction_$lambda$0(BannerActionParams bannerActionParams) {
                Intrinsics.checkNotNullParameter(bannerActionParams, "<destruct>");
                Navigator.DefaultImpls.startActivity$default(bannerActionParams.getNavigator(), bannerActionParams.getContext(), new HostIntentKey.ShowFragmentInStandaloneRdsActivity(LegacyFragmentKey.CardRestrictedSupport.INSTANCE, false, false, false, false, false, false, 118, null), null, false, null, null, 60, null);
                return Unit.INSTANCE;
            }

            private final int getBannerTextRes() {
                return C10285R.string.rhy_overview_card_banner_card_is_restricted_text;
            }

            private final int getBannerCtaRes() {
                return C10285R.string.rhy_overview_card_banner_card_is_restricted_cta;
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u000fHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0011¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$CardBackordered;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;)V", "getPaymentCard", "()Lcom/robinhood/models/db/mcduckling/PaymentCard;", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "bannerTextRes", "getBannerTextRes", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CardBackordered extends Visible {
            public static final int $stable = 8;
            private final RhyOverviewBannerType bannerType;
            private final PaymentCard paymentCard;

            public static /* synthetic */ CardBackordered copy$default(CardBackordered cardBackordered, PaymentCard paymentCard, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentCard = cardBackordered.paymentCard;
                }
                return cardBackordered.copy(paymentCard);
            }

            /* renamed from: component1, reason: from getter */
            public final PaymentCard getPaymentCard() {
                return this.paymentCard;
            }

            public final CardBackordered copy(PaymentCard paymentCard) {
                return new CardBackordered(paymentCard);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CardBackordered) && Intrinsics.areEqual(this.paymentCard, ((CardBackordered) other).paymentCard);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return null;
            }

            public int hashCode() {
                PaymentCard paymentCard = this.paymentCard;
                if (paymentCard == null) {
                    return 0;
                }
                return paymentCard.hashCode();
            }

            public String toString() {
                return "CardBackordered(paymentCard=" + this.paymentCard + ")";
            }

            public final PaymentCard getPaymentCard() {
                return this.paymentCard;
            }

            public CardBackordered(PaymentCard paymentCard) {
                super("card_backordered", null);
                this.paymentCard = paymentCard;
                this.bannerType = RhyOverviewBannerType.NORMAL;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(getBannerTextRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_clock_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.CLOCK_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return this.bannerType;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$CardBackordered$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewBannerState.Visible.CardBackordered._get_bannerAction_$lambda$0(this.f$0, (RhyOverviewBannerState.Visible.BannerActionParams) obj);
                    }
                };
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerAction_$lambda$0(CardBackordered cardBackordered, BannerActionParams bannerActionParams) {
                Intrinsics.checkNotNullParameter(bannerActionParams, "<destruct>");
                Navigator.DefaultImpls.startActivity$default(bannerActionParams.getNavigator(), bannerActionParams.getContext(), new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new CardBackorder(cardBackordered.paymentCard, true), false, false, false, false, false, false, 118, null), null, false, null, null, 60, null);
                return Unit.INSTANCE;
            }

            private final int getBannerTextRes() {
                return C10285R.string.rhy_overview_card_banner_card_is_backordered_text;
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010&\u001a\u00020\u0003HÂ\u0003J\u0013\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\rHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u000fR\u0014\u0010$\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000f¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$UnauthorizedTransaction;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;)V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "cardId", "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "bannerTextRes", "getBannerTextRes", "bannerCtaRes", "getBannerCtaRes", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnauthorizedTransaction extends Visible {
            public static final int $stable = 8;
            private final RhyOverviewBannerType bannerType;
            private final PaymentCard paymentCard;

            /* renamed from: component1, reason: from getter */
            private final PaymentCard getPaymentCard() {
                return this.paymentCard;
            }

            public static /* synthetic */ UnauthorizedTransaction copy$default(UnauthorizedTransaction unauthorizedTransaction, PaymentCard paymentCard, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentCard = unauthorizedTransaction.paymentCard;
                }
                return unauthorizedTransaction.copy(paymentCard);
            }

            public final UnauthorizedTransaction copy(PaymentCard paymentCard) {
                Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
                return new UnauthorizedTransaction(paymentCard);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnauthorizedTransaction) && Intrinsics.areEqual(this.paymentCard, ((UnauthorizedTransaction) other).paymentCard);
            }

            public int hashCode() {
                return this.paymentCard.hashCode();
            }

            public String toString() {
                return "UnauthorizedTransaction(paymentCard=" + this.paymentCard + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnauthorizedTransaction(PaymentCard paymentCard) {
                super("unauthorized_transaction", null);
                Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
                this.paymentCard = paymentCard;
                this.bannerType = RhyOverviewBannerType.WARNING;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(getBannerTextRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return StringResource.INSTANCE.invoke(getBannerCtaRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_info_filled_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.INFO_FILLED_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return this.bannerType;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$UnauthorizedTransaction$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewBannerState.Visible.UnauthorizedTransaction._get_bannerAction_$lambda$0(this.f$0, (RhyOverviewBannerState.Visible.BannerActionParams) obj);
                    }
                };
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerAction_$lambda$0(UnauthorizedTransaction unauthorizedTransaction, BannerActionParams bannerActionParams) {
                Intrinsics.checkNotNullParameter(bannerActionParams, "<destruct>");
                Navigator.DefaultImpls.startActivity$default(bannerActionParams.getNavigator(), bannerActionParams.getContext(), new LegacyIntentKey.CardHelp(unauthorizedTransaction.getCardId(), LegacyIntentKey.CardHelp.LaunchMode.UNAUTHORIZED_TRANSACTION, null, 4, null), null, false, null, null, 60, null);
                return Unit.INSTANCE;
            }

            public final UUID getCardId() {
                return this.paymentCard.getId();
            }

            private final int getBannerTextRes() {
                return C10285R.string.rhy_overview_card_banner_unauthorized_transaction_text;
            }

            private final int getBannerCtaRes() {
                return C10285R.string.rhy_overview_card_banner_unauthorized_transaction_cta;
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$NegativeBalance;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "<init>", "()V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerTextRes", "", "getBannerTextRes", "()I", "bannerCtaRes", "getBannerCtaRes", "bannerIconRes", "getBannerIconRes", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NegativeBalance extends Visible {
            public static final int $stable = 0;
            public static final NegativeBalance INSTANCE = new NegativeBalance();
            private static final RhyOverviewBannerType bannerType = RhyOverviewBannerType.WARNING;

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$NegativeBalance$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewBannerState.Visible.NegativeBalance._get_bannerAction_$lambda$0((RhyOverviewBannerState.Visible.BannerActionParams) obj);
                    }
                };
            }

            private NegativeBalance() {
                super("negative_balance", null);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(getBannerTextRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return StringResource.INSTANCE.invoke(getBannerCtaRes(), new Object[0]);
            }

            private final int getBannerTextRes() {
                return C10285R.string.rhy_overview_card_banner_negative_balance_text;
            }

            private final int getBannerCtaRes() {
                return C10285R.string.rhy_overview_card_banner_negative_balance_cta;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_info_filled_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.INFO_FILLED_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return bannerType;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerAction_$lambda$0(BannerActionParams bannerActionParams) {
                Intrinsics.checkNotNullParameter(bannerActionParams, "<destruct>");
                Navigator.DefaultImpls.startActivity$default(bannerActionParams.getNavigator(), bannerActionParams.getContext(), new Transfer(new TransferConfiguration.Standard(null, null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHY, 3, null), null, null, null, false, false, null, null, false, 8167, null)), null, false, null, null, 60, null);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$AddToGooglePay;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "<init>", "()V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "bannerTextRes", "getBannerTextRes", "bannerCtaRes", "getBannerCtaRes", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AddToGooglePay extends Visible {
            public static final int $stable = 0;
            public static final AddToGooglePay INSTANCE = new AddToGooglePay();
            private static final RhyOverviewBannerType bannerType = RhyOverviewBannerType.NORMAL;

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return null;
            }

            private AddToGooglePay() {
                super("add_to_google_pay", null);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(getBannerTextRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return StringResource.INSTANCE.invoke(getBannerCtaRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_payment_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.PAYMENT_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return bannerType;
            }

            private final int getBannerTextRes() {
                return C10285R.string.rhy_add_to_google_pay_banner_text;
            }

            private final int getBannerCtaRes() {
                return C10285R.string.rhy_add_to_google_pay_banner_cta_text;
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$FirstTimeFunding;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "<init>", "()V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "bannerTextRes", "getBannerTextRes", "bannerCtaRes", "getBannerCtaRes", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class FirstTimeFunding extends Visible {
            public static final int $stable = 0;
            public static final FirstTimeFunding INSTANCE = new FirstTimeFunding();
            private static final RhyOverviewBannerType bannerType = RhyOverviewBannerType.NORMAL;

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$FirstTimeFunding$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewBannerState.Visible.FirstTimeFunding._get_bannerAction_$lambda$0((RhyOverviewBannerState.Visible.BannerActionParams) obj);
                    }
                };
            }

            private FirstTimeFunding() {
                super("first_time_funding", null);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(getBannerTextRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return StringResource.INSTANCE.invoke(getBannerCtaRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_payment_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.PAYMENT_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return bannerType;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerAction_$lambda$0(BannerActionParams bannerActionParams) {
                Intrinsics.checkNotNullParameter(bannerActionParams, "<destruct>");
                Navigator.DefaultImpls.startActivity$default(bannerActionParams.getNavigator(), bannerActionParams.getContext(), new Transfer(new TransferConfiguration.Standard(null, null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHY, 3, null), null, null, null, false, false, null, null, false, 8167, null)), null, false, null, null, 60, null);
                return Unit.INSTANCE;
            }

            private final int getBannerTextRes() {
                return C10285R.string.rhy_first_funding_banner_text;
            }

            private final int getBannerCtaRes() {
                return C10285R.string.rhy_first_funding_banner_cta_text;
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010&\u001a\u00020\u0003HÂ\u0003J\t\u0010'\u001a\u00020\u0005HÂ\u0003J\u001d\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u000fHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0011¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$RhsNoaRedirect;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "rhsNoaRedirectStatus", "Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;", "hasDismissedRhsNoaRedirectPref", "Lcom/robinhood/prefs/LongPreference;", "<init>", "(Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;Lcom/robinhood/prefs/LongPreference;)V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "bannerDismissAction", "Lkotlin/Function0;", "getBannerDismissAction", "()Lkotlin/jvm/functions/Function0;", "bannerCtaRes", "getBannerCtaRes", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RhsNoaRedirect extends Visible {
            private final RhyOverviewBannerType bannerType;
            private final LongPreference hasDismissedRhsNoaRedirectPref;
            private final RhsNoaRedirectStatus.PromptRedirect rhsNoaRedirectStatus;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            /* renamed from: component1, reason: from getter */
            private final RhsNoaRedirectStatus.PromptRedirect getRhsNoaRedirectStatus() {
                return this.rhsNoaRedirectStatus;
            }

            /* renamed from: component2, reason: from getter */
            private final LongPreference getHasDismissedRhsNoaRedirectPref() {
                return this.hasDismissedRhsNoaRedirectPref;
            }

            public static /* synthetic */ RhsNoaRedirect copy$default(RhsNoaRedirect rhsNoaRedirect, RhsNoaRedirectStatus.PromptRedirect promptRedirect, LongPreference longPreference, int i, Object obj) {
                if ((i & 1) != 0) {
                    promptRedirect = rhsNoaRedirect.rhsNoaRedirectStatus;
                }
                if ((i & 2) != 0) {
                    longPreference = rhsNoaRedirect.hasDismissedRhsNoaRedirectPref;
                }
                return rhsNoaRedirect.copy(promptRedirect, longPreference);
            }

            public final RhsNoaRedirect copy(RhsNoaRedirectStatus.PromptRedirect rhsNoaRedirectStatus, LongPreference hasDismissedRhsNoaRedirectPref) {
                Intrinsics.checkNotNullParameter(rhsNoaRedirectStatus, "rhsNoaRedirectStatus");
                Intrinsics.checkNotNullParameter(hasDismissedRhsNoaRedirectPref, "hasDismissedRhsNoaRedirectPref");
                return new RhsNoaRedirect(rhsNoaRedirectStatus, hasDismissedRhsNoaRedirectPref);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RhsNoaRedirect)) {
                    return false;
                }
                RhsNoaRedirect rhsNoaRedirect = (RhsNoaRedirect) other;
                return Intrinsics.areEqual(this.rhsNoaRedirectStatus, rhsNoaRedirect.rhsNoaRedirectStatus) && Intrinsics.areEqual(this.hasDismissedRhsNoaRedirectPref, rhsNoaRedirect.hasDismissedRhsNoaRedirectPref);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$RhsNoaRedirect$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewBannerState.Visible.RhsNoaRedirect._get_bannerAction_$lambda$0((RhyOverviewBannerState.Visible.BannerActionParams) obj);
                    }
                };
            }

            public int hashCode() {
                return (this.rhsNoaRedirectStatus.hashCode() * 31) + this.hasDismissedRhsNoaRedirectPref.hashCode();
            }

            public String toString() {
                return "RhsNoaRedirect(rhsNoaRedirectStatus=" + this.rhsNoaRedirectStatus + ", hasDismissedRhsNoaRedirectPref=" + this.hasDismissedRhsNoaRedirectPref + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhsNoaRedirect(RhsNoaRedirectStatus.PromptRedirect rhsNoaRedirectStatus, LongPreference hasDismissedRhsNoaRedirectPref) {
                RhyOverviewBannerType rhyOverviewBannerType;
                super(INSTANCE.getLogIdentifier(rhsNoaRedirectStatus), null);
                Intrinsics.checkNotNullParameter(rhsNoaRedirectStatus, "rhsNoaRedirectStatus");
                Intrinsics.checkNotNullParameter(hasDismissedRhsNoaRedirectPref, "hasDismissedRhsNoaRedirectPref");
                this.rhsNoaRedirectStatus = rhsNoaRedirectStatus;
                this.hasDismissedRhsNoaRedirectPref = hasDismissedRhsNoaRedirectPref;
                if (rhsNoaRedirectStatus.getType() == RhsNoaRedirectStatus.PromptRedirect.Type.WARNING) {
                    rhyOverviewBannerType = RhyOverviewBannerType.WARNING;
                } else {
                    rhyOverviewBannerType = RhyOverviewBannerType.NORMAL;
                }
                this.bannerType = rhyOverviewBannerType;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(C10285R.string.rhs_noa_redirect_banner_text, LocalDateFormatter.MEDIUM.format(Instants.toLocalDate$default(this.rhsNoaRedirectStatus.getExpireAt(), null, 1, null)));
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return StringResource.INSTANCE.invoke(getBannerCtaRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_info_filled_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.INFO_FILLED_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return this.bannerType;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerAction_$lambda$0(BannerActionParams bannerActionParams) {
                Intrinsics.checkNotNullParameter(bannerActionParams, "<destruct>");
                Navigator.DefaultImpls.startActivity$default(bannerActionParams.getNavigator(), bannerActionParams.getContext(), new DirectDepositShimKey(false, false, false, false, false, false, false, false, 255, null), null, false, null, null, 60, null);
                return Unit.INSTANCE;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function0<Unit> getBannerDismissAction() {
                if (this.rhsNoaRedirectStatus.getType() == RhsNoaRedirectStatus.PromptRedirect.Type.WARNING) {
                    return null;
                }
                return new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$RhsNoaRedirect$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyOverviewBannerState.Visible.RhsNoaRedirect._get_bannerDismissAction_$lambda$1(this.f$0);
                    }
                };
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerDismissAction_$lambda$1(RhsNoaRedirect rhsNoaRedirect) {
                rhsNoaRedirect.hasDismissedRhsNoaRedirectPref.set(rhsNoaRedirect.rhsNoaRedirectStatus.getLatestRhsDdRelationshipTime());
                return Unit.INSTANCE;
            }

            private final int getBannerCtaRes() {
                return C10285R.string.rhs_noa_redirect_banner_cta_text;
            }

            /* compiled from: RhyOverviewBannerState.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$RhsNoaRedirect$Companion;", "", "<init>", "()V", "logIdentifier", "", "Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;", "getLogIdentifier", "(Lcom/robinhood/models/ui/bonfire/rhy/RhsNoaRedirectStatus$PromptRedirect;)Ljava/lang/String;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final String getLogIdentifier(RhsNoaRedirectStatus.PromptRedirect promptRedirect) {
                    if (promptRedirect.getType() == RhsNoaRedirectStatus.PromptRedirect.Type.WARNING) {
                        return "noa_redirect_urgent";
                    }
                    return "noa_redirect_warning";
                }
            }
        }

        /* compiled from: RhyOverviewBannerState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$DeactivatedAccount;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "<init>", "()V", "bannerText", "Lcom/robinhood/utils/resource/StringResource;", "getBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "bannerCtaText", "getBannerCtaText", "bannerIconRes", "", "getBannerIconRes", "()I", "bannerIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getBannerIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "bannerType", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "getBannerType", "()Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerType;", "bannerAction", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible$BannerActionParams;", "", "getBannerAction", "()Lkotlin/jvm/functions/Function1;", "bannerTextRes", "getBannerTextRes", "bannerCtaRes", "getBannerCtaRes", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DeactivatedAccount extends Visible {
            public static final int $stable = 0;
            public static final DeactivatedAccount INSTANCE = new DeactivatedAccount();
            private static final RhyOverviewBannerType bannerType = RhyOverviewBannerType.NORMAL;

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public Function1<BannerActionParams, Unit> getBannerAction() {
                return new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState$Visible$DeactivatedAccount$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewBannerState.Visible.DeactivatedAccount._get_bannerAction_$lambda$0((RhyOverviewBannerState.Visible.BannerActionParams) obj);
                    }
                };
            }

            private DeactivatedAccount() {
                super("account_deactivated", null);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerText() {
                return StringResource.INSTANCE.invoke(getBannerTextRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public StringResource getBannerCtaText() {
                return StringResource.INSTANCE.invoke(getBannerCtaRes(), new Object[0]);
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public int getBannerIconRes() {
                return C20690R.drawable.ic_rds_info_filled_24dp;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public ServerToBentoAssetMapper2 getBannerIcon() {
                return ServerToBentoAssetMapper2.INFO_FILLED_24;
            }

            @Override // com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannerState.Visible
            public RhyOverviewBannerType getBannerType() {
                return bannerType;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit _get_bannerAction_$lambda$0(BannerActionParams bannerActionParams) {
                Intrinsics.checkNotNullParameter(bannerActionParams, "<destruct>");
                Navigators3.showContactSupportTriageFragment$default(bannerActionParams.getNavigator(), bannerActionParams.getContext(), "36", false, 4, null);
                return Unit.INSTANCE;
            }

            private final int getBannerTextRes() {
                return C10285R.string.rhy_deactivated_account_banner_text;
            }

            private final int getBannerCtaRes() {
                return C10285R.string.rhy_deactivated_account_banner_cta_text;
            }
        }
    }
}
