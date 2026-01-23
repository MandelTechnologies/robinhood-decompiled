package com.robinhood.util.migrations;

import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.util.LastUpdatedAtManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: RhDatabaseLastUpdatedAtMigrations.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/util/migrations/RhDatabaseLastUpdatedAtMigrations;", "Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "<init>", "()V", "versionKey", "", "getVersionKey", "()Ljava/lang/String;", "currentDbVersion", "", "getCurrentDbVersion", "()I", "onUpgrade", "", "lastUpdatedAtManager", "Lcom/robinhood/util/LastUpdatedAtManager;", "oldVersion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RhDatabaseLastUpdatedAtMigrations implements LastUpdatedAtMigrations {
    public static final RhDatabaseLastUpdatedAtMigrations INSTANCE = new RhDatabaseLastUpdatedAtMigrations();
    private static final String versionKey = "version";
    private static final int currentDbVersion = 738;

    private RhDatabaseLastUpdatedAtMigrations() {
    }

    @Override // com.robinhood.util.migrations.LastUpdatedAtMigrations
    public String getVersionKey() {
        return versionKey;
    }

    @Override // com.robinhood.util.migrations.LastUpdatedAtMigrations
    public int getCurrentDbVersion() {
        return currentDbVersion;
    }

    @Override // com.robinhood.util.migrations.LastUpdatedAtMigrations
    public void onUpgrade(LastUpdatedAtManager lastUpdatedAtManager, int oldVersion) {
        Intrinsics.checkNotNullParameter(lastUpdatedAtManager, "lastUpdatedAtManager");
        Timber.INSTANCE.mo3356i("lastUpdatedAt RhDatabase onUpgrade: oldVersion = " + oldVersion, new Object[0]);
        if (oldVersion >= 0 && oldVersion < 553) {
            lastUpdatedAtManager.clearAll();
            return;
        }
        if (oldVersion != 553) {
            if (oldVersion == 554) {
                lastUpdatedAtManager.clear(OptionOrder.class);
                return;
            }
            if (555 > oldVersion || oldVersion >= 565) {
                if (oldVersion == 565) {
                    lastUpdatedAtManager.clear(OptionOrder.class);
                    return;
                }
                if (566 > oldVersion || oldVersion >= 570) {
                    if (oldVersion == 570) {
                        lastUpdatedAtManager.clear(CryptoOrder.class);
                        return;
                    }
                    if (oldVersion != 571) {
                        if (oldVersion == 572) {
                            lastUpdatedAtManager.clear(PaymentTransfer.class);
                            return;
                        }
                        if (oldVersion != 573) {
                            if (oldVersion == 574) {
                                lastUpdatedAtManager.clear(Quote.class, Position.class);
                                return;
                            }
                            if (575 > oldVersion || oldVersion >= 578) {
                                if (oldVersion == 578) {
                                    lastUpdatedAtManager.clear(PaymentTransfer.class);
                                    return;
                                }
                                if (oldVersion == 579) {
                                    lastUpdatedAtManager.clear(Order.class);
                                    return;
                                }
                                if (oldVersion != 580) {
                                    if (oldVersion == 581) {
                                        lastUpdatedAtManager.clear(PaymentTransfer.class);
                                        return;
                                    }
                                    if (oldVersion != 582) {
                                        if (oldVersion == 583) {
                                            lastUpdatedAtManager.clear(Order.class);
                                            return;
                                        }
                                        if (584 > oldVersion || oldVersion >= 594) {
                                            if (oldVersion == 594) {
                                                lastUpdatedAtManager.clear(Quote.class);
                                                return;
                                            }
                                            if (oldVersion != 595) {
                                                if (oldVersion == 596) {
                                                    lastUpdatedAtManager.clear(Account.class);
                                                    return;
                                                }
                                                if (oldVersion == 597) {
                                                    lastUpdatedAtManager.clear(OptionOrder.class);
                                                    return;
                                                }
                                                if (598 > oldVersion || oldVersion >= 600) {
                                                    if (oldVersion == 600) {
                                                        lastUpdatedAtManager.clear(Order.class);
                                                        return;
                                                    }
                                                    if (oldVersion == 601) {
                                                        lastUpdatedAtManager.clear(Order.class);
                                                        return;
                                                    }
                                                    if (602 > oldVersion || oldVersion >= 607) {
                                                        if (oldVersion == 607) {
                                                            lastUpdatedAtManager.clear(Position.class);
                                                            return;
                                                        }
                                                        if (608 > oldVersion || oldVersion >= 627) {
                                                            if (oldVersion == 627) {
                                                                lastUpdatedAtManager.clear(CryptoOrder.class);
                                                                return;
                                                            }
                                                            if (oldVersion != 628) {
                                                                if (oldVersion == 629) {
                                                                    lastUpdatedAtManager.clear(CryptoOrder.class);
                                                                    return;
                                                                }
                                                                if (oldVersion != 630) {
                                                                    if (oldVersion == 631) {
                                                                        lastUpdatedAtManager.clear(CryptoOrder.class);
                                                                        return;
                                                                    }
                                                                    if (oldVersion == 632) {
                                                                        lastUpdatedAtManager.clear(OptionOrder.class);
                                                                        return;
                                                                    }
                                                                    if (633 > oldVersion || oldVersion >= 639) {
                                                                        if (oldVersion == 639) {
                                                                            lastUpdatedAtManager.clear(Position.class);
                                                                            return;
                                                                        }
                                                                        if (640 > oldVersion || oldVersion >= 645) {
                                                                            if (oldVersion == 645) {
                                                                                lastUpdatedAtManager.clear(CryptoOrder.class);
                                                                                return;
                                                                            }
                                                                            if (646 > oldVersion || oldVersion >= 649) {
                                                                                if (oldVersion == 649) {
                                                                                    lastUpdatedAtManager.clear(CryptoOrder.class);
                                                                                    return;
                                                                                }
                                                                                if (650 > oldVersion || oldVersion >= 656) {
                                                                                    if (oldVersion == 656) {
                                                                                        lastUpdatedAtManager.clear(Order.class);
                                                                                        return;
                                                                                    }
                                                                                    if (657 > oldVersion || oldVersion >= 660) {
                                                                                        if (oldVersion == 660) {
                                                                                            lastUpdatedAtManager.clear(Order.class);
                                                                                            return;
                                                                                        }
                                                                                        if (661 > oldVersion || oldVersion >= 684) {
                                                                                            if (oldVersion == 684) {
                                                                                                lastUpdatedAtManager.clear(Position.class);
                                                                                                return;
                                                                                            }
                                                                                            if (685 > oldVersion || oldVersion >= 738) {
                                                                                                throw new IllegalStateException(("No migration in LastUpdatedAtManager for DB version " + oldVersion + ".").toString());
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
