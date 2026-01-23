package com.robinhood.android.margin.p174ui.marginwithdrawal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.utils.extensions.CompletablesAndroid;
import io.reactivex.Completable;
import io.reactivex.functions.Action;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisableMarginWithdrawalActivity.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/marginwithdrawal/DisableMarginWithdrawalActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "getMarginSettingsStore", "()Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "setMarginSettingsStore", "(Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;)V", "onStart", "", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class DisableMarginWithdrawalActivity extends BaseActivity {
    public LeveredMarginSettingsStore marginSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DisableMarginWithdrawalActivity() {
        super(C11839R.layout.activity_rds_loading);
    }

    public final LeveredMarginSettingsStore getMarginSettingsStore() {
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.marginSettingsStore;
        if (leveredMarginSettingsStore != null) {
            return leveredMarginSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginSettingsStore");
        return null;
    }

    public final void setMarginSettingsStore(LeveredMarginSettingsStore leveredMarginSettingsStore) {
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "<set-?>");
        this.marginSettingsStore = leveredMarginSettingsStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        Completable completableDoFinally = CompletablesAndroid.observeOnMainThread(CompletableDelay2.minTimeInFlight$default(getMarginSettingsStore().toggleMarginWithdrawal(((LegacyIntentKey.MarginWithdrawal.DisableMarginWithdrawal) INSTANCE.getExtras((Activity) this)).getAccountNumber(), false), 1000L, null, 2, null)).doFinally(new Action() { // from class: com.robinhood.android.margin.ui.marginwithdrawal.DisableMarginWithdrawalActivity.onStart.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                DisableMarginWithdrawalActivity.this.finish();
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.margin.ui.marginwithdrawal.DisableMarginWithdrawalActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, getActivityErrorHandler());
    }

    /* compiled from: DisableMarginWithdrawalActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/marginwithdrawal/DisableMarginWithdrawalActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/margin/ui/marginwithdrawal/DisableMarginWithdrawalActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MarginWithdrawal$DisableMarginWithdrawal;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DisableMarginWithdrawalActivity, LegacyIntentKey.MarginWithdrawal.DisableMarginWithdrawal> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.MarginWithdrawal.DisableMarginWithdrawal getExtras(DisableMarginWithdrawalActivity disableMarginWithdrawalActivity) {
            return (LegacyIntentKey.MarginWithdrawal.DisableMarginWithdrawal) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, disableMarginWithdrawalActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.MarginWithdrawal.DisableMarginWithdrawal disableMarginWithdrawal) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, disableMarginWithdrawal);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.MarginWithdrawal.DisableMarginWithdrawal disableMarginWithdrawal) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, disableMarginWithdrawal);
        }
    }
}
