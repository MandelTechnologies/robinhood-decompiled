package com.robinhood.android.taxcertification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.odyssey.lib.BaseSdActivity;
import com.robinhood.android.tax.contracts.TaxCertification;
import com.robinhood.librobinhood.data.store.identi.ServerDrivenStore;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxCertificationOdysseyActivity.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxCertificationOdysseyActivity;", "Lcom/robinhood/android/odyssey/lib/BaseSdActivity;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "getBackupWithholdingStore", "()Lcom/robinhood/store/base/BackupWithholdingStore;", "setBackupWithholdingStore", "(Lcom/robinhood/store/base/BackupWithholdingStore;)V", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "getLogoutKillswitch", "()Lcom/robinhood/utils/LogoutKillswitch;", "setLogoutKillswitch", "(Lcom/robinhood/utils/LogoutKillswitch;)V", "odysseyFlowConfiguration", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "getOdysseyFlowConfiguration", "()Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "onStop", "", "Companion", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TaxCertificationOdysseyActivity extends BaseSdActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ODYSSEY_TAX_CERT_PATH = "tax_certification";
    private static final String SHOULD_REDIRECT_QUERY_PARAM = "should_redirect";
    public AccountProvider accountProvider;
    public BackupWithholdingStore backupWithholdingStore;
    public LogoutKillswitch logoutKillswitch;

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final BackupWithholdingStore getBackupWithholdingStore() {
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore;
        if (backupWithholdingStore != null) {
            return backupWithholdingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backupWithholdingStore");
        return null;
    }

    public final void setBackupWithholdingStore(BackupWithholdingStore backupWithholdingStore) {
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "<set-?>");
        this.backupWithholdingStore = backupWithholdingStore;
    }

    public final LogoutKillswitch getLogoutKillswitch() {
        LogoutKillswitch logoutKillswitch = this.logoutKillswitch;
        if (logoutKillswitch != null) {
            return logoutKillswitch;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logoutKillswitch");
        return null;
    }

    public final void setLogoutKillswitch(LogoutKillswitch logoutKillswitch) {
        Intrinsics.checkNotNullParameter(logoutKillswitch, "<set-?>");
        this.logoutKillswitch = logoutKillswitch;
    }

    @Override // com.robinhood.android.odyssey.lib.BaseSdActivity
    public ServerDrivenStore.FlowConfiguration getOdysseyFlowConfiguration() {
        Map mapEmptyMap;
        Boolean shouldRedirect = ((TaxCertification) INSTANCE.getExtras((Activity) this)).getShouldRedirect();
        if (shouldRedirect == null || (mapEmptyMap = MapsKt.mapOf(Tuples4.m3642to(SHOULD_REDIRECT_QUERY_PARAM, String.valueOf(shouldRedirect.booleanValue())))) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return new ServerDrivenStore.FlowConfiguration(ODYSSEY_TAX_CERT_PATH, false, mapEmptyMap, null, null, null, 58, null);
    }

    /* compiled from: TaxCertificationOdysseyActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxCertificationOdysseyActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/taxcertification/TaxCertificationOdysseyActivity;", "Lcom/robinhood/android/tax/contracts/TaxCertification;", "<init>", "()V", "ODYSSEY_TAX_CERT_PATH", "", "SHOULD_REDIRECT_QUERY_PARAM", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<TaxCertificationOdysseyActivity, TaxCertification> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public TaxCertification getExtras(TaxCertificationOdysseyActivity taxCertificationOdysseyActivity) {
            return (TaxCertification) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, taxCertificationOdysseyActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, TaxCertification taxCertification) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, taxCertification);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, TaxCertification taxCertification) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, taxCertification);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        Observable<Optional<String>> observable = getAccountProvider().getIndividualAccountNumber().toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        ScopedSubscriptionKt.subscribeIn(ObservablesKt.filterIsPresent(observable), getLogoutKillswitch().getLoggedInScope(), new Function1() { // from class: com.robinhood.android.taxcertification.TaxCertificationOdysseyActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxCertificationOdysseyActivity.onStop$lambda$1(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$1(TaxCertificationOdysseyActivity taxCertificationOdysseyActivity, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        taxCertificationOdysseyActivity.getBackupWithholdingStore().refreshWithholdingStatus(accountNumber, null);
        return Unit.INSTANCE;
    }
}
