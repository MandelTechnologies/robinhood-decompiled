package com.robinhood.shared.crypto.acats.intro;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import crypto_portkey.service.p443v1.MigrationService;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MigrationIntroDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "migrationService", "Lcrypto_portkey/service/v1/MigrationService;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MigrationIntroDuxo_Factory implements Factory<MigrationIntroDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MigrationService> migrationService;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MigrationIntroDuxo2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MigrationIntroDuxo_Factory create(Provider<DuxoBundle> provider, Provider<MigrationIntroDuxo2> provider2, Provider<SavedStateHandle> provider3, Provider<MigrationService> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final MigrationIntroDuxo newInstance(DuxoBundle duxoBundle, MigrationIntroDuxo2 migrationIntroDuxo2, SavedStateHandle savedStateHandle, MigrationService migrationService) {
        return INSTANCE.newInstance(duxoBundle, migrationIntroDuxo2, savedStateHandle, migrationService);
    }

    public MigrationIntroDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<MigrationIntroDuxo2> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<MigrationService> migrationService) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(migrationService, "migrationService");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.migrationService = migrationService;
    }

    @Override // javax.inject.Provider
    public MigrationIntroDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        MigrationIntroDuxo2 migrationIntroDuxo2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(migrationIntroDuxo2, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        MigrationService migrationService = this.migrationService.get();
        Intrinsics.checkNotNullExpressionValue(migrationService, "get(...)");
        return companion.newInstance(duxoBundle, migrationIntroDuxo2, savedStateHandle, migrationService);
    }

    /* compiled from: MigrationIntroDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "migrationService", "Lcrypto_portkey/service/v1/MigrationService;", "newInstance", "Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDuxo;", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MigrationIntroDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<MigrationIntroDuxo2> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<MigrationService> migrationService) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(migrationService, "migrationService");
            return new MigrationIntroDuxo_Factory(duxoBundle, stateProvider, savedStateHandle, migrationService);
        }

        @JvmStatic
        public final MigrationIntroDuxo newInstance(DuxoBundle duxoBundle, MigrationIntroDuxo2 stateProvider, SavedStateHandle savedStateHandle, MigrationService migrationService) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(migrationService, "migrationService");
            return new MigrationIntroDuxo(duxoBundle, stateProvider, savedStateHandle, migrationService);
        }
    }
}
