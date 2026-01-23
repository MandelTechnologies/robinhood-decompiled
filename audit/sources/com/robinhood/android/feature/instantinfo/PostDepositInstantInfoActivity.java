package com.robinhood.android.feature.instantinfo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.C11839R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.databinding.ActivityFragmentContainerWithRdsLoadingViewBinding;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.feature.instantinfo.PostDepositInstantInfoDuxo2;
import com.robinhood.android.feature.instantinfo.PostDepositInstantInfoScreenFragment;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: PostDepositInstantInfoActivity.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020\u001eH\u0016J\u0012\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u001eH\u0002J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoScreenFragment$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "getBinding", "()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoDuxo;", "getDuxo", "()Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "", "currentScreenIndex", "getCurrentScreenIndex", "()I", "setCurrentScreenIndex", "(I)V", "currentScreenIndex$delegate", "Lkotlin/properties/ReadWriteProperty;", "launchGold", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onContinue", "onBack", "onDismiss", "onDeeplink", "deeplink", "Landroid/net/Uri;", "onGoldUpgrade", "reloadData", "replaceFragmentWithState", "state", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoState;", "Companion", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PostDepositInstantInfoActivity extends BaseActivity implements PostDepositInstantInfoScreenFragment.Callbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: currentScreenIndex$delegate, reason: from kotlin metadata */
    private final Interfaces3 currentScreenIndex;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<Intent> launchGold;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PostDepositInstantInfoActivity.class, "binding", "getBinding()Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(PostDepositInstantInfoActivity.class, "currentScreenIndex", "getCurrentScreenIndex()I", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PostDepositInstantInfoActivity() {
        super(C11839R.layout.activity_fragment_container_with_rds_loading_view);
        this.binding = ViewBinding5.viewBinding(this, PostDepositInstantInfoActivity2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, PostDepositInstantInfoDuxo.class);
        this.currentScreenIndex = (Interfaces3) BindSavedState2.savedSerializable(this, 0).provideDelegate(this, $$delegatedProperties[1]);
        this.launchGold = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoActivity$launchGold$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.reloadData();
                } else {
                    this.this$0.finish();
                }
            }
        });
    }

    private final ActivityFragmentContainerWithRdsLoadingViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerWithRdsLoadingViewBinding) value;
    }

    private final PostDepositInstantInfoDuxo getDuxo() {
        return (PostDepositInstantInfoDuxo) this.duxo.getValue();
    }

    private final int getCurrentScreenIndex() {
        return ((Number) this.currentScreenIndex.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final void setCurrentScreenIndex(int i) {
        this.currentScreenIndex.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Observable<PostDepositInstantInfoDuxo2> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDepositInstantInfoActivity.onCreate$lambda$0(this.f$0, (PostDepositInstantInfoDuxo2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(PostDepositInstantInfoActivity postDepositInstantInfoActivity, PostDepositInstantInfoDuxo2 postDepositInstantInfoDuxo2) {
        if (!(postDepositInstantInfoDuxo2 instanceof PostDepositInstantInfoDuxo2.Loading)) {
            if (postDepositInstantInfoDuxo2 instanceof PostDepositInstantInfoDuxo2.Error) {
                String transferId = ((LegacyIntentKey.PostDepositInstantInfo) INSTANCE.getExtras((Activity) postDepositInstantInfoActivity)).getTransferId();
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Failed to fetch post deposit instant info for transferId=" + transferId), false, null, 4, null);
                AbsErrorHandler.handleError$default(postDepositInstantInfoActivity.getActivityErrorHandler(), ((PostDepositInstantInfoDuxo2.Error) postDepositInstantInfoDuxo2).getException(), false, 2, null);
                postDepositInstantInfoActivity.finish();
            } else {
                if (!(postDepositInstantInfoDuxo2 instanceof PostDepositInstantInfoDuxo2.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((PostDepositInstantInfoDuxo2.Success) postDepositInstantInfoDuxo2).getPayload().getScreens().isEmpty()) {
                    postDepositInstantInfoActivity.finish();
                    return Unit.INSTANCE;
                }
                postDepositInstantInfoActivity.setCurrentScreenIndex(0);
                postDepositInstantInfoActivity.replaceFragmentWithState(postDepositInstantInfoDuxo2);
                postDepositInstantInfoActivity.getBinding().rdsLoadingView.hide();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.feature.instantinfo.PostDepositInstantInfoScreenFragment.Callbacks
    public void onContinue() {
        Observable<PostDepositInstantInfoDuxo2> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.feature.instantinfo.PostDepositInstantInfoActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDepositInstantInfoActivity.onContinue$lambda$1(this.f$0, (PostDepositInstantInfoDuxo2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinue$lambda$1(PostDepositInstantInfoActivity postDepositInstantInfoActivity, PostDepositInstantInfoDuxo2 postDepositInstantInfoDuxo2) {
        postDepositInstantInfoActivity.setCurrentScreenIndex(postDepositInstantInfoActivity.getCurrentScreenIndex() + 1);
        Intrinsics.checkNotNull(postDepositInstantInfoDuxo2);
        postDepositInstantInfoActivity.replaceFragmentWithState(postDepositInstantInfoDuxo2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.feature.instantinfo.PostDepositInstantInfoScreenFragment.Callbacks
    public void onBack() {
        if (getCurrentScreenIndex() == 0) {
            finish();
        } else {
            setCurrentScreenIndex(getCurrentScreenIndex() - 1);
            popLastFragment();
        }
    }

    @Override // com.robinhood.android.feature.instantinfo.PostDepositInstantInfoScreenFragment.Callbacks
    public void onDismiss() {
        finish();
    }

    @Override // com.robinhood.android.feature.instantinfo.PostDepositInstantInfoScreenFragment.Callbacks
    public void onDeeplink(Uri deeplink) {
        if (deeplink == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Instant Info Deeplink Action without provided deeplink Uri!"), false, null, 4, null);
            finish();
        } else {
            startActivities(Navigator.DefaultImpls.resolveDeepLink$default(getNavigator(), this, deeplink, Boolean.TRUE, DeepLinkOrigin.Internal.INSTANCE, false, 16, null));
        }
    }

    @Override // com.robinhood.android.feature.instantinfo.PostDepositInstantInfoScreenFragment.Callbacks
    public void onGoldUpgrade() {
        popEntireFragmentBackstack();
        this.launchGold.launch(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new GoldUpgradeIntentKey("deposit_success_gold_instant_upsell", GoldFeature.INSTANT, null, null, null, false, 60, null), null, false, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reloadData() {
        getBinding().rdsLoadingView.show();
        getDuxo().fetchPostDepositInstantInfo();
    }

    private final void replaceFragmentWithState(PostDepositInstantInfoDuxo2 state) {
        if (!(state instanceof PostDepositInstantInfoDuxo2.Success)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Fetch PostDepositInfo error!"), false, null, 4, null);
            finish();
        } else {
            PostDepositInstantInfoDuxo2.Success success = (PostDepositInstantInfoDuxo2.Success) state;
            replaceFragment(PostDepositInstantInfoScreenFragment.INSTANCE.newInstance(success.getPayload().getUserGroup(), success.getPayload().getTransferId(), success.getPayload().getScreens().get(getCurrentScreenIndex())));
        }
    }

    /* compiled from: PostDepositInstantInfoActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/feature/instantinfo/PostDepositInstantInfoActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$PostDepositInstantInfo;", "<init>", "()V", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PostDepositInstantInfoActivity, LegacyIntentKey.PostDepositInstantInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.PostDepositInstantInfo getExtras(PostDepositInstantInfoActivity postDepositInstantInfoActivity) {
            return (LegacyIntentKey.PostDepositInstantInfo) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, postDepositInstantInfoActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.PostDepositInstantInfo postDepositInstantInfo) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, postDepositInstantInfo);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.PostDepositInstantInfo postDepositInstantInfo) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, postDepositInstantInfo);
        }
    }
}
