package com.robinhood.shared.idl.p384db.provisions;

import android.app.Application;
import com.robinhood.database.ForDatabase;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.database.TypeConverters;
import com.robinhood.shared.models.idl.dao.IdlCacheDao;
import com.robinhood.shared.models.idl.p389db.IdlDatabase;
import com.robinhood.utils.room.DatabaseBuilderFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdlDbModule.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0013\b\u0001\u0010\n\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/idl/db/provisions/IdlDbModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/shared/models/idl/db/IdlDatabase;", "app", "Landroid/app/Application;", "factory", "Lcom/robinhood/utils/room/DatabaseBuilderFactory;", "converters", "", "Lcom/robinhood/database/InjectedTypeConverter;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideIdlCacheDao", "Lcom/robinhood/shared/models/idl/dao/IdlCacheDao;", "idlDatabase", "lib-idl-db-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class IdlDbModule {
    public static final IdlDbModule INSTANCE = new IdlDbModule();

    private IdlDbModule() {
    }

    public final IdlDatabase provide(Application app, DatabaseBuilderFactory factory, @ForDatabase(IdlDatabase.class) Set<InjectedTypeConverter> converters) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converters, "converters");
        return (IdlDatabase) TypeConverters.addTypeConverters(factory.databaseBuilder(app, IdlDatabase.class, IdlDatabase.DATABASE_NAME), converters).fallbackToDestructiveMigration(false).build();
    }

    public final IdlCacheDao provideIdlCacheDao(IdlDatabase idlDatabase) {
        Intrinsics.checkNotNullParameter(idlDatabase, "idlDatabase");
        return idlDatabase.idlCacheDao();
    }
}
