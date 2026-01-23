package androidx.room.util;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectionUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, m3636d2 = {"getLastInsertedRowId", "", "connection", "Landroidx/sqlite/SQLiteConnection;", "getTotalChangedRows", "", "room-runtime_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@JvmName
/* renamed from: androidx.room.util.SQLiteConnectionUtil, reason: use source file name */
/* loaded from: classes4.dex */
public final class ConnectionUtil {
    public static final long getLastInsertedRowId(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (getTotalChangedRows(connection) == 0) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT last_insert_rowid()");
        try {
            sQLiteStatementPrepare.step();
            long j = sQLiteStatementPrepare.getLong(0);
            AutoCloseableJVM.closeFinally(sQLiteStatementPrepare, null);
            return j;
        } finally {
        }
    }

    public static final int getTotalChangedRows(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare("SELECT changes()");
        try {
            sQLiteStatementPrepare.step();
            int i = (int) sQLiteStatementPrepare.getLong(0);
            AutoCloseableJVM.closeFinally(sQLiteStatementPrepare, null);
            return i;
        } finally {
        }
    }
}
