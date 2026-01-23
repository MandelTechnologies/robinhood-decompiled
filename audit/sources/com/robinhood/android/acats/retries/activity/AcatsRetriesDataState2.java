package com.robinhood.android.acats.retries.activity;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsRetriesDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\t"}, m3636d2 = {"toUiModels", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer$Asset;", "instruments", "Lcom/robinhood/models/db/Instrument;", "options", "Lcom/robinhood/models/db/OptionInstrument;", "optionsInstruments", "feature-acats-retries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDataStateKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsRetriesDataState2 {

    /* compiled from: AcatsRetriesDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesDataStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiAcatsTransfer.Asset.Direction.values().length];
            try {
                iArr[ApiAcatsTransfer.Asset.Direction.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAcatsTransfer.Asset.Direction.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiAcatsTransfer.Asset.AssetType.values().length];
            try {
                iArr2[ApiAcatsTransfer.Asset.AssetType.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiAcatsTransfer.Asset.AssetType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiAcatsTransfer.Asset.AssetType.OPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiAcatsTransfer.Asset.AssetType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.robinhood.android.acatsin.partials.UiAcatsAsset$EquityAsset] */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.robinhood.android.acatsin.partials.UiAcatsAsset$OptionAsset] */
    public static final List<UiAcatsAsset> toUiModels(List<AcatsTransfer.Asset> list, List<Instrument> instruments, List<OptionInstrument> options, List<Instrument> optionsInstruments) {
        UiAcatsAsset.CashAsset.CashType cashType;
        Object next;
        UiAcatsAsset.CashAsset equityAsset;
        Object next2;
        Object next3;
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(optionsInstruments, "optionsInstruments");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AcatsTransfer.Asset asset : list) {
                int i = WhenMappings.$EnumSwitchMapping$1[asset.getAssetType().ordinal()];
                UiAcatsAsset.CashAsset cashAsset = null;
                if (i != 1) {
                    if (i == 2) {
                        Iterator it = instruments.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.areEqual(((Instrument) next).getId(), asset.getAssetId())) {
                                break;
                            }
                        }
                        if (next == null) {
                            throw new IllegalStateException(("Instrument not fetched for assetId " + asset.getAssetId()).toString());
                        }
                        Instrument instrument = (Instrument) next;
                        BigDecimal quantity = asset.getQuantity();
                        equityAsset = new UiAcatsAsset.EquityAsset(instrument.getId(), instrument.getSymbol(), instrument.getName(), quantity != null ? Integer.valueOf(quantity.intValue()) : null, asset.getDirection(), asset.getBorrowFee());
                    } else if (i == 3) {
                        Iterator it2 = options.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            if (Intrinsics.areEqual(((OptionInstrument) next2).getId(), asset.getAssetId())) {
                                break;
                            }
                        }
                        OptionInstrument optionInstrument = (OptionInstrument) next2;
                        if (optionInstrument == null) {
                            throw new IllegalStateException(("Option not fetched for assetId " + asset.getAssetId()).toString());
                        }
                        Iterator it3 = optionsInstruments.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                            if (Intrinsics.areEqual(((Instrument) next3).getDisplaySymbol(), optionInstrument.getChainSymbol())) {
                                break;
                            }
                        }
                        Instrument instrument2 = (Instrument) next3;
                        if (instrument2 == null) {
                            throw new IllegalStateException(("Option underlying instrument not fetched for option symbol " + optionInstrument.getChainSymbol()).toString());
                        }
                        UUID id = optionInstrument.getId();
                        ApiAcatsTransfer.Asset.Direction direction = asset.getDirection();
                        BigDecimal quantity2 = asset.getQuantity();
                        equityAsset = new UiAcatsAsset.OptionAsset(id, instrument2.getId(), instrument2.getSymbol(), direction, quantity2 != null ? Integer.valueOf(Math.abs(quantity2.intValue())) : null, optionInstrument.getContractType(), Money3.toMoney(optionInstrument.getStrikePrice(), Currencies.USD), optionInstrument.getExpirationDate());
                    } else if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cashAsset = equityAsset;
                } else {
                    BigDecimal quantity3 = asset.getQuantity();
                    Money money = quantity3 != null ? Money3.toMoney(quantity3, Currencies.USD) : null;
                    int i2 = WhenMappings.$EnumSwitchMapping$0[asset.getDirection().ordinal()];
                    if (i2 == 1) {
                        cashType = UiAcatsAsset.CashAsset.CashType.CASH;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cashType = UiAcatsAsset.CashAsset.CashType.MARGIN;
                    }
                    cashAsset = new UiAcatsAsset.CashAsset(money, cashType, false);
                }
                arrayList.add(cashAsset);
            }
        }
        return CollectionsKt.filterNotNull(arrayList);
    }
}
