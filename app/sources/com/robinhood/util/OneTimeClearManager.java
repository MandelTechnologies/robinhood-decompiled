package com.robinhood.util;

import android.app.Application;
import android.content.SharedPreferences;
import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AdrFee;
import com.robinhood.models.p320db.InstrumentSplit;
import com.robinhood.models.p320db.OptionCorporateAction;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneTimeClearManager.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/util/OneTimeClearManager;", "", "app", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "clearOptionOrders", "", "lastUpdatedAtManager", "Lcom/robinhood/util/LastUpdatedAtManager;", "clearCryptoOrders", "clearModelsForDbMigrationFailure", "Companion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OneTimeClearManager {
    private static final String HAS_STALE_CRYPTO_ORDER_MODELS = "hasStaleCryptoOrderModels";
    private static final String HAS_STALE_MODELS_FOR_DB_MIGRATION_FAILURE = "hasStaleModelsForDbMigrationFailure";
    private static final String HAS_STALE_OPTION_ORDER_MODELS = "hasStaleOptionOrderModels";
    private static final String PREF_FILE_NAME = "oneTimeClear";
    private final SharedPreferences sharedPrefs;

    public OneTimeClearManager(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.sharedPrefs = app.getSharedPreferences(PREF_FILE_NAME, 0);
    }

    public final void clearOptionOrders(LastUpdatedAtManager lastUpdatedAtManager) {
        Intrinsics.checkNotNullParameter(lastUpdatedAtManager, "lastUpdatedAtManager");
        if (this.sharedPrefs.getBoolean(HAS_STALE_OPTION_ORDER_MODELS, true)) {
            lastUpdatedAtManager.clear(OptionOrder.class);
            this.sharedPrefs.edit().putBoolean(HAS_STALE_OPTION_ORDER_MODELS, false).apply();
        }
    }

    public final void clearCryptoOrders(LastUpdatedAtManager lastUpdatedAtManager) {
        Intrinsics.checkNotNullParameter(lastUpdatedAtManager, "lastUpdatedAtManager");
        if (this.sharedPrefs.getBoolean(HAS_STALE_CRYPTO_ORDER_MODELS, true)) {
            lastUpdatedAtManager.clear(CryptoOrder.class);
            this.sharedPrefs.edit().putBoolean(HAS_STALE_CRYPTO_ORDER_MODELS, false).apply();
        }
    }

    public final void clearModelsForDbMigrationFailure(LastUpdatedAtManager lastUpdatedAtManager) {
        Intrinsics.checkNotNullParameter(lastUpdatedAtManager, "lastUpdatedAtManager");
        if (this.sharedPrefs.getBoolean(HAS_STALE_MODELS_FOR_DB_MIGRATION_FAILURE, true)) {
            lastUpdatedAtManager.clear(Account.class);
            lastUpdatedAtManager.clear(AdrFee.class);
            lastUpdatedAtManager.clear(CryptoOrder.class);
            lastUpdatedAtManager.clear(InstrumentSplit.class);
            lastUpdatedAtManager.clear(OptionCorporateAction.class);
            lastUpdatedAtManager.clear(OptionOrder.class);
            lastUpdatedAtManager.clear(Order.class);
            lastUpdatedAtManager.clear(PaymentTransfer.class);
            lastUpdatedAtManager.clear(Position.class);
            lastUpdatedAtManager.clear(Quote.class);
            this.sharedPrefs.edit().putBoolean(HAS_STALE_MODELS_FOR_DB_MIGRATION_FAILURE, false).apply();
        }
    }
}
