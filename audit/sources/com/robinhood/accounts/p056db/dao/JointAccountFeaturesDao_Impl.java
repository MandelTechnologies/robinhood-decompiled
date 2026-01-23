package com.robinhood.accounts.p056db.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.jointaccounts.p330db.JointAccountFeatures;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;

/* compiled from: JointAccountFeaturesDao_Impl.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/accounts/db/dao/JointAccountFeaturesDao_Impl;", "Lcom/robinhood/accounts/db/dao/JointAccountFeaturesDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfJointAccountFeatures", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/models/jointaccounts/db/JointAccountFeatures;", "insert", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "streamJointAccountFeatures", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "Companion", "lib-accounts-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class JointAccountFeaturesDao_Impl implements JointAccountFeaturesDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<JointAccountFeatures> __insertAdapterOfJointAccountFeatures;

    public JointAccountFeaturesDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfJointAccountFeatures = new EntityInsertAdapter<JointAccountFeatures>() { // from class: com.robinhood.accounts.db.dao.JointAccountFeaturesDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `JointAccountFeatures` (`accountNumber`,`hasGoldSubscription`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, JointAccountFeatures entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getAccountNumber());
                statement.bindLong(2, entity.getHasGoldSubscription() ? 1L : 0L);
            }
        };
    }

    @Override // com.robinhood.utils.room.dao.BaseDaos3
    public void insert(final JointAccountFeatures item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.accounts.db.dao.JointAccountFeaturesDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JointAccountFeaturesDao_Impl.insert$lambda$0(this.f$0, item, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(JointAccountFeaturesDao_Impl jointAccountFeaturesDao_Impl, JointAccountFeatures jointAccountFeatures, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        jointAccountFeaturesDao_Impl.__insertAdapterOfJointAccountFeatures.insert(_connection, (SQLiteConnection) jointAccountFeatures);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.accounts.p056db.dao.JointAccountFeaturesDao
    public Flow<JointAccountFeatures> streamJointAccountFeatures(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final String str = "SELECT * FROM JointAccountFeatures WHERE accountNumber = ? LIMIT 1";
        return FlowBuilder.createFlow(this.__db, false, new String[]{"JointAccountFeatures"}, new Function1() { // from class: com.robinhood.accounts.db.dao.JointAccountFeaturesDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JointAccountFeaturesDao_Impl.streamJointAccountFeatures$lambda$1(str, accountNumber, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JointAccountFeatures streamJointAccountFeatures$lambda$1(String str, String str2, SQLiteConnection _connection) {
        JointAccountFeatures jointAccountFeatures;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        boolean z = true;
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountNumber");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasGoldSubscription");
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)) == 0) {
                    z = false;
                }
                jointAccountFeatures = new JointAccountFeatures(text, z);
            } else {
                jointAccountFeatures = null;
            }
            return jointAccountFeatures;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* compiled from: JointAccountFeaturesDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/accounts/db/dao/JointAccountFeaturesDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-accounts-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
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
