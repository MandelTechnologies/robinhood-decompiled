package com.robinhood.equities.eventupdates;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.arsenal.proto.p281v1.idl.EquityService;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityEventUpdatesSectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/equities/eventupdates/EquityEventUpdatesSectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesSectionDuxo;", "arsenalEquityService", "Ljavax/inject/Provider;", "Lcom/robinhood/arsenal/proto/v1/idl/EquityService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class EquityEventUpdatesSectionDuxo_Factory implements Factory<EquityEventUpdatesSectionDuxo> {
    private final Provider<EquityService> arsenalEquityService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EquityEventUpdatesSectionDuxo4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityEventUpdatesSectionDuxo_Factory create(Provider<EquityService> provider, Provider<DuxoBundle> provider2, Provider<EquityEventUpdatesSectionDuxo4> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final EquityEventUpdatesSectionDuxo newInstance(EquityService equityService, DuxoBundle duxoBundle, EquityEventUpdatesSectionDuxo4 equityEventUpdatesSectionDuxo4) {
        return INSTANCE.newInstance(equityService, duxoBundle, equityEventUpdatesSectionDuxo4);
    }

    public EquityEventUpdatesSectionDuxo_Factory(Provider<EquityService> arsenalEquityService, Provider<DuxoBundle> duxoBundle, Provider<EquityEventUpdatesSectionDuxo4> stateProvider) {
        Intrinsics.checkNotNullParameter(arsenalEquityService, "arsenalEquityService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.arsenalEquityService = arsenalEquityService;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public EquityEventUpdatesSectionDuxo get() {
        Companion companion = INSTANCE;
        EquityService equityService = this.arsenalEquityService.get();
        Intrinsics.checkNotNullExpressionValue(equityService, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        EquityEventUpdatesSectionDuxo4 equityEventUpdatesSectionDuxo4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(equityEventUpdatesSectionDuxo4, "get(...)");
        return companion.newInstance(equityService, duxoBundle, equityEventUpdatesSectionDuxo4);
    }

    /* compiled from: EquityEventUpdatesSectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/equities/eventupdates/EquityEventUpdatesSectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesSectionDuxo_Factory;", "arsenalEquityService", "Ljavax/inject/Provider;", "Lcom/robinhood/arsenal/proto/v1/idl/EquityService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesStateProvider;", "newInstance", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesSectionDuxo;", "lib-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityEventUpdatesSectionDuxo_Factory create(Provider<EquityService> arsenalEquityService, Provider<DuxoBundle> duxoBundle, Provider<EquityEventUpdatesSectionDuxo4> stateProvider) {
            Intrinsics.checkNotNullParameter(arsenalEquityService, "arsenalEquityService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new EquityEventUpdatesSectionDuxo_Factory(arsenalEquityService, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final EquityEventUpdatesSectionDuxo newInstance(EquityService arsenalEquityService, DuxoBundle duxoBundle, EquityEventUpdatesSectionDuxo4 stateProvider) {
            Intrinsics.checkNotNullParameter(arsenalEquityService, "arsenalEquityService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new EquityEventUpdatesSectionDuxo(arsenalEquityService, duxoBundle, stateProvider);
        }
    }
}
