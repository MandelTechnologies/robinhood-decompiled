package com.singular.sdk.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import java.io.IOException;

/* loaded from: classes12.dex */
public class SQLitePersistentQueue implements Queue {
    private static final SingularLog logger = SingularLog.getLogger(SQLitePersistentQueue.class.getSimpleName());
    private SQLiteManager sqlite;

    public SQLitePersistentQueue(Context context) {
        this.sqlite = new SQLiteManager(new SQLiteHelper(context.getApplicationContext()));
    }

    @Override // com.singular.sdk.internal.Queue
    public synchronized void add(String str) throws IOException {
        if (this.sqlite.insert(str) == -1) {
            throw new IOException("Failed to add element = " + str);
        }
    }

    @Override // com.singular.sdk.internal.Queue
    public synchronized String peek() throws IOException {
        return this.sqlite.getHead();
    }

    @Override // com.singular.sdk.internal.Queue
    public synchronized void remove() throws IOException {
        this.sqlite.removeHead();
    }

    private static class SQLiteManager {
        private final SQLiteHelper helper;

        SQLiteManager(SQLiteHelper sQLiteHelper) {
            this.helper = sQLiteHelper;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        long insert(String str) throws Throwable {
            SQLiteDatabase writableDatabase;
            Throwable th;
            SQLException e;
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", str);
            try {
                writableDatabase = this.helper.getWritableDatabase();
                try {
                    try {
                        long jInsert = writableDatabase.insert("events", null, contentValues);
                        SQLitePersistentQueue.logger.debug("insert() row = " + jInsert);
                        long count = getCount(writableDatabase);
                        if (count > 10000) {
                            SQLitePersistentQueue.logger.debug("Pruning Queue; current size = %d; max size = %d", Long.valueOf(count), 10000);
                            removeHead(writableDatabase);
                        }
                        writableDatabase.close();
                        return jInsert;
                    } catch (SQLException e2) {
                        e = e2;
                        throw new IOException(e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    throw th;
                }
            } catch (SQLException e3) {
                writableDatabase = null;
                e = e3;
            } catch (Throwable th3) {
                writableDatabase = null;
                th = th3;
                if (writableDatabase != null) {
                }
                throw th;
            }
        }

        String getHead() throws Throwable {
            SQLiteDatabase readableDatabase;
            long minId;
            Cursor cursorQuery;
            Cursor cursor = null;
            String string2 = null;
            cursor = null;
            cursor = null;
            cursor = null;
            try {
                readableDatabase = this.helper.getReadableDatabase();
                try {
                    try {
                        minId = getMinId(readableDatabase);
                        cursorQuery = readableDatabase.query("events", new String[]{"value"}, "_id = ?", new String[]{String.valueOf(minId)}, null, null, null);
                    } catch (SQLException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (SQLException e2) {
                e = e2;
                readableDatabase = null;
            } catch (Throwable th2) {
                th = th2;
                readableDatabase = null;
            }
            try {
                cursorQuery.moveToFirst();
                if (cursorQuery.getCount() != 0) {
                    string2 = cursorQuery.getString(0);
                }
                SQLitePersistentQueue.logger.debug("getHead() _id = %d, value = %s", Long.valueOf(minId), string2);
                cursorQuery.close();
                readableDatabase.close();
                return string2;
            } catch (SQLException e3) {
                e = e3;
                cursor = cursorQuery;
                throw new IOException(e);
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                if (readableDatabase != null) {
                    readableDatabase.close();
                }
                throw th;
            }
        }

        String removeHead() throws IOException {
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.helper.getWritableDatabase();
                return removeHead(writableDatabase);
            } finally {
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
            }
        }

        private String removeHead(SQLiteDatabase sQLiteDatabase) throws Throwable {
            long minId;
            String[] strArr;
            Cursor cursorQuery;
            Cursor cursor = null;
            try {
                try {
                    minId = getMinId(sQLiteDatabase);
                    strArr = new String[]{String.valueOf(minId)};
                    cursorQuery = sQLiteDatabase.query("events", new String[]{"value"}, "_id = ?", strArr, null, null, null);
                } catch (SQLException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                cursorQuery.moveToFirst();
                if (cursorQuery.getCount() != 0) {
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                    sQLiteDatabase.delete("events", "_id = ?", strArr);
                    SQLitePersistentQueue.logger.debug("removeHead() _id = %d", Long.valueOf(minId));
                    cursorQuery.close();
                    return string2;
                }
                cursorQuery.close();
                return null;
            } catch (SQLException e2) {
                e = e2;
                cursor = cursorQuery;
                throw new IOException(e);
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        private long getMinId(SQLiteDatabase sQLiteDatabase) throws IOException {
            Cursor cursorRawQuery = null;
            try {
                try {
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT MIN(_id) FROM events", null);
                    cursorRawQuery.moveToFirst();
                    long j = cursorRawQuery.getLong(0);
                    SQLitePersistentQueue.logger.debug("getMinId() id = %d", Long.valueOf(j));
                    cursorRawQuery.close();
                    return j;
                } catch (SQLException e) {
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }

        private long getCount(SQLiteDatabase sQLiteDatabase) throws IOException {
            Cursor cursorRawQuery = null;
            try {
                try {
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(_id) FROM events", null);
                    cursorRawQuery.moveToFirst();
                    long j = cursorRawQuery.getLong(0);
                    SQLitePersistentQueue.logger.debug("getCount() = %d", Long.valueOf(j));
                    cursorRawQuery.close();
                    return j;
                } catch (SQLException e) {
                    throw new IOException(e);
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }
    }

    private static class SQLiteHelper extends SQLiteOpenHelper implements BaseColumns {
        private static final String COLUMN_NAME_VALUE = "value";
        private static final String COMMA_SEP = ",";
        private static final String DATABASE_NAME = "singular-1.db";
        private static final int DATABASE_VERSION = 1;
        private static final String SQL_CREATE_ENTRIES = "CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,value TEXT )";
        private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS events";
        private static final String TABLE_NAME = "events";
        private static final String TEXT_TYPE = " TEXT";

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public SQLiteHelper(Context context) {
            super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
        }
    }
}
