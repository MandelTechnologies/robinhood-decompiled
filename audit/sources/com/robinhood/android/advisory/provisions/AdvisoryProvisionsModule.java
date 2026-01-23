package com.robinhood.android.advisory.provisions;

import android.app.Application;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.robinhood.database.ForDatabase;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.database.TypeConverters;
import com.robinhood.models.advisory.dao.AdvisorInsightsDao;
import com.robinhood.models.advisory.dao.AdvisorTradesDao;
import com.robinhood.models.advisory.dao.AdvisoryFeeDao;
import com.robinhood.models.advisory.dao.ManagedReturnsBreakdownDao;
import com.robinhood.models.advisory.dao.RestrictStocksDao;
import com.robinhood.utils.room.DatabaseBuilderFactory;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryProvisionsModule.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0013\b\u0001\u0010\n\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0005H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/advisory/provisions/AdvisoryProvisionsModule;", "", "<init>", "()V", "provideAdvisoryDatabase", "Lcom/robinhood/android/advisory/provisions/AdvisoryDatabase;", "app", "Landroid/app/Application;", "factory", "Lcom/robinhood/utils/room/DatabaseBuilderFactory;", "converters", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideFeatureDatabase", "database", "provideAdvisorTradeDao", "Lcom/robinhood/models/advisory/dao/AdvisorTradesDao;", "advisoryDatabase", "provideAdvisoryFeeDao", "Lcom/robinhood/models/advisory/dao/AdvisoryFeeDao;", "provideManagedReturnsBreakdownDao", "Lcom/robinhood/models/advisory/dao/ManagedReturnsBreakdownDao;", "provideRestrictedStocksDao", "Lcom/robinhood/models/advisory/dao/RestrictStocksDao;", "provideAdvisorInsightsDao", "Lcom/robinhood/models/advisory/dao/AdvisorInsightsDao;", "lib-advisory-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryProvisionsModule {
    public final AdvisoryDatabase provideFeatureDatabase(AdvisoryDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database;
    }

    public final AdvisoryDatabase provideAdvisoryDatabase(Application app, DatabaseBuilderFactory factory, @ForDatabase(AdvisoryDatabase.class) Set<InjectedTypeConverter> converters) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converters, "converters");
        RoomDatabase.Builder builderAddTypeConverters = TypeConverters.addTypeConverters(factory.databaseBuilder(app, AdvisoryDatabase.class, AdvisoryDatabase.DATABASE_NAME), converters);
        Migration[] advisory_database_migrations = AdvisoryDatabaseMigrations.getADVISORY_DATABASE_MIGRATIONS();
        return (AdvisoryDatabase) builderAddTypeConverters.addMigrations((Migration[]) Arrays.copyOf(advisory_database_migrations, advisory_database_migrations.length)).fallbackToDestructiveMigration(true).build();
    }

    public final AdvisorTradesDao provideAdvisorTradeDao(AdvisoryDatabase advisoryDatabase) {
        Intrinsics.checkNotNullParameter(advisoryDatabase, "advisoryDatabase");
        return advisoryDatabase.advisorTradesDao();
    }

    public final AdvisoryFeeDao provideAdvisoryFeeDao(AdvisoryDatabase advisoryDatabase) {
        Intrinsics.checkNotNullParameter(advisoryDatabase, "advisoryDatabase");
        return advisoryDatabase.advisoryFeeDao();
    }

    public final ManagedReturnsBreakdownDao provideManagedReturnsBreakdownDao(AdvisoryDatabase advisoryDatabase) {
        Intrinsics.checkNotNullParameter(advisoryDatabase, "advisoryDatabase");
        return advisoryDatabase.managedReturnsBreakdownDao();
    }

    public final RestrictStocksDao provideRestrictedStocksDao(AdvisoryDatabase advisoryDatabase) {
        Intrinsics.checkNotNullParameter(advisoryDatabase, "advisoryDatabase");
        return advisoryDatabase.restrictStocksDao();
    }

    public final AdvisorInsightsDao provideAdvisorInsightsDao(AdvisoryDatabase advisoryDatabase) {
        Intrinsics.checkNotNullParameter(advisoryDatabase, "advisoryDatabase");
        return advisoryDatabase.advisorInsightsDao();
    }
}
