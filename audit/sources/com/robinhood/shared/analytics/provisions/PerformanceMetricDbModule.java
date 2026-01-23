package com.robinhood.shared.analytics.provisions;

import android.app.Application;
import com.robinhood.analytics.dao.PerformanceMetricDatabase;
import com.robinhood.database.FeatureRoomDatabase;
import com.robinhood.database.ForDatabase;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.database.TypeConverters;
import com.robinhood.utils.room.DatabaseBuilderFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceMetricDbModule.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0013\b\u0001\u0010\n\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/analytics/provisions/PerformanceMetricDbModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/analytics/dao/PerformanceMetricDatabase;", "app", "Landroid/app/Application;", "factory", "Lcom/robinhood/utils/room/DatabaseBuilderFactory;", "converters", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideFeatureDatabase", "Lcom/robinhood/database/FeatureRoomDatabase;", "database", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PerformanceMetricDbModule {
    public static final PerformanceMetricDbModule INSTANCE = new PerformanceMetricDbModule();

    public final FeatureRoomDatabase provideFeatureDatabase(PerformanceMetricDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database;
    }

    private PerformanceMetricDbModule() {
    }

    public final PerformanceMetricDatabase provide(Application app, DatabaseBuilderFactory factory, @ForDatabase(PerformanceMetricDatabase.class) Set<InjectedTypeConverter> converters) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converters, "converters");
        return (PerformanceMetricDatabase) TypeConverters.addTypeConverters(factory.databaseBuilder(app, PerformanceMetricDatabase.class, PerformanceMetricDatabase.ROOM_DB_NAME), converters).fallbackToDestructiveMigration(false).build();
    }
}
