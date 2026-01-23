package androidx.room.util;

import androidx.sqlite.SQLiteStatement;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StatementUtil.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00102\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\"2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b*\u0010&J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b2\u00101R\u0014\u00103\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m3636d2 = {"Landroidx/room/util/MappedColumnsSQLiteStatementWrapper;", "Landroidx/sqlite/SQLiteStatement;", "", "name", "", "getColumnIndex", "(Ljava/lang/String;)I", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "value", "", "bindBlob", "(I[B)V", "", "bindDouble", "(ID)V", "", "bindLong", "(IJ)V", "bindText", "(ILjava/lang/String;)V", "bindNull", "(I)V", "getBlob", "(I)[B", "getDouble", "(I)D", "", "getFloat", "(I)F", "getLong", "(I)J", "getInt", "(I)I", "", "getBoolean", "(I)Z", "getText", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "", "getColumnNames", "()Ljava/util/List;", "step", "()Z", "reset", "()V", "close", "delegate", "Landroidx/sqlite/SQLiteStatement;", "", "columnNameToIndexMap", "Ljava/util/Map;", "room-runtime_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.util.MappedColumnsSQLiteStatementWrapper, reason: use source file name */
/* loaded from: classes4.dex */
public final class StatementUtil implements SQLiteStatement {
    private final Map<String, Integer> columnNameToIndexMap;
    private final SQLiteStatement delegate;

    @Override // androidx.sqlite.SQLiteStatement
    public void bindBlob(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.bindBlob(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindDouble(int index, double value) {
        this.delegate.bindDouble(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindLong(int index, long value) {
        this.delegate.bindLong(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindNull(int index) {
        this.delegate.bindNull(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void bindText(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.delegate.bindText(index, value);
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public byte[] getBlob(int index) {
        return this.delegate.getBlob(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(int index) {
        return this.delegate.getBoolean(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        return this.delegate.getColumnCount();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getColumnName(int index) {
        return this.delegate.getColumnName(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public List<String> getColumnNames() {
        return this.delegate.getColumnNames();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int index) {
        return this.delegate.getDouble(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public float getFloat(int index) {
        return this.delegate.getFloat(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getInt(int index) {
        return this.delegate.getInt(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int index) {
        return this.delegate.getLong(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public String getText(int index) {
        return this.delegate.getText(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int index) {
        return this.delegate.isNull(index);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        this.delegate.reset();
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        return this.delegate.step();
    }

    public final int getColumnIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.columnNameToIndexMap.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
