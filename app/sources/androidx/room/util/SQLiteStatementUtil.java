package androidx.room.util;

import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;

@Metadata(m3635d1 = {"androidx/room/util/SQLiteStatementUtil__StatementUtilKt", "androidx/room/util/SQLiteStatementUtil__StatementUtil_androidKt"}, m3637k = 4, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class SQLiteStatementUtil {
    public static final int columnIndexOf(SQLiteStatement sQLiteStatement, String str) {
        return SQLiteStatementUtil__StatementUtil_androidKt.columnIndexOf(sQLiteStatement, str);
    }

    public static final int columnIndexOfCommon(SQLiteStatement sQLiteStatement, String str) {
        return StatementUtil2.columnIndexOfCommon(sQLiteStatement, str);
    }

    public static final int getColumnIndex(SQLiteStatement sQLiteStatement, String str) {
        return StatementUtil2.getColumnIndex(sQLiteStatement, str);
    }

    public static final int getColumnIndexOrThrow(SQLiteStatement sQLiteStatement, String str) {
        return StatementUtil2.getColumnIndexOrThrow(sQLiteStatement, str);
    }
}
