package com.robinhood.android.margin.p174ui.marginwithdrawal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.margin.p083ui.withdrawal.MarginWithdrawalPromptFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.databinding.ActivityFragmentContainerWithRdsLoadingViewBinding;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.utils.extensions.CompletablesAndroid;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EnableMarginWithdrawalActivity.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/marginwithdrawal/EnableMarginWithdrawalActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "getBinding", "()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "getMarginSettingsStore", "()Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "setMarginSettingsStore", "(Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onConfigureMarginWithdrawal", "enable", "", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class EnableMarginWithdrawalActivity extends BaseActivity implements MarginWithdrawalPromptFragment.Callbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public LeveredMarginSettingsStore marginSettingsStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EnableMarginWithdrawalActivity.class, "binding", "getBinding()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public EnableMarginWithdrawalActivity() {
        super(C11839R.layout.activity_fragment_container_with_rds_loading_view);
        this.binding = ViewBinding5.viewBinding(this, EnableMarginWithdrawalActivity2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityFragmentContainerWithRdsLoadingViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerWithRdsLoadingViewBinding) value;
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            replaceFragmentWithoutBackStack(MarginWithdrawalPromptFragment.INSTANCE.newInstance((Parcelable) new MarginWithdrawalPromptFragment.Args(null)));
        }
    }

    @Override // com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptFragment.Callbacks
    public void onConfigureMarginWithdrawal(boolean enable) {
        Completable completableDoFinally = CompletablesAndroid.observeOnMainThread(CompletableDelay2.minTimeInFlight$default(getMarginSettingsStore().toggleMarginWithdrawal(((LegacyIntentKey.MarginWithdrawal.EnableMarginWithdrawal) INSTANCE.getExtras((Activity) this)).getAccountNumber(), enable), 1000L, null, 2, null)).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.margin.ui.marginwithdrawal.EnableMarginWithdrawalActivity.onConfigureMarginWithdrawal.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                EnableMarginWithdrawalActivity.this.getBinding().rdsLoadingView.show();
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.margin.ui.marginwithdrawal.EnableMarginWithdrawalActivity.onConfigureMarginWithdrawal.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                EnableMarginWithdrawalActivity.this.finish();
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.margin.ui.marginwithdrawal.EnableMarginWithdrawalActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EnableMarginWithdrawalActivity.onConfigureMarginWithdrawal$lambda$0(this.f$0);
            }
        }, getActivityErrorHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConfigureMarginWithdrawal$lambda$0(EnableMarginWithdrawalActivity enableMarginWithdrawalActivity) {
        enableMarginWithdrawalActivity.finish();
        return Unit.INSTANCE;
    }

    /* compiled from: EnableMarginWithdrawalActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/marginwithdrawal/EnableMarginWithdrawalActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/margin/ui/marginwithdrawal/EnableMarginWithdrawalActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$MarginWithdrawal$EnableMarginWithdrawal;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<EnableMarginWithdrawalActivity, LegacyIntentKey.MarginWithdrawal.EnableMarginWithdrawal> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.MarginWithdrawal.EnableMarginWithdrawal getExtras(EnableMarginWithdrawalActivity enableMarginWithdrawalActivity) {
            return (LegacyIntentKey.MarginWithdrawal.EnableMarginWithdrawal) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, enableMarginWithdrawalActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.MarginWithdrawal.EnableMarginWithdrawal enableMarginWithdrawal) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, enableMarginWithdrawal);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.MarginWithdrawal.EnableMarginWithdrawal enableMarginWithdrawal) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, enableMarginWithdrawal);
        }
    }
}
