package com.robinhood.redesign.provisions;

import android.app.Application;
import com.robinhood.database.FeatureRoomDatabase;
import com.robinhood.database.ForDatabase;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.database.TypeConverters;
import com.robinhood.utils.room.DatabaseBuilderFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RedesignDbModule.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0013\b\u0001\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/redesign/provisions/RedesignDbModule;", "", "<init>", "()V", "ROOM_DB_NAME", "", "provide", "Lcom/robinhood/redesign/provisions/RedesignDatabase;", "app", "Landroid/app/Application;", "factory", "Lcom/robinhood/utils/room/DatabaseBuilderFactory;", "converters", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideRedesignFeatureDatabase", "Lcom/robinhood/database/FeatureRoomDatabase;", "database", "lib-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RedesignDbModule {
    public static final RedesignDbModule INSTANCE = new RedesignDbModule();
    private static final String ROOM_DB_NAME = "robinhood-redesign-room.db";

    public final FeatureRoomDatabase provideRedesignFeatureDatabase(RedesignDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        return database;
    }

    private RedesignDbModule() {
    }

    public final RedesignDatabase provide(Application app, DatabaseBuilderFactory factory, @ForDatabase(RedesignDatabase.class) Set<InjectedTypeConverter> converters) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converters, "converters");
        return (RedesignDatabase) TypeConverters.addTypeConverters(factory.databaseBuilder(app, RedesignDatabase.class, "robinhood-redesign-room.db"), converters).fallbackToDestructiveMigration(false).build();
    }
}
