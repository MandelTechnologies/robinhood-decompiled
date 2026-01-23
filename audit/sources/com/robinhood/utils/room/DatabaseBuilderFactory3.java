package com.robinhood.utils.room;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.p015db.SupportSQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DatabaseBuilderFactory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\rH\u0016J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/utils/room/RealDatabaseBuilderFactory;", "Lcom/robinhood/utils/room/DatabaseBuilderFactory;", "sqliteOpenHelperFactory", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;)V", "inMemoryDatabaseBuilder", "Landroidx/room/RoomDatabase$Builder;", "T", "Landroidx/room/RoomDatabase;", "context", "Landroid/content/Context;", "klass", "Ljava/lang/Class;", "databaseBuilder", "name", "", "lib-utils-room_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.room.RealDatabaseBuilderFactory, reason: use source file name */
/* loaded from: classes12.dex */
public final class DatabaseBuilderFactory3 implements DatabaseBuilderFactory {
    private final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;

    public DatabaseBuilderFactory3(SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory) {
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        this.sqliteOpenHelperFactory = sqliteOpenHelperFactory;
    }

    @Override // com.robinhood.utils.room.DatabaseBuilderFactory
    public <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, Class<T> klass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return Room.inMemoryDatabaseBuilder(context, klass).openHelperFactory(this.sqliteOpenHelperFactory);
    }

    @Override // com.robinhood.utils.room.DatabaseBuilderFactory
    public <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, Class<T> klass, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(name, "name");
        return Room.databaseBuilder(context, klass, name).openHelperFactory(this.sqliteOpenHelperFactory);
    }
}
