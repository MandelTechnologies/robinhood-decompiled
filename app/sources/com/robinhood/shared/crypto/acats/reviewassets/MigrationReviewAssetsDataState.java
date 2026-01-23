package com.robinhood.shared.crypto.acats.reviewassets;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MigrationReviewAssetsDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDataState;", "", "migrationResponse", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;Landroid/content/res/Resources;)V", "getMigrationResponse", "()Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "isLoading", "", "()Z", "enabled", "getEnabled", "assetListSections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/acats/reviewassets/AssetListSectionState;", "getAssetListSections", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class MigrationReviewAssetsDataState {
    private static final String AVAILABLE_BALANCE_TYPE = "available";
    private static final ImmutableList3<AssetListSectionState> LOADING_SECTION = extensions2.persistentListOf(new AssetListSectionState("------- ----", "-------- -------- --- ----------- --- --- --------", extensions2.persistentListOf(new BentoBaseRowState((BentoBaseRowState.Start) null, "---", (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine("---"), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null))), new AssetListSectionState("------- ----", "-------- -------- --- ----------- --- --- -------  --- -- ------ ------------", extensions2.persistentListOf(new BentoBaseRowState((BentoBaseRowState.Start) null, "---", (String) null, (String) (0 == true ? 1 : 0), (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine("-----"), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null))));
    private final ProcessMigrationAuthedResponseDto migrationResponse;
    private final Resources resources;
    public static final int $stable = 8;

    /* renamed from: component2, reason: from getter */
    private final Resources getResources() {
        return this.resources;
    }

    public static /* synthetic */ MigrationReviewAssetsDataState copy$default(MigrationReviewAssetsDataState migrationReviewAssetsDataState, ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto, Resources resources, int i, Object obj) {
        if ((i & 1) != 0) {
            processMigrationAuthedResponseDto = migrationReviewAssetsDataState.migrationResponse;
        }
        if ((i & 2) != 0) {
            resources = migrationReviewAssetsDataState.resources;
        }
        return migrationReviewAssetsDataState.copy(processMigrationAuthedResponseDto, resources);
    }

    /* renamed from: component1, reason: from getter */
    public final ProcessMigrationAuthedResponseDto getMigrationResponse() {
        return this.migrationResponse;
    }

    public final MigrationReviewAssetsDataState copy(ProcessMigrationAuthedResponseDto migrationResponse, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new MigrationReviewAssetsDataState(migrationResponse, resources);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MigrationReviewAssetsDataState)) {
            return false;
        }
        MigrationReviewAssetsDataState migrationReviewAssetsDataState = (MigrationReviewAssetsDataState) other;
        return Intrinsics.areEqual(this.migrationResponse, migrationReviewAssetsDataState.migrationResponse) && Intrinsics.areEqual(this.resources, migrationReviewAssetsDataState.resources);
    }

    public int hashCode() {
        ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto = this.migrationResponse;
        return ((processMigrationAuthedResponseDto == null ? 0 : processMigrationAuthedResponseDto.hashCode()) * 31) + this.resources.hashCode();
    }

    public String toString() {
        return "MigrationReviewAssetsDataState(migrationResponse=" + this.migrationResponse + ", resources=" + this.resources + ")";
    }

    public MigrationReviewAssetsDataState(ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.migrationResponse = processMigrationAuthedResponseDto;
        this.resources = resources;
    }

    public /* synthetic */ MigrationReviewAssetsDataState(ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto, Resources resources, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : processMigrationAuthedResponseDto, resources);
    }

    public final ProcessMigrationAuthedResponseDto getMigrationResponse() {
        return this.migrationResponse;
    }

    public final boolean isLoading() {
        return this.migrationResponse == null;
    }

    public final boolean getEnabled() {
        ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto = this.migrationResponse;
        if (processMigrationAuthedResponseDto != null) {
            return Intrinsics.areEqual(processMigrationAuthedResponseDto.getSuccess(), Boolean.TRUE);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ImmutableList<AssetListSectionState> getAssetListSections() throws Resources.NotFoundException {
        List<PartnerAccountAssetsDto> assets;
        PartnerAccountAssetsDto partnerAccountAssetsDto;
        Object next;
        String str;
        IdlDecimal quantity;
        BigDecimal bigDecimalOrThrow;
        Object next2;
        String str2;
        IdlDecimal quantity2;
        BigDecimal bigDecimalOrThrow2;
        Object next3;
        String str3;
        IdlDecimal quantity3;
        BigDecimal bigDecimalOrThrow3;
        Object obj;
        IdlDecimal quantity4;
        BigDecimal bigDecimalOrThrow4;
        String str4;
        ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto = this.migrationResponse;
        if (processMigrationAuthedResponseDto == null) {
            return LOADING_SECTION;
        }
        PartnerBalanceDataDto balance_data = processMigrationAuthedResponseDto.getBalance_data();
        if (balance_data == null || (assets = balance_data.getAssets()) == null || (partnerAccountAssetsDto = (PartnerAccountAssetsDto) CollectionsKt.getOrNull(assets, 0)) == null) {
            return extensions2.persistentListOf();
        }
        ArrayList arrayList = new ArrayList();
        List<PartnerFiatAssetDto> fiat = partnerAccountAssetsDto.getFiat();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : fiat) {
            if (((PartnerFiatAssetDto) obj2).is_supported()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            String str5 = "-";
            if (!it.hasNext()) {
                break;
            }
            PartnerFiatAssetDto partnerFiatAssetDto = (PartnerFiatAssetDto) it.next();
            String asset_symbol = partnerFiatAssetDto.getAsset_symbol();
            Iterator<T> it2 = partnerFiatAssetDto.getBalance().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                Object next4 = it2.next();
                if (Intrinsics.areEqual(((PartnerAssetBalanceDto) next4).getType(), AVAILABLE_BALANCE_TYPE)) {
                    obj = next4;
                    break;
                }
            }
            PartnerAssetBalanceDto partnerAssetBalanceDto = (PartnerAssetBalanceDto) obj;
            if (partnerAssetBalanceDto != null && (quantity4 = partnerAssetBalanceDto.getQuantity()) != null && (bigDecimalOrThrow4 = quantity4.toBigDecimalOrThrow()) != null) {
                Currency currency = Currency.getInstance(partnerFiatAssetDto.getAsset_symbol());
                Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
                Money money = Money3.toMoney(bigDecimalOrThrow4, currency);
                if (money != null && (str4 = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null)) != null) {
                    str5 = str4;
                }
            }
            arrayList3.add(new BentoBaseRowState((BentoBaseRowState.Start) null, asset_symbol, (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(str5), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null));
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList3);
        if (!immutableList.isEmpty()) {
            String string2 = this.resources.getString(C37511R.string.crypto_acats_transferable_cash_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = this.resources.getString(C37511R.string.crypto_acats_transferable_cash_subtitle);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            arrayList.add(new AssetListSectionState(string2, string3, immutableList));
        }
        List<PartnerCryptoAssetDto> crypto2 = partnerAccountAssetsDto.getCrypto();
        ArrayList<PartnerCryptoAssetDto> arrayList4 = new ArrayList();
        for (Object obj3 : crypto2) {
            if (((PartnerCryptoAssetDto) obj3).is_supported()) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (PartnerCryptoAssetDto partnerCryptoAssetDto : arrayList4) {
            Iterator<T> it3 = partnerCryptoAssetDto.getBalance().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (Intrinsics.areEqual(((PartnerAssetBalanceDto) next3).getType(), AVAILABLE_BALANCE_TYPE)) {
                    break;
                }
            }
            PartnerAssetBalanceDto partnerAssetBalanceDto2 = (PartnerAssetBalanceDto) next3;
            if (partnerAssetBalanceDto2 == null || (quantity3 = partnerAssetBalanceDto2.getQuantity()) == null || (bigDecimalOrThrow3 = quantity3.toBigDecimalOrThrow()) == null || (str3 = FormatsLocalized.getLargePrecisionFormat().format(bigDecimalOrThrow3)) == null) {
                str3 = "-";
            }
            arrayList5.add(new BentoBaseRowState((BentoBaseRowState.Start) null, partnerCryptoAssetDto.getAsset_name(), (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(str3 + " " + partnerCryptoAssetDto.getAsset_symbol()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null));
        }
        ImmutableList immutableList2 = extensions2.toImmutableList(arrayList5);
        if (!immutableList2.isEmpty()) {
            String string4 = this.resources.getString(C37511R.string.crypto_acats_transferable_crypto_title);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = this.resources.getString(C37511R.string.crypto_acats_transferable_crypto_subtitle);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            arrayList.add(new AssetListSectionState(string4, string5, immutableList2));
        }
        List<PartnerFiatAssetDto> fiat2 = partnerAccountAssetsDto.getFiat();
        ArrayList<PartnerFiatAssetDto> arrayList6 = new ArrayList();
        for (Object obj4 : fiat2) {
            if (!((PartnerFiatAssetDto) obj4).is_supported()) {
                arrayList6.add(obj4);
            }
        }
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
        for (PartnerFiatAssetDto partnerFiatAssetDto2 : arrayList6) {
            String asset_symbol2 = partnerFiatAssetDto2.getAsset_symbol();
            Iterator<T> it4 = partnerFiatAssetDto2.getBalance().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
                if (Intrinsics.areEqual(((PartnerAssetBalanceDto) next2).getType(), AVAILABLE_BALANCE_TYPE)) {
                    break;
                }
            }
            PartnerAssetBalanceDto partnerAssetBalanceDto3 = (PartnerAssetBalanceDto) next2;
            if (partnerAssetBalanceDto3 == null || (quantity2 = partnerAssetBalanceDto3.getQuantity()) == null || (bigDecimalOrThrow2 = quantity2.toBigDecimalOrThrow()) == null) {
                str2 = "-";
            } else {
                Currency currency2 = Currency.getInstance(partnerFiatAssetDto2.getAsset_symbol());
                Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(...)");
                Money money2 = Money3.toMoney(bigDecimalOrThrow2, currency2);
                if (money2 == null || (str2 = Money.format$default(money2, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
                }
            }
            arrayList7.add(new BentoBaseRowState((BentoBaseRowState.Start) null, asset_symbol2, (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(str2), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null));
        }
        ImmutableList immutableList3 = extensions2.toImmutableList(arrayList7);
        if (!immutableList3.isEmpty()) {
            String string6 = this.resources.getString(C37511R.string.crypto_acats_non_transferable_cash_title);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            String string7 = this.resources.getString(C37511R.string.crypto_acats_non_transferable_cash_subtitle);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            arrayList.add(new AssetListSectionState(string6, string7, immutableList3));
        }
        List<PartnerCryptoAssetDto> crypto3 = partnerAccountAssetsDto.getCrypto();
        ArrayList<PartnerCryptoAssetDto> arrayList8 = new ArrayList();
        for (Object obj5 : crypto3) {
            if (!((PartnerCryptoAssetDto) obj5).is_supported()) {
                arrayList8.add(obj5);
            }
        }
        ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
        for (PartnerCryptoAssetDto partnerCryptoAssetDto2 : arrayList8) {
            Iterator<T> it5 = partnerCryptoAssetDto2.getBalance().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
                if (Intrinsics.areEqual(((PartnerAssetBalanceDto) next).getType(), AVAILABLE_BALANCE_TYPE)) {
                    break;
                }
            }
            PartnerAssetBalanceDto partnerAssetBalanceDto4 = (PartnerAssetBalanceDto) next;
            if (partnerAssetBalanceDto4 == null || (quantity = partnerAssetBalanceDto4.getQuantity()) == null || (bigDecimalOrThrow = quantity.toBigDecimalOrThrow()) == null || (str = FormatsLocalized.getLargePrecisionFormat().format(bigDecimalOrThrow)) == null) {
                str = "-";
            }
            arrayList9.add(new BentoBaseRowState((BentoBaseRowState.Start) null, partnerCryptoAssetDto2.getAsset_name(), (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(str + " " + partnerCryptoAssetDto2.getAsset_symbol()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null));
        }
        ImmutableList immutableList4 = extensions2.toImmutableList(arrayList9);
        if (!immutableList4.isEmpty()) {
            String string8 = this.resources.getString(C37511R.string.crypto_acats_non_transferable_crypto_title);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            String string9 = this.resources.getString(C37511R.string.crypto_acats_non_transferable_crypto_subtitle);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            arrayList.add(new AssetListSectionState(string8, string9, immutableList4));
        }
        return extensions2.toImmutableList(arrayList);
    }
}
