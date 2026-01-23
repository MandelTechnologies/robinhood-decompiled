package com.robinhood.android.goldearningspotential.microgram;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* compiled from: RealGoldEarningsPotentialSduiConverters_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/goldearningspotential/microgram/RealGoldEarningsPotentialSduiConverters_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/goldearningspotential/microgram/RealGoldEarningsPotentialSduiConverters;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RealGoldEarningsPotentialSduiConverters_Factory implements Factory<GoldEarningsPotentialMicrogramSduiConverters2> {
    private final Provider<Json> json;
    private final Provider<LazyMoshi> moshi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RealGoldEarningsPotentialSduiConverters_Factory create(Provider<LazyMoshi> provider, Provider<Json> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final GoldEarningsPotentialMicrogramSduiConverters2 newInstance(LazyMoshi lazyMoshi, Json json) {
        return INSTANCE.newInstance(lazyMoshi, json);
    }

    public RealGoldEarningsPotentialSduiConverters_Factory(Provider<LazyMoshi> moshi, Provider<Json> json) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(json, "json");
        this.moshi = moshi;
        this.json = json;
    }

    @Override // javax.inject.Provider
    public GoldEarningsPotentialMicrogramSduiConverters2 get() {
        Companion companion = INSTANCE;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        Json json = this.json.get();
        Intrinsics.checkNotNullExpressionValue(json, "get(...)");
        return companion.newInstance(lazyMoshi, json);
    }

    /* compiled from: RealGoldEarningsPotentialSduiConverters_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/goldearningspotential/microgram/RealGoldEarningsPotentialSduiConverters_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/goldearningspotential/microgram/RealGoldEarningsPotentialSduiConverters_Factory;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "json", "Lkotlinx/serialization/json/Json;", "newInstance", "Lcom/robinhood/android/goldearningspotential/microgram/RealGoldEarningsPotentialSduiConverters;", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealGoldEarningsPotentialSduiConverters_Factory create(Provider<LazyMoshi> moshi, Provider<Json> json) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(json, "json");
            return new RealGoldEarningsPotentialSduiConverters_Factory(moshi, json);
        }

        @JvmStatic
        public final GoldEarningsPotentialMicrogramSduiConverters2 newInstance(LazyMoshi moshi, Json json) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(json, "json");
            return new GoldEarningsPotentialMicrogramSduiConverters2(moshi, json);
        }
    }
}
