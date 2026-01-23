package com.robinhood.store;

import androidx.room.RoomDatabase;
import com.robinhood.api.utils.NetworkWrapper;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.database.BaseDbHelper;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.util.LastUpdatedAtManager;
import com.robinhood.utils.LogoutKillswitch;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: StoreBundle.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/store/StoreBundle;", "", "Lcom/robinhood/database/BaseDbHelper;", "dbHelper", "Lcom/robinhood/api/utils/NetworkWrapper;", "networkWrapper", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "Lcom/robinhood/util/LastUpdatedAtManager;", "lastUpdatedAtManager", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/database/BaseDbHelper;Lcom/robinhood/api/utils/NetworkWrapper;Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/util/LastUpdatedAtManager;Lcom/robinhood/coroutines/rx/RxFactory;Lj$/time/Clock;)V", "Lcom/robinhood/database/BaseDbHelper;", "getDbHelper", "()Lcom/robinhood/database/BaseDbHelper;", "Lcom/robinhood/api/utils/NetworkWrapper;", "getNetworkWrapper", "()Lcom/robinhood/api/utils/NetworkWrapper;", "Lcom/robinhood/utils/LogoutKillswitch;", "getLogoutKillswitch", "()Lcom/robinhood/utils/LogoutKillswitch;", "Lcom/robinhood/util/LastUpdatedAtManager;", "getLastUpdatedAtManager", "()Lcom/robinhood/util/LastUpdatedAtManager;", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "Landroidx/room/RoomDatabase;", "getRoomDatabase", "()Landroidx/room/RoomDatabase;", "roomDatabase", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StoreBundle {
    private final Clock clock;
    private final BaseDbHelper dbHelper;
    private final LastUpdatedAtManager lastUpdatedAtManager;
    private final LogoutKillswitch logoutKillswitch;
    private final NetworkWrapper networkWrapper;
    private final RxFactory rxFactory;

    public StoreBundle(BaseDbHelper dbHelper, NetworkWrapper networkWrapper, LogoutKillswitch logoutKillswitch, LastUpdatedAtManager lastUpdatedAtManager, RxFactory rxFactory, Clock clock) {
        Intrinsics.checkNotNullParameter(dbHelper, "dbHelper");
        Intrinsics.checkNotNullParameter(networkWrapper, "networkWrapper");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(lastUpdatedAtManager, "lastUpdatedAtManager");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.dbHelper = dbHelper;
        this.networkWrapper = networkWrapper;
        this.logoutKillswitch = logoutKillswitch;
        this.lastUpdatedAtManager = lastUpdatedAtManager;
        this.rxFactory = rxFactory;
        this.clock = clock;
    }

    public final BaseDbHelper getDbHelper() {
        return this.dbHelper;
    }

    public final NetworkWrapper getNetworkWrapper() {
        return this.networkWrapper;
    }

    public final LogoutKillswitch getLogoutKillswitch() {
        return this.logoutKillswitch;
    }

    public final LastUpdatedAtManager getLastUpdatedAtManager() {
        return this.lastUpdatedAtManager;
    }

    public final RxFactory getRxFactory() {
        return this.rxFactory;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final RoomDatabase getRoomDatabase() {
        return this.dbHelper.getRoomDatabase();
    }
}
