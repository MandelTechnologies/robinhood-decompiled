package com.robinhood.util;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.SharedPreferences;
import com.robinhood.api.BuildConfig;
import com.robinhood.util.migrations.LastUpdatedAtMigrations;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Instants;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;

/* compiled from: LastUpdatedAtManager.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B4\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\u001b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u001b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b \u0010!J)\u0010 \u001a\u00020\u001b2\u001a\u0010#\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000e0\"\"\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b \u0010$R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R0\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00190)j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0019`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m3636d2 = {"Lcom/robinhood/util/LastUpdatedAtManager;", "", "Landroid/app/Application;", "app", "Lcom/robinhood/utils/LogoutKillswitch;", "logoutKillswitch", "Lcom/robinhood/util/OneTimeClearManager;", "oneTimeClearManager", "", "Lcom/robinhood/util/migrations/LastUpdatedAtMigrations;", "Lkotlin/jvm/JvmSuppressWildcards;", "migrations", "<init>", "(Landroid/app/Application;Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/util/OneTimeClearManager;Ljava/util/Set;)V", "Ljava/lang/Class;", "classType", "", "getKey", "(Ljava/lang/Class;)Ljava/lang/String;", "j$/time/LocalDate", "getLastUpdatedAtDate", "(Ljava/lang/Class;)Lj$/time/LocalDate;", "j$/time/Instant", "getLastUpdatedAt", "(Ljava/lang/Class;)Lj$/time/Instant;", "", "lastUpdatedAtTimeMillis", "", "saveLastUpdatedAt", "(Ljava/lang/Class;J)V", "clearAll", "()V", "clear", "(Ljava/lang/Class;)V", "", "classTypes", "([Ljava/lang/Class;)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "sharedPrefs", "Landroid/content/SharedPreferences;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "cache", "Ljava/util/HashMap;", "Companion", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class LastUpdatedAtManager {
    private static final String LEGACY_VERSION_KEY = "version";
    private static final String PREF_FILE_NAME = "updatedAtPrefs";
    private static final String PREF_PREFIX = "last_updated_at";
    private final HashMap<String, Long> cache;
    private final SharedPreferences sharedPrefs;

    public LastUpdatedAtManager(Application app, LogoutKillswitch logoutKillswitch, OneTimeClearManager oneTimeClearManager, Set<LastUpdatedAtMigrations> migrations) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(oneTimeClearManager, "oneTimeClearManager");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        this.sharedPrefs = app.getSharedPreferences(PREF_FILE_NAME, 0);
        this.cache = new HashMap<>();
        if (BuildConfig.DEBUG) {
            Set<LastUpdatedAtMigrations> set = migrations;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((LastUpdatedAtMigrations) it.next()).getVersionKey());
            }
            if (CollectionsKt.distinct(arrayList).size() != migrations.size()) {
                throw new IllegalStateException("LastUpdatedAtMigrations.versionKey must be unique!");
            }
            if (!arrayList.contains(LEGACY_VERSION_KEY)) {
                throw new IllegalStateException("LastUpdateAtMigrations for the main db must use versionKey \"version\"");
            }
        }
        for (LastUpdatedAtMigrations lastUpdatedAtMigrations : migrations) {
            int currentDbVersion = lastUpdatedAtMigrations.getCurrentDbVersion();
            for (int i = this.sharedPrefs.getInt(lastUpdatedAtMigrations.getVersionKey(), 0); i < currentDbVersion; i++) {
                lastUpdatedAtMigrations.onUpgrade(this, i);
            }
            this.sharedPrefs.edit().putInt(lastUpdatedAtMigrations.getVersionKey(), lastUpdatedAtMigrations.getCurrentDbVersion()).apply();
        }
        oneTimeClearManager.clearOptionOrders(this);
        oneTimeClearManager.clearCryptoOrders(this);
        oneTimeClearManager.clearModelsForDbMigrationFailure(this);
        logoutKillswitch.getKillswitchObservable().take(1L).subscribe(new Consumer() { // from class: com.robinhood.util.LastUpdatedAtManager.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Boolean bool) {
                LastUpdatedAtManager.this.clearAll();
            }
        });
    }

    public final LocalDate getLastUpdatedAtDate(Class<?> classType) {
        Intrinsics.checkNotNullParameter(classType, "classType");
        Instant lastUpdatedAt = getLastUpdatedAt(classType);
        if (lastUpdatedAt == null) {
            return null;
        }
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return Instants.toLocalDate(lastUpdatedAt, zoneIdSystemDefault);
    }

    public final Instant getLastUpdatedAt(Class<?> classType) {
        Intrinsics.checkNotNullParameter(classType, "classType");
        String key = getKey(classType);
        Long l = this.cache.get(key);
        long jLongValue = l != null ? l.longValue() : this.sharedPrefs.getLong(key, 0L);
        this.cache.put(key, Long.valueOf(jLongValue));
        Long lValueOf = Long.valueOf(jLongValue);
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return Instant.ofEpochMilli(lValueOf.longValue());
        }
        return null;
    }

    public static /* synthetic */ void saveLastUpdatedAt$default(LastUpdatedAtManager lastUpdatedAtManager, Class cls, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis() - 86400000;
        }
        lastUpdatedAtManager.saveLastUpdatedAt(cls, j);
    }

    public final void saveLastUpdatedAt(Class<?> classType, long lastUpdatedAtTimeMillis) {
        Intrinsics.checkNotNullParameter(classType, "classType");
        String key = getKey(classType);
        this.cache.put(key, Long.valueOf(lastUpdatedAtTimeMillis));
        this.sharedPrefs.edit().putLong(key, lastUpdatedAtTimeMillis).apply();
    }

    private final String getKey(Class<?> classType) {
        return "last_updated_at_" + classType.getName();
    }

    public final void clearAll() {
        this.cache.clear();
        this.sharedPrefs.edit().clear().apply();
    }

    public final void clear(Class<?> classType) {
        Intrinsics.checkNotNullParameter(classType, "classType");
        String key = getKey(classType);
        this.cache.remove(key);
        this.sharedPrefs.edit().remove(key).apply();
    }

    public final void clear(Class<?>... classTypes) {
        Intrinsics.checkNotNullParameter(classTypes, "classTypes");
        SharedPreferences sharedPrefs = this.sharedPrefs;
        Intrinsics.checkNotNullExpressionValue(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editorEdit = sharedPrefs.edit();
        for (Class<?> cls : classTypes) {
            String key = getKey(cls);
            this.cache.remove(key);
            editorEdit.remove(key);
        }
        editorEdit.apply();
    }
}
