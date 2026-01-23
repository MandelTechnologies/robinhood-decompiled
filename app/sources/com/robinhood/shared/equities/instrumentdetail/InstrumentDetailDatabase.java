package com.robinhood.shared.equities.instrumentdetail;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.robinhood.database.FeatureRoomDatabase;
import com.robinhood.shared.equities.models.instrumentdetails.dao.EarningDao;
import com.robinhood.shared.equities.models.instrumentdetails.dao.FundamentalDao;
import com.robinhood.shared.equities.models.instrumentdetails.dao.InstrumentRatingsDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailDatabase.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/equities/instrumentdetail/InstrumentDetailDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/robinhood/database/FeatureRoomDatabase;", "<init>", "()V", "earningDao", "Lcom/robinhood/shared/equities/models/instrumentdetails/dao/EarningDao;", "fundamentalDao", "Lcom/robinhood/shared/equities/models/instrumentdetails/dao/FundamentalDao;", "instrumentRatingsDao", "Lcom/robinhood/shared/equities/models/instrumentdetails/dao/InstrumentRatingsDao;", "databaseName", "", "getDatabaseName", "()Ljava/lang/String;", "closeAndDelete", "", "context", "Landroid/content/Context;", "Companion", "lib-instrument-detail-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class InstrumentDetailDatabase extends RoomDatabase implements FeatureRoomDatabase {
    public static final String DATABASE_NAME = "robinhood-instrument-detail-room.db";
    public static final int VERSION = 1;

    public abstract EarningDao earningDao();

    public abstract FundamentalDao fundamentalDao();

    public abstract InstrumentRatingsDao instrumentRatingsDao();

    @Override // com.robinhood.database.FeatureRoomDatabase
    public String getDatabaseName() {
        return DATABASE_NAME;
    }

    @Override // com.robinhood.database.FeatureRoomDatabase
    public void closeAndDelete(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        close();
        context.deleteDatabase(getDatabaseName());
    }
}
