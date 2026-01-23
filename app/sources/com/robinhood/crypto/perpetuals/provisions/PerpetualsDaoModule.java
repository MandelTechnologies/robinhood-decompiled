package com.robinhood.crypto.perpetuals.provisions;

import com.robinhood.crypto.models.perpetuals.dao.LeverageOptionsDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpabilityDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualAccountDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualButtonsDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualContractDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualContractDescriptionDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualContractDetailsDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualHistoricalChartDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualMarginAvailableDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualMarginEditDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualOpenPositionDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualOrderDetailsDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualPositionHealthDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualPositionHubStateDao;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualSettlementDao;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualsDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualsDaoModule.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006$"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/provisions/PerpetualsDaoModule;", "", "<init>", "()V", "provideContractDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualContractDao;", "db", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualsDatabase;", "provideMarginAvailableDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualMarginAvailableDao;", "provideOrderDetailsDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualOrderDetailsDao;", "provideContractDetailsDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualContractDetailsDao;", "provideOpenPositionDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualOpenPositionDao;", "providePerpetualHistoricalChartDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualHistoricalChartDao;", "providePerpetualPositionHealthDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualPositionHealthDao;", "providePerpetualContractDescriptionDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualContractDescriptionDao;", "providePerpetualSettlementDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualSettlementDao;", "provideLeverageOptionsDao", "Lcom/robinhood/crypto/models/perpetuals/dao/LeverageOptionsDao;", "providePerpetualButtonsDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualButtonsDao;", "providePerpetualMarginEditDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualMarginEditDao;", "providePerpabilityDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpabilityDao;", "providePerpetualPositionHubStateDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualPositionHubStateDao;", "perpetualAccountDao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualAccountDao;", "lib-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PerpetualsDaoModule {
    public static final PerpetualsDaoModule INSTANCE = new PerpetualsDaoModule();

    private PerpetualsDaoModule() {
    }

    public final PerpetualContractDao provideContractDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualContractDao();
    }

    public final PerpetualMarginAvailableDao provideMarginAvailableDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualMarginAvailableDao();
    }

    public final PerpetualOrderDetailsDao provideOrderDetailsDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualOrderDetailsDao();
    }

    public final PerpetualContractDetailsDao provideContractDetailsDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualContractDetailsDao();
    }

    public final PerpetualOpenPositionDao provideOpenPositionDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualOpenPositionDao();
    }

    public final PerpetualHistoricalChartDao providePerpetualHistoricalChartDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualHistoricalChartDao();
    }

    public final PerpetualPositionHealthDao providePerpetualPositionHealthDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualPositionHealthDao();
    }

    public final PerpetualContractDescriptionDao providePerpetualContractDescriptionDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualContractDescriptionDao();
    }

    public final PerpetualSettlementDao providePerpetualSettlementDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualSettlementDao();
    }

    public final LeverageOptionsDao provideLeverageOptionsDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.leverageOptionsDao();
    }

    public final PerpetualButtonsDao providePerpetualButtonsDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualButtonsDao();
    }

    public final PerpetualMarginEditDao providePerpetualMarginEditDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualMarginEditDao();
    }

    public final PerpabilityDao providePerpabilityDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpabilityDao();
    }

    public final PerpetualPositionHubStateDao providePerpetualPositionHubStateDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualPositionHubStateDao();
    }

    public final PerpetualAccountDao perpetualAccountDao(PerpetualsDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        return db.perpetualAccountDao();
    }
}
