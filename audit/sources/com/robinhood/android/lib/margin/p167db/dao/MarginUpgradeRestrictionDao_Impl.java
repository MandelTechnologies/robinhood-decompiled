package com.robinhood.android.lib.margin.p167db.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.lib.margin.p167db.models.MarginUpgradeRestriction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MarginUpgradeRestrictionDao_Impl.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/db/dao/MarginUpgradeRestrictionDao_Impl;", "Lcom/robinhood/android/lib/margin/db/dao/MarginUpgradeRestrictionDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfMarginUpgradeRestriction", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/android/lib/margin/db/models/MarginUpgradeRestriction;", "insert", "", "restriction", "get", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "Companion", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginUpgradeRestrictionDao_Impl implements MarginUpgradeRestrictionDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<MarginUpgradeRestriction> __insertAdapterOfMarginUpgradeRestriction;

    public MarginUpgradeRestrictionDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfMarginUpgradeRestriction = new EntityInsertAdapter<MarginUpgradeRestriction>() { // from class: com.robinhood.android.lib.margin.db.dao.MarginUpgradeRestrictionDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `MarginUpgradeRestriction` (`accountNumber`,`type`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, MarginUpgradeRestriction entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getAccountNumber());
                String type2 = entity.getType();
                if (type2 == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindText(2, type2);
                }
            }
        };
    }

    @Override // com.robinhood.android.lib.margin.p167db.dao.MarginUpgradeRestrictionDao
    public void insert(final MarginUpgradeRestriction restriction) {
        Intrinsics.checkNotNullParameter(restriction, "restriction");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.lib.margin.db.dao.MarginUpgradeRestrictionDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginUpgradeRestrictionDao_Impl.insert$lambda$0(this.f$0, restriction, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(MarginUpgradeRestrictionDao_Impl marginUpgradeRestrictionDao_Impl, MarginUpgradeRestriction marginUpgradeRestriction, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        marginUpgradeRestrictionDao_Impl.__insertAdapterOfMarginUpgradeRestriction.insert(_connection, (SQLiteConnection) marginUpgradeRestriction);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.margin.p167db.dao.MarginUpgradeRestrictionDao
    public Flow<MarginUpgradeRestriction> get(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final String str = "\n            SELECT * \n            FROM MarginUpgradeRestriction \n            WHERE accountNumber = ?\n        ";
        return FlowBuilder.createFlow(this.__db, false, new String[]{"MarginUpgradeRestriction"}, new Function1() { // from class: com.robinhood.android.lib.margin.db.dao.MarginUpgradeRestrictionDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginUpgradeRestrictionDao_Impl.get$lambda$1(str, accountNumber, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginUpgradeRestriction get$lambda$1(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            MarginUpgradeRestriction marginUpgradeRestriction = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                marginUpgradeRestriction = new MarginUpgradeRestriction(text2, text);
            }
            return marginUpgradeRestriction;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* compiled from: MarginUpgradeRestrictionDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/db/dao/MarginUpgradeRestrictionDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
