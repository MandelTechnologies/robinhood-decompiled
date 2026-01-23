package com.robinhood.android.acatsin.partials.option;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.util.Money;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: AcatsInPartialOptionAssetStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetDataState;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetViewState;", "<init>", "()V", "reduce", "dataState", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInPartialOptionAssetStateProvider implements StateProvider<AcatsInPartialOptionAssetDataState, AcatsInPartialOptionAssetViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsInPartialOptionAssetViewState reduce(AcatsInPartialOptionAssetDataState dataState) {
        Boolean bool;
        Integer num;
        OptionContractType optionContractType;
        LocalDate localDate;
        Money money;
        ApiAcatsTransfer.Asset.Direction direction;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UUID instrumentId = dataState.getInstrumentId();
        String symbol = dataState.getSymbol();
        UiAcatsAsset.OptionAsset assetToModify = dataState.getAssetToModify();
        Boolean boolIsAllContracts = dataState.isAllContracts();
        if (boolIsAllContracts != null) {
            bool = boolIsAllContracts;
        } else {
            UiAcatsAsset.OptionAsset assetToModify2 = dataState.getAssetToModify();
            if (assetToModify2 != null) {
                boolIsAllContracts = Boolean.valueOf(assetToModify2.getNumContracts() == null);
                bool = boolIsAllContracts;
            } else {
                bool = null;
            }
        }
        Integer numContracts = dataState.getNumContracts();
        if (numContracts != null) {
            num = numContracts;
        } else {
            UiAcatsAsset.OptionAsset assetToModify3 = dataState.getAssetToModify();
            if (assetToModify3 != null) {
                numContracts = assetToModify3.getNumContracts();
                num = numContracts;
            } else {
                num = null;
            }
        }
        OptionContractType optionType = dataState.getOptionType();
        if (optionType != null) {
            optionContractType = optionType;
        } else {
            UiAcatsAsset.OptionAsset assetToModify4 = dataState.getAssetToModify();
            if (assetToModify4 != null) {
                optionType = assetToModify4.getOptionType();
                optionContractType = optionType;
            } else {
                optionContractType = null;
            }
        }
        LocalDate expirationDate = dataState.getExpirationDate();
        if (expirationDate != null) {
            localDate = expirationDate;
        } else {
            UiAcatsAsset.OptionAsset assetToModify5 = dataState.getAssetToModify();
            if (assetToModify5 != null) {
                expirationDate = assetToModify5.getExpirationDate();
                localDate = expirationDate;
            } else {
                localDate = null;
            }
        }
        Money strikePrice = dataState.getStrikePrice();
        if (strikePrice != null) {
            money = strikePrice;
        } else {
            UiAcatsAsset.OptionAsset assetToModify6 = dataState.getAssetToModify();
            if (assetToModify6 != null) {
                strikePrice = assetToModify6.getStrikePrice();
                money = strikePrice;
            } else {
                money = null;
            }
        }
        ApiAcatsTransfer.Asset.Direction direction2 = dataState.getDirection();
        if (direction2 == null) {
            UiAcatsAsset.OptionAsset assetToModify7 = dataState.getAssetToModify();
            direction = assetToModify7 != null ? assetToModify7.getDirection() : null;
        } else {
            direction = direction2;
        }
        return new AcatsInPartialOptionAssetViewState(instrumentId, symbol, assetToModify, direction, bool, num, optionContractType, localDate, money, dataState.isButtonLoading());
    }
}
