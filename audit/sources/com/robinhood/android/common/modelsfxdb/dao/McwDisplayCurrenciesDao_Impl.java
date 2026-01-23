package com.robinhood.android.common.modelsfxdb.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.p325fx.MultiCurrencyTypeConverters;
import com.robinhood.models.p325fx.p326db.McwDisplayCurrencies;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;

/* compiled from: McwDisplayCurrenciesDao_Impl.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0010H\u0016J\b\u0010\t\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/modelsfxdb/dao/McwDisplayCurrenciesDao_Impl;", "Lcom/robinhood/android/common/modelsfxdb/dao/McwDisplayCurrenciesDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfMcwDisplayCurrencies", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/models/fx/db/McwDisplayCurrencies;", "__multiCurrencyTypeConverters", "Lkotlin/Lazy;", "Lcom/robinhood/models/fx/MultiCurrencyTypeConverters;", "insert", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "streamMcwDisplayCurrencies", "Lkotlinx/coroutines/flow/Flow;", "Companion", "lib-models-fx-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class McwDisplayCurrenciesDao_Impl implements McwDisplayCurrenciesDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<McwDisplayCurrencies> __insertAdapterOfMcwDisplayCurrencies;
    private final Lazy<MultiCurrencyTypeConverters> __multiCurrencyTypeConverters;

    public McwDisplayCurrenciesDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__multiCurrencyTypeConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.modelsfxdb.dao.McwDisplayCurrenciesDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return McwDisplayCurrenciesDao_Impl.__multiCurrencyTypeConverters$lambda$0(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfMcwDisplayCurrencies = new EntityInsertAdapter<McwDisplayCurrencies>() { // from class: com.robinhood.android.common.modelsfxdb.dao.McwDisplayCurrenciesDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `McwDisplayCurrencies` (`id`,`displayCurrencies`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, McwDisplayCurrencies entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindText(2, McwDisplayCurrenciesDao_Impl.this.__multiCurrencyTypeConverters().displayCurrenciesToString(entity.getDisplayCurrencies()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiCurrencyTypeConverters __multiCurrencyTypeConverters$lambda$0(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(MultiCurrencyTypeConverters.class));
        if (typeConverter != null) {
            return (MultiCurrencyTypeConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.utils.room.dao.BaseDaos3
    public void insert(final McwDisplayCurrencies item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.common.modelsfxdb.dao.McwDisplayCurrenciesDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwDisplayCurrenciesDao_Impl.insert$lambda$1(this.f$0, item, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$1(McwDisplayCurrenciesDao_Impl mcwDisplayCurrenciesDao_Impl, McwDisplayCurrencies mcwDisplayCurrencies, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        mcwDisplayCurrenciesDao_Impl.__insertAdapterOfMcwDisplayCurrencies.insert(_connection, (SQLiteConnection) mcwDisplayCurrencies);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.modelsfxdb.dao.McwDisplayCurrenciesDao
    public Flow<McwDisplayCurrencies> streamMcwDisplayCurrencies() {
        final String str = "SELECT * FROM McwDisplayCurrencies LIMIT 1";
        return FlowBuilder.createFlow(this.__db, false, new String[]{"McwDisplayCurrencies"}, new Function1() { // from class: com.robinhood.android.common.modelsfxdb.dao.McwDisplayCurrenciesDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwDisplayCurrenciesDao_Impl.streamMcwDisplayCurrencies$lambda$2(str, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final McwDisplayCurrencies streamMcwDisplayCurrencies$lambda$2(String str, McwDisplayCurrenciesDao_Impl mcwDisplayCurrenciesDao_Impl, SQLiteConnection _connection) {
        McwDisplayCurrencies mcwDisplayCurrencies;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayCurrencies");
            if (sQLiteStatementPrepare.step()) {
                mcwDisplayCurrencies = new McwDisplayCurrencies((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), mcwDisplayCurrenciesDao_Impl.__multiCurrencyTypeConverters().stringToDisplayCurrencies(sQLiteStatementPrepare.getText(columnIndexOrThrow2)));
            } else {
                mcwDisplayCurrencies = null;
            }
            return mcwDisplayCurrencies;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiCurrencyTypeConverters __multiCurrencyTypeConverters() {
        return this.__multiCurrencyTypeConverters.getValue();
    }

    /* compiled from: McwDisplayCurrenciesDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/modelsfxdb/dao/McwDisplayCurrenciesDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-models-fx-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.listOf(Reflection.getOrCreateKotlinClass(MultiCurrencyTypeConverters.class));
        }
    }
}
