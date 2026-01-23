package com.robinhood.android.crypto.p094ui.detail.p095v2.topbar;

import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailTopBarAction.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction;", "", "contentDescription", "Lcom/robinhood/utils/resource/StringResource;", "getContentDescription", "()Lcom/robinhood/utils/resource/StringResource;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "AddToList", "UpdateList", "AdvancedAlerts", "Pip", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction$AddToList;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction$AdvancedAlerts;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction$Pip;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction$UpdateList;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface CryptoDetailTopBarAction {
    StringResource getContentDescription();

    ServerToBentoAssetMapper2 getIcon();

    /* compiled from: CryptoDetailTopBarAction.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction$AddToList;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "contentDescription", "Lcom/robinhood/utils/resource/StringResource;", "getContentDescription", "()Lcom/robinhood/utils/resource/StringResource;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AddToList implements CryptoDetailTopBarAction {
        public static final int $stable = StringResource.$stable;
        private final StringResource contentDescription;
        private final ServerToBentoAssetMapper2 icon;
        private final String symbol;

        /* renamed from: component1, reason: from getter */
        private final String getSymbol() {
            return this.symbol;
        }

        public static /* synthetic */ AddToList copy$default(AddToList addToList, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addToList.symbol;
            }
            return addToList.copy(str);
        }

        public final AddToList copy(String symbol) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            return new AddToList(symbol);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddToList) && Intrinsics.areEqual(this.symbol, ((AddToList) other).symbol);
        }

        public int hashCode() {
            return this.symbol.hashCode();
        }

        public String toString() {
            return "AddToList(symbol=" + this.symbol + ")";
        }

        public AddToList(String symbol) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
            this.contentDescription = StringResource.INSTANCE.invoke(C12757R.string.action_add_to_list_content_description, symbol);
            this.icon = ServerToBentoAssetMapper2.BUBBLE_PLUS_24;
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction
        public StringResource getContentDescription() {
            return this.contentDescription;
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction
        public ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }
    }

    /* compiled from: CryptoDetailTopBarAction.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction$UpdateList;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction;", "<init>", "()V", "contentDescription", "Lcom/robinhood/utils/resource/StringResource;", "getContentDescription", "()Lcom/robinhood/utils/resource/StringResource;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateList implements CryptoDetailTopBarAction {
        public static final UpdateList INSTANCE = new UpdateList();
        private static final StringResource contentDescription = StringResource.INSTANCE.invoke(C12757R.string.action_update_lists_content_description, new Object[0]);
        private static final ServerToBentoAssetMapper2 icon = ServerToBentoAssetMapper2.BUBBLE_CHECKED_24;
        public static final int $stable = StringResource.$stable;

        public boolean equals(Object other) {
            return this == other || (other instanceof UpdateList);
        }

        public int hashCode() {
            return -389974315;
        }

        public String toString() {
            return "UpdateList";
        }

        private UpdateList() {
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction
        public StringResource getContentDescription() {
            return contentDescription;
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction
        public ServerToBentoAssetMapper2 getIcon() {
            return icon;
        }
    }

    /* compiled from: CryptoDetailTopBarAction.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction$AdvancedAlerts;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction;", "<init>", "()V", "contentDescription", "Lcom/robinhood/utils/resource/StringResource;", "getContentDescription", "()Lcom/robinhood/utils/resource/StringResource;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AdvancedAlerts implements CryptoDetailTopBarAction {
        public static final AdvancedAlerts INSTANCE = new AdvancedAlerts();
        private static final StringResource contentDescription = StringResource.INSTANCE.invoke(C12757R.string.action_update_custom_alerts, new Object[0]);
        private static final ServerToBentoAssetMapper2 icon = ServerToBentoAssetMapper2.NOTIFICATION_ADD_24;
        public static final int $stable = StringResource.$stable;

        public boolean equals(Object other) {
            return this == other || (other instanceof AdvancedAlerts);
        }

        public int hashCode() {
            return -964762585;
        }

        public String toString() {
            return "AdvancedAlerts";
        }

        private AdvancedAlerts() {
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction
        public StringResource getContentDescription() {
            return contentDescription;
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction
        public ServerToBentoAssetMapper2 getIcon() {
            return icon;
        }
    }

    /* compiled from: CryptoDetailTopBarAction.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction$Pip;", "Lcom/robinhood/android/crypto/ui/detail/v2/topbar/CryptoDetailTopBarAction;", "<init>", "()V", "contentDescription", "Lcom/robinhood/utils/resource/StringResource;", "getContentDescription", "()Lcom/robinhood/utils/resource/StringResource;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Pip implements CryptoDetailTopBarAction {
        public static final Pip INSTANCE = new Pip();
        private static final StringResource contentDescription = StringResource.INSTANCE.invoke(C12757R.string.action_open_pip, new Object[0]);
        private static final ServerToBentoAssetMapper2 icon = ServerToBentoAssetMapper2.PICTURE_IN_PICTURE_24;
        public static final int $stable = StringResource.$stable;

        public boolean equals(Object other) {
            return this == other || (other instanceof Pip);
        }

        public int hashCode() {
            return 905041801;
        }

        public String toString() {
            return "Pip";
        }

        private Pip() {
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction
        public StringResource getContentDescription() {
            return contentDescription;
        }

        @Override // com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction
        public ServerToBentoAssetMapper2 getIcon() {
            return icon;
        }
    }
}
