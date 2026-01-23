package com.robinhood.utils.room;

import androidx.sqlite.p015db.SupportSQLiteOpenHelper;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SqliteOpenHelperFactoryModule_ProvideSqliteOpenHelperFactoryFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/room/SqliteOpenHelperFactoryModule_ProvideSqliteOpenHelperFactoryFactory;", "Ldagger/internal/Factory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideSqliteOpenHelperFactory", "lib-utils-room_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.room.SqliteOpenHelperFactoryModule_ProvideSqliteOpenHelperFactoryFactory */
/* loaded from: classes12.dex */
public final class C41974x41d8cc78 implements Factory<SupportSQLiteOpenHelper.Factory> {
    public static final C41974x41d8cc78 INSTANCE = new C41974x41d8cc78();

    private C41974x41d8cc78() {
    }

    @Override // javax.inject.Provider
    public SupportSQLiteOpenHelper.Factory get() {
        return provideSqliteOpenHelperFactory();
    }

    @JvmStatic
    public static final C41974x41d8cc78 create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final SupportSQLiteOpenHelper.Factory provideSqliteOpenHelperFactory() {
        Object objCheckNotNull = Preconditions.checkNotNull(SqliteOpenHelperFactoryModule.INSTANCE.provideSqliteOpenHelperFactory(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (SupportSQLiteOpenHelper.Factory) objCheckNotNull;
    }
}
