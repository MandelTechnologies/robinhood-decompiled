package com.robinhood.android.account.libaccountswitcher.p059db;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowBuilder;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcher;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccount;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherLocation;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
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

/* compiled from: AccountSwitcherDao_Impl.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016J \u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\t\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherDao_Impl;", "Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfAccountSwitcher", "Landroidx/room/EntityInsertAdapter;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;", "__accountSwitcherRoomConverters", "Lkotlin/Lazy;", "Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherRoomConverters;", "insert", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "getAccountSwitcher", "Lkotlinx/coroutines/flow/Flow;", "assetId", "", "location", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;", "Companion", "lib-account-switcher-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AccountSwitcherDao_Impl implements AccountSwitcherDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy<AccountSwitcherRoomConverter> __accountSwitcherRoomConverters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<AccountSwitcher> __insertAdapterOfAccountSwitcher;

    public AccountSwitcherDao_Impl(final RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__accountSwitcherRoomConverters = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.account.libaccountswitcher.db.AccountSwitcherDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountSwitcherDao_Impl.__accountSwitcherRoomConverters$lambda$0(__db);
            }
        });
        this.__db = __db;
        this.__insertAdapterOfAccountSwitcher = new EntityInsertAdapter<AccountSwitcher>() { // from class: com.robinhood.android.account.libaccountswitcher.db.AccountSwitcherDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `AccountSwitcher` (`assetId`,`location`,`title`,`accounts`,`positiveButtonText`) VALUES (?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, AccountSwitcher entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getAssetId());
                String strConvertAccountSwitcherLocationToServerValue = AccountSwitcherDao_Impl.this.__accountSwitcherRoomConverters().convertAccountSwitcherLocationToServerValue(entity.getLocation());
                if (strConvertAccountSwitcherLocationToServerValue == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindText(2, strConvertAccountSwitcherLocationToServerValue);
                }
                statement.bindText(3, entity.getTitle());
                String strAccountSwitcherAccountListToString = AccountSwitcherDao_Impl.this.__accountSwitcherRoomConverters().accountSwitcherAccountListToString(entity.getAccounts());
                if (strAccountSwitcherAccountListToString == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindText(4, strAccountSwitcherAccountListToString);
                }
                statement.bindText(5, entity.getPositiveButtonText());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSwitcherRoomConverter __accountSwitcherRoomConverters$lambda$0(RoomDatabase roomDatabase) {
        Object typeConverter = roomDatabase.getTypeConverter((KClass<Object>) Reflection.getOrCreateKotlinClass(AccountSwitcherRoomConverter.class));
        if (typeConverter != null) {
            return (AccountSwitcherRoomConverter) typeConverter;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.utils.room.dao.BaseDaos3
    public void insert(final AccountSwitcher item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.robinhood.android.account.libaccountswitcher.db.AccountSwitcherDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSwitcherDao_Impl.insert$lambda$1(this.f$0, item, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$1(AccountSwitcherDao_Impl accountSwitcherDao_Impl, AccountSwitcher accountSwitcher, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        accountSwitcherDao_Impl.__insertAdapterOfAccountSwitcher.insert(_connection, (SQLiteConnection) accountSwitcher);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.account.libaccountswitcher.p059db.AccountSwitcherDao
    public Flow<AccountSwitcher> getAccountSwitcher(final String assetId, final AccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(location, "location");
        final String str = "SELECT * FROM AccountSwitcher WHERE assetId = ? AND location = ? LIMIT 1";
        return FlowBuilder.createFlow(this.__db, false, new String[]{"AccountSwitcher"}, new Function1() { // from class: com.robinhood.android.account.libaccountswitcher.db.AccountSwitcherDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSwitcherDao_Impl.getAccountSwitcher$lambda$2(str, assetId, this, location, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSwitcher getAccountSwitcher$lambda$2(String str, String str2, AccountSwitcherDao_Impl accountSwitcherDao_Impl, AccountSwitcherLocation accountSwitcherLocation, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.bindText(1, str2);
            String strConvertAccountSwitcherLocationToServerValue = accountSwitcherDao_Impl.__accountSwitcherRoomConverters().convertAccountSwitcherLocationToServerValue(accountSwitcherLocation);
            if (strConvertAccountSwitcherLocationToServerValue == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, strConvertAccountSwitcherLocationToServerValue);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "location");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accounts");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "positiveButtonText");
            AccountSwitcher accountSwitcher = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                AccountSwitcherLocation accountSwitcherLocationConvertServerValueToAccountSwitcherLocation = accountSwitcherDao_Impl.__accountSwitcherRoomConverters().convertServerValueToAccountSwitcherLocation(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                if (accountSwitcherLocationConvertServerValueToAccountSwitcherLocation == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherLocation', but it was NULL.");
                }
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                }
                List<AccountSwitcherAccount> listStringToAccountSwitcherAccountList = accountSwitcherDao_Impl.__accountSwitcherRoomConverters().stringToAccountSwitcherAccountList(text);
                if (listStringToAccountSwitcherAccountList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherAccount>', but it was NULL.");
                }
                accountSwitcher = new AccountSwitcher(text2, accountSwitcherLocationConvertServerValueToAccountSwitcherLocation, text3, listStringToAccountSwitcherAccountList, sQLiteStatementPrepare.getText(columnIndexOrThrow5));
            }
            sQLiteStatementPrepare.close();
            return accountSwitcher;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountSwitcherRoomConverter __accountSwitcherRoomConverters() {
        return this.__accountSwitcherRoomConverters.getValue();
    }

    /* compiled from: AccountSwitcherDao_Impl.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/account/libaccountswitcher/db/AccountSwitcherDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "lib-account-switcher-db_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.listOf(Reflection.getOrCreateKotlinClass(AccountSwitcherRoomConverter.class));
        }
    }
}
