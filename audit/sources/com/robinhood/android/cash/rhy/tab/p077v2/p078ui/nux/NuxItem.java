package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.logging.RhyEventLoggingUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NuxItem.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0015\u0016\u0017\u0018\u0019\u001aB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0006\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem;", "", "isComplete", "", "isRequired", "<init>", "(ZZ)V", "()Z", "icon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "getIcon", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "defaultIcon", "getDefaultIcon", "title", "", "getTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "loggingIdentifier", "getLoggingIdentifier", "()Ljava/lang/String;", "SpendWithCard", "AddToWallet", "ActivateCard", "ReviewAccount", "FundAccount", "ViewReferralOffer", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$ActivateCard;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$AddToWallet;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$FundAccount;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$ReviewAccount;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$SpendWithCard;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$ViewReferralOffer;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class NuxItem {
    public static final int $stable = 0;
    private final boolean isComplete;
    private final boolean isRequired;

    public /* synthetic */ NuxItem(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    @JvmName
    public abstract BentoBaseRowState.Start.Icon getIcon(Composer composer, int i);

    public abstract String getLoggingIdentifier();

    @JvmName
    public abstract String getTitle(Composer composer, int i);

    private NuxItem(boolean z, boolean z2) {
        this.isComplete = z;
        this.isRequired = z2;
    }

    /* renamed from: isComplete, reason: from getter */
    public boolean getIsComplete() {
        return this.isComplete;
    }

    /* renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    @JvmName
    public final BentoBaseRowState.Start.Icon getDefaultIcon(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1171120308, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.<get-defaultIcon> (NuxItem.kt:23)");
        }
        BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BUBBLE_CHECKED_24, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU()), 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return icon;
    }

    /* compiled from: NuxItem.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$SpendWithCard;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem;", "isComplete", "", "<init>", "(Z)V", "()Z", "icon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "getIcon", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "title", "", "getTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "loggingIdentifier", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SpendWithCard extends NuxItem {
        public static final int $stable = 0;
        private final boolean isComplete;

        public static /* synthetic */ SpendWithCard copy$default(SpendWithCard spendWithCard, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = spendWithCard.isComplete;
            }
            return spendWithCard.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final SpendWithCard copy(boolean isComplete) {
            return new SpendWithCard(isComplete);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SpendWithCard) && this.isComplete == ((SpendWithCard) other).isComplete;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isComplete);
        }

        public String toString() {
            return "SpendWithCard(isComplete=" + this.isComplete + ")";
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        /* renamed from: isComplete */
        public boolean getIsComplete() {
            return this.isComplete;
        }

        public SpendWithCard(boolean z) {
            super(z, false, null);
            this.isComplete = z;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public BentoBaseRowState.Start.Icon getIcon(Composer composer, int i) {
            BentoBaseRowState.Start.Icon icon;
            composer.startReplaceGroup(1048511422);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1048511422, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.SpendWithCard.<get-icon> (NuxItem.kt:40)");
            }
            if (getIsComplete()) {
                icon = getDefaultIcon(composer, i & 14);
            } else {
                icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.PAYMENT_24, null, null, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return icon;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public String getTitle(Composer composer, int i) {
            String strStringResource;
            composer.startReplaceGroup(-961999292);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-961999292, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.SpendWithCard.<get-title> (NuxItem.kt:49)");
            }
            if (getIsComplete()) {
                composer.startReplaceGroup(1395940574);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_spent_card_finished, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1396041479);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_spent_card, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strStringResource;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        public String getLoggingIdentifier() {
            String simpleName = SpendWithCard.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }
    }

    /* compiled from: NuxItem.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$AddToWallet;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem;", "isComplete", "", "<init>", "(Z)V", "()Z", "icon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "getIcon", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "title", "", "getTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "loggingIdentifier", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AddToWallet extends NuxItem {
        public static final int $stable = 0;
        private final boolean isComplete;

        public static /* synthetic */ AddToWallet copy$default(AddToWallet addToWallet, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = addToWallet.isComplete;
            }
            return addToWallet.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final AddToWallet copy(boolean isComplete) {
            return new AddToWallet(isComplete);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddToWallet) && this.isComplete == ((AddToWallet) other).isComplete;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isComplete);
        }

        public String toString() {
            return "AddToWallet(isComplete=" + this.isComplete + ")";
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        /* renamed from: isComplete */
        public boolean getIsComplete() {
            return this.isComplete;
        }

        public AddToWallet(boolean z) {
            super(z, false, null);
            this.isComplete = z;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public BentoBaseRowState.Start.Icon getIcon(Composer composer, int i) {
            BentoBaseRowState.Start.Icon icon;
            composer.startReplaceGroup(485949373);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(485949373, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.AddToWallet.<get-icon> (NuxItem.kt:66)");
            }
            if (getIsComplete()) {
                icon = getDefaultIcon(composer, i & 14);
            } else {
                icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.WALLET_24, null, null, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return icon;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public String getTitle(Composer composer, int i) {
            String strStringResource;
            composer.startReplaceGroup(-821169213);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-821169213, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.AddToWallet.<get-title> (NuxItem.kt:75)");
            }
            if (getIsComplete()) {
                composer.startReplaceGroup(681775995);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_virtual_wallet_finished, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(681880868);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_virtual_wallet, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strStringResource;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        public String getLoggingIdentifier() {
            String simpleName = AddToWallet.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }
    }

    /* compiled from: NuxItem.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$ActivateCard;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem;", "isComplete", "", "<init>", "(Z)V", "()Z", "icon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "getIcon", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "title", "", "getTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "loggingIdentifier", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ActivateCard extends NuxItem {
        public static final int $stable = 0;
        private final boolean isComplete;

        public static /* synthetic */ ActivateCard copy$default(ActivateCard activateCard, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = activateCard.isComplete;
            }
            return activateCard.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final ActivateCard copy(boolean isComplete) {
            return new ActivateCard(isComplete);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActivateCard) && this.isComplete == ((ActivateCard) other).isComplete;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isComplete);
        }

        public String toString() {
            return "ActivateCard(isComplete=" + this.isComplete + ")";
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        /* renamed from: isComplete */
        public boolean getIsComplete() {
            return this.isComplete;
        }

        public ActivateCard(boolean z) {
            super(z, true, null);
            this.isComplete = z;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public BentoBaseRowState.Start.Icon getIcon(Composer composer, int i) {
            BentoBaseRowState.Start.Icon icon;
            composer.startReplaceGroup(-603968207);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-603968207, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.ActivateCard.<get-icon> (NuxItem.kt:92)");
            }
            if (getIsComplete()) {
                icon = getDefaultIcon(composer, i & 14);
            } else {
                icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.PAYMENT_24, null, null, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return icon;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public String getTitle(Composer composer, int i) {
            String strStringResource;
            composer.startReplaceGroup(1825028587);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1825028587, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.ActivateCard.<get-title> (NuxItem.kt:101)");
            }
            if (getIsComplete()) {
                composer.startReplaceGroup(-564282378);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_activate_card_finish, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-564180419);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_activate_card, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strStringResource;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        public String getLoggingIdentifier() {
            if (getIsComplete()) {
                return RhyEventLoggingUtils.rhyNuxActivateCardComplete;
            }
            return RhyEventLoggingUtils.rhyNuxActivateCard;
        }
    }

    /* compiled from: NuxItem.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$ReviewAccount;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem;", "isComplete", "", "hasDdRelationship", "<init>", "(ZLjava/lang/Boolean;)V", "()Z", "getHasDdRelationship", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "icon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "getIcon", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "title", "", "getTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "loggingIdentifier", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "(ZLjava/lang/Boolean;)Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$ReviewAccount;", "equals", "other", "", "hashCode", "", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReviewAccount extends NuxItem {
        public static final int $stable = 0;
        private final Boolean hasDdRelationship;
        private final boolean isComplete;

        public static /* synthetic */ ReviewAccount copy$default(ReviewAccount reviewAccount, boolean z, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                z = reviewAccount.isComplete;
            }
            if ((i & 2) != 0) {
                bool = reviewAccount.hasDdRelationship;
            }
            return reviewAccount.copy(z, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getHasDdRelationship() {
            return this.hasDdRelationship;
        }

        public final ReviewAccount copy(boolean isComplete, Boolean hasDdRelationship) {
            return new ReviewAccount(isComplete, hasDdRelationship);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewAccount)) {
                return false;
            }
            ReviewAccount reviewAccount = (ReviewAccount) other;
            return this.isComplete == reviewAccount.isComplete && Intrinsics.areEqual(this.hasDdRelationship, reviewAccount.hasDdRelationship);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isComplete) * 31;
            Boolean bool = this.hasDdRelationship;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "ReviewAccount(isComplete=" + this.isComplete + ", hasDdRelationship=" + this.hasDdRelationship + ")";
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        /* renamed from: isComplete */
        public boolean getIsComplete() {
            return this.isComplete;
        }

        public final Boolean getHasDdRelationship() {
            return this.hasDdRelationship;
        }

        public ReviewAccount(boolean z, Boolean bool) {
            super(z, false, null);
            this.isComplete = z;
            this.hasDdRelationship = bool;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public BentoBaseRowState.Start.Icon getIcon(Composer composer, int i) {
            BentoBaseRowState.Start.Icon icon;
            composer.startReplaceGroup(1697496669);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1697496669, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.ReviewAccount.<get-icon> (NuxItem.kt:123)");
            }
            if (getIsComplete()) {
                icon = getDefaultIcon(composer, i & 14);
            } else {
                icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BANKING_24, null, null, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return icon;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public String getTitle(Composer composer, int i) {
            String strStringResource;
            composer.startReplaceGroup(-313014045);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-313014045, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.ReviewAccount.<get-title> (NuxItem.kt:132)");
            }
            Boolean bool = this.hasDdRelationship;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2) && getIsComplete()) {
                composer.startReplaceGroup(-158781594);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_move_paycheck_finished, composer, 0);
                composer.endReplaceGroup();
            } else if (Intrinsics.areEqual(this.hasDdRelationship, bool2) && !getIsComplete()) {
                composer.startReplaceGroup(-158776803);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_move_paycheck, composer, 0);
                composer.endReplaceGroup();
            } else if (!Intrinsics.areEqual(this.hasDdRelationship, bool2) && getIsComplete()) {
                composer.startReplaceGroup(-158772313);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_review_account_finished, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-158769346);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_review_account, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strStringResource;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        public String getLoggingIdentifier() {
            String simpleName = ReviewAccount.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }
    }

    /* compiled from: NuxItem.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$FundAccount;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem;", "isComplete", "", "<init>", "(Z)V", "()Z", "icon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "getIcon", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "title", "", "getTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "loggingIdentifier", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FundAccount extends NuxItem {
        public static final int $stable = 0;
        private final boolean isComplete;

        public static /* synthetic */ FundAccount copy$default(FundAccount fundAccount, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = fundAccount.isComplete;
            }
            return fundAccount.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final FundAccount copy(boolean isComplete) {
            return new FundAccount(isComplete);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FundAccount) && this.isComplete == ((FundAccount) other).isComplete;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isComplete);
        }

        public String toString() {
            return "FundAccount(isComplete=" + this.isComplete + ")";
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        /* renamed from: isComplete */
        public boolean getIsComplete() {
            return this.isComplete;
        }

        public FundAccount(boolean z) {
            super(z, true, null);
            this.isComplete = z;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public BentoBaseRowState.Start.Icon getIcon(Composer composer, int i) {
            BentoBaseRowState.Start.Icon icon;
            composer.startReplaceGroup(-1724020278);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1724020278, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.FundAccount.<get-icon> (NuxItem.kt:153)");
            }
            if (getIsComplete()) {
                icon = getDefaultIcon(composer, i & 14);
            } else {
                icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.DOLLAR_SIGN_24, null, null, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return icon;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public String getTitle(Composer composer, int i) {
            String strStringResource;
            composer.startReplaceGroup(1263828432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1263828432, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.FundAccount.<get-title> (NuxItem.kt:162)");
            }
            if (getIsComplete()) {
                composer.startReplaceGroup(1029583376);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_fund_account_finished, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1029686265);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_fund_account, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strStringResource;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        public String getLoggingIdentifier() {
            if (getIsComplete()) {
                return RhyEventLoggingUtils.rhyNuxFundComplete;
            }
            return RhyEventLoggingUtils.rhyNuxFund;
        }
    }

    /* compiled from: NuxItem.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem$ViewReferralOffer;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/NuxItem;", "refereeAttribution", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "hasViewedRefereeOffer", "", "<init>", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;Z)V", "getRefereeAttribution", "()Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "getHasViewedRefereeOffer", "()Z", "icon", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "getIcon", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start$Icon;", "title", "", "getTitle", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "loggingIdentifier", "getLoggingIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ViewReferralOffer extends NuxItem {
        public static final int $stable = 8;
        private final boolean hasViewedRefereeOffer;
        private final RhyReferralAttribution refereeAttribution;

        public static /* synthetic */ ViewReferralOffer copy$default(ViewReferralOffer viewReferralOffer, RhyReferralAttribution rhyReferralAttribution, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                rhyReferralAttribution = viewReferralOffer.refereeAttribution;
            }
            if ((i & 2) != 0) {
                z = viewReferralOffer.hasViewedRefereeOffer;
            }
            return viewReferralOffer.copy(rhyReferralAttribution, z);
        }

        /* renamed from: component1, reason: from getter */
        public final RhyReferralAttribution getRefereeAttribution() {
            return this.refereeAttribution;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasViewedRefereeOffer() {
            return this.hasViewedRefereeOffer;
        }

        public final ViewReferralOffer copy(RhyReferralAttribution refereeAttribution, boolean hasViewedRefereeOffer) {
            Intrinsics.checkNotNullParameter(refereeAttribution, "refereeAttribution");
            return new ViewReferralOffer(refereeAttribution, hasViewedRefereeOffer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewReferralOffer)) {
                return false;
            }
            ViewReferralOffer viewReferralOffer = (ViewReferralOffer) other;
            return Intrinsics.areEqual(this.refereeAttribution, viewReferralOffer.refereeAttribution) && this.hasViewedRefereeOffer == viewReferralOffer.hasViewedRefereeOffer;
        }

        public int hashCode() {
            return (this.refereeAttribution.hashCode() * 31) + Boolean.hashCode(this.hasViewedRefereeOffer);
        }

        public String toString() {
            return "ViewReferralOffer(refereeAttribution=" + this.refereeAttribution + ", hasViewedRefereeOffer=" + this.hasViewedRefereeOffer + ")";
        }

        public final RhyReferralAttribution getRefereeAttribution() {
            return this.refereeAttribution;
        }

        public final boolean getHasViewedRefereeOffer() {
            return this.hasViewedRefereeOffer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewReferralOffer(RhyReferralAttribution refereeAttribution, boolean z) {
            super(z, false, null);
            Intrinsics.checkNotNullParameter(refereeAttribution, "refereeAttribution");
            this.refereeAttribution = refereeAttribution;
            this.hasViewedRefereeOffer = z;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public BentoBaseRowState.Start.Icon getIcon(Composer composer, int i) {
            BentoBaseRowState.Start.Icon icon;
            composer.startReplaceGroup(325359064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(325359064, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.ViewReferralOffer.<get-icon> (NuxItem.kt:184)");
            }
            if (getIsComplete()) {
                icon = getDefaultIcon(composer, i & 14);
            } else {
                icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.GIFT_24, null, null, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return icon;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        @JvmName
        public String getTitle(Composer composer, int i) {
            String strStringResource;
            composer.startReplaceGroup(182054238);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(182054238, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.nux.NuxItem.ViewReferralOffer.<get-title> (NuxItem.kt:193)");
            }
            if (getIsComplete()) {
                composer.startReplaceGroup(-965807973);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_view_referral_offer_finished, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-965698140);
                strStringResource = StringResources_androidKt.stringResource(C10285R.string.rhy_onboarding_view_referral_offer, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strStringResource;
        }

        @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux.NuxItem
        public String getLoggingIdentifier() {
            String simpleName = ViewReferralOffer.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }
    }
}
