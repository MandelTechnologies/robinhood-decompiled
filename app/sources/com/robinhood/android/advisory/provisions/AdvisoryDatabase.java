package com.robinhood.android.advisory.provisions;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.robinhood.database.FeatureRoomDatabase;
import com.robinhood.models.advisory.dao.AdvisorInsightsDao;
import com.robinhood.models.advisory.dao.AdvisorTradesDao;
import com.robinhood.models.advisory.dao.AdvisoryFeeDao;
import com.robinhood.models.advisory.dao.ManagedReturnsBreakdownDao;
import com.robinhood.models.advisory.dao.RestrictStocksDao;
import com.robinhood.utils.room.RoomDatabases;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryDatabase.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/provisions/AdvisoryDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/robinhood/database/FeatureRoomDatabase;", "<init>", "()V", "advisorTradesDao", "Lcom/robinhood/models/advisory/dao/AdvisorTradesDao;", "advisoryFeeDao", "Lcom/robinhood/models/advisory/dao/AdvisoryFeeDao;", "restrictStocksDao", "Lcom/robinhood/models/advisory/dao/RestrictStocksDao;", "managedReturnsBreakdownDao", "Lcom/robinhood/models/advisory/dao/ManagedReturnsBreakdownDao;", "advisorInsightsDao", "Lcom/robinhood/models/advisory/dao/AdvisorInsightsDao;", "databaseName", "", "getDatabaseName", "()Ljava/lang/String;", "closeAndDelete", "", "context", "Landroid/content/Context;", "Companion", "lib-advisory-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class AdvisoryDatabase extends RoomDatabase implements FeatureRoomDatabase {
    public static final String DATABASE_NAME = "robinhood-advisory-room.db";
    public static final int VERSION = 2;

    public abstract AdvisorInsightsDao advisorInsightsDao();

    public abstract AdvisorTradesDao advisorTradesDao();

    public abstract AdvisoryFeeDao advisoryFeeDao();

    public abstract ManagedReturnsBreakdownDao managedReturnsBreakdownDao();

    public abstract RestrictStocksDao restrictStocksDao();

    @Override // com.robinhood.database.FeatureRoomDatabase
    public String getDatabaseName() {
        return DATABASE_NAME;
    }

    @Override // com.robinhood.database.FeatureRoomDatabase
    public void closeAndDelete(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RoomDatabases.closeAndDelete(this, context, getDatabaseName());
    }
}
