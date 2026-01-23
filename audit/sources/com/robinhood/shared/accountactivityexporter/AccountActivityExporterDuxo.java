package com.robinhood.shared.accountactivityexporter;

import com.robinhood.android.store.accountactivityexporter.AccountActivityExporterStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.accountactivityexporter.api.ApiAccountActivityExporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountActivityExporterDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterDataState;", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterViewState;", "accountActivityExporterStore", "Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;", "stateProvider", "Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/store/accountactivityexporter/AccountActivityExporterStore;Lcom/robinhood/shared/accountactivityexporter/AccountActivityExporterStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onResume", "", "feature-account-activity-exporter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AccountActivityExporterDuxo extends BaseDuxo<AccountActivityExporterDataState, AccountActivityExporterViewState> {
    public static final int $stable = 8;
    private final AccountActivityExporterStore accountActivityExporterStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountActivityExporterDuxo(AccountActivityExporterStore accountActivityExporterStore, AccountActivityExporterDuxo3 stateProvider, DuxoBundle duxoBundle) {
        super(new AccountActivityExporterDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountActivityExporterStore, "accountActivityExporterStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountActivityExporterStore = accountActivityExporterStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountActivityExporterStore.streamAccountActivityExporter(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.accountactivityexporter.AccountActivityExporterDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountActivityExporterDuxo.onResume$lambda$0(this.f$0, (ApiAccountActivityExporter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(AccountActivityExporterDuxo accountActivityExporterDuxo, ApiAccountActivityExporter response) {
        Intrinsics.checkNotNullParameter(response, "response");
        accountActivityExporterDuxo.applyMutation(new AccountActivityExporterDuxo2(response, null));
        return Unit.INSTANCE;
    }
}
