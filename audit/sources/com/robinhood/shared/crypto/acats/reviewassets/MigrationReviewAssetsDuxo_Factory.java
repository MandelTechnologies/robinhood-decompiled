package com.robinhood.shared.crypto.acats.reviewassets;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.card.p311db.Card;
import crypto_portkey.service.p443v1.MigrationService;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: MigrationReviewAssetsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Lcrypto_portkey/service/v1/MigrationService;", "migrationService", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MigrationReviewAssetsDuxo_Factory implements Factory<MigrationReviewAssetsDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MigrationService> migrationService;
    private final Provider<Resources> resources;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MigrationReviewAssetsDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MigrationReviewAssetsDuxo_Factory create(Provider<DuxoBundle> provider, Provider<Resources> provider2, Provider<MigrationReviewAssetsDuxo3> provider3, Provider<SavedStateHandle> provider4, Provider<Clock> provider5, Provider<MigrationService> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final MigrationReviewAssetsDuxo newInstance(DuxoBundle duxoBundle, Resources resources, MigrationReviewAssetsDuxo3 migrationReviewAssetsDuxo3, SavedStateHandle savedStateHandle, Clock clock, MigrationService migrationService) {
        return INSTANCE.newInstance(duxoBundle, resources, migrationReviewAssetsDuxo3, savedStateHandle, clock, migrationService);
    }

    public MigrationReviewAssetsDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<Resources> resources, Provider<MigrationReviewAssetsDuxo3> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock, Provider<MigrationService> migrationService) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(migrationService, "migrationService");
        this.duxoBundle = duxoBundle;
        this.resources = resources;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
        this.migrationService = migrationService;
    }

    @Override // javax.inject.Provider
    public MigrationReviewAssetsDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        MigrationReviewAssetsDuxo3 migrationReviewAssetsDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(migrationReviewAssetsDuxo3, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        MigrationService migrationService = this.migrationService.get();
        Intrinsics.checkNotNullExpressionValue(migrationService, "get(...)");
        return companion.newInstance(duxoBundle, resources, migrationReviewAssetsDuxo3, savedStateHandle, clock, migrationService);
    }

    /* compiled from: MigrationReviewAssetsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Lcrypto_portkey/service/v1/MigrationService;", "migrationService", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo_Factory;", "Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo;", "newInstance", "(Lcom/robinhood/android/udf/DuxoBundle;Landroid/content/res/Resources;Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsStateProvider;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;Lcrypto_portkey/service/v1/MigrationService;)Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsDuxo;", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MigrationReviewAssetsDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<Resources> resources, Provider<MigrationReviewAssetsDuxo3> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock, Provider<MigrationService> migrationService) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(migrationService, "migrationService");
            return new MigrationReviewAssetsDuxo_Factory(duxoBundle, resources, stateProvider, savedStateHandle, clock, migrationService);
        }

        @JvmStatic
        public final MigrationReviewAssetsDuxo newInstance(DuxoBundle duxoBundle, Resources resources, MigrationReviewAssetsDuxo3 stateProvider, SavedStateHandle savedStateHandle, Clock clock, MigrationService migrationService) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(migrationService, "migrationService");
            return new MigrationReviewAssetsDuxo(duxoBundle, resources, stateProvider, savedStateHandle, clock, migrationService);
        }
    }
}
