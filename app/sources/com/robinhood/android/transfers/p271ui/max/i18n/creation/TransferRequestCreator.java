package com.robinhood.android.transfers.p271ui.max.i18n.creation;

import com.robinhood.android.transfers.p271ui.max.i18n.creation.InternationalCreateTransferRequestFactory;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.transfers.api.Currency;
import com.robinhood.transfers.api.TransferType;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.coroutines.Continuation;

/* compiled from: TransferRequestCreator.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH¦@¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/creation/TransferRequestCreator;", "", "transferType", "Lcom/robinhood/transfers/api/TransferType;", "getTransferType", "()Lcom/robinhood/transfers/api/TransferType;", "getCurrency", "Lcom/robinhood/transfers/api/Currency;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "createSourceAndSinkAccount", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "externalAccountId", "", "(Lcom/robinhood/models/db/TransferDirection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAdditionalData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData;", "transferData", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory$TransferData;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface TransferRequestCreator {
    ApiCreateTransferRequest.ApiTransferAdditionalData createAdditionalData(InternationalCreateTransferRequestFactory.TransferData transferData);

    Object createSourceAndSinkAccount(TransferDirection transferDirection, String str, Continuation<? super Tuples2<ApiCreateTransferRequest.ApiTransferAccount, ApiCreateTransferRequest.ApiTransferAccount>> continuation);

    Currency getCurrency(TransferDirection transferDirection);

    TransferType getTransferType();
}
