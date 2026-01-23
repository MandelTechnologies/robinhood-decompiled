package com.robinhood.android.gold.sage;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import gold.proto.p464v1.GoldService;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSageLoadingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageLoadingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gold/sage/GoldSageLoadingDuxo;", "goldService", "Ljavax/inject/Provider;", "Lgold/proto/v1/GoldService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldSageLoadingDuxo_Factory implements Factory<GoldSageLoadingDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<GoldService> goldService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final GoldSageLoadingDuxo_Factory create(Provider<GoldService> provider, Provider<DuxoBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final GoldSageLoadingDuxo newInstance(GoldService goldService, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(goldService, duxoBundle);
    }

    public GoldSageLoadingDuxo_Factory(Provider<GoldService> goldService, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(goldService, "goldService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldService = goldService;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public GoldSageLoadingDuxo get() {
        Companion companion = INSTANCE;
        GoldService goldService = this.goldService.get();
        Intrinsics.checkNotNullExpressionValue(goldService, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(goldService, duxoBundle);
    }

    /* compiled from: GoldSageLoadingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageLoadingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gold/sage/GoldSageLoadingDuxo_Factory;", "goldService", "Ljavax/inject/Provider;", "Lgold/proto/v1/GoldService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/gold/sage/GoldSageLoadingDuxo;", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GoldSageLoadingDuxo_Factory create(Provider<GoldService> goldService, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(goldService, "goldService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new GoldSageLoadingDuxo_Factory(goldService, duxoBundle);
        }

        @JvmStatic
        public final GoldSageLoadingDuxo newInstance(GoldService goldService, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(goldService, "goldService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new GoldSageLoadingDuxo(goldService, duxoBundle);
        }
    }
}
