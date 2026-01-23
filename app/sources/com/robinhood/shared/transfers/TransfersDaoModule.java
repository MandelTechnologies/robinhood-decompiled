package com.robinhood.shared.transfers;

import com.robinhood.models.dao.PaymentIntentDao;
import com.robinhood.models.paymentinstrument.dao.PaymentInstrumentV2Dao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransfersDaoModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/transfers/TransfersDaoModule;", "", "<init>", "()V", "providePaymentInstrumentV2Dao", "Lcom/robinhood/models/paymentinstrument/dao/PaymentInstrumentV2Dao;", "transfersDatabase", "Lcom/robinhood/shared/transfers/TransfersDatabase;", "providePaymentIntentDao", "Lcom/robinhood/models/dao/PaymentIntentDao;", "lib-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TransfersDaoModule {
    public static final TransfersDaoModule INSTANCE = new TransfersDaoModule();

    private TransfersDaoModule() {
    }

    public final PaymentInstrumentV2Dao providePaymentInstrumentV2Dao(TransfersDatabase transfersDatabase) {
        Intrinsics.checkNotNullParameter(transfersDatabase, "transfersDatabase");
        return transfersDatabase.paymentInstrumentV2Dao();
    }

    public final PaymentIntentDao providePaymentIntentDao(TransfersDatabase transfersDatabase) {
        Intrinsics.checkNotNullParameter(transfersDatabase, "transfersDatabase");
        return transfersDatabase.paymentIntentDao();
    }
}
