package com.robinhood.shared.crypto.transfer.selection;

import android.net.Uri;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferOptions;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoTransferSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\b%J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÀ\u0003¢\u0006\u0002\b'JA\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionDataState;", "", "query", "", "checkForUpsell", "", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "options", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferOptions;", "<init>", "(Ljava/lang/String;ZLcom/robinhood/models/api/transfer/CryptoTransferAction;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferOptions;)V", "getQuery", "()Ljava/lang/String;", "getCheckForUpsell", "()Z", "getAction", "()Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "getConfig$feature_crypto_transfer_externalDebug", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "getOptions$feature_crypto_transfer_externalDebug", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferOptions;", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferOptions$TransferableCrypto;", "getItems", "()Lkotlinx/collections/immutable/ImmutableList;", "trailingIcon", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "getTrailingIcon", "()Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "component1", "component2", "component3", "component4", "component4$feature_crypto_transfer_externalDebug", "component5", "component5$feature_crypto_transfer_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSelectionDataState {
    public static final int $stable = 8;
    private final CryptoTransferAction action;
    private final boolean checkForUpsell;
    private final CryptoTransferConfig config;
    private final CryptoTransferOptions options;
    private final String query;

    public static /* synthetic */ CryptoTransferSelectionDataState copy$default(CryptoTransferSelectionDataState cryptoTransferSelectionDataState, String str, boolean z, CryptoTransferAction cryptoTransferAction, CryptoTransferConfig cryptoTransferConfig, CryptoTransferOptions cryptoTransferOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoTransferSelectionDataState.query;
        }
        if ((i & 2) != 0) {
            z = cryptoTransferSelectionDataState.checkForUpsell;
        }
        if ((i & 4) != 0) {
            cryptoTransferAction = cryptoTransferSelectionDataState.action;
        }
        if ((i & 8) != 0) {
            cryptoTransferConfig = cryptoTransferSelectionDataState.config;
        }
        if ((i & 16) != 0) {
            cryptoTransferOptions = cryptoTransferSelectionDataState.options;
        }
        CryptoTransferOptions cryptoTransferOptions2 = cryptoTransferOptions;
        CryptoTransferAction cryptoTransferAction2 = cryptoTransferAction;
        return cryptoTransferSelectionDataState.copy(str, z, cryptoTransferAction2, cryptoTransferConfig, cryptoTransferOptions2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCheckForUpsell() {
        return this.checkForUpsell;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoTransferAction getAction() {
        return this.action;
    }

    /* renamed from: component4$feature_crypto_transfer_externalDebug, reason: from getter */
    public final CryptoTransferConfig getConfig() {
        return this.config;
    }

    /* renamed from: component5$feature_crypto_transfer_externalDebug, reason: from getter */
    public final CryptoTransferOptions getOptions() {
        return this.options;
    }

    public final CryptoTransferSelectionDataState copy(String query, boolean checkForUpsell, CryptoTransferAction action, CryptoTransferConfig config, CryptoTransferOptions options) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new CryptoTransferSelectionDataState(query, checkForUpsell, action, config, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSelectionDataState)) {
            return false;
        }
        CryptoTransferSelectionDataState cryptoTransferSelectionDataState = (CryptoTransferSelectionDataState) other;
        return Intrinsics.areEqual(this.query, cryptoTransferSelectionDataState.query) && this.checkForUpsell == cryptoTransferSelectionDataState.checkForUpsell && this.action == cryptoTransferSelectionDataState.action && Intrinsics.areEqual(this.config, cryptoTransferSelectionDataState.config) && Intrinsics.areEqual(this.options, cryptoTransferSelectionDataState.options);
    }

    public int hashCode() {
        int iHashCode = ((this.query.hashCode() * 31) + Boolean.hashCode(this.checkForUpsell)) * 31;
        CryptoTransferAction cryptoTransferAction = this.action;
        int iHashCode2 = (iHashCode + (cryptoTransferAction == null ? 0 : cryptoTransferAction.hashCode())) * 31;
        CryptoTransferConfig cryptoTransferConfig = this.config;
        int iHashCode3 = (iHashCode2 + (cryptoTransferConfig == null ? 0 : cryptoTransferConfig.hashCode())) * 31;
        CryptoTransferOptions cryptoTransferOptions = this.options;
        return iHashCode3 + (cryptoTransferOptions != null ? cryptoTransferOptions.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTransferSelectionDataState(query=" + this.query + ", checkForUpsell=" + this.checkForUpsell + ", action=" + this.action + ", config=" + this.config + ", options=" + this.options + ")";
    }

    public CryptoTransferSelectionDataState(String query, boolean z, CryptoTransferAction cryptoTransferAction, CryptoTransferConfig cryptoTransferConfig, CryptoTransferOptions cryptoTransferOptions) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.query = query;
        this.checkForUpsell = z;
        this.action = cryptoTransferAction;
        this.config = cryptoTransferConfig;
        this.options = cryptoTransferOptions;
    }

    public /* synthetic */ CryptoTransferSelectionDataState(String str, boolean z, CryptoTransferAction cryptoTransferAction, CryptoTransferConfig cryptoTransferConfig, CryptoTransferOptions cryptoTransferOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, cryptoTransferAction, cryptoTransferConfig, cryptoTransferOptions);
    }

    public final String getQuery() {
        return this.query;
    }

    public final boolean getCheckForUpsell() {
        return this.checkForUpsell;
    }

    public final CryptoTransferAction getAction() {
        return this.action;
    }

    public final CryptoTransferConfig getConfig$feature_crypto_transfer_externalDebug() {
        return this.config;
    }

    public final CryptoTransferOptions getOptions$feature_crypto_transfer_externalDebug() {
        return this.options;
    }

    public final ImmutableList<CryptoTransferOptions.TransferableCrypto> getItems() {
        ImmutableList<CryptoTransferOptions.TransferableCrypto> results;
        CryptoTransferOptions cryptoTransferOptions = this.options;
        if (cryptoTransferOptions != null && (results = cryptoTransferOptions.getResults()) != null) {
            ArrayList<CryptoTransferOptions.TransferableCrypto> arrayList = new ArrayList();
            for (CryptoTransferOptions.TransferableCrypto transferableCrypto : results) {
                ImmutableList<String> searchItems = transferableCrypto.getSearchItems();
                if (searchItems == null || !searchItems.isEmpty()) {
                    Iterator<String> it = searchItems.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (StringsKt.contains((CharSequence) it.next(), (CharSequence) this.query, true)) {
                            arrayList.add(transferableCrypto);
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (CryptoTransferOptions.TransferableCrypto transferableCrypto2 : arrayList) {
                String string2 = Uri.parse(transferableCrypto2.getDeeplink()).buildUpon().appendQueryParameter("check_for_upsell", String.valueOf(this.checkForUpsell)).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                arrayList2.add(CryptoTransferOptions.TransferableCrypto.copy$default(transferableCrypto2, null, null, null, string2, null, 23, null));
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(arrayList2);
            if (persistentList != null) {
                return persistentList;
            }
        }
        return extensions2.persistentListOf();
    }

    public final BentoTextInput8.Icon.Size24 getTrailingIcon() {
        if (StringsKt.isBlank(this.query)) {
            return null;
        }
        return new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.CLOSE_24, null, null, 6, null);
    }
}
