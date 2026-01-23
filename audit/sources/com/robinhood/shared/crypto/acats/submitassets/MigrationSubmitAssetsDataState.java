package com.robinhood.shared.crypto.acats.submitassets;

import android.content.res.Resources;
import androidx.compose.p011ui.graphics.Color;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.crypto.acats.AssetRowText;
import com.robinhood.shared.crypto.acats.C37511R;
import crypto_portkey.service.p443v1.PartnerAccountAssetsDto;
import crypto_portkey.service.p443v1.PartnerAssetBalanceDto;
import crypto_portkey.service.p443v1.PartnerBalanceDataDto;
import crypto_portkey.service.p443v1.PartnerCryptoAssetDto;
import crypto_portkey.service.p443v1.PartnerFiatAssetDto;
import crypto_portkey.service.p443v1.ProcessMigrationAuthedResponseDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MigrationSubmitAssetsDataState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÂ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R%\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R%\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsDataState;", "", "loading", "", "migrationResponse", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "resources", "Landroid/content/res/Resources;", "<init>", "(ZLcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;Landroid/content/res/Resources;)V", "getLoading", "()Z", "transferableUsdRow", "Lkotlin/Pair;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/acats/AssetRowText;", "getTransferableUsdRow", "()Lkotlin/Pair;", "transferableCryptoRow", "getTransferableCryptoRow", "nonTransferableCashRow", "getNonTransferableCashRow", "nonTransferableCryptoRow", "getNonTransferableCryptoRow", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class MigrationSubmitAssetsDataState {
    private static final String AVAILABLE_BALANCE_TYPE = "available";
    private final boolean loading;
    private final ProcessMigrationAuthedResponseDto migrationResponse;
    private final Resources resources;
    public static final int $stable = 8;

    /* renamed from: component2, reason: from getter */
    private final ProcessMigrationAuthedResponseDto getMigrationResponse() {
        return this.migrationResponse;
    }

    /* renamed from: component3, reason: from getter */
    private final Resources getResources() {
        return this.resources;
    }

    public static /* synthetic */ MigrationSubmitAssetsDataState copy$default(MigrationSubmitAssetsDataState migrationSubmitAssetsDataState, boolean z, ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto, Resources resources, int i, Object obj) {
        if ((i & 1) != 0) {
            z = migrationSubmitAssetsDataState.loading;
        }
        if ((i & 2) != 0) {
            processMigrationAuthedResponseDto = migrationSubmitAssetsDataState.migrationResponse;
        }
        if ((i & 4) != 0) {
            resources = migrationSubmitAssetsDataState.resources;
        }
        return migrationSubmitAssetsDataState.copy(z, processMigrationAuthedResponseDto, resources);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final MigrationSubmitAssetsDataState copy(boolean loading, ProcessMigrationAuthedResponseDto migrationResponse, Resources resources) {
        Intrinsics.checkNotNullParameter(migrationResponse, "migrationResponse");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new MigrationSubmitAssetsDataState(loading, migrationResponse, resources);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MigrationSubmitAssetsDataState)) {
            return false;
        }
        MigrationSubmitAssetsDataState migrationSubmitAssetsDataState = (MigrationSubmitAssetsDataState) other;
        return this.loading == migrationSubmitAssetsDataState.loading && Intrinsics.areEqual(this.migrationResponse, migrationSubmitAssetsDataState.migrationResponse) && Intrinsics.areEqual(this.resources, migrationSubmitAssetsDataState.resources);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.loading) * 31) + this.migrationResponse.hashCode()) * 31) + this.resources.hashCode();
    }

    public String toString() {
        return "MigrationSubmitAssetsDataState(loading=" + this.loading + ", migrationResponse=" + this.migrationResponse + ", resources=" + this.resources + ")";
    }

    public MigrationSubmitAssetsDataState(boolean z, ProcessMigrationAuthedResponseDto migrationResponse, Resources resources) {
        Intrinsics.checkNotNullParameter(migrationResponse, "migrationResponse");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.loading = z;
        this.migrationResponse = migrationResponse;
        this.resources = resources;
    }

    public /* synthetic */ MigrationSubmitAssetsDataState(boolean z, ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto, Resources resources, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, processMigrationAuthedResponseDto, resources);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> getTransferableUsdRow() {
        List<PartnerAccountAssetsDto> assets;
        PartnerAccountAssetsDto partnerAccountAssetsDto;
        Object next;
        String str;
        IdlDecimal quantity;
        BigDecimal bigDecimalOrThrow;
        PartnerBalanceDataDto balance_data = this.migrationResponse.getBalance_data();
        Object obj = null;
        if (balance_data == null || (assets = balance_data.getAssets()) == null || (partnerAccountAssetsDto = (PartnerAccountAssetsDto) CollectionsKt.getOrNull(assets, 0)) == null) {
            return null;
        }
        Iterator<T> it = partnerAccountAssetsDto.getFiat().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PartnerFiatAssetDto) next).is_supported()) {
                break;
            }
        }
        PartnerFiatAssetDto partnerFiatAssetDto = (PartnerFiatAssetDto) next;
        if (partnerFiatAssetDto == null) {
            return null;
        }
        Iterator<T> it2 = partnerFiatAssetDto.getBalance().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.areEqual(((PartnerAssetBalanceDto) next2).getType(), AVAILABLE_BALANCE_TYPE)) {
                obj = next2;
                break;
            }
        }
        PartnerAssetBalanceDto partnerAssetBalanceDto = (PartnerAssetBalanceDto) obj;
        if (partnerAssetBalanceDto != null && (quantity = partnerAssetBalanceDto.getQuantity()) != null && (bigDecimalOrThrow = quantity.toBigDecimalOrThrow()) != null) {
            Currency currency = Currency.getInstance(partnerFiatAssetDto.getAsset_symbol());
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
            Money money = Money3.toMoney(bigDecimalOrThrow, currency);
            if (money == null || (str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            }
        } else {
            str = "-";
        }
        return Tuples4.m3642to(new BentoBaseRowState((BentoBaseRowState.Start) null, partnerFiatAssetDto.getAsset_symbol(), (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(str), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null), extensions2.persistentListOf(new AssetRowText(partnerFiatAssetDto.getAsset_symbol(), str)));
    }

    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> getTransferableCryptoRow() throws Resources.NotFoundException {
        List<PartnerAccountAssetsDto> assets;
        PartnerAccountAssetsDto partnerAccountAssetsDto;
        BentoBaseRowState bentoBaseRowState;
        Object next;
        String str;
        IdlDecimal quantity;
        BigDecimal bigDecimalOrThrow;
        PartnerBalanceDataDto balance_data = this.migrationResponse.getBalance_data();
        if (balance_data == null || (assets = balance_data.getAssets()) == null || (partnerAccountAssetsDto = (PartnerAccountAssetsDto) CollectionsKt.getOrNull(assets, 0)) == null) {
            return null;
        }
        List<PartnerCryptoAssetDto> crypto2 = partnerAccountAssetsDto.getCrypto();
        ArrayList<PartnerCryptoAssetDto> arrayList = new ArrayList();
        for (Object obj : crypto2) {
            if (((PartnerCryptoAssetDto) obj).is_supported()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (PartnerCryptoAssetDto partnerCryptoAssetDto : arrayList) {
            Iterator<T> it = partnerCryptoAssetDto.getBalance().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((PartnerAssetBalanceDto) next).getType(), AVAILABLE_BALANCE_TYPE)) {
                    break;
                }
            }
            PartnerAssetBalanceDto partnerAssetBalanceDto = (PartnerAssetBalanceDto) next;
            if (partnerAssetBalanceDto == null || (quantity = partnerAssetBalanceDto.getQuantity()) == null || (bigDecimalOrThrow = quantity.toBigDecimalOrThrow()) == null || (str = FormatsLocalized.getLargePrecisionFormat().format(bigDecimalOrThrow)) == null) {
                str = "-";
            }
            arrayList2.add(new AssetRowText(partnerCryptoAssetDto.getAsset_name(), str + " " + partnerCryptoAssetDto.getAsset_symbol()));
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList2);
        if (arrayList.size() == 1) {
            AssetRowText assetRowText = (AssetRowText) CollectionsKt.first((List) immutableList);
            bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, assetRowText.getPrimaryText(), (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(assetRowText.getMetaText()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null);
        } else {
            int size = arrayList.size();
            String string2 = this.resources.getString(C37511R.string.crypto_acats_migration_submit_asset_label_crypto);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = this.resources.getString(C37511R.string.crypto_acats_migration_submit_asset_label_assets, Integer.valueOf(size));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, string2, (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLineAndIcon(string3, ServerToBentoAssetMapper2.CARET_RIGHT_16, "", (Color) null, 8, (DefaultConstructorMarker) null), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null);
        }
        return Tuples4.m3642to(bentoBaseRowState, immutableList);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> getNonTransferableCashRow() throws Resources.NotFoundException {
        List<PartnerAccountAssetsDto> assets;
        PartnerAccountAssetsDto partnerAccountAssetsDto;
        BentoBaseRowState bentoBaseRowState;
        Object next;
        String str;
        IdlDecimal quantity;
        BigDecimal bigDecimalOrThrow;
        PartnerBalanceDataDto balance_data = this.migrationResponse.getBalance_data();
        if (balance_data == null || (assets = balance_data.getAssets()) == null || (partnerAccountAssetsDto = (PartnerAccountAssetsDto) CollectionsKt.getOrNull(assets, 0)) == null) {
            return null;
        }
        List<PartnerFiatAssetDto> fiat = partnerAccountAssetsDto.getFiat();
        ArrayList<PartnerFiatAssetDto> arrayList = new ArrayList();
        for (Object obj : fiat) {
            if (!((PartnerFiatAssetDto) obj).is_supported()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (PartnerFiatAssetDto partnerFiatAssetDto : arrayList) {
            Iterator<T> it = partnerFiatAssetDto.getBalance().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((PartnerAssetBalanceDto) next).getType(), AVAILABLE_BALANCE_TYPE)) {
                    break;
                }
            }
            PartnerAssetBalanceDto partnerAssetBalanceDto = (PartnerAssetBalanceDto) next;
            if (partnerAssetBalanceDto == null || (quantity = partnerAssetBalanceDto.getQuantity()) == null || (bigDecimalOrThrow = quantity.toBigDecimalOrThrow()) == null) {
                str = "-";
            } else {
                Currency currency = Currency.getInstance(partnerFiatAssetDto.getAsset_symbol());
                Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
                Money money = Money3.toMoney(bigDecimalOrThrow, currency);
                if (money == null || (str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
                }
            }
            arrayList2.add(new AssetRowText(partnerFiatAssetDto.getAsset_symbol(), str));
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList2);
        if (arrayList.size() == 1) {
            AssetRowText assetRowText = (AssetRowText) CollectionsKt.first((List) immutableList);
            bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, assetRowText.getPrimaryText(), (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(assetRowText.getMetaText()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null);
        } else {
            int size = arrayList.size();
            String string2 = this.resources.getString(C37511R.string.crypto_acats_migration_submit_asset_label_cash);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = this.resources.getString(C37511R.string.crypto_acats_migration_submit_asset_label_assets, Integer.valueOf(size));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, string2, (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLineAndIcon(string3, ServerToBentoAssetMapper2.CARET_RIGHT_16, "", (Color) null, 8, (DefaultConstructorMarker) null), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null);
        }
        return Tuples4.m3642to(bentoBaseRowState, immutableList);
    }

    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> getNonTransferableCryptoRow() throws Resources.NotFoundException {
        List<PartnerAccountAssetsDto> assets;
        PartnerAccountAssetsDto partnerAccountAssetsDto;
        BentoBaseRowState bentoBaseRowState;
        Object next;
        String str;
        IdlDecimal quantity;
        BigDecimal bigDecimalOrThrow;
        PartnerBalanceDataDto balance_data = this.migrationResponse.getBalance_data();
        if (balance_data == null || (assets = balance_data.getAssets()) == null || (partnerAccountAssetsDto = (PartnerAccountAssetsDto) CollectionsKt.getOrNull(assets, 0)) == null) {
            return null;
        }
        List<PartnerCryptoAssetDto> crypto2 = partnerAccountAssetsDto.getCrypto();
        ArrayList<PartnerCryptoAssetDto> arrayList = new ArrayList();
        for (Object obj : crypto2) {
            if (!((PartnerCryptoAssetDto) obj).is_supported()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (PartnerCryptoAssetDto partnerCryptoAssetDto : arrayList) {
            Iterator<T> it = partnerCryptoAssetDto.getBalance().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((PartnerAssetBalanceDto) next).getType(), AVAILABLE_BALANCE_TYPE)) {
                    break;
                }
            }
            PartnerAssetBalanceDto partnerAssetBalanceDto = (PartnerAssetBalanceDto) next;
            if (partnerAssetBalanceDto == null || (quantity = partnerAssetBalanceDto.getQuantity()) == null || (bigDecimalOrThrow = quantity.toBigDecimalOrThrow()) == null || (str = FormatsLocalized.getLargePrecisionFormat().format(bigDecimalOrThrow)) == null) {
                str = "-";
            }
            arrayList2.add(new AssetRowText(partnerCryptoAssetDto.getAsset_name(), str + " " + partnerCryptoAssetDto.getAsset_symbol()));
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList2);
        if (arrayList.size() == 1) {
            AssetRowText assetRowText = (AssetRowText) CollectionsKt.first((List) immutableList);
            bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, assetRowText.getPrimaryText(), (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(assetRowText.getMetaText()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null);
        } else {
            int size = arrayList.size();
            String string2 = this.resources.getString(C37511R.string.crypto_acats_migration_submit_asset_label_crypto);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = this.resources.getString(C37511R.string.crypto_acats_migration_submit_asset_label_assets, Integer.valueOf(size));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, string2, (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLineAndIcon(string3, ServerToBentoAssetMapper2.CARET_RIGHT_16, "", (Color) null, 8, (DefaultConstructorMarker) null), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null);
        }
        return Tuples4.m3642to(bentoBaseRowState, immutableList);
    }
}
