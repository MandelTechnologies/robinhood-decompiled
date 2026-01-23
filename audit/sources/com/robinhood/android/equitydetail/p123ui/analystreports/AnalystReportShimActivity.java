package com.robinhood.android.equitydetail.p123ui.analystreports;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.SinglesAndroid;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalystReportShimActivity.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportShimActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "getMarginSubscriptionStore", "()Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "setMarginSubscriptionStore", "(Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;)V", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "instrumentId$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onDialogDismissed", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class AnalystReportShimActivity extends BaseActivity implements RhDialogFragment.OnDismissListener {
    private static final String EXTRA_INSTRUMENT_ID = "instrumentId";

    /* renamed from: instrumentId$delegate, reason: from kotlin metadata */
    private final Lazy instrumentId;
    public MarginSubscriptionStore marginSubscriptionStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AnalystReportShimActivity() {
        super(C15314R.layout.activity_analyst_report_shim);
        this.instrumentId = Activity.intentExtra(this, "instrumentId");
    }

    public final MarginSubscriptionStore getMarginSubscriptionStore() {
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore;
        if (marginSubscriptionStore != null) {
            return marginSubscriptionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginSubscriptionStore");
        return null;
    }

    public final void setMarginSubscriptionStore(MarginSubscriptionStore marginSubscriptionStore) {
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "<set-?>");
        this.marginSubscriptionStore = marginSubscriptionStore;
    }

    private final UUID getInstrumentId() {
        return (UUID) this.instrumentId.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(SingleDelay2.minTimeInFlight$default(getMarginSubscriptionStore().checkCurrentMarginSubscription(true), 1000L, null, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportShimActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportShimActivity.onCreate$lambda$0(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportShimActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportShimActivity.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(AnalystReportShimActivity analystReportShimActivity, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        MarginSubscription marginSubscription = (MarginSubscription) optional.component1();
        if (marginSubscription == null) {
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(analystReportShimActivity).setId(C15314R.id.dialog_id_get_gold).setMessage(C15314R.string.analyst_report_requires_gold, new Object[0]).setPositiveButton(C15314R.string.analyst_report_get_gold, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = analystReportShimActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "getGold", false, 4, null);
        } else if (marginSubscription.is24Karat()) {
            Navigator.DefaultImpls.showFragment$default(analystReportShimActivity.getNavigator(), analystReportShimActivity, new LegacyFragmentKey.AnalystReport(analystReportShimActivity.getInstrumentId()), false, false, false, null, false, null, false, false, null, null, 4092, null);
            analystReportShimActivity.finish();
        } else {
            Navigator.DefaultImpls.showFragment$default(analystReportShimActivity.getNavigator(), analystReportShimActivity, new LegacyFragmentKey.EquityInstrumentDetail(analystReportShimActivity.getInstrumentId(), null, null, InstrumentDetailSource.ANALYST_REPORT, false, 22, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            analystReportShimActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AnalystReportShimActivity analystReportShimActivity, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, analystReportShimActivity, it, true, false, 0, null, 56, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C15314R.id.dialog_id_get_gold) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new GoldUpgradeIntentKey("analyst_report", GoldFeature.RESEARCH, null, null, null, false, 60, null), null, false, null, null, 60, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C15314R.id.dialog_id_get_gold) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), this, new LegacyFragmentKey.EquityInstrumentDetail(getInstrumentId(), null, null, InstrumentDetailSource.ANALYST_REPORT, false, 22, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), this, new LegacyFragmentKey.EquityInstrumentDetail(getInstrumentId(), null, null, InstrumentDetailSource.ANALYST_REPORT, false, 22, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        finish();
    }

    /* compiled from: AnalystReportShimActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportShimActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$AnalystReportDeepLinkShim;", "<init>", "()V", "EXTRA_INSTRUMENT_ID", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.AnalystReportDeepLinkShim> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.AnalystReportDeepLinkShim key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) AnalystReportShimActivity.class);
            intent.putExtra("instrumentId", key.getInstrumentId());
            return intent;
        }
    }
}
