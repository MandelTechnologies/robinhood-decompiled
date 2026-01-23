package com.robinhood.android.lib.margin.p167db;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao;
import com.robinhood.android.lib.margin.p167db.dao.MarginUpgradeRestrictionDao;
import com.robinhood.database.FeatureRoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginDatabase.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/db/MarginDatabase;", "Landroidx/room/RoomDatabase;", "Lcom/robinhood/database/FeatureRoomDatabase;", "<init>", "()V", "marginUpgradeRestrictionDao", "Lcom/robinhood/android/lib/margin/db/dao/MarginUpgradeRestrictionDao;", "marginSettingsDao", "Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao;", "databaseName", "", "getDatabaseName", "()Ljava/lang/String;", "closeAndDelete", "", "context", "Landroid/content/Context;", "Companion", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class MarginDatabase extends RoomDatabase implements FeatureRoomDatabase {
    public static final String DATABASE_NAME = "robinhood-margin-room.db";
    public static final int VERSION = 2;

    public abstract LeveredMarginSettingsDao marginSettingsDao();

    public abstract MarginUpgradeRestrictionDao marginUpgradeRestrictionDao();

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
