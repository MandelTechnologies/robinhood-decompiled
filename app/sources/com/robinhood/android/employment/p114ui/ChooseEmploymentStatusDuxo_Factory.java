package com.robinhood.android.employment.p114ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.EmploymentStore;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmploymentStatusDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDuxo;", "employmentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ChooseEmploymentStatusDuxo_Factory implements Factory<ChooseEmploymentStatusDuxo> {
    private final Provider<AppType> appType;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EmploymentStore> employmentStore;
    private final Provider<ChooseEmploymentStatusDuxo4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ChooseEmploymentStatusDuxo_Factory create(Provider<EmploymentStore> provider, Provider<AppType> provider2, Provider<DuxoBundle> provider3, Provider<ChooseEmploymentStatusDuxo4> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final ChooseEmploymentStatusDuxo newInstance(EmploymentStore employmentStore, AppType appType, DuxoBundle duxoBundle, ChooseEmploymentStatusDuxo4 chooseEmploymentStatusDuxo4) {
        return INSTANCE.newInstance(employmentStore, appType, duxoBundle, chooseEmploymentStatusDuxo4);
    }

    public ChooseEmploymentStatusDuxo_Factory(Provider<EmploymentStore> employmentStore, Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<ChooseEmploymentStatusDuxo4> stateProvider) {
        Intrinsics.checkNotNullParameter(employmentStore, "employmentStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.employmentStore = employmentStore;
        this.appType = appType;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public ChooseEmploymentStatusDuxo get() {
        Companion companion = INSTANCE;
        EmploymentStore employmentStore = this.employmentStore.get();
        Intrinsics.checkNotNullExpressionValue(employmentStore, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        ChooseEmploymentStatusDuxo4 chooseEmploymentStatusDuxo4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(chooseEmploymentStatusDuxo4, "get(...)");
        return companion.newInstance(employmentStore, appType, duxoBundle, chooseEmploymentStatusDuxo4);
    }

    /* compiled from: ChooseEmploymentStatusDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDuxo_Factory;", "employmentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusStateProvider;", "newInstance", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDuxo;", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ChooseEmploymentStatusDuxo_Factory create(Provider<EmploymentStore> employmentStore, Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<ChooseEmploymentStatusDuxo4> stateProvider) {
            Intrinsics.checkNotNullParameter(employmentStore, "employmentStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new ChooseEmploymentStatusDuxo_Factory(employmentStore, appType, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final ChooseEmploymentStatusDuxo newInstance(EmploymentStore employmentStore, AppType appType, DuxoBundle duxoBundle, ChooseEmploymentStatusDuxo4 stateProvider) {
            Intrinsics.checkNotNullParameter(employmentStore, "employmentStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new ChooseEmploymentStatusDuxo(employmentStore, appType, duxoBundle, stateProvider);
        }
    }
}
