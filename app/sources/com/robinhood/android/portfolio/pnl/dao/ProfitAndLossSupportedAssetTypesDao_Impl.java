package com.robinhood.android.portfolio.pnl.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.portfolio.pnl.database.ProfitAndLossHubRoomConverters;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossSupportedAssetTypes;
import com.robinhood.android.portfolio.pnl.p214db.SupportedAssetClass;
import com.robinhood.utils.room.CommonRoomConverters;
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
import p479j$.time.Instant;

/* compiled from: ProfitAndLossSupportedAssetTypesDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\t\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossSupportedAssetTypesDao_Impl;", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossSupportedAssetTypesDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfProfitAndLossSupportedAssetTypes", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossSupportedAssetTypes;", "__profitAndLossHubRoomConverters", "Lkotlin/Lazy;", "Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubRoomConverters;", "__commonRoomConverters", "Lcom/robinhood/utils/room/CommonRoomConverters;", "insert", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "streamSupportedAssetTypes", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProfitAndLossSupportedAssetTypesDao_Impl implements ProfitAndLossSupportedAssetTypesDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<CommonRoomConverters> __commonRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<ProfitAndLossSupportedAssetTypes> __insertAdapterOfProfitAndLossSupportedAssetTypes;
    private final Lazy<ProfitAndLossHubRoomConverters> __profitAndLossHubRoomConverters;

    public ProfitAndLossSupportedAssetTypesDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__profitAndLossHubRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossSupportedAssetTypesDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossSupportedAssetTypesDao_Impl.__profitAndLossHubRoomConverters$lambda$0(__db);
            }
        });
        this.__commonRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossSupportedAssetTypesDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossSupportedAssetTypesDao_Impl.__commonRoomConverters$lambda$1(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfProfitAndLossSupportedAssetTypes = new EntityInsertAdapter<ProfitAndLossSupportedAssetTypes>() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossSupportedAssetTypesDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ProfitAndLossSupportedAssetTypes` (`accountNumber`,`assetTypes`,`receivedAt`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ProfitAndLossSupportedAssetTypes entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getAccountNumber());
                String strSupportedAssetClassListToString = ProfitAndLossSupportedAssetTypesDao_Impl.this.__profitAndLossHubRoomConverters().supportedAssetClassListToString(entity.getAssetTypes());
                if (strSupportedAssetClassListToString == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindText(2, strSupportedAssetClassListToString);
                }
                String strInstantToString = ProfitAndLossSupportedAssetTypesDao_Impl.this.__commonRoomConverters().instantToString(entity.getReceivedAt());
                if (strInstantToString == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, strInstantToString);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfitAndLossHubRoomConverters __profitAndLossHubRoomConverters$lambda$0(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(ProfitAndLossHubRoomConverters.class));
        if (typeConverter != null) {
            return (ProfitAndLossHubRoomConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonRoomConverters __commonRoomConverters$lambda$1(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(CommonRoomConverters.class));
        if (typeConverter != null) {
            return (CommonRoomConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.utils.room.dao.BaseDaos3
    public void insert(final ProfitAndLossSupportedAssetTypes item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossSupportedAssetTypesDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossSupportedAssetTypesDao_Impl.insert$lambda$2(this.f$0, item, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$2(ProfitAndLossSupportedAssetTypesDao_Impl profitAndLossSupportedAssetTypesDao_Impl, ProfitAndLossSupportedAssetTypes profitAndLossSupportedAssetTypes, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        profitAndLossSupportedAssetTypesDao_Impl.__insertAdapterOfProfitAndLossSupportedAssetTypes.insert(_connection, (SQLiteConnection) profitAndLossSupportedAssetTypes);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossSupportedAssetTypesDao
    public Flow<ProfitAndLossSupportedAssetTypes> streamSupportedAssetTypes(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final String str = "SELECT * FROM ProfitAndLossSupportedAssetTypes WHERE accountNumber = ? LIMIT 1";
        return FlowBuilder.createFlow(this.__db, false, new String[]{"ProfitAndLossSupportedAssetTypes"}, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossSupportedAssetTypesDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossSupportedAssetTypesDao_Impl.streamSupportedAssetTypes$lambda$3(str, accountNumber, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfitAndLossSupportedAssetTypes streamSupportedAssetTypes$lambda$3(String str, String str2, ProfitAndLossSupportedAssetTypesDao_Impl profitAndLossSupportedAssetTypesDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetTypes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "receivedAt");
            ProfitAndLossSupportedAssetTypes profitAndLossSupportedAssetTypes = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                List<SupportedAssetClass> listStringToSupportedAssetClassList = profitAndLossSupportedAssetTypesDao_Impl.__profitAndLossHubRoomConverters().stringToSupportedAssetClassList(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (listStringToSupportedAssetClassList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.robinhood.android.portfolio.pnl.db.SupportedAssetClass>', but it was NULL.");
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                }
                Instant instantStringToInstant = profitAndLossSupportedAssetTypesDao_Impl.__commonRoomConverters().stringToInstant(text);
                if (instantStringToInstant == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                profitAndLossSupportedAssetTypes = new ProfitAndLossSupportedAssetTypes(text2, listStringToSupportedAssetClassList, instantStringToInstant);
            }
            sQLiteStatementPrepare.close();
            return profitAndLossSupportedAssetTypes;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfitAndLossHubRoomConverters __profitAndLossHubRoomConverters() {
        return this.__profitAndLossHubRoomConverters.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonRoomConverters __commonRoomConverters() {
        return this.__commonRoomConverters.getValue();
    }

    /* compiled from: ProfitAndLossSupportedAssetTypesDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossSupportedAssetTypesDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(ProfitAndLossHubRoomConverters.class), Reflection.getOrCreateKotlinClass(CommonRoomConverters.class)});
        }
    }
}
