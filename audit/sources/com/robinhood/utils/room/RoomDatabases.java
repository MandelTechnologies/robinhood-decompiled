package com.robinhood.utils.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoomDatabases.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"closeAndDelete", "", "Landroidx/room/RoomDatabase;", "context", "Landroid/content/Context;", "databaseName", "", "lib-utils-room_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.room.RoomDatabasesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class RoomDatabases {
    public static final void closeAndDelete(RoomDatabase roomDatabase, Context context, String databaseName) {
        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        roomDatabase.close();
        context.deleteDatabase(databaseName);
    }
}
