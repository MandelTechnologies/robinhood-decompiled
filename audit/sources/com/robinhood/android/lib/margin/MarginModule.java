package com.robinhood.android.lib.margin;

import android.app.Application;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility2;
import com.robinhood.android.lib.margin.api.InterestRatesApi;
import com.robinhood.android.lib.margin.api.MarginBrokebackApi;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import com.robinhood.android.lib.margin.api.RetirementInstantUpgradeApi;
import com.robinhood.android.lib.margin.p167db.MarginDatabase;
import com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao;
import com.robinhood.android.lib.margin.p167db.dao.MarginUpgradeRestrictionDao;
import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.database.FeatureRoomDatabase;
import com.robinhood.database.ForDatabase;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.database.TypeConverters;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import com.robinhood.utils.room.DatabaseBuilderFactory;
import com.squareup.moshi.JsonAdapter;
import dagger.Lazy;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: MarginModule.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0013\b\u0001\u0010\n\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0005H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0005H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007J\u0018\u0010\u001e\u001a\u00020\u001f2\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007J\u0018\u0010 \u001a\u00020!2\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/lib/margin/MarginModule;", "", "<init>", "()V", "provideMarginDatabase", "Lcom/robinhood/android/lib/margin/db/MarginDatabase;", "app", "Landroid/app/Application;", "factory", "Lcom/robinhood/utils/room/DatabaseBuilderFactory;", "converters", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideMarginFeatureDatabase", "Lcom/robinhood/database/FeatureRoomDatabase;", "marginDatabase", "provideMarginUpgradeRestrictionDao", "Lcom/robinhood/android/lib/margin/db/dao/MarginUpgradeRestrictionDao;", "provideMarginSettingsDao", "Lcom/robinhood/android/lib/margin/db/dao/LeveredMarginSettingsDao;", "provideMarginEligibilityJsonAdapter", "Lcom/squareup/moshi/JsonAdapter$Factory;", "provideMarginBrokebackApi", "Lcom/robinhood/android/lib/margin/api/MarginBrokebackApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "provideMarginInvestingApi", "Lcom/robinhood/android/lib/margin/api/MarginInvestingApi;", "provideInterestRatesApi", "Lcom/robinhood/android/lib/margin/api/InterestRatesApi;", "provideRetirementInstantUpgradeApi", "Lcom/robinhood/android/lib/margin/api/RetirementInstantUpgradeApi;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class MarginModule {
    public static final MarginModule INSTANCE = new MarginModule();

    public final FeatureRoomDatabase provideMarginFeatureDatabase(MarginDatabase marginDatabase) {
        Intrinsics.checkNotNullParameter(marginDatabase, "marginDatabase");
        return marginDatabase;
    }

    private MarginModule() {
    }

    public final MarginDatabase provideMarginDatabase(Application app, DatabaseBuilderFactory factory, @ForDatabase(MarginDatabase.class) Set<InjectedTypeConverter> converters) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converters, "converters");
        return (MarginDatabase) TypeConverters.addTypeConverters(factory.databaseBuilder(app, MarginDatabase.class, MarginDatabase.DATABASE_NAME), converters).fallbackToDestructiveMigration(false).build();
    }

    public final MarginUpgradeRestrictionDao provideMarginUpgradeRestrictionDao(MarginDatabase marginDatabase) {
        Intrinsics.checkNotNullParameter(marginDatabase, "marginDatabase");
        return marginDatabase.marginUpgradeRestrictionDao();
    }

    public final LeveredMarginSettingsDao provideMarginSettingsDao(MarginDatabase marginDatabase) {
        Intrinsics.checkNotNullParameter(marginDatabase, "marginDatabase");
        return marginDatabase.marginSettingsDao();
    }

    public final InterestRatesApi provideInterestRatesApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (InterestRatesApi) LazyRetrofit3.create(retrofit, InterestRatesApi.class);
    }

    public final MarginBrokebackApi provideMarginBrokebackApi(@BrokebackRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (MarginBrokebackApi) LazyRetrofit3.create(retrofit, MarginBrokebackApi.class);
    }

    public final MarginInvestingApi provideMarginInvestingApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (MarginInvestingApi) LazyRetrofit3.create(retrofit, MarginInvestingApi.class);
    }

    public final RetirementInstantUpgradeApi provideRetirementInstantUpgradeApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (RetirementInstantUpgradeApi) LazyRetrofit3.create(retrofit, RetirementInstantUpgradeApi.class);
    }

    public final JsonAdapter.Factory provideMarginEligibilityJsonAdapter() {
        return ApiMarginEligibility2.INSTANCE.getJsonAdapterFactory();
    }
}
