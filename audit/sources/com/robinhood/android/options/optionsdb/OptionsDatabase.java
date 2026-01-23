package com.robinhood.android.options.optionsdb;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.robinhood.database.FeatureRoomDatabase;
import com.robinhood.models.dao.OptionChainSettingsTableMetricsDao;
import com.robinhood.utils.room.RoomDatabases;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDatabase.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH&R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/options/optionsdb/OptionsDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/robinhood/database/FeatureRoomDatabase;", "<init>", "()V", "databaseName", "", "getDatabaseName", "()Ljava/lang/String;", "closeAndDelete", "", "context", "Landroid/content/Context;", "optionChainSettingsTableMetricsDao", "Lcom/robinhood/models/dao/OptionChainSettingsTableMetricsDao;", "Companion", "lib-options-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionsDatabase extends RoomDatabase implements FeatureRoomDatabase {
    public static final String DATABASE_NAME = "robinhood-options-room.db";
    public static final int VERSION = 1;

    public abstract OptionChainSettingsTableMetricsDao optionChainSettingsTableMetricsDao();

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
