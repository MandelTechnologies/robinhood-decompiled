package com.robinhood.android.portfolio.pnl.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItemRemoteKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: ProfitAndLossTradeItemRemoteKeyDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemRemoteKeyDao_Impl;", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemRemoteKeyDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfProfitAndLossTradeItemRemoteKey", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItemRemoteKey;", "insert", "", "remoteKey", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItemRemoteKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextCursor", "", "request", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProfitAndLossTradeItemRemoteKeyDao_Impl implements ProfitAndLossTradeItemRemoteKeyDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<ProfitAndLossTradeItemRemoteKey> __insertAdapterOfProfitAndLossTradeItemRemoteKey;

    public ProfitAndLossTradeItemRemoteKeyDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfProfitAndLossTradeItemRemoteKey = new EntityInsertAdapter<ProfitAndLossTradeItemRemoteKey>() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemRemoteKeyDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ProfitAndLossTradeItemRemoteKey` (`request`,`nextCursor`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ProfitAndLossTradeItemRemoteKey entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getRequest());
                String nextCursor = entity.getNextCursor();
                if (nextCursor == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindText(2, nextCursor);
                }
            }
        };
    }

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemRemoteKeyDao
    public Object insert(final ProfitAndLossTradeItemRemoteKey profitAndLossTradeItemRemoteKey, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemRemoteKeyDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossTradeItemRemoteKeyDao_Impl.insert$lambda$0(this.f$0, profitAndLossTradeItemRemoteKey, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(ProfitAndLossTradeItemRemoteKeyDao_Impl profitAndLossTradeItemRemoteKeyDao_Impl, ProfitAndLossTradeItemRemoteKey profitAndLossTradeItemRemoteKey, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        profitAndLossTradeItemRemoteKeyDao_Impl.__insertAdapterOfProfitAndLossTradeItemRemoteKey.insert(_connection, (SQLiteConnection) profitAndLossTradeItemRemoteKey);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemRemoteKeyDao
    public Object getNextCursor(final String str, Continuation<? super String> continuation) {
        final String str2 = "SELECT nextCursor FROM ProfitAndLossTradeItemRemoteKey WHERE request = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemRemoteKeyDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossTradeItemRemoteKeyDao_Impl.getNextCursor$lambda$1(str2, str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNextCursor$lambda$1(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            String text = null;
            if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                text = sQLiteStatementPrepare.getText(0);
            }
            return text;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemRemoteKeyDao
    public Object clearAll(Continuation<? super Unit> continuation) {
        final String str = "DELETE FROM ProfitAndLossTradeItemRemoteKey";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossTradeItemRemoteKeyDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossTradeItemRemoteKeyDao_Impl.clearAll$lambda$2(str, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearAll$lambda$2(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* compiled from: ProfitAndLossTradeItemRemoteKeyDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossTradeItemRemoteKeyDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
