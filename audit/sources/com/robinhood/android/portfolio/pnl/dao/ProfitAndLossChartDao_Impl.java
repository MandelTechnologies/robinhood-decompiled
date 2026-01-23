package com.robinhood.android.portfolio.pnl.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.charts.models.ChartsRoomConverters;
import com.robinhood.android.charts.models.p080db.PageWithChart;
import com.robinhood.android.charts.models.p080db.PerformanceChartSpans;
import com.robinhood.android.models.portfolio.PortfolioConverters;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan;
import com.robinhood.android.portfolio.pnl.database.ProfitAndLossHubRoomConverters;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart;
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

/* compiled from: ProfitAndLossChartDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\t\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossChartDao_Impl;", "Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossChartDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfProfitAndLossChart", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossChart;", "__profitAndLossHubRoomConverters", "Lkotlin/Lazy;", "Lcom/robinhood/android/portfolio/pnl/database/ProfitAndLossHubRoomConverters;", "__portfolioConverters", "Lcom/robinhood/android/models/portfolio/PortfolioConverters;", "__chartsRoomConverters", "Lcom/robinhood/android/charts/models/ChartsRoomConverters;", "insert", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "getProfitAndLossChart", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "Companion", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ProfitAndLossChartDao_Impl implements ProfitAndLossChartDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<ChartsRoomConverters> __chartsRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<ProfitAndLossChart> __insertAdapterOfProfitAndLossChart;
    private final Lazy<PortfolioConverters> __portfolioConverters;
    private final Lazy<ProfitAndLossHubRoomConverters> __profitAndLossHubRoomConverters;

    public ProfitAndLossChartDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__profitAndLossHubRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossChartDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossChartDao_Impl.__profitAndLossHubRoomConverters$lambda$0(__db);
            }
        });
        this.__portfolioConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossChartDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossChartDao_Impl.__portfolioConverters$lambda$1(__db);
            }
        });
        this.__chartsRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossChartDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitAndLossChartDao_Impl.__chartsRoomConverters$lambda$2(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfProfitAndLossChart = new EntityInsertAdapter<ProfitAndLossChart>() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossChartDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `ProfitAndLossChart` (`accountNumber`,`assets`,`span`,`spans`,`chart`) VALUES (?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ProfitAndLossChart entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getAccountNumber());
                String strAssetClassListToString = ProfitAndLossChartDao_Impl.this.__profitAndLossHubRoomConverters().assetClassListToString(entity.getAssets());
                if (strAssetClassListToString == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindText(2, strAssetClassListToString);
                }
                String serverValue = ProfitAndLossChartSpan.INSTANCE.toServerValue(entity.getSpan());
                if (serverValue == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindText(3, serverValue);
                }
                String strPerformanceChartSpansToString = ProfitAndLossChartDao_Impl.this.__portfolioConverters().performanceChartSpansToString(entity.getSpans());
                if (strPerformanceChartSpansToString == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, strPerformanceChartSpansToString);
                }
                String strPageWithChartToString = ProfitAndLossChartDao_Impl.this.__chartsRoomConverters().pageWithChartToString(entity.getChart());
                if (strPageWithChartToString == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindText(5, strPageWithChartToString);
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
    public static final PortfolioConverters __portfolioConverters$lambda$1(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(PortfolioConverters.class));
        if (typeConverter != null) {
            return (PortfolioConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChartsRoomConverters __chartsRoomConverters$lambda$2(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(ChartsRoomConverters.class));
        if (typeConverter != null) {
            return (ChartsRoomConverters) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.utils.room.dao.BaseDaos3
    public void insert(final ProfitAndLossChart item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossChartDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossChartDao_Impl.insert$lambda$3(this.f$0, item, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$3(ProfitAndLossChartDao_Impl profitAndLossChartDao_Impl, ProfitAndLossChart profitAndLossChart, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        profitAndLossChartDao_Impl.__insertAdapterOfProfitAndLossChart.insert(_connection, (SQLiteConnection) profitAndLossChart);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.portfolio.pnl.dao.ProfitAndLossChartDao
    public Flow<ProfitAndLossChart> getProfitAndLossChart(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final String str = "SELECT * FROM ProfitAndLossChart WHERE accountNumber = ? LIMIT 1";
        return FlowBuilder.createFlow(this.__db, false, new String[]{"ProfitAndLossChart"}, new Function1() { // from class: com.robinhood.android.portfolio.pnl.dao.ProfitAndLossChartDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossChartDao_Impl.getProfitAndLossChart$lambda$4(str, accountNumber, this, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfitAndLossChart getProfitAndLossChart$lambda$4(String str, String str2, ProfitAndLossChartDao_Impl profitAndLossChartDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assets");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "span");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spans");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chart");
            ProfitAndLossChart profitAndLossChart = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                List<AssetClass> listStringToAssetClassList = profitAndLossChartDao_Impl.__profitAndLossHubRoomConverters().stringToAssetClassList(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (listStringToAssetClassList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.robinhood.android.models.portfolio.api.AssetClass>', but it was NULL.");
                }
                ProfitAndLossChartSpan profitAndLossChartSpanFromServerValue = ProfitAndLossChartSpan.INSTANCE.fromServerValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                if (profitAndLossChartSpanFromServerValue == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.android.portfolio.pnl.api.ProfitAndLossChartSpan', but it was NULL.");
                }
                PerformanceChartSpans performanceChartSpansStringToPerformanceChartSpans = profitAndLossChartDao_Impl.__portfolioConverters().stringToPerformanceChartSpans(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                if (performanceChartSpansStringToPerformanceChartSpans == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.android.charts.models.db.PerformanceChartSpans', but it was NULL.");
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                PageWithChart pageWithChartStringToPageWithChart = profitAndLossChartDao_Impl.__chartsRoomConverters().stringToPageWithChart(text);
                if (pageWithChartStringToPageWithChart == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.android.charts.models.db.PageWithChart', but it was NULL.");
                }
                profitAndLossChart = new ProfitAndLossChart(text2, listStringToAssetClassList, profitAndLossChartSpanFromServerValue, performanceChartSpansStringToPerformanceChartSpans, pageWithChartStringToPageWithChart);
            }
            sQLiteStatementPrepare.close();
            return profitAndLossChart;
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
    public final PortfolioConverters __portfolioConverters() {
        return this.__portfolioConverters.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartsRoomConverters __chartsRoomConverters() {
        return this.__chartsRoomConverters.getValue();
    }

    /* compiled from: ProfitAndLossChartDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/dao/ProfitAndLossChartDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(ProfitAndLossHubRoomConverters.class), Reflection.getOrCreateKotlinClass(PortfolioConverters.class), Reflection.getOrCreateKotlinClass(ChartsRoomConverters.class)});
        }
    }
}
