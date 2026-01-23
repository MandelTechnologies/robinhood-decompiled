package com.robinhood.android.acats.plaid.transfer.partial.edit;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsPlaidPartialTransferEditDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AcatsPlaidPartialTransferEditDuxo_Factory implements Factory<AcatsPlaidPartialTransferEditDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<AcatsPlaidPartialTransferEditDuxo5> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AcatsPlaidPartialTransferEditDuxo_Factory create(Provider<AcatsPlaidPartialTransferEditDuxo5> provider, Provider<DuxoBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final AcatsPlaidPartialTransferEditDuxo newInstance(AcatsPlaidPartialTransferEditDuxo5 acatsPlaidPartialTransferEditDuxo5, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(acatsPlaidPartialTransferEditDuxo5, duxoBundle);
    }

    public AcatsPlaidPartialTransferEditDuxo_Factory(Provider<AcatsPlaidPartialTransferEditDuxo5> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AcatsPlaidPartialTransferEditDuxo get() {
        Companion companion = INSTANCE;
        AcatsPlaidPartialTransferEditDuxo5 acatsPlaidPartialTransferEditDuxo5 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(acatsPlaidPartialTransferEditDuxo5, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(acatsPlaidPartialTransferEditDuxo5, duxoBundle);
    }

    /* compiled from: AcatsPlaidPartialTransferEditDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDuxo;", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AcatsPlaidPartialTransferEditDuxo_Factory create(Provider<AcatsPlaidPartialTransferEditDuxo5> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsPlaidPartialTransferEditDuxo_Factory(stateProvider, duxoBundle);
        }

        @JvmStatic
        public final AcatsPlaidPartialTransferEditDuxo newInstance(AcatsPlaidPartialTransferEditDuxo5 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsPlaidPartialTransferEditDuxo(stateProvider, duxoBundle);
        }
    }
}
