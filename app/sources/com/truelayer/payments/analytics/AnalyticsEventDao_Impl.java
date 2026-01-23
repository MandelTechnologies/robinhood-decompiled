package com.truelayer.payments.analytics;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p015db.SupportSQLiteStatement;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.analytics.events.AnalyticsEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class AnalyticsEventDao_Impl implements AnalyticsDB2 {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<AnalyticsEvent> __deletionAdapterOfAnalyticsEvent;
    private final EntityInsertionAdapter<AnalyticsEvent> __insertionAdapterOfAnalyticsEvent;
    private final SharedSQLiteStatement __preparedStmtOfTrimDB;

    public AnalyticsEventDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfAnalyticsEvent = new EntityInsertionAdapter<AnalyticsEvent>(__db) { // from class: com.truelayer.payments.analytics.AnalyticsEventDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR ABORT INTO `AnalyticsEvent` (`uid`,`event_name`,`data`,`timestamp`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final AnalyticsEvent entity) {
                statement.bindLong(1, entity.getUid());
                statement.bindString(2, entity.getEventName());
                statement.bindString(3, entity.getData());
                statement.bindLong(4, entity.getTimestamp());
            }
        };
        this.__deletionAdapterOfAnalyticsEvent = new EntityDeletionOrUpdateAdapter<AnalyticsEvent>(__db) { // from class: com.truelayer.payments.analytics.AnalyticsEventDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `AnalyticsEvent` WHERE `uid` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(final SupportSQLiteStatement statement, final AnalyticsEvent entity) {
                statement.bindLong(1, entity.getUid());
            }
        };
        this.__preparedStmtOfTrimDB = new SharedSQLiteStatement(__db) { // from class: com.truelayer.payments.analytics.AnalyticsEventDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM AnalyticsEvent WHERE timestamp < ?";
            }
        };
    }

    @Override // com.truelayer.payments.analytics.AnalyticsDB2
    public void insert(final AnalyticsEvent analyticsEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfAnalyticsEvent.insert((EntityInsertionAdapter<AnalyticsEvent>) analyticsEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.truelayer.payments.analytics.AnalyticsDB2
    public void delete(final AnalyticsEvent analyticsEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfAnalyticsEvent.handle(analyticsEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.truelayer.payments.analytics.AnalyticsDB2
    public void trimDB(final long timeInMilliseconds) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfTrimDB.acquire();
        supportSQLiteStatementAcquire.bindLong(1, timeInMilliseconds);
        try {
            this.__db.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfTrimDB.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.truelayer.payments.analytics.AnalyticsDB2
    public List<AnalyticsEvent> getAll() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM AnalyticsEvent", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "event_name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, WebsocketGatewayConstants.DATA_KEY);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new AnalyticsEvent(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.truelayer.payments.analytics.AnalyticsDB2
    public Flow<AnalyticsEvent> getFirst() {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM AnalyticsEvent ORDER BY timestamp LIMIT 1", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"AnalyticsEvent"}, new Callable<AnalyticsEvent>() { // from class: com.truelayer.payments.analytics.AnalyticsEventDao_Impl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public AnalyticsEvent call() throws Exception {
                Cursor cursorQuery = DBUtil.query(AnalyticsEventDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    return cursorQuery.moveToFirst() ? new AnalyticsEvent(cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "event_name")), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, WebsocketGatewayConstants.DATA_KEY)), cursorQuery.getLong(CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp"))) : null;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }
}
