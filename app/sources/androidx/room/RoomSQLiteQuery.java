package androidx.room;

import android.annotation.SuppressLint;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.p015db.SupportSQLiteProgram;
import androidx.sqlite.p015db.SupportSQLiteQuery;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoomSQLiteQuery.android.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\n\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R\u001a\u0010+\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010\u000eR\u001a\u0010/\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u0010\u000eR\"\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\u000eR\"\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u0010\u000eR\u001a\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\f\n\u0004\b:\u0010;\u0012\u0004\b<\u0010\u000eR$\u0010=\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b>\u0010(R\u0014\u0010A\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, m3636d2 = {"Landroidx/room/RoomSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", "capacity", "<init>", "(I)V", "", "query", "initArgCount", "", "init", "(Ljava/lang/String;I)V", "release", "()V", "Landroidx/room/RoomRawQuery;", "toRoomRawQuery", "()Landroidx/room/RoomRawQuery;", "statement", "bindTo", "(Landroidx/sqlite/db/SupportSQLiteProgram;)V", "Landroidx/sqlite/SQLiteStatement;", "(Landroidx/sqlite/SQLiteStatement;)V", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "bindNull", "", "value", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "close", "I", "getCapacity", "()I", "Ljava/lang/String;", "", "longBindings", "[J", "getLongBindings$annotations", "", "doubleBindings", "[D", "getDoubleBindings$annotations", "", "stringBindings", "[Ljava/lang/String;", "getStringBindings$annotations", "blobBindings", "[[B", "getBlobBindings$annotations", "", "bindingTypes", "[I", "getBindingTypes$annotations", "argCount", "getArgCount", "getSql", "()Ljava/lang/String;", "sql", "Companion", "room-runtime_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SuppressLint({"WrongConstant"})
/* loaded from: classes.dex */
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();
    private int argCount;
    private final int[] bindingTypes;

    @JvmField
    public final byte[][] blobBindings;
    private final int capacity;

    @JvmField
    public final double[] doubleBindings;

    @JvmField
    public final long[] longBindings;
    private volatile String query;

    @JvmField
    public final String[] stringBindings;

    public /* synthetic */ RoomSQLiteQuery(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @JvmStatic
    public static final RoomSQLiteQuery acquire(String str, int i) {
        return INSTANCE.acquire(str, i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    private RoomSQLiteQuery(int i) {
        this.capacity = i;
        int i2 = i + 1;
        this.bindingTypes = new int[i2];
        this.longBindings = new long[i2];
        this.doubleBindings = new double[i2];
        this.stringBindings = new String[i2];
        this.blobBindings = new byte[i2][];
    }

    @Override // androidx.sqlite.p015db.SupportSQLiteQuery
    public int getArgCount() {
        return this.argCount;
    }

    public final void init(String query, int initArgCount) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.query = query;
        this.argCount = initArgCount;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            INSTANCE.prunePoolLocked$room_runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toRoomRawQuery$lambda$1(RoomSQLiteQuery roomSQLiteQuery, SQLiteStatement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        roomSQLiteQuery.bindTo(it);
        return Unit.INSTANCE;
    }

    public final RoomRawQuery toRoomRawQuery() {
        return new RoomRawQuery(getQuery(), new Function1() { // from class: androidx.room.RoomSQLiteQuery$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomSQLiteQuery.toRoomRawQuery$lambda$1(this.f$0, (SQLiteStatement) obj);
            }
        });
    }

    @Override // androidx.sqlite.p015db.SupportSQLiteQuery
    /* renamed from: getSql */
    public String getQuery() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.sqlite.p015db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.bindingTypes[i];
            if (i2 == 1) {
                statement.bindNull(i);
            } else if (i2 == 2) {
                statement.bindLong(i, this.longBindings[i]);
            } else if (i2 == 3) {
                statement.bindDouble(i, this.doubleBindings[i]);
            } else if (i2 == 4) {
                String str = this.stringBindings[i];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindString(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.blobBindings[i];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindBlob(i, bArr);
            }
            if (i == argCount) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void bindTo(SQLiteStatement statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.bindingTypes[i];
            if (i2 == 1) {
                statement.bindNull(i);
            } else if (i2 == 2) {
                statement.bindLong(i, this.longBindings[i]);
            } else if (i2 == 3) {
                statement.bindDouble(i, this.doubleBindings[i]);
            } else if (i2 == 4) {
                String str = this.stringBindings[i];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindText(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.blobBindings[i];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindBlob(i, bArr);
            }
            if (i == argCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // androidx.sqlite.p015db.SupportSQLiteProgram
    public void bindNull(int index) {
        this.bindingTypes[index] = 1;
    }

    @Override // androidx.sqlite.p015db.SupportSQLiteProgram
    public void bindLong(int index, long value) {
        this.bindingTypes[index] = 2;
        this.longBindings[index] = value;
    }

    @Override // androidx.sqlite.p015db.SupportSQLiteProgram
    public void bindDouble(int index, double value) {
        this.bindingTypes[index] = 3;
        this.doubleBindings[index] = value;
    }

    @Override // androidx.sqlite.p015db.SupportSQLiteProgram
    public void bindString(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[index] = 4;
        this.stringBindings[index] = value;
    }

    @Override // androidx.sqlite.p015db.SupportSQLiteProgram
    public void bindBlob(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[index] = 5;
        this.blobBindings[index] = value;
    }

    /* compiled from: RoomSQLiteQuery.android.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, m3636d2 = {"Landroidx/room/RoomSQLiteQuery$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteQuery;", "supportSQLiteQuery", "Landroidx/room/RoomSQLiteQuery;", "copyFrom", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroidx/room/RoomSQLiteQuery;", "", "query", "", "argumentCount", "acquire", "(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;", "", "prunePoolLocked$room_runtime_release", "prunePoolLocked", "NULL", "I", "LONG", "DOUBLE", "STRING", "BLOB", "room-runtime_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
            Intrinsics.checkNotNullParameter(supportSQLiteQuery, "supportSQLiteQuery");
            final RoomSQLiteQuery roomSQLiteQueryAcquire = acquire(supportSQLiteQuery.getQuery(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.sqlite.p015db.SupportSQLiteProgram
                public void bindBlob(int index, byte[] value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    roomSQLiteQueryAcquire.bindBlob(index, value);
                }

                @Override // androidx.sqlite.p015db.SupportSQLiteProgram
                public void bindDouble(int index, double value) {
                    roomSQLiteQueryAcquire.bindDouble(index, value);
                }

                @Override // androidx.sqlite.p015db.SupportSQLiteProgram
                public void bindLong(int index, long value) {
                    roomSQLiteQueryAcquire.bindLong(index, value);
                }

                @Override // androidx.sqlite.p015db.SupportSQLiteProgram
                public void bindNull(int index) {
                    roomSQLiteQueryAcquire.bindNull(index);
                }

                @Override // androidx.sqlite.p015db.SupportSQLiteProgram
                public void bindString(int index, String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    roomSQLiteQueryAcquire.bindString(index, value);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    roomSQLiteQueryAcquire.close();
                }
            });
            return roomSQLiteQueryAcquire;
        }

        @JvmStatic
        public final RoomSQLiteQuery acquire(String query, int argumentCount) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            synchronized (treeMap) {
                Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(argumentCount));
                if (entryCeilingEntry != null) {
                    treeMap.remove(entryCeilingEntry.getKey());
                    RoomSQLiteQuery value = entryCeilingEntry.getValue();
                    value.init(query, argumentCount);
                    Intrinsics.checkNotNull(value);
                    return value;
                }
                Unit unit = Unit.INSTANCE;
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(argumentCount, null);
                roomSQLiteQuery.init(query, argumentCount);
                return roomSQLiteQuery;
            }
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i;
            }
        }
    }
}
