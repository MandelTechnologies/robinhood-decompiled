package androidx.room;

import androidx.sqlite.SQLiteStatement;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoomRawQuery.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\"\u0010 \u001a\u00020\u001b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u00020\u001b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\"\u0010$\u001a\u00020\u001b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b$\u0010%J\"\u0010&\u001a\u00020\u001b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020\u001b2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020*2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u001a\u0010/\u001a\u00020\u00132\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b/\u0010\u0015J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u001000H\u0096\u0001¢\u0006\u0004\b1\u00102¨\u00064"}, m3636d2 = {"Landroidx/room/BindOnlySQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroidx/sqlite/SQLiteStatement;)V", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "getBlob", "(I)[B", "", "getDouble", "(I)D", "", "getLong", "(I)J", "", "getText", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "step", "()Z", "", "reset", "()V", "close", "value", "bindBlob", "(I[B)V", "bindDouble", "(ID)V", "bindLong", "(IJ)V", "bindText", "(ILjava/lang/String;)V", "bindNull", "(I)V", "", "getFloat", "(I)F", "getInt", "(I)I", "getBoolean", "", "getColumnNames", "()Ljava/util/List;", "Companion", "room-runtime_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: androidx.room.BindOnlySQLiteStatement, reason: use source file name */
/* loaded from: classes4.dex */
final class RoomRawQuery2 implements SQLiteStatement {
    private final /* synthetic */ SQLiteStatement $$delegate_0;

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBlob(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$$delegate_0.bindBlob(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindDouble(int index, double value) {
        this.$$delegate_0.bindDouble(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindLong(int index, long value) {
        this.$$delegate_0.bindLong(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindNull(int index) {
        this.$$delegate_0.bindNull(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindText(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$$delegate_0.bindText(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(int index) {
        return this.$$delegate_0.getBoolean(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public List<String> getColumnNames() {
        return this.$$delegate_0.getColumnNames();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(int index) {
        return this.$$delegate_0.getFloat(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(int index) {
        return this.$$delegate_0.getInt(index);
    }

    public RoomRawQuery2(SQLiteStatement delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }
}
